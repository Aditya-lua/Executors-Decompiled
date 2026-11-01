
void FUN_001a3694(ulong param_1)

{
  ulong *puVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  undefined8 *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  ulong in_stack_00000060;
  ulong in_stack_00000080;
  
  _memcpy();
  puVar1 = (ulong *)(unaff_x22 + unaff_x25);
  puVar1[1] = unaff_x26;
  *puVar1 = in_stack_00000060 & 0xffffffffffffff00;
  puVar1[3] = unaff_x27;
  puVar1[2] = param_1;
  puVar1[4] = in_stack_00000080;
  if ((unaff_x28 == unaff_x19) || (unaff_x20 == unaff_x25 + 0x28)) {
    in_stack_00000040[1] = in_stack_00000050;
    *in_stack_00000040 = in_stack_00000048;
    in_stack_00000040[2] = unaff_x28;
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001a3424. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001a33d8 +
            (ulong)(byte)(&UNK_0081d4c6)[*(byte *)(unaff_x24 + unaff_x25 + 0x28)] * 4))();
  return;
}

