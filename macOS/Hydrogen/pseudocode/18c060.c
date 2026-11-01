
void FUN_0018c060(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *pcVar4;
  int iVar5;
  long lVar6;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined *in_stack_00000048;
  undefined4 uStack0000000000000050;
  undefined4 uStack0000000000000054;
  
  while (unaff_x25 + unaff_x22 != 0) {
    lVar6 = _CFArrayGetValueAtIndex(*unaff_x26,unaff_x20 + unaff_x22);
    if (lVar6 == 0) {
      func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
LAB_0018c1b4:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x18c1b8);
      (*pcVar4)();
    }
    uStack0000000000000028 = 0;
    in_stack_00000030 = 1;
    in_stack_00000038 = 0;
    uStack0000000000000050 = 0xe0000020;
    uStack0000000000000054 = 0;
    uStack0000000000000040 = &uStack0000000000000028;
    in_stack_00000048 = &UNK_009c05d0;
    uStack0000000000000020 = lVar6;
    iVar5 = func_0x0019f594(&uStack0000000000000020,&uStack0000000000000040);
    uVar3 = in_stack_00000038;
    uVar2 = in_stack_00000030;
    lVar6 = uStack0000000000000028;
    if (iVar5 != 0) {
      func_0x007a2810(&UNK_00819a98,0x37,unaff_x29 + -0x51,&UNK_009c0618,&UNK_009c0600);
      goto LAB_0018c1b4;
    }
    if (uStack0000000000000028 == -0x8000000000000000) break;
    if (unaff_x22 == uStack0000000000000008) {
      func_0x0079ab9c(&uStack0000000000000008,unaff_x22,1,8,0x18);
      unaff_x21 = in_stack_00000010;
    }
    lVar1 = unaff_x21 + unaff_x27;
    *(long *)(lVar1 + 0x18) = lVar6;
    *(undefined8 *)(lVar1 + 0x20) = uVar2;
    *(undefined8 *)(lVar1 + 0x28) = uVar3;
    unaff_x27 = unaff_x27 + 0x18;
    unaff_x22 = unaff_x22 + 1;
    in_stack_00000018 = unaff_x22;
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

