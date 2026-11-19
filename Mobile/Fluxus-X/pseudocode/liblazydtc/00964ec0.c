/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00964ec0
 */

int FUN_00964ec0(undefined8 param_1,char *param_2,undefined8 param_3,undefined8 param_4,
                undefined8 param_5,undefined8 *param_6,undefined8 *param_7,size_t *param_8)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  char *pcVar4;
  size_t sVar5;
  char *pcVar6;
  long lVar7;
  char *pcVar8;
  char *pcVar9;
  char *pcVar10;
  char cVar11;
  undefined1 *puVar12;
  char *pcVar13;
  undefined8 local_1f8;
  undefined8 local_1f0;
  char acStack_1e4 [4];
  undefined1 auStack_1e0 [2];
  undefined1 auStack_1de [2];
  undefined1 auStack_1dc [2];
  undefined1 auStack_1da [2];
  undefined1 auStack_1d8 [2];
  undefined1 auStack_1d6 [2];
  undefined1 auStack_1d4 [2];
  undefined1 auStack_1d2 [2];
  undefined1 auStack_1d0 [2];
  undefined1 auStack_1ce [2];
  undefined1 auStack_1cc [2];
  undefined1 auStack_1ca [2];
  undefined1 auStack_1c8 [2];
  undefined1 auStack_1c6 [38];
  char local_1a0 [4];
  undefined1 auStack_19c [2];
  undefined1 auStack_19a [2];
  undefined1 auStack_198 [2];
  undefined1 auStack_196 [2];
  undefined1 auStack_194 [2];
  undefined1 auStack_192 [2];
  undefined1 auStack_190 [2];
  undefined1 auStack_18e [2];
  undefined1 auStack_18c [2];
  undefined1 auStack_18a [2];
  undefined1 auStack_188 [2];
  undefined1 auStack_186 [2];
  undefined1 auStack_184 [2];
  undefined1 auStack_182 [38];
  undefined1 auStack_15c [4];
  undefined1 auStack_158 [2];
  undefined1 auStack_156 [2];
  undefined1 auStack_154 [2];
  undefined1 auStack_152 [2];
  undefined1 auStack_150 [2];
  undefined1 auStack_14e [2];
  undefined1 auStack_14c [2];
  undefined1 auStack_14a [2];
  undefined1 auStack_148 [2];
  undefined1 auStack_146 [2];
  undefined1 auStack_144 [2];
  undefined1 auStack_142 [2];
  undefined1 auStack_140 [2];
  undefined1 auStack_13e [38];
  undefined1 auStack_118 [4];
  undefined1 auStack_114 [2];
  undefined1 auStack_112 [2];
  undefined1 auStack_110 [2];
  undefined1 auStack_10e [2];
  undefined1 auStack_10c [2];
  undefined1 auStack_10a [2];
  undefined1 auStack_108 [2];
  undefined1 auStack_106 [2];
  undefined1 auStack_104 [2];
  undefined1 auStack_102 [2];
  undefined1 auStack_100 [2];
  undefined1 auStack_fe [2];
  undefined1 auStack_fc [2];
  undefined1 auStack_fa [38];
  undefined1 auStack_d4 [4];
  undefined1 auStack_d0 [2];
  undefined1 auStack_ce [2];
  undefined1 auStack_cc [2];
  undefined1 auStack_ca [2];
  undefined1 auStack_c8 [2];
  undefined1 auStack_c6 [2];
  undefined1 auStack_c4 [2];
  undefined1 auStack_c2 [2];
  undefined1 auStack_c0 [2];
  undefined1 auStack_be [2];
  undefined1 auStack_bc [2];
  undefined1 auStack_ba [2];
  undefined1 auStack_b8 [2];
  undefined1 auStack_b6 [38];
  undefined8 local_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  bVar1 = *(byte *)((long)param_6 + 0x34);
  if (bVar1 < 2) {
    local_1f8 = 0;
    local_1f0 = 0;
    local_80 = 0;
    uStack_78 = 0;
    local_90 = 0;
    local_88 = 0;
    if (*(int *)(param_6 + 6) == 0) {
      *(undefined4 *)(param_6 + 6) = 1;
    }
    if (param_6[1] == 0) {
      iVar3 = FUN_00932534(param_1,acStack_1e4,0x21);
      if (iVar3 != 0) goto LAB_00966dd8;
      sVar5 = strlen(acStack_1e4);
      iVar3 = FUN_0091e888(acStack_1e4,sVar5,&local_1f0,&local_1f8);
      if (iVar3 != 0) goto LAB_00966dd8;
      param_6[1] = local_1f0;
      bVar1 = *(byte *)((long)param_6 + 0x35);
    }
    else {
      bVar1 = *(byte *)((long)param_6 + 0x35);
    }
    if ((bVar1 >> 1 & 1) != 0) {
      puVar12 = &DAT_002ab32c;
      if ((undefined1 *)param_6[2] != (undefined1 *)0x0) {
        puVar12 = (undefined1 *)param_6[2];
      }
      pcVar4 = (char *)curl_maprintf("%s:%s",param_2,puVar12);
      if (pcVar4 == (char *)0x0) goto LAB_009666bc;
      sVar5 = strlen(pcVar4);
      iVar3 = FUN_00944e8c(&local_90,pcVar4,sVar5);
      (*(code *)PTR_free_00cc4678)(pcVar4);
      if (iVar3 != 0) goto LAB_00966dd8;
      curl_msnprintf(local_1a0,3,&DAT_002d74c4,local_90 & 0xff);
      curl_msnprintf((ulong)local_1a0 | 2,3,&DAT_002d74c4,local_90._1_1_);
      curl_msnprintf(auStack_19c,3,&DAT_002d74c4,local_90._2_1_);
      curl_msnprintf(auStack_19a,3,&DAT_002d74c4,local_90._3_1_);
      curl_msnprintf(auStack_198,3,&DAT_002d74c4,local_90._4_1_);
      curl_msnprintf(auStack_196,3,&DAT_002d74c4,local_90._5_1_);
      curl_msnprintf(auStack_194,3,&DAT_002d74c4,local_90._6_1_);
      curl_msnprintf(auStack_192,3,&DAT_002d74c4,local_90._7_1_);
      curl_msnprintf(auStack_190,3,&DAT_002d74c4,local_88 & 0xff);
      curl_msnprintf(auStack_18e,3,&DAT_002d74c4,local_88._1_1_);
      curl_msnprintf(auStack_18c,3,&DAT_002d74c4,local_88._2_1_);
      curl_msnprintf(auStack_18a,3,&DAT_002d74c4,local_88._3_1_);
      curl_msnprintf(auStack_188,3,&DAT_002d74c4,local_88._4_1_);
      curl_msnprintf(auStack_186,3,&DAT_002d74c4,local_88._5_1_);
      curl_msnprintf(auStack_184,3,&DAT_002d74c4,local_88._6_1_);
      curl_msnprintf(auStack_182,3,&DAT_002d74c4,local_88._7_1_);
    }
    puVar12 = &DAT_002ab32c;
    if ((undefined1 *)param_6[2] != (undefined1 *)0x0) {
      puVar12 = (undefined1 *)param_6[2];
    }
    pcVar4 = (char *)curl_maprintf("%s:%s:%s",param_2,puVar12,param_3);
    if (pcVar4 != (char *)0x0) {
      sVar5 = strlen(pcVar4);
      iVar3 = FUN_00944e8c(&local_90,pcVar4,sVar5);
      (*(code *)PTR_free_00cc4678)(pcVar4);
      if (iVar3 != 0) goto LAB_00966dd8;
      curl_msnprintf(auStack_118,3,&DAT_002d74c4,local_90 & 0xff);
      curl_msnprintf((ulong)auStack_118 | 2,3,&DAT_002d74c4,local_90._1_1_);
      curl_msnprintf(auStack_114,3,&DAT_002d74c4,local_90._2_1_);
      curl_msnprintf(auStack_112,3,&DAT_002d74c4,local_90._3_1_);
      curl_msnprintf(auStack_110,3,&DAT_002d74c4,local_90._4_1_);
      curl_msnprintf(auStack_10e,3,&DAT_002d74c4,local_90._5_1_);
      curl_msnprintf(auStack_10c,3,&DAT_002d74c4,local_90._6_1_);
      curl_msnprintf(auStack_10a,3,&DAT_002d74c4,local_90._7_1_);
      curl_msnprintf(auStack_108,3,&DAT_002d74c4,local_88 & 0xff);
      curl_msnprintf(auStack_106,3,&DAT_002d74c4,local_88._1_1_);
      curl_msnprintf(auStack_104,3,&DAT_002d74c4,local_88._2_1_);
      curl_msnprintf(auStack_102,3,&DAT_002d74c4,local_88._3_1_);
      curl_msnprintf(auStack_100,3,&DAT_002d74c4,local_88._4_1_);
      curl_msnprintf(auStack_fe,3,&DAT_002d74c4,local_88._5_1_);
      curl_msnprintf(auStack_fc,3,&DAT_002d74c4,local_88._6_1_);
      curl_msnprintf(auStack_fa,3,&DAT_002d74c4,local_88._7_1_);
      if ((*(byte *)((long)param_6 + 0x34) & 1) != 0) {
        pcVar4 = (char *)curl_maprintf("%s:%s:%s",auStack_118,*param_6,param_6[1]);
        if (pcVar4 == (char *)0x0) goto LAB_009666bc;
        sVar5 = strlen(pcVar4);
        iVar3 = FUN_00944e8c(&local_90,pcVar4,sVar5);
        (*(code *)PTR_free_00cc4678)(pcVar4);
        if (iVar3 != 0) goto LAB_00966dd8;
        curl_msnprintf(auStack_118,3,&DAT_002d74c4,local_90 & 0xff);
        curl_msnprintf((ulong)auStack_118 | 2,3,&DAT_002d74c4,local_90._1_1_);
        curl_msnprintf(auStack_114,3,&DAT_002d74c4,local_90._2_1_);
        curl_msnprintf(auStack_112,3,&DAT_002d74c4,local_90._3_1_);
        curl_msnprintf(auStack_110,3,&DAT_002d74c4,local_90._4_1_);
        curl_msnprintf(auStack_10e,3,&DAT_002d74c4,local_90._5_1_);
        curl_msnprintf(auStack_10c,3,&DAT_002d74c4,local_90._6_1_);
        curl_msnprintf(auStack_10a,3,&DAT_002d74c4,local_90._7_1_);
        curl_msnprintf(auStack_108,3,&DAT_002d74c4,local_88 & 0xff);
        curl_msnprintf(auStack_106,3,&DAT_002d74c4,local_88._1_1_);
        curl_msnprintf(auStack_104,3,&DAT_002d74c4,local_88._2_1_);
        curl_msnprintf(auStack_102,3,&DAT_002d74c4,local_88._3_1_);
        curl_msnprintf(auStack_100,3,&DAT_002d74c4,local_88._4_1_);
        curl_msnprintf(auStack_fe,3,&DAT_002d74c4,local_88._5_1_);
        curl_msnprintf(auStack_fc,3,&DAT_002d74c4,local_88._6_1_);
        curl_msnprintf(auStack_fa,3,&DAT_002d74c4,local_88._7_1_);
      }
      pcVar4 = (char *)curl_maprintf("%s:%s",param_4,param_5);
      if (pcVar4 != (char *)0x0) {
        if (param_6[4] != 0) {
          iVar3 = curl_strequal(param_6[4],"auth-int");
          if (iVar3 != 0) {
            iVar3 = FUN_00944e8c(&local_90,&DAT_002ab32c,0);
            if (iVar3 != 0) {
              (*(code *)PTR_free_00cc4678)(pcVar4);
              goto LAB_00966dd8;
            }
            curl_msnprintf(acStack_1e4,3,&DAT_002d74c4,local_90 & 0xff);
            curl_msnprintf((ulong)acStack_1e4 | 2,3,&DAT_002d74c4,local_90._1_1_);
            curl_msnprintf(auStack_1e0,3,&DAT_002d74c4,local_90._2_1_);
            curl_msnprintf(auStack_1de,3,&DAT_002d74c4,local_90._3_1_);
            curl_msnprintf(auStack_1dc,3,&DAT_002d74c4,local_90._4_1_);
            curl_msnprintf(auStack_1da,3,&DAT_002d74c4,local_90._5_1_);
            curl_msnprintf(auStack_1d8,3,&DAT_002d74c4,local_90._6_1_);
            curl_msnprintf(auStack_1d6,3,&DAT_002d74c4,local_90._7_1_);
            curl_msnprintf(auStack_1d4,3,&DAT_002d74c4,local_88 & 0xff);
            curl_msnprintf(auStack_1d2,3,&DAT_002d74c4,local_88._1_1_);
            curl_msnprintf(auStack_1d0,3,&DAT_002d74c4,local_88._2_1_);
            curl_msnprintf(auStack_1ce,3,&DAT_002d74c4,local_88._3_1_);
            curl_msnprintf(auStack_1cc,3,&DAT_002d74c4,local_88._4_1_);
            curl_msnprintf(auStack_1ca,3,&DAT_002d74c4,local_88._5_1_);
            curl_msnprintf(auStack_1c8,3,&DAT_002d74c4,local_88._6_1_);
            curl_msnprintf(auStack_1c6,3,&DAT_002d74c4,local_88._7_1_);
            pcVar6 = (char *)curl_maprintf("%s:%s",pcVar4,acStack_1e4);
            (*(code *)PTR_free_00cc4678)(pcVar4);
            pcVar4 = pcVar6;
            if (pcVar6 == (char *)0x0) goto LAB_009666bc;
          }
        }
        sVar5 = strlen(pcVar4);
        iVar3 = FUN_00944e8c(&local_90,pcVar4,sVar5);
        (*(code *)PTR_free_00cc4678)(pcVar4);
        if (iVar3 != 0) goto LAB_00966dd8;
        curl_msnprintf(auStack_15c,3,&DAT_002d74c4,local_90 & 0xff);
        curl_msnprintf((ulong)auStack_15c | 2,3,&DAT_002d74c4,local_90._1_1_);
        curl_msnprintf(auStack_158,3,&DAT_002d74c4,local_90._2_1_);
        curl_msnprintf(auStack_156,3,&DAT_002d74c4,local_90._3_1_);
        curl_msnprintf(auStack_154,3,&DAT_002d74c4,local_90._4_1_);
        curl_msnprintf(auStack_152,3,&DAT_002d74c4,local_90._5_1_);
        curl_msnprintf(auStack_150,3,&DAT_002d74c4,local_90._6_1_);
        curl_msnprintf(auStack_14e,3,&DAT_002d74c4,local_90._7_1_);
        curl_msnprintf(auStack_14c,3,&DAT_002d74c4,local_88 & 0xff);
        curl_msnprintf(auStack_14a,3,&DAT_002d74c4,local_88._1_1_);
        curl_msnprintf(auStack_148,3,&DAT_002d74c4,local_88._2_1_);
        curl_msnprintf(auStack_146,3,&DAT_002d74c4,local_88._3_1_);
        curl_msnprintf(auStack_144,3,&DAT_002d74c4,local_88._4_1_);
        curl_msnprintf(auStack_142,3,&DAT_002d74c4,local_88._5_1_);
        curl_msnprintf(auStack_140,3,&DAT_002d74c4,local_88._6_1_);
        curl_msnprintf(auStack_13e,3,&DAT_002d74c4,local_88._7_1_);
        if (param_6[4] == 0) {
          pcVar4 = (char *)curl_maprintf("%s:%s:%s",auStack_118,*param_6,auStack_15c);
        }
        else {
          pcVar4 = (char *)curl_maprintf("%s:%s:%08x:%s:%s:%s",auStack_118,*param_6,
                                         *(undefined4 *)(param_6 + 6),param_6[1],param_6[4],
                                         auStack_15c);
        }
        if (pcVar4 != (char *)0x0) {
          sVar5 = strlen(pcVar4);
          iVar3 = FUN_00944e8c(&local_90,pcVar4,sVar5);
          (*(code *)PTR_free_00cc4678)(pcVar4);
          if (iVar3 == 0) {
            curl_msnprintf(auStack_d4,3,&DAT_002d74c4,local_90 & 0xff);
            curl_msnprintf((ulong)auStack_d4 | 2,3,&DAT_002d74c4,local_90._1_1_);
            curl_msnprintf(auStack_d0,3,&DAT_002d74c4,local_90._2_1_);
            curl_msnprintf(auStack_ce,3,&DAT_002d74c4,local_90._3_1_);
            curl_msnprintf(auStack_cc,3,&DAT_002d74c4,local_90._4_1_);
            curl_msnprintf(auStack_ca,3,&DAT_002d74c4,local_90._5_1_);
            curl_msnprintf(auStack_c8,3,&DAT_002d74c4,local_90._6_1_);
            curl_msnprintf(auStack_c6,3,&DAT_002d74c4,local_90._7_1_);
            curl_msnprintf(auStack_c4,3,&DAT_002d74c4,local_88 & 0xff);
            curl_msnprintf(auStack_c2,3,&DAT_002d74c4,local_88._1_1_);
            curl_msnprintf(auStack_c0,3,&DAT_002d74c4,local_88._2_1_);
            curl_msnprintf(auStack_be,3,&DAT_002d74c4,local_88._3_1_);
            curl_msnprintf(auStack_bc,3,&DAT_002d74c4,local_88._4_1_);
            curl_msnprintf(auStack_ba,3,&DAT_002d74c4,local_88._5_1_);
            curl_msnprintf(auStack_b8,3,&DAT_002d74c4,local_88._6_1_);
            curl_msnprintf(auStack_b6,3,&DAT_002d74c4,local_88._7_1_);
            lVar7 = 1;
            if ((*(byte *)((long)param_6 + 0x35) & 2) != 0) {
              param_2 = local_1a0;
            }
            pcVar4 = param_2;
LAB_00966088:
            do {
              cVar11 = *pcVar4;
              if (cVar11 != '\"') {
                if (cVar11 == '\0') goto LAB_009661a4;
                if (cVar11 != '\\') {
                  lVar7 = lVar7 + 1;
                  pcVar4 = pcVar4 + 1;
                  goto LAB_00966088;
                }
              }
              lVar7 = lVar7 + 2;
              pcVar4 = pcVar4 + 1;
            } while( true );
          }
          goto LAB_00966dd8;
        }
      }
    }
    goto LAB_009666bc;
  }
  if (bVar1 < 4) {
    local_1f8 = 0;
    local_1f0 = 0;
    local_80 = 0;
    uStack_78 = 0;
    local_90 = 0;
    local_88 = 0;
    if (*(int *)(param_6 + 6) == 0) {
      *(undefined4 *)(param_6 + 6) = 1;
      lVar7 = param_6[1];
    }
    else {
      lVar7 = param_6[1];
    }
    if (lVar7 == 0) {
      iVar3 = FUN_00932534(param_1,acStack_1e4,0x21);
      if (iVar3 != 0) goto LAB_00966dd8;
      sVar5 = strlen(acStack_1e4);
      iVar3 = FUN_0091e888(acStack_1e4,sVar5,&local_1f0,&local_1f8);
      if (iVar3 != 0) goto LAB_00966dd8;
      param_6[1] = local_1f0;
    }
    if ((*(byte *)((long)param_6 + 0x35) >> 1 & 1) != 0) {
      puVar12 = &DAT_002ab32c;
      if ((undefined1 *)param_6[2] != (undefined1 *)0x0) {
        puVar12 = (undefined1 *)param_6[2];
      }
      pcVar4 = (char *)curl_maprintf("%s:%s",param_2,puVar12);
      if (pcVar4 == (char *)0x0) goto LAB_00966dd4;
      sVar5 = strlen(pcVar4);
      iVar3 = FUN_0093efe0(&local_90,pcVar4,sVar5);
      (*(code *)PTR_free_00cc4678)(pcVar4);
      if (iVar3 != 0) goto LAB_00966dd8;
      lVar7 = 0;
      pcVar4 = local_1a0;
      do {
        curl_msnprintf(pcVar4,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
        lVar7 = lVar7 + 1;
        pcVar4 = pcVar4 + 2;
      } while (lVar7 != 0x20);
    }
    puVar12 = &DAT_002ab32c;
    if ((undefined1 *)param_6[2] != (undefined1 *)0x0) {
      puVar12 = (undefined1 *)param_6[2];
    }
    pcVar4 = (char *)curl_maprintf("%s:%s:%s",param_2,puVar12,param_3);
    if (pcVar4 != (char *)0x0) {
      sVar5 = strlen(pcVar4);
      iVar3 = FUN_0093efe0(&local_90,pcVar4,sVar5);
      (*(code *)PTR_free_00cc4678)(pcVar4);
      if (iVar3 != 0) goto LAB_00966dd8;
      lVar7 = 0;
      puVar12 = auStack_118;
      do {
        curl_msnprintf(puVar12,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
        lVar7 = lVar7 + 1;
        puVar12 = puVar12 + 2;
      } while (lVar7 != 0x20);
      if ((*(byte *)((long)param_6 + 0x34) & 1) != 0) {
        pcVar4 = (char *)curl_maprintf("%s:%s:%s",auStack_118,*param_6,param_6[1]);
        if (pcVar4 == (char *)0x0) goto LAB_00966dd4;
        sVar5 = strlen(pcVar4);
        iVar3 = FUN_0093efe0(&local_90,pcVar4,sVar5);
        (*(code *)PTR_free_00cc4678)(pcVar4);
        if (iVar3 != 0) goto LAB_00966dd8;
        lVar7 = 0;
        puVar12 = auStack_118;
        do {
          curl_msnprintf(puVar12,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
          lVar7 = lVar7 + 1;
          puVar12 = puVar12 + 2;
        } while (lVar7 != 0x20);
      }
      pcVar4 = (char *)curl_maprintf("%s:%s",param_4,param_5);
      if (pcVar4 != (char *)0x0) {
        pcVar6 = pcVar4;
        if ((param_6[4] != 0) && (iVar3 = curl_strequal(param_6[4],"auth-int"), iVar3 != 0)) {
          iVar3 = FUN_0093efe0(&local_90,&DAT_002ab32c,0);
          if (iVar3 != 0) goto LAB_009655d0;
          lVar7 = 0;
          pcVar6 = acStack_1e4;
          do {
            curl_msnprintf(pcVar6,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
            lVar7 = lVar7 + 1;
            pcVar6 = pcVar6 + 2;
          } while (lVar7 != 0x20);
          pcVar6 = (char *)curl_maprintf("%s:%s",pcVar4,acStack_1e4);
          (*(code *)PTR_free_00cc4678)(pcVar4);
          if (pcVar6 == (char *)0x0) goto LAB_00966dd4;
        }
        sVar5 = strlen(pcVar6);
        iVar3 = FUN_0093efe0(&local_90,pcVar6,sVar5);
        (*(code *)PTR_free_00cc4678)(pcVar6);
        if (iVar3 != 0) goto LAB_00966dd8;
        lVar7 = 0;
        puVar12 = auStack_15c;
        do {
          curl_msnprintf(puVar12,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
          lVar7 = lVar7 + 1;
          puVar12 = puVar12 + 2;
        } while (lVar7 != 0x20);
        if (param_6[4] == 0) {
          pcVar4 = (char *)curl_maprintf("%s:%s:%s",auStack_118,*param_6,auStack_15c);
        }
        else {
          pcVar4 = (char *)curl_maprintf("%s:%s:%08x:%s:%s:%s",auStack_118,*param_6,
                                         *(undefined4 *)(param_6 + 6),param_6[1],param_6[4],
                                         auStack_15c);
        }
        if (pcVar4 != (char *)0x0) {
          sVar5 = strlen(pcVar4);
          iVar3 = FUN_0093efe0(&local_90,pcVar4,sVar5);
          (*(code *)PTR_free_00cc4678)(pcVar4);
          if (iVar3 == 0) {
            lVar7 = 0;
            puVar12 = auStack_d4;
            do {
              curl_msnprintf(puVar12,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
              lVar7 = lVar7 + 1;
              puVar12 = puVar12 + 2;
            } while (lVar7 != 0x20);
            lVar7 = 1;
            if ((*(byte *)((long)param_6 + 0x35) & 2) != 0) {
              param_2 = local_1a0;
            }
            pcVar4 = param_2;
LAB_009662a0:
            do {
              cVar11 = *pcVar4;
              if (cVar11 != '\"') {
                if (cVar11 == '\0') goto LAB_00966308;
                if (cVar11 != '\\') {
                  lVar7 = lVar7 + 1;
                  pcVar4 = pcVar4 + 1;
                  goto LAB_009662a0;
                }
              }
              lVar7 = lVar7 + 2;
              pcVar4 = pcVar4 + 1;
            } while( true );
          }
          goto LAB_00966dd8;
        }
      }
    }
  }
  else {
    if (5 < bVar1) {
      iVar3 = 0x3d;
      goto LAB_00966dd8;
    }
    local_1f8 = 0;
    local_1f0 = 0;
    local_80 = 0;
    uStack_78 = 0;
    local_90 = 0;
    local_88 = 0;
    if (*(int *)(param_6 + 6) == 0) {
      *(undefined4 *)(param_6 + 6) = 1;
    }
    if (param_6[1] == 0) {
      iVar3 = FUN_00932534(param_1,acStack_1e4,0x21);
      if (iVar3 != 0) goto LAB_00966dd8;
      sVar5 = strlen(acStack_1e4);
      iVar3 = FUN_0091e888(acStack_1e4,sVar5,&local_1f0,&local_1f8);
      if (iVar3 != 0) goto LAB_00966dd8;
      param_6[1] = local_1f0;
    }
    if ((*(byte *)((long)param_6 + 0x35) >> 1 & 1) != 0) {
      puVar12 = &DAT_002ab32c;
      if ((undefined1 *)param_6[2] != (undefined1 *)0x0) {
        puVar12 = (undefined1 *)param_6[2];
      }
      pcVar4 = (char *)curl_maprintf("%s:%s",param_2,puVar12);
      if (pcVar4 == (char *)0x0) goto LAB_00966dd4;
      sVar5 = strlen(pcVar4);
      iVar3 = FUN_00966e10(&local_90,pcVar4,sVar5);
      (*(code *)PTR_free_00cc4678)(pcVar4);
      if (iVar3 != 0) goto LAB_00966dd8;
      lVar7 = 0;
      pcVar4 = local_1a0;
      do {
        curl_msnprintf(pcVar4,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
        lVar7 = lVar7 + 1;
        pcVar4 = pcVar4 + 2;
      } while (lVar7 != 0x20);
    }
    puVar12 = &DAT_002ab32c;
    if ((undefined1 *)param_6[2] != (undefined1 *)0x0) {
      puVar12 = (undefined1 *)param_6[2];
    }
    pcVar4 = (char *)curl_maprintf("%s:%s:%s",param_2,puVar12,param_3);
    if (pcVar4 != (char *)0x0) {
      sVar5 = strlen(pcVar4);
      iVar3 = FUN_00966e10(&local_90,pcVar4,sVar5);
      (*(code *)PTR_free_00cc4678)(pcVar4);
      if (iVar3 != 0) goto LAB_00966dd8;
      lVar7 = 0;
      puVar12 = auStack_118;
      do {
        curl_msnprintf(puVar12,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
        lVar7 = lVar7 + 1;
        puVar12 = puVar12 + 2;
      } while (lVar7 != 0x20);
      if ((*(byte *)((long)param_6 + 0x34) & 1) != 0) {
        pcVar4 = (char *)curl_maprintf("%s:%s:%s",auStack_118,*param_6,param_6[1]);
        if (pcVar4 == (char *)0x0) goto LAB_00966dd4;
        sVar5 = strlen(pcVar4);
        iVar3 = FUN_00966e10(&local_90,pcVar4,sVar5);
        (*(code *)PTR_free_00cc4678)(pcVar4);
        if (iVar3 != 0) goto LAB_00966dd8;
        lVar7 = 0;
        puVar12 = auStack_118;
        do {
          curl_msnprintf(puVar12,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
          lVar7 = lVar7 + 1;
          puVar12 = puVar12 + 2;
        } while (lVar7 != 0x20);
      }
      pcVar4 = (char *)curl_maprintf("%s:%s",param_4,param_5);
      if (pcVar4 != (char *)0x0) {
        pcVar6 = pcVar4;
        if ((param_6[4] != 0) && (iVar3 = curl_strequal(param_6[4],"auth-int"), iVar3 != 0)) {
          iVar3 = FUN_00966e10(&local_90,&DAT_002ab32c,0);
          if (iVar3 != 0) {
LAB_009655d0:
            (*(code *)PTR_free_00cc4678)(pcVar4);
            goto LAB_00966dd8;
          }
          lVar7 = 0;
          pcVar6 = acStack_1e4;
          do {
            curl_msnprintf(pcVar6,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
            lVar7 = lVar7 + 1;
            pcVar6 = pcVar6 + 2;
          } while (lVar7 != 0x20);
          pcVar6 = (char *)curl_maprintf("%s:%s",pcVar4,acStack_1e4);
          (*(code *)PTR_free_00cc4678)(pcVar4);
          if (pcVar6 == (char *)0x0) goto LAB_00966dd4;
        }
        sVar5 = strlen(pcVar6);
        iVar3 = FUN_00966e10(&local_90,pcVar6,sVar5);
        (*(code *)PTR_free_00cc4678)(pcVar6);
        if (iVar3 != 0) goto LAB_00966dd8;
        lVar7 = 0;
        puVar12 = auStack_15c;
        do {
          curl_msnprintf(puVar12,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
          lVar7 = lVar7 + 1;
          puVar12 = puVar12 + 2;
        } while (lVar7 != 0x20);
        if (param_6[4] == 0) {
          pcVar4 = (char *)curl_maprintf("%s:%s:%s",auStack_118,*param_6,auStack_15c);
        }
        else {
          pcVar4 = (char *)curl_maprintf("%s:%s:%08x:%s:%s:%s",auStack_118,*param_6,
                                         *(undefined4 *)(param_6 + 6),param_6[1],param_6[4],
                                         auStack_15c);
        }
        if (pcVar4 != (char *)0x0) {
          sVar5 = strlen(pcVar4);
          iVar3 = FUN_00966e10(&local_90,pcVar4,sVar5);
          (*(code *)PTR_free_00cc4678)(pcVar4);
          if (iVar3 == 0) {
            lVar7 = 0;
            puVar12 = auStack_d4;
            do {
              curl_msnprintf(puVar12,3,&DAT_002d74c4,auStack_b6[lVar7 + 0x26]);
              lVar7 = lVar7 + 1;
              puVar12 = puVar12 + 2;
            } while (lVar7 != 0x20);
            lVar7 = 1;
            if ((*(byte *)((long)param_6 + 0x35) & 2) != 0) {
              param_2 = local_1a0;
            }
            pcVar4 = param_2;
LAB_00966400:
            do {
              cVar11 = *pcVar4;
              if (cVar11 != '\"') {
                if (cVar11 == '\0') goto LAB_009664b4;
                if (cVar11 != '\\') {
                  lVar7 = lVar7 + 1;
                  pcVar4 = pcVar4 + 1;
                  goto LAB_00966400;
                }
              }
              lVar7 = lVar7 + 2;
              pcVar4 = pcVar4 + 1;
            } while( true );
          }
          goto LAB_00966dd8;
        }
      }
    }
  }
  goto LAB_00966dd4;
LAB_009661a4:
  pcVar4 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar4 != (char *)0x0) {
    pcVar6 = pcVar4;
    do {
      cVar11 = *param_2;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar8 = pcVar6 + 1;
        *pcVar6 = '\\';
        cVar11 = *param_2;
      }
      else {
        pcVar8 = pcVar6;
        if (cVar11 == '\0') goto LAB_009662c4;
      }
      param_2 = param_2 + 1;
      pcVar6 = pcVar8 + 1;
      *pcVar8 = cVar11;
    } while( true );
  }
  goto LAB_009666bc;
LAB_009662c4:
  *pcVar6 = '\0';
  pcVar6 = (char *)param_6[2];
  if (pcVar6 != (char *)0x0) {
    lVar7 = 1;
    pcVar8 = pcVar6;
LAB_009662e4:
    do {
      cVar11 = *pcVar8;
      if (cVar11 != '\"') {
        if (cVar11 == '\0') goto LAB_00966424;
        if (cVar11 != '\\') {
          lVar7 = lVar7 + 1;
          pcVar8 = pcVar8 + 1;
          goto LAB_009662e4;
        }
      }
      lVar7 = lVar7 + 2;
      pcVar8 = pcVar8 + 1;
    } while( true );
  }
  pcVar13 = (char *)(*(code *)PTR_malloc_00cc4670)(1);
  pcVar8 = pcVar13;
  if (pcVar13 != (char *)0x0) {
LAB_0096651c:
    *pcVar13 = '\0';
    pcVar13 = (char *)*param_6;
    lVar7 = 1;
    pcVar6 = pcVar13;
LAB_00966538:
    do {
      cVar11 = *pcVar6;
      if (cVar11 != '\"') {
        if (cVar11 == '\0') goto LAB_0096655c;
        if (cVar11 != '\\') {
          lVar7 = lVar7 + 1;
          pcVar6 = pcVar6 + 1;
          goto LAB_00966538;
        }
      }
      lVar7 = lVar7 + 2;
      pcVar6 = pcVar6 + 1;
    } while( true );
  }
  goto LAB_009666b8;
LAB_00966424:
  pcVar8 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar8 != (char *)0x0) {
    pcVar13 = pcVar8;
    do {
      cVar11 = *pcVar6;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar10 = pcVar13 + 1;
        *pcVar13 = '\\';
        cVar11 = *pcVar6;
      }
      else {
        pcVar10 = pcVar13;
        if (cVar11 == '\0') goto LAB_0096651c;
      }
      pcVar6 = pcVar6 + 1;
      pcVar13 = pcVar10 + 1;
      *pcVar10 = cVar11;
    } while( true );
  }
  goto LAB_009666b8;
LAB_0096655c:
  pcVar6 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar6 != (char *)0x0) {
    pcVar10 = pcVar6;
    do {
      cVar11 = *pcVar13;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar9 = pcVar10 + 1;
        *pcVar10 = '\\';
        cVar11 = *pcVar13;
      }
      else {
        pcVar9 = pcVar10;
        if (cVar11 == '\0') goto LAB_009665a8;
      }
      pcVar13 = pcVar13 + 1;
      pcVar10 = pcVar9 + 1;
      *pcVar9 = cVar11;
    } while( true );
  }
  (*(code *)PTR_free_00cc4678)(pcVar8);
  goto LAB_009666b8;
LAB_009665a8:
  *pcVar10 = '\0';
  if (param_6[4] == 0) {
    pcVar13 = (char *)curl_maprintf("username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\""
                                    ,pcVar4,pcVar8,pcVar6,param_5,auStack_d4);
  }
  else {
    pcVar13 = (char *)curl_maprintf("username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", cnonce=\"%s\", nc=%08x, qop=%s, response=\"%s\""
                                    ,pcVar4,pcVar8,pcVar6,param_5,param_6[1],
                                    *(undefined4 *)(param_6 + 6),param_6[4],auStack_d4);
    *(int *)(param_6 + 6) = *(int *)(param_6 + 6) + 1;
  }
  (*(code *)PTR_free_00cc4678)(pcVar6);
  (*(code *)PTR_free_00cc4678)(pcVar8);
  (*(code *)PTR_free_00cc4678)(pcVar4);
  if (pcVar13 != (char *)0x0) {
    pcVar4 = (char *)param_6[3];
    pcVar6 = pcVar13;
    if (pcVar4 != (char *)0x0) {
      lVar7 = 1;
      pcVar6 = pcVar4;
LAB_00966878:
      do {
        cVar11 = *pcVar6;
        if (cVar11 != '\"') {
          if (cVar11 == '\0') goto LAB_0096689c;
          if (cVar11 != '\\') {
            lVar7 = lVar7 + 1;
            pcVar6 = pcVar6 + 1;
            goto LAB_00966878;
          }
        }
        lVar7 = lVar7 + 2;
        pcVar6 = pcVar6 + 1;
      } while( true );
    }
    goto LAB_00966938;
  }
  goto LAB_009666bc;
LAB_0096689c:
  pcVar8 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar8 != (char *)0x0) {
    pcVar6 = pcVar8;
    do {
      cVar11 = *pcVar4;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar10 = pcVar6 + 1;
        *pcVar6 = '\\';
        cVar11 = *pcVar4;
      }
      else {
        pcVar10 = pcVar6;
        if (cVar11 == '\0') goto LAB_009668f0;
      }
      pcVar4 = pcVar4 + 1;
      pcVar6 = pcVar10 + 1;
      *pcVar10 = cVar11;
    } while( true );
  }
  pcVar4 = pcVar13;
LAB_009666b8:
  (*(code *)PTR_free_00cc4678)(pcVar4);
LAB_009666bc:
  iVar3 = 0x1b;
  goto LAB_00966dd8;
LAB_009668f0:
  *pcVar6 = '\0';
  pcVar6 = (char *)curl_maprintf("%s, opaque=\"%s\"",pcVar13,pcVar8);
  (*(code *)PTR_free_00cc4678)(pcVar13);
  (*(code *)PTR_free_00cc4678)(pcVar8);
  if (pcVar6 != (char *)0x0) {
LAB_00966938:
    pcVar4 = pcVar6;
    if (param_6[5] != 0) {
      pcVar4 = (char *)curl_maprintf("%s, algorithm=%s",pcVar6);
      (*(code *)PTR_free_00cc4678)(pcVar6);
      if (pcVar4 == (char *)0x0) goto LAB_009666bc;
    }
    pcVar6 = pcVar4;
    if ((*(byte *)((long)param_6 + 0x35) >> 1 & 1) != 0) {
      pcVar6 = (char *)curl_maprintf("%s, userhash=true",pcVar4);
      (*(code *)PTR_free_00cc4678)(pcVar4);
      if (pcVar6 == (char *)0x0) goto LAB_009666bc;
    }
    *param_7 = pcVar6;
    sVar5 = strlen(pcVar6);
    iVar3 = 0;
    *param_8 = sVar5;
    goto LAB_00966dd8;
  }
  goto LAB_009666bc;
LAB_00966308:
  pcVar4 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar4 != (char *)0x0) {
    pcVar6 = pcVar4;
    do {
      cVar11 = *param_2;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar8 = pcVar6 + 1;
        *pcVar6 = '\\';
        cVar11 = *param_2;
      }
      else {
        pcVar8 = pcVar6;
        if (cVar11 == '\0') goto LAB_00966470;
      }
      param_2 = param_2 + 1;
      pcVar6 = pcVar8 + 1;
      *pcVar8 = cVar11;
    } while( true );
  }
  goto LAB_00966dd4;
LAB_00966470:
  *pcVar6 = '\0';
  pcVar6 = (char *)param_6[2];
  pcVar8 = pcVar4;
  if (pcVar6 != (char *)0x0) {
    lVar7 = 1;
    pcVar13 = pcVar6;
LAB_00966490:
    do {
      cVar11 = *pcVar13;
      if (cVar11 != '\"') {
        if (cVar11 == '\0') goto LAB_00966604;
        if (cVar11 != '\\') {
          lVar7 = lVar7 + 1;
          pcVar13 = pcVar13 + 1;
          goto LAB_00966490;
        }
      }
      lVar7 = lVar7 + 2;
      pcVar13 = pcVar13 + 1;
    } while( true );
  }
  pcVar10 = (char *)(*(code *)PTR_malloc_00cc4670)(1);
  pcVar13 = pcVar10;
  if (pcVar10 != (char *)0x0) {
LAB_009666dc:
    *pcVar10 = '\0';
    pcVar8 = (char *)*param_6;
    lVar7 = 1;
    pcVar6 = pcVar8;
LAB_009666f8:
    do {
      cVar11 = *pcVar6;
      if (cVar11 != '\"') {
        if (cVar11 == '\0') goto LAB_0096671c;
        if (cVar11 != '\\') {
          lVar7 = lVar7 + 1;
          pcVar6 = pcVar6 + 1;
          goto LAB_009666f8;
        }
      }
      lVar7 = lVar7 + 2;
      pcVar6 = pcVar6 + 1;
    } while( true );
  }
  goto LAB_00966a7c;
LAB_00966604:
  pcVar13 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar13 != (char *)0x0) {
    pcVar10 = pcVar13;
    do {
      cVar11 = *pcVar6;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar8 = pcVar10 + 1;
        *pcVar10 = '\\';
        cVar11 = *pcVar6;
      }
      else {
        pcVar8 = pcVar10;
        if (cVar11 == '\0') goto LAB_009666dc;
      }
      pcVar6 = pcVar6 + 1;
      pcVar10 = pcVar8 + 1;
      *pcVar8 = cVar11;
    } while( true );
  }
  goto LAB_00966a7c;
LAB_0096671c:
  pcVar6 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar6 != (char *)0x0) {
    pcVar10 = pcVar6;
    do {
      cVar11 = *pcVar8;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar9 = pcVar10 + 1;
        *pcVar10 = '\\';
        cVar11 = *pcVar8;
      }
      else {
        pcVar9 = pcVar10;
        if (cVar11 == '\0') goto LAB_00966768;
      }
      pcVar8 = pcVar8 + 1;
      pcVar10 = pcVar9 + 1;
      *pcVar9 = cVar11;
    } while( true );
  }
  goto LAB_00966a68;
LAB_00966768:
  *pcVar10 = '\0';
  if (param_6[4] == 0) {
    pcVar8 = (char *)curl_maprintf("username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\""
                                   ,pcVar4,pcVar13,pcVar6,param_5,auStack_d4);
  }
  else {
    pcVar8 = (char *)curl_maprintf("username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", cnonce=\"%s\", nc=%08x, qop=%s, response=\"%s\""
                                   ,pcVar4,pcVar13,pcVar6,param_5,param_6[1],
                                   *(undefined4 *)(param_6 + 6),param_6[4],auStack_d4);
    *(int *)(param_6 + 6) = *(int *)(param_6 + 6) + 1;
  }
  (*(code *)PTR_free_00cc4678)(pcVar6);
  (*(code *)PTR_free_00cc4678)(pcVar13);
  (*(code *)PTR_free_00cc4678)(pcVar4);
  if (pcVar8 != (char *)0x0) {
    pcVar4 = (char *)param_6[3];
    pcVar6 = pcVar8;
    if (pcVar4 != (char *)0x0) {
      lVar7 = 1;
      pcVar6 = pcVar4;
LAB_00966b3c:
      do {
        cVar11 = *pcVar6;
        if (cVar11 != '\"') {
          if (cVar11 == '\0') goto LAB_00966b60;
          if (cVar11 != '\\') {
            lVar7 = lVar7 + 1;
            pcVar6 = pcVar6 + 1;
            goto LAB_00966b3c;
          }
        }
        lVar7 = lVar7 + 2;
        pcVar6 = pcVar6 + 1;
      } while( true );
    }
    goto LAB_00966bfc;
  }
  goto LAB_00966dd4;
LAB_00966b60:
  pcVar13 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar13 != (char *)0x0) {
    pcVar6 = pcVar13;
    do {
      cVar11 = *pcVar4;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar10 = pcVar6 + 1;
        *pcVar6 = '\\';
        cVar11 = *pcVar4;
      }
      else {
        pcVar10 = pcVar6;
        if (cVar11 == '\0') goto LAB_00966bc0;
      }
      pcVar4 = pcVar4 + 1;
      pcVar6 = pcVar10 + 1;
      *pcVar10 = cVar11;
    } while( true );
  }
  goto LAB_00966a7c;
LAB_00966bc0:
  *pcVar6 = '\0';
  pcVar6 = (char *)curl_maprintf("%s, opaque=\"%s\"",pcVar8,pcVar13);
  (*(code *)PTR_free_00cc4678)(pcVar8);
  (*(code *)PTR_free_00cc4678)(pcVar13);
  if (pcVar6 != (char *)0x0) {
LAB_00966bfc:
    pcVar4 = pcVar6;
    if (param_6[5] != 0) {
      pcVar4 = (char *)curl_maprintf("%s, algorithm=%s",pcVar6);
      (*(code *)PTR_free_00cc4678)(pcVar6);
      if (pcVar4 == (char *)0x0) goto LAB_00966dd4;
    }
    bVar1 = *(byte *)((long)param_6 + 0x35);
    goto joined_r0x00966d8c;
  }
  goto LAB_00966dd4;
LAB_00966650:
  *pcVar6 = '\0';
  pcVar6 = (char *)param_6[2];
  pcVar8 = pcVar4;
  if (pcVar6 != (char *)0x0) {
    lVar7 = 1;
    pcVar13 = pcVar6;
LAB_00966674:
    do {
      cVar11 = *pcVar13;
      if (cVar11 != '\"') {
        if (cVar11 == '\0') goto LAB_009667b4;
        if (cVar11 != '\\') {
          lVar7 = lVar7 + 1;
          pcVar13 = pcVar13 + 1;
          goto LAB_00966674;
        }
      }
      lVar7 = lVar7 + 2;
      pcVar13 = pcVar13 + 1;
    } while( true );
  }
  pcVar10 = (char *)(*(code *)PTR_malloc_00cc4670)(1);
  pcVar13 = pcVar10;
  if (pcVar10 != (char *)0x0) goto LAB_009669dc;
  goto LAB_00966a7c;
LAB_009667b4:
  pcVar13 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar13 != (char *)0x0) {
    pcVar10 = pcVar13;
    do {
      cVar11 = *pcVar6;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar8 = pcVar10 + 1;
        *pcVar10 = '\\';
        cVar11 = *pcVar6;
      }
      else {
        pcVar8 = pcVar10;
        if (cVar11 == '\0') goto LAB_009668e8;
      }
      pcVar6 = pcVar6 + 1;
      pcVar10 = pcVar8 + 1;
      *pcVar8 = cVar11;
    } while( true );
  }
  goto LAB_00966a7c;
LAB_009668e8:
LAB_009669dc:
  *pcVar10 = '\0';
  pcVar8 = (char *)*param_6;
  lVar7 = 1;
  pcVar6 = pcVar8;
LAB_009669f8:
  do {
    cVar11 = *pcVar6;
    if (cVar11 != '\"') {
      if (cVar11 == '\0') break;
      if (cVar11 != '\\') {
        lVar7 = lVar7 + 1;
        pcVar6 = pcVar6 + 1;
        goto LAB_009669f8;
      }
    }
    lVar7 = lVar7 + 2;
    pcVar6 = pcVar6 + 1;
  } while( true );
  pcVar6 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar6 != (char *)0x0) {
    pcVar10 = pcVar6;
    do {
      cVar11 = *pcVar8;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar9 = pcVar10 + 1;
        *pcVar10 = '\\';
        cVar11 = *pcVar8;
      }
      else {
        pcVar9 = pcVar10;
        if (cVar11 == '\0') goto LAB_00966a88;
      }
      pcVar8 = pcVar8 + 1;
      pcVar10 = pcVar9 + 1;
      *pcVar9 = cVar11;
    } while( true );
  }
LAB_00966a68:
  (*(code *)PTR_free_00cc4678)(pcVar13);
  pcVar8 = pcVar4;
  goto LAB_00966a7c;
LAB_00966a88:
  *pcVar10 = '\0';
  if (param_6[4] == 0) {
    pcVar8 = (char *)curl_maprintf("username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\""
                                   ,pcVar4,pcVar13,pcVar6,param_5,auStack_d4);
  }
  else {
    pcVar8 = (char *)curl_maprintf("username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", cnonce=\"%s\", nc=%08x, qop=%s, response=\"%s\""
                                   ,pcVar4,pcVar13,pcVar6,param_5,param_6[1],
                                   *(undefined4 *)(param_6 + 6),param_6[4],auStack_d4);
    *(int *)(param_6 + 6) = *(int *)(param_6 + 6) + 1;
  }
  (*(code *)PTR_free_00cc4678)(pcVar6);
  (*(code *)PTR_free_00cc4678)(pcVar13);
  (*(code *)PTR_free_00cc4678)(pcVar4);
  if (pcVar8 != (char *)0x0) {
    pcVar4 = (char *)param_6[3];
    pcVar6 = pcVar8;
    if (pcVar4 != (char *)0x0) {
      lVar7 = 1;
      pcVar6 = pcVar4;
LAB_00966ca0:
      do {
        cVar11 = *pcVar6;
        if (cVar11 != '\"') {
          if (cVar11 == '\0') goto LAB_00966cc4;
          if (cVar11 != '\\') {
            lVar7 = lVar7 + 1;
            pcVar6 = pcVar6 + 1;
            goto LAB_00966ca0;
          }
        }
        lVar7 = lVar7 + 2;
        pcVar6 = pcVar6 + 1;
      } while( true );
    }
    goto LAB_00966d58;
  }
  goto LAB_00966dd4;
LAB_00966cc4:
  pcVar13 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar13 != (char *)0x0) {
    pcVar6 = pcVar13;
    do {
      cVar11 = *pcVar4;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar10 = pcVar6 + 1;
        *pcVar6 = '\\';
        cVar11 = *pcVar4;
      }
      else {
        pcVar10 = pcVar6;
        if (cVar11 == '\0') goto LAB_00966d1c;
      }
      pcVar4 = pcVar4 + 1;
      pcVar6 = pcVar10 + 1;
      *pcVar10 = cVar11;
    } while( true );
  }
LAB_00966a7c:
  (*(code *)PTR_free_00cc4678)(pcVar8);
  iVar3 = 0x1b;
  goto LAB_00966dd8;
LAB_00966d1c:
  *pcVar6 = '\0';
  pcVar6 = (char *)curl_maprintf("%s, opaque=\"%s\"",pcVar8,pcVar13);
  (*(code *)PTR_free_00cc4678)(pcVar8);
  (*(code *)PTR_free_00cc4678)(pcVar13);
  if (pcVar6 != (char *)0x0) {
LAB_00966d58:
    pcVar4 = pcVar6;
    if (param_6[5] != 0) {
      pcVar4 = (char *)curl_maprintf("%s, algorithm=%s",pcVar6);
      (*(code *)PTR_free_00cc4678)(pcVar6);
      if (pcVar4 == (char *)0x0) goto LAB_00966dd4;
    }
    bVar1 = *(byte *)((long)param_6 + 0x35);
joined_r0x00966d8c:
    pcVar6 = pcVar4;
    if ((bVar1 >> 1 & 1) != 0) {
      pcVar6 = (char *)curl_maprintf("%s, userhash=true",pcVar4);
      (*(code *)PTR_free_00cc4678)(pcVar4);
      if (pcVar6 == (char *)0x0) goto LAB_00966dd4;
    }
    *param_7 = pcVar6;
    sVar5 = strlen(pcVar6);
    iVar3 = 0;
    *param_8 = sVar5;
    goto LAB_00966dd8;
  }
  goto LAB_00966dd4;
LAB_009664b4:
  pcVar4 = (char *)(*(code *)PTR_malloc_00cc4670)(lVar7);
  if (pcVar4 != (char *)0x0) {
    pcVar6 = pcVar4;
    do {
      cVar11 = *param_2;
      if ((cVar11 == '\"') || (cVar11 == '\\')) {
        pcVar8 = pcVar6 + 1;
        *pcVar6 = '\\';
        cVar11 = *param_2;
      }
      else {
        pcVar8 = pcVar6;
        if (cVar11 == '\0') goto LAB_00966650;
      }
      param_2 = param_2 + 1;
      pcVar6 = pcVar8 + 1;
      *pcVar8 = cVar11;
    } while( true );
  }
LAB_00966dd4:
  iVar3 = 0x1b;
LAB_00966dd8:
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

