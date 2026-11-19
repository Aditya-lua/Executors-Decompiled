/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb58e0
 */

/* WARNING: Type propagation algorithm not settling */

ulong FUN_00bb58e0(byte *param_1,ulong param_2,ulong *param_3,ulong param_4,long param_5)

{
  byte *pbVar1;
  uint uVar2;
  ushort uVar3;
  bool bVar4;
  ulong uVar5;
  uint uVar6;
  ulong uVar7;
  uint uVar8;
  ulong uVar9;
  byte *pbVar10;
  byte *pbVar11;
  long lVar12;
  ulong *puVar13;
  
  if (param_4 == 0) {
    return 0xffffffffffffffb8;
  }
  uVar5 = param_2 & ((long)param_2 >> 0x3f ^ 0xffffffffffffffffU);
  uVar3 = *(ushort *)(param_5 + 2);
  lVar12 = param_4 - 8;
  param_5 = param_5 + 4;
  pbVar10 = param_1;
  pbVar11 = param_1;
  if (param_4 < 8) {
    uVar7 = (ulong)(byte)*param_3;
    if ((long)param_4 < 5) {
      if (param_4 != 2) {
        if (param_4 != 3) {
          if (param_4 != 4) goto LAB_00bb59e0;
          goto LAB_00bb59c8;
        }
        goto LAB_00bb59d0;
      }
LAB_00bb59d8:
      uVar7 = uVar7 + (ulong)*(byte *)((long)param_3 + 1) * 0x100;
    }
    else {
      if (param_4 == 5) {
LAB_00bb59c0:
        uVar7 = uVar7 + ((ulong)*(byte *)((long)param_3 + 4) << 0x20);
LAB_00bb59c8:
        uVar7 = uVar7 + (ulong)*(byte *)((long)param_3 + 3) * 0x1000000;
LAB_00bb59d0:
        uVar7 = uVar7 + (ulong)*(byte *)((long)param_3 + 2) * 0x10000;
        goto LAB_00bb59d8;
      }
      if (param_4 == 6) {
LAB_00bb59b8:
        uVar7 = uVar7 + ((ulong)*(byte *)((long)param_3 + 5) << 0x28);
        goto LAB_00bb59c0;
      }
      if (param_4 == 7) {
        uVar7 = uVar7 | (ulong)*(byte *)((long)param_3 + 6) << 0x30;
        goto LAB_00bb59b8;
      }
    }
LAB_00bb59e0:
    uVar8 = (uint)*(byte *)((long)param_3 + (param_4 - 1));
    if (uVar8 == 0) {
      return 0xffffffffffffffec;
    }
    uVar9 = (ulong)((int)LZCOUNT(uVar8) + (int)param_4 * -8 + 0x29);
    if (3 < (long)param_2) {
      lVar12 = 0;
      goto LAB_00bb5a04;
    }
    puVar13 = param_3;
  }
  else {
    uVar8 = (uint)*(byte *)((long)param_3 + (param_4 - 1));
    if (uVar8 == 0) {
      return 0xffffffffffffffff;
    }
    if (0xffffffffffffff88 < param_4) {
      return param_4;
    }
    uVar7 = *(ulong *)((long)param_3 + lVar12);
    uVar8 = 8 - ((uint)LZCOUNT(uVar8) ^ 0x1f);
    uVar9 = (ulong)uVar8;
    if (3 < (long)param_2) {
LAB_00bb5a04:
      uVar2 = -(uint)uVar3 & 0x3f;
      do {
        uVar8 = (uint)uVar9;
        if (lVar12 < 8) {
          puVar13 = (ulong *)((long)param_3 + lVar12);
          if (lVar12 == 0) goto LAB_00bb5b44;
          bVar4 = param_3 <= (ulong *)((long)puVar13 - (uVar9 >> 3));
          uVar6 = (uint)(uVar9 >> 3);
          if (!bVar4) {
            uVar6 = (uint)lVar12;
          }
          uVar8 = uVar8 + uVar6 * -8;
        }
        else {
          uVar6 = uVar8 >> 3;
          uVar8 = uVar8 & 7;
          bVar4 = true;
        }
        uVar9 = (ulong)uVar8;
        lVar12 = lVar12 - (ulong)uVar6;
        uVar7 = *(ulong *)((long)param_3 + lVar12);
        if ((param_1 + uVar5 + -3 <= pbVar10) || (!bVar4)) {
          puVar13 = (ulong *)((long)param_3 + lVar12);
          pbVar11 = pbVar10;
          goto joined_r0x00bb5b18;
        }
        pbVar11 = (byte *)(param_5 + ((uVar7 << (uVar9 & 0x3f)) >> uVar2) * 2);
        uVar8 = uVar8 + *pbVar11;
        *pbVar10 = pbVar11[1];
        pbVar11 = (byte *)(param_5 + ((uVar7 << ((ulong)uVar8 & 0x3f)) >> uVar2) * 2);
        uVar8 = uVar8 + *pbVar11;
        pbVar10[1] = pbVar11[1];
        pbVar11 = (byte *)(param_5 + ((uVar7 << ((ulong)uVar8 & 0x3f)) >> uVar2) * 2);
        uVar8 = uVar8 + *pbVar11;
        pbVar10[2] = pbVar11[1];
        pbVar1 = (byte *)(param_5 + ((uVar7 << ((ulong)uVar8 & 0x3f)) >> uVar2) * 2);
        pbVar11 = pbVar10 + 4;
        uVar8 = uVar8 + *pbVar1;
        uVar9 = (ulong)uVar8;
        pbVar10[3] = pbVar1[1];
        pbVar10 = pbVar11;
      } while (uVar8 < 0x41);
      puVar13 = (ulong *)&DAT_007892b0;
      goto joined_r0x00bb5b18;
    }
    puVar13 = (ulong *)((long)param_3 + lVar12);
    if (0xf < (long)param_4) {
      uVar9 = (ulong)(uVar8 & 7);
      puVar13 = (ulong *)((long)puVar13 - (ulong)(uVar8 >> 3));
      uVar7 = *puVar13;
LAB_00bb5b44:
      uVar8 = (uint)uVar9;
      pbVar11 = pbVar10;
      goto joined_r0x00bb5b18;
    }
    if (lVar12 != 0) {
      uVar2 = (uint)lVar12;
      if (param_3 <= (ulong *)((long)puVar13 - (ulong)(uVar8 >> 3))) {
        uVar2 = uVar8 >> 3;
      }
      puVar13 = (ulong *)((long)puVar13 - (ulong)uVar2);
      uVar8 = uVar8 + uVar2 * -8;
      uVar9 = (ulong)uVar8;
      uVar7 = *puVar13;
      goto joined_r0x00bb5b18;
    }
  }
  uVar8 = (uint)uVar9;
joined_r0x00bb5b18:
  if (pbVar11 < param_1 + uVar5) {
    param_1 = param_1 + (uVar5 - (long)pbVar11);
    do {
      param_1 = param_1 + -1;
      pbVar10 = (byte *)(param_5 + ((uVar7 << (uVar9 & 0x3f)) >> (-(uint)uVar3 & 0x3f)) * 2);
      uVar8 = (int)uVar9 + (uint)*pbVar10;
      uVar9 = (ulong)uVar8;
      *pbVar11 = pbVar10[1];
      pbVar11 = pbVar11 + 1;
    } while (param_1 != (byte *)0x0);
  }
  if (uVar8 != 0x40 || puVar13 != param_3) {
    param_2 = 0xffffffffffffffec;
  }
  return param_2;
}

