/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fd184
 */

/* cpr::Files::TEMPNAMEPLACEHOLDERVALUE(cpr::Files const&) */

Files * __thiscall cpr::Files::operator=(Files *this,Files *param_1)

{
  if (param_1 != this) {
    std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::assign<cpr::File*>
              ((vector<cpr::File,std::__ndk1::allocator<cpr::File>> *)this,*(File **)param_1,
               *(File **)(param_1 + 8));
  }
  return this;
}

