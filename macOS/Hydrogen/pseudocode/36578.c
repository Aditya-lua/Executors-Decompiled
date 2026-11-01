
char * FUN_00036578(long *param_1,undefined8 *param_2,char *param_3,ulong param_4,long param_5,
                   undefined8 param_6)

{
  char *pcVar1;
  char *pcVar2;
  char *pcVar3;
  long lVar4;
  undefined8 *puVar5;
  char *pcVar6;
  char *pcVar7;
  char *pcVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  char *pcVar12;
  uint uVar13;
  undefined8 *unaff_x20;
  ulong unaff_x23;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined1 auVar29 [16];
  undefined1 auStack_120 [32];
  long lStack_100;
  long lStack_f8;
  char *pcStack_d0;
  char *pcStack_c8;
  char *pcStack_b8;
  char *pcStack_b0;
  
  lVar4 = param_1[2];
  pcVar1 = (char *)*param_1;
  if (param_4 <= (ulong)((lVar4 - (long)pcVar1 >> 3) * -0x5555555555555555)) {
    pcVar2 = (char *)param_1[1];
    lVar4 = (long)pcVar2 - (long)pcVar1 >> 3;
    if ((ulong)(lVar4 * -0x5555555555555555) < unaff_x23) {
      puVar5 = param_2 + lVar4;
      if (pcVar2 != pcVar1) {
        do {
          uVar14 = *param_2;
          *(undefined8 *)(pcVar1 + 8) = param_2[1];
          *(undefined8 *)pcVar1 = uVar14;
          pcVar1[0x10] = *(char *)(param_2 + 2);
          param_2 = param_2 + 3;
          pcVar1 = pcVar1 + 0x18;
        } while (param_2 != puVar5);
      }
      pcVar7 = pcVar2;
      if (puVar5 != unaff_x20) {
        pcVar3 = pcVar2;
        do {
          uVar15 = puVar5[1];
          uVar14 = *puVar5;
          *(undefined8 *)(pcVar3 + 0x10) = puVar5[2];
          *(undefined8 *)(pcVar3 + 8) = uVar15;
          *(undefined8 *)pcVar3 = uVar14;
          puVar5 = puVar5 + 3;
          pcVar7 = pcVar7 + 0x18;
          pcVar3 = pcVar3 + 0x18;
        } while (puVar5 != unaff_x20);
      }
      lVar4 = (long)pcVar7 - (long)pcVar2;
    }
    else {
      pcVar2 = pcVar1;
      if (param_2 != unaff_x20) {
        pcVar7 = pcVar1;
        do {
          uVar14 = *param_2;
          *(undefined8 *)(pcVar7 + 8) = param_2[1];
          *(undefined8 *)pcVar7 = uVar14;
          pcVar7[0x10] = *(char *)(param_2 + 2);
          pcVar2 = pcVar2 + 0x18;
          param_2 = param_2 + 3;
          pcVar7 = pcVar7 + 0x18;
        } while (param_2 != unaff_x20);
      }
      lVar4 = (long)pcVar2 - (long)pcVar1;
      pcVar2 = pcVar1;
    }
LAB_00036734:
    param_1[1] = (long)(pcVar2 + lVar4);
    return pcVar1;
  }
  if (pcVar1 != (char *)0x0) {
    param_1[1] = (long)pcVar1;
    __ZdlPv();
    lVar4 = 0;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  if (unaff_x23 < 0xaaaaaaaaaaaaaab) {
    uVar9 = (lVar4 >> 3) * 0x5555555555555556;
    if (uVar9 <= unaff_x23) {
      uVar9 = unaff_x23;
    }
    if (0x555555555555554 < (ulong)((lVar4 >> 3) * -0x5555555555555555)) {
      uVar9 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar9 < 0xaaaaaaaaaaaaaab) {
      pcVar2 = (char *)__Znwm(uVar9 * 0x18);
      *param_1 = (long)pcVar2;
      param_1[1] = (long)pcVar2;
      param_1[2] = (long)(pcVar2 + uVar9 * 0x18);
      pcVar1 = pcVar2;
      pcVar7 = pcVar2;
      if (param_2 != unaff_x20) {
        lVar4 = ((ulong)((long)unaff_x20 + (-0x18 - (long)param_2)) / 0x18) * 0x18 + 0x18;
        pcVar1 = (char *)_memcpy(pcVar2,param_2,lVar4);
        pcVar7 = pcVar2 + lVar4;
      }
      lVar4 = (long)pcVar7 - (long)pcVar2;
      goto LAB_00036734;
    }
  }
  auVar29 = func_0x00017f90(param_1);
  pcVar1 = auVar29._8_8_;
  puVar5 = auVar29._0_8_;
  uVar9 = puVar5[2];
  pcVar2 = (char *)*puVar5;
  if ((ulong)((long)(uVar9 - (long)pcVar2) >> 4) < param_4) {
    pcVar7 = param_3;
    if (pcVar2 != (char *)0x0) {
      puVar5[1] = pcVar2;
      __ZdlPv();
      uVar9 = 0;
      *puVar5 = 0;
      puVar5[1] = 0;
      puVar5[2] = 0;
    }
    if (param_4 >> 0x3c == 0) {
      uVar10 = (long)uVar9 >> 3;
      if ((ulong)((long)uVar9 >> 3) <= param_4) {
        uVar10 = param_4;
      }
      if (0x7fffffffffffffef < uVar9) {
        uVar10 = 0xfffffffffffffff;
      }
      if (uVar10 >> 0x3c == 0) {
        pcVar3 = (char *)__Znwm(uVar10 * 0x10);
        *puVar5 = pcVar3;
        puVar5[1] = pcVar3;
        puVar5[2] = pcVar3 + uVar10 * 0x10;
        pcVar2 = pcVar3;
        pcVar7 = pcVar3;
        if (pcVar1 != param_3) {
          lVar4 = ((ulong)(param_3 + (-0x10 - (long)pcVar1)) & 0xfffffffffffffff0) + 0x10;
          pcVar2 = (char *)_memcpy(pcVar3,pcVar1,lVar4);
          pcVar7 = pcVar3 + lVar4;
        }
        lVar4 = (long)pcVar7 - (long)pcVar3;
        goto code_r0x000368e4;
      }
    }
    auVar29 = func_0x00017f90(puVar5);
    pcVar1 = auVar29._8_8_;
    pcVar2 = auVar29._0_8_;
    func_0x0003721c(auStack_120);
    uVar13 = (uint)param_6;
    if (lStack_f8 == lStack_100) {
      if ((uVar13 >> 9 & 1) != 0) goto code_r0x00036bdc;
      for (; pcVar1 != pcVar7; pcVar1 = pcVar1 + 1) {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                  (pcVar2,(long)*pcVar1);
      }
    }
    else {
      lVar4 = _strlen(param_5);
      lVar4 = param_5 + lVar4;
      if ((uVar13 >> 9 & 1) == 0) {
        pcVar1 = pcStack_d0;
        pcVar7 = pcStack_c8;
        if ((uVar13 >> 10 & 1) == 0) {
          do {
            for (; pcVar3 = pcStack_c8, pcVar1 != pcStack_c8; pcVar1 = pcVar1 + 1) {
              pcStack_c8 = pcVar7;
              __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                        (pcVar2,(long)*pcVar1);
              pcVar7 = pcStack_c8;
              pcStack_c8 = pcVar3;
            }
            pcStack_c8 = pcVar7;
            pcVar2 = (char *)func_0x00036c94(&lStack_100,pcVar2,param_5,lVar4,param_6);
            pcVar8 = pcStack_b0;
            pcVar3 = pcStack_b8;
            func_0x00037058(auStack_120);
            pcVar1 = pcStack_d0;
            pcVar7 = pcStack_c8;
          } while (lStack_f8 != lStack_100);
          goto code_r0x00036b94;
        }
        for (; pcVar1 != pcStack_c8; pcVar1 = pcVar1 + 1) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                    (pcVar2,(long)*pcVar1);
        }
        pcVar2 = (char *)func_0x00036c94(&lStack_100,pcVar2,param_5,lVar4,param_6);
        pcVar3 = pcStack_b8;
        pcVar8 = pcStack_b0;
        if ((uVar13 >> 9 & 1) != 0) goto code_r0x00036bd8;
joined_r0x00036b9c:
        for (; pcVar3 != pcVar8; pcVar3 = pcVar3 + 1) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                    (pcVar2,(long)*pcVar3);
        }
      }
      else if ((uVar13 >> 10 & 1) == 0) {
        do {
          pcVar2 = (char *)func_0x00036c94(&lStack_100,pcVar2,param_5,lVar4,param_6);
          pcVar8 = pcStack_b0;
          pcVar3 = pcStack_b8;
          func_0x00037058(auStack_120);
        } while (lStack_f8 != lStack_100);
code_r0x00036b94:
        if ((uVar13 >> 9 & 1) == 0) goto joined_r0x00036b9c;
      }
      else {
        pcVar2 = (char *)func_0x00036c94(&lStack_100,pcVar2,param_5,lVar4,param_6);
      }
    }
code_r0x00036bd8:
    lStack_f8 = lStack_100;
code_r0x00036bdc:
    if (lStack_f8 != 0) {
      __ZdlPv();
    }
    return pcVar2;
  }
  pcVar3 = (char *)puVar5[1];
  uVar9 = (long)pcVar3 - (long)pcVar2;
  if (param_4 <= (ulong)((long)uVar9 >> 4)) {
    if (pcVar1 == param_3) {
      pcVar7 = pcVar2;
    }
    else {
      pcVar7 = param_3 + (-0x10 - (long)pcVar1);
      if (((pcVar7 < &section_000000b8.reloff) ||
          (uVar9 = (ulong)pcVar7 & 0xfffffffffffffff0 | 8,
          lVar4 = ((ulong)pcVar7 & 0xfffffffffffffff0) + 0x10,
          pcVar1 < pcVar2 + uVar9 && pcVar2 < pcVar1 + uVar9)) ||
         (pcVar2 + 8 < pcVar1 + lVar4 && pcVar1 + 8 < pcVar2 + lVar4)) {
        pcVar8 = pcVar2;
        pcVar3 = pcVar1;
      }
      else {
        uVar9 = ((ulong)pcVar7 >> 4) + 1;
        uVar11 = uVar9 & 0x1ffffffffffffff8;
        pcVar7 = pcVar2 + uVar11 * 0x10;
        pcVar3 = pcVar1 + uVar11 * 0x10;
        pcVar1 = pcVar1 + 0x40;
        uVar10 = uVar11;
        pcVar8 = pcVar2 + 0x40;
        do {
          uVar15 = *(undefined8 *)(pcVar1 + -0x38);
          uVar14 = *(undefined8 *)(pcVar1 + -0x30);
          uVar16 = *(undefined8 *)(pcVar1 + -0x28);
          uVar17 = *(undefined8 *)(pcVar1 + -0x20);
          uVar19 = *(undefined8 *)(pcVar1 + -0x18);
          uVar18 = *(undefined8 *)(pcVar1 + -0x10);
          uVar20 = *(undefined8 *)(pcVar1 + -8);
          uVar21 = *(undefined8 *)pcVar1;
          uVar23 = *(undefined8 *)(pcVar1 + 8);
          uVar22 = *(undefined8 *)(pcVar1 + 0x10);
          uVar24 = *(undefined8 *)(pcVar1 + 0x18);
          uVar25 = *(undefined8 *)(pcVar1 + 0x20);
          uVar27 = *(undefined8 *)(pcVar1 + 0x28);
          uVar26 = *(undefined8 *)(pcVar1 + 0x30);
          uVar28 = *(undefined8 *)(pcVar1 + 0x38);
          *(undefined8 *)(pcVar8 + -0x40) = *(undefined8 *)(pcVar1 + -0x40);
          *(undefined8 *)(pcVar8 + -0x38) = uVar15;
          *(undefined8 *)(pcVar8 + -0x30) = uVar14;
          *(undefined8 *)(pcVar8 + -0x28) = uVar16;
          *(undefined8 *)(pcVar8 + -0x20) = uVar17;
          *(undefined8 *)(pcVar8 + -0x18) = uVar19;
          *(undefined8 *)(pcVar8 + -0x10) = uVar18;
          *(undefined8 *)(pcVar8 + -8) = uVar20;
          *(undefined8 *)pcVar8 = uVar21;
          *(undefined8 *)(pcVar8 + 8) = uVar23;
          *(undefined8 *)(pcVar8 + 0x10) = uVar22;
          *(undefined8 *)(pcVar8 + 0x18) = uVar24;
          *(undefined8 *)(pcVar8 + 0x20) = uVar25;
          *(undefined8 *)(pcVar8 + 0x28) = uVar27;
          *(undefined8 *)(pcVar8 + 0x30) = uVar26;
          *(undefined8 *)(pcVar8 + 0x38) = uVar28;
          pcVar1 = pcVar1 + 0x80;
          uVar10 = uVar10 - 8;
          pcVar8 = pcVar8 + 0x80;
        } while (uVar10 != 0);
        pcVar8 = pcVar7;
        if (uVar9 == uVar11) goto code_r0x000368dc;
      }
      do {
        pcVar1 = pcVar3 + 0x10;
        uVar14 = *(undefined8 *)(pcVar3 + 8);
        pcVar7 = pcVar8 + 0x10;
        *(undefined8 *)pcVar8 = *(undefined8 *)pcVar3;
        *(undefined8 *)(pcVar8 + 8) = uVar14;
        pcVar8 = pcVar7;
        pcVar3 = pcVar1;
      } while (pcVar1 != param_3);
    }
code_r0x000368dc:
    lVar4 = (long)pcVar7 - (long)pcVar2;
    pcVar3 = pcVar2;
    goto code_r0x000368e4;
  }
  pcVar7 = pcVar1 + ((long)uVar9 >> 4) * 0x10;
  if (pcVar3 != pcVar2) {
    if (uVar9 - 0x10 < 0xf0) {
code_r0x00036860:
      pcVar8 = pcVar2;
      pcVar6 = pcVar1;
    }
    else {
      uVar10 = uVar9 & 0xfffffffffffffff0;
      if ((pcVar1 < pcVar2 + (uVar10 - 8) && pcVar2 < pcVar1 + (uVar10 - 8)) ||
         (pcVar2 + 8 < pcVar1 + uVar10 && pcVar1 + 8 < pcVar2 + uVar10)) goto code_r0x00036860;
      uVar9 = (uVar9 - 0x10 >> 4) + 1;
      uVar11 = uVar9 & 0x1ffffffffffffff8;
      pcVar8 = pcVar2 + uVar11 * 0x10;
      pcVar6 = pcVar1 + uVar11 * 0x10;
      pcVar1 = pcVar1 + 0x40;
      uVar10 = uVar11;
      pcVar12 = pcVar2 + 0x40;
      do {
        uVar15 = *(undefined8 *)(pcVar1 + -0x38);
        uVar14 = *(undefined8 *)(pcVar1 + -0x30);
        uVar16 = *(undefined8 *)(pcVar1 + -0x28);
        uVar17 = *(undefined8 *)(pcVar1 + -0x20);
        uVar19 = *(undefined8 *)(pcVar1 + -0x18);
        uVar18 = *(undefined8 *)(pcVar1 + -0x10);
        uVar20 = *(undefined8 *)(pcVar1 + -8);
        uVar21 = *(undefined8 *)pcVar1;
        uVar23 = *(undefined8 *)(pcVar1 + 8);
        uVar22 = *(undefined8 *)(pcVar1 + 0x10);
        uVar24 = *(undefined8 *)(pcVar1 + 0x18);
        uVar25 = *(undefined8 *)(pcVar1 + 0x20);
        uVar27 = *(undefined8 *)(pcVar1 + 0x28);
        uVar26 = *(undefined8 *)(pcVar1 + 0x30);
        uVar28 = *(undefined8 *)(pcVar1 + 0x38);
        *(undefined8 *)(pcVar12 + -0x40) = *(undefined8 *)(pcVar1 + -0x40);
        *(undefined8 *)(pcVar12 + -0x38) = uVar15;
        *(undefined8 *)(pcVar12 + -0x30) = uVar14;
        *(undefined8 *)(pcVar12 + -0x28) = uVar16;
        *(undefined8 *)(pcVar12 + -0x20) = uVar17;
        *(undefined8 *)(pcVar12 + -0x18) = uVar19;
        *(undefined8 *)(pcVar12 + -0x10) = uVar18;
        *(undefined8 *)(pcVar12 + -8) = uVar20;
        *(undefined8 *)pcVar12 = uVar21;
        *(undefined8 *)(pcVar12 + 8) = uVar23;
        *(undefined8 *)(pcVar12 + 0x10) = uVar22;
        *(undefined8 *)(pcVar12 + 0x18) = uVar24;
        *(undefined8 *)(pcVar12 + 0x20) = uVar25;
        *(undefined8 *)(pcVar12 + 0x28) = uVar27;
        *(undefined8 *)(pcVar12 + 0x30) = uVar26;
        *(undefined8 *)(pcVar12 + 0x38) = uVar28;
        pcVar1 = pcVar1 + 0x80;
        uVar10 = uVar10 - 8;
        pcVar12 = pcVar12 + 0x80;
      } while (uVar10 != 0);
      if (uVar9 == uVar11) goto LAB_00036878;
    }
    do {
      pcVar1 = pcVar6 + 0x10;
      uVar14 = *(undefined8 *)(pcVar6 + 8);
      *(undefined8 *)pcVar8 = *(undefined8 *)pcVar6;
      *(undefined8 *)(pcVar8 + 8) = uVar14;
      pcVar8 = pcVar8 + 0x10;
      pcVar6 = pcVar1;
    } while (pcVar1 != pcVar7);
  }
LAB_00036878:
  pcVar1 = pcVar3;
  if (pcVar7 != param_3) {
    pcVar8 = pcVar3;
    do {
      pcVar6 = pcVar7 + 0x10;
      uVar14 = *(undefined8 *)pcVar7;
      *(undefined8 *)(pcVar8 + 8) = *(undefined8 *)(pcVar7 + 8);
      *(undefined8 *)pcVar8 = uVar14;
      pcVar1 = pcVar1 + 0x10;
      pcVar7 = pcVar6;
      pcVar8 = pcVar8 + 0x10;
    } while (pcVar6 != param_3);
  }
  lVar4 = (long)pcVar1 - (long)pcVar3;
code_r0x000368e4:
  puVar5[1] = pcVar3 + lVar4;
  return pcVar2;
}

