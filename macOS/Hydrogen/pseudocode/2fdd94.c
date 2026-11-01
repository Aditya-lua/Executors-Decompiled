
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002fdd94(void)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  int iVar4;
  char *pcVar5;
  qword qVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  char *pcVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  ulong uVar14;
  undefined1 (*pauVar15) [16];
  long *plVar16;
  long *plVar17;
  ulong uVar18;
  ulong uVar19;
  long lVar20;
  ulong uVar21;
  byte *pbVar22;
  uint uVar23;
  uint uVar24;
  undefined1 (*pauVar25) [16];
  ulong uVar26;
  char *pcVar27;
  uint *unaff_x19;
  long *unaff_x20;
  bool bVar28;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x29;
  byte bVar29;
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
  byte bVar50;
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  byte bVar51;
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  byte bVar52;
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
  undefined8 uStack0000000000000078;
  undefined1 uStack0000000000000080;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined4 uStack00000000000000c8;
  undefined4 uStack00000000000000cc;
  undefined4 uStack00000000000000d0;
  undefined8 uStack00000000000000d4;
  long in_stack_000006a0;
  undefined4 in_stack_00000d20;
  undefined4 in_stack_00000d24;
  ulong in_stack_00000d28;
  long in_stack_00000d30;
  ulong in_stack_00000d38;
  long in_stack_00001660;
  char acStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
  func_0x0029833c();
  iVar4 = func_0x002fd75c(&UNK_00877cd8,acStack_7ffffffe + 0x8000101e,0x20,"AES-CBC-encrypt KAT");
  if (iVar4 == 0) goto LAB_002fe444;
  uStack0000000000000090 = 0;
  in_stack_00000098 = 0;
  if ((*unaff_x19 >> 2 & 1) != 0) {
    iVar4 = func_0x00378700(&UNK_00877ca8,0x80,acStack_7ffffffe + 0x8000039e);
joined_r0x002fde48:
    if (iVar4 == 0) goto LAB_002fde64;
LAB_002fd9f0:
    uVar13 = *unaff_x24;
    pcVar11 = "AES_set_decrypt_key failed.\n";
    uVar12 = 0x1c;
    goto LAB_002fd9f8;
  }
  if ((*unaff_x19 & 1) != 0) {
    iVar4 = func_0x0038a680(&UNK_00877ca8,0x80,acStack_7ffffffe + 0x8000039e);
    goto joined_r0x002fde48;
  }
  iVar4 = func_0x00296a94();
  if (iVar4 != 0) goto LAB_002fd9f0;
LAB_002fde64:
  func_0x002998fc(&UNK_00877cf8,acStack_7ffffffe + 0x8000101e,0x20,acStack_7ffffffe + 0x8000039e,
                  &uStack0000000000000090,0);
  iVar4 = func_0x002fd75c(&UNK_00877d18,acStack_7ffffffe + 0x8000101e,0x20,"AES-CBC-decrypt KAT");
  if (iVar4 == 0) goto LAB_002fe444;
  func_0x00373e9c(0xa29688,&DAT_002b4924);
  if (pcRam0000000000a3aa18 == (code *)0x0) {
    uVar12 = 0x7c;
    uVar13 = 0x46;
LAB_002fdfb0:
    func_0x0028f83c(0x1e,0,uVar12,"/aws-lc/crypto/fipsmodule/cipher/aead.c",uVar13);
LAB_002fdfb4:
    in_stack_00001660 = 0;
    uVar13 = *unaff_x24;
    pcVar11 = "EVP_AEAD_CTX_init for AES-128-GCM failed.\n";
code_r0x002fdfc4:
    uVar12 = 0x2a;
LAB_002fd9f8:
    pcVar5 = (char *)((long)&MACH_HEADER.magic + 1);
    _fwrite(pcVar11,uVar12,1,uVar13);
  }
  else {
    if (cRam0000000000a3aa08 != '\x10') {
      uVar12 = 0x78;
      uVar13 = 0x54;
      goto LAB_002fdfb0;
    }
    in_stack_00001660 = 0xa3aa08;
    iVar4 = (*pcRam0000000000a3aa18)(acStack_7ffffffe + 0x8000165e,&UNK_00877ca8,0x10,0);
    if (iVar4 == 0) goto LAB_002fdfb4;
    func_0x00373e9c(0xa29688,&DAT_002b4924);
    if ((acStack_7ffffffe + 0x8000101e < &UNK_00877d58) &&
       (&UNK_00877d38 < acStack_7ffffffe + 0x8000111e)) {
      func_0x0028f83c(0x1e,0,0x73,"/aws-lc/crypto/fipsmodule/cipher/aead.c",0x8c);
LAB_002fe44c:
      unaff_x26[0x14f] = 0;
      unaff_x26[0x14e] = 0;
      unaff_x26[0x14d] = 0;
      unaff_x26[0x14c] = 0;
      unaff_x26[0x14b] = 0;
      unaff_x26[0x14a] = 0;
      unaff_x26[0x149] = 0;
      unaff_x26[0x148] = 0;
      unaff_x26[0x147] = 0;
      unaff_x26[0x146] = 0;
      unaff_x26[0x145] = 0;
      unaff_x26[0x144] = 0;
      unaff_x26[0x143] = 0;
      unaff_x26[0x142] = 0;
      unaff_x26[0x141] = 0;
      unaff_x26[0x140] = 0;
      unaff_x26[0x13f] = 0;
      unaff_x26[0x13e] = 0;
      unaff_x26[0x13d] = 0;
      unaff_x26[0x13c] = 0;
      unaff_x26[0x13b] = 0;
      unaff_x26[0x13a] = 0;
      unaff_x26[0x139] = 0;
      unaff_x26[0x138] = 0;
      unaff_x26[0x137] = 0;
      unaff_x26[0x136] = 0;
      unaff_x26[0x135] = 0;
      unaff_x26[0x134] = 0;
      unaff_x26[0x133] = 0;
      unaff_x26[0x132] = 0;
      unaff_x26[0x131] = 0;
      unaff_x26[0x130] = 0;
      uStack0000000000000078 = 0;
LAB_002fe494:
      uVar13 = *unaff_x24;
      pcVar11 = "EVP_AEAD_CTX_seal for AES-128-GCM failed.\n";
      goto code_r0x002fdfc4;
    }
    iVar4 = (*pcRam0000000000a3aa38)
                      (acStack_7ffffffe + 0x8000165e,acStack_7ffffffe + 0x8000101e,
                       acStack_7ffffffe + 0x8000103e,acStack_7ffffffe + 0x8000069e,0xe0,
                       acStack_7ffffffe + 0x80000cfe,uRam0000000000a3aa09,&UNK_00877d38);
    if (iVar4 == 0) goto LAB_002fe44c;
    uStack0000000000000078 = in_stack_000006a0 + 0x20;
    iVar4 = func_0x002fd75c(&UNK_00877d58,acStack_7ffffffe + 0x8000101e,0x30,"AES-GCM-encrypt KAT");
    if (iVar4 == 0) goto LAB_002fe494;
    func_0x00373e9c(0xa29688,&DAT_002b4924);
    iVar4 = func_0x002b2150(acStack_7ffffffe + 0x8000165e,acStack_7ffffffe + 0x8000101e,
                            &uStack0000000000000078,0x100,acStack_7ffffffe + 0x80000cfe,
                            uRam0000000000a3aa09,&UNK_00877d88,0x30);
    if ((iVar4 == 0) ||
       (iVar4 = func_0x002fd75c(&UNK_00877db8,acStack_7ffffffe + 0x8000101e,0x20,
                                "AES-GCM-decrypt KAT"), iVar4 == 0)) {
      uVar13 = *unaff_x24;
      pcVar11 = "AES-GCM-decrypt KAT failed because EVP_AEAD_CTX_open failed.\n";
      uVar12 = 0x3d;
      goto LAB_002fd9f8;
    }
    func_0x002ffa98(&UNK_00877dd8,0x10,acStack_7ffffffe + 0x8000101e);
    iVar4 = func_0x002fd75c(&UNK_00877de8,acStack_7ffffffe + 0x8000101e,0x14,"SHA-1 KAT");
    if ((((iVar4 == 0) || (iVar4 = func_0x0031e4f8(), iVar4 == 0)) ||
        (iVar4 = func_0x0031e5c8(), iVar4 == 0)) || (iVar4 = func_0x0031e63c(), iVar4 == 0)) {
LAB_002fe444:
      pcVar5 = (char *)((long)&MACH_HEADER.magic + 1);
    }
    else {
      iVar4 = func_0x002f59f4(acStack_7ffffffe + 0x8000069e,&UNK_00877dfc,&UNK_00877e2c,0x12);
      if ((((iVar4 != 0) &&
           (iVar4 = func_0x002f5fa4(acStack_7ffffffe + 0x8000069e,acStack_7ffffffe + 0x8000101e,0x40
                                    ,&UNK_00877e3e,0x10), iVar4 != 0)) &&
          ((iVar4 = func_0x002fd75c(&UNK_00877e4e,acStack_7ffffffe + 0x8000101e,0x40,
                                    "DRBG Generate KAT"), iVar4 != 0 &&
           ((iVar4 = func_0x002f5c00(acStack_7ffffffe + 0x8000069e,&UNK_00877e8e,&UNK_00877e3e,0x10)
            , iVar4 != 0 &&
            (iVar4 = func_0x002f5fa4(acStack_7ffffffe + 0x8000069e,acStack_7ffffffe + 0x8000101e,
                                     0x40,&UNK_00877e3e,0x10), iVar4 != 0)))))) &&
         (iVar4 = func_0x002fd75c(&UNK_00877ebe,acStack_7ffffffe + 0x8000101e,0x40,"DRBG-reseed KAT"
                                 ), iVar4 != 0)) {
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
        if (iVar4 != 0) {
          func_0x00373e9c(0xa296c8,&DAT_002c21e4);
          iVar4 = func_0x0030140c(0xa3a728,unaff_x29 + -0xb0,0x20,&UNK_00877efe,0x20,&UNK_00877f1e,
                                  0xf,&UNK_00877f2d);
          if ((iVar4 == 0) ||
             (iVar4 = func_0x002fd75c(&UNK_00877f4d,unaff_x29 + -0xb0,0x20,"TLS-KDF KAT"),
             iVar4 == 0)) {
            uVar13 = *unaff_x24;
            pcVar11 = "TLS KDF failed.\n";
            uVar12 = 0x10;
          }
          else {
            func_0x00373e9c(0xa296c8,&DAT_002c21e4);
            iVar4 = func_0x002f53d4(&UNK_00877f6d,0x18,&UNK_00877f85,0x24,2,0xa3a728,0x19,
                                    acStack_7ffffffe + 0x80001cbe);
            if ((iVar4 == 0) ||
               (iVar4 = func_0x002fd75c(&UNK_00877fa9,acStack_7ffffffe + 0x80001cbe,0x19,
                                        "PBKDF2 KAT"), iVar4 == 0)) {
              uVar13 = *unaff_x24;
              pcVar11 = "PBKDF2 failed.\n";
              uVar12 = 0xf;
            }
            else {
              func_0x00373e9c(0xa296c8,&DAT_002c21e4);
              iVar4 = func_0x002de444(acStack_7ffffffe + 0x80000d1e,0x100,0xa3a728,&UNK_00877fe2,
                                      0x33,&UNK_00877fc2,0x20);
              if ((iVar4 == 0) ||
                 (iVar4 = func_0x002fd75c(&UNK_00878015,acStack_7ffffffe + 0x80000d1e,0x100,
                                          "SSKDF_digest KAT"), uVar86 = _UNK_0087812d,
                 uVar13 = _UNK_00878125, uVar12 = _UNK_00878115, iVar4 == 0)) {
                uVar13 = *unaff_x24;
                pcVar11 = "SSKDF_digest failed.\n";
                uVar12 = 0x15;
              }
              else {
                unaff_x25[0x19d] = _UNK_0087811d;
                unaff_x25[0x19c] = uVar12;
                unaff_x25[0x19f] = uVar86;
                unaff_x25[0x19e] = uVar13;
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
                iVar4 = func_0x002de054(&uStack0000000000000080,0x10,0xa3a728,unaff_x29 + -0xf0,0x20
                                        ,&uStack00000000000000a0,0x3c);
                if ((iVar4 != 0) &&
                   (iVar4 = func_0x002fd75c(&UNK_008300c0,&uStack0000000000000080,0x10,
                                            "KBKDF-CTR-HMAC-SHA-256 KAT"), iVar4 != 0)) {
                  pcVar5 = (char *)0x0;
                  goto LAB_002fda00;
                }
                uVar13 = *unaff_x24;
                pcVar11 = "KBKDF counter HMAC-SHA-256 failed.\n";
                uVar12 = 0x23;
              }
            }
          }
          goto LAB_002fd9f8;
        }
        goto LAB_002fe444;
      }
      pcVar5 = (char *)((long)&MACH_HEADER.magic + 1);
      _fwrite("CTR-DRBG failed.\n",0x11,1,*unaff_x24);
    }
  }
LAB_002fda00:
  if (in_stack_00001660 != 0) {
    (**(code **)(in_stack_00001660 + 0x20))(acStack_7ffffffe + 0x8000165e);
  }
  if ((int)pcVar5 != 0) goto LAB_002fdd0c;
  pcVar5 = (char *)func_0x002f8ac4(0);
  if (pcVar5 == (char *)0x0) {
code_r0x002fdce0:
    func_0x002f7efc(pcVar5);
    _fwrite("RSA key construction failed\n",0x1c,1,*unaff_x24);
    pcVar5 = (char *)0x0;
  }
  else {
    qVar6 = func_0x0029c764(&UNK_00878472,0x100,0);
    *(qword *)(pcVar5 + 8) = qVar6;
    if (qVar6 == 0) goto code_r0x002fdce0;
    qVar6 = func_0x0029c764(&UNK_00878572,3,0);
    *(qword *)(pcVar5 + 0x10) = qVar6;
    if (qVar6 == 0) goto code_r0x002fdce0;
    lVar7 = func_0x0029c764(&UNK_00878575,0x100,0);
    *(long *)(pcVar5 + 0x18) = lVar7;
    if (lVar7 == 0) goto code_r0x002fdce0;
    lVar7 = func_0x0029c764(&UNK_00878675,0x80,0);
    *(long *)(pcVar5 + 0x20) = lVar7;
    if (lVar7 == 0) goto code_r0x002fdce0;
    lVar7 = func_0x0029c764(&UNK_008786f5,0x80,0);
    *(long *)(pcVar5 + 0x28) = lVar7;
    if (lVar7 == 0) goto code_r0x002fdce0;
    lVar7 = func_0x0029c764(&UNK_00878775,0x80,0);
    *(long *)(pcVar5 + 0x30) = lVar7;
    if (lVar7 == 0) goto code_r0x002fdce0;
    lVar7 = func_0x0029c764(&UNK_008787f5,0x80,0);
    *(long *)(pcVar5 + 0x38) = lVar7;
    if (lVar7 == 0) goto code_r0x002fdce0;
    lVar7 = func_0x0029c764(&UNK_00878875,0x80,0);
    *(long *)(pcVar5 + 0x40) = lVar7;
    if (lVar7 == 0) goto code_r0x002fdce0;
    *(uint *)(pcVar5 + 0x5c) = *(uint *)(pcVar5 + 0x5c) | 8;
    func_0x00373e9c(0xa296c8,&DAT_002c21e4);
    iVar4 = func_0x002c0d58(&UNK_00878232,0x20,acStack_7ffffffe + 0x8000069e,
                            acStack_7ffffffe + 0x8000133e,0xa3a728,0);
    if (iVar4 == 0) {
code_r0x002fdfd0:
      uVar13 = *unaff_x24;
      pcVar11 = "RSA signing test failed.\n";
      uVar12 = 0x19;
    }
    else {
      unaff_x20 = (long *)0xa3a000;
      iVar4 = func_0x002f9b90(uRam0000000000a3a728,acStack_7ffffffe + 0x8000069e,0x40,
                              acStack_7ffffffe + 0x8000165e,acStack_7ffffffe + 0x8000101e,pcVar5);
      if ((iVar4 == 0) ||
         (iVar4 = func_0x002fd75c(&UNK_00878252,acStack_7ffffffe + 0x8000165e,0x100,"RSA-sign KAT"),
         iVar4 == 0)) goto code_r0x002fdfd0;
      func_0x00373e9c(0xa296c8,&DAT_002c21e4);
      iVar4 = func_0x002c0d58(&UNK_00878352,0x20,acStack_7ffffffe + 0x8000069e,
                              acStack_7ffffffe + 0x8000133e,0xa3a728,0);
      if ((iVar4 != 0) &&
         (iVar4 = func_0x002f9f18(uRam0000000000a3a728,acStack_7ffffffe + 0x8000069e,0x40,
                                  &UNK_00878372,0x100,pcVar5), iVar4 != 0)) {
        func_0x002f7efc(pcVar5);
        pcVar5 = (char *)func_0x002c2a30();
        puVar8 = (undefined8 *)func_0x0029c764(&UNK_00878a57,0x20,0);
        puVar9 = (undefined8 *)func_0x0029c764(&UNK_00878a77,0x20,0);
        puVar10 = (undefined8 *)func_0x0029c764(&UNK_00878a97,0x20,0);
        if ((pcVar5 == (char *)0x0) ||
           (((puVar8 == (undefined8 *)0x0 || (puVar9 == (undefined8 *)0x0)) ||
            (puVar10 == (undefined8 *)0x0)))) {
          func_0x002c3420(pcVar5);
          pcVar5 = (char *)0x0;
          if (puVar8 != (undefined8 *)0x0) goto code_r0x002fe4e0;
        }
        else {
          func_0x00373e9c(0xa29738,&DAT_002c54ec);
          iVar4 = func_0x002c2ae8(pcVar5,0xa3b640);
          if (((iVar4 == 0) || (iVar4 = func_0x002cb27c(pcVar5,puVar8,puVar9), iVar4 == 0)) ||
             (iVar4 = func_0x002cad18(pcVar5,puVar10), iVar4 == 0)) {
            func_0x002c3420(pcVar5);
            pcVar5 = (char *)0x0;
          }
code_r0x002fe4e0:
          uVar23 = *(uint *)((long)puVar8 + 0x14);
          if ((uVar23 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar8);
            uVar23 = *(uint *)((long)puVar8 + 0x14);
          }
          if ((uVar23 & 1) == 0) {
            *puVar8 = 0;
          }
          else {
            func_0x0036e3d8(puVar8);
          }
        }
        if (puVar9 != (undefined8 *)0x0) {
          uVar23 = *(uint *)((long)puVar9 + 0x14);
          if ((uVar23 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar9);
            uVar23 = *(uint *)((long)puVar9 + 0x14);
          }
          if ((uVar23 & 1) == 0) {
            *puVar9 = 0;
          }
          else {
            func_0x0036e3d8(puVar9);
          }
        }
        if (puVar10 != (undefined8 *)0x0) {
          uVar23 = *(uint *)((long)puVar10 + 0x14);
          if ((uVar23 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar10);
            uVar23 = *(uint *)((long)puVar10 + 0x14);
          }
          if ((uVar23 & 1) == 0) {
            *puVar10 = 0;
          }
          else {
            func_0x0036e3d8(puVar10);
          }
        }
        if (pcVar5 == (char *)0x0) {
          _fwrite("ECDSA KeyGen failed\n",0x14,1,*unaff_x24);
          unaff_x20 = (long *)0x0;
        }
        else {
          *(undefined8 *)((long)unaff_x25 + 0x17) = 0;
          *(undefined1 *)((long)unaff_x25 + 0x1f) = 0x2a;
          func_0x00373e9c(0xa296c8,&DAT_002c21e4);
          unaff_x20 = (long *)func_0x002c50e8(0xa3a728,&UNK_008788f5,0x20,pcVar5,
                                              acStack_7ffffffe + 0x8000101e,0x20);
          if (unaff_x20 == (long *)0x0) {
LAB_002fec40:
            uVar13 = *unaff_x24;
            pcVar11 = "ECDSA-sign KAT failed.\n";
            uVar12 = 0x17;
          }
          else {
            pauVar15 = *(undefined1 (**) [16])*unaff_x20;
            lVar7 = (long)*(int *)((undefined8 *)*unaff_x20 + 1);
            uVar14 = lVar7 * 8;
            if (0x20 < uVar14) {
              uVar18 = uVar14 - 0x20;
              if (uVar18 < 0x40) {
                bVar29 = 0;
                uVar19 = 0;
code_r0x002fe6a8:
                auVar53 = ZEXT116(bVar29);
                lVar20 = uVar19 + 0x20 + lVar7 * -8;
                puVar8 = (undefined8 *)(pauVar15[2] + uVar19);
                do {
                  uVar12 = *puVar8;
                  auVar53._0_8_ =
                       CONCAT17((byte)((ulong)uVar12 >> 0x38) | auVar53[7],
                                CONCAT16((byte)((ulong)uVar12 >> 0x30) | auVar53[6],
                                         CONCAT15((byte)((ulong)uVar12 >> 0x28) | auVar53[5],
                                                  CONCAT14((byte)((ulong)uVar12 >> 0x20) |
                                                           auVar53[4],
                                                           CONCAT13((byte)((ulong)uVar12 >> 0x18) |
                                                                    auVar53[3],
                                                                    CONCAT12((byte)((ulong)uVar12 >>
                                                                                   0x10) |
                                                                             auVar53[2],
                                                                             CONCAT11((byte)((ulong)
                                                  uVar12 >> 8) | auVar53[1],
                                                  (byte)uVar12 | auVar53[0])))))));
                  auVar53._8_8_ = 0;
                  lVar20 = lVar20 + 8;
                  puVar8 = puVar8 + 1;
                } while (lVar20 != 0);
                uVar21 = auVar53._0_8_ | auVar53._0_8_ >> 0x20;
                uVar21 = uVar21 | uVar21 >> 0x10;
                uVar23 = (uint)uVar21 | (uint)(uVar21 >> 8);
              }
              else {
                uVar19 = uVar18 & 0xffffffffffffffc0;
                pauVar25 = pauVar15 + 5;
                bVar29 = 0;
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
                bVar52 = 0;
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
                uVar12 = 0;
                uVar13 = 0;
                uVar86 = 0;
                uVar95 = 0;
                uVar21 = uVar19;
                do {
                  uVar104 = *(undefined8 *)(pauVar25[-3] + 8);
                  uVar103 = *(undefined8 *)pauVar25[-3];
                  uVar106 = *(undefined8 *)(pauVar25[-2] + 8);
                  uVar105 = *(undefined8 *)pauVar25[-2];
                  uVar108 = *(undefined8 *)(pauVar25[-1] + 8);
                  uVar107 = *(undefined8 *)pauVar25[-1];
                  uVar110 = *(undefined8 *)(*pauVar25 + 8);
                  uVar109 = *(undefined8 *)*pauVar25;
                  bVar29 = (byte)uVar103 | bVar29;
                  bVar37 = (byte)((ulong)uVar103 >> 8) | bVar37;
                  bVar38 = (byte)((ulong)uVar103 >> 0x10) | bVar38;
                  bVar39 = (byte)((ulong)uVar103 >> 0x18) | bVar39;
                  bVar40 = (byte)((ulong)uVar103 >> 0x20) | bVar40;
                  bVar41 = (byte)((ulong)uVar103 >> 0x28) | bVar41;
                  bVar42 = (byte)((ulong)uVar103 >> 0x30) | bVar42;
                  bVar43 = (byte)((ulong)uVar103 >> 0x38) | bVar43;
                  bVar44 = (byte)uVar104 | bVar44;
                  bVar45 = (byte)((ulong)uVar104 >> 8) | bVar45;
                  bVar46 = (byte)((ulong)uVar104 >> 0x10) | bVar46;
                  bVar47 = (byte)((ulong)uVar104 >> 0x18) | bVar47;
                  bVar48 = (byte)((ulong)uVar104 >> 0x20) | bVar48;
                  bVar49 = (byte)((ulong)uVar104 >> 0x28) | bVar49;
                  bVar50 = (byte)((ulong)uVar104 >> 0x30) | bVar50;
                  bVar51 = (byte)((ulong)uVar104 >> 0x38) | bVar51;
                  bVar52 = (byte)uVar105 | bVar52;
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
                  bVar69 = (byte)uVar107 | (byte)uVar12;
                  bVar70 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar12 >> 8);
                  bVar71 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar12 >> 0x10);
                  bVar72 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar12 >> 0x18);
                  bVar73 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar12 >> 0x20);
                  bVar74 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar12 >> 0x28);
                  bVar75 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar12 >> 0x30);
                  bVar76 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar12 >> 0x38);
                  uVar12 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar108 | (byte)uVar13;
                  bVar78 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar13 >> 8);
                  bVar79 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
                  bVar80 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
                  bVar81 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
                  bVar82 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
                  bVar83 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
                  bVar84 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
                  uVar13 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
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
                  pauVar25 = pauVar25 + 4;
                  uVar21 = uVar21 - 0x40;
                } while (uVar21 != 0);
                auVar36[0] = bVar85 | bVar69 | bVar52 | bVar29;
                auVar36[1] = bVar87 | bVar70 | bVar54 | bVar37;
                auVar36[2] = bVar88 | bVar71 | bVar55 | bVar38;
                auVar36[3] = bVar89 | bVar72 | bVar56 | bVar39;
                auVar36[4] = bVar90 | bVar73 | bVar57 | bVar40;
                auVar36[5] = bVar91 | bVar74 | bVar58 | bVar41;
                auVar36[6] = bVar92 | bVar75 | bVar59 | bVar42;
                auVar36[7] = bVar93 | bVar76 | bVar60 | bVar43;
                auVar36[8] = bVar94 | bVar77 | bVar61 | bVar44;
                auVar36[9] = bVar96 | bVar78 | bVar62 | bVar45;
                auVar36[10] = bVar97 | bVar79 | bVar63 | bVar46;
                auVar36[0xb] = bVar98 | bVar80 | bVar64 | bVar47;
                auVar36[0xc] = bVar99 | bVar81 | bVar65 | bVar48;
                auVar36[0xd] = bVar100 | bVar82 | bVar66 | bVar49;
                auVar36[0xe] = bVar101 | bVar83 | bVar67 | bVar50;
                auVar36[0xf] = bVar102 | bVar84 | bVar68 | bVar51;
                auVar53 = NEON_ext(auVar36,auVar36,8,1);
                uVar21 = CONCAT17(auVar36[7] | auVar53[7],
                                  CONCAT16(auVar36[6] | auVar53[6],
                                           CONCAT15(auVar36[5] | auVar53[5],
                                                    CONCAT14(auVar36[4] | auVar53[4],
                                                             CONCAT13(auVar36[3] | auVar53[3],
                                                                      CONCAT12(auVar36[2] |
                                                                               auVar53[2],
                                                                               CONCAT11(auVar36[1] |
                                                                                        auVar53[1],
                                                                                        auVar36[0] |
                                                                                        auVar53[0]))
                                                                     )))));
                uVar21 = uVar21 | uVar21 >> 0x20;
                uVar21 = uVar21 | uVar21 >> 0x10;
                uVar23 = (uint)uVar21 | (uint)(uVar21 >> 8);
                bVar29 = (byte)uVar23;
                if (uVar18 != uVar19) {
                  if ((uVar18 & 0x38) != 0) goto code_r0x002fe6a8;
                  lVar20 = (uVar14 - uVar19) + -0x20;
                  pbVar22 = *pauVar15 + (uVar19 | 0x20);
                  do {
                    uVar23 = *pbVar22 | uVar23;
                    lVar20 = lVar20 + -1;
                    pbVar22 = pbVar22 + 1;
                  } while (lVar20 != 0);
                }
              }
              if ((uVar23 & 0xff) != 0) goto LAB_002fec40;
              if (uVar18 < 0x40) {
                bVar29 = 0;
                uVar19 = 0;
code_r0x002fe774:
                auVar31 = ZEXT116(bVar29);
                lVar7 = uVar19 + 0x20 + lVar7 * -8;
                puVar8 = (undefined8 *)(pauVar15[2] + uVar19);
                do {
                  uVar12 = *puVar8;
                  auVar31._0_8_ =
                       CONCAT17((byte)((ulong)uVar12 >> 0x38) | auVar31[7],
                                CONCAT16((byte)((ulong)uVar12 >> 0x30) | auVar31[6],
                                         CONCAT15((byte)((ulong)uVar12 >> 0x28) | auVar31[5],
                                                  CONCAT14((byte)((ulong)uVar12 >> 0x20) |
                                                           auVar31[4],
                                                           CONCAT13((byte)((ulong)uVar12 >> 0x18) |
                                                                    auVar31[3],
                                                                    CONCAT12((byte)((ulong)uVar12 >>
                                                                                   0x10) |
                                                                             auVar31[2],
                                                                             CONCAT11((byte)((ulong)
                                                  uVar12 >> 8) | auVar31[1],
                                                  (byte)uVar12 | auVar31[0])))))));
                  auVar31._8_8_ = 0;
                  lVar7 = lVar7 + 8;
                  puVar8 = puVar8 + 1;
                } while (lVar7 != 0);
                uVar18 = auVar31._0_8_ | auVar31._0_8_ >> 0x20;
                uVar18 = uVar18 | uVar18 >> 0x10;
                uVar23 = (uint)uVar18 | (uint)(uVar18 >> 8);
              }
              else {
                uVar19 = uVar18 & 0xffffffffffffffc0;
                pauVar25 = pauVar15 + 5;
                bVar29 = 0;
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
                bVar52 = 0;
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
                uVar12 = 0;
                uVar13 = 0;
                uVar86 = 0;
                uVar95 = 0;
                uVar21 = uVar19;
                do {
                  uVar104 = *(undefined8 *)(pauVar25[-3] + 8);
                  uVar103 = *(undefined8 *)pauVar25[-3];
                  uVar106 = *(undefined8 *)(pauVar25[-2] + 8);
                  uVar105 = *(undefined8 *)pauVar25[-2];
                  uVar108 = *(undefined8 *)(pauVar25[-1] + 8);
                  uVar107 = *(undefined8 *)pauVar25[-1];
                  uVar110 = *(undefined8 *)(*pauVar25 + 8);
                  uVar109 = *(undefined8 *)*pauVar25;
                  bVar29 = (byte)uVar103 | bVar29;
                  bVar37 = (byte)((ulong)uVar103 >> 8) | bVar37;
                  bVar38 = (byte)((ulong)uVar103 >> 0x10) | bVar38;
                  bVar39 = (byte)((ulong)uVar103 >> 0x18) | bVar39;
                  bVar40 = (byte)((ulong)uVar103 >> 0x20) | bVar40;
                  bVar41 = (byte)((ulong)uVar103 >> 0x28) | bVar41;
                  bVar42 = (byte)((ulong)uVar103 >> 0x30) | bVar42;
                  bVar43 = (byte)((ulong)uVar103 >> 0x38) | bVar43;
                  bVar44 = (byte)uVar104 | bVar44;
                  bVar45 = (byte)((ulong)uVar104 >> 8) | bVar45;
                  bVar46 = (byte)((ulong)uVar104 >> 0x10) | bVar46;
                  bVar47 = (byte)((ulong)uVar104 >> 0x18) | bVar47;
                  bVar48 = (byte)((ulong)uVar104 >> 0x20) | bVar48;
                  bVar49 = (byte)((ulong)uVar104 >> 0x28) | bVar49;
                  bVar50 = (byte)((ulong)uVar104 >> 0x30) | bVar50;
                  bVar51 = (byte)((ulong)uVar104 >> 0x38) | bVar51;
                  bVar52 = (byte)uVar105 | bVar52;
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
                  bVar69 = (byte)uVar107 | (byte)uVar12;
                  bVar70 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar12 >> 8);
                  bVar71 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar12 >> 0x10);
                  bVar72 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar12 >> 0x18);
                  bVar73 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar12 >> 0x20);
                  bVar74 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar12 >> 0x28);
                  bVar75 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar12 >> 0x30);
                  bVar76 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar12 >> 0x38);
                  uVar12 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar108 | (byte)uVar13;
                  bVar78 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar13 >> 8);
                  bVar79 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
                  bVar80 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
                  bVar81 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
                  bVar82 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
                  bVar83 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
                  bVar84 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
                  uVar13 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
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
                  pauVar25 = pauVar25 + 4;
                  uVar21 = uVar21 - 0x40;
                } while (uVar21 != 0);
                auVar30[0] = bVar85 | bVar69 | bVar52 | bVar29;
                auVar30[1] = bVar87 | bVar70 | bVar54 | bVar37;
                auVar30[2] = bVar88 | bVar71 | bVar55 | bVar38;
                auVar30[3] = bVar89 | bVar72 | bVar56 | bVar39;
                auVar30[4] = bVar90 | bVar73 | bVar57 | bVar40;
                auVar30[5] = bVar91 | bVar74 | bVar58 | bVar41;
                auVar30[6] = bVar92 | bVar75 | bVar59 | bVar42;
                auVar30[7] = bVar93 | bVar76 | bVar60 | bVar43;
                auVar30[8] = bVar94 | bVar77 | bVar61 | bVar44;
                auVar30[9] = bVar96 | bVar78 | bVar62 | bVar45;
                auVar30[10] = bVar97 | bVar79 | bVar63 | bVar46;
                auVar30[0xb] = bVar98 | bVar80 | bVar64 | bVar47;
                auVar30[0xc] = bVar99 | bVar81 | bVar65 | bVar48;
                auVar30[0xd] = bVar100 | bVar82 | bVar66 | bVar49;
                auVar30[0xe] = bVar101 | bVar83 | bVar67 | bVar50;
                auVar30[0xf] = bVar102 | bVar84 | bVar68 | bVar51;
                auVar36 = NEON_ext(auVar30,auVar30,8,1);
                uVar21 = CONCAT17(auVar30[7] | auVar36[7],
                                  CONCAT16(auVar30[6] | auVar36[6],
                                           CONCAT15(auVar30[5] | auVar36[5],
                                                    CONCAT14(auVar30[4] | auVar36[4],
                                                             CONCAT13(auVar30[3] | auVar36[3],
                                                                      CONCAT12(auVar30[2] |
                                                                               auVar36[2],
                                                                               CONCAT11(auVar30[1] |
                                                                                        auVar36[1],
                                                                                        auVar30[0] |
                                                                                        auVar36[0]))
                                                                     )))));
                uVar21 = uVar21 | uVar21 >> 0x20;
                uVar21 = uVar21 | uVar21 >> 0x10;
                uVar23 = (uint)uVar21 | (uint)(uVar21 >> 8);
                bVar29 = (byte)uVar23;
                if (uVar18 != uVar19) {
                  if ((uVar18 & 0x38) != 0) goto code_r0x002fe774;
                  lVar7 = (uVar14 - uVar19) + -0x20;
                  pbVar22 = *pauVar15 + (uVar19 | 0x20);
                  do {
                    uVar23 = *pbVar22 | uVar23;
                    lVar7 = lVar7 + -1;
                    pbVar22 = pbVar22 + 1;
                  } while (lVar7 != 0);
                }
              }
              if ((uVar23 & 0xff) != 0) {
                func_0x0079dae0();
                goto code_r0x002ff884;
              }
            }
            uVar18 = uVar14;
            if (0x1f < uVar14) {
              uVar18 = 0x20;
            }
            if (uVar18 != 0) {
              if ((acStack_7ffffffe + (0x8000135e - uVar18) < *pauVar15 + uVar18) &&
                 (pauVar15 < (undefined1 (*) [16])(acStack_7ffffffe + 0x8000135e))) {
                uVar21 = 0;
code_r0x002fe7f0:
                lVar7 = uVar18 - uVar21;
                pcVar11 = *pauVar15 + uVar21;
                pcVar27 = acStack_7ffffffe + (0x8000135d - uVar21);
                do {
                  *pcVar27 = *pcVar11;
                  lVar7 = lVar7 + -1;
                  pcVar11 = pcVar11 + 1;
                  pcVar27 = pcVar27 + -1;
                } while (lVar7 != 0);
              }
              else {
                if (uVar18 < 0x10) {
                  uVar21 = 0;
                }
                else {
                  uVar21 = uVar18 & 0x30;
                  auVar36 = NEON_rev64(*pauVar15,1);
                  auVar36 = NEON_ext(auVar36,auVar36,8,1);
                  unaff_x25[0x67] = auVar36._8_8_;
                  unaff_x25[0x66] = auVar36._0_8_;
                  if (uVar21 != 0x10) {
                    auVar36 = NEON_rev64(pauVar15[1],1);
                    auVar36 = NEON_ext(auVar36,auVar36,8,1);
                    unaff_x25[0x65] = auVar36._8_8_;
                    unaff_x25[100] = auVar36._0_8_;
                  }
                  if (uVar18 == uVar21) goto code_r0x002fe890;
                  if (((uint)uVar18 >> 3 & 1) == 0) goto code_r0x002fe7f0;
                }
                lVar7 = uVar18 - uVar21;
                puVar8 = (undefined8 *)(*pauVar15 + uVar21);
                pcVar11 = acStack_7ffffffe + (0x80001356 - uVar21);
                do {
                  uVar12 = NEON_rev64(*puVar8,1);
                  *(undefined8 *)pcVar11 = uVar12;
                  lVar7 = lVar7 + -8;
                  puVar8 = puVar8 + 1;
                  pcVar11 = pcVar11 + -8;
                } while (lVar7 != 0);
              }
            }
code_r0x002fe890:
            if (uVar14 < 0x20) {
              ___memset_chk(acStack_7ffffffe + 0x8000133e,0,0x20 - uVar18,0x40);
            }
            pauVar15 = *(undefined1 (**) [16])unaff_x20[1];
            lVar7 = (long)*(int *)((undefined8 *)unaff_x20[1] + 1);
            uVar14 = lVar7 * 8;
            if (0x20 < uVar14) {
              uVar18 = uVar14 - 0x20;
              if (uVar18 < 0x40) {
                bVar29 = 0;
                uVar19 = 0;
code_r0x002fe95c:
                auVar33 = ZEXT116(bVar29);
                lVar20 = uVar19 + 0x20 + lVar7 * -8;
                puVar8 = (undefined8 *)(pauVar15[2] + uVar19);
                do {
                  uVar12 = *puVar8;
                  auVar33._0_8_ =
                       CONCAT17((byte)((ulong)uVar12 >> 0x38) | auVar33[7],
                                CONCAT16((byte)((ulong)uVar12 >> 0x30) | auVar33[6],
                                         CONCAT15((byte)((ulong)uVar12 >> 0x28) | auVar33[5],
                                                  CONCAT14((byte)((ulong)uVar12 >> 0x20) |
                                                           auVar33[4],
                                                           CONCAT13((byte)((ulong)uVar12 >> 0x18) |
                                                                    auVar33[3],
                                                                    CONCAT12((byte)((ulong)uVar12 >>
                                                                                   0x10) |
                                                                             auVar33[2],
                                                                             CONCAT11((byte)((ulong)
                                                  uVar12 >> 8) | auVar33[1],
                                                  (byte)uVar12 | auVar33[0])))))));
                  auVar33._8_8_ = 0;
                  lVar20 = lVar20 + 8;
                  puVar8 = puVar8 + 1;
                } while (lVar20 != 0);
                uVar21 = auVar33._0_8_ | auVar33._0_8_ >> 0x20;
                uVar21 = uVar21 | uVar21 >> 0x10;
                uVar23 = (uint)uVar21 | (uint)(uVar21 >> 8);
              }
              else {
                uVar19 = uVar18 & 0xffffffffffffffc0;
                pauVar25 = pauVar15 + 5;
                bVar29 = 0;
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
                bVar52 = 0;
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
                uVar12 = 0;
                uVar13 = 0;
                uVar86 = 0;
                uVar95 = 0;
                uVar21 = uVar19;
                do {
                  uVar104 = *(undefined8 *)(pauVar25[-3] + 8);
                  uVar103 = *(undefined8 *)pauVar25[-3];
                  uVar106 = *(undefined8 *)(pauVar25[-2] + 8);
                  uVar105 = *(undefined8 *)pauVar25[-2];
                  uVar108 = *(undefined8 *)(pauVar25[-1] + 8);
                  uVar107 = *(undefined8 *)pauVar25[-1];
                  uVar110 = *(undefined8 *)(*pauVar25 + 8);
                  uVar109 = *(undefined8 *)*pauVar25;
                  bVar29 = (byte)uVar103 | bVar29;
                  bVar37 = (byte)((ulong)uVar103 >> 8) | bVar37;
                  bVar38 = (byte)((ulong)uVar103 >> 0x10) | bVar38;
                  bVar39 = (byte)((ulong)uVar103 >> 0x18) | bVar39;
                  bVar40 = (byte)((ulong)uVar103 >> 0x20) | bVar40;
                  bVar41 = (byte)((ulong)uVar103 >> 0x28) | bVar41;
                  bVar42 = (byte)((ulong)uVar103 >> 0x30) | bVar42;
                  bVar43 = (byte)((ulong)uVar103 >> 0x38) | bVar43;
                  bVar44 = (byte)uVar104 | bVar44;
                  bVar45 = (byte)((ulong)uVar104 >> 8) | bVar45;
                  bVar46 = (byte)((ulong)uVar104 >> 0x10) | bVar46;
                  bVar47 = (byte)((ulong)uVar104 >> 0x18) | bVar47;
                  bVar48 = (byte)((ulong)uVar104 >> 0x20) | bVar48;
                  bVar49 = (byte)((ulong)uVar104 >> 0x28) | bVar49;
                  bVar50 = (byte)((ulong)uVar104 >> 0x30) | bVar50;
                  bVar51 = (byte)((ulong)uVar104 >> 0x38) | bVar51;
                  bVar52 = (byte)uVar105 | bVar52;
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
                  bVar69 = (byte)uVar107 | (byte)uVar12;
                  bVar70 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar12 >> 8);
                  bVar71 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar12 >> 0x10);
                  bVar72 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar12 >> 0x18);
                  bVar73 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar12 >> 0x20);
                  bVar74 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar12 >> 0x28);
                  bVar75 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar12 >> 0x30);
                  bVar76 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar12 >> 0x38);
                  uVar12 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar108 | (byte)uVar13;
                  bVar78 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar13 >> 8);
                  bVar79 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
                  bVar80 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
                  bVar81 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
                  bVar82 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
                  bVar83 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
                  bVar84 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
                  uVar13 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
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
                  pauVar25 = pauVar25 + 4;
                  uVar21 = uVar21 - 0x40;
                } while (uVar21 != 0);
                auVar32[0] = bVar85 | bVar69 | bVar52 | bVar29;
                auVar32[1] = bVar87 | bVar70 | bVar54 | bVar37;
                auVar32[2] = bVar88 | bVar71 | bVar55 | bVar38;
                auVar32[3] = bVar89 | bVar72 | bVar56 | bVar39;
                auVar32[4] = bVar90 | bVar73 | bVar57 | bVar40;
                auVar32[5] = bVar91 | bVar74 | bVar58 | bVar41;
                auVar32[6] = bVar92 | bVar75 | bVar59 | bVar42;
                auVar32[7] = bVar93 | bVar76 | bVar60 | bVar43;
                auVar32[8] = bVar94 | bVar77 | bVar61 | bVar44;
                auVar32[9] = bVar96 | bVar78 | bVar62 | bVar45;
                auVar32[10] = bVar97 | bVar79 | bVar63 | bVar46;
                auVar32[0xb] = bVar98 | bVar80 | bVar64 | bVar47;
                auVar32[0xc] = bVar99 | bVar81 | bVar65 | bVar48;
                auVar32[0xd] = bVar100 | bVar82 | bVar66 | bVar49;
                auVar32[0xe] = bVar101 | bVar83 | bVar67 | bVar50;
                auVar32[0xf] = bVar102 | bVar84 | bVar68 | bVar51;
                auVar36 = NEON_ext(auVar32,auVar32,8,1);
                uVar21 = CONCAT17(auVar32[7] | auVar36[7],
                                  CONCAT16(auVar32[6] | auVar36[6],
                                           CONCAT15(auVar32[5] | auVar36[5],
                                                    CONCAT14(auVar32[4] | auVar36[4],
                                                             CONCAT13(auVar32[3] | auVar36[3],
                                                                      CONCAT12(auVar32[2] |
                                                                               auVar36[2],
                                                                               CONCAT11(auVar32[1] |
                                                                                        auVar36[1],
                                                                                        auVar32[0] |
                                                                                        auVar36[0]))
                                                                     )))));
                uVar21 = uVar21 | uVar21 >> 0x20;
                uVar21 = uVar21 | uVar21 >> 0x10;
                uVar23 = (uint)uVar21 | (uint)(uVar21 >> 8);
                bVar29 = (byte)uVar23;
                if (uVar18 != uVar19) {
                  if ((uVar18 & 0x38) != 0) goto code_r0x002fe95c;
                  lVar20 = (uVar14 - uVar19) + -0x20;
                  pbVar22 = *pauVar15 + (uVar19 | 0x20);
                  do {
                    uVar23 = *pbVar22 | uVar23;
                    lVar20 = lVar20 + -1;
                    pbVar22 = pbVar22 + 1;
                  } while (lVar20 != 0);
                }
              }
              if ((uVar23 & 0xff) != 0) goto LAB_002fec40;
              if (uVar18 < 0x40) {
                bVar29 = 0;
                uVar19 = 0;
code_r0x002fea28:
                auVar35 = ZEXT116(bVar29);
                lVar7 = uVar19 + 0x20 + lVar7 * -8;
                puVar8 = (undefined8 *)(pauVar15[2] + uVar19);
                do {
                  uVar12 = *puVar8;
                  auVar35._0_8_ =
                       CONCAT17((byte)((ulong)uVar12 >> 0x38) | auVar35[7],
                                CONCAT16((byte)((ulong)uVar12 >> 0x30) | auVar35[6],
                                         CONCAT15((byte)((ulong)uVar12 >> 0x28) | auVar35[5],
                                                  CONCAT14((byte)((ulong)uVar12 >> 0x20) |
                                                           auVar35[4],
                                                           CONCAT13((byte)((ulong)uVar12 >> 0x18) |
                                                                    auVar35[3],
                                                                    CONCAT12((byte)((ulong)uVar12 >>
                                                                                   0x10) |
                                                                             auVar35[2],
                                                                             CONCAT11((byte)((ulong)
                                                  uVar12 >> 8) | auVar35[1],
                                                  (byte)uVar12 | auVar35[0])))))));
                  auVar35._8_8_ = 0;
                  lVar7 = lVar7 + 8;
                  puVar8 = puVar8 + 1;
                } while (lVar7 != 0);
                uVar18 = auVar35._0_8_ | auVar35._0_8_ >> 0x20;
                uVar18 = uVar18 | uVar18 >> 0x10;
                uVar23 = (uint)uVar18 | (uint)(uVar18 >> 8);
              }
              else {
                uVar19 = uVar18 & 0xffffffffffffffc0;
                pauVar25 = pauVar15 + 5;
                bVar29 = 0;
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
                bVar52 = 0;
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
                uVar12 = 0;
                uVar13 = 0;
                uVar86 = 0;
                uVar95 = 0;
                uVar21 = uVar19;
                do {
                  uVar104 = *(undefined8 *)(pauVar25[-3] + 8);
                  uVar103 = *(undefined8 *)pauVar25[-3];
                  uVar106 = *(undefined8 *)(pauVar25[-2] + 8);
                  uVar105 = *(undefined8 *)pauVar25[-2];
                  uVar108 = *(undefined8 *)(pauVar25[-1] + 8);
                  uVar107 = *(undefined8 *)pauVar25[-1];
                  uVar110 = *(undefined8 *)(*pauVar25 + 8);
                  uVar109 = *(undefined8 *)*pauVar25;
                  bVar29 = (byte)uVar103 | bVar29;
                  bVar37 = (byte)((ulong)uVar103 >> 8) | bVar37;
                  bVar38 = (byte)((ulong)uVar103 >> 0x10) | bVar38;
                  bVar39 = (byte)((ulong)uVar103 >> 0x18) | bVar39;
                  bVar40 = (byte)((ulong)uVar103 >> 0x20) | bVar40;
                  bVar41 = (byte)((ulong)uVar103 >> 0x28) | bVar41;
                  bVar42 = (byte)((ulong)uVar103 >> 0x30) | bVar42;
                  bVar43 = (byte)((ulong)uVar103 >> 0x38) | bVar43;
                  bVar44 = (byte)uVar104 | bVar44;
                  bVar45 = (byte)((ulong)uVar104 >> 8) | bVar45;
                  bVar46 = (byte)((ulong)uVar104 >> 0x10) | bVar46;
                  bVar47 = (byte)((ulong)uVar104 >> 0x18) | bVar47;
                  bVar48 = (byte)((ulong)uVar104 >> 0x20) | bVar48;
                  bVar49 = (byte)((ulong)uVar104 >> 0x28) | bVar49;
                  bVar50 = (byte)((ulong)uVar104 >> 0x30) | bVar50;
                  bVar51 = (byte)((ulong)uVar104 >> 0x38) | bVar51;
                  bVar52 = (byte)uVar105 | bVar52;
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
                  bVar69 = (byte)uVar107 | (byte)uVar12;
                  bVar70 = (byte)((ulong)uVar107 >> 8) | (byte)((ulong)uVar12 >> 8);
                  bVar71 = (byte)((ulong)uVar107 >> 0x10) | (byte)((ulong)uVar12 >> 0x10);
                  bVar72 = (byte)((ulong)uVar107 >> 0x18) | (byte)((ulong)uVar12 >> 0x18);
                  bVar73 = (byte)((ulong)uVar107 >> 0x20) | (byte)((ulong)uVar12 >> 0x20);
                  bVar74 = (byte)((ulong)uVar107 >> 0x28) | (byte)((ulong)uVar12 >> 0x28);
                  bVar75 = (byte)((ulong)uVar107 >> 0x30) | (byte)((ulong)uVar12 >> 0x30);
                  bVar76 = (byte)((ulong)uVar107 >> 0x38) | (byte)((ulong)uVar12 >> 0x38);
                  uVar12 = CONCAT17(bVar76,CONCAT16(bVar75,CONCAT15(bVar74,CONCAT14(bVar73,CONCAT13(
                                                  bVar72,CONCAT12(bVar71,CONCAT11(bVar70,bVar69)))))
                                                  ));
                  bVar77 = (byte)uVar108 | (byte)uVar13;
                  bVar78 = (byte)((ulong)uVar108 >> 8) | (byte)((ulong)uVar13 >> 8);
                  bVar79 = (byte)((ulong)uVar108 >> 0x10) | (byte)((ulong)uVar13 >> 0x10);
                  bVar80 = (byte)((ulong)uVar108 >> 0x18) | (byte)((ulong)uVar13 >> 0x18);
                  bVar81 = (byte)((ulong)uVar108 >> 0x20) | (byte)((ulong)uVar13 >> 0x20);
                  bVar82 = (byte)((ulong)uVar108 >> 0x28) | (byte)((ulong)uVar13 >> 0x28);
                  bVar83 = (byte)((ulong)uVar108 >> 0x30) | (byte)((ulong)uVar13 >> 0x30);
                  bVar84 = (byte)((ulong)uVar108 >> 0x38) | (byte)((ulong)uVar13 >> 0x38);
                  uVar13 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(
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
                  pauVar25 = pauVar25 + 4;
                  uVar21 = uVar21 - 0x40;
                } while (uVar21 != 0);
                auVar34[0] = bVar85 | bVar69 | bVar52 | bVar29;
                auVar34[1] = bVar87 | bVar70 | bVar54 | bVar37;
                auVar34[2] = bVar88 | bVar71 | bVar55 | bVar38;
                auVar34[3] = bVar89 | bVar72 | bVar56 | bVar39;
                auVar34[4] = bVar90 | bVar73 | bVar57 | bVar40;
                auVar34[5] = bVar91 | bVar74 | bVar58 | bVar41;
                auVar34[6] = bVar92 | bVar75 | bVar59 | bVar42;
                auVar34[7] = bVar93 | bVar76 | bVar60 | bVar43;
                auVar34[8] = bVar94 | bVar77 | bVar61 | bVar44;
                auVar34[9] = bVar96 | bVar78 | bVar62 | bVar45;
                auVar34[10] = bVar97 | bVar79 | bVar63 | bVar46;
                auVar34[0xb] = bVar98 | bVar80 | bVar64 | bVar47;
                auVar34[0xc] = bVar99 | bVar81 | bVar65 | bVar48;
                auVar34[0xd] = bVar100 | bVar82 | bVar66 | bVar49;
                auVar34[0xe] = bVar101 | bVar83 | bVar67 | bVar50;
                auVar34[0xf] = bVar102 | bVar84 | bVar68 | bVar51;
                auVar36 = NEON_ext(auVar34,auVar34,8,1);
                uVar21 = CONCAT17(auVar34[7] | auVar36[7],
                                  CONCAT16(auVar34[6] | auVar36[6],
                                           CONCAT15(auVar34[5] | auVar36[5],
                                                    CONCAT14(auVar34[4] | auVar36[4],
                                                             CONCAT13(auVar34[3] | auVar36[3],
                                                                      CONCAT12(auVar34[2] |
                                                                               auVar36[2],
                                                                               CONCAT11(auVar34[1] |
                                                                                        auVar36[1],
                                                                                        auVar34[0] |
                                                                                        auVar36[0]))
                                                                     )))));
                uVar21 = uVar21 | uVar21 >> 0x20;
                uVar21 = uVar21 | uVar21 >> 0x10;
                uVar23 = (uint)uVar21 | (uint)(uVar21 >> 8);
                bVar29 = (byte)uVar23;
                if (uVar18 != uVar19) {
                  if ((uVar18 & 0x38) != 0) goto code_r0x002fea28;
                  lVar7 = (uVar14 - uVar19) + -0x20;
                  pbVar22 = *pauVar15 + (uVar19 | 0x20);
                  do {
                    uVar23 = *pbVar22 | uVar23;
                    lVar7 = lVar7 + -1;
                    pbVar22 = pbVar22 + 1;
                  } while (lVar7 != 0);
                }
              }
              if ((uVar23 & 0xff) != 0) {
code_r0x002ff884:
                func_0x0079dae0();
                goto code_r0x002ff888;
              }
            }
            uVar18 = uVar14;
            if (0x1f < uVar14) {
              uVar18 = 0x20;
            }
            if (uVar18 != 0) {
              if ((acStack_7ffffffe + (0x8000137e - uVar18) < *pauVar15 + uVar18) &&
                 (pauVar15 < (undefined1 (*) [16])(acStack_7ffffffe + 0x8000137e))) {
                uVar21 = 0;
code_r0x002feaa4:
                lVar7 = uVar18 - uVar21;
                pcVar11 = *pauVar15 + uVar21;
                pcVar27 = acStack_7ffffffe + (0x8000137d - uVar21);
                do {
                  *pcVar27 = *pcVar11;
                  lVar7 = lVar7 + -1;
                  pcVar11 = pcVar11 + 1;
                  pcVar27 = pcVar27 + -1;
                } while (lVar7 != 0);
              }
              else {
                if (uVar18 < 0x10) {
                  uVar21 = 0;
                }
                else {
                  uVar21 = uVar18 & 0x30;
                  auVar36 = NEON_rev64(*pauVar15,1);
                  auVar36 = NEON_ext(auVar36,auVar36,8,1);
                  unaff_x25[0x6b] = auVar36._8_8_;
                  unaff_x25[0x6a] = auVar36._0_8_;
                  if (uVar21 != 0x10) {
                    auVar36 = NEON_rev64(pauVar15[1],1);
                    auVar36 = NEON_ext(auVar36,auVar36,8,1);
                    unaff_x25[0x69] = auVar36._8_8_;
                    unaff_x25[0x68] = auVar36._0_8_;
                  }
                  if (uVar18 == uVar21) goto code_r0x002feb44;
                  if (((uint)uVar18 >> 3 & 1) == 0) goto code_r0x002feaa4;
                }
                lVar7 = uVar18 - uVar21;
                puVar8 = (undefined8 *)(*pauVar15 + uVar21);
                pcVar11 = acStack_7ffffffe + (0x80001376 - uVar21);
                do {
                  uVar12 = NEON_rev64(*puVar8,1);
                  *(undefined8 *)pcVar11 = uVar12;
                  lVar7 = lVar7 + -8;
                  puVar8 = puVar8 + 1;
                  pcVar11 = pcVar11 + -8;
                } while (lVar7 != 0);
              }
            }
code_r0x002feb44:
            if (uVar14 < 0x20) {
              ___memset_chk(acStack_7ffffffe + 0x8000135e,0,0x20 - uVar18,0x20);
            }
            iVar4 = func_0x002fd75c(&UNK_00878915,acStack_7ffffffe + 0x8000133e,0x40,
                                    "ECDSA-sign signature");
            if (iVar4 == 0) goto LAB_002fec40;
            func_0x002c398c(unaff_x20);
            unaff_x20 = (long *)func_0x0036e274(0x10);
            if (unaff_x20 == (long *)0x0) goto LAB_002fec7c;
            lVar7 = func_0x0036e31c(0x18);
            if (lVar7 != 0) {
              *(undefined4 *)(lVar7 + 0x14) = 1;
            }
            *unaff_x20 = lVar7;
            lVar7 = func_0x0036e31c(0x18);
            if (lVar7 == 0) {
              unaff_x20[1] = 0;
LAB_002fec70:
              func_0x002c398c(unaff_x20);
              unaff_x20 = (long *)0x0;
LAB_002fec7c:
              func_0x002c398c(unaff_x20);
              unaff_x20 = (long *)0x0;
            }
            else {
              *(undefined4 *)(lVar7 + 0x14) = 1;
              unaff_x20[1] = lVar7;
              puVar8 = (undefined8 *)*unaff_x20;
              if (puVar8 == (undefined8 *)0x0) goto LAB_002fec70;
              if (*(uint *)((long)puVar8 + 0xc) < 4) {
                if ((*(byte *)((long)puVar8 + 0x14) >> 1 & 1) == 0) {
                  puVar9 = (undefined8 *)func_0x0036e358(4,8,lVar7);
                  if (puVar9 != (undefined8 *)0x0) {
                    if (*(int *)(puVar8 + 1) != 0) {
                      _memcpy(puVar9,*puVar8,(long)*(int *)(puVar8 + 1) << 3);
                    }
                    func_0x0036e3d8(*puVar8);
                    *puVar8 = puVar9;
                    *(undefined4 *)((long)puVar8 + 0xc) = 4;
                    lVar7 = unaff_x20[1];
                    goto LAB_002fecc4;
                  }
                }
                else {
                  func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
                }
                goto LAB_002fec7c;
              }
              puVar9 = (undefined8 *)*puVar8;
LAB_002fecc4:
              *(undefined4 *)(puVar8 + 1) = 4;
              *(undefined4 *)(puVar8 + 2) = 0;
              uVar86 = _UNK_0082ff28;
              uVar13 = _UNK_0082ff20;
              uVar12 = _UNK_0082ff10;
              puVar9[1] = _UNK_0082ff18;
              *puVar9 = uVar12;
              puVar9[3] = uVar86;
              puVar9[2] = uVar13;
              lVar7 = func_0x0029c764(&UNK_00878995,0x20,lVar7);
              if (lVar7 == 0) goto LAB_002fec7c;
              func_0x00373e9c(0xa296c8,&DAT_002c21e4);
              in_stack_00000d20 = 0x40;
              iVar4 = func_0x002c0d58(&UNK_00878955,0x20,acStack_7ffffffe + 0x8000069e,
                                      acStack_7ffffffe + 0x80000d1e,0xa3a728,0);
              if ((iVar4 != 0) &&
                 (iVar4 = func_0x002c3b08(acStack_7ffffffe + 0x8000069e,0x40,unaff_x20,pcVar5),
                 iVar4 != 0)) {
                func_0x00373e9c(0xa29738,&DAT_002c54ec);
                puVar8 = (undefined8 *)func_0x0036e274(0xe0);
                if (puVar8 != (undefined8 *)0x0) {
                  uVar12 = func_0x002c6ae8(0xa3b640);
                  *puVar8 = uVar12;
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
                puVar9 = (undefined8 *)func_0x0036e274(0xe0);
                if (puVar9 != (undefined8 *)0x0) {
                  uVar12 = func_0x002c6ae8(0xa3b640);
                  *puVar9 = uVar12;
                  puVar9[2] = 0;
                  puVar9[1] = 0;
                  puVar9[4] = 0;
                  puVar9[3] = 0;
                  puVar9[6] = 0;
                  puVar9[5] = 0;
                  puVar9[8] = 0;
                  puVar9[7] = 0;
                  puVar9[9] = 0;
                  puVar9[0xb] = 0;
                  puVar9[10] = 0;
                  puVar9[0xd] = 0;
                  puVar9[0xc] = 0;
                  puVar9[0xf] = 0;
                  puVar9[0xe] = 0;
                  puVar9[0x11] = 0;
                  puVar9[0x10] = 0;
                  puVar9[0x12] = 0;
                  puVar9[0x14] = 0;
                  puVar9[0x13] = 0;
                  puVar9[0x16] = 0;
                  puVar9[0x15] = 0;
                  puVar9[0x18] = 0;
                  puVar9[0x17] = 0;
                  puVar9[0x1a] = 0;
                  puVar9[0x19] = 0;
                  puVar9[0x1b] = 0;
                }
                puVar10 = (undefined8 *)func_0x0036e31c(0x18);
                if ((((puVar10 == (undefined8 *)0x0) ||
                     (*(undefined4 *)((long)puVar10 + 0x14) = 1, puVar8 == (undefined8 *)0x0)) ||
                    (puVar9 == (undefined8 *)0x0)) ||
                   (((iVar4 = func_0x002d2dc0(0xa3b640,puVar8,&UNK_008789b5,0x41,0), iVar4 == 0 ||
                     (lVar7 = func_0x0029c764(&UNK_008789f6,0x20,puVar10), lVar7 == 0)) ||
                    ((iVar4 = func_0x002c98a8(0xa3b640,puVar9,0,puVar8,puVar10,0), iVar4 == 0 ||
                     ((lVar7 = func_0x002cb544(0xa3b640,puVar9,4,acStack_7ffffffe + 0x8000165e,0x41)
                      , lVar7 == 0 ||
                      (iVar4 = func_0x002fd75c(&UNK_00878a16,acStack_7ffffffe + 0x8000165e,0x41,
                                               "Z Computation Result"), iVar4 == 0)))))))) {
                  _fwrite("Z-computation KAT failed.\n",0x1a,1,*unaff_x24);
                  func_0x002c3420(pcVar5);
                  pcVar5 = (char *)0x0;
                  pcVar11 = (char *)0x0;
                  if (puVar8 != (undefined8 *)0x0) goto code_r0x002fefa8;
                }
                else {
                  func_0x002c3420(pcVar5);
                  pcVar11 = (char *)((long)&MACH_HEADER.magic + 1);
code_r0x002fefa8:
                  pcVar5 = pcVar11;
                  func_0x002c6434(*puVar8);
                  func_0x0036e3d8(puVar8);
                }
                if (puVar9 != (undefined8 *)0x0) {
                  func_0x002c6434(*puVar9);
                  func_0x0036e3d8(puVar9);
                }
                if (puVar10 != (undefined8 *)0x0) {
                  uVar23 = *(uint *)((long)puVar10 + 0x14);
                  if ((uVar23 >> 1 & 1) == 0) {
                    func_0x0036e3d8(*puVar10);
                    uVar23 = *(uint *)((long)puVar10 + 0x14);
                  }
                  if ((uVar23 & 1) == 0) {
                    *puVar10 = 0;
                  }
                  else {
                    func_0x0036e3d8(puVar10);
                  }
                }
                func_0x002c398c(unaff_x20);
                if ((int)pcVar5 != 0) {
                  pcVar5 = (char *)func_0x0036e31c(0x18);
                  if (pcVar5 != (char *)0x0) {
                    *(undefined4 *)(pcVar5 + 0x14) = 1;
                    func_0x0036e3d8(*(undefined8 *)pcVar5);
                    *(undefined **)pcVar5 = &UNK_00878ab8;
                    *(qword *)(pcVar5 + 8) = 0x2000000020;
                    *(undefined4 *)(pcVar5 + 0x10) = 0;
                    *(uint *)(pcVar5 + 0x14) = *(uint *)(pcVar5 + 0x14) | 2;
                  }
                  unaff_x20 = (long *)func_0x002c0f98(&UNK_00831198,0x20);
                  if (unaff_x20 == (long *)0x0) goto code_r0x002ff104;
                  puVar8 = (undefined8 *)func_0x0036e31c(0x18);
                  if (puVar8 == (undefined8 *)0x0) goto code_r0x002ff0fc;
                  *(undefined4 *)((long)puVar8 + 0x14) = 1;
                  func_0x0036e3d8(*puVar8);
                  *puVar8 = &UNK_00878eb8;
                  puVar8[1] = 0x400000004;
                  *(undefined4 *)(puVar8 + 2) = 0;
                  *(uint *)((long)puVar8 + 0x14) = *(uint *)((long)puVar8 + 0x14) | 2;
                  puVar9 = (undefined8 *)unaff_x20[4];
                  if (puVar9 != (undefined8 *)0x0) {
                    uVar23 = *(uint *)((long)puVar9 + 0x14);
                    if ((uVar23 >> 1 & 1) == 0) {
                      func_0x0036e3d8(*puVar9);
                      uVar23 = *(uint *)((long)puVar9 + 0x14);
                    }
                    if ((uVar23 & 1) == 0) {
                      *puVar9 = 0;
                    }
                    else {
                      func_0x0036e3d8(puVar9);
                    }
                  }
                  unaff_x20[4] = (long)puVar8;
                  if (pcVar5 == (char *)0x0) goto code_r0x002ff108;
                  plVar16 = (long *)*unaff_x20;
                  uVar3 = *(uint *)(plVar16 + 1);
                  uVar14 = (ulong)uVar3;
                  uVar23 = uVar3 & (int)uVar3 >> 0x1f;
                  lVar7 = uVar14 * 8;
                  do {
                    lVar7 = lVar7 + -8;
                    uVar24 = (uint)uVar14;
                    uVar14 = (ulong)(uVar24 - 1);
                    if ((int)uVar24 < 1) {
                      if (-1 < (int)uVar3) goto code_r0x002ff108;
                      lVar20 = *plVar16;
                      goto code_r0x002ff66c;
                    }
                    lVar20 = *plVar16;
                  } while (*(long *)(lVar20 + lVar7) == 0);
                  uVar23 = uVar24;
code_r0x002ff66c:
                  uVar18 = *(ulong *)(lVar20 + (long)(int)(uVar23 - 1) * 8);
                  uVar21 = uVar18 >> 0x20;
                  uVar14 = uVar21;
                  if (uVar21 == 0) {
                    uVar14 = uVar18;
                  }
                  uVar26 = uVar14 >> 0x10;
                  uVar19 = uVar26;
                  if (uVar26 == 0) {
                    uVar19 = uVar14;
                  }
                  uVar14 = uVar19 >> 8;
                  if (uVar19 < 0x100) {
                    uVar14 = uVar19;
                  }
                  uVar1 = uVar14 >> 4;
                  if (uVar14 < 0x10) {
                    uVar1 = uVar14;
                  }
                  uVar2 = uVar1 >> 2;
                  if (uVar1 < 4) {
                    uVar2 = uVar1;
                  }
                  uVar23 = (uint)(uVar18 != 0) | (uVar23 - 1) * 0x40 | (uint)(uVar21 != 0) << 5 |
                           (uint)(uVar26 != 0) << 4 | (uint)(0xff < uVar19) << 3 |
                           (uint)(0xf < uVar14) << 2 | (uint)(3 < uVar1) << 1;
                  if (1 < uVar2) {
                    uVar23 = uVar23 + 1;
                  }
                  if ((uVar23 + 7 & 0xfffffff8) != 0x800) goto code_r0x002ff108;
                  iVar4 = func_0x002c0134(acStack_7ffffffe + 0x8000165e,pcVar5,unaff_x20);
                  if (iVar4 != 0x100) goto code_r0x002ff108;
                  iVar4 = func_0x002fd75c(&UNK_00878bb8,acStack_7ffffffe + 0x8000165e,0x100,"FFC DH"
                                         );
                  if (iVar4 == 0) goto code_r0x002ff108;
                  puVar8 = (undefined8 *)func_0x0029c764(&UNK_00878cb8,0x100,0);
                  plVar16 = (long *)func_0x0036e31c(0x108);
                  if (plVar16 != (long *)0x0) {
                    func_0x00373d98(plVar16 + 6);
                    *(undefined4 *)((long)plVar16 + 0x104) = 1;
                    lVar7 = func_0x0029c764(&UNK_00878ed8,0x100,0);
                    *plVar16 = lVar7;
                    if (lVar7 != 0) {
                      lVar7 = func_0x0029c764(&UNK_00878fd8,0x1c,0);
                      plVar16[2] = lVar7;
                      if (lVar7 != 0) {
                        lVar7 = func_0x0029c764(&UNK_00878ff4,0x100,0);
                        plVar16[1] = lVar7;
                        if (lVar7 != 0) {
                          lVar7 = func_0x0029c764(&UNK_008790f4,0x1c,0);
                          plVar16[4] = lVar7;
                          if (lVar7 != 0) {
                            lVar7 = func_0x0029c764(&UNK_00879110,0x100,0);
                            plVar16[3] = lVar7;
                            if (lVar7 != 0) {
                              if (puVar8 != (undefined8 *)0x0) {
                                plVar17 = (long *)*plVar16;
                                uVar3 = *(uint *)(plVar17 + 1);
                                uVar14 = (ulong)uVar3;
                                uVar23 = uVar3 & (int)uVar3 >> 0x1f;
                                lVar7 = uVar14 * 8;
                                do {
                                  lVar7 = lVar7 + -8;
                                  uVar24 = (uint)uVar14;
                                  uVar14 = (ulong)(uVar24 - 1);
                                  if ((int)uVar24 < 1) {
                                    if (-1 < (int)uVar3) goto code_r0x002ff860;
                                    lVar20 = *plVar17;
                                    goto code_r0x002ff904;
                                  }
                                  lVar20 = *plVar17;
                                } while (*(long *)(lVar20 + lVar7) == 0);
                                uVar23 = uVar24;
code_r0x002ff904:
                                uVar18 = *(ulong *)(lVar20 + (long)(int)(uVar23 - 1) * 8);
                                uVar21 = uVar18 >> 0x20;
                                uVar14 = uVar21;
                                if (uVar21 == 0) {
                                  uVar14 = uVar18;
                                }
                                uVar26 = uVar14 >> 0x10;
                                uVar19 = uVar26;
                                if (uVar26 == 0) {
                                  uVar19 = uVar14;
                                }
                                uVar14 = uVar19 >> 8;
                                if (uVar19 < 0x100) {
                                  uVar14 = uVar19;
                                }
                                uVar1 = uVar14 >> 4;
                                if (uVar14 < 0x10) {
                                  uVar1 = uVar14;
                                }
                                uVar2 = uVar1 >> 2;
                                if (uVar1 < 4) {
                                  uVar2 = uVar1;
                                }
                                uVar23 = (uint)(uVar18 != 0) | (uVar23 - 1) * 0x40 |
                                         (uint)(uVar21 != 0) << 5 | (uint)(uVar26 != 0) << 4 |
                                         (uint)(0xff < uVar19) << 3 | (uint)(0xf < uVar14) << 2 |
                                         (uint)(3 < uVar1) << 1;
                                if (1 < uVar2) {
                                  uVar23 = uVar23 + 1;
                                }
                                if ((((uVar23 + 7 & 0xfffffff8) == 0x800) &&
                                    (iVar4 = func_0x002c0134(acStack_7ffffffe + 0x8000069e,puVar8,
                                                             plVar16), iVar4 == 0x100)) &&
                                   (iVar4 = func_0x002fd75c(&UNK_00878db8,
                                                            acStack_7ffffffe + 0x8000069e,0x100,
                                                            "FFC DH FB"), iVar4 != 0)) {
                                  bVar28 = false;
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
                  func_0x002bf97c(plVar16);
                  plVar16 = (long *)0x0;
code_r0x002ff860:
                  bVar28 = true;
                  _fwrite("FFDH FB failed.\n",0x10,1,*unaff_x24);
                  goto code_r0x002ff12c;
                }
                goto LAB_002fdd0c;
              }
            }
            uVar13 = *unaff_x24;
            pcVar11 = "ECDSA-verify KAT failed.\n";
            uVar12 = 0x19;
          }
          _fwrite(pcVar11,uVar12,1,uVar13);
        }
        func_0x002c3420(pcVar5);
        func_0x002c398c(unaff_x20);
        goto LAB_002fdd0c;
      }
      uVar13 = *unaff_x24;
      pcVar11 = "RSA-verify KAT failed.\n";
      uVar12 = 0x17;
    }
    _fwrite(pcVar11,uVar12,1,uVar13);
  }
  func_0x002f7efc(pcVar5);
LAB_002fdd0c:
  do {
    uVar12 = 0;
    while( true ) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return;
      }
      ___stack_chk_fail(uVar12);
code_r0x002ff0fc:
      func_0x002bf97c(unaff_x20);
code_r0x002ff104:
      unaff_x20 = (long *)0x0;
code_r0x002ff108:
      bVar28 = true;
      _fwrite("FFDH failed.\n",0xd,1,*unaff_x24);
      puVar8 = (undefined8 *)0x0;
      plVar16 = (long *)0x0;
code_r0x002ff12c:
      func_0x002bf97c(unaff_x20);
      if (pcVar5 != (char *)0x0) {
        uVar23 = *(uint *)(pcVar5 + 0x14);
        if ((uVar23 >> 1 & 1) == 0) {
          func_0x0036e3d8(*(undefined8 *)pcVar5);
          uVar23 = *(uint *)(pcVar5 + 0x14);
        }
        if ((uVar23 & 1) == 0) {
          pcVar5[0] = '\0';
          pcVar5[1] = '\0';
          pcVar5[2] = '\0';
          pcVar5[3] = '\0';
          pcVar5[4] = '\0';
          pcVar5[5] = '\0';
          pcVar5[6] = '\0';
          pcVar5[7] = '\0';
        }
        else {
          func_0x0036e3d8(pcVar5);
        }
      }
      func_0x002bf97c(plVar16);
      if (puVar8 != (undefined8 *)0x0) {
        uVar23 = *(uint *)((long)puVar8 + 0x14);
        if ((uVar23 >> 1 & 1) == 0) {
          func_0x0036e3d8(*puVar8);
          uVar23 = *(uint *)((long)puVar8 + 0x14);
        }
        if ((uVar23 & 1) == 0) {
          *puVar8 = 0;
        }
        else {
          func_0x0036e3d8(puVar8);
        }
      }
      if (bVar28) break;
      unaff_x20 = (long *)(acStack_7ffffffe + 0x8000165e);
      _bzero(acStack_7ffffffe + 0x8000165e,0x660);
      _bzero(acStack_7ffffffe + 0x8000133e,800);
      uVar13 = _UNK_007fc2c8;
      uVar12 = _UNK_007fc2c0;
      unaff_x25[0x1a5] = _UNK_007fc2c8;
      unaff_x25[0x1a4] = uVar12;
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
      pcVar5 = &UNK_00879210;
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
      unaff_x25[0x1a5] = uVar13;
      unaff_x25[0x1a4] = uVar12;
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
      pcVar5 = acStack_7ffffffe + 0x80001cbe;
      func_0x002e345c(unaff_x29 + -0xf0,0x40,acStack_7ffffffe + 0x80001cbe);
      func_0x002e5194(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000d1e,unaff_x29 + -0xf0,
                      acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80001cde);
      uVar107 = unaff_x25[0x194];
      unaff_x26[0xcd] = unaff_x25[0x195];
      unaff_x26[0xcc] = uVar107;
      auVar36 = *(undefined1 (*) [16])(unaff_x25 + 0x196);
      unaff_x26[0xcf] = auVar36._8_8_;
      unaff_x26[0xce] = auVar36._0_8_;
      func_0x0036e464(unaff_x29 + -0xf0,0x40);
      func_0x0036e464(acStack_7ffffffe + 0x80001cbe,0x40);
      iVar4 = func_0x002fd75c(&UNK_00879f10,acStack_7ffffffe + 0x80000d1e,0x300,
                              "ML-KEM encapsulate ciphertext");
      if ((iVar4 == 0) ||
         (iVar4 = func_0x002fd75c(&UNK_0087a210,acStack_7ffffffe + 0x80000cfe,0x20,
                                  "ML-KEM encapsulate shared secret"), iVar4 == 0)) break;
      _memcpy(acStack_7ffffffe + 0x8000069e,&UNK_0087a230,0x660);
      pcVar5 = section_000002e8.segname + 8;
      _memcpy(acStack_7ffffffe + 0x8000039e,&UNK_0087a890,0x300);
      _memcpy(&uStack00000000000000a0,&UNK_0087abb0,0x300);
      unaff_x25[0x1a5] = uVar13;
      unaff_x25[0x1a4] = uVar12;
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
      unaff_x25[0x1a5] = uVar13;
      unaff_x25[0x1a4] = uVar12;
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
      uVar12 = func_0x002fd75c(&UNK_0087aeb0,acStack_7ffffffe + 0x80000cfe,0x20,
                               "ML-KEM decapsulate implicit rejection");
      uVar106 = _UNK_0087afa8;
      uVar105 = _UNK_0087afa0;
      uVar104 = _UNK_0087af90;
      uVar103 = _UNK_0087af08;
      uVar95 = _UNK_0087af00;
      uVar86 = _UNK_0087aef8;
      uVar13 = _UNK_0087aef0;
      if ((int)uVar12 != 0) {
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
        uVar12 = _UNK_0087afb0;
        unaff_x25[0xd5] = _UNK_0087afb8;
        unaff_x25[0xd4] = uVar12;
        unaff_x25[0xd7] = uVar105;
        unaff_x25[0xd6] = uVar104;
        uVar105 = _UNK_0087af68;
        uVar104 = _UNK_0087af60;
        uVar12 = _UNK_0087af50;
        unaff_x25[0xc9] = _UNK_0087af58;
        unaff_x25[200] = uVar12;
        unaff_x25[0xcb] = uVar105;
        unaff_x25[0xca] = uVar104;
        uVar105 = _UNK_0087af88;
        uVar104 = _UNK_0087af80;
        uVar12 = _UNK_0087af70;
        unaff_x25[0xcd] = _UNK_0087af78;
        unaff_x25[0xcc] = uVar12;
        unaff_x25[0xcf] = uVar105;
        unaff_x25[0xce] = uVar104;
        uVar105 = _UNK_0087aee8;
        uVar104 = _UNK_0087aee0;
        uVar12 = _UNK_0087aed0;
        unaff_x26[1] = _UNK_0087aed8;
        *unaff_x26 = uVar12;
        unaff_x26[3] = uVar105;
        unaff_x26[2] = uVar104;
        unaff_x26[5] = uVar86;
        unaff_x26[4] = uVar13;
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
        auVar36 = *(undefined1 (*) [16])(unaff_x25 + 0x6a);
        unaff_x26[0xd3] = auVar36._8_8_;
        unaff_x26[0xd2] = auVar36._0_8_;
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
          uVar13 = *unaff_x24;
          pcVar11 = "ED25519 verify failed.\n";
          uVar12 = 0x17;
          goto code_r0x002ff8f0;
        }
        uVar12 = 1;
      }
    }
  } while( true );
code_r0x002ff888:
  uVar13 = *unaff_x24;
  pcVar11 = "ED25519 sign failed.\n";
  uVar12 = 0x15;
code_r0x002ff8f0:
  _fwrite(pcVar11,uVar12,1,uVar13);
  goto LAB_002fdd0c;
}

