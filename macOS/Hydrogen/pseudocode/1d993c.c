
void FUN_001d993c(void)

{
  ulong unaff_x19;
  long *unaff_x20;
  long lVar1;
  
  (**(code **)(unaff_x20[6] + 0x30))();
  if (*unaff_x20 != -0x8000000000000000) {
    lVar1 = unaff_x20[2];
    if ((ulong)(*unaff_x20 - lVar1) < unaff_x19) {
      func_0x0079b61c();
      lVar1 = unaff_x20[2];
    }
    _memcpy(unaff_x20[1] + lVar1);
    unaff_x20[2] = lVar1 + unaff_x19;
  }
  return;
}

