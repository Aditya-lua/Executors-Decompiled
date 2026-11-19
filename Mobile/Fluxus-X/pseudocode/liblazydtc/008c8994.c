/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c8994
 */

undefined8 FUN_008c8994(long param_1,long *param_2,ulong param_3)

{
  ulong uVar1;
  int iVar2;
  char cVar3;
  byte bVar4;
  uint uVar5;
  long *plVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  undefined4 *puVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  int iVar20;
  ulong uVar21;
  long lVar22;
  
  uVar21 = param_3 & 0xffffffff;
  if (*(int *)((long)param_2 + 0xc) != 7) {
    FUN_008cda50(param_1,param_2);
  }
  lVar22 = *param_2;
  if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)) {
    plVar6 = (long *)FUN_008b4200(param_1);
  }
  else {
    plVar6 = (long *)(*(long *)(param_1 + 0x50) + 0x30);
    *(long **)(param_1 + 0x50) = plVar6;
  }
  cVar3 = *(char *)(lVar22 + 6);
  plVar6[1] = (long)param_2;
  if (cVar3 == '\0') {
    lVar7 = *(long *)(lVar22 + 0x18);
    if ((DAT_00d1fdf0 == '\x01') && (lVar9 = *(long *)(lVar7 + 0xd0), *(long *)(lVar7 + 0xd0) != 0))
    {
      do {
        lVar7 = lVar9;
        *(long *)(lVar22 + 0x18) = lVar7;
        lVar9 = *(long *)(lVar7 + 0xd0);
      } while (*(long *)(lVar7 + 0xd0) != 0);
      *(undefined1 *)(lVar22 + 4) = *(undefined1 *)(lVar7 + 5);
    }
  }
  else {
    lVar7 = 0;
  }
  lVar9 = *(long *)(param_1 + 0x68);
  bVar4 = *(byte *)(lVar22 + 4);
  *plVar6 = lVar7;
  plVar6[4] = 0;
  lVar7 = *(long *)(param_1 + 0x48);
  lVar11 = *(long *)(param_1 + 0x68);
  *(int *)(plVar6 + 5) = (int)param_3;
  *(undefined4 *)((long)plVar6 + 0x2c) = 0;
  plVar6[2] = (long)(param_2 + 2);
  plVar6[3] = lVar9 + (ulong)bVar4 * 0x10;
  bVar4 = *(byte *)(lVar22 + 4);
  *(long **)(param_1 + 0x70) = param_2 + 2;
  if (lVar7 - lVar11 <= (long)((ulong)bVar4 * 0x10)) {
    iVar2 = *(int *)(param_1 + 0x40);
    iVar20 = iVar2 + (uint)bVar4;
    if ((int)(uint)bVar4 <= iVar2) {
      iVar20 = iVar2 << 1;
    }
    FUN_008b3fdc(param_1,iVar20,1);
  }
  if (*(char *)(lVar22 + 6) != '\0') {
    uVar5 = (**(code **)(lVar22 + 0x28))(param_1);
    if ((int)uVar5 < 0) {
      return 2;
    }
    lVar22 = *(long *)(param_1 + 0x50);
    puVar12 = *(undefined8 **)(lVar22 + 8);
    if (((int)param_3 != 0) && (uVar5 != 0)) {
      puVar10 = *(undefined8 **)(param_1 + 0x68);
      puVar13 = puVar12;
      puVar16 = puVar10 + (ulong)uVar5 * -2;
      do {
        puVar15 = puVar16 + 2;
        uVar8 = *puVar16;
        uVar5 = (int)uVar21 - 1;
        uVar21 = (ulong)uVar5;
        puVar12 = puVar13 + 2;
        puVar13[1] = puVar16[1];
        *puVar13 = uVar8;
        if (uVar5 == 0) break;
        puVar13 = puVar12;
        puVar16 = puVar15;
      } while (puVar15 < puVar10);
    }
    iVar20 = (int)uVar21;
    if (0 < iVar20) {
      if (iVar20 == 1) {
        iVar20 = 1;
        puVar13 = puVar12;
      }
      else {
        uVar19 = uVar21 & 0x7ffffffe;
        puVar13 = puVar12 + uVar19 * 2;
        iVar20 = iVar20 - (int)uVar19;
        puVar14 = (undefined4 *)((long)puVar12 + 0x1c);
        uVar17 = uVar19;
        do {
          uVar17 = uVar17 - 2;
          puVar14[-4] = 0;
          *puVar14 = 0;
          puVar14 = puVar14 + 8;
        } while (uVar17 != 0);
        puVar12 = puVar13;
        if (uVar19 == uVar21) goto LAB_008c8c50;
      }
      uVar5 = iVar20 + 1;
      do {
        uVar5 = uVar5 - 1;
        *(undefined4 *)((long)puVar13 + 0xc) = 0;
        puVar12 = puVar13 + 2;
        puVar13 = puVar13 + 2;
      } while (1 < uVar5);
    }
LAB_008c8c50:
    uVar8 = *(undefined8 *)(lVar22 + -0x20);
    *(long *)(param_1 + 0x50) = lVar22 + -0x30;
    *(undefined8 **)(param_1 + 0x68) = puVar12;
    *(undefined8 *)(param_1 + 0x70) = uVar8;
    return 1;
  }
  lVar22 = *(long *)(lVar22 + 0x18);
  if (DAT_00d1f4f8 == '\x01') {
    *(int *)(lVar22 + 0x48) = *(int *)(lVar22 + 0x48) + 1;
  }
  uVar17 = *(ulong *)(param_1 + 0x68);
  uVar21 = *(long *)(param_1 + 0x70) + (ulong)*(byte *)(lVar22 + 7) * 0x10;
  if (uVar21 <= uVar17) {
    cVar3 = *(char *)(lVar22 + 3);
    uVar19 = uVar17;
    goto joined_r0x008c8bec;
  }
  uVar19 = uVar21;
  if (uVar21 <= uVar17 + 0x10) {
    uVar19 = uVar17 + 0x10;
  }
  if (uVar19 + ~uVar17 < 0x10) {
LAB_008c8b8c:
    do {
      uVar19 = uVar17 + 0x10;
      *(undefined4 *)(uVar17 + 0xc) = 0;
      uVar17 = uVar19;
    } while (uVar19 < uVar21);
  }
  else {
    uVar1 = (uVar19 + ~uVar17 >> 4) + 1;
    uVar18 = uVar1 & 0x1ffffffffffffffe;
    uVar19 = uVar17 + uVar18 * 0x10;
    puVar14 = (undefined4 *)(uVar17 + 0x1c);
    uVar17 = uVar18;
    do {
      uVar17 = uVar17 - 2;
      puVar14[-4] = 0;
      *puVar14 = 0;
      puVar14 = puVar14 + 8;
    } while (uVar17 != 0);
    uVar17 = uVar19;
    if (uVar1 != uVar18) goto LAB_008c8b8c;
  }
  cVar3 = *(char *)(lVar22 + 3);
joined_r0x008c8bec:
  if (cVar3 == '\0') {
    uVar19 = plVar6[3];
  }
  lVar7 = *(long *)(lVar22 + 0x30);
  *(ulong *)(param_1 + 0x68) = uVar19;
  plVar6[4] = lVar7;
  if ((*(long *)(lVar22 + 0x58) != 0) && (*(long *)(lVar22 + 0x50) != 0)) {
    *(undefined4 *)((long)plVar6 + 0x2c) = 4;
  }
  return 0;
}

