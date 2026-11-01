
undefined *
FUN_0051a4b8(long *param_1,long param_2,undefined8 param_3,undefined8 param_4,ulong param_5)

{
  ulong uVar1;
  undefined *puVar2;
  code *pcVar3;
  bool bVar4;
  undefined *puVar5;
  uint *puVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 extraout_x1;
  ulong uVar9;
  undefined *puVar10;
  long *plVar11;
  long *plVar12;
  long lVar13;
  undefined8 uVar14;
  long unaff_x22;
  long unaff_x24;
  long lVar15;
  undefined8 *puVar16;
  long unaff_x26;
  undefined1 auVar17 [16];
  undefined1 auStack_140 [16];
  long **pplStack_130;
  undefined *puStack_128;
  undefined1 auStack_120 [16];
  undefined *puStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  long *plStack_a0;
  undefined *puStack_98;
  undefined *puStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  long lStack_68;
  
  plVar11 = (long *)((long)register0x00000008 + -0x10);
  lVar15 = *param_1;
  if (*(long *)(lVar15 + 0x18) != 0) {
    func_0x007a2334(&UNK_009da5e8);
    *(long *)(lVar15 + 0x18) = *(long *)(lVar15 + 0x18) + 1;
    auVar17 = __Unwind_Resume();
    puStack_98 = &
                 __ZN61__LT_std__io__stdio__StdoutLock_u20_as_u20_std__io__Write_GT_18write_all_vectored17hbc20396632a4c05eE
    ;
    lVar15 = *auVar17._0_8_;
    plStack_a0 = plVar11;
    if (*(long *)(lVar15 + 0x18) != 0) {
      uVar14 = func_0x007a2334(&UNK_009da600);
      if (*(long *)(unaff_x26 + 8) != 0) {
        func_0x00187bd4();
      }
      func_0x00187bd4();
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
      puStack_128 = &
                    __ZN63__LT_std__io__stdio__StdoutLock_u20_as_u20_core__fmt__Debug_GT_3fmt17hf8884b12141824dfE
      ;
      pplStack_130 = &plStack_a0;
      func_0x00469240(auStack_140,extraout_x1,&UNK_0088635d,10);
      puVar5 = (undefined *)func_0x00465564(auStack_140);
      return puVar5;
    }
    *(undefined8 *)(lVar15 + 0x18) = 0xffffffffffffffff;
    if (param_5 != 0) {
      uVar8 = 0;
      lVar13 = param_5 << 4;
      plVar11 = (long *)(auVar17._8_8_ + 8);
      do {
        if (*plVar11 != 0) goto code_r0x0041cd94;
        uVar8 = uVar8 + 1;
        lVar13 = lVar13 + -0x10;
        plVar11 = plVar11 + 2;
      } while (lVar13 != 0);
      uVar8 = (param_5 - 1 & 0xfffffffffffffff) + 1;
code_r0x0041cd94:
      if (param_5 < uVar8) {
        func_0x007a28a4(uVar8,param_5,&UNK_009da738);
code_r0x0041cfa8:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x41cfac);
        (*pcVar3)();
      }
      if (param_5 - uVar8 != 0) {
        plVar11 = (long *)(auVar17._8_8_ + uVar8 * 0x10);
        uVar8 = param_5 - uVar8;
code_r0x0041ce04:
        do {
          auVar17 = func_0x00418640(lVar15 + 0x20,plVar11,uVar8);
          puVar5 = auVar17._8_8_;
          auStack_120 = auVar17;
          if ((auVar17._0_8_ & 1) == 0) {
            if (puVar5 == (undefined *)0x0) {
              puVar5 = &UNK_009da470;
              goto code_r0x0041cda4;
            }
            uVar9 = 0;
            lVar13 = uVar8 << 4;
            puVar10 = puVar5;
            plVar12 = plVar11 + 1;
            do {
              puVar2 = puVar10 + -*plVar12;
              if (puVar10 < (undefined *)*plVar12) goto code_r0x0041ce88;
              uVar9 = uVar9 + 1;
              lVar13 = lVar13 + -0x10;
              puVar10 = puVar2;
              plVar12 = plVar12 + 2;
            } while (lVar13 != 0);
            uVar9 = (uVar8 - 1 & 0xfffffffffffffff) + 1;
code_r0x0041ce88:
            uVar7 = uVar8 - uVar9;
            if (uVar8 < uVar9) {
              func_0x007a28a4(uVar9,uVar8,&UNK_009da738);
              goto code_r0x0041cfa8;
            }
            plVar11 = plVar11 + uVar9 * 2;
            if (uVar7 == 0) {
              if (puVar10 != (undefined *)0x0) {
                puStack_110 = &UNK_009da750;
                puVar5 = &UNK_009da760;
code_r0x0041cf78:
                uStack_108 = 1;
                uStack_100 = 8;
                uStack_f8 = 0;
                uStack_f0 = 0;
                func_0x007a2420(&puStack_110,puVar5);
                goto code_r0x0041cfa8;
              }
              uVar7 = 0;
            }
            else {
              if ((undefined *)plVar11[1] < puVar10) {
                puStack_110 = &UNK_009da778;
                puVar5 = &UNK_009da788;
                goto code_r0x0041cf78;
              }
              *plVar11 = (long)(puVar10 + *plVar11);
              plVar11[1] = plVar11[1] - (long)puVar10;
            }
          }
          else {
            uVar9 = (ulong)puVar5 & 3;
            uVar7 = uVar8;
            if (uVar9 < 2) {
              if (uVar9 != 0) {
                if (puVar5[0xf] == '#') goto code_r0x0041cdec;
                goto code_r0x0041cda4;
              }
              if (puVar5[0x10] != '#') goto code_r0x0041cda4;
            }
            else if (uVar9 == 2) {
              if ((ulong)puVar5 >> 0x20 != 4) goto code_r0x0041cda4;
            }
            else if ((ulong)puVar5 >> 0x20 != 0x23) goto code_r0x0041cda4;
          }
code_r0x0041cdec:
          uVar8 = uVar7;
          if ((auVar17._0_4_ & (uint)(((ulong)puVar5 & 3) == 1)) != 0) {
            uVar14 = *(undefined8 *)(puVar5 + -1);
            puVar16 = *(undefined8 **)(puVar5 + 7);
            if ((code *)*puVar16 != (code *)0x0) {
              (*(code *)*puVar16)(uVar14);
            }
            if (puVar16[1] != 0) {
              func_0x00187bd4(uVar14,puVar16[1],puVar16[2]);
            }
            func_0x00187bd4(puVar5 + -1,0x18,8);
            if (uVar7 == 0) break;
            goto code_r0x0041ce04;
          }
        } while (uVar7 != 0);
      }
    }
    puVar5 = (undefined *)0x0;
code_r0x0041cda4:
    *(long *)(lVar15 + 0x18) = *(long *)(lVar15 + 0x18) + 1;
    return puVar5;
  }
  *(undefined8 *)(lVar15 + 0x18) = 0xffffffffffffffff;
  auVar17 = func_0x0046b1e4(10);
  if ((auVar17._0_8_ & 1) == 0) {
    lVar13 = *(long *)(lVar15 + 0x30);
    if ((lVar13 != 0) && (*(char *)(*(long *)(lVar15 + 0x28) + lVar13 + -1) == '\n')) {
      puVar5 = (undefined *)func_0x004182bc(lVar15 + 0x20);
      if (puVar5 != (undefined *)0x0) goto code_r0x0041cbc4;
      lVar13 = *(long *)(lVar15 + 0x30);
    }
    if (param_5 < (ulong)(*(long *)(lVar15 + 0x20) - lVar13)) goto code_r0x0041cba4;
  }
  else {
    uVar8 = auVar17._8_8_ + 1;
    bVar4 = param_5 < uVar8;
    param_5 = param_5 - uVar8;
    if (bVar4) {
      puStack_90 = &UNK_009d9318;
      uStack_88 = 1;
      uStack_78 = 0;
      uStack_70 = 0;
      uStack_80 = 8;
      func_0x007a2420(&puStack_90,&UNK_009da458);
code_r0x0041ccf4:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x41ccf8);
      (*pcVar3)();
    }
    lVar13 = *(long *)(lVar15 + 0x30);
    if (lVar13 == 0) {
      if (uVar8 != 0) {
        puVar5 = &UNK_009da470;
        lVar13 = param_2;
        uVar9 = uVar8;
        do {
          while( true ) {
            uVar7 = uVar9;
            if (0x7ffffffd < uVar9) {
              uVar7 = 0x7ffffffe;
            }
            uVar7 = _write(1,lVar13,uVar7);
            if (uVar7 == 0xffffffffffffffff) break;
            if (uVar7 == 0) {
code_r0x0041cc6c:
              if ((puVar5 != (undefined *)0x0) &&
                 (((ulong)puVar5 & 0xffffffff00000003) != 0x900000002)) goto code_r0x0041cbc4;
              goto code_r0x0041cc84;
            }
            uVar1 = uVar9 - uVar7;
            if (uVar9 < uVar7) {
              func_0x007a28a4(uVar7,uVar9,&UNK_009da7a0);
              goto code_r0x0041ccf4;
            }
            lVar13 = lVar13 + uVar7;
            uVar9 = uVar1;
            if (uVar1 == 0) goto code_r0x0041cc84;
          }
          puVar6 = (uint *)___error();
          if (*puVar6 != 4) {
            puVar5 = (undefined *)((ulong)*puVar6 << 0x20 | 2);
            goto code_r0x0041cc6c;
          }
        } while (uVar9 != 0);
      }
    }
    else {
      if (uVar8 < (ulong)(*(long *)(lVar15 + 0x20) - lVar13)) {
        _memcpy(*(long *)(lVar15 + 0x28) + lVar13,param_2,uVar8);
        *(ulong *)(lVar15 + 0x30) = lVar13 + uVar8;
      }
      else {
        puVar5 = (undefined *)func_0x007a04a8(lVar15 + 0x20,param_2,uVar8);
        if (puVar5 != (undefined *)0x0) goto code_r0x0041cbc4;
      }
      puVar5 = (undefined *)func_0x004182bc(lVar15 + 0x20);
      if (puVar5 != (undefined *)0x0) goto code_r0x0041cbc4;
    }
code_r0x0041cc84:
    param_2 = param_2 + uVar8;
    lVar13 = *(long *)(lVar15 + 0x30);
    if (param_5 < (ulong)(*(long *)(lVar15 + 0x20) - lVar13)) {
code_r0x0041cba4:
      _memcpy(*(long *)(lVar15 + 0x28) + lVar13,param_2,param_5);
      puVar5 = (undefined *)0x0;
      *(ulong *)(lVar15 + 0x30) = lVar13 + param_5;
      goto code_r0x0041cbc4;
    }
  }
  puVar5 = (undefined *)func_0x007a04a8(lVar15 + 0x20,param_2,param_5);
code_r0x0041cbc4:
  *(long *)(lVar15 + 0x18) = *(long *)(lVar15 + 0x18) + 1;
  return puVar5;
}

