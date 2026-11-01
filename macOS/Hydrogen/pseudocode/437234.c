
ulong FUN_00437234(void)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  undefined8 *puVar5;
  uint *puVar6;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 uVar7;
  uint unaff_w24;
  uint unaff_w25;
  undefined4 *unaff_x26;
  uint unaff_w27;
  
  if ((((*(long *)(unaff_x21 + 0xa8) == 0) || (iVar2 = _chdir(), iVar2 != -1)) &&
      ((*(int *)(unaff_x21 + 0x58) != 1 ||
       (iVar2 = _setpgid(0,*(undefined4 *)(unaff_x21 + 0x5c)), iVar2 != -1)))) &&
     ((cRam0000000000a3bfd1 != '\0' || (lVar3 = _signal(0xd,0), lVar3 != -1)))) {
    puVar5 = *(undefined8 **)(unaff_x21 + 0x38);
    lVar3 = *(long *)(unaff_x21 + 0x40) << 4;
    do {
      if (lVar3 == 0) {
        if (unaff_x20 != 0) {
          puVar5 = (undefined8 *)__NSGetEnviron();
          unaff_x22 = *puVar5;
          uVar7 = *(undefined8 *)(unaff_x20 + 0x20);
          puVar5 = (undefined8 *)__NSGetEnviron();
          *puVar5 = uVar7;
        }
        _execvp(*(undefined8 *)(unaff_x21 + 0x98),*(undefined8 *)(unaff_x21 + 0x20));
        puVar6 = (uint *)___error();
        uVar1 = *puVar6;
        if (unaff_x20 != 0) {
          puVar5 = (undefined8 *)__NSGetEnviron();
          *puVar5 = unaff_x22;
        }
        if (1 < unaff_w24) {
          _close(*(undefined4 *)(unaff_x19 + 4));
        }
        uVar4 = (ulong)uVar1 << 0x20 | 2;
        if (1 < unaff_w25) {
          _close(*(undefined4 *)(unaff_x19 + 0xc));
        }
        if (unaff_w27 < 2) {
          return uVar4;
        }
        goto code_r0x00437314;
      }
      uVar4 = (**(code **)(puVar5[1] + 0x20))(*puVar5);
      puVar5 = puVar5 + 2;
      lVar3 = lVar3 + -0x10;
      unaff_x22 = 0;
    } while (uVar4 == 0);
  }
  else {
    puVar6 = (uint *)___error();
    uVar4 = (ulong)*puVar6 << 0x20 | 2;
  }
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
  return uVar4;
}

