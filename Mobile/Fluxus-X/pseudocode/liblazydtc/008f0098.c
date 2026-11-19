/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f0098
 */

/* cpr::Session::PreparePatch() */

void __thiscall cpr::Session::PreparePatch(Session *this)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,0);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2734,"PATCH");
  prepareCommon();
  return;
}

