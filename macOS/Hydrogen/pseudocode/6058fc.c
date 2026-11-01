
void FUN_006058fc(long param_1,long param_2)

{
  undefined8 uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long lVar2;
  
  while( true ) {
    *unaff_x19 = param_1;
    unaff_x24 = unaff_x24 - 1;
    if (unaff_x26 == 0) break;
    unaff_x26 = unaff_x24 & 0xffffffff;
    lVar2 = unaff_x26 * 8;
    uVar1 = func_0x00479b20(*(undefined8 *)(unaff_x23 + lVar2));
    *(undefined8 *)(unaff_x25 + lVar2) = uVar1;
    param_1 = func_0x00479af8(*(undefined8 *)(unaff_x23 + lVar2),*unaff_x19);
    param_2 = param_1;
  }
  if (*(int *)(unaff_x20 + 0x28) == 1) {
    *(undefined4 *)(unaff_x21 + 0x28) = 1;
    if (param_2 != 0) {
      func_0x00605d50();
      *unaff_x19 = unaff_x22 - *unaff_x19;
    }
  }
  else {
    *(undefined4 *)(unaff_x21 + 0x28) = 0;
  }
  return;
}

