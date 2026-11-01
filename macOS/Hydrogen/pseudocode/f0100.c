
void FUN_000f0100(void)

{
  undefined8 *puVar1;
  int *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined4 unaff_w22;
  undefined4 unaff_w23;
  int unaff_w24;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  
  func_0x000b83d4();
  *(long *)(unaff_x19 + 2) = unaff_x20;
  unaff_x19[1] = unaff_w24;
  puVar1 = (undefined8 *)(unaff_x20 + (long)*unaff_x19 * 0x38);
  puVar1[1] = in_stack_00000008;
  *puVar1 = in_stack_00000000;
  puVar1[2] = unaff_x21;
  *(undefined4 *)(puVar1 + 3) = unaff_w22;
  *(undefined4 *)((long)puVar1 + 0x1c) = unaff_w23;
  puVar1[5] = 0;
  puVar1[6] = 0;
  puVar1[4] = 0;
  *unaff_x19 = *unaff_x19 + 1;
  return;
}

