/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb519c
 */

ulong FUN_00bb519c(undefined2 *param_1,ulong param_2,ulong *param_3,ulong param_4,uint *param_5)

{
  uint *puVar1;
  bool bVar2;
  uint uVar3;
  uint uVar4;
  undefined2 *puVar5;
  uint uVar6;
  ulong uVar7;
  ulong uVar8;
  uint uVar9;
  ulong *puVar10;
  long lVar11;
  
  if (param_4 == 0) {
    return 0xffffffffffffffb8;
  }
  lVar11 = param_4 - 8;
  if (param_4 < 8) {
    uVar7 = (ulong)(byte)*param_3;
    if ((long)param_4 < 5) {
      if (param_4 != 2) {
        if (param_4 != 3) {
          if (param_4 != 4) goto LAB_00bb5290;
          goto LAB_00bb5278;
        }
        goto LAB_00bb5280;
      }
LAB_00bb5288:
      uVar7 = uVar7 + (ulong)*(byte *)((long)param_3 + 1) * 0x100;
    }
    else {
      if (param_4 == 5) {
LAB_00bb5270:
        uVar7 = uVar7 + ((ulong)*(byte *)((long)param_3 + 4) << 0x20);
LAB_00bb5278:
        uVar7 = uVar7 + (ulong)*(byte *)((long)param_3 + 3) * 0x1000000;
LAB_00bb5280:
        uVar7 = uVar7 + (ulong)*(byte *)((long)param_3 + 2) * 0x10000;
        goto LAB_00bb5288;
      }
      if (param_4 == 6) {
LAB_00bb5268:
        uVar7 = uVar7 + ((ulong)*(byte *)((long)param_3 + 5) << 0x28);
        goto LAB_00bb5270;
      }
      if (param_4 == 7) {
        uVar7 = uVar7 | (ulong)*(byte *)((long)param_3 + 6) << 0x30;
        goto LAB_00bb5268;
      }
    }
LAB_00bb5290:
    uVar3 = (uint)*(byte *)((long)param_3 + (param_4 - 1));
    if (uVar3 == 0) {
      return 0xffffffffffffffec;
    }
    uVar9 = *param_5;
    uVar4 = uVar9 >> 0x10;
    uVar8 = (ulong)((int)LZCOUNT(uVar3) + (int)param_4 * -8 + 0x29);
    puVar5 = (undefined2 *)
             ((long)param_1 + (param_2 & ((long)param_2 >> 0x3f ^ 0xffffffffffffffffU)));
    if ((long)param_2 < 8) {
      puVar10 = param_3;
      goto LAB_00bb5528;
    }
    lVar11 = 0;
  }
  else {
    uVar3 = (uint)*(byte *)((long)param_3 + (param_4 - 1));
    if (uVar3 == 0) {
      return 0xffffffffffffffff;
    }
    if (0xffffffffffffff88 < param_4) {
      return param_4;
    }
    uVar9 = *param_5;
    uVar7 = *(ulong *)((long)param_3 + lVar11);
    uVar4 = uVar9 >> 0x10;
    uVar3 = 8 - ((uint)LZCOUNT(uVar3) ^ 0x1f);
    uVar8 = (ulong)uVar3;
    puVar5 = (undefined2 *)
             ((long)param_1 + (param_2 & ((long)param_2 >> 0x3f ^ 0xffffffffffffffffU)));
    if ((long)param_2 < 8) {
      puVar10 = (ulong *)((long)param_3 + lVar11);
      if ((long)param_4 < 0x10) {
        if (lVar11 == 0) goto LAB_00bb5528;
        uVar9 = (uint)lVar11;
        if (param_3 <= (ulong *)((long)puVar10 - (ulong)(uVar3 >> 3))) {
          uVar9 = uVar3 >> 3;
        }
        uVar3 = uVar3 + uVar9 * -8;
      }
      else {
        uVar9 = uVar3 >> 3;
        uVar3 = uVar3 & 7;
      }
      uVar8 = (ulong)uVar3;
      uVar7 = *(ulong *)((long)puVar10 - (ulong)uVar9);
      puVar10 = (ulong *)((long)puVar10 - (ulong)uVar9);
      goto LAB_00bb5528;
    }
  }
  uVar3 = -uVar4 & 0x3f;
  if ((uVar9 & 0xfc0000) < 0xc0000) {
    do {
      uVar9 = (uint)uVar8;
      if (lVar11 < 8) {
        puVar10 = (ulong *)((long)param_3 + lVar11);
        if (lVar11 == 0) goto LAB_00bb5528;
        bVar2 = param_3 <= (ulong *)(((long)param_3 + lVar11) - (uVar8 >> 3));
        uVar6 = (uint)(uVar8 >> 3);
        if (!bVar2) {
          uVar6 = (uint)lVar11;
        }
        uVar9 = uVar9 + uVar6 * -8;
      }
      else {
        uVar6 = uVar9 >> 3;
        uVar9 = uVar9 & 7;
        bVar2 = true;
      }
      uVar8 = (ulong)uVar9;
      lVar11 = lVar11 - (ulong)uVar6;
      uVar7 = *(ulong *)((long)param_3 + lVar11);
      if (((undefined2 *)((long)puVar5 + -9) <= param_1) || (!bVar2)) {
        puVar10 = (ulong *)((long)param_3 + lVar11);
        goto LAB_00bb5528;
      }
      puVar1 = param_5 + ((uVar7 << (uVar8 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
      puVar1 = param_5 + ((uVar7 << ((ulong)uVar9 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
      puVar1 = param_5 + ((uVar7 << ((ulong)uVar9 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
      puVar1 = param_5 + ((uVar7 << ((ulong)uVar9 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
      puVar1 = param_5 + ((uVar7 << ((ulong)uVar9 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      uVar8 = (ulong)uVar9;
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
    } while (uVar9 < 0x41);
  }
  else {
    do {
      uVar9 = (uint)uVar8;
      if (lVar11 < 8) {
        puVar10 = (ulong *)((long)param_3 + lVar11);
        if (lVar11 == 0) goto LAB_00bb5528;
        bVar2 = param_3 <= (ulong *)(((long)param_3 + lVar11) - (uVar8 >> 3));
        uVar6 = (uint)(uVar8 >> 3);
        if (!bVar2) {
          uVar6 = (uint)lVar11;
        }
        uVar9 = uVar9 + uVar6 * -8;
      }
      else {
        uVar6 = uVar9 >> 3;
        uVar9 = uVar9 & 7;
        bVar2 = true;
      }
      uVar8 = (ulong)uVar9;
      lVar11 = lVar11 - (ulong)uVar6;
      uVar7 = *(ulong *)((long)param_3 + lVar11);
      if (((undefined2 *)((long)puVar5 + -7) <= param_1) || (!bVar2)) {
        puVar10 = (ulong *)((long)param_3 + lVar11);
        goto LAB_00bb5528;
      }
      puVar1 = param_5 + ((uVar7 << (uVar8 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
      puVar1 = param_5 + ((uVar7 << ((ulong)uVar9 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
      puVar1 = param_5 + ((uVar7 << ((ulong)uVar9 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
      puVar1 = param_5 + ((uVar7 << ((ulong)uVar9 & 0x3f)) >> uVar3) + 1;
      *param_1 = (short)*puVar1;
      uVar9 = uVar9 + *(byte *)((long)puVar1 + 2);
      uVar8 = (ulong)uVar9;
      param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
    } while (uVar9 < 0x41);
  }
  puVar10 = (ulong *)&DAT_007892b0;
LAB_00bb5528:
  if (1 < (ulong)((long)puVar5 - (long)param_1)) {
    if ((uint)uVar8 < 0x41) {
      do {
        uVar3 = (uint)uVar8;
        if (puVar10 < param_3 + 1) {
          if (puVar10 == param_3) goto joined_r0x00bb568c;
          bVar2 = param_3 <= (ulong *)((long)puVar10 - (uVar8 >> 3));
          uVar9 = (uint)(uVar8 >> 3);
          if (!bVar2) {
            uVar9 = (int)puVar10 - (int)param_3;
          }
          uVar3 = uVar3 + uVar9 * -8;
        }
        else {
          uVar9 = uVar3 >> 3;
          uVar3 = uVar3 & 7;
          bVar2 = true;
        }
        uVar8 = (ulong)uVar3;
        puVar10 = (ulong *)((long)puVar10 - (ulong)uVar9);
        uVar7 = *puVar10;
        if ((puVar5 + -1 < param_1) || (!bVar2)) goto joined_r0x00bb568c;
        puVar1 = param_5 + ((uVar7 << (uVar8 & 0x3f)) >> (-uVar4 & 0x3f)) + 1;
        *param_1 = (short)*puVar1;
        uVar3 = uVar3 + *(byte *)((long)puVar1 + 2);
        uVar8 = (ulong)uVar3;
        param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3));
      } while (uVar3 < 0x41);
    }
    puVar10 = (ulong *)&DAT_007892b0;
joined_r0x00bb568c:
    for (; param_1 <= puVar5 + -1;
        param_1 = (undefined2 *)((long)param_1 + (ulong)*(byte *)((long)puVar1 + 3))) {
      puVar1 = param_5 + ((uVar7 << (uVar8 & 0x3f)) >> (-uVar4 & 0x3f)) + 1;
      *param_1 = (short)*puVar1;
      uVar8 = (ulong)((int)uVar8 + (uint)*(byte *)((long)puVar1 + 2));
    }
  }
  uVar3 = (uint)uVar8;
  if (param_1 < puVar5) {
    param_5 = param_5 + ((uVar7 << (uVar8 & 0x3f)) >> ((ulong)-uVar4 & 0x3f)) + 1;
    *(char *)param_1 = (char)*param_5;
    if (*(char *)((long)param_5 + 3) == '\x01') {
      uVar3 = uVar3 + *(byte *)((long)param_5 + 2);
    }
    else if ((uVar3 < 0x40) && (uVar3 = uVar3 + *(byte *)((long)param_5 + 2), 0x3f < uVar3)) {
      uVar3 = 0x40;
    }
  }
  if (uVar3 != 0x40 || puVar10 != param_3) {
    param_2 = 0xffffffffffffffec;
  }
  return param_2;
}

