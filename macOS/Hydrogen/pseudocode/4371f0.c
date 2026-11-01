
ulong FUN_004371f0(void)

{
  uint uVar1;
  int iVar2;
  uint *puVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 uVar7;
  uint unaff_w24;
  uint unaff_w25;
  undefined4 *unaff_x26;
  uint unaff_w27;
  
  iVar2 = _setgroups();
  if (iVar2 == -1) {
    puVar3 = (uint *)___error();
    uVar5 = (ulong)*puVar3 << 0x20 | 2;
    if (*puVar3 != 1) goto code_r0x004372c4;
    func_0x003f67e4();
    unaff_x22 = 0x100000002;
  }
  iVar2 = _setuid();
  if ((((iVar2 == -1) || ((*(long *)(unaff_x21 + 0xa8) != 0 && (iVar2 = _chdir(), iVar2 == -1)))) ||
      ((*(int *)(unaff_x21 + 0x58) == 1 &&
       (iVar2 = _setpgid(0,*(undefined4 *)(unaff_x21 + 0x5c)), iVar2 == -1)))) ||
     ((cRam0000000000a3bfd1 == '\0' && (lVar4 = _signal(0xd,0), lVar4 == -1)))) {
    puVar3 = (uint *)___error();
    uVar5 = (ulong)*puVar3 << 0x20 | 2;
  }
  else {
    puVar6 = *(undefined8 **)(unaff_x21 + 0x38);
    lVar4 = *(long *)(unaff_x21 + 0x40) << 4;
    do {
      if (lVar4 == 0) {
        if (unaff_x20 != 0) {
          puVar6 = (undefined8 *)__NSGetEnviron();
          unaff_x22 = *puVar6;
          uVar7 = *(undefined8 *)(unaff_x20 + 0x20);
          puVar6 = (undefined8 *)__NSGetEnviron();
          *puVar6 = uVar7;
        }
        _execvp(*(undefined8 *)(unaff_x21 + 0x98),*(undefined8 *)(unaff_x21 + 0x20));
        puVar3 = (uint *)___error();
        uVar1 = *puVar3;
        if (unaff_x20 != 0) {
          puVar6 = (undefined8 *)__NSGetEnviron();
          *puVar6 = unaff_x22;
        }
        if (1 < unaff_w24) {
          _close(*(undefined4 *)(unaff_x19 + 4));
        }
        uVar5 = (ulong)uVar1 << 0x20 | 2;
        if (1 < unaff_w25) {
          _close(*(undefined4 *)(unaff_x19 + 0xc));
        }
        if (unaff_w27 < 2) {
          return uVar5;
        }
        goto code_r0x00437314;
      }
      uVar5 = (**(code **)(puVar6[1] + 0x20))(*puVar6);
      puVar6 = puVar6 + 2;
      lVar4 = lVar4 + -0x10;
      unaff_x22 = 0;
    } while (uVar5 == 0);
  }
code_r0x004372c4:
  if (unaff_w24 < 2) {
    uVar1 = *(uint *)(unaff_x19 + 8);
  }
  else {
    _close(*(undefined4 *)(unaff_x19 + 4));
    uVar1 = *(uint *)(unaff_x19 + 8);
  }
  if (uVar1 < 2) {
    uVar1 = *(uint *)(unaff_x19 + 0x10);
  }
  else {
    _close(*(undefined4 *)(unaff_x19 + 0xc));
    uVar1 = *(uint *)(unaff_x19 + 0x10);
  }
  if (1 < uVar1) {
    unaff_x26 = (undefined4 *)(unaff_x19 + 0x14);
code_r0x00437314:
    _close(*unaff_x26);
  }
  return uVar5;
}

