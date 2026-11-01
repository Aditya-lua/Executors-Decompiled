
void FUN_002534b8(void)

{
  code *pcVar1;
  long lVar2;
  long unaff_x21;
  long unaff_x22;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_000006f0;
  undefined8 in_stack_000006f8;
  undefined8 in_stack_00000700;
  undefined8 in_stack_00000708;
  undefined8 in_stack_00000a98;
  undefined1 auStack_7ffffffe [2147483646];
  
  _memcpy(auStack_7ffffffe + 0x80000a9e,&uStack0000000000000008,0x340);
  lVar2 = func_0x00187bd0(0x280,8);
  if (lVar2 == 0) {
    func_0x007a1f00(8,0x280,&UNK_009c29a8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x253674);
    (*pcVar1)();
  }
  *(undefined8 *)(unaff_x21 + 0x380) = 0;
  *(undefined8 *)(unaff_x21 + 0x378) = 0;
  *(undefined8 *)(unaff_x21 + 0x3b8) = in_stack_00000a98;
  uVar3 = *(undefined8 *)(unaff_x22 + 0x6e0);
  uVar5 = *(undefined8 *)(unaff_x22 + 0x6f8);
  uVar4 = *(undefined8 *)(unaff_x22 + 0x6f0);
  *(undefined8 *)(unaff_x21 + 0x390) = *(undefined8 *)(unaff_x22 + 0x6e8);
  *(undefined8 *)(unaff_x21 + 0x388) = uVar3;
  *(undefined8 *)(unaff_x21 + 0x3a0) = uVar5;
  *(undefined8 *)(unaff_x21 + 0x398) = uVar4;
  uVar3 = *(undefined8 *)(unaff_x22 + 0x700);
  *(undefined8 *)(unaff_x21 + 0x3b0) = *(undefined8 *)(unaff_x22 + 0x708);
  *(undefined8 *)(unaff_x21 + 0x3a8) = uVar3;
  *(undefined8 *)(unaff_x22 + 0x348) = in_stack_000006f8;
  *(undefined8 *)(unaff_x22 + 0x340) = in_stack_000006f0;
  *(undefined8 *)(unaff_x22 + 0x358) = in_stack_00000708;
  *(undefined8 *)(unaff_x22 + 0x350) = in_stack_00000700;
  _memcpy(auStack_7ffffffe + 0x80000386,auStack_7ffffffe + 0x8000071e,0x340);
  _memcpy();
  *(undefined8 *)(unaff_x21 + 0x368) = 0x10;
  *(long *)(unaff_x21 + 0x370) = lVar2;
  *(undefined1 *)(unaff_x21 + 0x3c0) = 0;
  return;
}

