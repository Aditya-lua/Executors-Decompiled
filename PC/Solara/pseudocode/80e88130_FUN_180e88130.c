/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180e88130(longlong param_1,longlong param_2)

{
  byte bVar1;
  bool bVar2;
  char cVar3;
  uint uVar4;
  int iVar5;
  undefined4 uVar6;
  int iVar7;
  longlong lVar8;
  longlong lVar9;
  longlong lVar10;
  undefined2 *puVar11;
  longlong lVar12;
  undefined *puVar13;
  undefined8 *puVar14;
  char *pcVar15;
  longlong lVar16;
  undefined8 uVar17;
  undefined *puVar18;
  uint uVar19;
  ulonglong uVar20;
  char *pcVar21;
  uint uVar22;
  ulonglong uVar23;
  longlong *plVar24;
  code *pcVar25;
  undefined2 *puVar26;
  bool bVar27;
  undefined1 auStack_298 [32];
  undefined8 uStack_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
  longlong lStack_260;
  longlong lStack_258;
  char cStack_248;
  char cStack_247;
  char cStack_246;
  uint uStack_244;
  longlong lStack_240;
  longlong lStack_238;
  uint uStack_230;
  longlong lStack_228;
  longlong *plStack_220;
  undefined2 uStack_218;
  undefined2 uStack_216;
  undefined4 uStack_214;
  undefined2 uStack_210;
  undefined4 uStack_20e;
  undefined2 uStack_20a;
  undefined2 uStack_208;
  undefined2 uStack_206;
  undefined4 uStack_204;
  undefined2 uStack_200;
  undefined4 uStack_1fe;
  undefined2 uStack_1fa;
  ulonglong uStack_1f8;
  longlong lStack_1f0;
  undefined8 uStack_1e8;
  longlong *plStack_1e0;
  longlong *plStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  int *piStack_1b8;
  ulonglong uStack_1b0;
  undefined8 *puStack_1a8;
  ulonglong uStack_1a0;
  undefined4 auStack_198 [2];
  undefined8 *puStack_190;
  undefined4 auStack_188 [2];
  longlong lStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  int *piStack_160;
  undefined8 uStack_158;
  int aiStack_148 [2];
  undefined *apuStack_140 [2];
  undefined2 *puStack_130;
  longlong lStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  ulonglong uStack_48;
  
  uStack_48 = _DAT_1810c1700 ^ (ulonglong)auStack_298;
  lVar10 = *(longlong *)(param_1 + 0x10);
  lStack_240 = param_2;
  lVar8 = func_0x000180e66830();
  uStack_208 = (undefined2)lVar8;
  uStack_206 = (undefined2)((ulonglong)lVar8 >> 0x10);
  uStack_204 = (undefined4)((ulonglong)lVar8 >> 0x20);
  lVar9 = func_0x000180e66810(param_1,param_2);
  lStack_238 = 0;
  lVar12 = 0;
  uVar22 = 0;
  plStack_220 = *(longlong **)(lVar10 + 0x30);
  uStack_244 = 0;
  if (*(char *)(lVar8 + 0x79) == '\0') {
    uVar4 = 0x1808;
  }
  else {
    cVar3 = *(char *)((longlong)plStack_220 + 0x6c);
    if (*(char *)(lVar9 + 0xc3) == '\0') {
      if (*(char *)(lVar9 + 0xc5) == '\0') {
        uVar4 = 0x208;
        if (cVar3 == '\0') {
          uVar4 = 0x220;
        }
      }
      else {
        uVar4 = 0x1a08;
        if (cVar3 == '\0') {
          uVar4 = 0x1a20;
        }
      }
    }
    else {
      uVar4 = 0x1808;
      if (cVar3 == '\0') {
        uVar4 = 0x1820;
      }
    }
  }
  puVar18 = &UNK_18104aa98;
  uVar19 = uVar4 | 4;
  if (*(char *)(lVar8 + 0x7a) != '\0') {
    uVar19 = uVar4;
  }
  uVar4 = uVar19 | 0x10;
  if (*(char *)(lVar9 + 199) != '\0') {
    puVar18 = &UNK_18104aad0;
    uVar4 = uVar19;
  }
  uStack_230 = uVar4;
  FUN_180e64ce0(param_2,puVar18);
  switch(*(undefined1 *)(lVar8 + 0x78)) {
  case 0:
  case 1:
  case 4:
  case 5:
  case 6:
  case 7:
    lVar10 = func_0x000180e66830(param_1);
    iVar5 = *(int *)(lVar10 + 0x74);
    bVar1 = *(byte *)(lVar10 + 0x78);
    if ((iVar5 == 0) || (iVar5 == 0x10000)) {
      uStack_278 = (undefined8 *)CONCAT44(uStack_278._4_4_,3);
      cVar3 = FUN_180e94290(10,0,0x4f7c,2);
      iVar5 = 0x60000;
      if (cVar3 != '\0') {
        iVar5 = 0x70000;
      }
    }
    for (uVar19 = (uint)bVar1; (int)uVar19 <= iVar5 >> 0x10; uVar19 = uVar19 + 1) {
      if (uVar19 == 4) {
        uVar22 = uVar22 | 0x80;
code_r0x000180e88304:
        uStack_244 = uVar22;
      }
      else {
        if (uVar19 == 5) {
          uVar22 = uVar22 | 0x200;
          goto code_r0x000180e88304;
        }
        if (uVar19 == 6) {
          uVar22 = uVar22 | 0x800;
          goto code_r0x000180e88304;
        }
        if (uVar19 == 7) {
          uStack_278._4_4_ = (undefined4)((ulonglong)uStack_278 >> 0x20);
          uStack_278 = (undefined8 *)CONCAT44(uStack_278._4_4_,3);
          cVar3 = FUN_180e94290(10,0,0x4f7c,2);
          if (cVar3 != '\0') {
            uVar22 = uVar22 | 0x2000;
            goto code_r0x000180e88304;
          }
          puVar18 = &UNK_18104a920;
          goto code_r0x000180e890b9;
        }
      }
    }
    if (*(longlong *)(param_2 + 0x540) != 0) {
code_r0x000180e88327:
      uVar22 = 0;
      lStack_1f0 = 0;
      lVar8 = 0;
      lStack_228 = 0;
      puVar26 = (undefined2 *)0x0;
      uStack_1f8 = 0;
      plVar24 = *(longlong **)(lStack_240 + 0x568);
      lVar12 = 0;
      uStack_218 = SUB82(plVar24,0);
      uStack_216 = (undefined2)((ulonglong)plVar24 >> 0x10);
      uStack_214 = (undefined4)((ulonglong)plVar24 >> 0x20);
      lVar10 = 0;
      if (plVar24 == (longlong *)0x0) {
        lVar10 = FUN_180e62c90();
        if (lVar10 == 0) goto code_r0x000180e8871c;
        lVar12 = func_0x000180eaa870(lVar10,0x5c);
        if (lVar12 == 0) {
code_r0x000180e884fe:
          if ((**(char **)(lStack_240 + 0x540) == '\0') ||
             (lVar12 = FUN_180e62df0(*(char **)(lStack_240 + 0x540),&UNK_180f85574), lVar12 == 0)) {
            FUN_180e64c00(lStack_240,&UNK_18104ab60,*(undefined8 *)(lStack_240 + 0x540));
            func_0x000180e1d9d0(lVar10);
            break;
          }
          goto code_r0x000180e88530;
        }
        lVar9 = lVar12 - lVar10 >> 1;
        iVar5 = func_0x000180e49360(lVar10,&UNK_18104a988,lVar9);
        if (iVar5 == 0) {
          uVar22 = 0x10000;
        }
        else {
          iVar5 = func_0x000180e49360(lVar10,&UNK_18104a9a0,lVar9);
          if (iVar5 == 0) {
            uVar22 = 0x20000;
          }
          else {
            iVar5 = func_0x000180e49360(lVar10,&UNK_18104a9c0,lVar9);
            if (iVar5 == 0) {
              uVar22 = 0x40000;
            }
            else {
              iVar5 = func_0x000180e49360(lVar10,&UNK_18104a9e0,lVar9);
              if (iVar5 == 0) {
                uVar22 = 0x50000;
              }
              else {
                iVar5 = func_0x000180e49360(lVar10,&UNK_18104a9f8,lVar9);
                if (iVar5 == 0) {
                  uVar22 = 0x60000;
                }
                else {
                  iVar5 = func_0x000180e49360(lVar10,&UNK_18104aa08,lVar9);
                  if (iVar5 == 0) {
                    uVar22 = 0x70000;
                  }
                  else {
                    iVar5 = func_0x000180e49360(lVar10,&UNK_18104aa38,lVar9);
                    if (iVar5 == 0) {
                      uVar22 = 0x80000;
                    }
                    else {
                      iVar5 = func_0x000180e49360(lVar10,&UNK_18104aa68,lVar9);
                      if (iVar5 != 0) goto code_r0x000180e884fe;
                      uVar22 = 0x90000;
                    }
                  }
                }
              }
            }
          }
        }
        puVar11 = (undefined2 *)func_0x000180eaa870(lVar12 + 2,0x5c);
        if (puVar11 == (undefined2 *)0x0) goto code_r0x000180e884fe;
        puVar26 = puVar11 + 1;
        lVar9 = func_0x000180e2b250(puVar26);
        if (lVar9 != 0x28) goto code_r0x000180e884fe;
        *puVar11 = 0;
        lVar8 = (*pcRam00000001810c2520)(lVar12 + 2);
        *puVar11 = 0x5c;
        if (lVar8 == 0) goto code_r0x000180e884fe;
code_r0x000180e8858c:
        uStack_278 = (undefined8 *)lVar8;
        lVar12 = CertOpenStore(10,0,0,uVar22 | 0x4000);
        if (lVar12 == 0) {
          puVar13 = (undefined *)FUN_180e62d40();
          uVar6 = GetLastError();
          uStack_278 = (undefined8 *)CONCAT44(uStack_278._4_4_,uVar6);
          puVar18 = &UNK_180ffa938;
          if (puVar13 != (undefined *)0x0) {
            puVar18 = puVar13;
          }
          FUN_180e64c00(lStack_240,&UNK_18104acf0,uVar22,puVar18);
          (*pcRam00000001810c2500)(lVar8);
          if (puVar13 != (undefined *)0x0) {
            func_0x000180e1d9d0(puVar13);
          }
          goto code_r0x000180e885fe;
        }
        (*pcRam00000001810c2500)(lVar8);
        puStack_190 = &uStack_178;
        auStack_198[0] = 0x14;
        uStack_268 = 0;
        uStack_270 = 0;
        uStack_278 = (undefined8 *)auStack_198;
        iVar5 = CryptStringToBinaryW(puVar26,0x28,4,&uStack_178);
        if (iVar5 == 0) {
          if (lVar10 != 0) {
            func_0x000180e1d9d0(lVar10);
          }
        }
        else {
          uStack_270 = 0;
          uStack_278 = (undefined8 *)auStack_198;
          lStack_238 = CertFindCertificateInStore(lVar12,0x10001,0,0x10000);
          if (lVar10 != 0) {
            func_0x000180e1d9d0(lVar10);
          }
          if (lStack_238 != 0) goto code_r0x000180e886ba;
        }
      }
      else {
        lStack_228 = *plVar24;
        uStack_1f8 = plVar24[1];
code_r0x000180e88530:
        lVar9 = lStack_240;
        if ((*(longlong *)(lStack_240 + 0x5c0) != 0) &&
           (iVar5 = func_0x000180e63070(*(longlong *)(lStack_240 + 0x5c0),&UNK_18104ab9c),
           iVar5 == 0)) {
          if (plVar24 == (longlong *)0x0) {
            puVar18 = *(undefined **)(lVar9 + 0x540);
          }
          else {
            puVar18 = &UNK_18104aba0;
          }
          FUN_180e64c00(lStack_240,&UNK_18104abb0,puVar18);
code_r0x000180e885fe:
          if (lVar10 != 0) {
            func_0x000180e1d9d0(lVar10);
          }
          break;
        }
        if ((lVar12 == 0) && (plVar24 == (longlong *)0x0)) goto code_r0x000180e8858c;
        uVar23 = 0;
        uVar22 = 0;
        if (plVar24 == (longlong *)0x0) {
          puVar18 = *(undefined **)(lVar9 + 0x540);
        }
        else {
          puVar18 = &UNK_18104aba0;
        }
        if (lVar10 != 0) {
          func_0x000180e1d9d0(lVar10);
        }
        if (lVar12 != 0) {
          uVar20 = 0;
          iVar5 = FUN_180e1d13c(lVar12,0,2);
          bVar27 = iVar5 == 0;
          if (iVar5 == 0) {
            uVar4 = FUN_180e32d34(lVar12);
            uVar20 = (ulonglong)uVar4;
            if (-1 < (int)uVar4) goto code_r0x000180e887c5;
            bVar27 = false;
            uVar20 = uStack_1f8;
code_r0x000180e8878f:
            lVar10 = lStack_228;
          }
          else {
code_r0x000180e887c5:
            if (iVar5 != 0) goto code_r0x000180e8878f;
            iVar5 = FUN_180e1d13c(lVar12,0,0);
            bVar27 = iVar5 == 0;
            if (iVar5 != 0) goto code_r0x000180e8878f;
            lVar10 = (*pcRam00000001810c24f8)(uVar20 + 1);
          }
          if ((lVar10 == 0) || (iVar5 = FUN_180e1cd20(lVar10,uVar20,1,lVar12), iVar5 != 1)) {
            FUN_180e1c26c(lVar12);
          }
          else {
            FUN_180e1c26c(lVar12);
            if (bVar27) {
              plVar24 = (longlong *)CONCAT44(uStack_214,CONCAT22(uStack_216,uStack_218));
              goto code_r0x000180e8882f;
            }
          }
          FUN_180e64c00(lStack_240,&UNK_18104abf0,*(undefined8 *)(lStack_240 + 0x540));
          (*pcRam00000001810c2500)(lVar10);
          break;
        }
        uVar20 = uStack_1f8;
        lVar10 = lStack_228;
code_r0x000180e8882f:
        lVar8 = lStack_240;
        auStack_188[0] = (undefined4)uVar20;
        lStack_180 = lVar10;
        if (*(longlong *)(lStack_240 + 0x5e0) != 0) {
          uVar23 = FUN_180f29c00();
        }
        puVar14 = (undefined8 *)(*pcRam00000001810c24f8)(uVar23 * 2 + 2);
        if (puVar14 != (undefined8 *)0x0) {
          if (uVar23 == 0) {
code_r0x000180e8889c:
            if ((int)uVar23 < (int)uVar22) goto code_r0x000180e888ae;
            *(undefined2 *)((longlong)puVar14 + (ulonglong)uVar22 * 2) = 0;
          }
          else {
            uStack_270 = CONCAT44(uStack_270._4_4_,(int)uVar23 + 1);
            uStack_278 = puVar14;
            uVar22 = MultiByteToWideChar(0xfde9,8,*(undefined8 *)(lVar8 + 0x5e0),uVar23 & 0xffffffff
                                        );
            if (-1 < (int)uVar22) goto code_r0x000180e8889c;
code_r0x000180e888ae:
            *(undefined2 *)puVar14 = 0;
          }
          uStack_278 = (undefined8 *)CONCAT44(uStack_278._4_4_,3);
          cVar3 = FUN_180e94290(6,0,0,2);
          if (cVar3 == '\0') {
            uVar17 = 0;
          }
          else {
            uVar17 = 0x8000;
          }
          lStack_1f0 = PFXImportCertStore(auStack_188,puVar14,uVar17);
          (*pcRam00000001810c2500)(puVar14);
        }
        if (plVar24 == (longlong *)0x0) {
          (*pcRam00000001810c2500)(lVar10);
        }
        lVar12 = lStack_1f0;
        if (lStack_1f0 == 0) {
          iVar5 = GetLastError();
          if (iVar5 == 0x56) {
            FUN_180e64c00(lVar8,&UNK_18104ac18,puVar18);
          }
          else {
            FUN_180e64c00(lVar8,&UNK_18104ac58,puVar18,iVar5);
          }
          break;
        }
        uStack_270 = 0;
        uStack_278 = (undefined8 *)0x0;
        lStack_238 = CertFindCertificateInStore(lStack_1f0,0x10001,0,0);
        if (lStack_238 != 0) {
code_r0x000180e886ba:
          lVar8 = CONCAT44(uStack_204,CONCAT22(uStack_206,uStack_208));
          param_2 = lStack_240;
          uVar4 = uStack_230;
          uVar22 = uStack_244;
          goto code_r0x000180e886cc;
        }
        uVar6 = GetLastError();
        FUN_180e64c00(lVar8,&UNK_18104aca0,puVar18,uVar6);
      }
      CertCloseStore(lVar12,0);
      break;
    }
    if (*(longlong *)(param_2 + 0x568) != 0) goto code_r0x000180e88327;
code_r0x000180e886cc:
    lVar10 = (*pcRam00000001810c2518)(1,0x30);
    plVar24 = plStack_220;
    *plStack_220 = lVar10;
    if (lVar10 != 0) {
      *(undefined4 *)(lVar10 + 0x28) = 1;
      *(longlong *)(*plStack_220 + 0x20) = lVar12;
      if (*(longlong *)(lVar8 + 0x20) == 0) {
        uStack_278 = (undefined8 *)CONCAT44(uStack_278._4_4_,3);
        cVar3 = FUN_180e94290(10,0,0x4563);
        if (cVar3 == '\0') goto code_r0x000180e88de3;
        puStack_1a8 = (undefined8 *)0x0;
        uStack_158 = 0;
        uVar4 = 0;
        uStack_120 = 0;
        aiStack_148[0] = 0;
        uStack_208 = 0;
        uStack_206 = 0;
        uStack_204 = 0;
        uStack_200 = 0;
        uStack_1fe = 0;
        uStack_1fa = 0;
        uStack_218 = 0;
        uStack_216 = 0;
        uStack_214 = 0;
        uStack_210 = 0;
        uStack_20e = 0;
        uStack_20a = 0;
        uStack_1e8 = 0;
        plStack_1e0 = (longlong *)0x0;
        plStack_1d8 = (longlong *)0x0;
        uStack_1d0 = 0;
        uStack_1c8 = 0;
        uStack_1c0 = 0;
        piStack_1b8 = (int *)0x0;
        uStack_1b0 = 0;
        uStack_178 = 0;
        uStack_170 = 0;
        uStack_168 = 0;
        piStack_160 = (int *)0x0;
        apuStack_140[0] = (undefined *)0x0;
        apuStack_140[1] = (undefined *)0x0;
        puStack_130 = (undefined2 *)0x0;
        lStack_128 = 0;
        uStack_118 = 0;
        uStack_110 = 0;
        uStack_108 = 0;
        uStack_100 = 0;
        uStack_f8 = 0;
        uStack_f0 = 0;
        uStack_e8 = 0;
        uStack_e0 = 0;
        uStack_d8 = 0;
        uStack_d0 = 0;
        uStack_c8 = 0;
        uStack_c0 = 0;
        uStack_b8 = 0;
        uStack_b0 = 0;
        uStack_a8 = 0;
        uStack_a0 = 0;
        uStack_98 = 0;
        uStack_90 = 0;
        if (*(char **)(lVar8 + 0x28) != (char *)0x0) {
          bVar2 = true;
          cStack_248 = '\x01';
          bVar27 = true;
          cStack_247 = '\x01';
          cStack_246 = '\x01';
          uStack_244 = 0;
          pcVar21 = *(char **)(lVar8 + 0x28);
          do {
            if ((*pcVar21 == '\0') || (4 < (int)uStack_244)) break;
            pcVar15 = (char *)func_0x000180e17b50(pcVar21,0x3a);
            if (pcVar15 == (char *)0x0) {
              uVar23 = FUN_180f29c00(pcVar21);
            }
            else {
              uVar23 = (longlong)pcVar15 - (longlong)pcVar21;
            }
            if (((!bVar2) || (uVar23 != 0x16)) ||
               (iVar5 = FUN_180f29eb0(&UNK_18104ad58,pcVar21,0x16), iVar5 != 0)) {
              if (((cStack_248 == '\0') || (uVar23 != 0x16)) ||
                 (iVar5 = FUN_180f29eb0(&UNK_18104ad70,pcVar21,0x16), iVar5 != 0)) {
                if (((cStack_247 == '\0') || (uVar23 != 0x1c)) ||
                   (iVar5 = FUN_180f29eb0(&UNK_18104ad88,pcVar21), iVar5 != 0)) {
                  if (((cStack_246 == '\0') || (uVar23 != 0x18)) ||
                     (iVar5 = FUN_180f29eb0(&UNK_18104ada8,pcVar21,0x18), iVar5 != 0)) {
                    if (((!bVar27) || (uVar23 != 0x16)) ||
                       (iVar5 = FUN_180f29eb0(&UNK_18104adc8,pcVar21,0x16), iVar5 != 0)) {
                      FUN_180e64c00(lStack_240,&UNK_18104ade0,uVar23 & 0xffffffff,pcVar21);
                      goto code_r0x000180e890c6;
                    }
                    bVar27 = false;
                  }
                  else {
                    cStack_246 = '\0';
                  }
                }
                else {
                  cStack_247 = '\0';
                }
              }
              else {
                cStack_248 = '\0';
              }
            }
            else {
              bVar2 = false;
            }
            if (pcVar15 != (char *)0x0) {
              pcVar15 = pcVar15 + 1;
            }
            uStack_244 = uStack_244 + 1;
            pcVar21 = pcVar15;
          } while (pcVar15 != (char *)0x0);
          puVar18 = &UNK_18104ae60;
          if (((bVar2 == false) || (cStack_248 == '\0')) || (cStack_247 == '\0')) {
            if (cStack_246 == '\0') goto code_r0x000180e88c81;
code_r0x000180e88c86:
            uStack_208 = 0x20;
            uStack_206 = 0x20;
            uStack_200 = 0xae40;
            uStack_1fe = 0x18104;
            uStack_1fa = 0;
            lStack_128 = (longlong)&uStack_208;
            aiStack_148[0] = 2;
            puStack_130 = (undefined2 *)CONCAT44(puStack_130._4_4_,1);
            apuStack_140[0] = (undefined *)CONCAT44(apuStack_140[0]._4_4_,0x80008);
            apuStack_140[1] = &UNK_18104ae60;
            if ((bool)cStack_246 != bVar27) {
              if (cStack_246 == '\0') {
                uStack_120 = CONCAT44(0x40,(undefined4)uStack_120);
              }
              else {
                uStack_120 = CONCAT44(uStack_120._4_4_,0x80);
              }
            }
            uVar4 = 1;
          }
          else {
            if (cStack_246 != '\0') {
              if (bVar27 != false) {
                FUN_180e64c00(lStack_240,&UNK_18104ae08);
                break;
              }
              goto code_r0x000180e88c86;
            }
code_r0x000180e88c81:
            if (bVar27 != false) goto code_r0x000180e88c86;
          }
          if ((bVar2 != false) || (cStack_248 != '\0')) {
            uStack_218 = 0x20;
            uStack_216 = 0x20;
            uStack_210 = 0xae68;
            uStack_20e = 0x18104;
            uStack_20a = 0;
            uVar23 = (ulonglong)uVar4;
            if ((bVar2 != (bool)cStack_248) && (puVar18 = &UNK_18104ae98, bVar2 != false)) {
              puVar18 = &UNK_18104ae88;
            }
            aiStack_148[uVar23 * 0xc] = (bVar2 != (bool)cStack_248) + 2;
            uVar4 = uVar4 + 1;
            *(undefined4 *)(apuStack_140 + uVar23 * 6) = 0x80008;
            apuStack_140[uVar23 * 6 + 1] = puVar18;
            (&lStack_128)[uVar23 * 6] = (longlong)&uStack_218;
            *(undefined4 *)(&puStack_130 + uVar23 * 6) = 1;
          }
          if (cStack_247 != '\0') {
            uVar23 = (ulonglong)uVar4;
            uVar4 = uVar4 + 1;
            aiStack_148[uVar23 * 0xc] = 2;
            *(undefined4 *)(apuStack_140 + uVar23 * 6) = 0x240024;
            apuStack_140[uVar23 * 6 + 1] = &UNK_18104aea8;
          }
          plVar24 = plStack_220;
        }
        piStack_160 = aiStack_148;
        puStack_1a8 = &uStack_178;
        uStack_1b0 = CONCAT44(uStack_1b0._4_4_,1);
        uStack_1e8 = CONCAT44(uStack_1e8._4_4_,5);
        piStack_1b8 = (int *)(CONCAT44(uStack_230,piStack_1b8._0_4_) | 0x40000000000000);
        uStack_168 = CONCAT44(uVar4,~uVar22);
        if (lStack_238 != 0) {
          plStack_1d8 = &lStack_238;
          plStack_1e0 = (longlong *)CONCAT44(plStack_1e0._4_4_,1);
        }
        pcVar25 = *(code **)(lRam00000001810d5350 + 0x18);
      }
      else {
code_r0x000180e88de3:
        pcVar21 = *(char **)(lVar8 + 0x20);
        plStack_1e0 = (longlong *)0x0;
        uStack_1e8 = 4;
        piStack_1b8 = (int *)0x0;
        uStack_1b0 = (ulonglong)uVar22;
        puStack_1a8 = (undefined8 *)0x0;
        uStack_1a0 = (ulonglong)uVar4;
        plStack_1d8 = (longlong *)0x0;
        uStack_1d0 = 0;
        uStack_1c8 = 0;
        uStack_1c0 = 0;
        if (pcVar21 == (char *)0x0) {
          uStack_1a0 = (ulonglong)(uVar4 | 0x400000);
        }
        else {
          if ((uVar22 >> 0xd & 1) != 0) {
            FUN_180e64ce0(param_2,&UNK_18104af30);
          }
          if (*(longlong *)(lVar8 + 0x28) != 0) {
            FUN_180e64c00(param_2,&UNK_18104afc0);
            break;
          }
          iVar5 = 0;
          lVar10 = 0;
          if (*pcVar21 != '\0') {
            while (lVar8 = 0, lVar10 < 0x2f) {
              iVar7 = FUN_180e29d88(pcVar21,0,0);
              if (iVar7 == 0) {
                lVar12 = func_0x000180e17b50(pcVar21,0x3a);
                if (lVar12 == 0) {
                  lVar12 = FUN_180f29c00(pcVar21);
                  lVar9 = _UNK_18104a1f0;
                }
                else {
                  lVar12 = lVar12 - (longlong)pcVar21;
                  lVar9 = _UNK_18104a1f0;
                }
                while (lVar9 != 0) {
                  lVar16 = FUN_180f29c00(lVar9);
                  if ((lVar12 == lVar16) && (iVar7 = FUN_180f29eb0(lVar9,pcVar21), iVar7 == 0)) {
                    iVar7 = *(int *)(&UNK_18104a1f8 + lVar8 * 0x10);
                    if (iVar7 != 0) goto code_r0x000180e88f41;
                    break;
                  }
                  lVar8 = lVar8 + 1;
                  lVar9 = *(longlong *)(&UNK_18104a1f0 + lVar8 * 0x10);
                }
                iVar7 = FUN_180f29eb0(pcVar21,&UNK_18104a958);
                if ((iVar7 != 0) && (iVar7 = FUN_180f29eb0(pcVar21,&UNK_18104a970), iVar7 != 0)) {
                  FUN_180e64c00(param_2,&UNK_18104b040);
                  goto code_r0x000180e890c6;
                }
                uStack_1a0 = uStack_1a0 | 0x400000;
              }
              else {
code_r0x000180e88f41:
                iVar5 = iVar5 + 1;
                aiStack_148[lVar10] = iVar7;
                lVar10 = lVar10 + 1;
              }
              lVar8 = func_0x000180e17b50(pcVar21);
              pcVar21 = (char *)(lVar8 + 1);
              if (lVar8 == 0) {
                pcVar21 = (char *)0x0;
              }
              if ((pcVar21 == (char *)0x0) || (*pcVar21 == '\0')) break;
            }
          }
          piStack_1b8 = aiStack_148;
          uStack_1c0 = CONCAT44(uStack_1c0._4_4_,iVar5);
        }
        if (lStack_238 != 0) {
          plStack_1e0 = &lStack_238;
          uStack_1e8 = CONCAT44(1,(undefined4)uStack_1e8);
        }
        pcVar25 = *(code **)(lRam00000001810d5350 + 0x18);
        plVar24 = plStack_220;
      }
      uStack_278 = &uStack_1e8;
      lStack_260 = *plVar24;
      lStack_258 = lStack_260 + 0x10;
      uStack_268 = 0;
      uStack_270 = 0;
      iVar5 = (*pcVar25)(0,&UNK_18104aed0,2,0);
      if (lStack_238 != 0) {
        CertFreeCertificateContext();
      }
      if (iVar5 == 0) break;
      uVar17 = FUN_180e90290(iVar5,aiStack_148,0x100);
      FUN_180e64c00(lStack_240,&UNK_18104b070,uVar17);
      (*pcRam00000001810c2500)(*plVar24);
      *plVar24 = 0;
      switch(iVar5) {
      case -0x7ff6fd00:
        goto code_r0x000180e8871c;
      default:
        goto code_r0x000180e890c1;
      }
    }
    FUN_180e64c00(param_2,&UNK_18104ad30);
    if (lStack_238 != 0) {
      CertFreeCertificateContext();
    }
    if (lVar12 != 0) {
      CertCloseStore(lVar12,0);
    }
code_r0x000180e8871c:
    break;
  case 2:
  case 3:
    FUN_180e64c00(param_2,&UNK_18104ab08);
    break;
  default:
    puVar18 = &UNK_18104ab28;
code_r0x000180e890b9:
    FUN_180e64c00(param_2,puVar18);
code_r0x000180e890c1:
  }
code_r0x000180e890c6:
  FUN_180e155e0(uStack_48 ^ (ulonglong)auStack_298);
  return;
}

