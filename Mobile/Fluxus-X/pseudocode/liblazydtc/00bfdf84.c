/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfdf84
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::codecvt(unsigned long) */

void __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::codecvt
          (codecvt<wchar_t,char,mbstate_t> *this,ulong param_1)

{
  int iVar1;
  
  *(undefined ***)this = &PTR__codecvt_00cad730;
  *(ulong *)(this + 8) = param_1 - 1;
  if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00bfdfe8 to 00bfdffb has its CatchHandler @ 00bfe010 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  *(__locale_t *)(this + 0x10) = DAT_00d270f0;
  return;
}

