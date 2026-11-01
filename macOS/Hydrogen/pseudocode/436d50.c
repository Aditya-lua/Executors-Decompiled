
/* WARNING: Possible PIC construction at 0x00436f0c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00436f10) */
/* WARNING: Removing unreachable block (ram,0x00436f38) */
/* WARNING: Removing unreachable block (ram,0x00436fac) */
/* WARNING: Removing unreachable block (ram,0x00436fe4) */
/* WARNING: Removing unreachable block (ram,0x00436fec) */
/* WARNING: Removing unreachable block (ram,0x0043708c) */
/* WARNING: Removing unreachable block (ram,0x00436f7c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1 * FUN_00436d50(void)

{
  bool bVar1;
  undefined8 *puVar2;
  undefined4 uVar3;
  uint uVar4;
  undefined8 uVar5;
  ulong uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  code *pcVar10;
  int iVar11;
  long lVar12;
  uint *puVar13;
  undefined1 *puVar14;
  long lVar15;
  long *plVar16;
  undefined8 *puVar17;
  undefined *puVar18;
  uint uVar19;
  dword *pdVar20;
  int *unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long lVar21;
  undefined8 uVar22;
  undefined8 unaff_x22;
  uint unaff_w25;
  long unaff_x26;
  uint unaff_w27;
  long unaff_x29;
  undefined1 auVar23 [16];
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000040;
  int iStack0000000000000048;
  uint uStack000000000000004c;
  uint uStack0000000000000050;
  undefined4 uStack0000000000000054;
  uint uStack0000000000000058;
  undefined4 uStack000000000000005c;
  uint uStack0000000000000060;
  uint uStack0000000000000064;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 uStack0000000000000080;
  int in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 uStack0000000000000098;
  undefined8 in_stack_000000a0;
  undefined8 uStack00000000000000a8;
  undefined *in_stack_000000b0;
  undefined1 *puStack_70;
  undefined1 uStack_61;
  
  func_0x003f7738(unaff_x29 + -0x98);
  _posix_spawn_file_actions_destroy(&uStack0000000000000098);
  puVar14 = (undefined1 *)_posix_spawnattr_destroy(&uStack0000000000000070);
  if (unaff_w21 == 2) {
    puVar14 = (undefined1 *)func_0x0042f6e4(unaff_x29 + -0x98);
    uVar22 = *(undefined8 *)(unaff_x29 + -0x90);
    if (*(int *)(unaff_x29 + -0x98) == 1) {
      *(undefined8 *)(unaff_x19 + 2) = uVar22;
      *unaff_x19 = 2;
    }
    else {
      uVar3 = *(undefined4 *)(unaff_x29 + -0x94);
      auVar23 = func_0x0042eea4();
      _uStack0000000000000070 = auVar23;
      iVar11 = _fork();
      uVar6 = ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E;
      if (iVar11 != -1) {
        if (iVar11 != 0) {
          *(undefined1 (*) [16])(unaff_x29 + -0x98) = auVar23;
          func_0x003f7738(unaff_x29 + -0x98);
          _close(uVar22);
          uStack0000000000000080._0_4_ = 0;
          uStack0000000000000090 = 0;
          in_stack_00000088 = iVar11;
          do {
            lVar12 = _read(uVar3,&uStack0000000000000090,8);
            if (lVar12 != -1) {
              if (lVar12 == 0) {
                bVar1 = false;
                *(ulong *)(unaff_x29 + -0x98) =
                     CONCAT44(uStack0000000000000080._4_4_,(undefined4)uStack0000000000000080);
                *(ulong *)(unaff_x26 + 0x1c) =
                     CONCAT44(iStack0000000000000048,in_stack_00000040._4_4_);
                *(int *)(unaff_x29 + -0x90) = in_stack_00000088;
                *(uint *)(unaff_x29 + -0x84) = uStack000000000000004c;
                uVar22 = *(undefined8 *)(unaff_x26 + 0x10);
                *(undefined8 *)(unaff_x19 + 2) = *(undefined8 *)(unaff_x26 + 0x18);
                *(undefined8 *)unaff_x19 = uVar22;
                *(undefined8 *)(unaff_x19 + 4) = *(undefined8 *)(unaff_x29 + -0x88);
                puVar14 = (undefined1 *)_close(uVar3);
                goto joined_r0x00436b44;
              }
              if (lVar12 == 8) {
                uStack0000000000000098 = (ulong)&uStack0000000000000090 | 4;
                in_stack_000000a0 = 4;
                if (uStack0000000000000090._4_4_ != 0x58454f4e) {
                  in_stack_000000b0 = &DAT_003f7d94;
                  *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc068;
                  *(undefined8 *)(unaff_x29 + -0x90) = 1;
                  *(undefined8 **)(unaff_x29 + -0x88) = &uStack00000000000000a8;
                  *(undefined8 *)(unaff_x29 + -0x80) = 1;
                  *(undefined8 *)(unaff_x29 + -0x78) = 0;
                  uStack00000000000000a8 = &uStack0000000000000090;
                  func_0x0079ffa8(0,&UNK_008884c8,&uStack0000000000000098,unaff_x29 + -0x98,
                                  &UNK_009dc078);
                  goto code_r0x00436ed8;
                }
                uVar4 = (uint)uStack0000000000000090;
                func_0x00437464(unaff_x29 + -0x98,&uStack0000000000000080);
                if (*(int *)(unaff_x29 + -0x98) == 0) {
                  uVar4 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
                  *(ulong *)(unaff_x19 + 2) = (ulong)(uVar4 >> 0x10 | uVar4 << 0x10) << 0x20 | 2;
                  *unaff_x19 = 2;
                  goto code_r0x00436ae4;
                }
                func_0x003f67e4(unaff_x29 + -0x90);
                *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc040;
                puVar18 = &UNK_009dc050;
              }
              else {
                func_0x00437464(unaff_x29 + -0x98,&uStack0000000000000080);
                if (*(int *)(unaff_x29 + -0x98) == 0) {
                  *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc090;
                  puVar18 = &UNK_009dc0a0;
                }
                else {
                  func_0x003f67e4(unaff_x29 + -0x90);
                  *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc040;
                  puVar18 = &UNK_009dc0b8;
                }
              }
              *(undefined8 *)(unaff_x29 + -0x90) = 1;
              *(undefined8 *)(unaff_x29 + -0x88) = 8;
              *(undefined8 *)(unaff_x29 + -0x80) = 0;
              *(undefined8 *)(unaff_x29 + -0x78) = 0;
              func_0x007a2420(unaff_x29 + -0x98,puVar18);
              goto code_r0x00436ed8;
            }
            puVar13 = (uint *)___error();
          } while (*puVar13 == 4);
          uStack0000000000000098 = (ulong)*puVar13 << 0x20 | 2;
          func_0x00437464(unaff_x29 + -0x98,&uStack0000000000000080);
          bVar1 = *(int *)(unaff_x29 + -0x98) != 0;
          if (bVar1) {
            func_0x003f67e4(unaff_x29 + -0x90);
            *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc040;
            puVar18 = &UNK_009dc0f8;
            pdVar20 = &MACH_HEADER.cpusubtype;
          }
          else {
            uStack00000000000000a8 = &uStack0000000000000098;
            in_stack_000000b0 =
                 &
                 __ZN58__LT_std__io__error__Error_u20_as_u20_core__fmt__Debug_GT_3fmt17h358f373ac5c2feacE
            ;
            *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc0d0;
            puVar18 = &UNK_009dc0e0;
            pdVar20 = (dword *)&uStack00000000000000a8;
          }
          *(undefined8 *)(unaff_x29 + -0x90) = 1;
          *(dword **)(unaff_x29 + -0x88) = pdVar20;
          *(ulong *)(unaff_x29 + -0x80) = (ulong)!bVar1;
          *(undefined8 *)(unaff_x29 + -0x78) = 0;
          func_0x007a2420(unaff_x29 + -0x98,puVar18);
code_r0x00436ed8:
                    /* WARNING: Does not return */
          pcVar10 = (code *)SoftwareBreakpoint(1,0x436edc);
          (*pcVar10)();
        }
        ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E =
             ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E |
             0x8000000000000000;
        _close(uVar6,uVar3);
        uVar3 = uStack0000000000000054;
        uVar4 = uStack0000000000000050;
        puVar2 = (undefined8 *)0x0;
        if (uStack0000000000000010 != -0x8000000000000000) {
          puVar2 = &uStack0000000000000010;
        }
        if (uStack0000000000000050 == 0) {
LAB_00437114:
          uVar3 = uStack000000000000005c;
          uVar7 = uStack0000000000000058;
          if (uStack0000000000000058 == 0) {
LAB_00437150:
            uVar9 = uStack0000000000000064;
            uVar8 = uStack0000000000000060;
            if (uStack0000000000000060 == 0) {
FUN_00437194:
              lVar12 = *(long *)(unaff_x20 + 0xb8);
              if (lVar12 == 0) {
LAB_004371b8:
                if (*(int *)(unaff_x20 + 0x50) == 1) {
                  iVar11 = _setgid(*(undefined4 *)(unaff_x20 + 0x54));
                  if (iVar11 == -1) goto LAB_004372b4;
                }
                if (*(int *)(unaff_x20 + 0x48) == 1) {
                  uVar3 = *(undefined4 *)(unaff_x20 + 0x4c);
                  if (lVar12 == 0) {
                    iVar11 = _setgroups(0,0);
                    if (iVar11 == -1) {
                      puVar13 = (uint *)___error();
                      puVar14 = (undefined1 *)((ulong)*puVar13 << 0x20 | 2);
                      puStack_70 = puVar14;
                      if (*puVar13 != 1) goto LAB_004372c4;
                      func_0x003f67e4(&puStack_70);
                      lVar12 = 0x100000002;
                    }
                  }
                  iVar11 = _setuid(uVar3);
                  if (iVar11 == -1) goto LAB_004372b4;
                }
                if (*(long *)(unaff_x20 + 0xa8) != 0) {
                  iVar11 = _chdir();
                  if (iVar11 == -1) goto LAB_004372b4;
                }
                if (*(int *)(unaff_x20 + 0x58) == 1) {
                  iVar11 = _setpgid(0,*(undefined4 *)(unaff_x20 + 0x5c));
                  if (iVar11 == -1) goto LAB_004372b4;
                }
                if (cRam0000000000a3bfd1 == '\0') {
                  lVar15 = _signal(0xd,0);
                  if (lVar15 == -1) goto LAB_004372b4;
                }
                puVar17 = *(undefined8 **)(unaff_x20 + 0x38);
                lVar15 = *(long *)(unaff_x20 + 0x40) << 4;
                do {
                  if (lVar15 == 0) {
                    if (puVar2 != (undefined8 *)0x0) {
                      plVar16 = (long *)__NSGetEnviron();
                      lVar12 = *plVar16;
                      uVar22 = puVar2[4];
                      puVar17 = (undefined8 *)__NSGetEnviron();
                      *puVar17 = uVar22;
                    }
                    _execvp(*(undefined8 *)(unaff_x20 + 0x98),*(undefined8 *)(unaff_x20 + 0x20));
                    puVar13 = (uint *)___error();
                    uVar19 = *puVar13;
                    if (puVar2 != (undefined8 *)0x0) {
                      plVar16 = (long *)__NSGetEnviron();
                      *plVar16 = lVar12;
                    }
                    if (1 < uVar4) {
                      _close(uStack0000000000000054);
                    }
                    puVar14 = (undefined1 *)((ulong)uVar19 << 0x20 | 2);
                    if (1 < uVar7) {
                      _close(uStack000000000000005c);
                    }
                    if (uVar8 < 2) {
                      return puVar14;
                    }
                    goto code_r0x00437314;
                  }
                  puVar14 = (undefined1 *)(**(code **)(puVar17[1] + 0x20))(*puVar17);
                  puVar17 = puVar17 + 2;
                  lVar15 = lVar15 + -0x10;
                  lVar12 = 0;
                } while (puVar14 == (undefined1 *)0x0);
              }
              else {
                if (*(ulong *)(unaff_x20 + 0xc0) >> 0x1f != 0) {
                  func_0x007a2810(&UNK_008851be,0x2b,&uStack_61,&UNK_009d9398,&UNK_009dc128);
                    /* WARNING: Does not return */
                  pcVar10 = (code *)SoftwareBreakpoint(1,0x4373f0);
                  (*pcVar10)();
                }
                iVar11 = _setgroups(*(ulong *)(unaff_x20 + 0xc0),lVar12);
                if (iVar11 != -1) goto LAB_004371b8;
LAB_004372b4:
                puVar13 = (uint *)___error();
                puVar14 = (undefined1 *)((ulong)*puVar13 << 0x20 | 2);
              }
              goto LAB_004372c4;
            }
            do {
              iVar11 = _dup2(uVar9,2);
              if (iVar11 != -1) goto FUN_00437194;
              puVar13 = (uint *)___error();
              uVar19 = *puVar13;
            } while (uVar19 == 4);
          }
          else {
            do {
              iVar11 = _dup2(uVar3,1);
              if (iVar11 != -1) goto LAB_00437150;
              puVar13 = (uint *)___error();
              uVar19 = *puVar13;
            } while (uVar19 == 4);
          }
        }
        else {
          do {
            iVar11 = _dup2(uVar3,0);
            if (iVar11 != -1) goto LAB_00437114;
            puVar13 = (uint *)___error();
            uVar19 = *puVar13;
          } while (uVar19 == 4);
        }
        puVar14 = (undefined1 *)((ulong)uVar19 << 0x20 | 2);
LAB_004372c4:
        if (1 < uVar4) {
          _close(uStack0000000000000054);
        }
        if (1 < uStack0000000000000058) {
          _close(uStack000000000000005c);
        }
        if (1 < uStack0000000000000060) {
code_r0x00437314:
          _close(uStack0000000000000064);
        }
        return puVar14;
      }
      puVar13 = (uint *)___error();
      *(ulong *)(unaff_x19 + 2) = (ulong)*puVar13 << 0x20 | 2;
      *unaff_x19 = 2;
      func_0x003f7738(&uStack0000000000000070);
      _close(uVar22);
code_r0x00436ae4:
      puVar14 = (undefined1 *)_close(uVar3);
    }
    bVar1 = true;
joined_r0x00436b44:
    if (1 < uStack0000000000000050) {
      puVar14 = (undefined1 *)_close(uStack0000000000000054);
    }
    if (1 < uStack0000000000000058) {
      puVar14 = (undefined1 *)_close(uStack000000000000005c);
    }
    if (1 < uStack0000000000000060) {
      puVar14 = (undefined1 *)_close(uStack0000000000000064);
    }
    if (!bVar1) goto code_r0x0043679c;
    if (in_stack_00000040._4_4_ != -1) {
      _close();
    }
    if (iStack0000000000000048 != -1) {
      _close();
    }
    puVar14 = (undefined1 *)(ulong)uStack000000000000004c;
    if (uStack000000000000004c == 0xffffffff) goto code_r0x0043679c;
  }
  else {
    *(ulong *)(unaff_x19 + 3) = CONCAT44(iStack0000000000000048,in_stack_00000040._4_4_);
    unaff_x19[5] = uStack000000000000004c;
    *unaff_x19 = unaff_w21;
    *(undefined8 *)(unaff_x19 + 1) = unaff_x22;
    if (unaff_w25 < 2) {
      if (1 < unaff_w27) goto code_r0x00436e04;
code_r0x00436d98:
      uVar22 = uStack0000000000000070;
      uVar5 = in_stack_00000078;
    }
    else {
      puVar14 = (undefined1 *)_close(uStack0000000000000054);
      if (unaff_w27 < 2) goto code_r0x00436d98;
code_r0x00436e04:
      puVar14 = (undefined1 *)_close(uStack000000000000005c);
      uVar22 = uStack0000000000000070;
      uVar5 = in_stack_00000078;
    }
    if (in_stack_00000008._4_4_ < 2) goto code_r0x0043679c;
    in_stack_00000078 = uVar5;
    uStack0000000000000070 = uVar22;
    puVar14 = (undefined1 *)(ulong)uStack0000000000000064;
  }
  puVar14 = (undefined1 *)_close(puVar14);
code_r0x0043679c:
  lVar15 = in_stack_00000018;
  lVar12 = uStack0000000000000010;
  if (uStack0000000000000010 != -0x8000000000000000) {
    if (in_stack_00000020 != 0) {
      plVar16 = (long *)(in_stack_00000018 + 8);
      lVar21 = in_stack_00000020;
      do {
        puVar14 = (undefined1 *)plVar16[-1];
        *puVar14 = 0;
        if (*plVar16 != 0) {
          puVar14 = (undefined1 *)func_0x00187bd4(puVar14,*plVar16,1);
        }
        plVar16 = plVar16 + 2;
        lVar21 = lVar21 + -1;
      } while (lVar21 != 0);
    }
    if (lVar12 != 0) {
      puVar14 = (undefined1 *)func_0x00187bd4(lVar15,lVar12 << 4,8);
    }
    if (in_stack_00000028 != 0) {
      puVar14 = (undefined1 *)func_0x00187bd4(in_stack_00000030,in_stack_00000028 << 3,8);
    }
  }
  return puVar14;
}

