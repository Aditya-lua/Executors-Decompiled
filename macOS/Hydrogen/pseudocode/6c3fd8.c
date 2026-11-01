
void FUN_006c3fd8(ulong param_1,undefined8 param_2,long param_3)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  code *pcVar4;
  long in_x9;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  ulong uVar5;
  ulong uVar6;
  undefined8 *unaff_x19;
  long unaff_x20;
  long in_stack_00000050;
  undefined4 in_stack_00000058;
  
  uVar5 = param_1 >> 4 ^ param_1 >> 9;
  do {
    uVar5 = uVar5 & in_x12 - 1U;
    uVar6 = *(ulong *)(in_x9 + uVar5 * 0x18);
    if (uVar6 == param_1) {
      if (*(char *)(in_x9 + uVar5 * 0x18 + 9) != '\0') {
        iVar3 = *(int *)((long)unaff_x19 + 0xc);
        goto joined_r0x006c40e0;
      }
      break;
    }
    in_x11 = in_x11 + 1;
    uVar5 = in_x11 + uVar5;
  } while (uVar6 != in_x10 && in_x11 <= in_x12 - 1U);
  uVar1 = *(int *)((long)unaff_x19 + 0x484) + 1;
  if (0xff < uVar1) {
    func_0x006bc388(param_3 + 0xc,
                    "Out of registers when trying to allocate %d registers: exceeded limit %d");
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x6c4144);
    (*pcVar4)();
  }
  *(uint *)((long)unaff_x19 + 0x484) = uVar1;
  uVar2 = *(uint *)(unaff_x19 + 0x91);
  if (*(uint *)(unaff_x19 + 0x91) <= uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(unaff_x19 + 0x91) = uVar2;
  func_0x006c6028();
  iVar3 = *(int *)((long)unaff_x19 + 0xc);
joined_r0x006c40e0:
  if (0 < iVar3) {
    func_0x006b2e98(*unaff_x19,*(int *)(**(long **)(unaff_x20 + 0x20) + 0xc) + 1);
  }
  func_0x006ca134();
  *(undefined4 *)(in_stack_00000050 + 0x484) = in_stack_00000058;
  return;
}

