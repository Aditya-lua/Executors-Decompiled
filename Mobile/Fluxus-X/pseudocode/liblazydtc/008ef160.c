/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef160
 */

/* cpr::Session::SetVerbose(cpr::Verbose const&) */

void __thiscall cpr::Session::SetVerbose(Session *this,Verbose *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x29,*param_1);
  return;
}

