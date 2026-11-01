
void FUN_005f3f5c(void)

{
  int iVar1;
  undefined1 in_w8;
  char cVar2;
  bool bVar3;
  uint uVar4;
  bool bVar5;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  *(undefined1 *)(unaff_x21 + 0xa8c) = in_w8;
  uRam0000000000a2aa8b = 1;
  uRam0000000000a2aa8d = 1;
  *(undefined1 *)(unaff_x20 + 0xa8e) = 1;
  bVar3 = false;
  cRam0000000000a2aa8f = '\x01';
  cVar2 = '\0';
  if (*(char *)(unaff_x20 + 0xa8e) != '\0') {
    if (*(uint *)(unaff_x19 + 300) == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa3c130), iVar1 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      cVar2 = *(char *)(unaff_x20 + 0xa8e);
      uVar4 = uRam0000000000a3c140;
    }
    else {
      cVar2 = '\x01';
      uVar4 = *(uint *)(unaff_x19 + 300);
    }
    bVar3 = 6 < uVar4;
  }
  bVar5 = false;
  uRam0000000000a2aa90 = bVar3;
  if ((cVar2 != '\0') && (cRam0000000000a2aa8f != '\0')) {
    uVar4 = *(uint *)(unaff_x19 + 300);
    if (*(uint *)(unaff_x19 + 300) == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa3c130), iVar1 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      uVar4 = uRam0000000000a3c140;
    }
    bVar5 = 6 < uVar4;
  }
  uRam0000000000a2aa91 = bVar5;
  uRam0000000000a2aa92 = 0;
  uRam0000000000a2aa93 = 0;
  if (iRam0000000000a2aa94 == 0) {
    iRam0000000000a2aa94 = 0x40;
  }
  uRam0000000000a2aa88 = 1;
  return;
}

