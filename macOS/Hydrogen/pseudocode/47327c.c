
void FUN_0047327c(long param_1,uint param_2,undefined8 param_3)

{
  undefined1 uVar1;
  undefined1 in_CY;
  long lVar2;
  long in_x9;
  uint in_w11;
  uint in_w12;
  long in_x13;
  int in_w14;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    uVar1 = (char)in_w11;
    if ((bool)in_CY) {
      uVar1 = (char)in_w14;
    }
    *(undefined1 *)(in_x13 + 0x7f) = uVar1;
    lVar2 = param_1 + -1;
    if (param_2 < 0x10) break;
    in_w11 = in_w12 & 0xf | 0x30;
    in_x13 = in_x9 + lVar2;
    in_w14 = (in_w12 & 0xf) + 0x37;
    in_CY = 9 < (in_w12 & 0xf);
    param_1 = lVar2;
    param_2 = in_w12;
    in_w12 = in_w12 >> 4;
  }
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack000000000000007f + param_1,-lVar2);
  return;
}

