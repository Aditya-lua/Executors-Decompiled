
int FUN_006ef098(void)

{
  undefined8 *puVar1;
  ushort uVar2;
  ushort uVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  undefined4 in_w8;
  int iVar8;
  code *pcVar9;
  long in_x9;
  long unaff_x19;
  int unaff_w20;
  long unaff_x21;
  long lVar10;
  ulong uVar11;
  long unaff_x23;
  long unaff_x24;
  undefined2 unaff_w25;
  undefined2 unaff_w26;
  int unaff_w27;
  long unaff_x28;
  
  *(undefined4 *)(in_x9 + 0xc) = in_w8;
  *(long *)(unaff_x19 + 8) = in_x9 + 0x10;
  iVar5 = (**(code **)(unaff_x28 + 0x1d8))();
  iVar8 = 4;
  if (iVar5 != 4 || unaff_w20 != 4) {
    iVar8 = 5;
  }
  iVar4 = 2;
  if (iVar5 != 0) {
    unaff_w20 = iVar8;
    iVar4 = iVar8;
  }
  if (unaff_w27 == 0) {
    *(undefined1 *)(unaff_x19 + 5) = 0;
    uVar2 = *(ushort *)(unaff_x19 + 0x52);
    uVar3 = *(ushort *)(unaff_x19 + 0x50);
    *(undefined2 *)(unaff_x19 + 0x52) = unaff_w25;
    *(undefined2 *)(unaff_x19 + 0x50) = unaff_w26;
    if (uVar3 < uVar2) goto LAB_006ef144;
  }
  else {
    uVar2 = *(ushort *)(unaff_x19 + 0x52);
    uVar3 = *(ushort *)(unaff_x19 + 0x50);
    *(undefined2 *)(unaff_x19 + 0x52) = unaff_w25;
    *(undefined2 *)(unaff_x19 + 0x50) = unaff_w26;
    if (uVar3 < uVar2) goto LAB_006ef144;
  }
  pcVar9 = *(code **)(*(long *)(unaff_x19 + 0x18) + 0x518);
  if ((pcVar9 != (code *)0x0) && ((*pcVar9)(), *(char *)(unaff_x19 + 3) == '\x06')) {
    return 0;
  }
LAB_006ef144:
  uVar11 = unaff_x23 - unaff_x24;
  puVar1 = (undefined8 *)(*(long *)(unaff_x19 + 0x30) + unaff_x21);
  func_0x006ef974();
  if (iVar4 - 2U < 2) {
    uVar6 = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -0x10);
    puVar1[1] = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -8);
    *puVar1 = uVar6;
  }
  else if ((iVar4 == 5) || (iVar4 == 4)) {
    uVar6 = func_0x006f6ef8();
    *puVar1 = uVar6;
    *(undefined4 *)((long)puVar1 + 0xc) = 5;
  }
  lVar10 = *(long *)(unaff_x19 + 0x40);
  uVar6 = *(undefined8 *)(lVar10 + uVar11);
  *(ulong *)(unaff_x19 + 0x20) = lVar10 + uVar11;
  *(undefined8 **)(unaff_x19 + 8) = puVar1 + 2;
  *(undefined8 *)(unaff_x19 + 0x10) = uVar6;
  if ((20000 < *(int *)(unaff_x19 + 0x4c)) && ((int)(uVar11 >> 3) * -0x33333333 < 19999)) {
    lVar7 = func_0x006f3d14();
    *(undefined4 *)(unaff_x19 + 0x4c) = 20000;
    *(long *)(unaff_x19 + 0x20) = lVar7 + (*(long *)(unaff_x19 + 0x20) - lVar10);
    *(undefined **)(unaff_x19 + 0x38) = &UNK_000c34d8 + lVar7;
    *(long *)(unaff_x19 + 0x40) = lVar7;
  }
  return unaff_w20;
}

