
void FUN_0058cfd0(undefined8 *param_1,undefined8 *param_2)

{
  uint in_w9;
  uint *in_x10;
  ulong in_x11;
  undefined4 in_w12;
  undefined4 in_register_00004064;
  uint *in_x13;
  uint in_w14;
  ulong in_x15;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  while( true ) {
    if (in_w14 == in_w9 || in_x11 == in_x15) {
      uVar1 = *param_2;
      uVar3 = param_2[3];
      uVar2 = param_2[2];
      param_1[1] = param_2[1];
      *param_1 = uVar1;
      param_1[3] = uVar3;
      param_1[2] = uVar2;
      *(undefined4 *)(param_1 + 4) = 0;
      *(ulong *)((long)param_1 + 0x24) =
           CONCAT44(in_register_00004064,in_w12) | (ulong)in_w14 << 0x20;
      return;
    }
    if (in_x13 == in_x10) break;
    in_w14 = *in_x13;
    in_x15 = (ulong)(byte)in_x13[1];
    in_x13 = in_x13 + 2;
    param_2[1] = in_x13;
  }
  *(undefined4 *)(param_1 + 1) = in_w12;
  *param_1 = 2;
  return;
}

