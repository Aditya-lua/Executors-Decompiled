
void FUN_007310c0(undefined8 param_1,long param_2,long param_3)

{
  long in_x9;
  
  while( true ) {
    *(undefined8 *)(param_3 + 0x18) = *(undefined8 *)(param_2 + 0x18);
    *(undefined4 *)(param_3 + 0x20) = *(undefined4 *)(param_2 + 0x20);
    param_3 = *(long *)(param_3 + 8);
    if (param_3 == 0) break;
    in_x9 = param_3;
  }
  *(undefined8 *)(in_x9 + 8) = param_1;
  return;
}

