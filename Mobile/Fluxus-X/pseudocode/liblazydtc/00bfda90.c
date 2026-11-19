/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfda90
 */

/* std::__ndk1::ctype_byname<wchar_t>::do_scan_not(unsigned long, wchar_t const*, wchar_t const*)
   const */

wchar_t * __thiscall
std::__ndk1::ctype_byname<wchar_t>::do_scan_not
          (ctype_byname<wchar_t> *this,ulong param_1,wchar_t *param_2,wchar_t *param_3)

{
  wchar_t __wc;
  int iVar1;
  uint uVar2;
  
  do {
    if (param_2 == param_3) {
      return param_2;
    }
    __wc = *param_2;
    uVar2 = (uint)param_1;
    if (((((((param_1 & 1) == 0) ||
           (iVar1 = iswspace_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)) &&
          (((uVar2 >> 1 & 1) == 0 ||
           (iVar1 = iswprint_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)))) &&
         (((uVar2 >> 2 & 1) == 0 ||
          (iVar1 = iswcntrl_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)))) &&
        (((uVar2 >> 3 & 1) == 0 ||
         (iVar1 = iswupper_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)))) &&
       ((((((uVar2 >> 4 & 1) == 0 ||
           (iVar1 = iswlower_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)) &&
          (((uVar2 >> 5 & 1) == 0 ||
           (iVar1 = iswalpha_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)))) &&
         (((uVar2 >> 6 & 1) == 0 ||
          (iVar1 = iswdigit_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)))) &&
        ((((uVar2 >> 7 & 1) == 0 ||
          (iVar1 = iswpunct_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)) &&
         (((uVar2 >> 8 & 1) == 0 ||
          (iVar1 = iswxdigit_l(__wc,*(__locale_t *)(this + 0x10)), iVar1 == 0)))))))) {
      if ((uVar2 >> 9 & 1) == 0) {
        return param_2;
      }
      iVar1 = iswblank_l(__wc,*(__locale_t *)(this + 0x10));
      if (iVar1 == 0) {
        return param_2;
      }
    }
    param_2 = param_2 + 1;
  } while( true );
}

