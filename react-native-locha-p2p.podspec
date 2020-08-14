require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = "react-native-locha-p2p"
  s.version      = package["version"]
  s.summary      = package["description"]
  s.homepage     = package["homepage"]
  s.license      = package["license"]
  s.authors      = package["author"]

  s.platforms    = { :ios => "9.0" }
  s.source       = { :git => "https://github.com/jeandudey/react-native-locha-p2p.git", :tag => "#{s.version}" }

  
  s.source_files = "ios/**/*.{h,m,mm}", "cpp/**/*.{h,cpp}"
  

  s.dependency "React"
end
