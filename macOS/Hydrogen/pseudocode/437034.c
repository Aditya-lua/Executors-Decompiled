
ulong FUN_00437034(undefined8 param_1,undefined8 param_2,long param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  undefined4 uVar5;
  code *pcVar6;
  int iVar7;
  undefined8 uVar8;
  long lVar9;
  uint *puVar10;
  long lVar11;
  ulong uVar12;
  long *plVar13;
  undefined8 *puVar14;
  uint *puVar15;
  uint uVar16;
  long lVar17;
  undefined1 auVar18 [16];
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000044;
  undefined1 uStack0000000000000050;
  ulong uStack_70;
  undefined1 uStack_61;
  
  uVar8 = __Unwind_Resume();
  _close();
  _close();
  func_0x003f6fd8(&uStack0000000000000050);
  func_0x003f7050(&uStack0000000000000044);
  func_0x003f7b94(&uStack0000000000000010);
  auVar18 = __Unwind_Resume(uVar8);
  puVar15 = auVar18._8_8_;
  lVar9 = auVar18._0_8_;
  uVar1 = *puVar15;
  if (uVar1 == 0) {
LAB_00437114:
    uVar2 = puVar15[2];
    if (uVar2 == 0) {
LAB_00437150:
      uVar3 = puVar15[4];
      if (uVar3 == 0) {
FUN_00437194:
        lVar17 = *(long *)(lVar9 + 0xb8);
        if (lVar17 == 0) {
LAB_004371b8:
          if ((*(int *)(lVar9 + 0x50) != 1) ||
             (iVar7 = _setgid(*(undefined4 *)(lVar9 + 0x54)), iVar7 != -1)) {
            if (*(int *)(lVar9 + 0x48) == 1) {
              uVar5 = *(undefined4 *)(lVar9 + 0x4c);
              if ((lVar17 == 0) && (iVar7 = _setgroups(0,0), iVar7 == -1)) {
                puVar10 = (uint *)___error();
                uVar12 = (ulong)*puVar10 << 0x20 | 2;
                uStack_70 = uVar12;
                if (*puVar10 != 1) goto LAB_004372c4;
                func_0x003f67e4(&uStack_70);
                lVar17 = 0x100000002;
              }
              iVar7 = _setuid(uVar5);
              if (iVar7 == -1) goto LAB_004372b4;
            }
            if ((((*(long *)(lVar9 + 0xa8) == 0) || (iVar7 = _chdir(), iVar7 != -1)) &&
                ((*(int *)(lVar9 + 0x58) != 1 ||
                 (iVar7 = _setpgid(0,*(undefined4 *)(lVar9 + 0x5c)), iVar7 != -1)))) &&
               ((cRam0000000000a3bfd1 != '\0' || (lVar11 = _signal(0xd,0), lVar11 != -1)))) {
              puVar14 = *(undefined8 **)(lVar9 + 0x38);
              lVar11 = *(long *)(lVar9 + 0x40) << 4;
              do {
                if (lVar11 == 0) {
                  if (param_3 != 0) {
                    plVar13 = (long *)__NSGetEnviron();
                    lVar17 = *plVar13;
                    uVar8 = *(undefined8 *)(param_3 + 0x20);
                    puVar14 = (undefined8 *)__NSGetEnviron();
                    *puVar14 = uVar8;
                  }
                  _execvp(*(undefined8 *)(lVar9 + 0x98),*(undefined8 *)(lVar9 + 0x20));
                  puVar10 = (uint *)___error();
                  uVar16 = *puVar10;
                  if (param_3 != 0) {
                    plVar13 = (long *)__NSGetEnviron();
                    *plVar13 = lVar17;
                  }
                  if (1 < uVar1) {
                    _close(puVar15[1]);
                  }
                  uVar12 = (ulong)uVar16 << 0x20 | 2;
                  if (1 < uVar2) {
                    _close(puVar15[3]);
                  }
                  if (uVar3 < 2) {
                    return uVar12;
                  }
                  goto code_r0x00437314;
                }
                uVar12 = (**(code **)(puVar14[1] + 0x20))(*puVar14);
                puVar14 = puVar14 + 2;
                lVar11 = lVar11 + -0x10;
                lVar17 = 0;
              } while (uVar12 == 0);
              goto LAB_004372c4;
            }
          }
        }
        else {
          if (*(ulong *)(lVar9 + 0xc0) >> 0x1f != 0) {
            func_0x007a2810(&UNK_008851be,0x2b,&uStack_61,&UNK_009d9398,&UNK_009dc128);
                    /* WARNING: Does not return */
            pcVar6 = (code *)SoftwareBreakpoint(1,0x4373f0);
            (*pcVar6)();
          }
          iVar7 = _setgroups(*(ulong *)(lVar9 + 0xc0),lVar17);
          if (iVar7 != -1) goto LAB_004371b8;
        }
LAB_004372b4:
        puVar10 = (uint *)___error();
        uVar12 = (ulong)*puVar10 << 0x20 | 2;
        goto LAB_004372c4;
      }
      uVar4 = puVar15[5];
      do {
        iVar7 = _dup2(uVar4,2);
        if (iVar7 != -1) goto FUN_00437194;
        puVar10 = (uint *)___error();
        uVar16 = *puVar10;
      } while (uVar16 == 4);
    }
    else {
      uVar3 = puVar15[3];
      do {
        iVar7 = _dup2(uVar3,1);
        if (iVar7 != -1) goto LAB_00437150;
        puVar10 = (uint *)___error();
        uVar16 = *puVar10;
      } while (uVar16 == 4);
    }
  }
  else {
    uVar2 = puVar15[1];
    do {
      iVar7 = _dup2(uVar2,0);
      if (iVar7 != -1) goto LAB_00437114;
      puVar10 = (uint *)___error();
      uVar16 = *puVar10;
    } while (uVar16 == 4);
  }
  uVar12 = (ulong)uVar16 << 0x20 | 2;
LAB_004372c4:
  if (uVar1 < 2) {
    uVar1 = puVar15[2];
  }
  else {
    _close(puVar15[1]);
    uVar1 = puVar15[2];
  }
  if (uVar1 < 2) {
    uVar1 = puVar15[4];
  }
  else {
    _close(puVar15[3]);
    uVar1 = puVar15[4];
  }
  if (1 < uVar1) {
code_r0x00437314:
    _close(puVar15[5]);
  }
  return uVar12;
}

