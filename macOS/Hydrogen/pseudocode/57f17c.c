
void FUN_0057f17c(long param_1)

{
  undefined4 *puVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  undefined4 unaff_w23;
  undefined4 unaff_w24;
  
  if (unaff_x20 == param_1) {
    func_0x005bd21c(unaff_x19 + 0x18,&UNK_009f0588);
  }
  puVar1 = (undefined4 *)(*(long *)(unaff_x19 + 0x20) + unaff_x20 * 0x10);
  *puVar1 = unaff_w23;
  puVar1[1] = unaff_w24;
  *(ulong *)(puVar1 + 2) = unaff_x22 | unaff_x21 << 0x20;
  *(long *)(unaff_x19 + 0x28) = unaff_x20 + 1;
  return;
}

