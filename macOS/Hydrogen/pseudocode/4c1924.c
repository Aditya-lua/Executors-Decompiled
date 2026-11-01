
undefined8 FUN_004c1924(long param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  segment_command *psVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  undefined4 *puVar7;
  segment_command *psVar8;
  undefined8 *unaff_x19;
  long lVar9;
  long unaff_x20;
  long unaff_x22;
  segment_command *psVar10;
  long unaff_x24;
  segment_command *psVar11;
  segment_command *psVar12;
  ulong uVar13;
  long unaff_x28;
  long lVar14;
  long unaff_x29;
  long lVar15;
  long lVar16;
  segment_command *in_stack_00000070;
  segment_command *in_stack_00000078;
  segment_command *in_stack_00000080;
  long in_stack_00000088;
  undefined4 in_stack_00000090;
  ulong in_stack_00000098;
  undefined4 in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  segment_command *in_stack_000000b8;
  long in_stack_000000c0;
  segment_command *in_stack_000000c8;
  segment_command *in_stack_000000d0;
  segment_command *psStack00000000000000d8;
  segment_command *in_stack_000000e0;
  segment_command *in_stack_000000e8;
  long in_stack_000000f0;
  undefined8 in_stack_000000f8;
  segment_command *psStack0000000000000100;
  segment_command *psStack0000000000000108;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  segment_command *in_stack_00000180;
  segment_command *in_stack_00000188;
  segment_command *psStack00000000000001a0;
  segment_command *psStack00000000000001a8;
  segment_command *psStack00000000000001d0;
  segment_command *psStack00000000000001d8;
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
  long in_stack_00000300;
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
  segment_command *psVar17;
  segment_command *in_stack_00000438;
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
  
code_r0x004c1924:
  if (param_1 == 0xc) {
    psVar10 = (segment_command *)&MACH_HEADER.filetype;
  }
  else {
    func_0x004bd098(auStack_7ffffffe + 0x8000066e,unaff_x22 + 0x20);
    psVar10 = (segment_command *)*unaff_x19;
    in_stack_00000070 = (segment_command *)unaff_x19[3];
    in_stack_00000080 = (segment_command *)unaff_x19[6];
    in_stack_00000078 = (segment_command *)unaff_x19[7];
    in_stack_00000340 = in_stack_00000690;
    in_stack_00000348 = in_stack_00000698;
    in_stack_00000410 = in_stack_00000678;
    in_stack_00000418 = in_stack_00000680;
  }
  psVar8 = (segment_command *)((long)&MACH_HEADER.reserved + 3);
  psVar11 = in_stack_00000078;
  psVar12 = in_stack_00000080;
  psVar3 = in_stack_00000070;
  psStack00000000000000d8 = in_stack_00000200;
  psStack0000000000000100 = in_stack_000001f0;
  psStack0000000000000108 = in_stack_000001f8;
  psStack00000000000001a0 = in_stack_00000340;
  psStack00000000000001a8 = in_stack_00000348;
  psStack00000000000001d0 = in_stack_00000410;
  psStack00000000000001d8 = in_stack_00000418;
  psVar17 = in_stack_00000438;
LAB_004c1068:
  in_stack_00000438 = psVar17;
  puVar1 = (undefined8 *)(in_stack_000000b0 + unaff_x20);
  puVar1[1] = in_stack_000004f8;
  *puVar1 = in_stack_000004f0;
  puVar1[6] = psStack00000000000001d8;
  puVar1[5] = psStack00000000000001d0;
  puVar1[9] = psStack00000000000001a8;
  puVar1[8] = psStack00000000000001a0;
  puVar1[0x1a] = in_stack_000007e8;
  puVar1[0x19] = in_stack_000007e0;
  puVar1[0x18] = in_stack_000007d8;
  puVar1[0x17] = in_stack_000007d0;
  puVar1[0x16] = in_stack_000007c8;
  puVar1[0x15] = in_stack_000007c0;
  puVar1[0x14] = in_stack_000007b8;
  puVar1[0x13] = in_stack_000007b0;
  puVar1[2] = in_stack_00000500;
  puVar1[3] = psVar8;
  puVar1[4] = psVar10;
  puVar1[7] = psVar3;
  puVar1[10] = psVar12;
  puVar1[0xb] = psVar11;
  puVar1[0xd] = psStack0000000000000108;
  puVar1[0xc] = psStack0000000000000100;
  puVar1[0xe] = psStack00000000000000d8;
  puVar1[0xf] = in_stack_000000e8;
  puVar1[0x10] = in_stack_000000e0;
  puVar1[0x12] = in_stack_000007a8;
  puVar1[0x11] = in_stack_000007a0;
  puVar1[0x1b] = in_stack_000007f0;
  puVar1[0x1c] = in_stack_000000d0;
  puVar1[0x1d] = in_stack_000000c8;
  puVar1[0x1e] = in_stack_000000b8;
  unaff_x20 = unaff_x20 + 0x108;
  puVar1[0x20] = in_stack_00000188;
  puVar1[0x1f] = in_stack_00000180;
  if ((in_stack_000000f0 == unaff_x28) || (in_stack_000000c0 == unaff_x20)) {
    plVar4 = (long *)func_0x005847cc(in_stack_000000f8,in_stack_00000090);
    if (plVar4 == (long *)0x0) {
      func_0x007a23bc(&UNK_009e66d8);
      goto LAB_004c5940;
    }
    uVar13 = ((ulong)(in_stack_00000088 - unaff_x24) >> 3) * 0xf83e0f83e0f83e1;
    lVar14 = plVar4[2];
    if ((ulong)(*plVar4 - lVar14) < uVar13) {
      func_0x007a535c(plVar4,lVar14,uVar13,8,0x108);
      lVar14 = plVar4[2];
    }
    _memcpy(plVar4[1] + lVar14 * 0x108);
    plVar4[2] = lVar14 + uVar13;
    func_0x004d3808(auStack_7ffffffe + 0x8000066e);
    if (in_stack_00000548 != 0x16) {
      if (in_stack_00000548 != 0x19) {
        func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e6780);
        goto LAB_004c5940;
      }
      uVar13 = plVar4[2];
      if (uVar13 <= in_stack_000000a8) {
        func_0x007a2080(in_stack_000000a8,uVar13,&UNK_009e6738);
        goto LAB_004c5940;
      }
      lVar5 = plVar4[1] + in_stack_000000a8 * 0x108;
      lVar9 = *(long *)(lVar5 + 0x18);
      lVar16 = *(long *)(lVar5 + 0x28);
      lVar15 = *(long *)(lVar5 + 0x20);
      lVar14 = *(long *)(lVar5 + 0x30);
      _memmove(lVar5,lVar5 + 0x108,(uVar13 + ~in_stack_000000a8) * 0x108);
      plVar4[2] = uVar13 - 1;
      if (lVar9 != 0x18) {
        func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e6750
                       );
        goto LAB_004c5940;
      }
      func_0x004d050c(auStack_7ffffffe + 0x8000033e,in_stack_000005d8,
                      in_stack_000005d8 + in_stack_000005e0 * 3,&UNK_009e5910);
      func_0x005dc404(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000033e,
                      auStack_7ffffffe + 0x80000206,auStack_7ffffffe + 0x8000031e);
      lVar14 = lVar14 + 1;
      lVar5 = lVar16;
      while (lVar14 = lVar14 + -1, lVar14 != 0) {
        func_0x004ca5dc(lVar5);
        lVar5 = lVar5 + 0x18;
      }
      if (lVar15 != 0) {
        func_0x00187bd4(lVar16,lVar15 * 0x18,8);
      }
      func_0x004bc780(auStack_7ffffffe + 0x8000040e);
      lVar14 = unaff_x24;
LAB_004c1ef4:
      lVar5 = plVar4[2];
      if (lVar5 == *plVar4) {
        func_0x005bd0a4(plVar4,&UNK_009e6768);
      }
      _memcpy(plVar4[1] + lVar5 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
      plVar4[2] = lVar5 + 1;
      func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000118._4_4_);
      if (unaff_x24 != -0x8000000000000000) {
        lVar5 = in_stack_00000300 + 1;
        lVar9 = lVar14;
        while (lVar5 = lVar5 + -1, lVar5 != 0) {
          func_0x004caae8(lVar9);
          lVar9 = lVar9 + 0x108;
        }
        if (unaff_x24 != 0) {
          func_0x00187bd4(lVar14,unaff_x24 * 0x108,8);
        }
      }
      if ((in_stack_00000098 & 0x100000000) == 0) {
        func_0x0058497c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000090);
        func_0x004ce364(auStack_7ffffffe + 0x8000066e);
        if (unaff_x24 == 0) goto code_r0x004c20a4;
      }
      else {
        puVar7 = (undefined4 *)func_0x00187bd0(0x28,8);
        if (puVar7 == (undefined4 *)0x0) {
          func_0x007a1f18(8,0x28);
          goto LAB_004c5940;
        }
        *puVar7 = in_stack_000000a0;
        *(undefined8 *)(puVar7 + 2) = 0;
        *(undefined8 *)(puVar7 + 4) = 8;
        *(undefined8 *)(puVar7 + 6) = 0;
        *(undefined1 *)(puVar7 + 8) = 0;
        func_0x00584c34(&stack0x000001f0,in_stack_000000f8,in_stack_00000090,
                        auStack_7ffffffe + 0x8000066e);
        func_0x004ce364(&stack0x000001f0);
        if (lVar15 == 0) goto code_r0x004c20a4;
        lVar14 = lVar16;
        unaff_x24 = lVar15;
      }
      func_0x00187bd4(lVar14,unaff_x24 * 0x28,8);
code_r0x004c20a4:
      func_0x004bea24(in_stack_000000f8,in_stack_00000090,in_stack_00000098._4_4_,in_stack_000000a0)
      ;
      if ((in_stack_00000548 != 0x16) && (in_stack_00000548 != 0x19)) {
        func_0x004bba74(auStack_7ffffffe + 0x8000052e);
      }
      if (in_stack_00000120 != 0) {
        func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
      }
      return 1;
    }
    uVar13 = plVar4[2];
    if (uVar13 <= in_stack_000000a8) {
      func_0x007a2080(in_stack_000000a8,uVar13,&UNK_009e66f0);
      goto LAB_004c5940;
    }
    plVar6 = (long *)(plVar4[1] + in_stack_000000a8 * 0x108);
    lVar14 = plVar6[1];
    unaff_x24 = *plVar6;
    in_stack_00000300 = plVar6[2];
    lVar5 = plVar6[3];
    lVar16 = plVar6[5];
    lVar15 = plVar6[4];
    _memmove(plVar6,plVar6 + 0x21,(uVar13 + ~in_stack_000000a8) * 0x108);
    plVar4[2] = uVar13 - 1;
    if (lVar5 - 0xcU < 0x15) {
      func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e6708);
      goto LAB_004c5940;
    }
    if (in_stack_000005d0 != -0x8000000000000000) {
      func_0x007a23bc(&UNK_009e6720);
      goto LAB_004c5940;
    }
    lVar5 = *in_stack_000005d8;
    *in_stack_000005d8 = lVar5 + 1;
    if (-1 < lVar5) {
      func_0x005db1b4(&stack0x000001f0,auStack_7ffffffe + 0x800004ee,unaff_x29 + -0xd0,
                      auStack_7ffffffe + 0x8000033e,in_stack_000005d8,auStack_7ffffffe + 0x8000031e)
      ;
      func_0x004bb3f8(auStack_7ffffffe + 0x8000066e);
      func_0x004bb3f8(auStack_7ffffffe + 0x800006c6);
      func_0x004bb3f8(auStack_7ffffffe + 0x8000071e);
      func_0x004bc41c(auStack_7ffffffe + 0x8000040e);
      goto LAB_004c1ef4;
    }
    func_0x007a05dc();
    goto LAB_004c5940;
  }
  lVar14 = unaff_x24 + unaff_x20;
  unaff_x28 = unaff_x28 + 1;
  psVar8 = (segment_command *)&MACH_HEADER.filetype;
  psVar17 = in_stack_00000438;
  switch(*(undefined8 *)(lVar14 + 0x18)) {
  case 0xc:
    goto LAB_004c1068;
  case 0xd:
    psVar3 = (segment_command *)func_0x00187bd0(0x40,8);
    if (psVar3 == (segment_command *)0x0) {
      func_0x007a1f18(8,0x40);
      goto LAB_004c5940;
    }
    func_0x004bd098(auStack_7ffffffe + 0x8000066e,*(undefined8 *)(unaff_x24 + unaff_x20 + 0x38));
    *(segment_command **)psVar3->segname = in_stack_00000678;
    *(segment_command **)psVar3 = in_stack_00000670;
    psVar3->vmaddr = (qword)in_stack_00000688;
    *(segment_command **)((long)psVar3->segname + 8) = in_stack_00000680;
    psVar3->fileoff = (qword)in_stack_00000698;
    psVar3->vmsize = (qword)in_stack_00000690;
    *(segment_command **)&psVar3->maxprot = in_stack_000006a8;
    psVar3->filesize = (qword)in_stack_000006a0;
    func_0x004cdf58(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x20,&UNK_009e5c70);
    psVar8 = (segment_command *)((long)&MACH_HEADER.filetype + 1);
    psVar10 = in_stack_00000670;
    psStack00000000000001d0 = in_stack_00000678;
    psStack00000000000001d8 = in_stack_00000680;
    in_stack_000001f0 = psVar3;
    goto LAB_004c1068;
  case 0xe:
    func_0x004bdc20(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x20);
    psVar8 = (segment_command *)((long)&MACH_HEADER.filetype + 2);
    psVar10 = in_stack_00000670;
    psVar12 = in_stack_000006a0;
    psVar3 = in_stack_00000688;
    psStack00000000000001a0 = in_stack_00000690;
    psStack00000000000001a8 = in_stack_00000698;
    psStack00000000000001d0 = in_stack_00000678;
    psStack00000000000001d8 = in_stack_00000680;
    goto LAB_004c1068;
  case 0xf:
    func_0x004cda04(&stack0x000001f0,unaff_x24 + unaff_x20 + 0x20,&UNK_009e5ca0);
    func_0x004cdf58(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x38,&UNK_009e5ca0);
    psVar8 = (segment_command *)((long)&MACH_HEADER.filetype + 3);
    psVar10 = in_stack_000001f0;
    psVar12 = (segment_command *)
              ((ulong)psVar12 & 0xffffffffffff0000 | (ulong)*(byte *)(unaff_x24 + unaff_x20 + 0x50)
              | (ulong)*(byte *)(unaff_x24 + unaff_x20 + 0x51) << 8);
    psVar3 = in_stack_00000670;
    psStack00000000000001a0 = in_stack_00000678;
    psStack00000000000001a8 = in_stack_00000680;
    psStack00000000000001d0 = in_stack_000001f8;
    psStack00000000000001d8 = in_stack_00000200;
    goto LAB_004c1068;
  case 0x10:
    func_0x004bd098(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x20);
    psStack0000000000000100 = *(segment_command **)(unaff_x24 + unaff_x20 + 0x60);
    lVar14 = *(long *)psStack0000000000000100;
    *(long *)psStack0000000000000100 = lVar14 + 1;
    if (lVar14 < 0) {
      func_0x007a05dc();
      goto LAB_004c5940;
    }
    psStack0000000000000108 = *(segment_command **)(unaff_x24 + unaff_x20 + 0x68);
    lVar14 = *(long *)psStack0000000000000108;
    *(long *)psStack0000000000000108 = lVar14 + 1;
    if (lVar14 < 0) {
      func_0x007a05dc();
      goto LAB_004c5940;
    }
    psVar8 = (segment_command *)&MACH_HEADER.ncmds;
    psVar10 = in_stack_00000670;
    psVar11 = in_stack_000006a8;
    psVar12 = in_stack_000006a0;
    psVar3 = in_stack_00000688;
    psStack00000000000001a0 = in_stack_00000690;
    psStack00000000000001a8 = in_stack_00000698;
    psStack00000000000001d0 = in_stack_00000678;
    psStack00000000000001d8 = in_stack_00000680;
    in_stack_000001f0 = psStack0000000000000100;
    goto LAB_004c1068;
  case 0x11:
    func_0x0045cd08(auStack_7ffffffe + 0x8000066e,lVar14);
    psVar8 = (segment_command *)((long)&MACH_HEADER.ncmds + 1);
    in_stack_000004f0 = in_stack_00000670;
    in_stack_000004f8 = in_stack_00000678;
    in_stack_00000500 = in_stack_00000680;
    goto LAB_004c1068;
  case 0x12:
    func_0x0045cd08(auStack_7ffffffe + 0x8000066e,lVar14);
    psVar8 = (segment_command *)((long)&MACH_HEADER.ncmds + 2);
    in_stack_000004f0 = in_stack_00000670;
    in_stack_000004f8 = in_stack_00000678;
    in_stack_00000500 = in_stack_00000680;
    goto LAB_004c1068;
  case 0x13:
    func_0x004bd098(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x20);
    psStack0000000000000100 = *(segment_command **)(unaff_x24 + unaff_x20 + 0x60);
    lVar14 = *(long *)psStack0000000000000100;
    *(long *)psStack0000000000000100 = lVar14 + 1;
    if (lVar14 < 0) {
      func_0x007a05dc();
      goto LAB_004c5940;
    }
    psVar8 = (segment_command *)((long)&MACH_HEADER.ncmds + 3);
    psVar10 = in_stack_00000670;
    psVar11 = in_stack_000006a8;
    psVar12 = in_stack_000006a0;
    psVar3 = in_stack_00000688;
    psStack00000000000001a0 = in_stack_00000690;
    psStack00000000000001a8 = in_stack_00000698;
    psStack00000000000001d0 = in_stack_00000678;
    psStack00000000000001d8 = in_stack_00000680;
    goto LAB_004c1068;
  case 0x14:
    func_0x004bd098(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x20);
    psStack0000000000000100 = *(segment_command **)(unaff_x24 + unaff_x20 + 0x60);
    lVar14 = *(long *)psStack0000000000000100;
    *(long *)psStack0000000000000100 = lVar14 + 1;
    if (lVar14 < 0) {
      func_0x007a05dc();
      goto LAB_004c5940;
    }
    psVar8 = (segment_command *)&MACH_HEADER.sizeofcmds;
    psVar10 = in_stack_00000670;
    psVar11 = in_stack_000006a8;
    psVar12 = in_stack_000006a0;
    psVar3 = in_stack_00000688;
    psStack00000000000001a0 = in_stack_00000690;
    psStack00000000000001a8 = in_stack_00000698;
    psStack00000000000001d0 = in_stack_00000678;
    psStack00000000000001d8 = in_stack_00000680;
    goto LAB_004c1068;
  default:
    func_0x004bcea4(auStack_7ffffffe + 0x8000040e);
    func_0x004bcea4(&stack0x000001f0,unaff_x24 + unaff_x20 + 0x58);
    func_0x004bcea4(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0xb0);
    psVar8 = in_stack_00000428;
    psVar10 = in_stack_00000430;
    psVar11 = in_stack_000001f0;
    psVar12 = in_stack_00000460;
    psVar3 = in_stack_00000448;
    in_stack_000000b8 = in_stack_000006b0;
    in_stack_000000c8 = in_stack_000006a8;
    in_stack_000000d0 = in_stack_000006a0;
    psStack00000000000000d8 = in_stack_00000208;
    in_stack_000000e0 = in_stack_00000218;
    in_stack_000000e8 = in_stack_00000210;
    psStack0000000000000100 = in_stack_000001f8;
    psStack0000000000000108 = in_stack_00000200;
    in_stack_00000180 = in_stack_000006b8;
    in_stack_00000188 = in_stack_000006c0;
    psStack00000000000001a0 = in_stack_00000450;
    psStack00000000000001a8 = in_stack_00000458;
    psStack00000000000001d0 = in_stack_00000438;
    psStack00000000000001d8 = in_stack_00000440;
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
    goto LAB_004c1068;
  case 0x16:
    func_0x004bcea4(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0xa0);
    func_0x004bd098(auStack_7ffffffe + 0x8000033e,unaff_x24 + unaff_x20 + 0x20);
    func_0x004bd098(auStack_7ffffffe + 0x8000040e,unaff_x24 + unaff_x20 + 0x60);
    psVar8 = (segment_command *)((long)&MACH_HEADER.sizeofcmds + 2);
    psVar10 = in_stack_00000340;
    psVar11 = in_stack_00000378;
    psVar12 = in_stack_00000370;
    psVar3 = in_stack_00000358;
    in_stack_000000b8 = in_stack_000006c0;
    in_stack_000000c8 = in_stack_000006b8;
    in_stack_000000d0 = in_stack_000006b0;
    psStack00000000000000d8 = in_stack_00000420;
    in_stack_000000e0 = in_stack_00000430;
    in_stack_000000e8 = in_stack_00000428;
    psStack0000000000000100 = in_stack_00000410;
    psStack0000000000000108 = in_stack_00000418;
    psStack00000000000001a0 = in_stack_00000360;
    psStack00000000000001a8 = in_stack_00000368;
    psStack00000000000001d0 = in_stack_00000348;
    psStack00000000000001d8 = in_stack_00000350;
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
    goto LAB_004c1068;
  case 0x17:
    func_0x004bd098(auStack_7ffffffe + 0x8000033e,unaff_x24 + unaff_x20 + 0x20);
    func_0x004bd098(auStack_7ffffffe + 0x8000040e,unaff_x24 + unaff_x20 + 0x60);
    func_0x004bd098(&stack0x000001f0,unaff_x24 + unaff_x20 + 0xa0);
    in_stack_000000d0 = *(segment_command **)(unaff_x24 + unaff_x20 + 0xe0);
    lVar14 = *(long *)in_stack_000000d0;
    *(long *)in_stack_000000d0 = lVar14 + 1;
    if (lVar14 < 0) {
      func_0x007a05dc();
      goto LAB_004c5940;
    }
    in_stack_000000c8 = *(segment_command **)(unaff_x24 + unaff_x20 + 0xe8);
    lVar14 = *(long *)in_stack_000000c8;
    *(long *)in_stack_000000c8 = lVar14 + 1;
    if (lVar14 < 0) {
      func_0x007a05dc();
      goto LAB_004c5940;
    }
    psVar8 = (segment_command *)((long)&MACH_HEADER.sizeofcmds + 3);
    psVar10 = in_stack_00000340;
    psVar11 = in_stack_00000378;
    psVar12 = in_stack_00000370;
    psVar3 = in_stack_00000358;
    in_stack_000007a8 = in_stack_00000440;
    in_stack_000007b0 = in_stack_00000448;
    in_stack_000007b8 = in_stack_000001f0;
    psStack00000000000000d8 = in_stack_00000420;
    in_stack_000000e0 = in_stack_00000430;
    in_stack_000000e8 = in_stack_00000428;
    psStack0000000000000100 = in_stack_00000410;
    psStack0000000000000108 = in_stack_00000418;
    psStack00000000000001a0 = in_stack_00000360;
    psStack00000000000001a8 = in_stack_00000368;
    psStack00000000000001d0 = in_stack_00000348;
    psStack00000000000001d8 = in_stack_00000350;
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
    break;
  case 0x18:
    func_0x004cda04(&stack0x000001f0,unaff_x24 + unaff_x20 + 0x20,&UNK_009e5ca0);
    func_0x004cdf58(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x38,&UNK_009e5ca0);
    psVar8 = (segment_command *)&MACH_HEADER.flags;
    psVar10 = in_stack_000001f0;
    psVar12 = (segment_command *)
              ((ulong)psVar12 & 0xffffffffffff0000 | (ulong)*(byte *)(unaff_x24 + unaff_x20 + 0x50)
              | (ulong)*(byte *)(unaff_x24 + unaff_x20 + 0x51) << 8);
    psVar3 = in_stack_00000670;
    psStack00000000000001a0 = in_stack_00000678;
    psStack00000000000001a8 = in_stack_00000680;
    psStack00000000000001d0 = in_stack_000001f8;
    psStack00000000000001d8 = in_stack_00000200;
    goto LAB_004c1068;
  case 0x19:
    func_0x004cda04(auStack_7ffffffe + 0x8000033e,unaff_x24 + unaff_x20 + 0xa0,&UNK_009e5d18);
    func_0x004bd098(&stack0x000001f0,unaff_x24 + unaff_x20 + 0x20);
    func_0x004bd098(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x60);
    psVar8 = (segment_command *)((long)&MACH_HEADER.flags + 1);
    psVar10 = in_stack_000001f0;
    psVar11 = in_stack_00000228;
    psVar12 = in_stack_00000220;
    psVar3 = in_stack_00000208;
    in_stack_00000438 = in_stack_00000698;
    in_stack_000007a8 = in_stack_000006a0;
    in_stack_000007b0 = in_stack_000006a8;
    in_stack_000007b8 = in_stack_00000340;
    psStack00000000000000d8 = in_stack_00000680;
    in_stack_000000e0 = in_stack_00000690;
    in_stack_000000e8 = in_stack_00000688;
    psStack0000000000000100 = in_stack_00000670;
    psStack0000000000000108 = in_stack_00000678;
    psStack00000000000001a0 = in_stack_00000210;
    psStack00000000000001a8 = in_stack_00000218;
    psStack00000000000001d0 = in_stack_000001f8;
    psStack00000000000001d8 = in_stack_00000200;
    in_stack_00000420 = in_stack_000006a8;
    in_stack_00000428 = in_stack_00000340;
    in_stack_00000430 = in_stack_00000348;
    psVar17 = in_stack_00000350;
    in_stack_000007c0 = in_stack_00000348;
    in_stack_000007c8 = in_stack_00000350;
    break;
  case 0x1a:
    func_0x004cdb1c(&stack0x000001f0,unaff_x24 + unaff_x20 + 0x20,&UNK_009e5cb8);
    func_0x004cdf58(auStack_7ffffffe + 0x8000066e,unaff_x24 + unaff_x20 + 0x38,&UNK_009e5cb8);
    psVar12 = *(segment_command **)(unaff_x24 + unaff_x20 + 0x50);
    lVar14 = *(long *)psVar12;
    *(long *)psVar12 = lVar14 + 1;
    if (lVar14 < 0) {
      func_0x007a05dc();
      goto LAB_004c5940;
    }
    psVar8 = (segment_command *)((long)&MACH_HEADER.flags + 2);
    psVar10 = in_stack_000001f0;
    psVar3 = in_stack_00000670;
    psStack00000000000001a0 = in_stack_00000678;
    psStack00000000000001a8 = in_stack_00000680;
    psStack00000000000001d0 = in_stack_000001f8;
    psStack00000000000001d8 = in_stack_00000200;
    goto LAB_004c1068;
  case 0x1b:
    func_0x004cdf58(auStack_7ffffffe + 0x8000066e,lVar14,&UNK_009e5c40);
    psVar8 = (segment_command *)((long)&MACH_HEADER.flags + 3);
    in_stack_000004f0 = in_stack_00000670;
    in_stack_000004f8 = in_stack_00000678;
    in_stack_00000500 = in_stack_00000680;
    goto LAB_004c1068;
  case 0x1c:
    psVar8 = (segment_command *)&MACH_HEADER.reserved;
    goto LAB_004c1068;
  case 0x1d:
    psVar8 = (segment_command *)((long)&MACH_HEADER.reserved + 1);
    goto LAB_004c1068;
  case 0x1e:
    func_0x004cdb1c(auStack_7ffffffe + 0x8000066e,lVar14,&UNK_009e5c58);
    psVar8 = (segment_command *)((long)&MACH_HEADER.reserved + 2);
    in_stack_000004f0 = in_stack_00000670;
    in_stack_000004f8 = in_stack_00000678;
    in_stack_00000500 = in_stack_00000680;
    goto LAB_004c1068;
  case 0x1f:
    goto code_r0x004c18e8;
  case 0x20:
    func_0x0045cd08(auStack_7ffffffe + 0x8000066e,lVar14);
    psVar8 = &segment_command_00000020;
    in_stack_000004f0 = in_stack_00000670;
    in_stack_000004f8 = in_stack_00000678;
    in_stack_00000500 = in_stack_00000680;
    goto LAB_004c1068;
  }
  in_stack_000007a0 = in_stack_00000438;
  goto LAB_004c1068;
code_r0x004c18e8:
  unaff_x22 = unaff_x24 + unaff_x20;
  in_stack_000000e8 = *(segment_command **)(unaff_x22 + 0x78);
  lVar14 = *(long *)in_stack_000000e8;
  *(long *)in_stack_000000e8 = lVar14 + 1;
  if (lVar14 < 0) {
    func_0x007a05dc();
LAB_004c5940:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4c5944);
    (*pcVar2)();
  }
  in_stack_000000e0 = *(segment_command **)(unaff_x22 + 0x80);
  unaff_x19 = (undefined8 *)(auStack_7ffffffe + 0x8000066e);
  func_0x004cdf58(&stack0x000001f0,unaff_x22 + 0x60,&UNK_009e5d00);
  param_1 = *(long *)(unaff_x22 + 0x20);
  goto code_r0x004c1924;
}

