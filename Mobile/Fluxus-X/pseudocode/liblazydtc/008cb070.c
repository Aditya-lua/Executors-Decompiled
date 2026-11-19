/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cb070
 */

long FUN_008cb070(long param_1,long param_2,long *param_3,long *param_4,long *param_5)

{
  ushort uVar1;
  ulong uVar2;
  int iVar3;
  int iVar4;
  byte bVar5;
  undefined8 *puVar6;
  long *plVar7;
  long lVar8;
  long *plVar9;
  long lVar10;
  long lVar11;
  long *plVar12;
  long lVar13;
  long *plVar14;
  undefined4 *puVar15;
  ulong uVar16;
  ulong uVar17;
  long lVar18;
  long *plVar19;
  long lVar20;
  undefined8 uVar21;
  
  lVar8 = *param_3;
  plVar19 = *(long **)(param_1 + 0x68);
  lVar18 = *(long *)(param_1 + 0x58);
  plVar19[1] = param_3[1];
  *plVar19 = lVar8;
  lVar8 = *param_4;
  plVar19[3] = param_4[1];
  plVar19[2] = lVar8;
  lVar8 = *param_5;
  plVar19[5] = param_5[1];
  plVar19[4] = lVar8;
  if ((((*(char *)(param_1 + 6) != '\x01') ||
       (plVar9 = *(long **)(*(long *)(param_1 + 0x50) + 8), *(int *)((long)plVar9 + 0xc) != 7)) ||
      (*(char *)(*plVar9 + 6) != '\0')) ||
     ((*(int *)((long)plVar19 + 0xc) != 7 || (*(char *)(*plVar19 + 6) != '\0')))) {
    lVar8 = *(long *)(param_1 + 0x68);
    if (*(long *)(param_1 + 0x48) - lVar8 < 0x31) {
      FUN_008b41e4(param_1,3);
      lVar8 = *(long *)(param_1 + 0x68);
    }
    *(long *)(param_1 + 0x68) = lVar8 + 0x30;
    FUN_008b465c(param_1,lVar8,1);
    lVar10 = *(long *)(param_1 + 0x58);
    lVar8 = *(long *)(param_1 + 0x68);
    goto LAB_008cb138;
  }
  uVar1 = *(short *)(param_1 + 0x28) + 1;
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x30;
  lVar8 = *plVar19;
  *(ushort *)(param_1 + 0x28) = uVar1;
  if (199 < uVar1) {
    FUN_008b42d8(param_1);
  }
  lVar20 = *(long *)(param_1 + 0x58);
  if (*(char *)(lVar8 + 6) == '\0') {
    lVar10 = *(long *)(lVar8 + 0x18);
    if ((DAT_00d1fdf0 == '\x01') &&
       (lVar11 = *(long *)(lVar10 + 0xd0), *(long *)(lVar10 + 0xd0) != 0)) {
      do {
        lVar10 = lVar11;
        *(long *)(lVar8 + 0x18) = lVar10;
        lVar11 = *(long *)(lVar10 + 0xd0);
      } while (*(long *)(lVar10 + 0xd0) != 0);
      *(undefined1 *)(lVar8 + 4) = *(undefined1 *)(lVar10 + 5);
    }
  }
  else {
    lVar10 = 0;
  }
  plVar9 = plVar19 + 2;
  if (DAT_00d1f4f8 == '\x01') {
    *(int *)(lVar10 + 0x48) = *(int *)(lVar10 + 0x48) + 1;
  }
  if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)) {
    plVar7 = (long *)FUN_008b4200(param_1);
  }
  else {
    plVar7 = (long *)(*(long *)(param_1 + 0x50) + 0x30);
    *(long **)(param_1 + 0x50) = plVar7;
  }
  lVar11 = *(long *)(param_1 + 0x68);
  bVar5 = *(byte *)(lVar8 + 4);
  lVar13 = *(long *)(lVar10 + 0x30);
  plVar7[2] = (long)plVar9;
  *plVar7 = lVar10;
  plVar7[1] = (long)plVar19;
  plVar7[4] = lVar13;
  lVar13 = *(long *)(param_1 + 0x48);
  plVar14 = *(long **)(param_1 + 0x68);
  plVar7[3] = lVar11 + (ulong)bVar5 * 0x10;
  bVar5 = *(byte *)(lVar8 + 4);
  plVar7[5] = 0x100000001;
  *(long **)(param_1 + 0x70) = plVar9;
  if (lVar13 - (long)plVar14 <= (long)((ulong)bVar5 * 0x10)) {
    iVar4 = *(int *)(param_1 + 0x40);
    iVar3 = iVar4 + (uint)bVar5;
    if ((int)(uint)bVar5 <= iVar4) {
      iVar3 = iVar4 << 1;
    }
    FUN_008b3fdc(param_1,iVar3,1);
    plVar14 = *(long **)(param_1 + 0x68);
    plVar9 = *(long **)(param_1 + 0x70);
  }
  plVar9 = plVar9 + (ulong)*(byte *)(lVar10 + 7) * 2;
  if (plVar14 < plVar9) {
    plVar12 = plVar9;
    if (plVar9 <= plVar14 + 2) {
      plVar12 = plVar14 + 2;
    }
    if ((long)plVar12 + ~(ulong)plVar14 < 0x10) {
      plVar12 = plVar14;
    }
    else {
      uVar2 = ((long)plVar12 + ~(ulong)plVar14 >> 4) + 1;
      uVar16 = uVar2 & 0x1ffffffffffffffe;
      plVar12 = plVar14 + uVar16 * 2;
      puVar15 = (undefined4 *)((long)plVar14 + 0x1c);
      uVar17 = uVar16;
      do {
        uVar17 = uVar17 - 2;
        puVar15[-4] = 0;
        *puVar15 = 0;
        puVar15 = puVar15 + 8;
      } while (uVar17 != 0);
      plVar14 = plVar12;
      if (uVar2 == uVar16) goto LAB_008cb320;
    }
    do {
      plVar14 = plVar12 + 2;
      *(undefined4 *)((long)plVar12 + 0xc) = 0;
      plVar12 = plVar14;
    } while (plVar14 < plVar9);
  }
LAB_008cb320:
  if (*(char *)(lVar10 + 3) == '\0') {
    plVar14 = (long *)plVar7[3];
  }
  lVar8 = *(long *)(lVar10 + 0x58);
  *(long **)(param_1 + 0x68) = plVar14;
  if ((lVar8 != 0) && (*(long *)(lVar10 + 0x50) != 0)) {
    *(uint *)((long)plVar7 + 0x2c) = *(uint *)((long)plVar7 + 0x2c) | 4;
  }
  FUN_008be71c(param_1);
  lVar10 = *(long *)(param_1 + 0x58);
  lVar8 = (long)plVar19 + (lVar10 - lVar20) + 0x10;
  *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
LAB_008cb138:
  param_2 = param_2 - lVar18;
  *(long *)(param_1 + 0x68) = lVar8 + -0x10;
  uVar21 = *(undefined8 *)(lVar8 + -0x10);
  puVar6 = (undefined8 *)(lVar10 + param_2);
  puVar6[1] = *(undefined8 *)(lVar8 + -8);
  *puVar6 = uVar21;
  return lVar10 + param_2;
}

