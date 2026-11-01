
long FUN_0064ae78(undefined8 param_1,undefined8 param_2,undefined1 param_3,ulong param_4)

{
  uint uVar1;
  bool in_ZR;
  bool in_CY;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  long extraout_x1;
  long lVar5;
  ulong uVar6;
  uint uVar7;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x24;
  long unaff_x25;
  long lVar8;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  
  if (!in_CY || in_ZR) {
    lVar3 = __Znwm(unaff_x25 * 0x70);
    in_stack_00000020 = lVar3 + unaff_x24 * 0x70;
    in_stack_00000030 = lVar3 + unaff_x25 * 0x70;
    uStack0000000000000018 = lVar3;
    in_stack_00000028 = in_stack_00000020;
    func_0x005fe0b4(in_stack_00000020);
    func_0x005fe0b4(lVar3 + unaff_x24 * 0x70 + 0x30,unaff_x20 + 0x30);
    lVar3 = lVar3 + unaff_x24 * 0x70;
    uVar4 = *(undefined8 *)(unaff_x20 + 0x60);
    *(undefined8 *)(lVar3 + 0x68) = *(undefined8 *)(unaff_x20 + 0x68);
    *(undefined8 *)(lVar3 + 0x60) = uVar4;
    in_stack_00000028 = in_stack_00000028 + 0x70;
    func_0x0064aa98();
    lVar3 = in_stack_00000028;
    lVar5 = unaff_x19[2];
    lVar8 = unaff_x19[1];
    uStack0000000000000018 = *unaff_x19;
    *unaff_x19 = extraout_x1;
    unaff_x19[2] = in_stack_00000030;
    unaff_x19[1] = in_stack_00000028;
    in_stack_00000020 = uStack0000000000000018;
    in_stack_00000028 = lVar8;
    in_stack_00000030 = lVar5;
    func_0x0064ad04(&uStack0000000000000018,uStack0000000000000018);
    if (uStack0000000000000018 != 0) {
      __ZdlPv();
    }
    return lVar3;
  }
  uVar4 = func_0x00017514();
  *unaff_x22 = &UNK_009f5d60;
  lVar3 = unaff_x22[4];
  uVar6 = unaff_x22[2];
  if ((ulong)unaff_x22[3] <= (ulong)unaff_x22[2]) {
    uVar6 = unaff_x22[3];
  }
  if (lVar3 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  func_0x0064aa64(&uStack0000000000000018);
  lVar3 = __Unwind_Resume(uVar4);
  func_0x005fe0b4();
  uVar4 = func_0x00604ce4();
  func_0x005fe0b4(lVar3 + 0x30,uVar4);
  *(undefined4 *)(lVar3 + 100) = 0;
  *(undefined4 *)(lVar3 + 0x68) = 0;
  *(int *)(lVar3 + 0x60) = (int)param_4;
  *(undefined1 *)(lVar3 + 0x6c) = param_3;
  *(undefined2 *)(lVar3 + 0x6d) = 0x100;
  *(undefined1 *)(lVar3 + 0x6f) = 0;
  if ((int)param_4 == 0) {
    uVar2 = func_0x00602288(lVar3);
    uVar7 = 6;
    if (0x59a < uVar2) {
      uVar7 = 7;
    }
    uVar1 = 5;
    if (0x21b < uVar2) {
      uVar1 = uVar7;
    }
    uVar7 = 4;
    if (0xc5 < uVar2) {
      uVar7 = uVar1;
    }
    uVar1 = 3;
    if (0x46 < uVar2) {
      uVar1 = uVar7;
    }
    uVar7 = 2;
    if (0x18 < uVar2) {
      uVar7 = uVar1;
    }
    uVar1 = 1;
    if (0x11 < uVar2) {
      uVar1 = uVar7;
    }
    param_4 = (ulong)uVar1;
    *(uint *)(lVar3 + 0x60) = uVar1;
  }
  func_0x006075d4(lVar3 + 0x30,param_4 & 0xffffffff);
  return lVar3;
}

