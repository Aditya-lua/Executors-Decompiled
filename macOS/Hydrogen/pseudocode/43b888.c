
/* WARNING: Removing unreachable block (ram,0x0043c0fc) */
/* WARNING: Removing unreachable block (ram,0x0043c10c) */
/* WARNING: Removing unreachable block (ram,0x0043c114) */
/* WARNING: Removing unreachable block (ram,0x0043c11c) */
/* WARNING: Removing unreachable block (ram,0x0043c128) */
/* WARNING: Removing unreachable block (ram,0x0043c674) */
/* WARNING: Removing unreachable block (ram,0x0043d138) */
/* WARNING: Removing unreachable block (ram,0x0043c8dc) */
/* WARNING: Removing unreachable block (ram,0x0043c8f0) */
/* WARNING: Removing unreachable block (ram,0x0043d26c) */
/* WARNING: Removing unreachable block (ram,0x0043c8f8) */
/* WARNING: Removing unreachable block (ram,0x0043c904) */
/* WARNING: Removing unreachable block (ram,0x0043c910) */
/* WARNING: Removing unreachable block (ram,0x0043c92c) */
/* WARNING: Type propagation algorithm not settling */

void FUN_0043b888(void)

{
  int7 *piVar1;
  long lVar2;
  long lVar3;
  dword *pdVar4;
  ulong uVar5;
  uint6 uVar6;
  long *plVar7;
  dword *pdVar8;
  int *piVar9;
  dword *pdVar10;
  bool bVar11;
  int iVar12;
  long lVar13;
  dword *pdVar14;
  uint uVar15;
  int7 *piVar16;
  ulong uVar17;
  ulong uVar18;
  int7 *piVar19;
  int *piVar20;
  ulong uVar21;
  int7 *piVar22;
  long *unaff_x19;
  long *plVar23;
  undefined8 uVar24;
  dword *unaff_x20;
  undefined8 *puVar25;
  code *pcVar26;
  long lVar27;
  ulong unaff_x23;
  long unaff_x24;
  undefined8 *puVar28;
  undefined1 *unaff_x26;
  long *unaff_x27;
  dword *unaff_x28;
  long unaff_x29;
  undefined1 auVar29 [16];
  uint uStack0000000000000008;
  long in_stack_00000010;
  dword *in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  dword *in_stack_00000030;
  dword *in_stack_00000038;
  dword *in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  dword *in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  long *in_stack_000009b0;
  dword *in_stack_000009b8;
  dword *in_stack_000009c0;
  undefined8 in_stack_000009c8;
  undefined8 in_stack_000009d0;
  undefined8 in_stack_000009d8;
  undefined8 in_stack_000009e0;
  undefined8 in_stack_000009e8;
  undefined8 in_stack_000009f0;
  long in_stack_000009f8;
  undefined8 in_stack_00000a00;
  undefined8 in_stack_00001320;
  undefined8 in_stack_00001328;
  undefined8 in_stack_00001330;
  undefined8 in_stack_00001338;
  undefined8 in_stack_00001340;
  undefined8 in_stack_00001348;
  dword *pdVar30;
  dword *in_stack_00001530;
  dword *in_stack_00001538;
  long in_stack_00001540;
  dword *in_stack_00001548;
  ulong in_stack_00001550;
  dword *in_stack_00001730;
  dword *in_stack_00001738;
  dword *in_stack_00001780;
  dword *in_stack_00001788;
  undefined8 in_stack_00001790;
  ushort uVar31;
  undefined8 in_stack_00001798;
  short in_stack_000017c0;
  long in_stack_00001ba8;
  undefined8 in_stack_00001bb0;
  undefined8 in_stack_00001bb8;
  undefined8 in_stack_00001bf0;
  undefined8 in_stack_00001bf8;
  undefined8 in_stack_00001c00;
  undefined8 in_stack_00001c08;
  undefined8 in_stack_00001c10;
  undefined8 in_stack_00001c18;
  undefined8 in_stack_00001e18;
  short in_stack_00001e40;
  dword *in_stack_00002258;
  undefined8 in_stack_00002260;
  long in_stack_00002268;
  ulong in_stack_00002270;
  int7 *in_stack_00002278;
  dword *in_stack_00002280;
  int *in_stack_00002460;
  long in_stack_00002468;
  ulong in_stack_00002470;
  undefined1 auStack_7ffffffe [2];
  dword adStack_7ffffffc [536870911];
  
  pdVar10 = in_stack_00000060;
  pdVar14 = uStack0000000000000058;
  if (((ulong)uStack0000000000000050 & 1) == 0) {
    return;
  }
  func_0x0043d660(&uStack0000000000000050,uStack0000000000000058,in_stack_00000060);
  if ((((uStack0000000000000050 == (long *)0x0) || ((int)*uStack0000000000000050 == -0x30051202)) ||
      (in_stack_00000060 <= (int7 *)((long)&MACH_HEADER.reserved + 3))) ||
     (piVar16 = (int7 *)(ulong)*(uint *)((long)uStack0000000000000050 + 0x14),
     in_stack_00000060 + -8 < piVar16)) goto LAB_0043b8c0;
  iVar12 = (int)uStack0000000000000050[2];
  piVar22 = (int7 *)(uStack0000000000000058 + 8);
  do {
    piVar19 = piVar22;
    if (iVar12 == 0) goto code_r0x0043c238;
    if (piVar16 < &MACH_HEADER.cpusubtype) goto LAB_0043b8c0;
    uVar15 = *(uint *)((long)piVar19 + 4);
    piVar22 = (int7 *)(ulong)uVar15;
    if (uVar15 < 8 || piVar16 < piVar22) goto LAB_0043b8c0;
    piVar16 = (int7 *)((long)piVar16 - (long)piVar22);
    iVar12 = iVar12 + -1;
    piVar22 = (int7 *)((long)piVar19 + (long)piVar22);
  } while ((int)*piVar19 != 0x1b || uVar15 < 0x18);
  if (unaff_x20 == (dword *)0x0) {
    bVar11 = false;
  }
  else {
    bVar11 = (char)*unaff_x19 == '/';
  }
  in_stack_00000040 = (dword *)(ulong)*(ushort *)((long)piVar19 + 0xc);
  uVar6 = *(uint6 *)(piVar19 + 1);
  in_stack_00000038 = (dword *)(ulong)*(ushort *)((long)piVar19 + 0x16);
  unaff_x28 = *(dword **)((long)piVar19 + 0xe);
  in_stack_00000060 = (dword *)CONCAT71(in_stack_00000060._1_7_,6);
  in_stack_00000088 = CONCAT62(CONCAT51(in_stack_00000088._3_5_,bVar11),0x200);
  uStack0000000000000050 = unaff_x19;
  uStack0000000000000058 = unaff_x20;
  func_0x004248f4(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050);
  if (((byte)in_stack_000009b0 - 7 < 3) &&
     (lVar13 = func_0x00423fe0(&uStack0000000000000050), lVar13 != 0)) {
    func_0x00429d60(&uStack0000000000000050);
    plVar23 = uStack0000000000000050;
    if ((char)uStack0000000000000058 == '\x02') {
      if (((ulong)uStack0000000000000050 & 3) == 1) {
        puVar25 = (undefined8 *)((long)uStack0000000000000050 + -1);
        uVar24 = *puVar25;
        puVar28 = *(undefined8 **)((long)uStack0000000000000050 + 7);
        if ((code *)*puVar28 != (code *)0x0) {
          (*(code *)*puVar28)(uVar24);
        }
        if (puVar28[1] != 0) {
          func_0x00187bd4(uVar24,puVar28[1],puVar28[2]);
        }
        func_0x00187bd4(puVar25,0x18,8);
      }
    }
    else {
      in_stack_00000030 = (dword *)((ulong)unaff_x28 >> 0x10 | (long)in_stack_00000038 << 0x30);
      in_stack_00000028 = (ulong)uVar6 | (long)unaff_x28 << 0x30;
      while( true ) {
        unaff_x28 = (dword *)(auStack_7ffffffe + 0x8000177e);
        func_0x0041743c(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x8000176e);
        if ((int)in_stack_000009b0 != 1) break;
        if (in_stack_000009b8 == (dword *)0x0) {
          if (((ulong)in_stack_000009c0 & 3) == 1) {
            uVar24 = *(undefined8 *)((long)in_stack_000009c0 + -1);
            puVar25 = *(undefined8 **)((long)in_stack_000009c0 + 7);
            if ((code *)*puVar25 != (code *)0x0) {
              (*(code *)*puVar25)(uVar24);
            }
            if (puVar25[1] != 0) {
              func_0x00187bd4(uVar24,puVar25[1],puVar25[2]);
            }
            func_0x00187bd4((undefined8 *)((long)in_stack_000009c0 + -1),0x18,8);
          }
          pdVar30 = (dword *)0x8000000000000000;
code_r0x0043c4a8:
          lVar13 = *plVar23;
          *plVar23 = lVar13 + -1;
          LORelease();
          if (lVar13 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000176e);
          }
          if (pdVar30 == (dword *)0x8000000000000000) goto code_r0x0043c22c;
          _memcpy(auStack_7ffffffe + 0x8000131e,auStack_7ffffffe + 0x8000152e,0x200);
          _munmap(pdVar14,pdVar10);
          unaff_x28 = in_stack_00001738;
          goto code_r0x0043c358;
        }
        _memcpy(auStack_7ffffffe + 0x8000178e,auStack_7ffffffe + 0x800009c6,0x410);
        uVar31 = (ushort)((ulong)in_stack_00001798 >> 0x10);
        uVar18 = (ulong)uVar31;
        if (uVar31 == 0) {
          pdVar30 = (dword *)((long)&MACH_HEADER.magic + 1);
        }
        else {
          pdVar30 = (dword *)func_0x00187bd0(uVar18,1);
          if (pdVar30 == (dword *)0x0) {
            func_0x007a1f00(1,uVar18,&UNK_009d9be8);
                    /* WARNING: Does not return */
            pcVar26 = (code *)SoftwareBreakpoint(1,0x43d26c);
            (*pcVar26)();
          }
        }
        _memcpy(pdVar30,auStack_7ffffffe + 0x8000179b,uVar18);
        func_0x0046b8d0(&uStack0000000000000050,pdVar30,uVar18);
        in_stack_00001780 = in_stack_000009b8;
        in_stack_00001788 = in_stack_000009c0;
        if ((((ulong)uStack0000000000000050 & 1) == 0) && (4 < uVar31)) {
          if (*(int *)((long)pdVar30 + (uVar18 - 5)) != 0x5953642e ||
              *(char *)((long)pdVar30 + (uVar18 - 1)) != 'M') goto code_r0x0043bd4c;
          func_0x004261e4(&uStack0000000000000050,*(undefined8 *)(in_stack_000009b8 + 6),
                          *(undefined8 *)(in_stack_000009b8 + 8),auStack_7ffffffe + 0x8000179b,
                          uVar18);
          pdVar8 = uStack0000000000000058;
          func_0x004261e4(auStack_7ffffffe + 0x80001ba6,uStack0000000000000058,in_stack_00000060,
                          &UNK_00887de9,0x18);
          if (uStack0000000000000050 != (long *)0x0) {
            func_0x00187bd4(pdVar8,uStack0000000000000050,1);
          }
          func_0x00429d60(&uStack0000000000000050,in_stack_00001bb0,in_stack_00001bb8);
          plVar7 = uStack0000000000000050;
          in_stack_00000038 = pdVar30;
          if ((char)uStack0000000000000058 == '\x02') {
            if (((ulong)uStack0000000000000050 & 3) == 1) {
              puVar25 = (undefined8 *)((long)uStack0000000000000050 + -1);
              uVar24 = *puVar25;
              puVar28 = *(undefined8 **)((long)uStack0000000000000050 + 7);
              if ((code *)*puVar28 != (code *)0x0) {
                (*(code *)*puVar28)(uVar24);
              }
              if (puVar28[1] != 0) {
                func_0x00187bd4(uVar24,puVar28[1],puVar28[2]);
              }
              func_0x00187bd4(puVar25,0x18,8);
            }
          }
          else {
            while( true ) {
              func_0x0041743c(&uStack0000000000000050,auStack_7ffffffe + 0x80001dee);
              pdVar8 = uStack0000000000000058;
              if ((int)uStack0000000000000050 != 1) break;
              if (uStack0000000000000058 == (dword *)0x0) {
                unaff_x28 = (dword *)0x8000000000000000;
code_r0x0043c178:
                lVar13 = *plVar7;
                *plVar7 = lVar13 + -1;
                LORelease();
                if (lVar13 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x80001dee);
                }
                if (unaff_x28 == (dword *)0x8000000000000000) goto code_r0x0043c1a8;
                _memcpy(auStack_7ffffffe + 0x8000152e,auStack_7ffffffe + 0x80001bee,0x200);
                if (in_stack_00001ba8 != 0) {
                  func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
                }
                func_0x00187bd4(pdVar30,uVar18,1);
                lVar13 = *(long *)in_stack_000009b8;
                *(long *)in_stack_000009b8 = lVar13 + -1;
                LORelease();
                pdVar30 = unaff_x28;
                in_stack_00001730 = in_stack_00000018;
                in_stack_00001738 = _uStack0000000000000008;
                if (lVar13 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x8000177e);
                }
                goto code_r0x0043c4a8;
              }
              _memcpy(auStack_7ffffffe + 0x80001e0e,&uStack0000000000000068,0x410);
              func_0x004261e4(auStack_7ffffffe + 0x80002256,*(undefined8 *)(pdVar8 + 6),
                              *(undefined8 *)(pdVar8 + 8),auStack_7ffffffe + 0x80001e1b,
                              (short)((ulong)in_stack_00001e18 >> 0x10));
              func_0x0043add8(unaff_x29 + -0xf0,in_stack_00002260,in_stack_00002268);
              if (*(int *)(unaff_x29 + -0xf0) != 1) {
                if (in_stack_00002258 != (dword *)0x0) {
                  func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
                }
                unaff_x28 = (dword *)0x8000000000000000;
code_r0x0043c158:
                lVar13 = *(long *)pdVar8;
                *(long *)pdVar8 = lVar13 + -1;
                LORelease();
                if (lVar13 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
                }
                goto code_r0x0043c178;
              }
              pdVar4 = *(dword **)(unaff_x29 + -0xe8);
              in_stack_00000040 = *(dword **)(unaff_x29 + -0xe0);
              if (in_stack_00002258 != (dword *)0x0) {
                func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
              }
              func_0x0043d660(auStack_7ffffffe + 0x8000245e,pdVar4,in_stack_00000040);
              if ((((in_stack_00002460 != (int *)0x0) && (*in_stack_00002460 != -0x30051202)) &&
                  (0x1f < in_stack_00002470)) &&
                 (uVar17 = (ulong)(uint)in_stack_00002460[5], uVar17 <= in_stack_00002470 - 0x20)) {
                iVar12 = in_stack_00002460[4];
                piVar9 = (int *)(in_stack_00002468 + 0x20);
                do {
                  piVar20 = piVar9;
                  if ((iVar12 == 0) || (uVar17 < 8)) goto code_r0x0043bf34;
                  uVar15 = piVar20[1];
                  uVar21 = (ulong)uVar15;
                  if (uVar15 < 8 || uVar17 < uVar21) goto code_r0x0043bf34;
                  uVar17 = uVar17 - uVar21;
                  iVar12 = iVar12 + -1;
                  piVar9 = (int *)((long)piVar20 + uVar21);
                } while (*piVar20 != 0x1b || uVar15 < 0x18);
                if (((dword *)*(int7 **)(piVar20 + 4) == in_stack_00000030 &&
                     *(ulong *)(piVar20 + 2) == in_stack_00000028) &&
                   (func_0x0043d840(auStack_7ffffffe + 0x8000245e),
                   in_stack_00002460 != (int *)0x8000000000000000)) {
                  *(undefined8 *)(unaff_x29 + -0xf0) = 0x8000000000000000;
                  func_0x004385b0(auStack_7ffffffe + 0x80002256,auStack_7ffffffe + 0x800024de,
                                  unaff_x29 + -0xf0,unaff_x29 + -0xf0);
                  if (in_stack_00002258 != (dword *)0x8000000000000000) {
                    _memcpy(auStack_7ffffffe + 0x80001bee,auStack_7ffffffe + 0x8000225e,0x200);
                    unaff_x28 = in_stack_00002258;
                    _uStack0000000000000008 = in_stack_00000040;
                    in_stack_00000018 = pdVar4;
                    goto code_r0x0043c158;
                  }
                }
              }
code_r0x0043bf34:
              func_0x003f7334(auStack_7ffffffe + 0x80002226);
              _munmap(pdVar4,in_stack_00000040);
              lVar13 = *(long *)pdVar8;
              *(long *)pdVar8 = lVar13 + -1;
              LORelease();
              if (lVar13 == 1) {
                DataMemoryBarrier(2,1);
                func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
              }
            }
            lVar13 = *plVar7;
            *plVar7 = lVar13 + -1;
            LORelease();
            if (lVar13 == 1) {
              DataMemoryBarrier(2,1);
              func_0x004037b4(auStack_7ffffffe + 0x80001dee);
            }
          }
code_r0x0043c1a8:
          if (in_stack_00001ba8 != 0) {
            func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
          }
          func_0x00187bd4(pdVar30,uVar18,1);
          lVar13 = *(long *)in_stack_000009b8;
          *(long *)in_stack_000009b8 = lVar13 + -1;
          LORelease();
          if (lVar13 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000177e);
          }
        }
        else {
          if (uVar31 != 0) {
code_r0x0043bd4c:
            func_0x00187bd4(pdVar30,uVar18,1);
          }
          lVar13 = *(long *)in_stack_000009b8;
          *(long *)in_stack_000009b8 = lVar13 + -1;
          LORelease();
          if (lVar13 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000177e);
          }
        }
      }
      lVar13 = *plVar23;
      *plVar23 = lVar13 + -1;
      LORelease();
      if (lVar13 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x8000176e);
      }
    }
code_r0x0043c22c:
    func_0x003f7b28(auStack_7ffffffe + 0x80001526);
  }
code_r0x0043c238:
  pdVar30 = (dword *)0x0;
  in_stack_00001530 = &MACH_HEADER.cpusubtype;
  in_stack_00001540 = 0;
  in_stack_00001538 = (dword *)0x0;
  in_stack_00001548 = &MACH_HEADER.cpusubtype;
  in_stack_00001550 = 0;
  func_0x0043d660(auStack_7ffffffe + 0x8000177e,pdVar14,pdVar10);
  if (((in_stack_00001780 != (dword *)0x0) && (*in_stack_00001780 != 0xcffaedfe)) &&
     (func_0x0043d840(auStack_7ffffffe + 0x8000177e,in_stack_00001780,in_stack_00001788,
                      in_stack_00001790), in_stack_00001780 != (dword *)0x8000000000000000)) {
    in_stack_000009b0 = (long *)0x8000000000000000;
    func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x80001dfe,
                    auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x800009ae);
    if (uStack0000000000000050 != (long *)0x8000000000000000) {
      _memcpy(auStack_7ffffffe + 0x8000131e,&uStack0000000000000058,0x200);
      in_stack_00001738 = pdVar10;
      in_stack_00001730 = pdVar14;
      in_stack_00001e40 = in_stack_000017c0;
code_r0x0043c358:
      _memcpy(auStack_7ffffffe + 0x80001e0e,auStack_7ffffffe + 0x8000131e,0x200);
      lVar13 = *(long *)(unaff_x24 + 0x5f8);
      if (*(long *)(unaff_x24 + 0x5f8) == 4) {
        lRam0000000000a2a5f8 = 3;
        func_0x003f70a4();
        _munmap(uRam0000000000a2a5b8,uRam0000000000a2a5c0);
        func_0x003f7334(0xa2a5c8);
        lVar13 = lRam0000000000a2a5f8;
      }
      pdVar14 = (dword *)(lVar13 + 1);
      _memcpy(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x80001dfe,0x250);
      if (&MACH_HEADER.cputype < pdVar14) {
        func_0x007a28b0(pdVar14,4,&UNK_009dc360);
        func_0x007a2570();
code_r0x0043d1b0:
        if (in_stack_00002258 < in_stack_00000030) {
          func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,in_stack_00000030,
                          auStack_7ffffffe + 0x80002256,1,0,
                          (ulong)_uStack0000000000000008 & 0xffffffff);
          if (pdVar30 == (dword *)((long)&MACH_HEADER.magic + 2)) goto LAB_0043cc70;
          if (in_stack_00001540 != 0xd) goto code_r0x0043d288;
          in_stack_00001530 = in_stack_00002258;
          if (*(long *)in_stack_00001538 != 0x424d595343453c2f ||
              *(int5 *)(in_stack_00001538 + 2) != 0x2f3e534c4f) {
            in_stack_00001530 = pdVar14;
          }
        }
        else {
code_r0x0043d288:
          in_stack_00001530 = pdVar14;
        }
        uVar18 = 0;
        lVar13 = 1;
        pdVar30 = (dword *)0x0;
        in_stack_00000060 = in_stack_00000030;
code_r0x0043c9e4:
        unaff_x26[0x38] = (char)uStack0000000000000008;
        if ((int)pdVar30 != 0) goto code_r0x0043ca98;
        while (in_stack_00001530 < in_stack_00000060) {
          func_0x0040b7cc(auStack_7ffffffe + 0x80002256,in_stack_00000038,in_stack_00000030,
                          auStack_7ffffffe + 0x8000152e,lVar13,uVar18,unaff_x26[0x38]);
          pdVar14 = in_stack_00000060;
          pdVar10 = in_stack_00000060;
          in_stack_00001538 = in_stack_00000060;
          in_stack_00000060 = in_stack_00002280;
          piVar16 = in_stack_00002278;
          lVar27 = in_stack_00002268;
          uVar17 = in_stack_00002270;
          if (in_stack_00002258 != (dword *)((long)&MACH_HEADER.magic + 2)) goto joined_r0x0043ca80;
joined_r0x0043ca60:
          in_stack_00000060 = pdVar10;
          in_stack_00001530 = pdVar14;
          if (pdVar30 != (dword *)0x0) {
code_r0x0043ca98:
            if (in_stack_00000060 == (dword *)0x0) break;
            in_stack_00001538 = (dword *)((long)in_stack_00000060 + -1);
            auVar29 = func_0x0043fb2c(in_stack_00001530,0x14,10);
            piVar16 = auVar29._8_8_;
            if ((((auVar29._0_8_ & 1) != 0) && (piVar16 <= in_stack_00000030)) &&
               (0x6f < (ulong)((long)in_stack_00000030 - (long)piVar16))) {
              auVar29 = func_0x0043fb2c((long)in_stack_00000038 + (long)piVar16 + 0x6c,4,10);
              uVar17 = auVar29._8_8_;
              if ((auVar29._0_8_ & 1) != 0) {
                piVar22 = piVar16 + 0xe;
                if ((piVar22 <= in_stack_00000030) &&
                   (uVar17 <= (ulong)((long)in_stack_00000030 - (long)piVar22))) {
                  piVar1 = (int7 *)(uVar17 + (long)piVar22);
                  piVar19 = (int7 *)((long)piVar1 + 1);
                  if (piVar1 == (int7 *)0xffffffffffffffff) {
                    piVar19 = (int7 *)0xffffffffffffffff;
                  }
                  if (((ulong)piVar1 & 1) != 0) {
                    piVar1 = piVar19;
                  }
                  if ((!(in_stack_00000030 < piVar1 ||
                        (ulong)((long)in_stack_00000030 - (long)piVar1) < 2)) &&
                     (*(short *)((long)in_stack_00000038 + (long)piVar1) == 0xa60)) {
                    auVar29 = func_0x0043fb2c((long)in_stack_00000038 + (long)piVar16,0x14,10);
                    in_stack_00000060 = auVar29._8_8_;
                    if ((auVar29._0_8_ & 1) != 0) {
                      in_stack_00001530 = in_stack_00001530 + 5;
                      piVar16 = (int7 *)((long)piVar1 + 2);
                      lVar27 = (long)in_stack_00000038 + (long)piVar22;
joined_r0x0043ca80:
                      pdVar14 = in_stack_00001530;
                      pdVar10 = in_stack_00001538;
                      if (uVar17 == in_stack_00000028) {
                        iVar12 = _memcmp(lVar27,in_stack_00000018,in_stack_00000028);
                        pdVar14 = in_stack_00001530;
                        pdVar10 = in_stack_00001538;
                        if (iVar12 == 0) {
                          if (piVar16 == (int7 *)0x0) {
                            in_stack_00000060 = (dword *)0x0;
                            pdVar14 = (dword *)((long)&MACH_HEADER.magic + 1);
                          }
                          else {
                            if ((in_stack_00000030 < piVar16) ||
                               ((int7 *)((long)in_stack_00000030 - (long)piVar16) <
                                in_stack_00000060)) break;
                            pdVar14 = (dword *)((long)in_stack_00000038 + (long)piVar16);
                          }
                          goto code_r0x0043cbb4;
                        }
                      }
                      goto joined_r0x0043ca60;
                    }
                  }
                }
              }
            }
            pdVar14 = (dword *)((long)&MACH_HEADER.magic + 1);
            pdVar10 = (dword *)0x0;
            goto joined_r0x0043ca60;
          }
        }
        goto LAB_0043cc70;
      }
      if (pdVar14 != (dword *)0x0) {
        lVar13 = lVar13 * 0x250 + 0x250;
        lVar27 = 0xa29cb8;
        do {
          _memcpy(&uStack0000000000000050,lVar27,0x250);
          _memcpy(lVar27,auStack_7ffffffe + 0x800009ae,0x250);
          _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
          lVar13 = lVar13 + -0x250;
          lVar27 = lVar27 + 0x250;
        } while (lVar13 != 0);
      }
      *(dword **)(unaff_x24 + 0x5f8) = pdVar14;
      in_stack_00001738 = (dword *)(unaff_x26 + -(long)unaff_x27);
      func_0x0043aa50(auStack_7ffffffe + 0x800009ae,0xa29cc0,in_stack_00001738);
      unaff_x27 = (long *)0xa29cc8;
      if ((int)in_stack_000009b0 != 5) {
        bVar11 = false;
        pcVar26 = *(code **)(in_stack_00000010 + 0x20);
        uStack0000000000000050 = in_stack_000009b0;
        uStack0000000000000058 = in_stack_000009b8;
        uStack0000000000000068 = in_stack_000009c8;
        in_stack_00000070 = in_stack_000009d0;
        in_stack_00000078 = in_stack_000009d8;
        in_stack_00000080 = in_stack_000009e0;
        in_stack_00000088 = in_stack_000009e8;
        in_stack_00000090 = in_stack_000009f0;
        in_stack_00000098 = in_stack_000009f8;
        in_stack_000000a0 = in_stack_00000a00;
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050), unaff_x23 < 2
              ) {
          if (((in_stack_00001e40 == 2) && (uRam0000000000a29cd0 != 0)) &&
             (uRam0000000000a29cd0 != 1)) {
            lVar13 = 0;
            uVar18 = uRam0000000000a29cd0;
            do {
              lVar27 = (uVar18 >> 1) + lVar13;
              if (*(int7 **)(lRam0000000000a29cc8 + lVar27 * 0x18 + 0x10) <= in_stack_00001738) {
                lVar13 = lVar27;
              }
              uVar18 = uVar18 - (uVar18 >> 1);
            } while (1 < uVar18);
          }
          (*pcVar26)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
          bVar11 = true;
        }
        if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
          func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
        }
        in_stack_00000060 = in_stack_000009c0;
        if (bVar11) {
          return;
        }
      }
      unaff_x26 = auStack_7ffffffe + 0x80001526;
      if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
         (in_stack_00000040 = (dword *)func_0x004432ec(0xa29cd8,in_stack_00001738),
         in_stack_00000040 == (dword *)0x0)) goto code_r0x0043cef0;
      uVar18 = *(ulong *)(in_stack_00000040 + 8);
      in_stack_00001730 = (dword *)(lRam0000000000a29d18 + uVar18 * 0x248);
      if (uRam0000000000a29d20 <= uVar18) goto code_r0x0043cef0;
      plVar23 = *(long **)in_stack_00001730;
      if (plVar23 == (long *)0x8000000000000001) {
        if (uRam0000000000a29d00 <= uVar18) goto code_r0x0043cef0;
        puVar25 = (undefined8 *)(lRam0000000000a29cf8 + uVar18 * 0x20);
        func_0x0043add8(&uStack0000000000000050,*puVar25,puVar25[1]);
        pdVar10 = uStack0000000000000058;
        unaff_x28 = in_stack_00001730;
        if ((int)uStack0000000000000050 == 1) {
          in_stack_00000018 = (dword *)puVar25[2];
          in_stack_00000028 = puVar25[3];
          in_stack_00000030 = in_stack_00000060;
          in_stack_00001bf0 = 0;
          in_stack_00001bf8 = 8;
          in_stack_00001c08 = 0;
          in_stack_00001c00 = 0;
          in_stack_00001c10 = 8;
          in_stack_00001c18 = 0;
          in_stack_00000038 = uStack0000000000000058;
          pdVar14 = uStack0000000000000058;
          if (in_stack_00000018 != (dword *)0x0) {
            if (in_stack_00000060 < &MACH_HEADER.cpusubtype) goto LAB_0043cc70;
            pdVar14 = &MACH_HEADER.cpusubtype;
            lVar13 = *(long *)uStack0000000000000058;
            in_stack_00002258 = pdVar14;
            if (lVar13 == 0xa3e6e6968743c21) {
              uVar15 = 1;
code_r0x0043c54c:
              uStack0000000000000008 = uVar15;
              if (in_stack_00000060 == &MACH_HEADER.cpusubtype) {
                uVar18 = 0;
                pdVar30 = (dword *)0x0;
                in_stack_00000060 = &MACH_HEADER.cpusubtype;
                lVar13 = 1;
                in_stack_00001530 = &MACH_HEADER.cpusubtype;
              }
              else {
                _uStack0000000000000008 = (dword *)(ulong)uVar15;
                func_0x0040b7cc(auStack_7ffffffe + 0x80001526,uStack0000000000000058,
                                in_stack_00000060,auStack_7ffffffe + 0x80002256,1,0);
                if (pdVar30 == (dword *)((long)&MACH_HEADER.magic + 2)) goto LAB_0043cc70;
                uVar18 = 0;
                lVar13 = 1;
                if (in_stack_00001540 < 9) {
                  if (in_stack_00001540 == 1) {
                    if (((char)*in_stack_00001538 == '/') &&
                       (&MACH_HEADER.cpusubtype < in_stack_00000060)) {
                      func_0x0040b7cc(auStack_7ffffffe + 0x80001526,pdVar10,in_stack_00000060,
                                      auStack_7ffffffe + 0x80002256,1,0,uVar15);
                      if (pdVar30 != (dword *)((long)&MACH_HEADER.magic + 2)) {
                        if ((char)*in_stack_00001538 != '/') goto code_r0x0043c9d8;
                        if ((in_stack_00000060 <= &MACH_HEADER.cpusubtype) ||
                           (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,pdVar10,in_stack_00000060,
                                            auStack_7ffffffe + 0x80002256,1,0,uVar15),
                           pdVar30 != (dword *)((long)&MACH_HEADER.magic + 2)))
                        goto code_r0x0043d1b0;
                      }
                      goto LAB_0043cc70;
                    }
                    goto code_r0x0043c9d8;
                  }
                  if (in_stack_00001540 == 2) {
                    if ((short)*in_stack_00001538 != 0x2f2f) goto code_r0x0043c9d8;
                    if (in_stack_00001548 == (dword *)0x0) {
                      uVar18 = 0;
                      lVar13 = 1;
                    }
                    else {
                      if ((in_stack_00000060 < in_stack_00001548) ||
                         ((ulong)((long)in_stack_00000060 - (long)in_stack_00001548) <
                          in_stack_00001550)) goto LAB_0043cc70;
                      lVar13 = (long)pdVar10 + (long)in_stack_00001548;
                      uVar18 = in_stack_00001550;
                    }
                  }
                  else if (in_stack_00001540 == 7) {
                    if (((*(int7 *)in_stack_00001538 == 0x2f34364d59532f) &&
                        (&MACH_HEADER.cpusubtype < in_stack_00000060)) &&
                       (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,pdVar10,in_stack_00000060,
                                        auStack_7ffffffe + 0x80002256,1,0,uVar15),
                       pdVar30 == (dword *)((long)&MACH_HEADER.magic + 2))) goto LAB_0043cc70;
                    goto code_r0x0043c9d8;
                  }
                }
                else if (in_stack_00001540 < 0x10) {
                  if ((in_stack_00001540 == 9) || (in_stack_00001540 == 0xc)) goto code_r0x0043c9d8;
                }
                else if ((in_stack_00001540 == 0x10) || (in_stack_00001540 == 0x13)) {
code_r0x0043c9d8:
                  lVar13 = 1;
                  uVar18 = 0;
                }
                in_stack_00001530 = &MACH_HEADER.cpusubtype;
                pdVar30 = (dword *)0x0;
              }
            }
            else {
              if (lVar13 == 0xa3e686372613c21) {
                uVar15 = 0;
                goto code_r0x0043c54c;
              }
              if ((lVar13 != 0xa3e66616769623c) ||
                 (in_stack_00000060 < section_00000068.segname + 8)) goto LAB_0043cc70;
              auVar29 = func_0x0043fb2c(uStack0000000000000058 + 0xc,0x14,10);
              piVar16 = auVar29._8_8_;
              if ((auVar29._0_8_ & 1) == 0) goto LAB_0043cc70;
              if (piVar16 != (int7 *)0x0) {
                if ((piVar16 <= in_stack_00000060) &&
                   (0x6f < (ulong)((long)in_stack_00000060 - (long)piVar16))) {
                  auVar29 = func_0x0043fb2c((long)pdVar10 + (long)piVar16 + 0x6c,4,10);
                  if ((auVar29._0_8_ & 1) != 0) {
                    piVar22 = piVar16 + 0xe;
                    if ((piVar22 <= in_stack_00000060) &&
                       (auVar29._8_8_ <= (ulong)((long)in_stack_00000060 - (long)piVar22))) {
                      piVar22 = (int7 *)(auVar29._8_8_ + (long)piVar22);
                      piVar19 = (int7 *)((long)piVar22 + 1);
                      if (piVar22 == (int7 *)0xffffffffffffffff) {
                        piVar19 = (int7 *)0xffffffffffffffff;
                      }
                      if (((ulong)piVar22 & 1) != 0) {
                        piVar22 = piVar19;
                      }
                      if (((piVar22 <= in_stack_00000060) &&
                          (1 < (ulong)((long)in_stack_00000060 - (long)piVar22))) &&
                         (*(short *)((long)pdVar10 + (long)piVar22) == 0xa60)) {
                        uVar18 = func_0x0043fb2c((long)pdVar10 + (long)piVar16,0x14,10);
code_r0x0043bb10:
                        if ((uVar18 & 1) != 0) goto code_r0x0043cfd4;
                      }
                    }
                  }
                }
                goto LAB_0043cc70;
              }
              auVar29 = func_0x0043fb2c(pdVar10 + 7,0x14,10);
              piVar16 = auVar29._8_8_;
              if ((auVar29._0_8_ & 1) == 0) goto LAB_0043cc70;
              if (piVar16 != (int7 *)0x0) {
                if ((piVar16 <= in_stack_00000060) &&
                   (0x6f < (ulong)((long)in_stack_00000060 - (long)piVar16))) {
                  auVar29 = func_0x0043fb2c((long)pdVar10 + (long)piVar16 + 0x6c,4,10);
                  if ((auVar29._0_8_ & 1) != 0) {
                    piVar22 = piVar16 + 0xe;
                    if ((piVar22 <= in_stack_00000060) &&
                       (auVar29._8_8_ <= (ulong)((long)in_stack_00000060 - (long)piVar22))) {
                      piVar22 = (int7 *)(auVar29._8_8_ + (long)piVar22);
                      piVar19 = (int7 *)((long)piVar22 + 1);
                      if (piVar22 == (int7 *)0xffffffffffffffff) {
                        piVar19 = (int7 *)0xffffffffffffffff;
                      }
                      if (((ulong)piVar22 & 1) != 0) {
                        piVar22 = piVar19;
                      }
                      if (((piVar22 <= in_stack_00000060) &&
                          (1 < (ulong)((long)in_stack_00000060 - (long)piVar22))) &&
                         (*(short *)((long)pdVar10 + (long)piVar22) == 0xa60)) {
                        uVar18 = func_0x0043fb2c((long)pdVar10 + (long)piVar16,0x14,10);
                        goto code_r0x0043bb10;
                      }
                    }
                  }
                }
                goto LAB_0043cc70;
              }
code_r0x0043cfd4:
              auVar29 = func_0x0043fb2c(pdVar10 + 2,0x14,10);
              piVar16 = auVar29._8_8_;
              if ((auVar29._0_8_ & 1) == 0) goto LAB_0043cc70;
              if (piVar16 != (int7 *)0x0) {
                if ((piVar16 <= in_stack_00000060) &&
                   (0x6f < (ulong)((long)in_stack_00000060 - (long)piVar16))) {
                  auVar29 = func_0x0043fb2c((long)pdVar10 + (long)piVar16 + 0x6c,4,10);
                  if ((auVar29._0_8_ & 1) != 0) {
                    piVar22 = piVar16 + 0xe;
                    if ((piVar22 <= in_stack_00000060) &&
                       (auVar29._8_8_ <= (ulong)((long)in_stack_00000060 - (long)piVar22))) {
                      piVar22 = (int7 *)(auVar29._8_8_ + (long)piVar22);
                      piVar19 = (int7 *)((long)piVar22 + 1);
                      if (piVar22 == (int7 *)0xffffffffffffffff) {
                        piVar19 = (int7 *)0xffffffffffffffff;
                      }
                      if (((ulong)piVar22 & 1) != 0) {
                        piVar22 = piVar19;
                      }
                      if (((piVar22 <= in_stack_00000060) &&
                          (1 < (ulong)((long)in_stack_00000060 - (long)piVar22))) &&
                         (*(short *)((long)pdVar10 + (long)piVar22) == 0xa60)) {
                        auVar29 = func_0x0043fb2c((long)pdVar10 + (long)piVar16,0x14,10);
                        uVar18 = auVar29._8_8_;
                        if ((((auVar29._0_8_ & 1) != 0) &&
                            (piVar22 = (int7 *)((long)piVar22 + 2), piVar22 != (int7 *)0x0)) &&
                           ((piVar22 <= in_stack_00000060 &&
                            ((uVar18 <= (ulong)((long)in_stack_00000060 - (long)piVar22) &&
                             (0x13 < uVar18)))))) {
                          auVar29 = func_0x0043fb2c((long)pdVar10 + (long)piVar22,0x14,10);
                          in_stack_00000060 = auVar29._8_8_;
                          if (((auVar29._0_8_ & 1) != 0) &&
                             ((auVar29._8_8_ = 0, auVar29._0_8_ = in_stack_00000060,
                              SUB168(auVar29 * ZEXT816(0x14),8) == 0 &&
                              ((ulong)((long)in_stack_00000060 * 0x14) <= uVar18 - 0x14)))) {
                            in_stack_00001530 = (dword *)((long)pdVar10 + (long)piVar22 + 0x14);
                            goto LAB_0043d168;
                          }
                        }
                      }
                    }
                  }
                }
                goto LAB_0043cc70;
              }
              in_stack_00000060 = (dword *)0x0;
              in_stack_00001530 = (dword *)((long)&MACH_HEADER.magic + 1);
LAB_0043d168:
              lVar13 = 1;
              uVar18 = 0;
              pdVar30 = (dword *)((long)&MACH_HEADER.magic + 1);
              uStack0000000000000008 = 0;
            }
            goto code_r0x0043c9e4;
          }
code_r0x0043cbb4:
          func_0x0043d660(auStack_7ffffffe + 0x80001526,pdVar14,in_stack_00000060);
          if ((pdVar30 == (dword *)0x0) || (*pdVar30 == 0xcffaedfe)) {
LAB_0043cc70:
            func_0x003f7334(auStack_7ffffffe + 0x80001bee);
            _munmap(in_stack_00000038,in_stack_00000030);
            goto code_r0x0043cc84;
          }
          func_0x0043d840(auStack_7ffffffe + 0x80001526,pdVar30,in_stack_00001530,in_stack_00001538)
          ;
          if (pdVar30 == (dword *)0x8000000000000000) goto LAB_0043cc70;
          unaff_x23 = 0x8000000000000000;
          func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                          auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
          plVar23 = uStack0000000000000050;
          if (uStack0000000000000050 == (long *)0x8000000000000000) goto LAB_0043cc70;
          _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
          lVar13 = *(long *)in_stack_00001730;
          pdVar14 = in_stack_00001730;
          in_stack_00001730 = unaff_x28;
        }
        else {
code_r0x0043cc84:
          plVar23 = (long *)0x8000000000000000;
          lVar13 = *(long *)in_stack_00001730;
          pdVar14 = in_stack_00001730;
          in_stack_00001730 = unaff_x28;
          in_stack_00001c18 = in_stack_00001348;
          in_stack_00001c10 = in_stack_00001340;
          in_stack_00001c08 = in_stack_00001338;
          in_stack_00001c00 = in_stack_00001330;
          in_stack_00001bf8 = in_stack_00001328;
          in_stack_00001bf0 = in_stack_00001320;
        }
        if ((lVar13 != -0x7fffffffffffffff) && (lVar13 != -0x8000000000000000)) {
          func_0x003f70a4(pdVar14);
          _munmap(*(undefined8 *)(pdVar14 + 0x82),*(undefined8 *)(pdVar14 + 0x84));
          func_0x003f7334(pdVar14 + 0x86);
        }
        *(long **)pdVar14 = plVar23;
        _memcpy(pdVar14 + 2,auStack_7ffffffe + 0x800009ae,0x200);
        *(dword **)(pdVar14 + 0x82) = in_stack_00000038;
        *(dword **)(pdVar14 + 0x84) = in_stack_00000030;
        *(undefined8 *)(pdVar14 + 0x88) = in_stack_00001bf8;
        *(undefined8 *)(pdVar14 + 0x86) = in_stack_00001bf0;
        *(undefined8 *)(pdVar14 + 0x8c) = in_stack_00001c08;
        *(undefined8 *)(pdVar14 + 0x8a) = in_stack_00001c00;
        *(undefined8 *)(pdVar14 + 0x90) = in_stack_00001c18;
        *(undefined8 *)(pdVar14 + 0x8e) = in_stack_00001c10;
        if (plVar23 == (long *)0x8000000000000001) goto code_r0x0043cef0;
      }
      if ((plVar23 != (long *)0x8000000000000000) &&
         (uVar18 = *(ulong *)(in_stack_00001730 + 4), uVar18 != 0)) {
        lVar27 = *(long *)(in_stack_00001730 + 2);
        uVar24 = *(undefined8 *)in_stack_00000040;
        uVar17 = *(ulong *)(in_stack_00000040 + 2);
        lVar13 = 0;
        if (uVar18 != 1) {
          do {
            lVar2 = (uVar18 >> 1) + lVar13;
            puVar25 = (undefined8 *)(lVar27 + lVar2 * 0x18);
            uVar5 = puVar25[1];
            uVar21 = uVar5;
            if (uVar17 <= uVar5) {
              uVar21 = uVar17;
            }
            iVar12 = _memcmp(*puVar25,uVar24,uVar21);
            lVar3 = uVar5 - uVar17;
            if (iVar12 != 0) {
              lVar3 = (long)iVar12;
            }
            if (lVar3 < 1) {
              lVar13 = lVar2;
            }
            uVar18 = uVar18 - (uVar18 >> 1);
          } while (1 < uVar18);
        }
        puVar25 = (undefined8 *)(lVar27 + lVar13 * 0x18);
        uVar21 = puVar25[1];
        uVar18 = uVar21;
        if (uVar17 <= uVar21) {
          uVar18 = uVar17;
        }
        iVar12 = _memcmp(*puVar25,uVar24,uVar18);
        lVar2 = uVar21 - uVar17;
        if (iVar12 != 0) {
          lVar2 = (long)iVar12;
        }
        if ((lVar2 == 0) &&
           (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,in_stack_00001730,
                            (long)in_stack_00001738 +
                            (*(long *)(lVar27 + lVar13 * 0x18 + 0x10) -
                            *(long *)(in_stack_00000040 + 4))), (int)in_stack_000009b0 != 5)) {
          uStack0000000000000050 = in_stack_000009b0;
          uStack0000000000000068 = in_stack_000009c8;
          in_stack_00000070 = in_stack_000009d0;
          in_stack_00000078 = in_stack_000009d8;
          in_stack_00000080 = in_stack_000009e0;
          in_stack_00000088 = in_stack_000009e8;
          in_stack_00000090 = in_stack_000009f0;
          in_stack_00000098 = in_stack_000009f8;
          in_stack_000000a0 = in_stack_00000a00;
          func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050);
          if (unaff_x23 < 2) {
            pcVar26 = *(code **)(in_stack_00000010 + 0x20);
            (*pcVar26)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
            while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
                  unaff_x23 < 2) {
              (*pcVar26)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
            }
          }
          if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
            func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
          }
          if (unaff_x23 < 2) {
            return;
          }
        }
      }
code_r0x0043cef0:
      uVar18 = unaff_x27[1];
      if (uVar18 == 0) {
        return;
      }
      lVar13 = *unaff_x27;
      if (uVar18 == 1) {
        uVar17 = 0;
      }
      else {
        uVar17 = 0;
        uVar21 = uVar18;
        do {
          uVar5 = (uVar21 >> 1) + uVar17;
          if (*(int7 **)(lVar13 + uVar5 * 0x18 + 0x10) <= in_stack_00001738) {
            uVar17 = uVar5;
          }
          uVar21 = uVar21 - (uVar21 >> 1);
        } while (1 < uVar21);
      }
      piVar16 = *(int7 **)(lVar13 + uVar17 * 0x18 + 0x10);
      if ((dword *)piVar16 != in_stack_00001738) {
        if (piVar16 < in_stack_00001738) {
          uVar17 = uVar17 + 1;
        }
        if (uVar17 == 0) {
          return;
        }
        uVar17 = uVar17 - 1;
      }
      if (uVar17 < uVar18) {
        uStack0000000000000058 = *(dword **)(lVar13 + uVar17 * 0x18);
        uStack0000000000000050 = (long *)CONCAT44(uStack0000000000000050._4_4_,3);
        (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
        return;
      }
      return;
    }
  }
  func_0x003f7334(auStack_7ffffffe + 0x80001526);
LAB_0043b8c0:
  _munmap(pdVar14,pdVar10);
  return;
}

