
void FUN_00406af8(long param_1,undefined1 *param_2,long *param_3)

{
  ulong in_x9;
  ulong unaff_x19;
  
  if (in_x9 < unaff_x19) {
    *param_2 = 0x13;
    *(long *)(param_2 + 8) = param_1;
  }
  else {
    *param_3 = param_1 + unaff_x19;
    param_3[1] = in_x9 - unaff_x19;
    *param_2 = 0x4f;
  }
  return;
}

