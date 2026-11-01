
ulong FUN_00617f88(undefined8 param_1,undefined8 param_2)

{
  char in_NG;
  char in_OV;
  long lVar1;
  ulong uVar2;
  long in_x9;
  long in_x10;
  long unaff_x19;
  
  if (in_NG == in_OV && (int)param_2 != -1) {
    _memset(*(long *)(unaff_x19 + 0x68) + in_x9,param_2,*(int *)(unaff_x19 + 0x40) - in_x10);
    *(undefined4 *)(unaff_x19 + 0x44) = *(undefined4 *)(unaff_x19 + 0x40);
  }
  lVar1 = func_0x0066ad70();
  if (lVar1 == 0) {
    *(undefined4 *)(unaff_x19 + 0x44) = 0;
    *(undefined4 *)(unaff_x19 + 0x48) = 0;
    return 0;
  }
  uVar2 = (long)*(int *)(unaff_x19 + 0x44) - *(long *)(unaff_x19 + 0x20);
  if (uVar2 < 2) {
    uVar2 = 1;
  }
  return uVar2;
}

