
void FUN_006c7f0c(undefined8 *param_1)

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong uVar4;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000028;
  undefined8 *puStack0000000000000030;
  undefined8 *puStack0000000000000038;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  puStack0000000000000030 = param_1 + 2;
  param_1[1] = in_stack_00000018;
  *param_1 = in_stack_00000010;
  _uStack0000000000000028 = param_1;
  puStack0000000000000038 = puStack0000000000000030;
  func_0x006ca640(&uStack0000000000000028);
  uVar1 = *(int *)((long)unaff_x19 + 0x484) +
          (int)((ulong)((long)puStack0000000000000030 - (long)_uStack0000000000000028) >> 3);
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
  if (puStack0000000000000030 != _uStack0000000000000028) {
    uVar4 = 0;
    do {
      func_0x006c6028();
      uVar4 = uVar4 + 1;
    } while (uVar4 < (ulong)((long)puStack0000000000000030 - (long)_uStack0000000000000028 >> 3));
  }
  func_0x006b1ccc(*unaff_x19,0x31);
  if (_uStack0000000000000028 != (undefined8 *)0x0) {
    puStack0000000000000030 = _uStack0000000000000028;
    __ZdlPv();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

