/* requested 7ff70c9fc540; entry 7ff70c9fc540; Recovered_7ff70c9fc540 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Recovered_7ff70c9fc540(void)

{
  longlong *plVar1;
  int *piVar2;
  float fVar3;
  undefined4 uVar4;
  longlong lVar5;
  code *pcVar6;
  undefined4 uVar7;
  float fVar8;
  float fVar9;
  float fVar10;
  char cVar11;
  byte bVar12;
  byte bVar13;
  char cVar14;
  int iVar15;
  int iVar16;
  longlong lVar17;
  undefined8 uVar18;
  undefined8 *puVar19;
  ulonglong uVar20;
  ulonglong uVar21;
  ulonglong uVar22;
  longlong *plVar23;
  ulonglong uVar24;
  undefined *puVar25;
  longlong lVar26;
  uint uVar27;
  undefined8 *puVar28;
  longlong lVar29;
  longlong *plVar30;
  undefined1 *puVar31;
  undefined1 *puVar32;
  longlong *plVar33;
  longlong *plVar34;
  longlong unaff_GS_OFFSET;
  bool bVar35;
  float fVar36;
  float fVar37;
  undefined4 uVar38;
  float fVar39;
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  float fVar43;
  float fVar44;
  float fVar45;
  undefined8 auStack_208 [4];
  undefined1 auStack_1e8 [16];
  undefined8 uStack_1d8;
  undefined4 auStack_1d0 [2];
  undefined8 uStack_1c8;
  undefined4 uStack_1c0;
  float afStack_1b8 [2];
  longlong *plStack_1b0;
  float fStack_1a8;
  float fStack_1a4;
  undefined8 uStack_1a0;
  undefined8 *puStack_198;
  undefined *puStack_190;
  undefined *puStack_188;
  undefined8 uStack_180;
  undefined *puStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  ulonglong uStack_158;
  ulonglong uStack_150;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined *puStack_130;
  longlong lStack_128;
  ulonglong uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  ulonglong uStack_108;
  ulonglong uStack_100;
  undefined8 uStack_f0;
  
  puVar28 = (undefined8 *)auStack_1e8;
  uStack_f0 = 0xfffffffffffffffe;
  auStack_208[3] = 0x7ff70c9fc5b6;
  lVar17 = func_0x7ff70c833020();
  uStack_118 = (longlong *)0x0;
  auStack_208[3] = 0x7ff70c9fc5d0;
  func_0x7ff70c83d9b0(lVar17 + 8,0,&uStack_118);
  auStack_208[3] = 0x7ff70c9fc5db;
  func_0x7ff70c826ca0(lVar17 + 0x10,0);
  uStack_118 = (longlong *)0x0;
  auStack_208[3] = 0x7ff70c9fc5f1;
  func_0x7ff70c80c230(2,&uStack_118);
  auStack_208[3] = 0x7ff70c9fc605;
  func_0x7ff70c826d00(&UNK_7ff70cb83761,0,0x202f);
  auStack_208[3] = 0x7ff70c9fc60f;
  func_0x7ff70c80c4c0(1);
  DAT_7ff70cc1b318 = 0;
  auStack_208[3] = 0x7ff70c9fc61f;
  func_0x7ff70c84b310(&fStack_1a8);
  auStack_208[3] = 0x7ff70c9fc628;
  func_0x7ff70c836be0(&uStack_118);
  fVar36 = fStack_1a4;
  fVar3 = fStack_1a8;
  fVar10 = (float)uStack_118;
  auVar40 = ZEXT416((uint)(float)uStack_118);
  uStack_118._0_4_ = fStack_1a8;
  uStack_118._4_4_ = fStack_1a4;
  auStack_208[3] = 0x7ff70c9fc63b;
  uVar18 = func_0x7ff70c83dc60();
  auVar40 = blendps(_DAT_7ff70cb747b0,auVar40,1);
  uStack_138 = (longlong *)CONCAT44(auVar40._4_4_ + fVar36,auVar40._0_4_ + fVar3);
  uStack_1c0 = 0;
  uStack_1c8._0_4_ = 0;
  auStack_208[3] = 0x7ff70c9fc681;
  func_0x7ff70c7bd960(uVar18,&uStack_118,&uStack_138,0xff1b1616);
  uStack_168 = (longlong *)CONCAT44(uStack_138._4_4_,(float)uStack_118);
  uStack_1c8 = CONCAT44(uStack_1c8._4_4_,0x3f800000);
  auStack_208[3] = 0x7ff70c9fc6b1;
  func_0x7ff70c7bd6c0(uVar18,&uStack_168,&uStack_138,0xff2f2828);
  fVar3 = uStack_118._4_4_;
  auStack_208[3] = 0x7ff70c9fc6bb;
  fVar36 = (float)func_0x7ff70c84c080();
  uStack_168 = (longlong *)
               CONCAT44(fVar3 + _DAT_7ff70cb747c0 + fVar36 * _DAT_7ff70cb1bb40,
                        (float)uStack_118 + _DAT_7ff70cb1d724);
  uStack_1c8 = 0;
  auStack_208[3] = 0x7ff70c9fc70a;
  func_0x7ff70c7c2230(uVar18,&uStack_168,0xffe9e2e2,&UNK_7ff70cb8376d);
  auStack_208[3] = 0x7ff70c9fc73a;
  cVar11 = func_0x7ff70ca00390(&UNK_7ff70cb847bb,
                               CONCAT44(uStack_118._4_4_,(float)uStack_138 + _DAT_7ff70cb747c4),
                               0xff383030,0);
  if (cVar11 != '\0') {
    puVar28 = auStack_208 + 3;
    auStack_208[3] = 6;
    func_0x7ff70d72745e(_DAT_7ff70cc1b308);
  }
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fc783;
  cVar11 = func_0x7ff70ca00390(&UNK_7ff70cb865f3,
                               CONCAT44(uStack_118._4_4_,(float)uStack_138 + _DAT_7ff70cb747c8),
                               0xff3e3ce8,1);
  if (cVar11 != '\0') {
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc78e;
    func_0x7ff70d638fdb(0);
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  uStack_118 = (longlong *)CONCAT44(fStack_1a4 + _UNK_7ff70cb747d4,fStack_1a8 + _DAT_7ff70cb747d0);
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fc7a8;
  func_0x7ff70c84b370(&uStack_118);
  uStack_118 = (longlong *)_DAT_7ff70cb747e0;
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fc7c3;
  func_0x7ff70c80c230(2,&uStack_118);
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fc7cd;
  uVar18 = func_0x7ff70c80a1e0(2);
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fc7da;
  func_0x7ff70c80a550(3,uVar18);
  fVar3 = *(float *)(lVar17 + 0x14);
  uStack_118 = (longlong *)CONCAT44(_DAT_7ff70cb747f0 + fVar3,fVar10);
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fc817;
  func_0x7ff70c8355a0(&UNK_7ff70cb80f23,&uStack_118,2,8);
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fc821;
  func_0x7ff70c80a7b0(1);
  puVar31 = (undefined1 *)puVar28;
  switch(_DAT_7ff70cbed108) {
  case 0:
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc849;
    func_0x7ff70c84b3e0(&uStack_140);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc852;
    func_0x7ff70c836be0(&uStack_1a0);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc857;
    fVar36 = (float)func_0x7ff70c84c080();
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc85f;
    fVar39 = (float)func_0x7ff70c84c130();
    lVar17 = _DAT_7ff70cbed278;
    if (0 < _DAT_7ff70cbed278) {
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc87a;
      lVar29 = (*_DAT_7ff70cb96630)(0);
      if (lVar17 <= lVar29) {
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc88b;
        func_0x7ff70ca2e140(&uStack_118);
        plVar30 = &uStack_118;
        if (7 < uStack_100) {
          plVar30 = uStack_118;
        }
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc89e;
        func_0x7ff70caa92d0(plVar30);
        if (7 < uStack_100) {
          uVar20 = uStack_100 * 2 + 2;
          plVar30 = uStack_118;
          if (0xfff < uVar20) {
            plVar30 = (longlong *)uStack_118[-1];
            if ((undefined *)0x1f < (undefined *)((longlong)uStack_118 + (-8 - (longlong)plVar30)))
            goto code_r0x7ff70c9fe570;
            uVar20 = uStack_100 * 2 + 0x29;
          }
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc8e4;
          func_0x7ff70caa4e20(plVar30,uVar20);
        }
        LOCK();
        _DAT_7ff70cbed278 = -1;
        UNLOCK();
        uRam00007ff70cbed10d = 0;
      }
    }
    if (_DAT_7ff70cbed278 < 0) {
      uStack_118 = (longlong *)0x0;
      uStack_110 = (undefined *)0x0;
      uStack_108 = 0;
      uStack_100 = 0xf;
      bVar35 = true;
    }
    else {
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc912;
      func_0x7ff70ca053d0(&uStack_118);
      bVar35 = uStack_108 == 0;
    }
    fVar37 = _DAT_7ff70cb1ba70;
    fVar44 = _DAT_7ff70cb1d674 + fVar36;
    fVar43 = 0.0;
    if (!bVar35) {
      fVar43 = fVar44;
    }
    fVar8 = (float)uStack_140;
    fVar45 = (float)uStack_1a0 * _DAT_7ff70cb1ba70;
    fVar9 = uStack_140._4_4_;
    fVar43 = (((_UNK_7ff70cb74908 - fVar36) - (fVar39 + fVar39)) - fVar43) + uStack_1a0._4_4_;
    uStack_138 = (longlong *)_UNK_7ff70cb748f0;
    puStack_130 = _UNK_7ff70cb748f8;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdc7f;
    func_0x7ff70c80a550(0,&uStack_138);
    *(undefined4 *)((longlong)puVar28 + 0x20) = 0xbf800000;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdc9d;
    func_0x7ff70c80cf40(&uStack_168,&UNK_7ff70cb8ce09,0,0);
    fVar45 = fVar8 + _UNK_7ff70cb74904 + fVar45;
    fVar37 = fVar43 * fVar37 + fVar9;
    if (fVar37 <= fVar9) {
      fVar37 = fVar9;
    }
    fVar43 = _UNK_7ff70cb7490c + fVar45;
    uStack_138 = (longlong *)CONCAT44(fVar37,(float)uStack_168 * _DAT_7ff70cb1bb40 + fVar43);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdcef;
    func_0x7ff70c84b510(&uStack_138);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdcfe;
    func_0x7ff70c876de0(&UNK_7ff70cb8ce09,0);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdd09;
    func_0x7ff70c80a7b0(1);
    fVar37 = fVar37 + fVar44;
    uStack_138 = (longlong *)CONCAT44(fVar37,fVar45);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdd24;
    func_0x7ff70c84b510(&uStack_138);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdd32;
    func_0x7ff70c8068c0();
    *(undefined8 *)((longlong)puVar28 + 0x20) = 0;
    *(undefined8 *)((longlong)puVar28 + 0x28) = 0;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdd5a;
    bVar12 = func_0x7ff70c88d7d0(&UNK_7ff70cb7ff25,0x7ff70cbed10d,0x25,0x450);
    if (uStack_108 != 0) {
      uStack_138 = (longlong *)_UNK_7ff70cb74920;
      puStack_130 = _UNK_7ff70cb74928;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdd7e;
      func_0x7ff70c80a550(0,&uStack_138);
      plVar30 = uStack_118;
      if (uStack_100 < 0x10) {
        plVar30 = &uStack_118;
      }
      *(undefined4 *)((longlong)puVar28 + 0x20) = 0xbf800000;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdda9;
      func_0x7ff70c80cf40(&uStack_168,plVar30,0,0);
      uStack_138 = (longlong *)
                   CONCAT44(_DAT_7ff70cb1d5f4 + fVar39 + fVar37,
                            (float)uStack_168 * _DAT_7ff70cb1bb40 + fVar43);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdde0;
      func_0x7ff70c84b510(&uStack_138);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fddeb;
      func_0x7ff70c876de0(plVar30,0);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fddf6;
      func_0x7ff70c80a7b0(1);
      fVar37 = fVar37 + fVar36;
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fde08;
    uVar24 = func_0x7ff70cb12e80(0x7ff70cbed10d);
    fVar37 = _DAT_7ff70cb1d674 + fVar39 + fVar37;
    uStack_138 = (longlong *)CONCAT44(fVar37,_UNK_7ff70cb1d9d0 + fVar45);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fde3c;
    func_0x7ff70c84b510(&uStack_138);
    if (uVar24 - 1 < 0x24) {
      uStack_138 = (longlong *)(ulonglong)_UNK_7ff70cb74880;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fde63;
      bVar13 = func_0x7ff70c878d50(&UNK_7ff70cb861e1,&uStack_138);
      if (((bVar12 | bVar13) != 1) || ((bRam00007ff70cbed10c & 1) != 0)) goto code_r0x7ff70c9fded9;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fde82;
      uVar20 = func_0x7ff70cb12e80(0x7ff70cbed10d);
      if (uRam00007ff70cbed150 < uVar20) {
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdea8;
        func_0x7ff70ca005a0(0x7ff70cbed138,uVar20);
      }
      else {
        lVar17 = lRam00007ff70cbed138;
        if (uRam00007ff70cbed150 < 0x10) {
          lVar17 = 0x7ff70cbed138;
        }
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe44d;
        uRam00007ff70cbed148 = uVar20;
        func_0x7ff70cb12b70(lVar17,0x7ff70cbed10d,uVar20);
        *(undefined1 *)(lVar17 + uVar20) = 0;
      }
      iVar15 = _DAT_7ff70cc1b2d8;
      if (_DAT_7ff70cc1b2d8 == 0) {
code_r0x7ff70c9fe49b:
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe4a5;
        puStack_198 = (undefined8 *)func_0x7ff70ca8ff40(0x10);
        *puStack_198 = &DAT_7ff70cbed108;
        puStack_198[1] = &UNK_7ff70ca063a0;
        *(undefined ***)((longlong)puVar28 + 0x28) = &puStack_130;
        *(undefined4 *)((longlong)puVar28 + 0x20) = 0;
        plVar30 = (longlong *)&UNK_7ff70ca00890;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe4e3;
        func_0x7ff70d5e8e94(0,0,&UNK_7ff70ca00890,puStack_198);
        uStack_138 = plVar30;
        if (plVar30 != (longlong *)0x0) {
          if (_DAT_7ff70cc1b2d8 != 0) goto code_r0x7ff70c9fe84f;
          _DAT_7ff70cc1b2d8 = puStack_130;
          _DAT_7ff70cc1b2d0 = plVar30;
          goto code_r0x7ff70c9fded9;
        }
        goto code_r0x7ff70c9fe8d7;
      }
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe460;
      iVar16 = func_0x7ff70cb125b0();
      if (iVar15 != iVar16) {
        uStack_138 = _DAT_7ff70cc1b2d0;
        puStack_130 = _DAT_7ff70cc1b2d8;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe47e;
        iVar15 = func_0x7ff70cb125c0(&uStack_138,0);
        if (iVar15 != 0) goto code_r0x7ff70c9fe8f4;
        _DAT_7ff70cc1b2d0 = (longlong *)0x0;
        _DAT_7ff70cc1b2d8 = (undefined *)((ulonglong)_DAT_7ff70cc1b2d8 & 0xffffffff00000000);
        goto code_r0x7ff70c9fe49b;
      }
    }
    else {
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdeb5;
      func_0x7ff70c83c640(1);
      uStack_138 = (longlong *)(ulonglong)_UNK_7ff70cb74880;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fded2;
      func_0x7ff70c878d50(&UNK_7ff70cb861e1,&uStack_138);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fded8;
      func_0x7ff70c83c8a0();
code_r0x7ff70c9fded9:
      uStack_138 = (longlong *)CONCAT44(fVar37,fVar45 + _UNK_7ff70cb74930);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdef6;
      func_0x7ff70c84b510(&uStack_138);
      uStack_138 = (longlong *)(ulonglong)_UNK_7ff70cb74880;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdf13;
      cVar11 = func_0x7ff70c878d50(&UNK_7ff70cb7fff4,&uStack_138);
      puVar32 = (undefined1 *)puVar28;
      if ((cVar11 == '\0') || ((bRam00007ff70cbed10c & 1) != 0)) {
code_r0x7ff70c9fe025:
        puVar28 = (undefined8 *)puVar32;
        plVar30 = uStack_118;
        uVar20 = uStack_100;
        if (0x24 < uVar24) {
          uStack_138 = (longlong *)_UNK_7ff70cb74940;
          puStack_130 = _UNK_7ff70cb74948;
          *(undefined **)(puVar32 + -8) = &UNK_7ff70c9fe045;
          func_0x7ff70c80a550(0,&uStack_138);
          *(undefined4 *)(puVar32 + 0x20) = 0xbf800000;
          *(undefined **)(puVar32 + -8) = &UNK_7ff70c9fe063;
          func_0x7ff70c80cf40(&uStack_168,&UNK_7ff70cb8f2cc,0,0);
          uStack_138 = (longlong *)
                       CONCAT44(fVar39 + _DAT_7ff70cb1d940 + fVar37,
                                fVar43 + (float)uStack_168 * _DAT_7ff70cb1bb40);
          *(undefined **)(puVar32 + -8) = &UNK_7ff70c9fe096;
          func_0x7ff70c84b510(&uStack_138);
          *(undefined **)(puVar32 + -8) = &UNK_7ff70c9fe0a5;
          func_0x7ff70c876de0(&UNK_7ff70cb8f2cc,0);
          *(undefined **)(puVar32 + -8) = &UNK_7ff70c9fe0b0;
          func_0x7ff70c80a7b0(1);
          plVar30 = uStack_118;
          uVar20 = uStack_100;
        }
        goto joined_r0x7ff70c9fd721;
      }
      iVar15 = _DAT_7ff70cc1b2d8;
      if (_DAT_7ff70cc1b2d8 == 0) {
code_r0x7ff70c9fdf75:
        puStack_190 = (undefined *)0x10;
        puStack_178 = (undefined *)0x20;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdf90;
        puVar19 = (undefined8 *)(*_DAT_7ff70cb96730)(0x20);
        if (puVar19 == (undefined8 *)0x0) {
          uStack_168 = (longlong *)&UNK_7ff70cb868f0;
          uStack_160 = 0x6e;
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe87f;
          func_0x7ff70ca90020(0x7ff70cc1b2a0,&uStack_168,&puStack_178,&puStack_190);
          lStack_128 = 0;
          puStack_130 = &UNK_7ff70cb846bb;
          uStack_138 = (longlong *)&UNK_7ff70cb740b8;
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe8ae;
          func_0x7ff70cb12a50(&uStack_138,&UNK_7ff70cbe4470);
        }
        else {
          *puVar19 = 0x10;
          *(undefined1 *)(puVar19 + 1) = 1;
          LOCK();
          _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + 0x10;
          UNLOCK();
          LOCK();
          _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + (longlong)puStack_190;
          UNLOCK();
          puStack_198 = puVar19 + 2;
          puVar19[2] = &DAT_7ff70cbed108;
          puVar19[3] = &UNK_7ff70ca285e0;
          *(undefined ***)((longlong)puVar28 + 0x28) = &puStack_130;
          *(undefined4 *)((longlong)puVar28 + 0x20) = 0;
          puVar32 = (undefined1 *)((longlong)puVar28 + -8);
          puVar31 = (undefined1 *)((longlong)puVar28 + -8);
          *(undefined8 *)((longlong)puVar28 + -8) = 0;
          *(undefined **)((longlong)puVar28 + -0x10) = &UNK_7ff70c9fdfff;
          uStack_138 = (longlong *)func_0x7ff70da52bf8(0,0,&UNK_7ff70ca00890,puStack_198);
          puVar28 = (undefined8 *)((longlong)puVar28 + -8);
          if (uStack_138 != (longlong *)0x0) {
            if (_DAT_7ff70cc1b2d8 != 0) {
code_r0x7ff70c9fe84f:
              *(undefined **)(puVar31 + -8) = &UNK_7ff70c9fe854;
              func_0x7ff70d76ad83();
                    /* WARNING: Bad instruction - Truncating control flow here */
              halt_baddata();
            }
            _DAT_7ff70cc1b2d8 = puStack_130;
            _DAT_7ff70cc1b2d0 = uStack_138;
            goto code_r0x7ff70c9fe025;
          }
        }
        puStack_130 = (undefined *)((ulonglong)puStack_130 & 0xffffffff00000000);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe8c0;
        func_0x7ff70cb124d0(6);
code_r0x7ff70c9fe8c1:
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe8cb;
        func_0x7ff70cb124d0(5);
      }
      else {
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdf3a;
        iVar16 = func_0x7ff70cb125b0();
        if (iVar15 == iVar16) goto code_r0x7ff70c9fe8c1;
        uStack_138 = _DAT_7ff70cc1b2d0;
        puStack_130 = _DAT_7ff70cc1b2d8;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdf58;
        iVar15 = func_0x7ff70cb125c0(&uStack_138,0);
        if (iVar15 == 0) {
          _DAT_7ff70cc1b2d0 = (longlong *)0x0;
          _DAT_7ff70cc1b2d8 = (undefined *)((ulonglong)_DAT_7ff70cc1b2d8 & 0xffffffff00000000);
          goto code_r0x7ff70c9fdf75;
        }
      }
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe8d6;
      func_0x7ff70cb124d0(2);
code_r0x7ff70c9fe8d7:
      puStack_130 = (undefined *)((ulonglong)puStack_130 & 0xffffffff00000000);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe8e8;
      func_0x7ff70cb124d0(6);
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe8f3;
    func_0x7ff70cb124d0(5);
code_r0x7ff70c9fe8f4:
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe8fe;
    func_0x7ff70cb124d0(2);
    pcVar6 = (code *)swi(3);
    (*pcVar6)();
    return;
  case 1:
    uStack_118 = (longlong *)0x0;
    uStack_110 = (undefined *)0x0;
    uStack_108 = 0;
    uStack_100 = 0xf;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcda5;
    iVar15 = func_0x7ff70cb12570(0x7ff70cbed160);
    uVar20 = uRam00007ff70cbed1c0;
    if (iVar15 == 0) {
      if (iRam00007ff70cbed1ac != 0x7fffffff) {
        if (uRam00007ff70cbed1c8 < 0x10) {
          puVar31 = (undefined1 *)0x7ff70cbed1b0;
          if (0xf < uRam00007ff70cbed1c0) goto code_r0x7ff70c9fd741;
code_r0x7ff70c9fcde3:
          uStack_108 = uRam00007ff70cbed1c0;
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcdf6;
          func_0x7ff70cb12b70(&uStack_118,puVar31,uRam00007ff70cbed1c0);
          *(undefined1 *)((longlong)&uStack_118 + uVar20) = 0;
        }
        else {
          puVar31 = puRam00007ff70cbed1b0;
          if (uRam00007ff70cbed1c0 < 0x10) goto code_r0x7ff70c9fcde3;
code_r0x7ff70c9fd741:
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd74d;
          func_0x7ff70ca005a0(&uStack_118,uRam00007ff70cbed1c0);
        }
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd75a;
        func_0x7ff70cb12580(0x7ff70cbed160);
        uStack_138 = (longlong *)_UNK_7ff70cb74800;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd775;
        func_0x7ff70c80c230(2,&uStack_138);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd780;
        uVar18 = func_0x7ff70c80a1e0(2);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd78e;
        func_0x7ff70c80a550(3,uVar18);
        uStack_138 = (longlong *)0x0;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd7b3;
        func_0x7ff70c8355a0(&UNK_7ff70cb80076,&uStack_138,2,8);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd7be;
        func_0x7ff70c80a7b0(1);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd7cd;
        func_0x7ff70c876de0(&UNK_7ff70cb7ff97,0);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd7d3;
        func_0x7ff70c87d140();
        uStack_138 = (longlong *)_UNK_7ff70cb748f0;
        puStack_130 = _UNK_7ff70cb748f8;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd7ea;
        func_0x7ff70c80a550(0,&uStack_138);
        plVar30 = uStack_118;
        if (uStack_100 < 0x10) {
          plVar30 = &uStack_118;
        }
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb00;
        func_0x7ff70c877260(&UNK_7ff70cb8320d,plVar30);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb0b;
        func_0x7ff70c80a7b0(1);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb11;
        func_0x7ff70c87d140();
        uStack_138 = (longlong *)(ulonglong)_DAT_7ff70cb1bae8;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb23;
        func_0x7ff70c819640();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb3f;
        func_0x7ff70c87c710();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb45;
        func_0x7ff70c87d140();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb4b;
        fVar36 = (float)func_0x7ff70c84c130();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb58;
        func_0x7ff70c836be0(&uStack_138);
        fVar36 = (_DAT_7ff70cb1d948 - fVar36) + uStack_138._4_4_;
        if (fVar36 <= _UNK_7ff70cb74840) {
          fVar36 = _UNK_7ff70cb74840;
        }
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb77;
        func_0x7ff70ca008f0(fVar36);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb7d;
        func_0x7ff70c87d140();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb83;
        func_0x7ff70c84b450();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdb90;
        func_0x7ff70c836be0(&uStack_138);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdbb2;
        func_0x7ff70c84b590();
        uStack_138 = (longlong *)(ulonglong)_UNK_7ff70cb1f318;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdbcf;
        cVar11 = func_0x7ff70c878d50(&UNK_7ff70cb85002,&uStack_138);
        if (cVar11 != '\0') {
          LOCK();
          uRam00007ff70cbed280 = 1;
          UNLOCK();
        }
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdbe1;
        func_0x7ff70c836f00();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdbec;
        func_0x7ff70c80c4c0(1);
        plVar30 = uStack_118;
        uVar20 = uStack_100;
        goto joined_r0x7ff70c9fd721;
      }
    }
    else {
code_r0x7ff70c9fe69f:
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe6a9;
      func_0x7ff70cb124d0(5);
code_r0x7ff70c9fe6aa:
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe6b4;
      func_0x7ff70cb124d0(5);
code_r0x7ff70c9fe6b5:
      iRam00007ff70cbed1ac = 0x7ffffffe;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe6c9;
      func_0x7ff70cb124d0(6);
code_r0x7ff70c9fe6ca:
      iRam00007ff70cbed1ac = 0x7ffffffe;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe6de;
      func_0x7ff70cb124d0(6);
    }
    iRam00007ff70cbed1ac = 0x7ffffffe;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe6f3;
    func_0x7ff70cb124d0(6);
    break;
  case 2:
    uStack_118 = (longlong *)0x0;
    uStack_110 = (undefined *)0x0;
    uStack_108 = 0;
    uStack_100 = 0xf;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fccaa;
    iVar15 = func_0x7ff70cb12570(0x7ff70cbed160);
    uVar20 = uRam00007ff70cbed1c0;
    if (iVar15 != 0) {
code_r0x7ff70c9fe689:
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe693;
      func_0x7ff70cb124d0(5);
code_r0x7ff70c9fe694:
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe69e;
      func_0x7ff70cb124d0(5);
      goto code_r0x7ff70c9fe69f;
    }
    if (iRam00007ff70cbed1ac == 0x7fffffff) goto code_r0x7ff70c9fe6b5;
    if (uRam00007ff70cbed1c8 < 0x10) {
      puVar31 = (undefined1 *)0x7ff70cbed1b0;
      if (0xf < uRam00007ff70cbed1c0) goto code_r0x7ff70c9fce8f;
code_r0x7ff70c9fcce8:
      uStack_108 = uRam00007ff70cbed1c0;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fccfb;
      func_0x7ff70cb12b70(&uStack_118,puVar31,uRam00007ff70cbed1c0);
      *(undefined1 *)((longlong)&uStack_118 + uVar20) = 0;
    }
    else {
      puVar31 = puRam00007ff70cbed1b0;
      if (uRam00007ff70cbed1c0 < 0x10) goto code_r0x7ff70c9fcce8;
code_r0x7ff70c9fce8f:
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fce9b;
      func_0x7ff70ca005a0(&uStack_118,uRam00007ff70cbed1c0);
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcea8;
    func_0x7ff70cb12580(0x7ff70cbed160);
    uStack_138 = (longlong *)_UNK_7ff70cb74800;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcec3;
    func_0x7ff70c80c230(2,&uStack_138);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcece;
    uVar18 = func_0x7ff70c80a1e0(2);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcedc;
    func_0x7ff70c80a550(3,uVar18);
    uStack_138 = (longlong *)0x0;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcf01;
    func_0x7ff70c8355a0(&UNK_7ff70cb80076,&uStack_138,2,8);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcf0c;
    func_0x7ff70c80a7b0(1);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcf1b;
    func_0x7ff70c876de0(&UNK_7ff70cb85864,0);
    uStack_138 = (longlong *)_UNK_7ff70cb74820;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcf32;
    func_0x7ff70c87d1c0(&uStack_138);
    uStack_138 = (longlong *)_UNK_7ff70cb74890;
    puStack_130 = _UNK_7ff70cb74898;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcf49;
    func_0x7ff70c80a550(0,&uStack_138);
    plVar30 = uStack_118;
    if (uStack_100 < 0x10) {
      plVar30 = &uStack_118;
    }
    plVar33 = (longlong *)&UNK_7ff70cb8dbcb;
    if (uStack_108 != 0) {
      plVar33 = plVar30;
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fda5d;
    func_0x7ff70c876de0(plVar33,0);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fda68;
    func_0x7ff70c80a7b0(1);
    plVar30 = _UNK_7ff70cb74850;
    uStack_138 = _UNK_7ff70cb74850;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fda7f;
    func_0x7ff70c87d1c0(&uStack_138);
    uStack_138 = (longlong *)(ulonglong)_DAT_7ff70cb1bae8;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fda91;
    func_0x7ff70c819640();
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdaad;
    func_0x7ff70c87c710();
    uStack_138 = plVar30;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdabc;
    func_0x7ff70c87d1c0(&uStack_138);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdac6;
    func_0x7ff70c836be0(&uStack_138);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdad9;
    func_0x7ff70ca008f0();
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdadf;
    func_0x7ff70c836f00();
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fdaea;
    func_0x7ff70c80c4c0(1);
    plVar30 = uStack_118;
    uVar20 = uStack_100;
joined_r0x7ff70c9fd721:
    if (0xf < uVar20) {
      uVar24 = uVar20 + 1;
      plVar33 = plVar30;
      if (0xfff < uVar24) {
        plVar33 = (longlong *)plVar30[-1];
        if ((undefined *)0x1f < (undefined *)((longlong)plVar30 + (-8 - (longlong)plVar33)))
        goto code_r0x7ff70c9fe570;
        uVar24 = uVar20 + 0x28;
      }
      *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe25b;
      func_0x7ff70caa4e20(plVar33,uVar24);
    }
    goto LAB_7ff70c9fe25b;
  case 3:
    uStack_168 = (longlong *)0x0;
    uStack_160 = 0;
    uStack_158 = 0;
    uStack_150 = 0xf;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcd28;
    iVar15 = func_0x7ff70cb12570(0x7ff70cbed160);
    uVar20 = uRam00007ff70cbed1c0;
    if (iVar15 != 0) goto code_r0x7ff70c9fe694;
    if (iRam00007ff70cbed1ac == 0x7fffffff) goto code_r0x7ff70c9fe6ca;
    if (uRam00007ff70cbed1c8 < 0x10) {
      puVar31 = (undefined1 *)0x7ff70cbed1b0;
      if (0xf < uRam00007ff70cbed1c0) goto code_r0x7ff70c9fcf6f;
code_r0x7ff70c9fcd66:
      uStack_158 = uRam00007ff70cbed1c0;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcd78;
      func_0x7ff70cb12b70(&uStack_168,puVar31,uRam00007ff70cbed1c0);
      *(undefined1 *)((longlong)&uStack_168 + uVar20) = 0;
    }
    else {
      puVar31 = puRam00007ff70cbed1b0;
      if (uRam00007ff70cbed1c0 < 0x10) goto code_r0x7ff70c9fcd66;
code_r0x7ff70c9fcf6f:
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcf7a;
      func_0x7ff70ca005a0(&uStack_168,uRam00007ff70cbed1c0);
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcf87;
    func_0x7ff70cb12580(0x7ff70cbed160);
    uStack_118 = (longlong *)_UNK_7ff70cb74800;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcfa2;
    func_0x7ff70c80c230(2,&uStack_118);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcfad;
    uVar18 = func_0x7ff70c80a1e0(2);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcfbb;
    func_0x7ff70c80a550(3,uVar18);
    uStack_118 = (longlong *)0x0;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcfe0;
    func_0x7ff70c8355a0(&UNK_7ff70cb80076,&uStack_118,2,8);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcfeb;
    func_0x7ff70c80a7b0(1);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcffa;
    func_0x7ff70c876de0(&UNK_7ff70cb8595d,0);
    uStack_118 = (longlong *)_UNK_7ff70cb74890;
    uStack_110 = _UNK_7ff70cb74898;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd011;
    func_0x7ff70c80a550(0,&uStack_118);
    plVar30 = &uStack_168;
    if (0xf < uStack_150) {
      plVar30 = uStack_168;
    }
    plVar33 = (longlong *)&UNK_7ff70cb8dbda;
    if (uStack_158 != 0) {
      plVar33 = plVar30;
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd034;
    func_0x7ff70c876de0(plVar33,0);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd03f;
    func_0x7ff70c80a7b0(1);
    uStack_118 = (longlong *)_UNK_7ff70cb748a0;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd056;
    func_0x7ff70c87d1c0(&uStack_118);
    uStack_118 = (longlong *)(ulonglong)_DAT_7ff70cb1bae8;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd077;
    func_0x7ff70c87c710();
    uStack_118 = _UNK_7ff70cb74830;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd08e;
    func_0x7ff70c87d1c0(&uStack_118);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd094;
    fVar37 = (float)func_0x7ff70c84c080();
    uStack_118 = (longlong *)_UNK_7ff70cb748b0;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd0b3;
    func_0x7ff70c80c230(2,&uStack_118);
    uStack_118 = (longlong *)_UNK_7ff70cb748c0;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd0da;
    func_0x7ff70c8355a0(&UNK_7ff70cb81941,&uStack_118,1,0);
    uStack_118 = _UNK_7ff70cb748d0;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd0f9;
    func_0x7ff70c80c230(0xe,&uStack_118);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd0ff;
    func_0x7ff70c84b450();
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd10f;
    iVar15 = func_0x7ff70cb12570(0x7ff70cbed208);
    fVar39 = _UNK_7ff70cb748e8;
    uVar7 = _UNK_7ff70cb748e4;
    fVar36 = _DAT_7ff70cb1ba70;
    if (iVar15 != 0) goto code_r0x7ff70c9fe709;
    if (iRam00007ff70cbed254 != 0x7fffffff) {
      fVar37 = fVar37 + _DAT_7ff70cb1d5f4;
      plStack_1b0 = plRam00007ff70cbed260;
      for (plVar30 = plRam00007ff70cbed258; plVar33 = &uStack_118, plVar30 != plStack_1b0;
          plVar30 = plVar30 + 2) {
        uVar27 = *(uint *)(*plVar30 + 0x24);
        puVar19 = (undefined8 *)(ulonglong)uVar27;
        fVar43 = fVar36;
        uVar38 = uVar7;
        uVar4 = uVar7;
        if (uVar27 - 1 < 4) {
          uVar20 = (ulonglong)(uVar27 - 1);
          uVar38 = *(undefined4 *)(&UNK_7ff70cb74bec + uVar20 * 4);
          uVar4 = *(undefined4 *)(&UNK_7ff70cb74bfc + uVar20 * 4);
          fVar43 = *(float *)(&UNK_7ff70cb74c0c + uVar20 * 4);
        }
        uStack_118 = (longlong *)CONCAT44(uVar4,uVar38);
        uStack_110 = (undefined *)CONCAT44(0x3f800000,fVar43);
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd20e;
        func_0x7ff70c80a550(0,plVar33);
        plVar34 = (longlong *)*plVar30;
        if (0xf < (ulonglong)plVar34[3]) {
          plVar34 = (longlong *)*plVar34;
        }
        *(undefined4 *)((longlong)puVar28 + 0x20) = 0xbf800000;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd235;
        func_0x7ff70c80cf40(plVar33,plVar34,0,0);
        if ((float)uStack_118 <= fVar39) {
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd2ea;
          func_0x7ff70c876de0(plVar34,0);
        }
        else {
          uStack_118 = (longlong *)0x0;
          uStack_110 = (undefined *)0x0;
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd24e;
          uVar20 = func_0x7ff70cb12e80(plVar34);
          if ((longlong)uVar20 < 0) {
code_r0x7ff70c9fe5cd:
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe5d2;
            func_0x7ff70ca00780();
code_r0x7ff70c9fe5d3:
            puStack_190 = &UNK_7ff70cb868f0;
            puStack_188 = (undefined *)0x6e;
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe5fe;
            func_0x7ff70ca90020(0x7ff70cc1b2a0,&puStack_190,&uStack_140,&puStack_178);
            lStack_128 = 0;
            puStack_130 = &UNK_7ff70cb846bb;
            uStack_138 = (longlong *)&UNK_7ff70cb740b8;
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe62d;
            func_0x7ff70cb12a50(&uStack_138,&UNK_7ff70cbe4470);
code_r0x7ff70c9fe62e:
            puStack_190 = &UNK_7ff70cb868f0;
            puStack_188 = (undefined *)0x6e;
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe659;
            func_0x7ff70ca90020(0x7ff70cc1b2a0,&puStack_190,&uStack_140,&puStack_178);
            lStack_128 = 0;
            puStack_130 = &UNK_7ff70cb846bb;
            uStack_138 = (longlong *)&UNK_7ff70cb740b8;
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe688;
            func_0x7ff70cb12a50(&uStack_138,&UNK_7ff70cbe4470);
            goto code_r0x7ff70c9fe689;
          }
          uVar24 = 0xf;
          puStack_198 = puVar19;
          if (0xf < uVar20) {
            uVar21 = uVar20 | 0xf;
            uVar24 = 0x16;
            if (0x16 < uVar21) {
              uVar24 = uVar21;
            }
            if (uVar21 < 0xfff) {
              puVar25 = (undefined *)(uVar24 + 1);
              uStack_140 = uVar24 + 0x11;
              *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd306;
              puStack_178 = puVar25;
              puVar19 = (undefined8 *)(*_DAT_7ff70cb96730)();
              if (puVar19 == (undefined8 *)0x0) goto code_r0x7ff70c9fe5d3;
              *puVar19 = puVar25;
              *(undefined1 *)(puVar19 + 1) = 1;
              LOCK();
              _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + (longlong)puVar25;
              UNLOCK();
              LOCK();
              _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + (longlong)puStack_178;
              UNLOCK();
              plVar33 = puVar19 + 2;
              uStack_118 = plVar33;
            }
            else {
              puVar25 = (undefined *)(uVar24 + 0x28);
              uStack_140 = uVar24 + 0x38;
              *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd2a2;
              puStack_178 = puVar25;
              puVar19 = (undefined8 *)(*_DAT_7ff70cb96730)();
              if (puVar19 == (undefined8 *)0x0) goto code_r0x7ff70c9fe62e;
              *puVar19 = puVar25;
              *(undefined1 *)(puVar19 + 1) = 1;
              LOCK();
              _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + (longlong)puVar25;
              UNLOCK();
              LOCK();
              _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + (longlong)puStack_178;
              UNLOCK();
              plVar33 = (longlong *)((longlong)puVar19 + 0x37U & 0xffffffffffffffe0);
              plVar33[-1] = (longlong)(puVar19 + 2);
              uStack_118 = plVar33;
            }
          }
          puVar19 = puStack_198;
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd34f;
          uStack_108 = uVar20;
          uStack_100 = uVar24;
          func_0x7ff70cb12b60(plVar33,plVar34);
          *(undefined1 *)((longlong)plVar33 + uVar20) = 0;
          while (uVar24 = uStack_100, uVar20 = uStack_108, plVar33 = uStack_118,
                uVar27 = (uint)puVar19, uStack_108 != 0) {
            if (0x7ffffffffffffffc < (longlong)uStack_108) {
              *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe514;
              func_0x7ff70ca00780();
code_r0x7ff70c9fe515:
              puStack_178 = &UNK_7ff70cb868f0;
              uStack_170 = 0x6e;
              *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe540;
              func_0x7ff70ca90020(0x7ff70cc1b2a0,&puStack_178,&uStack_1a0,&uStack_140);
              uStack_180 = 0;
              puStack_188 = &UNK_7ff70cb846bb;
              puStack_190 = &UNK_7ff70cb740b8;
              *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe56f;
              func_0x7ff70cb12a50(&puStack_190,&UNK_7ff70cbe4470);
              goto code_r0x7ff70c9fe570;
            }
            uStack_138 = (longlong *)0x0;
            puStack_130 = (undefined *)0x0;
            uVar21 = 0xf;
            plVar34 = &uStack_138;
            if (0xf < uStack_108 + 3) {
              uVar21 = 0x7fffffffffffffff;
              if (-4 < (longlong)uStack_108) {
                uVar22 = uStack_108 + 3 | 0xf;
                uVar21 = 0x16;
                if (0x16 < uVar22) {
                  uVar21 = uVar22;
                }
                if (uVar22 < 0xfff) {
                  lVar17 = uVar21 + 1;
                  uStack_1a0 = uVar21 + 0x11;
                  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd43c;
                  uStack_140 = lVar17;
                  plVar34 = (longlong *)(*_DAT_7ff70cb96730)();
                  if (plVar34 != (longlong *)0x0) {
                    *plVar34 = lVar17;
                    *(undefined1 *)(plVar34 + 1) = 1;
                    LOCK();
                    _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar17;
                    UNLOCK();
                    LOCK();
                    _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + uStack_140;
                    UNLOCK();
                    plVar34 = plVar34 + 2;
                    uStack_138 = plVar34;
                    goto code_r0x7ff70c9fd473;
                  }
                  puStack_178 = &UNK_7ff70cb868f0;
                  uStack_170 = 0x6e;
                  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe59d;
                  func_0x7ff70ca90020(0x7ff70cc1b2a0,&puStack_178,&uStack_1a0,&uStack_140);
                  uStack_180 = 0;
                  puStack_188 = &UNK_7ff70cb846bb;
                  puStack_190 = &UNK_7ff70cb740b8;
                  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe5cc;
                  func_0x7ff70cb12a50(&puStack_190,&UNK_7ff70cbe4470);
                  goto code_r0x7ff70c9fe5cd;
                }
              }
              lVar17 = uVar21 + 0x28;
              uStack_1a0 = uVar21 + 0x38;
              *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd3ed;
              uStack_140 = lVar17;
              plVar23 = (longlong *)(*_DAT_7ff70cb96730)();
              if (plVar23 == (longlong *)0x0) goto code_r0x7ff70c9fe515;
              *plVar23 = lVar17;
              *(undefined1 *)(plVar23 + 1) = 1;
              LOCK();
              _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar17;
              UNLOCK();
              LOCK();
              _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + uStack_140;
              UNLOCK();
              plVar34 = (longlong *)((longlong)plVar23 + 0x37U & 0xffffffffffffffe0);
              plVar34[-1] = (longlong)(plVar23 + 2);
              uStack_138 = plVar34;
            }
code_r0x7ff70c9fd473:
            lStack_128 = uVar20 + 3;
            if (uVar24 < 0x10) {
              plVar33 = &uStack_118;
            }
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd491;
            uStack_120 = uVar21;
            func_0x7ff70cb12b60(plVar34,plVar33);
            *(undefined4 *)((longlong)plVar34 + uVar20) = 0x2e2e2e;
            plVar33 = &uStack_138;
            if (0xf < uStack_120) {
              plVar33 = uStack_138;
            }
            *(undefined4 *)((longlong)puVar28 + 0x20) = 0xbf800000;
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd4c0;
            func_0x7ff70c80cf40(afStack_1b8,plVar33,0,0);
            puVar19 = puStack_198;
            fVar43 = afStack_1b8[0];
            uVar27 = (uint)puStack_198;
            if (0xf < uStack_120) {
              uVar20 = uStack_120 + 1;
              plVar33 = uStack_138;
              if (0xfff < uVar20) {
                plVar33 = (longlong *)uStack_138[-1];
                if ((undefined *)0x1f <
                    (undefined *)((longlong)uStack_138 + (-8 - (longlong)plVar33)))
                goto code_r0x7ff70c9fe570;
                uVar20 = uStack_120 + 0x28;
              }
              *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd50d;
              func_0x7ff70caa4e20(plVar33,uVar20);
            }
            uVar20 = uStack_108;
            if (fVar43 <= fVar39) goto code_r0x7ff70c9fd542;
            plVar33 = &uStack_118;
            if (0xf < uStack_100) {
              plVar33 = uStack_118;
            }
            lVar17 = uStack_108 - 1;
            uStack_108 = uStack_108 - 1;
            *(undefined1 *)((longlong)plVar33 + lVar17) = 0;
          }
          uVar20 = 0;
code_r0x7ff70c9fd542:
          if (uStack_100 - uVar20 < 3) {
            *(undefined8 *)((longlong)puVar28 + 0x20) = 3;
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd56f;
            func_0x7ff70ca00b60(&uStack_118,3);
          }
          else {
            uStack_108 = uVar20 + 3;
            plVar33 = &uStack_118;
            if (0xf < uStack_100) {
              plVar33 = uStack_118;
            }
            *(undefined4 *)((longlong)plVar33 + uVar20) = 0x2e2e2e;
          }
          plVar33 = &uStack_118;
          if (0xf < uStack_100) {
            plVar33 = uStack_118;
          }
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd5b1;
          func_0x7ff70c876de0(plVar33,0);
          if (0xf < uStack_100) {
            uVar20 = uStack_100 + 1;
            plVar33 = uStack_118;
            if (0xfff < uVar20) {
              plVar33 = (longlong *)uStack_118[-1];
              if ((undefined *)0x1f < (undefined *)((longlong)uStack_118 + (-8 - (longlong)plVar33))
                 ) goto code_r0x7ff70c9fe570;
              uVar20 = uStack_100 + 0x28;
            }
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd5f1;
            func_0x7ff70caa4e20(plVar33,uVar20);
          }
        }
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd5fc;
        func_0x7ff70c80a7b0();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd609;
        func_0x7ff70c84afe0();
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd612;
        func_0x7ff70c84b590();
        if (uVar27 == 1) {
          uStack_118 = (longlong *)CONCAT44(fVar37,0xbf800000);
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd19f;
          func_0x7ff70c87c710();
        }
        else {
          uVar27 = uVar27 - 2;
          fVar43 = fVar36;
          uVar38 = uVar7;
          uVar4 = uVar7;
          if (uVar27 < 3) {
            uVar20 = (ulonglong)uVar27;
            uVar38 = *(undefined4 *)(&UNK_7ff70cb74c1c + uVar20 * 4);
            uVar4 = *(undefined4 *)(&UNK_7ff70cb74c28 + uVar20 * 4);
            fVar43 = *(float *)(&UNK_7ff70cb74c34 + uVar20 * 4);
          }
          uStack_118 = (longlong *)CONCAT44(uVar4,uVar38);
          uStack_110 = (undefined *)CONCAT44(0x3f800000,fVar43);
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd676;
          func_0x7ff70c80a550(0,&uStack_118);
          puVar25 = &UNK_7ff70cb85b13;
          if (uVar27 < 3) {
            puVar25 = &UNK_7ff70cb74c40 + *(int *)(&UNK_7ff70cb74c40 + (ulonglong)uVar27 * 4);
          }
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd69a;
          func_0x7ff70c876de0(puVar25,0);
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd6a5;
          func_0x7ff70c80a7b0();
        }
      }
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd6b7;
      func_0x7ff70cb12580(0x7ff70cbed208);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd6c2;
      func_0x7ff70c80c4c0(1);
      plVar30 = _UNK_7ff70cb74830;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd6d0;
      func_0x7ff70c836f00();
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd6db;
      func_0x7ff70c80c4c0(1);
      uStack_118 = plVar30;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd6ea;
      func_0x7ff70c87d1c0(&uStack_118);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd6f4;
      func_0x7ff70c836be0(&uStack_118);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd707;
      func_0x7ff70ca008f0();
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd70d;
      func_0x7ff70c836f00();
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd718;
      func_0x7ff70c80c4c0(1);
      plVar30 = uStack_168;
      uVar20 = uStack_150;
      goto joined_r0x7ff70c9fd721;
    }
    goto code_r0x7ff70c9fe714;
  case 4:
    uStack_118 = (longlong *)_UNK_7ff70cb74800;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc93a;
    func_0x7ff70c80c230(2,&uStack_118);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc944;
    uVar18 = func_0x7ff70c80a1e0(2);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc951;
    func_0x7ff70c80a550(3,uVar18);
    uStack_118 = (longlong *)0x0;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc975;
    func_0x7ff70c8355a0(&UNK_7ff70cb80076,&uStack_118,2,8);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc97f;
    func_0x7ff70c80a7b0(1);
    uStack_118 = (longlong *)_UNK_7ff70cb74860;
    uStack_110 = (undefined *)_UNK_7ff70cb74868;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc995;
    func_0x7ff70c80a550(0,&uStack_118);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc9a3;
    func_0x7ff70c876de0(&UNK_7ff70cb863ae,0);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc9ad;
    func_0x7ff70c80a7b0(1);
    uStack_118 = (longlong *)_UNK_7ff70cb74820;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc9c3;
    func_0x7ff70c87d1c0(&uStack_118);
    uStack_118 = (longlong *)_UNK_7ff70cb74870;
    uStack_110 = _UNK_7ff70cb74878;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc9d9;
    func_0x7ff70c80a550(0,&uStack_118);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc9e5;
    func_0x7ff70c877260(&UNK_7ff70cb8d412);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fc9ef;
    func_0x7ff70c80a7b0(1);
    uStack_118 = _UNK_7ff70cb74830;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fca05;
    func_0x7ff70c87d1c0(&uStack_118);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fca0a;
    fVar39 = (float)func_0x7ff70c84c130();
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fca12;
    lVar17 = func_0x7ff70c80a020();
    fVar36 = *(float *)(lVar17 + 0x60);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fca20;
    func_0x7ff70c836be0(&uStack_118);
    fVar36 = ((_DAT_7ff70cb1d94c - fVar39) - (fVar36 + fVar36)) + uStack_118._4_4_;
    if (fVar36 <= _UNK_7ff70cb74840) {
      fVar36 = _UNK_7ff70cb74840;
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fca46;
    func_0x7ff70ca008f0(fVar36);
    uStack_118 = _UNK_7ff70cb74850;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fca5c;
    func_0x7ff70c87d1c0(&uStack_118);
    uStack_118 = (longlong *)(ulonglong)_UNK_7ff70cb74880;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fca78;
    cVar11 = func_0x7ff70c878d50(&UNK_7ff70cb817ee,&uStack_118);
    if (cVar11 != '\0') {
      uStack_138 = (longlong *)0x0;
      puStack_130 = (undefined *)0x0;
      puStack_190 = (undefined *)0x20;
      puStack_178 = (undefined *)0x30;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcaa2;
      puVar19 = (undefined8 *)(*_DAT_7ff70cb96730)(0x30);
      if (puVar19 == (undefined8 *)0x0) goto code_r0x7ff70c9fe729;
      *puVar19 = 0x20;
      *(undefined1 *)(puVar19 + 1) = 1;
      uVar18 = _UNK_7ff70cb92422;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + 0x20;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + (longlong)puStack_190;
      UNLOCK();
      uStack_138 = puVar19 + 2;
      lStack_128 = 0xe;
      uStack_120 = 0xf;
      *(ulonglong *)((longlong)puVar19 + 0x1c) = CONCAT44(_UNK_7ff70cb9241e,_UNK_7ff70cb9241a);
      *(undefined8 *)((longlong)puVar19 + 0x24) = uVar18;
      uVar18 = CONCAT44(_UNK_7ff70cb9241a,_UNK_7ff70cb92416);
      puVar19[2] = _UNK_7ff70cb9240e;
      puVar19[3] = uVar18;
      *(undefined2 *)((longlong)puVar19 + 0x2c) = 0;
      if (*(int *)(*(longlong *)
                    (*(longlong *)(unaff_GS_OFFSET + 0x58) + (ulonglong)_DAT_7ff70cc1a960 * 8) + 4)
          < iRam00007ff70cc1b340) goto code_r0x7ff70c9fe781;
      goto code_r0x7ff70c9fcb27;
    }
    goto code_r0x7ff70c9fcc3b;
  case 5:
    uStack_118 = (longlong *)0x0;
    uStack_110 = (undefined *)0x0;
    uStack_108 = 0;
    uStack_100 = 0xf;
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fce23;
    iVar15 = func_0x7ff70cb12570(0x7ff70cbed160);
    uVar20 = uRam00007ff70cbed1e0;
    if (iVar15 != 0) goto code_r0x7ff70c9fe6aa;
    if (iRam00007ff70cbed1ac != 0x7fffffff) {
      if (uRam00007ff70cbed1e8 < 0x10) {
        puVar32 = (undefined1 *)0x7ff70cbed1d0;
        if (0xf < uRam00007ff70cbed1e0) goto code_r0x7ff70c9fd810;
code_r0x7ff70c9fce61:
        uStack_108 = uRam00007ff70cbed1e0;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fce74;
        func_0x7ff70cb12b70(&uStack_118,puVar32,uRam00007ff70cbed1e0);
        *(undefined1 *)((longlong)&uStack_118 + uVar20) = 0;
      }
      else {
        puVar32 = puRam00007ff70cbed1d0;
        if (uRam00007ff70cbed1e0 < 0x10) goto code_r0x7ff70c9fce61;
code_r0x7ff70c9fd810:
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd81c;
        func_0x7ff70ca005a0(&uStack_118,uRam00007ff70cbed1e0);
      }
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd829;
      func_0x7ff70cb12580(0x7ff70cbed160);
      uStack_138 = (longlong *)_UNK_7ff70cb74800;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd844;
      func_0x7ff70c80c230(2,&uStack_138);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd84f;
      uVar18 = func_0x7ff70c80a1e0(2);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd85d;
      func_0x7ff70c80a550(3,uVar18);
      uStack_138 = (longlong *)0x0;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd882;
      func_0x7ff70c8355a0(&UNK_7ff70cb80076,&uStack_138,2,8);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd88d;
      func_0x7ff70c80a7b0(1);
      uStack_138 = (longlong *)_UNK_7ff70cb74810;
      puStack_130 = _UNK_7ff70cb74818;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd8a4;
      func_0x7ff70c80a550(0,&uStack_138);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd8b3;
      func_0x7ff70c876de0(&UNK_7ff70cb856d7,0);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd8be;
      func_0x7ff70c80a7b0(1);
      uStack_138 = (longlong *)_UNK_7ff70cb74820;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd8d5;
      func_0x7ff70c87d1c0(&uStack_138);
      plVar30 = &uStack_118;
      if (0xf < uStack_100) {
        plVar30 = uStack_118;
      }
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd8f0;
      func_0x7ff70c877260(&UNK_7ff70cb8320d,plVar30);
      uStack_138 = _UNK_7ff70cb74830;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd907;
      func_0x7ff70c87d1c0(&uStack_138);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd90d;
      fVar39 = (float)func_0x7ff70c84c130();
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd916;
      lVar17 = func_0x7ff70c80a020();
      fVar36 = *(float *)(lVar17 + 0x60);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd925;
      func_0x7ff70c836be0(&uStack_138);
      fVar36 = ((_DAT_7ff70cb1d94c - fVar39) - (fVar36 + fVar36)) + uStack_138._4_4_;
      if (fVar36 <= _UNK_7ff70cb74840) {
        fVar36 = _UNK_7ff70cb74840;
      }
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd94c;
      func_0x7ff70ca008f0(fVar36);
      uStack_138 = _UNK_7ff70cb74850;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd963;
      func_0x7ff70c87d1c0(&uStack_138);
      bVar12 = bRam00007ff70cbed10c;
      if ((bRam00007ff70cbed10c & 1) != 0) {
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd977;
        func_0x7ff70c83c640(1);
      }
      plVar33 = (longlong *)(ulonglong)_UNK_7ff70cb1f318;
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd994;
      uStack_138 = plVar33;
      cVar11 = func_0x7ff70c878d50(&UNK_7ff70cb7fcfc,&uStack_138);
      plVar30 = &uStack_168;
      if (cVar11 != '\0') {
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd9a9;
        iVar15 = func_0x7ff70cb12570(0x7ff70cbed160);
        lVar17 = lRam00007ff70cbed1f8;
        if (iVar15 == 0) {
          if (iRam00007ff70cbed1ac == 0x7fffffff) goto code_r0x7ff70c9fe81a;
          lVar29 = lRam00007ff70cbed1f0;
          if (lRam00007ff70cbed1f0 != lRam00007ff70cbed1f8) {
            do {
              uVar20 = *(ulonglong *)(lVar29 + 0x20);
              if (0xf < uVar20) {
                lVar5 = *(longlong *)(lVar29 + 8);
                uVar24 = uVar20 + 1;
                lVar26 = lVar5;
                if (0xfff < uVar24) {
                  lVar26 = *(longlong *)(lVar5 + -8);
                  if (0x1f < (ulonglong)((lVar5 + -8) - lVar26)) goto code_r0x7ff70c9fe570;
                  uVar24 = uVar20 + 0x28;
                }
                *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fd9e5;
                func_0x7ff70caa4e20(lVar26,uVar24);
              }
              *(undefined8 *)(lVar29 + 0x18) = 0;
              *(undefined8 *)(lVar29 + 0x20) = 0xf;
              *(undefined1 *)(lVar29 + 8) = 0;
              lVar29 = lVar29 + 0x28;
            } while (lVar29 != lVar17);
            lRam00007ff70cbed1f8 = lRam00007ff70cbed1f0;
          }
          uRam00007ff70cbed1e0 = 0;
          puVar32 = puRam00007ff70cbed1d0;
          if (uRam00007ff70cbed1e8 < 0x10) {
            puVar32 = (undefined1 *)0x7ff70cbed1d0;
          }
          *puVar32 = 0;
          uRam00007ff70cbed1c0 = 0;
          puVar32 = puRam00007ff70cbed1b0;
          if (uRam00007ff70cbed1c8 < 0x10) {
            puVar32 = (undefined1 *)0x7ff70cbed1b0;
          }
          *puVar32 = 0;
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe120;
          func_0x7ff70cb12580(0x7ff70cbed160);
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe12c;
          iVar15 = func_0x7ff70cb12570(0x7ff70cbed208);
          plVar34 = plRam00007ff70cbed260;
          if (iVar15 != 0) goto code_r0x7ff70c9fe82f;
          if (iRam00007ff70cbed254 != 0x7fffffff) {
            plVar30 = plRam00007ff70cbed258;
            if (plRam00007ff70cbed258 != plRam00007ff70cbed260) {
              do {
                plVar23 = (longlong *)plVar30[1];
                if (plVar23 != (longlong *)0x0) {
                  LOCK();
                  plVar1 = plVar23 + 1;
                  *(int *)plVar1 = (int)*plVar1 + -1;
                  UNLOCK();
                  if ((int)*plVar1 == 0) {
                    puVar19 = (undefined8 *)*plVar23;
                    pcVar6 = (code *)*puVar19;
                    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe181;
                    (*pcVar6)(plVar23);
                    LOCK();
                    piVar2 = (int *)((longlong)plVar23 + 0xc);
                    *piVar2 = *piVar2 + -1;
                    UNLOCK();
                    if (*piVar2 == 0) {
                      pcVar6 = (code *)puVar19[1];
                      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe18e;
                      (*pcVar6)(plVar23);
                    }
                  }
                }
                plVar30 = plVar30 + 2;
              } while (plVar30 != plVar34);
              plRam00007ff70cbed260 = plRam00007ff70cbed258;
            }
            *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe1aa;
            func_0x7ff70cb12580(0x7ff70cbed208);
            LOCK();
            uRam00007ff70cbed158 = 0;
            UNLOCK();
            LOCK();
            uRam00007ff70cbed270 = 0xffffffff;
            UNLOCK();
            LOCK();
            uRam00007ff70cbed275 = 0;
            UNLOCK();
            LOCK();
            _DAT_7ff70cbed108 = 0;
            UNLOCK();
            goto code_r0x7ff70c9fe1cd;
          }
        }
        else {
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe819;
          func_0x7ff70cb124d0(5);
code_r0x7ff70c9fe81a:
          iRam00007ff70cbed1ac = 0x7ffffffe;
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe82e;
          func_0x7ff70cb124d0(6);
code_r0x7ff70c9fe82f:
          *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe839;
          func_0x7ff70cb124d0(5);
        }
        iRam00007ff70cbed254 = 0x7ffffffe;
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe84e;
        func_0x7ff70cb124d0(6);
        goto code_r0x7ff70c9fe84f;
      }
code_r0x7ff70c9fe1cd:
      if ((bVar12 & 1) != 0) {
        *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe1d7;
        func_0x7ff70c83c8a0();
      }
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe1e8;
      func_0x7ff70c84afe0();
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe1fd;
      uStack_138 = plVar33;
      cVar11 = func_0x7ff70c878d50(&UNK_7ff70cb811da,&uStack_138);
      if (cVar11 != '\0') {
        puVar31 = (undefined1 *)((longlong)puVar28 + -8);
        *(longlong **)((longlong)puVar28 + -8) = plVar30;
        *(undefined **)((longlong)puVar28 + -0x10) = &UNK_7ff70c9fe20a;
        func_0x7ff70da812e0(0);
      }
      *(undefined **)(puVar31 + -8) = &UNK_7ff70c9fe210;
      func_0x7ff70c836f00();
      *(undefined **)(puVar31 + -8) = &UNK_7ff70c9fe21b;
      func_0x7ff70c80c4c0(1);
      puVar28 = (undefined8 *)puVar31;
      plVar30 = uStack_118;
      uVar20 = uStack_100;
      goto joined_r0x7ff70c9fd721;
    }
    break;
  default:
    goto LAB_7ff70c9fe25b;
  }
  iRam00007ff70cbed1ac = 0x7ffffffe;
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe708;
  func_0x7ff70cb124d0(6);
code_r0x7ff70c9fe709:
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe713;
  func_0x7ff70cb124d0(5);
code_r0x7ff70c9fe714:
  iRam00007ff70cbed254 = 0x7ffffffe;
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe728;
  func_0x7ff70cb124d0(6);
code_r0x7ff70c9fe729:
  uStack_168 = (longlong *)&UNK_7ff70cb868f0;
  uStack_160 = 0x6e;
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe753;
  func_0x7ff70ca90020(0x7ff70cc1b2a0,&uStack_168,&puStack_178,&puStack_190);
  uStack_108 = 0;
  uStack_110 = &UNK_7ff70cb846bb;
  uStack_118 = (longlong *)&UNK_7ff70cb740b8;
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe781;
  func_0x7ff70cb12a50(&uStack_118,&UNK_7ff70cbe4470);
code_r0x7ff70c9fe781:
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe78d;
  func_0x7ff70caa4e60(0x7ff70cc1b340);
  if (iRam00007ff70cc1b340 == -1) {
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe7aa;
    func_0x7ff70ca02090(&uStack_118,0x7ff70cc1b320);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe7b7;
    func_0x7ff70caa4fb0(&UNK_7ff70ca02360);
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe7c3;
    func_0x7ff70caa4f40(0x7ff70cc1b340);
  }
code_r0x7ff70c9fcb27:
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcb41;
  func_0x7ff70ca00da0(&uStack_118,0x7ff70cc1b320,&uStack_138);
  if (7 < uStack_120) {
    uVar20 = uStack_120 * 2 + 2;
    plVar30 = uStack_138;
    if (0xfff < uVar20) {
      plVar30 = (longlong *)uStack_138[-1];
      if ((undefined *)0x1f < (undefined *)((longlong)uStack_138 + (-8 - (longlong)plVar30)))
      goto code_r0x7ff70c9fe570;
      uVar20 = uStack_120 * 2 + 0x29;
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcb88;
    func_0x7ff70caa4e20(plVar30,uVar20);
  }
  if (*(int *)(*(longlong *)
                (*(longlong *)(unaff_GS_OFFSET + 0x58) + (ulonglong)_DAT_7ff70cc1a960 * 8) + 4) <
      iRam00007ff70cc1b340) {
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe7d4;
    func_0x7ff70caa4e60(0x7ff70cc1b340);
    if (iRam00007ff70cc1b340 == -1) {
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe7f1;
      func_0x7ff70ca02090(&uStack_138,0x7ff70cc1b320);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe7fe;
      func_0x7ff70caa4fb0(&UNK_7ff70ca02360);
      *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fe80a;
      func_0x7ff70caa4f40(0x7ff70cc1b340);
    }
  }
  uVar18 = 0x7ff70cc1b320;
  if (7 < uRam00007ff70cc1b338) {
    uVar18 = uRam00007ff70cc1b320;
  }
  plVar30 = &uStack_118;
  if (7 < uStack_100) {
    plVar30 = uStack_118;
  }
  *(undefined8 *)((longlong)puVar28 + 0x20) = uVar18;
  *(undefined4 *)((longlong)puVar28 + 0x28) = 1;
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcbea;
  func_0x7ff70d6f9102(0,&UNK_7ff70cb92484,plVar30,0);
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcbf4;
  func_0x7ff70cc3c2a8();
  if (7 < uStack_100) {
    uVar20 = uStack_100 * 2 + 2;
    plVar30 = uStack_118;
    if (0xfff < uVar20) {
      plVar30 = (longlong *)uStack_118[-1];
      if ((undefined *)0x1f < (undefined *)((longlong)uStack_118 + (-8 - (longlong)plVar30))) {
code_r0x7ff70c9fe570:
                    /* WARNING: Does not return */
        pcVar6 = (code *)invalidInstructionException();
        (*pcVar6)();
      }
      uVar20 = uStack_100 * 2 + 0x29;
    }
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcc3b;
    func_0x7ff70caa4e20(plVar30,uVar20);
  }
code_r0x7ff70c9fcc3b:
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcc4b;
  func_0x7ff70c84afe0();
  uStack_118 = (longlong *)(ulonglong)_UNK_7ff70cb74884;
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcc67;
  cVar11 = func_0x7ff70c878d50(&UNK_7ff70cb8661f,&uStack_118);
  if (cVar11 != '\0') {
    *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcc72;
    func_0x7ff70d5cbad2(0);
  }
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcc78;
  func_0x7ff70c836f00();
  *(undefined **)((longlong)puVar28 + -8) = &UNK_7ff70c9fcc82;
  func_0x7ff70c80c4c0(1);
LAB_7ff70c9fe25b:
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe260;
  func_0x7ff70c836f00();
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe26a;
  func_0x7ff70c80c4c0(1);
  auVar40._4_4_ = fStack_1a4;
  auVar40._0_4_ = fStack_1a8;
  auVar40._8_8_ = 0;
  auVar40 = insertps(auVar40,ZEXT416((uint)(fVar3 + _DAT_7ff70cb74950 + fStack_1a4)),0x10);
  *(undefined4 *)((longlong)puVar28 + 0x20) = 0xbf800000;
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe2a6;
  func_0x7ff70c80cf40(&uStack_118,&UNK_7ff70cb817f9,0,0);
  auVar42 = insertps(ZEXT416((uint)(fVar10 - (float)uStack_118)),uStack_118._4_4_,0x10);
  uStack_138 = (longlong *)
               CONCAT44(auVar42._4_4_ * _UNK_7ff70cb74964 + auVar40._4_4_,
                        auVar42._0_4_ * _DAT_7ff70cb74960 + auVar40._0_4_);
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe2ce;
  func_0x7ff70c84b370(&uStack_138);
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe2e0;
  cVar11 = func_0x7ff70c879250(&UNK_7ff70cb85144,&uStack_118,0);
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe2e9;
  cVar14 = func_0x7ff70c8183c0(0);
  if (cVar14 == '\0') {
    *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe364;
    uVar18 = func_0x7ff70c83dc60();
    *(undefined8 *)((longlong)puVar28 + 0x20) = 0;
    *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe386;
    uVar18 = func_0x7ff70c7c2230(uVar18,&uStack_138,0xff746868,&UNK_7ff70cb817f9);
  }
  else {
    *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe2f7;
    func_0x7ff70c848190(7);
    *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe2fc;
    uVar18 = func_0x7ff70c83dc60();
    *(undefined8 *)((longlong)puVar28 + 0x20) = 0;
    *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe321;
    func_0x7ff70c7c2230(uVar18,&uStack_138,0xff6c6eff,&UNK_7ff70cb817f9);
    auVar42._8_8_ = 0;
    auVar42._0_8_ = uStack_138;
    auVar41._0_8_ =
         (longlong *)
         CONCAT44((float)((ulonglong)uStack_118 >> 0x20) + (float)((ulonglong)uStack_138 >> 0x20),
                  SUB84(uStack_118,0) + SUB84(uStack_138,0));
    auVar41._8_8_ = 0;
    auVar40 = blendps(auVar41,auVar42,0xd);
    puStack_190 = auVar40._0_8_;
    *(undefined4 *)((longlong)puVar28 + 0x20) = 0x3f800000;
    *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe359;
    uStack_168 = auVar41._0_8_;
    uVar18 = func_0x7ff70c7bd6c0(uVar18,&puStack_190,&uStack_168,0xff6c6eff);
  }
  if (cVar11 != '\0') {
    *(undefined4 *)((longlong)puVar28 + 0x28) = 1;
    *(undefined8 *)((longlong)puVar28 + 0x20) = 0;
    *(undefined8 *)((longlong)puVar28 + -8) = uVar18;
    *(undefined8 *)((longlong)puVar28 + -0x10) = 0x7ff70c9fe3b4;
    func_0x7ff70d6f1689(0,&UNK_7ff70cb92484,&UNK_7ff70cb74aa0,0);
    puVar28 = (undefined8 *)((longlong)puVar28 + -8);
  }
  *(undefined8 *)((longlong)puVar28 + -8) = 0x7ff70c9fe3b9;
  func_0x7ff70c833070();
  return;
}


