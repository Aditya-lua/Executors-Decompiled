/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081e9b8
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0081e9b8(ulong *param_1,byte *param_2)

{
  byte *pbVar1;
  byte *pbVar2;
  uint3 uVar3;
  uint uVar4;
  int iVar5;
  size_t sVar6;
  byte *pbVar7;
  undefined1 *__dest;
  ulong uVar8;
  
  if (((DAT_00d1c618 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c618), iVar5 != 0)) {
    _DAT_00d1c610 = 0x1c99bc1;
    __cxa_atexit(&LAB_0081f020,&DAT_00d1c610,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c618);
  }
  if (DAT_00d1c613 == '\x01') {
    uVar3 = (uint3)_DAT_00d1c610;
    _DAT_00d1c610 = (uint)(uVar3 ^ 0xc9b5ef);
  }
  uVar8 = *(ulong *)(param_2 + 8);
  pbVar2 = *(byte **)(param_2 + 0x10);
  if ((*param_2 & 1) == 0) {
    pbVar2 = param_2 + 1;
    uVar8 = (ulong)(*param_2 >> 1);
  }
  sVar6 = strlen(&DAT_00d1c610);
  uVar4 = _DAT_00d1c610;
  if (sVar6 != 0) {
    if ((long)sVar6 <= (long)uVar8) {
      pbVar1 = pbVar2 + uVar8;
      pbVar7 = pbVar2;
      do {
        if ((0xfffffffffffffffe < uVar8 - sVar6) ||
           (pbVar7 = memchr(pbVar7,uVar4 & 0xff,(uVar8 - sVar6) + 1), pbVar7 == (byte *)0x0)) break;
        iVar5 = memcmp(pbVar7,&DAT_00d1c610,sVar6);
        if (iVar5 == 0) {
          if ((pbVar7 != pbVar1) && ((long)pbVar7 - (long)pbVar2 != -1)) goto LAB_0081eaf8;
          break;
        }
        pbVar7 = pbVar7 + 1;
        uVar8 = (long)pbVar1 - (long)pbVar7;
      } while ((long)sVar6 <= (long)uVar8);
    }
    FUN_0081ef14(param_1,&DAT_00d1c5c0,param_2);
    return;
  }
LAB_0081eaf8:
  if (((DAT_00d1c628 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c628), iVar5 != 0)) {
    _DAT_00d1c620 = 0x1ed;
    __cxa_atexit(&LAB_0081f02c,&DAT_00d1c620,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c628);
  }
  if (DAT_00d1c621 == '\x01') {
    _DAT_00d1c620 = (ushort)(DAT_00d1c620 ^ 0xed);
  }
  sVar6 = strlen((char *)&DAT_00d1c620);
  if (0xfffffffffffffff7 < sVar6) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (sVar6 < 0x17) {
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)sVar6 << 1);
    if (sVar6 == 0) goto LAB_0081eba0;
  }
  else {
    uVar8 = 0x1a;
    if ((sVar6 | 7) != 0x17) {
      uVar8 = (sVar6 | 7) + 1;
    }
    __dest = operator_new(uVar8);
    param_1[1] = sVar6;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar8 | 1;
  }
  memcpy(__dest,&DAT_00d1c620,sVar6);
LAB_0081eba0:
  __dest[sVar6] = 0;
  return;
}

