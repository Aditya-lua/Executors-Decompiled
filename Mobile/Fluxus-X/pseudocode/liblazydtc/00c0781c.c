/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0781c
 */

/* std::__ndk1::ctype_byname<char>::~ctype_byname() */

void __thiscall std::__ndk1::ctype_byname<char>::~ctype_byname(ctype_byname<char> *this)

{
  *(undefined ***)this = &PTR__ctype_byname_00cad640;
                    /* try { // try from 00c07844 to 00c07847 has its CatchHandler @ 00c07884 */
  freelocale(*(__locale_t *)(this + 0x20));
  *(undefined ***)this = &PTR__ctype_00cad5d8;
  if ((*(void **)(this + 0x10) != (void *)0x0) && (this[0x18] == (ctype_byname<char>)0x1)) {
    operator_delete__(*(void **)(this + 0x10));
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  return;
}

