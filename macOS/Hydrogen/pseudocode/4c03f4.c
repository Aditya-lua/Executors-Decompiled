
undefined8 FUN_004c03f4(void)

{
  code *pcVar1;
  long *plVar2;
  long lVar3;
  segment_command *psVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined4 *puVar7;
  ulong uVar8;
  segment_command *psVar9;
  long lVar10;
  long in_x10;
  undefined8 *in_x11;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  segment_command *unaff_x22;
  segment_command *unaff_x25;
  segment_command *psVar14;
  segment_command *psVar15;
  undefined8 uVar16;
  ulong uVar17;
  long unaff_x29;
  segment_command *psVar18;
  undefined8 uVar19;
  segment_command *psVar20;
  segment_command *psVar21;
  undefined8 uVar22;
  undefined1 auVar23 [16];
  segment_command *in_stack_00000070;
  segment_command *in_stack_00000078;
  segment_command *in_stack_00000080;
  undefined4 in_stack_000000a0;
  segment_command *in_stack_000000b8;
  segment_command *in_stack_000000c8;
  segment_command *in_stack_000000d0;
  segment_command *in_stack_000000d8;
  segment_command *in_stack_000000e0;
  segment_command *in_stack_000000e8;
  undefined8 in_stack_000000f8;
  segment_command *in_stack_00000100;
  segment_command *in_stack_00000108;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  segment_command *in_stack_00000180;
  segment_command *in_stack_00000188;
  segment_command *in_stack_000001a0;
  segment_command *in_stack_000001a8;
  segment_command *in_stack_000001d0;
  segment_command *in_stack_000001d8;
  segment_command *in_stack_000001f0;
  segment_command *in_stack_000001f8;
  segment_command *in_stack_00000200;
  segment_command *in_stack_00000208;
  segment_command *in_stack_00000210;
  segment_command *in_stack_00000218;
  segment_command *in_stack_00000220;
  segment_command *in_stack_00000228;
  segment_command *in_stack_00000230;
  segment_command *in_stack_00000238;
  segment_command *in_stack_00000240;
  segment_command *in_stack_00000340;
  segment_command *in_stack_00000348;
  segment_command *in_stack_00000350;
  segment_command *in_stack_00000358;
  segment_command *in_stack_00000360;
  segment_command *in_stack_00000368;
  segment_command *in_stack_00000370;
  segment_command *in_stack_00000378;
  segment_command *in_stack_00000410;
  segment_command *in_stack_00000418;
  segment_command *in_stack_00000420;
  segment_command *in_stack_00000428;
  segment_command *in_stack_00000430;
  segment_command *in_stack_00000438;
  segment_command *psVar24;
  segment_command *in_stack_00000440;
  segment_command *in_stack_00000448;
  segment_command *in_stack_00000450;
  segment_command *in_stack_00000458;
  segment_command *in_stack_00000460;
  segment_command *in_stack_000004f0;
  segment_command *in_stack_000004f8;
  segment_command *in_stack_00000500;
  long in_stack_00000548;
  long in_stack_000005d0;
  long *in_stack_000005d8;
  long in_stack_000005e0;
  segment_command *in_stack_00000670;
  segment_command *in_stack_00000678;
  segment_command *in_stack_00000680;
  segment_command *in_stack_00000688;
  segment_command *in_stack_00000690;
  segment_command *in_stack_00000698;
  segment_command *in_stack_000006a0;
  segment_command *in_stack_000006a8;
  segment_command *in_stack_000006b0;
  segment_command *in_stack_000006b8;
  segment_command *in_stack_000006c0;
  segment_command *in_stack_000007a0;
  segment_command *in_stack_000007a8;
  segment_command *in_stack_000007b0;
  segment_command *in_stack_000007b8;
  segment_command *in_stack_000007c0;
  segment_command *in_stack_000007c8;
  segment_command *in_stack_000007d0;
  segment_command *in_stack_000007d8;
  segment_command *in_stack_000007e0;
  segment_command *in_stack_000007e8;
  segment_command *in_stack_000007f0;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
  uVar16 = in_x11[0x18];
  uVar22 = in_x11[0x1b];
  uVar19 = in_x11[0x1a];
  *(undefined8 *)(in_x10 + 0xe8) = in_x11[0x19];
  *(undefined8 *)(in_x10 + 0xe0) = uVar16;
  *(undefined8 *)(in_x10 + 0xf8) = uVar22;
  *(undefined8 *)(in_x10 + 0xf0) = uVar19;
  *(undefined8 *)(in_x10 + 0x100) = in_x11[0x1c];
  uVar16 = in_x11[0x10];
  uVar22 = in_x11[0x13];
  uVar19 = in_x11[0x12];
  *(undefined8 *)(in_x10 + 0xa8) = in_x11[0x11];
  *(undefined8 *)(in_x10 + 0xa0) = uVar16;
  *(undefined8 *)(in_x10 + 0xb8) = uVar22;
  *(undefined8 *)(in_x10 + 0xb0) = uVar19;
  uVar22 = in_x11[0x14];
  uVar19 = in_x11[0x17];
  uVar16 = in_x11[0x16];
  *(undefined8 *)(in_x10 + 200) = in_x11[0x15];
  *(undefined8 *)(in_x10 + 0xc0) = uVar22;
  *(undefined8 *)(in_x10 + 0xd8) = uVar19;
  *(undefined8 *)(in_x10 + 0xd0) = uVar16;
  uVar16 = in_x11[8];
  uVar22 = in_x11[0xb];
  uVar19 = in_x11[10];
  *(undefined8 *)(in_x10 + 0x68) = in_x11[9];
  *(undefined8 *)(in_x10 + 0x60) = uVar16;
  *(undefined8 *)(in_x10 + 0x78) = uVar22;
  *(undefined8 *)(in_x10 + 0x70) = uVar19;
  uVar22 = in_x11[0xc];
  uVar19 = in_x11[0xf];
  uVar16 = in_x11[0xe];
  *(undefined8 *)(in_x10 + 0x88) = in_x11[0xd];
  *(undefined8 *)(in_x10 + 0x80) = uVar22;
  *(undefined8 *)(in_x10 + 0x98) = uVar19;
  *(undefined8 *)(in_x10 + 0x90) = uVar16;
  uVar16 = *in_x11;
  uVar22 = in_x11[3];
  uVar19 = in_x11[2];
  *(undefined8 *)(in_x10 + 0x28) = in_x11[1];
  *(undefined8 *)(in_x10 + 0x20) = uVar16;
  *(undefined8 *)(in_x10 + 0x38) = uVar22;
  *(undefined8 *)(in_x10 + 0x30) = uVar19;
  uVar22 = in_x11[4];
  uVar19 = in_x11[7];
  uVar16 = in_x11[6];
  *(undefined8 *)(in_x10 + 0x48) = in_x11[5];
  *(undefined8 *)(in_x10 + 0x40) = uVar22;
  *(undefined8 *)(in_x10 + 0x58) = uVar19;
  *(undefined8 *)(in_x10 + 0x50) = uVar16;
  plVar2 = (long *)func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
  if (plVar2 == (long *)0x0) {
    func_0x007a23bc(&UNK_009e66c0);
    goto code_r0x004c5940;
  }
  psVar20 = (segment_command *)plVar2[1];
  lVar10 = *plVar2;
  uVar8 = plVar2[2];
  *plVar2 = 0;
  plVar2[1] = 8;
  plVar2[2] = 0;
  auVar23 = func_0x004bf9d8(in_stack_000000f8,in_stack_00000118._4_4_);
  auVar23._8_8_ = auVar23._8_8_;
  psVar15 = auVar23._0_8_;
  uVar16 = 0;
  auVar23._8_8_ = 0;
  auVar23._0_8_ = uVar8;
  uVar11 = uVar8 * 0x108;
  if ((SUB168(auVar23 * ZEXT816(0x108),8) != 0) || (0x7ffffffffffffff8 < uVar11)) {
LAB_004c550c:
    func_0x007a1f00(uVar16,uVar11,&UNK_009e5d30);
code_r0x004c5940:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
    (*pcVar1)();
  }
  if (uVar11 == 0) {
    psVar21 = psVar20;
  }
  else {
    uVar16 = 8;
    lVar3 = func_0x00187bd0(uVar11,8);
    if (lVar3 == 0) goto LAB_004c550c;
    psVar21 = (segment_command *)((long)psVar20 + uVar8 * 0x108);
    if (uVar8 != 0) {
      uVar13 = 0;
      uVar17 = 0;
      psVar18 = unaff_x22;
      psVar14 = psVar15;
      psVar4 = psVar21;
      do {
        if (uVar11 == uVar13) break;
        lVar5 = (long)psVar20->segname + (uVar13 - 8);
        uVar17 = uVar17 + 1;
        psVar9 = (segment_command *)&MACH_HEADER.filetype;
        psVar24 = in_stack_00000438;
        switch(*(undefined8 *)(lVar5 + 0x18)) {
        case 0xc:
          break;
        case 0xd:
          psVar4 = (segment_command *)func_0x00187bd0(0x40,8);
          if (psVar4 == (segment_command *)0x0) {
            func_0x007a1f18(8,0x40);
            goto code_r0x004c5940;
          }
          func_0x004bd098(auStack_7ffffffe + 0x8000066e,
                          *(undefined8 *)((long)psVar20->segname + uVar13 + 0x30));
          *(segment_command **)psVar4->segname = in_stack_00000678;
          *(segment_command **)psVar4 = in_stack_00000670;
          psVar4->vmaddr = (qword)in_stack_00000688;
          *(segment_command **)((long)psVar4->segname + 8) = in_stack_00000680;
          psVar4->fileoff = (qword)in_stack_00000698;
          psVar4->vmsize = (qword)in_stack_00000690;
          *(segment_command **)&psVar4->maxprot = in_stack_000006a8;
          psVar4->filesize = (qword)in_stack_000006a0;
          func_0x004cdf58(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x18,
                          &UNK_009e5c70);
          psVar9 = (segment_command *)((long)&MACH_HEADER.filetype + 1);
          psVar18 = in_stack_00000670;
          in_stack_000001d0 = in_stack_00000678;
          in_stack_000001d8 = in_stack_00000680;
          in_stack_000001f0 = psVar4;
          break;
        case 0xe:
          func_0x004bdc20(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x18);
          psVar9 = (segment_command *)((long)&MACH_HEADER.filetype + 2);
          psVar18 = in_stack_00000670;
          psVar14 = in_stack_000006a0;
          psVar4 = in_stack_00000688;
          in_stack_000001a0 = in_stack_00000690;
          in_stack_000001a8 = in_stack_00000698;
          in_stack_000001d0 = in_stack_00000678;
          in_stack_000001d8 = in_stack_00000680;
          break;
        case 0xf:
          func_0x004cda04(&stack0x000001f0,(long)psVar20->segname + uVar13 + 0x18,&UNK_009e5ca0);
          func_0x004cdf58(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x30,
                          &UNK_009e5ca0);
          psVar9 = (segment_command *)((long)&MACH_HEADER.filetype + 3);
          psVar18 = in_stack_000001f0;
          psVar14 = (segment_command *)
                    ((ulong)psVar14 & 0xffffffffffff0000 | (ulong)(byte)psVar20[1].segname[uVar13] |
                    (ulong)(byte)psVar20[1].segname[uVar13 + 1] << 8);
          psVar4 = in_stack_00000670;
          in_stack_000001a0 = in_stack_00000678;
          in_stack_000001a8 = in_stack_00000680;
          in_stack_000001d0 = in_stack_000001f8;
          in_stack_000001d8 = in_stack_00000200;
          break;
        case 0x10:
          func_0x004bd098(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x18);
          in_stack_00000100 = *(segment_command **)(psVar20[1].segname + uVar13 + 0x10);
          lVar5 = *(long *)in_stack_00000100;
          *(long *)in_stack_00000100 = lVar5 + 1;
          if (lVar5 < 0) {
            func_0x007a05dc();
            goto code_r0x004c5940;
          }
          in_stack_00000108 = *(segment_command **)(psVar20[1].segname + uVar13 + 0x18);
          lVar5 = *(long *)in_stack_00000108;
          *(long *)in_stack_00000108 = lVar5 + 1;
          if (lVar5 < 0) {
            func_0x007a05dc();
            goto code_r0x004c5940;
          }
          psVar9 = (segment_command *)&MACH_HEADER.ncmds;
          psVar18 = in_stack_00000670;
          unaff_x25 = in_stack_000006a8;
          psVar14 = in_stack_000006a0;
          psVar4 = in_stack_00000688;
          in_stack_000001a0 = in_stack_00000690;
          in_stack_000001a8 = in_stack_00000698;
          in_stack_000001d0 = in_stack_00000678;
          in_stack_000001d8 = in_stack_00000680;
          in_stack_000001f0 = in_stack_00000100;
          break;
        case 0x11:
          func_0x0045cd08(auStack_7ffffffe + 0x8000066e,lVar5);
          psVar9 = (segment_command *)((long)&MACH_HEADER.ncmds + 1);
          in_stack_000004f0 = in_stack_00000670;
          in_stack_000004f8 = in_stack_00000678;
          in_stack_00000500 = in_stack_00000680;
          break;
        case 0x12:
          func_0x0045cd08(auStack_7ffffffe + 0x8000066e,lVar5);
          psVar9 = (segment_command *)((long)&MACH_HEADER.ncmds + 2);
          in_stack_000004f0 = in_stack_00000670;
          in_stack_000004f8 = in_stack_00000678;
          in_stack_00000500 = in_stack_00000680;
          break;
        case 0x13:
          func_0x004bd098(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x18);
          in_stack_00000100 = *(segment_command **)(psVar20[1].segname + uVar13 + 0x10);
          lVar5 = *(long *)in_stack_00000100;
          *(long *)in_stack_00000100 = lVar5 + 1;
          if (lVar5 < 0) {
            func_0x007a05dc();
            goto code_r0x004c5940;
          }
          psVar9 = (segment_command *)((long)&MACH_HEADER.ncmds + 3);
          psVar18 = in_stack_00000670;
          unaff_x25 = in_stack_000006a8;
          psVar14 = in_stack_000006a0;
          psVar4 = in_stack_00000688;
          in_stack_000001a0 = in_stack_00000690;
          in_stack_000001a8 = in_stack_00000698;
          in_stack_000001d0 = in_stack_00000678;
          in_stack_000001d8 = in_stack_00000680;
          break;
        case 0x14:
          func_0x004bd098(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x18);
          in_stack_00000100 = *(segment_command **)(psVar20[1].segname + uVar13 + 0x10);
          lVar5 = *(long *)in_stack_00000100;
          *(long *)in_stack_00000100 = lVar5 + 1;
          if (lVar5 < 0) {
            func_0x007a05dc();
            goto code_r0x004c5940;
          }
          psVar9 = (segment_command *)&MACH_HEADER.sizeofcmds;
          psVar18 = in_stack_00000670;
          unaff_x25 = in_stack_000006a8;
          psVar14 = in_stack_000006a0;
          psVar4 = in_stack_00000688;
          in_stack_000001a0 = in_stack_00000690;
          in_stack_000001a8 = in_stack_00000698;
          in_stack_000001d0 = in_stack_00000678;
          in_stack_000001d8 = in_stack_00000680;
          break;
        default:
          func_0x004bcea4(auStack_7ffffffe + 0x8000040e);
          func_0x004bcea4(&stack0x000001f0,psVar20[1].segname + uVar13 + 8);
          func_0x004bcea4(auStack_7ffffffe + 0x8000066e,psVar20[2].segname + uVar13 + 0x18);
          psVar9 = in_stack_00000428;
          psVar18 = in_stack_00000430;
          unaff_x25 = in_stack_000001f0;
          psVar14 = in_stack_00000460;
          psVar4 = in_stack_00000448;
          in_stack_000000b8 = in_stack_000006b0;
          in_stack_000000c8 = in_stack_000006a8;
          in_stack_000000d0 = in_stack_000006a0;
          in_stack_000000d8 = in_stack_00000208;
          in_stack_000000e0 = in_stack_00000218;
          in_stack_000000e8 = in_stack_00000210;
          in_stack_00000100 = in_stack_000001f8;
          in_stack_00000108 = in_stack_00000200;
          in_stack_00000180 = in_stack_000006b8;
          in_stack_00000188 = in_stack_000006c0;
          in_stack_000001a0 = in_stack_00000450;
          in_stack_000001a8 = in_stack_00000458;
          in_stack_000001d0 = in_stack_00000438;
          in_stack_000001d8 = in_stack_00000440;
          in_stack_00000340 = in_stack_00000220;
          in_stack_00000348 = in_stack_00000228;
          in_stack_00000350 = in_stack_00000230;
          in_stack_00000358 = in_stack_00000238;
          in_stack_00000360 = in_stack_00000240;
          in_stack_00000368 = in_stack_00000670;
          in_stack_00000370 = in_stack_00000678;
          in_stack_00000378 = in_stack_00000680;
          in_stack_000004f0 = in_stack_00000410;
          in_stack_000004f8 = in_stack_00000418;
          in_stack_00000500 = in_stack_00000420;
          in_stack_000007a0 = in_stack_00000220;
          in_stack_000007a8 = in_stack_00000228;
          in_stack_000007b0 = in_stack_00000230;
          in_stack_000007b8 = in_stack_00000238;
          in_stack_000007c0 = in_stack_00000240;
          in_stack_000007c8 = in_stack_00000670;
          in_stack_000007d0 = in_stack_00000678;
          in_stack_000007d8 = in_stack_00000680;
          in_stack_000007e0 = in_stack_00000688;
          in_stack_000007e8 = in_stack_00000690;
          in_stack_000007f0 = in_stack_00000698;
          break;
        case 0x16:
          func_0x004bcea4(auStack_7ffffffe + 0x8000066e,psVar20[2].segname + uVar13 + 8);
          func_0x004bd098(auStack_7ffffffe + 0x8000033e,(long)psVar20->segname + uVar13 + 0x18);
          func_0x004bd098(auStack_7ffffffe + 0x8000040e,psVar20[1].segname + uVar13 + 0x10);
          psVar9 = (segment_command *)((long)&MACH_HEADER.sizeofcmds + 2);
          psVar18 = in_stack_00000340;
          unaff_x25 = in_stack_00000378;
          psVar14 = in_stack_00000370;
          psVar4 = in_stack_00000358;
          in_stack_000000b8 = in_stack_000006c0;
          in_stack_000000c8 = in_stack_000006b8;
          in_stack_000000d0 = in_stack_000006b0;
          in_stack_000000d8 = in_stack_00000420;
          in_stack_000000e0 = in_stack_00000430;
          in_stack_000000e8 = in_stack_00000428;
          in_stack_00000100 = in_stack_00000410;
          in_stack_00000108 = in_stack_00000418;
          in_stack_000001a0 = in_stack_00000360;
          in_stack_000001a8 = in_stack_00000368;
          in_stack_000001d0 = in_stack_00000348;
          in_stack_000001d8 = in_stack_00000350;
          in_stack_000001f0 = in_stack_00000438;
          in_stack_000001f8 = in_stack_00000440;
          in_stack_00000200 = in_stack_00000448;
          in_stack_00000208 = in_stack_00000670;
          in_stack_00000210 = in_stack_00000678;
          in_stack_00000218 = in_stack_00000680;
          in_stack_00000220 = in_stack_00000688;
          in_stack_00000228 = in_stack_00000690;
          in_stack_00000230 = in_stack_00000698;
          in_stack_00000238 = in_stack_000006a0;
          in_stack_00000240 = in_stack_000006a8;
          in_stack_000007a0 = in_stack_00000438;
          in_stack_000007a8 = in_stack_00000440;
          in_stack_000007b0 = in_stack_00000448;
          in_stack_000007b8 = in_stack_00000670;
          in_stack_000007c0 = in_stack_00000678;
          in_stack_000007c8 = in_stack_00000680;
          in_stack_000007d0 = in_stack_00000688;
          in_stack_000007d8 = in_stack_00000690;
          in_stack_000007e0 = in_stack_00000698;
          in_stack_000007e8 = in_stack_000006a0;
          in_stack_000007f0 = in_stack_000006a8;
          break;
        case 0x17:
          func_0x004bd098(auStack_7ffffffe + 0x8000033e,(long)psVar20->segname + uVar13 + 0x18);
          func_0x004bd098(auStack_7ffffffe + 0x8000040e,psVar20[1].segname + uVar13 + 0x10);
          func_0x004bd098(&stack0x000001f0,psVar20[2].segname + uVar13 + 8);
          in_stack_000000d0 = *(segment_command **)(psVar20[3].segname + uVar13);
          lVar5 = *(long *)in_stack_000000d0;
          *(long *)in_stack_000000d0 = lVar5 + 1;
          if (lVar5 < 0) {
            func_0x007a05dc();
          }
          else {
            in_stack_000000c8 = *(segment_command **)(psVar20[3].segname + uVar13 + 8);
            lVar5 = *(long *)in_stack_000000c8;
            *(long *)in_stack_000000c8 = lVar5 + 1;
            if (-1 < lVar5) {
              psVar9 = (segment_command *)((long)&MACH_HEADER.sizeofcmds + 3);
              psVar18 = in_stack_00000340;
              unaff_x25 = in_stack_00000378;
              psVar14 = in_stack_00000370;
              psVar4 = in_stack_00000358;
              in_stack_000007a8 = in_stack_00000440;
              in_stack_000007b0 = in_stack_00000448;
              in_stack_000007b8 = in_stack_000001f0;
              in_stack_000000d8 = in_stack_00000420;
              in_stack_000000e0 = in_stack_00000430;
              in_stack_000000e8 = in_stack_00000428;
              in_stack_00000100 = in_stack_00000410;
              in_stack_00000108 = in_stack_00000418;
              in_stack_000001a0 = in_stack_00000360;
              in_stack_000001a8 = in_stack_00000368;
              in_stack_000001d0 = in_stack_00000348;
              in_stack_000001d8 = in_stack_00000350;
              in_stack_00000670 = in_stack_00000438;
              in_stack_00000678 = in_stack_00000440;
              in_stack_00000680 = in_stack_00000448;
              in_stack_00000688 = in_stack_000001f0;
              in_stack_00000690 = in_stack_000001f8;
              in_stack_00000698 = in_stack_00000200;
              in_stack_000006a0 = in_stack_00000208;
              in_stack_000006a8 = in_stack_00000210;
              in_stack_000006b0 = in_stack_00000218;
              in_stack_000006b8 = in_stack_00000220;
              in_stack_000006c0 = in_stack_00000228;
              in_stack_000007c0 = in_stack_000001f8;
              in_stack_000007c8 = in_stack_00000200;
              in_stack_000007d0 = in_stack_00000208;
              in_stack_000007d8 = in_stack_00000210;
              in_stack_000007e0 = in_stack_00000218;
              in_stack_000007e8 = in_stack_00000220;
              in_stack_000007f0 = in_stack_00000228;
              goto code_r0x004c174c;
            }
            func_0x007a05dc();
          }
          goto code_r0x004c5940;
        case 0x18:
          func_0x004cda04(&stack0x000001f0,(long)psVar20->segname + uVar13 + 0x18,&UNK_009e5ca0);
          func_0x004cdf58(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x30,
                          &UNK_009e5ca0);
          psVar9 = (segment_command *)&MACH_HEADER.flags;
          psVar18 = in_stack_000001f0;
          psVar14 = (segment_command *)
                    ((ulong)psVar14 & 0xffffffffffff0000 | (ulong)(byte)psVar20[1].segname[uVar13] |
                    (ulong)(byte)psVar20[1].segname[uVar13 + 1] << 8);
          psVar4 = in_stack_00000670;
          in_stack_000001a0 = in_stack_00000678;
          in_stack_000001a8 = in_stack_00000680;
          in_stack_000001d0 = in_stack_000001f8;
          in_stack_000001d8 = in_stack_00000200;
          break;
        case 0x19:
          func_0x004cda04(auStack_7ffffffe + 0x8000033e,psVar20[2].segname + uVar13 + 8,
                          &UNK_009e5d18);
          func_0x004bd098(&stack0x000001f0,(long)psVar20->segname + uVar13 + 0x18);
          func_0x004bd098(auStack_7ffffffe + 0x8000066e,psVar20[1].segname + uVar13 + 0x10);
          psVar9 = (segment_command *)((long)&MACH_HEADER.flags + 1);
          psVar18 = in_stack_000001f0;
          unaff_x25 = in_stack_00000228;
          psVar14 = in_stack_00000220;
          psVar4 = in_stack_00000208;
          in_stack_00000438 = in_stack_00000698;
          in_stack_000007a8 = in_stack_000006a0;
          in_stack_000007b0 = in_stack_000006a8;
          in_stack_000007b8 = in_stack_00000340;
          in_stack_000000d8 = in_stack_00000680;
          in_stack_000000e0 = in_stack_00000690;
          in_stack_000000e8 = in_stack_00000688;
          in_stack_00000100 = in_stack_00000670;
          in_stack_00000108 = in_stack_00000678;
          in_stack_000001a0 = in_stack_00000210;
          in_stack_000001a8 = in_stack_00000218;
          in_stack_000001d0 = in_stack_000001f8;
          in_stack_000001d8 = in_stack_00000200;
          in_stack_00000420 = in_stack_000006a8;
          in_stack_00000428 = in_stack_00000340;
          in_stack_00000430 = in_stack_00000348;
          psVar24 = in_stack_00000350;
          in_stack_000007c0 = in_stack_00000348;
          in_stack_000007c8 = in_stack_00000350;
code_r0x004c174c:
          in_stack_000007a0 = in_stack_00000438;
          break;
        case 0x1a:
          func_0x004cdb1c(&stack0x000001f0,(long)psVar20->segname + uVar13 + 0x18,&UNK_009e5cb8);
          func_0x004cdf58(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x30,
                          &UNK_009e5cb8);
          psVar14 = *(segment_command **)(psVar20[1].segname + uVar13);
          lVar5 = *(long *)psVar14;
          *(long *)psVar14 = lVar5 + 1;
          if (lVar5 < 0) {
            func_0x007a05dc();
            goto code_r0x004c5940;
          }
          psVar9 = (segment_command *)((long)&MACH_HEADER.flags + 2);
          psVar18 = in_stack_000001f0;
          psVar4 = in_stack_00000670;
          in_stack_000001a0 = in_stack_00000678;
          in_stack_000001a8 = in_stack_00000680;
          in_stack_000001d0 = in_stack_000001f8;
          in_stack_000001d8 = in_stack_00000200;
          break;
        case 0x1b:
          func_0x004cdf58(auStack_7ffffffe + 0x8000066e,lVar5,&UNK_009e5c40);
          psVar9 = (segment_command *)((long)&MACH_HEADER.flags + 3);
          in_stack_000004f0 = in_stack_00000670;
          in_stack_000004f8 = in_stack_00000678;
          in_stack_00000500 = in_stack_00000680;
          break;
        case 0x1c:
          psVar9 = (segment_command *)&MACH_HEADER.reserved;
          break;
        case 0x1d:
          psVar9 = (segment_command *)((long)&MACH_HEADER.reserved + 1);
          break;
        case 0x1e:
          func_0x004cdb1c(auStack_7ffffffe + 0x8000066e,lVar5,&UNK_009e5c58);
          psVar9 = (segment_command *)((long)&MACH_HEADER.reserved + 2);
          in_stack_000004f0 = in_stack_00000670;
          in_stack_000004f8 = in_stack_00000678;
          in_stack_00000500 = in_stack_00000680;
          break;
        case 0x1f:
          in_stack_000000e8 = *(segment_command **)(psVar20[1].segname + uVar13 + 0x28);
          lVar5 = *(long *)in_stack_000000e8;
          *(long *)in_stack_000000e8 = lVar5 + 1;
          if (lVar5 < 0) {
            func_0x007a05dc();
            goto code_r0x004c5940;
          }
          in_stack_000000e0 = *(segment_command **)(psVar20[1].segname + uVar13 + 0x30);
          func_0x004cdf58(&stack0x000001f0,psVar20[1].segname + uVar13 + 0x10,&UNK_009e5d00);
          if (*(long *)((long)psVar20->segname + uVar13 + 0x18) == 0xc) {
            psVar18 = (segment_command *)&MACH_HEADER.filetype;
          }
          else {
            func_0x004bd098(auStack_7ffffffe + 0x8000066e,(long)psVar20->segname + uVar13 + 0x18);
            psVar18 = in_stack_00000670;
            in_stack_00000078 = in_stack_000006a8;
            in_stack_00000080 = in_stack_000006a0;
            in_stack_00000070 = in_stack_00000688;
            in_stack_00000340 = in_stack_00000690;
            in_stack_00000348 = in_stack_00000698;
            in_stack_00000410 = in_stack_00000678;
            in_stack_00000418 = in_stack_00000680;
          }
          psVar9 = (segment_command *)((long)&MACH_HEADER.reserved + 3);
          unaff_x25 = in_stack_00000078;
          psVar14 = in_stack_00000080;
          psVar4 = in_stack_00000070;
          in_stack_000000d8 = in_stack_00000200;
          in_stack_00000100 = in_stack_000001f0;
          in_stack_00000108 = in_stack_000001f8;
          in_stack_000001a0 = in_stack_00000340;
          in_stack_000001a8 = in_stack_00000348;
          in_stack_000001d0 = in_stack_00000410;
          in_stack_000001d8 = in_stack_00000418;
          break;
        case 0x20:
          func_0x0045cd08(auStack_7ffffffe + 0x8000066e,lVar5);
          psVar9 = &segment_command_00000020;
          in_stack_000004f0 = in_stack_00000670;
          in_stack_000004f8 = in_stack_00000678;
          in_stack_00000500 = in_stack_00000680;
        }
        puVar6 = (undefined8 *)(lVar3 + uVar13);
        puVar6[1] = in_stack_000004f8;
        *puVar6 = in_stack_000004f0;
        puVar6[6] = in_stack_000001d8;
        puVar6[5] = in_stack_000001d0;
        puVar6[9] = in_stack_000001a8;
        puVar6[8] = in_stack_000001a0;
        puVar6[0x1a] = in_stack_000007e8;
        puVar6[0x19] = in_stack_000007e0;
        puVar6[0x18] = in_stack_000007d8;
        puVar6[0x17] = in_stack_000007d0;
        puVar6[0x16] = in_stack_000007c8;
        puVar6[0x15] = in_stack_000007c0;
        puVar6[0x14] = in_stack_000007b8;
        puVar6[0x13] = in_stack_000007b0;
        puVar6[2] = in_stack_00000500;
        puVar6[3] = psVar9;
        puVar6[4] = psVar18;
        puVar6[7] = psVar4;
        puVar6[10] = psVar14;
        puVar6[0xb] = unaff_x25;
        puVar6[0xd] = in_stack_00000108;
        puVar6[0xc] = in_stack_00000100;
        puVar6[0xe] = in_stack_000000d8;
        puVar6[0xf] = in_stack_000000e8;
        puVar6[0x10] = in_stack_000000e0;
        puVar6[0x12] = in_stack_000007a8;
        puVar6[0x11] = in_stack_000007a0;
        puVar6[0x1b] = in_stack_000007f0;
        puVar6[0x1c] = in_stack_000000d0;
        puVar6[0x1d] = in_stack_000000c8;
        puVar6[0x1e] = in_stack_000000b8;
        uVar13 = uVar13 + 0x108;
        puVar6[0x20] = in_stack_00000188;
        puVar6[0x1f] = in_stack_00000180;
        in_stack_00000438 = psVar24;
      } while (uVar8 != uVar17);
      unaff_x22 = (segment_command *)((ulong)unaff_x22 & 0xffffffff);
      psVar15 = (segment_command *)((ulong)psVar15 & 0xffffffff);
    }
  }
  plVar2 = (long *)func_0x005847cc(in_stack_000000f8,psVar15);
  if (plVar2 == (long *)0x0) {
    func_0x007a23bc(&UNK_009e66d8);
    goto code_r0x004c5940;
  }
  uVar8 = ((ulong)((long)psVar21 - (long)psVar20) >> 3) * 0xf83e0f83e0f83e1;
  lVar3 = plVar2[2];
  if ((ulong)(*plVar2 - lVar3) < uVar8) {
    func_0x007a535c(plVar2,lVar3,uVar8,8,0x108);
    lVar3 = plVar2[2];
  }
  _memcpy(plVar2[1] + lVar3 * 0x108,psVar20,(long)psVar21 - (long)psVar20);
  plVar2[2] = lVar3 + uVar8;
  func_0x004d3808(auStack_7ffffffe + 0x8000066e);
  if (in_stack_00000548 == 0x16) {
    uVar8 = plVar2[2];
    if (uVar8 <= auVar23._8_8_) {
      func_0x007a2080(auVar23._8_8_,uVar8,&UNK_009e66f0);
      goto code_r0x004c5940;
    }
    puVar6 = (undefined8 *)(plVar2[1] + auVar23._8_8_ * 0x108);
    psVar21 = (segment_command *)puVar6[1];
    psVar20 = (segment_command *)*puVar6;
    lVar10 = puVar6[2];
    lVar3 = puVar6[3];
    psVar14 = (segment_command *)puVar6[5];
    psVar18 = (segment_command *)puVar6[4];
    _memmove(puVar6,puVar6 + 0x21,(uVar8 + ~auVar23._8_8_) * 0x108);
    plVar2[2] = uVar8 - 1;
    if (lVar3 - 0xcU < 0x15) {
      func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e6708);
      goto code_r0x004c5940;
    }
    if (in_stack_000005d0 != -0x8000000000000000) {
      func_0x007a23bc(&UNK_009e6720);
      goto code_r0x004c5940;
    }
    lVar3 = *in_stack_000005d8;
    *in_stack_000005d8 = lVar3 + 1;
    if (lVar3 < 0) {
      func_0x007a05dc();
      goto code_r0x004c5940;
    }
    func_0x005db1b4(&stack0x000001f0,auStack_7ffffffe + 0x800004ee,unaff_x29 + -0xd0,
                    auStack_7ffffffe + 0x8000033e,in_stack_000005d8,auStack_7ffffffe + 0x8000031e);
    func_0x004bb3f8(auStack_7ffffffe + 0x8000066e);
    func_0x004bb3f8(auStack_7ffffffe + 0x800006c6);
    func_0x004bb3f8(auStack_7ffffffe + 0x8000071e);
    func_0x004bc41c(auStack_7ffffffe + 0x8000040e);
  }
  else {
    if (in_stack_00000548 != 0x19) {
      func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e6780);
      goto code_r0x004c5940;
    }
    uVar8 = plVar2[2];
    if (uVar8 <= auVar23._8_8_) {
      func_0x007a2080(auVar23._8_8_,uVar8,&UNK_009e6738);
      goto code_r0x004c5940;
    }
    lVar5 = plVar2[1] + auVar23._8_8_ * 0x108;
    lVar12 = *(long *)(lVar5 + 0x18);
    psVar14 = *(segment_command **)(lVar5 + 0x28);
    psVar18 = *(segment_command **)(lVar5 + 0x20);
    lVar3 = *(long *)(lVar5 + 0x30);
    _memmove(lVar5,lVar5 + 0x108,(uVar8 + ~auVar23._8_8_) * 0x108);
    plVar2[2] = uVar8 - 1;
    if (lVar12 != 0x18) {
      func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e6750);
      goto code_r0x004c5940;
    }
    func_0x004d050c(auStack_7ffffffe + 0x8000033e,in_stack_000005d8,
                    in_stack_000005d8 + in_stack_000005e0 * 3,&UNK_009e5910);
    func_0x005dc404(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000033e,
                    auStack_7ffffffe + 0x80000206,auStack_7ffffffe + 0x8000031e);
    lVar3 = lVar3 + 1;
    psVar21 = psVar14;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x004ca5dc(psVar21);
      psVar21 = (segment_command *)&psVar21->vmaddr;
    }
    if (psVar18 != (segment_command *)0x0) {
      func_0x00187bd4(psVar14,(long)psVar18 * 0x18,8);
    }
    func_0x004bc780(auStack_7ffffffe + 0x8000040e);
    psVar21 = psVar20;
  }
  lVar3 = plVar2[2];
  if (lVar3 == *plVar2) {
    func_0x005bd0a4(plVar2,&UNK_009e6768);
  }
  _memcpy(plVar2[1] + lVar3 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
  plVar2[2] = lVar3 + 1;
  func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000118._4_4_);
  if (psVar20 != (segment_command *)0x8000000000000000) {
    lVar10 = lVar10 + 1;
    psVar4 = psVar21;
    while (lVar10 = lVar10 + -1, lVar10 != 0) {
      func_0x004caae8(psVar4);
      psVar4 = (segment_command *)&psVar4[3].filesize;
    }
    if (psVar20 != (segment_command *)0x0) {
      func_0x00187bd4(psVar21,(long)psVar20 * 0x108,8);
    }
  }
  if (((ulong)unaff_x22 & 1) == 0) {
    func_0x0058497c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,psVar15);
    func_0x004ce364(auStack_7ffffffe + 0x8000066e);
    if (psVar20 == (segment_command *)0x0) goto code_r0x004c20a4;
  }
  else {
    puVar7 = (undefined4 *)func_0x00187bd0(0x28,8);
    if (puVar7 == (undefined4 *)0x0) {
      func_0x007a1f18(8,0x28);
      goto code_r0x004c5940;
    }
    *puVar7 = in_stack_000000a0;
    *(undefined8 *)(puVar7 + 2) = 0;
    *(undefined8 *)(puVar7 + 4) = 8;
    *(undefined8 *)(puVar7 + 6) = 0;
    *(undefined1 *)(puVar7 + 8) = 0;
    func_0x00584c34(&stack0x000001f0,in_stack_000000f8,psVar15,auStack_7ffffffe + 0x8000066e);
    func_0x004ce364(&stack0x000001f0);
    if (psVar18 == (segment_command *)0x0) goto code_r0x004c20a4;
    psVar21 = psVar14;
    psVar20 = psVar18;
  }
  func_0x00187bd4(psVar21,(long)psVar20 * 0x28,8);
code_r0x004c20a4:
  func_0x004bea24(in_stack_000000f8,psVar15,unaff_x22,in_stack_000000a0);
  if ((in_stack_00000548 != 0x16) && (in_stack_00000548 != 0x19)) {
    func_0x004bba74(auStack_7ffffffe + 0x8000052e);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

