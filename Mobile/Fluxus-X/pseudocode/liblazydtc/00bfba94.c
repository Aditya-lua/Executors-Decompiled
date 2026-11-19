/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfba94
 */

/* std::__ndk1::collate_byname<char>::~collate_byname() */

void __thiscall std::__ndk1::collate_byname<char>::~collate_byname(collate_byname<char> *this)

{
  *(undefined ***)this = &PTR__collate_byname_00cad558;
                    /* try { // try from 00bfbabc to 00bfbabf has its CatchHandler @ 00bfbad4 */
  freelocale(*(__locale_t *)(this + 0x10));
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  return;
}

