/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8da0
 */

/* cpr::Cookies::push_back(cpr::Cookie const&) */

void __thiscall cpr::Cookies::push_back(Cookies *this,Cookie *param_1)

{
  if (*(Cookie **)(this + 0x10) == *(Cookie **)(this + 0x18)) {
    std::__ndk1::vector<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>>::
    __push_back_slow_path<cpr::Cookie_const&>
              ((vector<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>> *)(this + 8),param_1);
    return;
  }
  Cookie::Cookie(*(Cookie **)(this + 0x10),param_1);
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + 0x78;
  return;
}

