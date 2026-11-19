/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fd0e8
 */

/* cpr::Files::push_back(cpr::File const&) */

void __thiscall cpr::Files::push_back(Files *this,File *param_1)

{
  if (*(File **)(this + 8) == *(File **)(this + 0x10)) {
    std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::
    __push_back_slow_path<cpr::File_const&>
              ((vector<cpr::File,std::__ndk1::allocator<cpr::File>> *)this,param_1);
    return;
  }
  File::File(*(File **)(this + 8),param_1);
  *(long *)(this + 8) = *(long *)(this + 8) + 0x30;
  return;
}

