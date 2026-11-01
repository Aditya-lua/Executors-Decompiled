
ulong FUN_0019905c(undefined8 *param_1)

{
  uint uVar1;
  ulong uVar2;
  long unaff_x29;
  
  uVar1 = _SecTrustGetNetworkFetchAllowed(*param_1,unaff_x29 + -1);
  if (uVar1 == 0) {
    uVar2 = (ulong)(*(char *)(unaff_x29 + -1) != '\0') << 8;
  }
  else {
    uVar2 = 0;
  }
  return uVar2 | (ulong)uVar1 << 0x20 | (ulong)(uVar1 != 0);
}

