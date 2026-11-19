/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f31b8
 */

/* cpr::Session::SetOption(cpr::Verbose const&) */

void __thiscall cpr::Session::SetOption(Session *this,Verbose *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x29,*param_1);
  return;
}

