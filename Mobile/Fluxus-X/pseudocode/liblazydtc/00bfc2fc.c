/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc2fc
 */

/* std::__ndk1::collate_byname<wchar_t>::do_transform(wchar_t const*, wchar_t const*) const */

void std::__ndk1::collate_byname<wchar_t>::do_transform(wchar_t *param_1,wchar_t *param_2)

{
  ulong uVar1;
  wchar_t *__s1;
  size_t sVar2;
  wchar_t *in_x2;
  ulong *in_x8;
  ulong uVar3;
  byte *pbVar4;
  wchar_t *pwVar5;
  ulong uVar6;
  ulong local_68;
  ulong local_60;
  wchar_t *local_58;
  
  uVar3 = (long)in_x2 - (long)param_2;
  uVar6 = (long)uVar3 >> 2;
  if (0x3ffffffffffffff7 < uVar6) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (uVar6 < 5) {
    pwVar5 = (wchar_t *)((ulong)&local_68 | 4);
    local_68 = CONCAT71(local_68._1_7_,(char)(uVar3 >> 1)) & 0xfffffffffffffffe;
  }
  else {
    uVar1 = 8;
    if ((uVar6 | 1) != 5) {
      uVar1 = (uVar6 | 1) + 1;
    }
    pwVar5 = operator_new(uVar1 << 2);
    local_68 = uVar1 | 1;
    local_60 = uVar6;
    local_58 = pwVar5;
  }
  if (in_x2 != param_2) {
    memcpy(pwVar5,param_2,uVar3);
  }
  *(undefined4 *)((long)pwVar5 + uVar3) = 0;
  pwVar5 = (wchar_t *)((ulong)&local_68 | 4);
  if ((local_68 & 1) != 0) {
    pwVar5 = local_58;
  }
                    /* try { // try from 00bfc3cc to 00bfc417 has its CatchHandler @ 00bfc4c8 */
  sVar2 = wcsxfrm_l((wchar_t *)0x0,pwVar5,0,*(__locale_t *)(param_1 + 4));
  if (0x3ffffffffffffff7 < sVar2) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bfc4b4 to 00bfc4b7 has its CatchHandler @ 00bfc4c8 */
    FUN_00bc5610();
  }
  if (sVar2 < 5) {
    pbVar4 = (byte *)((long)in_x8 + 4);
    *(byte *)in_x8 = (byte)((int)sVar2 << 1);
    if (sVar2 == 0) goto LAB_00bfc438;
  }
  else {
    uVar3 = 8;
    if ((sVar2 | 1) != 5) {
      uVar3 = (sVar2 | 1) + 1;
    }
    pbVar4 = operator_new(uVar3 << 2);
    in_x8[1] = sVar2;
    in_x8[2] = (ulong)pbVar4;
    *in_x8 = uVar3 | 1;
  }
  memset(pbVar4,0,sVar2 << 2);
LAB_00bfc438:
  pbVar4 = pbVar4 + sVar2 * 4;
  pbVar4[0] = 0;
  pbVar4[1] = 0;
  pbVar4[2] = 0;
  pbVar4[3] = 0;
  pwVar5 = (wchar_t *)((ulong)&local_68 | 4);
  if ((local_68 & 1) != 0) {
    pwVar5 = local_58;
  }
  uVar3 = (ulong)(byte)((byte)*in_x8 >> 1);
  __s1 = (wchar_t *)((long)in_x8 + 4);
  if (((byte)*in_x8 & 1) != 0) {
    uVar3 = in_x8[1];
    __s1 = (wchar_t *)in_x8[2];
  }
                    /* try { // try from 00bfc46c to 00bfc473 has its CatchHandler @ 00bfc4b8 */
  wcsxfrm_l(__s1,pwVar5,uVar3 + 1,*(__locale_t *)(param_1 + 4));
  if ((local_68 & 1) != 0) {
    operator_delete(local_58,(local_68 & 0x3ffffffffffffffe) << 2);
  }
  return;
}

