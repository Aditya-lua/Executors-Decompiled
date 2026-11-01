
undefined8 FUN_0077c948(void)

{
  int iVar1;
  undefined8 *unaff_x19;
  int unaff_w20;
  
  iVar1 = _fcntl();
  if (iVar1 == 0) {
    iVar1 = _fcntl(*(undefined4 *)((long)unaff_x19 + 4),2);
    if ((iVar1 == 0) &&
       ((unaff_w20 == 0 ||
        ((iVar1 = func_0x0076d02c(*(undefined4 *)unaff_x19,1), -1 < iVar1 &&
         (iVar1 = func_0x0076d02c(*(undefined4 *)((long)unaff_x19 + 4),1), -1 < iVar1)))))) {
      return 0;
    }
  }
  _close(*(undefined4 *)unaff_x19);
  _close(*(undefined4 *)((long)unaff_x19 + 4));
  *unaff_x19 = 0xffffffffffffffff;
  return 0xffffffff;
}

