
/* WARNING: Possible PIC construction at 0x00436f0c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00436f10) */
/* WARNING: Removing unreachable block (ram,0x00436f38) */
/* WARNING: Removing unreachable block (ram,0x00436fac) */
/* WARNING: Removing unreachable block (ram,0x00436fe4) */
/* WARNING: Removing unreachable block (ram,0x00436fec) */
/* WARNING: Removing unreachable block (ram,0x0043708c) */
/* WARNING: Removing unreachable block (ram,0x00436f7c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1 * FUN_004368a8(void)

{
  bool bVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  ulong uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  dword dVar8;
  code *pcVar9;
  int iVar10;
  long lVar11;
  undefined1 *puVar12;
  uint *puVar13;
  undefined1 *puVar14;
  undefined8 *puVar15;
  long lVar16;
  long *plVar17;
  undefined8 *puVar18;
  uint uVar19;
  undefined *puVar20;
  uint uVar21;
  dword *pdVar22;
  dword *unaff_x19;
  long unaff_x20;
  long lVar23;
  undefined8 uVar24;
  long unaff_x24;
  long unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined1 auVar25 [16];
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
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
  undefined8 uStack00000000000000b0;
  undefined1 *puStack_70;
  undefined1 uStack_61;
  ulong uStack_60;
  ulong uStack_58;
  
  lVar11 = func_0x0046b0fc();
  if ((lVar11 != 1) || (*(long *)(unaff_x20 + 0x40) != 0 || *(long *)(unaff_x20 + 0xb8) != 0))
  goto LAB_004368dc;
  lVar11 = *(long *)(unaff_x20 + 0xa8);
  if (lVar11 == 0) {
    pcVar9 = (code *)0x0;
code_r0x00436b94:
    uVar19 = *(uint *)(unaff_x20 + 0x58);
    unaff_x28 = (ulong)uVar19;
    uVar2 = *(undefined4 *)(unaff_x20 + 0x5c);
    puVar12 = (undefined1 *)_posix_spawnattr_init(&uStack0000000000000070);
    puVar14 = puVar12;
    if ((int)puVar12 != 0) {
code_r0x00436cf4:
      *(ulong *)(unaff_x19 + 2) = (long)puVar14 << 0x20 | 2;
      goto code_r0x004368f8;
    }
    puVar14 = (undefined1 *)_posix_spawn_file_actions_init(&uStack0000000000000098);
    uVar5 = uStack0000000000000050;
    if ((int)puVar14 != 0) {
code_r0x00436cec:
      puVar12 = (undefined1 *)_posix_spawnattr_destroy(&uStack0000000000000070);
      goto code_r0x00436cf4;
    }
    if ((uStack0000000000000050 != 0) &&
       (puVar14 = (undefined1 *)
                  _posix_spawn_file_actions_adddup2
                            (&uStack0000000000000098,uStack0000000000000054,0), (int)puVar14 != 0))
    {
code_r0x00436ce4:
      _posix_spawn_file_actions_destroy(&uStack0000000000000098);
      goto code_r0x00436cec;
    }
    uVar21 = uStack0000000000000058;
    unaff_x27 = (ulong)uStack0000000000000058;
    if ((((uStack0000000000000058 != 0) &&
         (puVar14 = (undefined1 *)
                    _posix_spawn_file_actions_adddup2
                              (&uStack0000000000000098,uStack000000000000005c,1), (int)puVar14 != 0)
         ) || ((uVar6 = uStack0000000000000060, uStack0000000000000060 != 0 &&
               (puVar14 = (undefined1 *)
                          _posix_spawn_file_actions_adddup2
                                    (&uStack0000000000000098,uStack0000000000000064,2),
               (int)puVar14 != 0)))) ||
       ((pcVar9 != (code *)0x0 &&
        (puVar14 = (undefined1 *)(*pcVar9)(&uStack0000000000000098,lVar11), (int)puVar14 != 0))))
    goto code_r0x00436ce4;
    if ((uVar19 & 1) == 0) {
      uVar19 = 0;
    }
    else {
      puVar14 = (undefined1 *)_posix_spawnattr_setpgroup(&uStack0000000000000070,uVar2);
      if ((int)puVar14 != 0) goto code_r0x00436ce4;
      uVar19 = 2;
    }
    if (cRam0000000000a3bfd1 == '\0') {
      iVar10 = _sigemptyset(unaff_x29 + -0x98);
      if ((iVar10 == -1) || (iVar10 = _sigaddset(unaff_x29 + -0x98,0xd), iVar10 == -1)) {
        puVar13 = (uint *)___error();
        puVar14 = (undefined1 *)(ulong)*puVar13;
      }
      else {
        puVar14 = (undefined1 *)
                  _posix_spawnattr_setsigdefault(&uStack0000000000000070,unaff_x29 + -0x98);
        if (((int)puVar14 == 0) &&
           (puVar14 = (undefined1 *)_posix_spawnattr_setflags(&uStack0000000000000070,uVar19 | 4),
           (int)puVar14 == 0)) goto LAB_00436c6c;
      }
      goto code_r0x00436ce4;
    }
    puVar14 = (undefined1 *)_posix_spawnattr_setflags(&uStack0000000000000070,uVar19);
    if ((int)puVar14 != 0) goto code_r0x00436ce4;
LAB_00436c6c:
    auVar25 = func_0x0042eea4();
    *(undefined1 (*) [16])(unaff_x29 + -0x98) = auVar25;
    if (unaff_x24 == -0x8000000000000000) {
      puVar15 = (undefined8 *)__NSGetEnviron();
    }
    else {
      puVar15 = &uStack0000000000000030;
    }
    uStack00000000000000b0 = (undefined *)((ulong)uStack00000000000000b0 & 0xffffffff00000000);
    uStack00000000000000a8 = (undefined8 *)((ulong)uStack00000000000000a8 & 0xffffffff00000000);
    puVar14 = (undefined1 *)
              _posix_spawnp(&uStack00000000000000b0,*(undefined8 *)(unaff_x20 + 0x98),
                            &uStack0000000000000098,&uStack0000000000000070,
                            *(undefined8 *)(unaff_x20 + 0x20),*puVar15);
    if ((int)puVar14 != 0) {
      func_0x003f7738(unaff_x29 + -0x98);
      goto code_r0x00436ce4;
    }
    dVar8 = (dword)uStack00000000000000a8;
    uVar24 = *(undefined8 *)(unaff_x26 + 4);
    func_0x003f7738(unaff_x29 + -0x98);
    _posix_spawn_file_actions_destroy(&uStack0000000000000098);
    puVar12 = (undefined1 *)_posix_spawnattr_destroy(&uStack0000000000000070);
    if (dVar8 == 2) goto LAB_004368dc;
    *(ulong *)(unaff_x19 + 3) = CONCAT44(iStack0000000000000048,in_stack_00000040._4_4_);
    unaff_x19[5] = uStack000000000000004c;
    *unaff_x19 = dVar8;
    *(undefined8 *)(unaff_x19 + 1) = uVar24;
    if (uVar5 < 2) {
      if (1 < uVar21) goto code_r0x00436e04;
code_r0x00436d98:
      uVar24 = uStack0000000000000070;
      uVar3 = in_stack_00000078;
    }
    else {
      puVar12 = (undefined1 *)_close(uStack0000000000000054);
      if (uVar21 < 2) goto code_r0x00436d98;
code_r0x00436e04:
      puVar12 = (undefined1 *)_close(uStack000000000000005c);
      uVar24 = uStack0000000000000070;
      uVar3 = in_stack_00000078;
    }
    if (uVar6 < 2) goto LAB_0043679c;
    in_stack_00000078 = uVar3;
    uStack0000000000000070 = uVar24;
    puVar12 = (undefined1 *)(ulong)uStack0000000000000064;
  }
  else {
    if (*(char *)(unaff_x20 + 0xc9) == '\x01') goto LAB_004368dc;
    if (pcRam0000000000a2a658 != (code *)0x0) {
      pcVar9 = pcRam0000000000a2a658;
      if (pcRam0000000000a2a658 == (code *)((long)&MACH_HEADER.magic + 1)) {
        pcVar9 = (code *)func_0x007a1310(0xa2a648);
        if (pcVar9 != (code *)0x0) goto code_r0x00436b94;
        goto code_r0x00436b7c;
      }
code_r0x00436b90:
      DataMemoryBarrier(2,1);
      goto code_r0x00436b94;
    }
code_r0x00436b7c:
    if (pcRam0000000000a2a640 != (code *)0x0) {
      pcVar9 = pcRam0000000000a2a640;
      if (pcRam0000000000a2a640 != (code *)((long)&MACH_HEADER.magic + 1)) goto code_r0x00436b90;
      pcVar9 = (code *)func_0x007a1310(0xa2a630);
      if (pcVar9 != (code *)0x0) goto code_r0x00436b94;
    }
LAB_004368dc:
    puVar12 = (undefined1 *)func_0x0042f6e4(unaff_x29 + -0x98);
    uVar24 = *(undefined8 *)(unaff_x29 + -0x90);
    if (*(int *)(unaff_x29 + -0x98) == 1) {
      *(undefined8 *)(unaff_x19 + 2) = uVar24;
code_r0x004368f8:
      *unaff_x19 = 2;
    }
    else {
      uVar2 = *(undefined4 *)(unaff_x29 + -0x94);
      auVar25 = func_0x0042eea4();
      _uStack0000000000000070 = auVar25;
      iVar10 = _fork();
      uVar4 = ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E;
      if (iVar10 != -1) {
        if (iVar10 != 0) {
          *(undefined1 (*) [16])(unaff_x29 + -0x98) = auVar25;
          func_0x003f7738(unaff_x29 + -0x98);
          _close(uVar24);
          uStack0000000000000080._0_4_ = 0;
          uStack0000000000000090 = 0;
          in_stack_00000088 = iVar10;
          do {
            lVar11 = _read(uVar2,&uStack0000000000000090,8);
            if (lVar11 != -1) {
              if (lVar11 == 0) {
                bVar1 = false;
                *(ulong *)(unaff_x29 + -0x98) =
                     CONCAT44(uStack0000000000000080._4_4_,(undefined4)uStack0000000000000080);
                *(ulong *)(unaff_x26 + 0x1c) =
                     CONCAT44(iStack0000000000000048,in_stack_00000040._4_4_);
                *(int *)(unaff_x29 + -0x90) = in_stack_00000088;
                *(uint *)(unaff_x29 + -0x84) = uStack000000000000004c;
                uVar24 = *(undefined8 *)(unaff_x26 + 0x10);
                *(undefined8 *)(unaff_x19 + 2) = *(undefined8 *)(unaff_x26 + 0x18);
                *(undefined8 *)unaff_x19 = uVar24;
                *(undefined8 *)(unaff_x19 + 4) = *(undefined8 *)(unaff_x29 + -0x88);
                puVar12 = (undefined1 *)_close(uVar2);
                goto joined_r0x00436b44;
              }
              if (lVar11 == 8) {
                uStack0000000000000098 = (ulong)&uStack0000000000000090 | 4;
                in_stack_000000a0 = 4;
                if (uStack0000000000000090._4_4_ != 0x58454f4e) {
                  uStack00000000000000b0 = &DAT_003f7d94;
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
                uVar19 = (uint)uStack0000000000000090;
                func_0x00437464(unaff_x29 + -0x98,&uStack0000000000000080);
                if (*(int *)(unaff_x29 + -0x98) == 0) {
                  uVar19 = (uVar19 & 0xff00ff00) >> 8 | (uVar19 & 0xff00ff) << 8;
                  *(ulong *)(unaff_x19 + 2) = (ulong)(uVar19 >> 0x10 | uVar19 << 0x10) << 0x20 | 2;
                  *unaff_x19 = 2;
                  goto code_r0x00436ae4;
                }
                func_0x003f67e4(unaff_x29 + -0x90);
                *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc040;
                puVar20 = &UNK_009dc050;
              }
              else {
                func_0x00437464(unaff_x29 + -0x98,&uStack0000000000000080);
                if (*(int *)(unaff_x29 + -0x98) == 0) {
                  *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc090;
                  puVar20 = &UNK_009dc0a0;
                }
                else {
                  func_0x003f67e4(unaff_x29 + -0x90);
                  *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc040;
                  puVar20 = &UNK_009dc0b8;
                }
              }
              *(undefined8 *)(unaff_x29 + -0x90) = 1;
              *(undefined8 *)(unaff_x29 + -0x88) = 8;
              *(undefined8 *)(unaff_x29 + -0x80) = 0;
              *(undefined8 *)(unaff_x29 + -0x78) = 0;
              func_0x007a2420(unaff_x29 + -0x98,puVar20);
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
            puVar20 = &UNK_009dc0f8;
            pdVar22 = &MACH_HEADER.cpusubtype;
          }
          else {
            uStack00000000000000a8 = &uStack0000000000000098;
            uStack00000000000000b0 =
                 &
                 __ZN58__LT_std__io__error__Error_u20_as_u20_core__fmt__Debug_GT_3fmt17h358f373ac5c2feacE
            ;
            *(undefined **)(unaff_x29 + -0x98) = &UNK_009dc0d0;
            puVar20 = &UNK_009dc0e0;
            pdVar22 = (dword *)&uStack00000000000000a8;
          }
          *(undefined8 *)(unaff_x29 + -0x90) = 1;
          *(dword **)(unaff_x29 + -0x88) = pdVar22;
          *(ulong *)(unaff_x29 + -0x80) = (ulong)!bVar1;
          *(undefined8 *)(unaff_x29 + -0x78) = 0;
          func_0x007a2420(unaff_x29 + -0x98,puVar20);
code_r0x00436ed8:
                    /* WARNING: Does not return */
          pcVar9 = (code *)SoftwareBreakpoint(1,0x436edc);
          (*pcVar9)();
        }
        ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E =
             ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E |
             0x8000000000000000;
        _close(uVar4,uVar2);
        uVar2 = uStack0000000000000054;
        uVar19 = uStack0000000000000050;
        puVar15 = (undefined8 *)0x0;
        if (uStack0000000000000010 != -0x8000000000000000) {
          puVar15 = &uStack0000000000000010;
        }
        uStack_60 = unaff_x28;
        uStack_58 = unaff_x27;
        if (uStack0000000000000050 == 0) {
code_r0x00437114:
          uVar2 = uStack000000000000005c;
          uVar5 = uStack0000000000000058;
          if (uStack0000000000000058 == 0) {
code_r0x00437150:
            uVar7 = uStack0000000000000064;
            uVar6 = uStack0000000000000060;
            if (uStack0000000000000060 == 0) {
code_r0x00437194:
              lVar11 = *(long *)(unaff_x20 + 0xb8);
              if (lVar11 == 0) {
code_r0x004371b8:
                if (*(int *)(unaff_x20 + 0x50) == 1) {
                  iVar10 = _setgid(*(undefined4 *)(unaff_x20 + 0x54));
                  if (iVar10 == -1) goto code_r0x004372b4;
                }
                if (*(int *)(unaff_x20 + 0x48) == 1) {
                  uVar2 = *(undefined4 *)(unaff_x20 + 0x4c);
                  if (lVar11 == 0) {
                    iVar10 = _setgroups(0,0);
                    if (iVar10 == -1) {
                      puVar13 = (uint *)___error();
                      puVar12 = (undefined1 *)((ulong)*puVar13 << 0x20 | 2);
                      puStack_70 = puVar12;
                      if (*puVar13 != 1) goto code_r0x004372c4;
                      func_0x003f67e4(&puStack_70);
                      lVar11 = 0x100000002;
                    }
                  }
                  iVar10 = _setuid(uVar2);
                  if (iVar10 == -1) goto code_r0x004372b4;
                }
                if (*(long *)(unaff_x20 + 0xa8) != 0) {
                  iVar10 = _chdir();
                  if (iVar10 == -1) goto code_r0x004372b4;
                }
                if (*(int *)(unaff_x20 + 0x58) == 1) {
                  iVar10 = _setpgid(0,*(undefined4 *)(unaff_x20 + 0x5c));
                  if (iVar10 == -1) goto code_r0x004372b4;
                }
                if (cRam0000000000a3bfd1 == '\0') {
                  lVar16 = _signal(0xd,0);
                  if (lVar16 == -1) goto code_r0x004372b4;
                }
                puVar18 = *(undefined8 **)(unaff_x20 + 0x38);
                lVar16 = *(long *)(unaff_x20 + 0x40) << 4;
                do {
                  if (lVar16 == 0) {
                    if (puVar15 != (undefined8 *)0x0) {
                      plVar17 = (long *)__NSGetEnviron();
                      lVar11 = *plVar17;
                      uVar24 = puVar15[4];
                      puVar18 = (undefined8 *)__NSGetEnviron();
                      *puVar18 = uVar24;
                    }
                    _execvp(*(undefined8 *)(unaff_x20 + 0x98),*(undefined8 *)(unaff_x20 + 0x20));
                    puVar13 = (uint *)___error();
                    uVar21 = *puVar13;
                    if (puVar15 != (undefined8 *)0x0) {
                      plVar17 = (long *)__NSGetEnviron();
                      *plVar17 = lVar11;
                    }
                    if (1 < uVar19) {
                      _close(uStack0000000000000054);
                    }
                    puVar12 = (undefined1 *)((ulong)uVar21 << 0x20 | 2);
                    if (1 < uVar5) {
                      _close(uStack000000000000005c);
                    }
                    if (uVar6 < 2) {
                      return puVar12;
                    }
                    goto code_r0x00437314;
                  }
                  puVar12 = (undefined1 *)(**(code **)(puVar18[1] + 0x20))(*puVar18);
                  puVar18 = puVar18 + 2;
                  lVar16 = lVar16 + -0x10;
                  lVar11 = 0;
                } while (puVar12 == (undefined1 *)0x0);
              }
              else {
                if (*(ulong *)(unaff_x20 + 0xc0) >> 0x1f != 0) {
                  func_0x007a2810(&UNK_008851be,0x2b,&uStack_61,&UNK_009d9398,&UNK_009dc128);
                    /* WARNING: Does not return */
                  pcVar9 = (code *)SoftwareBreakpoint(1,0x4373f0);
                  (*pcVar9)();
                }
                iVar10 = _setgroups(*(ulong *)(unaff_x20 + 0xc0),lVar11);
                if (iVar10 != -1) goto code_r0x004371b8;
code_r0x004372b4:
                puVar13 = (uint *)___error();
                puVar12 = (undefined1 *)((ulong)*puVar13 << 0x20 | 2);
              }
              goto code_r0x004372c4;
            }
            do {
              iVar10 = _dup2(uVar7,2);
              if (iVar10 != -1) goto code_r0x00437194;
              puVar13 = (uint *)___error();
              uVar21 = *puVar13;
            } while (uVar21 == 4);
          }
          else {
            do {
              iVar10 = _dup2(uVar2,1);
              if (iVar10 != -1) goto code_r0x00437150;
              puVar13 = (uint *)___error();
              uVar21 = *puVar13;
            } while (uVar21 == 4);
          }
        }
        else {
          do {
            iVar10 = _dup2(uVar2,0);
            if (iVar10 != -1) goto code_r0x00437114;
            puVar13 = (uint *)___error();
            uVar21 = *puVar13;
          } while (uVar21 == 4);
        }
        puVar12 = (undefined1 *)((ulong)uVar21 << 0x20 | 2);
code_r0x004372c4:
        if (1 < uVar19) {
          _close(uStack0000000000000054);
        }
        if (1 < uStack0000000000000058) {
          _close(uStack000000000000005c);
        }
        if (1 < uStack0000000000000060) {
code_r0x00437314:
          _close(uStack0000000000000064);
        }
        return puVar12;
      }
      puVar13 = (uint *)___error();
      *(ulong *)(unaff_x19 + 2) = (ulong)*puVar13 << 0x20 | 2;
      *unaff_x19 = 2;
      func_0x003f7738(&uStack0000000000000070);
      _close(uVar24);
code_r0x00436ae4:
      puVar12 = (undefined1 *)_close(uVar2);
    }
    bVar1 = true;
joined_r0x00436b44:
    if (1 < uStack0000000000000050) {
      puVar12 = (undefined1 *)_close(uStack0000000000000054);
    }
    if (1 < uStack0000000000000058) {
      puVar12 = (undefined1 *)_close(uStack000000000000005c);
    }
    if (1 < uStack0000000000000060) {
      puVar12 = (undefined1 *)_close(uStack0000000000000064);
    }
    if (!bVar1) goto LAB_0043679c;
    if (in_stack_00000040._4_4_ != -1) {
      _close();
    }
    if (iStack0000000000000048 != -1) {
      _close();
    }
    puVar12 = (undefined1 *)(ulong)uStack000000000000004c;
    if (uStack000000000000004c == 0xffffffff) goto LAB_0043679c;
  }
  puVar12 = (undefined1 *)_close(puVar12);
LAB_0043679c:
  lVar16 = in_stack_00000018;
  lVar11 = uStack0000000000000010;
  if (uStack0000000000000010 != -0x8000000000000000) {
    if (in_stack_00000020 != 0) {
      plVar17 = (long *)(in_stack_00000018 + 8);
      lVar23 = in_stack_00000020;
      do {
        puVar12 = (undefined1 *)plVar17[-1];
        *puVar12 = 0;
        if (*plVar17 != 0) {
          puVar12 = (undefined1 *)func_0x00187bd4(puVar12,*plVar17,1);
        }
        plVar17 = plVar17 + 2;
        lVar23 = lVar23 + -1;
      } while (lVar23 != 0);
    }
    if (lVar11 != 0) {
      puVar12 = (undefined1 *)func_0x00187bd4(lVar16,lVar11 << 4,8);
    }
    if (in_stack_00000028 != 0) {
      puVar12 = (undefined1 *)func_0x00187bd4(uStack0000000000000030,in_stack_00000028 << 3,8);
    }
  }
  return puVar12;
}

