
void FUN_006c7f38(long param_1)

{
  uint uVar1;
  code *pcVar2;
  long in_x10;
  uint in_w12;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong uVar3;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  if (0xff < in_w12) {
    func_0x006bc388(unaff_x20 + 0xc,
                    "Out of registers when trying to allocate %d registers: exceeded limit %d");
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x6c832c);
    (*pcVar2)();
  }
  *(uint *)((long)unaff_x19 + 0x484) = in_w12;
  uVar1 = *(uint *)(unaff_x19 + 0x91);
  if (*(uint *)(unaff_x19 + 0x91) <= in_w12) {
    uVar1 = in_w12;
  }
  *(uint *)(unaff_x19 + 0x91) = uVar1;
  if (in_x10 != param_1) {
    uVar3 = 0;
    do {
      func_0x006c6028();
      uVar3 = uVar3 + 1;
    } while (uVar3 < (ulong)(in_stack_00000030 - in_stack_00000028 >> 3));
  }
  func_0x006b1ccc(*unaff_x19,0x31);
  if (in_stack_00000028 != 0) {
    __ZdlPv();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

