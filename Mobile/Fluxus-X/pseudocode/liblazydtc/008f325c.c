/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f325c
 */

/* cpr::Session::SetOption(cpr::LocalPortRange const&) */

void __thiscall cpr::Session::SetOption(Session *this,LocalPortRange *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x8c,*(undefined2 *)param_1);
  return;
}

