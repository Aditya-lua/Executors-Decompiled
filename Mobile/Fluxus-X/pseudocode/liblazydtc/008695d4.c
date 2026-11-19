/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008695d4
 */

/* WARNING: Removing unreachable block (ram,0x00869d00) */
/* WARNING: Removing unreachable block (ram,0x00869e9c) */

undefined8 FUN_008695d4(long param_1,uint param_2,uint param_3)

{
  uint uVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  uint uVar5;
  int iVar6;
  undefined4 uVar7;
  int iVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  char *pcVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  undefined8 *puVar16;
  ulong uVar17;
  ulong uVar18;
  uint unaff_w22;
  char *pcVar19;
  undefined8 uVar20;
  long lVar21;
  undefined8 uVar22;
  char cVar23;
  undefined8 uVar24;
  undefined1 uVar25;
  char *pcVar26;
  undefined8 uVar27;
  undefined1 auVar28 [16];
  ulong local_138;
  undefined8 local_130;
  undefined8 local_128;
  undefined8 uStack_120;
  undefined8 local_118;
  undefined8 local_110;
  undefined4 uStack_108;
  int iStack_104;
  ulong local_100;
  undefined8 local_f8;
  undefined1 local_f0 [16];
  undefined1 local_e0 [16];
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_b8;
  char cStack_b0;
  undefined7 uStack_af;
  char cStack_a8;
  undefined7 uStack_a7;
  char local_a0;
  undefined7 uStack_9f;
  char cStack_98;
  undefined7 uStack_97;
  undefined1 local_90;
  undefined7 local_88;
  char cStack_81;
  undefined7 uStack_80;
  long local_78;
  
  uVar5 = DAT_00d1eba0;
  lVar2 = tpidr_el0;
  local_78 = *(long *)(lVar2 + 0x28);
  uVar1 = *(int *)(param_1 + 0x124) + 1;
  *(uint *)(param_1 + 0x124) = uVar1;
  if (uVar5 < uVar1) {
    if (*(long *)(lVar2 + 0x28) == local_78) {
      uVar9 = FUN_008578f8(param_1 + 0x94,
                           "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                           ,"type annotation");
                    /* catch() { ... } // from try @ 00869b9c with catch @ 00869e44 */
                    /* catch() { ... } // from try @ 00869bc8 with catch @ 00869e74 */
      lVar13 = *local_110 + CONCAT44(iStack_104,uStack_108) * 8;
      if (lVar13 != local_110[1]) {
        local_110[1] = lVar13;
      }
      if (*(long *)(lVar2 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar9);
      }
    }
    goto LAB_00869ec8;
  }
  uStack_c8 = *(undefined8 *)(param_1 + 0x9c);
  local_d0 = *(undefined8 *)(param_1 + 0x94);
  iVar6 = *(int *)(param_1 + 0x90);
  local_e0._0_8_ = 0;
  local_e0._8_8_ = 0;
  auVar28 = ZEXT816(0);
  if (iVar6 < 0x119) {
    if (0x109 < iVar6) {
      if (1 < iVar6 - 0x116U) {
        if ((iVar6 == 0x10a) || (iVar6 == 0x10d)) {
          FUN_00869ecc(param_1);
          pcVar11 = "Interpolated string literals cannot be used as types";
          goto LAB_008699b0;
        }
        goto LAB_008697a8;
      }
      if (*(char *)(param_1 + 0x68) == '\x01') {
        if (iVar6 == 0x117) {
          iVar6 = FUN_008533bc();
          uVar7 = 0;
          unaff_w22 = (uint)(iVar6 == 1);
        }
        else {
          uVar7 = FUN_00853390();
          unaff_w22 = 2;
        }
        puVar10 = &local_110;
        if ((*(byte *)(param_1 + 0x68) & 1) == 0) {
          puVar10 = (undefined8 *)0x0;
        }
      }
      else {
        uVar7 = 0;
        puVar10 = (undefined8 *)0x0;
      }
      local_110._0_4_ = 0;
      local_110._4_4_ = 0;
      uStack_108 = 0;
      iStack_104 = 0;
      FUN_00865548(&local_b8,param_1,puVar10);
      if (cStack_a8 == '\x01') {
        cStack_98 = cStack_b0;
        uStack_97 = uStack_af;
        local_a0 = (char)local_b8;
        uStack_9f = (undefined7)((ulong)local_b8 >> 8);
        uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
        FUN_00851080(uVar9,&local_d0,&local_a0);
        if (*(char *)(param_1 + 0x68) == '\x01') {
          uVar20 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
          FUN_00852160(uVar20,CONCAT44(local_110._4_4_,(int)local_110),
                       CONCAT44(iStack_104,uStack_108),unaff_w22,uVar7);
          puVar10 = (undefined8 *)local_f0;
          local_f0._0_8_ = uVar9;
LAB_00869a9c:
          puVar10 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,puVar10);
          *puVar10 = uVar20;
        }
        goto LAB_008699c8;
      }
      pcVar11 = "String literal contains malformed escape sequence";
      pcVar26 = &local_a0;
      local_a0 = '\0';
      uStack_9f = 0;
      cStack_98 = '\0';
      uStack_97 = 0;
      goto LAB_008699bc;
    }
    if ((iVar6 == 0x28) || (iVar6 == 0x3c)) {
      puVar10 = &local_b8;
      local_b8 = (char *)0x0;
      cStack_b0 = '\0';
      uStack_af = 0;
LAB_00869770:
      local_e0 = auVar28;
      uVar9 = FUN_00868ac8(param_1,param_2 & 1,puVar10);
      goto LAB_008699c8;
    }
    if (iVar6 != 0x7b) goto LAB_008697a8;
    uVar9 = FUN_00867ea0(param_1,param_3 & 1);
LAB_008699c0:
  }
  else {
    if (iVar6 < 0x129) {
      if (iVar6 - 0x11cU < 2) {
        if ((param_3 & 1) != 0) {
          auVar28 = FUN_00862f80(param_1,0);
          puVar10 = (undefined8 *)local_e0;
          goto LAB_00869770;
        }
        pcVar11 = "attributes are not allowed in declaration context";
      }
      else {
        if (iVar6 == 0x119) {
          pcVar11 = *(char **)(param_1 + 0xa8);
          cStack_a8 = (char)*(undefined8 *)(param_1 + 0x9c);
          uStack_a7 = (undefined7)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 8);
          cStack_b0 = (char)*(undefined8 *)(param_1 + 0x94);
          uStack_af = (undefined7)((ulong)*(undefined8 *)(param_1 + 0x94) >> 8);
          FUN_00858f2c(param_1);
          iVar6 = *(int *)(param_1 + 0x90);
          local_b8 = pcVar11;
          if (iVar6 == 0x106) {
            FUN_00860ecc(param_1,param_1 + 0x94,
                         "Unexpected \'...\' after type name; type pack is not allowed in this context"
                        );
            FUN_00858f2c(param_1);
LAB_00869afc:
            uVar20 = 0;
            pcVar19 = (char *)0x0;
            uVar25 = 0;
            cVar23 = '\0';
            local_138 = 0xffffffff00000000;
            local_130 = 0;
            uVar18 = 0xffffffff;
            pcVar26 = pcVar11;
          }
          else {
            if (iVar6 != 0x2e) {
              if ((pcVar11 != (char *)0x0) && (iVar8 = strcmp(pcVar11,"typeof"), iVar8 == 0)) {
                uVar22 = *(undefined8 *)(param_1 + 0x94);
                uVar18 = FUN_00860f60(param_1,0x28,"typeof type");
                uVar20 = FUN_0086060c(param_1,0);
                uVar24 = *(undefined8 *)(param_1 + 0x94);
                uVar9 = *(undefined8 *)(param_1 + 0x9c);
                local_110._4_4_ = (undefined4)uVar22;
                uStack_108 = (undefined4)((ulong)uVar22 >> 0x20);
                local_110._0_4_ = iVar6;
                uVar12 = FUN_00862e00(param_1,0x29,&local_110,0);
                local_110._0_4_ = (int)local_d0;
                local_110._4_4_ = (undefined4)((ulong)local_d0 >> 0x20);
                uStack_108 = (undefined4)uVar9;
                iStack_104 = (int)((ulong)uVar9 >> 0x20);
                uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
                FUN_00850e1c(uVar9,&local_110,uVar20);
                if (*(char *)(param_1 + 0x68) == '\x01') {
                  if ((uVar18 & 1) == 0) {
                    uVar22 = 0xffffffffffffffff;
                  }
                  if ((uVar12 & 1) == 0) {
                    uVar24 = 0xffffffffffffffff;
                  }
                  uVar20 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x14);
                  FUN_00852118(uVar20,uVar22,uVar24);
                  local_110._0_4_ = (int)uVar9;
                  local_110._4_4_ = (undefined4)((ulong)uVar9 >> 0x20);
                  puVar10 = &local_110;
                  goto LAB_00869a9c;
                }
                goto LAB_008699c8;
              }
              goto LAB_00869afc;
            }
            uVar18 = *(ulong *)(param_1 + 0x94);
            FUN_00858f2c(param_1);
            cVar23 = cStack_b0;
            local_88 = uStack_af;
            cStack_81 = cStack_a8;
            uStack_80 = uStack_a7;
            if (*(long *)(param_1 + 0x1a8) != 0) {
              uVar12 = ((ulong)pcVar11 >> 4 ^ (ulong)pcVar11 >> 9) * -0x61c8864680b583eb >>
                       ((ulong)*(byte *)(param_1 + 0x1b0) & 0x3f);
              if ((*(ulong *)(*(long *)(param_1 + 0x198) + (uVar12 >> 6) * 8) >> (uVar12 & 0x3f) & 1
                  ) != 0) {
                do {
                  if (*(char **)(*(long *)(param_1 + 0x180) + uVar12 * 0x10) == pcVar11) {
                    local_130 = *(undefined8 *)(*(long *)(param_1 + 0x180) + uVar12 * 0x10 + 8);
                    goto LAB_008698d4;
                  }
                  uVar12 = uVar12 + 1 & *(long *)(param_1 + 0x1a0) - 1U;
                } while ((*(ulong *)(*(long *)(param_1 + 0x198) + (uVar12 >> 6) * 8) >>
                          (uVar12 & 0x3f) & 1) != 0);
              }
            }
            local_130 = 0;
LAB_008698d4:
            local_138 = uVar18 & 0xffffffff00000000;
            if ((*(int *)(param_1 + 0x90) == 0x119) ||
               ((FUN_0086e040(param_1,"field name"), *(int *)(param_1 + 0x90) - 0x123U < 0x15 &&
                (*(int *)(param_1 + 0x94) == (int)uVar18)))) {
              pcVar26 = *(char **)(param_1 + 0xa8);
              uVar20 = *(undefined8 *)(param_1 + 0x94);
              uVar9 = *(undefined8 *)(param_1 + 0x9c);
              FUN_00858f2c(param_1);
            }
            else {
              uVar20 = *(undefined8 *)(param_1 + 0x94);
              pcVar26 = *(char **)(param_1 + 0x138);
              uVar9 = uVar20;
            }
            cStack_b0 = (char)uVar20;
            uStack_af = (undefined7)((ulong)uVar20 >> 8);
            uVar18 = uVar18 & 0xffffffff;
            uVar20 = 1;
            uVar25 = 1;
            cStack_a8 = (char)uVar9;
            uStack_a7 = (undefined7)((ulong)uVar9 >> 8);
            pcVar19 = pcVar11;
            local_b8 = pcVar26;
          }
          iVar6 = *(int *)(param_1 + 0x90);
          local_110 = (long *)(param_1 + 0x450);
          local_f0._0_8_ = 0;
          local_f0._8_8_ = 0;
          auVar28 = ZEXT816(0);
          lVar13 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450);
          local_100 = 0;
          local_f8 = 0xffffffffffffffff;
          local_118 = 0xffffffffffffffff;
          uStack_108 = (undefined4)(lVar13 >> 3);
          iStack_104 = (int)(lVar13 >> 0x23);
          if (iVar6 == 0x3c) {
            if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 00869b84 to 00869b97 has its CatchHandler @ 00869e48 */
              auVar28 = FUN_0086ab5c(param_1,&local_f8,&local_110,&local_118);
            }
            else {
                    /* try { // try from 00869b9c to 00869baf has its CatchHandler @ 00869e44 */
              auVar28 = FUN_0086ab5c(param_1,0,0,0);
            }
          }
          uStack_120 = *(undefined8 *)(param_1 + 0xb8);
          local_128 = local_d0;
          local_f0 = auVar28;
                    /* try { // try from 00869bc8 to 00869c1f has its CatchHandler @ 00869e74 */
          uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x78);
          uStack_9f = local_88;
          cStack_98 = cStack_81;
          uStack_97 = uStack_80;
          local_a0 = cVar23;
          local_90 = uVar25;
          FUN_00850b3c(uVar9,&local_128,pcVar19,uVar20,pcVar26,&local_a0,&cStack_b0,iVar6 == 0x3c,
                       local_f0,local_130);
          uVar12 = local_100;
          if (*(char *)(param_1 + 0x68) == '\x01') {
            uVar20 = *(undefined8 *)(param_1 + 0xe8);
            if (local_100 == 0) {
              lVar13 = 0;
            }
            else {
              lVar4 = CONCAT44(iStack_104,uStack_108);
              lVar21 = *local_110;
                    /* try { // try from 00869c44 to 00869cc7 has its CatchHandler @ 00869e70 */
              lVar13 = FUN_0084e938(uVar20,local_100 << 3);
              if ((uVar12 < 8) || (lVar15 = lVar4 * 8 + lVar21, (ulong)(lVar13 - lVar15) < 0x20)) {
                uVar14 = 0;
              }
              else {
                uVar14 = uVar12 & 0xfffffffffffffffc;
                puVar10 = (undefined8 *)(lVar13 + 0x10);
                puVar16 = (undefined8 *)(lVar15 + 0x10);
                uVar17 = uVar14;
                do {
                  puVar3 = puVar16 + -1;
                  uVar22 = puVar16[-2];
                  uVar27 = puVar16[1];
                  uVar24 = *puVar16;
                  uVar17 = uVar17 - 4;
                  puVar16 = puVar16 + 4;
                  puVar10[-1] = *puVar3;
                  puVar10[-2] = uVar22;
                  puVar10[1] = uVar27;
                  *puVar10 = uVar24;
                  puVar10 = puVar10 + 4;
                } while (uVar17 != 0);
                if (uVar12 == uVar14) goto LAB_00869c9c;
              }
              lVar15 = uVar12 - uVar14;
              puVar10 = (undefined8 *)(lVar21 + uVar14 * 8 + lVar4 * 8);
              puVar16 = (undefined8 *)(lVar13 + uVar14 * 8);
              do {
                lVar15 = lVar15 + -1;
                *puVar16 = *puVar10;
                puVar10 = puVar10 + 1;
                puVar16 = puVar16 + 1;
              } while (lVar15 != 0);
            }
LAB_00869c9c:
            uVar20 = FUN_0084e938(uVar20,0x30);
            FUN_008520a8(uVar20,uVar18 | local_138,local_f8,lVar13,uVar12,local_118);
            local_a0 = (char)uVar9;
            uStack_9f = (undefined7)((ulong)uVar9 >> 8);
                    /* try { // try from 00869ccc to 00869cd7 has its CatchHandler @ 00869e4c */
            puVar10 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
            *puVar10 = uVar20;
          }
          auVar28._8_8_ = local_e0._8_8_;
          auVar28._0_8_ = local_e0._0_8_;
          lVar13 = *local_110 + CONCAT44(iStack_104,uStack_108) * 8;
          if (lVar13 != local_110[1]) {
            local_110[1] = lVar13;
            local_e0 = auVar28;
          }
          goto LAB_008699c8;
        }
        if (iVar6 != 0x11e) goto LAB_008697a8;
        FUN_00858f2c(param_1);
        pcVar11 = "Malformed string; did you forget to finish it?";
      }
LAB_008699b0:
      uStack_af = 0;
      cStack_b0 = '\0';
      local_b8 = (char *)0x0;
      pcVar26 = (char *)&local_b8;
LAB_008699bc:
      uVar9 = FUN_008653a4(param_1,&local_d0,pcVar26,pcVar11);
      goto LAB_008699c0;
    }
    if (iVar6 < 0x12f) {
      if (iVar6 == 0x129) {
        FUN_00858f2c(param_1);
        uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
        uVar20 = 0;
LAB_00869948:
        FUN_00851034(uVar9,&local_d0,uVar20);
        goto LAB_008699c8;
      }
      if (iVar6 == 299) {
        FUN_00858f2c(param_1);
        pcVar11 = 
        "Using \'function\' as a type annotation is not supported, consider replacing with a function type annotation e.g. \'(...any) -> ...any\'"
        ;
        goto LAB_008699b0;
      }
    }
    else {
      if (iVar6 == 0x12f) {
        FUN_00858f2c(param_1);
        uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x78);
        local_b8 = (char *)((ulong)local_b8 & 0xffffffffffffff00);
        cStack_a8 = '\0';
        local_110._0_4_ = 0;
        local_110._4_4_ = 0;
        uStack_108 = 0;
        iStack_104 = 0;
        FUN_00850b3c(uVar9,&local_d0,0,0,*(undefined8 *)(param_1 + 0x140),&local_b8,&local_d0,0,
                     &local_110,0);
        goto LAB_008699c8;
      }
      if (iVar6 == 0x135) {
        FUN_00858f2c(param_1);
        uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
        uVar20 = 1;
        goto LAB_00869948;
      }
    }
LAB_008697a8:
    uVar9 = *(undefined8 *)(param_1 + 0xb8);
    local_110._0_4_ = (int)uVar9;
    local_110._4_4_ = (undefined4)((ulong)uVar9 >> 0x20);
    uStack_108 = (undefined4)local_d0;
    iStack_104 = (int)((ulong)local_d0 >> 0x20);
    local_a0 = (char)uVar9;
    uStack_9f = (undefined7)((ulong)uVar9 >> 8);
    cStack_98 = (char)uStack_c8;
    uStack_97 = (undefined7)((ulong)uStack_c8 >> 8);
    FUN_008521fc(&local_b8);
    lVar13 = CONCAT71(uStack_a7,cStack_a8);
    if (((ulong)local_b8 & 1) == 0) {
      lVar13 = (long)&local_b8 + 1;
    }
                    /* try { // try from 008697d4 to 008697eb has its CatchHandler @ 00869e50 */
    uVar9 = FUN_0086b050(param_1,&local_a0,&local_110,"Expected type, got %s",lVar13);
    if (((ulong)local_b8 & 1) != 0) {
      operator_delete((void *)CONCAT71(uStack_a7,cStack_a8),(ulong)local_b8 & 0xfffffffffffffffe);
    }
  }
LAB_008699c8:
  if (*(long *)(lVar2 + 0x28) == local_78) {
    return uVar9;
  }
LAB_00869ec8:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

