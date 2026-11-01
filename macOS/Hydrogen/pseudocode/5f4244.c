
void FUN_005f4244(void)

{
  int iVar1;
  uint uVar2;
  bool bVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  iVar1 = ___cxa_guard_acquire(0xa3c130);
  if (iVar1 != 0) {
    func_0x005f43b8();
    ___cxa_guard_release(0xa3c130);
  }
  uRam0000000000a3c12c = uRam0000000000a3c140;
  uRam0000000000a2aa90 = 6 < uRam0000000000a3c140;
  bVar3 = false;
  if ((*(char *)(unaff_x20 + 0xa8e) != '\0') && (*(char *)(unaff_x21 + 0xa8f) != '\0')) {
    uVar2 = *(uint *)(unaff_x19 + 300);
    if (*(uint *)(unaff_x19 + 300) == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa3c130), iVar1 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uVar2 = uRam0000000000a3c140;
    }
    bVar3 = 6 < uVar2;
  }
  uRam0000000000a2aa91 = bVar3;
  uRam0000000000a2aa92 = 0;
  uRam0000000000a2aa93 = 0;
  if (iRam0000000000a2aa94 == 0) {
    iRam0000000000a2aa94 = 0x40;
  }
  uRam0000000000a2aa88 = 1;
  uRam0000000000a3c12c = uRam0000000000a3c140;
  return;
}

