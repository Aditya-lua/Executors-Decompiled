
ulong FUN_004370d0(long param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  undefined4 uVar5;
  code *pcVar6;
  int iVar7;
  uint *puVar8;
  long lVar9;
  ulong uVar10;
  long *plVar11;
  undefined8 *puVar12;
  uint uVar13;
  long unaff_x20;
  long lVar14;
  undefined8 uVar15;
  undefined1 uStack000000000000000f;
  
  uVar1 = *param_2;
  if (uVar1 == 0) {
LAB_00437114:
    uVar2 = param_2[2];
    if (uVar2 == 0) {
LAB_00437150:
      uVar3 = param_2[4];
      if (uVar3 == 0) {
FUN_00437194:
        lVar14 = *(long *)(param_1 + 0xb8);
        if (lVar14 == 0) {
LAB_004371b8:
          if ((*(int *)(param_1 + 0x50) != 1) ||
             (iVar7 = _setgid(*(undefined4 *)(param_1 + 0x54)), iVar7 != -1)) {
            if (*(int *)(param_1 + 0x48) == 1) {
              uVar5 = *(undefined4 *)(param_1 + 0x4c);
              if ((lVar14 == 0) && (iVar7 = _setgroups(0,0), iVar7 == -1)) {
                puVar8 = (uint *)___error();
                uVar10 = (ulong)*puVar8 << 0x20 | 2;
                if (*puVar8 != 1) goto LAB_004372c4;
                func_0x003f67e4();
                lVar14 = 0x100000002;
              }
              iVar7 = _setuid(uVar5);
              if (iVar7 == -1) goto LAB_004372b4;
            }
            if ((((*(long *)(param_1 + 0xa8) == 0) || (iVar7 = _chdir(), iVar7 != -1)) &&
                ((*(int *)(param_1 + 0x58) != 1 ||
                 (iVar7 = _setpgid(0,*(undefined4 *)(param_1 + 0x5c)), iVar7 != -1)))) &&
               ((cRam0000000000a3bfd1 != '\0' || (lVar9 = _signal(0xd,0), lVar9 != -1)))) {
              puVar12 = *(undefined8 **)(param_1 + 0x38);
              lVar9 = *(long *)(param_1 + 0x40) << 4;
              do {
                if (lVar9 == 0) {
                  if (unaff_x20 != 0) {
                    plVar11 = (long *)__NSGetEnviron();
                    lVar14 = *plVar11;
                    uVar15 = *(undefined8 *)(unaff_x20 + 0x20);
                    puVar12 = (undefined8 *)__NSGetEnviron();
                    *puVar12 = uVar15;
                  }
                  _execvp(*(undefined8 *)(param_1 + 0x98),*(undefined8 *)(param_1 + 0x20));
                  puVar8 = (uint *)___error();
                  uVar13 = *puVar8;
                  if (unaff_x20 != 0) {
                    plVar11 = (long *)__NSGetEnviron();
                    *plVar11 = lVar14;
                  }
                  if (1 < uVar1) {
                    _close(param_2[1]);
                  }
                  uVar10 = (ulong)uVar13 << 0x20 | 2;
                  if (1 < uVar2) {
                    _close(param_2[3]);
                  }
                  if (uVar3 < 2) {
                    return uVar10;
                  }
                  goto code_r0x00437314;
                }
                uVar10 = (**(code **)(puVar12[1] + 0x20))(*puVar12);
                puVar12 = puVar12 + 2;
                lVar9 = lVar9 + -0x10;
                lVar14 = 0;
              } while (uVar10 == 0);
              goto LAB_004372c4;
            }
          }
        }
        else {
          if (*(ulong *)(param_1 + 0xc0) >> 0x1f != 0) {
            func_0x007a2810(&UNK_008851be,0x2b,&uStack000000000000000f,&UNK_009d9398,&UNK_009dc128);
                    /* WARNING: Does not return */
            pcVar6 = (code *)SoftwareBreakpoint(1,0x4373f0);
            (*pcVar6)();
          }
          iVar7 = _setgroups(*(ulong *)(param_1 + 0xc0),lVar14);
          if (iVar7 != -1) goto LAB_004371b8;
        }
LAB_004372b4:
        puVar8 = (uint *)___error();
        uVar10 = (ulong)*puVar8 << 0x20 | 2;
        goto LAB_004372c4;
      }
      uVar4 = param_2[5];
      do {
        iVar7 = _dup2(uVar4,2);
        if (iVar7 != -1) goto FUN_00437194;
        puVar8 = (uint *)___error();
        uVar13 = *puVar8;
      } while (uVar13 == 4);
    }
    else {
      uVar3 = param_2[3];
      do {
        iVar7 = _dup2(uVar3,1);
        if (iVar7 != -1) goto LAB_00437150;
        puVar8 = (uint *)___error();
        uVar13 = *puVar8;
      } while (uVar13 == 4);
    }
  }
  else {
    uVar2 = param_2[1];
    do {
      iVar7 = _dup2(uVar2,0);
      if (iVar7 != -1) goto LAB_00437114;
      puVar8 = (uint *)___error();
      uVar13 = *puVar8;
    } while (uVar13 == 4);
  }
  uVar10 = (ulong)uVar13 << 0x20 | 2;
LAB_004372c4:
  if (uVar1 < 2) {
    uVar1 = param_2[2];
  }
  else {
    _close(param_2[1]);
    uVar1 = param_2[2];
  }
  if (uVar1 < 2) {
    uVar1 = param_2[4];
  }
  else {
    _close(param_2[3]);
    uVar1 = param_2[4];
  }
  if (1 < uVar1) {
code_r0x00437314:
    _close(param_2[5]);
  }
  return uVar10;
}

