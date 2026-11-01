
ulong FUN_00437194(void)

{
  undefined4 uVar1;
  uint uVar2;
  code *pcVar3;
  int iVar4;
  uint *puVar5;
  long lVar6;
  ulong uVar7;
  long *plVar8;
  undefined8 *puVar9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar10;
  undefined8 uVar11;
  uint unaff_w24;
  uint unaff_w25;
  undefined4 *unaff_x26;
  uint unaff_w27;
  undefined1 uStack000000000000000f;
  
  lVar10 = *(long *)(unaff_x21 + 0xb8);
  if (lVar10 == 0) {
LAB_004371b8:
    if ((*(int *)(unaff_x21 + 0x50) != 1) ||
       (iVar4 = _setgid(*(undefined4 *)(unaff_x21 + 0x54)), iVar4 != -1)) {
      if (*(int *)(unaff_x21 + 0x48) == 1) {
        uVar1 = *(undefined4 *)(unaff_x21 + 0x4c);
        if ((lVar10 == 0) && (iVar4 = _setgroups(0,0), iVar4 == -1)) {
          puVar5 = (uint *)___error();
          uVar7 = (ulong)*puVar5 << 0x20 | 2;
          if (*puVar5 != 1) goto code_r0x004372c4;
          func_0x003f67e4();
          lVar10 = 0x100000002;
        }
        iVar4 = _setuid(uVar1);
        if (iVar4 == -1) goto LAB_004372b4;
      }
      if ((((*(long *)(unaff_x21 + 0xa8) == 0) || (iVar4 = _chdir(), iVar4 != -1)) &&
          ((*(int *)(unaff_x21 + 0x58) != 1 ||
           (iVar4 = _setpgid(0,*(undefined4 *)(unaff_x21 + 0x5c)), iVar4 != -1)))) &&
         ((cRam0000000000a3bfd1 != '\0' || (lVar6 = _signal(0xd,0), lVar6 != -1)))) {
        puVar9 = *(undefined8 **)(unaff_x21 + 0x38);
        lVar6 = *(long *)(unaff_x21 + 0x40) << 4;
        do {
          if (lVar6 == 0) {
            if (unaff_x20 != 0) {
              plVar8 = (long *)__NSGetEnviron();
              lVar10 = *plVar8;
              uVar11 = *(undefined8 *)(unaff_x20 + 0x20);
              puVar9 = (undefined8 *)__NSGetEnviron();
              *puVar9 = uVar11;
            }
            _execvp(*(undefined8 *)(unaff_x21 + 0x98),*(undefined8 *)(unaff_x21 + 0x20));
            puVar5 = (uint *)___error();
            uVar2 = *puVar5;
            if (unaff_x20 != 0) {
              plVar8 = (long *)__NSGetEnviron();
              *plVar8 = lVar10;
            }
            if (1 < unaff_w24) {
              _close(*(undefined4 *)(unaff_x19 + 4));
            }
            uVar7 = (ulong)uVar2 << 0x20 | 2;
            if (1 < unaff_w25) {
              _close(*(undefined4 *)(unaff_x19 + 0xc));
            }
            if (unaff_w27 < 2) {
              return uVar7;
            }
            goto code_r0x00437314;
          }
          uVar7 = (**(code **)(puVar9[1] + 0x20))(*puVar9);
          puVar9 = puVar9 + 2;
          lVar6 = lVar6 + -0x10;
          lVar10 = 0;
        } while (uVar7 == 0);
        goto code_r0x004372c4;
      }
    }
  }
  else {
    if (*(ulong *)(unaff_x21 + 0xc0) >> 0x1f != 0) {
      func_0x007a2810(&UNK_008851be,0x2b,&uStack000000000000000f,&UNK_009d9398,&UNK_009dc128);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x4373f0);
      (*pcVar3)();
    }
    iVar4 = _setgroups(*(ulong *)(unaff_x21 + 0xc0),lVar10);
    if (iVar4 != -1) goto LAB_004371b8;
  }
LAB_004372b4:
  puVar5 = (uint *)___error();
  uVar7 = (ulong)*puVar5 << 0x20 | 2;
code_r0x004372c4:
  if (unaff_w24 < 2) {
    uVar2 = *(uint *)(unaff_x19 + 8);
  }
  else {
    _close(*(undefined4 *)(unaff_x19 + 4));
    uVar2 = *(uint *)(unaff_x19 + 8);
  }
  if (uVar2 < 2) {
    uVar2 = *(uint *)(unaff_x19 + 0x10);
  }
  else {
    _close(*(undefined4 *)(unaff_x19 + 0xc));
    uVar2 = *(uint *)(unaff_x19 + 0x10);
  }
  if (1 < uVar2) {
    unaff_x26 = (undefined4 *)(unaff_x19 + 0x14);
code_r0x00437314:
    _close(*unaff_x26);
  }
  return uVar7;
}

