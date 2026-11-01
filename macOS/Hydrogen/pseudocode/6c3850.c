
void FUN_006c3850(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined8 *unaff_x19;
  long unaff_x20;
  int unaff_w22;
  ulong uVar5;
  undefined1 unaff_w26;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  
  func_0x006bf744();
  if (0 < *(int *)((long)unaff_x19 + 0xc)) {
    func_0x006b2e98(*unaff_x19,*(int *)(unaff_x20 + 0xc) + 1);
  }
  func_0x006b2784(*unaff_x19);
  uVar3 = func_0x006b2784(*unaff_x19);
  func_0x006b1f78(*unaff_x19,0x3a,unaff_w26,0);
  func_0x006b24c4(*unaff_x19,*(uint *)(unaff_x20 + 0x28) | (uint)(unaff_w22 == 0x3b) << 0x1f);
  func_0x006b2784(*unaff_x19);
  iVar2 = func_0x006b2794(*unaff_x19);
  if ((iVar2 == 0) || (uVar4 = func_0x006b2794(*unaff_x19,uVar3), (uVar4 & 1) == 0)) {
    func_0x006bc388(unaff_x20 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6c3a24);
    (*pcVar1)();
  }
  uVar5 = in_stack_00000020 - in_stack_00000018 >> 4;
  func_0x006cb1e0();
  uVar4 = (long)(unaff_x19[0x9b] - unaff_x19[0x9a]) >> 4;
  if (uVar5 < uVar4 || uVar5 - uVar4 == 0) {
    if (uVar5 < uVar4) {
      unaff_x19[0x9b] = unaff_x19[0x9a] + uVar5 * 0x10;
    }
  }
  else {
    func_0x006cb2a8(unaff_x19 + 0x9a,uVar5 - uVar4);
  }
  unaff_x19[0x9e] = unaff_x19[0x9e] + -0x18;
  *(undefined4 *)((long)unaff_x19 + 0x484) = in_stack_00000028._4_4_;
  return;
}

