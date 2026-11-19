/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3168
 */

/* cpr::Session::SetOption(cpr::VerifySsl const&) */

void __thiscall cpr::Session::SetOption(Session *this,VerifySsl *param_1)

{
  undefined8 uVar1;
  
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x40,*param_1);
  uVar1 = 0;
  if (*param_1 != (VerifySsl)0x0) {
    uVar1 = 2;
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x51,uVar1);
  return;
}

