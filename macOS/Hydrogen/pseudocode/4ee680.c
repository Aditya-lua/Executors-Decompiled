
undefined8 FUN_004ee680(void)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  bool bVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 uVar8;
  ulong in_x3;
  long in_x4;
  long in_x5;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  int *piVar13;
  long *plVar14;
  undefined *puVar15;
  undefined8 uVar16;
  uint uVar17;
  undefined8 uVar18;
  long lVar19;
  undefined1 auVar20 [16];
  ulong in_stack_00000100;
  undefined8 in_stack_00000108;
  ulong in_stack_000001d0;
  ulong uStack_158;
  long lStack_150;
  ulong uStack_148;
  long lStack_140;
  undefined *puStack_138;
  undefined8 uStack_130;
  undefined8 uStack_118;
  long lStack_f0;
  long lStack_e8;
  ulong uStack_e0;
  long lStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  long lStack_c0;
  ulong uStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  ulong uStack_a0;
  ulong uStack_98;
  long lStack_90;
  ulong uStack_88;
  ulong uStack_80;
  undefined *puStack_78;
  long lStack_70;
  
  uVar8 = 1;
  func_0x00187bd4();
  if ((in_stack_000001d0 | 0x8000000000000000) != 0x8000000000000000) {
    uVar8 = 1;
    func_0x00187bd4();
  }
  if ((in_stack_00000100 | 0x8000000000000000) != 0x8000000000000000) {
    uVar8 = 1;
    func_0x00187bd4(in_stack_00000108);
  }
  auVar20 = __Unwind_Resume();
  uVar18 = auVar20._8_8_;
  lVar12 = auVar20._0_8_;
  if ((in_x3 & 1) == 0) {
    lVar5 = *(long *)(*(long *)(lVar12 + 0x10) + 0x90);
    if (lVar5 != 0) {
      lVar5 = lVar5 * 600;
      piVar13 = (int *)(*(long *)(*(long *)(lVar12 + 0x10) + 0x88) + 0x248);
      do {
        if ((*(long *)(piVar13 + -8) == 0) && (*piVar13 == 0x110000)) {
          uVar6 = func_0x00538218(uVar18);
          if ((uVar6 & 1) == 0) {
            uVar16 = func_0x00538390(uVar18);
            lVar5 = *(long *)(lVar12 + 0x10);
            lVar9 = *(long *)(lVar5 + 0xc0);
          }
          else {
            uVar16 = 1;
            lVar5 = *(long *)(lVar12 + 0x10);
            lVar9 = *(long *)(lVar5 + 0xc0);
          }
          goto joined_r0x004eee74;
        }
        piVar13 = piVar13 + 0x96;
        lVar5 = lVar5 + -600;
      } while (lVar5 != 0);
    }
LAB_004eee7c:
    uVar16 = 0;
    lVar5 = *(long *)(lVar12 + 0x10);
    lVar9 = *(long *)(lVar5 + 0xc0);
joined_r0x004eee74:
    if (lVar9 == 0) {
LAB_004ef4d8:
      func_0x00538438(&uStack_b0,uVar18);
      uVar6 = uStack_a0;
      lVar9 = lStack_a8;
      if ((long)uStack_a0 < 0) {
        uVar8 = 0;
LAB_004ef7f4:
        func_0x007a1f00(uVar8,uVar6,&UNK_009e80a0);
        goto LAB_004ef8e4;
      }
      if (uStack_a0 == 0) {
        lVar10 = 1;
      }
      else {
        uVar8 = 1;
        lVar10 = func_0x00187bd0(uStack_a0,1);
        if (lVar10 == 0) goto LAB_004ef7f4;
      }
      _memcpy(lVar10,lVar9,uVar6);
      lVar19 = 0;
      uStack_c8 = uVar6;
      uStack_b8 = uVar6;
      lStack_140 = -0x8000000000000000;
      uVar7 = *(ulong *)(lVar12 + 0x10);
      lVar12 = *(long *)(uVar7 + 0xf0) << 4;
      uVar6 = 0xffffffffffffffff;
      plVar14 = *(long **)(uVar7 + 0xe8);
      do {
        lStack_c0 = lVar10;
        if (lVar12 == 0) {
          puVar15 = (undefined *)0x0;
          goto LAB_004ef5f0;
        }
        lVar11 = *plVar14;
        plVar2 = plVar14 + 1;
        uVar6 = uVar6 + 1;
        lVar19 = lVar19 + 0x20;
        lVar12 = lVar12 + -0x10;
        plVar14 = plVar14 + 2;
      } while (lVar11 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
      if (*(ulong *)(uVar7 + 0x108) <= uVar6) {
        func_0x007a2570(uVar6,*(ulong *)(uVar7 + 0x108),&UNK_009e9b68);
        goto LAB_004ef8e4;
      }
      lVar19 = *(long *)(uVar7 + 0x100) + lVar19;
      lVar12 = *(long *)(lVar19 + -0x18);
      puVar15 = (undefined *)
                (*(long *)(lVar19 + -0x20) + (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0) +
                0x10);
      auVar20 = (**(code **)(lVar12 + 0x18))(puVar15);
      if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
        goto LAB_004ef8e4;
      }
LAB_004ef5f0:
      puStack_78 = &UNK_008a7b62;
      if (puVar15 != (undefined *)0x0) {
        puStack_78 = puVar15;
      }
      lStack_70 = 0;
      uStack_80 = uVar7;
      func_0x00525f7c(&uStack_98,&uStack_80,8,0);
      uVar8 = func_0x0051d650(lVar5,&uStack_c8,&lStack_140,uVar16,&uStack_98);
      if ((uStack_b0 | 0x8000000000000000) == 0x8000000000000000) {
        return uVar8;
      }
      uStack_158 = uStack_b0;
    }
    else {
      uVar17 = (uint)uVar8;
      if ((*(byte *)(lVar5 + 0x2bd) >> 5 & 1) == 0) {
        if (uVar17 != 0) {
          uVar17 = *(uint *)(lVar5 + 0x2c0) >> 0xd & 1;
          goto joined_r0x004eeee0;
        }
      }
      else {
joined_r0x004eeee0:
        if (uVar17 != 0) {
          func_0x00538438(&uStack_b0,uVar18);
          uVar6 = uStack_a0;
          lVar9 = lStack_a8;
          if ((long)uStack_a0 < 0) {
            uVar8 = 0;
code_r0x004ef82c:
            func_0x007a1f00(uVar8,uVar6,&UNK_009e80a0);
            goto LAB_004ef8e4;
          }
          if (uStack_a0 == 0) {
            lVar10 = 1;
          }
          else {
            uVar8 = 1;
            lVar10 = func_0x00187bd0(uStack_a0,1);
            if (lVar10 == 0) goto code_r0x004ef82c;
          }
          _memcpy(lVar10,lVar9,uVar6);
          uStack_c8 = uVar6;
          uStack_b8 = uVar6;
          puStack_138 = (undefined *)(in_x4 + in_x5 * 0x10);
          uStack_130 = *(undefined8 *)(lVar12 + 0x10);
          lStack_140 = in_x4;
          lStack_c0 = lVar10;
          func_0x004e7aa0(&uStack_98,&lStack_140,&UNK_009e8050);
          lVar10 = 0;
          lVar19 = *(long *)(lVar12 + 0x10);
          lVar12 = *(long *)(lVar19 + 0xf0) << 4;
          uVar6 = 0xffffffffffffffff;
          plVar14 = *(long **)(lVar19 + 0xe8);
          do {
            if (lVar12 == 0) {
              puVar15 = (undefined *)0x0;
              goto code_r0x004ef1f4;
            }
            lVar11 = *plVar14;
            plVar2 = plVar14 + 1;
            uVar6 = uVar6 + 1;
            lVar10 = lVar10 + 0x20;
            lVar12 = lVar12 + -0x10;
            plVar14 = plVar14 + 2;
          } while (lVar11 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
          if (*(ulong *)(lVar19 + 0x108) <= uVar6) {
            func_0x007a2570(uVar6,*(ulong *)(lVar19 + 0x108),&UNK_009e9b68);
            goto LAB_004ef8e4;
          }
          lVar10 = *(long *)(lVar19 + 0x100) + lVar10;
          lVar12 = *(long *)(lVar10 + -0x18);
          puVar15 = (undefined *)
                    (*(long *)(lVar10 + -0x20) +
                     (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
          auVar20 = (**(code **)(lVar12 + 0x18))(puVar15);
          if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
            func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
            goto LAB_004ef8e4;
          }
code_r0x004ef1f4:
          puStack_138 = &UNK_008a7b62;
          if (puVar15 != (undefined *)0x0) {
            puStack_138 = puVar15;
          }
          uStack_130 = 0;
          lStack_140 = lVar19;
          func_0x00525f7c(&uStack_80,&lStack_140,8,0);
          uVar8 = func_0x0051b4a8(lVar5,&uStack_c8,&uStack_98,&uStack_80);
          uStack_158 = uStack_b0;
          goto joined_r0x004ef244;
        }
      }
      func_0x00538438(&uStack_80,uVar18);
      lVar5 = lStack_70;
      puVar15 = puStack_78;
      if (lStack_70 < 0) {
        uVar8 = 0;
code_r0x004ef810:
        func_0x007a1f00(uVar8,lVar5,&UNK_009e80a0);
        goto LAB_004ef8e4;
      }
      if (lStack_70 == 0) {
        lVar9 = 1;
      }
      else {
        uVar8 = 1;
        lVar9 = func_0x00187bd0(lStack_70,1);
        if (lVar9 == 0) goto code_r0x004ef810;
      }
      _memcpy(lVar9,puVar15,lVar5);
      lStack_f0 = *(long *)(*(long *)(lVar12 + 0x10) + 0xb8);
      lStack_e8 = lStack_f0 + *(long *)(*(long *)(lVar12 + 0x10) + 0xc0) * 0x2c8;
      lStack_140 = 2;
      uStack_118 = 2;
      func_0x005147bc(&uStack_158,lVar9,lVar5,&lStack_140);
      if (lVar5 != 0) {
        func_0x00187bd4(lVar9,lVar5,1);
      }
      if ((uStack_80 | 0x8000000000000000) == 0x8000000000000000) {
        lVar5 = *(long *)(lVar12 + 0x10);
      }
      else {
        func_0x00187bd4(puVar15,uStack_80,1);
        lVar5 = *(long *)(lVar12 + 0x10);
      }
      if (uStack_148 == 0) {
        if (*(long *)(lVar5 + 0x90) != 0) {
          lVar9 = *(long *)(lVar5 + 0x90) * 600;
          piVar13 = (int *)(*(long *)(lVar5 + 0x88) + 0x248);
          do {
            if ((*(long *)(piVar13 + -8) == 0) && (*piVar13 == 0x110000)) {
              if (((*(byte *)(lVar5 + 0x2bd) & 1) == 0) && ((*(byte *)(lVar5 + 0x2c1) & 1) == 0)) {
                func_0x0016b01c(&uStack_158);
                lVar5 = *(long *)(lVar12 + 0x10);
                goto LAB_004ef4d8;
              }
              break;
            }
            piVar13 = piVar13 + 0x96;
            lVar9 = lVar9 + -600;
          } while (lVar9 != 0);
        }
        func_0x00538438(&uStack_98,uVar18);
        uVar6 = uStack_88;
        lVar9 = lStack_90;
        if ((long)uStack_88 < 0) {
          uVar8 = 0;
code_r0x004ef8b0:
          func_0x007a1f00(uVar8,uVar6,&UNK_009e80a0);
          goto LAB_004ef8e4;
        }
        if (uStack_88 == 0) {
          lVar10 = 1;
        }
        else {
          uVar8 = 1;
          lVar10 = func_0x00187bd0(uStack_88,1);
          if (lVar10 == 0) goto code_r0x004ef8b0;
        }
        _memcpy(lVar10,lVar9,uVar6);
        lVar19 = 0;
        uStack_b0 = uVar6;
        uStack_a0 = uVar6;
        lVar11 = *(long *)(lVar12 + 0x10);
        lVar12 = *(long *)(lVar11 + 0xf0) << 4;
        uVar6 = 0xffffffffffffffff;
        plVar14 = *(long **)(lVar11 + 0xe8);
        do {
          lStack_a8 = lVar10;
          if (lVar12 == 0) {
            puVar15 = (undefined *)0x0;
            goto LAB_004ef74c;
          }
          lVar1 = *plVar14;
          plVar2 = plVar14 + 1;
          uVar6 = uVar6 + 1;
          lVar19 = lVar19 + 0x20;
          lVar12 = lVar12 + -0x10;
          plVar14 = plVar14 + 2;
        } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
        if (*(ulong *)(lVar11 + 0x108) <= uVar6) {
          func_0x007a2570(uVar6,*(ulong *)(lVar11 + 0x108),&UNK_009e9b68);
          goto LAB_004ef8e4;
        }
        lVar19 = *(long *)(lVar11 + 0x100) + lVar19;
        lVar12 = *(long *)(lVar19 + -0x18);
        puVar15 = (undefined *)
                  (*(long *)(lVar19 + -0x20) + (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0)
                  + 0x10);
        auVar20 = (**(code **)(lVar12 + 0x18))(puVar15);
        if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
          func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
          goto LAB_004ef8e4;
        }
LAB_004ef74c:
        puStack_138 = &UNK_008a7b62;
        if (puVar15 != (undefined *)0x0) {
          puStack_138 = puVar15;
        }
        uStack_130 = 0;
        lStack_140 = lVar11;
        func_0x00525f7c(&uStack_80,&lStack_140,8,0);
        uVar8 = func_0x0051c36c(lVar5,&uStack_b0,&uStack_80);
        if ((uStack_98 | 0x8000000000000000) != 0x8000000000000000) {
          func_0x00187bd4(lVar9,uStack_98,1);
        }
        if (uStack_158 == 0) {
          return uVar8;
        }
        uStack_158 = uStack_158 * 0x18;
        uVar18 = 8;
        goto LAB_004ef654;
      }
      func_0x00538438(&uStack_c8,uVar18);
      uVar6 = uStack_b8;
      lVar9 = lStack_c0;
      if ((long)uStack_b8 < 0) {
        uVar8 = 0;
LAB_004ef858:
        func_0x007a1f00(uVar8,uVar6,&UNK_009e80a0);
        goto LAB_004ef8e4;
      }
      if (uStack_b8 == 0) {
        lVar10 = 1;
      }
      else {
        uVar8 = 1;
        lVar10 = func_0x00187bd0(uStack_b8,1);
        if (lVar10 == 0) goto LAB_004ef858;
      }
      _memcpy(lVar10,lVar9,uVar6);
      uStack_e0 = uVar6;
      uStack_d0 = uVar6;
      lStack_a8 = lStack_150;
      uStack_b0 = uStack_158;
      uStack_a0 = uStack_148;
      lVar11 = *(long *)(lVar12 + 0x10);
      bVar4 = *(long *)(lVar11 + 0x128) != -0x8000000000000000;
      lVar19 = 0x230;
      if (bVar4) {
        lVar19 = 0x130;
      }
      lVar1 = 0x238;
      if (bVar4) {
        lVar1 = 0x138;
      }
      uVar6 = *(ulong *)(lVar11 + lVar1);
      lStack_d8 = lVar10;
      if ((long)uVar6 < 0) {
        uVar8 = 0;
code_r0x004ef874:
        func_0x007a1f00(uVar8,uVar6,&UNK_009e80a0);
LAB_004ef8e4:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x4ef8e8);
        (*pcVar3)();
      }
      uVar18 = *(undefined8 *)(lVar11 + lVar19);
      if (uVar6 == 0) {
        lVar10 = 1;
      }
      else {
        uVar8 = 1;
        lVar10 = func_0x00187bd0(uVar6,1);
        if (lVar10 == 0) goto code_r0x004ef874;
      }
      _memcpy(lVar10,uVar18,uVar6);
      lVar19 = 0;
      lVar11 = *(long *)(lVar12 + 0x10);
      lVar12 = *(long *)(lVar11 + 0xf0) << 4;
      uVar7 = 0xffffffffffffffff;
      plVar14 = *(long **)(lVar11 + 0xe8);
      do {
        uStack_98 = uVar6;
        lStack_90 = lVar10;
        uStack_88 = uVar6;
        if (lVar12 == 0) {
          puVar15 = (undefined *)0x0;
          goto code_r0x004ef454;
        }
        lVar1 = *plVar14;
        plVar2 = plVar14 + 1;
        uVar7 = uVar7 + 1;
        lVar19 = lVar19 + 0x20;
        lVar12 = lVar12 + -0x10;
        plVar14 = plVar14 + 2;
      } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
      if (*(ulong *)(lVar11 + 0x108) <= uVar7) {
        func_0x007a2570(uVar7,*(ulong *)(lVar11 + 0x108),&UNK_009e9b68);
        goto LAB_004ef8e4;
      }
      lVar19 = *(long *)(lVar11 + 0x100) + lVar19;
      lVar12 = *(long *)(lVar19 + -0x18);
      puVar15 = (undefined *)
                (*(long *)(lVar19 + -0x20) + (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0) +
                0x10);
      auVar20 = (**(code **)(lVar12 + 0x18))(puVar15);
      if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
        goto LAB_004ef8e4;
      }
code_r0x004ef454:
      puStack_138 = &UNK_008a7b62;
      if (puVar15 != (undefined *)0x0) {
        puStack_138 = puVar15;
      }
      uStack_130 = 0;
      lStack_140 = lVar11;
      func_0x00525f7c(&uStack_80,&lStack_140,8,0);
      uVar8 = func_0x0051be3c(lVar5,&uStack_e0,&uStack_b0,&uStack_98,uVar16,&uStack_80);
      if ((uStack_c8 | 0x8000000000000000) == 0x8000000000000000) {
        return uVar8;
      }
      uStack_158 = uStack_c8;
    }
  }
  else {
    func_0x005383dc(&lStack_140,uVar18);
    lVar5 = func_0x004efb0c(lVar12,&lStack_140,uVar8);
    if (lVar5 == 0) goto LAB_004eee7c;
    uVar8 = *(undefined8 *)(lVar12 + 0x10);
    func_0x00538438(&uStack_98,uVar18);
    uVar6 = uStack_88;
    lVar9 = lStack_90;
    if ((long)uStack_88 < 0) {
      uVar18 = 0;
code_r0x004ef7d8:
      func_0x007a1f00(uVar18,uVar6,&UNK_009e80a0);
      goto LAB_004ef8e4;
    }
    if (uStack_88 == 0) {
      lVar5 = 1;
    }
    else {
      uVar18 = 1;
      lVar5 = func_0x00187bd0(uStack_88,1);
      if (lVar5 == 0) goto code_r0x004ef7d8;
    }
    _memcpy(lVar5,lVar9,uVar6);
    lVar10 = 0;
    uStack_b0 = uVar6;
    uStack_a0 = uVar6;
    lVar19 = *(long *)(lVar12 + 0x10);
    lVar12 = *(long *)(lVar19 + 0xf0) << 4;
    uVar6 = 0xffffffffffffffff;
    plVar14 = *(long **)(lVar19 + 0xe8);
    do {
      lStack_a8 = lVar5;
      if (lVar12 == 0) {
        puVar15 = (undefined *)0x0;
        goto code_r0x004eeff4;
      }
      lVar11 = *plVar14;
      plVar2 = plVar14 + 1;
      uVar6 = uVar6 + 1;
      lVar10 = lVar10 + 0x20;
      lVar12 = lVar12 + -0x10;
      plVar14 = plVar14 + 2;
    } while (lVar11 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
    if (*(ulong *)(lVar19 + 0x108) <= uVar6) {
      func_0x007a2570(uVar6,*(ulong *)(lVar19 + 0x108),&UNK_009e9b68);
      goto LAB_004ef8e4;
    }
    lVar10 = *(long *)(lVar19 + 0x100) + lVar10;
    lVar12 = *(long *)(lVar10 + -0x18);
    puVar15 = (undefined *)
              (*(long *)(lVar10 + -0x20) + (*(long *)(lVar12 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar20 = (**(code **)(lVar12 + 0x18))(puVar15);
    if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
      goto LAB_004ef8e4;
    }
code_r0x004eeff4:
    puStack_138 = &UNK_008a7b62;
    if (puVar15 != (undefined *)0x0) {
      puStack_138 = puVar15;
    }
    uStack_130 = 0;
    lStack_140 = lVar19;
    func_0x00525f7c(&uStack_80,&lStack_140,8,0);
    uVar8 = func_0x0051dd78(uVar8,&uStack_b0,&uStack_80);
    uStack_158 = uStack_98;
joined_r0x004ef244:
    if ((uStack_158 | 0x8000000000000000) == 0x8000000000000000) {
      return uVar8;
    }
  }
  uVar18 = 1;
  lStack_150 = lVar9;
LAB_004ef654:
  func_0x00187bd4(lStack_150,uStack_158,uVar18);
  return uVar8;
}

