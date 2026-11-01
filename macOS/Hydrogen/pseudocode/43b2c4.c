
/* WARNING: Removing unreachable block (ram,0x0043b600) */
/* WARNING: Removing unreachable block (ram,0x0043b62c) */
/* WARNING: Removing unreachable block (ram,0x0043b664) */
/* WARNING: Removing unreachable block (ram,0x0043b6a4) */
/* WARNING: Removing unreachable block (ram,0x0043b6e4) */
/* WARNING: Removing unreachable block (ram,0x0043b564) */
/* WARNING: Removing unreachable block (ram,0x0043b57c) */
/* WARNING: Removing unreachable block (ram,0x0043b598) */
/* WARNING: Removing unreachable block (ram,0x0043b5b0) */
/* WARNING: Removing unreachable block (ram,0x0043b5c0) */
/* WARNING: Removing unreachable block (ram,0x0043b5d8) */
/* WARNING: Removing unreachable block (ram,0x0043b5e8) */
/* WARNING: Removing unreachable block (ram,0x0043b5f4) */
/* WARNING: Removing unreachable block (ram,0x0043b5d0) */
/* WARNING: Removing unreachable block (ram,0x0043b5a8) */
/* WARNING: Removing unreachable block (ram,0x0043b574) */
/* WARNING: Removing unreachable block (ram,0x0043b5f8) */
/* WARNING: Removing unreachable block (ram,0x0043c530) */
/* WARNING: Removing unreachable block (ram,0x0043c8dc) */
/* WARNING: Removing unreachable block (ram,0x0043c8f0) */
/* WARNING: Removing unreachable block (ram,0x0043d26c) */
/* WARNING: Removing unreachable block (ram,0x0043c8f8) */
/* WARNING: Removing unreachable block (ram,0x0043c904) */
/* WARNING: Removing unreachable block (ram,0x0043c910) */
/* WARNING: Removing unreachable block (ram,0x0043c92c) */
/* WARNING: Removing unreachable block (ram,0x0043c674) */
/* WARNING: Removing unreachable block (ram,0x0043d138) */
/* WARNING: Type propagation algorithm not settling */

void FUN_0043b2c4(long param_1)

{
  long lVar1;
  segment_command *psVar2;
  segment_command *psVar3;
  long *plVar4;
  dword *pdVar5;
  qword qVar6;
  segment_command *psVar7;
  segment_command *psVar8;
  code *pcVar9;
  bool bVar10;
  int iVar11;
  int *piVar12;
  segment_command *psVar13;
  segment_command *extraout_x1;
  segment_command *psVar14;
  uint uVar15;
  long lVar16;
  ulong uVar17;
  undefined1 *puVar18;
  long lVar19;
  undefined8 *puVar20;
  segment_command *in_x10;
  ulong uVar21;
  ulong in_x11;
  long lVar22;
  segment_command *psVar23;
  ulong uVar24;
  long *plVar25;
  qword *pqVar26;
  int *piVar27;
  qword *pqVar28;
  undefined1 *puVar29;
  segment_command *unaff_x19;
  segment_command *psVar30;
  undefined8 uVar31;
  segment_command *unaff_x20;
  segment_command *psVar32;
  segment_command *psVar33;
  segment_command *psVar34;
  int unaff_w23;
  long unaff_x24;
  undefined8 *puVar35;
  segment_command *unaff_x26;
  long unaff_x27;
  long *plVar36;
  long unaff_x29;
  undefined4 uVar37;
  undefined6 uVar38;
  uint7 uVar39;
  segment_command *psVar40;
  ushort uVar41;
  undefined4 uVar42;
  undefined6 uVar43;
  ulong uVar44;
  undefined1 auVar45 [16];
  undefined8 in_stack_00000000;
  uint uStack0000000000000008;
  long in_stack_00000010;
  int iStack0000000000000018;
  undefined8 in_stack_00000020;
  segment_command *in_stack_00000028;
  uint uStack0000000000000030;
  undefined4 uStack0000000000000034;
  segment_command *in_stack_00000038;
  segment_command *in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  segment_command *in_stack_00000060;
  undefined8 uStack0000000000000068;
  segment_command *in_stack_00000070;
  segment_command *in_stack_00000078;
  segment_command *in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  segment_command *psVar46;
  segment_command *in_stack_000009c8;
  segment_command *in_stack_000009d0;
  segment_command *in_stack_000009d8;
  segment_command *in_stack_000009e0;
  undefined8 in_stack_000009e8;
  undefined8 in_stack_000009f0;
  long in_stack_000009f8;
  undefined8 in_stack_00000a00;
  qword in_stack_00001320;
  qword in_stack_00001328;
  qword in_stack_00001330;
  undefined8 in_stack_00001338;
  undefined8 in_stack_00001340;
  undefined8 in_stack_00001348;
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
  undefined8 in_stack_00001c18;
  segment_command *in_stack_00001e00;
  segment_command *in_stack_00001e08;
  segment_command *in_stack_00001e10;
  undefined8 in_stack_00001e18;
  short in_stack_00001e40;
  segment_command *in_stack_00002258;
  undefined8 in_stack_00002260;
  long in_stack_00002268;
  segment_command *in_stack_00002270;
  segment_command *in_stack_00002278;
  segment_command *in_stack_00002280;
  int *in_stack_00002460;
  long in_stack_00002468;
  ulong in_stack_00002470;
  undefined1 auStack_7ffffffe [6];
  undefined1 auStack_7ffffff8 [2147483640];
  
  psVar23 = _uStack0000000000000008;
code_r0x0043b2c4:
  uVar24 = in_x11 & 0x1ffffffffffffffc;
  pqVar28 = &in_x10->vmsize;
  uVar21 = uVar24;
  do {
    *(long *)(pqVar28 + -4) = *(long *)(pqVar28 + -4) - param_1;
    pqVar28[-2] = pqVar28[-2] - param_1;
    *pqVar28 = *pqVar28 - param_1;
    pqVar28[2] = pqVar28[2] - param_1;
    pqVar28 = pqVar28 + 8;
    uVar21 = uVar21 - 4;
  } while (uVar21 != 0);
  psVar30 = (segment_command *)((long)in_x10->segname + (uVar24 * 4 + -2) * 4);
  if (in_x11 == uVar24) goto LAB_0043b330;
code_r0x0043b318:
  do {
    pdVar5 = (dword *)psVar30->segname;
    *(long *)psVar30 = *(long *)psVar30 - param_1;
    psVar30 = (segment_command *)(pdVar5 + 2);
  } while ((segment_command *)(pdVar5 + 2) !=
           (segment_command *)((long)in_x10->segname + ((long)unaff_x19 * 4 + -2) * 4));
LAB_0043b330:
  in_stack_00000038 = (segment_command *)((long)in_stack_00000038->segname + param_1 + -8);
  psVar30 = unaff_x20;
code_r0x0043b33c:
  if ((long)psVar30 < 0) {
    in_stack_00000000 = 0;
LAB_0043d174:
    func_0x007a1f00(in_stack_00000000,psVar30,&UNK_009d9be8);
    goto code_r0x0043d268;
  }
  if (psVar30 == (segment_command *)0x0) {
    psVar13 = (segment_command *)((long)&MACH_HEADER.magic + 1);
  }
  else {
    psVar13 = (segment_command *)func_0x00187bd0(psVar30,1);
    if (psVar13 == (segment_command *)0x0) goto LAB_0043d174;
  }
  _memcpy(psVar13,unaff_x24,psVar30);
  psVar8 = in_stack_00000060;
  psVar7 = uStack0000000000000058;
  psVar46 = uStack0000000000000050;
  psVar33 = psVar30;
code_r0x0043b398:
  psVar34 = (segment_command *)((ulong)_iStack0000000000000018 & 0xffffffff);
  while( true ) {
    in_stack_00000080 = in_stack_00000038;
    uStack0000000000000050 = psVar33;
    uStack0000000000000058 = psVar13;
    in_stack_00000060 = psVar30;
    uStack0000000000000068 = psVar46;
    in_stack_00000070 = psVar7;
    in_stack_00000078 = psVar8;
    if ((ulong)((long)in_stack_00001e00 - (long)in_stack_00001e10) < (ulong)(psVar33 != unaff_x26))
    {
      func_0x007a0000(auStack_7ffffffe + 0x80001dfe,in_stack_00001e10,(ulong)(psVar33 != unaff_x26),
                      8,0x38);
    }
    if (psVar33 != unaff_x26) {
      puVar20 = (undefined8 *)
                ((long)in_stack_00001e08->segname + (long)in_stack_00001e10 * unaff_x27 + -8);
      *puVar20 = psVar33;
      puVar20[1] = psVar13;
      puVar20[2] = psVar30;
      puVar20[3] = uStack0000000000000068;
      puVar20[4] = in_stack_00000070;
      puVar20[6] = in_stack_00000080;
      puVar20[5] = in_stack_00000078;
      in_stack_00001e10 = (segment_command *)((long)&in_stack_00001e10->cmd + 1);
    }
    unaff_w23 = unaff_w23 + 1;
    if (unaff_w23 == iStack0000000000000018) break;
    unaff_x24 = __dyld_get_image_name(unaff_w23);
    if (unaff_x24 != 0) {
      unaff_x20 = (segment_command *)_strlen();
      piVar12 = (int *)__dyld_get_image_header(unaff_w23);
      in_stack_00000028 = unaff_x20;
      if (piVar12 != (int *)0x0) {
        if (*piVar12 == -0x1120531) {
          lVar16 = 0x20;
          goto code_r0x0043b08c;
        }
        if (*piVar12 == -0x1120532) goto code_r0x0043b078;
      }
    }
    psVar33 = (segment_command *)0x8000000000000000;
  }
  uStack0000000000000050 = in_stack_00001e00;
  uStack0000000000000058 = in_stack_00001e08;
  in_stack_00000060 = in_stack_00001e10;
  _memcpy(&uStack0000000000000068,auStack_7ffffffe + 0x800009ae,0x940);
  lVar22 = lRam0000000000a29ca8;
  lVar16 = lRam0000000000a29ca0;
  if (lRam0000000000a29ca0 != -0x8000000000000000) {
    if (psRam0000000000a29cb0 != (segment_command *)0x0) {
      psVar34 = (segment_command *)(lRam0000000000a29ca8 + 0x20);
      psVar30 = psRam0000000000a29cb0;
      do {
        if (*(undefined8 *)((long)psVar34 + -0x20) != 0) {
          func_0x00187bd4(*(undefined8 *)((long)psVar34 + -0x18),
                          *(undefined8 *)((long)psVar34 + -0x20),1);
        }
        if (*(undefined8 *)((long)psVar34 + -8) != 0) {
          func_0x00187bd4(*(undefined8 *)psVar34,*(undefined8 *)((long)psVar34 + -8) << 4,8);
        }
        psVar34 = (segment_command *)((long)psVar34 + 0x38);
        psVar30 = (segment_command *)((long)&psVar30[-1].flags + 3);
      } while (psVar30 != (segment_command *)0x0);
    }
    psVar33 = (segment_command *)0x0;
    if (lVar16 != 0) {
      func_0x00187bd4(lVar22,lVar16 * 0x38,8);
    }
  }
  psVar30 = (segment_command *)0xa29ca0;
  _memcpy(0xa29ca0,&uStack0000000000000050,0x958);
  psRam0000000000a2a5f8 = (segment_command *)0x0;
  if (psRam0000000000a29cb0 == (segment_command *)0x0) {
    psRam0000000000a2a5f8 = (segment_command *)0x0;
    return;
  }
  psVar40 = (segment_command *)0x0;
  lVar16 = lRam0000000000a29ca8;
LAB_0043b50c:
  puVar20 = (undefined8 *)(lVar16 + 0x20);
  plVar25 = (long *)(lVar16 + 0x28);
  plVar36 = *(long **)(lVar16 + 0x30);
  lVar16 = lVar16 + 0x38;
  lVar22 = *plVar25 << 4;
  plVar25 = (long *)*puVar20;
  do {
    if (lVar22 == 0) goto LAB_0043b540;
    lVar19 = *plVar25;
    plVar4 = plVar25 + 1;
    lVar22 = lVar22 + -0x10;
    plVar25 = plVar25 + 2;
  } while (_uStack0000000000000008 < (segment_command *)(lVar19 + (long)plVar36) ||
           (segment_command *)
           (((segment_command *)(lVar19 + (long)plVar36))->segname + *plVar4 + -8) <=
           _uStack0000000000000008);
  psVar14 = psRam0000000000a29cb0;
  if (psRam0000000000a29cb0 <= psVar40) goto code_r0x0043d1a0;
  lVar16 = lRam0000000000a29ca8 + (long)psVar40 * 0x38;
  psVar30 = *(segment_command **)(lVar16 + 8);
  psVar33 = *(segment_command **)(lVar16 + 0x10);
  func_0x0043add8(&uStack0000000000000050,psVar30,psVar33);
  psVar32 = in_stack_00000060;
  psVar14 = uStack0000000000000058;
  if (((ulong)uStack0000000000000050 & 1) == 0) {
    return;
  }
  func_0x0043d660(&uStack0000000000000050,uStack0000000000000058,in_stack_00000060);
  if ((((uStack0000000000000050 == (segment_command *)0x0) ||
       (uStack0000000000000050->cmd == 0xcffaedfe)) ||
      (in_stack_00000060 < &segment_command_00000020)) ||
     (puVar18 = (undefined1 *)(ulong)*(uint *)(uStack0000000000000050->segname + 0xc),
     &in_stack_00000060[-1].fileoff < puVar18)) goto LAB_0043b8c0;
  iVar11 = *(int *)(uStack0000000000000050->segname + 8);
  pqVar28 = &uStack0000000000000058->vmsize;
  do {
    pqVar26 = pqVar28;
    if (iVar11 == 0) {
code_r0x0043c238:
      in_stack_00001528 = (segment_command *)0x0;
      in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
      in_stack_00001540 = 0;
      in_stack_00001538 = (segment_command *)0x0;
      in_stack_00001548 = (segment_command *)&MACH_HEADER.cpusubtype;
      in_stack_00001550 = 0;
      func_0x0043d660(auStack_7ffffffe + 0x8000177e,psVar14,psVar32);
      if (((in_stack_00001780 != (segment_command *)0x0) && (in_stack_00001780->cmd != 0xcffaedfe))
         && (func_0x0043d840(auStack_7ffffffe + 0x8000177e,in_stack_00001780,in_stack_00001788,
                             in_stack_00001790),
            in_stack_00001780 != (segment_command *)0x8000000000000000)) {
        psVar46 = (segment_command *)0x8000000000000000;
        func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x80001dfe,
                        auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x800009ae);
        if (uStack0000000000000050 != (segment_command *)0x8000000000000000) {
          _memcpy(auStack_7ffffffe + 0x8000131e,&uStack0000000000000058,0x200);
          psVar33 = psVar32;
          psVar34 = psVar14;
          in_stack_00001e40 = in_stack_000017c0;
          goto code_r0x0043c358;
        }
      }
      func_0x003f7334(auStack_7ffffffe + 0x80001526);
LAB_0043b8c0:
      _munmap(psVar14,psVar32);
      return;
    }
    if (puVar18 < &MACH_HEADER.cpusubtype) goto LAB_0043b8c0;
    uVar15 = *(uint *)((long)pqVar26 + 4);
    puVar29 = (undefined1 *)(ulong)uVar15;
    if (uVar15 < 8 || puVar18 < puVar29) goto LAB_0043b8c0;
    puVar18 = puVar18 + -(long)puVar29;
    iVar11 = iVar11 + -1;
    pqVar28 = (qword *)((long)pqVar26 + (long)puVar29);
  } while ((int)*pqVar26 != 0x1b || uVar15 < 0x18);
  if (psVar33 == (segment_command *)0x0) {
    bVar10 = false;
  }
  else {
    bVar10 = (char)psVar30->cmd == '/';
  }
  in_stack_00000040 = (segment_command *)(ulong)*(ushort *)((long)pqVar26 + 0xc);
  qVar6 = pqVar26[1];
  in_stack_00000038 = (segment_command *)(ulong)*(ushort *)((long)pqVar26 + 0x16);
  psVar13 = *(segment_command **)((long)pqVar26 + 0xe);
  in_stack_00000060 = (segment_command *)CONCAT71(in_stack_00000060._1_7_,6);
  in_stack_00000088 = CONCAT62(CONCAT51(in_stack_00000088._3_5_,bVar10),0x200);
  uStack0000000000000050 = psVar30;
  uStack0000000000000058 = psVar33;
  func_0x004248f4(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050);
  if ((2 < (byte)psVar46 - 7) || (lVar16 = func_0x00423fe0(&uStack0000000000000050), lVar16 == 0))
  goto code_r0x0043c238;
  func_0x00429d60(&uStack0000000000000050);
  psVar30 = uStack0000000000000050;
  if ((char)uStack0000000000000058 == '\x02') {
    if (((ulong)uStack0000000000000050 & 3) == 1) {
      puVar20 = (undefined8 *)((long)&uStack0000000000000050[-1].flags + 3);
      uVar31 = *puVar20;
      puVar35 = *(undefined8 **)((long)&uStack0000000000000050->cmdsize + 3);
      if ((code *)*puVar35 != (code *)0x0) {
        (*(code *)*puVar35)(uVar31);
      }
      if (puVar35[1] != 0) {
        func_0x00187bd4(uVar31,puVar35[1],puVar35[2]);
      }
      func_0x00187bd4(puVar20,0x18,8);
    }
code_r0x0043c22c:
    func_0x003f7b28(auStack_7ffffffe + 0x80001526);
    goto code_r0x0043c238;
  }
  _uStack0000000000000030 =
       (segment_command *)((ulong)psVar13 >> 0x10 | (long)in_stack_00000038 << 0x30);
  in_stack_00000028 = (segment_command *)((ulong)(uint6)qVar6 | (long)psVar13 << 0x30);
code_r0x0043bc7c:
  do {
    psVar13 = (segment_command *)(auStack_7ffffffe + 0x8000177e);
    func_0x0041743c(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x8000176e);
    if ((int)psVar46 != 1) {
      lVar16 = *(long *)psVar30;
      *(long *)psVar30 = lVar16 + -1;
      LORelease();
      if (lVar16 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x8000176e);
      }
      goto code_r0x0043c22c;
    }
    if (psVar7 == (segment_command *)0x0) {
      if (((ulong)psVar8 & 3) == 1) {
        puVar20 = (undefined8 *)((long)&psVar8[-1].flags + 3);
        uVar31 = *puVar20;
        puVar35 = *(undefined8 **)((long)&psVar8->cmdsize + 3);
        if ((code *)*puVar35 != (code *)0x0) {
          (*(code *)*puVar35)(uVar31);
        }
        if (puVar35[1] != 0) {
          func_0x00187bd4(uVar31,puVar35[1],puVar35[2]);
        }
        func_0x00187bd4(puVar20,0x18,8);
      }
      in_stack_00001528 = (segment_command *)0x8000000000000000;
      psVar34 = in_stack_00001730;
      psVar33 = in_stack_00001738;
code_r0x0043c4a8:
      lVar16 = *(long *)psVar30;
      *(long *)psVar30 = lVar16 + -1;
      LORelease();
      if (lVar16 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x8000176e);
      }
      if (in_stack_00001528 == (segment_command *)0x8000000000000000) goto code_r0x0043c22c;
      _memcpy(auStack_7ffffffe + 0x8000131e,auStack_7ffffffe + 0x8000152e,0x200);
      _munmap(psVar14,psVar32);
      psVar13 = psVar33;
code_r0x0043c358:
      _memcpy(auStack_7ffffffe + 0x80001e0e,auStack_7ffffffe + 0x8000131e,0x200);
      if (psRam0000000000a2a5f8 == (segment_command *)&MACH_HEADER.cputype) {
        psRam0000000000a2a5f8 = (segment_command *)((long)&MACH_HEADER.magic + 3);
        func_0x003f70a4();
        _munmap(uRam0000000000a2a5b8,uRam0000000000a2a5c0);
        func_0x003f7334(0xa2a5c8);
      }
      psVar14 = psRam0000000000a2a5f8;
      psVar30 = (segment_command *)((long)&psRam0000000000a2a5f8->cmd + 1);
      _memcpy(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x80001dfe,0x250);
      if (&MACH_HEADER.cputype < psVar30) {
        func_0x007a28b0(psVar30,4,&UNK_009dc360);
        psVar14 = extraout_x1;
        in_stack_00001e00 = psVar40;
        goto code_r0x0043d1a0;
      }
      if (psVar30 != (segment_command *)0x0) {
        lVar16 = (long)psVar14 * 0x250 + 0x250;
        lVar22 = 0xa29cb8;
        do {
          _memcpy(&uStack0000000000000050,lVar22,0x250);
          _memcpy(lVar22,auStack_7ffffffe + 0x800009ae,0x250);
          _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
          lVar16 = lVar16 + -0x250;
          lVar22 = lVar22 + 0x250;
        } while (lVar16 != 0);
      }
      psVar33 = (segment_command *)((long)psVar23 - (long)plVar36);
      psRam0000000000a2a5f8 = psVar30;
      func_0x0043aa50(auStack_7ffffffe + 0x800009ae,0xa29cc0,psVar33);
      plVar36 = (long *)0xa29cc8;
      if ((int)psVar46 != 5) {
        bVar10 = false;
        pcVar9 = *(code **)(in_stack_00000010 + 0x20);
        uStack0000000000000050 = psVar46;
        uStack0000000000000058 = psVar7;
        in_stack_00000060 = psVar8;
        uStack0000000000000068 = in_stack_000009c8;
        in_stack_00000070 = in_stack_000009d0;
        in_stack_00000078 = in_stack_000009d8;
        in_stack_00000080 = in_stack_000009e0;
        in_stack_00000088 = in_stack_000009e8;
        in_stack_00000090 = in_stack_000009f0;
        in_stack_00000098 = in_stack_000009f8;
        in_stack_000000a0 = in_stack_00000a00;
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
              psVar40 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
          if (((in_stack_00001e40 == 2) && (uRam0000000000a29cd0 != 0)) &&
             (uRam0000000000a29cd0 != 1)) {
            lVar16 = 0;
            uVar21 = uRam0000000000a29cd0;
            do {
              lVar22 = (uVar21 >> 1) + lVar16;
              if (*(segment_command **)(lRam0000000000a29cc8 + lVar22 * 0x18 + 0x10) <= psVar33) {
                lVar16 = lVar22;
              }
              uVar21 = uVar21 - (uVar21 >> 1);
            } while (1 < uVar21);
          }
          (*pcVar9)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
          bVar10 = true;
        }
        if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
          func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
        }
        if (bVar10) {
          return;
        }
      }
      psVar23 = (segment_command *)(auStack_7ffffffe + 0x80001526);
      if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
         (in_stack_00000040 = (segment_command *)func_0x004432ec(0xa29cd8,psVar33),
         in_stack_00000040 == (segment_command *)0x0)) goto code_r0x0043cef0;
      uVar21 = in_stack_00000040->vmsize;
      psVar34 = (segment_command *)(lRam0000000000a29d18 + uVar21 * 0x248);
      if (uRam0000000000a29d20 <= uVar21) goto code_r0x0043cef0;
      psVar30 = *(segment_command **)psVar34;
      if (psVar30 == (segment_command *)0x8000000000000001) {
        if (uRam0000000000a29d00 <= uVar21) goto code_r0x0043cef0;
        puVar20 = (undefined8 *)(lRam0000000000a29cf8 + uVar21 * 0x20);
        func_0x0043add8(&uStack0000000000000050,*puVar20,puVar20[1]);
        psVar32 = in_stack_00000060;
        psVar14 = uStack0000000000000058;
        psVar13 = psVar34;
        if ((int)uStack0000000000000050 == 1) {
          _iStack0000000000000018 = (segment_command *)puVar20[2];
          in_stack_00000028 = (segment_command *)puVar20[3];
          _uStack0000000000000030 = in_stack_00000060;
          in_stack_00001bf0 = 0;
          in_stack_00001bf8 = 8;
          in_stack_00001c08 = 0;
          in_stack_00001c00 = 0;
          in_stack_00001c10 = 8;
          in_stack_00001c18 = 0;
          in_stack_00000038 = uStack0000000000000058;
          psVar30 = uStack0000000000000058;
          if (_iStack0000000000000018 != (segment_command *)0x0) {
            if (in_stack_00000060 < &MACH_HEADER.cpusubtype) goto LAB_0043cc70;
            lVar16._0_4_ = uStack0000000000000058->cmd;
            lVar16._4_4_ = uStack0000000000000058->cmdsize;
            if (lVar16 == 0xa3e6e6968743c21) {
              uVar15 = 1;
code_r0x0043c54c:
              psVar30 = (segment_command *)&MACH_HEADER.cpusubtype;
              in_stack_00001c18 = 0;
              in_stack_00001c10 = 8;
              in_stack_00001c08 = 0;
              in_stack_00001c00 = 0;
              in_stack_00001bf8 = 8;
              in_stack_00001bf0 = 0;
              plVar36 = (long *)0xa29cc8;
              in_stack_00002258 = psVar30;
              uStack0000000000000008 = uVar15;
              if (in_stack_00000060 == (segment_command *)&MACH_HEADER.cpusubtype) {
                in_stack_00001550 = 0;
                in_stack_00001528 = (segment_command *)0x0;
                lVar16 = 1;
                in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
                in_stack_00001538 = (segment_command *)&MACH_HEADER.cpusubtype;
                goto code_r0x0043c9e4;
              }
              _uStack0000000000000008 = (segment_command *)(ulong)uVar15;
              func_0x0040b7cc(auStack_7ffffffe + 0x80001526,uStack0000000000000058,in_stack_00000060
                              ,auStack_7ffffffe + 0x80002256,1,0);
              if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2))
              goto LAB_0043cc70;
              uVar21 = 0;
              lVar16 = 1;
              if (8 < in_stack_00001540) {
                if (in_stack_00001540 < 0x10) {
                  if ((in_stack_00001540 == 9) ||
                     (in_stack_00001550 = uVar21, in_stack_00001540 == 0xc)) goto code_r0x0043c9d8;
                }
                else if ((in_stack_00001540 == 0x10) ||
                        (in_stack_00001550 = uVar21, in_stack_00001540 == 0x13)) {
code_r0x0043c9d8:
                  in_stack_00001550 = 0;
                  lVar16 = 1;
                }
code_r0x0043c9e0:
                in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
                in_stack_00001528 = (segment_command *)0x0;
                in_stack_00001538 = psVar32;
                goto code_r0x0043c9e4;
              }
              if (in_stack_00001540 != 1) {
                if (in_stack_00001540 == 2) {
                  if ((short)in_stack_00001538->cmd != 0x2f2f) goto code_r0x0043c9d8;
                  if (in_stack_00001548 == (segment_command *)0x0) {
                    in_stack_00001550 = 0;
                    lVar16 = 1;
                  }
                  else {
                    if ((psVar32 < in_stack_00001548) ||
                       ((ulong)((long)psVar32 - (long)in_stack_00001548) < in_stack_00001550))
                    goto LAB_0043cc70;
                    lVar16 = (long)in_stack_00001548->segname +
                             (long)((long)psVar14->segname + -0x10);
                  }
                }
                else {
                  in_stack_00001550 = uVar21;
                  if (in_stack_00001540 == 7) {
                    if (((*(int7 *)in_stack_00001538 == 0x2f34364d59532f) &&
                        (&MACH_HEADER.cpusubtype < psVar32)) &&
                       (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,psVar14,psVar32,
                                        auStack_7ffffffe + 0x80002256,1,0,uVar15),
                       in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2)))
                    goto LAB_0043cc70;
                    goto code_r0x0043c9d8;
                  }
                }
                goto code_r0x0043c9e0;
              }
              if (((char)in_stack_00001538->cmd != '/') ||
                 (psVar32 < (segment_command *)((long)&MACH_HEADER.cpusubtype + 1)))
              goto code_r0x0043c9d8;
              func_0x0040b7cc(auStack_7ffffffe + 0x80001526,psVar14,psVar32,
                              auStack_7ffffffe + 0x80002256,1,0,uVar15);
              if (in_stack_00001528 != (segment_command *)((long)&MACH_HEADER.magic + 2)) {
                if ((char)in_stack_00001538->cmd != '/') goto code_r0x0043c9d8;
                in_stack_00001540 = 1;
                if ((&MACH_HEADER.cpusubtype < psVar32) &&
                   (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,psVar14,psVar32,
                                    auStack_7ffffffe + 0x80002256,1,0,uVar15),
                   in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2)))
                goto LAB_0043cc70;
                goto code_r0x0043d1b0;
              }
              goto LAB_0043cc70;
            }
            if (lVar16 == 0xa3e686372613c21) {
              uVar15 = 0;
              goto code_r0x0043c54c;
            }
            if ((lVar16 != 0xa3e66616769623c) ||
               (in_stack_00000060 < (segment_command *)(section_00000068.segname + 8)))
            goto LAB_0043cc70;
            auVar45 = func_0x0043fb2c(&uStack0000000000000058->filesize,0x14,10);
            psVar30 = auVar45._8_8_;
            if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
            if (psVar30 != (segment_command *)0x0) {
              if ((psVar30 <= psVar32) && (0x6f < (ulong)((long)psVar32 - (long)psVar30))) {
                auVar45 = func_0x0043fb2c((long)(psVar30->segname +
                                                (long)((long)psVar14->segname + -0x10)) + 0x6c,4,10)
                ;
                if ((auVar45._0_8_ & 1) != 0) {
                  pqVar28 = &psVar30[1].fileoff;
                  if ((pqVar28 <= psVar32) &&
                     (auVar45._8_8_ <= (ulong)((long)psVar32 - (long)pqVar28))) {
                    psVar3 = (segment_command *)((long)pqVar28 + auVar45._8_8_);
                    psVar2 = (segment_command *)((long)&psVar3->cmd + 1);
                    if (psVar3 == (segment_command *)0xffffffffffffffff) {
                      psVar2 = (segment_command *)0xffffffffffffffff;
                    }
                    if (((ulong)psVar3 & 1) != 0) {
                      psVar3 = psVar2;
                    }
                    if (((psVar3 <= psVar32) && (1 < (ulong)((long)psVar32 - (long)psVar3))) &&
                       (*(short *)(psVar3->segname + (long)((long)psVar14->segname + -0x10)) ==
                        0xa60)) {
                      uVar21 = func_0x0043fb2c(psVar30->segname +
                                               (long)((long)psVar14->segname + -0x10),0x14,10);
code_r0x0043bb10:
                      if ((uVar21 & 1) != 0) goto code_r0x0043cfd4;
                    }
                  }
                }
              }
              goto LAB_0043cc70;
            }
            auVar45 = func_0x0043fb2c((undefined1 *)((long)&psVar14->vmaddr + 4),0x14,10);
            psVar30 = auVar45._8_8_;
            if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
            if (psVar30 != (segment_command *)0x0) {
              if ((psVar30 <= psVar32) && (0x6f < (ulong)((long)psVar32 - (long)psVar30))) {
                auVar45 = func_0x0043fb2c((long)(psVar30->segname +
                                                (long)((long)psVar14->segname + -0x10)) + 0x6c,4,10)
                ;
                if ((auVar45._0_8_ & 1) != 0) {
                  pqVar28 = &psVar30[1].fileoff;
                  if ((pqVar28 <= psVar32) &&
                     (auVar45._8_8_ <= (ulong)((long)psVar32 - (long)pqVar28))) {
                    psVar3 = (segment_command *)((long)pqVar28 + auVar45._8_8_);
                    psVar2 = (segment_command *)((long)&psVar3->cmd + 1);
                    if (psVar3 == (segment_command *)0xffffffffffffffff) {
                      psVar2 = (segment_command *)0xffffffffffffffff;
                    }
                    if (((ulong)psVar3 & 1) != 0) {
                      psVar3 = psVar2;
                    }
                    if (((psVar3 <= psVar32) && (1 < (ulong)((long)psVar32 - (long)psVar3))) &&
                       (*(short *)(psVar3->segname + (long)((long)psVar14->segname + -0x10)) ==
                        0xa60)) {
                      uVar21 = func_0x0043fb2c(psVar30->segname +
                                               (long)((long)psVar14->segname + -0x10),0x14,10);
                      goto code_r0x0043bb10;
                    }
                  }
                }
              }
              goto LAB_0043cc70;
            }
code_r0x0043cfd4:
            auVar45 = func_0x0043fb2c(psVar14->segname,0x14,10);
            psVar30 = auVar45._8_8_;
            if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
            if (psVar30 != (segment_command *)0x0) {
              if ((psVar30 <= psVar32) && (0x6f < (ulong)((long)psVar32 - (long)psVar30))) {
                auVar45 = func_0x0043fb2c((long)(psVar30->segname +
                                                (long)((long)psVar14->segname + -0x10)) + 0x6c,4,10)
                ;
                if ((auVar45._0_8_ & 1) != 0) {
                  pqVar28 = &psVar30[1].fileoff;
                  if ((pqVar28 <= psVar32) &&
                     (auVar45._8_8_ <= (ulong)((long)psVar32 - (long)pqVar28))) {
                    psVar3 = (segment_command *)((long)pqVar28 + auVar45._8_8_);
                    psVar2 = (segment_command *)((long)&psVar3->cmd + 1);
                    if (psVar3 == (segment_command *)0xffffffffffffffff) {
                      psVar2 = (segment_command *)0xffffffffffffffff;
                    }
                    if (((ulong)psVar3 & 1) != 0) {
                      psVar3 = psVar2;
                    }
                    if (((psVar3 <= psVar32) && (1 < (ulong)((long)psVar32 - (long)psVar3))) &&
                       (*(short *)(psVar3->segname + (long)((long)psVar14->segname + -0x10)) ==
                        0xa60)) {
                      auVar45 = func_0x0043fb2c(psVar30->segname +
                                                (long)((long)psVar14->segname + -0x10),0x14,10);
                      uVar21 = auVar45._8_8_;
                      if ((((auVar45._0_8_ & 1) != 0) &&
                          (psVar30 = (segment_command *)((long)&psVar3->cmd + 2),
                          psVar30 != (segment_command *)0x0)) &&
                         ((psVar30 <= psVar32 &&
                          ((uVar21 <= (ulong)((long)psVar32 - (long)psVar30) && (0x13 < uVar21))))))
                      {
                        auVar45 = func_0x0043fb2c(psVar30->segname +
                                                  (long)((long)psVar14->segname + -0x10),0x14,10);
                        in_stack_00001538 = auVar45._8_8_;
                        if (((auVar45._0_8_ & 1) != 0) &&
                           ((auVar45._8_8_ = 0, auVar45._0_8_ = in_stack_00001538,
                            SUB168(auVar45 * ZEXT816(0x14),8) == 0 &&
                            ((ulong)((long)in_stack_00001538 * 0x14) <= uVar21 - 0x14)))) {
                          in_stack_00001530 =
                               (segment_command *)
                               (psVar30->segname + (long)((long)psVar14->segname + -0x10) + 0x14);
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
            lVar16 = 1;
            in_stack_00001550 = 0;
            in_stack_00001528 = (segment_command *)((long)&MACH_HEADER.magic + 1);
            in_stack_00002258 = (segment_command *)&MACH_HEADER.cpusubtype;
            uStack0000000000000008 = 0;
            goto code_r0x0043c9e4;
          }
          goto code_r0x0043cbb4;
        }
        goto code_r0x0043cc84;
      }
      goto code_r0x0043cd04;
    }
    _memcpy(auStack_7ffffffe + 0x8000178e,auStack_7ffffffe + 0x800009c6,0x410);
    uVar41 = (ushort)((ulong)in_stack_00001798 >> 0x10);
    uVar21 = (ulong)uVar41;
    if (uVar41 == 0) {
      psVar33 = (segment_command *)((long)&MACH_HEADER.magic + 1);
    }
    else {
      psVar33 = (segment_command *)func_0x00187bd0(uVar21,1);
      if (psVar33 == (segment_command *)0x0) {
        func_0x007a1f00(1,uVar21,&UNK_009d9be8);
        goto code_r0x0043d268;
      }
    }
    _memcpy(psVar33,auStack_7ffffffe + 0x8000179b,uVar21);
    func_0x0046b8d0(&uStack0000000000000050,psVar33,uVar21);
    in_stack_00001780 = psVar7;
    in_stack_00001788 = psVar8;
    if ((((ulong)uStack0000000000000050 & 1) != 0) || (uVar41 < 5)) {
      if (uVar41 != 0) goto code_r0x0043bd4c;
code_r0x0043bd5c:
      lVar16 = *(long *)psVar7;
      *(long *)psVar7 = lVar16 + -1;
      LORelease();
      if (lVar16 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x8000177e);
      }
      goto code_r0x0043bc7c;
    }
    if (!(*(int *)((long)psVar33->segname + (uVar21 - 0xd)) == 0x5953642e &&
         *(char *)((long)psVar33->segname + (uVar21 - 9)) == 'M')) {
code_r0x0043bd4c:
      func_0x00187bd4(psVar33,uVar21,1);
      goto code_r0x0043bd5c;
    }
    func_0x004261e4(&uStack0000000000000050,psVar7->vmaddr,psVar7->vmsize,
                    auStack_7ffffffe + 0x8000179b,uVar21);
    psVar13 = uStack0000000000000058;
    func_0x004261e4(auStack_7ffffffe + 0x80001ba6,uStack0000000000000058,in_stack_00000060,
                    &UNK_00887de9,0x18);
    if (uStack0000000000000050 != (segment_command *)0x0) {
      func_0x00187bd4(psVar13,uStack0000000000000050,1);
    }
    func_0x00429d60(&uStack0000000000000050,in_stack_00001bb0,in_stack_00001bb8);
    psVar34 = uStack0000000000000050;
    in_stack_00000038 = psVar33;
    if ((char)uStack0000000000000058 == '\x02') {
      if (((ulong)uStack0000000000000050 & 3) == 1) {
        puVar20 = (undefined8 *)((long)&uStack0000000000000050[-1].flags + 3);
        uVar31 = *puVar20;
        puVar35 = *(undefined8 **)((long)&uStack0000000000000050->cmdsize + 3);
        if ((code *)*puVar35 != (code *)0x0) {
          (*(code *)*puVar35)(uVar31);
        }
        if (puVar35[1] != 0) {
          func_0x00187bd4(uVar31,puVar35[1],puVar35[2]);
        }
        func_0x00187bd4(puVar20,0x18,8);
      }
    }
    else {
      while( true ) {
        func_0x0041743c(&uStack0000000000000050,auStack_7ffffffe + 0x80001dee);
        psVar2 = uStack0000000000000058;
        if ((int)uStack0000000000000050 != 1) break;
        if (uStack0000000000000058 == (segment_command *)0x0) {
          if (((ulong)in_stack_00000060 & 3) == 1) {
            puVar20 = (undefined8 *)((long)&in_stack_00000060[-1].flags + 3);
            uVar31 = *puVar20;
            puVar35 = *(undefined8 **)((long)&in_stack_00000060->cmdsize + 3);
            if ((code *)*puVar35 != (code *)0x0) {
              (*(code *)*puVar35)(uVar31);
            }
            if (puVar35[1] != 0) {
              func_0x00187bd4(uVar31,puVar35[1],puVar35[2]);
            }
            func_0x00187bd4(puVar20,0x18,8);
          }
          psVar13 = (segment_command *)0x8000000000000000;
code_r0x0043c178:
          lVar16 = *(long *)psVar34;
          *(long *)psVar34 = lVar16 + -1;
          LORelease();
          if (lVar16 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x80001dee);
          }
          if (psVar13 != (segment_command *)0x8000000000000000) {
            _memcpy(auStack_7ffffffe + 0x8000152e,auStack_7ffffffe + 0x80001bee,0x200);
            if (in_stack_00001ba8 != 0) {
              func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
            }
            func_0x00187bd4(psVar33,uVar21,1);
            lVar16 = *(long *)psVar7;
            *(long *)psVar7 = lVar16 + -1;
            LORelease();
            in_stack_00001528 = psVar13;
            psVar34 = _iStack0000000000000018;
            psVar33 = _uStack0000000000000008;
            if (lVar16 == 1) {
              DataMemoryBarrier(2,1);
              func_0x004037b4(auStack_7ffffffe + 0x8000177e);
            }
            goto code_r0x0043c4a8;
          }
          goto code_r0x0043c1a8;
        }
        _memcpy(auStack_7ffffffe + 0x80001e0e,&uStack0000000000000068,0x410);
        func_0x004261e4(auStack_7ffffffe + 0x80002256,psVar2->vmaddr,psVar2->vmsize,
                        auStack_7ffffffe + 0x80001e1b,(short)((ulong)in_stack_00001e18 >> 0x10));
        func_0x0043add8(unaff_x29 + -0xf0,in_stack_00002260,in_stack_00002268);
        if (*(int *)(unaff_x29 + -0xf0) != 1) {
          if (in_stack_00002258 != (segment_command *)0x0) {
            func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
          }
          psVar13 = (segment_command *)0x8000000000000000;
code_r0x0043c158:
          lVar16 = *(long *)psVar2;
          *(long *)psVar2 = lVar16 + -1;
          LORelease();
          if (lVar16 == 1) {
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
           (uVar24 = (ulong)(uint)in_stack_00002460[5], uVar24 <= in_stack_00002470 - 0x20)) {
          iVar11 = in_stack_00002460[4];
          piVar12 = (int *)(in_stack_00002468 + 0x20);
          do {
            piVar27 = piVar12;
            if ((iVar11 == 0) || (uVar24 < 8)) goto code_r0x0043bf34;
            uVar15 = piVar27[1];
            uVar44 = (ulong)uVar15;
            if (uVar15 < 8 || uVar24 < uVar44) goto code_r0x0043bf34;
            uVar24 = uVar24 - uVar44;
            iVar11 = iVar11 + -1;
            piVar12 = (int *)((long)piVar27 + uVar44);
          } while (*piVar27 != 0x1b || uVar15 < 0x18);
          if ((*(segment_command **)(piVar27 + 4) == _uStack0000000000000030 &&
               *(segment_command **)(piVar27 + 2) == in_stack_00000028) &&
             (func_0x0043d840(auStack_7ffffffe + 0x8000245e),
             in_stack_00002460 != (int *)0x8000000000000000)) {
            *(undefined8 *)(unaff_x29 + -0xf0) = 0x8000000000000000;
            func_0x004385b0(auStack_7ffffffe + 0x80002256,auStack_7ffffffe + 0x800024de,
                            unaff_x29 + -0xf0,unaff_x29 + -0xf0);
            if (in_stack_00002258 != (segment_command *)0x8000000000000000) {
              _memcpy(auStack_7ffffffe + 0x80001bee,auStack_7ffffffe + 0x8000225e,0x200);
              psVar13 = in_stack_00002258;
              _uStack0000000000000008 = in_stack_00000040;
              _iStack0000000000000018 = psVar3;
              goto code_r0x0043c158;
            }
          }
        }
code_r0x0043bf34:
        func_0x003f7334(auStack_7ffffffe + 0x80002226);
        _munmap(psVar3,in_stack_00000040);
        lVar16 = *(long *)psVar2;
        *(long *)psVar2 = lVar16 + -1;
        LORelease();
        if (lVar16 == 1) {
          DataMemoryBarrier(2,1);
          func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
        }
      }
      lVar16 = *(long *)psVar34;
      *(long *)psVar34 = lVar16 + -1;
      LORelease();
      if (lVar16 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x80001dee);
      }
    }
code_r0x0043c1a8:
    if (in_stack_00001ba8 != 0) {
      func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
    }
    func_0x00187bd4(psVar33,uVar21,1);
    lVar16 = *(long *)psVar7;
    *(long *)psVar7 = lVar16 + -1;
    LORelease();
    if (lVar16 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004037b4(auStack_7ffffffe + 0x8000177e);
    }
  } while( true );
LAB_0043b540:
  psVar40 = (segment_command *)((long)&psVar40->cmd + 1);
  if (lVar16 == lRam0000000000a29ca8 + (long)psRam0000000000a29cb0 * 0x38) {
    psRam0000000000a2a5f8 = (segment_command *)0x0;
    return;
  }
  goto LAB_0043b50c;
code_r0x0043d1a0:
  func_0x007a2570(psVar40,psVar14,&UNK_009dc390);
  psVar40 = in_stack_00001e00;
code_r0x0043d1b0:
  if (in_stack_00002258 < _uStack0000000000000030) {
    func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,_uStack0000000000000030,
                    auStack_7ffffffe + 0x80002256,1,0,(ulong)_uStack0000000000000008 & 0xffffffff);
    if (in_stack_00001528 != (segment_command *)((long)&MACH_HEADER.magic + 2)) {
      if (in_stack_00001540 != 0xd) goto code_r0x0043d288;
      lVar22._0_4_ = in_stack_00001538->cmd;
      lVar22._4_4_ = in_stack_00001538->cmdsize;
      in_stack_00001530 = in_stack_00002258;
      if (lVar22 != 0x424d595343453c2f || *(int5 *)in_stack_00001538->segname != 0x2f3e534c4f) {
        in_stack_00001530 = psVar30;
      }
      goto code_r0x0043d28c;
    }
LAB_0043cc70:
    func_0x003f7334(auStack_7ffffffe + 0x80001bee);
    _munmap(in_stack_00000038,_uStack0000000000000030);
code_r0x0043cc84:
    psVar30 = (segment_command *)0x8000000000000000;
    lVar19._0_4_ = psVar34->cmd;
    lVar19._4_4_ = psVar34->cmdsize;
    psVar23 = psVar34;
    psVar34 = psVar13;
joined_r0x0043cfcc:
    if ((lVar19 != -0x7fffffffffffffff) && (lVar19 != -0x8000000000000000)) {
      func_0x003f70a4(psVar23);
      _munmap(*(undefined8 *)(psVar23[7].segname + 8),psVar23[7].vmaddr);
      func_0x003f7334(&psVar23[7].vmsize);
    }
    *(segment_command **)psVar23 = psVar30;
    _memcpy(psVar23->segname,auStack_7ffffffe + 0x800009ae,0x200);
    *(segment_command **)(psVar23[7].segname + 8) = in_stack_00000038;
    psVar23[7].vmaddr = (qword)_uStack0000000000000030;
    psVar23[7].fileoff = in_stack_00001328;
    psVar23[7].vmsize = in_stack_00001320;
    psVar23[7].maxprot = (int)in_stack_00001338;
    psVar23[7].initprot = (int)((ulong)in_stack_00001338 >> 0x20);
    psVar23[7].filesize = in_stack_00001330;
    psVar23[8].cmd = (int)in_stack_00001348;
    psVar23[8].cmdsize = (int)((ulong)in_stack_00001348 >> 0x20);
    psVar23[7].nsects = (int)in_stack_00001340;
    psVar23[7].flags = (int)((ulong)in_stack_00001340 >> 0x20);
    if (psVar30 == (segment_command *)0x8000000000000001) goto code_r0x0043cef0;
code_r0x0043cd04:
    if ((psVar30 != (segment_command *)0x8000000000000000) &&
       (uVar21 = *(ulong *)((long)psVar34->segname + 8), uVar21 != 0)) {
      lVar22 = *(long *)psVar34->segname;
      uVar31._0_4_ = in_stack_00000040->cmd;
      uVar31._4_4_ = in_stack_00000040->cmdsize;
      uVar24 = *(ulong *)in_stack_00000040->segname;
      lVar16 = 0;
      if (uVar21 != 1) {
        do {
          lVar19 = (uVar21 >> 1) + lVar16;
          puVar20 = (undefined8 *)(lVar22 + lVar19 * 0x18);
          uVar17 = puVar20[1];
          uVar44 = uVar17;
          if (uVar24 <= uVar17) {
            uVar44 = uVar24;
          }
          iVar11 = _memcmp(*puVar20,uVar31,uVar44);
          lVar1 = uVar17 - uVar24;
          if (iVar11 != 0) {
            lVar1 = (long)iVar11;
          }
          if (lVar1 < 1) {
            lVar16 = lVar19;
          }
          uVar21 = uVar21 - (uVar21 >> 1);
        } while (1 < uVar21);
      }
      puVar20 = (undefined8 *)(lVar22 + lVar16 * 0x18);
      uVar44 = puVar20[1];
      uVar21 = uVar44;
      if (uVar24 <= uVar44) {
        uVar21 = uVar24;
      }
      iVar11 = _memcmp(*puVar20,uVar31,uVar21);
      lVar19 = uVar44 - uVar24;
      if (iVar11 != 0) {
        lVar19 = (long)iVar11;
      }
      if ((lVar19 == 0) &&
         (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,psVar34,
                          (long)psVar33 +
                          (*(long *)(lVar22 + lVar16 * 0x18 + 0x10) -
                          *(long *)((long)in_stack_00000040->segname + 8))), (int)psVar46 != 5)) {
        uStack0000000000000050 = psVar46;
        uStack0000000000000058 = psVar7;
        in_stack_00000060 = psVar8;
        uStack0000000000000068 = in_stack_000009c8;
        in_stack_00000070 = in_stack_000009d0;
        in_stack_00000078 = in_stack_000009d8;
        in_stack_00000080 = in_stack_000009e0;
        in_stack_00000088 = in_stack_000009e8;
        in_stack_00000090 = in_stack_000009f0;
        in_stack_00000098 = in_stack_000009f8;
        in_stack_000000a0 = in_stack_00000a00;
        func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050);
        if (psVar40 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
          pcVar9 = *(code **)(in_stack_00000010 + 0x20);
          (*pcVar9)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
          while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
                psVar40 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
            (*pcVar9)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
          }
        }
        if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
          func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
        }
        if (psVar40 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
          return;
        }
      }
    }
code_r0x0043cef0:
    uVar21 = plVar36[1];
    if (uVar21 == 0) {
      return;
    }
    lVar16 = *plVar36;
    if (uVar21 == 1) {
      uVar24 = 0;
    }
    else {
      uVar24 = 0;
      uVar44 = uVar21;
      do {
        uVar17 = (uVar44 >> 1) + uVar24;
        if (*(segment_command **)(lVar16 + uVar17 * 0x18 + 0x10) <= psVar33) {
          uVar24 = uVar17;
        }
        uVar44 = uVar44 - (uVar44 >> 1);
      } while (1 < uVar44);
    }
    psVar23 = *(segment_command **)(lVar16 + uVar24 * 0x18 + 0x10);
    if (psVar23 != psVar33) {
      if (psVar23 < psVar33) {
        uVar24 = uVar24 + 1;
      }
      if (uVar24 == 0) {
        return;
      }
      uVar24 = uVar24 - 1;
    }
    if (uVar24 < uVar21) {
      puVar20 = (undefined8 *)(lVar16 + uVar24 * 0x18);
      uStack0000000000000058 = (segment_command *)*puVar20;
      in_stack_00000060 = (segment_command *)puVar20[1];
      uStack0000000000000050 = (segment_command *)CONCAT44(uStack0000000000000050._4_4_,3);
      (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
      return;
    }
    return;
  }
code_r0x0043d288:
  in_stack_00001530 = psVar30;
code_r0x0043d28c:
  in_stack_00001550 = 0;
  lVar16 = 1;
  in_stack_00001528 = (segment_command *)0x0;
  in_stack_00001538 = _uStack0000000000000030;
code_r0x0043c9e4:
  *(char *)&psVar23->maxprot = (char)uStack0000000000000008;
  if ((int)in_stack_00001528 != 0) goto code_r0x0043ca98;
  do {
    if (in_stack_00001538 <= in_stack_00001530) goto LAB_0043cc70;
    func_0x0040b7cc(auStack_7ffffffe + 0x80002256,in_stack_00000038,_uStack0000000000000030,
                    auStack_7ffffffe + 0x8000152e,lVar16,in_stack_00001550,(char)psVar23->maxprot);
    psVar32 = in_stack_00002280;
    psVar30 = in_stack_00002278;
    lVar22 = in_stack_00002268;
    psVar14 = in_stack_00002270;
    psVar2 = in_stack_00001538;
    if (in_stack_00002258 != (segment_command *)((long)&MACH_HEADER.magic + 2))
    goto joined_r0x0043ca80;
    while (in_stack_00001530 = psVar2, in_stack_00001528 != (segment_command *)0x0) {
code_r0x0043ca98:
      if (in_stack_00001538 == (segment_command *)0x0) goto LAB_0043cc70;
      in_stack_00001538 = (segment_command *)((long)&in_stack_00001538[-1].flags + 3);
      auVar45 = func_0x0043fb2c(in_stack_00001530,0x14,10);
      psVar30 = auVar45._8_8_;
      if ((((auVar45._0_8_ & 1) == 0) || (_uStack0000000000000030 < psVar30)) ||
         ((ulong)((long)_uStack0000000000000030 - (long)psVar30) < 0x70)) {
code_r0x0043cb70:
        in_stack_00001538 = (segment_command *)0x0;
        psVar2 = (segment_command *)((long)&MACH_HEADER.magic + 1);
      }
      else {
        auVar45 = func_0x0043fb2c((long)(psVar30->segname +
                                        (long)((long)in_stack_00000038->segname + -0x10)) + 0x6c,4,
                                  10);
        psVar14 = auVar45._8_8_;
        if ((auVar45._0_8_ & 1) == 0) goto code_r0x0043cb70;
        pqVar28 = &psVar30[1].fileoff;
        if ((_uStack0000000000000030 < pqVar28) ||
           ((segment_command *)((long)_uStack0000000000000030 - (long)pqVar28) < psVar14))
        goto code_r0x0043cb70;
        psVar2 = (segment_command *)(psVar14->segname + (long)(pqVar28 + -1));
        psVar32 = (segment_command *)((long)&psVar2->cmd + 1);
        if (psVar2 == (segment_command *)0xffffffffffffffff) {
          psVar32 = (segment_command *)0xffffffffffffffff;
        }
        if (((ulong)psVar2 & 1) != 0) {
          psVar2 = psVar32;
        }
        if ((_uStack0000000000000030 < psVar2 ||
             (ulong)((long)_uStack0000000000000030 - (long)psVar2) < 2) ||
           (*(short *)(psVar2->segname + (long)((long)in_stack_00000038->segname + -0x10)) != 0xa60)
           ) goto code_r0x0043cb70;
        auVar45 = func_0x0043fb2c(psVar30->segname +
                                  (long)((long)in_stack_00000038->segname + -0x10),0x14,10);
        if ((auVar45._0_8_ & 1) == 0) goto code_r0x0043cb70;
        in_stack_00001530 = (segment_command *)((long)in_stack_00001530->segname + 0xc);
        psVar32 = auVar45._8_8_;
        psVar30 = (segment_command *)((long)&psVar2->cmd + 2);
        lVar22 = (long)(pqVar28 + -1) + (long)in_stack_00000038->segname;
joined_r0x0043ca80:
        psVar2 = in_stack_00001530;
        if ((psVar14 == in_stack_00000028) &&
           (iVar11 = _memcmp(lVar22,_iStack0000000000000018,in_stack_00000028), iVar11 == 0)) {
          if (psVar30 == (segment_command *)0x0) {
            psVar32 = (segment_command *)0x0;
            psVar30 = (segment_command *)((long)&MACH_HEADER.magic + 1);
          }
          else {
            if ((_uStack0000000000000030 < psVar30) ||
               ((segment_command *)((long)_uStack0000000000000030 - (long)psVar30) < psVar32))
            goto LAB_0043cc70;
            psVar30 = (segment_command *)
                      (psVar30->segname + (long)((long)in_stack_00000038->segname + -0x10));
          }
code_r0x0043cbb4:
          func_0x0043d660(auStack_7ffffffe + 0x80001526,psVar30,psVar32);
          if ((in_stack_00001528 == (segment_command *)0x0) ||
             (in_stack_00001528->cmd == 0xcffaedfe)) goto LAB_0043cc70;
          func_0x0043d840(auStack_7ffffffe + 0x80001526,in_stack_00001528,in_stack_00001530,
                          in_stack_00001538);
          if (in_stack_00001528 == (segment_command *)0x8000000000000000) goto LAB_0043cc70;
          psVar40 = (segment_command *)0x8000000000000000;
          func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                          auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
          psVar30 = uStack0000000000000050;
          if (uStack0000000000000050 == (segment_command *)0x8000000000000000) goto LAB_0043cc70;
          _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
          lVar19._0_4_ = psVar34->cmd;
          lVar19._4_4_ = psVar34->cmdsize;
          psVar23 = psVar34;
          psVar34 = psVar13;
          in_stack_00001320 = in_stack_00001bf0;
          in_stack_00001328 = in_stack_00001bf8;
          in_stack_00001330 = in_stack_00001c00;
          in_stack_00001338 = in_stack_00001c08;
          in_stack_00001340 = in_stack_00001c10;
          in_stack_00001348 = in_stack_00001c18;
          goto joined_r0x0043cfcc;
        }
      }
    }
  } while( true );
code_r0x0043b078:
  lVar16 = 0x1c;
code_r0x0043b08c:
  iVar11 = piVar12[4];
  uVar21 = (ulong)(uint)piVar12[5];
  uStack0000000000000050 = (segment_command *)0x0;
  uStack0000000000000058 = (segment_command *)&MACH_HEADER.cpusubtype;
  in_stack_00000060 = (segment_command *)0x0;
  if (iVar11 != 0) {
    unaff_x19 = (segment_command *)0x0;
    psVar34 = (segment_command *)0x0;
    _uStack0000000000000030 =
         (segment_command *)((ulong)_uStack0000000000000030 & 0xffffffff00000000);
    piVar12 = (int *)((long)piVar12 + lVar16);
    psVar33 = (segment_command *)&MACH_HEADER.cpusubtype;
    while (7 < uVar21) {
      uVar15 = piVar12[1];
      uVar24 = (ulong)uVar15;
      if ((uVar15 < 8) || (bVar10 = uVar21 < uVar24, uVar21 = uVar21 - uVar24, bVar10)) break;
      if (*piVar12 == 0x19) {
        if (uVar15 < 0x48) break;
        uVar31 = *(undefined8 *)(piVar12 + 4);
        uVar44 = *(ulong *)(piVar12 + 2);
        if (((uVar44 & 0xffffffffffff) == 0x545845545f5f) &&
           (uVar37 = CONCAT13(-((char)(uVar44 >> 0x18) == '\0'),
                              CONCAT12(-((char)(uVar44 >> 0x10) == '\0'),
                                       CONCAT11(-((char)(uVar44 >> 8) == '\0'),
                                                -((char)uVar44 == '\0')))),
           uVar38 = CONCAT15(-((char)(uVar44 >> 0x28) == '\0'),
                             CONCAT14(-((char)(uVar44 >> 0x20) == '\0'),uVar37)),
           uVar39 = CONCAT16(-((char)(uVar44 >> 0x30) == '\0'),uVar38),
           uVar41 = CONCAT11(-((char)((ulong)uVar31 >> 8) == '\0'),-((char)uVar31 == '\0')),
           uVar42 = CONCAT13(-((char)((ulong)uVar31 >> 0x18) == '\0'),
                             CONCAT12(-((char)((ulong)uVar31 >> 0x10) == '\0'),uVar41)),
           uVar43 = CONCAT15(-((char)((ulong)uVar31 >> 0x28) == '\0'),
                             CONCAT14(-((char)((ulong)uVar31 >> 0x20) == '\0'),uVar42)),
           uVar17 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar31 >> 0x38) == '\0'),
                                             CONCAT16(-((char)((ulong)uVar31 >> 0x30) == '\0'),
                                                      uVar43)) >> 0x34),
                             CONCAT16((char)((uint6)uVar43 >> 0x24),
                                      CONCAT15((char)((uint)uVar42 >> 0x14),
                                               CONCAT14((char)(uVar41 >> 4),
                                                        CONCAT13((char)(CONCAT17(-((char)(uVar44 >>
                                                                                         0x38) ==
                                                                                  '\0'),uVar39) >>
                                                                       0x34),
                                                                 CONCAT12((char)((uint6)uVar38 >>
                                                                                0x24),
                                                                          CONCAT11((char)((uint)
                                                  uVar37 >> 0x14),
                                                  (char)(((ulong)uVar39 & 0xfff0) >> 4)))))))) &
                    0x8888888888888888, uVar44 = uVar17 >> 3,
           uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4,
           uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8,
           uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10,
           uVar17 != 0 && (LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) & 0x3cU) == 0x18)) {
          if (*(long *)(piVar12 + 10) == 0) {
            _uStack0000000000000030 =
                 (segment_command *)
                 CONCAT44(uStack0000000000000034,
                          *(long *)(piVar12 + 0xc) != 0 | uStack0000000000000030);
          }
          psVar34 = unaff_x19;
        }
        uVar44 = *(ulong *)(piVar12 + 8);
        psVar40 = *(segment_command **)(piVar12 + 6);
        if (unaff_x19 == uStack0000000000000050) {
          func_0x00403e60(&uStack0000000000000050,&UNK_009dc3d8);
          psVar33 = uStack0000000000000058;
        }
        in_stack_00000040 = psVar40;
code_r0x0043b0c0:
        *(ulong *)((dword *)((long)psVar33->segname + ((long)unaff_x19 * 4 + -2) * 4) + 2) = uVar44;
        *(segment_command **)((long)psVar33->segname + ((long)unaff_x19 * 4 + -2) * 4) = psVar40;
        unaff_x19 = (segment_command *)((long)&unaff_x19->cmd + 1);
        in_stack_00000060 = unaff_x19;
      }
      else if (*piVar12 == 1) {
        if (0x37 < uVar15) {
          uVar31 = *(undefined8 *)(piVar12 + 4);
          uVar44 = *(ulong *)(piVar12 + 2);
          if (((uVar44 & 0xffffffffffff) == 0x545845545f5f) &&
             (uVar37 = CONCAT13(-((char)(uVar44 >> 0x18) == '\0'),
                                CONCAT12(-((char)(uVar44 >> 0x10) == '\0'),
                                         CONCAT11(-((char)(uVar44 >> 8) == '\0'),
                                                  -((char)uVar44 == '\0')))),
             uVar38 = CONCAT15(-((char)(uVar44 >> 0x28) == '\0'),
                               CONCAT14(-((char)(uVar44 >> 0x20) == '\0'),uVar37)),
             uVar39 = CONCAT16(-((char)(uVar44 >> 0x30) == '\0'),uVar38),
             uVar41 = CONCAT11(-((char)((ulong)uVar31 >> 8) == '\0'),-((char)uVar31 == '\0')),
             uVar42 = CONCAT13(-((char)((ulong)uVar31 >> 0x18) == '\0'),
                               CONCAT12(-((char)((ulong)uVar31 >> 0x10) == '\0'),uVar41)),
             uVar43 = CONCAT15(-((char)((ulong)uVar31 >> 0x28) == '\0'),
                               CONCAT14(-((char)((ulong)uVar31 >> 0x20) == '\0'),uVar42)),
             uVar17 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar31 >> 0x38) == '\0'),
                                               CONCAT16(-((char)((ulong)uVar31 >> 0x30) == '\0'),
                                                        uVar43)) >> 0x34),
                               CONCAT16((char)((uint6)uVar43 >> 0x24),
                                        CONCAT15((char)((uint)uVar42 >> 0x14),
                                                 CONCAT14((char)(uVar41 >> 4),
                                                          CONCAT13((char)(CONCAT17(-((char)(uVar44 
                                                  >> 0x38) == '\0'),uVar39) >> 0x34),
                                                  CONCAT12((char)((uint6)uVar38 >> 0x24),
                                                           CONCAT11((char)((uint)uVar37 >> 0x14),
                                                                    (char)(((ulong)uVar39 & 0xfff0)
                                                                          >> 4)))))))) &
                      0x8888888888888888, uVar44 = uVar17 >> 3,
             uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4,
             uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8,
             uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10,
             uVar17 != 0 && (LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) & 0x3cU) == 0x18)) {
            if (piVar12[8] == 0) {
              _uStack0000000000000030 =
                   (segment_command *)
                   CONCAT44(uStack0000000000000034,piVar12[9] != 0 | uStack0000000000000030);
            }
            psVar34 = unaff_x19;
          }
          uVar44 = *(ulong *)(piVar12 + 6);
          if (unaff_x19 == uStack0000000000000050) {
            func_0x00403e60(&uStack0000000000000050,&UNK_009dc3c0);
          }
          psVar40 = (segment_command *)(uVar44 & 0xffffffff);
          uVar44 = uVar44 >> 0x20;
          psVar33 = uStack0000000000000058;
          goto code_r0x0043b0c0;
        }
        break;
      }
      piVar12 = (int *)((long)piVar12 + uVar24);
      iVar11 = iVar11 + -1;
      if (iVar11 == 0) {
        in_stack_00000038 = (segment_command *)__dyld_get_image_vmaddr_slide(unaff_w23);
        unaff_x26 = (segment_command *)0x8000000000000000;
        unaff_x27 = 0x38;
        psVar30 = unaff_x20;
        if (((ulong)_uStack0000000000000030 & 1) != 0) goto code_r0x0043b33c;
        if (unaff_x19 <= psVar34) goto code_r0x0043d10c;
        param_1 = *(long *)((long)uStack0000000000000058->segname + ((long)psVar34 * 4 + -2) * 4);
        uVar21 = (ulong)((long)&unaff_x19[-1].flags + 3) & 0xfffffffffffffff;
        psVar30 = uStack0000000000000058;
        in_x10 = uStack0000000000000058;
        if (uVar21 < 3) goto code_r0x0043b318;
        in_x11 = uVar21 + 1;
        goto code_r0x0043b2c4;
      }
    }
    if (uStack0000000000000050 != (segment_command *)0x0) {
      func_0x00187bd4(uStack0000000000000058,(long)uStack0000000000000050 << 4,8);
    }
    psVar33 = (segment_command *)0x8000000000000000;
    unaff_x26 = (segment_command *)0x8000000000000000;
    unaff_x27 = 0x38;
    goto code_r0x0043b398;
  }
  __dyld_get_image_vmaddr_slide(unaff_w23);
  unaff_x19 = (segment_command *)0x0;
  psVar34 = (segment_command *)0x0;
code_r0x0043d10c:
  func_0x007a2570(psVar34,unaff_x19,&UNK_009dc3f0);
code_r0x0043d268:
                    /* WARNING: Does not return */
  pcVar9 = (code *)SoftwareBreakpoint(1,0x43d26c);
  (*pcVar9)();
}

