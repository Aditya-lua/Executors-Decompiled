/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2e64
 */

/* cpr::Session::SetOption(cpr::LimitRate const&) */

void __thiscall cpr::Session::SetOption(Session *this,LimitRate *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x75c2,*(undefined8 *)param_1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x75c1,*(undefined8 *)(param_1 + 8));
  return;
}

