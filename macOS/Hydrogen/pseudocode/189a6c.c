
undefined8 FUN_00189a6c(long param_1,long param_2,byte param_3)

{
  byte in_w9;
  undefined1 in_w10;
  long unaff_x19;
  long unaff_x20;
  
  *(undefined1 *)(param_1 + 1) = in_w10;
  *(byte *)(param_1 + 2) = in_w9 & 0xc0 | param_3 & 0x3f;
  *(long *)(param_2 + 0x10) = unaff_x20 + unaff_x19;
  return 0;
}

