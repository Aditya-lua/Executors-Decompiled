/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fd09c
 */

/* cpr::Files::emplace_back(cpr::File const&) */

void __thiscall cpr::Files::emplace_back(Files *this,File *param_1)

{
  if (*(File **)(this + 8) < *(File **)(this + 0x10)) {
    File::File(*(File **)(this + 8),param_1);
    *(long *)(this + 8) = *(long *)(this + 8) + 0x30;
    return;
  }
  std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::
  __emplace_back_slow_path<cpr::File_const&>
            ((vector<cpr::File,std::__ndk1::allocator<cpr::File>> *)this,param_1);
  return;
}

