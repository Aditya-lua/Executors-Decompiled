
void FUN_006c7f00(undefined1 param_1 [16])

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong uVar4;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000028;
  undefined8 *in_stack_00000030;
  undefined8 *in_stack_00000038;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  uStack0000000000000018 = param_1._8_8_;
  uStack0000000000000010 = param_1._0_8_;
  uStack0000000000000028 = (undefined8 *)__Znwm(0x10);
  in_stack_00000030 = uStack0000000000000028 + 2;
  uStack0000000000000028[1] = uStack0000000000000018;
  *uStack0000000000000028 = uStack0000000000000010;
  in_stack_00000038 = in_stack_00000030;
  func_0x006ca640(&uStack0000000000000028);
  uVar1 = *(int *)((long)unaff_x19 + 0x484) +
          (int)((ulong)((long)in_stack_00000030 - (long)uStack0000000000000028) >> 3);
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
  if (in_stack_00000030 != uStack0000000000000028) {
    uVar4 = 0;
    do {
      func_0x006c6028();
      uVar4 = uVar4 + 1;
    } while (uVar4 < (ulong)((long)in_stack_00000030 - (long)uStack0000000000000028 >> 3));
  }
  func_0x006b1ccc(*unaff_x19,0x31);
  if (uStack0000000000000028 != (undefined8 *)0x0) {
    in_stack_00000030 = uStack0000000000000028;
    __ZdlPv();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

