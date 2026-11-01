
void FUN_004e515c(void)

{
  long lVar1;
  long unaff_x19;
  undefined8 *unaff_x20;
  
  do {
    lVar1 = unaff_x20[-1];
    if (lVar1 == -0x8000000000000000 || lVar1 == 0) {
      lVar1 = unaff_x20[-4];
    }
    else {
      func_0x00187bd4(*unaff_x20,lVar1,1);
      lVar1 = unaff_x20[-4];
    }
    if (lVar1 != 0) {
      func_0x00187bd4(unaff_x20[-3],lVar1 << 4,8);
    }
    unaff_x20 = unaff_x20 + 9;
    unaff_x19 = unaff_x19 + -1;
  } while (unaff_x19 != 0);
  return;
}

