use jni::objects::{JClass, JString};
use jni::sys::jstring;
use jni::JNIEnv;

pub mod core;

#[no_mangle]
pub extern "system" fn Java_com_reactnativelocha_LochaP2PModule_hello(
    env: JNIEnv,
    _class: JClass,
    input: JString,
) -> jstring {
    let input: String = env
        .get_string(input)
        .expect("Coudln't get java string!")
        .into();

    let output = env
        .new_string(format!("Hello, {}!", input))
        .expect("Couldn't create java string!");

    output.into_inner()
}
