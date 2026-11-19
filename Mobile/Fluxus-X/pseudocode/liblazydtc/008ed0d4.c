/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ed0d4
 */

/* cpr::Session::SetLimitRate(cpr::LimitRate const&) */

void __thiscall cpr::Session::SetLimitRate(Session *this,LimitRate *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x75c2,*(undefined8 *)param_1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x75c1,*(undefined8 *)(param_1 + 8));
  return;
}

