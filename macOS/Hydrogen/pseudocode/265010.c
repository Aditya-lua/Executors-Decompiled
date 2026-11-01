
/* WARNING: Removing unreachable block (ram,0x002655b8) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00265010(long param_1)

{
  bool bVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  char cVar4;
  ulong uVar5;
  undefined1 uVar6;
  undefined7 uVar7;
  undefined1 uVar8;
  undefined7 uVar9;
  undefined1 uVar10;
  undefined7 uVar11;
  undefined1 uVar12;
  undefined7 uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  code *pcVar28;
  int iVar29;
  long lVar30;
  long lVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  undefined8 *puVar35;
  long *plVar36;
  long *plVar37;
  ulong uVar38;
  ulong uVar39;
  ulong uVar40;
  ulong *puVar41;
  long in_x10;
  long in_x11;
  long unaff_x20;
  ulong uVar42;
  ulong uVar43;
  ulong uVar44;
  long lVar45;
  ulong uVar46;
  undefined8 *puVar47;
  ulong uVar48;
  long *plVar49;
  long lVar50;
  long lVar51;
  ulong uVar52;
  long unaff_x29;
  undefined8 uVar53;
  ulong uVar54;
  ulong uVar55;
  ulong uVar56;
  ulong uVar57;
  undefined8 uVar58;
  ulong uVar59;
  ulong uVar60;
  undefined8 uVar61;
  ulong uVar62;
  long in_stack_00000050;
  long in_stack_00000058;
  ulong *in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_000000a0;
  undefined8 in_stack_000000a8;
  ulong uStack00000000000000c8;
  ulong in_stack_000000d0;
  undefined8 uStack0000000000000110;
  ulong in_stack_00000118;
  long *in_stack_00000120;
  ulong in_stack_00000128;
  ulong in_stack_00000130;
  ulong in_stack_00000138;
  ulong in_stack_00000140;
  ulong in_stack_00000148;
  undefined8 uStack0000000000000150;
  undefined1 uStack0000000000000158;
  undefined7 uStack0000000000000159;
  undefined1 uStack0000000000000160;
  undefined7 uStack0000000000000161;
  undefined1 uStack0000000000000168;
  undefined7 uStack0000000000000169;
  undefined1 uStack0000000000000170;
  undefined7 uStack0000000000000171;
  undefined1 uStack0000000000000178;
  undefined7 uStack0000000000000179;
  ulong in_stack_00000180;
  ulong in_stack_00000188;
  ulong in_stack_00000190;
  ulong in_stack_00000198;
  ulong in_stack_000001a0;
  ulong in_stack_000001a8;
  ulong in_stack_000001b0;
  ulong in_stack_000001b8;
  ulong in_stack_000001c0;
  ulong in_stack_000001c8;
  ulong in_stack_000001d0;
  ulong in_stack_000001d8;
  ulong in_stack_000001e0;
  ulong in_stack_000001e8;
  ulong in_stack_000001f0;
  ulong in_stack_000001f8;
  ulong in_stack_00000200;
  ulong in_stack_00000208;
  ulong in_stack_00000210;
  ulong in_stack_00000218;
  ulong in_stack_00000220;
  ulong in_stack_00000228;
  ulong in_stack_00000230;
  ulong in_stack_00000238;
  ulong in_stack_00000240;
  long *in_stack_00000798;
  ulong in_stack_000007a0;
  ulong in_stack_000007a8;
  ulong in_stack_000007b0;
  ulong in_stack_000007b8;
  ulong in_stack_000007c0;
  ulong in_stack_000007c8;
  long *in_stack_000007d8;
  ulong in_stack_000007e0;
  ulong in_stack_000007e8;
  ulong in_stack_000007f0;
  ulong in_stack_000007f8;
  ulong in_stack_00000800;
  undefined1 uVar63;
  undefined7 uVar64;
  ulong in_stack_00000928;
  ulong in_stack_00000930;
  ulong in_stack_00000938;
  ulong in_stack_00000940;
  ulong in_stack_00000948;
  ulong in_stack_00000950;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (*(long *)(in_x10 + param_1) == -0x7fffffffffffffff) {
    func_0x007a23bc(&UNK_009cb2e8);
LAB_00265f7c:
    func_0x007a23bc(&UNK_009cb2e8);
code_r0x00265fd8:
                    /* WARNING: Does not return */
    pcVar28 = (code *)SoftwareBreakpoint(1,0x265fdc);
    (*pcVar28)();
  }
  lVar31 = in_x10 + in_x11 * 0xf8;
  *(undefined8 *)(unaff_x29 + -0xa0) = in_stack_000000a8;
  uStack0000000000000110 = in_stack_00000078;
  uStack0000000000000158 = SUB81(in_stack_00000798,0);
  uVar63 = uStack0000000000000158;
  uStack0000000000000159 = (undefined7)((ulong)in_stack_00000798 >> 8);
  uVar64 = uStack0000000000000159;
  uStack0000000000000150 = 0x8000000000000000;
  uStack0000000000000168 = (undefined1)in_stack_000007a8;
  uVar8 = uStack0000000000000168;
  uStack0000000000000169 = (undefined7)(in_stack_000007a8 >> 8);
  uVar9 = uStack0000000000000169;
  uStack0000000000000160 = (undefined1)in_stack_000007a0;
  uVar6 = uStack0000000000000160;
  uStack0000000000000161 = (undefined7)(in_stack_000007a0 >> 8);
  uVar7 = uStack0000000000000161;
  uStack0000000000000178 = (undefined1)in_stack_000007b8;
  uVar12 = uStack0000000000000178;
  uStack0000000000000179 = (undefined7)(in_stack_000007b8 >> 8);
  uVar13 = uStack0000000000000179;
  uStack0000000000000170 = (undefined1)in_stack_000007b0;
  uVar10 = uStack0000000000000170;
  uStack0000000000000171 = (undefined7)(in_stack_000007b0 >> 8);
  uVar11 = uStack0000000000000171;
  func_0x0025d5f0(unaff_x29 + -0xe0,lVar31 + -0x90,&uStack0000000000000150,unaff_x29 + -0xa0);
  uVar32 = *(ulong *)(unaff_x29 + -0xe0);
  if (uVar32 != 0x800000000000002c) {
joined_r0x00265740:
    if (uVar32 + 0x7fffffffffffffec < 4) {
      uVar40 = *(ulong *)(&UNK_0082b440 + (uVar32 + 0x7fffffffffffffec) * 8);
    }
    else {
      uVar40 = 0;
    }
    *in_stack_00000070 = uVar40;
    in_stack_00000070[1] = uVar32;
    in_stack_00000070[3] = in_stack_00000930;
    in_stack_00000070[2] = in_stack_00000928;
    in_stack_00000070[5] = in_stack_00000940;
    in_stack_00000070[4] = in_stack_00000938;
    in_stack_00000070[7] = in_stack_00000950;
    in_stack_00000070[6] = in_stack_00000948;
    return;
  }
  uStack0000000000000150 = 0x8000000000000000;
  uStack0000000000000158 = uVar63;
  uStack0000000000000159 = uVar64;
  uStack0000000000000160 = uVar6;
  uStack0000000000000161 = uVar7;
  uStack0000000000000168 = uVar8;
  uStack0000000000000169 = uVar9;
  uStack0000000000000170 = uVar10;
  uStack0000000000000171 = uVar11;
  uStack0000000000000178 = uVar12;
  uStack0000000000000179 = uVar13;
  in_stack_00000180 = in_stack_000007c0;
  func_0x0026bb08(unaff_x29 + -0xe0,*(undefined8 *)(lVar31 + -0x60),*(undefined8 *)(lVar31 + -0x58),
                  &uStack0000000000000150,auStack_7ffffffe + 0x800007ce,&uStack0000000000000110);
  uVar32 = *(ulong *)(unaff_x29 + -0xe0);
  if (uVar32 != 0x800000000000002c) goto joined_r0x00265740;
  func_0x0026b8d0(&uStack0000000000000150,*(undefined8 *)(lVar31 + -0x40),
                  *(undefined8 *)(lVar31 + -0x38),auStack_7ffffffe + 0x8000078e,in_stack_000000a0);
  uVar40 = _UNK_0082b328;
  uVar32 = _UNK_0082b320;
  if (uStack0000000000000150 != 0x800000000000002c) {
    in_stack_00000930 = CONCAT71(uStack0000000000000161,uStack0000000000000160);
    in_stack_00000928 = CONCAT71(uStack0000000000000159,uStack0000000000000158);
    in_stack_00000940 = CONCAT71(uStack0000000000000171,uStack0000000000000170);
    in_stack_00000938 = CONCAT71(uStack0000000000000169,uStack0000000000000168);
    in_stack_00000948 = CONCAT71(uStack0000000000000179,uStack0000000000000178);
    uVar32 = uStack0000000000000150;
    in_stack_00000950 = in_stack_00000180;
    goto joined_r0x00265740;
  }
  uVar60 = *(ulong *)(in_stack_000000a0 + 0x40);
  uVar33 = 0x800000000000001d;
  if (*(long *)(in_stack_000000a0 + 0x48) != 0) {
    uVar34 = uVar60 + *(long *)(in_stack_000000a0 + 0x48) * 0x48;
    puVar35 = (undefined8 *)(unaff_x29 - 0xe0U | 8);
    uVar2 = *(undefined8 *)(in_stack_000000a0 + 0x30);
    uVar3 = *(undefined8 *)(in_stack_000000a0 + 0x38);
    cVar4 = *(char *)(in_stack_000000a0 + 0x2a);
    uVar33 = 0x8000000000000000;
    uVar55 = 0x800000000000001d;
LAB_00265188:
    lVar31 = *(long *)(uVar60 + 8);
    lVar30 = *(long *)(uVar60 + 0x10);
    uStack00000000000000c8 = *(ulong *)(in_stack_000000d0 + 0x5d8);
    if (uStack00000000000000c8 == 0) {
      plVar36 = *(long **)(in_stack_000000d0 + 0x5d0);
      if (plVar36[0xc] != lVar30) goto LAB_002651fc;
LAB_002651e8:
      iVar29 = _memcmp(plVar36[0xb],lVar31,lVar30);
      if (iVar29 != 0) goto LAB_002651fc;
      if ((uStack00000000000000c8 != 0) &&
         (*(long *)((in_stack_000000d0 - 0xf8) + uStack00000000000000c8 * 0xf8) ==
          -0x7fffffffffffffff)) goto LAB_00265f60;
      lVar45 = *(long *)(uVar60 + 0x20);
      lVar51 = *(long *)(uVar60 + 0x28);
      uVar46 = uStack00000000000000c8;
      uVar33 = in_stack_000000d0;
      if (cVar4 == '\x02') {
        do {
          in_stack_000007a0 = uVar46;
          if (in_stack_000007a0 == 0) {
            in_stack_00000798 = *(long **)(in_stack_000000d0 + 0x5d0);
            uVar46 = in_stack_000007a0;
          }
          else {
            uVar46 = in_stack_000007a0 - 1;
            if (6 < in_stack_000007a0) goto LAB_00265fa0;
            in_stack_00000798 = (long *)(in_stack_000000d0 + uVar46 * 0xf8);
            if (*in_stack_00000798 == -0x7fffffffffffffff) goto LAB_00265f60;
          }
          func_0x0026ea68(&uStack0000000000000150,uVar2,uVar3,lVar45,lVar51,in_stack_00000798 + 5,
                          unaff_x20);
          if (uStack0000000000000150 != 0x800000000000002c) goto code_r0x00265624;
          lVar45 = in_stack_00000798[0x11];
          lVar51 = in_stack_00000798[0x12];
        } while (in_stack_000007a0 != 0);
      }
      else {
        lVar50 = 0;
        uVar56 = in_stack_000000d0;
        do {
          in_stack_000007a0 = uVar46;
          if (in_stack_000007a0 == 0) {
            in_stack_00000798 = *(long **)(in_stack_000000d0 + 0x5d0);
            uVar46 = in_stack_000007a0;
          }
          else {
            uVar46 = in_stack_000007a0 - 1;
            if (6 < in_stack_000007a0) goto LAB_00265fa0;
            in_stack_00000798 = (long *)(in_stack_000000d0 + uVar46 * 0xf8);
            if (*in_stack_00000798 == -0x7fffffffffffffff) goto LAB_00265f60;
          }
          func_0x0026ea68(&uStack0000000000000150,uVar2,uVar3,lVar45,lVar51,in_stack_00000798 + 5,
                          unaff_x20);
          if (uStack0000000000000150 != 0x800000000000002c) goto code_r0x00265624;
          func_0x0026b110(&uStack0000000000000150,in_stack_000000a0 + 0x18,
                          auStack_7ffffffe + 0x8000078e,lVar31,lVar30,lVar45,lVar51,lVar50,uVar56);
          if (uStack0000000000000150 != 0x800000000000002c) {
            uVar46 = 0;
            uVar58 = CONCAT17(uStack0000000000000168,uStack0000000000000161);
            uVar53 = CONCAT17(uStack0000000000000160,uStack0000000000000159);
            uVar61 = CONCAT17(uStack0000000000000170,uStack0000000000000169);
            uVar63 = (undefined1)in_stack_00000180;
            uVar64 = (undefined7)(in_stack_00000180 >> 8);
            if ((0x17 < (uStack0000000000000150 ^ 0x8000000000000000)) ||
               ((1L << ((uStack0000000000000150 ^ 0x8000000000000000) & 0x3f) & 0xb00000U) == 0))
            goto code_r0x002656bc;
            goto code_r0x002656b8;
          }
          lVar45 = in_stack_00000798[0x11];
          lVar51 = in_stack_00000798[0x12];
          lVar31 = in_stack_00000798[0xf];
          lVar30 = in_stack_00000798[0x10];
          lVar50 = in_stack_00000798[0x15];
          uVar56 = in_stack_00000798[0x16];
        } while (in_stack_000007a0 != 0);
      }
      lVar30 = *(long *)(uVar60 + 0x40);
      lVar31 = 0;
      if (*(long *)(uVar60 + 0x30) != -0x7fffffffffffffff) {
        lVar31 = *(long *)(uVar60 + 0x38);
      }
      while( true ) {
        uVar56 = uStack00000000000000c8;
        if (uStack00000000000000c8 == 0) {
          uStack00000000000000c8 = 0;
          plVar36 = *(long **)(in_stack_000000d0 + 0x5d0);
        }
        else {
          uVar46 = uStack00000000000000c8 - 1;
          if (6 < uStack00000000000000c8) goto LAB_00265fa0;
          plVar36 = (long *)(in_stack_000000d0 + uVar46 * 0xf8);
          uStack00000000000000c8 = uVar46;
          if (*plVar36 == -0x7fffffffffffffff) goto LAB_00265f60;
        }
        uStack0000000000000150 = 0x8000000000000000;
        func_0x0026bddc(auStack_7ffffffe + 0x8000078e,lVar31,lVar30,&uStack0000000000000150,
                        auStack_7ffffffe + 0x80000736,unaff_x20);
        if (in_stack_000000d0 != 0x800000000000002c) break;
        lVar31 = plVar36[0x19];
        lVar30 = plVar36[0x1a];
        if (uVar56 == 0) {
          if (in_stack_00000058 != 0) {
            if (6 < uRam8000000000000604) {
              func_0x007a28b0(uRam8000000000000604,6,&UNK_009cb240);
              goto code_r0x00265fd8;
            }
            uStack0000000000000150 = 0x8000000000000002;
            uStack0000000000000158 = 0x2c;
            uStack0000000000000159 = 0x80000000000000;
            uStack0000000000000160 = (undefined1)uRam8000000000000604;
            uStack0000000000000161 = (undefined7)(uRam8000000000000604 >> 8);
            (**(code **)(in_stack_00000050 + 0x28))
                      (auStack_7ffffffe + 0x8000078e,in_stack_00000058,&uStack0000000000000150);
          }
          uStack0000000000000110 = 2;
          in_stack_00000118 = uVar60;
          goto code_r0x00265eb0;
        }
      }
      if (in_stack_000000d0 + 0x7fffffffffffffec < 4) {
        uVar46 = *(ulong *)(&UNK_0082b440 + (in_stack_000000d0 + 0x7fffffffffffffec) * 8);
      }
      else {
        uVar46 = 0;
      }
      *(ulong *)(unaff_x29 + -0xe0) = uVar46;
      *(ulong *)(unaff_x29 + -0xd8) = in_stack_000000d0;
      *(ulong *)(unaff_x29 + -200) = in_stack_000007a0;
      *(long **)(unaff_x29 + -0xd0) = in_stack_00000798;
      *(ulong *)(unaff_x29 + -0xb8) = in_stack_000007b0;
      *(ulong *)(unaff_x29 + -0xc0) = in_stack_000007a8;
      *(ulong *)(unaff_x29 + -0xa8) = in_stack_000007c0;
      *(ulong *)(unaff_x29 + -0xb0) = in_stack_000007b8;
      if ((uVar46 & 1) == 0) goto code_r0x00265210;
      goto code_r0x0026570c;
    }
    uVar46 = uStack00000000000000c8 - 1;
    if (uStack00000000000000c8 < 7) {
      plVar36 = (long *)(in_stack_000000d0 + uVar46 * 0xf8);
      if (*plVar36 != -0x7fffffffffffffff) {
        if (plVar36[0xc] == lVar30) goto LAB_002651e8;
LAB_002651fc:
        *(ulong *)(unaff_x29 + -0xd8) = uVar40;
        *(ulong *)(unaff_x29 + -0xe0) = uVar32;
        uVar46 = 0;
        goto code_r0x00265210;
      }
LAB_00265f60:
      func_0x007a23bc(&UNK_009cb2e8);
    }
    else {
LAB_00265fa0:
      func_0x007a2570(uVar46,6,&UNK_009cb2d0);
    }
    goto code_r0x00265fd8;
  }
  uStack0000000000000110 = 0;
  in_stack_00000120 = in_stack_000007d8;
  in_stack_00000128 = in_stack_000007e0;
  in_stack_00000130 = in_stack_000007e8;
  in_stack_00000138 = in_stack_000007f0;
  in_stack_00000140 = in_stack_000007f8;
  in_stack_00000148 = in_stack_00000800;
code_r0x002657f4:
  in_stack_00000118 = uVar33;
code_r0x00265810:
  uVar33 = _UNK_0082b338;
  uVar60 = _UNK_0082b330;
  uVar40 = _UNK_0082b328;
  uVar32 = _UNK_0082b320;
  if ((uStack0000000000000110 & 1) == 0) {
    uVar55 = in_stack_00000118;
    if (*(long *)(in_stack_000000a0 + 0x58) != 0) {
      lVar31 = *(long *)(in_stack_000000a0 + 0x50);
      lVar30 = lVar31 + *(long *)(in_stack_000000a0 + 0x58) * 0x18;
      if (in_x11 != 0) {
        in_stack_00000078 = in_stack_00000078 + 1;
      }
      plVar36 = in_stack_00000120;
      uVar34 = in_stack_00000128;
      uVar46 = in_stack_00000130;
      uVar56 = in_stack_00000138;
      uVar57 = in_stack_00000140;
      uVar38 = in_stack_00000148;
      do {
        *(undefined1 *)(unaff_x29 + -0x98) = 2;
        *(undefined8 *)(unaff_x29 + -0xa0) = 0x800000000000001c;
        func_0x0025d2bc(unaff_x29 + -0xe0,auStack_7ffffffe + 0x800008de,unaff_x29 + -0xa0);
        uVar52 = *(ulong *)(unaff_x29 + -0xd8);
        uVar42 = *(ulong *)(unaff_x29 + -200);
        uVar54 = *(ulong *)(unaff_x29 + -0xd0);
        uVar62 = *(ulong *)(unaff_x29 + -0xb8);
        uVar59 = *(ulong *)(unaff_x29 + -0xc0);
        if (*(long *)(unaff_x29 + -0xe0) == 0) {
          uStack0000000000000168 = (undefined1)uVar42;
          uStack0000000000000169 = (undefined7)(uVar42 >> 8);
          uStack0000000000000160 = (undefined1)uVar54;
          uStack0000000000000161 = (undefined7)(uVar54 >> 8);
          uStack0000000000000178 = (undefined1)uVar62;
          uStack0000000000000179 = (undefined7)(uVar62 >> 8);
          uStack0000000000000170 = (undefined1)uVar59;
          uStack0000000000000171 = (undefined7)(uVar59 >> 8);
          in_stack_00000180 = *(ulong *)(unaff_x29 + -0xb0);
          in_stack_00000188 = *(ulong *)(unaff_x29 + -0xa8);
code_r0x00265a3c:
          in_stack_000007b8 = uVar62;
          in_stack_000007b0 = uVar59;
          in_stack_000007a8 = uVar42;
          in_stack_000007a0 = uVar54;
          if (uVar52 + 0x7fffffffffffffec < 4) {
            uVar42 = *(ulong *)(&UNK_0082b440 + (uVar52 + 0x7fffffffffffffec) * 8);
          }
          else {
            uVar42 = 0;
          }
          in_stack_000007c0 = in_stack_00000180;
          in_stack_000007c8 = in_stack_00000188;
LAB_00265a74:
          uVar59 = uVar42;
          uVar54 = uVar52;
        }
        else {
          *(ulong *)(unaff_x29 + -0xd8) = uVar42;
          *(ulong *)(unaff_x29 + -0xe0) = uVar54;
          *(ulong *)(unaff_x29 + -200) = uVar62;
          *(ulong *)(unaff_x29 + -0xd0) = uVar59;
          *(ulong *)(unaff_x29 + -0xb8) = *(ulong *)(unaff_x29 + -0xa8);
          *(ulong *)(unaff_x29 + -0xc0) = *(ulong *)(unaff_x29 + -0xb0);
          *(undefined1 *)(unaff_x29 + -0x98) = 4;
          *(undefined8 *)(unaff_x29 + -0xa0) = 0x800000000000001c;
          *(undefined1 **)(unaff_x29 + -0xb0) = auStack_7ffffffe + 0x800008de;
          func_0x0025fc34(&uStack0000000000000150,auStack_7ffffffe + 0x80000736,unaff_x29 + -0xa0,
                          unaff_x29 + -0xe0);
          uVar27 = in_stack_000001e8;
          uVar26 = in_stack_000001e0;
          uVar25 = in_stack_000001d8;
          uVar24 = in_stack_000001d0;
          uVar23 = in_stack_000001c8;
          uVar22 = in_stack_000001c0;
          uVar21 = in_stack_000001b8;
          uVar20 = in_stack_000001b0;
          uVar19 = in_stack_000001a8;
          uVar18 = in_stack_000001a0;
          uVar17 = in_stack_00000198;
          uVar16 = in_stack_00000190;
          uVar15 = in_stack_00000188;
          uVar14 = in_stack_00000180;
          uVar5 = uStack0000000000000150;
          uVar52 = CONCAT71(uStack0000000000000159,uStack0000000000000158);
          uVar42 = CONCAT71(uStack0000000000000169,uStack0000000000000168);
          uVar54 = CONCAT71(uStack0000000000000161,uStack0000000000000160);
          uVar62 = CONCAT71(uStack0000000000000179,uStack0000000000000178);
          uVar59 = CONCAT71(uStack0000000000000171,uStack0000000000000170);
          if (uStack0000000000000150 == 0x8000000000000001) goto code_r0x00265a3c;
          uVar48 = *(ulong *)(in_stack_000000d0 + 0x5d8);
          if (uVar48 == 0) {
            plVar37 = *(long **)(in_stack_000000d0 + 0x5d0);
            if (in_stack_000001d0 != plVar37[0xc]) goto LAB_00265aa8;
FUN_00265a94:
            iVar29 = _memcmp(in_stack_000001c8,plVar37[0xb]);
            if (iVar29 != 0) goto LAB_00265aa8;
            if ((uVar48 == 0) ||
               (*(long *)((in_stack_000000d0 - 0xf8) + uVar48 * 0xf8) != -0x7fffffffffffffff)) {
              plVar37 = *(long **)(in_stack_000000d0 + 0x5d0);
              uVar43 = uVar48;
              do {
                while( true ) {
                  if (uVar43 == 0) {
                    uVar39 = plVar37[0x12];
                    plVar49 = plVar37;
                    uVar44 = uVar43;
                  }
                  else {
                    uVar44 = uVar43 - 1;
                    plVar49 = (long *)(in_stack_000000d0 + uVar44 * 0xf8);
                    if (*plVar49 == -0x7fffffffffffffff) goto LAB_00265f7c;
                    uVar39 = plVar49[0x12];
                  }
                  if (((uVar26 == uVar39) &&
                      (iVar29 = _memcmp(uVar25,plVar49[0x11],uVar26), iVar29 == 0)) &&
                     (uVar24 == plVar49[0x10])) break;
                  bVar1 = uVar43 == 0;
                  uVar43 = uVar44;
                  if (bVar1) goto LAB_00265c24;
                }
                iVar29 = _memcmp(uVar23,plVar49[0xf]);
              } while ((uVar43 != 0) && (uVar43 = uVar44, iVar29 != 0));
              if (iVar29 == 0) goto LAB_00265aa8;
LAB_00265c24:
              if (*(long *)(unaff_x20 + 8) == 0) {
                uVar42 = 1;
                uVar59 = uVar60;
                uVar54 = uVar33;
                goto LAB_00265ab0;
              }
              *(long *)(unaff_x20 + 8) = *(long *)(unaff_x20 + 8) + -1;
              if (uVar48 < 6) {
                puVar41 = (ulong *)(in_stack_000000d0 + uVar48 * 0xf8);
                uVar48 = *puVar41;
                if (-0x7fffffffffffffff < (long)uVar48 && uVar48 != 0) {
                  func_0x00187bd4(puVar41[1],uVar48,1);
                }
                puVar41[3] = uVar42;
                puVar41[2] = uVar54;
                puVar41[5] = uVar62;
                puVar41[4] = uVar59;
                puVar41[7] = uVar15;
                puVar41[6] = uVar14;
                puVar41[9] = uVar17;
                puVar41[8] = uVar16;
                puVar41[0xb] = uVar19;
                puVar41[10] = uVar18;
                puVar41[0xd] = uVar21;
                puVar41[0xc] = uVar20;
                puVar41[0x1e] = in_stack_00000240;
                puVar41[0x1d] = in_stack_00000238;
                puVar41[0x1c] = in_stack_00000230;
                puVar41[0x1b] = in_stack_00000228;
                puVar41[0x1a] = in_stack_00000220;
                puVar41[0x19] = in_stack_00000218;
                puVar41[0x18] = in_stack_00000210;
                puVar41[0x17] = in_stack_00000208;
                puVar41[0x16] = in_stack_00000200;
                puVar41[0x15] = in_stack_000001f8;
                *puVar41 = uVar5;
                puVar41[1] = uVar52;
                puVar41[0xe] = uVar22;
                puVar41[0xf] = uVar23;
                puVar41[0x10] = uVar24;
                puVar41[0x11] = uVar25;
                puVar41[0x12] = uVar26;
                puVar41[0x14] = in_stack_000001f0;
                puVar41[0x13] = uVar27;
                *(long *)(in_stack_000000d0 + 0x5d8) = *(long *)(in_stack_000000d0 + 0x5d8) + 1;
                func_0x00264fb8(&uStack0000000000000150,in_stack_000000a0,in_stack_000000d0,
                                in_stack_000000a8,in_stack_00000058,in_stack_00000050,
                                in_stack_00000078,unaff_x20);
                if (uStack0000000000000150 != 2) {
                  func_0x00266610(in_stack_000000d0);
                }
                uVar54 = CONCAT71(uStack0000000000000159,uStack0000000000000158);
                in_stack_000007a8 = CONCAT71(uStack0000000000000169,uStack0000000000000168);
                in_stack_000007a0 = CONCAT71(uStack0000000000000161,uStack0000000000000160);
                in_stack_000007b8 = CONCAT71(uStack0000000000000179,uStack0000000000000178);
                in_stack_000007b0 = CONCAT71(uStack0000000000000171,uStack0000000000000170);
                uVar42 = uStack0000000000000150;
                uVar59 = uStack0000000000000150;
                in_stack_000007c0 = in_stack_00000180;
                in_stack_000007c8 = in_stack_00000188;
                if (uStack0000000000000150 == 2) {
                  *in_stack_00000070 = 2;
                  in_stack_00000070[1] = uVar54;
                  goto code_r0x00265e1c;
                }
                goto LAB_00265ae8;
              }
              if ((uVar5 | 0x8000000000000000) != 0x8000000000000000) {
                func_0x00187bd4(uVar52,uVar5,1);
              }
              uVar42 = 0;
              uVar52 = 0x8000000000000016;
              goto LAB_00265a74;
            }
            goto LAB_00265f7c;
          }
          if (6 < uVar48) {
            func_0x007a2570(uVar48 - 1,6,&UNK_009cb2d0);
            goto code_r0x00265fd8;
          }
          plVar37 = (long *)(in_stack_000000d0 + (uVar48 - 1) * 0xf8);
          if (*plVar37 == -0x7fffffffffffffff) goto LAB_00265f7c;
          if (in_stack_000001d0 == plVar37[0xc]) goto FUN_00265a94;
LAB_00265aa8:
          uVar42 = 0;
          uVar59 = uVar32;
          uVar54 = uVar40;
LAB_00265ab0:
          if ((uVar5 | 0x8000000000000000) != 0x8000000000000000) {
            func_0x00187bd4(uVar52,uVar5,1);
          }
        }
LAB_00265ae8:
        if ((uVar42 & 1) != 0) {
          in_stack_00000070[1] = uVar54;
          *in_stack_00000070 = uVar59;
          in_stack_00000070[3] = in_stack_000007a8;
          in_stack_00000070[2] = in_stack_000007a0;
          in_stack_00000070[5] = in_stack_000007b8;
          in_stack_00000070[4] = in_stack_000007b0;
          in_stack_00000070[7] = in_stack_000007c8;
          in_stack_00000070[6] = in_stack_000007c0;
code_r0x00265e1c:
          if ((long)uVar55 < -0x7fffffffffffffd4) {
            return;
          }
          if ((((uVar46 & 1) == 0) && (uVar56 != 0x8000000000000000)) && (uVar56 != 0)) {
            func_0x00187bd4(uVar57,uVar56,1);
          }
          if (uVar34 != 0) {
            plVar37 = plVar36 + 1;
            do {
              if (plVar37[-1] != 0) {
                func_0x00187bd4(*plVar37,plVar37[-1],1);
              }
              plVar37 = plVar37 + 3;
              uVar34 = uVar34 - 1;
            } while (uVar34 != 0);
          }
          if (uVar55 == 0) {
            return;
          }
          func_0x00187bd4(plVar36,uVar55 * 0x18,8);
          return;
        }
        uStack0000000000000158 = SUB81(plVar36,0);
        uStack0000000000000159 = (undefined7)((ulong)plVar36 >> 8);
        uStack0000000000000168 = (undefined1)uVar46;
        uStack0000000000000169 = (undefined7)(uVar46 >> 8);
        uStack0000000000000160 = (undefined1)uVar34;
        uStack0000000000000161 = (undefined7)(uVar34 >> 8);
        uStack0000000000000178 = (undefined1)uVar57;
        uStack0000000000000179 = (undefined7)(uVar57 >> 8);
        uStack0000000000000170 = (undefined1)uVar56;
        uStack0000000000000171 = (undefined7)(uVar56 >> 8);
        uStack0000000000000150 = uVar55;
        in_stack_00000180 = uVar38;
        func_0x00269fac(unaff_x29 + -0xe0,&uStack0000000000000150,auStack_7ffffffe + 0x800007ce);
        lVar31 = lVar31 + 0x18;
        plVar36 = *(long **)(unaff_x29 + -0xd8);
        uVar55 = *(ulong *)(unaff_x29 + -0xe0);
        uVar46 = *(ulong *)(unaff_x29 + -200);
        uVar34 = *(ulong *)(unaff_x29 + -0xd0);
        uVar57 = *(ulong *)(unaff_x29 + -0xb8);
        uVar56 = *(ulong *)(unaff_x29 + -0xc0);
        uVar38 = *(ulong *)(unaff_x29 + -0xb0);
      } while (lVar31 != lVar30);
    }
    puVar41 = (ulong *)((ulong)(auStack_7ffffffe + 0x8000074e) | 8);
    if (uVar55 + 0x7fffffffffffffec < 4) {
      uVar32 = *(ulong *)(&UNK_0082b440 + (uVar55 + 0x7fffffffffffffec) * 8);
    }
    else {
      uVar32 = 0;
    }
    uVar40 = *puVar41;
    uVar33 = puVar41[3];
    uVar60 = puVar41[2];
    in_stack_00000070[3] = puVar41[1];
    in_stack_00000070[2] = uVar40;
    in_stack_00000070[5] = uVar33;
    in_stack_00000070[4] = uVar60;
    uVar40 = puVar41[4];
    in_stack_00000070[7] = puVar41[5];
    in_stack_00000070[6] = uVar40;
    *in_stack_00000070 = uVar32;
    in_stack_00000070[1] = uVar55;
  }
  else {
    in_stack_00000070[1] = in_stack_00000118;
    *in_stack_00000070 = uStack0000000000000110;
    in_stack_00000070[3] = in_stack_00000128;
    in_stack_00000070[2] = (ulong)in_stack_00000120;
    in_stack_00000070[5] = in_stack_00000138;
    in_stack_00000070[4] = in_stack_00000130;
    in_stack_00000070[7] = in_stack_00000148;
    in_stack_00000070[6] = in_stack_00000140;
  }
  return;
code_r0x00265624:
  uVar58 = CONCAT17(uStack0000000000000168,uStack0000000000000161);
  uVar53 = CONCAT17(uStack0000000000000160,uStack0000000000000159);
  uVar61 = CONCAT17(uStack0000000000000170,uStack0000000000000169);
  uVar63 = (undefined1)in_stack_00000180;
  uVar64 = (undefined7)(in_stack_00000180 >> 8);
  if ((uStack0000000000000150 ^ 0x8000000000000000) < 0x18 &&
      (1L << ((uStack0000000000000150 ^ 0x8000000000000000) & 0x3f) & 0xb00000U) != 0) {
code_r0x002656b8:
    uVar46 = 1;
  }
  else {
    uVar46 = 0;
  }
code_r0x002656bc:
  *(ulong *)(unaff_x29 + -0xe0) = uVar46;
  *(ulong *)(unaff_x29 + -0xd8) = uStack0000000000000150;
  *(undefined1 *)(unaff_x29 + -0xd0) = uStack0000000000000158;
  *(undefined8 *)(unaff_x29 + -199) = uVar58;
  *(undefined8 *)(unaff_x29 + -0xcf) = uVar53;
  *(ulong *)(unaff_x29 + -0xb7) = CONCAT17(uStack0000000000000178,uStack0000000000000171);
  *(undefined8 *)(unaff_x29 + -0xbf) = uVar61;
  *(ulong *)(unaff_x29 + -0xa8) = CONCAT71(uVar64,uVar63);
  *(ulong *)(unaff_x29 + -0xb0) = CONCAT71(uStack0000000000000179,uStack0000000000000178);
  if ((int)uVar46 == 0) {
code_r0x00265210:
    uVar53 = *puVar35;
    uVar61 = puVar35[3];
    uVar58 = puVar35[2];
    *(undefined8 *)(unaff_x29 + -0x98) = puVar35[1];
    *(undefined8 *)(unaff_x29 + -0xa0) = uVar53;
    *(undefined8 *)(unaff_x29 + -0x88) = uVar61;
    *(undefined8 *)(unaff_x29 + -0x90) = uVar58;
    uVar53 = puVar35[4];
    *(undefined8 *)(unaff_x29 + -0x78) = puVar35[5];
    *(undefined8 *)(unaff_x29 + -0x80) = uVar53;
    *(undefined8 *)(unaff_x29 + -0x70) = puVar35[6];
    uStack0000000000000158 = SUB81(in_stack_000007d8,0);
    uStack0000000000000159 = (undefined7)((ulong)in_stack_000007d8 >> 8);
    uStack0000000000000168 = (undefined1)in_stack_000007e8;
    uStack0000000000000169 = (undefined7)(in_stack_000007e8 >> 8);
    uStack0000000000000160 = (undefined1)in_stack_000007e0;
    uStack0000000000000161 = (undefined7)(in_stack_000007e0 >> 8);
    uStack0000000000000178 = (undefined1)in_stack_000007f8;
    uStack0000000000000179 = (undefined7)(in_stack_000007f8 >> 8);
    uStack0000000000000170 = (undefined1)in_stack_000007f0;
    uStack0000000000000171 = (undefined7)(in_stack_000007f0 >> 8);
    uStack0000000000000150 = uVar55;
    in_stack_00000180 = in_stack_00000800;
    func_0x00269fac(auStack_7ffffffe + 0x8000078e,&uStack0000000000000150,unaff_x29 + -0xa0);
    if (((uVar46 & 1) != 0) && (lVar31 = *(long *)(unaff_x29 + -0xd8), -0x7fffffffffffffd5 < lVar31)
       ) {
      if (((*(byte *)(unaff_x29 + -0xc0) & 1) == 0) &&
         ((lVar30 = *(long *)(unaff_x29 + -0xb8), lVar30 != -0x8000000000000000 && (lVar30 != 0))))
      {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xb0),lVar30,1);
      }
      lVar30 = *(long *)(unaff_x29 + -0xd0);
      lVar45 = *(long *)(unaff_x29 + -200);
      if (lVar45 != 0) {
        puVar47 = (undefined8 *)(lVar30 + 8);
        do {
          if (puVar47[-1] != 0) {
            func_0x00187bd4(*puVar47,puVar47[-1],1);
          }
          puVar47 = puVar47 + 3;
          lVar45 = lVar45 + -1;
        } while (lVar45 != 0);
      }
      if (lVar31 != 0) {
        func_0x00187bd4(lVar30,lVar31 * 0x18,8);
      }
    }
    uVar60 = uVar60 + 0x48;
    uVar55 = uVar33;
    in_stack_000007d8 = in_stack_00000798;
    in_stack_000007e0 = in_stack_000007a0;
    in_stack_000007e8 = in_stack_000007a8;
    in_stack_000007f0 = in_stack_000007b0;
    in_stack_000007f8 = in_stack_000007b8;
    in_stack_00000800 = in_stack_000007c0;
    if (uVar60 == uVar34) goto LAB_002657bc;
    goto LAB_00265188;
  }
code_r0x0026570c:
  in_stack_00000118 = *(ulong *)(unaff_x29 + -0xd8);
  uStack0000000000000110 = *(ulong *)(unaff_x29 + -0xe0);
  in_stack_00000128 = *(ulong *)(unaff_x29 + -200);
  in_stack_00000120 = *(long **)(unaff_x29 + -0xd0);
  in_stack_00000138 = *(ulong *)(unaff_x29 + -0xb8);
  in_stack_00000130 = *(ulong *)(unaff_x29 + -0xc0);
  in_stack_00000148 = *(ulong *)(unaff_x29 + -0xa8);
  in_stack_00000140 = *(ulong *)(unaff_x29 + -0xb0);
code_r0x00265eb0:
  if (-0x7fffffffffffffd5 < (long)uVar55) {
    if ((((in_stack_000007e8 & 1) == 0) && (in_stack_000007f0 != 0x8000000000000000)) &&
       (in_stack_000007f0 != 0)) {
      func_0x00187bd4(in_stack_000007f8,in_stack_000007f0,1);
    }
    if (in_stack_000007e0 != 0) {
      plVar36 = in_stack_000007d8 + 1;
      do {
        if (plVar36[-1] != 0) {
          func_0x00187bd4(*plVar36,plVar36[-1],1);
        }
        plVar36 = plVar36 + 3;
        in_stack_000007e0 = in_stack_000007e0 - 1;
      } while (in_stack_000007e0 != 0);
    }
    if (uVar55 != 0) {
      func_0x00187bd4(in_stack_000007d8,uVar55 * 0x18,8);
    }
  }
  if (uStack0000000000000110 == 2) {
    *in_stack_00000070 = 2;
    in_stack_00000070[1] = in_stack_00000118;
    return;
  }
  goto code_r0x00265810;
LAB_002657bc:
  uStack0000000000000110 =
       (ulong)((uVar33 ^ 0x8000000000000000) < 0x18 &&
              (1L << ((uVar33 ^ 0x8000000000000000) & 0x3f) & 0xb00000U) != 0);
  in_stack_00000120 = in_stack_00000798;
  in_stack_00000128 = in_stack_000007a0;
  in_stack_00000130 = in_stack_000007a8;
  in_stack_00000138 = in_stack_000007b0;
  in_stack_00000140 = in_stack_000007b8;
  in_stack_00000148 = in_stack_000007c0;
  goto code_r0x002657f4;
}

