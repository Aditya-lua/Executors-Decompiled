
void FUN_005f3f94(long param_1,undefined1 param_2)

{
  uint uVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  bool bVar5;
  
  *(undefined1 *)(param_1 + 0xa8a) = param_2;
  if (uRam0000000000a3c12c == 0) {
    if (((bRam0000000000a3c130 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0)) {
      func_0x005f43b8();
      ___cxa_guard_release(0xa3c130);
    }
    uRam0000000000a3c12c = uRam0000000000a3c140;
    if (uRam0000000000a3c140 < 7) goto code_r0x005f3fd4;
LAB_005f3f58:
    uRam0000000000a2aa8c = 1;
LAB_005f3fec:
    uRam0000000000a2aa8b = 1;
LAB_005f3ff8:
    uRam0000000000a2aa8d = 1;
  }
  else {
    if (6 < uRam0000000000a3c12c) goto LAB_005f3f58;
code_r0x005f3fd4:
    uRam0000000000a2aa8c = func_0x0015e2a8();
    if (uRam0000000000a3c12c == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      if (uRam0000000000a3c140 < 7) goto LAB_005f405c;
      goto LAB_005f3fec;
    }
    if (6 < uRam0000000000a3c12c) goto LAB_005f3fec;
LAB_005f405c:
    uRam0000000000a2aa8b = func_0x0015e2a8();
    if (uRam0000000000a3c12c == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
    }
    if (6 < uRam0000000000a3c12c) goto LAB_005f3ff8;
    uRam0000000000a2aa8d = func_0x0015e2a8();
    if (uRam0000000000a3c12c == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
    }
    if (uRam0000000000a3c12c < 7) {
      cRam0000000000a2aa8e = func_0x0015e2a8();
      if (uRam0000000000a3c12c == 0) {
        if (((bRam0000000000a3c130 & 1) == 0) &&
           (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0)) {
          func_0x005f43b8();
          ___cxa_guard_release(0xa3c130);
        }
        uRam0000000000a3c12c = uRam0000000000a3c140;
      }
      if (uRam0000000000a3c12c < 7) {
        uVar1 = func_0x0015e2a8();
      }
      else {
        uVar1 = 1;
      }
      goto code_r0x005f400c;
    }
  }
  uVar1 = 1;
  cRam0000000000a2aa8e = '\x01';
code_r0x005f400c:
  bVar4 = false;
  bRam0000000000a2aa8f = (byte)uVar1;
  cVar3 = cRam0000000000a2aa8e;
  if ((cRam0000000000a2aa8e != '\0') && (uVar1 != 0)) {
    if (uRam0000000000a3c12c == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
      uVar1 = (uint)bRam0000000000a2aa8f;
      cVar3 = cRam0000000000a2aa8e;
    }
    else {
      cVar3 = '\x01';
    }
    bVar4 = 6 < uRam0000000000a3c12c;
  }
  bVar5 = false;
  uRam0000000000a2aa90 = bVar4;
  if ((cVar3 != '\0') && (uVar1 != 0)) {
    if (uRam0000000000a3c12c == 0) {
      if (((bRam0000000000a3c130 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa3c130), iVar2 != 0))
      {
        func_0x005f43b8();
        ___cxa_guard_release(0xa3c130);
      }
      uRam0000000000a3c12c = uRam0000000000a3c140;
    }
    bVar5 = 6 < uRam0000000000a3c12c;
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

