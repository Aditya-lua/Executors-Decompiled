
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002fe158(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  int iVar4;
  qword qVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  char *pcVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined1 (*pauVar13) [16];
  long *plVar14;
  long *plVar15;
  ulong uVar16;
  ulong uVar17;
  long lVar18;
  ulong uVar19;
  byte *pbVar20;
  uint uVar21;
  uint uVar22;
  undefined1 (*pauVar23) [16];
  ulong uVar24;
  char *pcVar25;
  char *pcVar26;
  long *unaff_x20;
  bool bVar27;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x29;
  byte bVar28;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  byte bVar50;
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  byte bVar51;
  undefined8 uVar52;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  undefined1 auVar53 [16];
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  byte bVar84;
  byte bVar85;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  undefined8 uVar86;
  byte bVar93;
  byte bVar94;
  byte bVar96;
  byte bVar97;
  byte bVar98;
  byte bVar99;
  byte bVar100;
  byte bVar101;
  undefined8 uVar95;
  byte bVar102;
  undefined8 uVar103;
  undefined8 uVar104;
  undefined8 uVar105;
  undefined8 uVar106;
  undefined8 uVar107;
  undefined8 uVar108;
  undefined8 uVar109;
  undefined8 uVar110;
  undefined1 uStack0000000000000080;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined4 uStack00000000000000c8;
  undefined4 uStack00000000000000cc;
  undefined4 uStack00000000000000d0;
  undefined8 uStack00000000000000d4;
  undefined4 in_stack_00000d20;
  undefined4 in_stack_00000d24;
  ulong in_stack_00000d28;
  long in_stack_00000d30;
  ulong in_stack_00000d38;
  long in_stack_00001660;
  char acStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
  iVar4 = func_0x002f5fa4(param_1,acStack_7ffffffe + 0x8000101e,0x40,param_4,0x10);
  if ((((iVar4 == 0) ||
       (iVar4 = func_0x002fd75c(&UNK_00877e4e,acStack_7ffffffe + 0x8000101e,0x40,"DRBG Generate KAT"
                               ), iVar4 == 0)) ||
      (iVar4 = func_0x002f5c00(acStack_7ffffffe + 0x8000069e,&UNK_00877e8e,&UNK_00877e3e,0x10),
      iVar4 == 0)) ||
     ((iVar4 = func_0x002f5fa4(acStack_7ffffffe + 0x8000069e,acStack_7ffffffe + 0x8000101e,0x40,
                               &UNK_00877e3e,0x10), iVar4 == 0 ||
      (iVar4 = func_0x002fd75c(&UNK_00877ebe,acStack_7ffffffe + 0x8000101e,0x40,"DRBG-reseed KAT"),
      iVar4 == 0)))) {
    pcVar26 = (char *)((long)&MACH_HEADER.magic + 1);
    _fwrite("CTR-DRBG failed.\n",0x11,1,*unaff_x24);
  }
  else {
    func_0x0036e464(acStack_7ffffffe + 0x8000069e,0x120);
    unaff_x25[0x87] = 0;
    unaff_x25[0x86] = 0;
    unaff_x25[0x85] = 0;
    unaff_x25[0x84] = 0;
    unaff_x25[0x83] = 0;
    unaff_x25[0x82] = 0;
    unaff_x25[0x7f] = 0;
    unaff_x25[0x7e] = 0;
    unaff_x25[0x81] = 0;
    unaff_x25[0x80] = 0;
    unaff_x25[0x7b] = 0;
    unaff_x25[0x7a] = 0;
    unaff_x25[0x7d] = 0;
    unaff_x25[0x7c] = 0;
    unaff_x25[0x77] = 0;
    unaff_x25[0x76] = 0;
    unaff_x25[0x79] = 0;
    unaff_x25[0x78] = 0;
    unaff_x25[0x73] = 0;
    unaff_x25[0x72] = 0;
    unaff_x25[0x75] = 0;
    unaff_x25[0x74] = 0;
    unaff_x25[0x6f] = 0;
    unaff_x25[0x6e] = 0;
    unaff_x25[0x71] = 0;
    unaff_x25[0x70] = 0;
    unaff_x25[0x6b] = 0;
    unaff_x25[0x6a] = 0;
    unaff_x25[0x6d] = 0;
    unaff_x25[0x6c] = 0;
    unaff_x25[0x67] = 0;
    unaff_x25[0x66] = 0;
    unaff_x25[0x69] = 0;
    unaff_x25[0x68] = 0;
    unaff_x25[0x65] = 0;
    unaff_x25[100] = 0;
    iVar4 = func_0x002fd75c(acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000069e,0x120,
                            "DRBG Clear KAT");
    if (iVar4 == 0) {
      pcVar26 = (char *)((long)&MACH_HEADER.magic + 1);
    }
    else {
      func_0x00373e9c(0xa296c8,&DAT_002c21e4);
      iVar4 = func_0x0030140c(0xa3a728,unaff_x29 + -0xb0,0x20,&UNK_00877efe,0x20,&UNK_00877f1e,0xf,
                              &UNK_00877f2d);
      if ((iVar4 == 0) ||
         (iVar4 = func_0x002fd75c(&UNK_00877f4d,unaff_x29 + -0xb0,0x20,"TLS-KDF KAT"), iVar4 == 0))
      {
        uVar11 = *unaff_x24;
        pcVar10 = "TLS KDF failed.\n";
        uVar52 = 0x10;
      }
      else {
        func_0x00373e9c(0xa296c8,&DAT_002c21e4);
        iVar4 = func_0x002f53d4(&UNK_00877f6d,0x18,&UNK_00877f85,0x24,2,0xa3a728,0x19,
                                acStack_7ffffffe + 0x80001cbe);
        if ((iVar4 == 0) ||
           (iVar4 = func_0x002fd75c(&UNK_00877fa9,acStack_7ffffffe + 0x80001cbe,0x19,"PBKDF2 KAT"),
           iVar4 == 0)) {
          uVar11 = *unaff_x24;
          pcVar10 = "PBKDF2 failed.\n";
          uVar52 = 0xf;
        }
        else {
          func_0x00373e9c(0xa296c8,&DAT_002c21e4);
          iVar4 = func_0x002de444(acStack_7ffffffe + 0x80000d1e,0x100,0xa3a728,&UNK_00877fe2,0x33,
                                  &UNK_00877fc2,0x20);
          if ((iVar4 == 0) ||
             (iVar4 = func_0x002fd75c(&UNK_00878015,acStack_7ffffffe + 0x80000d1e,0x100,
                                      "SSKDF_digest KAT"), uVar86 = _UNK_0087812d,
             uVar11 = _UNK_00878125, uVar52 = _UNK_00878115, iVar4 == 0)) {
            uVar11 = *unaff_x24;
            pcVar10 = "SSKDF_digest failed.\n";
            uVar52 = 0x15;
          }
          else {
            unaff_x25[0x19d] = _UNK_0087811d;
            unaff_x25[0x19c] = uVar52;
            unaff_x25[0x19f] = uVar86;
            unaff_x25[0x19e] = uVar11;
            in_stack_000000a8 = _UNK_0087813d;
            uStack00000000000000a0 = _UNK_00878135;
            in_stack_000000b8 = _UNK_0087814d;
            in_stack_000000b0 = _UNK_00878145;
            uStack00000000000000c8 = _UNK_0087815d;
            in_stack_000000c0 = _UNK_00878155;
            uStack00000000000000d4 = _UNK_00878169;
            uStack00000000000000cc = _UNK_00878161;
            uStack00000000000000d0 = _UNK_00878165;
            func_0x00373e9c(0xa296c8,&DAT_002c21e4);
            iVar4 = func_0x002de054(&uStack0000000000000080,0x10,0xa3a728,unaff_x29 + -0xf0,0x20,
                                    &uStack00000000000000a0,0x3c);
            if ((iVar4 != 0) &&
               (iVar4 = func_0x002fd75c(&UNK_008300c0,&uStack0000000000000080,0x10,
                                        "KBKDF-CTR-HMAC-SHA-256 KAT"), iVar4 != 0)) {
              pcVar26 = (char *)0x0;
              goto LAB_002fda00;
            }
            uVar11 = *unaff_x24;
            pcVar10 = "KBKDF counter HMAC-SHA-256 failed.\n";
            uVar52 = 0x23;
          }
        }
      }
      pcVar26 = (char *)((long)&MACH_HEADER.magic + 1);
      _fwrite(pcVar10,uVar52,1,uVar11);
    }
  }
LAB_002fda00:
  if (in_stack_00001660 != 0) {
    (**(code **)(in_stack_00001660 + 0x20))(acStack_7ffffffe + 0x8000165e);
  }
  if ((int)pcVar26 != 0) goto code_r0x002fdd0c;
  pcVar26 = (char *)func_0x002f8ac4(0);
  if (pcVar26 == (char *)0x0) {
code_r0x002fdce0:
    func_0x002f7efc(pcVar26);
    _fwrite("RSA key construction failed\n",0x1c,1,*unaff_x24);
    pcVar26 = (char *)0x0;
  }
  else {
    qVar5 = func_0x0029c764(&UNK_00878472,0x100,0);
    *(qword *)(pcVar26 + 8) = qVar5;
    if (qVar5 == 0) goto code_r0x002fdce0;
    qVar5 = func_0x0029c764(&UNK_00878572,3,0);
    *(qword *)(pcVar26 + 0x10) = qVar5;
    if (qVar5 == 0) goto code_r0x002fdce0;
    lVar6 = func_0x0029c764(&UNK_00878575,0x100,0);
    *(long *)(pcVar26 + 0x18) = lVar6;
    if (lVar6 == 0) goto code_r0x002fdce0;
    lVar6 = func_0x0029c764(&UNK_00878675,0x80,0);
    *(long *)(pcVar26 + 0x20) = lVar6;
    if (lVar6 == 0) goto code_r0x002fdce0;
    lVar6 = func_0x0029c764(&UNK_008786f5,0x80,0);
    *(long *)(pcVar26 + 0x28) = lVar6;
    if (lVar6 == 0) goto code_r0x002fdce0;
    lVar6 = func_0x0029c764(&UNK_00878775,0x80,0);
    *(long *)(pcVar26 + 0x30) = lVar6;
    if (lVar6 == 0) goto code_r0x002fdce0;
    lVar6 = func_0x0029c764(&UNK_008787f5,0x80,0);
    *(long *)(pcVar26 + 0x38) = lVar6;
    if (lVar6 == 0) goto code_r0x002fdce0;
    lVar6 = func_0x0029c764(&UNK_00878875,0x80,0);
    *(long *)(pcVar26 + 0x40) = lVar6;
    if (lVar6 == 0) goto code_r0x002fdce0;
    *(uint *)(pcVar26 + 0x5c) = *(uint *)(pcVar26 + 0x5c) | 8;
    func_0x00373e9c(0xa296c8,&DAT_002c21e4);
    iVar4 = func_0x002c0d58(&UNK_00878232,0x20,acStack_7ffffffe + 0x8000069e,
                            acStack_7ffffffe + 0x8000133e,0xa3a728,0);
    if (iVar4 == 0) {
code_r0x002fdfd0:
      uVar11 = *unaff_x24;
      pcVar10 = "RSA signing test failed.\n";
      uVar52 = 0x19;
    }
    else {
      unaff_x20 = (long *)0xa3a000;
      iVar4 = func_0x002f9b90(uRam0000000000a3a728,acStack_7ffffffe + 0x8000069e,0x40,
                              acStack_7ffffffe + 0x8000165e,acStack_7ffffffe + 0x8000101e,pcVar26);
      if ((iVar4 == 0) ||
         (iVar4 = func_0x002fd75c(&UNK_00878252,acStack_7ffffffe + 0x8000165e,0x100,"RSA-sign KAT"),
         iVar4 == 0)) goto code_r0x002fdfd0;
      func_0x00373e9c(0xa296c8,&DAT_002c21e4);
      iVar4 = func_0x002c0d58(&UNK_00878352,0x20,acStack_7ffffffe + 0x8000069e,
                              acStack_7ffffffe + 0x8000133e,0xa3a728,0);
      if ((iVar4 != 0) &&
         (iVar4 = func_0x002f9f18(uRam0000000000a3a728,acStack_7ffffffe + 0x8000069e,0x40,
                                  &UNK_00878372,0x100,pcVar26), iVar4 != 0)) {
        func_0x002f7efc(pcVar26);
        pcVar26 = (char *)func_0x002c2a30();
        puVar7 = (undefined8 *)func_0x0029c764(&UNK_00878a57,0x20,0);
        puVar8 = (undefined8 *)func_0x0029c764(&UNK_00878a77,0x20,0);
        puVar9 = (undefined8 *)func_0x0029c764(&UNK_00878a97,0x20,0);
        if ((pcVar26 == (char *)0x0) ||
           (((puVar7 == (undefined8 *)0x0 || (puVar8 == (undefined8 *)0x0)) ||
            (puVar9 == (undefined8 *)0x0)))) {
          func_0x002c3420(pcVar26);
          pcVar26 = (char *)0x0;
          if (puVar7 != (undefined8 *)0x0) goto code_r0x002fe4e0;
        }
        else {
          func_0x00373e9c(0xa29738,&DAT_002c54ec);
          iVar4 = func_0x002c2ae8(pcVar26,0xa3b640);
          if (((iVar4 == 0) || (iVar4 = func_0x002cb27c(pcVar26,puVar7,puVar8), iVar4 == 0)) ||
             (iVar4 = func_0x002cad18(pcVar26,puVar9), iVar4 == 0)) {
            func_0x002c3420(pcVar26);
            pcVar26 = (char *)0x0;
          }
code_r0x002fe4e0:
          uVar21 = *(uint *)((long)puVar7 + 0x14);
          if ((uVar21 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar7);
            uVar21 = *(uint *)((long)puVar7 + 0x14);
          }
          if ((uVar21 & 1) == 0) {
            *puVar7 = 0;
          }
          else {
            func_0x0036e3d8(puVar7);
          }
        }
        if (puVar8 != (undefined8 *)0x0) {
          uVar21 = *(uint *)((long)puVar8 + 0x14);
          if ((uVar21 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar8);
            uVar21 = *(uint *)((long)puVar8 + 0x14);
          }
          if ((uVar21 & 1) == 0) {
            *puVar8 = 0;
          }
          else {
            func_0x0036e3d8(puVar8);
          }
        }
        if (puVar9 != (undefined8 *)0x0) {
          uVar21 = *(uint *)((long)puVar9 + 0x14);
          if ((uVar21 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar9);
            uVar21 = *(uint *)((long)puVar9 + 0x14);
          }
          if ((uVar21 & 1) == 0) {
            *puVar9 = 0;
          }
          else {
            func_0x0036e3d8(puVar9);
          }
        }
        if (pcVar26 == (char *)0x0) {
          _fwrite("ECDSA KeyGen failed\n",0x14,1,*unaff_x24);
          unaff_x20 = (long *)0x0;
        }
        else {
          *(undefined8 *)((long)unaff_x25 + 0x17) = 0;
          *(undefined1 *)((long)unaff_x25 + 0x1f) = 0x2a;
          func_0x00373e9c(0xa296c8,&DAT_002c21e4);
          unaff_x20 = (long *)func_0x002c50e8(0xa3a728,&UNK_008788f5,0x20,pcVar26,
                                              acStack_7ffffffe + 0x8000101e,0x20);
          if (unaff_x20 == (long *)0x0) {
code_r0x002fec40:
            uVar11 = *unaff_x24;
            pcVar10 = "ECDSA-sign KAT failed.\n";
            uVar52 = 0x17;
          }
          else {
            pauVar13 = *(undefined1 (**) [16])*unaff_x20;
            lVar6 = (long)*(int *)((undefined8 *)*unaff_x20 + 1);
            uVar12 = lVar6 * 8;
            if (0x20 < uVar12) {
              uVar16 = uVar12 - 0x20;
              if (uVar16 < 0x40) {
                bVar28 = 0;
                uVar17 = 0;
code_r0x002fe6a8:
                auVar53 = ZEXT116(bVar28);
                lVar18 = uVar17 + 0x20 + lVar6 * -8;
                puVar7 = (undefined8 *)(pauVar13[2] + uVar17);
                do {
                  uVar52 = *puVar7;
                  auVar53._0_8_ =
                       CONCAT17((byte)((ulong)uVar52 >> 0x38) | auVar53[7],
                                CONCAT16((byte)((ulong)uVar52 >> 0x30) | auVar53[6],
                                         CONCAT15((byte)((ulong)uVar52 >> 0x28) | auVar53[5],
                                                  CONCAT14((byte)((ulong)uVar52 >> 0x20) |
                                                           auVar53[4],
                                                           CONCAT13((byte)((ulong)uVar52 >> 0x18) |
                                                                    auVar53[3],
                                                                    CONCAT12((byte)((ulong)uVar52 >>
                                                                                   0x10) |
                                                                             auVar53[2],
                                                                             CONCAT11((byte)((ulong)
                                                  uVar52 >> 8) | auVar53[1],
                                                  (byte)uVar52 | auVar53[0])))))));
                  auVar53._8_8_ = 0;
                  lVar18 = lVar18 + 8;
                  puVar7 = puVar7 + 1;
                } while (lVar18 != 0);
                uVar19 = auVar53._0_8_ | auVar53._0_8_ >> 0x20;
                uVar19 = uVar19 | uVar19 >> 0x10;
                uVar21 = (uint)uVar19 | (uint)(uVar19 >> 8);
              }
              else {
                uVar17 = uVar16 & 0xffffffffffffffc0;
                pauVar23 = pauVar13 + 5;
                bVar28 = 0;
                bVar36 = 0;
                bVar37 = 0;
                bVar38 = 0;
                bVar39 = 0;
                bVar40 = 0;
                bVar41 = 0;
                bVar42 = 0;
                bVar43 = 0;
                bVar44 = 0;
                bVar45 = 0;
                bVar46 = 0;
                bVar47 = 0;
                bVar48 = 0;
                bVar49 = 0;
                bVar50 = 0;
                bVar51 = 0;
                bVar54 = 0;
                bVar55 = 0;
                bVar56 = 0;
                bVar57 = 0;
                bVar58 = 0;
                bVar59 = 0;
                bVar60 = 0;
                bVar61 = 0;
                bVar62 = 0;
                bVar63 = 0;
                bVar64 = 0;
                bVar65 = 0;
                bVar66 = 0;
                bVar67 = 0;
                bVar68 = 0;
                uVar52 = 0;
                uVar11 = 0;
                uVar86 = 0;
                uVar95 = 0;
                uVar19 = uVar17;
                do {
                  uVar104 = *(undefined8 *)(pauVar23[-3] + 8);
                  uVar103 = *(undefined8 *)pauVar23[-3];
                  uVar106 = *(undefined8 *)(pauVar23[-2] + 8);
                  uVar105 = *(undefined8 *)pauVar23[-2];
                  uVar108 = *(undefined8 *)(pauVar23[-1] + 8);
                  uVar107 = *(undefined8 *)pauVar23[-1];
                  uVar110 = *(undefined8 *)(*pauVar23 + 8);
                  uVar109 = *(undefined8 *)*pauVar23;
                  bVar28 = (byte)uVar103 | bVar28;
                  bVar36 = (byte)((ulong)uVar103 >> 8) | bVar36;
                  bVar37 = (byte)((ulong)uVar103 >> 0x10) | bVar37;
                  bVar38 = (byte)((ulong)uVar103 >> 0x18) | bVar38;
                  bVar39 = (byte)((ulong)uVar103 >> 0x20) | bVar39;
                  bVar40 = (byte)((ulong)uVar103 >> 0x28) | bVar40;
                  bVar41 = (byte)((ulong)uVar103 >> 0x30) | bVar41;
                  bVar42 = (byte)((ulong)uVar103 >> 0x38) | bVar42;
                  bVar43 = (byte)uVar104 | bVar43;
                  bVar44 = (byte)((ulong)uVar104 >> 8) | bVar44;
                  bVar45 = (byte)((ulong)uVar104 >> 0x10) | bVar45;
                  bVar46 = (byte)((ulong)uVar104 >> 0x18) | bVar46;
                  bVar47 = (byte)((ulong)uVar104 >> 0x20) | bVar47;
                  bVar48 = (byte)((ulong)uVar104 >> 0x28) | bVar48;
                  bVar49 = (byte)((ulong)uVar104 >> 0x30) | bVar49;
                  bVar50 = (byte)((ulong)uVar104 >> 0x38) | bVar50;
                  bVar51 = (byte)uVar105 | bVar51;
                  bVar54 = (byte)((ulong)uVar105 >> 8) | bVar54;
                  bVar55 = (byte)((ulong)uVar105 >> 0x10) | bVar55;
                  bVar56 = (byte)((ulong)uVar105 >> 0x18) | bVar56;
                  bVar57 = (byte)((ulong)uVar105 >> 0x20) | bVar57;
                  bVar58 = (byte)((ulong)uVar105 >> 0x28) | bVar58;
                  bVar59 = (byte)((ulong)uVar105 >> 0x30) | bVar59;
                  bVar60 = (byte)((ulong)uVar105 >> 0x38) | bVar60;
                  bVar61 = (byte)uVar106 | bVar61;
                  bVar62 = (byte)((ulong)uVar106 >> 8) | bVar62;
                  bVar63 = (byte)((ulong)uVar106 >> 0x10) | bVar63;
                  bVar64 = (byte)((ulong)uVar106 >> 0x18) | bVar64;
                  bVar65 = (byte)((ulong)uVar106 >> 0x20) | bVar65;
                  bVar66 = (byte)((ulong)uVar106 >> 0x28) | bVar66;
                  bVar67 = (byte)((ulong)uVar106 >> 0x30) | bVar67;
                  bVar68 = (byte)((ulong)uVar106 >> 0x38) | bVar68;
                  bVar69 = (byte)uVar107 | (byte)uVar52;
                  bVar70 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar52 >> 8);
                  bVar71 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar52 >> 0x10);
                  bVar72 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar52 >> 0x18);
                  bVar73 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar52 >> 0x20);
                  bVar74 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar52 >> 0x28);
                  bVar75 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar52 >> 0x30);
                  bVar76 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar52 >> 0x38);
                  uVar52 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar108 | (byte)uVar11;
                  bVar78 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar11 >> 8);
                  bVar79 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar11 >> 0x10);
                  bVar80 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar11 >> 0x18);
                  bVar81 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar11 >> 0x20);
                  bVar82 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar11 >> 0x28);
                  bVar83 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar11 >> 0x30);
                  bVar84 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar11 >> 0x38);
                  uVar11 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
                                                  bVar80,CONCAT12(bVar79,CONCAT11(bVar78,bVar77)))))
                                                  ));
                  bVar85 = (byte)uVar109 | (byte)uVar86;
                  bVar87 = (byte)((ulong)uVar109 >> 8) | (byte)((ulong)uVar86 >> 8);
                  bVar88 = (byte)((ulong)uVar109 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
                  bVar89 = (byte)((ulong)uVar109 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
                  bVar90 = (byte)((ulong)uVar109 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
                  bVar91 = (byte)((ulong)uVar109 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
                  bVar92 = (byte)((ulong)uVar109 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
                  bVar93 = (byte)((ulong)uVar109 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
                  uVar86 = CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(
                                                  bVar89,CONCAT12(bVar88,CONCAT11(bVar87,bVar85)))))
                                                  ));
                  bVar94 = (byte)uVar110 | (byte)uVar95;
                  bVar96 = (byte)((ulong)uVar110 >> 8) | (byte)((ulong)uVar95 >> 8);
                  bVar97 = (byte)((ulong)uVar110 >> 0x10) | (byte)((ulong)uVar95 >> 0x10);
                  bVar98 = (byte)((ulong)uVar110 >> 0x18) | (byte)((ulong)uVar95 >> 0x18);
                  bVar99 = (byte)((ulong)uVar110 >> 0x20) | (byte)((ulong)uVar95 >> 0x20);
                  bVar100 = (byte)((ulong)uVar110 >> 0x28) | (byte)((ulong)uVar95 >> 0x28);
                  bVar101 = (byte)((ulong)uVar110 >> 0x30) | (byte)((ulong)uVar95 >> 0x30);
                  bVar102 = (byte)((ulong)uVar110 >> 0x38) | (byte)((ulong)uVar95 >> 0x38);
                  uVar95 = CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,
                                                  CONCAT13(bVar98,CONCAT12(bVar97,CONCAT11(bVar96,
                                                  bVar94)))))));
                  pauVar23 = pauVar23 + 4;
                  uVar19 = uVar19 - 0x40;
                } while (uVar19 != 0);
                auVar35[0] = bVar85 | bVar69 | bVar51 | bVar28;
                auVar35[1] = bVar87 | bVar70 | bVar54 | bVar36;
                auVar35[2] = bVar88 | bVar71 | bVar55 | bVar37;
                auVar35[3] = bVar89 | bVar72 | bVar56 | bVar38;
                auVar35[4] = bVar90 | bVar73 | bVar57 | bVar39;
                auVar35[5] = bVar91 | bVar74 | bVar58 | bVar40;
                auVar35[6] = bVar92 | bVar75 | bVar59 | bVar41;
                auVar35[7] = bVar93 | bVar76 | bVar60 | bVar42;
                auVar35[8] = bVar94 | bVar77 | bVar61 | bVar43;
                auVar35[9] = bVar96 | bVar78 | bVar62 | bVar44;
                auVar35[10] = bVar97 | bVar79 | bVar63 | bVar45;
                auVar35[0xb] = bVar98 | bVar80 | bVar64 | bVar46;
                auVar35[0xc] = bVar99 | bVar81 | bVar65 | bVar47;
                auVar35[0xd] = bVar100 | bVar82 | bVar66 | bVar48;
                auVar35[0xe] = bVar101 | bVar83 | bVar67 | bVar49;
                auVar35[0xf] = bVar102 | bVar84 | bVar68 | bVar50;
                auVar53 = NEON_ext(auVar35,auVar35,8,1);
                uVar19 = CONCAT17(auVar35[7] | auVar53[7],
                                  CONCAT16(auVar35[6] | auVar53[6],
                                           CONCAT15(auVar35[5] | auVar53[5],
                                                    CONCAT14(auVar35[4] | auVar53[4],
                                                             CONCAT13(auVar35[3] | auVar53[3],
                                                                      CONCAT12(auVar35[2] |
                                                                               auVar53[2],
                                                                               CONCAT11(auVar35[1] |
                                                                                        auVar53[1],
                                                                                        auVar35[0] |
                                                                                        auVar53[0]))
                                                                     )))));
                uVar19 = uVar19 | uVar19 >> 0x20;
                uVar19 = uVar19 | uVar19 >> 0x10;
                uVar21 = (uint)uVar19 | (uint)(uVar19 >> 8);
                bVar28 = (byte)uVar21;
                if (uVar16 != uVar17) {
                  if ((uVar16 & 0x38) != 0) goto code_r0x002fe6a8;
                  lVar18 = (uVar12 - uVar17) + -0x20;
                  pbVar20 = *pauVar13 + (uVar17 | 0x20);
                  do {
                    uVar21 = *pbVar20 | uVar21;
                    lVar18 = lVar18 + -1;
                    pbVar20 = pbVar20 + 1;
                  } while (lVar18 != 0);
                }
              }
              if ((uVar21 & 0xff) != 0) goto code_r0x002fec40;
              if (uVar16 < 0x40) {
                bVar28 = 0;
                uVar17 = 0;
code_r0x002fe774:
                auVar30 = ZEXT116(bVar28);
                lVar6 = uVar17 + 0x20 + lVar6 * -8;
                puVar7 = (undefined8 *)(pauVar13[2] + uVar17);
                do {
                  uVar52 = *puVar7;
                  auVar30._0_8_ =
                       CONCAT17((byte)((ulong)uVar52 >> 0x38) | auVar30[7],
                                CONCAT16((byte)((ulong)uVar52 >> 0x30) | auVar30[6],
                                         CONCAT15((byte)((ulong)uVar52 >> 0x28) | auVar30[5],
                                                  CONCAT14((byte)((ulong)uVar52 >> 0x20) |
                                                           auVar30[4],
                                                           CONCAT13((byte)((ulong)uVar52 >> 0x18) |
                                                                    auVar30[3],
                                                                    CONCAT12((byte)((ulong)uVar52 >>
                                                                                   0x10) |
                                                                             auVar30[2],
                                                                             CONCAT11((byte)((ulong)
                                                  uVar52 >> 8) | auVar30[1],
                                                  (byte)uVar52 | auVar30[0])))))));
                  auVar30._8_8_ = 0;
                  lVar6 = lVar6 + 8;
                  puVar7 = puVar7 + 1;
                } while (lVar6 != 0);
                uVar16 = auVar30._0_8_ | auVar30._0_8_ >> 0x20;
                uVar16 = uVar16 | uVar16 >> 0x10;
                uVar21 = (uint)uVar16 | (uint)(uVar16 >> 8);
              }
              else {
                uVar17 = uVar16 & 0xffffffffffffffc0;
                pauVar23 = pauVar13 + 5;
                bVar28 = 0;
                bVar36 = 0;
                bVar37 = 0;
                bVar38 = 0;
                bVar39 = 0;
                bVar40 = 0;
                bVar41 = 0;
                bVar42 = 0;
                bVar43 = 0;
                bVar44 = 0;
                bVar45 = 0;
                bVar46 = 0;
                bVar47 = 0;
                bVar48 = 0;
                bVar49 = 0;
                bVar50 = 0;
                bVar51 = 0;
                bVar54 = 0;
                bVar55 = 0;
                bVar56 = 0;
                bVar57 = 0;
                bVar58 = 0;
                bVar59 = 0;
                bVar60 = 0;
                bVar61 = 0;
                bVar62 = 0;
                bVar63 = 0;
                bVar64 = 0;
                bVar65 = 0;
                bVar66 = 0;
                bVar67 = 0;
                bVar68 = 0;
                uVar52 = 0;
                uVar11 = 0;
                uVar86 = 0;
                uVar95 = 0;
                uVar19 = uVar17;
                do {
                  uVar104 = *(undefined8 *)(pauVar23[-3] + 8);
                  uVar103 = *(undefined8 *)pauVar23[-3];
                  uVar106 = *(undefined8 *)(pauVar23[-2] + 8);
                  uVar105 = *(undefined8 *)pauVar23[-2];
                  uVar108 = *(undefined8 *)(pauVar23[-1] + 8);
                  uVar107 = *(undefined8 *)pauVar23[-1];
                  uVar110 = *(undefined8 *)(*pauVar23 + 8);
                  uVar109 = *(undefined8 *)*pauVar23;
                  bVar28 = (byte)uVar103 | bVar28;
                  bVar36 = (byte)((ulong)uVar103 >> 8) | bVar36;
                  bVar37 = (byte)((ulong)uVar103 >> 0x10) | bVar37;
                  bVar38 = (byte)((ulong)uVar103 >> 0x18) | bVar38;
                  bVar39 = (byte)((ulong)uVar103 >> 0x20) | bVar39;
                  bVar40 = (byte)((ulong)uVar103 >> 0x28) | bVar40;
                  bVar41 = (byte)((ulong)uVar103 >> 0x30) | bVar41;
                  bVar42 = (byte)((ulong)uVar103 >> 0x38) | bVar42;
                  bVar43 = (byte)uVar104 | bVar43;
                  bVar44 = (byte)((ulong)uVar104 >> 8) | bVar44;
                  bVar45 = (byte)((ulong)uVar104 >> 0x10) | bVar45;
                  bVar46 = (byte)((ulong)uVar104 >> 0x18) | bVar46;
                  bVar47 = (byte)((ulong)uVar104 >> 0x20) | bVar47;
                  bVar48 = (byte)((ulong)uVar104 >> 0x28) | bVar48;
                  bVar49 = (byte)((ulong)uVar104 >> 0x30) | bVar49;
                  bVar50 = (byte)((ulong)uVar104 >> 0x38) | bVar50;
                  bVar51 = (byte)uVar105 | bVar51;
                  bVar54 = (byte)((ulong)uVar105 >> 8) | bVar54;
                  bVar55 = (byte)((ulong)uVar105 >> 0x10) | bVar55;
                  bVar56 = (byte)((ulong)uVar105 >> 0x18) | bVar56;
                  bVar57 = (byte)((ulong)uVar105 >> 0x20) | bVar57;
                  bVar58 = (byte)((ulong)uVar105 >> 0x28) | bVar58;
                  bVar59 = (byte)((ulong)uVar105 >> 0x30) | bVar59;
                  bVar60 = (byte)((ulong)uVar105 >> 0x38) | bVar60;
                  bVar61 = (byte)uVar106 | bVar61;
                  bVar62 = (byte)((ulong)uVar106 >> 8) | bVar62;
                  bVar63 = (byte)((ulong)uVar106 >> 0x10) | bVar63;
                  bVar64 = (byte)((ulong)uVar106 >> 0x18) | bVar64;
                  bVar65 = (byte)((ulong)uVar106 >> 0x20) | bVar65;
                  bVar66 = (byte)((ulong)uVar106 >> 0x28) | bVar66;
                  bVar67 = (byte)((ulong)uVar106 >> 0x30) | bVar67;
                  bVar68 = (byte)((ulong)uVar106 >> 0x38) | bVar68;
                  bVar69 = (byte)uVar107 | (byte)uVar52;
                  bVar70 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar52 >> 8);
                  bVar71 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar52 >> 0x10);
                  bVar72 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar52 >> 0x18);
                  bVar73 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar52 >> 0x20);
                  bVar74 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar52 >> 0x28);
                  bVar75 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar52 >> 0x30);
                  bVar76 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar52 >> 0x38);
                  uVar52 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar108 | (byte)uVar11;
                  bVar78 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar11 >> 8);
                  bVar79 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar11 >> 0x10);
                  bVar80 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar11 >> 0x18);
                  bVar81 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar11 >> 0x20);
                  bVar82 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar11 >> 0x28);
                  bVar83 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar11 >> 0x30);
                  bVar84 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar11 >> 0x38);
                  uVar11 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
                                                  bVar80,CONCAT12(bVar79,CONCAT11(bVar78,bVar77)))))
                                                  ));
                  bVar85 = (byte)uVar109 | (byte)uVar86;
                  bVar87 = (byte)((ulong)uVar109 >> 8) | (byte)((ulong)uVar86 >> 8);
                  bVar88 = (byte)((ulong)uVar109 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
                  bVar89 = (byte)((ulong)uVar109 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
                  bVar90 = (byte)((ulong)uVar109 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
                  bVar91 = (byte)((ulong)uVar109 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
                  bVar92 = (byte)((ulong)uVar109 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
                  bVar93 = (byte)((ulong)uVar109 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
                  uVar86 = CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(
                                                  bVar89,CONCAT12(bVar88,CONCAT11(bVar87,bVar85)))))
                                                  ));
                  bVar94 = (byte)uVar110 | (byte)uVar95;
                  bVar96 = (byte)((ulong)uVar110 >> 8) | (byte)((ulong)uVar95 >> 8);
                  bVar97 = (byte)((ulong)uVar110 >> 0x10) | (byte)((ulong)uVar95 >> 0x10);
                  bVar98 = (byte)((ulong)uVar110 >> 0x18) | (byte)((ulong)uVar95 >> 0x18);
                  bVar99 = (byte)((ulong)uVar110 >> 0x20) | (byte)((ulong)uVar95 >> 0x20);
                  bVar100 = (byte)((ulong)uVar110 >> 0x28) | (byte)((ulong)uVar95 >> 0x28);
                  bVar101 = (byte)((ulong)uVar110 >> 0x30) | (byte)((ulong)uVar95 >> 0x30);
                  bVar102 = (byte)((ulong)uVar110 >> 0x38) | (byte)((ulong)uVar95 >> 0x38);
                  uVar95 = CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,
                                                  CONCAT13(bVar98,CONCAT12(bVar97,CONCAT11(bVar96,
                                                  bVar94)))))));
                  pauVar23 = pauVar23 + 4;
                  uVar19 = uVar19 - 0x40;
                } while (uVar19 != 0);
                auVar29[0] = bVar85 | bVar69 | bVar51 | bVar28;
                auVar29[1] = bVar87 | bVar70 | bVar54 | bVar36;
                auVar29[2] = bVar88 | bVar71 | bVar55 | bVar37;
                auVar29[3] = bVar89 | bVar72 | bVar56 | bVar38;
                auVar29[4] = bVar90 | bVar73 | bVar57 | bVar39;
                auVar29[5] = bVar91 | bVar74 | bVar58 | bVar40;
                auVar29[6] = bVar92 | bVar75 | bVar59 | bVar41;
                auVar29[7] = bVar93 | bVar76 | bVar60 | bVar42;
                auVar29[8] = bVar94 | bVar77 | bVar61 | bVar43;
                auVar29[9] = bVar96 | bVar78 | bVar62 | bVar44;
                auVar29[10] = bVar97 | bVar79 | bVar63 | bVar45;
                auVar29[0xb] = bVar98 | bVar80 | bVar64 | bVar46;
                auVar29[0xc] = bVar99 | bVar81 | bVar65 | bVar47;
                auVar29[0xd] = bVar100 | bVar82 | bVar66 | bVar48;
                auVar29[0xe] = bVar101 | bVar83 | bVar67 | bVar49;
                auVar29[0xf] = bVar102 | bVar84 | bVar68 | bVar50;
                auVar35 = NEON_ext(auVar29,auVar29,8,1);
                uVar19 = CONCAT17(auVar29[7] | auVar35[7],
                                  CONCAT16(auVar29[6] | auVar35[6],
                                           CONCAT15(auVar29[5] | auVar35[5],
                                                    CONCAT14(auVar29[4] | auVar35[4],
                                                             CONCAT13(auVar29[3] | auVar35[3],
                                                                      CONCAT12(auVar29[2] |
                                                                               auVar35[2],
                                                                               CONCAT11(auVar29[1] |
                                                                                        auVar35[1],
                                                                                        auVar29[0] |
                                                                                        auVar35[0]))
                                                                     )))));
                uVar19 = uVar19 | uVar19 >> 0x20;
                uVar19 = uVar19 | uVar19 >> 0x10;
                uVar21 = (uint)uVar19 | (uint)(uVar19 >> 8);
                bVar28 = (byte)uVar21;
                if (uVar16 != uVar17) {
                  if ((uVar16 & 0x38) != 0) goto code_r0x002fe774;
                  lVar6 = (uVar12 - uVar17) + -0x20;
                  pbVar20 = *pauVar13 + (uVar17 | 0x20);
                  do {
                    uVar21 = *pbVar20 | uVar21;
                    lVar6 = lVar6 + -1;
                    pbVar20 = pbVar20 + 1;
                  } while (lVar6 != 0);
                }
              }
              if ((uVar21 & 0xff) != 0) {
                func_0x0079dae0();
                goto code_r0x002ff884;
              }
            }
            uVar16 = uVar12;
            if (0x1f < uVar12) {
              uVar16 = 0x20;
            }
            if (uVar16 != 0) {
              if ((acStack_7ffffffe + (0x8000135e - uVar16) < *pauVar13 + uVar16) &&
                 (pauVar13 < (undefined1 (*) [16])(acStack_7ffffffe + 0x8000135e))) {
                uVar19 = 0;
code_r0x002fe7f0:
                lVar6 = uVar16 - uVar19;
                pcVar10 = *pauVar13 + uVar19;
                pcVar25 = acStack_7ffffffe + (0x8000135d - uVar19);
                do {
                  *pcVar25 = *pcVar10;
                  lVar6 = lVar6 + -1;
                  pcVar10 = pcVar10 + 1;
                  pcVar25 = pcVar25 + -1;
                } while (lVar6 != 0);
              }
              else {
                if (uVar16 < 0x10) {
                  uVar19 = 0;
                }
                else {
                  uVar19 = uVar16 & 0x30;
                  auVar35 = NEON_rev64(*pauVar13,1);
                  auVar35 = NEON_ext(auVar35,auVar35,8,1);
                  unaff_x25[0x67] = auVar35._8_8_;
                  unaff_x25[0x66] = auVar35._0_8_;
                  if (uVar19 != 0x10) {
                    auVar35 = NEON_rev64(pauVar13[1],1);
                    auVar35 = NEON_ext(auVar35,auVar35,8,1);
                    unaff_x25[0x65] = auVar35._8_8_;
                    unaff_x25[100] = auVar35._0_8_;
                  }
                  if (uVar16 == uVar19) goto code_r0x002fe890;
                  if (((uint)uVar16 >> 3 & 1) == 0) goto code_r0x002fe7f0;
                }
                lVar6 = uVar16 - uVar19;
                puVar7 = (undefined8 *)(*pauVar13 + uVar19);
                pcVar10 = acStack_7ffffffe + (0x80001356 - uVar19);
                do {
                  uVar52 = NEON_rev64(*puVar7,1);
                  *(undefined8 *)pcVar10 = uVar52;
                  lVar6 = lVar6 + -8;
                  puVar7 = puVar7 + 1;
                  pcVar10 = pcVar10 + -8;
                } while (lVar6 != 0);
              }
            }
code_r0x002fe890:
            if (uVar12 < 0x20) {
              ___memset_chk(acStack_7ffffffe + 0x8000133e,0,0x20 - uVar16,0x40);
            }
            pauVar13 = *(undefined1 (**) [16])unaff_x20[1];
            lVar6 = (long)*(int *)((undefined8 *)unaff_x20[1] + 1);
            uVar12 = lVar6 * 8;
            if (0x20 < uVar12) {
              uVar16 = uVar12 - 0x20;
              if (uVar16 < 0x40) {
                bVar28 = 0;
                uVar17 = 0;
code_r0x002fe95c:
                auVar32 = ZEXT116(bVar28);
                lVar18 = uVar17 + 0x20 + lVar6 * -8;
                puVar7 = (undefined8 *)(pauVar13[2] + uVar17);
                do {
                  uVar52 = *puVar7;
                  auVar32._0_8_ =
                       CONCAT17((byte)((ulong)uVar52 >> 0x38) | auVar32[7],
                                CONCAT16((byte)((ulong)uVar52 >> 0x30) | auVar32[6],
                                         CONCAT15((byte)((ulong)uVar52 >> 0x28) | auVar32[5],
                                                  CONCAT14((byte)((ulong)uVar52 >> 0x20) |
                                                           auVar32[4],
                                                           CONCAT13((byte)((ulong)uVar52 >> 0x18) |
                                                                    auVar32[3],
                                                                    CONCAT12((byte)((ulong)uVar52 >>
                                                                                   0x10) |
                                                                             auVar32[2],
                                                                             CONCAT11((byte)((ulong)
                                                  uVar52 >> 8) | auVar32[1],
                                                  (byte)uVar52 | auVar32[0])))))));
                  auVar32._8_8_ = 0;
                  lVar18 = lVar18 + 8;
                  puVar7 = puVar7 + 1;
                } while (lVar18 != 0);
                uVar19 = auVar32._0_8_ | auVar32._0_8_ >> 0x20;
                uVar19 = uVar19 | uVar19 >> 0x10;
                uVar21 = (uint)uVar19 | (uint)(uVar19 >> 8);
              }
              else {
                uVar17 = uVar16 & 0xffffffffffffffc0;
                pauVar23 = pauVar13 + 5;
                bVar28 = 0;
                bVar36 = 0;
                bVar37 = 0;
                bVar38 = 0;
                bVar39 = 0;
                bVar40 = 0;
                bVar41 = 0;
                bVar42 = 0;
                bVar43 = 0;
                bVar44 = 0;
                bVar45 = 0;
                bVar46 = 0;
                bVar47 = 0;
                bVar48 = 0;
                bVar49 = 0;
                bVar50 = 0;
                bVar51 = 0;
                bVar54 = 0;
                bVar55 = 0;
                bVar56 = 0;
                bVar57 = 0;
                bVar58 = 0;
                bVar59 = 0;
                bVar60 = 0;
                bVar61 = 0;
                bVar62 = 0;
                bVar63 = 0;
                bVar64 = 0;
                bVar65 = 0;
                bVar66 = 0;
                bVar67 = 0;
                bVar68 = 0;
                uVar52 = 0;
                uVar11 = 0;
                uVar86 = 0;
                uVar95 = 0;
                uVar19 = uVar17;
                do {
                  uVar104 = *(undefined8 *)(pauVar23[-3] + 8);
                  uVar103 = *(undefined8 *)pauVar23[-3];
                  uVar106 = *(undefined8 *)(pauVar23[-2] + 8);
                  uVar105 = *(undefined8 *)pauVar23[-2];
                  uVar108 = *(undefined8 *)(pauVar23[-1] + 8);
                  uVar107 = *(undefined8 *)pauVar23[-1];
                  uVar110 = *(undefined8 *)(*pauVar23 + 8);
                  uVar109 = *(undefined8 *)*pauVar23;
                  bVar28 = (byte)uVar103 | bVar28;
                  bVar36 = (byte)((ulong)uVar103 >> 8) | bVar36;
                  bVar37 = (byte)((ulong)uVar103 >> 0x10) | bVar37;
                  bVar38 = (byte)((ulong)uVar103 >> 0x18) | bVar38;
                  bVar39 = (byte)((ulong)uVar103 >> 0x20) | bVar39;
                  bVar40 = (byte)((ulong)uVar103 >> 0x28) | bVar40;
                  bVar41 = (byte)((ulong)uVar103 >> 0x30) | bVar41;
                  bVar42 = (byte)((ulong)uVar103 >> 0x38) | bVar42;
                  bVar43 = (byte)uVar104 | bVar43;
                  bVar44 = (byte)((ulong)uVar104 >> 8) | bVar44;
                  bVar45 = (byte)((ulong)uVar104 >> 0x10) | bVar45;
                  bVar46 = (byte)((ulong)uVar104 >> 0x18) | bVar46;
                  bVar47 = (byte)((ulong)uVar104 >> 0x20) | bVar47;
                  bVar48 = (byte)((ulong)uVar104 >> 0x28) | bVar48;
                  bVar49 = (byte)((ulong)uVar104 >> 0x30) | bVar49;
                  bVar50 = (byte)((ulong)uVar104 >> 0x38) | bVar50;
                  bVar51 = (byte)uVar105 | bVar51;
                  bVar54 = (byte)((ulong)uVar105 >> 8) | bVar54;
                  bVar55 = (byte)((ulong)uVar105 >> 0x10) | bVar55;
                  bVar56 = (byte)((ulong)uVar105 >> 0x18) | bVar56;
                  bVar57 = (byte)((ulong)uVar105 >> 0x20) | bVar57;
                  bVar58 = (byte)((ulong)uVar105 >> 0x28) | bVar58;
                  bVar59 = (byte)((ulong)uVar105 >> 0x30) | bVar59;
                  bVar60 = (byte)((ulong)uVar105 >> 0x38) | bVar60;
                  bVar61 = (byte)uVar106 | bVar61;
                  bVar62 = (byte)((ulong)uVar106 >> 8) | bVar62;
                  bVar63 = (byte)((ulong)uVar106 >> 0x10) | bVar63;
                  bVar64 = (byte)((ulong)uVar106 >> 0x18) | bVar64;
                  bVar65 = (byte)((ulong)uVar106 >> 0x20) | bVar65;
                  bVar66 = (byte)((ulong)uVar106 >> 0x28) | bVar66;
                  bVar67 = (byte)((ulong)uVar106 >> 0x30) | bVar67;
                  bVar68 = (byte)((ulong)uVar106 >> 0x38) | bVar68;
                  bVar69 = (byte)uVar107 | (byte)uVar52;
                  bVar70 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar52 >> 8);
                  bVar71 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar52 >> 0x10);
                  bVar72 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar52 >> 0x18);
                  bVar73 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar52 >> 0x20);
                  bVar74 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar52 >> 0x28);
                  bVar75 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar52 >> 0x30);
                  bVar76 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar52 >> 0x38);
                  uVar52 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar108 | (byte)uVar11;
                  bVar78 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar11 >> 8);
                  bVar79 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar11 >> 0x10);
                  bVar80 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar11 >> 0x18);
                  bVar81 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar11 >> 0x20);
                  bVar82 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar11 >> 0x28);
                  bVar83 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar11 >> 0x30);
                  bVar84 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar11 >> 0x38);
                  uVar11 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
                                                  bVar80,CONCAT12(bVar79,CONCAT11(bVar78,bVar77)))))
                                                  ));
                  bVar85 = (byte)uVar109 | (byte)uVar86;
                  bVar87 = (byte)((ulong)uVar109 >> 8) | (byte)((ulong)uVar86 >> 8);
                  bVar88 = (byte)((ulong)uVar109 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
                  bVar89 = (byte)((ulong)uVar109 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
                  bVar90 = (byte)((ulong)uVar109 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
                  bVar91 = (byte)((ulong)uVar109 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
                  bVar92 = (byte)((ulong)uVar109 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
                  bVar93 = (byte)((ulong)uVar109 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
                  uVar86 = CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(
                                                  bVar89,CONCAT12(bVar88,CONCAT11(bVar87,bVar85)))))
                                                  ));
                  bVar94 = (byte)uVar110 | (byte)uVar95;
                  bVar96 = (byte)((ulong)uVar110 >> 8) | (byte)((ulong)uVar95 >> 8);
                  bVar97 = (byte)((ulong)uVar110 >> 0x10) | (byte)((ulong)uVar95 >> 0x10);
                  bVar98 = (byte)((ulong)uVar110 >> 0x18) | (byte)((ulong)uVar95 >> 0x18);
                  bVar99 = (byte)((ulong)uVar110 >> 0x20) | (byte)((ulong)uVar95 >> 0x20);
                  bVar100 = (byte)((ulong)uVar110 >> 0x28) | (byte)((ulong)uVar95 >> 0x28);
                  bVar101 = (byte)((ulong)uVar110 >> 0x30) | (byte)((ulong)uVar95 >> 0x30);
                  bVar102 = (byte)((ulong)uVar110 >> 0x38) | (byte)((ulong)uVar95 >> 0x38);
                  uVar95 = CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,
                                                  CONCAT13(bVar98,CONCAT12(bVar97,CONCAT11(bVar96,
                                                  bVar94)))))));
                  pauVar23 = pauVar23 + 4;
                  uVar19 = uVar19 - 0x40;
                } while (uVar19 != 0);
                auVar31[0] = bVar85 | bVar69 | bVar51 | bVar28;
                auVar31[1] = bVar87 | bVar70 | bVar54 | bVar36;
                auVar31[2] = bVar88 | bVar71 | bVar55 | bVar37;
                auVar31[3] = bVar89 | bVar72 | bVar56 | bVar38;
                auVar31[4] = bVar90 | bVar73 | bVar57 | bVar39;
                auVar31[5] = bVar91 | bVar74 | bVar58 | bVar40;
                auVar31[6] = bVar92 | bVar75 | bVar59 | bVar41;
                auVar31[7] = bVar93 | bVar76 | bVar60 | bVar42;
                auVar31[8] = bVar94 | bVar77 | bVar61 | bVar43;
                auVar31[9] = bVar96 | bVar78 | bVar62 | bVar44;
                auVar31[10] = bVar97 | bVar79 | bVar63 | bVar45;
                auVar31[0xb] = bVar98 | bVar80 | bVar64 | bVar46;
                auVar31[0xc] = bVar99 | bVar81 | bVar65 | bVar47;
                auVar31[0xd] = bVar100 | bVar82 | bVar66 | bVar48;
                auVar31[0xe] = bVar101 | bVar83 | bVar67 | bVar49;
                auVar31[0xf] = bVar102 | bVar84 | bVar68 | bVar50;
                auVar35 = NEON_ext(auVar31,auVar31,8,1);
                uVar19 = CONCAT17(auVar31[7] | auVar35[7],
                                  CONCAT16(auVar31[6] | auVar35[6],
                                           CONCAT15(auVar31[5] | auVar35[5],
                                                    CONCAT14(auVar31[4] | auVar35[4],
                                                             CONCAT13(auVar31[3] | auVar35[3],
                                                                      CONCAT12(auVar31[2] |
                                                                               auVar35[2],
                                                                               CONCAT11(auVar31[1] |
                                                                                        auVar35[1],
                                                                                        auVar31[0] |
                                                                                        auVar35[0]))
                                                                     )))));
                uVar19 = uVar19 | uVar19 >> 0x20;
                uVar19 = uVar19 | uVar19 >> 0x10;
                uVar21 = (uint)uVar19 | (uint)(uVar19 >> 8);
                bVar28 = (byte)uVar21;
                if (uVar16 != uVar17) {
                  if ((uVar16 & 0x38) != 0) goto code_r0x002fe95c;
                  lVar18 = (uVar12 - uVar17) + -0x20;
                  pbVar20 = *pauVar13 + (uVar17 | 0x20);
                  do {
                    uVar21 = *pbVar20 | uVar21;
                    lVar18 = lVar18 + -1;
                    pbVar20 = pbVar20 + 1;
                  } while (lVar18 != 0);
                }
              }
              if ((uVar21 & 0xff) != 0) goto code_r0x002fec40;
              if (uVar16 < 0x40) {
                bVar28 = 0;
                uVar17 = 0;
code_r0x002fea28:
                auVar34 = ZEXT116(bVar28);
                lVar6 = uVar17 + 0x20 + lVar6 * -8;
                puVar7 = (undefined8 *)(pauVar13[2] + uVar17);
                do {
                  uVar52 = *puVar7;
                  auVar34._0_8_ =
                       CONCAT17((byte)((ulong)uVar52 >> 0x38) | auVar34[7],
                                CONCAT16((byte)((ulong)uVar52 >> 0x30) | auVar34[6],
                                         CONCAT15((byte)((ulong)uVar52 >> 0x28) | auVar34[5],
                                                  CONCAT14((byte)((ulong)uVar52 >> 0x20) |
                                                           auVar34[4],
                                                           CONCAT13((byte)((ulong)uVar52 >> 0x18) |
                                                                    auVar34[3],
                                                                    CONCAT12((byte)((ulong)uVar52 >>
                                                                                   0x10) |
                                                                             auVar34[2],
                                                                             CONCAT11((byte)((ulong)
                                                  uVar52 >> 8) | auVar34[1],
                                                  (byte)uVar52 | auVar34[0])))))));
                  auVar34._8_8_ = 0;
                  lVar6 = lVar6 + 8;
                  puVar7 = puVar7 + 1;
                } while (lVar6 != 0);
                uVar16 = auVar34._0_8_ | auVar34._0_8_ >> 0x20;
                uVar16 = uVar16 | uVar16 >> 0x10;
                uVar21 = (uint)uVar16 | (uint)(uVar16 >> 8);
              }
              else {
                uVar17 = uVar16 & 0xffffffffffffffc0;
                pauVar23 = pauVar13 + 5;
                bVar28 = 0;
                bVar36 = 0;
                bVar37 = 0;
                bVar38 = 0;
                bVar39 = 0;
                bVar40 = 0;
                bVar41 = 0;
                bVar42 = 0;
                bVar43 = 0;
                bVar44 = 0;
                bVar45 = 0;
                bVar46 = 0;
                bVar47 = 0;
                bVar48 = 0;
                bVar49 = 0;
                bVar50 = 0;
                bVar51 = 0;
                bVar54 = 0;
                bVar55 = 0;
                bVar56 = 0;
                bVar57 = 0;
                bVar58 = 0;
                bVar59 = 0;
                bVar60 = 0;
                bVar61 = 0;
                bVar62 = 0;
                bVar63 = 0;
                bVar64 = 0;
                bVar65 = 0;
                bVar66 = 0;
                bVar67 = 0;
                bVar68 = 0;
                uVar52 = 0;
                uVar11 = 0;
                uVar86 = 0;
                uVar95 = 0;
                uVar19 = uVar17;
                do {
                  uVar104 = *(undefined8 *)(pauVar23[-3] + 8);
                  uVar103 = *(undefined8 *)pauVar23[-3];
                  uVar106 = *(undefined8 *)(pauVar23[-2] + 8);
                  uVar105 = *(undefined8 *)pauVar23[-2];
                  uVar108 = *(undefined8 *)(pauVar23[-1] + 8);
                  uVar107 = *(undefined8 *)pauVar23[-1];
                  uVar110 = *(undefined8 *)(*pauVar23 + 8);
                  uVar109 = *(undefined8 *)*pauVar23;
                  bVar28 = (byte)uVar103 | bVar28;
                  bVar36 = (byte)((ulong)uVar103 >> 8) | bVar36;
                  bVar37 = (byte)((ulong)uVar103 >> 0x10) | bVar37;
                  bVar38 = (byte)((ulong)uVar103 >> 0x18) | bVar38;
                  bVar39 = (byte)((ulong)uVar103 >> 0x20) | bVar39;
                  bVar40 = (byte)((ulong)uVar103 >> 0x28) | bVar40;
                  bVar41 = (byte)((ulong)uVar103 >> 0x30) | bVar41;
                  bVar42 = (byte)((ulong)uVar103 >> 0x38) | bVar42;
                  bVar43 = (byte)uVar104 | bVar43;
                  bVar44 = (byte)((ulong)uVar104 >> 8) | bVar44;
                  bVar45 = (byte)((ulong)uVar104 >> 0x10) | bVar45;
                  bVar46 = (byte)((ulong)uVar104 >> 0x18) | bVar46;
                  bVar47 = (byte)((ulong)uVar104 >> 0x20) | bVar47;
                  bVar48 = (byte)((ulong)uVar104 >> 0x28) | bVar48;
                  bVar49 = (byte)((ulong)uVar104 >> 0x30) | bVar49;
                  bVar50 = (byte)((ulong)uVar104 >> 0x38) | bVar50;
                  bVar51 = (byte)uVar105 | bVar51;
                  bVar54 = (byte)((ulong)uVar105 >> 8) | bVar54;
                  bVar55 = (byte)((ulong)uVar105 >> 0x10) | bVar55;
                  bVar56 = (byte)((ulong)uVar105 >> 0x18) | bVar56;
                  bVar57 = (byte)((ulong)uVar105 >> 0x20) | bVar57;
                  bVar58 = (byte)((ulong)uVar105 >> 0x28) | bVar58;
                  bVar59 = (byte)((ulong)uVar105 >> 0x30) | bVar59;
                  bVar60 = (byte)((ulong)uVar105 >> 0x38) | bVar60;
                  bVar61 = (byte)uVar106 | bVar61;
                  bVar62 = (byte)((ulong)uVar106 >> 8) | bVar62;
                  bVar63 = (byte)((ulong)uVar106 >> 0x10) | bVar63;
                  bVar64 = (byte)((ulong)uVar106 >> 0x18) | bVar64;
                  bVar65 = (byte)((ulong)uVar106 >> 0x20) | bVar65;
                  bVar66 = (byte)((ulong)uVar106 >> 0x28) | bVar66;
                  bVar67 = (byte)((ulong)uVar106 >> 0x30) | bVar67;
                  bVar68 = (byte)((ulong)uVar106 >> 0x38) | bVar68;
                  bVar69 = (byte)uVar107 | (byte)uVar52;
                  bVar70 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar52 >> 8);
                  bVar71 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar52 >> 0x10);
                  bVar72 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar52 >> 0x18);
                  bVar73 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar52 >> 0x20);
                  bVar74 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar52 >> 0x28);
                  bVar75 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar52 >> 0x30);
                  bVar76 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar52 >> 0x38);
                  uVar52 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar108 | (byte)uVar11;
                  bVar78 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar11 >> 8);
                  bVar79 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar11 >> 0x10);
                  bVar80 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar11 >> 0x18);
                  bVar81 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar11 >> 0x20);
                  bVar82 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar11 >> 0x28);
                  bVar83 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar11 >> 0x30);
                  bVar84 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar11 >> 0x38);
                  uVar11 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
                                                  bVar80,CONCAT12(bVar79,CONCAT11(bVar78,bVar77)))))
                                                  ));
                  bVar85 = (byte)uVar109 | (byte)uVar86;
                  bVar87 = (byte)((ulong)uVar109 >> 8) | (byte)((ulong)uVar86 >> 8);
                  bVar88 = (byte)((ulong)uVar109 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
                  bVar89 = (byte)((ulong)uVar109 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
                  bVar90 = (byte)((ulong)uVar109 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
                  bVar91 = (byte)((ulong)uVar109 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
                  bVar92 = (byte)((ulong)uVar109 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
                  bVar93 = (byte)((ulong)uVar109 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
                  uVar86 = CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(
                                                  bVar89,CONCAT12(bVar88,CONCAT11(bVar87,bVar85)))))
                                                  ));
                  bVar94 = (byte)uVar110 | (byte)uVar95;
                  bVar96 = (byte)((ulong)uVar110 >> 8) | (byte)((ulong)uVar95 >> 8);
                  bVar97 = (byte)((ulong)uVar110 >> 0x10) | (byte)((ulong)uVar95 >> 0x10);
                  bVar98 = (byte)((ulong)uVar110 >> 0x18) | (byte)((ulong)uVar95 >> 0x18);
                  bVar99 = (byte)((ulong)uVar110 >> 0x20) | (byte)((ulong)uVar95 >> 0x20);
                  bVar100 = (byte)((ulong)uVar110 >> 0x28) | (byte)((ulong)uVar95 >> 0x28);
                  bVar101 = (byte)((ulong)uVar110 >> 0x30) | (byte)((ulong)uVar95 >> 0x30);
                  bVar102 = (byte)((ulong)uVar110 >> 0x38) | (byte)((ulong)uVar95 >> 0x38);
                  uVar95 = CONCAT17(bVar102,CONCAT16(bVar101,CONCAT15(bVar100,CONCAT14(bVar99,
                                                  CONCAT13(bVar98,CONCAT12(bVar97,CONCAT11(bVar96,
                                                  bVar94)))))));
                  pauVar23 = pauVar23 + 4;
                  uVar19 = uVar19 - 0x40;
                } while (uVar19 != 0);
                auVar33[0] = bVar85 | bVar69 | bVar51 | bVar28;
                auVar33[1] = bVar87 | bVar70 | bVar54 | bVar36;
                auVar33[2] = bVar88 | bVar71 | bVar55 | bVar37;
                auVar33[3] = bVar89 | bVar72 | bVar56 | bVar38;
                auVar33[4] = bVar90 | bVar73 | bVar57 | bVar39;
                auVar33[5] = bVar91 | bVar74 | bVar58 | bVar40;
                auVar33[6] = bVar92 | bVar75 | bVar59 | bVar41;
                auVar33[7] = bVar93 | bVar76 | bVar60 | bVar42;
                auVar33[8] = bVar94 | bVar77 | bVar61 | bVar43;
                auVar33[9] = bVar96 | bVar78 | bVar62 | bVar44;
                auVar33[10] = bVar97 | bVar79 | bVar63 | bVar45;
                auVar33[0xb] = bVar98 | bVar80 | bVar64 | bVar46;
                auVar33[0xc] = bVar99 | bVar81 | bVar65 | bVar47;
                auVar33[0xd] = bVar100 | bVar82 | bVar66 | bVar48;
                auVar33[0xe] = bVar101 | bVar83 | bVar67 | bVar49;
                auVar33[0xf] = bVar102 | bVar84 | bVar68 | bVar50;
                auVar35 = NEON_ext(auVar33,auVar33,8,1);
                uVar19 = CONCAT17(auVar33[7] | auVar35[7],
                                  CONCAT16(auVar33[6] | auVar35[6],
                                           CONCAT15(auVar33[5] | auVar35[5],
                                                    CONCAT14(auVar33[4] | auVar35[4],
                                                             CONCAT13(auVar33[3] | auVar35[3],
                                                                      CONCAT12(auVar33[2] |
                                                                               auVar35[2],
                                                                               CONCAT11(auVar33[1] |
                                                                                        auVar35[1],
                                                                                        auVar33[0] |
                                                                                        auVar35[0]))
                                                                     )))));
                uVar19 = uVar19 | uVar19 >> 0x20;
                uVar19 = uVar19 | uVar19 >> 0x10;
                uVar21 = (uint)uVar19 | (uint)(uVar19 >> 8);
                bVar28 = (byte)uVar21;
                if (uVar16 != uVar17) {
                  if ((uVar16 & 0x38) != 0) goto code_r0x002fea28;
                  lVar6 = (uVar12 - uVar17) + -0x20;
                  pbVar20 = *pauVar13 + (uVar17 | 0x20);
                  do {
                    uVar21 = *pbVar20 | uVar21;
                    lVar6 = lVar6 + -1;
                    pbVar20 = pbVar20 + 1;
                  } while (lVar6 != 0);
                }
              }
              if ((uVar21 & 0xff) != 0) {
code_r0x002ff884:
                func_0x0079dae0();
                goto code_r0x002ff888;
              }
            }
            uVar16 = uVar12;
            if (0x1f < uVar12) {
              uVar16 = 0x20;
            }
            if (uVar16 != 0) {
              if ((acStack_7ffffffe + (0x8000137e - uVar16) < *pauVar13 + uVar16) &&
                 (pauVar13 < (undefined1 (*) [16])(acStack_7ffffffe + 0x8000137e))) {
                uVar19 = 0;
code_r0x002feaa4:
                lVar6 = uVar16 - uVar19;
                pcVar10 = *pauVar13 + uVar19;
                pcVar25 = acStack_7ffffffe + (0x8000137d - uVar19);
                do {
                  *pcVar25 = *pcVar10;
                  lVar6 = lVar6 + -1;
                  pcVar10 = pcVar10 + 1;
                  pcVar25 = pcVar25 + -1;
                } while (lVar6 != 0);
              }
              else {
                if (uVar16 < 0x10) {
                  uVar19 = 0;
                }
                else {
                  uVar19 = uVar16 & 0x30;
                  auVar35 = NEON_rev64(*pauVar13,1);
                  auVar35 = NEON_ext(auVar35,auVar35,8,1);
                  unaff_x25[0x6b] = auVar35._8_8_;
                  unaff_x25[0x6a] = auVar35._0_8_;
                  if (uVar19 != 0x10) {
                    auVar35 = NEON_rev64(pauVar13[1],1);
                    auVar35 = NEON_ext(auVar35,auVar35,8,1);
                    unaff_x25[0x69] = auVar35._8_8_;
                    unaff_x25[0x68] = auVar35._0_8_;
                  }
                  if (uVar16 == uVar19) goto code_r0x002feb44;
                  if (((uint)uVar16 >> 3 & 1) == 0) goto code_r0x002feaa4;
                }
                lVar6 = uVar16 - uVar19;
                puVar7 = (undefined8 *)(*pauVar13 + uVar19);
                pcVar10 = acStack_7ffffffe + (0x80001376 - uVar19);
                do {
                  uVar52 = NEON_rev64(*puVar7,1);
                  *(undefined8 *)pcVar10 = uVar52;
                  lVar6 = lVar6 + -8;
                  puVar7 = puVar7 + 1;
                  pcVar10 = pcVar10 + -8;
                } while (lVar6 != 0);
              }
            }
code_r0x002feb44:
            if (uVar12 < 0x20) {
              ___memset_chk(acStack_7ffffffe + 0x8000135e,0,0x20 - uVar16,0x20);
            }
            iVar4 = func_0x002fd75c(&UNK_00878915,acStack_7ffffffe + 0x8000133e,0x40,
                                    "ECDSA-sign signature");
            if (iVar4 == 0) goto code_r0x002fec40;
            func_0x002c398c(unaff_x20);
            unaff_x20 = (long *)func_0x0036e274(0x10);
            if (unaff_x20 == (long *)0x0) goto code_r0x002fec7c;
            lVar6 = func_0x0036e31c(0x18);
            if (lVar6 != 0) {
              *(undefined4 *)(lVar6 + 0x14) = 1;
            }
            *unaff_x20 = lVar6;
            lVar6 = func_0x0036e31c(0x18);
            if (lVar6 == 0) {
              unaff_x20[1] = 0;
code_r0x002fec70:
              func_0x002c398c(unaff_x20);
              unaff_x20 = (long *)0x0;
code_r0x002fec7c:
              func_0x002c398c(unaff_x20);
              unaff_x20 = (long *)0x0;
            }
            else {
              *(undefined4 *)(lVar6 + 0x14) = 1;
              unaff_x20[1] = lVar6;
              puVar7 = (undefined8 *)*unaff_x20;
              if (puVar7 == (undefined8 *)0x0) goto code_r0x002fec70;
              if (*(uint *)((long)puVar7 + 0xc) < 4) {
                if ((*(byte *)((long)puVar7 + 0x14) >> 1 & 1) == 0) {
                  puVar8 = (undefined8 *)func_0x0036e358(4,8,lVar6);
                  if (puVar8 != (undefined8 *)0x0) {
                    if (*(int *)(puVar7 + 1) != 0) {
                      _memcpy(puVar8,*puVar7,(long)*(int *)(puVar7 + 1) << 3);
                    }
                    func_0x0036e3d8(*puVar7);
                    *puVar7 = puVar8;
                    *(undefined4 *)((long)puVar7 + 0xc) = 4;
                    lVar6 = unaff_x20[1];
                    goto code_r0x002fecc4;
                  }
                }
                else {
                  func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
                }
                goto code_r0x002fec7c;
              }
              puVar8 = (undefined8 *)*puVar7;
code_r0x002fecc4:
              *(undefined4 *)(puVar7 + 1) = 4;
              *(undefined4 *)(puVar7 + 2) = 0;
              uVar86 = _UNK_0082ff28;
              uVar11 = _UNK_0082ff20;
              uVar52 = _UNK_0082ff10;
              puVar8[1] = _UNK_0082ff18;
              *puVar8 = uVar52;
              puVar8[3] = uVar86;
              puVar8[2] = uVar11;
              lVar6 = func_0x0029c764(&UNK_00878995,0x20,lVar6);
              if (lVar6 == 0) goto code_r0x002fec7c;
              func_0x00373e9c(0xa296c8,&DAT_002c21e4);
              in_stack_00000d20 = 0x40;
              iVar4 = func_0x002c0d58(&UNK_00878955,0x20,acStack_7ffffffe + 0x8000069e,
                                      acStack_7ffffffe + 0x80000d1e,0xa3a728,0);
              if ((iVar4 != 0) &&
                 (iVar4 = func_0x002c3b08(acStack_7ffffffe + 0x8000069e,0x40,unaff_x20,pcVar26),
                 iVar4 != 0)) {
                func_0x00373e9c(0xa29738,&DAT_002c54ec);
                puVar7 = (undefined8 *)func_0x0036e274(0xe0);
                if (puVar7 != (undefined8 *)0x0) {
                  uVar52 = func_0x002c6ae8(0xa3b640);
                  *puVar7 = uVar52;
                  puVar7[2] = 0;
                  puVar7[1] = 0;
                  puVar7[4] = 0;
                  puVar7[3] = 0;
                  puVar7[6] = 0;
                  puVar7[5] = 0;
                  puVar7[8] = 0;
                  puVar7[7] = 0;
                  puVar7[9] = 0;
                  puVar7[0xb] = 0;
                  puVar7[10] = 0;
                  puVar7[0xd] = 0;
                  puVar7[0xc] = 0;
                  puVar7[0xf] = 0;
                  puVar7[0xe] = 0;
                  puVar7[0x11] = 0;
                  puVar7[0x10] = 0;
                  puVar7[0x12] = 0;
                  puVar7[0x14] = 0;
                  puVar7[0x13] = 0;
                  puVar7[0x16] = 0;
                  puVar7[0x15] = 0;
                  puVar7[0x18] = 0;
                  puVar7[0x17] = 0;
                  puVar7[0x1a] = 0;
                  puVar7[0x19] = 0;
                  puVar7[0x1b] = 0;
                }
                puVar8 = (undefined8 *)func_0x0036e274(0xe0);
                if (puVar8 != (undefined8 *)0x0) {
                  uVar52 = func_0x002c6ae8(0xa3b640);
                  *puVar8 = uVar52;
                  puVar8[2] = 0;
                  puVar8[1] = 0;
                  puVar8[4] = 0;
                  puVar8[3] = 0;
                  puVar8[6] = 0;
                  puVar8[5] = 0;
                  puVar8[8] = 0;
                  puVar8[7] = 0;
                  puVar8[9] = 0;
                  puVar8[0xb] = 0;
                  puVar8[10] = 0;
                  puVar8[0xd] = 0;
                  puVar8[0xc] = 0;
                  puVar8[0xf] = 0;
                  puVar8[0xe] = 0;
                  puVar8[0x11] = 0;
                  puVar8[0x10] = 0;
                  puVar8[0x12] = 0;
                  puVar8[0x14] = 0;
                  puVar8[0x13] = 0;
                  puVar8[0x16] = 0;
                  puVar8[0x15] = 0;
                  puVar8[0x18] = 0;
                  puVar8[0x17] = 0;
                  puVar8[0x1a] = 0;
                  puVar8[0x19] = 0;
                  puVar8[0x1b] = 0;
                }
                puVar9 = (undefined8 *)func_0x0036e31c(0x18);
                if ((((puVar9 == (undefined8 *)0x0) ||
                     (*(undefined4 *)((long)puVar9 + 0x14) = 1, puVar7 == (undefined8 *)0x0)) ||
                    (puVar8 == (undefined8 *)0x0)) ||
                   (((iVar4 = func_0x002d2dc0(0xa3b640,puVar7,&UNK_008789b5,0x41,0), iVar4 == 0 ||
                     (lVar6 = func_0x0029c764(&UNK_008789f6,0x20,puVar9), lVar6 == 0)) ||
                    ((iVar4 = func_0x002c98a8(0xa3b640,puVar8,0,puVar7,puVar9,0), iVar4 == 0 ||
                     ((lVar6 = func_0x002cb544(0xa3b640,puVar8,4,acStack_7ffffffe + 0x8000165e,0x41)
                      , lVar6 == 0 ||
                      (iVar4 = func_0x002fd75c(&UNK_00878a16,acStack_7ffffffe + 0x8000165e,0x41,
                                               "Z Computation Result"), iVar4 == 0)))))))) {
                  _fwrite("Z-computation KAT failed.\n",0x1a,1,*unaff_x24);
                  func_0x002c3420(pcVar26);
                  pcVar26 = (char *)0x0;
                  pcVar10 = (char *)0x0;
                  if (puVar7 != (undefined8 *)0x0) goto code_r0x002fefa8;
                }
                else {
                  func_0x002c3420(pcVar26);
                  pcVar10 = (char *)((long)&MACH_HEADER.magic + 1);
code_r0x002fefa8:
                  pcVar26 = pcVar10;
                  func_0x002c6434(*puVar7);
                  func_0x0036e3d8(puVar7);
                }
                if (puVar8 != (undefined8 *)0x0) {
                  func_0x002c6434(*puVar8);
                  func_0x0036e3d8(puVar8);
                }
                if (puVar9 != (undefined8 *)0x0) {
                  uVar21 = *(uint *)((long)puVar9 + 0x14);
                  if ((uVar21 >> 1 & 1) == 0) {
                    func_0x0036e3d8(*puVar9);
                    uVar21 = *(uint *)((long)puVar9 + 0x14);
                  }
                  if ((uVar21 & 1) == 0) {
                    *puVar9 = 0;
                  }
                  else {
                    func_0x0036e3d8(puVar9);
                  }
                }
                func_0x002c398c(unaff_x20);
                if ((int)pcVar26 != 0) {
                  pcVar26 = (char *)func_0x0036e31c(0x18);
                  if (pcVar26 != (char *)0x0) {
                    *(undefined4 *)(pcVar26 + 0x14) = 1;
                    func_0x0036e3d8(*(undefined8 *)pcVar26);
                    *(undefined **)pcVar26 = &UNK_00878ab8;
                    *(qword *)(pcVar26 + 8) = 0x2000000020;
                    *(undefined4 *)(pcVar26 + 0x10) = 0;
                    *(uint *)(pcVar26 + 0x14) = *(uint *)(pcVar26 + 0x14) | 2;
                  }
                  unaff_x20 = (long *)func_0x002c0f98(&UNK_00831198,0x20);
                  if (unaff_x20 == (long *)0x0) goto code_r0x002ff104;
                  puVar7 = (undefined8 *)func_0x0036e31c(0x18);
                  if (puVar7 == (undefined8 *)0x0) goto code_r0x002ff0fc;
                  *(undefined4 *)((long)puVar7 + 0x14) = 1;
                  func_0x0036e3d8(*puVar7);
                  *puVar7 = &UNK_00878eb8;
                  puVar7[1] = 0x400000004;
                  *(undefined4 *)(puVar7 + 2) = 0;
                  *(uint *)((long)puVar7 + 0x14) = *(uint *)((long)puVar7 + 0x14) | 2;
                  puVar8 = (undefined8 *)unaff_x20[4];
                  if (puVar8 != (undefined8 *)0x0) {
                    uVar21 = *(uint *)((long)puVar8 + 0x14);
                    if ((uVar21 >> 1 & 1) == 0) {
                      func_0x0036e3d8(*puVar8);
                      uVar21 = *(uint *)((long)puVar8 + 0x14);
                    }
                    if ((uVar21 & 1) == 0) {
                      *puVar8 = 0;
                    }
                    else {
                      func_0x0036e3d8(puVar8);
                    }
                  }
                  unaff_x20[4] = (long)puVar7;
                  if (pcVar26 == (char *)0x0) goto code_r0x002ff108;
                  plVar14 = (long *)*unaff_x20;
                  uVar3 = *(uint *)(plVar14 + 1);
                  uVar12 = (ulong)uVar3;
                  uVar21 = uVar3 & (int)uVar3 >> 0x1f;
                  lVar6 = uVar12 * 8;
                  do {
                    lVar6 = lVar6 + -8;
                    uVar22 = (uint)uVar12;
                    uVar12 = (ulong)(uVar22 - 1);
                    if ((int)uVar22 < 1) {
                      if (-1 < (int)uVar3) goto code_r0x002ff108;
                      lVar18 = *plVar14;
                      goto code_r0x002ff66c;
                    }
                    lVar18 = *plVar14;
                  } while (*(long *)(lVar18 + lVar6) == 0);
                  uVar21 = uVar22;
code_r0x002ff66c:
                  uVar16 = *(ulong *)(lVar18 + (long)(int)(uVar21 - 1) * 8);
                  uVar19 = uVar16 >> 0x20;
                  uVar12 = uVar19;
                  if (uVar19 == 0) {
                    uVar12 = uVar16;
                  }
                  uVar24 = uVar12 >> 0x10;
                  uVar17 = uVar24;
                  if (uVar24 == 0) {
                    uVar17 = uVar12;
                  }
                  uVar12 = uVar17 >> 8;
                  if (uVar17 < 0x100) {
                    uVar12 = uVar17;
                  }
                  uVar1 = uVar12 >> 4;
                  if (uVar12 < 0x10) {
                    uVar1 = uVar12;
                  }
                  uVar2 = uVar1 >> 2;
                  if (uVar1 < 4) {
                    uVar2 = uVar1;
                  }
                  uVar21 = (uint)(uVar16 != 0) | (uVar21 - 1) * 0x40 | (uint)(uVar19 != 0) << 5 |
                           (uint)(uVar24 != 0) << 4 | (uint)(0xff < uVar17) << 3 |
                           (uint)(0xf < uVar12) << 2 | (uint)(3 < uVar1) << 1;
                  if (1 < uVar2) {
                    uVar21 = uVar21 + 1;
                  }
                  if ((uVar21 + 7 & 0xfffffff8) != 0x800) goto code_r0x002ff108;
                  iVar4 = func_0x002c0134(acStack_7ffffffe + 0x8000165e,pcVar26,unaff_x20);
                  if (iVar4 != 0x100) goto code_r0x002ff108;
                  iVar4 = func_0x002fd75c(&UNK_00878bb8,acStack_7ffffffe + 0x8000165e,0x100,"FFC DH"
                                         );
                  if (iVar4 == 0) goto code_r0x002ff108;
                  puVar7 = (undefined8 *)func_0x0029c764(&UNK_00878cb8,0x100,0);
                  plVar14 = (long *)func_0x0036e31c(0x108);
                  if (plVar14 != (long *)0x0) {
                    func_0x00373d98(plVar14 + 6);
                    *(undefined4 *)((long)plVar14 + 0x104) = 1;
                    lVar6 = func_0x0029c764(&UNK_00878ed8,0x100,0);
                    *plVar14 = lVar6;
                    if (lVar6 != 0) {
                      lVar6 = func_0x0029c764(&UNK_00878fd8,0x1c,0);
                      plVar14[2] = lVar6;
                      if (lVar6 != 0) {
                        lVar6 = func_0x0029c764(&UNK_00878ff4,0x100,0);
                        plVar14[1] = lVar6;
                        if (lVar6 != 0) {
                          lVar6 = func_0x0029c764(&UNK_008790f4,0x1c,0);
                          plVar14[4] = lVar6;
                          if (lVar6 != 0) {
                            lVar6 = func_0x0029c764(&UNK_00879110,0x100,0);
                            plVar14[3] = lVar6;
                            if (lVar6 != 0) {
                              if (puVar7 != (undefined8 *)0x0) {
                                plVar15 = (long *)*plVar14;
                                uVar3 = *(uint *)(plVar15 + 1);
                                uVar12 = (ulong)uVar3;
                                uVar21 = uVar3 & (int)uVar3 >> 0x1f;
                                lVar6 = uVar12 * 8;
                                do {
                                  lVar6 = lVar6 + -8;
                                  uVar22 = (uint)uVar12;
                                  uVar12 = (ulong)(uVar22 - 1);
                                  if ((int)uVar22 < 1) {
                                    if (-1 < (int)uVar3) goto code_r0x002ff860;
                                    lVar18 = *plVar15;
                                    goto code_r0x002ff904;
                                  }
                                  lVar18 = *plVar15;
                                } while (*(long *)(lVar18 + lVar6) == 0);
                                uVar21 = uVar22;
code_r0x002ff904:
                                uVar16 = *(ulong *)(lVar18 + (long)(int)(uVar21 - 1) * 8);
                                uVar19 = uVar16 >> 0x20;
                                uVar12 = uVar19;
                                if (uVar19 == 0) {
                                  uVar12 = uVar16;
                                }
                                uVar24 = uVar12 >> 0x10;
                                uVar17 = uVar24;
                                if (uVar24 == 0) {
                                  uVar17 = uVar12;
                                }
                                uVar12 = uVar17 >> 8;
                                if (uVar17 < 0x100) {
                                  uVar12 = uVar17;
                                }
                                uVar1 = uVar12 >> 4;
                                if (uVar12 < 0x10) {
                                  uVar1 = uVar12;
                                }
                                uVar2 = uVar1 >> 2;
                                if (uVar1 < 4) {
                                  uVar2 = uVar1;
                                }
                                uVar21 = (uint)(uVar16 != 0) | (uVar21 - 1) * 0x40 |
                                         (uint)(uVar19 != 0) << 5 | (uint)(uVar24 != 0) << 4 |
                                         (uint)(0xff < uVar17) << 3 | (uint)(0xf < uVar12) << 2 |
                                         (uint)(3 < uVar1) << 1;
                                if (1 < uVar2) {
                                  uVar21 = uVar21 + 1;
                                }
                                if ((((uVar21 + 7 & 0xfffffff8) == 0x800) &&
                                    (iVar4 = func_0x002c0134(acStack_7ffffffe + 0x8000069e,puVar7,
                                                             plVar14), iVar4 == 0x100)) &&
                                   (iVar4 = func_0x002fd75c(&UNK_00878db8,
                                                            acStack_7ffffffe + 0x8000069e,0x100,
                                                            "FFC DH FB"), iVar4 != 0)) {
                                  bVar27 = false;
                                  goto code_r0x002ff12c;
                                }
                              }
                              goto code_r0x002ff860;
                            }
                          }
                        }
                      }
                    }
                  }
                  func_0x002bf97c(plVar14);
                  plVar14 = (long *)0x0;
code_r0x002ff860:
                  bVar27 = true;
                  _fwrite("FFDH FB failed.\n",0x10,1,*unaff_x24);
                  goto code_r0x002ff12c;
                }
                goto code_r0x002fdd0c;
              }
            }
            uVar11 = *unaff_x24;
            pcVar10 = "ECDSA-verify KAT failed.\n";
            uVar52 = 0x19;
          }
          _fwrite(pcVar10,uVar52,1,uVar11);
        }
        func_0x002c3420(pcVar26);
        func_0x002c398c(unaff_x20);
        goto code_r0x002fdd0c;
      }
      uVar11 = *unaff_x24;
      pcVar10 = "RSA-verify KAT failed.\n";
      uVar52 = 0x17;
    }
    _fwrite(pcVar10,uVar52,1,uVar11);
  }
  func_0x002f7efc(pcVar26);
code_r0x002fdd0c:
  do {
    uVar52 = 0;
    while( true ) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return;
      }
      ___stack_chk_fail(uVar52);
code_r0x002ff0fc:
      func_0x002bf97c(unaff_x20);
code_r0x002ff104:
      unaff_x20 = (long *)0x0;
code_r0x002ff108:
      bVar27 = true;
      _fwrite("FFDH failed.\n",0xd,1,*unaff_x24);
      puVar7 = (undefined8 *)0x0;
      plVar14 = (long *)0x0;
code_r0x002ff12c:
      func_0x002bf97c(unaff_x20);
      if (pcVar26 != (char *)0x0) {
        uVar21 = *(uint *)(pcVar26 + 0x14);
        if ((uVar21 >> 1 & 1) == 0) {
          func_0x0036e3d8(*(undefined8 *)pcVar26);
          uVar21 = *(uint *)(pcVar26 + 0x14);
        }
        if ((uVar21 & 1) == 0) {
          pcVar26[0] = '\0';
          pcVar26[1] = '\0';
          pcVar26[2] = '\0';
          pcVar26[3] = '\0';
          pcVar26[4] = '\0';
          pcVar26[5] = '\0';
          pcVar26[6] = '\0';
          pcVar26[7] = '\0';
        }
        else {
          func_0x0036e3d8(pcVar26);
        }
      }
      func_0x002bf97c(plVar14);
      if (puVar7 != (undefined8 *)0x0) {
        uVar21 = *(uint *)((long)puVar7 + 0x14);
        if ((uVar21 >> 1 & 1) == 0) {
          func_0x0036e3d8(*puVar7);
          uVar21 = *(uint *)((long)puVar7 + 0x14);
        }
        if ((uVar21 & 1) == 0) {
          *puVar7 = 0;
        }
        else {
          func_0x0036e3d8(puVar7);
        }
      }
      if (bVar27) break;
      unaff_x20 = (long *)(acStack_7ffffffe + 0x8000165e);
      _bzero(acStack_7ffffffe + 0x8000165e,0x660);
      _bzero(acStack_7ffffffe + 0x8000133e,800);
      uVar11 = _UNK_007fc2c8;
      uVar52 = _UNK_007fc2c0;
      unaff_x25[0x1a5] = _UNK_007fc2c8;
      unaff_x25[0x1a4] = uVar52;
      uVar95 = _UNK_0082fd28;
      uVar86 = _UNK_0082fd20;
      unaff_x25[0x1a7] = _UNK_0082fd28;
      unaff_x25[0x1a6] = uVar86;
      uVar104 = _UNK_0082fd38;
      uVar103 = _UNK_0082fd30;
      unaff_x25[0x1a9] = _UNK_0082fd38;
      unaff_x25[0x1a8] = uVar103;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      uVar106 = _UNK_0082fd48;
      uVar105 = _UNK_0082fd40;
      unaff_x25[0x1ad] = _UNK_0082fd48;
      unaff_x25[0x1ac] = uVar105;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      pcVar26 = &UNK_00879210;
      func_0x002e0668(unaff_x29 + -0xb0,acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000165e,
                      &UNK_00879210);
      _memcpy(acStack_7ffffffe + 0x8000195e,acStack_7ffffffe + 0x8000133e,800);
      func_0x002eafd4(acStack_7ffffffe + 0x8000133e,800,acStack_7ffffffe + 0x80001c7e);
      uVar109 = _UNK_00879248;
      uVar108 = _UNK_00879240;
      uVar107 = _UNK_00879230;
      unaff_x25[0x191] = _UNK_00879238;
      unaff_x25[400] = uVar107;
      unaff_x25[0x193] = uVar109;
      unaff_x25[0x192] = uVar108;
      iVar4 = func_0x002fd75c(&UNK_00879570,acStack_7ffffffe + 0x8000165e,0x660,
                              "ML-KEM keyGen decaps");
      if ((iVar4 == 0) ||
         (iVar4 = func_0x002fd75c(&UNK_00879250,acStack_7ffffffe + 0x8000133e,800,
                                  "ML-KEM keyGen encaps"), iVar4 == 0)) break;
      _memcpy(acStack_7ffffffe + 0x8000101e,&UNK_00879bd0,800);
      _bzero(acStack_7ffffffe + 0x80000d1e,0x300);
      unaff_x25[0x1a5] = uVar11;
      unaff_x25[0x1a4] = uVar52;
      unaff_x25[0x1a7] = uVar95;
      unaff_x25[0x1a6] = uVar86;
      unaff_x25[0x1a9] = uVar104;
      unaff_x25[0x1a8] = uVar103;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar106;
      unaff_x25[0x1ac] = uVar105;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      uVar109 = _UNK_00879f08;
      uVar108 = _UNK_00879f00;
      uVar107 = _UNK_00879ef0;
      unaff_x25[0x19d] = _UNK_00879ef8;
      unaff_x25[0x19c] = uVar107;
      unaff_x25[0x19f] = uVar109;
      unaff_x25[0x19e] = uVar108;
      func_0x002eafd4(acStack_7ffffffe + 0x8000101e,800,unaff_x29 + -0xd0);
      pcVar26 = acStack_7ffffffe + 0x80001cbe;
      func_0x002e345c(unaff_x29 + -0xf0,0x40,acStack_7ffffffe + 0x80001cbe);
      func_0x002e5194(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000d1e,unaff_x29 + -0xf0,
                      acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80001cde);
      uVar107 = unaff_x25[0x194];
      unaff_x26[0xcd] = unaff_x25[0x195];
      unaff_x26[0xcc] = uVar107;
      auVar35 = *(undefined1 (*) [16])(unaff_x25 + 0x196);
      unaff_x26[0xcf] = auVar35._8_8_;
      unaff_x26[0xce] = auVar35._0_8_;
      func_0x0036e464(unaff_x29 + -0xf0,0x40);
      func_0x0036e464(acStack_7ffffffe + 0x80001cbe,0x40);
      iVar4 = func_0x002fd75c(&UNK_00879f10,acStack_7ffffffe + 0x80000d1e,0x300,
                              "ML-KEM encapsulate ciphertext");
      if ((iVar4 == 0) ||
         (iVar4 = func_0x002fd75c(&UNK_0087a210,acStack_7ffffffe + 0x80000cfe,0x20,
                                  "ML-KEM encapsulate shared secret"), iVar4 == 0)) break;
      _memcpy(acStack_7ffffffe + 0x8000069e,&UNK_0087a230,0x660);
      pcVar26 = section_000002e8.segname + 8;
      _memcpy(acStack_7ffffffe + 0x8000039e,&UNK_0087a890,0x300);
      _memcpy(&uStack00000000000000a0,&UNK_0087abb0,0x300);
      unaff_x25[0x1a5] = uVar11;
      unaff_x25[0x1a4] = uVar52;
      unaff_x25[0x1a7] = uVar95;
      unaff_x25[0x1a6] = uVar86;
      unaff_x25[0x1a9] = uVar104;
      unaff_x25[0x1a8] = uVar103;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar106;
      unaff_x25[0x1ac] = uVar105;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar4 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                              acStack_7ffffffe + 0x8000039e,acStack_7ffffffe + 0x8000069e);
      if ((iVar4 != 0) ||
         (iVar4 = func_0x002fd75c(&UNK_0087ab90,acStack_7ffffffe + 0x80000cfe,0x20,
                                  "ML-KEM decapsulate non-rejection"), iVar4 == 0)) break;
      unaff_x25[0x1a5] = uVar11;
      unaff_x25[0x1a4] = uVar52;
      unaff_x25[0x1a7] = uVar95;
      unaff_x25[0x1a6] = uVar86;
      unaff_x25[0x1a9] = uVar104;
      unaff_x25[0x1a8] = uVar103;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar106;
      unaff_x25[0x1ac] = uVar105;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar4 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                              &uStack00000000000000a0,acStack_7ffffffe + 0x8000069e);
      if (iVar4 != 0) break;
      uVar52 = func_0x002fd75c(&UNK_0087aeb0,acStack_7ffffffe + 0x80000cfe,0x20,
                               "ML-KEM decapsulate implicit rejection");
      uVar106 = _UNK_0087afa8;
      uVar105 = _UNK_0087afa0;
      uVar104 = _UNK_0087af90;
      uVar103 = _UNK_0087af08;
      uVar95 = _UNK_0087af00;
      uVar86 = _UNK_0087aef8;
      uVar11 = _UNK_0087aef0;
      if ((int)uVar52 != 0) {
        in_stack_000000a8 = _UNK_0087aef8;
        uStack00000000000000a0 = _UNK_0087aef0;
        in_stack_000000b8 = _UNK_0087af08;
        in_stack_000000b0 = _UNK_0087af00;
        unaff_x25[0xd1] = _UNK_0087af98;
        unaff_x25[0xd0] = uVar104;
        unaff_x25[0xd3] = uVar106;
        unaff_x25[0xd2] = uVar105;
        uVar105 = _UNK_0087afc8;
        uVar104 = _UNK_0087afc0;
        uVar52 = _UNK_0087afb0;
        unaff_x25[0xd5] = _UNK_0087afb8;
        unaff_x25[0xd4] = uVar52;
        unaff_x25[0xd7] = uVar105;
        unaff_x25[0xd6] = uVar104;
        uVar105 = _UNK_0087af68;
        uVar104 = _UNK_0087af60;
        uVar52 = _UNK_0087af50;
        unaff_x25[0xc9] = _UNK_0087af58;
        unaff_x25[200] = uVar52;
        unaff_x25[0xcb] = uVar105;
        unaff_x25[0xca] = uVar104;
        uVar105 = _UNK_0087af88;
        uVar104 = _UNK_0087af80;
        uVar52 = _UNK_0087af70;
        unaff_x25[0xcd] = _UNK_0087af78;
        unaff_x25[0xcc] = uVar52;
        unaff_x25[0xcf] = uVar105;
        unaff_x25[0xce] = uVar104;
        uVar105 = _UNK_0087aee8;
        uVar104 = _UNK_0087aee0;
        uVar52 = _UNK_0087aed0;
        unaff_x26[1] = _UNK_0087aed8;
        *unaff_x26 = uVar52;
        unaff_x26[3] = uVar105;
        unaff_x26[2] = uVar104;
        unaff_x26[5] = uVar86;
        unaff_x26[4] = uVar11;
        unaff_x26[7] = uVar103;
        unaff_x26[6] = uVar95;
        unaff_x25[0x69] = 0;
        unaff_x25[0x68] = 0;
        unaff_x25[0x6b] = 0;
        unaff_x25[0x6a] = 0;
        unaff_x25[0x65] = 0;
        unaff_x25[100] = 0;
        unaff_x25[0x67] = 0;
        unaff_x25[0x66] = 0;
        func_0x002b64bc(acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000165e,0x80,
                        acStack_7ffffffe + 0x8000069e);
        iVar4 = func_0x002fd75c(&UNK_0087af10,acStack_7ffffffe + 0x8000133e,0x40,"ED25519 sign");
        if (iVar4 == 0) goto code_r0x002ff888;
        unaff_x25[1] = unaff_x25[0x65];
        *unaff_x25 = unaff_x25[100];
        unaff_x25[3] = unaff_x25[0x67];
        unaff_x25[2] = unaff_x25[0x66];
        auVar53 = *(undefined1 (*) [16])(unaff_x25 + 0x68);
        auVar35 = *(undefined1 (*) [16])(unaff_x25 + 0x6a);
        unaff_x26[0xd3] = auVar35._8_8_;
        unaff_x26[0xd2] = auVar35._0_8_;
        unaff_x26[0xd1] = auVar53._8_8_;
        unaff_x26[0xd0] = auVar53._0_8_;
        if ((((0x1f < *(byte *)((long)unaff_x25 + 0x35f)) ||
             (0x1000000000000000 < in_stack_00000d38)) ||
            ((in_stack_00000d38 >> 0x3c != 0 &&
             (((in_stack_00000d30 != 0 || (0x14def9dea2f79cd6 < in_stack_00000d28)) ||
              ((in_stack_00000d28 == 0x14def9dea2f79cd6 &&
               (0x5812631a5cf5d3ec < CONCAT44(in_stack_00000d24,in_stack_00000d20))))))))) ||
           ((iVar4 = func_0x002b6a60(acStack_7ffffffe + 0x8000039e,&uStack00000000000000a0,
                                     acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80000d1e,
                                     acStack_7ffffffe + 0x8000165e,0x80), iVar4 == 0 ||
            (iVar4 = func_0x0036e62c(acStack_7ffffffe + 0x8000039e,acStack_7ffffffe + 0x8000101e,
                                     0x20), iVar4 != 0)))) {
          uVar11 = *unaff_x24;
          pcVar10 = "ED25519 verify failed.\n";
          uVar52 = 0x17;
          goto code_r0x002ff8f0;
        }
        uVar52 = 1;
      }
    }
  } while( true );
code_r0x002ff888:
  uVar11 = *unaff_x24;
  pcVar10 = "ED25519 sign failed.\n";
  uVar52 = 0x15;
code_r0x002ff8f0:
  _fwrite(pcVar10,uVar52,1,uVar11);
  goto code_r0x002fdd0c;
}

