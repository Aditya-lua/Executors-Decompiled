
undefined8 FUN_00760f7c(void)

{
  int iVar1;
  long lVar2;
  ulong unaff_x20;
  long unaff_x21;
  
  iVar1 = func_0x0077e6f8();
  if (iVar1 == 0) {
    iVar1 = func_0x0077e6f8();
    if (iVar1 == 0) {
      if ((unaff_x20 < 5) || (iVar1 = func_0x0077e6f8(unaff_x21 + -5,".html"), iVar1 == 0)) {
        iVar1 = func_0x0077e6f8();
        if (iVar1 == 0) {
          iVar1 = func_0x0077e6f8();
          if (iVar1 == 0) {
            return 0;
          }
          lVar2 = 9;
        }
        else {
          lVar2 = 8;
        }
      }
      else {
        lVar2 = 7;
      }
    }
    else {
      lVar2 = 6;
    }
  }
  else {
    lVar2 = 5;
  }
  return *(undefined8 *)(&UNK_00a1ee70 + lVar2 * 0x10);
}

