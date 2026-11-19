/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be7494
 */

/* std::__ndk1::__num_put<char>::__widen_and_group_float(char*, char*, char*, char*, char*&, char*&,
   std::__ndk1::locale const&) */

void std::__ndk1::__num_put<char>::__widen_and_group_float
               (char *param_1,char *param_2,char *param_3,char *param_4,char **param_5,
               char **param_6,locale *param_7)

{
  void *pvVar1;
  long lVar2;
  byte bVar3;
  char cVar4;
  char cVar5;
  int iVar6;
  char *pcVar7;
  byte *pbVar8;
  byte *pbVar9;
  char *pcVar10;
  byte *pbVar11;
  char *pcVar12;
  char *pcVar13;
  undefined1 (*pauVar14) [16];
  ulong uVar15;
  ulong uVar16;
  undefined1 (*pauVar17) [16];
  uint uVar18;
  long lVar19;
  long *plVar20;
  byte *pbVar21;
  long *plVar22;
  byte *pbVar23;
  byte *pbVar24;
  uint uVar25;
  ulong uVar26;
  undefined8 uVar27;
  undefined1 auVar28 [16];
  undefined8 uVar29;
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined8 **local_88;
  ulong local_80;
  void *local_78;
  undefined8 *local_70;
  undefined8 ***local_68;
  
  lVar19 = *(long *)param_7;
  local_70 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_88 = &local_70;
    local_68 = &local_88;
    __call_once((ulong *)&ctype<char>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar2 = *(long *)(lVar19 + 0x10);
  if (((ulong)(*(long *)(lVar19 + 0x18) - lVar2 >> 3) <= (long)DAT_00d27278 - 1U) ||
     (plVar22 = *(long **)(lVar2 + ((long)DAT_00d27278 - 1U) * 8), plVar22 == (long *)0x0)) {
LAB_00be7b7c:
                    /* WARNING: Subroutine does not return */
    FUN_00bd8968();
  }
  lVar19 = *(long *)param_7;
  local_70 = &numpunct<char>::id;
  if (numpunct<char>::id != -1) {
    local_88 = &local_70;
    local_68 = &local_88;
    __call_once((ulong *)&numpunct<char>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar2 = *(long *)(lVar19 + 0x10);
  if (((ulong)(*(long *)(lVar19 + 0x18) - lVar2 >> 3) <= (long)DAT_00d272e8 - 1U) ||
     (plVar20 = *(long **)(lVar2 + ((long)DAT_00d272e8 - 1U) * 8), plVar20 == (long *)0x0))
  goto LAB_00be7b7c;
  (**(code **)(*plVar20 + 0x28))(&local_88,plVar20);
  *param_6 = param_4;
  if ((*param_1 == '-') || (pbVar24 = (byte *)param_1, *param_1 == '+')) {
                    /* try { // try from 00be75dc to 00be75e3 has its CatchHandler @ 00be7b9c */
    cVar4 = (**(code **)(*plVar22 + 0x38))(plVar22);
    pcVar7 = *param_6;
    pbVar24 = (byte *)(param_1 + 1);
    *param_6 = pcVar7 + 1;
    *pcVar7 = cVar4;
  }
  lVar19 = (long)param_3 - (long)pbVar24;
  if (((lVar19 < 2) || (*pbVar24 != 0x30)) || ((pbVar24[1] | 0x20) != 0x78)) {
    if (pbVar24 < param_3) {
      pbVar21 = pbVar24;
      do {
        bVar3 = *pbVar21;
        if (((DAT_00d270f8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d270f8), iVar6 != 0)) {
                    /* try { // try from 00be7750 to 00be775b has its CatchHandler @ 00be7b84 */
          DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
          __cxa_guard_release(&DAT_00d270f8);
        }
        if (bVar3 - 0x3a < 0xfffffff6) goto LAB_00be777c;
        pbVar21 = pbVar21 + 1;
      } while (pbVar21 != (byte *)param_3);
      pbVar21 = pbVar24 + lVar19;
LAB_00be777c:
      pbVar23 = pbVar24;
      goto LAB_00be7780;
    }
    pbVar23 = pbVar24;
  }
  else {
                    /* try { // try from 00be762c to 00be765b has its CatchHandler @ 00be7ba0 */
    cVar4 = (**(code **)(*plVar22 + 0x38))(plVar22,0x30);
    pcVar7 = *param_6;
    *param_6 = pcVar7 + 1;
    *pcVar7 = cVar4;
    cVar4 = (**(code **)(*plVar22 + 0x38))(plVar22,pbVar24[1]);
    pcVar7 = *param_6;
    pbVar23 = pbVar24 + 2;
    *param_6 = pcVar7 + 1;
    *pcVar7 = cVar4;
    if (pbVar23 < param_3) {
      pbVar21 = pbVar23;
      do {
        bVar3 = *pbVar21;
        if (((DAT_00d270f8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d270f8), iVar6 != 0)) {
                    /* try { // try from 00be76dc to 00be76e7 has its CatchHandler @ 00be7b80 */
          DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
          __cxa_guard_release(&DAT_00d270f8);
        }
        if ((bVar3 - 0x3a < 0xfffffff6) && ((bVar3 | 0x20) - 0x67 < 0xfffffffa)) goto LAB_00be7780;
        pbVar21 = pbVar21 + 1;
      } while (pbVar21 != (byte *)param_3);
      pbVar21 = pbVar24 + lVar19;
LAB_00be7780:
      pbVar24 = pbVar23;
      pbVar23 = pbVar21;
    }
    else {
      pbVar24 = pbVar23;
    }
  }
  uVar26 = (ulong)local_88 >> 1 & 0x7f;
  if (((ulong)local_88 & 1) != 0) {
    uVar26 = local_80;
  }
  if (uVar26 == 0) {
                    /* try { // try from 00be7978 to 00be7987 has its CatchHandler @ 00be7ba0 */
    (**(code **)(*plVar22 + 0x40))(plVar22,pbVar24,pbVar23,*param_6);
    *param_6 = *param_6 + ((long)pbVar23 - (long)pbVar24);
    goto LAB_00be7a88;
  }
  if ((pbVar24 != pbVar23) && (pbVar8 = pbVar23 + -1, pbVar21 = pbVar24, pbVar24 < pbVar8)) {
    do {
      pbVar11 = pbVar21 + 1;
      bVar3 = *pbVar21;
      *pbVar21 = *pbVar8;
      pbVar9 = pbVar8 + -1;
      *pbVar8 = bVar3;
      pbVar8 = pbVar9;
      pbVar21 = pbVar11;
    } while (pbVar11 < pbVar9);
  }
                    /* try { // try from 00be77dc to 00be77e3 has its CatchHandler @ 00be7b98 */
  cVar4 = (**(code **)(*plVar20 + 0x20))(plVar20);
  if (pbVar24 < pbVar23) {
    uVar26 = 0;
    uVar18 = 0;
    pbVar21 = pbVar24;
    do {
      pvVar1 = (void *)((ulong)&local_88 | 1);
      if (((ulong)local_88 & 1) != 0) {
        pvVar1 = local_78;
      }
      if (*(char *)((long)pvVar1 + uVar26) != '\0') {
        pvVar1 = (void *)((ulong)&local_88 | 1);
        if (((ulong)local_88 & 1) != 0) {
          pvVar1 = local_78;
        }
        if (uVar18 == *(byte *)((long)pvVar1 + uVar26)) {
          pcVar7 = *param_6;
          uVar18 = 0;
          *param_6 = pcVar7 + 1;
          *pcVar7 = cVar4;
          uVar15 = (ulong)local_88 >> 1 & 0x7f;
          if (((ulong)local_88 & 1) != 0) {
            uVar15 = local_80;
          }
          uVar25 = (uint)uVar26;
          if (uVar26 < uVar15 - 1) {
            uVar25 = uVar25 + 1;
          }
          uVar26 = (ulong)uVar25;
        }
      }
                    /* try { // try from 00be7878 to 00be787f has its CatchHandler @ 00be7ba8 */
      cVar5 = (**(code **)(*plVar22 + 0x38))(plVar22,*pbVar21);
      pcVar7 = *param_6;
      pbVar21 = pbVar21 + 1;
      uVar18 = uVar18 + 1;
      *param_6 = pcVar7 + 1;
      *pcVar7 = cVar5;
    } while (pbVar21 != pbVar23);
  }
  pcVar13 = *param_6;
  pcVar7 = param_4 + ((long)pbVar24 - (long)param_1);
  if ((pcVar7 == pcVar13) || (pcVar10 = pcVar13 + -1, pcVar10 <= pcVar7)) goto LAB_00be7a88;
  pbVar21 = pbVar24 + (long)param_4;
  pbVar9 = (byte *)(pcVar13 + -2);
  pbVar8 = pbVar9;
  if (pbVar9 < pbVar21 + (1 - (long)param_1)) {
    pbVar8 = pbVar21 + (1 - (long)param_1);
  }
  pbVar8 = pbVar8 + (long)(param_1 + ~(ulong)pbVar24);
  pcVar12 = param_4;
  if (pbVar8 != (byte *)param_4) {
    pcVar12 = param_4 + 1;
  }
  uVar26 = (ulong)((long)pbVar8 - (long)pcVar12) >> 1;
  if (pbVar8 != (byte *)param_4) {
    uVar26 = uVar26 + 1;
  }
  uVar26 = uVar26 + 1;
  if (7 < uVar26) {
    if (pbVar9 < pbVar21 + (1 - (long)param_1)) {
      pbVar9 = pbVar21 + (1 - (long)param_1);
    }
    pbVar9 = pbVar9 + (long)(param_1 + ~(ulong)pbVar24);
    pcVar12 = param_4;
    if (pbVar9 != (byte *)param_4) {
      pcVar12 = param_4 + 1;
    }
    pbVar21 = pbVar24;
    if (pbVar9 != (byte *)param_4) {
      pbVar21 = pbVar24 + 1;
    }
    uVar16 = (ulong)((long)pbVar9 - (long)pcVar12) >> 1;
    uVar15 = uVar16;
    if (pbVar9 != (byte *)param_4) {
      uVar15 = uVar16 + 1;
    }
    if ((pcVar13 <= pcVar7) ||
       (param_4 + (long)(pbVar21 + (uVar16 - (long)param_1) + 1) <= pcVar13 + ~uVar15)) {
      if (uVar26 < 0x20) {
        uVar16 = 0;
      }
      else {
        uVar16 = uVar26 & 0xffffffffffffffe0;
        pauVar14 = (undefined1 (*) [16])(pcVar13 + -0x10);
        pauVar17 = (undefined1 (*) [16])(param_4 + ((long)pbVar24 - (long)param_1) + 0x10);
        uVar15 = uVar16;
        do {
          uVar15 = uVar15 - 0x20;
          auVar28 = NEON_rev64(*pauVar14,1);
          auVar30 = NEON_rev64(pauVar14[-1],1);
          auVar31 = NEON_rev64(pauVar17[-1],1);
          auVar32 = NEON_rev64(*pauVar17,1);
          auVar28 = NEON_ext(auVar28,auVar28,8,1);
          auVar30 = NEON_ext(auVar30,auVar30,8,1);
          auVar31 = NEON_ext(auVar31,auVar31,8,1);
          auVar32 = NEON_ext(auVar32,auVar32,8,1);
          *(long *)(pauVar17[-1] + 8) = auVar28._8_8_;
          *(long *)pauVar17[-1] = auVar28._0_8_;
          *(long *)(*pauVar17 + 8) = auVar30._8_8_;
          *(long *)*pauVar17 = auVar30._0_8_;
          pauVar17 = pauVar17 + 2;
          *(long *)(pauVar14[-1] + 8) = auVar32._8_8_;
          *(long *)pauVar14[-1] = auVar32._0_8_;
          *(long *)(*pauVar14 + 8) = auVar31._8_8_;
          *(long *)*pauVar14 = auVar31._0_8_;
          pauVar14 = pauVar14 + -2;
        } while (uVar15 != 0);
        if (uVar26 == uVar16) goto LAB_00be7a88;
        if ((uVar26 & 0x18) == 0) {
          pcVar10 = pcVar10 + -uVar16;
          pcVar7 = pcVar7 + uVar16;
          goto LAB_00be7a6c;
        }
      }
      uVar15 = uVar26 & 0xfffffffffffffff8;
      pcVar13 = pcVar13 + -uVar16;
      pcVar10 = pcVar10 + -uVar15;
      pcVar7 = pcVar7 + uVar15;
      lVar19 = uVar16 - uVar15;
      pcVar12 = param_4 + (long)(pbVar24 + (uVar16 - (long)param_1));
      do {
        pcVar13 = pcVar13 + -8;
        lVar19 = lVar19 + 8;
        uVar27 = NEON_rev64(*(undefined8 *)pcVar13,1);
        uVar29 = NEON_rev64(*(undefined8 *)pcVar12,1);
        *(undefined8 *)pcVar12 = uVar27;
        *(undefined8 *)pcVar13 = uVar29;
        pcVar12 = pcVar12 + 8;
      } while (lVar19 != 0);
      if (uVar26 == uVar15) goto LAB_00be7a88;
    }
  }
LAB_00be7a6c:
  do {
    pcVar12 = pcVar7 + 1;
    cVar4 = *pcVar7;
    *pcVar7 = *pcVar10;
    pcVar13 = pcVar10 + -1;
    *pcVar10 = cVar4;
    pcVar10 = pcVar13;
    pcVar7 = pcVar12;
  } while (pcVar12 < pcVar13);
LAB_00be7a88:
  if (pbVar23 < param_3) {
    do {
      if (*pbVar23 == 0x2e) {
                    /* try { // try from 00be7ad8 to 00be7b0f has its CatchHandler @ 00be7ba0 */
        cVar4 = (**(code **)(*plVar20 + 0x18))(plVar20);
        pcVar7 = *param_6;
        pbVar23 = pbVar23 + 1;
        *param_6 = pcVar7 + 1;
        *pcVar7 = cVar4;
        break;
      }
                    /* try { // try from 00be7aa8 to 00be7aaf has its CatchHandler @ 00be7ba4 */
      cVar4 = (**(code **)(*plVar22 + 0x38))(plVar22);
      pcVar7 = *param_6;
      pbVar23 = pbVar23 + 1;
      *param_6 = pcVar7 + 1;
      *pcVar7 = cVar4;
    } while (pbVar23 != (byte *)param_3);
  }
  (**(code **)(*plVar22 + 0x40))(plVar22,pbVar23,param_3,*param_6);
  pcVar7 = *param_6;
  *param_6 = pcVar7 + ((long)param_3 - (long)pbVar23);
  pcVar7 = pcVar7 + ((long)param_3 - (long)pbVar23);
  if (param_2 != param_3) {
    pcVar7 = param_4 + ((long)param_2 - (long)param_1);
  }
  *param_5 = pcVar7;
  if (((ulong)local_88 & 1) != 0) {
    operator_delete(local_78,(ulong)local_88 & 0xfffffffffffffffe);
  }
  return;
}

