
long FUN_000dd5c8(code *param_1)

{
  int iVar1;
  long lVar2;
  long unaff_x19;
  long *unaff_x20;
  int *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    (*param_1)();
    unaff_x23 = unaff_x23 + -0x48;
    if (unaff_x23 == 0) break;
    param_1 = *(code **)(unaff_x22 + 0x80);
    unaff_x22 = unaff_x22 + 0x48;
  }
  if (unaff_x20 != (long *)0x0) {
    iVar1 = 0;
    if (*unaff_x21 != 0) {
      iVar1 = *unaff_x21 + -1;
    }
    *unaff_x20 = (long)iVar1;
  }
  lVar2 = 0xa334c8;
  if (*(long *)(&UNK_00005f68 + unaff_x19) != 0) {
    lVar2 = *(long *)(&UNK_00005f68 + unaff_x19);
  }
  return lVar2;
}

