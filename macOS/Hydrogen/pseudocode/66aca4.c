
undefined8 FUN_0066aca4(code *param_1)

{
  ulong uVar1;
  long unaff_x19;
  undefined4 unaff_w20;
  
  uVar1 = (*param_1)();
  if ((uVar1 & 1) == 0) {
    *(undefined4 *)(unaff_x19 + 0x28) = 0;
    return 0;
  }
  *(undefined4 *)(unaff_x19 + 0x28) = unaff_w20;
  return 1;
}

