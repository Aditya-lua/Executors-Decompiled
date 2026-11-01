
void FUN_007a54f8(long param_1)

{
  long lVar1;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long lStack0000000000000020;
  
  lStack0000000000000020 = param_1 + 0x39;
  uStack0000000000000008 = *(undefined8 *)(unaff_x21 + 0x10);
  uStack0000000000000000 = *(undefined8 *)(unaff_x21 + 8);
  if (unaff_x22 != -0x8000000000000000) {
    in_stack_00000010 = uStack0000000000000000;
    in_stack_00000018 = uStack0000000000000008;
  }
  lVar1 = *(long *)(unaff_x19 + 0x140);
  if ((lVar1 != -0x8000000000000000) && (lVar1 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x148),lVar1,1);
  }
  *(long *)(unaff_x19 + 0x140) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x150) = in_stack_00000018;
  *(undefined8 *)(unaff_x19 + 0x148) = in_stack_00000010;
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__memcpy_00a250b8)();
  return;
}

