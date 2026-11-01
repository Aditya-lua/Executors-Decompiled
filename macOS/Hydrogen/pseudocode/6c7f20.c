
void FUN_006c7f20(void)

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong uVar4;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  func_0x006ca640();
  uVar1 = *(int *)((long)unaff_x19 + 0x484) +
          (int)((ulong)(in_stack_00000030 - in_stack_00000028) >> 3);
  if (0xff < uVar1) {
    func_0x006bc388(unaff_x20 + 0xc,
                    "Out of registers when trying to allocate %d registers: exceeded limit %d");
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x6c832c);
    (*pcVar3)();
  }
  *(uint *)((long)unaff_x19 + 0x484) = uVar1;
  uVar2 = *(uint *)(unaff_x19 + 0x91);
  if (*(uint *)(unaff_x19 + 0x91) <= uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(unaff_x19 + 0x91) = uVar2;
  if (in_stack_00000030 != in_stack_00000028) {
    uVar4 = 0;
    do {
      func_0x006c6028();
      uVar4 = uVar4 + 1;
    } while (uVar4 < (ulong)(in_stack_00000030 - in_stack_00000028 >> 3));
  }
  func_0x006b1ccc(*unaff_x19,0x31);
  if (in_stack_00000028 != 0) {
    __ZdlPv();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

