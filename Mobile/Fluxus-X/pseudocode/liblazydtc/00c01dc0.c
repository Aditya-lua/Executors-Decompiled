/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01dc0
 */

/* std::__ndk1::numpunct_byname<wchar_t>::~numpunct_byname() */

void __thiscall
std::__ndk1::numpunct_byname<wchar_t>::~numpunct_byname(numpunct_byname<wchar_t> *this)

{
  *(undefined ***)this = &PTR__numpunct_byname_00cad7e0;
  if (((byte)this[0x18] & 1) != 0) {
    operator_delete(*(void **)(this + 0x28),*(ulong *)(this + 0x18) & 0xfffffffffffffffe);
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  return;
}

