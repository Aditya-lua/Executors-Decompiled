
ulong FUN_00437264(void)

{
  uint uVar1;
  bool in_ZR;
  long lVar2;
  ulong uVar3;
  undefined8 *puVar4;
  uint *puVar5;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 uVar6;
  uint unaff_w24;
  uint unaff_w25;
  undefined4 *unaff_x26;
  uint unaff_w27;
  
  if ((in_ZR) || ((cRam0000000000a3bfd1 == '\0' && (lVar2 = _signal(0xd,0), lVar2 == -1)))) {
    puVar5 = (uint *)___error();
    uVar3 = (ulong)*puVar5 << 0x20 | 2;
  }
  else {
    puVar4 = *(undefined8 **)(unaff_x21 + 0x38);
    lVar2 = *(long *)(unaff_x21 + 0x40) << 4;
    do {
      if (lVar2 == 0) {
        if (unaff_x20 != 0) {
          puVar4 = (undefined8 *)__NSGetEnviron();
          unaff_x22 = *puVar4;
          uVar6 = *(undefined8 *)(unaff_x20 + 0x20);
          puVar4 = (undefined8 *)__NSGetEnviron();
          *puVar4 = uVar6;
        }
        _execvp(*(undefined8 *)(unaff_x21 + 0x98),*(undefined8 *)(unaff_x21 + 0x20));
        puVar5 = (uint *)___error();
        uVar1 = *puVar5;
        if (unaff_x20 != 0) {
          puVar4 = (undefined8 *)__NSGetEnviron();
          *puVar4 = unaff_x22;
        }
        if (1 < unaff_w24) {
          _close(*(undefined4 *)(unaff_x19 + 4));
        }
        uVar3 = (ulong)uVar1 << 0x20 | 2;
        if (1 < unaff_w25) {
          _close(*(undefined4 *)(unaff_x19 + 0xc));
        }
        if (unaff_w27 < 2) {
          return uVar3;
        }
        goto code_r0x00437314;
      }
      uVar3 = (**(code **)(puVar4[1] + 0x20))(*puVar4);
      puVar4 = puVar4 + 2;
      lVar2 = lVar2 + -0x10;
      unaff_x22 = 0;
    } while (uVar3 == 0);
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
  return uVar3;
}

