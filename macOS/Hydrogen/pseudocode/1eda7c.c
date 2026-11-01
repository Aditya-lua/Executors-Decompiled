
void FUN_001eda7c(undefined8 param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  undefined8 in_x9;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  undefined1 unaff_w23;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000088;
  
  puVar1 = (undefined8 *)(unaff_x19 + unaff_x24);
  puVar1[5] = param_1;
  puVar1[4] = in_x9;
  puVar1[7] = CONCAT71(in_stack_00000088._1_7_,unaff_w23);
  puVar1[6] = unaff_x22;
  puVar1[1] = in_stack_00000058;
  *puVar1 = in_stack_00000050;
  puVar1[3] = param_1;
  puVar1[2] = in_stack_00000060;
  if (unaff_x25 == 1) {
    *in_stack_00000048 = unaff_x27 + 1;
    return;
  }
  uVar2 = *(long *)(unaff_x20 + unaff_x24 + 0x40) + unaff_x28;
  if (0x16 < uVar2) {
    uVar2 = unaff_x26;
  }
  uStack0000000000000068 = param_1;
  uStack0000000000000078 = param_1;
                    /* WARNING: Could not recover jumptable at 0x001ed13c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001ed140 + (ulong)*(ushort *)(&UNK_0081f748 + uVar2 * 2) * 4))();
  return;
}

