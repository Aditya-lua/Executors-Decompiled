/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfcb54
 */

/* std::__ndk1::ctype<char>::~ctype() */

void __thiscall std::__ndk1::ctype<char>::~ctype(ctype<char> *this)

{
  *(undefined ***)this = &PTR__ctype_00cad5d8;
  if ((*(void **)(this + 0x10) != (void *)0x0) && (this[0x18] == (ctype<char>)0x1)) {
    operator_delete__(*(void **)(this + 0x10));
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  return;
}

