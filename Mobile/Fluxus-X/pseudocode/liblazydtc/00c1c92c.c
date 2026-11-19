/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1c92c
 */

undefined8 * FUN_00c1c92c(long *param_1,long param_2)

{
  long lVar1;
  undefined1 uVar2;
  char cVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  char *pcVar6;
  long lVar7;
  long lVar8;
  uint __c;
  ulong uVar9;
  byte *pbVar10;
  long lVar11;
  byte *pbVar12;
  char *pcVar13;
  byte *pbVar14;
  byte *pbVar15;
  void *pvVar16;
  size_t sVar17;
  long lVar18;
  long *plVar19;
  long *plVar20;
  short *psVar21;
  byte *local_110;
  long lStack_108;
  long local_100;
  undefined1 local_f8 [16];
  long local_e8;
  undefined1 local_e0 [16];
  long *local_d0;
  ulong uStack_c8;
  undefined8 *local_c0;
  undefined8 *puStack_b8;
  undefined1 *local_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined1 auStack_68 [8];
  
  if (param_2 != 0) {
    param_1[0x54] = param_1[0x53];
  }
  psVar21 = (short *)*param_1;
  pbVar14 = (byte *)param_1[1];
  if ((ulong)((long)pbVar14 - (long)psVar21) < 2) {
    return (undefined8 *)0x0;
  }
  if (*psVar21 == 0x7455) {
    pbVar10 = (byte *)(psVar21 + 1);
    *param_1 = (long)pbVar10;
    pbVar12 = pbVar10;
    if ((pbVar14 == pbVar10) || (*pbVar10 - 0x3a < 0xfffffff6)) {
      lVar11 = 0;
      pbVar10 = (byte *)0x0;
    }
    else {
      pbVar15 = (byte *)(psVar21 + 1);
      do {
        if (*pbVar12 - 0x3a < 0xfffffff6) goto LAB_00c1cb8c;
        pbVar12 = pbVar12 + 1;
        pbVar15 = pbVar15 + 1;
        *param_1 = (long)pbVar12;
      } while (pbVar12 != pbVar14);
      pbVar15 = pbVar14;
LAB_00c1cb8c:
      lVar11 = (long)pbVar15 - (long)pbVar10;
    }
    if (pbVar12 == pbVar14) {
      return (undefined8 *)0x0;
    }
    if (*pbVar12 != 0x5f) {
      return (undefined8 *)0x0;
    }
    pvVar16 = (void *)param_1[0x266];
    *param_1 = (long)(pbVar12 + 1);
    lVar18 = *(long *)((long)pvVar16 + 8);
    puVar4 = pvVar16;
    if (lVar18 - 0xfd0U < 0xfffffffffffff00f || lVar18 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) {
LAB_00c1d044:
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      lVar18 = 0;
      *puVar4 = pvVar16;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar18 + 0x20;
    puVar5 = (undefined8 *)((long)puVar4 + lVar18 + 0x10);
    *puVar5 = &PTR_LAB_00cb2288;
    *(byte **)((long)puVar4 + lVar18 + 0x20) = pbVar10;
    *(long *)((long)puVar4 + lVar18 + 0x28) = lVar11;
    *(undefined1 *)((long)puVar4 + lVar18 + 0x18) = 0x33;
    *(ushort *)((long)puVar4 + lVar18 + 0x19) =
         *(ushort *)((long)puVar4 + lVar18 + 0x19) & 0xf000 | 0x540;
    return puVar5;
  }
  if (*psVar21 != 0x6c55) {
    if (*psVar21 != 0x6255) {
      return (undefined8 *)0x0;
    }
    pbVar10 = (byte *)(psVar21 + 1);
    *param_1 = (long)pbVar10;
    if ((pbVar14 != pbVar10) && (0xfffffff5 < *pbVar10 - 0x3a)) {
      do {
        if (*pbVar10 - 0x3a < 0xfffffff6) break;
        pbVar10 = pbVar10 + 1;
        *param_1 = (long)pbVar10;
      } while (pbVar10 != pbVar14);
    }
    if (pbVar10 == pbVar14) {
      return (undefined8 *)0x0;
    }
    if (*pbVar10 != 0x5f) {
      return (undefined8 *)0x0;
    }
    pvVar16 = (void *)param_1[0x266];
    *param_1 = (long)(pbVar10 + 1);
    lVar11 = *(long *)((long)pvVar16 + 8);
    puVar4 = pvVar16;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c1d044;
      lVar11 = 0;
      *puVar4 = pvVar16;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar5 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar5 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    *(char **)((long)puVar4 + lVar11 + 0x20) = "\'block-literal\'";
    *(undefined8 *)((long)puVar4 + lVar11 + 0x28) = 0xf;
    return puVar5;
  }
  plVar20 = (long *)param_1[0x54];
  plVar19 = (long *)param_1[0x53];
  psVar21 = psVar21 + 1;
  sVar17 = (long)plVar20 - (long)plVar19;
  uStack_c8 = (long)sVar17 >> 3;
  lVar11 = param_1[0x62];
  *param_1 = (long)psVar21;
  param_1[0x62] = uStack_c8;
  local_b0 = auStack_68;
  uStack_a0 = 0;
  local_a8 = 0;
  uStack_90 = 0;
  local_98 = 0;
  uStack_80 = 0;
  local_88 = 0;
  uStack_70 = 0;
  local_78 = 0;
  local_d0 = param_1;
  local_c0 = &local_a8;
  puStack_b8 = &local_a8;
  if (plVar20 == (long *)param_1[0x55]) {
    if (plVar19 == param_1 + 0x56) {
      pvVar16 = malloc(sVar17 * 2);
      if (pvVar16 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (plVar20 != plVar19) {
        memmove(pvVar16,plVar19,sVar17);
      }
      param_1[0x53] = (long)pvVar16;
    }
    else {
      pvVar16 = realloc(plVar19,sVar17 * 2);
      param_1[0x53] = (long)pvVar16;
      if (pvVar16 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      psVar21 = (short *)*param_1;
      pbVar14 = (byte *)param_1[1];
    }
    plVar20 = (long *)((long)pvVar16 + sVar17);
    param_1[0x55] = (long)((long)pvVar16 + ((long)sVar17 >> 2) * 8);
  }
  lVar18 = param_1[2];
  lVar8 = param_1[3];
  *plVar20 = (long)&local_c0;
  param_1[0x54] = (long)(plVar20 + 1);
  uVar9 = (long)pbVar14 - (long)psVar21;
  if (uVar9 != 0) {
    while ((char)*psVar21 == 'T') {
      if (uVar9 < 2) {
        __c = 0;
      }
      else {
        __c = (uint)*(byte *)((long)psVar21 + 1);
      }
      pcVar6 = memchr("yptnk",__c,5);
      if ((pcVar6 == (char *)0x0) || (pcVar6 == "")) break;
                    /* try { // try from 00c1ccfc to 00c1cd07 has its CatchHandler @ 00c1d08c */
      lVar7 = FUN_00c1ddc8(param_1,&local_c0);
      puVar4 = (undefined8 *)0x0;
      if (lVar7 == 0) goto LAB_00c1cfc8;
      plVar20 = (long *)param_1[3];
      if (plVar20 == (long *)param_1[4]) {
        plVar19 = (long *)param_1[2];
        sVar17 = (long)plVar20 - (long)plVar19;
        if (plVar19 == param_1 + 5) {
          pvVar16 = malloc(sVar17 * 2);
          if (pvVar16 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar20 != param_1 + 5) {
            memmove(pvVar16,plVar19,sVar17);
          }
          param_1[2] = (long)pvVar16;
        }
        else {
          pvVar16 = realloc(plVar19,sVar17 * 2);
          param_1[2] = (long)pvVar16;
          if (pvVar16 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar20 = (long *)((long)pvVar16 + sVar17);
        param_1[4] = (long)((long)pvVar16 + ((long)sVar17 >> 2) * 8);
      }
      psVar21 = (short *)*param_1;
      lVar1 = param_1[1];
      *plVar20 = lVar7;
      param_1[3] = (long)(plVar20 + 1);
      uVar9 = lVar1 - (long)psVar21;
      if (uVar9 == 0) break;
    }
  }
                    /* try { // try from 00c1cd60 to 00c1cd77 has its CatchHandler @ 00c1d088 */
  lVar18 = lVar8 - lVar18 >> 3;
  local_e0 = FUN_00c13140(param_1,lVar18);
  if (local_e0._8_8_ == 0) {
    if (param_1[0x54] == param_1[0x53]) {
                    /* try { // try from 00c1d048 to 00c1d067 has its CatchHandler @ 00c1d088 */
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",0x81,
                   "Popping empty vector!");
    }
    param_1[0x54] = param_1[0x54] + -8;
  }
  pcVar6 = (char *)*param_1;
  pcVar13 = (char *)param_1[1];
  local_e8 = 0;
  if (pcVar6 == pcVar13) {
LAB_00c1ce00:
    do {
                    /* try { // try from 00c1ce04 to 00c1ce0b has its CatchHandler @ 00c1d090 */
      lVar8 = FUN_00c10bfc(param_1);
      puVar4 = (undefined8 *)0x0;
      if (lVar8 == 0) goto LAB_00c1cfc8;
      plVar20 = (long *)param_1[3];
      if (plVar20 == (long *)param_1[4]) {
        plVar19 = (long *)param_1[2];
        sVar17 = (long)plVar20 - (long)plVar19;
        if (plVar19 == param_1 + 5) {
          pvVar16 = malloc(sVar17 * 2);
          if (pvVar16 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar20 != param_1 + 5) {
            memmove(pvVar16,plVar19,sVar17);
          }
          param_1[2] = (long)pvVar16;
        }
        else {
          pvVar16 = realloc(plVar19,sVar17 * 2);
          param_1[2] = (long)pvVar16;
          if (pvVar16 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar20 = (long *)((long)pvVar16 + sVar17);
        param_1[4] = (long)((long)pvVar16 + ((long)sVar17 >> 2) * 8);
      }
      pcVar6 = (char *)*param_1;
      pcVar13 = (char *)param_1[1];
      *plVar20 = lVar8;
      param_1[3] = (long)(plVar20 + 1);
    } while ((pcVar13 == pcVar6) || ((cVar3 = *pcVar6, cVar3 != 'Q' && (cVar3 != 'E'))));
  }
  else {
    if (*pcVar6 == 'Q') {
      uVar2 = *(undefined1 *)((long)param_1 + 0x30a);
      *param_1 = (long)(pcVar6 + 1);
      *(undefined1 *)((long)param_1 + 0x30a) = 1;
                    /* try { // try from 00c1cdc8 to 00c1cdcf has its CatchHandler @ 00c1d074 */
      local_e8 = FUN_00c16098(param_1);
      *(undefined1 *)((long)param_1 + 0x30a) = uVar2;
      puVar4 = (undefined8 *)0x0;
      if (local_e8 == 0) goto LAB_00c1cfc8;
      pcVar6 = (char *)*param_1;
      pcVar13 = (char *)param_1[1];
    }
    if ((pcVar13 == pcVar6) || (*pcVar6 != 'v')) goto LAB_00c1ce00;
    *param_1 = (long)(pcVar6 + 1);
  }
                    /* try { // try from 00c1ceb0 to 00c1cebb has its CatchHandler @ 00c1d080 */
  local_f8 = FUN_00c13140(param_1,lVar18);
  pbVar14 = (byte *)*param_1;
  pbVar10 = (byte *)param_1[1];
  local_100 = 0;
  if (pbVar14 != pbVar10) {
    if (*pbVar14 == 0x51) {
      uVar2 = *(undefined1 *)((long)param_1 + 0x30a);
      *param_1 = (long)(pbVar14 + 1);
      *(undefined1 *)((long)param_1 + 0x30a) = 1;
                    /* try { // try from 00c1cef0 to 00c1cef7 has its CatchHandler @ 00c1d070 */
      local_100 = FUN_00c16098(param_1);
      *(undefined1 *)((long)param_1 + 0x30a) = uVar2;
      puVar4 = (undefined8 *)0x0;
      if (local_100 == 0) goto LAB_00c1cfc8;
      pbVar14 = (byte *)*param_1;
      pbVar10 = (byte *)param_1[1];
    }
    if ((pbVar14 != pbVar10) && (*pbVar14 == 0x45)) {
      local_110 = pbVar14 + 1;
      *param_1 = (long)local_110;
      pbVar14 = local_110;
      if ((pbVar10 == local_110) || (*local_110 - 0x3a < 0xfffffff6)) {
        lStack_108 = 0;
        local_110 = (byte *)0x0;
      }
      else {
        do {
          if (*pbVar14 - 0x3a < 0xfffffff6) {
            pbVar12 = pbVar14;
            goto LAB_00c1cf78;
          }
          pbVar14 = pbVar14 + 1;
          *param_1 = (long)pbVar14;
        } while (pbVar14 != pbVar10);
        pbVar12 = pbVar10;
LAB_00c1cf78:
        lStack_108 = (long)pbVar12 - (long)local_110;
      }
      if ((pbVar14 != pbVar10) && (*pbVar14 == 0x5f)) {
        *param_1 = (long)(pbVar14 + 1);
        puVar4 = (undefined8 *)
                 FUN_00c1e714(param_1,local_e0,&local_e8,local_f8,&local_100,&local_110);
        goto LAB_00c1cfc8;
      }
    }
  }
  puVar4 = (undefined8 *)0x0;
LAB_00c1cfc8:
  if ((ulong)(local_d0[0x54] - local_d0[0x53] >> 3) < uStack_c8) {
                    /* try { // try from 00c1d020 to 00c1d03f has its CatchHandler @ 00c1d084 */
                    /* WARNING: Subroutine does not return */
    FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",0xac7,
                 &DAT_002ab32c);
  }
  local_d0[0x54] = local_d0[0x53] + uStack_c8 * 8;
  if (local_c0 != &local_a8) {
    free(local_c0);
  }
  param_1[0x62] = lVar11;
  return puVar4;
}

