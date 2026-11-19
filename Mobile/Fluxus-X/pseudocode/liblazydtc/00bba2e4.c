/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bba2e4
 */

/* WARNING: Type propagation algorithm not settling */

ulong FUN_00bba2e4(long param_1,uint *param_2,ulong param_3,long param_4,ulong param_5,int param_6)

{
  int iVar1;
  uint uVar2;
  byte bVar3;
  byte bVar4;
  bool bVar5;
  bool bVar6;
  void *pvVar7;
  ulong uVar8;
  void *__src;
  size_t sVar9;
  long lVar10;
  ulong uVar11;
  undefined4 uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  uint uVar16;
  ulong uVar17;
  ulong uVar18;
  
  if (param_3 < 2) {
    return 0xffffffffffffffec;
  }
  bVar4 = (byte)*param_2;
  iVar1 = *(int *)(param_1 + 0x75e0);
  bVar3 = bVar4 & 3;
  if (iVar1 == 0) {
    uVar13 = 0x20000;
  }
  else {
    uVar13 = (ulong)*(uint *)(param_1 + 0x74f8);
  }
  if (1 < bVar3) {
    if ((bVar3 != 2) && (*(int *)(param_1 + 30000) == 0)) {
      return 0xffffffffffffffe2;
    }
    if (param_3 < 5) {
      return 0xffffffffffffffec;
    }
    bVar4 = bVar4 >> 2 & 3;
    uVar8 = uVar13;
    if (param_5 <= uVar13) {
      uVar8 = param_5;
    }
    uVar2 = *param_2;
    if (bVar4 == 2) {
      uVar16 = uVar2 >> 4 & 0x3fff;
      uVar17 = (ulong)(uVar2 >> 0x12);
      bVar6 = true;
      lVar14 = 4;
    }
    else if (bVar4 == 3) {
      uVar16 = uVar2 >> 4 & 0x3ffff;
      uVar17 = (ulong)(uVar2 >> 0x16) | (ulong)(byte)param_2[1] << 10;
      bVar6 = true;
      lVar14 = 5;
    }
    else {
      bVar6 = bVar4 != 0;
      uVar16 = uVar2 >> 4 & 0x3ff;
      uVar17 = (ulong)(uVar2 >> 0xe) & 0x3ff;
      lVar14 = 3;
    }
    if ((param_4 == 0) && (uVar16 != 0)) {
      return 0xffffffffffffffba;
    }
    uVar18 = (ulong)uVar16;
    if (uVar13 < uVar18) {
      return 0xffffffffffffffec;
    }
    bVar5 = false;
    if (uVar16 < 6) {
      bVar5 = bVar6;
    }
    if (bVar5) {
      return 0xffffffffffffffe8;
    }
    uVar13 = lVar14 + uVar17;
    if (param_3 < uVar13) {
      return 0xffffffffffffffec;
    }
    if (uVar8 < uVar18) {
      return 0xffffffffffffffba;
    }
    if (iVar1 == 0) {
      uVar11 = 0x20000;
    }
    else {
      uVar11 = (ulong)*(uint *)(param_1 + 0x74f8);
    }
    if ((param_6 == 0) && (uVar18 + uVar11 + 0x40 < param_5)) {
      uVar12 = 1;
      lVar15 = param_4 + uVar11 + 0x20;
    }
    else {
      if (0x10000 < uVar16) {
        param_4 = param_4 + uVar8;
        uVar12 = 2;
        lVar15 = param_4 - uVar18;
        *(long *)(param_1 + 0x7690) = lVar15;
        goto LAB_00bba754;
      }
      uVar12 = 0;
      lVar15 = param_1 + 0x76a4;
    }
    *(long *)(param_1 + 0x7690) = lVar15;
    param_4 = lVar15 + uVar18;
LAB_00bba754:
    lVar10 = (ulong)(*(int *)(param_1 + 0x7614) != 0) << 4;
    *(long *)(param_1 + 0x7698) = param_4;
    *(undefined4 *)(param_1 + 0x76a0) = uVar12;
    if ((*(int *)(param_1 + 0x75fc) != 0) && (0x300 < uVar16)) {
      uVar8 = 0;
      do {
        uVar11 = uVar8 >> 2;
        Hint_Prefetch(*(long *)(param_1 + 0x18) + uVar8,0,1,0);
        uVar8 = uVar8 + 0x40;
      } while (uVar11 < 0xff1);
    }
    if (bVar3 == 3) {
      if (bVar6) {
        uVar8 = HUF_decompress4X_usingDTable();
      }
      else {
        uVar8 = HUF_decompress1X_usingDTable
                          (lVar15,uVar18,(long)param_2 + lVar14,uVar17,
                           *(undefined8 *)(param_1 + 0x18),lVar10);
      }
    }
    else if (bVar6) {
      uVar8 = HUF_decompress4X_hufOnly_wksp
                        (param_1 + 0x2838,lVar15,uVar18,(long)param_2 + lVar14,uVar17,
                         param_1 + 0x6abc,0xa00);
    }
    else {
      uVar8 = HUF_decompress1X1_DCtx_wksp
                        (param_1 + 0x2838,lVar15,uVar18,(long)param_2 + lVar14,uVar17,
                         param_1 + 0x6abc,0xa00,lVar10);
    }
    if (*(int *)(param_1 + 0x76a0) == 2) {
      memcpy((void *)(param_1 + 0x76a4),(void *)(*(long *)(param_1 + 0x7698) + -0x10000),0x10000);
      memmove((void *)((long)*(void **)(param_1 + 0x7690) + 0xffe0),*(void **)(param_1 + 0x7690),
              uVar18 - 0x10000);
      *(long *)(param_1 + 0x7698) = *(long *)(param_1 + 0x7698) + -0x20;
      *(long *)(param_1 + 0x7690) = *(long *)(param_1 + 0x7690) + 0xffe0;
    }
    if (0xffffffffffffff88 < uVar8) {
      return 0xffffffffffffffec;
    }
    *(ulong *)(param_1 + 0x75c8) = uVar18;
    *(undefined8 *)(param_1 + 0x75a8) = *(undefined8 *)(param_1 + 0x7690);
    *(undefined4 *)(param_1 + 30000) = 1;
    if (bVar3 == 2) {
      *(long *)(param_1 + 0x18) = param_1 + 0x2838;
      return uVar13;
    }
    return uVar13;
  }
  bVar3 = bVar4 >> 2 & 3;
  uVar8 = uVar13;
  if (param_5 <= uVar13) {
    uVar8 = param_5;
  }
  if ((bVar4 & 3) == 0) {
    if (bVar3 == 1) {
      uVar17 = (ulong)(ushort)((ushort)*param_2 >> 4);
      lVar14 = 2;
    }
    else if (bVar3 == 3) {
      if (param_3 == 2) {
        return 0xffffffffffffffec;
      }
      uVar17 = (ulong)(uint3)((uint3)*param_2 >> 4);
      lVar14 = 3;
    }
    else {
      uVar17 = (ulong)(bVar4 >> 3);
      lVar14 = 1;
    }
    if ((param_4 == 0) && (bVar6 = uVar17 != 0, uVar17 = 0, bVar6)) {
      return 0xffffffffffffffba;
    }
    if (uVar13 < uVar17) {
      return 0xffffffffffffffec;
    }
    if (param_5 < uVar17) {
      return 0xffffffffffffffba;
    }
    if (iVar1 == 0) {
      uVar13 = 0x20000;
    }
    else {
      uVar13 = (ulong)*(uint *)(param_1 + 0x74f8);
    }
    if ((param_6 == 0) && (uVar17 + uVar13 + 0x40 < param_5)) {
      uVar12 = 1;
      pvVar7 = (void *)(param_4 + uVar13 + 0x20);
    }
    else {
      if (0x10000 < uVar17) {
        uVar12 = 2;
        pvVar7 = (void *)(((param_4 + uVar8) - uVar17) + 0xffe0);
        *(void **)(param_1 + 0x7690) = pvVar7;
        lVar15 = (long)pvVar7 + (uVar17 - 0x10000);
        bVar6 = true;
        goto LAB_00bba59c;
      }
      uVar12 = 0;
      pvVar7 = (void *)(param_1 + 0x76a4);
    }
    bVar6 = false;
    *(void **)(param_1 + 0x7690) = pvVar7;
    lVar15 = (long)pvVar7 + uVar17;
LAB_00bba59c:
    uVar13 = lVar14 + uVar17;
    *(long *)(param_1 + 0x7698) = lVar15;
    *(undefined4 *)(param_1 + 0x76a0) = uVar12;
    if (uVar13 + 0x20 <= param_3) {
      *(ulong *)(param_1 + 0x75c8) = uVar17;
      *(long *)(param_1 + 0x75a8) = (long)param_2 + lVar14;
      *(ulong *)(param_1 + 0x7698) = (long)param_2 + lVar14 + uVar17;
      *(undefined4 *)(param_1 + 0x76a0) = 0;
      return uVar13;
    }
    if (param_3 < uVar13) {
      return 0xffffffffffffffec;
    }
    __src = (void *)((long)param_2 + lVar14);
    if (bVar6) {
      memcpy(pvVar7,__src,uVar17 - 0x10000);
      __src = (void *)((uVar17 - 0x10000) + (long)__src);
      pvVar7 = (void *)(param_1 + 0x76a4);
      sVar9 = 0x10000;
    }
    else {
      sVar9 = uVar17;
    }
    memcpy(pvVar7,__src,sVar9);
    *(ulong *)(param_1 + 0x75c8) = uVar17;
    *(undefined8 *)(param_1 + 0x75a8) = *(undefined8 *)(param_1 + 0x7690);
    return uVar13;
  }
  if (bVar3 == 1) {
    if (param_3 == 2) {
      return 0xffffffffffffffec;
    }
    uVar17 = (ulong)(ushort)*param_2;
    lVar14 = 2;
LAB_00bba430:
    uVar17 = uVar17 >> 4;
  }
  else {
    if (bVar3 == 3) {
      if (param_3 < 4) {
        return 0xffffffffffffffec;
      }
      lVar14 = 3;
      uVar17 = (ulong)(uint3)*param_2;
      goto LAB_00bba430;
    }
    uVar17 = (ulong)(bVar4 >> 3);
    lVar14 = 1;
  }
  if ((param_4 == 0) && (bVar6 = uVar17 != 0, uVar17 = 0, bVar6)) {
    return 0xffffffffffffffba;
  }
  if (uVar13 < uVar17) {
    return 0xffffffffffffffec;
  }
  if (param_5 < uVar17) {
    return 0xffffffffffffffba;
  }
  if (iVar1 == 0) {
    uVar13 = 0x20000;
  }
  else {
    uVar13 = (ulong)*(uint *)(param_1 + 0x74f8);
  }
  if ((param_6 == 0) && (uVar17 + uVar13 + 0x40 < param_5)) {
    uVar12 = 1;
    pvVar7 = (void *)(param_4 + uVar13 + 0x20);
  }
  else {
    sVar9 = uVar17 - 0x10000;
    if (0xffff < uVar17 && sVar9 != 0) {
      *(undefined4 *)(param_1 + 0x76a0) = 2;
      pvVar7 = (void *)(((param_4 + uVar8) - uVar17) + 0xffe0);
      *(void **)(param_1 + 0x7690) = pvVar7;
      *(size_t *)(param_1 + 0x7698) = sVar9 + (long)pvVar7;
      memset(pvVar7,(uint)*(byte *)((long)param_2 + lVar14),sVar9);
      bVar3 = *(byte *)((long)param_2 + lVar14);
      pvVar7 = (void *)(param_1 + 0x76a4);
      uVar13 = 0x10000;
      goto LAB_00bba6c0;
    }
    uVar12 = 0;
    pvVar7 = (void *)(param_1 + 0x76a4);
  }
  *(void **)(param_1 + 0x7690) = pvVar7;
  *(ulong *)(param_1 + 0x7698) = (long)pvVar7 + uVar17;
  *(undefined4 *)(param_1 + 0x76a0) = uVar12;
  bVar3 = *(byte *)((long)param_2 + lVar14);
  uVar13 = uVar17;
LAB_00bba6c0:
  memset(pvVar7,(uint)bVar3,uVar13);
  *(ulong *)(param_1 + 0x75c8) = uVar17;
  *(undefined8 *)(param_1 + 0x75a8) = *(undefined8 *)(param_1 + 0x7690);
  return lVar14 + 1;
}

