
void FUN_005f4290(long param_1)

{
  undefined1 uVar1;
  uint uVar2;
  int iVar3;
  char cVar4;
  bool bVar5;
  uint uVar6;
  bool bVar7;
  long unaff_x19;
  long unaff_x20;
  
  iVar3 = ___cxa_guard_acquire(param_1 + 0x130);
  if (iVar3 != 0) {
    func_0x005f43b8();
    ___cxa_guard_release(0xa3c130);
  }
  uRam0000000000a3c12c = uRam0000000000a3c140;
  if (uRam0000000000a3c140 < 7) {
    uRam0000000000a2aa8d = func_0x0015e2a8();
    uVar2 = *(uint *)(unaff_x19 + 300);
    if (*(uint *)(unaff_x19 + 300) == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar3 = ___cxa_guard_acquire(0xa3c130), iVar3 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      uVar2 = uRam0000000000a3c140;
    }
    if (uVar2 < 7) {
      uVar1 = func_0x0015e2a8();
      uVar2 = *(uint *)(unaff_x19 + 300);
      *(undefined1 *)(unaff_x20 + 0xa8e) = uVar1;
      if (uVar2 == 0) {
        if (((bRam0000000000a3c130 & 1) == 0) &&
           (iVar3 = ___cxa_guard_acquire(0xa3c130), iVar3 != 0)) {
          func_0x005f43b8();
          ___cxa_guard_release(0xa3c130);
        }
        uRam0000000000a3c12c = uRam0000000000a3c140;
        uVar2 = uRam0000000000a3c140;
      }
      if (uVar2 < 7) {
        uVar2 = func_0x0015e2a8();
      }
      else {
        uVar2 = 1;
      }
      goto code_r0x005f400c;
    }
  }
  else {
    uRam0000000000a2aa8d = 1;
  }
  uVar2 = 1;
  *(undefined1 *)(unaff_x20 + 0xa8e) = 1;
code_r0x005f400c:
  bVar5 = false;
  bRam0000000000a2aa8f = (byte)uVar2;
  cVar4 = *(char *)(unaff_x20 + 0xa8e);
  if ((cVar4 != '\0') && (uVar2 != 0)) {
    if (*(uint *)(unaff_x19 + 300) == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar3 = ___cxa_guard_acquire(0xa3c130), iVar3 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      cVar4 = *(char *)(unaff_x20 + 0xa8e);
      uVar2 = (uint)bRam0000000000a2aa8f;
      uVar6 = uRam0000000000a3c140;
    }
    else {
      cVar4 = '\x01';
      uVar6 = *(uint *)(unaff_x19 + 300);
    }
    bVar5 = 6 < uVar6;
  }
  bVar7 = false;
  uRam0000000000a2aa90 = bVar5;
  if ((cVar4 != '\0') && (uVar2 != 0)) {
    uVar2 = *(uint *)(unaff_x19 + 300);
    if (*(uint *)(unaff_x19 + 300) == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar3 = ___cxa_guard_acquire(0xa3c130), iVar3 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      uVar2 = uRam0000000000a3c140;
    }
    bVar7 = 6 < uVar2;
  }
  uRam0000000000a2aa91 = bVar7;
  uRam0000000000a2aa92 = 0;
  uRam0000000000a2aa93 = 0;
  if (iRam0000000000a2aa94 == 0) {
    iRam0000000000a2aa94 = 0x40;
  }
  uRam0000000000a2aa88 = 1;
  return;
}

