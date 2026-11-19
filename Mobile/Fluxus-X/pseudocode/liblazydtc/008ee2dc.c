/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ee2dc
 */

/* cpr::Session::SetTimeout(cpr::Timeout const&) */

void __thiscall cpr::Session::SetTimeout(Session *this,Timeout *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = **(undefined8 **)(this + 0x18);
  uVar1 = Timeout::Milliseconds(param_1);
  curl_easy_setopt(uVar2,0x9b,uVar1);
  return;
}

