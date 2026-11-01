
bool FUN_003f4514(undefined8 param_1,uint param_2)

{
  byte bVar1;
  bool in_CY;
  long lVar2;
  undefined8 *unaff_x19;
  long *plVar3;
  undefined8 uStack0000000000000008;
  
  bVar1 = (byte)param_2;
  if (in_CY) {
    if (param_2 < 0x800) {
      uStack0000000000000008._4_1_ = (byte)(param_2 >> 6) | 0xc0;
      uStack0000000000000008._5_1_ = bVar1 & 0x3f | 0x80;
      lVar2 = func_0x0041db88(*unaff_x19,(long)&uStack0000000000000008 + 4,2);
    }
    else if (param_2 < 0x10000) {
      uStack0000000000000008._4_1_ = (byte)(param_2 >> 0xc) | 0xe0;
      uStack0000000000000008._5_1_ = (byte)(param_2 >> 6) & 0x3f | 0x80;
      uStack0000000000000008._6_1_ = bVar1 & 0x3f | 0x80;
      lVar2 = func_0x0041db88(*unaff_x19,(long)&uStack0000000000000008 + 4,3);
    }
    else {
      uStack0000000000000008._4_1_ = (byte)(param_2 >> 0x12) | 0xf0;
      uStack0000000000000008._5_1_ = (byte)(param_2 >> 0xc) & 0x3f | 0x80;
      uStack0000000000000008._6_1_ = (byte)(param_2 >> 6) & 0x3f | 0x80;
      uStack0000000000000008._7_1_ = bVar1 & 0x3f | 0x80;
      lVar2 = func_0x0041db88(*unaff_x19,(long)&uStack0000000000000008 + 4,4);
    }
  }
  else {
    uStack0000000000000008._4_1_ = bVar1;
    lVar2 = func_0x0041db88(*unaff_x19,(long)&uStack0000000000000008 + 4,1);
  }
  if (lVar2 != 0) {
    plVar3 = unaff_x19 + 1;
    if (*plVar3 != 0) {
      func_0x003f67e4(plVar3);
    }
    *plVar3 = lVar2;
  }
  return lVar2 != 0;
}

