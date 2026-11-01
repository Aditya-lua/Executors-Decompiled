
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

void FUN_0043b508(long param_1,undefined8 param_2,segment_command *param_3)

{
  long lVar1;
  segment_command *psVar2;
  segment_command *psVar3;
  long lVar4;
  long *plVar5;
  ulong uVar6;
  qword qVar7;
  int *piVar8;
  qword *pqVar9;
  bool bVar10;
  int iVar11;
  segment_command *extraout_x1;
  segment_command *extraout_x1_00;
  uint uVar12;
  segment_command *psVar13;
  undefined1 *puVar14;
  long lVar15;
  undefined8 *puVar16;
  long in_x9;
  dword *pdVar17;
  long lVar18;
  ulong uVar19;
  long lVar20;
  ulong uVar21;
  segment_command *psVar22;
  qword *pqVar23;
  int *piVar24;
  ulong uVar25;
  undefined1 *puVar26;
  segment_command *unaff_x19;
  long lVar27;
  long *plVar28;
  undefined8 uVar29;
  segment_command *unaff_x21;
  segment_command *unaff_x22;
  code *pcVar30;
  segment_command *unaff_x23;
  undefined8 *puVar31;
  undefined1 *unaff_x26;
  long *plVar32;
  segment_command *unaff_x28;
  long unaff_x29;
  undefined1 auVar33 [16];
  uint uStack0000000000000008;
  long in_stack_00000010;
  segment_command *in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  segment_command *in_stack_00000030;
  segment_command *in_stack_00000038;
  segment_command *in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  segment_command *in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  long *in_stack_000009b0;
  segment_command *in_stack_000009b8;
  segment_command *in_stack_000009c0;
  undefined8 in_stack_000009c8;
  undefined8 in_stack_000009d0;
  undefined8 in_stack_000009d8;
  undefined8 in_stack_000009e0;
  undefined8 in_stack_000009e8;
  undefined8 in_stack_000009f0;
  long in_stack_000009f8;
  undefined8 in_stack_00000a00;
  qword in_stack_00001320;
  qword in_stack_00001328;
  qword in_stack_00001330;
  undefined8 in_stack_00001338;
  undefined8 in_stack_00001340;
  long in_stack_00001348;
  segment_command *in_stack_00001528;
  segment_command *in_stack_00001530;
  segment_command *in_stack_00001538;
  long in_stack_00001540;
  segment_command *in_stack_00001548;
  ulong in_stack_00001550;
  segment_command *in_stack_00001730;
  segment_command *in_stack_00001738;
  segment_command *in_stack_00001780;
  segment_command *in_stack_00001788;
  undefined8 in_stack_00001790;
  ushort uVar34;
  undefined8 in_stack_00001798;
  short in_stack_000017c0;
  long in_stack_00001ba8;
  undefined8 in_stack_00001bb0;
  undefined8 in_stack_00001bb8;
  qword in_stack_00001bf0;
  qword in_stack_00001bf8;
  qword in_stack_00001c00;
  undefined8 in_stack_00001c08;
  undefined8 in_stack_00001c10;
  long in_stack_00001c18;
  segment_command *in_stack_00001e00;
  undefined8 in_stack_00001e18;
  short in_stack_00001e40;
  segment_command *in_stack_00002258;
  undefined8 in_stack_00002260;
  long in_stack_00002268;
  ulong in_stack_00002270;
  segment_command *in_stack_00002278;
  segment_command *in_stack_00002280;
  int *in_stack_00002460;
  long in_stack_00002468;
  ulong in_stack_00002470;
  undefined1 auStack_7ffffffe [6];
  segment_command asStack_7ffffff8 [29826161];
  
  psVar22 = psRam0000000000a29cb8;
  lVar27 = param_1;
  do {
    puVar16 = (undefined8 *)(lVar27 + 0x20);
    plVar28 = (long *)(lVar27 + 0x28);
    plVar32 = *(long **)(lVar27 + 0x30);
    lVar27 = lVar27 + 0x38;
    lVar20 = *plVar28 << 4;
    plVar28 = (long *)*puVar16;
    while (lVar20 != 0) {
      lVar18 = *plVar28;
      plVar5 = plVar28 + 1;
      lVar20 = lVar20 + -0x10;
      plVar28 = plVar28 + 2;
      if ((undefined1 *)(lVar18 + (long)plVar32) <= unaff_x26 &&
          unaff_x26 < (undefined1 *)(lVar18 + (long)plVar32) + *plVar5) {
        if (&MACH_HEADER.cputype < psRam0000000000a2a5f8) {
          func_0x007a28b0(psRam0000000000a2a5f8,4,&UNK_009dc378);
          psVar22 = extraout_x1;
          unaff_x19 = in_stack_00002258;
          goto code_r0x0043c540;
        }
        if (psRam0000000000a2a5f8 != (segment_command *)0x0) {
          if (psRam0000000000a29cb8 == unaff_x23) {
            psVar13 = (segment_command *)0x0;
          }
          else {
            pdVar17 = (dword *)((long)unaff_x19 + (long)psRam0000000000a2a5f8 * 0x250);
            unaff_x21 = psRam0000000000a29cb8;
            if (pdVar17 == (dword *)0xa29ef0) goto LAB_0043b864;
            if (psRam0000000000a29f08 == unaff_x23) {
              psVar13 = (segment_command *)((long)&MACH_HEADER.magic + 1);
            }
            else {
              if (pdVar17 == (dword *)0xa2a140) goto LAB_0043b864;
              if (psRam0000000000a2a158 == unaff_x23) {
                psVar13 = (segment_command *)((long)&MACH_HEADER.magic + 2);
              }
              else {
                if ((pdVar17 == (dword *)0xa2a390) || (psRam0000000000a2a3a8 != unaff_x23))
                goto LAB_0043b864;
                psVar13 = (segment_command *)((long)&MACH_HEADER.magic + 3);
              }
            }
          }
          if (psRam0000000000a2a5f8 <= psVar13) {
            return;
          }
          lVar27 = (long)psVar13 * 0x250 + 0xa29cb8;
          _memcpy(auStack_7ffffffe + 0x800009ae,lVar27,0x250);
          if ((long)psVar13 * 0x250 != -0x250) {
            _memcpy(&uStack0000000000000050,0xa29cb8,0x250);
            _memcpy(0xa29cb8,auStack_7ffffffe + 0x800009ae,0x250);
            _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
            if (psVar22 != unaff_x23) {
              _memcpy(&uStack0000000000000050,0xa29f08,0x250);
              _memcpy(0xa29f08,auStack_7ffffffe + 0x800009ae,0x250);
              _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
              if (lVar27 != 0xa29f08) {
                _memcpy(&uStack0000000000000050,0xa2a158,0x250);
                _memcpy(0xa2a158,auStack_7ffffffe + 0x800009ae,0x250);
                _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
                if (lVar27 != 0xa2a158) {
                  _memcpy(&uStack0000000000000050,0xa2a3a8,0x250);
                  _memcpy(0xa2a3a8,auStack_7ffffffe + 0x800009ae,0x250);
                  _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
                }
              }
            }
          }
          goto LAB_0043b71c;
        }
LAB_0043b864:
        if (param_3 <= unaff_x23) goto code_r0x0043d1a0;
        param_1 = param_1 + (long)unaff_x23 * 0x38;
        plVar28 = *(long **)(param_1 + 8);
        psVar22 = *(segment_command **)(param_1 + 0x10);
        func_0x0043add8(&uStack0000000000000050,plVar28,psVar22);
        auVar33._8_8_ = in_stack_00000060;
        psVar13 = uStack0000000000000058;
        if (((ulong)uStack0000000000000050 & 1) == 0) {
          return;
        }
        func_0x0043d660(&uStack0000000000000050,uStack0000000000000058,in_stack_00000060);
        if ((((uStack0000000000000050 == (long *)0x0) ||
             ((int)*uStack0000000000000050 == -0x30051202)) ||
            (in_stack_00000060 < &segment_command_00000020)) ||
           (puVar14 = (undefined1 *)(ulong)*(uint *)((long)uStack0000000000000050 + 0x14),
           &in_stack_00000060[-1].fileoff < puVar14)) goto LAB_0043b8c0;
        iVar11 = (int)uStack0000000000000050[2];
        pqVar9 = &uStack0000000000000058->vmsize;
        goto code_r0x0043bb40;
      }
    }
    unaff_x23 = (segment_command *)((long)&unaff_x23->cmd + 1);
    if (lVar27 == in_x9) {
      return;
    }
  } while( true );
  while( true ) {
    if (puVar14 < &MACH_HEADER.cpusubtype) goto LAB_0043b8c0;
    uVar12 = *(uint *)((long)pqVar23 + 4);
    puVar26 = (undefined1 *)(ulong)uVar12;
    if (uVar12 < 8 || puVar14 < puVar26) goto LAB_0043b8c0;
    puVar14 = puVar14 + -(long)puVar26;
    iVar11 = iVar11 + -1;
    pqVar9 = (qword *)((long)pqVar23 + (long)puVar26);
    if ((int)*pqVar23 == 0x1b && 0x17 < uVar12) break;
code_r0x0043bb40:
    pqVar23 = pqVar9;
    if (iVar11 == 0) goto code_r0x0043c238;
  }
  if (psVar22 == (segment_command *)0x0) {
    bVar10 = false;
  }
  else {
    bVar10 = (char)*plVar28 == '/';
  }
  in_stack_00000040 = (segment_command *)(ulong)*(ushort *)((long)pqVar23 + 0xc);
  qVar7 = pqVar23[1];
  in_stack_00000038 = (segment_command *)(ulong)*(ushort *)((long)pqVar23 + 0x16);
  unaff_x28 = *(segment_command **)((long)pqVar23 + 0xe);
  in_stack_00000060 = (segment_command *)CONCAT71(in_stack_00000060._1_7_,6);
  in_stack_00000088 = CONCAT62(CONCAT51(in_stack_00000088._3_5_,bVar10),0x200);
  uStack0000000000000050 = plVar28;
  uStack0000000000000058 = psVar22;
  func_0x004248f4(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050);
  if (((byte)in_stack_000009b0 - 7 < 3) &&
     (lVar27 = func_0x00423fe0(&uStack0000000000000050), lVar27 != 0)) {
    func_0x00429d60(&uStack0000000000000050);
    plVar28 = uStack0000000000000050;
    if ((char)uStack0000000000000058 == '\x02') {
      if (((ulong)uStack0000000000000050 & 3) == 1) {
        puVar16 = (undefined8 *)((long)uStack0000000000000050 + -1);
        uVar29 = *puVar16;
        puVar31 = *(undefined8 **)((long)uStack0000000000000050 + 7);
        if ((code *)*puVar31 != (code *)0x0) {
          (*(code *)*puVar31)(uVar29);
        }
        if (puVar31[1] != 0) {
          func_0x00187bd4(uVar29,puVar31[1],puVar31[2]);
        }
        func_0x00187bd4(puVar16,0x18,8);
      }
    }
    else {
      in_stack_00000030 =
           (segment_command *)((ulong)unaff_x28 >> 0x10 | (long)in_stack_00000038 << 0x30);
      in_stack_00000028 = (ulong)(uint6)qVar7 | (long)unaff_x28 << 0x30;
      while( true ) {
        unaff_x28 = (segment_command *)(auStack_7ffffffe + 0x8000177e);
        func_0x0041743c(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x8000176e);
        if ((int)in_stack_000009b0 != 1) break;
        if (in_stack_000009b8 == (segment_command *)0x0) {
          if (((ulong)in_stack_000009c0 & 3) == 1) {
            puVar16 = (undefined8 *)((long)&in_stack_000009c0[-1].flags + 3);
            uVar29 = *puVar16;
            puVar31 = *(undefined8 **)((long)&in_stack_000009c0->cmdsize + 3);
            if ((code *)*puVar31 != (code *)0x0) {
              (*(code *)*puVar31)(uVar29);
            }
            if (puVar31[1] != 0) {
              func_0x00187bd4(uVar29,puVar31[1],puVar31[2]);
            }
            func_0x00187bd4(puVar16,0x18,8);
          }
          in_stack_00001528 = (segment_command *)0x8000000000000000;
          unaff_x22 = in_stack_00001730;
          unaff_x21 = in_stack_00001738;
code_r0x0043c4a8:
          lVar27 = *plVar28;
          *plVar28 = lVar27 + -1;
          LORelease();
          if (lVar27 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000176e);
          }
          if (in_stack_00001528 == (segment_command *)0x8000000000000000) goto code_r0x0043c22c;
          _memcpy(auStack_7ffffffe + 0x8000131e,auStack_7ffffffe + 0x8000152e,0x200);
          _munmap(psVar13,auVar33._8_8_);
          unaff_x28 = unaff_x21;
          goto code_r0x0043c358;
        }
        _memcpy(auStack_7ffffffe + 0x8000178e,auStack_7ffffffe + 0x800009c6,0x410);
        uVar34 = (ushort)((ulong)in_stack_00001798 >> 0x10);
        uVar21 = (ulong)uVar34;
        if (uVar34 == 0) {
          psVar22 = (segment_command *)((long)&MACH_HEADER.magic + 1);
        }
        else {
          psVar22 = (segment_command *)func_0x00187bd0(uVar21,1);
          if (psVar22 == (segment_command *)0x0) {
            func_0x007a1f00(1,uVar21,&UNK_009d9be8);
                    /* WARNING: Does not return */
            pcVar30 = (code *)SoftwareBreakpoint(1,0x43d26c);
            (*pcVar30)();
          }
        }
        _memcpy(psVar22,auStack_7ffffffe + 0x8000179b,uVar21);
        func_0x0046b8d0(&uStack0000000000000050,psVar22,uVar21);
        in_stack_00001780 = in_stack_000009b8;
        in_stack_00001788 = in_stack_000009c0;
        if ((((ulong)uStack0000000000000050 & 1) == 0) && (4 < uVar34)) {
          if (!(*(int *)((long)psVar22->segname + (uVar21 - 0xd)) == 0x5953642e &&
               *(char *)((long)psVar22->segname + (uVar21 - 9)) == 'M')) goto code_r0x0043bd4c;
          func_0x004261e4(&uStack0000000000000050,in_stack_000009b8->vmaddr,
                          in_stack_000009b8->vmsize,auStack_7ffffffe + 0x8000179b,uVar21);
          psVar2 = uStack0000000000000058;
          func_0x004261e4(auStack_7ffffffe + 0x80001ba6,uStack0000000000000058,in_stack_00000060,
                          &UNK_00887de9,0x18);
          if (uStack0000000000000050 != (long *)0x0) {
            func_0x00187bd4(psVar2,uStack0000000000000050,1);
          }
          func_0x00429d60(&uStack0000000000000050,in_stack_00001bb0,in_stack_00001bb8);
          plVar5 = uStack0000000000000050;
          in_stack_00000038 = psVar22;
          if ((char)uStack0000000000000058 == '\x02') {
            if (((ulong)uStack0000000000000050 & 3) == 1) {
              puVar16 = (undefined8 *)((long)uStack0000000000000050 + -1);
              uVar29 = *puVar16;
              puVar31 = *(undefined8 **)((long)uStack0000000000000050 + 7);
              if ((code *)*puVar31 != (code *)0x0) {
                (*(code *)*puVar31)(uVar29);
              }
              if (puVar31[1] != 0) {
                func_0x00187bd4(uVar29,puVar31[1],puVar31[2]);
              }
              func_0x00187bd4(puVar16,0x18,8);
            }
          }
          else {
            while( true ) {
              func_0x0041743c(&uStack0000000000000050,auStack_7ffffffe + 0x80001dee);
              psVar2 = uStack0000000000000058;
              if ((int)uStack0000000000000050 != 1) break;
              if (uStack0000000000000058 == (segment_command *)0x0) {
                if (((ulong)in_stack_00000060 & 3) == 1) {
                  puVar16 = (undefined8 *)((long)&in_stack_00000060[-1].flags + 3);
                  uVar29 = *puVar16;
                  puVar31 = *(undefined8 **)((long)&in_stack_00000060->cmdsize + 3);
                  if ((code *)*puVar31 != (code *)0x0) {
                    (*(code *)*puVar31)(uVar29);
                  }
                  if (puVar31[1] != 0) {
                    func_0x00187bd4(uVar29,puVar31[1],puVar31[2]);
                  }
                  func_0x00187bd4(puVar16,0x18,8);
                }
                unaff_x28 = (segment_command *)0x8000000000000000;
code_r0x0043c178:
                lVar27 = *plVar5;
                *plVar5 = lVar27 + -1;
                LORelease();
                if (lVar27 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x80001dee);
                }
                if (unaff_x28 == (segment_command *)0x8000000000000000) goto code_r0x0043c1a8;
                _memcpy(auStack_7ffffffe + 0x8000152e,auStack_7ffffffe + 0x80001bee,0x200);
                if (in_stack_00001ba8 != 0) {
                  func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
                }
                func_0x00187bd4(psVar22,uVar21,1);
                lVar27 = *(long *)in_stack_000009b8;
                *(long *)in_stack_000009b8 = lVar27 + -1;
                LORelease();
                in_stack_00001528 = unaff_x28;
                unaff_x22 = in_stack_00000018;
                unaff_x21 = _uStack0000000000000008;
                if (lVar27 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x8000177e);
                  unaff_x22 = in_stack_00000018;
                  unaff_x21 = _uStack0000000000000008;
                }
                goto code_r0x0043c4a8;
              }
              _memcpy(auStack_7ffffffe + 0x80001e0e,&uStack0000000000000068,0x410);
              func_0x004261e4(auStack_7ffffffe + 0x80002256,psVar2->vmaddr,psVar2->vmsize,
                              auStack_7ffffffe + 0x80001e1b,
                              (short)((ulong)in_stack_00001e18 >> 0x10));
              func_0x0043add8(unaff_x29 + -0xf0,in_stack_00002260,in_stack_00002268);
              if (*(int *)(unaff_x29 + -0xf0) != 1) {
                if (in_stack_00002258 != (segment_command *)0x0) {
                  func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
                }
                unaff_x28 = (segment_command *)0x8000000000000000;
code_r0x0043c158:
                lVar27 = *(long *)psVar2;
                *(long *)psVar2 = lVar27 + -1;
                LORelease();
                if (lVar27 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
                }
                goto code_r0x0043c178;
              }
              psVar3 = *(segment_command **)(unaff_x29 + -0xe8);
              in_stack_00000040 = *(segment_command **)(unaff_x29 + -0xe0);
              if (in_stack_00002258 != (segment_command *)0x0) {
                func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
              }
              func_0x0043d660(auStack_7ffffffe + 0x8000245e,psVar3,in_stack_00000040);
              if ((((in_stack_00002460 != (int *)0x0) && (*in_stack_00002460 != -0x30051202)) &&
                  (0x1f < in_stack_00002470)) &&
                 (uVar19 = (ulong)(uint)in_stack_00002460[5], uVar19 <= in_stack_00002470 - 0x20)) {
                iVar11 = in_stack_00002460[4];
                piVar8 = (int *)(in_stack_00002468 + 0x20);
                do {
                  piVar24 = piVar8;
                  if ((iVar11 == 0) || (uVar19 < 8)) goto code_r0x0043bf34;
                  uVar12 = piVar24[1];
                  uVar25 = (ulong)uVar12;
                  if (uVar12 < 8 || uVar19 < uVar25) goto code_r0x0043bf34;
                  uVar19 = uVar19 - uVar25;
                  iVar11 = iVar11 + -1;
                  piVar8 = (int *)((long)piVar24 + uVar25);
                } while (*piVar24 != 0x1b || uVar12 < 0x18);
                if ((*(segment_command **)(piVar24 + 4) == in_stack_00000030 &&
                     *(ulong *)(piVar24 + 2) == in_stack_00000028) &&
                   (func_0x0043d840(auStack_7ffffffe + 0x8000245e),
                   in_stack_00002460 != (int *)0x8000000000000000)) {
                  *(undefined8 *)(unaff_x29 + -0xf0) = 0x8000000000000000;
                  func_0x004385b0(auStack_7ffffffe + 0x80002256,auStack_7ffffffe + 0x800024de,
                                  unaff_x29 + -0xf0,unaff_x29 + -0xf0);
                  if (in_stack_00002258 != (segment_command *)0x8000000000000000) {
                    _memcpy(auStack_7ffffffe + 0x80001bee,auStack_7ffffffe + 0x8000225e,0x200);
                    unaff_x28 = in_stack_00002258;
                    _uStack0000000000000008 = in_stack_00000040;
                    in_stack_00000018 = psVar3;
                    goto code_r0x0043c158;
                  }
                }
              }
code_r0x0043bf34:
              func_0x003f7334(auStack_7ffffffe + 0x80002226);
              _munmap(psVar3,in_stack_00000040);
              lVar27 = *(long *)psVar2;
              *(long *)psVar2 = lVar27 + -1;
              LORelease();
              if (lVar27 == 1) {
                DataMemoryBarrier(2,1);
                func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
              }
            }
            lVar27 = *plVar5;
            *plVar5 = lVar27 + -1;
            LORelease();
            if (lVar27 == 1) {
              DataMemoryBarrier(2,1);
              func_0x004037b4(auStack_7ffffffe + 0x80001dee);
            }
          }
code_r0x0043c1a8:
          if (in_stack_00001ba8 != 0) {
            func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
          }
          func_0x00187bd4(psVar22,uVar21,1);
          lVar27 = *(long *)in_stack_000009b8;
          *(long *)in_stack_000009b8 = lVar27 + -1;
          LORelease();
          if (lVar27 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000177e);
          }
        }
        else {
          if (uVar34 != 0) {
code_r0x0043bd4c:
            func_0x00187bd4(psVar22,uVar21,1);
          }
          lVar27 = *(long *)in_stack_000009b8;
          *(long *)in_stack_000009b8 = lVar27 + -1;
          LORelease();
          if (lVar27 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000177e);
          }
        }
      }
      lVar27 = *plVar28;
      *plVar28 = lVar27 + -1;
      LORelease();
      if (lVar27 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x8000176e);
      }
    }
code_r0x0043c22c:
    func_0x003f7b28(auStack_7ffffffe + 0x80001526);
  }
code_r0x0043c238:
  in_stack_00001528 = (segment_command *)0x0;
  in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
  in_stack_00001540 = 0;
  in_stack_00001538 = (segment_command *)0x0;
  in_stack_00001548 = (segment_command *)&MACH_HEADER.cpusubtype;
  in_stack_00001550 = 0;
  func_0x0043d660(auStack_7ffffffe + 0x8000177e,psVar13,auVar33._8_8_);
  if (((in_stack_00001780 == (segment_command *)0x0) || (in_stack_00001780->cmd == 0xcffaedfe)) ||
     (func_0x0043d840(auStack_7ffffffe + 0x8000177e,in_stack_00001780,in_stack_00001788,
                      in_stack_00001790), in_stack_00001780 == (segment_command *)0x8000000000000000
     )) {
code_r0x0043c314:
    func_0x003f7334(auStack_7ffffffe + 0x80001526);
LAB_0043b8c0:
    _munmap(psVar13,auVar33._8_8_);
    return;
  }
  in_stack_000009b0 = (long *)0x8000000000000000;
  func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x80001dfe,
                  auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x800009ae);
  if (uStack0000000000000050 == (long *)0x8000000000000000) goto code_r0x0043c314;
  _memcpy(auStack_7ffffffe + 0x8000131e,&uStack0000000000000058,0x200);
  unaff_x21 = auVar33._8_8_;
  unaff_x22 = psVar13;
  in_stack_00001e40 = in_stack_000017c0;
code_r0x0043c358:
  _memcpy(auStack_7ffffffe + 0x80001e0e,auStack_7ffffffe + 0x8000131e,0x200);
  if (psRam0000000000a2a5f8 == (segment_command *)&MACH_HEADER.cputype) {
    psRam0000000000a2a5f8 = (segment_command *)((long)&MACH_HEADER.magic + 3);
    func_0x003f70a4();
    _munmap(uRam0000000000a2a5b8,uRam0000000000a2a5c0);
    func_0x003f7334(0xa2a5c8);
  }
  psVar22 = psRam0000000000a2a5f8;
  unaff_x19 = (segment_command *)((long)&psRam0000000000a2a5f8->cmd + 1);
  _memcpy(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x80001dfe,0x250);
  in_stack_00001e00 = unaff_x23;
  if (&MACH_HEADER.cputype < unaff_x19) {
    func_0x007a28b0(unaff_x19,4,&UNK_009dc360);
    param_3 = extraout_x1_00;
code_r0x0043d1a0:
    func_0x007a2570(unaff_x23,param_3,&UNK_009dc390);
code_r0x0043d1b0:
    if (in_stack_00002258 < in_stack_00000030) {
      func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,in_stack_00000030,
                      auStack_7ffffffe + 0x80002256,1,0,(ulong)_uStack0000000000000008 & 0xffffffff)
      ;
      if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2)) goto LAB_0043cc70;
      if (in_stack_00001540 != 0xd) goto code_r0x0043d288;
      lVar20._0_4_ = in_stack_00001538->cmd;
      lVar20._4_4_ = in_stack_00001538->cmdsize;
      in_stack_00001530 = in_stack_00002258;
      if (lVar20 != 0x424d595343453c2f || *(int5 *)in_stack_00001538->segname != 0x2f3e534c4f) {
        in_stack_00001530 = unaff_x19;
      }
    }
    else {
code_r0x0043d288:
      in_stack_00001530 = unaff_x19;
    }
    uVar21 = 0;
    lVar27 = 1;
    in_stack_00001528 = (segment_command *)0x0;
    in_stack_00001538 = in_stack_00000030;
    goto code_r0x0043c9e4;
  }
  if (unaff_x19 != (segment_command *)0x0) {
    lVar27 = (long)psVar22 * 0x250 + 0x250;
    lVar20 = 0xa29cb8;
    do {
      _memcpy(&uStack0000000000000050,lVar20,0x250);
      _memcpy(lVar20,auStack_7ffffffe + 0x800009ae,0x250);
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
      lVar27 = lVar27 + -0x250;
      lVar20 = lVar20 + 0x250;
    } while (lVar27 != 0);
  }
  psRam0000000000a2a5f8 = unaff_x19;
LAB_0043b71c:
  unaff_x21 = (segment_command *)(unaff_x26 + -(long)plVar32);
  func_0x0043aa50(auStack_7ffffffe + 0x800009ae,0xa29cc0,unaff_x21);
  plVar32 = (long *)0xa29cc8;
  if ((int)in_stack_000009b0 != 5) {
    bVar10 = false;
    pcVar30 = *(code **)(in_stack_00000010 + 0x20);
    uStack0000000000000050 = in_stack_000009b0;
    uStack0000000000000058 = in_stack_000009b8;
    in_stack_00000060 = in_stack_000009c0;
    uStack0000000000000068 = in_stack_000009c8;
    in_stack_00000070 = in_stack_000009d0;
    in_stack_00000078 = in_stack_000009d8;
    in_stack_00000080 = in_stack_000009e0;
    in_stack_00000088 = in_stack_000009e8;
    in_stack_00000090 = in_stack_000009f0;
    in_stack_00000098 = in_stack_000009f8;
    in_stack_000000a0 = in_stack_00000a00;
    while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
          in_stack_00001e00 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
      if (((in_stack_00001e40 == 2) && (uRam0000000000a29cd0 != 0)) && (uRam0000000000a29cd0 != 1))
      {
        lVar27 = 0;
        uVar21 = uRam0000000000a29cd0;
        do {
          lVar20 = (uVar21 >> 1) + lVar27;
          if (*(segment_command **)(lRam0000000000a29cc8 + lVar20 * 0x18 + 0x10) <= unaff_x21) {
            lVar27 = lVar20;
          }
          uVar21 = uVar21 - (uVar21 >> 1);
        } while (1 < uVar21);
      }
      (*pcVar30)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
      bVar10 = true;
    }
    if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
      func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
    }
    if (bVar10) {
      return;
    }
  }
  unaff_x26 = auStack_7ffffffe + 0x80001526;
  if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
     (in_stack_00000040 = (segment_command *)func_0x004432ec(0xa29cd8,unaff_x21),
     in_stack_00000040 == (segment_command *)0x0)) goto code_r0x0043cef0;
  uVar21 = in_stack_00000040->vmsize;
  unaff_x22 = (segment_command *)(lRam0000000000a29d18 + uVar21 * 0x248);
  if (uRam0000000000a29d20 <= uVar21) goto code_r0x0043cef0;
  plVar28 = *(long **)unaff_x22;
  if (plVar28 == (long *)0x8000000000000001) {
    if (uRam0000000000a29d00 <= uVar21) goto code_r0x0043cef0;
    puVar16 = (undefined8 *)(lRam0000000000a29cf8 + uVar21 * 0x20);
    func_0x0043add8(&uStack0000000000000050,*puVar16,puVar16[1]);
    psVar13 = in_stack_00000060;
    psVar22 = uStack0000000000000058;
    unaff_x28 = unaff_x22;
    if ((int)uStack0000000000000050 == 1) {
      in_stack_00000018 = (segment_command *)puVar16[2];
      in_stack_00000028 = puVar16[3];
      in_stack_00000030 = in_stack_00000060;
      in_stack_00001bf0 = 0;
      in_stack_00001bf8 = 8;
      in_stack_00001c08 = 0;
      in_stack_00001c00 = 0;
      in_stack_00001c10 = 8;
      in_stack_00001c18 = 0;
      in_stack_00000038 = uStack0000000000000058;
      if (in_stack_00000018 != (segment_command *)0x0) {
        if (in_stack_00000060 < &MACH_HEADER.cpusubtype) goto LAB_0043cc70;
        unaff_x19 = (segment_command *)&MACH_HEADER.cpusubtype;
        lVar27._0_4_ = uStack0000000000000058->cmd;
        lVar27._4_4_ = uStack0000000000000058->cmdsize;
        if (lVar27 == 0xa3e6e6968743c21) {
          uVar12 = 1;
code_r0x0043c54c:
          in_stack_00002258 = unaff_x19;
          uStack0000000000000008 = uVar12;
          if (in_stack_00000030 == (segment_command *)&MACH_HEADER.cpusubtype) {
            uVar21 = 0;
            in_stack_00001528 = (segment_command *)0x0;
            lVar27 = 1;
            in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
            in_stack_00001538 = (segment_command *)&MACH_HEADER.cpusubtype;
          }
          else {
            _uStack0000000000000008 = (segment_command *)(ulong)uVar12;
            func_0x0040b7cc(auStack_7ffffffe + 0x80001526,psVar22,in_stack_00000030,
                            auStack_7ffffffe + 0x80002256,1,0);
            if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2))
            goto LAB_0043cc70;
            uVar21 = 0;
            in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
            lVar27 = 1;
            if (in_stack_00001540 < 9) {
              if (in_stack_00001540 == 1) {
                if ((char)in_stack_00001538->cmd != '/') goto code_r0x0043c9cc;
                in_stack_00001530 = unaff_x19;
                if (unaff_x19 < in_stack_00000030) {
                  func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,in_stack_00000030,
                                  auStack_7ffffffe + 0x80002256,1,0,uVar12);
                  if (in_stack_00001528 != (segment_command *)((long)&MACH_HEADER.magic + 2)) {
                    if ((char)in_stack_00001538->cmd != '/') goto code_r0x0043c9d8;
                    in_stack_00001540 = 1;
                    if ((in_stack_00000030 <= unaff_x19) ||
                       (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,
                                        in_stack_00000030,auStack_7ffffffe + 0x80002256,1,0,uVar12),
                       in_stack_00001528 != (segment_command *)((long)&MACH_HEADER.magic + 2)))
                    goto code_r0x0043d1b0;
                  }
                  goto LAB_0043cc70;
                }
                goto code_r0x0043c9d8;
              }
              if (in_stack_00001540 != 2) {
                if (in_stack_00001540 != 7) goto code_r0x0043c9e0;
                if (*(int7 *)in_stack_00001538 == 0x2f34364d59532f) {
                  in_stack_00001530 = unaff_x19;
                  if (unaff_x19 < in_stack_00000030) {
                    func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,
                                    in_stack_00000030,auStack_7ffffffe + 0x80002256,1,0,uVar12);
                    if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2))
                    goto LAB_0043cc70;
                  }
                  goto code_r0x0043c9d8;
                }
                goto code_r0x0043c9cc;
              }
              if ((short)in_stack_00001538->cmd != 0x2f2f) goto code_r0x0043c9cc;
              if (in_stack_00001548 == (segment_command *)0x0) {
                uVar21 = 0;
                lVar27 = 1;
                in_stack_00001530 = unaff_x19;
              }
              else {
                if ((in_stack_00000030 < in_stack_00001548) ||
                   ((ulong)((long)in_stack_00000030 - (long)in_stack_00001548) < in_stack_00001550))
                goto LAB_0043cc70;
                lVar27 = (long)in_stack_00001548->segname +
                         (long)((long)in_stack_00000038->segname + -0x10);
                uVar21 = in_stack_00001550;
                in_stack_00001530 = unaff_x19;
              }
            }
            else {
              if (in_stack_00001540 < 0x10) {
                if (in_stack_00001540 != 9) {
                  if (in_stack_00001540 != 0xc) goto code_r0x0043c9e0;
                  lVar18._0_4_ = in_stack_00001538->cmd;
                  lVar18._4_4_ = in_stack_00001538->cmdsize;
                  uVar21 = (ulong)*(uint *)in_stack_00001538->segname;
                  uVar19 = 0x34365f46;
                  goto code_r0x0043c960;
                }
                lVar18._0_4_ = in_stack_00001538->cmd;
                lVar18._4_4_ = in_stack_00001538->cmdsize;
                bVar10 = (char)*(dword *)in_stack_00001538->segname == 'F';
code_r0x0043c964:
                if (!bVar10 || lVar18 != 0x45444d59532e5f5f) {
code_r0x0043c9cc:
                  in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
                  goto code_r0x0043c9d8;
                }
              }
              else {
                if (in_stack_00001540 == 0x10) {
                  lVar18._0_4_ = in_stack_00001538->cmd;
                  lVar18._4_4_ = in_stack_00001538->cmdsize;
                  uVar21 = *(ulong *)in_stack_00001538->segname;
                  uVar19 = 0x444554524f532046;
code_r0x0043c960:
                  bVar10 = uVar21 == uVar19;
                  goto code_r0x0043c964;
                }
                if (in_stack_00001540 != 0x13) goto code_r0x0043c9e0;
                lVar1._0_4_ = in_stack_00001538->cmd;
                lVar1._4_4_ = in_stack_00001538->cmdsize;
                if ((lVar1 != 0x45444d59532e5f5f ||
                    *(long *)in_stack_00001538->segname != 0x524f532034365f46) ||
                    *(long *)((long)in_stack_00001538->segname + 3) != 0x444554524f532034)
                goto code_r0x0043c9cc;
              }
              in_stack_00001530 = unaff_x19;
code_r0x0043c9d8:
              lVar27 = 1;
              uVar21 = 0;
            }
code_r0x0043c9e0:
            in_stack_00001528 = (segment_command *)0x0;
            in_stack_00001538 = in_stack_00000030;
          }
        }
        else {
          if (lVar27 == 0xa3e686372613c21) {
code_r0x0043c540:
            uVar12 = 0;
            goto code_r0x0043c54c;
          }
          if ((lVar27 != 0xa3e66616769623c) ||
             (in_stack_00000060 < (segment_command *)(section_00000068.segname + 8)))
          goto LAB_0043cc70;
          auVar33 = func_0x0043fb2c(&uStack0000000000000058->filesize,0x14,10);
          auVar33._8_8_ = auVar33._8_8_;
          if ((auVar33._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (auVar33._8_8_ != (segment_command *)0x0) {
            if ((auVar33._8_8_ <= psVar13) && (0x6f < (ulong)((long)psVar13 - (long)auVar33._8_8_)))
            {
              auVar33 = func_0x0043fb2c((long)((auVar33._8_8_)->segname +
                                              (long)((long)psVar22->segname + -0x10)) + 0x6c,4,10);
              if ((auVar33._0_8_ & 1) != 0) {
                pqVar9 = &auVar33._8_8_[1].fileoff;
                if ((pqVar9 <= psVar13) && (auVar33._8_8_ <= (ulong)((long)psVar13 - (long)pqVar9)))
                {
                  psVar3 = (segment_command *)((long)pqVar9 + auVar33._8_8_);
                  psVar2 = (segment_command *)((long)&psVar3->cmd + 1);
                  if (psVar3 == (segment_command *)0xffffffffffffffff) {
                    psVar2 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar3 & 1) != 0) {
                    psVar3 = psVar2;
                  }
                  if (((psVar3 <= psVar13) && (1 < (ulong)((long)psVar13 - (long)psVar3))) &&
                     (*(short *)(psVar3->segname + (long)((long)psVar22->segname + -0x10)) == 0xa60)
                     ) {
                    uVar21 = func_0x0043fb2c((auVar33._8_8_)->segname +
                                             (long)((long)psVar22->segname + -0x10),0x14,10);
code_r0x0043bb10:
                    if ((uVar21 & 1) != 0) goto code_r0x0043cfd4;
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
          auVar33 = func_0x0043fb2c((undefined1 *)((long)&psVar22->vmaddr + 4),0x14,10);
          auVar33._8_8_ = auVar33._8_8_;
          if ((auVar33._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (auVar33._8_8_ != (segment_command *)0x0) {
            if ((auVar33._8_8_ <= psVar13) && (0x6f < (ulong)((long)psVar13 - (long)auVar33._8_8_)))
            {
              auVar33 = func_0x0043fb2c((long)((auVar33._8_8_)->segname +
                                              (long)((long)psVar22->segname + -0x10)) + 0x6c,4,10);
              if ((auVar33._0_8_ & 1) != 0) {
                pqVar9 = &auVar33._8_8_[1].fileoff;
                if ((pqVar9 <= psVar13) && (auVar33._8_8_ <= (ulong)((long)psVar13 - (long)pqVar9)))
                {
                  psVar3 = (segment_command *)((long)pqVar9 + auVar33._8_8_);
                  psVar2 = (segment_command *)((long)&psVar3->cmd + 1);
                  if (psVar3 == (segment_command *)0xffffffffffffffff) {
                    psVar2 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar3 & 1) != 0) {
                    psVar3 = psVar2;
                  }
                  if (((psVar3 <= psVar13) && (1 < (ulong)((long)psVar13 - (long)psVar3))) &&
                     (*(short *)(psVar3->segname + (long)((long)psVar22->segname + -0x10)) == 0xa60)
                     ) {
                    uVar21 = func_0x0043fb2c((auVar33._8_8_)->segname +
                                             (long)((long)psVar22->segname + -0x10),0x14,10);
                    goto code_r0x0043bb10;
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
code_r0x0043cfd4:
          auVar33 = func_0x0043fb2c(psVar22->segname,0x14,10);
          auVar33._8_8_ = auVar33._8_8_;
          if ((auVar33._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (auVar33._8_8_ != (segment_command *)0x0) {
            if ((auVar33._8_8_ <= psVar13) && (0x6f < (ulong)((long)psVar13 - (long)auVar33._8_8_)))
            {
              auVar33 = func_0x0043fb2c((long)((auVar33._8_8_)->segname +
                                              (long)((long)psVar22->segname + -0x10)) + 0x6c,4,10);
              if ((auVar33._0_8_ & 1) != 0) {
                pqVar9 = &auVar33._8_8_[1].fileoff;
                if ((pqVar9 <= psVar13) && (auVar33._8_8_ <= (ulong)((long)psVar13 - (long)pqVar9)))
                {
                  psVar3 = (segment_command *)((long)pqVar9 + auVar33._8_8_);
                  psVar2 = (segment_command *)((long)&psVar3->cmd + 1);
                  if (psVar3 == (segment_command *)0xffffffffffffffff) {
                    psVar2 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar3 & 1) != 0) {
                    psVar3 = psVar2;
                  }
                  if (((psVar3 <= psVar13) && (1 < (ulong)((long)psVar13 - (long)psVar3))) &&
                     (*(short *)(psVar3->segname + (long)((long)psVar22->segname + -0x10)) == 0xa60)
                     ) {
                    auVar33 = func_0x0043fb2c((auVar33._8_8_)->segname +
                                              (long)((long)psVar22->segname + -0x10),0x14,10);
                    uVar21 = auVar33._8_8_;
                    if ((((auVar33._0_8_ & 1) != 0) &&
                        (auVar33._8_8_ = (segment_command *)((long)&psVar3->cmd + 2),
                        auVar33._8_8_ != (segment_command *)0x0)) &&
                       ((auVar33._8_8_ <= psVar13 &&
                        ((uVar21 <= (ulong)((long)psVar13 - (long)auVar33._8_8_) && (0x13 < uVar21))
                        )))) {
                      auVar33 = func_0x0043fb2c((auVar33._8_8_)->segname +
                                                (long)((long)psVar22->segname + -0x10),0x14,10);
                      in_stack_00001538 = auVar33._8_8_;
                      if (((auVar33._0_8_ & 1) != 0) &&
                         ((auVar33._8_8_ = 0, auVar33._0_8_ = in_stack_00001538,
                          SUB168(auVar33 * ZEXT816(0x14),8) == 0 &&
                          ((ulong)((long)in_stack_00001538 * 0x14) <= uVar21 - 0x14)))) {
                        in_stack_00001530 =
                             (segment_command *)
                             ((auVar33._8_8_)->segname + (long)((long)psVar22->segname + -0x10) +
                             0x14);
                        goto LAB_0043d168;
                      }
                    }
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
          in_stack_00001538 = (segment_command *)0x0;
          in_stack_00001530 = (segment_command *)((long)&MACH_HEADER.magic + 1);
LAB_0043d168:
          lVar27 = 1;
          uVar21 = 0;
          in_stack_00001528 = (segment_command *)((long)&MACH_HEADER.magic + 1);
          in_stack_00002258 = unaff_x19;
          uStack0000000000000008 = 0;
        }
code_r0x0043c9e4:
        unaff_x26[0x38] = (char)uStack0000000000000008;
        if ((int)in_stack_00001528 != 0) goto code_r0x0043ca98;
        while (in_stack_00001530 < in_stack_00001538) {
          func_0x0040b7cc(auStack_7ffffffe + 0x80002256,in_stack_00000038,in_stack_00000030,
                          auStack_7ffffffe + 0x8000152e,lVar27,uVar21,unaff_x26[0x38]);
          auVar33._8_8_ = in_stack_00001538;
          lVar20 = in_stack_00002268;
          psVar22 = in_stack_00002278;
          psVar13 = in_stack_00002280;
          uVar19 = in_stack_00002270;
          if (in_stack_00002258 != (segment_command *)((long)&MACH_HEADER.magic + 2))
          goto joined_r0x0043ca80;
joined_r0x0043ca60:
          in_stack_00001530 = auVar33._8_8_;
          if (in_stack_00001528 != (segment_command *)0x0) {
code_r0x0043ca98:
            if (in_stack_00001538 == (segment_command *)0x0) break;
            in_stack_00001538 = (segment_command *)((long)&in_stack_00001538[-1].flags + 3);
            auVar33 = func_0x0043fb2c(in_stack_00001530,0x14,10);
            psVar22 = auVar33._8_8_;
            if ((((auVar33._0_8_ & 1) != 0) && (psVar22 <= in_stack_00000030)) &&
               (0x6f < (ulong)((long)in_stack_00000030 - (long)psVar22))) {
              auVar33 = func_0x0043fb2c((long)(psVar22->segname +
                                              (long)((long)in_stack_00000038->segname + -0x10)) +
                                        0x6c,4,10);
              uVar19 = auVar33._8_8_;
              if ((auVar33._0_8_ & 1) != 0) {
                pqVar9 = &psVar22[1].fileoff;
                if ((pqVar9 <= in_stack_00000030) &&
                   (uVar19 <= (ulong)((long)in_stack_00000030 - (long)pqVar9))) {
                  auVar33._8_8_ = (segment_command *)((long)pqVar9 + uVar19);
                  psVar13 = (segment_command *)((long)&(auVar33._8_8_)->cmd + 1);
                  if (auVar33._8_8_ == (segment_command *)0xffffffffffffffff) {
                    psVar13 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)auVar33._8_8_ & 1) != 0) {
                    auVar33._8_8_ = psVar13;
                  }
                  if ((!(in_stack_00000030 < auVar33._8_8_ ||
                        (ulong)((long)in_stack_00000030 - (long)auVar33._8_8_) < 2)) &&
                     (*(short *)((auVar33._8_8_)->segname +
                                (long)((long)in_stack_00000038->segname + -0x10)) == 0xa60)) {
                    auVar33 = func_0x0043fb2c(psVar22->segname +
                                              (long)((long)in_stack_00000038->segname + -0x10),0x14,
                                              10);
                    if ((auVar33._0_8_ & 1) != 0) {
                      in_stack_00001530 =
                           (segment_command *)((long)in_stack_00001530->segname + 0xc);
                      lVar20 = (long)(pqVar9 + -1) + (long)in_stack_00000038->segname;
                      psVar22 = (segment_command *)((long)&(auVar33._8_8_)->cmd + 2);
                      psVar13 = auVar33._8_8_;
joined_r0x0043ca80:
                      auVar33._8_8_ = in_stack_00001530;
                      if ((uVar19 == in_stack_00000028) &&
                         (iVar11 = _memcmp(lVar20,in_stack_00000018,in_stack_00000028), iVar11 == 0)
                         ) {
                        if (psVar22 == (segment_command *)0x0) {
                          psVar13 = (segment_command *)0x0;
                          psVar22 = (segment_command *)((long)&MACH_HEADER.magic + 1);
                        }
                        else {
                          if ((in_stack_00000030 < psVar22) ||
                             ((segment_command *)((long)in_stack_00000030 - (long)psVar22) < psVar13
                             )) break;
                          psVar22 = (segment_command *)
                                    (psVar22->segname +
                                    (long)((long)in_stack_00000038->segname + -0x10));
                        }
                        goto code_r0x0043cbb4;
                      }
                      goto joined_r0x0043ca60;
                    }
                  }
                }
              }
            }
            in_stack_00001538 = (segment_command *)0x0;
            auVar33._8_8_ = (segment_command *)((long)&MACH_HEADER.magic + 1);
            goto joined_r0x0043ca60;
          }
        }
LAB_0043cc70:
        func_0x003f7334(auStack_7ffffffe + 0x80001bee);
        _munmap(in_stack_00000038,in_stack_00000030);
        goto code_r0x0043cc84;
      }
code_r0x0043cbb4:
      func_0x0043d660(auStack_7ffffffe + 0x80001526,psVar22,psVar13);
      if ((in_stack_00001528 == (segment_command *)0x0) || (in_stack_00001528->cmd == 0xcffaedfe))
      goto LAB_0043cc70;
      func_0x0043d840(auStack_7ffffffe + 0x80001526,in_stack_00001528,in_stack_00001530,
                      in_stack_00001538);
      if (in_stack_00001528 == (segment_command *)0x8000000000000000) goto LAB_0043cc70;
      in_stack_00001e00 = (segment_command *)0x8000000000000000;
      func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                      auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
      plVar28 = uStack0000000000000050;
      if (uStack0000000000000050 == (long *)0x8000000000000000) goto LAB_0043cc70;
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
      lVar15._0_4_ = unaff_x22->cmd;
      lVar15._4_4_ = unaff_x22->cmdsize;
      psVar22 = unaff_x22;
      unaff_x22 = unaff_x28;
    }
    else {
code_r0x0043cc84:
      plVar28 = (long *)0x8000000000000000;
      lVar15._0_4_ = unaff_x22->cmd;
      lVar15._4_4_ = unaff_x22->cmdsize;
      psVar22 = unaff_x22;
      unaff_x22 = unaff_x28;
      in_stack_00001bf0 = in_stack_00001320;
      in_stack_00001bf8 = in_stack_00001328;
      in_stack_00001c00 = in_stack_00001330;
      in_stack_00001c08 = in_stack_00001338;
      in_stack_00001c10 = in_stack_00001340;
      in_stack_00001c18 = in_stack_00001348;
    }
    if ((lVar15 != -0x7fffffffffffffff) && (lVar15 != -0x8000000000000000)) {
      func_0x003f70a4(psVar22);
      _munmap(*(undefined8 *)(psVar22[7].segname + 8),psVar22[7].vmaddr);
      func_0x003f7334(&psVar22[7].vmsize);
    }
    *(long **)psVar22 = plVar28;
    _memcpy(psVar22->segname,auStack_7ffffffe + 0x800009ae,0x200);
    *(segment_command **)(psVar22[7].segname + 8) = in_stack_00000038;
    psVar22[7].vmaddr = (qword)in_stack_00000030;
    psVar22[7].fileoff = in_stack_00001bf8;
    psVar22[7].vmsize = in_stack_00001bf0;
    psVar22[7].maxprot = (int)in_stack_00001c08;
    psVar22[7].initprot = (int)((ulong)in_stack_00001c08 >> 0x20);
    psVar22[7].filesize = in_stack_00001c00;
    psVar22[8].cmd = (int)in_stack_00001c18;
    psVar22[8].cmdsize = (int)((ulong)in_stack_00001c18 >> 0x20);
    psVar22[7].nsects = (int)in_stack_00001c10;
    psVar22[7].flags = (int)((ulong)in_stack_00001c10 >> 0x20);
    if (plVar28 == (long *)0x8000000000000001) goto code_r0x0043cef0;
  }
  if ((plVar28 != (long *)0x8000000000000000) &&
     (uVar21 = *(ulong *)((long)unaff_x22->segname + 8), uVar21 != 0)) {
    lVar20 = *(long *)unaff_x22->segname;
    lVar4._0_4_ = in_stack_00000040->cmd;
    lVar4._4_4_ = in_stack_00000040->cmdsize;
    uVar19 = *(ulong *)in_stack_00000040->segname;
    lVar27 = 0;
    if (uVar21 != 1) {
      do {
        lVar18 = (uVar21 >> 1) + lVar27;
        puVar16 = (undefined8 *)(lVar20 + lVar18 * 0x18);
        uVar6 = puVar16[1];
        uVar25 = uVar6;
        if (uVar19 <= uVar6) {
          uVar25 = uVar19;
        }
        iVar11 = _memcmp(*puVar16,lVar4,uVar25);
        lVar1 = uVar6 - uVar19;
        if (iVar11 != 0) {
          lVar1 = (long)iVar11;
        }
        if (lVar1 < 1) {
          lVar27 = lVar18;
        }
        uVar21 = uVar21 - (uVar21 >> 1);
      } while (1 < uVar21);
    }
    puVar16 = (undefined8 *)(lVar20 + lVar27 * 0x18);
    uVar25 = puVar16[1];
    uVar21 = uVar25;
    if (uVar19 <= uVar25) {
      uVar21 = uVar19;
    }
    iVar11 = _memcmp(*puVar16,lVar4,uVar21);
    lVar18 = uVar25 - uVar19;
    if (iVar11 != 0) {
      lVar18 = (long)iVar11;
    }
    if ((lVar18 == 0) &&
       (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,unaff_x22,
                        (long)unaff_x21 +
                        (*(long *)(lVar20 + lVar27 * 0x18 + 0x10) -
                        *(long *)((long)in_stack_00000040->segname + 8))),
       (int)in_stack_000009b0 != 5)) {
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
      if (in_stack_00001e00 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
        pcVar30 = *(code **)(in_stack_00000010 + 0x20);
        (*pcVar30)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
              in_stack_00001e00 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
          (*pcVar30)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        }
      }
      if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
        func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
      }
      if (in_stack_00001e00 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
        return;
      }
    }
  }
code_r0x0043cef0:
  uVar21 = plVar32[1];
  if (uVar21 == 0) {
    return;
  }
  lVar27 = *plVar32;
  if (uVar21 == 1) {
    uVar19 = 0;
  }
  else {
    uVar19 = 0;
    uVar25 = uVar21;
    do {
      uVar6 = (uVar25 >> 1) + uVar19;
      if (*(segment_command **)(lVar27 + uVar6 * 0x18 + 0x10) <= unaff_x21) {
        uVar19 = uVar6;
      }
      uVar25 = uVar25 - (uVar25 >> 1);
    } while (1 < uVar25);
  }
  psVar22 = *(segment_command **)(lVar27 + uVar19 * 0x18 + 0x10);
  if (psVar22 != unaff_x21) {
    if (psVar22 < unaff_x21) {
      uVar19 = uVar19 + 1;
    }
    if (uVar19 == 0) {
      return;
    }
    uVar19 = uVar19 - 1;
  }
  if (uVar19 < uVar21) {
    puVar16 = (undefined8 *)(lVar27 + uVar19 * 0x18);
    uStack0000000000000058 = (segment_command *)*puVar16;
    in_stack_00000060 = (segment_command *)puVar16[1];
    uStack0000000000000050 = (long *)CONCAT44(uStack0000000000000050._4_4_,3);
    (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    return;
  }
  return;
}

