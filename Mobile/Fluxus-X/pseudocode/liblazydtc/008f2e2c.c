/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2e2c
 */

/* cpr::Session::SetOption(cpr::ConnectTimeout const&) */

void __thiscall cpr::Session::SetOption(Session *this,ConnectTimeout *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = **(undefined8 **)(this + 0x18);
  uVar1 = Timeout::Milliseconds((Timeout *)param_1);
  curl_easy_setopt(uVar2,0x9c,uVar1);
  return;
}

