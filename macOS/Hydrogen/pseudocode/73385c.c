
void FUN_0073385c(void)

{
  undefined8 *puVar1;
  int iVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  func_0x0073391c();
  if ((*(long *)(unaff_x21 + 0xd0) != 0) && (*(long *)(*(long *)(unaff_x21 + 0xd0) + 0x98) != 0)) {
    puVar1 = (undefined8 *)(unaff_x19 + 0x298);
    *(undefined8 *)(unaff_x19 + 0x2a0) = 0;
    *puVar1 = 0;
    *(undefined8 *)(unaff_x19 + 0x2b0) = 0;
    *(undefined8 *)(unaff_x19 + 0x2a8) = 0;
    uVar3 = *(undefined8 *)(unaff_x21 + 0xd0);
    uVar4 = *(undefined8 *)(unaff_x20 + 0x78);
    in_stack_00000018 = 0;
    uStack0000000000000010 = 0;
    in_stack_00000028 = 0;
    in_stack_00000020 = 0;
    func_0x00768a04(uVar4);
    func_0x007317f8(uVar4,&uStack0000000000000010);
    func_0x0076891c(uVar4);
    iVar2 = func_0x0076ab7c(uVar3,uVar4,&uStack0000000000000010,puVar1);
    if (iVar2 != 0) {
      func_0x0073391c();
      return;
    }
    *(undefined8 *)(unaff_x19 + 0x2a0) = in_stack_00000018;
    *puVar1 = uStack0000000000000010;
    *(undefined8 *)(unaff_x19 + 0x2b0) = in_stack_00000028;
    *(undefined8 *)(unaff_x19 + 0x2a8) = in_stack_00000020;
  }
  func_0x0075e474(unaff_x20 + 0x58);
  return;
}

