/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eead0
 */

/* cpr::Session::SetLowSpeed(cpr::LowSpeed const&) */

void __thiscall cpr::Session::SetLowSpeed(Session *this,LowSpeed *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x13,*(undefined4 *)param_1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x14,*(undefined4 *)(param_1 + 4));
  return;
}

