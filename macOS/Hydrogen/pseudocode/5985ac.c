
undefined8 FUN_005985ac(void)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long unaff_x21;
  undefined8 unaff_x22;
  long lVar4;
  code *unaff_x23;
  long in_stack_00000000;
  long in_stack_00000008;
  undefined *in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000040;
  
  uVar1 = (*unaff_x23)();
  if ((uVar1 & 1) == 0) {
    lVar3 = *(long *)(unaff_x21 + 0x10);
    if (lVar3 != 0) {
      lVar2 = *(long *)(unaff_x21 + 8);
      lVar4 = lVar2 + lVar3 * 0x48;
      do {
        lVar3 = lVar3 + -1;
        in_stack_00000008 = lVar2 + 8;
        in_stack_00000010 = &UNK_009f1828;
        in_stack_00000018 = 2;
        in_stack_00000028 = 2;
        in_stack_00000030 = 0;
        in_stack_00000000 = lVar2;
        in_stack_00000020 = &uStack0000000000000040;
        uStack0000000000000040 = (undefined1 *)register0x00000008;
        uVar1 = func_0x0046849c();
        if (((uVar1 & 1) != 0) || ((lVar3 != 0 && (uVar1 = (*unaff_x23)(), (uVar1 & 1) != 0)))) {
          return 1;
        }
        lVar2 = lVar2 + 0x48;
      } while (lVar2 != lVar4);
    }
    unaff_x22 = 0;
  }
  return unaff_x22;
}

