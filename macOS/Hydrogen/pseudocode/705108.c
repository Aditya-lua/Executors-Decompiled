
void FUN_00705108(long param_1)

{
  undefined1 in_w9;
  long in_x10;
  
  *(undefined1 *)(param_1 + 0xb70) = in_w9;
  iRam0000000000a27b68 = *(int *)(in_x10 + 0x700) + 1;
  *(int *)(in_x10 + 0x700) = iRam0000000000a27b68;
  return;
}

