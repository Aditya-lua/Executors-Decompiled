
ulong FUN_006eefe0(long param_1,undefined8 param_2,undefined8 param_3,long param_4,long param_5)

{
  uint uVar1;
  char cVar2;
  undefined2 uVar3;
  undefined2 uVar4;
  ushort uVar5;
  ushort uVar6;
  uint uVar7;
  int iVar8;
  ulong uVar9;
  char *pcVar10;
  undefined8 uVar11;
  uint uVar12;
  code *pcVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long lVar16;
  long lVar17;
  
  uVar3 = *(undefined2 *)(param_1 + 0x52);
  uVar4 = *(undefined2 *)(param_1 + 0x50);
  lVar16 = *(long *)(param_1 + 0x20);
  lVar17 = *(long *)(param_1 + 0x40);
  cVar2 = *(char *)(param_1 + 5);
  uVar9 = (*pcRam0000000000a401d8)();
  uVar7 = (uint)uVar9;
  if (uVar7 == 0) {
    return uVar9;
  }
  if (param_5 == 0) {
    uVar15 = uVar9;
    if (cVar2 != '\0') goto LAB_006ef0e4;
LAB_006ef100:
    iVar8 = (int)uVar15;
    *(undefined1 *)(param_1 + 5) = 0;
    uVar5 = *(ushort *)(param_1 + 0x52);
    uVar6 = *(ushort *)(param_1 + 0x50);
    *(undefined2 *)(param_1 + 0x52) = uVar3;
    *(undefined2 *)(param_1 + 0x50) = uVar4;
    if (uVar5 <= uVar6) {
LAB_006ef11c:
      pcVar13 = *(code **)(*(long *)(param_1 + 0x18) + 0x518);
      if ((pcVar13 != (code *)0x0) && ((*pcVar13)(param_1), *(char *)(param_1 + 3) == '\x06')) {
        return 0;
      }
    }
  }
  else {
    if (uVar7 != 2) {
      puVar14 = *(undefined8 **)(param_1 + 8);
      if (uVar7 == 3) {
        puVar14[1] = puVar14[-1];
        *puVar14 = puVar14[-2];
      }
      else {
        if (uVar7 == 5) {
          pcVar10 = "error in error handling";
          uVar11 = 0x17;
        }
        else {
          if (uVar7 != 4) goto LAB_006ef09c;
          pcVar10 = "not enough memory";
          uVar11 = 0x11;
        }
        uVar11 = func_0x006f6ef8(param_1,pcVar10,uVar11);
        *puVar14 = uVar11;
        *(undefined4 *)((long)puVar14 + 0xc) = 5;
      }
LAB_006ef09c:
      *(undefined8 **)(param_1 + 8) = puVar14 + 2;
    }
    iVar8 = (*pcRam0000000000a401d8)(param_1,&DAT_006ef268,*(long *)(param_1 + 0x30) + param_5);
    uVar12 = 4;
    if (iVar8 != 4 || uVar7 != 4) {
      uVar12 = 5;
    }
    uVar1 = 2;
    if (iVar8 != 0) {
      uVar1 = uVar12;
    }
    if (iVar8 != 0) {
      uVar7 = uVar12;
    }
    uVar9 = (ulong)uVar7;
    uVar15 = (ulong)uVar1;
    if (cVar2 == '\0') goto LAB_006ef100;
LAB_006ef0e4:
    iVar8 = (int)uVar15;
    uVar5 = *(ushort *)(param_1 + 0x52);
    uVar6 = *(ushort *)(param_1 + 0x50);
    *(undefined2 *)(param_1 + 0x52) = uVar3;
    *(undefined2 *)(param_1 + 0x50) = uVar4;
    if (uVar5 <= uVar6) goto LAB_006ef11c;
  }
  uVar15 = lVar16 - lVar17;
  puVar14 = (undefined8 *)(*(long *)(param_1 + 0x30) + param_4);
  func_0x006ef974(param_1,puVar14);
  if (iVar8 - 2U < 2) {
    uVar11 = *(undefined8 *)(*(long *)(param_1 + 8) + -0x10);
    puVar14[1] = *(undefined8 *)(*(long *)(param_1 + 8) + -8);
    *puVar14 = uVar11;
  }
  else {
    if (iVar8 == 5) {
      pcVar10 = "error in error handling";
      uVar11 = 0x17;
    }
    else {
      if (iVar8 != 4) goto LAB_006ef1bc;
      pcVar10 = "not enough memory";
      uVar11 = 0x11;
    }
    uVar11 = func_0x006f6ef8(param_1,pcVar10,uVar11);
    *puVar14 = uVar11;
    *(undefined4 *)((long)puVar14 + 0xc) = 5;
  }
LAB_006ef1bc:
  lVar16 = *(long *)(param_1 + 0x40);
  uVar11 = *(undefined8 *)(lVar16 + uVar15);
  *(ulong *)(param_1 + 0x20) = lVar16 + uVar15;
  *(undefined8 **)(param_1 + 8) = puVar14 + 2;
  *(undefined8 *)(param_1 + 0x10) = uVar11;
  if ((20000 < (int)*(uint *)(param_1 + 0x4c)) && ((int)(uVar15 >> 3) * -0x33333333 < 19999)) {
    lVar17 = func_0x006f3d14(param_1,lVar16,(ulong)*(uint *)(param_1 + 0x4c) * 0x28,&UNK_000c3500,
                             *(undefined1 *)(param_1 + 2));
    *(undefined4 *)(param_1 + 0x4c) = 20000;
    *(long *)(param_1 + 0x20) = lVar17 + (*(long *)(param_1 + 0x20) - lVar16);
    *(undefined **)(param_1 + 0x38) = &UNK_000c34d8 + lVar17;
    *(long *)(param_1 + 0x40) = lVar17;
  }
  return uVar9;
}

