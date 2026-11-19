/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0a92c
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::~codecvt() */

void __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::~codecvt(codecvt<wchar_t,char,mbstate_t> *this)

{
  int iVar1;
  __locale_t p_Var2;
  
  p_Var2 = *(__locale_t *)(this + 0x10);
  *(undefined ***)this = &PTR__codecvt_00cad730;
  if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00c0a9a8 to 00c0a9bb has its CatchHandler @ 00c0a9d0 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  if (p_Var2 != DAT_00d270f0) {
                    /* try { // try from 00c0a97c to 00c0a97f has its CatchHandler @ 00c0a9e8 */
    freelocale(*(__locale_t *)(this + 0x10));
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  return;
}

