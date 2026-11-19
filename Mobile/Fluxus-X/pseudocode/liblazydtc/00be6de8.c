/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be6de8
 */

/* std::__ndk1::__num_put<char>::__widen_and_group_int(char*, char*, char*, char*, char*&, char*&,
   std::__ndk1::locale const&) */

void std::__ndk1::__num_put<char>::__widen_and_group_int
               (char *param_1,char *param_2,char *param_3,char *param_4,char **param_5,
               char **param_6,locale *param_7)

{
  char *pcVar1;
  void *pvVar2;
  char *pcVar3;
  long lVar4;
  char cVar5;
  char cVar6;
  char *pcVar7;
  char *pcVar8;
  char *pcVar9;
  ulong uVar10;
  char *pcVar11;
  char *pcVar12;
  undefined1 (*pauVar13) [16];
  undefined1 (*pauVar14) [16];
  ulong uVar15;
  ulong uVar16;
  char *pcVar17;
  uint uVar18;
  long lVar19;
  uint uVar20;
  long *plVar21;
  long *plVar22;
  undefined8 uVar23;
  undefined1 auVar24 [16];
  undefined8 uVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
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
  lVar4 = *(long *)(lVar19 + 0x10);
  if (((ulong)(*(long *)(lVar19 + 0x18) - lVar4 >> 3) <= (long)DAT_00d27278 - 1U) ||
     (plVar21 = *(long **)(lVar4 + ((long)DAT_00d27278 - 1U) * 8), plVar21 == (long *)0x0)) {
LAB_00be7460:
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
  lVar4 = *(long *)(lVar19 + 0x10);
  if (((ulong)(*(long *)(lVar19 + 0x18) - lVar4 >> 3) <= (long)DAT_00d272e8 - 1U) ||
     (plVar22 = *(long **)(lVar4 + ((long)DAT_00d272e8 - 1U) * 8), plVar22 == (long *)0x0))
  goto LAB_00be7460;
  (**(code **)(*plVar22 + 0x28))(&local_88,plVar22);
  uVar10 = (ulong)local_88 >> 1 & 0x7f;
  if (((ulong)local_88 & 1) != 0) {
    uVar10 = local_80;
  }
  if (uVar10 == 0) {
                    /* try { // try from 00be7034 to 00be7047 has its CatchHandler @ 00be7464 */
    (**(code **)(*plVar21 + 0x40))(plVar21,param_1,param_3,param_4);
    pcVar7 = param_4 + ((long)param_3 - (long)param_1);
    *param_6 = pcVar7;
    goto LAB_00be7410;
  }
  *param_6 = param_4;
  if ((*param_1 == '-') || (pcVar11 = param_1, *param_1 == '+')) {
                    /* try { // try from 00be6f44 to 00be6fc3 has its CatchHandler @ 00be746c */
    cVar5 = (**(code **)(*plVar21 + 0x38))(plVar21);
    pcVar7 = *param_6;
    *param_6 = pcVar7 + 1;
    *pcVar7 = cVar5;
    pcVar11 = param_1 + 1;
  }
  if (((1 < (long)param_3 - (long)pcVar11) && (*pcVar11 == '0')) &&
     ((byte)(pcVar11[1] | 0x20U) == 0x78)) {
    cVar5 = (**(code **)(*plVar21 + 0x38))(plVar21,0x30);
    pcVar7 = *param_6;
    *param_6 = pcVar7 + 1;
    *pcVar7 = cVar5;
    cVar5 = (**(code **)(*plVar21 + 0x38))(plVar21,pcVar11[1]);
    pcVar7 = *param_6;
    pcVar11 = pcVar11 + 2;
    *param_6 = pcVar7 + 1;
    *pcVar7 = cVar5;
  }
  if ((pcVar11 != param_3) && (pcVar7 = param_3 + -1, pcVar11 < pcVar7)) {
    pcVar12 = param_3 + -2;
    pcVar8 = pcVar11 + 1;
    pcVar9 = pcVar12;
    if (pcVar12 <= pcVar8) {
      pcVar9 = pcVar11 + 1;
    }
    pcVar9 = pcVar9 + ~(ulong)pcVar11;
    uVar10 = (long)pcVar9 - (ulong)(pcVar9 != (char *)0x0) >> 1;
    if (pcVar9 != (char *)0x0) {
      uVar10 = uVar10 + 1;
    }
    uVar10 = uVar10 + 1;
    pcVar9 = pcVar11;
    if (7 < uVar10) {
      if (pcVar12 <= pcVar8) {
        pcVar12 = pcVar11 + 1;
      }
      pcVar12 = pcVar12 + ~(ulong)pcVar11;
      uVar15 = (long)pcVar12 - (ulong)(pcVar12 != (char *)0x0) >> 1;
      if (pcVar12 != (char *)0x0) {
        uVar15 = uVar15 + 1;
      }
      if ((param_3 <= pcVar11) || (pcVar8 + uVar15 <= param_3 + ~uVar15)) {
        if (uVar10 < 0x20) {
          uVar16 = 0;
        }
        else {
          uVar16 = uVar10 & 0xffffffffffffffe0;
          pauVar13 = (undefined1 (*) [16])(pcVar11 + 0x10);
          pauVar14 = (undefined1 (*) [16])(param_3 + -0x10);
          uVar15 = uVar16;
          do {
            uVar15 = uVar15 - 0x20;
            auVar24 = NEON_rev64(*pauVar14,1);
            auVar26 = NEON_rev64(pauVar14[-1],1);
            auVar27 = NEON_rev64(pauVar13[-1],1);
            auVar28 = NEON_rev64(*pauVar13,1);
            auVar24 = NEON_ext(auVar24,auVar24,8,1);
            auVar26 = NEON_ext(auVar26,auVar26,8,1);
            auVar27 = NEON_ext(auVar27,auVar27,8,1);
            auVar28 = NEON_ext(auVar28,auVar28,8,1);
            *(long *)(pauVar13[-1] + 8) = auVar24._8_8_;
            *(long *)pauVar13[-1] = auVar24._0_8_;
            *(long *)(*pauVar13 + 8) = auVar26._8_8_;
            *(long *)*pauVar13 = auVar26._0_8_;
            pauVar13 = pauVar13 + 2;
            *(long *)(pauVar14[-1] + 8) = auVar28._8_8_;
            *(long *)pauVar14[-1] = auVar28._0_8_;
            *(long *)(*pauVar14 + 8) = auVar27._8_8_;
            *(long *)*pauVar14 = auVar27._0_8_;
            pauVar14 = pauVar14 + -2;
          } while (uVar15 != 0);
          if (uVar10 == uVar16) goto LAB_00be7174;
          if ((uVar10 & 0x18) == 0) {
            pcVar7 = pcVar7 + -uVar16;
            pcVar9 = pcVar11 + uVar16;
            goto LAB_00be7158;
          }
        }
        uVar15 = uVar10 & 0xfffffffffffffff8;
        pcVar9 = param_3 + -uVar16;
        pcVar7 = pcVar7 + -uVar15;
        lVar19 = uVar16 - uVar15;
        pcVar8 = pcVar11 + uVar16;
        do {
          pcVar9 = pcVar9 + -8;
          lVar19 = lVar19 + 8;
          uVar23 = NEON_rev64(*(undefined8 *)pcVar9,1);
          uVar25 = NEON_rev64(*(undefined8 *)pcVar8,1);
          *(undefined8 *)pcVar8 = uVar23;
          *(undefined8 *)pcVar9 = uVar25;
          pcVar8 = pcVar8 + 8;
        } while (lVar19 != 0);
        pcVar9 = pcVar11 + uVar15;
        if (uVar10 == uVar15) goto LAB_00be7174;
      }
    }
LAB_00be7158:
    do {
      pcVar12 = pcVar9 + 1;
      cVar5 = *pcVar9;
      *pcVar9 = *pcVar7;
      pcVar8 = pcVar7 + -1;
      *pcVar7 = cVar5;
      pcVar7 = pcVar8;
      pcVar9 = pcVar12;
    } while (pcVar12 < pcVar8);
  }
LAB_00be7174:
                    /* try { // try from 00be7184 to 00be718b has its CatchHandler @ 00be7468 */
  cVar5 = (**(code **)(*plVar22 + 0x20))(plVar22);
  if (pcVar11 < param_3) {
    uVar10 = 0;
    uVar20 = 0;
    lVar19 = (long)param_3 - (long)pcVar11;
    pcVar7 = pcVar11;
    do {
      pvVar2 = (void *)((ulong)&local_88 | 1);
      if (((ulong)local_88 & 1) != 0) {
        pvVar2 = local_78;
      }
      if (*(char *)((long)pvVar2 + uVar10) != '\0') {
        pvVar2 = (void *)((ulong)&local_88 | 1);
        if (((ulong)local_88 & 1) != 0) {
          pvVar2 = local_78;
        }
        if (uVar20 == *(byte *)((long)pvVar2 + uVar10)) {
          pcVar8 = *param_6;
          uVar20 = 0;
          *param_6 = pcVar8 + 1;
          *pcVar8 = cVar5;
          uVar15 = (ulong)local_88 >> 1 & 0x7f;
          if (((ulong)local_88 & 1) != 0) {
            uVar15 = local_80;
          }
          uVar18 = (uint)uVar10;
          if (uVar10 < uVar15 - 1) {
            uVar18 = uVar18 + 1;
          }
          uVar10 = (ulong)uVar18;
        }
      }
                    /* try { // try from 00be7224 to 00be722b has its CatchHandler @ 00be7470 */
      cVar6 = (**(code **)(*plVar21 + 0x38))(plVar21,*pcVar7);
      pcVar8 = *param_6;
      lVar19 = lVar19 + -1;
      uVar20 = uVar20 + 1;
      pcVar7 = pcVar7 + 1;
      *param_6 = pcVar8 + 1;
      *pcVar8 = cVar6;
    } while (lVar19 != 0);
  }
  pcVar7 = *param_6;
  pcVar8 = param_4 + ((long)pcVar11 - (long)param_1);
  if ((pcVar8 == pcVar7) || (pcVar9 = pcVar7 + -1, pcVar9 <= pcVar8)) goto LAB_00be7410;
  pcVar12 = pcVar11 + (long)param_4;
  pcVar17 = pcVar7 + -2;
  pcVar3 = pcVar17;
  if (pcVar17 < pcVar12 + (1 - (long)param_1)) {
    pcVar3 = pcVar12 + (1 - (long)param_1);
  }
  pcVar3 = pcVar3 + (long)(param_1 + ~(ulong)pcVar11);
  pcVar1 = param_4;
  if (pcVar3 != param_4) {
    pcVar1 = param_4 + 1;
  }
  uVar10 = (ulong)((long)pcVar3 - (long)pcVar1) >> 1;
  if (pcVar3 != param_4) {
    uVar10 = uVar10 + 1;
  }
  uVar10 = uVar10 + 1;
  if (uVar10 < 8) {
LAB_00be73f0:
    do {
      pcVar11 = pcVar8 + 1;
      cVar5 = *pcVar8;
      *pcVar8 = *pcVar9;
      pcVar7 = pcVar9 + -1;
      *pcVar9 = cVar5;
      pcVar9 = pcVar7;
      pcVar8 = pcVar11;
    } while (pcVar11 < pcVar7);
  }
  else {
    if (pcVar17 < pcVar12 + (1 - (long)param_1)) {
      pcVar17 = pcVar12 + (1 - (long)param_1);
    }
    pcVar17 = pcVar17 + (long)(param_1 + ~(ulong)pcVar11);
    pcVar12 = param_4;
    if (pcVar17 != param_4) {
      pcVar12 = param_4 + 1;
    }
    pcVar3 = pcVar11;
    if (pcVar17 != param_4) {
      pcVar3 = pcVar11 + 1;
    }
    uVar16 = (ulong)((long)pcVar17 - (long)pcVar12) >> 1;
    uVar15 = uVar16;
    if (pcVar17 != param_4) {
      uVar15 = uVar16 + 1;
    }
    if ((pcVar8 < pcVar7) &&
       (pcVar7 + ~uVar15 < param_4 + (long)(pcVar3 + (uVar16 - (long)param_1) + 1)))
    goto LAB_00be73f0;
    if (uVar10 < 0x20) {
      uVar16 = 0;
LAB_00be7394:
      uVar15 = uVar10 & 0xfffffffffffffff8;
      pcVar7 = pcVar7 + -uVar16;
      pcVar9 = pcVar9 + -uVar15;
      pcVar8 = pcVar8 + uVar15;
      lVar19 = uVar16 - uVar15;
      pcVar11 = param_4 + (long)(pcVar11 + (uVar16 - (long)param_1));
      do {
        pcVar7 = pcVar7 + -8;
        lVar19 = lVar19 + 8;
        uVar23 = NEON_rev64(*(undefined8 *)pcVar7,1);
        uVar25 = NEON_rev64(*(undefined8 *)pcVar11,1);
        *(undefined8 *)pcVar11 = uVar23;
        *(undefined8 *)pcVar7 = uVar25;
        pcVar11 = pcVar11 + 8;
      } while (lVar19 != 0);
      if (uVar10 != uVar15) goto LAB_00be73f0;
    }
    else {
      uVar16 = uVar10 & 0xffffffffffffffe0;
      pauVar14 = (undefined1 (*) [16])(pcVar7 + -0x10);
      pauVar13 = (undefined1 (*) [16])(param_4 + ((long)pcVar11 - (long)param_1) + 0x10);
      uVar15 = uVar16;
      do {
        uVar15 = uVar15 - 0x20;
        auVar24 = NEON_rev64(*pauVar14,1);
        auVar26 = NEON_rev64(pauVar14[-1],1);
        auVar27 = NEON_rev64(pauVar13[-1],1);
        auVar28 = NEON_rev64(*pauVar13,1);
        auVar24 = NEON_ext(auVar24,auVar24,8,1);
        auVar26 = NEON_ext(auVar26,auVar26,8,1);
        auVar27 = NEON_ext(auVar27,auVar27,8,1);
        auVar28 = NEON_ext(auVar28,auVar28,8,1);
        *(long *)(pauVar13[-1] + 8) = auVar24._8_8_;
        *(long *)pauVar13[-1] = auVar24._0_8_;
        *(long *)(*pauVar13 + 8) = auVar26._8_8_;
        *(long *)*pauVar13 = auVar26._0_8_;
        pauVar13 = pauVar13 + 2;
        *(long *)(pauVar14[-1] + 8) = auVar28._8_8_;
        *(long *)pauVar14[-1] = auVar28._0_8_;
        *(long *)(*pauVar14 + 8) = auVar27._8_8_;
        *(long *)*pauVar14 = auVar27._0_8_;
        pauVar14 = pauVar14 + -2;
      } while (uVar15 != 0);
      if (uVar10 != uVar16) {
        if ((uVar10 & 0x18) == 0) {
          pcVar9 = pcVar9 + -uVar16;
          pcVar8 = pcVar8 + uVar16;
          goto LAB_00be73f0;
        }
        goto LAB_00be7394;
      }
    }
  }
  pcVar7 = *param_6;
LAB_00be7410:
  if (param_2 != param_3) {
    pcVar7 = param_4 + ((long)param_2 - (long)param_1);
  }
  *param_5 = pcVar7;
  if (((ulong)local_88 & 1) != 0) {
    operator_delete(local_78,(ulong)local_88 & 0xfffffffffffffffe);
  }
  return;
}

