/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00802564
 */

ulong * FUN_00802564(ulong *param_1,void *param_2,size_t param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  byte *__dest;
  uint uVar4;
  ulong uVar5;
  byte *pbVar6;
  
  uVar5 = *param_1;
  uVar4 = (uint)uVar5 & 0xff;
  uVar1 = 0x16;
  if ((*param_1 & 1) != 0) {
    uVar1 = (uVar5 & 0xfffffffffffffffe) - 1;
  }
  if (uVar1 < param_3) {
    if (-uVar1 - 10 < param_3 - uVar1) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    pbVar6 = (byte *)param_1[2];
    if ((uVar5 & 1) == 0) {
      pbVar6 = (byte *)((long)param_1 + 1);
    }
    if (uVar1 < 0x7ffffffffffffff3) {
      uVar2 = param_3;
      if (param_3 <= uVar1 * 2) {
        uVar2 = uVar1 * 2;
      }
      uVar3 = 0x1a;
      if ((uVar2 | 7) != 0x17) {
        uVar3 = (uVar2 | 7) + 1;
      }
      uVar5 = 0x17;
      if (0x16 < uVar2) {
        uVar5 = uVar3;
      }
    }
    else {
      uVar5 = 0xfffffffffffffff7;
    }
    __dest = operator_new(uVar5);
    memcpy(__dest,param_2,param_3);
    if (uVar1 + 1 != 0x17) {
      operator_delete(pbVar6,uVar1 + 1);
    }
    param_1[2] = (ulong)__dest;
    *param_1 = uVar5 | 1;
  }
  else {
    __dest = (byte *)param_1[2];
    if ((uVar5 & 1) == 0) {
      __dest = (byte *)((long)param_1 + 1);
    }
    if (param_3 != 0) {
      memmove(__dest,param_2,param_3);
      uVar4 = (uint)(byte)*param_1;
    }
    if ((uVar4 & 1) == 0) {
      *(byte *)param_1 = (byte)((int)param_3 << 1);
      goto LAB_00802678;
    }
  }
  param_1[1] = param_3;
LAB_00802678:
  __dest[param_3] = 0;
  return param_1;
}

