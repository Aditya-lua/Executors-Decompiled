
undefined8 FUN_007a93d8(void)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  long unaff_x23;
  
  if (unaff_x23 != 0) {
    uVar2 = unaff_x23 * 4 + 0xbU & 0xfffffffffffffff8;
    lVar1 = unaff_x23 + uVar2 + 9;
    if (lVar1 != 0) {
      func_0x00187bd4(in_x9 - uVar2,lVar1,8);
    }
  }
  return 0x8000000000000001;
}

