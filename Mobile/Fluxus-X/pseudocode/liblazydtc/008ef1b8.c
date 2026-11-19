/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef1b8
 */

/* cpr::Session::SetLocalPort(cpr::LocalPort const&) */

void __thiscall cpr::Session::SetLocalPort(Session *this,LocalPort *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x8b,*(undefined2 *)param_1);
  return;
}

