
ulong FUN_00432a90(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  code *pcVar2;
  long lVar3;
  char cVar4;
  int iVar5;
  undefined8 uVar6;
  uint *puVar7;
  long *plVar8;
  ulong uVar9;
  undefined4 uVar10;
  long *plStack_860;
  undefined1 uStack_858;
  long lStack_850;
  long *plStack_848;
  ulong uStack_840;
  long lStack_838;
  long lStack_830;
  long lStack_828;
  long *plStack_428;
  ulong uStack_420;
  undefined1 auStack_418 [12];
  char cStack_40c;
  undefined1 auStack_40b [1035];
  
  plStack_860 = (long *)0x0;
  uVar10 = (undefined4)param_2;
  if ((param_1 & 1) == 0) {
    uVar10 = 0xfffffffe;
  }
  while (uVar6 = _openat(uVar10,param_3,0x1100100), (int)uVar6 == -1) {
    puVar7 = (uint *)___error();
    uVar1 = *puVar7;
    if (uVar1 != 4) {
      uVar9 = (ulong)uVar1 << 0x20 | 2;
      if (uVar1 != 0x3e && uVar1 != 0x14) {
        return uVar9;
      }
      if ((param_1 & 1) == 0) {
        return uVar9;
      }
      iVar5 = _unlinkat(param_2,param_3,0);
      if (iVar5 == -1) {
        return (ulong)*puVar7 << 0x20 | 2;
      }
      return 0;
    }
  }
  lStack_828 = _fdopendir();
  if (lStack_828 == 0) {
    puVar7 = (uint *)___error();
    uVar1 = *puVar7;
    _close(uVar6);
    return (ulong)uVar1 << 0x20 | 2;
  }
  plStack_848 = (long *)((long)&MACH_HEADER.magic + 1);
  lStack_850 = 1;
  uStack_840 = 0;
  lStack_838 = 1;
  lStack_830 = 0;
  plVar8 = (long *)func_0x00187bd0(0x30,8);
  if (plVar8 == (long *)0x0) {
    func_0x007a1f18(8,0x30);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x432d58);
    (*pcVar2)();
  }
  plVar8[1] = (long)plStack_848;
  *plVar8 = lStack_850;
  plVar8[3] = lStack_838;
  plVar8[2] = uStack_840;
  plVar8[5] = lStack_828;
  plVar8[4] = lStack_830;
  uStack_858 = 0;
  plStack_860 = plVar8;
  do {
    func_0x0043148c(&lStack_850,&plStack_860);
    uVar9 = uStack_840;
    plVar8 = plStack_848;
    if ((int)lStack_850 != 1) {
      lVar3 = *plStack_860;
      *plStack_860 = lVar3 + -1;
      LORelease();
      if (lVar3 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(&plStack_860);
      }
      iVar5 = _unlinkat(uVar10,param_3,0x80);
      if (iVar5 != -1) {
        return 0;
      }
      puVar7 = (uint *)___error();
      uVar1 = *puVar7;
      cVar4 = func_0x004307b8();
      uVar9 = 0;
      if (cVar4 != '\0') {
        uVar9 = (ulong)uVar1 << 0x20 | 2;
      }
      return uVar9;
    }
    if (plStack_848 == (long *)0x0) goto code_r0x00432c80;
    _memcpy(auStack_418,&lStack_838,0x410);
    plStack_428 = plVar8;
    uStack_420 = uVar9;
    if (cStack_40c == '\x04') {
      uVar9 = func_0x00432a78(1,uVar6,auStack_40b);
code_r0x00432bf8:
      if ((uVar9 != 0) && ((uVar9 & 0xffffffff00000003) != 0x200000002)) {
code_r0x00432c60:
        lVar3 = *plStack_428;
        *plStack_428 = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          func_0x004037b4(&plStack_428);
        }
code_r0x00432c80:
        lVar3 = *plStack_860;
        *plStack_860 = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          func_0x004037b4(&plStack_860);
          return uVar9;
        }
        return uVar9;
      }
    }
    else {
      if (cStack_40c == '\0') {
        uVar9 = func_0x00432a78(1,uVar6,auStack_40b);
        goto code_r0x00432bf8;
      }
      iVar5 = _unlinkat(uVar6,auStack_40b,0);
      if (iVar5 == -1) {
        puVar7 = (uint *)___error();
        uVar9 = (ulong)*puVar7 << 0x20 | 2;
        if (uVar9 == 0x200000002) goto code_r0x00432c28;
        goto code_r0x00432c60;
      }
    }
code_r0x00432c28:
    lVar3 = *plStack_428;
    *plStack_428 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004037b4(&plStack_428);
    }
  } while( true );
}

