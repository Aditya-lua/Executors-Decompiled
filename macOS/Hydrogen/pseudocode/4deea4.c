
void FUN_004deea4(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  func_0x005201e0(param_1,&uStack0000000000000010);
  if (uStack0000000000000018 != -0x8000000000000000) {
LAB_004def50:
    *unaff_x19 = uStack0000000000000018;
    unaff_x19[2] = in_stack_00000028;
    unaff_x19[1] = in_stack_00000020;
    return;
  }
  if ((*unaff_x21 != 0) && (*(long *)(unaff_x20 + 0x20) != 0)) {
    func_0x00187bd4(*unaff_x21,*(long *)(unaff_x20 + 0x20) << 4,8);
  }
  *(undefined8 *)(unaff_x20 + 0x10) = 0;
  lVar3 = *(long *)(unaff_x20 + 0x30);
  if (lVar3 != 0) {
    puVar4 = *(undefined8 **)(unaff_x20 + 0x48);
    puVar5 = *(undefined8 **)(unaff_x20 + 0x38);
    if (puVar5 != puVar4) {
      do {
        puVar6 = puVar5 + 2;
        uVar1 = *puVar5;
        uVar2 = puVar5[1];
        *(undefined8 **)(unaff_x20 + 0x38) = puVar6;
        func_0x00521640(&uStack0000000000000018,&uStack0000000000000010,uVar1,uVar2);
        if (uStack0000000000000018 != -0x8000000000000000) goto LAB_004def50;
        puVar5 = puVar6;
      } while (puVar6 != puVar4);
      lVar3 = *(long *)(unaff_x20 + 0x30);
      if (lVar3 == 0) goto LAB_004def40;
    }
    if (*(long *)(unaff_x20 + 0x40) != 0) {
      func_0x00187bd4(lVar3,*(long *)(unaff_x20 + 0x40) << 4,8);
    }
  }
LAB_004def40:
  *(undefined8 *)(unaff_x20 + 0x30) = 0;
  *unaff_x19 = -0x8000000000000000;
  return;
}

