
void FUN_0068cae0(void)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  int unaff_w21;
  long unaff_x23;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  undefined1 uStack0000000000000098;
  
  func_0x005fe0b4();
  if (unaff_w21 != 1) {
    uVar6 = (ulong)(unaff_w21 - 2);
    do {
      iVar3 = func_0x005ffe3c();
      if (iVar3 == 0) {
        uVar4 = func_0x0060d480(&uStack0000000000000098,unaff_x29 + -0x70,&uStack0000000000000008);
        uVar4 = func_0x0060c51c(&uStack0000000000000098,uVar4,&uStack0000000000000068);
        func_0x005ffccc(&uStack0000000000000008,uVar4);
        uVar4 = func_0x0060d52c(&uStack0000000000000098,unaff_x29 + -0x70);
        uVar4 = func_0x0060c51c(&uStack0000000000000098,uVar4,&uStack0000000000000038);
        puVar5 = (undefined8 *)(unaff_x29 + -0x70);
      }
      else {
        uVar4 = func_0x0060d480(&uStack0000000000000098,unaff_x29 + -0x70,&uStack0000000000000008);
        uVar4 = func_0x0060c51c(&uStack0000000000000098,uVar4,&uStack0000000000000068);
        func_0x005ffccc(unaff_x29 + -0x70,uVar4);
        uVar4 = func_0x0060d52c(&uStack0000000000000098,&uStack0000000000000008);
        uVar4 = func_0x0060c51c(&uStack0000000000000098,uVar4,&uStack0000000000000038);
        puVar5 = &uStack0000000000000008;
      }
      func_0x005ffccc(puVar5,uVar4);
      bVar2 = uVar6 != 0;
      uVar6 = uVar6 - 1;
    } while (bVar2);
  }
  func_0x0060cc90(&uStack0000000000000098,unaff_x29 + -0x70);
  lVar1 = unaff_x23 + 0x10;
  uVar6 = in_stack_00000018;
  if (in_stack_00000020 <= in_stack_00000018) {
    uVar6 = in_stack_00000020;
  }
  uStack0000000000000008 = lVar1;
  if (in_stack_00000028 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x70) = lVar1;
  lVar1 = *(long *)(unaff_x29 + -0x50);
  uVar6 = *(ulong *)(unaff_x29 + -0x60);
  if (*(ulong *)(unaff_x29 + -0x58) <= *(ulong *)(unaff_x29 + -0x60)) {
    uVar6 = *(ulong *)(unaff_x29 + -0x58);
  }
  if (lVar1 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  lVar1 = unaff_x23 + 0x10;
  uVar6 = in_stack_00000048;
  if (in_stack_00000050 <= in_stack_00000048) {
    uVar6 = in_stack_00000050;
  }
  uStack0000000000000038 = lVar1;
  if (in_stack_00000058 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  uVar6 = in_stack_00000078;
  if (in_stack_00000080 <= in_stack_00000078) {
    uVar6 = in_stack_00000080;
  }
  uStack0000000000000068 = lVar1;
  if (in_stack_00000088 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(in_stack_00000088 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  func_0x00610518(&uStack0000000000000098);
  return;
}

