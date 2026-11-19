/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bba0f0
 */

undefined8
FUN_00bba0f0(long *param_1,long param_2,ulong param_3,ushort *param_4,ulong param_5,uint *param_6)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ushort uVar5;
  ushort uVar6;
  byte bVar7;
  undefined8 uVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  
  if (param_3 != 0) {
    if (param_5 < 10) {
      return 0xffffffffffffffec;
    }
    if ((*param_6 & 0xff0000) == 0xb0000) {
      uVar10 = (ulong)*param_4;
      uVar5 = param_4[1];
      uVar6 = param_4[2];
      uVar8 = 0;
      lVar1 = (long)(param_4 + 3) + uVar10;
      lVar2 = lVar1 + (ulong)uVar5;
      param_1[0xf] = (long)(param_4 + 3);
      param_1[0x10] = lVar1;
      lVar3 = lVar2 + (ulong)uVar6;
      param_1[0x11] = lVar2;
      param_1[0x12] = lVar3;
      if ((((7 < uVar10) && (7 < uVar5)) && (7 < uVar6)) &&
         (uVar10 = uVar10 + uVar5 + (ulong)uVar6 + 6, 7 < param_5 - uVar10)) {
        if (param_5 < uVar10) {
          return 0xffffffffffffffec;
        }
        *param_1 = lVar1 + -8;
        param_1[1] = lVar2 + -8;
        uVar11 = param_3 + 3 >> 2;
        param_1[2] = lVar3 + -8;
        param_1[3] = (long)param_4 + (param_5 - 8);
        lVar4 = param_2 + uVar11 + uVar11;
        param_1[4] = param_2;
        param_1[5] = param_2 + uVar11;
        uVar10 = param_2 + (param_3 & ((long)param_3 >> 0x3f ^ 0xffffffffffffffffU));
        uVar11 = lVar4 + uVar11;
        param_1[6] = lVar4;
        param_1[7] = uVar11;
        if (uVar10 <= uVar11) {
          return 0;
        }
        uVar11 = 0;
        if (*(byte *)(lVar1 + -1) != 0) {
          uVar11 = (ulong)(8 - ((uint)LZCOUNT((uint)*(byte *)(lVar1 + -1)) ^ 0x1f));
        }
        param_1[8] = (*(ulong *)(lVar1 + -8) | 1) << (uVar11 & 0x3f);
        uVar11 = 0;
        if (*(byte *)(lVar2 + -1) != 0) {
          uVar11 = (ulong)(8 - ((uint)LZCOUNT((uint)*(byte *)(lVar2 + -1)) ^ 0x1f));
        }
        param_1[9] = (*(ulong *)(lVar2 + -8) | 1) << (uVar11 & 0x3f);
        uVar11 = 0;
        if (*(byte *)(lVar3 + -1) != 0) {
          uVar11 = (ulong)(8 - ((uint)LZCOUNT((uint)*(byte *)(lVar3 + -1)) ^ 0x1f));
        }
        param_1[10] = (*(ulong *)(lVar3 + -8) | 1) << (uVar11 & 0x3f);
        bVar7 = *(byte *)((long)param_4 + (param_5 - 1));
        uVar11 = *(ulong *)((long)param_4 + (param_5 - 8));
        param_1[0xd] = (long)param_4;
        param_1[0xe] = uVar10;
        uVar9 = (uint)bVar7;
        uVar10 = 0;
        if (uVar9 != 0) {
          uVar10 = (ulong)(8 - ((uint)LZCOUNT(uVar9) ^ 0x1f));
        }
        param_1[0xb] = (uVar11 | 1) << (uVar10 & 0x3f);
        param_1[0xc] = (long)(param_6 + 1);
        uVar8 = 1;
      }
      return uVar8;
    }
  }
  return 0;
}

