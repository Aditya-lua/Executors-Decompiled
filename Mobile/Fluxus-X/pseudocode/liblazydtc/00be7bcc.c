/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be7bcc
 */

/* std::__ndk1::__num_put<wchar_t>::__widen_and_group_int(char*, char*, char*, wchar_t*, wchar_t*&,
   wchar_t*&, std::__ndk1::locale const&) */

void std::__ndk1::__num_put<wchar_t>::__widen_and_group_int
               (char *param_1,char *param_2,char *param_3,wchar_t *param_4,wchar_t **param_5,
               wchar_t **param_6,locale *param_7)

{
  void *pvVar1;
  wchar_t *pwVar2;
  char cVar3;
  wchar_t wVar4;
  wchar_t wVar5;
  wchar_t *pwVar6;
  char *pcVar7;
  char *pcVar8;
  wchar_t *pwVar9;
  wchar_t *pwVar10;
  wchar_t *pwVar11;
  char *pcVar12;
  undefined1 (*pauVar13) [16];
  undefined1 (*pauVar14) [16];
  long lVar15;
  char *pcVar16;
  ulong uVar17;
  wchar_t *pwVar18;
  ulong uVar19;
  uint uVar20;
  long lVar21;
  ulong uVar22;
  uint uVar23;
  long *plVar24;
  long *plVar25;
  char *pcVar26;
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
  
  lVar21 = *(long *)param_7;
  local_70 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_88 = &local_70;
    local_68 = &local_88;
    __call_once((ulong *)&ctype<wchar_t>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar15 = *(long *)(lVar21 + 0x10);
  if (((ulong)(*(long *)(lVar21 + 0x18) - lVar15 >> 3) <= (long)DAT_00d27268 - 1U) ||
     (plVar24 = *(long **)(lVar15 + ((long)DAT_00d27268 - 1U) * 8), plVar24 == (long *)0x0)) {
LAB_00be81f0:
                    /* WARNING: Subroutine does not return */
    FUN_00bd8968();
  }
  lVar21 = *(long *)param_7;
  local_70 = &numpunct<wchar_t>::id;
  if (numpunct<wchar_t>::id != -1) {
    local_88 = &local_70;
    local_68 = &local_88;
    __call_once((ulong *)&numpunct<wchar_t>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar15 = *(long *)(lVar21 + 0x10);
  if (((ulong)(*(long *)(lVar21 + 0x18) - lVar15 >> 3) <= (long)DAT_00d272f8 - 1U) ||
     (plVar25 = *(long **)(lVar15 + ((long)DAT_00d272f8 - 1U) * 8), plVar25 == (long *)0x0))
  goto LAB_00be81f0;
  (**(code **)(*plVar25 + 0x28))(&local_88,plVar25);
  uVar22 = (ulong)local_88 >> 1 & 0x7f;
  if (((ulong)local_88 & 1) != 0) {
    uVar22 = local_80;
  }
  if (uVar22 == 0) {
                    /* try { // try from 00be7e18 to 00be7e2b has its CatchHandler @ 00be81f4 */
    (**(code **)(*plVar24 + 0x60))(plVar24,param_1,param_3,param_4);
    *param_6 = param_4 + ((long)param_3 - (long)param_1);
    goto LAB_00be819c;
  }
  *param_6 = param_4;
  if ((*param_1 == '-') || (pcVar26 = param_1, *param_1 == '+')) {
                    /* try { // try from 00be7d28 to 00be7d9b has its CatchHandler @ 00be81fc */
    wVar4 = (**(code **)(*plVar24 + 0x58))(plVar24);
    pwVar6 = *param_6;
    pcVar26 = param_1 + 1;
    *pwVar6 = wVar4;
    *param_6 = pwVar6 + 1;
  }
  if (((1 < (long)param_3 - (long)pcVar26) && (*pcVar26 == '0')) &&
     ((byte)(pcVar26[1] | 0x20U) == 0x78)) {
    wVar4 = (**(code **)(*plVar24 + 0x58))(plVar24,0x30);
    pwVar6 = *param_6;
    *pwVar6 = wVar4;
    *param_6 = pwVar6 + 1;
    wVar4 = (**(code **)(*plVar24 + 0x58))(plVar24,pcVar26[1]);
    pwVar6 = *param_6;
    pcVar26 = pcVar26 + 2;
    *pwVar6 = wVar4;
    *param_6 = pwVar6 + 1;
  }
  if ((pcVar26 != param_3) && (pcVar7 = param_3 + -1, pcVar26 < pcVar7)) {
    pcVar12 = param_3 + -2;
    pcVar8 = pcVar26 + 1;
    pcVar16 = pcVar12;
    if (pcVar12 <= pcVar8) {
      pcVar16 = pcVar26 + 1;
    }
    pcVar16 = pcVar16 + ~(ulong)pcVar26;
    uVar22 = (long)pcVar16 - (ulong)(pcVar16 != (char *)0x0) >> 1;
    if (pcVar16 != (char *)0x0) {
      uVar22 = uVar22 + 1;
    }
    uVar22 = uVar22 + 1;
    pcVar16 = pcVar26;
    if (7 < uVar22) {
      if (pcVar12 <= pcVar8) {
        pcVar12 = pcVar26 + 1;
      }
      pcVar12 = pcVar12 + ~(ulong)pcVar26;
      uVar19 = (long)pcVar12 - (ulong)(pcVar12 != (char *)0x0) >> 1;
      if (pcVar12 != (char *)0x0) {
        uVar19 = uVar19 + 1;
      }
      if ((param_3 <= pcVar26) || (pcVar8 + uVar19 <= param_3 + ~uVar19)) {
        if (uVar22 < 0x20) {
          uVar17 = 0;
        }
        else {
          uVar17 = uVar22 & 0xffffffffffffffe0;
          pauVar13 = (undefined1 (*) [16])(pcVar26 + 0x10);
          pauVar14 = (undefined1 (*) [16])(param_3 + -0x10);
          uVar19 = uVar17;
          do {
            uVar19 = uVar19 - 0x20;
            auVar28 = NEON_rev64(*pauVar14,1);
            auVar30 = NEON_rev64(pauVar14[-1],1);
            auVar31 = NEON_rev64(pauVar13[-1],1);
            auVar32 = NEON_rev64(*pauVar13,1);
            auVar28 = NEON_ext(auVar28,auVar28,8,1);
            auVar30 = NEON_ext(auVar30,auVar30,8,1);
            auVar31 = NEON_ext(auVar31,auVar31,8,1);
            auVar32 = NEON_ext(auVar32,auVar32,8,1);
            *(long *)(pauVar13[-1] + 8) = auVar28._8_8_;
            *(long *)pauVar13[-1] = auVar28._0_8_;
            *(long *)(*pauVar13 + 8) = auVar30._8_8_;
            *(long *)*pauVar13 = auVar30._0_8_;
            pauVar13 = pauVar13 + 2;
            *(long *)(pauVar14[-1] + 8) = auVar32._8_8_;
            *(long *)pauVar14[-1] = auVar32._0_8_;
            *(long *)(*pauVar14 + 8) = auVar31._8_8_;
            *(long *)*pauVar14 = auVar31._0_8_;
            pauVar14 = pauVar14 + -2;
          } while (uVar19 != 0);
          if (uVar22 == uVar17) goto LAB_00be7f58;
          if ((uVar22 & 0x18) == 0) {
            pcVar7 = pcVar7 + -uVar17;
            pcVar16 = pcVar26 + uVar17;
            goto LAB_00be7f3c;
          }
        }
        uVar19 = uVar22 & 0xfffffffffffffff8;
        pcVar16 = param_3 + -uVar17;
        pcVar7 = pcVar7 + -uVar19;
        lVar21 = uVar17 - uVar19;
        pcVar8 = pcVar26 + uVar17;
        do {
          pcVar16 = pcVar16 + -8;
          lVar21 = lVar21 + 8;
          uVar27 = NEON_rev64(*(undefined8 *)pcVar16,1);
          uVar29 = NEON_rev64(*(undefined8 *)pcVar8,1);
          *(undefined8 *)pcVar8 = uVar27;
          *(undefined8 *)pcVar16 = uVar29;
          pcVar8 = pcVar8 + 8;
        } while (lVar21 != 0);
        pcVar16 = pcVar26 + uVar19;
        if (uVar22 == uVar19) goto LAB_00be7f58;
      }
    }
LAB_00be7f3c:
    do {
      pcVar12 = pcVar16 + 1;
      cVar3 = *pcVar16;
      *pcVar16 = *pcVar7;
      pcVar8 = pcVar7 + -1;
      *pcVar7 = cVar3;
      pcVar7 = pcVar8;
      pcVar16 = pcVar12;
    } while (pcVar12 < pcVar8);
  }
LAB_00be7f58:
                    /* try { // try from 00be7f60 to 00be7f67 has its CatchHandler @ 00be81f8 */
  wVar4 = (**(code **)(*plVar25 + 0x20))(plVar25);
  if (pcVar26 < param_3) {
    uVar22 = 0;
    uVar23 = 0;
    lVar21 = (long)param_3 - (long)pcVar26;
    pcVar7 = pcVar26;
    do {
      pvVar1 = (void *)((ulong)&local_88 | 1);
      if (((ulong)local_88 & 1) != 0) {
        pvVar1 = local_78;
      }
      if (*(char *)((long)pvVar1 + uVar22) != '\0') {
        pvVar1 = (void *)((ulong)&local_88 | 1);
        if (((ulong)local_88 & 1) != 0) {
          pvVar1 = local_78;
        }
        if (uVar23 == *(byte *)((long)pvVar1 + uVar22)) {
          pwVar6 = *param_6;
          uVar23 = 0;
          *pwVar6 = wVar4;
          *param_6 = pwVar6 + 1;
          uVar19 = (ulong)local_88 >> 1 & 0x7f;
          if (((ulong)local_88 & 1) != 0) {
            uVar19 = local_80;
          }
          uVar20 = (uint)uVar22;
          if (uVar22 < uVar19 - 1) {
            uVar20 = uVar20 + 1;
          }
          uVar22 = (ulong)uVar20;
        }
      }
                    /* try { // try from 00be8004 to 00be800b has its CatchHandler @ 00be8200 */
      wVar5 = (**(code **)(*plVar24 + 0x58))(plVar24,*pcVar7);
      pwVar6 = *param_6;
      lVar21 = lVar21 + -1;
      uVar23 = uVar23 + 1;
      pcVar7 = pcVar7 + 1;
      *pwVar6 = wVar5;
      *param_6 = pwVar6 + 1;
    } while (lVar21 != 0);
    pwVar6 = pwVar6 + 1;
  }
  else {
    pwVar6 = *param_6;
  }
  pwVar11 = param_4 + ((long)pcVar26 - (long)param_1);
  if ((pwVar11 != pwVar6) && (pwVar9 = pwVar6 + -1, pwVar11 < pwVar9)) {
    lVar21 = (long)pcVar26 * 4;
    pwVar18 = pwVar6 + -2;
    pwVar10 = param_4 + (long)(pcVar26 + (1 - (long)param_1));
    pwVar2 = pwVar10;
    if (pwVar10 <= pwVar18) {
      pwVar2 = pwVar18;
    }
    lVar15 = (long)pwVar2 + ((long)param_1 * 4 - (long)param_4) + -4;
    uVar22 = lVar15 - ((ulong)(lVar15 != lVar21) | (long)pcVar26 << 2) >> 3;
    if (lVar15 != lVar21) {
      uVar22 = uVar22 + 1;
    }
    if (0x1e < uVar22) {
      if (pwVar10 <= pwVar18) {
        pwVar10 = pwVar18;
      }
      lVar15 = (long)pwVar10 + ((long)param_1 * 4 - (long)param_4) + -4;
      uVar19 = lVar15 - ((ulong)(lVar15 != lVar21) | (long)pcVar26 << 2) >> 3;
      if (lVar15 != lVar21) {
        uVar19 = uVar19 + 1;
      }
      if ((pwVar6 <= pwVar11) ||
         (param_4 + (long)(pcVar26 + ((uVar19 + 1) - (long)param_1)) <= pwVar6 + (-1 - uVar19))) {
        pauVar14 = (undefined1 (*) [16])(pwVar6 + -4);
        uVar17 = uVar22 + 1 & 0x7ffffffffffffff8;
        pauVar13 = (undefined1 (*) [16])(param_4 + (long)(pcVar26 + (4 - (long)param_1)));
        pwVar9 = pwVar9 + -uVar17;
        pwVar11 = pwVar11 + uVar17;
        uVar19 = uVar17;
        do {
          uVar19 = uVar19 - 8;
          auVar28 = NEON_rev64(*pauVar14,4);
          auVar30 = NEON_rev64(pauVar14[-1],4);
          auVar31 = NEON_rev64(pauVar13[-1],4);
          auVar32 = NEON_rev64(*pauVar13,4);
          auVar28 = NEON_ext(auVar28,auVar28,8,1);
          auVar30 = NEON_ext(auVar30,auVar30,8,1);
          auVar31 = NEON_ext(auVar31,auVar31,8,1);
          auVar32 = NEON_ext(auVar32,auVar32,8,1);
          *(long *)(pauVar13[-1] + 8) = auVar28._8_8_;
          *(long *)pauVar13[-1] = auVar28._0_8_;
          *(long *)(*pauVar13 + 8) = auVar30._8_8_;
          *(long *)*pauVar13 = auVar30._0_8_;
          pauVar13 = pauVar13 + 2;
          *(long *)((long)pauVar14[-1] + 8) = auVar32._8_8_;
          *(long *)pauVar14[-1] = auVar32._0_8_;
          *(long *)((long)*pauVar14 + 8) = auVar31._8_8_;
          *(long *)*pauVar14 = auVar31._0_8_;
          pauVar14 = pauVar14 + -2;
        } while (uVar19 != 0);
        if (uVar22 + 1 == uVar17) goto LAB_00be819c;
      }
    }
    do {
      pwVar10 = pwVar11 + 1;
      wVar4 = *pwVar11;
      *pwVar11 = *pwVar9;
      pwVar6 = pwVar9 + -1;
      *pwVar9 = wVar4;
      pwVar9 = pwVar6;
      pwVar11 = pwVar10;
    } while (pwVar10 < pwVar6);
  }
LAB_00be819c:
  pwVar6 = *param_6;
  if (param_2 != param_3) {
    pwVar6 = param_4 + ((long)param_2 - (long)param_1);
  }
  *param_5 = pwVar6;
  if (((ulong)local_88 & 1) != 0) {
    operator_delete(local_78,(ulong)local_88 & 0xfffffffffffffffe);
  }
  return;
}

