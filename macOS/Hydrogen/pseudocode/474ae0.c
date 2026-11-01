
void FUN_00474ae0(long param_1,ulong param_2,undefined8 param_3)

{
  uint uVar1;
  undefined1 uVar2;
  undefined1 in_CY;
  long lVar3;
  long in_x9;
  uint in_w11;
  ulong in_x12;
  long in_x13;
  int in_w14;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    uVar2 = (char)in_w11;
    if ((bool)in_CY) {
      uVar2 = (char)in_w14;
    }
    *(undefined1 *)(in_x13 + 0x7f) = uVar2;
    lVar3 = param_1 + -1;
    if (param_2 < 0x10) break;
    uVar1 = (uint)in_x12 & 0xf;
    in_w11 = (uint)in_x12 & 0xf | 0x30;
    in_x13 = in_x9 + lVar3;
    in_w14 = uVar1 + 0x37;
    in_CY = 9 < uVar1;
    param_2 = in_x12;
    param_1 = lVar3;
    in_x12 = in_x12 >> 4;
  }
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack000000000000007f + param_1,-lVar3);
  return;
}

