
void FUN_0051f2e8(void)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  long unaff_x19;
  long lVar4;
  long unaff_x21;
  long *plVar6;
  long *plVar5;
  long lVar7;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  undefined8 *unaff_x27;
  long *in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000028;
  long *in_stack_00000030;
  long in_stack_00000038;
  
code_r0x0051f2e8:
  plVar5 = unaff_x25;
  do {
    plVar6 = plVar5 + 1;
    lVar3 = *(long *)(*plVar5 + 0x90);
    if (lVar3 != 0) {
      lVar4 = *(long *)(*plVar5 + 0x88);
      lVar7 = unaff_x27[1];
      lVar3 = lVar3 * 600;
      do {
        if ((*(long *)(lVar4 + 0x220) == lVar7) &&
           (iVar2 = _memcmp(*(undefined8 *)(lVar4 + 0x218),*unaff_x27,lVar7), iVar2 == 0))
        goto code_r0x0051f348;
        lVar4 = lVar4 + 600;
        lVar3 = lVar3 + -600;
      } while (lVar3 != 0);
    }
    plVar5 = plVar6;
  } while (plVar6 != unaff_x25 + unaff_x21);
  goto LAB_0051f390;
code_r0x0051f348:
  if (uStack0000000000000028 != 0) {
    func_0x00187bd4(unaff_x25,uStack0000000000000028 << 3,8);
  }
  *(long *)(in_stack_00000010 + unaff_x24 * 8) = lVar4;
  unaff_x24 = unaff_x24 + 1;
  unaff_x26 = unaff_x26 + 1;
  if (unaff_x26 == in_stack_00000008) {
    *in_stack_00000000 = unaff_x24;
    return;
  }
  lVar4 = *(long *)(unaff_x19 + 0x88);
  lVar3 = *(long *)(unaff_x19 + 0x90);
  func_0x004ffcac(&uStack0000000000000028);
  unaff_x21 = in_stack_00000038;
  unaff_x25 = in_stack_00000030;
  unaff_x27 = (undefined8 *)(in_stack_00000018 + unaff_x26 * 0x10);
  if (lVar3 == 0) goto code_r0x0051f2e4;
  lVar7 = unaff_x27[1];
  lVar3 = lVar3 * 600;
  while ((*(long *)(lVar4 + 0x220) != lVar7 ||
         (iVar2 = _memcmp(*(undefined8 *)(lVar4 + 0x218),*unaff_x27,lVar7), iVar2 != 0))) {
    lVar4 = lVar4 + 600;
    lVar3 = lVar3 + -600;
    if (lVar3 == 0) goto code_r0x0051f2e4;
  }
  goto code_r0x0051f348;
code_r0x0051f2e4:
  if (unaff_x21 == 0) {
LAB_0051f390:
    func_0x007a23d8(&UNK_008a76bd,0x58,&UNK_009ea3e8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x51f3ac);
    (*pcVar1)();
  }
  goto code_r0x0051f2e8;
}

