/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2ce0
 */

/* cpr::Session::SetOption(cpr::Parameters const&) */

void __thiscall cpr::Session::SetOption(Session *this,Parameters *param_1)

{
  this[0x48] = *(Session *)param_1;
  if (this + 0x48 == (Session *)param_1) {
    return;
  }
  std::__ndk1::vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>>::
  assign<cpr::Parameter*>
            ((vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>> *)(this + 0x50),
             *(Parameter **)(param_1 + 8),*(Parameter **)(param_1 + 0x10));
  return;
}

