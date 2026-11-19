/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be8224
 */

/* std::__ndk1::__num_put<wchar_t>::__widen_and_group_float(char*, char*, char*, wchar_t*,
   wchar_t*&, wchar_t*&, std::__ndk1::locale const&) */

void std::__ndk1::__num_put<wchar_t>::__widen_and_group_float
               (char *param_1,char *param_2,char *param_3,wchar_t *param_4,wchar_t **param_5,
               wchar_t **param_6,locale *param_7)

{
  void *pvVar1;
  byte bVar2;
  wchar_t wVar3;
  int iVar4;
  wchar_t wVar5;
  wchar_t *pwVar6;
  byte *pbVar7;
  byte *pbVar8;
  wchar_t *pwVar9;
  wchar_t *pwVar10;
  byte *pbVar11;
  wchar_t *pwVar12;
  wchar_t *pwVar13;
  undefined1 (*pauVar14) [16];
  undefined1 (*pauVar15) [16];
  long lVar16;
  ulong uVar17;
  wchar_t *pwVar18;
  ulong uVar19;
  long *plVar20;
  uint uVar21;
  long lVar22;
  byte *pbVar23;
  long *plVar24;
  byte *pbVar25;
  byte *pbVar26;
  uint uVar27;
  ulong uVar28;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined8 **local_88;
  ulong local_80;
  void *local_78;
  undefined8 *local_70;
  undefined8 ***local_68;
  
  lVar22 = *(long *)param_7;
  local_70 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_88 = &local_70;
    local_68 = &local_88;
    __call_once((ulong *)&ctype<wchar_t>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar16 = *(long *)(lVar22 + 0x10);
  if (((ulong)(*(long *)(lVar22 + 0x18) - lVar16 >> 3) <= (long)DAT_00d27268 - 1U) ||
     (plVar24 = *(long **)(lVar16 + ((long)DAT_00d27268 - 1U) * 8), plVar24 == (long *)0x0)) {
LAB_00be88d0:
                    /* WARNING: Subroutine does not return */
    FUN_00bd8968();
  }
  lVar22 = *(long *)param_7;
  local_70 = &numpunct<wchar_t>::id;
  if (numpunct<wchar_t>::id != -1) {
    local_88 = &local_70;
    local_68 = &local_88;
    __call_once((ulong *)&numpunct<wchar_t>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar16 = *(long *)(lVar22 + 0x10);
  if (((ulong)(*(long *)(lVar22 + 0x18) - lVar16 >> 3) <= (long)DAT_00d272f8 - 1U) ||
     (plVar20 = *(long **)(lVar16 + ((long)DAT_00d272f8 - 1U) * 8), plVar20 == (long *)0x0))
  goto LAB_00be88d0;
  (**(code **)(*plVar20 + 0x28))(&local_88,plVar20);
  *param_6 = param_4;
  if ((*param_1 == '-') || (pbVar25 = (byte *)param_1, *param_1 == '+')) {
                    /* try { // try from 00be836c to 00be8373 has its CatchHandler @ 00be88f0 */
    wVar3 = (**(code **)(*plVar24 + 0x58))(plVar24);
    pwVar6 = *param_6;
    pbVar25 = (byte *)(param_1 + 1);
    *pwVar6 = wVar3;
    *param_6 = pwVar6 + 1;
  }
  lVar22 = (long)param_3 - (long)pbVar25;
  if (((lVar22 < 2) || (*pbVar25 != 0x30)) || ((pbVar25[1] | 0x20) != 0x78)) {
    if (pbVar25 < param_3) {
      pbVar23 = pbVar25;
      do {
        bVar2 = *pbVar23;
        if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be84d8 to 00be84e3 has its CatchHandler @ 00be88d8 */
          DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
          __cxa_guard_release(&DAT_00d270f8);
        }
        if (bVar2 - 0x3a < 0xfffffff6) goto LAB_00be8508;
        pbVar23 = pbVar23 + 1;
      } while (pbVar23 != (byte *)param_3);
      pbVar23 = pbVar25 + lVar22;
      goto LAB_00be8508;
    }
    pbVar26 = pbVar25;
  }
  else {
                    /* try { // try from 00be83b8 to 00be83e3 has its CatchHandler @ 00be88f4 */
    wVar3 = (**(code **)(*plVar24 + 0x58))(plVar24,0x30);
    pwVar6 = *param_6;
    *pwVar6 = wVar3;
    *param_6 = pwVar6 + 1;
    wVar3 = (**(code **)(*plVar24 + 0x58))(plVar24,pbVar25[1]);
    pwVar6 = *param_6;
    pbVar26 = pbVar25 + 2;
    *pwVar6 = wVar3;
    *param_6 = pwVar6 + 1;
    if (pbVar26 < param_3) {
      pbVar23 = pbVar25 + lVar22;
      pbVar7 = pbVar26;
      do {
        bVar2 = *pbVar7;
        if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be8464 to 00be846f has its CatchHandler @ 00be88d4 */
          DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
          __cxa_guard_release(&DAT_00d270f8);
        }
        if ((bVar2 - 0x3a < 0xfffffff6) && ((bVar2 | 0x20) - 0x67 < 0xfffffffa)) {
          pbVar25 = pbVar26;
          pbVar23 = pbVar7;
          goto LAB_00be8508;
        }
        pbVar7 = pbVar7 + 1;
      } while (pbVar7 != (byte *)param_3);
      pbVar25 = pbVar26;
LAB_00be8508:
      pbVar26 = pbVar23;
    }
    else {
      pbVar25 = pbVar26;
    }
  }
  uVar28 = (ulong)local_88 >> 1 & 0x7f;
  if (((ulong)local_88 & 1) != 0) {
    uVar28 = local_80;
  }
  if (uVar28 == 0) {
                    /* try { // try from 00be8644 to 00be8653 has its CatchHandler @ 00be88f4 */
    (**(code **)(*plVar24 + 0x60))(plVar24,pbVar25,pbVar26,*param_6);
    pwVar6 = *param_6 + ((long)pbVar26 - (long)pbVar25);
    *param_6 = pwVar6;
  }
  else {
    if (pbVar25 != pbVar26) {
      pbVar7 = pbVar26 + -1;
      pbVar23 = pbVar25;
      if (pbVar25 < pbVar7) {
        do {
          pbVar11 = pbVar23 + 1;
          bVar2 = *pbVar23;
          *pbVar23 = *pbVar7;
          pbVar8 = pbVar7 + -1;
          *pbVar7 = bVar2;
          pbVar7 = pbVar8;
          pbVar23 = pbVar11;
        } while (pbVar11 < pbVar8);
      }
    }
                    /* try { // try from 00be8564 to 00be856b has its CatchHandler @ 00be88ec */
    wVar3 = (**(code **)(*plVar20 + 0x20))(plVar20);
    if (pbVar25 < pbVar26) {
      uVar28 = 0;
      uVar21 = 0;
      pbVar23 = pbVar25;
      do {
        pvVar1 = (void *)((ulong)&local_88 | 1);
        if (((ulong)local_88 & 1) != 0) {
          pvVar1 = local_78;
        }
        if (*(char *)((long)pvVar1 + uVar28) != '\0') {
          pvVar1 = (void *)((ulong)&local_88 | 1);
          if (((ulong)local_88 & 1) != 0) {
            pvVar1 = local_78;
          }
          if (uVar21 == *(byte *)((long)pvVar1 + uVar28)) {
            pwVar6 = *param_6;
            uVar21 = 0;
            *pwVar6 = wVar3;
            *param_6 = pwVar6 + 1;
            uVar19 = (ulong)local_88 >> 1 & 0x7f;
            if (((ulong)local_88 & 1) != 0) {
              uVar19 = local_80;
            }
            uVar27 = (uint)uVar28;
            if (uVar28 < uVar19 - 1) {
              uVar27 = uVar27 + 1;
            }
            uVar28 = (ulong)uVar27;
          }
        }
                    /* try { // try from 00be8600 to 00be8607 has its CatchHandler @ 00be88fc */
        wVar5 = (**(code **)(*plVar24 + 0x58))(plVar24,*pbVar23);
        pwVar6 = *param_6;
        pbVar23 = pbVar23 + 1;
        uVar21 = uVar21 + 1;
        *pwVar6 = wVar5;
        *param_6 = pwVar6 + 1;
      } while (pbVar23 != pbVar26);
      pwVar6 = pwVar6 + 1;
    }
    else {
      pwVar6 = *param_6;
    }
    pwVar13 = param_4 + ((long)pbVar25 - (long)param_1);
    if ((pwVar13 != pwVar6) && (pwVar9 = pwVar6 + -1, pwVar13 < pwVar9)) {
      lVar22 = (long)pbVar25 * 4;
      pwVar18 = pwVar6 + -2;
      pwVar10 = param_4 + (long)(pbVar25 + (1 - (long)param_1));
      pwVar12 = pwVar10;
      if (pwVar10 <= pwVar18) {
        pwVar12 = pwVar18;
      }
      lVar16 = (long)pwVar12 + ((long)param_1 * 4 - (long)param_4) + -4;
      uVar28 = lVar16 - ((ulong)(lVar16 != lVar22) | (long)pbVar25 << 2) >> 3;
      if (lVar16 != lVar22) {
        uVar28 = uVar28 + 1;
      }
      if (0x1e < uVar28) {
        if (pwVar10 <= pwVar18) {
          pwVar10 = pwVar18;
        }
        lVar16 = (long)pwVar10 + ((long)param_1 * 4 - (long)param_4) + -4;
        uVar19 = lVar16 - ((ulong)(lVar16 != lVar22) | (long)pbVar25 << 2) >> 3;
        if (lVar16 != lVar22) {
          uVar19 = uVar19 + 1;
        }
        if ((pwVar6 <= pwVar13) ||
           (param_4 + (long)(pbVar25 + ((uVar19 + 1) - (long)param_1)) <= pwVar6 + (-1 - uVar19))) {
          pauVar15 = (undefined1 (*) [16])(pwVar6 + -4);
          uVar17 = uVar28 + 1 & 0x7ffffffffffffff8;
          pauVar14 = (undefined1 (*) [16])(param_4 + (long)(pbVar25 + (4 - (long)param_1)));
          pwVar9 = pwVar9 + -uVar17;
          pwVar13 = pwVar13 + uVar17;
          uVar19 = uVar17;
          do {
            uVar19 = uVar19 - 8;
            auVar29 = NEON_rev64(*pauVar15,4);
            auVar30 = NEON_rev64(pauVar15[-1],4);
            auVar31 = NEON_rev64(pauVar14[-1],4);
            auVar32 = NEON_rev64(*pauVar14,4);
            auVar29 = NEON_ext(auVar29,auVar29,8,1);
            auVar30 = NEON_ext(auVar30,auVar30,8,1);
            auVar31 = NEON_ext(auVar31,auVar31,8,1);
            auVar32 = NEON_ext(auVar32,auVar32,8,1);
            *(long *)(pauVar14[-1] + 8) = auVar29._8_8_;
            *(long *)pauVar14[-1] = auVar29._0_8_;
            *(long *)(*pauVar14 + 8) = auVar30._8_8_;
            *(long *)*pauVar14 = auVar30._0_8_;
            pauVar14 = pauVar14 + 2;
            *(long *)((long)pauVar15[-1] + 8) = auVar32._8_8_;
            *(long *)pauVar15[-1] = auVar32._0_8_;
            *(long *)((long)*pauVar15 + 8) = auVar31._8_8_;
            *(long *)*pauVar15 = auVar31._0_8_;
            pauVar15 = pauVar15 + -2;
          } while (uVar19 != 0);
          if (uVar28 + 1 == uVar17) goto LAB_00be87cc;
        }
      }
      do {
        pwVar12 = pwVar13 + 1;
        wVar3 = *pwVar13;
        *pwVar13 = *pwVar9;
        pwVar10 = pwVar9 + -1;
        *pwVar9 = wVar3;
        pwVar9 = pwVar10;
        pwVar13 = pwVar12;
      } while (pwVar12 < pwVar10);
    }
  }
LAB_00be87cc:
  if (pbVar26 < param_3) {
    do {
      if (*pbVar26 == 0x2e) {
                    /* try { // try from 00be881c to 00be884b has its CatchHandler @ 00be88f4 */
        wVar3 = (**(code **)(*plVar20 + 0x18))(plVar20);
        pbVar26 = pbVar26 + 1;
        pwVar6 = *param_6 + 1;
        **param_6 = wVar3;
        *param_6 = pwVar6;
        goto LAB_00be8834;
      }
                    /* try { // try from 00be87e8 to 00be87ef has its CatchHandler @ 00be88f8 */
      wVar3 = (**(code **)(*plVar24 + 0x58))(plVar24);
      pwVar6 = *param_6;
      pbVar26 = pbVar26 + 1;
      *pwVar6 = wVar3;
      *param_6 = pwVar6 + 1;
    } while (pbVar26 != (byte *)param_3);
    pwVar6 = pwVar6 + 1;
  }
LAB_00be8834:
  (**(code **)(*plVar24 + 0x60))(plVar24,pbVar26,param_3,pwVar6);
  pwVar6 = *param_6;
  *param_6 = pwVar6 + ((long)param_3 - (long)pbVar26);
  pwVar6 = pwVar6 + ((long)param_3 - (long)pbVar26);
  if (param_2 != param_3) {
    pwVar6 = param_4 + ((long)param_2 - (long)param_1);
  }
  *param_5 = pwVar6;
  if (((ulong)local_88 & 1) != 0) {
    operator_delete(local_78,(ulong)local_88 & 0xfffffffffffffffe);
  }
  return;
}

