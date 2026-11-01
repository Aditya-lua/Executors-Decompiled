
void FUN_0018b92c(void)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  long unaff_x21;
  long unaff_x22;
  
  while( true ) {
    func_0x0019e6a4(unaff_x19);
    unaff_x21 = unaff_x21 + -1;
    if (unaff_x21 == 0) break;
    unaff_x19 = unaff_x22;
    unaff_x22 = unaff_x22 + 8;
  }
  __Unwind_Resume();
  lVar1 = func_0x007a2668();
  lVar2 = *(long *)(lVar1 + 0x10);
  if (lVar2 != 0) {
    lVar1 = *(long *)(lVar1 + 8);
    do {
      func_0x0018b0d4(lVar1);
      lVar1 = lVar1 + 0x68;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  return;
}

