
void FUN_000bf31c(void)

{
  int iVar1;
  long unaff_x19;
  long lStack0000000000000000;
  undefined8 uStack0000000000000010;
  
  lStack0000000000000000 = (long)&uStack0000000000000010 + 4;
  iVar1 = _sscanf();
  if (iVar1 == 1) {
    *(bool *)(unaff_x19 + 0xc) = uStack0000000000000010._4_4_ != 0;
    return;
  }
  lStack0000000000000000 = (long)&uStack0000000000000010 + 4;
  iVar1 = _sscanf();
  if (iVar1 == 1) {
    *(bool *)(unaff_x19 + 0xd) = uStack0000000000000010._4_4_ != 0;
    return;
  }
  return;
}

