/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efadc
 */

/* cpr::Session::PrepareDelete() */

void __thiscall cpr::Session::PrepareDelete(Session *this)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x50,0);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,0);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2734,"DELETE");
  prepareCommon();
  return;
}

