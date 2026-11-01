
void FUN_0063198c(void)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  
  lVar1 = unaff_x19[1];
  lVar2 = unaff_x20;
  if (lVar1 != unaff_x20) {
    do {
      lVar1 = func_0x00650db0(lVar1 + -0x80);
    } while (lVar1 != unaff_x20);
    lVar2 = *unaff_x19;
  }
  unaff_x19[1] = unaff_x20;
  __ZdlPv(lVar2);
  return;
}

