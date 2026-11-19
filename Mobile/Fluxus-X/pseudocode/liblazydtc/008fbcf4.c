/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fbcf4
 */

/* cpr::CurlContainer<cpr::Pair>::Add(cpr::Pair const&) */

void __thiscall cpr::CurlContainer<cpr::Pair>::Add(CurlContainer<cpr::Pair> *this,Pair *param_1)

{
  if (*(Pair **)(this + 0x10) == *(Pair **)(this + 0x18)) {
    std::__ndk1::vector<cpr::Pair,std::__ndk1::allocator<cpr::Pair>>::
    __push_back_slow_path<cpr::Pair_const&>
              ((vector<cpr::Pair,std::__ndk1::allocator<cpr::Pair>> *)(this + 8),param_1);
    return;
  }
  Pair::Pair(*(Pair **)(this + 0x10),param_1);
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + 0x30;
  return;
}

