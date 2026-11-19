/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ee3dc
 */

/* cpr::Session::SetUserAgent(cpr::UserAgent const&) */

void __thiscall cpr::Session::SetUserAgent(Session *this,UserAgent *param_1)

{
  UserAgent *pUVar1;
  
  pUVar1 = param_1 + 9;
  if (((byte)param_1[8] & 1) != 0) {
    pUVar1 = *(UserAgent **)(param_1 + 0x18);
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2722,pUVar1);
  return;
}

