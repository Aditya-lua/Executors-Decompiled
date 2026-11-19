/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00963d98
 */

void FUN_00963d98(long param_1,undefined8 param_2,char *param_3,char *param_4,undefined8 param_5,
                 undefined8 param_6)

{
  long lVar1;
  bool bVar2;
  ulong uVar3;
  int iVar4;
  undefined4 uVar5;
  char *pcVar6;
  long lVar7;
  char *pcVar8;
  undefined8 uVar9;
  size_t sVar10;
  char cVar11;
  char *pcVar12;
  ulong uVar13;
  undefined4 local_278;
  undefined1 local_274;
  undefined5 uStack_270;
  undefined3 local_26b;
  undefined5 uStack_268;
  char local_260 [12];
  char acStack_254 [36];
  char local_230 [64];
  char local_1f0 [64];
  char local_1b0 [128];
  char local_130 [64];
  undefined1 auStack_f0 [4];
  undefined1 auStack_ec [2];
  undefined1 auStack_ea [2];
  undefined1 auStack_e8 [2];
  undefined1 auStack_e6 [2];
  undefined1 auStack_e4 [2];
  undefined1 auStack_e2 [2];
  undefined1 auStack_e0 [2];
  undefined1 auStack_de [2];
  undefined1 auStack_dc [2];
  undefined1 auStack_da [2];
  undefined1 auStack_d8 [2];
  undefined1 auStack_d6 [2];
  undefined1 auStack_d4 [2];
  undefined1 auStack_d2 [6];
  undefined1 auStack_cc [4];
  undefined1 auStack_c8 [2];
  undefined1 auStack_c6 [2];
  undefined1 auStack_c4 [2];
  undefined1 auStack_c2 [2];
  undefined1 auStack_c0 [2];
  undefined1 auStack_be [2];
  undefined1 auStack_bc [2];
  undefined1 auStack_ba [2];
  undefined1 auStack_b8 [2];
  undefined1 auStack_b6 [2];
  undefined1 auStack_b4 [2];
  undefined1 auStack_b2 [2];
  undefined1 auStack_b0 [2];
  undefined1 auStack_ae [6];
  undefined8 local_a8;
  undefined1 auStack_a0 [2];
  undefined1 auStack_9e [2];
  undefined1 auStack_9c [2];
  undefined1 auStack_9a [2];
  undefined1 auStack_98 [2];
  undefined1 auStack_96 [2];
  undefined1 auStack_94 [2];
  undefined1 auStack_92 [2];
  undefined1 auStack_90 [2];
  undefined1 auStack_8e [2];
  undefined1 auStack_8c [2];
  undefined1 auStack_8a [10];
  undefined1 local_80;
  undefined1 local_7f;
  undefined1 local_7e;
  undefined1 local_7d;
  undefined1 local_7c;
  undefined1 local_7b;
  undefined1 local_7a;
  undefined1 local_79;
  undefined1 local_78;
  undefined1 local_77;
  undefined1 local_76;
  undefined1 local_75;
  undefined1 local_74;
  undefined1 local_73;
  undefined1 local_72;
  undefined1 local_71;
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  builtin_strncpy(local_260,"00000001",9);
  uStack_268 = 0x45544143;
  uStack_270 = 0x4548545541;
  local_26b = 0x49544e;
  local_274 = 0;
  local_278 = 0x68747561;
  pcVar6 = (char *)FUN_009252a8(param_2);
  lVar7 = FUN_009252b0(param_2);
  if ((lVar7 != 0) && (pcVar8 = strstr(pcVar6,"nonce=\""), pcVar8 != (char *)0x0)) {
    cVar11 = pcVar8[7];
    pcVar12 = local_130;
    if ((cVar11 != '\0') && (cVar11 != '\"')) {
      uVar3 = 0;
      do {
        uVar13 = uVar3;
        local_130[uVar13] = cVar11;
        if ((0x3e < uVar13 + 1) || (cVar11 = pcVar8[uVar13 + 8], cVar11 == '\"')) break;
        uVar3 = uVar13 + 1;
      } while (cVar11 != '\0');
      pcVar12 = local_130 + uVar13 + 1;
    }
    *pcVar12 = '\0';
    pcVar8 = strstr(pcVar6,"realm=\"");
    if (pcVar8 == (char *)0x0) {
      local_1b0[0] = '\0';
    }
    else {
      cVar11 = pcVar8[7];
      pcVar12 = local_1b0;
      if ((cVar11 != '\0') && (cVar11 != '\"')) {
        uVar3 = 0;
        do {
          uVar13 = uVar3;
          local_1b0[uVar13] = cVar11;
          if ((0x7e < uVar13 + 1) || (cVar11 = pcVar8[uVar13 + 8], cVar11 == '\"')) break;
          uVar3 = uVar13 + 1;
        } while (cVar11 != '\0');
        pcVar12 = local_1b0 + uVar13 + 1;
      }
      *pcVar12 = '\0';
    }
    pcVar8 = strstr(pcVar6,"algorithm=");
    if (pcVar8 != (char *)0x0) {
      cVar11 = pcVar8[10];
      pcVar12 = local_1f0;
      if ((cVar11 != '\0') && (cVar11 != ',')) {
        uVar3 = 0;
        do {
          uVar13 = uVar3;
          local_1f0[uVar13] = cVar11;
          if ((0x3e < uVar13 + 1) || (cVar11 = pcVar8[uVar13 + 0xb], cVar11 == ',')) break;
          uVar3 = uVar13 + 1;
        } while (cVar11 != '\0');
        pcVar12 = local_1f0 + uVar13 + 1;
      }
      *pcVar12 = '\0';
      pcVar6 = strstr(pcVar6,"qop=\"");
      if (pcVar6 != (char *)0x0) {
        cVar11 = pcVar6[5];
        pcVar8 = local_230;
        if ((cVar11 != '\0') && (cVar11 != '\"')) {
          uVar3 = 0;
          do {
            uVar13 = uVar3;
            local_230[uVar13] = cVar11;
            if ((0x3e < uVar13 + 1) || (cVar11 = pcVar6[uVar13 + 6], cVar11 == '\"')) break;
            uVar3 = uVar13 + 1;
          } while (cVar11 != '\0');
          pcVar8 = local_230 + uVar13 + 1;
        }
        *pcVar8 = '\0';
        iVar4 = strcmp(local_1f0,"md5-sess");
        if (iVar4 == 0) {
          local_a8 = (char *)0x0;
          pcVar6 = (char *)(*(code *)PTR_strdup_00cc4688)(local_230);
          if (pcVar6 == (char *)0x0) goto LAB_00964828;
          pcVar8 = strtok_r(pcVar6,",",(char **)&local_a8);
          bVar2 = false;
          while (pcVar8 != (char *)0x0) {
            iVar4 = curl_strequal(pcVar8,&DAT_002d1218);
            if (iVar4 == 0) {
              iVar4 = curl_strequal(pcVar8,"auth-int");
              if (iVar4 == 0) {
                curl_strequal(pcVar8,"auth-conf");
              }
            }
            else {
              bVar2 = true;
            }
            pcVar8 = strtok_r((char *)0x0,",",(char **)&local_a8);
          }
          (*(code *)PTR_free_00cc4678)(pcVar6);
          if (bVar2) {
            uVar9 = FUN_00932534(param_1,acStack_254,0x21);
            if ((int)uVar9 != 0) goto LAB_00963ff0;
            lVar7 = FUN_00944f28(&PTR_LAB_00c50308);
            if (lVar7 != 0) {
              strlen(param_3);
              uVar5 = FUN_00963a64();
              FUN_00944fc4(lVar7,param_3,uVar5);
              FUN_00944fc4(lVar7,&DAT_002bcda4,1);
              strlen(local_1b0);
              uVar5 = FUN_00963a64();
              FUN_00944fc4(lVar7,local_1b0,uVar5);
              FUN_00944fc4(lVar7,&DAT_002bcda4,1);
              strlen(param_4);
              uVar5 = FUN_00963a64();
              FUN_00944fc4(lVar7,param_4,uVar5);
              FUN_00944fe4(lVar7,&local_80);
              lVar7 = FUN_00944f28(&PTR_LAB_00c50308);
              if (lVar7 != 0) {
                FUN_00944fc4(lVar7,&local_80,0x10);
                FUN_00944fc4(lVar7,&DAT_002bcda4,1);
                strlen(local_130);
                uVar5 = FUN_00963a64();
                FUN_00944fc4(lVar7,local_130,uVar5);
                FUN_00944fc4(lVar7,&DAT_002bcda4,1);
                strlen(acStack_254);
                uVar5 = FUN_00963a64();
                FUN_00944fc4(lVar7,acStack_254,uVar5);
                FUN_00944fe4(lVar7,&local_80);
                curl_msnprintf(&local_a8,3,&DAT_002d74c4,local_80);
                curl_msnprintf((ulong)&local_a8 | 2,3,&DAT_002d74c4,local_7f);
                curl_msnprintf((long)&local_a8 + 4,3,&DAT_002d74c4,local_7e);
                curl_msnprintf((long)&local_a8 + 6,3,&DAT_002d74c4,local_7d);
                curl_msnprintf(auStack_a0,3,&DAT_002d74c4,local_7c);
                curl_msnprintf(auStack_9e,3,&DAT_002d74c4,local_7b);
                curl_msnprintf(auStack_9c,3,&DAT_002d74c4,local_7a);
                curl_msnprintf(auStack_9a,3,&DAT_002d74c4,local_79);
                curl_msnprintf(auStack_98,3,&DAT_002d74c4,local_78);
                curl_msnprintf(auStack_96,3,&DAT_002d74c4,local_77);
                curl_msnprintf(auStack_94,3,&DAT_002d74c4,local_76);
                curl_msnprintf(auStack_92,3,&DAT_002d74c4,local_75);
                curl_msnprintf(auStack_90,3,&DAT_002d74c4,local_74);
                curl_msnprintf(auStack_8e,3,&DAT_002d74c4,local_73);
                curl_msnprintf(auStack_8c,3,&DAT_002d74c4,local_72);
                curl_msnprintf(auStack_8a,3,&DAT_002d74c4,local_71);
                pcVar6 = (char *)FUN_00967910(param_5,*(undefined8 *)
                                                       (*(long *)(param_1 + 0x20) + 0x50),0);
                if (pcVar6 != (char *)0x0) {
                  lVar7 = FUN_00944f28(&PTR_LAB_00c50308);
                  if (lVar7 != 0) {
                    strlen((char *)&uStack_270);
                    uVar5 = FUN_00963a64();
                    FUN_00944fc4(lVar7,&uStack_270,uVar5);
                    FUN_00944fc4(lVar7,&DAT_002bcda4,1);
                    strlen(pcVar6);
                    uVar5 = FUN_00963a64();
                    FUN_00944fc4(lVar7,pcVar6,uVar5);
                    FUN_00944fe4(lVar7,&local_80);
                    curl_msnprintf(auStack_cc,3,&DAT_002d74c4,local_80);
                    curl_msnprintf((ulong)auStack_cc | 2,3,&DAT_002d74c4,local_7f);
                    curl_msnprintf(auStack_c8,3,&DAT_002d74c4,local_7e);
                    curl_msnprintf(auStack_c6,3,&DAT_002d74c4,local_7d);
                    curl_msnprintf(auStack_c4,3,&DAT_002d74c4,local_7c);
                    curl_msnprintf(auStack_c2,3,&DAT_002d74c4,local_7b);
                    curl_msnprintf(auStack_c0,3,&DAT_002d74c4,local_7a);
                    curl_msnprintf(auStack_be,3,&DAT_002d74c4,local_79);
                    curl_msnprintf(auStack_bc,3,&DAT_002d74c4,local_78);
                    curl_msnprintf(auStack_ba,3,&DAT_002d74c4,local_77);
                    curl_msnprintf(auStack_b8,3,&DAT_002d74c4,local_76);
                    curl_msnprintf(auStack_b6,3,&DAT_002d74c4,local_75);
                    curl_msnprintf(auStack_b4,3,&DAT_002d74c4,local_74);
                    curl_msnprintf(auStack_b2,3,&DAT_002d74c4,local_73);
                    curl_msnprintf(auStack_b0,3,&DAT_002d74c4,local_72);
                    curl_msnprintf(auStack_ae,3,&DAT_002d74c4,local_71);
                    lVar7 = FUN_00944f28(&PTR_LAB_00c50308);
                    if (lVar7 != 0) {
                      FUN_00944fc4(lVar7,&local_a8,0x20);
                      FUN_00944fc4(lVar7,&DAT_002bcda4,1);
                      strlen(local_130);
                      uVar5 = FUN_00963a64();
                      FUN_00944fc4(lVar7,local_130,uVar5);
                      FUN_00944fc4(lVar7,&DAT_002bcda4,1);
                      strlen(local_260);
                      uVar5 = FUN_00963a64();
                      FUN_00944fc4(lVar7,local_260,uVar5);
                      FUN_00944fc4(lVar7,&DAT_002bcda4,1);
                      strlen(acStack_254);
                      uVar5 = FUN_00963a64();
                      FUN_00944fc4(lVar7,acStack_254,uVar5);
                      FUN_00944fc4(lVar7,&DAT_002bcda4,1);
                      strlen((char *)&local_278);
                      uVar5 = FUN_00963a64();
                      FUN_00944fc4(lVar7,&local_278,uVar5);
                      FUN_00944fc4(lVar7,&DAT_002bcda4,1);
                      FUN_00944fc4(lVar7,auStack_cc,0x20);
                      FUN_00944fe4(lVar7,&local_80);
                      curl_msnprintf(auStack_f0,3,&DAT_002d74c4,local_80);
                      curl_msnprintf((ulong)auStack_f0 | 2,3,&DAT_002d74c4,local_7f);
                      curl_msnprintf(auStack_ec,3,&DAT_002d74c4,local_7e);
                      curl_msnprintf(auStack_ea,3,&DAT_002d74c4,local_7d);
                      curl_msnprintf(auStack_e8,3,&DAT_002d74c4,local_7c);
                      curl_msnprintf(auStack_e6,3,&DAT_002d74c4,local_7b);
                      curl_msnprintf(auStack_e4,3,&DAT_002d74c4,local_7a);
                      curl_msnprintf(auStack_e2,3,&DAT_002d74c4,local_79);
                      curl_msnprintf(auStack_e0,3,&DAT_002d74c4,local_78);
                      curl_msnprintf(auStack_de,3,&DAT_002d74c4,local_77);
                      curl_msnprintf(auStack_dc,3,&DAT_002d74c4,local_76);
                      curl_msnprintf(auStack_da,3,&DAT_002d74c4,local_75);
                      curl_msnprintf(auStack_d8,3,&DAT_002d74c4,local_74);
                      curl_msnprintf(auStack_d6,3,&DAT_002d74c4,local_73);
                      curl_msnprintf(auStack_d4,3,&DAT_002d74c4,local_72);
                      curl_msnprintf(auStack_d2,3,&DAT_002d74c4,local_71);
                      pcVar8 = (char *)curl_maprintf(
                                                  "username=\"%s\",realm=\"%s\",nonce=\"%s\",cnonce=\"%s\",nc=\"%s\",digest-uri=\"%s\",response=%s,qop=%s"
                                                  ,param_3,local_1b0,local_130,acStack_254,local_260
                                                  ,pcVar6,auStack_f0,&local_278);
                      (*(code *)PTR_free_00cc4678)(pcVar6);
                      if (pcVar8 != (char *)0x0) {
                        sVar10 = strlen(pcVar8);
                        FUN_0092525c(param_6,pcVar8,sVar10,curl_free);
                        uVar9 = 0;
                        goto LAB_00963ff0;
                      }
                      goto LAB_00964828;
                    }
                  }
                  (*(code *)PTR_free_00cc4678)(pcVar6);
                }
              }
            }
LAB_00964828:
            uVar9 = 0x1b;
            goto LAB_00963ff0;
          }
        }
      }
    }
  }
  uVar9 = 0x3d;
LAB_00963ff0:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar9);
  }
  return;
}

