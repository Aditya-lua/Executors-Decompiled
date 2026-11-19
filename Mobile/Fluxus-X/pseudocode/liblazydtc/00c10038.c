/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c10038
 */

undefined8 * FUN_00c10038(long *param_1)

{
  byte bVar1;
  char cVar2;
  undefined1 uVar3;
  uint uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  bool bVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  long lVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  long extraout_x1;
  long lVar16;
  char *pcVar17;
  byte *pbVar18;
  long lVar19;
  char *pcVar20;
  long lVar21;
  ushort uVar22;
  byte *pbVar23;
  long *plVar24;
  long lVar25;
  ulong uVar26;
  void *pvVar27;
  undefined8 uVar28;
  size_t sVar29;
  long *plVar30;
  undefined1 auVar31 [16];
  undefined1 local_130 [16];
  undefined8 local_120;
  undefined1 local_118;
  ulong local_110;
  byte local_108;
  undefined1 auStack_100 [160];
  
  FUN_00c123b0(auStack_100,param_1);
  auVar31._8_8_ = local_130._8_8_;
  auVar31._0_8_ = local_130._0_8_;
  pcVar17 = (char *)*param_1;
  pcVar20 = (char *)param_1[1];
  if (pcVar20 == pcVar17) {
LAB_00c10104:
    local_120 = (local_120 >> 0x10 & 0xffff) << 0x10;
    local_118 = 0;
    local_110 = param_1[0x5b] - param_1[0x5a] >> 3;
    local_108 = 0;
                    /* try { // try from 00c10128 to 00c10133 has its CatchHandler @ 00c10aa8 */
    puVar12 = (undefined8 *)FUN_00c12574(param_1,&local_120);
    puVar11 = puVar12;
    if (puVar12 == (undefined8 *)0x0) goto LAB_00c10998;
    lVar16 = param_1[0x5a];
    uVar10 = param_1[0x5b] - lVar16 >> 3;
    lVar13 = uVar10 - local_110;
    if (local_110 <= uVar10 && lVar13 != 0) {
      if (((undefined8 *)param_1[0x53] == (undefined8 *)param_1[0x54]) ||
         (plVar24 = *(long **)param_1[0x53], plVar24 == (long *)0x0)) goto LAB_00c10994;
      lVar21 = *plVar24;
      lVar19 = plVar24[1];
      plVar24 = (long *)(lVar16 + local_110 * 8);
      do {
        lVar25 = *plVar24;
        uVar26 = *(ulong *)(lVar25 + 0x10);
        if ((ulong)(lVar19 - lVar21 >> 3) <= uVar26) goto LAB_00c10994;
        lVar13 = lVar13 + -1;
        plVar24 = plVar24 + 1;
        *(undefined8 *)(lVar25 + 0x18) = *(undefined8 *)(lVar21 + uVar26 * 8);
      } while (lVar13 != 0);
    }
    if (uVar10 < local_110) {
                    /* try { // try from 00c10a50 to 00c10a6f has its CatchHandler @ 00c10aa8 */
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",0x86,
                   "shrinkToSize() can\'t expand!");
    }
    pbVar18 = (byte *)*param_1;
    pbVar23 = (byte *)param_1[1];
    param_1[0x5b] = lVar16 + local_110 * 8;
    if ((pbVar23 == pbVar18) ||
       ((*pbVar18 - 0x2e < 0x32 &&
        ((1L << ((ulong)(*pbVar18 - 0x2e) & 0x3f) & 0x2000000800001U) != 0)))) goto LAB_00c10998;
    if (((ulong)((long)pbVar23 - (long)pbVar18) < 0xd) ||
       (*(long *)pbVar18 != 0x6c62616e65396155 || *(long *)(pbVar18 + 5) != 0x4966695f656c6261)) {
      uVar28 = 0;
joined_r0x00c107a4:
      if (((local_120 & 1) == 0) &&
         (local_120._1_1_ = (char)(local_120 >> 8), local_120._1_1_ == '\x01')) {
                    /* try { // try from 00c10240 to 00c10247 has its CatchHandler @ 00c10a94 */
        lVar13 = FUN_00c10bfc(param_1);
        if (lVar13 == 0) goto LAB_00c10994;
      }
      else {
        lVar13 = 0;
      }
      pcVar17 = (char *)*param_1;
      pcVar20 = (char *)param_1[1];
      if ((pcVar17 == pcVar20) || (*pcVar17 != 'v')) {
        lVar16 = param_1[2];
        lVar21 = param_1[3];
        do {
                    /* try { // try from 00c10804 to 00c1080b has its CatchHandler @ 00c10a9c */
          puVar11 = (undefined8 *)FUN_00c10bfc(param_1);
          if (puVar11 == (undefined8 *)0x0) goto LAB_00c10994;
          plVar24 = (long *)param_1[3];
          puVar15 = puVar11;
          if ((lVar21 - lVar16 == (long)plVar24 - param_1[2]) && ((local_108 & 1) != 0)) {
            pvVar27 = (void *)param_1[0x266];
            lVar19 = *(long *)((long)pvVar27 + 8);
            puVar14 = pvVar27;
            if (lVar19 - 0xfd0U < 0xfffffffffffff00f || lVar19 == -0x21) {
              puVar14 = malloc(0x1000);
              if (puVar14 == (void *)0x0) goto LAB_00c10a70;
              lVar19 = 0;
              *puVar14 = pvVar27;
              puVar14[1] = 0;
              param_1[0x266] = (long)puVar14;
            }
            *(long *)((long)puVar14 + 8) = lVar19 + 0x20;
            puVar15 = (undefined8 *)((long)puVar14 + lVar19 + 0x10);
            *puVar15 = &PTR_LAB_00cb37a0;
            *(undefined1 *)((long)puVar14 + lVar19 + 0x18) = 0x57;
            *(undefined8 **)((long)puVar14 + lVar19 + 0x20) = puVar11;
            *(ushort *)((long)puVar14 + lVar19 + 0x19) =
                 *(ushort *)((long)puVar14 + lVar19 + 0x19) & 0xf000 | 0x540;
            plVar24 = (long *)param_1[3];
          }
          if (plVar24 == (long *)param_1[4]) {
            plVar30 = (long *)param_1[2];
            sVar29 = (long)plVar24 - (long)plVar30;
            if (plVar30 == param_1 + 5) {
              pvVar27 = malloc(sVar29 * 2);
              if (pvVar27 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
                abort();
              }
              if (plVar24 != param_1 + 5) {
                memmove(pvVar27,plVar30,sVar29);
              }
              param_1[2] = (long)pvVar27;
            }
            else {
              pvVar27 = realloc(plVar30,sVar29 * 2);
              param_1[2] = (long)pvVar27;
              if (pvVar27 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
                abort();
              }
            }
            plVar24 = (long *)((long)pvVar27 + sVar29);
            param_1[4] = (long)((long)pvVar27 + ((long)sVar29 >> 2) * 8);
          }
          *plVar24 = (long)puVar15;
          param_1[3] = (long)(plVar24 + 1);
        } while (((byte *)param_1[1] != (byte *)*param_1) &&
                ((uVar4 = *(byte *)*param_1 - 0x2e, 0x31 < uVar4 ||
                 ((1L << ((ulong)uVar4 & 0x3f) & 0x2000800800001U) == 0))));
                    /* try { // try from 00c1093c to 00c10947 has its CatchHandler @ 00c10a98 */
        auVar31 = FUN_00c13140(param_1,lVar21 - lVar16 >> 3);
        pcVar17 = (char *)*param_1;
        pcVar20 = (char *)param_1[1];
      }
      else {
        auVar31 = ZEXT816(0);
        pcVar17 = pcVar17 + 1;
        *param_1 = (long)pcVar17;
      }
      if ((pcVar17 == pcVar20) || (*pcVar17 != 'Q')) {
        lVar16 = 0;
      }
      else {
        uVar3 = *(undefined1 *)((long)param_1 + 0x30a);
        *param_1 = (long)(pcVar17 + 1);
        *(undefined1 *)((long)param_1 + 0x30a) = 1;
                    /* try { // try from 00c10980 to 00c10987 has its CatchHandler @ 00c10a88 */
        lVar16 = FUN_00c16098(param_1);
        *(undefined1 *)((long)param_1 + 0x30a) = uVar3;
        if (lVar16 == 0) goto LAB_00c10994;
      }
      pvVar27 = (void *)param_1[0x266];
      lVar21 = *(long *)((long)pvVar27 + 8);
      puVar15 = pvVar27;
      if (lVar21 - 4000U < 0xfffffffffffff00f || lVar21 == -0x51) {
        puVar15 = malloc(0x1000);
        if (puVar15 == (void *)0x0) {
LAB_00c10a70:
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar21 = 0;
        *puVar15 = pvVar27;
        puVar15[1] = 0;
        param_1[0x266] = (long)puVar15;
      }
      *(long *)((long)puVar15 + 8) = lVar21 + 0x50;
      puVar11 = (undefined8 *)((long)puVar15 + lVar21 + 0x10);
      *puVar11 = &PTR_LAB_00cb3818;
      *(undefined1 *)((long)puVar15 + lVar21 + 0x18) = 0x13;
      *(long *)((long)puVar15 + lVar21 + 0x20) = lVar13;
      *(undefined8 **)((long)puVar15 + lVar21 + 0x28) = puVar12;
      *(undefined1 (*) [16])((long)puVar15 + lVar21 + 0x30) = auVar31;
      *(ushort *)((long)puVar15 + lVar21 + 0x19) =
           *(ushort *)((long)puVar15 + lVar21 + 0x19) & 0xf000 | 0x100;
      *(undefined8 *)((long)puVar15 + lVar21 + 0x40) = uVar28;
      *(long *)((long)puVar15 + lVar21 + 0x48) = lVar16;
      *(undefined4 *)((long)puVar15 + lVar21 + 0x50) = local_120._4_4_;
      *(undefined1 *)((long)puVar15 + lVar21 + 0x54) = local_118;
      goto LAB_00c10998;
    }
    lVar13 = param_1[2];
    lVar16 = param_1[3];
    pbVar18 = pbVar18 + 0xd;
    *param_1 = (long)pbVar18;
    while( true ) {
      if ((pbVar18 != pbVar23) && (*pbVar18 == 0x45)) {
        *param_1 = (long)(pbVar18 + 1);
                    /* try { // try from 00c10780 to 00c1078b has its CatchHandler @ 00c10a84 */
        local_130 = FUN_00c13140(param_1,lVar16 - lVar13 >> 3);
        uVar28 = FUN_00c130a0(param_1,local_130);
        goto joined_r0x00c107a4;
      }
                    /* try { // try from 00c10718 to 00c1071f has its CatchHandler @ 00c10aa0 */
      lVar21 = FUN_00c12c94(param_1);
      if (lVar21 == 0) break;
      plVar24 = (long *)param_1[3];
      if (plVar24 == (long *)param_1[4]) {
        plVar30 = (long *)param_1[2];
        sVar29 = (long)plVar24 - (long)plVar30;
        if (plVar30 == param_1 + 5) {
          pvVar27 = malloc(sVar29 * 2);
          if (pvVar27 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar24 != param_1 + 5) {
            memmove(pvVar27,plVar30,sVar29);
          }
          param_1[2] = (long)pvVar27;
        }
        else {
          pvVar27 = realloc(plVar30,sVar29 * 2);
          param_1[2] = (long)pvVar27;
          if (pvVar27 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar24 = (long *)((long)pvVar27 + sVar29);
        param_1[4] = (long)((long)pvVar27 + ((long)sVar29 >> 2) * 8);
      }
      *plVar24 = lVar21;
      pbVar18 = (byte *)*param_1;
      pbVar23 = (byte *)param_1[1];
      param_1[3] = (long)(plVar24 + 1);
    }
  }
  else if (*pcVar17 == 'G') {
    if (1 < (ulong)((long)pcVar20 - (long)pcVar17)) {
      cVar2 = pcVar17[1];
      if (cVar2 == 'I') {
        *param_1 = (long)(pcVar17 + 2);
        local_120 = 0;
        uVar26 = FUN_00c13df0(param_1,&local_120);
        uVar10 = local_120;
        auVar5._8_8_ = local_130._8_8_;
        auVar5._0_8_ = local_130._0_8_;
        puVar11 = (undefined8 *)0x0;
        if (((uVar26 & 1) != 0) || (local_130 = auVar5, local_120 == 0)) goto LAB_00c10998;
        pvVar27 = (void *)param_1[0x266];
        lVar13 = *(long *)((long)pvVar27 + 8);
        puVar12 = pvVar27;
        if (lVar13 - 0xfc0U < 0xfffffffffffff00f || lVar13 == -0x31) {
          puVar12 = malloc(0x1000);
          if (puVar12 == (void *)0x0) goto LAB_00c10a70;
          lVar13 = 0;
          *puVar12 = pvVar27;
          puVar12[1] = 0;
          param_1[0x266] = (long)puVar12;
        }
        *(long *)((long)puVar12 + 8) = lVar13 + 0x30;
        puVar11 = (undefined8 *)((long)puVar12 + lVar13 + 0x10);
        *puVar11 = &PTR_LAB_00cb13c0;
        uVar22 = *(ushort *)((long)puVar12 + lVar13 + 0x19);
        uVar28 = 0x17;
        *(ulong *)((long)puVar12 + lVar13 + 0x30) = uVar10;
        *(undefined1 *)((long)puVar12 + lVar13 + 0x18) = 0x15;
        pcVar17 = "initializer for module ";
LAB_00c104dc:
        puVar11[2] = pcVar17;
        puVar11[3] = uVar28;
        *(ushort *)((long)puVar11 + 9) = uVar22 & 0xf000 | 0x540;
        goto LAB_00c10998;
      }
      if (cVar2 == 'R') {
        *param_1 = (long)(pcVar17 + 2);
        local_120 = FUN_00c12574(param_1,0);
        auVar8._8_8_ = local_130._8_8_;
        auVar8._0_8_ = local_130._0_8_;
        if (local_120 != 0) {
          pbVar18 = (byte *)*param_1;
          pbVar23 = (byte *)param_1[1];
          if (((pbVar23 == pbVar18) || (bVar1 = *pbVar18, bVar1 < 0x30)) ||
             ((0x39 < bVar1 && (0x19 < bVar1 - 0x41)))) {
            bVar9 = true;
            if (pbVar18 != pbVar23) goto LAB_00c103e0;
LAB_00c10434:
            local_130 = auVar8;
            if (!bVar9) goto LAB_00c10994;
          }
          else {
            do {
              bVar1 = *pbVar18;
              if ((bVar1 < 0x30) || ((0x39 < bVar1 && (0x19 < bVar1 - 0x41)))) break;
              pbVar18 = pbVar18 + 1;
              *param_1 = (long)pbVar18;
            } while (pbVar18 != pbVar23);
            bVar9 = false;
            if (pbVar18 == pbVar23) goto LAB_00c10434;
LAB_00c103e0:
            if (*pbVar18 != 0x5f) goto LAB_00c10434;
            *param_1 = (long)(pbVar18 + 1);
          }
          puVar11 = (undefined8 *)FUN_00c13d40(param_1,&local_120);
          goto LAB_00c10998;
        }
      }
      else {
        local_130 = auVar31;
        if (cVar2 == 'V') {
          *param_1 = (long)(pcVar17 + 2);
                    /* try { // try from 00c10280 to 00c10693 has its CatchHandler @ 00c10aa4 */
          lVar13 = FUN_00c12574(param_1,0);
          if (lVar13 != 0) {
            pvVar27 = (void *)param_1[0x266];
            lVar16 = *(long *)((long)pvVar27 + 8);
            puVar12 = pvVar27;
            if (lVar16 - 0xfc0U < 0xfffffffffffff00f || lVar16 == -0x31) {
              puVar12 = malloc(0x1000);
              if (puVar12 == (void *)0x0) goto LAB_00c10a70;
              lVar16 = 0;
              *puVar12 = pvVar27;
              puVar12[1] = 0;
              param_1[0x266] = (long)puVar12;
            }
            *(long *)((long)puVar12 + 8) = lVar16 + 0x30;
            puVar11 = (undefined8 *)((long)puVar12 + lVar16 + 0x10);
            *puVar11 = &PTR_LAB_00cb13c0;
            uVar22 = *(ushort *)((long)puVar12 + lVar16 + 0x19);
            uVar28 = 0x13;
            *(long *)((long)puVar12 + lVar16 + 0x30) = lVar13;
            *(undefined1 *)((long)puVar12 + lVar16 + 0x18) = 0x15;
            pcVar17 = "guard variable for ";
            goto LAB_00c104dc;
          }
        }
      }
    }
  }
  else {
    if (*pcVar17 != 'T') goto LAB_00c10104;
    if ((ulong)((long)pcVar20 - (long)pcVar17) < 2) {
LAB_00c10568:
      pcVar17 = pcVar17 + 1;
      *param_1 = (long)pcVar17;
      if (pcVar20 == pcVar17) {
        bVar9 = false;
      }
      else {
        bVar9 = *pcVar17 == 'v';
      }
      uVar10 = FUN_00c137f4(param_1);
      if ((uVar10 & 1) == 0) {
        local_120 = FUN_00c10038(param_1);
        if (local_120 != 0) {
          if (bVar9) {
            puVar11 = (undefined8 *)FUN_00c13be4();
          }
          else {
            puVar11 = (undefined8 *)FUN_00c13c94(param_1,&local_120);
          }
          goto LAB_00c10998;
        }
      }
    }
    else {
      bVar1 = pcVar17[1];
      if (bVar1 < 0x53) {
        if (bVar1 < 0x48) {
          if (bVar1 == 0x41) {
            *param_1 = (long)(pcVar17 + 2);
            local_120 = FUN_00c12c94(param_1);
            if (local_120 != 0) {
              puVar11 = (undefined8 *)FUN_00c13484(param_1,&local_120);
              goto LAB_00c10998;
            }
          }
          else {
            if (bVar1 != 0x43) goto LAB_00c10568;
            *param_1 = (long)(pcVar17 + 2);
            local_120 = FUN_00c10bfc(param_1);
            if (local_120 != 0) {
              FUN_00c10abc(param_1,1);
              auVar7._8_8_ = local_130._8_8_;
              auVar7._0_8_ = local_130._0_8_;
              auVar6._8_8_ = local_130._8_8_;
              auVar6._0_8_ = local_130._0_8_;
              if (((extraout_x1 != 0) &&
                  (pcVar17 = (char *)*param_1, local_130 = auVar6, pcVar17 != (char *)param_1[1]))
                 && (local_130 = auVar7, *pcVar17 == '_')) {
                *param_1 = (long)(pcVar17 + 1);
                local_130._0_8_ = FUN_00c10bfc(param_1);
                if (local_130._0_8_ != 0) {
                  puVar11 = (undefined8 *)FUN_00c13a8c(param_1,local_130,&local_120);
                  goto LAB_00c10998;
                }
              }
            }
          }
        }
        else if (bVar1 == 0x48) {
          *param_1 = (long)(pcVar17 + 2);
          local_120 = FUN_00c12574(param_1,0);
          if (local_120 != 0) {
            puVar11 = (undefined8 *)FUN_00c13b34(param_1,&local_120);
            goto LAB_00c10998;
          }
        }
        else {
          if (bVar1 != 0x49) goto LAB_00c10568;
          *param_1 = (long)(pcVar17 + 2);
          local_120 = FUN_00c10bfc(param_1);
          if (local_120 != 0) {
            puVar11 = (undefined8 *)FUN_00c13694(param_1,&local_120);
            goto LAB_00c10998;
          }
        }
      }
      else if (bVar1 < 0x56) {
        if (bVar1 == 0x53) {
          *param_1 = (long)(pcVar17 + 2);
          local_120 = FUN_00c10bfc(param_1);
          if (local_120 != 0) {
            puVar11 = (undefined8 *)FUN_00c13744(param_1,&local_120);
            goto LAB_00c10998;
          }
        }
        else {
          if (bVar1 != 0x54) goto LAB_00c10568;
          *param_1 = (long)(pcVar17 + 2);
          local_120 = FUN_00c10bfc(param_1);
          if (local_120 != 0) {
            puVar11 = (undefined8 *)FUN_00c135e4(param_1,&local_120);
            goto LAB_00c10998;
          }
        }
      }
      else if (bVar1 == 0x56) {
        *param_1 = (long)(pcVar17 + 2);
        local_120 = FUN_00c10bfc(param_1);
        if (local_120 != 0) {
          puVar11 = (undefined8 *)FUN_00c13534(param_1,&local_120);
          goto LAB_00c10998;
        }
      }
      else if (bVar1 == 0x57) {
        *param_1 = (long)(pcVar17 + 2);
        local_120 = FUN_00c12574(param_1,0);
        if (local_120 != 0) {
          puVar11 = (undefined8 *)
                    FUN_00c10b48(param_1,"thread-local wrapper routine for ",&local_120);
          goto LAB_00c10998;
        }
      }
      else {
        if (bVar1 != 99) goto LAB_00c10568;
        *param_1 = (long)(pcVar17 + 2);
        uVar10 = FUN_00c137f4(param_1);
        if ((uVar10 & 1) == 0) {
          uVar10 = FUN_00c137f4(param_1);
          if ((uVar10 & 1) == 0) {
                    /* try { // try from 00c100e0 to 00c100e7 has its CatchHandler @ 00c10aa4 */
            local_120 = FUN_00c10038(param_1);
            if (local_120 != 0) {
              puVar11 = (undefined8 *)FUN_00c139dc(param_1,&local_120);
              goto LAB_00c10998;
            }
          }
        }
      }
    }
  }
LAB_00c10994:
  puVar11 = (undefined8 *)0x0;
LAB_00c10998:
  FUN_00c1329c(auStack_100);
  return puVar11;
}

