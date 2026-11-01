
undefined * FUN_0041ca54(long param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  undefined *puVar2;
  code *pcVar3;
  bool bVar4;
  long *plVar5;
  undefined *puVar6;
  uint *puVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 extraout_x1;
  ulong uVar10;
  undefined *puVar11;
  long *plVar12;
  long unaff_x19;
  long lVar13;
  long unaff_x22;
  undefined8 uVar14;
  long lVar15;
  long unaff_x24;
  long lVar16;
  long unaff_x26;
  undefined8 *puVar17;
  undefined1 auVar18 [16];
  undefined1 auStack_160 [16];
  undefined1 ***pppuStack_150;
  undefined *puStack_148;
  undefined1 auStack_140 [16];
  undefined *puStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined1 **ppuStack_c0;
  undefined *puStack_b8;
  undefined *puStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined1 *puStack_30;
  undefined8 uStack_28;
  undefined1 auStack_6 [6];
  
  func_0x007a2334(param_1 + 0x5b8);
  *(long *)(unaff_x19 + 0x18) = *(long *)(unaff_x19 + 0x18) + 1;
  plVar5 = (long *)__Unwind_Resume();
  lVar13 = *plVar5;
  if (*(long *)(lVar13 + 0x18) == 0) {
    *(undefined8 *)(lVar13 + 0x18) = 0xffffffffffffffff;
    puVar6 = (undefined *)func_0x004182bc(lVar13 + 0x20);
    *(long *)(lVar13 + 0x18) = *(long *)(lVar13 + 0x18) + 1;
    return puVar6;
  }
  func_0x007a2334(&UNK_009da5d0);
  *(long *)(lVar13 + 0x18) = *(long *)(lVar13 + 0x18) + 1;
  auVar18 = __Unwind_Resume();
  lVar15 = auVar18._8_8_;
  uStack_28 = 0x41cac8;
  ppuStack_c0 = &puStack_30;
  lVar16 = *auVar18._0_8_;
  puStack_30 = auStack_6 + -10;
  if (*(long *)(lVar16 + 0x18) != 0) {
    func_0x007a2334(&UNK_009da5e8);
    *(long *)(lVar16 + 0x18) = *(long *)(lVar16 + 0x18) + 1;
    auVar18 = __Unwind_Resume();
    puStack_b8 = &
                 __ZN61__LT_std__io__stdio__StdoutLock_u20_as_u20_std__io__Write_GT_18write_all_vectored17hbc20396632a4c05eE
    ;
    lVar15 = *auVar18._0_8_;
    if (*(long *)(lVar15 + 0x18) != 0) {
      uVar14 = func_0x007a2334(&UNK_009da600);
      if (*(long *)(unaff_x26 + 8) != 0) {
        func_0x00187bd4();
      }
      func_0x00187bd4(lVar13,0x18,8);
      *(long *)(lVar15 + 0x18) = *(long *)(lVar15 + 0x18) + 1;
      __Unwind_Resume(uVar14);
      *(long *)(lVar15 + 0x18) = *(long *)(lVar15 + 0x18) + 1;
      uVar14 = __Unwind_Resume();
      if (unaff_x22 != 0) {
        func_0x003f67e4(unaff_x24 + 8);
      }
      *(long *)(lVar15 + 0x18) = *(long *)(lVar15 + 0x18) + 1;
      __Unwind_Resume(uVar14);
      func_0x007a2668();
      puStack_148 = &
                    __ZN63__LT_std__io__stdio__StdoutLock_u20_as_u20_core__fmt__Debug_GT_3fmt17hf8884b12141824dfE
      ;
      pppuStack_150 = &ppuStack_c0;
      func_0x00469240(auStack_160,extraout_x1,&UNK_0088635d,10);
      puVar6 = (undefined *)func_0x00465564(auStack_160);
      return puVar6;
    }
    *(undefined8 *)(lVar15 + 0x18) = 0xffffffffffffffff;
    if (param_3 != 0) {
      uVar9 = 0;
      lVar13 = param_3 << 4;
      plVar5 = (long *)(auVar18._8_8_ + 8);
      do {
        if (*plVar5 != 0) goto code_r0x0041cd94;
        uVar9 = uVar9 + 1;
        lVar13 = lVar13 + -0x10;
        plVar5 = plVar5 + 2;
      } while (lVar13 != 0);
      uVar9 = (param_3 - 1 & 0xfffffffffffffff) + 1;
code_r0x0041cd94:
      if (param_3 < uVar9) {
        func_0x007a28a4(uVar9,param_3,&UNK_009da738);
LAB_0041cfa8:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x41cfac);
        (*pcVar3)();
      }
      if (param_3 - uVar9 != 0) {
        plVar5 = (long *)(auVar18._8_8_ + uVar9 * 0x10);
        uVar9 = param_3 - uVar9;
code_r0x0041ce04:
        do {
          auVar18 = func_0x00418640(lVar15 + 0x20,plVar5,uVar9);
          puVar6 = auVar18._8_8_;
          auStack_140 = auVar18;
          if ((auVar18._0_8_ & 1) == 0) {
            if (puVar6 == (undefined *)0x0) {
              puVar6 = &UNK_009da470;
              goto code_r0x0041cda4;
            }
            uVar10 = 0;
            lVar13 = uVar9 << 4;
            puVar11 = puVar6;
            plVar12 = plVar5 + 1;
            do {
              puVar2 = puVar11 + -*plVar12;
              if (puVar11 < (undefined *)*plVar12) goto LAB_0041ce88;
              uVar10 = uVar10 + 1;
              lVar13 = lVar13 + -0x10;
              puVar11 = puVar2;
              plVar12 = plVar12 + 2;
            } while (lVar13 != 0);
            uVar10 = (uVar9 - 1 & 0xfffffffffffffff) + 1;
LAB_0041ce88:
            uVar8 = uVar9 - uVar10;
            if (uVar9 < uVar10) {
              func_0x007a28a4(uVar10,uVar9,&UNK_009da738);
              goto LAB_0041cfa8;
            }
            plVar5 = plVar5 + uVar10 * 2;
            if (uVar8 == 0) {
              if (puVar11 != (undefined *)0x0) {
                puStack_130 = &UNK_009da750;
                puVar6 = &UNK_009da760;
LAB_0041cf78:
                uStack_128 = 1;
                uStack_120 = 8;
                uStack_118 = 0;
                uStack_110 = 0;
                func_0x007a2420(&puStack_130,puVar6);
                goto LAB_0041cfa8;
              }
              uVar8 = 0;
            }
            else {
              if ((undefined *)plVar5[1] < puVar11) {
                puStack_130 = &UNK_009da778;
                puVar6 = &UNK_009da788;
                goto LAB_0041cf78;
              }
              *plVar5 = (long)(puVar11 + *plVar5);
              plVar5[1] = plVar5[1] - (long)puVar11;
            }
          }
          else {
            uVar10 = (ulong)puVar6 & 3;
            uVar8 = uVar9;
            if (uVar10 < 2) {
              if (uVar10 != 0) {
                if (puVar6[0xf] == '#') goto LAB_0041cdec;
                goto code_r0x0041cda4;
              }
              if (puVar6[0x10] != '#') goto code_r0x0041cda4;
            }
            else if (uVar10 == 2) {
              if ((ulong)puVar6 >> 0x20 != 4) goto code_r0x0041cda4;
            }
            else if ((ulong)puVar6 >> 0x20 != 0x23) goto code_r0x0041cda4;
          }
LAB_0041cdec:
          uVar9 = uVar8;
          if ((auVar18._0_4_ & (uint)(((ulong)puVar6 & 3) == 1)) != 0) {
            uVar14 = *(undefined8 *)(puVar6 + -1);
            puVar17 = *(undefined8 **)(puVar6 + 7);
            if ((code *)*puVar17 != (code *)0x0) {
              (*(code *)*puVar17)(uVar14);
            }
            if (puVar17[1] != 0) {
              func_0x00187bd4(uVar14,puVar17[1],puVar17[2]);
            }
            func_0x00187bd4(puVar6 + -1,0x18,8);
            if (uVar8 == 0) break;
            goto code_r0x0041ce04;
          }
        } while (uVar8 != 0);
      }
    }
    puVar6 = (undefined *)0x0;
code_r0x0041cda4:
    *(long *)(lVar15 + 0x18) = *(long *)(lVar15 + 0x18) + 1;
    return puVar6;
  }
  *(undefined8 *)(lVar16 + 0x18) = 0xffffffffffffffff;
  auVar18 = func_0x0046b1e4(10);
  if ((auVar18._0_8_ & 1) == 0) {
    lVar13 = *(long *)(lVar16 + 0x30);
    if ((lVar13 != 0) && (*(char *)(*(long *)(lVar16 + 0x28) + lVar13 + -1) == '\n')) {
      puVar6 = (undefined *)func_0x004182bc(lVar16 + 0x20);
      if (puVar6 != (undefined *)0x0) goto LAB_0041cbc4;
      lVar13 = *(long *)(lVar16 + 0x30);
    }
    if (param_3 < (ulong)(*(long *)(lVar16 + 0x20) - lVar13)) goto LAB_0041cba4;
  }
  else {
    uVar9 = auVar18._8_8_ + 1;
    bVar4 = param_3 < uVar9;
    param_3 = param_3 - uVar9;
    if (bVar4) {
      puStack_b0 = &UNK_009d9318;
      uStack_a8 = 1;
      uStack_98 = 0;
      uStack_90 = 0;
      uStack_a0 = 8;
      func_0x007a2420(&puStack_b0,&UNK_009da458);
LAB_0041ccf4:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x41ccf8);
      (*pcVar3)();
    }
    lVar13 = *(long *)(lVar16 + 0x30);
    if (lVar13 == 0) {
      if (uVar9 != 0) {
        puVar6 = &UNK_009da470;
        lVar13 = lVar15;
        uVar10 = uVar9;
        do {
          while( true ) {
            uVar8 = uVar10;
            if (0x7ffffffd < uVar10) {
              uVar8 = 0x7ffffffe;
            }
            uVar8 = _write(1,lVar13,uVar8);
            if (uVar8 == 0xffffffffffffffff) break;
            if (uVar8 == 0) {
LAB_0041cc6c:
              if ((puVar6 != (undefined *)0x0) &&
                 (((ulong)puVar6 & 0xffffffff00000003) != 0x900000002)) goto LAB_0041cbc4;
              goto LAB_0041cc84;
            }
            uVar1 = uVar10 - uVar8;
            if (uVar10 < uVar8) {
              func_0x007a28a4(uVar8,uVar10,&UNK_009da7a0);
              goto LAB_0041ccf4;
            }
            lVar13 = lVar13 + uVar8;
            uVar10 = uVar1;
            if (uVar1 == 0) goto LAB_0041cc84;
          }
          puVar7 = (uint *)___error();
          if (*puVar7 != 4) {
            puVar6 = (undefined *)((ulong)*puVar7 << 0x20 | 2);
            goto LAB_0041cc6c;
          }
        } while (uVar10 != 0);
      }
    }
    else {
      if (uVar9 < (ulong)(*(long *)(lVar16 + 0x20) - lVar13)) {
        _memcpy(*(long *)(lVar16 + 0x28) + lVar13,lVar15,uVar9);
        *(ulong *)(lVar16 + 0x30) = lVar13 + uVar9;
      }
      else {
        puVar6 = (undefined *)func_0x007a04a8(lVar16 + 0x20,lVar15,uVar9);
        if (puVar6 != (undefined *)0x0) goto LAB_0041cbc4;
      }
      puVar6 = (undefined *)func_0x004182bc(lVar16 + 0x20);
      if (puVar6 != (undefined *)0x0) goto LAB_0041cbc4;
    }
LAB_0041cc84:
    lVar15 = lVar15 + uVar9;
    lVar13 = *(long *)(lVar16 + 0x30);
    if (param_3 < (ulong)(*(long *)(lVar16 + 0x20) - lVar13)) {
LAB_0041cba4:
      _memcpy(*(long *)(lVar16 + 0x28) + lVar13,lVar15,param_3);
      puVar6 = (undefined *)0x0;
      *(ulong *)(lVar16 + 0x30) = lVar13 + param_3;
      goto LAB_0041cbc4;
    }
  }
  puVar6 = (undefined *)func_0x007a04a8(lVar16 + 0x20,lVar15,param_3);
LAB_0041cbc4:
  *(long *)(lVar16 + 0x18) = *(long *)(lVar16 + 0x18) + 1;
  return puVar6;
}

