
void FUN_004e519c(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  
  while( true ) {
    if (param_1 != 0) {
      func_0x00187bd4(unaff_x20[-3],param_1 << 4,8);
    }
    puVar1 = unaff_x20 + 9;
    unaff_x19 = unaff_x19 + -1;
    if (unaff_x19 == 0) break;
    lVar2 = unaff_x20[8];
    if (lVar2 == unaff_x21 || lVar2 == 0) {
      param_1 = unaff_x20[5];
      unaff_x20 = puVar1;
    }
    else {
      func_0x00187bd4(*puVar1,lVar2,1);
      param_1 = unaff_x20[5];
      unaff_x20 = puVar1;
    }
  }
  return;
}

