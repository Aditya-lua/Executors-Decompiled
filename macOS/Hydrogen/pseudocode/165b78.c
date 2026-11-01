
void FUN_00165b78(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  undefined8 *puVar3;
  long unaff_x26;
  long unaff_x29;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined1 auVar8 [16];
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000130;
  
  iVar1 = func_0x002dae38();
  if (iVar1 == 1) {
    auVar8 = func_0x00271418();
    if ((auVar8._0_8_ & 1) != 0) goto LAB_00165b94;
    iVar1 = func_0x002dae90();
    if (iVar1 == 1) {
      *(undefined8 *)(unaff_x29 + -0x58) = 0x42;
      puVar3 = &uStack0000000000000130;
      iVar1 = func_0x002db0bc();
      if (iVar1 != 1) {
        puVar3 = (undefined8 *)0x0;
      }
    }
    else {
      puVar3 = (undefined8 *)0x0;
    }
    func_0x002d8de8(auVar8._8_8_);
    func_0x002d8d08();
    if (puVar3 != (undefined8 *)0x0) {
      func_0x001650e4(unaff_x29 + -0x8f);
      uVar4 = *(undefined8 *)(unaff_x29 + -0x67);
      uVar2 = *(undefined8 *)(unaff_x29 + -0x6f);
      uVar6 = *(undefined8 *)(unaff_x29 + -0x77);
      uVar5 = *(undefined8 *)(unaff_x29 + -0x7f);
      uVar7 = *(undefined8 *)(unaff_x29 + -0x8f);
      unaff_x19[2] = *(undefined8 *)(unaff_x29 + -0x87);
      unaff_x19[1] = uVar7;
      unaff_x19[4] = uVar6;
      unaff_x19[3] = uVar5;
      unaff_x19[6] = uVar4;
      unaff_x19[5] = uVar2;
      uVar2 = 0x8000000000000027;
      goto LAB_00165c90;
    }
  }
  else {
LAB_00165b94:
    func_0x002d8d08();
  }
  func_0x00226b78(&uStack0000000000000130);
  uVar4 = *(undefined8 *)(unaff_x26 + 0x30);
  uVar2 = *(undefined8 *)(unaff_x26 + 0x28);
  uVar6 = *(undefined8 *)(unaff_x26 + 0x20);
  uVar5 = *(undefined8 *)(unaff_x26 + 0x18);
  uVar7 = *(undefined8 *)(unaff_x26 + 8);
  unaff_x19[2] = *(undefined8 *)(unaff_x26 + 0x10);
  unaff_x19[1] = uVar7;
  unaff_x19[4] = uVar6;
  unaff_x19[3] = uVar5;
  unaff_x19[6] = uVar4;
  unaff_x19[5] = uVar2;
  uVar2 = uStack0000000000000130;
LAB_00165c90:
  *unaff_x19 = uVar2;
  if (*(long *)(unaff_x29 + -0xa8) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xa0),*(long *)(unaff_x29 + -0xa8),1);
  }
  func_0x002d8de8(in_stack_00000018);
  func_0x002d8de8(in_stack_00000008);
  return;
}

