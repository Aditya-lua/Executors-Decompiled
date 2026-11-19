/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eb708
 */

/* cpr::Session::SetBearer(cpr::Bearer const&) */

void __thiscall cpr::Session::SetBearer(Session *this,Bearer *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x6b,0x40);
  uVar2 = **(undefined8 **)(this + 0x18);
  uVar1 = (**(code **)(*(long *)param_1 + 0x10))(param_1);
  curl_easy_setopt(uVar2,0x27ec,uVar1);
  return;
}

