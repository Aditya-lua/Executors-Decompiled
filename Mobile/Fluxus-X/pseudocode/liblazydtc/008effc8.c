/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008effc8
 */

/* cpr::Session::PrepareOptions() */

void __thiscall cpr::Session::PrepareOptions(Session *this)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,0);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2734,"OPTIONS");
  prepareCommon();
  return;
}

