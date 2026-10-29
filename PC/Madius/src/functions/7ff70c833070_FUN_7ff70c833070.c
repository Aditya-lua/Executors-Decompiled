/* 7ff70c833070 FUN_7ff70c833070 */

/* WARNING: Instruction at (ram,0x7ff70c833256) overlaps instruction at (ram,0x7ff70c833255)
    */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c833070(void)

{
  int *piVar1;
  short *psVar2;
  byte bVar3;
  undefined1 uVar4;
  code *pcVar5;
  longlong lVar6;
  float fVar7;
  float fVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  undefined4 uVar19;
  undefined4 uVar20;
  undefined4 uVar21;
  undefined4 uVar22;
  undefined8 uVar23;
  ulonglong uVar24;
  undefined4 *puVar25;
  char cVar26;
  uint uVar27;
  longlong lVar28;
  longlong lVar29;
  undefined4 *puVar30;
  short sVar31;
  int iVar32;
  undefined4 uVar33;
  uint *puVar34;
  bool bVar35;
  int iVar36;
  undefined *puVar37;
  char *pcVar38;
  uint *puVar39;
  longlong lVar40;
  longlong *plVar41;
  int iVar42;
  undefined4 *puVar43;
  undefined4 *puVar44;
  ulonglong uVar45;
  longlong lVar46;
  longlong lVar47;
  float fVar48;
  float fVar49;
  float fVar50;
  float fVar51;
  float fVar52;
  undefined8 uStack_68;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 uStack_58;
  longlong lStack_50;
  undefined1 auStack_48 [24];
  
  puVar44 = _DAT_7ff70cc1a3c0;
  plVar41 = (longlong *)auStack_48;
  lVar6 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x510);
  if ((1 < (longlong)(int)_DAT_7ff70cc1a3c0[0x504]) ||
     (*(char *)((longlong)_DAT_7ff70cc1a3c0 + 0x1399) != '\x01')) {
    puVar43 = (undefined4 *)
              ((longlong)(int)_DAT_7ff70cc1a3c0[0x504] * 0x78 +
              *(longlong *)(_DAT_7ff70cc1a3c0 + 0x506));
    if (((*(byte *)(lVar6 + 0x17) & 1) != 0) && (_DAT_7ff70cc1a3c0[0x4e5] != *(int *)(lVar6 + 0x10))
       ) {
      lStack_50 = 0x7ff70c833101;
      FUN_7ff70c80af70(&UNK_7ff70cb9067f);
    }
    if (*(longlong *)(lVar6 + 0x1c8) != 0) {
      lStack_50 = 0x7ff70c833110;
      FUN_7ff70c912b60();
    }
    puVar30 = _DAT_7ff70cc1a3c0;
    if (*(char *)(lVar6 + 0xd2) == '\0') {
      *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x510) + 0xce) = 1;
      lVar29 = *(longlong *)(puVar30 + 0x510);
      lStack_50 = 0x7ff70c833141;
      FUN_7ff70c7b8130(*(undefined8 *)(lVar29 + 0x2c8));
      puVar30 = (undefined4 *)
                (*(longlong *)(*(longlong *)(lVar29 + 0x2c8) + 0xa8) + -0x10 +
                (longlong)*(int *)(*(longlong *)(lVar29 + 0x2c8) + 0xa0) * 0x10);
      uVar33 = puVar30[1];
      uVar9 = puVar30[2];
      uVar10 = puVar30[3];
      *(undefined4 *)(lVar29 + 0x260) = *puVar30;
      *(undefined4 *)(lVar29 + 0x264) = uVar33;
      *(undefined4 *)(lVar29 + 0x268) = uVar9;
      *(undefined4 *)(lVar29 + 0x26c) = uVar10;
    }
    puVar30 = _DAT_7ff70cc1a3c0;
    iVar36 = _DAT_7ff70cc1a3c0[0x7c8];
    if (*(short *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x9ea) + 0xc) < iVar36) {
      _DAT_7ff70cc1a3c0[0x7c8] = iVar36 + -1;
      if (iVar36 + -1 == 0) {
        uVar33 = 0;
      }
      else {
        uVar33 = *(undefined4 *)(*(longlong *)(puVar30 + 0x7ca) + -0x10 + (longlong)iVar36 * 8);
      }
      puVar30[0x777] = uVar33;
      cVar26 = *(char *)((longlong)puVar43 + -10);
      puVar30 = _DAT_7ff70cc1a3c0;
    }
    else {
      lStack_50 = 0x7ff70c8331a9;
      FUN_7ff70c80af70(&UNK_7ff70cb90134);
      cVar26 = *(char *)((longlong)puVar43 + -10);
      puVar30 = _DAT_7ff70cc1a3c0;
    }
    _DAT_7ff70cc1a3c0 = puVar30;
    if ((cVar26 == '\x01') && (*(longlong *)(lVar6 + 0x3c0) == lVar6)) goto code_r0x7ff70c83325d;
    cVar26 = *(char *)(lVar6 + 0xd2);
    puVar30 = puVar43;
    puVar25 = puVar44;
    while( true ) {
      if (cVar26 == '\x01') {
        *(longlong *)(lVar6 + 0x2c8) = lVar6 + 0x2d0;
      }
      puVar44 = _DAT_7ff70cc1a3c0;
      plVar41 = (longlong *)auStack_48;
      if ((*(longlong *)(puVar25 + 0x9ca) != lVar6) ||
         (plVar41 = (longlong *)auStack_48, *(char *)(_DAT_7ff70cc1a3c0 + 0x9c8) != '\x01'))
      goto LAB_7ff70c8333dc;
      lStack_50 = 0x7ff70c833211;
      FUN_7ff70c856f00(&UNK_7ff70cb922d3);
      uVar27 = puVar44[0x9c9] & 0xf;
      plVar41 = (longlong *)auStack_48;
      if (POPCOUNT(uVar27) != 1) goto LAB_7ff70c8332fb;
      iVar36 = 0;
      for (; (uVar27 & 1) == 0; uVar27 = uVar27 >> 1 | 0x80000000) {
        iVar36 = iVar36 + 1;
      }
      if (iVar36 == 3) break;
      if (iVar36 == 1) {
        uStack_58 = 0x7ff70c8332c5;
        lStack_50 = lVar6;
        func_0x7ff70d889bec(*(undefined8 *)(puVar44 + 0x9cc));
        plVar41 = &lStack_50;
        goto LAB_7ff70c8332fb;
      }
      plVar41 = (longlong *)auStack_48;
      if (iVar36 != 0) goto LAB_7ff70c8332fb;
      cVar26 = (char)*(undefined8 *)(puVar44 + 0x9cc);
      lStack_50 = 0x7ff70c833250;
      pcVar38 = (char *)FUN_7ff70ca90eff();
      puVar44 = puVar25 + 1;
      puVar43 = puVar30 + 1;
      *puVar25 = *puVar30;
      *pcVar38 = *pcVar38 + (char)pcVar38;
      pcVar38[-0x75] = pcVar38[-0x75] + cVar26;
      puVar30 = (undefined4 *)(ulonglong)((int)pcVar38 + 0x3e7163);
code_r0x7ff70c83325d:
      *(short *)(puVar30 + 0x968) = *(short *)(puVar30 + 0x968) + -1;
      iVar36 = puVar30[0x7cc];
      puVar30[0x7cc] = iVar36 + -1;
      puVar30[0x778] = *(undefined4 *)(*(longlong *)(puVar30 + 0x7ce) + -8 + (longlong)iVar36 * 4);
      puVar30[0x313] =
           *(undefined4 *)
            (*(longlong *)(puVar30 + 0x506) + -8 + (longlong)(int)puVar30[0x504] * 0x78);
      cVar26 = *(char *)(lVar6 + 0xd2);
      puVar30 = puVar43;
      puVar25 = puVar44;
    }
    plVar41 = (longlong *)auStack_48;
    if ((1 < (int)puVar44[0x9ce]) &&
       (plVar41 = (longlong *)auStack_48, *(code **)(_DAT_7ff70cc1a3c0 + 0x2fa) != (code *)0x0)) {
      lVar29 = 0x7ff70cc1a3c8;
      if (*(longlong *)(puVar44 + 0x9d0) != 0) {
        lVar29 = *(longlong *)(puVar44 + 0x9d0);
      }
      lStack_50 = 0x7ff70c8332fb;
      (**(code **)(_DAT_7ff70cc1a3c0 + 0x2fa))(_DAT_7ff70cc1a3c0,lVar29);
      plVar41 = (longlong *)auStack_48;
    }
LAB_7ff70c8332fb:
    *(undefined1 *)((longlong)puVar44 + 0x14b2) = 0;
    *(undefined1 *)(puVar44 + 0x9c8) = 0;
    puVar44[0x9c9] = 0;
    *(undefined8 *)(puVar44 + 0x9cc) = 0;
    lVar29 = *(longlong *)(puVar44 + 0x9d0);
    if (lVar29 != 0) {
      *(undefined8 *)(puVar44 + 0x9ce) = 0;
      puVar43 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != (undefined4 *)0x0) {
        piVar1 = _DAT_7ff70cc1a3c0 + 0x4e2;
        lVar40 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c);
        if (_DAT_7ff70cc1a3c0[lVar40 * 2 + 0xa1d] == *piVar1) {
          sVar31 = *(short *)((longlong)_DAT_7ff70cc1a3c0 + lVar40 * 8 + 0x287a) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) = (short)iVar36;
          lVar40 = (longlong)iVar36;
          puVar43[lVar40 * 2 + 0xa1d] = *piVar1;
          puVar43[lVar40 * 2 + 0xa1e] = 0;
          sVar31 = 1;
        }
        *(short *)((longlong)puVar43 + lVar40 * 8 + 0x287a) = sVar31;
        puVar43[0xa1b] = puVar43[0xa1b] + 1;
      }
      *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c8333d1;
      (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
      *(undefined8 *)(puVar44 + 0x9d0) = 0;
    }
LAB_7ff70c8333dc:
    if (*(char *)(lVar6 + 0x159) == '\x01') {
      lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x510);
      *(undefined1 *)(lVar29 + 0x159) = 0;
      if (((*(float *)(lVar29 + 0x130) < *(float *)(lVar29 + 0x118)) ||
          (*(float *)(lVar29 + 0x134) < *(float *)(lVar29 + 0x11c))) &&
         (*(char *)(lVar29 + 0xd1) == '\0')) {
        *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c833431;
        FUN_7ff70c80af70(&UNK_7ff70cb8c7e7);
      }
    }
    uVar23 = *(undefined8 *)(puVar30 + -10);
    *(undefined8 *)(puVar25 + 0x798) = *(undefined8 *)(puVar30 + -0xc);
    *(undefined8 *)(puVar25 + 0x79a) = uVar23;
    uVar33 = puVar30[-0x1c];
    uVar9 = puVar30[-0x1b];
    uVar10 = puVar30[-0x1a];
    uVar11 = puVar30[-0x19];
    uVar12 = puVar30[-0x18];
    uVar13 = puVar30[-0x17];
    uVar14 = puVar30[-0x16];
    uVar15 = puVar30[-0x15];
    uVar16 = puVar30[-0x14];
    uVar17 = puVar30[-0x13];
    uVar18 = puVar30[-0x12];
    uVar19 = puVar30[-0x11];
    uVar20 = puVar30[-0xf];
    uVar21 = puVar30[-0xe];
    uVar22 = puVar30[-0xd];
    puVar25[0x794] = puVar30[-0x10];
    puVar25[0x795] = uVar20;
    puVar25[0x796] = uVar21;
    puVar25[0x797] = uVar22;
    puVar25[0x790] = uVar16;
    puVar25[0x791] = uVar17;
    puVar25[0x792] = uVar18;
    puVar25[0x793] = uVar19;
    puVar25[0x78c] = uVar12;
    puVar25[0x78d] = uVar13;
    puVar25[0x78e] = uVar14;
    puVar25[0x78f] = uVar15;
    puVar25[0x788] = uVar33;
    puVar25[0x789] = uVar9;
    puVar25[0x78a] = uVar10;
    puVar25[0x78b] = uVar11;
    if ((*(uint *)(lVar6 + 0x14) & 0x10000000) == 0) {
      if ((*(uint *)(lVar6 + 0x14) & 0x4000000) != 0) goto LAB_7ff70c83351f;
LAB_7ff70c833481:
      cVar26 = *(char *)(puVar25 + 0x1f);
    }
    else {
      puVar25[0x944] = puVar25[0x944] + -1;
      if ((*(uint *)(lVar6 + 0x14) & 0x4000000) == 0) goto LAB_7ff70c833481;
LAB_7ff70c83351f:
      puVar25[0x7d8] = puVar25[0x7d8] + -1;
      cVar26 = *(char *)(puVar25 + 0x1f);
    }
    if (cVar26 == '\x01') {
      *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c833493;
      FUN_7ff70c83b170(puVar30 + -8);
    }
    iVar36 = puVar25[0x504];
    iVar32 = (int)((longlong)iVar36 + -1);
    puVar25[0x504] = iVar32;
    puVar44 = _DAT_7ff70cc1a3c0;
    if (iVar32 == 0) {
      *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x510) = 0;
LAB_7ff70c833546:
      *(undefined8 *)(puVar44 + 0x9ea) = 0;
      *(undefined8 *)(puVar44 + 0x89e) = 0;
      puVar44[0x450] = 0x3f800000;
    }
    else {
      lVar6 = *(longlong *)(*(longlong *)(puVar25 + 0x506) + -0x78 + ((longlong)iVar36 + -1) * 0x78)
      ;
      *(longlong *)(_DAT_7ff70cc1a3c0 + 0x510) = lVar6;
      if (lVar6 == 0) goto LAB_7ff70c833546;
      *(longlong *)(puVar44 + 0x9ea) =
           *(longlong *)(puVar44 + 0x506) + (longlong)(int)puVar44[0x504] * 0x78 + -0x20;
      if ((longlong)*(int *)(lVar6 + 0x1d0) == -1) {
        lVar29 = 0;
      }
      else {
        lVar29 = (longlong)*(int *)(lVar6 + 0x1d0) * 0x250 + *(longlong *)(puVar44 + 0x8a8);
      }
      *(longlong *)(puVar44 + 0x89e) = lVar29;
      puVar44[0x450] = 0x3f800000;
      uVar4 = *(undefined1 *)(lVar6 + 0xd1);
      *(undefined1 *)(lVar6 + 0xd1) = 0;
      if ((puVar44[3] & 0x10) != 0) {
        fVar48 = *(float *)(*(longlong *)(lVar6 + 0x20) + 0x18);
        if ((fVar48 == 0.0) && (!NAN(fVar48))) {
          fVar48 = (float)puVar44[6];
        }
        puVar44[0x44f] = fVar48;
      }
      lVar29 = *(longlong *)(puVar44 + 0x510);
      fVar48 = (float)puVar44[0x44d];
      puVar44[0x310] = fVar48;
      if (lVar29 == 0) {
        fVar48 = fVar48 * (float)puVar44[0x311] * (float)puVar44[0x312] * (float)puVar44[0x2f0];
        lVar40 = *(longlong *)(puVar44 + 0x448);
joined_r0x7ff70c8336e6:
        if (lVar40 != 0) {
          fVar48 = fVar48 * *(float *)(lVar40 + 0x48);
        }
        iVar36 = (int)(fVar48 + _DAT_7ff70cb1ba70);
        if (iVar36 < 1) {
          fVar48 = _DAT_7ff70cb1ba2c;
          if (lVar40 != 0) goto LAB_7ff70c833651;
LAB_7ff70c8336ac:
          puVar44[0x44c] = fVar48;
          *(undefined8 *)(puVar44 + 0x44a) = 0;
          fVar49 = 0.0;
        }
        else {
          fVar49 = (float)(int)(fVar48 + _DAT_7ff70cb1ba70);
          fVar48 = _DAT_7ff70cb1d620;
          if (fVar49 <= _DAT_7ff70cb1d620) {
            fVar48 = fVar49;
          }
          if (lVar40 == 0) goto LAB_7ff70c8336ac;
LAB_7ff70c833651:
          if ((puVar44[3] & 0x10) != 0) {
            *(undefined4 *)(lVar40 + 0x14) = puVar44[0x44f];
            lVar40 = *(longlong *)(puVar44 + 0x448);
          }
          puVar44[0x44c] = fVar48;
          bVar35 = lVar40 == 0 || lVar29 == 0;
          if (bVar35) {
            lVar47 = 0;
          }
          else {
            *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c83368e;
            lVar47 = FUN_7ff70c7e5630(lVar40,CONCAT31((int3)((uint)iVar36 >> 8),bVar35),
                                      _DAT_7ff70cb1bae8);
            lVar40 = *(longlong *)(puVar44 + 0x448);
            fVar48 = (float)puVar44[0x44c];
          }
          *(longlong *)(puVar44 + 0x44a) = lVar47;
          fVar49 = 0.0;
          if ((lVar29 != 0) && (lVar40 != 0)) {
            fVar49 = fVar48 / *(float *)(lVar47 + 0x14);
          }
        }
        puVar44[0x44e] = fVar49;
        puVar44[0x45a] = fVar48;
        puVar44[0x45b] = fVar49;
        puVar44 = _DAT_7ff70cc1a3c0;
      }
      else if ((*(char *)(lVar29 + 0xd1) != '\x01') ||
              ((*(longlong *)(puVar44 + 0x89e) != 0 &&
               (*(int *)(*(longlong *)(puVar44 + 0x89e) + 0x74) == -1)))) {
        fVar48 = fVar48 * (float)puVar44[0x311] * (float)puVar44[0x312] * *(float *)(lVar29 + 0x2b8)
                 * (float)puVar44[0x2f0];
        lVar40 = *(longlong *)(puVar44 + 0x448);
        goto joined_r0x7ff70c8336e6;
      }
      *(undefined1 *)(lVar6 + 0xd1) = uVar4;
      if (*(longlong *)(puVar44 + 0x89e) == 0) {
        bVar35 = *(longlong *)(*(longlong *)(puVar44 + 0x510) + 0x1c8) == 0;
      }
      else {
        bVar35 = false;
      }
      *(bool *)(*(longlong *)(puVar44 + 0x510) + 0x178) = bVar35;
    }
    if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)plVar41 + 0x20) ^ (ulonglong)plVar41)) {
      return *(ulonglong *)((longlong)plVar41 + 0x20) ^ (ulonglong)plVar41;
    }
LAB_7ff70c833778:
    *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c833785;
    FUN_7ff70caa97e0(*(ulonglong *)((longlong)plVar41 + 0x20) ^ (ulonglong)plVar41);
    pcVar5 = (code *)swi(3);
    uVar45 = (*pcVar5)();
    return uVar45;
  }
  if (_DAT_7ff70cbebd80 != (_DAT_7ff70cbebd80 ^ (ulonglong)auStack_48 ^ (ulonglong)auStack_48))
  goto LAB_7ff70c833778;
  lVar6 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x510);
  if (*(char *)((longlong)_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x9e2) == '\x01') {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x9ed) & 1) == 0) {
        _DAT_7ff70cc1a3c0[0x9f8] = _DAT_7ff70cc1a3c0[0x9f8] + 1;
        goto LAB_7ff70c80aff6;
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)((longlong)_DAT_7ff70cc1a3c0 + 0x7d),1,
                       *(undefined1 *)((longlong)_DAT_7ff70cc1a3c0 + 0x7f));
      bVar3 = *(byte *)(puVar44 + 0x9ed);
    }
    else {
LAB_7ff70c80aff6:
      bVar3 = *(byte *)(puVar44 + 0x9ed);
    }
    if ((bVar3 & 1) == 0) {
      puVar44[0x9f8] = puVar44[0x9f8] + 1;
      *(undefined1 *)(puVar44 + 0x9e2) = 0;
      cVar26 = *(char *)((longlong)puVar44 + 0x7f);
      puVar43 = _DAT_7ff70cc1a3c0;
    }
    else {
      if (lVar6 == 0) {
        puVar37 = &UNK_7ff70cb8a129;
      }
      else {
        puVar37 = *(undefined **)(lVar6 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar37,&UNK_7ff70cb9015c);
      *(undefined1 *)(puVar44 + 0x9e2) = 0;
      cVar26 = *(char *)((longlong)puVar44 + 0x7f);
      puVar43 = _DAT_7ff70cc1a3c0;
    }
  }
  else {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x9e2) = 0;
    cVar26 = *(char *)((longlong)puVar44 + 0x7f);
    puVar43 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = puVar43;
  if (cVar26 != '\x01') {
    pcVar5 = *(code **)(puVar44 + 0x9dc);
    goto joined_r0x7ff70c80b41a;
  }
  if (*(char *)(puVar44 + 0x4e6) == '\x01') {
    pcVar38 = "Tooltip_Error";
    uVar27 = 0xffffffff;
    do {
      cVar26 = pcVar38[-2];
      if (cVar26 == '#') {
        if ((pcVar38[-1] == '#') && (*pcVar38 == '#')) {
          uVar27 = 0xffffffff;
        }
      }
      else if (cVar26 == '\0') goto LAB_7ff70c80b0c7;
      uVar27 = crc32(uVar27,cVar26);
      pcVar38 = pcVar38 + 1;
    } while( true );
  }
  goto LAB_7ff70c80b40a;
LAB_7ff70c80b0c7:
  puVar34 = *(uint **)(puVar43 + 0x50a);
  puVar39 = puVar34 + (longlong)(int)puVar43[0x508] * 4;
  uVar45 = (longlong)(int)puVar43[0x508];
  while (uVar24 = uVar45, uVar24 != 0) {
    uVar45 = uVar24 >> 1;
    if (puVar34[uVar45 * 4] < ~uVar27) {
      puVar34 = puVar34 + uVar45 * 4 + 4;
      uVar45 = ~uVar45 + uVar24;
    }
  }
  if ((((puVar34 == puVar39) || (*puVar34 != ~uVar27)) || (*(longlong *)(puVar34 + 2) == 0)) ||
     (*(char *)(puVar43 + 0x3f) == '\0')) {
    fVar48 = (float)puVar43[0x365];
    fVar49 = (float)puVar43[0x366];
    fVar7 = (float)puVar43[0x367];
    fVar8 = (float)puVar43[0x368];
    uStack_68 = *(undefined8 *)(puVar43 + 0x365);
    uStack_60 = puVar43[0x367];
    uStack_5c = puVar43[0x368];
    iVar36 = puVar43[0x7bc];
    if (iVar36 == puVar43[0x7bd]) {
      if (iVar36 == 0) {
        iVar32 = 8;
      }
      else {
        iVar32 = iVar36 / 2 + iVar36;
      }
      iVar42 = iVar36 + 1;
      if (iVar36 + 1 < iVar32) {
        iVar42 = iVar32;
      }
      lVar29 = (*_DAT_7ff70cbe9460)((longlong)iVar42 * 0x14,_DAT_7ff70cc1a3d0);
      puVar30 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != (undefined4 *)0x0) {
        piVar1 = _DAT_7ff70cc1a3c0 + 0x4e2;
        lVar40 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c);
        if (_DAT_7ff70cc1a3c0[lVar40 * 2 + 0xa1d] == *piVar1) {
          sVar31 = (short)_DAT_7ff70cc1a3c0[lVar40 * 2 + 0xa1e] + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) = (short)iVar36;
          lVar40 = (longlong)iVar36;
          puVar30[lVar40 * 2 + 0xa1d] = *piVar1;
          puVar30[lVar40 * 2 + 0xa1e] = 0;
          sVar31 = 1;
        }
        *(short *)(puVar30 + lVar40 * 2 + 0xa1e) = sVar31;
        puVar30[0xa1a] = puVar30[0xa1a] + 1;
      }
      if (*(longlong *)(puVar43 + 0x7be) != 0) {
        FUN_7ff70cb12b60(lVar29,*(longlong *)(puVar43 + 0x7be),(longlong)(int)puVar43[0x7bc] * 0x14)
        ;
        puVar30 = _DAT_7ff70cc1a3c0;
        lVar40 = *(longlong *)(puVar43 + 0x7be);
        if ((lVar40 != 0) && (_DAT_7ff70cc1a3c0 != (undefined4 *)0x0)) {
          piVar1 = _DAT_7ff70cc1a3c0 + 0x4e2;
          lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c);
          if (_DAT_7ff70cc1a3c0[lVar47 * 2 + 0xa1d] == *piVar1) {
            sVar31 = *(short *)((longlong)_DAT_7ff70cc1a3c0 + lVar47 * 8 + 0x287a) + 1;
          }
          else {
            iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) = (short)iVar36;
            lVar47 = (longlong)iVar36;
            puVar30[lVar47 * 2 + 0xa1d] = *piVar1;
            puVar30[lVar47 * 2 + 0xa1e] = 0;
            sVar31 = 1;
          }
          *(short *)((longlong)puVar30 + lVar47 * 8 + 0x287a) = sVar31;
          puVar30[0xa1b] = puVar30[0xa1b] + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar40,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(puVar43 + 0x7be) = lVar29;
      puVar43[0x7bd] = iVar42;
      iVar36 = puVar43[0x7bc];
    }
    else {
      lVar29 = *(longlong *)(puVar43 + 0x7be);
    }
    *(undefined4 *)(lVar29 + (longlong)iVar36 * 0x14) = 4;
    puVar30 = (undefined4 *)(lVar29 + 4 + (longlong)iVar36 * 0x14);
    *puVar30 = (undefined4)uStack_68;
    puVar30[1] = uStack_68._4_4_;
    puVar30[2] = uStack_60;
    puVar30[3] = uStack_5c;
    puVar43[0x7bc] = puVar43[0x7bc] + 1;
    if (puVar43[0x7bb] != 4) {
      fVar50 = (_UNK_7ff70cb1d634 - fVar49) * _UNK_7ff70cb1d644;
      fVar51 = (_UNK_7ff70cb1d638 - fVar7) * _UNK_7ff70cb1d648;
      fVar52 = (_UNK_7ff70cb1d63c - fVar8) * _UNK_7ff70cb1d64c;
      puVar43[0x365] = (_DAT_7ff70cb1d630 - fVar48) * _DAT_7ff70cb1d640 + fVar48;
      puVar43[0x366] = fVar50 + fVar49;
      puVar43[0x367] = fVar51 + fVar7;
      puVar43[0x368] = fVar52 + fVar8;
    }
  }
  else {
    cVar26 = *(char *)(*(longlong *)(puVar34 + 2) + 0xcd);
    fVar48 = (float)puVar43[0x365];
    fVar49 = (float)puVar43[0x366];
    fVar7 = (float)puVar43[0x367];
    fVar8 = (float)puVar43[0x368];
    uStack_68 = *(undefined8 *)(puVar43 + 0x365);
    uStack_60 = puVar43[0x367];
    uStack_5c = puVar43[0x368];
    iVar36 = puVar43[0x7bc];
    if (iVar36 == puVar43[0x7bd]) {
      if (iVar36 == 0) {
        iVar32 = 8;
      }
      else {
        iVar32 = iVar36 / 2 + iVar36;
      }
      iVar42 = iVar36 + 1;
      if (iVar36 + 1 < iVar32) {
        iVar42 = iVar32;
      }
      lVar29 = (*_DAT_7ff70cbe9460)((longlong)iVar42 * 0x14,_DAT_7ff70cc1a3d0);
      puVar30 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != (undefined4 *)0x0) {
        piVar1 = _DAT_7ff70cc1a3c0 + 0x4e2;
        lVar40 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c);
        if (_DAT_7ff70cc1a3c0[lVar40 * 2 + 0xa1d] == *piVar1) {
          sVar31 = (short)_DAT_7ff70cc1a3c0[lVar40 * 2 + 0xa1e] + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) = (short)iVar36;
          lVar40 = (longlong)iVar36;
          puVar30[lVar40 * 2 + 0xa1d] = *piVar1;
          puVar30[lVar40 * 2 + 0xa1e] = 0;
          sVar31 = 1;
        }
        *(short *)(puVar30 + lVar40 * 2 + 0xa1e) = sVar31;
        puVar30[0xa1a] = puVar30[0xa1a] + 1;
      }
      if (*(longlong *)(puVar43 + 0x7be) != 0) {
        FUN_7ff70cb12b60(lVar29,*(longlong *)(puVar43 + 0x7be),(longlong)(int)puVar43[0x7bc] * 0x14)
        ;
        puVar30 = _DAT_7ff70cc1a3c0;
        lVar40 = *(longlong *)(puVar43 + 0x7be);
        if ((lVar40 != 0) && (_DAT_7ff70cc1a3c0 != (undefined4 *)0x0)) {
          piVar1 = _DAT_7ff70cc1a3c0 + 0x4e2;
          lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c);
          if (_DAT_7ff70cc1a3c0[lVar47 * 2 + 0xa1d] == *piVar1) {
            sVar31 = *(short *)((longlong)_DAT_7ff70cc1a3c0 + lVar47 * 8 + 0x287a) + 1;
          }
          else {
            iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) = (short)iVar36;
            lVar47 = (longlong)iVar36;
            puVar30[lVar47 * 2 + 0xa1d] = *piVar1;
            puVar30[lVar47 * 2 + 0xa1e] = 0;
            sVar31 = 1;
          }
          *(short *)((longlong)puVar30 + lVar47 * 8 + 0x287a) = sVar31;
          puVar30[0xa1b] = puVar30[0xa1b] + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar40,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(puVar43 + 0x7be) = lVar29;
      puVar43[0x7bd] = iVar42;
      iVar36 = puVar43[0x7bc];
    }
    else {
      lVar29 = *(longlong *)(puVar43 + 0x7be);
    }
    *(undefined4 *)(lVar29 + (longlong)iVar36 * 0x14) = 4;
    puVar30 = (undefined4 *)(lVar29 + 4 + (longlong)iVar36 * 0x14);
    *puVar30 = (undefined4)uStack_68;
    puVar30[1] = uStack_68._4_4_;
    puVar30[2] = uStack_60;
    puVar30[3] = uStack_5c;
    puVar43[0x7bc] = puVar43[0x7bc] + 1;
    if (puVar43[0x7bb] != 4) {
      fVar50 = (_UNK_7ff70cb1d634 - fVar49) * _UNK_7ff70cb1d644;
      fVar51 = (_UNK_7ff70cb1d638 - fVar7) * _UNK_7ff70cb1d648;
      fVar52 = (_UNK_7ff70cb1d63c - fVar8) * _UNK_7ff70cb1d64c;
      puVar43[0x365] = (_DAT_7ff70cb1d630 - fVar48) * _DAT_7ff70cb1d640 + fVar48;
      puVar43[0x366] = fVar50 + fVar49;
      puVar43[0x367] = fVar51 + fVar7;
      puVar43[0x368] = fVar52 + fVar8;
    }
    puVar30 = _DAT_7ff70cc1a3c0;
    if (cVar26 != '\0') {
      _DAT_7ff70cc1a3c0[0x79c] = _DAT_7ff70cc1a3c0[0x79c] | 1;
      *(undefined8 *)(puVar30 + 0x7a0) = *(undefined8 *)(puVar43 + 0x9e0);
      *(undefined8 *)(puVar30 + 0x7a2) = 0;
      puVar30[0x79d] = 1;
    }
  }
  cVar26 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  FUN_7ff70c80a7b0(1);
  if (cVar26 != '\0') {
    if (*(short *)(*(longlong *)(puVar43 + 0x510) + 0xda) == 1) {
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      puVar30 = _DAT_7ff70cc1a3c0;
      lVar29 = *(longlong *)(puVar43 + 0x510);
      lVar40 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x4fa);
      iVar36 = _DAT_7ff70cc1a3c0[0x4f8];
      lVar47 = *(longlong *)(lVar40 + -8 + (longlong)iVar36 * 8);
      if (((lVar47 != lVar29) && (1 < iVar36)) && (*(longlong *)(lVar47 + 0x3c0) != lVar29)) {
        uVar45 = (ulonglong)(iVar36 - 1);
        iVar36 = 1;
        do {
          uVar27 = (int)uVar45 - 1;
          uVar45 = (ulonglong)uVar27;
          if (*(longlong *)(lVar40 + uVar45 * 8) == lVar29) {
            FUN_7ff70cb12b70(lVar40 + uVar45 * 8,lVar40 + uVar45 * 8 + 8,(longlong)iVar36 << 3);
            *(longlong *)(*(longlong *)(puVar30 + 0x4fa) + -8 + (longlong)(int)puVar30[0x4f8] * 8) =
                 lVar29;
            lVar29 = *(longlong *)(puVar43 + 0x510);
            break;
          }
          iVar36 = iVar36 + 1;
        } while (0 < (int)uVar27);
      }
      puVar30 = _DAT_7ff70cc1a3c0;
      lVar40 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x4fe);
      if (*(longlong *)(lVar40 + -8 + (longlong)(int)_DAT_7ff70cc1a3c0[0x4fc] * 8) != lVar29) {
        iVar32 = (int)*(short *)(lVar29 + 0xe2);
        lVar28 = (longlong)(int)_DAT_7ff70cc1a3c0[0x4fc] + -1;
        iVar36 = (int)lVar28;
        lVar47 = lVar28;
        if (iVar36 - iVar32 != 0 && iVar32 <= iVar36) {
          lVar46 = (longlong)iVar32;
          lVar47 = (longlong)iVar36;
          lVar40 = lVar46;
          if ((iVar36 - iVar32 & 1U) != 0) {
            lVar40 = lVar46 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x4fe) + lVar46 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x4fe) + 8 + lVar46 * 8);
            psVar2 = (short *)(*(longlong *)(*(longlong *)(puVar30 + 0x4fe) + lVar46 * 8) + 0xe2);
            *psVar2 = *psVar2 + -1;
          }
          if (lVar47 + -1 != lVar46) {
            do {
              *(undefined8 *)(*(longlong *)(puVar30 + 0x4fe) + lVar40 * 8) =
                   *(undefined8 *)(*(longlong *)(puVar30 + 0x4fe) + 8 + lVar40 * 8);
              psVar2 = (short *)(*(longlong *)(*(longlong *)(puVar30 + 0x4fe) + lVar40 * 8) + 0xe2);
              *psVar2 = *psVar2 + -1;
              *(undefined8 *)(*(longlong *)(puVar30 + 0x4fe) + 8 + lVar40 * 8) =
                   *(undefined8 *)(*(longlong *)(puVar30 + 0x4fe) + 0x10 + lVar40 * 8);
              psVar2 = (short *)(*(longlong *)(*(longlong *)(puVar30 + 0x4fe) + 8 + lVar40 * 8) +
                                0xe2);
              *psVar2 = *psVar2 + -1;
              lVar40 = lVar40 + 2;
            } while (lVar47 != lVar40);
          }
          lVar40 = *(longlong *)(puVar30 + 0x4fe);
        }
        *(longlong *)(lVar40 + lVar47 * 8) = lVar29;
        *(short *)(lVar29 + 0xe2) = (short)lVar28;
      }
      *(undefined8 *)(puVar43 + 0x9e0) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x510) + 0x28);
      iVar36 = puVar44[0x9e3];
    }
    else {
      iVar36 = puVar44[0x9e3];
    }
    if (iVar36 < 0x14) {
      if (lVar6 == 0) {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb9015c);
      }
      else {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar6 + 8),&UNK_7ff70cb9015c);
        puVar43 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar6 + 0xd5) != '\x01') || (*(char *)(lVar6 + 0xcd) == '\x01')) {
          lVar29 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x7e2);
          lVar40 = *(longlong *)(lVar29 + 0x50);
          if (lVar40 == 0) {
            lVar40 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            puVar30 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != (undefined4 *)0x0) {
              piVar1 = _DAT_7ff70cc1a3c0 + 0x4e2;
              lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c);
              if (_DAT_7ff70cc1a3c0[lVar47 * 2 + 0xa1d] == *piVar1) {
                sVar31 = (short)_DAT_7ff70cc1a3c0[lVar47 * 2 + 0xa1e] + 1;
              }
              else {
                iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0xa1c) = (short)iVar36;
                lVar47 = (longlong)iVar36;
                puVar30[lVar47 * 2 + 0xa1d] = *piVar1;
                puVar30[lVar47 * 2 + 0xa1e] = 0;
                sVar31 = 1;
              }
              *(short *)(puVar30 + lVar47 * 2 + 0xa1e) = sVar31;
              puVar30[0xa1a] = puVar30[0xa1a] + 1;
            }
            FUN_7ff70c7b5780(lVar40,puVar43 + 0x452);
            *(undefined **)(lVar40 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar29 + 0x50) = lVar40;
          }
          if (*(int *)(lVar29 + 0x44) != puVar43[0x4e2]) {
            FUN_7ff70c7b6160(lVar40);
            lVar47 = *(longlong *)(puVar43 + 0x10);
            uStack_68 = *(undefined8 *)(lVar47 + 0x28);
            uStack_60 = *(undefined4 *)(lVar47 + 0x30);
            uStack_5c = *(undefined4 *)(lVar47 + 0x34);
            FUN_7ff70c7b8300(lVar40,&uStack_68);
            lStack_50 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar29 + 0x10) >> 0x20) +
                                 (float)((ulonglong)*(undefined8 *)(lVar29 + 8) >> 0x20),
                                 (float)*(undefined8 *)(lVar29 + 0x10) +
                                 (float)*(undefined8 *)(lVar29 + 8));
            FUN_7ff70c7b7c50(lVar40,lVar29 + 8,&lStack_50,0);
            *(undefined4 *)(lVar29 + 0x44) = puVar43[0x4e2];
          }
          uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar6 + 0x30) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar6 + 0x28) >> 0x20),
                               (float)*(undefined8 *)(lVar6 + 0x30) +
                               (float)*(undefined8 *)(lVar6 + 0x28));
          FUN_7ff70c7bd870(lVar40,lVar6 + 0x28,&uStack_68,0xff0000ff,0,0,0x3f800000);
          iVar36 = puVar44[0x9e3];
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar36 = puVar44[0x9e3];
    }
joined_r0x7ff70c80b695:
    if (iVar36 == 0x14) {
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  puVar44[0x9e3] = puVar44[0x9e3] + 1;
  pcVar5 = *(code **)(puVar44 + 0x9dc);
joined_r0x7ff70c80b41a:
  if (pcVar5 != (code *)0x0) {
    (*pcVar5)(puVar44,*(undefined8 *)(puVar44 + 0x9de),&UNK_7ff70cb9015c);
  }
  return (ulonglong)*(byte *)((longlong)puVar44 + 0x7d);
}


