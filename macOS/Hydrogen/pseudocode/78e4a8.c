
/* WARNING: Type propagation algorithm not settling */

void FUN_0078e4a8(void)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  long *plVar8;
  uint in_w8;
  uint uVar9;
  long lVar10;
  char cVar11;
  long in_x9;
  long in_x11;
  long lVar12;
  long in_x12;
  ulong unaff_x19;
  ulong uVar13;
  long unaff_x20;
  long unaff_x21;
  char *unaff_x22;
  char *unaff_x23;
  undefined1 *unaff_x24;
  char *pcVar14;
  char *unaff_x25;
  undefined8 unaff_x26;
  undefined1 *unaff_x27;
  bool bVar15;
  char *unaff_x28;
  long unaff_x29;
  undefined1 auVar16 [16];
  char cStack0000000000000050;
  undefined1 uStack0000000000000058;
  char cStack0000000000000068;
  undefined1 uStack0000000000000075;
  undefined1 uStack0000000000000096;
  undefined1 uStack00000000000000d0;
  undefined8 uStack00000000000000d6;
  char cStack00000000000000de;
  undefined1 uStack0000000000000116;
  undefined1 uStack0000000000000196;
  undefined8 uStack_580;
  char *pcStack_578;
  undefined1 auStack_570 [1024];
  undefined1 auStack_170 [256];
  long lStack_70;
  char *pcStack_60;
  undefined1 *puStack_58;
  undefined8 uStack_50;
  char *pcStack_48;
  undefined1 *puStack_40;
  char *pcStack_38;
  char *pcStack_30;
  long lStack_28;
  long lStack_20;
  ulong uStack_18;
  
  while (in_w8 != 0x2c && in_w8 != 0) {
    *(char *)(in_x11 + in_x12) = (char)in_w8;
    if (in_x12 == 0x3e) {
      in_x12 = 0x3f;
      break;
    }
    in_w8 = (uint)*(byte *)(in_x9 + in_x12);
    in_x12 = in_x12 + 1;
  }
  (&uStack00000000000000d0)[in_x12 + 6] = 0;
  lVar3 = _strstr();
  uVar13 = unaff_x19;
  puVar5 = unaff_x24;
  lVar6 = unaff_x21;
  if (lVar3 != 0) {
    lVar10 = 0;
    cVar11 = *(char *)(lVar3 + 5);
    if ((cVar11 != '\0') && (cVar11 != '\"')) {
      lVar12 = 0;
      do {
        (&uStack00000000000000d0)[lVar12 + -0x3a] = cVar11;
        if (lVar12 == 0x3e) {
          lVar10 = 0x3f;
          break;
        }
        lVar10 = lVar12 + 1;
        cVar11 = *(char *)(lVar3 + 6 + lVar12);
        lVar12 = lVar10;
      } while (cVar11 != '\"' && cVar11 != '\0');
    }
    (&uStack00000000000000d0)[lVar10 + -0x3a] = 0;
    if (uStack00000000000000d6 == 0x737365732d35646d && cStack00000000000000de == '\0') {
      *(undefined8 *)(unaff_x29 + -0x98) = 0;
      puVar5 = (undefined1 *)(*pcRam0000000000a2b600)(&uStack0000000000000096);
      if (puVar5 == (undefined1 *)0x0) goto LAB_0078ee94;
      lVar3 = _strtok_r(puVar5,",",unaff_x29 + -0x98);
      if (lVar3 == 0) {
        uVar13 = 0;
        unaff_x26 = 0xa2b5f0;
        (*pcRam0000000000a2b5f0)(puVar5);
      }
      else {
        uVar13 = 0;
        unaff_x25 = "auth";
        unaff_x28 = ",";
        do {
          iVar2 = func_0x0077e6f8(lVar3,"auth");
          if (iVar2 == 0) {
            iVar2 = func_0x0077e6f8(lVar3,"auth-int");
            if (iVar2 != 0) {
              uVar9 = 2;
              goto LAB_0078e65c;
            }
            iVar2 = func_0x0077e6f8(lVar3,"auth-conf");
            if (iVar2 != 0) {
              uVar9 = 4;
              goto LAB_0078e65c;
            }
          }
          else {
            uVar9 = 1;
LAB_0078e65c:
            uVar13 = (ulong)(uVar9 | (uint)uVar13);
          }
          lVar3 = _strtok_r(0,",",unaff_x29 + -0x98);
        } while (lVar3 != 0);
        unaff_x26 = 0xa2b5f0;
        (*pcRam0000000000a2b5f0)(puVar5);
        unaff_x27 = (undefined1 *)0x0;
        if ((uVar13 & 1) != 0) {
          unaff_x28 = ",";
          unaff_x25 = "auth";
          unaff_x26 = 0xa2b5f0;
          uVar4 = func_0x00770ee0();
          unaff_x24 = puVar5;
          if ((int)uVar4 != 0) goto code_r0x0078e584;
          puVar5 = (undefined1 *)func_0x0075eacc(&UNK_00a1edb8);
          if (puVar5 != (undefined1 *)0x0) {
            _strlen();
            func_0x00093e00();
            func_0x0074ed30(puVar5);
            unaff_x25 = ":";
            func_0x0074ed30(puVar5,":",1);
            _strlen(&uStack0000000000000116);
            uVar4 = func_0x00093e00();
            func_0x0074ed30(puVar5,&uStack0000000000000116,uVar4);
            func_0x0074ed30(puVar5,":",1);
            _strlen();
            func_0x00093e00();
            func_0x0074ed30(puVar5);
            func_0x0075eb58(puVar5,unaff_x29 + -0x70);
            lVar6 = func_0x0075eacc(&UNK_00a1edb8);
            unaff_x24 = puVar5;
            if (lVar6 != 0) {
              func_0x0074ed30(lVar6,unaff_x29 + -0x70,0x10);
              func_0x0074ed30(lVar6,":",1);
              _strlen(&uStack0000000000000196);
              uVar4 = func_0x00093e00();
              func_0x0074ed30(lVar6,&uStack0000000000000196,uVar4);
              func_0x0074ed30(lVar6,":",1);
              _strlen(&uStack0000000000000075);
              uVar4 = func_0x00093e00();
              func_0x0074ed30(lVar6,&uStack0000000000000075,uVar4);
              func_0x0075eb58(lVar6,unaff_x29 + -0x70);
              unaff_x23 = "%02x";
              unaff_x24 = (undefined1 *)(unaff_x29 + -0x98);
              func_0x00764560(unaff_x29 + -0x98,3,"%02x");
              func_0x00764560(unaff_x29 + -0x96,3,"%02x");
              func_0x00764560(unaff_x29 + -0x94,3,"%02x");
              func_0x00764560(unaff_x29 + -0x92,3,"%02x");
              func_0x00764560(unaff_x29 + -0x90,3,"%02x");
              func_0x00764560(unaff_x29 + -0x8e,3,"%02x");
              func_0x00764560(unaff_x29 + -0x8c,3,"%02x");
              func_0x00764560(unaff_x29 + -0x8a,3,"%02x");
              func_0x00764560(unaff_x29 + -0x88,3,"%02x");
              func_0x00764560(unaff_x29 + -0x86,3,"%02x");
              func_0x00764560(unaff_x29 + -0x84,3,"%02x");
              func_0x00764560(unaff_x29 + -0x82,3,"%02x");
              func_0x00764560(unaff_x29 + -0x80,3,"%02x");
              func_0x00764560(unaff_x29 + -0x7e,3,"%02x");
              func_0x00764560(unaff_x29 + -0x7c,3,"%02x");
              func_0x00764560(unaff_x29 + -0x7a,3,"%02x");
              lVar6 = func_0x00790724();
              if (lVar6 != 0) {
                lVar3 = func_0x0075eacc(&UNK_00a1edb8);
                unaff_x21 = lVar6;
                if (lVar3 != 0) {
                  _strlen(&uStack0000000000000058);
                  uVar4 = func_0x00093e00();
                  func_0x0074ed30(lVar3,&uStack0000000000000058,uVar4);
                  func_0x0074ed30(lVar3,":",1);
                  _strlen(lVar6);
                  uVar4 = func_0x00093e00();
                  func_0x0074ed30(lVar3,lVar6,uVar4);
                  func_0x0075eb58(lVar3,unaff_x29 + -0x70);
                  unaff_x22 = "%02x";
                  unaff_x23 = (char *)(unaff_x29 + -0xb9);
                  func_0x00764560(unaff_x29 + -0xb9,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xb7,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xb5,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xb3,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xb1,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xaf,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xad,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xab,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xa9,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xa7,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xa5,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xa3,3,"%02x");
                  func_0x00764560(unaff_x29 + -0xa1,3,"%02x");
                  func_0x00764560(unaff_x29 + -0x9f,3,"%02x");
                  func_0x00764560(unaff_x29 + -0x9d,3,"%02x");
                  func_0x00764560(unaff_x29 + -0x9b,3,"%02x");
                  lVar3 = func_0x0075eacc(&UNK_00a1edb8);
                  if (lVar3 != 0) {
                    func_0x0074ed30(lVar3,unaff_x29 + -0x98,0x20);
                    func_0x0074ed30(lVar3,":",1);
                    unaff_x24 = &uStack0000000000000196;
                    _strlen(&uStack0000000000000196);
                    uVar4 = func_0x00093e00();
                    func_0x0074ed30(lVar3,&uStack0000000000000196,uVar4);
                    func_0x0074ed30(lVar3,":",1);
                    unaff_x25 = &cStack0000000000000068;
                    _strlen(&cStack0000000000000068);
                    uVar4 = func_0x00093e00();
                    func_0x0074ed30(lVar3,&cStack0000000000000068,uVar4);
                    func_0x0074ed30(lVar3,":",1);
                    unaff_x27 = &uStack0000000000000075;
                    _strlen(&uStack0000000000000075);
                    uVar4 = func_0x00093e00();
                    func_0x0074ed30(lVar3,&uStack0000000000000075,uVar4);
                    func_0x0074ed30(lVar3,":",1);
                    unaff_x28 = &cStack0000000000000050;
                    _strlen(&cStack0000000000000050);
                    uVar4 = func_0x00093e00();
                    func_0x0074ed30(lVar3,&cStack0000000000000050,uVar4);
                    func_0x0074ed30(lVar3,":",1);
                    func_0x0074ed30(lVar3,unaff_x29 + -0xb9,0x20);
                    func_0x0075eb58(lVar3,unaff_x29 + -0x70);
                    unaff_x22 = "%02x";
                    unaff_x23 = (char *)(unaff_x29 + -0xda);
                    func_0x00764560(unaff_x29 + -0xda,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xd8,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xd6,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xd4,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xd2,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xd0,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xce,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xcc,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xca,3,"%02x");
                    func_0x00764560(unaff_x29 + -200,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xc6,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xc4,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xc2,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xc0,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xbe,3,"%02x");
                    func_0x00764560(unaff_x29 + -0xbc,3,"%02x");
                    unaff_x20 = func_0x00764704(
                                               "username=\"%s\",realm=\"%s\",nonce=\"%s\",cnonce=\"%s\",nc=\"%s\",digest-uri=\"%s\",response=%s,qop=%s"
                                               );
                    (*pcRam0000000000a2b5f0)(lVar6);
                    if (unaff_x20 != 0) {
                      uVar4 = _strlen(unaff_x20);
                      func_0x0072a784(unaff_x19,unaff_x20,uVar4,&_curl_free);
                      uVar4 = 0;
                      goto code_r0x0078e584;
                    }
                    goto LAB_0078ee94;
                  }
                }
                (*pcRam0000000000a2b5f0)(lVar6);
              }
            }
          }
LAB_0078ee94:
          lVar6 = unaff_x21;
          uVar4 = 0x1b;
          goto code_r0x0078e584;
        }
      }
    }
  }
  uVar4 = 0x3d;
  unaff_x24 = puVar5;
code_r0x0078e584:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar16 = ___stack_chk_fail(uVar4);
  plVar8 = auVar16._8_8_;
  pcVar14 = auVar16._0_8_;
  lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar3 = *plVar8;
  pcStack_578 = pcVar14;
  pcStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  uStack_50 = unaff_x26;
  pcStack_48 = unaff_x25;
  puStack_40 = unaff_x24;
  pcStack_38 = unaff_x23;
  pcStack_30 = unaff_x22;
  lStack_28 = lVar6;
  lStack_20 = unaff_x20;
  uStack_18 = uVar13;
  (*pcRam0000000000a2b5f0)(lVar3);
  *plVar8 = 0;
  (*pcRam0000000000a2b5f0)(plVar8[1]);
  plVar8[1] = 0;
  (*pcRam0000000000a2b5f0)(plVar8[2]);
  plVar8[2] = 0;
  (*pcRam0000000000a2b5f0)(plVar8[3]);
  plVar8[3] = 0;
  (*pcRam0000000000a2b5f0)(plVar8[4]);
  plVar8[4] = 0;
  (*pcRam0000000000a2b5f0)(plVar8[5]);
  bVar15 = false;
  bVar1 = false;
  plVar8[5] = 0;
  *(undefined4 *)(plVar8 + 6) = 0;
  *(undefined1 *)((long)plVar8 + 0x34) = 0;
  *(byte *)((long)plVar8 + 0x35) = *(byte *)((long)plVar8 + 0x35) & 0xfc;
  if (*pcVar14 == ' ' || *pcVar14 == '\t') goto code_r0x0078f020;
  do {
    pcStack_578 = pcVar14;
    iVar2 = func_0x0078e1ac(pcVar14,auStack_170,auStack_570,&pcStack_578);
    if (iVar2 == 0) {
      if ((((lVar3 == 0) || ((*(byte *)((long)plVar8 + 0x35) & 1) != 0)) && (*plVar8 != 0)) &&
         ((plVar8[4] != 0 || ((*(byte *)((long)plVar8 + 0x34) & 1) == 0)))) {
        uVar4 = 0;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
          return;
        }
      }
      else {
code_r0x0078f3b8:
        uVar4 = 0x3d;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
          return;
        }
      }
code_r0x0078f3d4:
      puVar7 = (undefined8 *)___stack_chk_fail(uVar4);
      (*pcRam0000000000a2b5f0)(*puVar7);
      *puVar7 = 0;
      (*pcRam0000000000a2b5f0)(puVar7[1]);
      puVar7[1] = 0;
      (*pcRam0000000000a2b5f0)(puVar7[2]);
      puVar7[2] = 0;
      (*pcRam0000000000a2b5f0)(puVar7[3]);
      puVar7[3] = 0;
      (*pcRam0000000000a2b5f0)(puVar7[4]);
      puVar7[4] = 0;
      (*pcRam0000000000a2b5f0)(puVar7[5]);
      puVar7[5] = 0;
      *(undefined4 *)(puVar7 + 6) = 0;
      *(undefined1 *)((long)puVar7 + 0x34) = 0;
      *(byte *)((long)puVar7 + 0x35) = *(byte *)((long)puVar7 + 0x35) & 0xfc;
      return;
    }
    iVar2 = func_0x0077e6f8(auStack_170,"nonce");
    if (iVar2 != 0) {
      (*pcRam0000000000a2b5f0)(*plVar8);
      lVar6 = (*pcRam0000000000a2b600)(auStack_570);
      *plVar8 = lVar6;
      goto joined_r0x0078f0a0;
    }
    iVar2 = func_0x0077e6f8(auStack_170,"stale");
    if (iVar2 != 0) {
      iVar2 = func_0x0077e6f8(auStack_570,"true");
      if (iVar2 != 0) {
        *(byte *)((long)plVar8 + 0x35) = *(byte *)((long)plVar8 + 0x35) | 1;
        *(undefined4 *)(plVar8 + 6) = 1;
      }
      goto code_r0x0078efe0;
    }
    iVar2 = func_0x0077e6f8(auStack_170,"realm");
    if (iVar2 == 0) {
      iVar2 = func_0x0077e6f8(auStack_170,"opaque");
      if (iVar2 != 0) {
        (*pcRam0000000000a2b5f0)(plVar8[3]);
        lVar6 = (*pcRam0000000000a2b600)(auStack_570);
        plVar8[3] = lVar6;
        goto joined_r0x0078f0a0;
      }
      iVar2 = func_0x0077e6f8(auStack_170,"qop");
      if (iVar2 != 0) {
        uStack_580 = 0;
        lVar6 = (*pcRam0000000000a2b600)(auStack_570);
        if (lVar6 != 0) {
          pcVar14 = (char *)_strtok_r(lVar6,",",&uStack_580);
          if (pcVar14 != (char *)0x0) {
            do {
              while( true ) {
                for (; *pcVar14 == ' ' || *pcVar14 == '\t'; pcVar14 = pcVar14 + 1) {
                }
                iVar2 = func_0x0077e6f8(pcVar14,"auth");
                if (iVar2 == 0) break;
                bVar15 = true;
                pcVar14 = (char *)_strtok_r(0,",",&uStack_580);
                if (pcVar14 == (char *)0x0) goto code_r0x0078f1a4;
              }
              iVar2 = func_0x0077e6f8(pcVar14,"auth-int");
              bVar1 = (bool)(iVar2 != 0 | bVar1);
              pcVar14 = (char *)_strtok_r(0,",",&uStack_580);
            } while (pcVar14 != (char *)0x0);
          }
code_r0x0078f1a4:
          (*pcRam0000000000a2b5f0)(lVar6);
          if (bVar15) {
            (*pcRam0000000000a2b5f0)(plVar8[4]);
            lVar6 = (*pcRam0000000000a2b600)("auth");
            plVar8[4] = lVar6;
          }
          else {
            if (!bVar1) goto code_r0x0078efe0;
            (*pcRam0000000000a2b5f0)(plVar8[4]);
            lVar6 = (*pcRam0000000000a2b600)("auth-int");
            plVar8[4] = lVar6;
          }
          goto joined_r0x0078f0a0;
        }
        goto code_r0x0078f37c;
      }
      iVar2 = func_0x0077e6f8(auStack_170,"algorithm");
      if (iVar2 == 0) {
        iVar2 = func_0x0077e6f8(auStack_170,"userhash");
        if ((iVar2 != 0) && (iVar2 = func_0x0077e6f8(auStack_570,"true"), iVar2 != 0)) {
          *(byte *)((long)plVar8 + 0x35) = *(byte *)((long)plVar8 + 0x35) | 2;
        }
      }
      else {
        (*pcRam0000000000a2b5f0)(plVar8[5]);
        lVar6 = (*pcRam0000000000a2b600)(auStack_570);
        plVar8[5] = lVar6;
        if (lVar6 == 0) goto code_r0x0078f37c;
        iVar2 = func_0x0077e6f8(auStack_570,"MD5-sess");
        if (iVar2 == 0) {
          iVar2 = func_0x0077e6f8(auStack_570,"MD5");
          if (iVar2 == 0) {
            iVar2 = func_0x0077e6f8(auStack_570,"SHA-256");
            if (iVar2 == 0) {
              iVar2 = func_0x0077e6f8(auStack_570,"SHA-256-SESS");
              if (iVar2 == 0) {
                iVar2 = func_0x0077e6f8(auStack_570,"SHA-512-256");
                if (iVar2 == 0) {
                  iVar2 = func_0x0077e6f8(auStack_570,"SHA-512-256-SESS");
                  if (iVar2 == 0) goto code_r0x0078f3b8;
                  *(undefined1 *)((long)plVar8 + 0x34) = 5;
                }
                else {
                  *(undefined1 *)((long)plVar8 + 0x34) = 4;
                }
              }
              else {
                *(undefined1 *)((long)plVar8 + 0x34) = 3;
              }
            }
            else {
              *(undefined1 *)((long)plVar8 + 0x34) = 2;
            }
          }
          else {
            *(undefined1 *)((long)plVar8 + 0x34) = 0;
          }
        }
        else {
          *(undefined1 *)((long)plVar8 + 0x34) = 1;
        }
      }
    }
    else {
      (*pcRam0000000000a2b5f0)(plVar8[2]);
      lVar6 = (*pcRam0000000000a2b600)(auStack_570);
      plVar8[2] = lVar6;
joined_r0x0078f0a0:
      if (lVar6 == 0) {
code_r0x0078f37c:
        uVar4 = 0x1b;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
          return;
        }
        goto code_r0x0078f3d4;
      }
    }
code_r0x0078efe0:
    for (pcVar14 = pcStack_578; (cVar11 = *pcVar14, cVar11 == '\t' || (cVar11 == ' '));
        pcVar14 = pcVar14 + 1) {
    }
    if (cVar11 == ',') {
      pcVar14 = pcVar14 + 1;
    }
    if (*pcVar14 == ' ' || *pcVar14 == '\t') {
code_r0x0078f020:
      do {
        pcVar14 = pcVar14 + 1;
      } while (*pcVar14 == ' ' || *pcVar14 == '\t');
    }
  } while( true );
}

