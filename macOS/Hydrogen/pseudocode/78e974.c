
void FUN_0078e974(void)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  long *plVar8;
  char *pcVar9;
  undefined8 *unaff_x26;
  undefined1 *unaff_x27;
  bool bVar10;
  undefined1 *unaff_x28;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000058;
  undefined1 uStack0000000000000068;
  undefined1 uStack0000000000000075;
  undefined1 uStack0000000000000196;
  undefined8 uStack_580;
  char *pcStack_578;
  undefined1 auStack_570 [1024];
  undefined1 auStack_170 [256];
  long lStack_70;
  undefined1 *puStack_60;
  undefined1 *puStack_58;
  
  func_0x00764560();
  lVar4 = func_0x00790724();
  if (lVar4 == 0) {
LAB_0078ee94:
    uVar6 = 0x1b;
  }
  else {
    lVar5 = func_0x0075eacc(&UNK_00a1edb8);
    if (lVar5 == 0) {
LAB_0078ee88:
      (*(code *)*unaff_x26)(lVar4);
      goto LAB_0078ee94;
    }
    _strlen(&uStack0000000000000058);
    uVar6 = func_0x00093e00();
    func_0x0074ed30(lVar5,&uStack0000000000000058,uVar6);
    func_0x0074ed30(lVar5,":",1);
    _strlen(lVar4);
    uVar6 = func_0x00093e00();
    func_0x0074ed30(lVar5,lVar4,uVar6);
    func_0x0075eb58(lVar5,unaff_x29 + -0x70);
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
    lVar5 = func_0x0075eacc(&UNK_00a1edb8);
    if (lVar5 == 0) goto LAB_0078ee88;
    func_0x0074ed30(lVar5,unaff_x29 + -0x98,0x20);
    func_0x0074ed30(lVar5,":",1);
    _strlen(&uStack0000000000000196);
    uVar6 = func_0x00093e00();
    func_0x0074ed30(lVar5,&uStack0000000000000196,uVar6);
    func_0x0074ed30(lVar5,":",1);
    _strlen(&uStack0000000000000068);
    uVar6 = func_0x00093e00();
    func_0x0074ed30(lVar5,&uStack0000000000000068,uVar6);
    func_0x0074ed30(lVar5,":",1);
    unaff_x27 = &uStack0000000000000075;
    _strlen(&uStack0000000000000075);
    uVar6 = func_0x00093e00();
    func_0x0074ed30(lVar5,&uStack0000000000000075,uVar6);
    func_0x0074ed30(lVar5,":",1);
    unaff_x28 = &uStack0000000000000050;
    _strlen(&uStack0000000000000050);
    uVar6 = func_0x00093e00();
    func_0x0074ed30(lVar5,&uStack0000000000000050,uVar6);
    func_0x0074ed30(lVar5,":",1);
    func_0x0074ed30(lVar5,unaff_x29 + -0xb9,0x20);
    func_0x0075eb58(lVar5,unaff_x29 + -0x70);
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
    lVar5 = func_0x00764704(
                           "username=\"%s\",realm=\"%s\",nonce=\"%s\",cnonce=\"%s\",nc=\"%s\",digest-uri=\"%s\",response=%s,qop=%s"
                           );
    (*(code *)*unaff_x26)(lVar4);
    if (lVar5 == 0) goto LAB_0078ee94;
    uVar6 = _strlen(lVar5);
    func_0x0072a784(in_stack_00000048,lVar5,uVar6,&_curl_free);
    uVar6 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar11 = ___stack_chk_fail(uVar6);
  plVar8 = auVar11._8_8_;
  pcVar9 = auVar11._0_8_;
  lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar4 = *plVar8;
  pcStack_578 = pcVar9;
  puStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  (*pcRam0000000000a2b5f0)(lVar4);
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
  bVar10 = false;
  bVar2 = false;
  plVar8[5] = 0;
  *(undefined4 *)(plVar8 + 6) = 0;
  *(undefined1 *)((long)plVar8 + 0x34) = 0;
  *(byte *)((long)plVar8 + 0x35) = *(byte *)((long)plVar8 + 0x35) & 0xfc;
  if (*pcVar9 == ' ' || *pcVar9 == '\t') goto LAB_0078f020;
  while( true ) {
    pcStack_578 = pcVar9;
    iVar3 = func_0x0078e1ac(pcVar9,auStack_170,auStack_570,&pcStack_578);
    if (iVar3 == 0) break;
    iVar3 = func_0x0077e6f8(auStack_170,"nonce");
    if (iVar3 != 0) {
      (*pcRam0000000000a2b5f0)(*plVar8);
      lVar5 = (*pcRam0000000000a2b600)(auStack_570);
      *plVar8 = lVar5;
      goto joined_r0x0078f1d8;
    }
    iVar3 = func_0x0077e6f8(auStack_170,"stale");
    if (iVar3 != 0) {
      iVar3 = func_0x0077e6f8(auStack_570,"true");
      if (iVar3 != 0) {
        *(byte *)((long)plVar8 + 0x35) = *(byte *)((long)plVar8 + 0x35) | 1;
        *(undefined4 *)(plVar8 + 6) = 1;
      }
      goto code_r0x0078efe0;
    }
    iVar3 = func_0x0077e6f8(auStack_170,"realm");
    if (iVar3 == 0) {
      iVar3 = func_0x0077e6f8(auStack_170,"opaque");
      if (iVar3 != 0) {
        (*pcRam0000000000a2b5f0)(plVar8[3]);
        lVar5 = (*pcRam0000000000a2b600)(auStack_570);
        plVar8[3] = lVar5;
        goto joined_r0x0078f0d8;
      }
      iVar3 = func_0x0077e6f8(auStack_170,"qop");
      if (iVar3 != 0) {
        uStack_580 = 0;
        lVar5 = (*pcRam0000000000a2b600)(auStack_570);
        if (lVar5 != 0) {
          pcVar9 = (char *)_strtok_r(lVar5,",",&uStack_580);
          if (pcVar9 != (char *)0x0) {
            do {
              while( true ) {
                for (; *pcVar9 == ' ' || *pcVar9 == '\t'; pcVar9 = pcVar9 + 1) {
                }
                iVar3 = func_0x0077e6f8(pcVar9,"auth");
                if (iVar3 == 0) break;
                bVar10 = true;
                pcVar9 = (char *)_strtok_r(0,",",&uStack_580);
                if (pcVar9 == (char *)0x0) goto code_r0x0078f1a4;
              }
              iVar3 = func_0x0077e6f8(pcVar9,"auth-int");
              bVar2 = (bool)(iVar3 != 0 | bVar2);
              pcVar9 = (char *)_strtok_r(0,",",&uStack_580);
            } while (pcVar9 != (char *)0x0);
          }
code_r0x0078f1a4:
          (*pcRam0000000000a2b5f0)(lVar5);
          if (bVar10) {
            (*pcRam0000000000a2b5f0)(plVar8[4]);
            lVar5 = (*pcRam0000000000a2b600)("auth");
            plVar8[4] = lVar5;
          }
          else {
            if (!bVar2) goto code_r0x0078efe0;
            (*pcRam0000000000a2b5f0)(plVar8[4]);
            lVar5 = (*pcRam0000000000a2b600)("auth-int");
            plVar8[4] = lVar5;
          }
joined_r0x0078f1d8:
          if (lVar5 != 0) goto code_r0x0078efe0;
        }
        goto LAB_0078f37c;
      }
      iVar3 = func_0x0077e6f8(auStack_170,"algorithm");
      if (iVar3 == 0) {
        iVar3 = func_0x0077e6f8(auStack_170,"userhash");
        if ((iVar3 != 0) && (iVar3 = func_0x0077e6f8(auStack_570,"true"), iVar3 != 0)) {
          *(byte *)((long)plVar8 + 0x35) = *(byte *)((long)plVar8 + 0x35) | 2;
        }
      }
      else {
        (*pcRam0000000000a2b5f0)(plVar8[5]);
        lVar5 = (*pcRam0000000000a2b600)(auStack_570);
        plVar8[5] = lVar5;
        if (lVar5 == 0) goto LAB_0078f37c;
        iVar3 = func_0x0077e6f8(auStack_570,"MD5-sess");
        if (iVar3 == 0) {
          iVar3 = func_0x0077e6f8(auStack_570,"MD5");
          if (iVar3 == 0) {
            iVar3 = func_0x0077e6f8(auStack_570,"SHA-256");
            if (iVar3 == 0) {
              iVar3 = func_0x0077e6f8(auStack_570,"SHA-256-SESS");
              if (iVar3 == 0) {
                iVar3 = func_0x0077e6f8(auStack_570,"SHA-512-256");
                if (iVar3 == 0) {
                  iVar3 = func_0x0077e6f8(auStack_570,"SHA-512-256-SESS");
                  if (iVar3 == 0) goto code_r0x0078f3b8;
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
      lVar5 = (*pcRam0000000000a2b600)(auStack_570);
      plVar8[2] = lVar5;
joined_r0x0078f0d8:
      if (lVar5 == 0) {
LAB_0078f37c:
        uVar6 = 0x1b;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
          return;
        }
        goto code_r0x0078f3d4;
      }
    }
code_r0x0078efe0:
    for (pcVar9 = pcStack_578; (cVar1 = *pcVar9, cVar1 == '\t' || (cVar1 == ' '));
        pcVar9 = pcVar9 + 1) {
    }
    if (cVar1 == ',') {
      pcVar9 = pcVar9 + 1;
    }
    if (*pcVar9 == ' ' || *pcVar9 == '\t') {
LAB_0078f020:
      do {
        pcVar9 = pcVar9 + 1;
      } while (*pcVar9 == ' ' || *pcVar9 == '\t');
    }
  }
  if ((((lVar4 == 0) || ((*(byte *)((long)plVar8 + 0x35) & 1) != 0)) && (*plVar8 != 0)) &&
     ((plVar8[4] != 0 || ((*(byte *)((long)plVar8 + 0x34) & 1) == 0)))) {
    uVar6 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_70) goto code_r0x0078f3d4;
  }
  else {
code_r0x0078f3b8:
    uVar6 = 0x3d;
    if (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_70) {
code_r0x0078f3d4:
      puVar7 = (undefined8 *)___stack_chk_fail(uVar6);
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
  }
  return;
}

