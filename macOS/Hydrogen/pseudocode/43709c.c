
ulong FUN_0043709c(undefined8 param_1,undefined8 param_2,long param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  undefined4 uVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  uint *puVar9;
  long lVar10;
  ulong uVar11;
  long *plVar12;
  undefined8 *puVar13;
  uint *puVar14;
  uint uVar15;
  long lVar16;
  undefined8 uVar17;
  undefined1 auVar18 [16];
  undefined1 uStack0000000000000010;
  ulong uStack_70;
  undefined1 uStack_61;
  
  func_0x003f7b94(&uStack0000000000000010);
  auVar18 = __Unwind_Resume();
  puVar14 = auVar18._8_8_;
  lVar8 = auVar18._0_8_;
  uVar1 = *puVar14;
  if (uVar1 == 0) {
code_r0x00437114:
    uVar2 = puVar14[2];
    if (uVar2 == 0) {
code_r0x00437150:
      uVar3 = puVar14[4];
      if (uVar3 == 0) {
code_r0x00437194:
        lVar16 = *(long *)(lVar8 + 0xb8);
        if (lVar16 == 0) {
code_r0x004371b8:
          if ((*(int *)(lVar8 + 0x50) != 1) ||
             (iVar7 = _setgid(*(undefined4 *)(lVar8 + 0x54)), iVar7 != -1)) {
            if (*(int *)(lVar8 + 0x48) == 1) {
              uVar5 = *(undefined4 *)(lVar8 + 0x4c);
              if ((lVar16 == 0) && (iVar7 = _setgroups(0,0), iVar7 == -1)) {
                puVar9 = (uint *)___error();
                uVar11 = (ulong)*puVar9 << 0x20 | 2;
                uStack_70 = uVar11;
                if (*puVar9 != 1) goto LAB_004372c4;
                func_0x003f67e4(&uStack_70);
                lVar16 = 0x100000002;
              }
              iVar7 = _setuid(uVar5);
              if (iVar7 == -1) goto LAB_004372b4;
            }
            if ((((*(long *)(lVar8 + 0xa8) == 0) || (iVar7 = _chdir(), iVar7 != -1)) &&
                ((*(int *)(lVar8 + 0x58) != 1 ||
                 (iVar7 = _setpgid(0,*(undefined4 *)(lVar8 + 0x5c)), iVar7 != -1)))) &&
               ((cRam0000000000a3bfd1 != '\0' || (lVar10 = _signal(0xd,0), lVar10 != -1)))) {
              puVar13 = *(undefined8 **)(lVar8 + 0x38);
              lVar10 = *(long *)(lVar8 + 0x40) << 4;
              do {
                if (lVar10 == 0) {
                  if (param_3 != 0) {
                    plVar12 = (long *)__NSGetEnviron();
                    lVar16 = *plVar12;
                    uVar17 = *(undefined8 *)(param_3 + 0x20);
                    puVar13 = (undefined8 *)__NSGetEnviron();
                    *puVar13 = uVar17;
                  }
                  _execvp(*(undefined8 *)(lVar8 + 0x98),*(undefined8 *)(lVar8 + 0x20));
                  puVar9 = (uint *)___error();
                  uVar15 = *puVar9;
                  if (param_3 != 0) {
                    plVar12 = (long *)__NSGetEnviron();
                    *plVar12 = lVar16;
                  }
                  if (1 < uVar1) {
                    _close(puVar14[1]);
                  }
                  uVar11 = (ulong)uVar15 << 0x20 | 2;
                  if (1 < uVar2) {
                    _close(puVar14[3]);
                  }
                  if (uVar3 < 2) {
                    return uVar11;
                  }
                  goto code_r0x00437314;
                }
                uVar11 = (**(code **)(puVar13[1] + 0x20))(*puVar13);
                puVar13 = puVar13 + 2;
                lVar10 = lVar10 + -0x10;
                lVar16 = 0;
              } while (uVar11 == 0);
              goto LAB_004372c4;
            }
          }
        }
        else {
          if (*(ulong *)(lVar8 + 0xc0) >> 0x1f != 0) {
            func_0x007a2810(&UNK_008851be,0x2b,&uStack_61,&UNK_009d9398,&UNK_009dc128);
                    /* WARNING: Does not return */
            pcVar6 = (code *)SoftwareBreakpoint(1,0x4373f0);
            (*pcVar6)();
          }
          iVar7 = _setgroups(*(ulong *)(lVar8 + 0xc0),lVar16);
          if (iVar7 != -1) goto code_r0x004371b8;
        }
LAB_004372b4:
        puVar9 = (uint *)___error();
        uVar11 = (ulong)*puVar9 << 0x20 | 2;
        goto LAB_004372c4;
      }
      uVar4 = puVar14[5];
      do {
        iVar7 = _dup2(uVar4,2);
        if (iVar7 != -1) goto code_r0x00437194;
        puVar9 = (uint *)___error();
        uVar15 = *puVar9;
      } while (uVar15 == 4);
    }
    else {
      uVar3 = puVar14[3];
      do {
        iVar7 = _dup2(uVar3,1);
        if (iVar7 != -1) goto code_r0x00437150;
        puVar9 = (uint *)___error();
        uVar15 = *puVar9;
      } while (uVar15 == 4);
    }
  }
  else {
    uVar2 = puVar14[1];
    do {
      iVar7 = _dup2(uVar2,0);
      if (iVar7 != -1) goto code_r0x00437114;
      puVar9 = (uint *)___error();
      uVar15 = *puVar9;
    } while (uVar15 == 4);
  }
  uVar11 = (ulong)uVar15 << 0x20 | 2;
LAB_004372c4:
  if (uVar1 < 2) {
    uVar1 = puVar14[2];
  }
  else {
    _close(puVar14[1]);
    uVar1 = puVar14[2];
  }
  if (uVar1 < 2) {
    uVar1 = puVar14[4];
  }
  else {
    _close(puVar14[3]);
    uVar1 = puVar14[4];
  }
  if (1 < uVar1) {
code_r0x00437314:
    _close(puVar14[5]);
  }
  return uVar11;
}

