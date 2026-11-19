/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc084
 */

/* std::__ndk1::collate_byname<wchar_t>::~collate_byname() */

void __thiscall std::__ndk1::collate_byname<wchar_t>::~collate_byname(collate_byname<wchar_t> *this)

{
  *(undefined ***)this = &PTR__collate_byname_00cad598;
                    /* try { // try from 00bfc0ac to 00bfc0af has its CatchHandler @ 00bfc0c4 */
  freelocale(*(__locale_t *)(this + 0x10));
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  return;
}

