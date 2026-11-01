
void FUN_001ed46c(void)

{
  undefined8 *puVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  puVar1 = (undefined8 *)(unaff_x19 + unaff_x24);
  puVar1[5] = in_stack_00000078;
  puVar1[4] = in_stack_00000070;
  puVar1[7] = in_stack_00000088;
  puVar1[6] = in_stack_00000080;
  puVar1[1] = in_stack_00000058;
  *puVar1 = in_stack_00000050;
  puVar1[3] = in_stack_00000068;
  puVar1[2] = in_stack_00000060;
  if (unaff_x25 == 1) {
    *in_stack_00000048 = unaff_x27 + 1;
    return;
  }
  uVar2 = *(long *)(unaff_x20 + unaff_x24 + 0x40) + unaff_x28;
  if (0x16 < uVar2) {
    uVar2 = unaff_x26;
  }
                    /* WARNING: Could not recover jumptable at 0x001ed13c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001ed140 + (ulong)*(ushort *)(&UNK_0081f748 + uVar2 * 2) * 4))();
  return;
}

