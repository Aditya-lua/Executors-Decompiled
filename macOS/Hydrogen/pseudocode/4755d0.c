
void FUN_004755d0(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  uint in_w9;
  long in_x10;
  uint in_w11;
  uint in_w12;
  long in_x13;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    *(char *)(in_x13 + 0x7f) = (char)in_w11;
    lVar1 = param_1 + -1;
    if (in_w9 < 8) break;
    in_w11 = in_w12 & 7 | 0x30;
    in_x13 = in_x10 + lVar1;
    param_1 = lVar1;
    in_w9 = in_w12;
    in_w12 = in_w12 >> 3;
  }
  func_0x00468684(param_3,1,&UNK_00893f25,2,&uStack000000000000007f + param_1,-lVar1);
  return;
}

