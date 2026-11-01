
ulong FUN_0067e464(void)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  code *pcVar5;
  long *unaff_x19;
  long *plVar6;
  long *unaff_x21;
  uint unaff_w26;
  ulong unaff_x27;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
  uVar3 = (**(code **)(*unaff_x19 + 0x70))();
  if (((uVar3 & 1) == 0) && (((unaff_w26 ^ 1) & 1) == 0)) {
    plVar6 = unaff_x19 + 1;
    if ((unaff_x27 & 1) == 0) {
      (**(code **)(*plVar6 + 0x88))(plVar6);
      pcVar5 = *(code **)(*unaff_x21 + 0x40);
    }
    else {
      pcVar5 = *(code **)(*plVar6 + 0x80);
    }
    (*pcVar5)(&uStack0000000000000060);
    uVar3 = (**(code **)(*plVar6 + 0xf8))(plVar6,&uStack0000000000000060);
    uStack0000000000000060 = &UNK_009f5d60;
    uVar4 = in_stack_00000070;
    if (in_stack_00000078 <= in_stack_00000070) {
      uVar4 = in_stack_00000078;
    }
    if (in_stack_00000080 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined8 *)(in_stack_00000080 + -8 + uVar4 * 8) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
  }
  else {
    iVar2 = (**(code **)(*unaff_x19 + 0xb0))();
    uVar1 = 0;
    if (iVar2 != 1) {
      uVar1 = unaff_w26;
    }
    uVar3 = (ulong)uVar1;
    if ((iVar2 == 1) && (((unaff_w26 ^ 1) & 1) == 0)) {
      iVar2 = func_0x0068c6f4();
      uVar3 = (ulong)(iVar2 == 1);
    }
  }
  return uVar3;
}

