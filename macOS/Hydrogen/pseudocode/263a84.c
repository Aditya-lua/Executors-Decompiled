
void FUN_00263a84(undefined8 *param_1,long param_2,uint param_3)

{
  long in_x9;
  ulong in_x10;
  uint in_w11;
  ulong in_x12;
  ulong in_x13;
  
  if ((CARRY8(in_x12,in_x13)) || (in_x10 < in_x13 + in_x12)) {
    *param_1 = 0x8000000000000000;
    *(undefined1 *)(param_1 + 1) = 0;
    *(undefined1 *)((long)param_1 + 0xf) = 0;
    *(undefined2 *)((long)param_1 + 0xd) = 0;
    *(undefined4 *)((long)param_1 + 9) = 0;
    return;
  }
  *(ulong *)(param_2 + 0x10) = in_x13 + in_x12;
  if ((param_3 & 0xff) == in_w11) {
    param_1[1] = in_x9 + in_x12;
    param_1[2] = in_x13;
    *param_1 = 0x800000000000002c;
    return;
  }
  *param_1 = 0x8000000000000000;
  return;
}

