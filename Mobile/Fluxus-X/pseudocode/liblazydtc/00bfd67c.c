/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd67c
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::ctype_byname<wchar_t>::do_is(unsigned long, wchar_t) const */

bool __thiscall
std::__ndk1::ctype_byname<wchar_t>::do_is(ctype_byname<wchar_t> *this,ulong param_1,wchar_t param_2)

{
  undefined1 uVar1;
  int iVar2;
  uint uVar3;
  
  uVar3 = (uint)param_1;
  if ((param_1 & 1) == 0) {
    uVar1 = false;
  }
  else {
    iVar2 = iswspace_l(param_2,*(__locale_t *)(this + 0x10));
    uVar1 = iVar2 != 0;
  }
  if (((uVar3 >> 1 & 1) != 0) &&
     (iVar2 = iswprint_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  if (((uVar3 >> 2 & 1) != 0) &&
     (iVar2 = iswcntrl_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  if (((uVar3 >> 3 & 1) != 0) &&
     (iVar2 = iswupper_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  if (((uVar3 >> 4 & 1) != 0) &&
     (iVar2 = iswlower_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  if (((uVar3 >> 5 & 1) != 0) &&
     (iVar2 = iswalpha_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  if (((uVar3 >> 6 & 1) != 0) &&
     (iVar2 = iswdigit_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  if (((uVar3 >> 7 & 1) != 0) &&
     (iVar2 = iswpunct_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  if (((uVar3 >> 8 & 1) != 0) &&
     (iVar2 = iswxdigit_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  if (((uVar3 >> 9 & 1) != 0) &&
     (iVar2 = iswblank_l(param_2,*(__locale_t *)(this + 0x10)), iVar2 != 0)) {
    uVar1 = true;
  }
  return (bool)uVar1;
}

