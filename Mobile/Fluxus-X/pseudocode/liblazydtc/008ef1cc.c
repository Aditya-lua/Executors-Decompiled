/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef1cc
 */

/* cpr::Session::SetLocalPortRange(cpr::LocalPortRange const&) */

void __thiscall cpr::Session::SetLocalPortRange(Session *this,LocalPortRange *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x8c,*(undefined2 *)param_1);
  return;
}

