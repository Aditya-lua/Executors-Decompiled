/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efefc
 */

/* cpr::Session::PrepareHead() */

void __thiscall cpr::Session::PrepareHead(Session *this)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2734,0);
  prepareCommon();
  return;
}

