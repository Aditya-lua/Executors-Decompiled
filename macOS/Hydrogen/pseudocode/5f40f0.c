
void FUN_005f40f0(ulong param_1)

{
  uint uVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  uint uVar5;
  bool bVar6;
  long unaff_x19;
  long unaff_x20;
  
  if (((param_1 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0)) {
    func_0x005f43b8();
    ___cxa_guard_release(0xa3c130);
  }
  uRam0000000000a3c12c = uRam0000000000a3c140;
  if (uRam0000000000a3c140 < 7) {
    uVar1 = func_0x0015e2a8();
  }
  else {
    uVar1 = 1;
  }
  bVar4 = false;
  bRam0000000000a2aa8f = (byte)uVar1;
  cVar3 = *(char *)(unaff_x20 + 0xa8e);
  if ((cVar3 != '\0') && (uVar1 != 0)) {
    if (*(uint *)(unaff_x19 + 300) == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      cVar3 = *(char *)(unaff_x20 + 0xa8e);
      uVar1 = (uint)bRam0000000000a2aa8f;
      uVar5 = uRam0000000000a3c140;
    }
    else {
      cVar3 = '\x01';
      uVar5 = *(uint *)(unaff_x19 + 300);
    }
    bVar4 = 6 < uVar5;
  }
  bVar6 = false;
  uRam0000000000a2aa90 = bVar4;
  if ((cVar3 != '\0') && (uVar1 != 0)) {
    uVar1 = *(uint *)(unaff_x19 + 300);
    if (*(uint *)(unaff_x19 + 300) == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      uVar1 = uRam0000000000a3c140;
    }
    bVar6 = 6 < uVar1;
  }
  uRam0000000000a2aa91 = bVar6;
  uRam0000000000a2aa92 = 0;
  uRam0000000000a2aa93 = 0;
  if (iRam0000000000a2aa94 == 0) {
    iRam0000000000a2aa94 = 0x40;
  }
  uRam0000000000a2aa88 = 1;
  return;
}

