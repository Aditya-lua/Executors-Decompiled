
void FUN_00265a94(long *param_1)

{
  bool bVar1;
  code *pcVar2;
  int iVar3;
  long *plVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong in_x11;
  long unaff_x19;
  ulong uVar7;
  undefined8 *puVar8;
  ulong unaff_x23;
  long *plVar9;
  ulong unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  ulong uVar14;
  undefined8 uVar15;
  ulong uVar16;
  undefined8 in_stack_00000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  ulong *in_stack_00000070;
  ulong in_stack_00000080;
  ulong in_stack_00000088;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  long in_stack_000000b0;
  ulong in_stack_000000c0;
  ulong in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  undefined8 uStack0000000000000150;
  ulong in_stack_00000158;
  ulong in_stack_00000160;
  ulong in_stack_00000168;
  ulong in_stack_00000170;
  ulong in_stack_00000178;
  ulong in_stack_00000180;
  ulong in_stack_00000188;
  ulong in_stack_000001c8;
  ulong in_stack_000001d0;
  ulong in_stack_000001d8;
  ulong in_stack_000001e0;
  ulong in_stack_00000750;
  ulong in_stack_00000758;
  ulong in_stack_00000760;
  ulong in_stack_00000768;
  ulong in_stack_00000770;
  ulong in_stack_00000778;
  ulong in_stack_00000780;
  ulong in_stack_000007a0;
  ulong in_stack_000007a8;
  ulong in_stack_000007b0;
  ulong in_stack_000007b8;
  ulong in_stack_000007c0;
  ulong in_stack_000007c8;
  ulong in_stack_00000810;
  ulong in_stack_00000818;
  ulong in_stack_00000820;
  ulong in_stack_00000828;
  ulong in_stack_00000830;
  ulong in_stack_00000838;
  ulong in_stack_00000840;
  ulong in_stack_00000848;
  ulong in_stack_00000850;
  ulong in_stack_00000858;
  ulong in_stack_00000860;
  ulong in_stack_00000868;
  ulong in_stack_00000870;
  ulong in_stack_00000878;
  ulong in_stack_00000880;
  ulong in_stack_00000888;
  ulong in_stack_00000890;
  ulong in_stack_00000898;
  ulong in_stack_000008a0;
  ulong in_stack_000008b0;
  ulong in_stack_000008b8;
  ulong in_stack_000008c0;
  ulong in_stack_000008c8;
  ulong in_stack_000008d0;
  ulong in_stack_000008d8;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x00265a94:
  iVar3 = _memcmp(in_x11,param_1[0xb]);
  if (iVar3 == 0) {
    if ((unaff_x23 != 0) && (*(long *)(in_stack_00000048 + unaff_x23 * 0xf8) == -0x7fffffffffffffff)
       ) {
LAB_00265f7c:
      func_0x007a23bc(&UNK_009cb2e8);
code_r0x00265fd8:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x265fdc);
      (*pcVar2)();
    }
    plVar4 = *(long **)(in_stack_000000d0 + 0x5d0);
    uVar6 = unaff_x23;
    do {
      while (uVar6 == 0) {
        uVar7 = uVar6;
        plVar9 = plVar4;
        if (unaff_x25 == plVar4[0x12]) goto LAB_00265be8;
LAB_00265b9c:
        bVar1 = uVar6 == 0;
        uVar6 = uVar7;
        if (bVar1) goto LAB_00265c24;
      }
      uVar7 = uVar6 - 1;
      plVar9 = (long *)(in_stack_000000d0 + uVar7 * 0xf8);
      if (*plVar9 == -0x7fffffffffffffff) goto LAB_00265f7c;
      if (unaff_x25 != plVar9[0x12]) goto LAB_00265b9c;
LAB_00265be8:
      iVar3 = _memcmp(in_stack_000000c8,plVar9[0x11],unaff_x25);
      if ((iVar3 != 0) || (in_stack_000000c0 != plVar9[0x10])) goto LAB_00265b9c;
      iVar3 = _memcmp(in_x11,plVar9[0xf]);
    } while ((uVar6 != 0) && (uVar6 = uVar7, iVar3 != 0));
    if (iVar3 != 0) {
LAB_00265c24:
      if (*(long *)(in_stack_000000d8 + 8) == 0) {
        uVar7 = 1;
        uVar14 = in_stack_00000030;
        uVar6 = in_stack_00000038;
        goto LAB_00265ab0;
      }
      *(long *)(in_stack_000000d8 + 8) = *(long *)(in_stack_000000d8 + 8) + -1;
      if (5 < unaff_x23) {
        if ((unaff_x27 | 0x8000000000000000) != 0x8000000000000000) {
          func_0x00187bd4(unaff_x28,unaff_x27,1);
        }
        uVar7 = 0;
        uVar6 = 0x8000000000000016;
        goto LAB_00265a74;
      }
      puVar5 = (ulong *)(in_stack_000000d0 + unaff_x23 * 0xf8);
      uVar6 = *puVar5;
      if (-0x7fffffffffffffff < (long)uVar6 && uVar6 != 0) {
        func_0x00187bd4(puVar5[1],uVar6,1);
      }
      puVar5[3] = in_stack_000008b8;
      puVar5[2] = in_stack_000008b0;
      puVar5[5] = in_stack_000008c8;
      puVar5[4] = in_stack_000008c0;
      puVar5[7] = in_stack_000008d8;
      puVar5[6] = in_stack_000008d0;
      puVar5[9] = in_stack_00000878;
      puVar5[8] = in_stack_00000870;
      puVar5[0xb] = in_stack_00000888;
      puVar5[10] = in_stack_00000880;
      puVar5[0xd] = in_stack_00000898;
      puVar5[0xc] = in_stack_00000890;
      puVar5[0x1e] = in_stack_00000868;
      puVar5[0x1d] = in_stack_00000860;
      puVar5[0x1c] = in_stack_00000858;
      puVar5[0x1b] = in_stack_00000850;
      puVar5[0x1a] = in_stack_00000848;
      puVar5[0x19] = in_stack_00000840;
      puVar5[0x18] = in_stack_00000838;
      puVar5[0x17] = in_stack_00000830;
      puVar5[0x16] = in_stack_00000828;
      puVar5[0x15] = in_stack_00000820;
      *puVar5 = unaff_x27;
      puVar5[1] = unaff_x28;
      puVar5[0xe] = in_stack_000008a0;
      puVar5[0xf] = in_x11;
      puVar5[0x10] = in_stack_000000c0;
      puVar5[0x11] = in_stack_000000c8;
      puVar5[0x12] = unaff_x25;
      puVar5[0x14] = in_stack_00000818;
      puVar5[0x13] = in_stack_00000810;
      *(long *)(in_stack_000000d0 + 0x5d8) = *(long *)(in_stack_000000d0 + 0x5d8) + 1;
      func_0x00264fb8(&uStack0000000000000150,in_stack_000000a0,in_stack_000000d0,in_stack_000000a8,
                      in_stack_00000058,in_stack_00000050,in_stack_00000028,in_stack_000000d8);
      if (uStack0000000000000150 != 2) {
        func_0x00266610(in_stack_000000d0);
      }
      uVar7 = uStack0000000000000150;
      uVar14 = uStack0000000000000150;
      uVar6 = in_stack_00000158;
      in_stack_000007a0 = in_stack_00000160;
      in_stack_000007a8 = in_stack_00000168;
      in_stack_000007b0 = in_stack_00000170;
      in_stack_000007b8 = in_stack_00000178;
      in_stack_000007c0 = in_stack_00000180;
      in_stack_000007c8 = in_stack_00000188;
      if (uStack0000000000000150 != 2) goto LAB_00265ae8;
      *in_stack_00000070 = 2;
      in_stack_00000070[1] = in_stack_00000158;
code_r0x00265e1c:
      if (-0x7fffffffffffffd5 < (long)in_stack_00000750) {
        if ((((in_stack_00000768 & 1) == 0) && (in_stack_00000770 != 0x8000000000000000)) &&
           (in_stack_00000770 != 0)) {
          func_0x00187bd4(in_stack_00000778,in_stack_00000770,1);
        }
        if (in_stack_00000760 != 0) {
          puVar8 = (undefined8 *)(in_stack_00000758 + 8);
          do {
            if (puVar8[-1] != 0) {
              func_0x00187bd4(*puVar8,puVar8[-1],1);
            }
            puVar8 = puVar8 + 3;
            in_stack_00000760 = in_stack_00000760 - 1;
          } while (in_stack_00000760 != 0);
        }
        if (in_stack_00000750 != 0) {
          func_0x00187bd4(in_stack_00000758,in_stack_00000750 * 0x18,8);
        }
      }
      return;
    }
  }
LAB_00265aa8:
  uVar7 = 0;
  uVar14 = in_stack_00000080;
  uVar6 = in_stack_00000088;
LAB_00265ab0:
  if ((unaff_x27 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(unaff_x28,unaff_x27,1);
  }
LAB_00265ae8:
  do {
    if ((uVar7 & 1) != 0) {
      in_stack_00000070[1] = uVar6;
      *in_stack_00000070 = uVar14;
      in_stack_00000070[3] = in_stack_000007a8;
      in_stack_00000070[2] = in_stack_000007a0;
      in_stack_00000070[5] = in_stack_000007b8;
      in_stack_00000070[4] = in_stack_000007b0;
      in_stack_00000070[7] = in_stack_000007c8;
      in_stack_00000070[6] = in_stack_000007c0;
      goto code_r0x00265e1c;
    }
    uStack0000000000000150 = in_stack_00000750;
    in_stack_00000158 = in_stack_00000758;
    in_stack_00000160 = in_stack_00000760;
    in_stack_00000168 = in_stack_00000768;
    in_stack_00000170 = in_stack_00000770;
    in_stack_00000178 = in_stack_00000778;
    in_stack_00000180 = in_stack_00000780;
    func_0x00269fac(unaff_x29 + -0xe0,&uStack0000000000000150,auStack_7ffffffe + 0x800007ce);
    unaff_x19 = unaff_x19 + 0x18;
    in_stack_00000758 = *(ulong *)(unaff_x29 + -0xd8);
    in_stack_00000750 = *(ulong *)(unaff_x29 + -0xe0);
    in_stack_00000768 = *(ulong *)(unaff_x29 + -200);
    in_stack_00000760 = *(ulong *)(unaff_x29 + -0xd0);
    in_stack_00000778 = *(ulong *)(unaff_x29 + -0xb8);
    in_stack_00000770 = *(ulong *)(unaff_x29 + -0xc0);
    in_stack_00000780 = *(ulong *)(unaff_x29 + -0xb0);
    if (unaff_x19 == in_stack_000000b0) {
      puVar5 = (ulong *)((ulong)(auStack_7ffffffe + 0x8000074e) | 8);
      if (in_stack_00000750 + 0x7fffffffffffffec < 4) {
        uVar6 = *(ulong *)(&UNK_0082b440 + (in_stack_00000750 + 0x7fffffffffffffec) * 8);
      }
      else {
        uVar6 = 0;
      }
      uVar7 = *puVar5;
      uVar16 = puVar5[3];
      uVar14 = puVar5[2];
      in_stack_00000070[3] = puVar5[1];
      in_stack_00000070[2] = uVar7;
      in_stack_00000070[5] = uVar16;
      in_stack_00000070[4] = uVar14;
      uVar7 = puVar5[4];
      in_stack_00000070[7] = puVar5[5];
      in_stack_00000070[6] = uVar7;
      *in_stack_00000070 = uVar6;
      in_stack_00000070[1] = in_stack_00000750;
      return;
    }
    *(undefined1 *)(unaff_x29 + -0x98) = 2;
    *(undefined8 *)(unaff_x29 + -0xa0) = 0x800000000000001c;
    func_0x0025d2bc(unaff_x29 + -0xe0,auStack_7ffffffe + 0x800008de,unaff_x29 + -0xa0);
    uVar6 = *(ulong *)(unaff_x29 + -0xd8);
    uVar10 = *(undefined8 *)(unaff_x29 + -0xd0);
    uVar15 = *(undefined8 *)(unaff_x29 + -0xb8);
    uVar13 = *(undefined8 *)(unaff_x29 + -0xc0);
    uVar12 = *(undefined8 *)(unaff_x29 + -0xa8);
    uVar11 = *(undefined8 *)(unaff_x29 + -0xb0);
    if (*(long *)(unaff_x29 + -0xe0) == 0) {
      *(undefined8 *)(unaff_x26 + 0x18) = *(undefined8 *)(unaff_x29 + -200);
      *(undefined8 *)(unaff_x26 + 0x10) = uVar10;
      *(undefined8 *)(unaff_x26 + 0x28) = uVar15;
      *(undefined8 *)(unaff_x26 + 0x20) = uVar13;
      *(undefined8 *)(unaff_x26 + 0x38) = uVar12;
      *(undefined8 *)(unaff_x26 + 0x30) = uVar11;
      in_stack_000008b0 = *(ulong *)(unaff_x26 + 0x10);
      in_stack_000008b8 = *(ulong *)(unaff_x26 + 0x18);
      in_stack_000008c0 = *(ulong *)(unaff_x26 + 0x20);
      in_stack_000008c8 = *(ulong *)(unaff_x26 + 0x28);
      in_stack_000008d0 = *(ulong *)(unaff_x26 + 0x30);
      in_stack_000008d8 = *(ulong *)(unaff_x26 + 0x38);
    }
    else {
      *(undefined8 *)(unaff_x29 + -0xd8) = *(undefined8 *)(unaff_x29 + -200);
      *(undefined8 *)(unaff_x29 + -0xe0) = uVar10;
      *(undefined8 *)(unaff_x29 + -200) = uVar15;
      *(undefined8 *)(unaff_x29 + -0xd0) = uVar13;
      *(undefined8 *)(unaff_x29 + -0xb8) = uVar12;
      *(undefined8 *)(unaff_x29 + -0xc0) = uVar11;
      *(undefined1 *)(unaff_x29 + -0x98) = 4;
      *(undefined8 *)(unaff_x29 + -0xa0) = 0x800000000000001c;
      *(undefined1 **)(unaff_x29 + -0xb0) = auStack_7ffffffe + 0x800008de;
      func_0x0025fc34(&uStack0000000000000150,auStack_7ffffffe + 0x80000736,unaff_x29 + -0xa0,
                      unaff_x29 + -0xe0);
      in_stack_000008b8 = *(ulong *)(unaff_x26 + 0x18);
      in_stack_000008b0 = *(ulong *)(unaff_x26 + 0x10);
      in_stack_000008c8 = *(ulong *)(unaff_x26 + 0x28);
      in_stack_000008c0 = *(ulong *)(unaff_x26 + 0x20);
      in_stack_000008d8 = *(ulong *)(unaff_x26 + 0x38);
      in_stack_000008d0 = *(ulong *)(unaff_x26 + 0x30);
      uVar6 = in_stack_00000158;
      if (uStack0000000000000150 != 0x8000000000000001) break;
    }
    in_stack_000007c8 = in_stack_000008d8;
    in_stack_000007c0 = in_stack_000008d0;
    in_stack_000007b8 = in_stack_000008c8;
    in_stack_000007b0 = in_stack_000008c0;
    in_stack_000007a8 = in_stack_000008b8;
    in_stack_000007a0 = in_stack_000008b0;
    if (uVar6 + 0x7fffffffffffffec < 4) {
      uVar7 = *(ulong *)(&UNK_0082b440 + (uVar6 + 0x7fffffffffffffec) * 8);
    }
    else {
      uVar7 = 0;
    }
LAB_00265a74:
    uVar14 = uVar7;
  } while( true );
  in_stack_00000878 = *(ulong *)(unaff_x26 + 0x48);
  in_stack_00000870 = *(ulong *)(unaff_x26 + 0x40);
  in_stack_00000888 = *(ulong *)(unaff_x26 + 0x58);
  in_stack_00000880 = *(ulong *)(unaff_x26 + 0x50);
  in_stack_00000898 = *(ulong *)(unaff_x26 + 0x68);
  in_stack_00000890 = *(ulong *)(unaff_x26 + 0x60);
  in_stack_000008a0 = *(ulong *)(unaff_x26 + 0x70);
  in_stack_000000c0 = in_stack_000001d0;
  in_stack_000000c8 = in_stack_000001d8;
  in_stack_00000838 = *(ulong *)(unaff_x26 + 0xc0);
  in_stack_00000830 = *(ulong *)(unaff_x26 + 0xb8);
  in_stack_00000848 = *(ulong *)(unaff_x26 + 0xd0);
  in_stack_00000840 = *(ulong *)(unaff_x26 + 200);
  in_stack_00000858 = *(ulong *)(unaff_x26 + 0xe0);
  in_stack_00000850 = *(ulong *)(unaff_x26 + 0xd8);
  in_stack_00000868 = *(ulong *)(unaff_x26 + 0xf0);
  in_stack_00000860 = *(ulong *)(unaff_x26 + 0xe8);
  in_stack_00000818 = *(ulong *)(unaff_x26 + 0xa0);
  in_stack_00000810 = *(ulong *)(unaff_x26 + 0x98);
  in_stack_00000828 = *(ulong *)(unaff_x26 + 0xb0);
  in_stack_00000820 = *(ulong *)(unaff_x26 + 0xa8);
  unaff_x23 = *(ulong *)(in_stack_000000d0 + 0x5d8);
  if (unaff_x23 == 0) {
    param_1 = *(long **)(in_stack_000000d0 + 0x5d0);
    uVar6 = param_1[0xc];
  }
  else {
    if (6 < unaff_x23) {
      func_0x007a2570(unaff_x23 - 1,6,&UNK_009cb2d0);
      goto code_r0x00265fd8;
    }
    param_1 = (long *)(in_stack_000000d0 + (unaff_x23 - 1) * 0xf8);
    if (*param_1 == -0x7fffffffffffffff) goto LAB_00265f7c;
    uVar6 = param_1[0xc];
  }
  in_x11 = in_stack_000001c8;
  unaff_x25 = in_stack_000001e0;
  unaff_x27 = uStack0000000000000150;
  unaff_x28 = in_stack_00000158;
  if (in_stack_000001d0 == uVar6) goto code_r0x00265a94;
  goto LAB_00265aa8;
}

