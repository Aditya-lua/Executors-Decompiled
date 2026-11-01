
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_00436f28(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined4 uVar4;
  code *pcVar5;
  int iVar6;
  undefined8 uVar7;
  long lVar8;
  uint *puVar9;
  long lVar10;
  ulong uVar11;
  long *plVar12;
  undefined8 *puVar13;
  uint *puVar14;
  long lVar15;
  int in_w8;
  uint uVar16;
  uint uVar17;
  long unaff_x19;
  long unaff_x22;
  long lVar18;
  long unaff_x29;
  undefined1 auVar19 [16];
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000044;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000098;
  undefined1 uStack0000000000000099;
  undefined1 uStack000000000000009a;
  undefined1 uStack000000000000009b;
  undefined4 uStack000000000000009c;
  undefined8 uStack00000000000000a8;
  ulong uStack_70;
  undefined1 uStack_61;
  
  uVar17 = (*(uint *)(unaff_x29 + -0x94) & 0xff00ff00) >> 8 |
           (*(uint *)(unaff_x29 + -0x94) & 0xff00ff) << 8;
  uVar17 = uVar17 >> 0x10 | uVar17 << 0x10;
  if (in_w8 != 0) {
    uVar17 = 0x16000000;
  }
  uStack0000000000000098 = (undefined1)uVar17;
  uStack0000000000000099 = (undefined1)(uVar17 >> 8);
  uStack000000000000009a = (undefined1)(uVar17 >> 0x10);
  uStack000000000000009b = (undefined1)(uVar17 >> 0x18);
  uStack000000000000009c = (undefined4)_UNK_008883b8;
  lVar15 = 8;
  auVar19 = func_0x0042f80c();
  *(undefined1 (*) [16])(unaff_x29 + -0x98) = auVar19;
  if (auVar19._0_8_ == 0) {
    func_0x003f7714(unaff_x29 + -0x98);
    __exit(1);
    func_0x003f67e4(unaff_x22 + 8);
    *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc040;
    *(undefined8 *)(unaff_x29 + -0x90) = 1;
    *(undefined8 *)(unaff_x29 + -0x88) = 8;
    *(undefined8 *)(unaff_x29 + -0x80) = 0;
    *(undefined8 *)(unaff_x29 + -0x78) = 0;
    func_0x007a2420(unaff_x29 + -0x98,&UNK_009dc050);
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x436edc);
    (*pcVar5)();
  }
  func_0x003f67e4(unaff_x19 + 8);
  *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc030;
  *(undefined8 *)(unaff_x29 + -0x90) = 1;
  *(undefined8 *)(unaff_x29 + -0x80) = 0;
  *(undefined8 *)(unaff_x29 + -0x78) = 0;
  *(long *)(unaff_x29 + -0x88) = unaff_x29 + -0x68;
  uStack00000000000000a8 = func_0x0041f554(unaff_x29 + -0x68,unaff_x29 + -0x98);
  if (uStack00000000000000a8 != 0) {
    func_0x003f67e4(&uStack00000000000000a8);
  }
  uVar7 = func_0x007a144c();
  _posix_spawn_file_actions_destroy(&uStack0000000000000098);
  _posix_spawnattr_destroy(&uStack0000000000000070);
  func_0x003f6fd8(&uStack0000000000000050);
  func_0x003f7050(&uStack0000000000000044);
  func_0x003f7b94(&uStack0000000000000010);
  auVar19 = __Unwind_Resume(uVar7);
  puVar14 = auVar19._8_8_;
  lVar8 = auVar19._0_8_;
  uVar17 = *puVar14;
  if (uVar17 == 0) {
code_r0x00437114:
    uVar1 = puVar14[2];
    if (uVar1 == 0) {
code_r0x00437150:
      uVar2 = puVar14[4];
      if (uVar2 == 0) {
code_r0x00437194:
        lVar18 = *(long *)(lVar8 + 0xb8);
        if (lVar18 == 0) {
code_r0x004371b8:
          if ((*(int *)(lVar8 + 0x50) != 1) ||
             (iVar6 = _setgid(*(undefined4 *)(lVar8 + 0x54)), iVar6 != -1)) {
            if (*(int *)(lVar8 + 0x48) == 1) {
              uVar4 = *(undefined4 *)(lVar8 + 0x4c);
              if ((lVar18 == 0) && (iVar6 = _setgroups(0,0), iVar6 == -1)) {
                puVar9 = (uint *)___error();
                uVar11 = (ulong)*puVar9 << 0x20 | 2;
                uStack_70 = uVar11;
                if (*puVar9 != 1) goto LAB_004372c4;
                func_0x003f67e4(&uStack_70);
                lVar18 = 0x100000002;
              }
              iVar6 = _setuid(uVar4);
              if (iVar6 == -1) goto LAB_004372b4;
            }
            if ((((*(long *)(lVar8 + 0xa8) == 0) || (iVar6 = _chdir(), iVar6 != -1)) &&
                ((*(int *)(lVar8 + 0x58) != 1 ||
                 (iVar6 = _setpgid(0,*(undefined4 *)(lVar8 + 0x5c)), iVar6 != -1)))) &&
               ((cRam0000000000a3bfd1 != '\0' || (lVar10 = _signal(0xd,0), lVar10 != -1)))) {
              puVar13 = *(undefined8 **)(lVar8 + 0x38);
              lVar10 = *(long *)(lVar8 + 0x40) << 4;
              do {
                if (lVar10 == 0) {
                  if (lVar15 != 0) {
                    plVar12 = (long *)__NSGetEnviron();
                    lVar18 = *plVar12;
                    uVar7 = *(undefined8 *)(lVar15 + 0x20);
                    puVar13 = (undefined8 *)__NSGetEnviron();
                    *puVar13 = uVar7;
                  }
                  _execvp(*(undefined8 *)(lVar8 + 0x98),*(undefined8 *)(lVar8 + 0x20));
                  puVar9 = (uint *)___error();
                  uVar16 = *puVar9;
                  if (lVar15 != 0) {
                    plVar12 = (long *)__NSGetEnviron();
                    *plVar12 = lVar18;
                  }
                  if (1 < uVar17) {
                    _close(puVar14[1]);
                  }
                  uVar11 = (ulong)uVar16 << 0x20 | 2;
                  if (1 < uVar1) {
                    _close(puVar14[3]);
                  }
                  if (uVar2 < 2) {
                    return uVar11;
                  }
                  goto code_r0x00437314;
                }
                uVar11 = (**(code **)(puVar13[1] + 0x20))(*puVar13);
                puVar13 = puVar13 + 2;
                lVar10 = lVar10 + -0x10;
                lVar18 = 0;
              } while (uVar11 == 0);
              goto LAB_004372c4;
            }
          }
        }
        else {
          if (*(ulong *)(lVar8 + 0xc0) >> 0x1f != 0) {
            func_0x007a2810(&UNK_008851be,0x2b,&uStack_61,&UNK_009d9398,&UNK_009dc128);
                    /* WARNING: Does not return */
            pcVar5 = (code *)SoftwareBreakpoint(1,0x4373f0);
            (*pcVar5)();
          }
          iVar6 = _setgroups(*(ulong *)(lVar8 + 0xc0),lVar18);
          if (iVar6 != -1) goto code_r0x004371b8;
        }
LAB_004372b4:
        puVar9 = (uint *)___error();
        uVar11 = (ulong)*puVar9 << 0x20 | 2;
        goto LAB_004372c4;
      }
      uVar3 = puVar14[5];
      do {
        iVar6 = _dup2(uVar3,2);
        if (iVar6 != -1) goto code_r0x00437194;
        puVar9 = (uint *)___error();
        uVar16 = *puVar9;
      } while (uVar16 == 4);
    }
    else {
      uVar2 = puVar14[3];
      do {
        iVar6 = _dup2(uVar2,1);
        if (iVar6 != -1) goto code_r0x00437150;
        puVar9 = (uint *)___error();
        uVar16 = *puVar9;
      } while (uVar16 == 4);
    }
  }
  else {
    uVar1 = puVar14[1];
    do {
      iVar6 = _dup2(uVar1,0);
      if (iVar6 != -1) goto code_r0x00437114;
      puVar9 = (uint *)___error();
      uVar16 = *puVar9;
    } while (uVar16 == 4);
  }
  uVar11 = (ulong)uVar16 << 0x20 | 2;
LAB_004372c4:
  if (uVar17 < 2) {
    uVar17 = puVar14[2];
  }
  else {
    _close(puVar14[1]);
    uVar17 = puVar14[2];
  }
  if (uVar17 < 2) {
    uVar17 = puVar14[4];
  }
  else {
    _close(puVar14[3]);
    uVar17 = puVar14[4];
  }
  if (1 < uVar17) {
code_r0x00437314:
    _close(puVar14[5]);
  }
  return uVar11;
}

