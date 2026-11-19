/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3270
 */

/* cpr::Session::SetOption(cpr::HttpVersion const&) */

void __thiscall cpr::Session::SetOption(Session *this,HttpVersion *param_1)

{
  SetHttpVersion(this,param_1);
  return;
}

