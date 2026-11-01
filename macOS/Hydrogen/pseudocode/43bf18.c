
/* WARNING: Removing unreachable block (ram,0x0043c8dc) */
/* WARNING: Removing unreachable block (ram,0x0043c8f0) */
/* WARNING: Removing unreachable block (ram,0x0043d26c) */
/* WARNING: Removing unreachable block (ram,0x0043c8f8) */
/* WARNING: Removing unreachable block (ram,0x0043c904) */
/* WARNING: Removing unreachable block (ram,0x0043c910) */
/* WARNING: Removing unreachable block (ram,0x0043c92c) */
/* WARNING: Removing unreachable block (ram,0x0043c674) */
/* WARNING: Removing unreachable block (ram,0x0043d138) */

void FUN_0043bf18(void)

{
  int7 *piVar1;
  int7 *piVar2;
  int7 *piVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  int *piVar8;
  dword *pdVar9;
  code *pcVar10;
  long lVar11;
  int iVar12;
  long *plVar13;
  uint uVar14;
  dword *pdVar15;
  ulong uVar16;
  ulong uVar17;
  int7 *piVar18;
  int *piVar19;
  ulong uVar20;
  ulong unaff_x19;
  undefined8 *puVar21;
  dword *unaff_x20;
  dword *pdVar22;
  dword *unaff_x21;
  dword *unaff_x22;
  long lVar23;
  bool bVar24;
  ulong unaff_x23;
  long unaff_x24;
  undefined8 *puVar25;
  long *unaff_x25;
  undefined1 *unaff_x26;
  long *unaff_x27;
  undefined8 uVar26;
  long unaff_x29;
  undefined1 auVar27 [16];
  uint uStack0000000000000008;
  long in_stack_00000010;
  dword *in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  dword *in_stack_00000030;
  long *in_stack_00000038;
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
  long *in_stack_000009b8;
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
  dword *in_stack_00001530;
  dword *in_stack_00001538;
  long in_stack_00001540;
  dword *in_stack_00001548;
  ulong in_stack_00001550;
  dword *in_stack_00001730;
  dword *in_stack_00001738;
  long *in_stack_00001770;
  long *in_stack_00001780;
  dword *in_stack_00001788;
  undefined8 in_stack_00001790;
  ushort uVar28;
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
  long *in_stack_00001df0;
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
  
code_r0x0043bf18:
  if ((((in_stack_00002460 != (int *)0x0) && (*in_stack_00002460 != -0x30051202)) &&
      (0x1f < in_stack_00002470)) &&
     (uVar17 = (ulong)(uint)in_stack_00002460[5], uVar17 <= in_stack_00002470 - 0x20)) {
    iVar12 = in_stack_00002460[4];
    piVar8 = (int *)(in_stack_00002468 + 0x20);
    do {
      piVar19 = piVar8;
      if ((iVar12 == 0) || (uVar17 < 8)) goto LAB_0043bf34;
      uVar14 = piVar19[1];
      uVar16 = (ulong)uVar14;
      if (uVar14 < 8 || uVar17 < uVar16) goto LAB_0043bf34;
      uVar17 = uVar17 - uVar16;
      iVar12 = iVar12 + -1;
      piVar8 = (int *)((long)piVar19 + uVar16);
    } while (*piVar19 != 0x1b || uVar14 < 0x18);
    if (((dword *)*(int7 **)(piVar19 + 4) == in_stack_00000030 &&
         *(ulong *)(piVar19 + 2) == in_stack_00000028) &&
       (func_0x0043d840(auStack_7ffffffe + 0x8000245e),
       in_stack_00002460 != (int *)0x8000000000000000)) {
      *(undefined8 *)(unaff_x29 + -0xf0) = 0x8000000000000000;
      func_0x004385b0(auStack_7ffffffe + 0x80002256,auStack_7ffffffe + 0x800024de,unaff_x29 + -0xf0,
                      unaff_x29 + -0xf0);
      if (in_stack_00002258 != (dword *)0x8000000000000000) {
        _memcpy(auStack_7ffffffe + 0x80001bee,auStack_7ffffffe + 0x8000225e,0x200);
        _uStack0000000000000008 = in_stack_00000040;
        pdVar22 = in_stack_00002258;
        in_stack_00000018 = unaff_x20;
        goto code_r0x0043c158;
      }
    }
  }
LAB_0043bf34:
  func_0x003f7334(auStack_7ffffffe + 0x80002226);
  _munmap(unaff_x20,in_stack_00000040);
  lVar11 = *unaff_x25;
  *unaff_x25 = lVar11 + -1;
  LORelease();
  if (lVar11 == 1) {
    DataMemoryBarrier(2,1);
    func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
  }
LAB_0043be48:
  func_0x0041743c(&uStack0000000000000050,auStack_7ffffffe + 0x80001dee);
  unaff_x25 = uStack0000000000000058;
  if ((int)uStack0000000000000050 != 1) {
    lVar11 = *in_stack_00001df0;
    *in_stack_00001df0 = lVar11 + -1;
    LORelease();
    if (lVar11 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004037b4(auStack_7ffffffe + 0x80001dee);
    }
code_r0x0043c1a8:
    pdVar22 = (dword *)(auStack_7ffffffe + 0x8000177e);
    if (in_stack_00001ba8 != 0) {
      func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
    }
    func_0x00187bd4(in_stack_00000038,unaff_x19,1);
    lVar11 = *in_stack_00001780;
    *in_stack_00001780 = lVar11 + -1;
    LORelease();
    if (lVar11 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004037b4(auStack_7ffffffe + 0x8000177e);
    }
code_r0x0043bc7c:
    func_0x0041743c(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x8000176e);
    if ((int)in_stack_000009b0 != 1) {
      lVar11 = *in_stack_00001770;
      *in_stack_00001770 = lVar11 + -1;
      LORelease();
      if (lVar11 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x8000176e);
      }
      goto code_r0x0043c22c;
    }
    if (in_stack_000009b8 == (long *)0x0) {
      if (((ulong)in_stack_000009c0 & 3) == 1) {
        uVar26 = *(undefined8 *)((long)in_stack_000009c0 + -1);
        puVar21 = *(undefined8 **)((long)in_stack_000009c0 + 7);
        if ((code *)*puVar21 != (code *)0x0) {
          (*(code *)*puVar21)(uVar26);
        }
        if (puVar21[1] != 0) {
          func_0x00187bd4(uVar26,puVar21[1],puVar21[2]);
        }
        func_0x00187bd4((undefined8 *)((long)in_stack_000009c0 + -1),0x18,8);
      }
      pdVar15 = (dword *)0x8000000000000000;
      goto code_r0x0043c4a8;
    }
    _memcpy(auStack_7ffffffe + 0x8000178e,auStack_7ffffffe + 0x800009c6,0x410);
    uVar28 = (ushort)((ulong)in_stack_00001798 >> 0x10);
    unaff_x19 = (ulong)uVar28;
    if (uVar28 == 0) {
      plVar13 = (long *)((long)&MACH_HEADER.magic + 1);
    }
    else {
      plVar13 = (long *)func_0x00187bd0(unaff_x19,1);
      if (plVar13 == (long *)0x0) {
        func_0x007a1f00(1,unaff_x19,&UNK_009d9be8);
                    /* WARNING: Does not return */
        pcVar10 = (code *)SoftwareBreakpoint(1,0x43d26c);
        (*pcVar10)();
      }
    }
    _memcpy(plVar13,auStack_7ffffffe + 0x8000179b,unaff_x19);
    func_0x0046b8d0(&uStack0000000000000050,plVar13,unaff_x19);
    in_stack_00001780 = in_stack_000009b8;
    in_stack_00001788 = in_stack_000009c0;
    if ((((ulong)uStack0000000000000050 & 1) == 0) && (4 < uVar28)) {
      if (*(int *)((long)plVar13 + (unaff_x19 - 5)) == 0x5953642e &&
          *(char *)((long)plVar13 + (unaff_x19 - 1)) == 'M') goto code_r0x0043bd80;
code_r0x0043bd4c:
      func_0x00187bd4(plVar13,unaff_x19,1);
    }
    else if (uVar28 != 0) goto code_r0x0043bd4c;
    lVar11 = *in_stack_000009b8;
    *in_stack_000009b8 = lVar11 + -1;
    LORelease();
    if (lVar11 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004037b4(auStack_7ffffffe + 0x8000177e);
    }
    goto code_r0x0043bc7c;
  }
  if (uStack0000000000000058 == (long *)0x0) {
    if (((ulong)in_stack_00000060 & 3) == 1) {
      puVar21 = (undefined8 *)((long)in_stack_00000060 + -1);
      uVar26 = *puVar21;
      puVar25 = *(undefined8 **)((long)in_stack_00000060 + 7);
      if ((code *)*puVar25 != (code *)0x0) {
        (*(code *)*puVar25)(uVar26);
      }
      if (puVar25[1] != 0) {
        func_0x00187bd4(uVar26,puVar25[1],puVar25[2]);
      }
      func_0x00187bd4(puVar21,0x18,8);
    }
    pdVar22 = (dword *)0x8000000000000000;
  }
  else {
    _memcpy(auStack_7ffffffe + 0x80001e0e,&uStack0000000000000068,0x410);
    func_0x004261e4(auStack_7ffffffe + 0x80002256,unaff_x25[3],unaff_x25[4],
                    auStack_7ffffffe + 0x80001e1b,(short)((ulong)in_stack_00001e18 >> 0x10));
    func_0x0043add8(unaff_x29 + -0xf0,in_stack_00002260,in_stack_00002268);
    if (*(int *)(unaff_x29 + -0xf0) == 1) goto code_r0x0043bec8;
    if (in_stack_00002258 != (dword *)0x0) {
      func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
    }
    pdVar22 = (dword *)0x8000000000000000;
code_r0x0043c158:
    lVar11 = *unaff_x25;
    *unaff_x25 = lVar11 + -1;
    LORelease();
    if (lVar11 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
    }
  }
  lVar11 = *in_stack_00001df0;
  *in_stack_00001df0 = lVar11 + -1;
  LORelease();
  if (lVar11 == 1) {
    DataMemoryBarrier(2,1);
    func_0x004037b4(auStack_7ffffffe + 0x80001dee);
  }
  if (pdVar22 == (dword *)0x8000000000000000) goto code_r0x0043c1a8;
  _memcpy(auStack_7ffffffe + 0x8000152e,auStack_7ffffffe + 0x80001bee,0x200);
  if (in_stack_00001ba8 != 0) {
    func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
  }
  func_0x00187bd4(in_stack_00000038,unaff_x19,1);
  lVar11 = *in_stack_00001780;
  *in_stack_00001780 = lVar11 + -1;
  LORelease();
  pdVar15 = pdVar22;
  in_stack_00001730 = in_stack_00000018;
  in_stack_00001738 = _uStack0000000000000008;
  if (lVar11 == 1) {
    DataMemoryBarrier(2,1);
    func_0x004037b4(auStack_7ffffffe + 0x8000177e);
  }
code_r0x0043c4a8:
  lVar11 = *in_stack_00001770;
  *in_stack_00001770 = lVar11 + -1;
  LORelease();
  if (lVar11 == 1) {
    DataMemoryBarrier(2,1);
    func_0x004037b4(auStack_7ffffffe + 0x8000176e);
  }
  if (pdVar15 == (dword *)0x8000000000000000) {
code_r0x0043c22c:
    in_stack_00001738 = pdVar22;
    func_0x003f7b28(auStack_7ffffffe + 0x80001526);
    pdVar15 = (dword *)0x0;
    in_stack_00001530 = &MACH_HEADER.cpusubtype;
    in_stack_00001540 = 0;
    in_stack_00001538 = (dword *)0x0;
    in_stack_00001548 = &MACH_HEADER.cpusubtype;
    in_stack_00001550 = 0;
    func_0x0043d660(auStack_7ffffffe + 0x8000177e);
    if (((in_stack_00001780 == (long *)0x0) || ((int)*in_stack_00001780 == -0x30051202)) ||
       (func_0x0043d840(auStack_7ffffffe + 0x8000177e,in_stack_00001780,in_stack_00001788,
                        in_stack_00001790), in_stack_00001780 == (long *)0x8000000000000000)) {
code_r0x0043b8c0:
      func_0x003f7334(auStack_7ffffffe + 0x80001526);
      _munmap();
      return;
    }
    in_stack_000009b0 = (long *)0x8000000000000000;
    func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x80001dfe,
                    auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x800009ae);
    if (uStack0000000000000050 == (long *)0x8000000000000000) goto code_r0x0043b8c0;
    _memcpy(auStack_7ffffffe + 0x8000131e,&uStack0000000000000058,0x200);
  }
  else {
    _memcpy(auStack_7ffffffe + 0x8000131e,auStack_7ffffffe + 0x8000152e,0x200);
    _munmap();
    unaff_x21 = in_stack_00001738;
    unaff_x22 = in_stack_00001730;
    in_stack_000017c0 = in_stack_00001e40;
  }
  _memcpy(auStack_7ffffffe + 0x80001e0e,auStack_7ffffffe + 0x8000131e,0x200);
  lVar11 = *(long *)(unaff_x24 + 0x5f8);
  if (*(long *)(unaff_x24 + 0x5f8) == 4) {
    lRam0000000000a2a5f8 = 3;
    func_0x003f70a4();
    _munmap(uRam0000000000a2a5b8,uRam0000000000a2a5c0);
    func_0x003f7334(0xa2a5c8);
    lVar11 = lRam0000000000a2a5f8;
  }
  pdVar22 = (dword *)(lVar11 + 1);
  _memcpy(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x80001dfe,0x250);
  if (&MACH_HEADER.cputype < pdVar22) {
    func_0x007a28b0(pdVar22,4,&UNK_009dc360);
    func_0x007a2570();
    goto code_r0x0043d1b0;
  }
  if (pdVar22 != (dword *)0x0) {
    lVar11 = lVar11 * 0x250 + 0x250;
    lVar23 = 0xa29cb8;
    do {
      _memcpy(&uStack0000000000000050,lVar23,0x250);
      _memcpy(lVar23,auStack_7ffffffe + 0x800009ae,0x250);
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
      lVar11 = lVar11 + -0x250;
      lVar23 = lVar23 + 0x250;
    } while (lVar11 != 0);
  }
  *(dword **)(unaff_x24 + 0x5f8) = pdVar22;
  unaff_x21 = (dword *)(unaff_x26 + -(long)unaff_x27);
  func_0x0043aa50(auStack_7ffffffe + 0x800009ae,0xa29cc0,unaff_x21);
  unaff_x27 = (long *)0xa29cc8;
  if ((int)in_stack_000009b0 != 5) {
    bVar24 = false;
    pcVar10 = *(code **)(in_stack_00000010 + 0x20);
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
    while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050), unaff_x23 < 2) {
      if (((in_stack_000017c0 == 2) && (uRam0000000000a29cd0 != 0)) && (uRam0000000000a29cd0 != 1))
      {
        lVar11 = 0;
        uVar17 = uRam0000000000a29cd0;
        do {
          lVar23 = (uVar17 >> 1) + lVar11;
          if (*(int7 **)(lRam0000000000a29cc8 + lVar23 * 0x18 + 0x10) <= unaff_x21) {
            lVar11 = lVar23;
          }
          uVar17 = uVar17 - (uVar17 >> 1);
        } while (1 < uVar17);
      }
      (*pcVar10)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
      bVar24 = true;
    }
    if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
      func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
    }
    if (bVar24) {
      return;
    }
  }
  unaff_x26 = auStack_7ffffffe + 0x80001526;
  if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
     (in_stack_00000040 = (dword *)func_0x004432ec(0xa29cd8,unaff_x21),
     in_stack_00000040 == (dword *)0x0)) goto code_r0x0043cef0;
  uVar17 = *(ulong *)(in_stack_00000040 + 8);
  unaff_x22 = (dword *)(lRam0000000000a29d18 + uVar17 * 0x248);
  if (uRam0000000000a29d20 <= uVar17) goto code_r0x0043cef0;
  plVar13 = *(long **)unaff_x22;
  if (plVar13 == (long *)0x8000000000000001) {
    if (uRam0000000000a29d00 <= uVar17) goto code_r0x0043cef0;
    puVar21 = (undefined8 *)(lRam0000000000a29cf8 + uVar17 * 0x20);
    func_0x0043add8(&uStack0000000000000050,*puVar21,puVar21[1]);
    pdVar9 = in_stack_00000060;
    plVar13 = uStack0000000000000058;
    in_stack_00001738 = unaff_x22;
    if ((int)uStack0000000000000050 == 1) {
      in_stack_00000018 = (dword *)puVar21[2];
      in_stack_00000028 = puVar21[3];
      in_stack_00000030 = in_stack_00000060;
      in_stack_00001bf0 = 0;
      in_stack_00001bf8 = 8;
      in_stack_00001c08 = 0;
      in_stack_00001c00 = 0;
      in_stack_00001c10 = 8;
      in_stack_00001c18 = 0;
      in_stack_00000038 = uStack0000000000000058;
      pdVar22 = in_stack_00000060;
      if (in_stack_00000018 == (dword *)0x0) goto code_r0x0043cbb4;
      if (in_stack_00000060 < &MACH_HEADER.cpusubtype) goto code_r0x0043cc70;
      pdVar22 = &MACH_HEADER.cpusubtype;
      lVar11 = *uStack0000000000000058;
      in_stack_00002258 = pdVar22;
      if (lVar11 == 0xa3e6e6968743c21) {
        uVar14 = 1;
code_r0x0043c54c:
        uStack0000000000000008 = uVar14;
        if (in_stack_00000060 == &MACH_HEADER.cpusubtype) {
          in_stack_00001550 = 0;
          pdVar15 = (dword *)0x0;
          lVar11 = 1;
          in_stack_00001530 = &MACH_HEADER.cpusubtype;
          in_stack_00001538 = &MACH_HEADER.cpusubtype;
          goto code_r0x0043c9e4;
        }
        _uStack0000000000000008 = (dword *)(ulong)uVar14;
        func_0x0040b7cc(auStack_7ffffffe + 0x80001526,uStack0000000000000058,in_stack_00000060,
                        auStack_7ffffffe + 0x80002256,1,0);
        if (pdVar15 == (dword *)((long)&MACH_HEADER.magic + 2)) goto code_r0x0043cc70;
        uVar17 = 0;
        lVar11 = 1;
        if (8 < in_stack_00001540) {
          if (in_stack_00001540 < 0x10) {
            if ((in_stack_00001540 == 9) || (in_stack_00001550 = uVar17, in_stack_00001540 == 0xc))
            goto code_r0x0043c9d8;
          }
          else if ((in_stack_00001540 == 0x10) ||
                  (in_stack_00001550 = uVar17, in_stack_00001540 == 0x13)) {
code_r0x0043c9d8:
            in_stack_00001550 = 0;
            lVar11 = 1;
          }
code_r0x0043c9e0:
          in_stack_00001530 = &MACH_HEADER.cpusubtype;
          pdVar15 = (dword *)0x0;
          in_stack_00001538 = pdVar9;
          goto code_r0x0043c9e4;
        }
        if (in_stack_00001540 != 1) {
          if (in_stack_00001540 == 2) {
            if ((short)*in_stack_00001538 != 0x2f2f) goto code_r0x0043c9d8;
            if (in_stack_00001548 == (dword *)0x0) {
              in_stack_00001550 = 0;
              lVar11 = 1;
            }
            else {
              if ((pdVar9 < in_stack_00001548) ||
                 ((ulong)((long)pdVar9 - (long)in_stack_00001548) < in_stack_00001550))
              goto code_r0x0043cc70;
              lVar11 = (long)plVar13 + (long)in_stack_00001548;
            }
          }
          else {
            in_stack_00001550 = uVar17;
            if (in_stack_00001540 == 7) {
              if (((*(int7 *)in_stack_00001538 == 0x2f34364d59532f) &&
                  (&MACH_HEADER.cpusubtype < pdVar9)) &&
                 (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar13,pdVar9,
                                  auStack_7ffffffe + 0x80002256,1,0,uVar14),
                 pdVar15 == (dword *)((long)&MACH_HEADER.magic + 2))) goto code_r0x0043cc70;
              goto code_r0x0043c9d8;
            }
          }
          goto code_r0x0043c9e0;
        }
        if (((char)*in_stack_00001538 != '/') ||
           (pdVar9 < (int7 *)((long)&MACH_HEADER.cpusubtype + 1))) goto code_r0x0043c9d8;
        func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar13,pdVar9,auStack_7ffffffe + 0x80002256,1
                        ,0,uVar14);
        if (pdVar15 != (dword *)((long)&MACH_HEADER.magic + 2)) {
          if ((char)*in_stack_00001538 != '/') goto code_r0x0043c9d8;
          if ((pdVar9 <= &MACH_HEADER.cpusubtype) ||
             (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar13,pdVar9,
                              auStack_7ffffffe + 0x80002256,1,0,uVar14),
             pdVar15 != (dword *)((long)&MACH_HEADER.magic + 2))) {
code_r0x0043d1b0:
            if (in_stack_00002258 < in_stack_00000030) {
              func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,in_stack_00000030,
                              auStack_7ffffffe + 0x80002256,1,0,
                              (ulong)_uStack0000000000000008 & 0xffffffff);
              if (pdVar15 == (dword *)((long)&MACH_HEADER.magic + 2)) goto code_r0x0043cc70;
              if (in_stack_00001540 != 0xd) goto code_r0x0043d288;
              in_stack_00001530 = in_stack_00002258;
              if (*(long *)in_stack_00001538 != 0x424d595343453c2f ||
                  *(int5 *)(in_stack_00001538 + 2) != 0x2f3e534c4f) {
                in_stack_00001530 = pdVar22;
              }
            }
            else {
code_r0x0043d288:
              in_stack_00001530 = pdVar22;
            }
            in_stack_00001550 = 0;
            lVar11 = 1;
            pdVar15 = (dword *)0x0;
            in_stack_00001538 = in_stack_00000030;
            goto code_r0x0043c9e4;
          }
        }
code_r0x0043cc70:
        func_0x003f7334(auStack_7ffffffe + 0x80001bee);
        _munmap(in_stack_00000038,in_stack_00000030);
        goto code_r0x0043cc84;
      }
      if (lVar11 == 0xa3e686372613c21) {
        uVar14 = 0;
        goto code_r0x0043c54c;
      }
      if ((lVar11 != 0xa3e66616769623c) || (in_stack_00000060 < section_00000068.segname + 8))
      goto code_r0x0043cc70;
      auVar27 = func_0x0043fb2c(uStack0000000000000058 + 6,0x14,10);
      piVar18 = auVar27._8_8_;
      if ((auVar27._0_8_ & 1) == 0) goto code_r0x0043cc70;
      if (piVar18 != (int7 *)0x0) {
        if ((piVar18 <= pdVar9) && (0x6f < (ulong)((long)pdVar9 - (long)piVar18))) {
          auVar27 = func_0x0043fb2c((long)plVar13 + (long)piVar18 + 0x6c,4,10);
          if ((auVar27._0_8_ & 1) != 0) {
            piVar2 = piVar18 + 0xe;
            if ((piVar2 <= pdVar9) && (auVar27._8_8_ <= (ulong)((long)pdVar9 - (long)piVar2))) {
              piVar2 = (int7 *)(auVar27._8_8_ + (long)piVar2);
              piVar1 = (int7 *)((long)piVar2 + 1);
              if (piVar2 == (int7 *)0xffffffffffffffff) {
                piVar1 = (int7 *)0xffffffffffffffff;
              }
              if (((ulong)piVar2 & 1) != 0) {
                piVar2 = piVar1;
              }
              if (((piVar2 <= pdVar9) && (1 < (ulong)((long)pdVar9 - (long)piVar2))) &&
                 (*(short *)((long)plVar13 + (long)piVar2) == 0xa60)) {
                uVar17 = func_0x0043fb2c((long)plVar13 + (long)piVar18,0x14,10);
LAB_0043bb10:
                if ((uVar17 & 1) != 0) goto code_r0x0043cfd4;
              }
            }
          }
        }
        goto code_r0x0043cc70;
      }
      auVar27 = func_0x0043fb2c((int *)((long)plVar13 + 0x1c),0x14,10);
      piVar18 = auVar27._8_8_;
      if ((auVar27._0_8_ & 1) == 0) goto code_r0x0043cc70;
      if (piVar18 != (int7 *)0x0) {
        if ((piVar18 <= pdVar9) && (0x6f < (ulong)((long)pdVar9 - (long)piVar18))) {
          auVar27 = func_0x0043fb2c((long)plVar13 + (long)piVar18 + 0x6c,4,10);
          if ((auVar27._0_8_ & 1) != 0) {
            piVar2 = piVar18 + 0xe;
            if ((piVar2 <= pdVar9) && (auVar27._8_8_ <= (ulong)((long)pdVar9 - (long)piVar2))) {
              piVar2 = (int7 *)(auVar27._8_8_ + (long)piVar2);
              piVar1 = (int7 *)((long)piVar2 + 1);
              if (piVar2 == (int7 *)0xffffffffffffffff) {
                piVar1 = (int7 *)0xffffffffffffffff;
              }
              if (((ulong)piVar2 & 1) != 0) {
                piVar2 = piVar1;
              }
              if (((piVar2 <= pdVar9) && (1 < (ulong)((long)pdVar9 - (long)piVar2))) &&
                 (*(short *)((long)plVar13 + (long)piVar2) == 0xa60)) {
                uVar17 = func_0x0043fb2c((long)plVar13 + (long)piVar18,0x14,10);
                goto LAB_0043bb10;
              }
            }
          }
        }
        goto code_r0x0043cc70;
      }
code_r0x0043cfd4:
      auVar27 = func_0x0043fb2c(plVar13 + 1,0x14,10);
      piVar18 = auVar27._8_8_;
      if ((auVar27._0_8_ & 1) == 0) goto code_r0x0043cc70;
      if (piVar18 != (int7 *)0x0) {
        if ((piVar18 <= pdVar9) && (0x6f < (ulong)((long)pdVar9 - (long)piVar18))) {
          auVar27 = func_0x0043fb2c((long)plVar13 + (long)piVar18 + 0x6c,4,10);
          if ((auVar27._0_8_ & 1) != 0) {
            piVar2 = piVar18 + 0xe;
            if ((piVar2 <= pdVar9) && (auVar27._8_8_ <= (ulong)((long)pdVar9 - (long)piVar2))) {
              piVar2 = (int7 *)(auVar27._8_8_ + (long)piVar2);
              piVar1 = (int7 *)((long)piVar2 + 1);
              if (piVar2 == (int7 *)0xffffffffffffffff) {
                piVar1 = (int7 *)0xffffffffffffffff;
              }
              if (((ulong)piVar2 & 1) != 0) {
                piVar2 = piVar1;
              }
              if (((piVar2 <= pdVar9) && (1 < (ulong)((long)pdVar9 - (long)piVar2))) &&
                 (*(short *)((long)plVar13 + (long)piVar2) == 0xa60)) {
                auVar27 = func_0x0043fb2c((long)plVar13 + (long)piVar18,0x14,10);
                uVar17 = auVar27._8_8_;
                if ((((auVar27._0_8_ & 1) != 0) &&
                    (piVar2 = (int7 *)((long)piVar2 + 2), piVar2 != (int7 *)0x0)) &&
                   ((piVar2 <= pdVar9 &&
                    ((uVar17 <= (ulong)((long)pdVar9 - (long)piVar2) && (0x13 < uVar17)))))) {
                  auVar27 = func_0x0043fb2c((long)plVar13 + (long)piVar2,0x14,10);
                  in_stack_00001538 = auVar27._8_8_;
                  if (((auVar27._0_8_ & 1) != 0) &&
                     ((auVar27._8_8_ = 0, auVar27._0_8_ = in_stack_00001538,
                      SUB168(auVar27 * ZEXT816(0x14),8) == 0 &&
                      ((ulong)((long)in_stack_00001538 * 0x14) <= uVar17 - 0x14)))) {
                    in_stack_00001530 = (dword *)((long)plVar13 + (long)piVar2 + 0x14);
                    goto code_r0x0043d168;
                  }
                }
              }
            }
          }
        }
        goto code_r0x0043cc70;
      }
      in_stack_00001538 = (dword *)0x0;
      in_stack_00001530 = (dword *)((long)&MACH_HEADER.magic + 1);
code_r0x0043d168:
      lVar11 = 1;
      in_stack_00001550 = 0;
      pdVar15 = (dword *)((long)&MACH_HEADER.magic + 1);
      uStack0000000000000008 = 0;
code_r0x0043c9e4:
      unaff_x26[0x38] = (char)uStack0000000000000008;
      if ((int)pdVar15 != 0) goto code_r0x0043ca98;
code_r0x0043ca0c:
      if (in_stack_00001538 <= in_stack_00001530) goto code_r0x0043cc70;
      func_0x0040b7cc(auStack_7ffffffe + 0x80002256,in_stack_00000038,in_stack_00000030,
                      auStack_7ffffffe + 0x8000152e,lVar11,in_stack_00001550,unaff_x26[0x38]);
      pdVar22 = in_stack_00002280;
      piVar18 = in_stack_00002278;
      lVar23 = in_stack_00002268;
      uVar17 = in_stack_00002270;
      pdVar9 = in_stack_00001538;
      if (in_stack_00002258 != (dword *)((long)&MACH_HEADER.magic + 2)) goto joined_r0x0043ca80;
joined_r0x0043ca60:
      while (in_stack_00001530 = pdVar9, pdVar15 != (dword *)0x0) {
code_r0x0043ca98:
        if (in_stack_00001538 == (dword *)0x0) goto code_r0x0043cc70;
        in_stack_00001538 = (dword *)((long)in_stack_00001538 + -1);
        auVar27 = func_0x0043fb2c(in_stack_00001530,0x14,10);
        piVar18 = auVar27._8_8_;
        if ((((auVar27._0_8_ & 1) == 0) || (in_stack_00000030 < piVar18)) ||
           ((ulong)((long)in_stack_00000030 - (long)piVar18) < 0x70)) goto code_r0x0043cb70;
        auVar27 = func_0x0043fb2c((long)in_stack_00000038 + (long)piVar18 + 0x6c,4,10);
        uVar17 = auVar27._8_8_;
        if ((auVar27._0_8_ & 1) == 0) goto code_r0x0043cb70;
        piVar2 = piVar18 + 0xe;
        if ((in_stack_00000030 < piVar2) ||
           ((ulong)((long)in_stack_00000030 - (long)piVar2) < uVar17)) goto code_r0x0043cb70;
        piVar3 = (int7 *)(uVar17 + (long)piVar2);
        piVar1 = (int7 *)((long)piVar3 + 1);
        if (piVar3 == (int7 *)0xffffffffffffffff) {
          piVar1 = (int7 *)0xffffffffffffffff;
        }
        if (((ulong)piVar3 & 1) != 0) {
          piVar3 = piVar1;
        }
        if ((in_stack_00000030 < piVar3 || (ulong)((long)in_stack_00000030 - (long)piVar3) < 2) ||
           (*(short *)((long)in_stack_00000038 + (long)piVar3) != 0xa60)) goto code_r0x0043cb70;
        auVar27 = func_0x0043fb2c((long)in_stack_00000038 + (long)piVar18,0x14,10);
        if ((auVar27._0_8_ & 1) == 0) goto code_r0x0043cb70;
        in_stack_00001530 = in_stack_00001530 + 5;
        pdVar22 = auVar27._8_8_;
        piVar18 = (int7 *)((long)piVar3 + 2);
        lVar23 = (long)in_stack_00000038 + (long)piVar2;
joined_r0x0043ca80:
        pdVar9 = in_stack_00001530;
        if ((uVar17 == in_stack_00000028) &&
           (iVar12 = _memcmp(lVar23,in_stack_00000018,in_stack_00000028), iVar12 == 0)) {
          if (piVar18 == (int7 *)0x0) {
            pdVar22 = (dword *)0x0;
            plVar13 = (long *)((long)&MACH_HEADER.magic + 1);
          }
          else {
            if ((in_stack_00000030 < piVar18) ||
               ((int7 *)((long)in_stack_00000030 - (long)piVar18) < pdVar22)) goto code_r0x0043cc70;
            plVar13 = (long *)((long)in_stack_00000038 + (long)piVar18);
          }
code_r0x0043cbb4:
          func_0x0043d660(auStack_7ffffffe + 0x80001526,plVar13,pdVar22);
          if ((pdVar15 == (dword *)0x0) || (*pdVar15 == 0xcffaedfe)) goto code_r0x0043cc70;
          func_0x0043d840(auStack_7ffffffe + 0x80001526,pdVar15,in_stack_00001530,in_stack_00001538)
          ;
          if (pdVar15 == (dword *)0x8000000000000000) goto code_r0x0043cc70;
          unaff_x23 = 0x8000000000000000;
          func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                          auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
          plVar13 = uStack0000000000000050;
          if (uStack0000000000000050 == (long *)0x8000000000000000) goto code_r0x0043cc70;
          _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
          lVar11 = *(long *)unaff_x22;
          pdVar22 = unaff_x22;
          unaff_x22 = in_stack_00001738;
          in_stack_00001320 = in_stack_00001bf0;
          in_stack_00001328 = in_stack_00001bf8;
          in_stack_00001330 = in_stack_00001c00;
          in_stack_00001338 = in_stack_00001c08;
          in_stack_00001340 = in_stack_00001c10;
          in_stack_00001348 = in_stack_00001c18;
          goto joined_r0x0043cfcc;
        }
      }
      goto code_r0x0043ca0c;
    }
code_r0x0043cc84:
    plVar13 = (long *)0x8000000000000000;
    lVar11 = *(long *)unaff_x22;
    pdVar22 = unaff_x22;
    unaff_x22 = in_stack_00001738;
joined_r0x0043cfcc:
    if ((lVar11 != -0x7fffffffffffffff) && (lVar11 != -0x8000000000000000)) {
      func_0x003f70a4(pdVar22);
      _munmap(*(undefined8 *)(pdVar22 + 0x82),*(undefined8 *)(pdVar22 + 0x84));
      func_0x003f7334(pdVar22 + 0x86);
    }
    *(long **)pdVar22 = plVar13;
    _memcpy(pdVar22 + 2,auStack_7ffffffe + 0x800009ae,0x200);
    *(long **)(pdVar22 + 0x82) = in_stack_00000038;
    *(dword **)(pdVar22 + 0x84) = in_stack_00000030;
    *(undefined8 *)(pdVar22 + 0x88) = in_stack_00001328;
    *(undefined8 *)(pdVar22 + 0x86) = in_stack_00001320;
    *(undefined8 *)(pdVar22 + 0x8c) = in_stack_00001338;
    *(undefined8 *)(pdVar22 + 0x8a) = in_stack_00001330;
    *(undefined8 *)(pdVar22 + 0x90) = in_stack_00001348;
    *(undefined8 *)(pdVar22 + 0x8e) = in_stack_00001340;
    if (plVar13 == (long *)0x8000000000000001) goto code_r0x0043cef0;
  }
  if ((plVar13 != (long *)0x8000000000000000) && (uVar17 = *(ulong *)(unaff_x22 + 4), uVar17 != 0))
  {
    lVar23 = *(long *)(unaff_x22 + 2);
    uVar26 = *(undefined8 *)in_stack_00000040;
    uVar16 = *(ulong *)(in_stack_00000040 + 2);
    lVar11 = 0;
    if (uVar17 != 1) {
      do {
        lVar4 = (uVar17 >> 1) + lVar11;
        puVar21 = (undefined8 *)(lVar23 + lVar4 * 0x18);
        uVar6 = puVar21[1];
        uVar20 = uVar6;
        if (uVar16 <= uVar6) {
          uVar20 = uVar16;
        }
        iVar12 = _memcmp(*puVar21,uVar26,uVar20);
        lVar5 = uVar6 - uVar16;
        if (iVar12 != 0) {
          lVar5 = (long)iVar12;
        }
        if (lVar5 < 1) {
          lVar11 = lVar4;
        }
        uVar17 = uVar17 - (uVar17 >> 1);
      } while (1 < uVar17);
    }
    puVar21 = (undefined8 *)(lVar23 + lVar11 * 0x18);
    uVar20 = puVar21[1];
    uVar17 = uVar20;
    if (uVar16 <= uVar20) {
      uVar17 = uVar16;
    }
    iVar12 = _memcmp(*puVar21,uVar26,uVar17);
    lVar4 = uVar20 - uVar16;
    if (iVar12 != 0) {
      lVar4 = (long)iVar12;
    }
    if ((lVar4 == 0) &&
       (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,unaff_x22,
                        (long)unaff_x21 +
                        (*(long *)(lVar23 + lVar11 * 0x18 + 0x10) - *(long *)(in_stack_00000040 + 4)
                        )), (int)in_stack_000009b0 != 5)) {
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
        pcVar10 = *(code **)(in_stack_00000010 + 0x20);
        (*pcVar10)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050), unaff_x23 < 2
              ) {
          (*pcVar10)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
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
  uVar17 = unaff_x27[1];
  if (uVar17 != 0) {
    lVar11 = *unaff_x27;
    if (uVar17 == 1) {
      uVar16 = 0;
    }
    else {
      uVar16 = 0;
      uVar20 = uVar17;
      do {
        uVar6 = (uVar20 >> 1) + uVar16;
        if (*(int7 **)(lVar11 + uVar6 * 0x18 + 0x10) <= unaff_x21) {
          uVar16 = uVar6;
        }
        uVar20 = uVar20 - (uVar20 >> 1);
      } while (1 < uVar20);
    }
    piVar18 = *(int7 **)(lVar11 + uVar16 * 0x18 + 0x10);
    if ((dword *)piVar18 != unaff_x21) {
      if (piVar18 < unaff_x21) {
        uVar16 = uVar16 + 1;
      }
      if (uVar16 == 0) {
        return;
      }
      uVar16 = uVar16 - 1;
    }
    if (uVar16 < uVar17) {
      puVar21 = (undefined8 *)(lVar11 + uVar16 * 0x18);
      uStack0000000000000058 = (long *)*puVar21;
      in_stack_00000060 = (dword *)puVar21[1];
      uStack0000000000000050 = (long *)CONCAT44(uStack0000000000000050._4_4_,3);
      (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    }
  }
  return;
code_r0x0043bec8:
  unaff_x20 = *(dword **)(unaff_x29 + -0xe8);
  in_stack_00000040 = *(dword **)(unaff_x29 + -0xe0);
  if (in_stack_00002258 != (dword *)0x0) {
    func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
  }
  func_0x0043d660(auStack_7ffffffe + 0x8000245e,unaff_x20,in_stack_00000040);
  goto code_r0x0043bf18;
code_r0x0043bd80:
  func_0x004261e4(&uStack0000000000000050,in_stack_000009b8[3],in_stack_000009b8[4],
                  auStack_7ffffffe + 0x8000179b,unaff_x19);
  plVar7 = uStack0000000000000058;
  func_0x004261e4(auStack_7ffffffe + 0x80001ba6,uStack0000000000000058,in_stack_00000060,
                  &UNK_00887de9,0x18);
  if (uStack0000000000000050 != (long *)0x0) {
    func_0x00187bd4(plVar7,uStack0000000000000050,1);
  }
  func_0x00429d60(&uStack0000000000000050,in_stack_00001bb0,in_stack_00001bb8);
  in_stack_00000038 = plVar13;
  if ((char)uStack0000000000000058 == '\x02') {
    if (((ulong)uStack0000000000000050 & 3) == 1) {
      puVar21 = (undefined8 *)((long)uStack0000000000000050 + -1);
      uVar26 = *puVar21;
      puVar25 = *(undefined8 **)((long)uStack0000000000000050 + 7);
      if ((code *)*puVar25 != (code *)0x0) {
        (*(code *)*puVar25)(uVar26);
      }
      if (puVar25[1] != 0) {
        func_0x00187bd4(uVar26,puVar25[1],puVar25[2]);
      }
      func_0x00187bd4(puVar21,0x18,8);
    }
    goto code_r0x0043c1a8;
  }
  in_stack_00001df0 = uStack0000000000000050;
  goto LAB_0043be48;
code_r0x0043cb70:
  in_stack_00001538 = (dword *)0x0;
  pdVar9 = (dword *)((long)&MACH_HEADER.magic + 1);
  goto joined_r0x0043ca60;
}

