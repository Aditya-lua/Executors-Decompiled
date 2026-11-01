
void FUN_006e5dc4(undefined8 param_1)

{
  long unaff_x19;
  long unaff_x21;
  
  *(undefined8 *)(&UNK_00001560 + *(long *)(unaff_x19 + 0x18) + unaff_x21 * 8) = param_1;
  *(byte *)(*(long *)(&UNK_00001560 + *(long *)(unaff_x19 + 0x18) + unaff_x21 * 8) + 1) =
       *(byte *)(*(long *)(&UNK_00001560 + *(long *)(unaff_x19 + 0x18) + unaff_x21 * 8) + 1) | 8;
  return;
}

