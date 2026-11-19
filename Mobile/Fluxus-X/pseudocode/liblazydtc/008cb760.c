/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cb760
 */

void FUN_008cb760(long param_1,long *param_2,long *param_3,long *param_4,long *param_5)

{
  ushort uVar1;
  ulong uVar2;
  int iVar3;
  int iVar4;
  byte bVar5;
  long *plVar6;
  long lVar7;
  long *plVar8;
  long lVar9;
  long *plVar10;
  long lVar11;
  long *plVar12;
  undefined4 *puVar13;
  ulong uVar14;
  ulong uVar15;
  long *plVar16;
  long lVar17;
  long lVar18;
  
  plVar16 = *(long **)(param_1 + 0x68);
  lVar7 = *param_2;
  plVar16[1] = param_2[1];
  *plVar16 = lVar7;
  lVar7 = *param_3;
  plVar16[3] = param_3[1];
  plVar16[2] = lVar7;
  lVar7 = *param_4;
  plVar16[5] = param_4[1];
  plVar16[4] = lVar7;
  lVar7 = *param_5;
  plVar16[7] = param_5[1];
  plVar16[6] = lVar7;
  if ((((*(char *)(param_1 + 6) != '\x01') ||
       (plVar8 = *(long **)(*(long *)(param_1 + 0x50) + 8), *(int *)((long)plVar8 + 0xc) != 7)) ||
      (*(char *)(*plVar8 + 6) != '\0')) ||
     ((*(int *)((long)plVar16 + 0xc) != 7 || (*(char *)(*plVar16 + 6) != '\0')))) {
    lVar7 = *(long *)(param_1 + 0x68);
    if (*(long *)(param_1 + 0x48) - lVar7 < 0x41) {
      FUN_008b41e4(param_1,4);
      lVar7 = *(long *)(param_1 + 0x68);
    }
    *(long *)(param_1 + 0x68) = lVar7 + 0x40;
    FUN_008b465c(param_1,lVar7,0);
    return;
  }
  uVar1 = *(short *)(param_1 + 0x28) + 1;
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x40;
  lVar7 = *plVar16;
  *(ushort *)(param_1 + 0x28) = uVar1;
  if (199 < uVar1) {
    FUN_008b42d8(param_1);
  }
  lVar17 = *(long *)(param_1 + 0x58);
  if (*(char *)(lVar7 + 6) == '\0') {
    lVar18 = *(long *)(lVar7 + 0x18);
    if ((DAT_00d1fdf0 == '\x01') &&
       (lVar9 = *(long *)(lVar18 + 0xd0), *(long *)(lVar18 + 0xd0) != 0)) {
      do {
        lVar18 = lVar9;
        *(long *)(lVar7 + 0x18) = lVar18;
        lVar9 = *(long *)(lVar18 + 0xd0);
      } while (*(long *)(lVar18 + 0xd0) != 0);
      *(undefined1 *)(lVar7 + 4) = *(undefined1 *)(lVar18 + 5);
    }
  }
  else {
    lVar18 = 0;
  }
  plVar8 = plVar16 + 2;
  if (DAT_00d1f4f8 == '\x01') {
    *(int *)(lVar18 + 0x48) = *(int *)(lVar18 + 0x48) + 1;
  }
  if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)) {
    plVar6 = (long *)FUN_008b4200(param_1);
  }
  else {
    plVar6 = (long *)(*(long *)(param_1 + 0x50) + 0x30);
    *(long **)(param_1 + 0x50) = plVar6;
  }
  lVar9 = *(long *)(param_1 + 0x68);
  bVar5 = *(byte *)(lVar7 + 4);
  lVar11 = *(long *)(lVar18 + 0x30);
  plVar6[2] = (long)plVar8;
  plVar6[4] = lVar11;
  lVar11 = *(long *)(param_1 + 0x48);
  plVar12 = *(long **)(param_1 + 0x68);
  plVar6[3] = lVar9 + (ulong)bVar5 * 0x10;
  bVar5 = *(byte *)(lVar7 + 4);
  *plVar6 = lVar18;
  plVar6[1] = (long)plVar16;
  plVar6[5] = 0x100000000;
  *(long **)(param_1 + 0x70) = plVar8;
  if (lVar11 - (long)plVar12 <= (long)((ulong)bVar5 * 0x10)) {
    iVar4 = *(int *)(param_1 + 0x40);
    iVar3 = iVar4 + (uint)bVar5;
    if ((int)(uint)bVar5 <= iVar4) {
      iVar3 = iVar4 << 1;
    }
    FUN_008b3fdc(param_1,iVar3,1);
    plVar12 = *(long **)(param_1 + 0x68);
    plVar8 = *(long **)(param_1 + 0x70);
  }
  plVar8 = plVar8 + (ulong)*(byte *)(lVar18 + 7) * 2;
  if (plVar12 < plVar8) {
    plVar10 = plVar8;
    if (plVar8 <= plVar12 + 2) {
      plVar10 = plVar12 + 2;
    }
    if ((long)plVar10 + ~(ulong)plVar12 < 0x10) {
      plVar10 = plVar12;
    }
    else {
      uVar2 = ((long)plVar10 + ~(ulong)plVar12 >> 4) + 1;
      uVar14 = uVar2 & 0x1ffffffffffffffe;
      plVar10 = plVar12 + uVar14 * 2;
      puVar13 = (undefined4 *)((long)plVar12 + 0x1c);
      uVar15 = uVar14;
      do {
        uVar15 = uVar15 - 2;
        puVar13[-4] = 0;
        *puVar13 = 0;
        puVar13 = puVar13 + 8;
      } while (uVar15 != 0);
      plVar12 = plVar10;
      if (uVar2 == uVar14) goto LAB_008cb9e8;
    }
    do {
      plVar12 = plVar10 + 2;
      *(undefined4 *)((long)plVar10 + 0xc) = 0;
      plVar10 = plVar12;
    } while (plVar12 < plVar8);
  }
LAB_008cb9e8:
  if (*(char *)(lVar18 + 3) == '\0') {
    plVar12 = (long *)plVar6[3];
  }
  lVar7 = *(long *)(lVar18 + 0x58);
  *(long **)(param_1 + 0x68) = plVar12;
  if ((lVar7 != 0) && (*(long *)(lVar18 + 0x50) != 0)) {
    *(uint *)((long)plVar6 + 0x2c) = *(uint *)((long)plVar6 + 0x2c) | 4;
  }
  FUN_008be71c(param_1);
  *(long *)(param_1 + 0x68) = (long)plVar16 + (*(long *)(param_1 + 0x58) - lVar17);
  *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
  return;
}

