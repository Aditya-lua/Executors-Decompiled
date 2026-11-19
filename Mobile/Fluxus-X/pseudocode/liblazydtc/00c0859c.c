/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0859c
 */

/* std::__ndk1::__time_put::~__time_put() */

void __thiscall std::__ndk1::__time_put::~__time_put(__time_put *this)

{
  int iVar1;
  __locale_t p_Var2;
  
  p_Var2 = *(__locale_t *)this;
  if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00c08604 to 00c08617 has its CatchHandler @ 00c0862c */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  if (p_Var2 != DAT_00d270f0) {
                    /* try { // try from 00c085dc to 00c085df has its CatchHandler @ 00c08644 */
    freelocale(*(__locale_t *)this);
  }
  return;
}

