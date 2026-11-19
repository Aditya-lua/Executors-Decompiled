/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fbf90
 */

/* cpr::CurlContainer<cpr::Parameter>::Add(cpr::Parameter const&) */

void __thiscall
cpr::CurlContainer<cpr::Parameter>::Add(CurlContainer<cpr::Parameter> *this,Parameter *param_1)

{
  if (*(Parameter **)(this + 0x10) == *(Parameter **)(this + 0x18)) {
    std::__ndk1::vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>>::
    __push_back_slow_path<cpr::Parameter_const&>
              ((vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>> *)(this + 8),param_1);
    return;
  }
  Parameter::Parameter(*(Parameter **)(this + 0x10),param_1);
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + 0x30;
  return;
}

