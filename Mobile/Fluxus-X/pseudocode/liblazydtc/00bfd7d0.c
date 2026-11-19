/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd7d0
 */

/* std::__ndk1::ctype_byname<wchar_t>::do_is(wchar_t const*, wchar_t const*, unsigned long*) const
    */

wchar_t * __thiscall
std::__ndk1::ctype_byname<wchar_t>::do_is
          (ctype_byname<wchar_t> *this,wchar_t *param_1,wchar_t *param_2,ulong *param_3)

{
  wchar_t __wc;
  int iVar1;
  __locale_t __locale;
  ulong uVar2;
  
  if (param_1 != param_2) {
    do {
      __wc = *param_1;
      if ((uint)__wc < 0x80) {
        uVar2 = *(ulong *)(&DAT_0078a8e8 + (ulong)(uint)__wc * 8);
LAB_00bfd810:
        *param_3 = uVar2;
      }
      else {
        __locale = *(__locale_t *)(this + 0x10);
        *param_3 = 0;
        iVar1 = iswspace_l(__wc,__locale);
        if (iVar1 != 0) {
          *param_3 = *param_3 | 1;
        }
        iVar1 = iswprint_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          *param_3 = *param_3 | 2;
        }
        iVar1 = iswcntrl_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          *param_3 = *param_3 | 4;
        }
        iVar1 = iswupper_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          *param_3 = *param_3 | 8;
        }
        iVar1 = iswlower_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          *param_3 = *param_3 | 0x10;
        }
        iVar1 = iswalpha_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          *param_3 = *param_3 | 0x20;
        }
        iVar1 = iswdigit_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          *param_3 = *param_3 | 0x40;
        }
        iVar1 = iswpunct_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          *param_3 = *param_3 | 0x80;
        }
        iVar1 = iswxdigit_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          *param_3 = *param_3 | 0x100;
        }
        iVar1 = iswblank_l(__wc,*(__locale_t *)(this + 0x10));
        if (iVar1 != 0) {
          uVar2 = *param_3 | 0x200;
          goto LAB_00bfd810;
        }
      }
      param_1 = param_1 + 1;
      param_3 = param_3 + 1;
    } while (param_1 != param_2);
  }
  return param_1;
}

