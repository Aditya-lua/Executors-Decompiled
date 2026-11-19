/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc0f8
 */

/* std::__ndk1::collate_byname<wchar_t>::do_compare(wchar_t const*, wchar_t const*, wchar_t const*,
   wchar_t const*) const */

uint __thiscall
std::__ndk1::collate_byname<wchar_t>::do_compare
          (collate_byname<wchar_t> *this,wchar_t *param_1,wchar_t *param_2,wchar_t *param_3,
          wchar_t *param_4)

{
  wchar_t *__s2;
  ulong uVar1;
  wchar_t *pwVar2;
  wchar_t *pwVar3;
  int iVar4;
  uint uVar5;
  ulong uVar6;
  wchar_t *pwVar7;
  ulong uVar8;
  ulong local_90;
  ulong local_88;
  wchar_t *local_80;
  ulong local_78;
  ulong local_70;
  wchar_t *local_68;
  
  uVar6 = (long)param_2 - (long)param_1;
  uVar8 = (long)uVar6 >> 2;
  if (0x3ffffffffffffff7 < uVar8) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (uVar8 < 5) {
    pwVar7 = (wchar_t *)((ulong)&local_78 | 4);
    local_78 = CONCAT71(local_78._1_7_,(char)(uVar6 >> 1)) & 0xfffffffffffffffe;
  }
  else {
    uVar1 = 8;
    if ((uVar8 | 1) != 5) {
      uVar1 = (uVar8 | 1) + 1;
    }
    pwVar7 = operator_new(uVar1 << 2);
    local_78 = uVar1 | 1;
    local_70 = uVar8;
    local_68 = pwVar7;
  }
  if (param_2 != param_1) {
    memcpy(pwVar7,param_1,uVar6);
  }
  uVar8 = (long)param_4 - (long)param_3;
  *(undefined4 *)((long)pwVar7 + uVar6) = 0;
  uVar6 = (long)uVar8 >> 2;
  if (0x3ffffffffffffff7 < uVar6) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bfc2d0 to 00bfc2d3 has its CatchHandler @ 00bfc2d4 */
    FUN_00bc5610();
  }
  if (uVar6 < 5) {
    pwVar7 = (wchar_t *)((ulong)&local_90 | 4);
    local_90 = CONCAT71(local_90._1_7_,(char)(uVar8 >> 1)) & 0xfffffffffffffffe;
  }
  else {
    uVar1 = 8;
    if ((uVar6 | 1) != 5) {
      uVar1 = (uVar6 | 1) + 1;
    }
                    /* try { // try from 00bfc2ac to 00bfc2af has its CatchHandler @ 00bfc2d4 */
    pwVar7 = operator_new(uVar1 << 2);
    local_90 = uVar1 | 1;
    local_88 = uVar6;
    local_80 = pwVar7;
  }
  if (param_4 != param_3) {
    memcpy(pwVar7,param_3,uVar8);
  }
  pwVar3 = local_68;
  uVar1 = local_78;
  pwVar2 = local_80;
  uVar6 = local_90;
  *(undefined4 *)((long)pwVar7 + uVar8) = 0;
  pwVar7 = (wchar_t *)((ulong)&local_78 | 4);
  if ((local_78 & 1) != 0) {
    pwVar7 = local_68;
  }
  __s2 = (wchar_t *)((ulong)&local_90 | 4);
  if ((local_90 & 1) != 0) {
    __s2 = local_80;
  }
  iVar4 = wcscoll_l(pwVar7,__s2,*(__locale_t *)(this + 0x10));
  if ((uVar6 & 1) != 0) {
    operator_delete(pwVar2,(local_90 & 0x3ffffffffffffffe) << 2);
  }
  if ((uVar1 & 1) != 0) {
    operator_delete(pwVar3,(local_78 & 0x3ffffffffffffffe) << 2);
  }
  uVar5 = (uint)(iVar4 != 0);
  if (iVar4 < 0) {
    uVar5 = 0xffffffff;
  }
  return uVar5;
}

