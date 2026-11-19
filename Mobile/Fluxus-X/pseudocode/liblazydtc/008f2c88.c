/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2c88
 */

/* cpr::Session::SetOption(std::__ndk1::vector<cpr::Resolve, std::__ndk1::allocator<cpr::Resolve> >
   const&) */

void cpr::Session::SetOption(vector *param_1)

{
  SetResolves(param_1);
  return;
}

