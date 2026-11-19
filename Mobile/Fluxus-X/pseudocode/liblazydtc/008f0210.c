/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f0210
 */

/* cpr::Session::PreparePut() */

void __thiscall cpr::Session::PreparePut(Session *this)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,0);
  if ((this[0x10] == (Session)0x0) && (*(long *)(this + 0x110) != 0)) {
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x271f,0);
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2734,&DAT_002ad095);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2717,0);
  prepareCommon();
  return;
}

