/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c16098
 */

undefined8 * FUN_00c16098(long *param_1)

{
  long lVar1;
  byte bVar2;
  char cVar3;
  short sVar4;
  bool bVar5;
  bool bVar6;
  undefined8 *puVar7;
  size_t sVar8;
  long lVar9;
  void *pvVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 *puVar14;
  long **pplVar15;
  int iVar16;
  byte *pbVar17;
  byte *pbVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  long *plVar23;
  char *pcVar24;
  byte *pbVar25;
  long *plVar26;
  long *plVar27;
  undefined1 uVar28;
  size_t sVar29;
  undefined1 auVar30 [16];
  byte local_9c [4];
  undefined1 local_98 [16];
  long *local_88;
  size_t sStack_80;
  long local_78;
  undefined1 local_70 [16];
  undefined1 local_48 [4];
  uint local_44;
  
  pbVar17 = (byte *)*param_1;
  pbVar25 = (byte *)param_1[1];
  uVar19 = (long)pbVar25 - (long)pbVar17;
  if (uVar19 < 2) goto LAB_00c160cc;
  sVar4 = *(short *)pbVar17;
  if (sVar4 == 0x7367) {
    pbVar17 = pbVar17 + 2;
    uVar28 = 1;
    uVar19 = (long)pbVar25 - (long)pbVar17;
    *param_1 = (long)pbVar17;
    local_48[0] = 1;
    if (uVar19 < 2) goto LAB_00c160cc;
  }
  else {
    uVar28 = 0;
    local_48[0] = 0;
  }
  uVar20 = 0;
  uVar21 = 0x3e;
  pbVar18 = pbVar17 + 1;
  bVar2 = *pbVar17;
  do {
    uVar22 = uVar20 + uVar21 >> 1;
    if ((byte)(&UNK_00cb1618)[uVar22 * 0x10] < bVar2) {
      uVar20 = uVar22 + 1;
    }
    else if ((&UNK_00cb1618)[uVar22 * 0x10] == bVar2) {
      if ((byte)(&UNK_00cb1619)[uVar22 * 0x10] < *pbVar18) {
        uVar20 = uVar22 + 1;
        uVar22 = uVar21;
      }
      uVar21 = uVar22;
    }
    else {
      uVar21 = uVar22;
    }
  } while (uVar21 != uVar20);
  lVar13 = uVar20 * 0x10;
  if (((&UNK_00cb1618)[lVar13] != bVar2) || ((&UNK_00cb1619)[lVar13] != *pbVar18)) {
    if (bVar2 != 0x66) {
      if (bVar2 == 0x54) {
        puVar7 = (undefined8 *)FUN_00c14ebc(param_1);
        return puVar7;
      }
      if (bVar2 == 0x4c) {
        puVar7 = (undefined8 *)FUN_00c17a90(param_1);
        return puVar7;
      }
      if (*(short *)pbVar17 == 0x6c69) {
        lVar13 = param_1[2];
        lVar11 = param_1[3];
        pbVar17 = pbVar17 + 2;
        *param_1 = (long)pbVar17;
        while ((pbVar17 == pbVar25 || (*pbVar17 != 0x45))) {
          lVar9 = FUN_00c187d8(param_1);
          if (lVar9 == 0) {
            return (undefined8 *)0x0;
          }
          plVar23 = (long *)param_1[3];
          if (plVar23 == (long *)param_1[4]) {
            plVar27 = (long *)param_1[2];
            sVar8 = (long)plVar23 - (long)plVar27;
            if (plVar27 == param_1 + 5) {
              pvVar10 = malloc(sVar8 * 2);
              if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
                abort();
              }
              if (plVar23 != param_1 + 5) {
                memmove(pvVar10,plVar27,sVar8);
              }
              param_1[2] = (long)pvVar10;
            }
            else {
              pvVar10 = realloc(plVar27,sVar8 * 2);
              param_1[2] = (long)pvVar10;
              if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
                abort();
              }
            }
            plVar23 = (long *)((long)pvVar10 + sVar8);
            param_1[4] = (long)((long)pvVar10 + ((long)sVar8 >> 2) * 8);
          }
          *plVar23 = lVar9;
          pbVar17 = (byte *)*param_1;
          pbVar25 = (byte *)param_1[1];
          param_1[3] = (long)(plVar23 + 1);
        }
        *param_1 = (long)(pbVar17 + 1);
        local_70 = FUN_00c13140(param_1,lVar11 - lVar13 >> 3);
        puVar7 = (undefined8 *)FUN_00c18a34(param_1,local_70);
        return puVar7;
      }
      uVar19 = (long)pbVar25 - (long)pbVar17;
      if (1 < uVar19) {
        if (*(short *)pbVar17 == 0x636d) {
          *param_1 = (long)(pbVar17 + 2);
          puVar7 = (undefined8 *)FUN_00c18ad8(param_1);
          return puVar7;
        }
        if (*(short *)pbVar17 == 0x786e) {
          *param_1 = (long)(pbVar17 + 2);
          local_70._0_8_ = FUN_00c16098(param_1);
          if (local_70._0_8_ == 0) {
            return (undefined8 *)0x0;
          }
          local_88 = (long *)CONCAT44(local_88._4_4_,2);
          puVar7 = (undefined8 *)FUN_00c18c48(param_1,local_70,&local_88);
          return puVar7;
        }
      }
      if (pbVar25 != pbVar17) {
        if ((uVar19 < 2) || (bVar2 != 0x72)) {
          if (uVar19 < 2) goto LAB_00c16570;
        }
        else if ((*pbVar18 | 0x20) == 0x71) {
          puVar7 = (undefined8 *)FUN_00c18d08(param_1);
          return puVar7;
        }
        if (*(short *)pbVar17 == 0x6f73) {
          *param_1 = (long)(pbVar17 + 2);
          puVar7 = (undefined8 *)FUN_00c191d8(param_1);
          return puVar7;
        }
      }
LAB_00c16570:
      uVar19 = FUN_00c0ffd8(param_1,&DAT_002c2c49,2);
      if ((uVar19 & 1) != 0) {
        local_70._0_8_ = FUN_00c16098(param_1);
        if (local_70._0_8_ == 0) {
          return (undefined8 *)0x0;
        }
        puVar7 = (undefined8 *)FUN_00c19530(param_1,local_70);
        return puVar7;
      }
      uVar19 = FUN_00c0ffd8(param_1,&DAT_002a50fc,2);
      if ((uVar19 & 1) != 0) {
        if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'T')) {
          local_70._0_8_ = FUN_00c14ebc(param_1);
          if (local_70._0_8_ == 0) {
            return (undefined8 *)0x0;
          }
          puVar7 = (undefined8 *)FUN_00c195d0(param_1,local_70);
          return puVar7;
        }
        local_70._0_8_ = FUN_00c18414(param_1);
        if (local_70._0_8_ == 0) {
          return (undefined8 *)0x0;
        }
LAB_00c170f8:
        puVar7 = (undefined8 *)FUN_00c19670(param_1,local_70);
        return puVar7;
      }
      uVar19 = FUN_00c0ffd8(param_1,&DAT_002acd66,2);
      if ((uVar19 & 1) != 0) {
        lVar13 = param_1[2];
        lVar11 = param_1[3];
        while ((pcVar24 = (char *)*param_1, pcVar24 == (char *)param_1[1] || (*pcVar24 != 'E'))) {
          lVar9 = FUN_00c12c94(param_1);
          if (lVar9 == 0) {
            return (undefined8 *)0x0;
          }
          plVar23 = (long *)param_1[3];
          if (plVar23 == (long *)param_1[4]) {
            plVar27 = (long *)param_1[2];
            sVar8 = (long)plVar23 - (long)plVar27;
            if (plVar27 == param_1 + 5) {
              pvVar10 = malloc(sVar8 * 2);
              if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
                abort();
              }
              if (plVar23 != param_1 + 5) {
                memmove(pvVar10,plVar27,sVar8);
              }
              param_1[2] = (long)pvVar10;
            }
            else {
              pvVar10 = realloc(plVar27,sVar8 * 2);
              param_1[2] = (long)pvVar10;
              if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
                abort();
              }
            }
            plVar23 = (long *)((long)pvVar10 + sVar8);
            param_1[4] = (long)((long)pvVar10 + ((long)sVar8 >> 2) * 8);
          }
          *plVar23 = lVar9;
          param_1[3] = (long)(plVar23 + 1);
        }
        *param_1 = (long)(pcVar24 + 1);
        local_70 = FUN_00c13140(param_1,lVar11 - lVar13 >> 3);
        lVar13 = FUN_00c19724(param_1,local_70);
        local_70._0_8_ = lVar13;
        goto LAB_00c170f8;
      }
      uVar19 = FUN_00c0ffd8(param_1,&DAT_002d2acd,2);
      if ((uVar19 & 1) != 0) {
        local_88 = (long *)FUN_00c10bfc(param_1);
        if (local_88 == (long *)0x0) {
          return (undefined8 *)0x0;
        }
        lVar13 = param_1[2];
        lVar11 = param_1[3];
        while ((pcVar24 = (char *)*param_1, pcVar24 == (char *)param_1[1] || (*pcVar24 != 'E'))) {
          local_70._0_8_ = FUN_00c187d8(param_1);
          if (local_70._0_8_ == 0) {
            return (undefined8 *)0x0;
          }
          FUN_00c12fcc(param_1 + 2,local_70);
        }
        *param_1 = (long)(pcVar24 + 1);
        local_70 = FUN_00c13140(param_1,lVar11 - lVar13 >> 3);
        puVar7 = (undefined8 *)FUN_00c197c0(param_1,&local_88,local_70);
        return puVar7;
      }
      uVar19 = FUN_00c0ffd8(param_1,&DAT_002cebd6,2);
      if ((uVar19 & 1) != 0) {
        puVar7 = (undefined8 *)FUN_00c1986c(param_1,"throw");
        return puVar7;
      }
      uVar19 = FUN_00c0ffd8(param_1,&DAT_002d2ad6,2);
      if ((uVar19 & 1) != 0) {
        local_70._0_8_ = FUN_00c16098(param_1);
        if (local_70._0_8_ == 0) {
          return (undefined8 *)0x0;
        }
        puVar7 = (undefined8 *)FUN_00c19918(param_1,local_70);
        return puVar7;
      }
      pcVar24 = (char *)*param_1;
      if ((pcVar24 == (char *)param_1[1]) || (*pcVar24 != 'u')) {
        puVar7 = (undefined8 *)FUN_00c199b8(param_1,sVar4 == 0x7367);
        return puVar7;
      }
      *param_1 = (long)(pcVar24 + 1);
      local_88 = (long *)FUN_00c14270(param_1);
      if (local_88 == (long *)0x0) {
        return (undefined8 *)0x0;
      }
      auVar30 = (**(code **)(*local_88 + 0x38))();
      if (((auVar30._8_8_ == 8) && (*auVar30._0_8_ == 0x666f646975755f5f)) &&
         (pcVar24 = (char *)*param_1, pcVar24 != (char *)param_1[1])) {
        if (*pcVar24 == 'z') {
          *param_1 = (long)(pcVar24 + 1);
          local_98._0_8_ = FUN_00c16098(param_1);
        }
        else {
          if (*pcVar24 != 't') goto LAB_00c171f0;
          *param_1 = (long)(pcVar24 + 1);
          local_98._0_8_ = FUN_00c10bfc(param_1);
        }
        if ((long *)local_98._0_8_ == (long *)0x0) {
          return (undefined8 *)0x0;
        }
        lVar13 = param_1[3] - param_1[2];
        FUN_00c12fcc(param_1 + 2,local_98);
      }
      else {
LAB_00c171f0:
        lVar13 = param_1[3] - param_1[2];
        while( true ) {
          pcVar24 = (char *)*param_1;
          if ((pcVar24 != (char *)param_1[1]) && (*pcVar24 == 'E')) break;
          local_70._0_8_ = FUN_00c12c94(param_1);
          if (local_70._0_8_ == 0) {
            return (undefined8 *)0x0;
          }
          FUN_00c12fcc(param_1 + 2,local_70);
        }
        *param_1 = (long)(pcVar24 + 1);
      }
      local_70 = FUN_00c13140(param_1,lVar13 >> 3);
      iVar16 = 1;
      pplVar15 = &local_88;
      local_44 = local_44 & 0xffffff00;
LAB_00c17010:
      local_78 = CONCAT44(local_78._4_4_,iVar16);
      puVar7 = (undefined8 *)FUN_00c17774(param_1,pplVar15,local_70,&local_44,&local_78);
      return puVar7;
    }
    if ((*pbVar18 == 0x70) ||
       (((uVar19 != 2 && (*pbVar18 == 0x4c)) && (0xfffffff5 < pbVar17[2] - 0x3a)))) {
      puVar7 = (undefined8 *)FUN_00c18414(param_1);
      return puVar7;
    }
    if ((pbVar17 != pbVar25) && (*param_1 = (long)pbVar18, pbVar25 != pbVar18)) {
      bVar2 = *pbVar18;
      if (bVar2 < 0x6c) {
        if (bVar2 == 0x4c) {
          bVar6 = true;
          bVar5 = true;
        }
        else {
          if (bVar2 != 0x52) {
            return (undefined8 *)0x0;
          }
          bVar6 = false;
          bVar5 = true;
        }
      }
      else if (bVar2 == 0x6c) {
        bVar5 = false;
        bVar6 = true;
      }
      else {
        if (bVar2 != 0x72) {
          return (undefined8 *)0x0;
        }
        bVar6 = false;
        bVar5 = false;
      }
      *param_1 = (long)(pbVar17 + 2);
      if (1 < (ulong)((long)pbVar25 - (long)(pbVar17 + 2))) {
        bVar2 = pbVar17[2];
        uVar19 = 0;
        uVar20 = 0x3e;
        do {
          uVar21 = uVar19 + uVar20 >> 1;
          if ((byte)(&UNK_00cb1618)[uVar21 * 0x10] < bVar2) {
            uVar19 = uVar21 + 1;
          }
          else if ((&UNK_00cb1618)[uVar21 * 0x10] == bVar2) {
            if ((byte)(&UNK_00cb1619)[uVar21 * 0x10] < pbVar17[3]) {
              uVar19 = uVar21 + 1;
              uVar21 = uVar20;
            }
            uVar20 = uVar21;
          }
          else {
            uVar20 = uVar21;
          }
        } while (uVar20 != uVar19);
        lVar13 = uVar19 * 0x10;
        if (((&UNK_00cb1618)[lVar13] == bVar2) && ((&UNK_00cb1619)[lVar13] == pbVar17[3])) {
          cVar3 = (&UNK_00cb161a)[lVar13];
          *param_1 = (long)(pbVar17 + 4);
          if ((cVar3 == '\x02') ||
             ((cVar3 == '\x04' &&
              (pcVar24 = *(char **)(&UNK_00cb1620 + lVar13), sVar8 = strlen(pcVar24),
              pcVar24[sVar8 - 1] == '*')))) {
            lVar11 = FUN_00c16098(param_1);
            if (lVar11 == 0) {
              return (undefined8 *)0x0;
            }
            if (bVar5) {
              lVar12 = FUN_00c16098(param_1);
              if (lVar12 == 0) {
                return (undefined8 *)0x0;
              }
              lVar1 = lVar12;
              lVar9 = lVar11;
              if (!bVar6) {
                lVar1 = lVar11;
                lVar9 = lVar12;
              }
              lVar11 = lVar1;
            }
            else {
              lVar9 = 0;
            }
            plVar23 = *(long **)(&UNK_00cb1620 + lVar13);
            sVar8 = strlen((char *)plVar23);
            if ((sVar8 < 8) || (*plVar23 != 0x726f74617265706f)) goto LAB_00c173e8;
            lVar13 = sVar8 - 8;
            plVar27 = plVar23 + 1;
            if ((lVar13 != 0) && ((char)*plVar27 == ' ')) {
              plVar27 = (long *)((long)plVar23 + 9);
              lVar13 = sVar8 - 9;
            }
            pvVar10 = (void *)param_1[0x266];
            lVar12 = *(long *)((long)pvVar10 + 8);
            puVar7 = pvVar10;
            if (lVar12 - 0xfb0U < 0xfffffffffffff00f || lVar12 == -0x41) {
              puVar7 = malloc(0x1000);
              if (puVar7 == (void *)0x0) goto LAB_00c1742c;
              lVar12 = 0;
              *puVar7 = pvVar10;
              puVar7[1] = 0;
              param_1[0x266] = (long)puVar7;
            }
            *(long *)((long)puVar7 + 8) = lVar12 + 0x40;
            puVar14 = (undefined8 *)((long)puVar7 + lVar12 + 0x10);
            *puVar14 = &PTR_LAB_00cb27b0;
            *(undefined1 *)((long)puVar7 + lVar12 + 0x18) = 0x47;
            *(long *)((long)puVar7 + lVar12 + 0x20) = lVar11;
            *(long *)((long)puVar7 + lVar12 + 0x28) = lVar9;
            *(long **)((long)puVar7 + lVar12 + 0x30) = plVar27;
            *(long *)((long)puVar7 + lVar12 + 0x38) = lVar13;
            *(ushort *)((long)puVar7 + lVar12 + 0x19) =
                 *(ushort *)((long)puVar7 + lVar12 + 0x19) & 0xf000 | 0x540;
            *(bool *)((long)puVar7 + lVar12 + 0x40) = bVar6;
            return puVar14;
          }
        }
      }
    }
    goto LAB_00c160cc;
  }
  plVar23 = *(long **)(&UNK_00cb1620 + lVar13);
  pbVar18 = pbVar17 + 2;
  *param_1 = (long)pbVar18;
  sVar8 = strlen((char *)plVar23);
  if ((byte)(&UNK_00cb161a)[lVar13] < 0xb) {
    if ((sVar8 < 8) || (*plVar23 != 0x726f74617265706f)) {
LAB_00c173e8:
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",0xbc1,
                   "operator name does not start with \'operator\'");
    }
    sVar29 = sVar8 - 8;
    plVar27 = plVar23 + 1;
    if (sVar29 != 0) {
      if ((char)*plVar27 == ' ') {
        plVar27 = (long *)((long)plVar23 + 9);
        sVar29 = sVar8 - 9;
      }
    }
  }
  else {
    plVar27 = plVar23;
    sVar29 = sVar8;
  }
  puVar7 = (undefined8 *)0x0;
  local_88 = plVar27;
  sStack_80 = sVar29;
  local_70._0_8_ = plVar27;
  local_70._8_8_ = sVar29;
  switch((&UNK_00cb161a)[lVar13]) {
  case 0:
    bVar2 = (&UNK_00cb161b)[lVar13];
    lVar13 = FUN_00c16098(param_1);
    puVar7 = (undefined8 *)0x0;
    if (lVar13 != 0) {
      pvVar10 = (void *)param_1[0x266];
      lVar11 = *(long *)((long)pvVar10 + 8);
      puVar14 = pvVar10;
      if (lVar11 - 0xfc0U < 0xfffffffffffff00f || lVar11 == -0x31) {
        puVar14 = malloc(0x1000);
        if (puVar14 == (void *)0x0) {
LAB_00c1742c:
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar11 = 0;
        *puVar14 = pvVar10;
        puVar14[1] = 0;
        param_1[0x266] = (long)puVar14;
      }
      *(long *)((long)puVar14 + 8) = lVar11 + 0x30;
      puVar7 = (undefined8 *)((long)puVar14 + lVar11 + 0x10);
      *puVar7 = &PTR_LAB_00cb1a90;
      *(undefined1 *)((long)puVar14 + lVar11 + 0x18) = 0x42;
      *(long **)((long)puVar14 + lVar11 + 0x20) = plVar27;
      *(size_t *)((long)puVar14 + lVar11 + 0x28) = sVar29;
      *(long *)((long)puVar14 + lVar11 + 0x30) = lVar13;
      *(ushort *)((long)puVar14 + lVar11 + 0x19) =
           *(ushort *)((long)puVar14 + lVar11 + 0x19) & 0xf000 | bVar2 >> 1 | 0x540;
    }
    break;
  case 1:
    if ((pbVar18 == pbVar25) || (*pbVar18 != 0x5f)) {
      local_70._0_8_ = FUN_00c16098(param_1);
      puVar7 = (undefined8 *)0x0;
      if (local_70._0_8_ != 0) {
        local_98._0_4_ = (int)(char)(&UNK_00cb161b)[lVar13] >> 1;
        puVar7 = (undefined8 *)FUN_00c17440(param_1,local_70,&local_88,local_98);
      }
    }
    else {
      cVar3 = (&UNK_00cb161b)[lVar13];
      *param_1 = (long)(pbVar17 + 3);
      local_78 = CONCAT44(local_78._4_4_,(int)cVar3 >> 1);
      local_98._0_8_ = FUN_00c16098(param_1);
      puVar7 = (undefined8 *)0x0;
      if ((long *)local_98._0_8_ != (long *)0x0) {
        puVar7 = (undefined8 *)FUN_00c1a5c4(param_1,local_70,local_98,&local_78);
      }
    }
    break;
  case 2:
    local_44 = (int)(char)(&UNK_00cb161b)[lVar13] >> 1;
    local_98._0_8_ = FUN_00c16098(param_1);
    puVar7 = (undefined8 *)0x0;
    if ((long *)local_98._0_8_ != (long *)0x0) {
      local_78 = FUN_00c16098(param_1);
      puVar7 = (undefined8 *)0x0;
      if (local_78 != 0) {
        puVar7 = (undefined8 *)FUN_00c19fe0(param_1,local_98,local_70,&local_78,&local_44);
      }
    }
    break;
  case 3:
    local_70._0_8_ = FUN_00c16098(param_1);
    puVar7 = (undefined8 *)0x0;
    if (local_70._0_8_ != 0) {
      local_98._0_8_ = FUN_00c16098(param_1);
      puVar7 = (undefined8 *)0x0;
      if ((long *)local_98._0_8_ != (long *)0x0) {
        local_78 = CONCAT44(local_78._4_4_,(int)(char)(&UNK_00cb161b)[lVar13] >> 1);
        puVar7 = (undefined8 *)FUN_00c17500(param_1,local_70,local_98,&local_78);
      }
    }
    break;
  case 4:
    local_70._0_8_ = FUN_00c16098(param_1);
    puVar7 = (undefined8 *)0x0;
    if (local_70._0_8_ != 0) {
      local_98._0_8_ = FUN_00c16098(param_1);
      puVar7 = (undefined8 *)0x0;
      if ((long *)local_98._0_8_ != (long *)0x0) {
        local_78 = CONCAT44(local_78._4_4_,(int)(char)(&UNK_00cb161b)[lVar13] >> 1);
        puVar7 = (undefined8 *)FUN_00c175bc(param_1,local_70,&local_88,local_98,&local_78);
      }
    }
    break;
  case 5:
    lVar11 = param_1[2];
    lVar9 = param_1[3];
    plVar23 = param_1 + 5;
    while ((pbVar18 == pbVar25 || (*pbVar18 != 0x5f))) {
      lVar12 = FUN_00c16098(param_1);
      if (lVar12 == 0) {
        return (undefined8 *)0x0;
      }
      plVar27 = (long *)param_1[3];
      if (plVar27 == (long *)param_1[4]) {
        plVar26 = (long *)param_1[2];
        sVar8 = (long)plVar27 - (long)plVar26;
        if (plVar26 == plVar23) {
          pvVar10 = malloc(sVar8 * 2);
          if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar27 != plVar23) {
            memmove(pvVar10,plVar26,sVar8);
          }
          param_1[2] = (long)pvVar10;
        }
        else {
          pvVar10 = realloc(plVar26,sVar8 * 2);
          param_1[2] = (long)pvVar10;
          if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar27 = (long *)((long)pvVar10 + sVar8);
        param_1[4] = (long)((long)pvVar10 + ((long)sVar8 >> 2) * 8);
      }
      *plVar27 = lVar12;
      pbVar18 = (byte *)*param_1;
      pbVar25 = (byte *)param_1[1];
      param_1[3] = (long)(plVar27 + 1);
    }
    *param_1 = (long)(pbVar18 + 1);
    local_70 = FUN_00c13140(param_1,lVar9 - lVar11 >> 3);
    local_78 = FUN_00c10bfc(param_1);
    if (local_78 == 0) {
      return (undefined8 *)0x0;
    }
    uVar19 = FUN_00c0ffd8(param_1,&DAT_002bed81,2);
    lVar11 = param_1[2];
    lVar9 = param_1[3];
    while( true ) {
      pcVar24 = (char *)*param_1;
      if ((pcVar24 != (char *)param_1[1]) && (*pcVar24 == 'E')) {
        *param_1 = (long)(pcVar24 + 1);
        local_98 = FUN_00c13140(param_1,lVar9 - lVar11 >> 3);
        local_9c[0] = (&UNK_00cb161b)[lVar13] & 1;
        local_44 = (int)(char)(&UNK_00cb161b)[lVar13] >> 1;
        puVar7 = (undefined8 *)
                 FUN_00c17688(param_1,local_70,&local_78,local_98,local_48,local_9c,&local_44);
        return puVar7;
      }
      if ((uVar19 & 1) == 0) break;
      lVar12 = FUN_00c16098(param_1);
      if (lVar12 == 0) {
        return (undefined8 *)0x0;
      }
      plVar27 = (long *)param_1[3];
      if (plVar27 == (long *)param_1[4]) {
        plVar26 = (long *)param_1[2];
        sVar8 = (long)plVar27 - (long)plVar26;
        if (plVar26 == plVar23) {
          pvVar10 = malloc(sVar8 * 2);
          if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar27 != plVar23) {
            memmove(pvVar10,plVar26,sVar8);
          }
          param_1[2] = (long)pvVar10;
        }
        else {
          pvVar10 = realloc(plVar26,sVar8 * 2);
          param_1[2] = (long)pvVar10;
          if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar27 = (long *)((long)pvVar10 + sVar8);
        param_1[4] = (long)((long)pvVar10 + ((long)sVar8 >> 2) * 8);
      }
      *plVar27 = lVar12;
      param_1[3] = (long)(plVar27 + 1);
    }
    goto LAB_00c160cc;
  case 6:
    lVar11 = FUN_00c16098(param_1);
    puVar7 = (undefined8 *)0x0;
    if (lVar11 != 0) {
      pvVar10 = (void *)param_1[0x266];
      bVar2 = (&UNK_00cb161b)[lVar13];
      lVar13 = *(long *)((long)pvVar10 + 8);
      puVar14 = pvVar10;
      if (lVar13 - 0xfd0U < 0xfffffffffffff00f || lVar13 == -0x21) {
        puVar14 = malloc(0x1000);
        if (puVar14 == (void *)0x0) goto LAB_00c1742c;
        lVar13 = 0;
        *puVar14 = pvVar10;
        puVar14[1] = 0;
        param_1[0x266] = (long)puVar14;
      }
      *(long *)((long)puVar14 + 8) = lVar13 + 0x20;
      puVar7 = (undefined8 *)((long)puVar14 + lVar13 + 0x10);
      *puVar7 = &PTR_LAB_00cb1ce8;
      *(undefined1 *)((long)puVar14 + lVar13 + 0x18) = 0x41;
      *(long *)((long)puVar14 + lVar13 + 0x20) = lVar11;
      *(undefined1 *)((long)puVar14 + lVar13 + 0x28) = uVar28;
      *(ushort *)((long)puVar14 + lVar13 + 0x19) =
           *(ushort *)((long)puVar14 + lVar13 + 0x19) & 0xf000 | bVar2 >> 1 | 0x540;
      *(byte *)((long)puVar14 + lVar13 + 0x29) = bVar2 & 1;
    }
    break;
  case 7:
    local_98._0_8_ = FUN_00c16098(param_1);
    puVar7 = (undefined8 *)0x0;
    if ((long *)local_98._0_8_ != (long *)0x0) {
      lVar11 = param_1[2];
      lVar9 = param_1[3];
      while( true ) {
        pcVar24 = (char *)*param_1;
        if ((pcVar24 != (char *)param_1[1]) && (*pcVar24 == 'E')) {
          *param_1 = (long)(pcVar24 + 1);
          local_70 = FUN_00c13140(param_1,lVar9 - lVar11 >> 3);
          pplVar15 = (long **)local_98;
          iVar16 = (int)(char)(&UNK_00cb161b)[lVar13] >> 1;
          local_44 = CONCAT31(local_44._1_3_,(&UNK_00cb161b)[lVar13]) & 0xffffff01;
          goto LAB_00c17010;
        }
        lVar12 = FUN_00c16098(param_1);
        puVar7 = (undefined8 *)0x0;
        if (lVar12 == 0) break;
        plVar23 = (long *)param_1[3];
        if (plVar23 == (long *)param_1[4]) {
          plVar27 = (long *)param_1[2];
          sVar8 = (long)plVar23 - (long)plVar27;
          if (plVar27 == param_1 + 5) {
            pvVar10 = malloc(sVar8 * 2);
            if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
            if (plVar23 != param_1 + 5) {
              memmove(pvVar10,plVar27,sVar8);
            }
            param_1[2] = (long)pvVar10;
          }
          else {
            pvVar10 = realloc(plVar27,sVar8 * 2);
            param_1[2] = (long)pvVar10;
            if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
          }
          plVar23 = (long *)((long)pvVar10 + sVar8);
          param_1[4] = (long)((long)pvVar10 + ((long)sVar8 >> 2) * 8);
        }
        *plVar23 = lVar12;
        param_1[3] = (long)(plVar23 + 1);
      }
    }
    break;
  case 8:
    lVar11 = param_1[0x61];
    *(undefined1 *)(param_1 + 0x61) = 0;
                    /* try { // try from 00c166e0 to 00c166e7 has its CatchHandler @ 00c17438 */
    local_98._0_8_ = FUN_00c10bfc(param_1);
    *(char *)(param_1 + 0x61) = (char)lVar11;
    if ((long *)local_98._0_8_ == (long *)0x0) {
      return (undefined8 *)0x0;
    }
    pcVar24 = (char *)*param_1;
    lVar11 = param_1[3] - param_1[2] >> 3;
    if ((pcVar24 == (char *)param_1[1]) || (*pcVar24 != '_')) {
      bVar5 = false;
    }
    else {
      bVar5 = true;
      *param_1 = (long)(pcVar24 + 1);
    }
    do {
      pcVar24 = (char *)*param_1;
      if ((pcVar24 != (char *)param_1[1]) && (*pcVar24 == 'E')) {
        *param_1 = (long)(pcVar24 + 1);
        local_70 = FUN_00c13140(param_1,lVar11);
        if (bVar5) goto LAB_00c170ac;
        goto LAB_00c170a4;
      }
      lVar9 = FUN_00c16098(param_1);
      if (lVar9 == 0) {
        return (undefined8 *)0x0;
      }
      plVar23 = (long *)param_1[3];
      if (plVar23 == (long *)param_1[4]) {
        plVar27 = (long *)param_1[2];
        sVar8 = (long)plVar23 - (long)plVar27;
        if (plVar27 == param_1 + 5) {
          pvVar10 = malloc(sVar8 * 2);
          if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar23 != param_1 + 5) {
            memmove(pvVar10,plVar27,sVar8);
          }
          param_1[2] = (long)pvVar10;
        }
        else {
          pvVar10 = realloc(plVar27,sVar8 * 2);
          param_1[2] = (long)pvVar10;
          if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar23 = (long *)((long)pvVar10 + sVar8);
        param_1[4] = (long)((long)pvVar10 + ((long)sVar8 >> 2) * 8);
      }
      *plVar23 = lVar9;
      param_1[3] = (long)(plVar23 + 1);
    } while (bVar5);
    local_70 = FUN_00c13140(param_1,lVar11);
LAB_00c170a4:
    if (local_70._8_8_ == 1) {
LAB_00c170ac:
      local_78 = CONCAT44(local_78._4_4_,(int)(char)(&UNK_00cb161b)[lVar13] >> 1);
      puVar7 = (undefined8 *)FUN_00c17840(param_1,local_98,local_70,&local_78);
      return puVar7;
    }
    goto LAB_00c160cc;
  case 9:
    local_70._0_8_ = FUN_00c16098(param_1);
    puVar7 = (undefined8 *)0x0;
    if (local_70._0_8_ != 0) {
      local_98._0_8_ = FUN_00c16098(param_1);
      puVar7 = (undefined8 *)0x0;
      if ((long *)local_98._0_8_ != (long *)0x0) {
        local_78 = FUN_00c16098(param_1);
        puVar7 = (undefined8 *)0x0;
        if (local_78 != 0) {
          local_44 = (int)(char)(&UNK_00cb161b)[lVar13] >> 1;
          puVar7 = (undefined8 *)FUN_00c17900(param_1,local_70,local_98,&local_78,&local_44);
        }
      }
    }
    break;
  case 10:
    break;
  case 0xb:
    local_70._0_8_ = FUN_00c10bfc(param_1);
    puVar7 = (undefined8 *)0x0;
    if (local_70._0_8_ != 0) {
      local_98._0_8_ = FUN_00c16098(param_1);
      puVar7 = (undefined8 *)0x0;
      if ((long *)local_98._0_8_ != (long *)0x0) {
        local_78 = CONCAT44(local_78._4_4_,(int)(char)(&UNK_00cb161b)[lVar13] >> 1);
        puVar7 = (undefined8 *)FUN_00c179c8(param_1,&local_88,local_70,local_98,&local_78);
      }
    }
    break;
  case 0xc:
    bVar2 = (&UNK_00cb161b)[lVar13];
    if ((bVar2 & 1) == 0) {
      lVar13 = FUN_00c16098(param_1);
    }
    else {
      lVar13 = FUN_00c10bfc(param_1);
    }
    if (lVar13 != 0) {
      pvVar10 = (void *)param_1[0x266];
      lVar11 = *(long *)((long)pvVar10 + 8);
      puVar7 = pvVar10;
      if (lVar11 - 0xfb0U < 0xfffffffffffff00f || lVar11 == -0x41) {
        puVar7 = malloc(0x1000);
        if (puVar7 == (void *)0x0) goto LAB_00c1742c;
        lVar11 = 0;
        *puVar7 = pvVar10;
        puVar7[1] = 0;
        param_1[0x266] = (long)puVar7;
      }
      *(long *)((long)puVar7 + 8) = lVar11 + 0x40;
      puVar14 = (undefined8 *)((long)puVar7 + lVar11 + 0x10);
      *puVar14 = &PTR_LAB_00cb1f40;
      *(undefined1 *)((long)puVar7 + lVar11 + 0x18) = 0x3c;
      *(long **)((long)puVar7 + lVar11 + 0x20) = plVar27;
      *(size_t *)((long)puVar7 + lVar11 + 0x28) = sVar29;
      *(undefined8 *)((long)puVar7 + lVar11 + 0x38) = 0;
      *(undefined8 *)((long)puVar7 + lVar11 + 0x40) = 0;
      *(long *)((long)puVar7 + lVar11 + 0x30) = lVar13;
      *(ushort *)((long)puVar7 + lVar11 + 0x19) =
           *(ushort *)((long)puVar7 + lVar11 + 0x19) & 0xf000 | bVar2 >> 1 | 0x540;
      return puVar14;
    }
LAB_00c160cc:
    puVar7 = (undefined8 *)0x0;
    break;
  default:
                    /* catch() { ... } // from try @ 00c166e0 with catch @ 00c17438 */
    *(char *)(param_1 + 0x61) = (char)plVar23;
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090();
  }
  return puVar7;
}

