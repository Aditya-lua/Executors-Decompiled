
undefined8 FUN_00775ea8(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  bool in_CY;
  undefined8 in_x9;
  
  if (in_CY) {
    *(long *)(param_1 + 0x20) = *(long *)(param_1 + 0x20) + param_4;
    *(undefined8 *)(param_1 + 0x28) = in_x9;
    return 0;
  }
  return 0x1a;
}

