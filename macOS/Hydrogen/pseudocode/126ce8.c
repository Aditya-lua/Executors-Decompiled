
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int * FUN_00126ce8(uint *param_1)

{
  long lVar1;
  uint uVar2;
  short sVar3;
  uint *puVar4;
  int iVar5;
  bool bVar6;
  bool bVar7;
  int iVar8;
  uint uVar9;
  int iVar10;
  int iVar11;
  undefined8 uVar12;
  ulong uVar13;
  char *pcVar14;
  int *piVar15;
  float *pfVar16;
  undefined4 uVar17;
  long lVar18;
  uint *puVar19;
  uint *puVar20;
  ulong uVar21;
  ulong uVar22;
  uint uVar23;
  undefined4 *puVar24;
  long lVar25;
  undefined8 *puVar26;
  float *pfVar27;
  uint uVar28;
  float *pfVar29;
  float *pfVar30;
  long lVar31;
  uint uVar32;
  long lVar33;
  ulong uVar34;
  ulong uVar35;
  float fVar36;
  float fVar37;
  float fVar38;
  float fVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  float fVar42;
  undefined8 uVar43;
  float fVar44;
  float fVar45;
  undefined8 uVar46;
  float fVar47;
  float fVar48;
  float fVar49;
  undefined1 auVar50 [12];
  uint uStack000000000000000c;
  undefined8 uStack0000000000000040;
  undefined4 uStack0000000000000048;
  float fStack000000000000004c;
  undefined8 in_stack_00000050;
  undefined4 uStack0000000000000058;
  undefined4 uStack000000000000005c;
  undefined1 uStack0000000000000060;
  undefined3 uStack0000000000000061;
  undefined5 uStack0000000000000064;
  undefined3 uStack0000000000000069;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined4 uStack0000000000000084;
  uint in_stack_00000088;
  int iStack000000000000008c;
  int iStack0000000000000090;
  float fStack0000000000000094;
  undefined8 uStack0000000000000098;
  float fStack00000000000000a0;
  int iStack00000000000000a8;
  float fStack00000000000000ac;
  undefined4 uStack00000000000000b0;
  long lStack00000000000000c0;
  
  lVar31 = lRam0000000000a334c0;
  lStack00000000000000c0 = *(long *)PTR____stack_chk_guard_009b01e8;
  *(undefined1 *)((long)param_1 + 0x73) = 0;
  uStack00000000000000b0 = 0;
  uStack0000000000000098 = 0;
  _iStack0000000000000090 = 0;
  _iStack00000000000000a8 = 0;
  _fStack00000000000000a0 = 0;
  uVar28 = *param_1;
  if ((int)uVar28 < 1) {
    uVar32 = 0;
    uVar9 = 0;
  }
  else {
    lVar18 = 0;
    uVar21 = 0;
    uVar9 = 0;
    uVar32 = 0;
    lVar25 = *(long *)(param_1 + 2);
    do {
      puVar19 = (uint *)(lVar25 + lVar18);
      if ((int)puVar19[2] < (int)param_1[10] || (char)puVar19[10] != '\0') {
        uVar23 = *puVar19;
        if (param_1[8] == uVar23) {
          param_1[8] = 0;
          if (param_1[6] != uVar23) goto LAB_00126dd0;
LAB_00126e64:
          param_1[6] = 0;
          uVar2 = param_1[7];
        }
        else {
          if (param_1[6] == uVar23) goto LAB_00126e64;
LAB_00126dd0:
          uVar2 = param_1[7];
        }
        if (uVar2 == uVar23) {
          param_1[7] = 0;
        }
      }
      else {
        if (uVar21 != uVar9) {
          puVar26 = (undefined8 *)(lVar25 + (long)(int)uVar9 * 0x2c);
          uVar46 = *(undefined8 *)(puVar19 + 2);
          uVar12 = *(undefined8 *)puVar19;
          uVar41 = *(undefined8 *)(puVar19 + 6);
          uVar40 = *(undefined8 *)(puVar19 + 4);
          uVar43 = *(undefined8 *)((long)puVar19 + 0x19);
          *(undefined8 *)((long)puVar26 + 0x21) = *(undefined8 *)((long)puVar19 + 0x21);
          *(undefined8 *)((long)puVar26 + 0x19) = uVar43;
          puVar26[1] = uVar46;
          *puVar26 = uVar12;
          puVar26[3] = uVar41;
          puVar26[2] = uVar40;
          lVar25 = *(long *)(param_1 + 2);
        }
        lVar33 = lVar25 + (long)(int)uVar9 * 0x2c;
        *(short *)(lVar33 + 0x26) = (short)uVar9;
        uVar28 = *(uint *)(lVar33 + 4);
        lVar33 = 1;
        if ((uVar28 & 0x80) != 0) {
          lVar33 = 2;
        }
        lVar1 = 0;
        if ((uVar28 & 0x40) == 0) {
          lVar1 = lVar33;
        }
        if (0 < (int)uVar9) {
          uVar2 = *(uint *)(lVar25 + (ulong)(uVar9 - 1) * 0x2c + 4);
          uVar23 = (uint)((uVar2 & 0x40) == 0) & uVar28 >> 6;
          if ((uVar2 & 0xc0) == 0x80 && (uVar28 & 0xc0) != 0x80) {
            uVar23 = 1;
          }
          uVar32 = uVar23 | uVar32;
        }
        *(int *)(&uStack0000000000000060 + lVar1 * 0xc + 0x30) =
             *(int *)(&uStack0000000000000060 + lVar1 * 0xc + 0x30) + 1;
        uVar9 = uVar9 + 1;
        uVar28 = *param_1;
      }
      uVar21 = uVar21 + 1;
      lVar18 = lVar18 + 0x2c;
    } while ((long)uVar21 < (long)(int)uVar28);
  }
  if (uVar28 != uVar9) {
    uVar28 = param_1[1];
    if ((int)uVar28 < (int)uVar9) {
      uVar23 = uVar28;
      if ((int)uVar28 < 0) {
        uVar23 = uVar28 + 1;
      }
      uVar2 = 8;
      if (uVar28 != 0) {
        uVar2 = uVar28 + ((int)uVar23 >> 1);
      }
      if ((int)uVar2 <= (int)uVar9) {
        uVar2 = uVar9;
      }
      uVar12 = func_0x000b810c((long)(int)uVar2 * 0x2c);
      if (*(long *)(param_1 + 2) != 0) {
        _memcpy(uVar12,*(long *)(param_1 + 2),(long)(int)*param_1 * 0x2c);
        func_0x000b83d4(*(undefined8 *)(param_1 + 2));
      }
      *(undefined8 *)(param_1 + 2) = uVar12;
      param_1[1] = uVar2;
    }
    *param_1 = uVar9;
  }
  if (1 < uVar9 && ((uVar32 ^ 0xffffffff) & 1) == 0) {
    _qsort(*(undefined8 *)(param_1 + 2),(long)(int)uVar9,0x2c,&DAT_0012a010);
  }
  iVar11 = iStack0000000000000090;
  uVar35 = _iStack0000000000000090 & 0xffffffff;
  uVar28 = uStack0000000000000098._4_4_;
  uVar34 = (ulong)uStack0000000000000098._4_4_;
  iVar5 = iStack00000000000000a8;
  uVar21 = _iStack00000000000000a8 & 0xffffffff;
  fVar45 = 0.0;
  fVar47 = 0.0;
  if ((0 < iStack0000000000000090) &&
     (0 < (int)(iStack00000000000000a8 + uStack0000000000000098._4_4_))) {
    fVar47 = *(float *)(&UNK_0000393c + lVar31);
  }
  uStack0000000000000098 = CONCAT44(uStack0000000000000098._4_4_,fVar47);
  if ((0 < (int)uStack0000000000000098._4_4_) && (0 < iStack00000000000000a8)) {
    fVar45 = *(float *)(&UNK_0000393c + lVar31);
  }
  _fStack00000000000000a0 = CONCAT44(fVar45,fStack00000000000000a0);
  fVar42 = (float)param_1[7];
  if (fVar42 != 0.0) {
    param_1[6] = (uint)fVar42;
    param_1[7] = 0;
  }
  if (param_1[0x1b] != 0) {
    uVar9 = *param_1;
    if (0 < (int)uVar9) {
      lVar18 = 0;
      puVar19 = *(uint **)(param_1 + 2);
      do {
        if (*puVar19 == param_1[0x1b]) {
          if ((puVar19[1] >> 5 & 1) == 0) {
            sVar3 = (short)param_1[0x1c];
            iVar8 = (int)(sVar3 - lVar18);
            if ((-1 < iVar8) && (iVar8 < (int)uVar9)) {
              puVar20 = *(uint **)(param_1 + 2) + (sVar3 - lVar18 & 0xffffffffU) * 0xb;
              if (((puVar20[1] >> 5 & 1) == 0) && (((puVar20[1] ^ puVar19[1]) & 0xc0) == 0)) {
                _uStack0000000000000048 = *(undefined8 *)(puVar19 + 2);
                uStack0000000000000040 = *(undefined8 *)puVar19;
                in_stack_00000050 = *(undefined8 *)(puVar19 + 4);
                uStack0000000000000058 = (undefined4)*(undefined8 *)(puVar19 + 6);
                uStack0000000000000064 = (undefined5)*(undefined8 *)(puVar19 + 9);
                uStack0000000000000069 = (undefined3)((ulong)*(undefined8 *)(puVar19 + 9) >> 0x28);
                uStack000000000000005c = (undefined4)*(undefined8 *)(puVar19 + 7);
                _uStack0000000000000060 = (undefined4)((ulong)*(undefined8 *)(puVar19 + 7) >> 0x20);
                iVar8 = (int)sVar3;
                puVar4 = puVar19 + 0xb;
                if (iVar8 < 1) {
                  puVar19 = puVar20 + 0xb;
                  puVar4 = puVar20;
                }
                uVar9 = -iVar8;
                if (-1 < iVar8) {
                  uVar9 = (uint)sVar3;
                }
                _memmove(puVar19,puVar4,(ulong)uVar9 * 0x2c);
                *(ulong *)((long)puVar20 + 0x21) =
                     CONCAT53(uStack0000000000000064,uStack0000000000000061);
                *(ulong *)((long)puVar20 + 0x19) =
                     CONCAT17(uStack0000000000000060,
                              CONCAT43(uStack000000000000005c,uStack0000000000000058._1_3_));
                *(ulong *)(puVar20 + 6) = CONCAT44(uStack000000000000005c,uStack0000000000000058);
                *(undefined8 *)(puVar20 + 4) = in_stack_00000050;
                *(undefined8 *)(puVar20 + 2) = _uStack0000000000000048;
                *(undefined8 *)puVar20 = uStack0000000000000040;
                if ((*(byte *)((long)param_1 + 0x12) >> 6 & 1) != 0) {
                  func_0x000dcdb0();
                }
                fVar36 = (float)param_1[0x1b];
                if (param_1[0x1b] != param_1[6]) {
                  fVar36 = fVar42;
                }
                fVar42 = fVar36;
              }
            }
          }
          break;
        }
        lVar18 = lVar18 + -1;
        puVar19 = puVar19 + 0xb;
      } while (-lVar18 != (ulong)uVar9);
    }
    param_1[0x1b] = 0;
  }
  lVar18 = lRam0000000000a334c0;
  if (((byte)param_1[4] >> 2 & 1) != 0) {
    lVar25 = *(long *)(lRam0000000000a334c0 + 0x4000);
    fVar36 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
    fVar38 = *(float *)(&UNK_00003928 + lRam0000000000a334c0);
    uVar12 = *(undefined8 *)(lVar25 + 0x110);
    uVar9 = param_1[0xc];
    *(float *)(lVar25 + 0x110) = (float)param_1[0xb] - fVar38;
    *(uint *)(lVar25 + 0x114) = uVar9;
    param_1[0xb] = (uint)(fVar36 + fVar38 + (float)param_1[0xb]);
    uStack0000000000000040 = *(undefined8 *)(&UNK_000039cc + lVar18);
    fStack000000000000004c = (float)((ulong)*(undefined8 *)(&UNK_000039d4 + lVar18) >> 0x20);
    uStack0000000000000048 = (undefined4)*(undefined8 *)(&UNK_000039d4 + lVar18);
    _uStack0000000000000048 = CONCAT44(fStack000000000000004c * 0.5,uStack0000000000000048);
    func_0x000bbcfc(0,&uStack0000000000000040);
    uStack0000000000000070 = 0;
    in_stack_00000078 = 0;
    func_0x000bbcfc(0x15,&uStack0000000000000070);
    uVar13 = func_0x0010e854("##v",0,0x50);
    func_0x000bbdd0(2);
    if ((uVar13 & 1) != 0) {
      uVar9 = *param_1;
      if (0 < (int)uVar9) {
        lVar33 = 0;
        lVar18 = 0;
        pfVar16 = (float *)0x0;
        do {
          pfVar30 = (float *)(*(long *)(param_1 + 2) + lVar33);
          pfVar29 = pfVar16;
          if ((*(byte *)((long)pfVar30 + 6) >> 5 & 1) == 0) {
            if (pfVar30[8] == -NAN) {
              pcVar14 = "N/A";
            }
            else {
              pcVar14 = (char *)(*(long *)(param_1 + 0x26) + (long)(int)pfVar30[8]);
            }
            uStack0000000000000070 = 0;
            iVar8 = func_0x0010f27c(pcVar14,(float)param_1[6] == *pfVar30,0,&uStack0000000000000070)
            ;
            pfVar29 = pfVar30;
            if (iVar8 == 0) {
              pfVar29 = pfVar16;
            }
            uVar9 = *param_1;
          }
          lVar18 = lVar18 + 1;
          lVar33 = lVar33 + 0x2c;
          pfVar16 = pfVar29;
        } while (lVar18 < (int)uVar9);
        func_0x000d9c4c();
        *(undefined8 *)(lVar25 + 0x110) = uVar12;
        if (pfVar29 != (float *)0x0) {
          fVar42 = *pfVar29;
          param_1[6] = (uint)fVar42;
        }
        goto LAB_001271e4;
      }
      func_0x000d9c4c();
    }
    *(undefined8 *)(lVar25 + 0x110) = uVar12;
  }
LAB_001271e4:
  uStack000000000000000c = iVar5 + iVar11;
  uStack0000000000000084 = 0;
  in_stack_00000088 = uStack000000000000000c;
  iStack000000000000008c = iVar11;
  uVar9 = *param_1;
  iVar8 = *(int *)(&UNK_00004ec4 + lVar31);
  uVar32 = uVar9;
  if (iVar8 < (int)uVar9) {
    iVar10 = iVar8;
    if (iVar8 < 0) {
      iVar10 = iVar8 + 1;
    }
    uVar32 = 8;
    if (iVar8 != 0) {
      uVar32 = iVar8 + (iVar10 >> 1);
    }
    if ((int)uVar32 <= (int)uVar9) {
      uVar32 = uVar9;
    }
    uVar12 = func_0x000b810c((long)(int)uVar32 * 0xc);
    if (*(long *)(&UNK_00004ec8 + lVar31) != 0) {
      _memcpy(uVar12,*(long *)(&UNK_00004ec8 + lVar31),(long)*(int *)(&UNK_00004ec0 + lVar31) * 0xc)
      ;
      func_0x000b83d4(*(undefined8 *)(&UNK_00004ec8 + lVar31));
    }
    *(undefined8 *)(&UNK_00004ec8 + lVar31) = uVar12;
    *(uint *)(&UNK_00004ec4 + lVar31) = uVar32;
    uVar32 = *param_1;
  }
  *(uint *)(&UNK_00004ec0 + lVar31) = uVar9;
  if ((int)uVar32 < 1) {
    bVar6 = false;
    pfVar16 = (float *)0x0;
    fVar48 = 0.0;
    fVar38 = 0.0;
    fVar36 = 0.0;
  }
  else {
    lVar25 = 0;
    lVar18 = 0;
    pfVar16 = (float *)0x0;
    bVar6 = false;
    uVar13 = 0xffffffff;
    do {
      lVar1 = lRam0000000000a334c0;
      lVar33 = *(long *)(param_1 + 2);
      pfVar30 = (float *)(lVar33 + lVar25);
      if ((pfVar16 == (float *)0x0) || ((int)pfVar16[3] < (int)pfVar30[3])) {
        pfVar29 = pfVar30;
        if ((*(byte *)((long)pfVar30 + 6) & 0x20) != 0) {
          pfVar29 = pfVar16;
        }
        bVar7 = *pfVar30 == (float)param_1[6];
        pfVar16 = pfVar29;
        fVar36 = *pfVar30;
        if (fVar42 == 0.0) goto LAB_00127348;
LAB_00127394:
        iVar8 = *(int *)(lVar33 + lVar25 + 0x20);
        if (iVar8 != -1) goto LAB_001273a4;
LAB_00127368:
        pcVar14 = "N/A";
        fVar36 = *(float *)(lVar33 + lVar25 + 0x1c);
      }
      else {
        bVar7 = *pfVar30 == (float)param_1[6];
        fVar36 = *pfVar30;
        if (fVar42 != 0.0) goto LAB_00127394;
LAB_00127348:
        fVar42 = fVar36;
        if (*(float *)(&UNK_00004b50 + lVar31) != fVar42) {
          fVar42 = 0.0;
        }
        iVar8 = *(int *)(lVar33 + lVar25 + 0x20);
        if (iVar8 == -1) goto LAB_00127368;
LAB_001273a4:
        pcVar14 = (char *)(*(long *)(param_1 + 0x26) + (long)iVar8);
        fVar36 = *(float *)(lVar33 + lVar25 + 0x1c);
      }
      if (fVar36 < 0.0) {
        uVar9 = *(uint *)(lVar33 + lVar25 + 4);
        fVar36 = (float)func_0x000bc968(0xbf800000,pcVar14,0,1);
        fVar38 = 1.0;
        if ((uVar9 & 0x100001) != 0x100000) {
          fVar38 = *(float *)(&UNK_0000393c + lVar1) + *(float *)(&UNK_00003d38 + lVar1);
        }
        fVar36 = fVar36 + *(float *)(&UNK_00003924 + lVar1) +
                 *(float *)(&UNK_00003924 + lVar1) + fVar38;
        if (*(float *)(&UNK_00003d38 + lRam0000000000a334c0) * 20.0 <= fVar36) {
          fVar36 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0) * 20.0;
        }
      }
      lVar33 = lVar33 + lVar25;
      *(float *)(lVar33 + 0x18) = fVar36;
      uVar9 = 1;
      if ((*(uint *)(lVar33 + 4) & 0x80) != 0) {
        uVar9 = 2;
      }
      if ((*(uint *)(lVar33 + 4) & 0x40) != 0) {
        uVar9 = 0;
      }
      uVar22 = (ulong)uVar9;
      fVar38 = 0.0;
      if (uVar9 == (uint)uVar13) {
        fVar38 = *(float *)(&UNK_0000393c + lVar31);
      }
      bVar6 = (bool)(bVar7 | bVar6);
      *(float *)(&uStack0000000000000060 + uVar22 * 0xc + 0x34) =
           *(float *)(&uStack0000000000000060 + uVar22 * 0xc + 0x34) + fVar36 + fVar38;
      iVar8 = *(int *)(&uStack0000000000000060 + uVar22 * 4 + 0x24);
      *(int *)(&uStack0000000000000060 + uVar22 * 4 + 0x24) = iVar8 + 1;
      puVar24 = (undefined4 *)(*(long *)(&UNK_00004ec8 + lVar31) + (long)iVar8 * 0xc);
      *puVar24 = (int)lVar18;
      *(ulong *)(puVar24 + 1) = CONCAT44(fVar36,fVar36);
      if (fVar36 <= 1.0) {
        fVar36 = 1.0;
      }
      *(float *)(lVar33 + 0x14) = fVar36;
      lVar18 = lVar18 + 1;
      uVar32 = *param_1;
      lVar25 = lVar25 + 0x2c;
      uVar13 = uVar22;
    } while (lVar18 < (int)uVar32);
    fVar36 = fStack0000000000000094;
    fVar38 = fStack00000000000000a0;
    fVar48 = fStack00000000000000ac;
  }
  fVar36 = fVar36 + fVar47;
  fVar48 = fVar48 + 0.0;
  pfVar30 = (float *)(param_1 + 0xb);
  fVar39 = fVar36 + 0.0 + fVar38 + fVar45 + fVar48;
  param_1[0x12] = (uint)fVar39;
  lVar18 = lRam0000000000a334c0;
  pfVar29 = (float *)(param_1 + 0xd);
  fVar37 = *pfVar29;
  if (((1 < (int)uVar32) && (fVar37 - *pfVar30 < fVar39)) && ((param_1[4] & 0x90) == 0x80)) {
    lVar25 = *(long *)(lRam0000000000a334c0 + 0x4000);
    fVar39 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0) + -2.0;
    fVar44 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0) +
             *(float *)(&UNK_00003928 + lRam0000000000a334c0) * 2.0;
    fVar49 = fVar39 + fVar39;
    uStack0000000000000040 = *(undefined8 *)(&UNK_000039cc + lRam0000000000a334c0);
    uVar12 = *(undefined8 *)(lVar25 + 0x110);
    fStack000000000000004c =
         (float)((ulong)*(undefined8 *)(&UNK_000039d4 + lRam0000000000a334c0) >> 0x20);
    uStack0000000000000048 = (undefined4)*(undefined8 *)(&UNK_000039d4 + lRam0000000000a334c0);
    _uStack0000000000000048 = CONCAT44(fStack000000000000004c * 0.5,uStack0000000000000048);
    func_0x000bbcfc(0,&uStack0000000000000040);
    uStack0000000000000070 = 0;
    in_stack_00000078 = 0;
    func_0x000bbcfc(0x15,&uStack0000000000000070);
    uVar46 = *(undefined8 *)(lVar18 + 0x70);
    *(undefined8 *)(lVar18 + 0x70) = _UNK_00813268;
    fVar37 = (float)param_1[0xb];
    if ((float)param_1[0xb] < (float)param_1[0xd] - fVar49) {
      fVar37 = (float)param_1[0xd] - fVar49;
    }
    uVar9 = param_1[0xc];
    *(float *)(lVar25 + 0x110) = fVar37;
    *(uint *)(lVar25 + 0x114) = uVar9;
    uVar9 = func_0x0010bff4(fVar39,fVar44,"##<",0,0x410);
    iVar8 = -(uVar9 & 1);
    uVar9 = param_1[0xc];
    *(float *)(lVar25 + 0x110) = fVar39 + fVar37;
    *(uint *)(lVar25 + 0x114) = uVar9;
    iVar10 = func_0x0010bff4(fVar39,fVar44,"##>",1,0x410);
    if (iVar10 != 0) {
      iVar8 = 1;
    }
    func_0x000bbdd0(2);
    *(undefined8 *)(lVar18 + 0x70) = uVar46;
    if ((iVar8 != 0) && (param_1[6] != 0)) {
      uVar9 = *param_1;
      if (0 < (int)uVar9) {
        uVar13 = 0;
        puVar20 = *(uint **)(param_1 + 2);
        puVar19 = puVar20;
        do {
          if (*puVar19 == param_1[6]) {
            goto LAB_00127d64;
          }
          uVar13 = uVar13 + 1;
          puVar19 = puVar19 + 0xb;
        } while (uVar9 != uVar13);
      }
    }
    *(undefined8 *)(lVar25 + 0x110) = uVar12;
    fVar37 = *pfVar29 - (fVar49 + 1.0);
    *pfVar29 = fVar37;
  }
  goto LAB_00127698;
  while ((iVar10 = iVar8 * 2 + uVar23, -1 < iVar10 &&
         (uVar13 = (ulong)(uVar23 + iVar8), iVar10 < (int)uVar9))) {
LAB_00127d64:
    uVar23 = (uint)uVar13;
    uVar32 = iVar8 + uVar23;
    if ((int)uVar9 <= (int)uVar32 || 0x7fffffff < uVar32) {
      uVar32 = uVar23;
    }
    if ((*(byte *)((long)puVar20 + (long)(int)uVar32 * 0x2c + 6) >> 5 & 1) == 0) {
      *(undefined8 *)(lVar25 + 0x110) = uVar12;
      fVar37 = *pfVar29 - (fVar49 + 1.0);
      *pfVar29 = fVar37;
      goto LAB_00127de8;
    }
  }
  *(undefined8 *)(lVar25 + 0x110) = uVar12;
  fVar37 = *pfVar29 - (fVar49 + 1.0);
  *pfVar29 = fVar37;
  if (puVar20 != (uint *)0x0) {
LAB_00127de8:
    fVar42 = (float)puVar20[(long)(int)uVar32 * 0xb];
    if ((*(byte *)((long)puVar20 + (long)(int)uVar32 * 0x2c + 6) >> 5 & 1) == 0) {
      param_1[6] = (uint)fVar42;
    }
  }
LAB_00127698:
  fVar39 = fVar36 + fVar48;
  fVar37 = fVar37 - *pfVar30;
  if (fVar39 < fVar37) {
    fVar36 = (fVar38 + fVar45) - ((fVar37 - fVar36) - fVar48);
    if (0.0 <= fVar36) goto LAB_001276c8;
  }
  else {
    fVar36 = fVar39 - fVar37;
LAB_001276c8:
    if ((1.0 <= fVar36) && (fVar37 <= fVar39 || (param_1[4] & 0x40) != 0)) {
      uVar9 = uStack000000000000000c;
      if (fVar39 < fVar37) {
        uVar9 = uVar28;
      }
      uVar32 = 0;
      if (fVar39 < fVar37) {
        uVar32 = uStack000000000000000c;
      }
      func_0x0010e560(*(long *)(&UNK_00004ec8 + lVar31) + (long)(int)uVar32 * 0xc,uVar9);
      if (0 < (int)uVar9) {
        lVar18 = (long)(int)uVar32;
        pfVar27 = (float *)(*(long *)(&UNK_00004ec8 + lVar31) + (long)(int)uVar32 * 0xc + 4);
        do {
          if (-1 < (int)*pfVar27) {
            fVar38 = (float)(int)*pfVar27;
            fVar36 = 1.0;
            if (1.0 < fVar38) {
              fVar36 = fVar38;
            }
            lVar33 = *(long *)(param_1 + 2) + (long)(int)pfVar27[-1] * 0x2c;
            lVar25 = 1;
            if ((*(uint *)(lVar33 + 4) & 0x80) != 0) {
              lVar25 = 2;
            }
            if ((*(uint *)(lVar33 + 4) & 0x40) != 0) {
              lVar25 = 0;
            }
            *(float *)(&uStack0000000000000060 + lVar25 * 0xc + 0x34) =
                 *(float *)(&uStack0000000000000060 + lVar25 * 0xc + 0x34) -
                 (*(float *)(lVar33 + 0x14) - fVar36);
            *(float *)(lVar33 + 0x14) = fVar36;
          }
          lVar18 = lVar18 + 1;
          pfVar27 = pfVar27 + 3;
        } while (lVar18 < (int)(uVar32 + uVar9));
      }
    }
  }
  fVar36 = 0.0;
  if (0 < iVar11) {
    uVar13 = 0;
    puVar24 = (undefined4 *)(*(long *)(param_1 + 2) + 0x20);
    do {
      puVar24[-4] = fVar36;
      *puVar24 = 0xffffffff;
      fVar38 = 0.0;
      if (uVar13 < iVar11 - 1) {
        fVar38 = *(float *)(&UNK_0000393c + lVar31);
      }
      fVar36 = fVar36 + (float)puVar24[-3] + fVar38;
      uVar13 = uVar13 + 1;
      puVar24 = puVar24 + 0xb;
    } while (uVar35 != uVar13);
  }
  fVar38 = fStack0000000000000094;
  fVar48 = fStack0000000000000094 + fVar47 + 0.0;
  if (fStack0000000000000094 + fVar47 < 0.0) {
    fVar48 = 0.0;
  }
  fVar36 = fVar36 + fVar47;
  if (0 < (int)uVar28) {
    uVar35 = 0;
    puVar24 = (undefined4 *)(*(long *)(param_1 + 2) + (long)iVar11 * 0x2c + 0x20);
    do {
      puVar24[-4] = fVar36;
      *puVar24 = 0xffffffff;
      fVar37 = 0.0;
      if (uVar35 < uVar28 - 1) {
        fVar37 = *(float *)(&UNK_0000393c + lVar31);
      }
      fVar36 = fVar36 + (float)puVar24[-3] + fVar37;
      uVar35 = uVar35 + 1;
      puVar24 = puVar24 + 0xb;
    } while (uVar34 != uVar35);
  }
  fVar37 = fStack00000000000000a0 + fVar45;
  if (fVar37 < 0.0) {
    fVar37 = 0.0;
  }
  fVar39 = fStack00000000000000ac;
  if (0 < iVar5) {
    uVar34 = 0;
    fVar49 = ((float)param_1[0xd] - (float)param_1[0xb]) - fStack00000000000000ac;
    fVar44 = 0.0;
    if (0.0 < fVar49) {
      fVar44 = fVar49;
    }
    if (fVar36 + fVar45 <= fVar44) {
      fVar44 = fVar36 + fVar45;
    }
    puVar24 = (undefined4 *)(*(long *)(param_1 + 2) + (long)(int)(uVar28 + iVar11) * 0x2c + 0x20);
    do {
      puVar24[-4] = fVar44;
      *puVar24 = 0xffffffff;
      fVar36 = 0.0;
      if (uVar34 < iVar5 - 1) {
        fVar36 = *(float *)(&UNK_0000393c + lVar31);
      }
      fVar44 = fVar44 + (float)puVar24[-3] + fVar36;
      uVar34 = uVar34 + 1;
      puVar24 = puVar24 + 0xb;
    } while (uVar21 != uVar34);
  }
  fVar36 = fStack00000000000000ac + 0.0;
  if (fVar36 < 0.0) {
    fVar36 = 0.0;
  }
  param_1[0x11] = (uint)(fVar48 + fVar37 + fVar36);
  if ((int)param_1[0x25] < 0) {
    uVar12 = func_0x000b810c(0);
    if (*(long *)(param_1 + 0x26) != 0) {
      _memcpy(uVar12,*(long *)(param_1 + 0x26),(long)(int)param_1[0x24]);
      func_0x000b83d4(*(undefined8 *)(param_1 + 0x26));
    }
    param_1[0x24] = 0;
    param_1[0x25] = 0;
    *(undefined8 *)(param_1 + 0x26) = uVar12;
    if (!bVar6) goto LAB_001279d0;
LAB_00127978:
    fVar36 = (float)param_1[6];
    if ((float)param_1[6] == 0.0) {
      uVar28 = param_1[7];
      goto joined_r0x00127988;
    }
  }
  else {
    param_1[0x24] = 0;
    if (bVar6) goto LAB_00127978;
LAB_001279d0:
    param_1[6] = 0;
    uVar28 = param_1[7];
joined_r0x00127988:
    fVar36 = 0.0;
    if ((uVar28 == 0) && (fVar36 = 0.0, pfVar16 != (float *)0x0)) {
      fVar42 = *pfVar16;
      param_1[6] = (uint)fVar42;
      fVar36 = fVar42;
    }
  }
  param_1[8] = (uint)fVar36;
  *(undefined1 *)(param_1 + 0x1d) = 0;
  if (fVar42 == 0.0) {
    if ((((char)param_1[4] < '\0') && (iVar11 = func_0x000c2af4(pfVar30,pfVar29,1), iVar11 != 0)) &&
       (iVar11 = func_0x000c25a4(*(undefined8 *)(lVar31 + 0x4000),0), iVar11 != 0)) {
      lVar18 = 0xe54;
      if ((&UNK_0000388d)[lVar31] != '\0') {
        lVar18 = 0xe50;
      }
      fVar42 = *(float *)(lVar31 + lVar18);
      uVar17 = 0x294;
      if ((&UNK_0000388d)[lVar31] != '\0') {
        uVar17 = 0x295;
      }
      iVar11 = func_0x000d6770(uVar17,param_1[5]);
      if ((iVar11 != 0) && (fVar42 != 0.0)) {
        param_1[0x15] = 0;
        fVar42 = (float)param_1[0x14] +
                 (fVar42 * (((((float)param_1[0xd] - (float)param_1[0xb]) - fVar38) - fVar39) -
                           fVar45)) / -3.0;
        fVar36 = (float)param_1[0x11] - ((float)param_1[0xd] - (float)param_1[0xb]);
        if (fVar36 <= fVar42) {
          fVar42 = fVar36;
        }
        if (fVar42 < 0.0) {
          fVar42 = 0.0;
        }
        param_1[0x14] = (uint)fVar42;
      }
      func_0x000c95f8(uVar17,param_1[5],0);
    }
  }
  else {
    uVar28 = *param_1;
    if (0 < (int)uVar28) {
      uVar21 = 0;
      pfVar16 = (float *)(*(long *)(param_1 + 2) + 0x14);
      do {
        if (pfVar16[-5] == fVar42) {
          if (((uint)pfVar16[-4] & 0xc0) != 0) break;
          fVar48 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
          fVar36 = ((((float)param_1[0xd] - (float)param_1[0xb]) - fVar38) - fVar39) - fVar45;
          fVar42 = -0.0;
          if (iVar11 <= (int)uVar21) {
            fVar42 = fVar48;
          }
          fVar42 = (pfVar16[-1] - fVar38) - fVar42;
          if ((int)(uVar28 - iVar5) <= (int)uVar21 + 1) {
            fVar48 = 1.0;
          }
          fVar48 = (pfVar16[-1] - fVar38) + *pfVar16 + fVar48;
          param_1[0x15] = 0;
          bVar6 = false;
          bVar7 = false;
          if ((float)param_1[0x14] <= fVar42) {
            bVar6 = false;
            bVar7 = true;
            if (!NAN(fVar48 - fVar42) && !NAN(fVar36)) {
              bVar6 = fVar48 - fVar42 < fVar36;
              bVar7 = false;
            }
          }
          if (bVar6 == bVar7) {
            fVar36 = (float)param_1[0x13];
            fVar37 = fVar42;
          }
          else {
            fVar37 = fVar48 - fVar36;
            if (fVar37 <= (float)param_1[0x14]) break;
            fVar36 = fVar42 - fVar36;
            fVar48 = (float)param_1[0x13];
          }
          fVar36 = fVar36 - fVar48;
          if (fVar36 < 0.0) {
            fVar36 = 0.0;
          }
          param_1[0x14] = (uint)fVar37;
          param_1[0x15] = (uint)fVar36;
          break;
        }
        pfVar16 = pfVar16 + 0xb;
        uVar21 = uVar21 + 1;
      } while (uVar28 != uVar21);
    }
  }
  fVar42 = (float)param_1[0x11] - ((float)param_1[0xd] - (float)param_1[0xb]);
  uVar21 = *(ulong *)(param_1 + 0x13);
  uVar21 = CONCAT44(fVar42,fVar42) ^
           (CONCAT44(fVar42,fVar42) ^ uVar21) &
           CONCAT44(-(uint)((float)(uVar21 >> 0x20) < fVar42),-(uint)((float)uVar21 < fVar42));
  uVar21 = uVar21 & CONCAT44(-(uint)(0.0 <= (float)(uVar21 >> 0x20)),-(uint)(0.0 <= (float)uVar21));
  *(ulong *)(param_1 + 0x13) = uVar21;
  fVar36 = (float)(uVar21 >> 0x20);
  fVar42 = (float)uVar21;
  if (fVar42 == fVar36) {
    param_1[0x16] = 0;
    goto LAB_00127c64;
  }
  fVar37 = *(float *)(&UNK_00003d38 + lVar31);
  fVar44 = fVar37 * 70.0;
  fVar48 = (float)param_1[0x16];
  if ((float)param_1[0x16] < fVar44) {
    fVar48 = fVar44;
  }
  fVar44 = ABS(fVar36 - fVar42) / 0.3;
  if (fVar48 < fVar44) {
    fVar48 = fVar44;
  }
  param_1[0x16] = (uint)fVar48;
  if ((*(int *)(&UNK_00003f58 + lVar31) <= (int)(param_1[10] + 1)) &&
     ((float)param_1[0x15] <= fVar37 * 10.0)) {
    fVar48 = fVar48 * *(float *)(lVar31 + 0x18);
    if (fVar42 < fVar36) {
      fVar42 = fVar42 + fVar48;
      if (fVar36 <= fVar42) {
        fVar42 = fVar36;
      }
      param_1[0x13] = (uint)fVar42;
      goto LAB_00127c64;
    }
    if (fVar42 <= fVar36) {
      param_1[0x13] = (uint)fVar42;
      goto LAB_00127c64;
    }
    fVar42 = fVar42 - fVar48;
    if (fVar42 < fVar36) {
      fVar42 = fVar36;
    }
    fVar36 = fVar42;
  }
  param_1[0x13] = (uint)fVar36;
LAB_00127c64:
  param_1[0x17] = (uint)(fVar47 + (float)param_1[0xb] + fVar38);
  param_1[0x18] = (uint)(((float)param_1[0xd] - fVar39) - fVar45);
  lVar31 = *(long *)(lVar31 + 0x4000);
  *(undefined8 *)(lVar31 + 0x110) = *(undefined8 *)(param_1 + 0xb);
  uStack0000000000000040 = CONCAT44((float)param_1[0xe] - (float)param_1[0xc],param_1[0x11]);
  piVar15 = (int *)func_0x000d0d0c(param_1[0x21],&uStack0000000000000040);
  fVar45 = *(float *)(lVar31 + 0x130);
  if (*(float *)(lVar31 + 0x130) < (float)param_1[0xb] + (float)param_1[0x12]) {
    fVar45 = (float)param_1[0xb] + (float)param_1[0x12];
  }
  *(float *)(lVar31 + 0x130) = fVar45;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack00000000000000c0) {
    return piVar15;
  }
  auVar50 = ___stack_chk_fail();
  if ((auVar50._8_4_ != 0) && (uVar28 = *auVar50._0_8_, uVar21 = (ulong)uVar28, 0 < (int)uVar28)) {
    piVar15 = *(int **)(auVar50._0_8_ + 2);
    do {
      if (*piVar15 == auVar50._8_4_) {
        return piVar15;
      }
      piVar15 = piVar15 + 0xb;
      uVar21 = uVar21 - 1;
    } while (uVar21 != 0);
  }
  return (int *)0x0;
}

