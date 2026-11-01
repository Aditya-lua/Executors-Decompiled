
undefined8
thunk_FUN_004eed58(undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4,
                  long param_5,long param_6)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  bool bVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  int *piVar12;
  long *plVar13;
  undefined *puVar14;
  uint uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  long lVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  ulong in_stack_00000100;
  undefined8 in_stack_00000108;
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
  
  if ((in_stack_00000100 | 0x8000000000000000) != 0x8000000000000000) {
    param_3 = 1;
    func_0x00187bd4(in_stack_00000108);
  }
  auVar20 = __Unwind_Resume();
  uVar17 = auVar20._8_8_;
  lVar11 = auVar20._0_8_;
  if ((param_4 & 1) == 0) {
    lVar5 = *(long *)(*(long *)(lVar11 + 0x10) + 0x90);
    if (lVar5 != 0) {
      lVar5 = lVar5 * 600;
      piVar12 = (int *)(*(long *)(*(long *)(lVar11 + 0x10) + 0x88) + 0x248);
      do {
        if ((*(long *)(piVar12 + -8) == 0) && (*piVar12 == 0x110000)) {
          uVar6 = func_0x00538218(uVar17);
          if ((uVar6 & 1) == 0) {
            uVar16 = func_0x00538390(uVar17);
            lVar5 = *(long *)(lVar11 + 0x10);
            lVar8 = *(long *)(lVar5 + 0xc0);
          }
          else {
            uVar16 = 1;
            lVar5 = *(long *)(lVar11 + 0x10);
            lVar8 = *(long *)(lVar5 + 0xc0);
          }
          goto joined_r0x004eee74;
        }
        piVar12 = piVar12 + 0x96;
        lVar5 = lVar5 + -600;
      } while (lVar5 != 0);
    }
LAB_004eee7c:
    uVar16 = 0;
    lVar5 = *(long *)(lVar11 + 0x10);
    lVar8 = *(long *)(lVar5 + 0xc0);
joined_r0x004eee74:
    if (lVar8 == 0) {
LAB_004ef4d8:
      func_0x00538438(&uStack_b0,uVar17);
      uVar6 = uStack_a0;
      lVar8 = lStack_a8;
      if ((long)uStack_a0 < 0) {
        uVar17 = 0;
LAB_004ef7f4:
        func_0x007a1f00(uVar17,uVar6,&UNK_009e80a0);
        goto LAB_004ef8e4;
      }
      if (uStack_a0 == 0) {
        lVar9 = 1;
      }
      else {
        uVar17 = 1;
        lVar9 = func_0x00187bd0(uStack_a0,1);
        if (lVar9 == 0) goto LAB_004ef7f4;
      }
      _memcpy(lVar9,lVar8,uVar6);
      lVar18 = 0;
      uStack_c8 = uVar6;
      uStack_b8 = uVar6;
      lStack_140 = -0x8000000000000000;
      uVar7 = *(ulong *)(lVar11 + 0x10);
      lVar11 = *(long *)(uVar7 + 0xf0) << 4;
      uVar6 = 0xffffffffffffffff;
      plVar13 = *(long **)(uVar7 + 0xe8);
      do {
        lStack_c0 = lVar9;
        if (lVar11 == 0) {
          puVar14 = (undefined *)0x0;
          goto LAB_004ef5f0;
        }
        lVar10 = *plVar13;
        plVar2 = plVar13 + 1;
        uVar6 = uVar6 + 1;
        lVar18 = lVar18 + 0x20;
        lVar11 = lVar11 + -0x10;
        plVar13 = plVar13 + 2;
      } while (lVar10 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
      if (*(ulong *)(uVar7 + 0x108) <= uVar6) {
        func_0x007a2570(uVar6,*(ulong *)(uVar7 + 0x108),&UNK_009e9b68);
        goto LAB_004ef8e4;
      }
      lVar18 = *(long *)(uVar7 + 0x100) + lVar18;
      lVar11 = *(long *)(lVar18 + -0x18);
      puVar14 = (undefined *)
                (*(long *)(lVar18 + -0x20) + (*(long *)(lVar11 + 0x10) - 1U & 0xfffffffffffffff0) +
                0x10);
      auVar20 = (**(code **)(lVar11 + 0x18))(puVar14);
      if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
        goto LAB_004ef8e4;
      }
LAB_004ef5f0:
      puStack_78 = &UNK_008a7b62;
      if (puVar14 != (undefined *)0x0) {
        puStack_78 = puVar14;
      }
      lStack_70 = 0;
      uStack_80 = uVar7;
      func_0x00525f7c(&uStack_98,&uStack_80,8,0);
      uVar17 = func_0x0051d650(lVar5,&uStack_c8,&lStack_140,uVar16,&uStack_98);
      if ((uStack_b0 | 0x8000000000000000) == 0x8000000000000000) {
        return uVar17;
      }
      uStack_158 = uStack_b0;
    }
    else {
      uVar15 = (uint)param_3;
      if ((*(byte *)(lVar5 + 0x2bd) >> 5 & 1) == 0) {
        if (uVar15 != 0) {
          uVar15 = *(uint *)(lVar5 + 0x2c0) >> 0xd & 1;
          goto joined_r0x004eeee0;
        }
      }
      else {
joined_r0x004eeee0:
        if (uVar15 != 0) {
          func_0x00538438(&uStack_b0,uVar17);
          uVar6 = uStack_a0;
          lVar8 = lStack_a8;
          if ((long)uStack_a0 < 0) {
            uVar17 = 0;
code_r0x004ef82c:
            func_0x007a1f00(uVar17,uVar6,&UNK_009e80a0);
            goto LAB_004ef8e4;
          }
          if (uStack_a0 == 0) {
            lVar9 = 1;
          }
          else {
            uVar17 = 1;
            lVar9 = func_0x00187bd0(uStack_a0,1);
            if (lVar9 == 0) goto code_r0x004ef82c;
          }
          _memcpy(lVar9,lVar8,uVar6);
          uStack_c8 = uVar6;
          uStack_b8 = uVar6;
          puStack_138 = (undefined *)(param_5 + param_6 * 0x10);
          uStack_130 = *(undefined8 *)(lVar11 + 0x10);
          lStack_140 = param_5;
          lStack_c0 = lVar9;
          func_0x004e7aa0(&uStack_98,&lStack_140,&UNK_009e8050);
          lVar9 = 0;
          lVar18 = *(long *)(lVar11 + 0x10);
          lVar11 = *(long *)(lVar18 + 0xf0) << 4;
          uVar6 = 0xffffffffffffffff;
          plVar13 = *(long **)(lVar18 + 0xe8);
          do {
            if (lVar11 == 0) {
              puVar14 = (undefined *)0x0;
              goto code_r0x004ef1f4;
            }
            lVar10 = *plVar13;
            plVar2 = plVar13 + 1;
            uVar6 = uVar6 + 1;
            lVar9 = lVar9 + 0x20;
            lVar11 = lVar11 + -0x10;
            plVar13 = plVar13 + 2;
          } while (lVar10 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
          if (*(ulong *)(lVar18 + 0x108) <= uVar6) {
            func_0x007a2570(uVar6,*(ulong *)(lVar18 + 0x108),&UNK_009e9b68);
            goto LAB_004ef8e4;
          }
          lVar9 = *(long *)(lVar18 + 0x100) + lVar9;
          lVar11 = *(long *)(lVar9 + -0x18);
          puVar14 = (undefined *)
                    (*(long *)(lVar9 + -0x20) + (*(long *)(lVar11 + 0x10) - 1U & 0xfffffffffffffff0)
                    + 0x10);
          auVar20 = (**(code **)(lVar11 + 0x18))(puVar14);
          if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
            func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
            goto LAB_004ef8e4;
          }
code_r0x004ef1f4:
          puStack_138 = &UNK_008a7b62;
          if (puVar14 != (undefined *)0x0) {
            puStack_138 = puVar14;
          }
          uStack_130 = 0;
          lStack_140 = lVar18;
          func_0x00525f7c(&uStack_80,&lStack_140,8,0);
          uVar17 = func_0x0051b4a8(lVar5,&uStack_c8,&uStack_98,&uStack_80);
          uStack_158 = uStack_b0;
          goto joined_r0x004ef244;
        }
      }
      func_0x00538438(&uStack_80,uVar17);
      lVar5 = lStack_70;
      puVar14 = puStack_78;
      if (lStack_70 < 0) {
        uVar19 = 0;
code_r0x004ef810:
        func_0x007a1f00(uVar19,lVar5,&UNK_009e80a0);
        goto LAB_004ef8e4;
      }
      if (lStack_70 == 0) {
        lVar8 = 1;
      }
      else {
        uVar19 = 1;
        lVar8 = func_0x00187bd0(lStack_70,1);
        if (lVar8 == 0) goto code_r0x004ef810;
      }
      _memcpy(lVar8,puVar14,lVar5);
      lStack_f0 = *(long *)(*(long *)(lVar11 + 0x10) + 0xb8);
      lStack_e8 = lStack_f0 + *(long *)(*(long *)(lVar11 + 0x10) + 0xc0) * 0x2c8;
      lStack_140 = 2;
      uStack_118 = 2;
      func_0x005147bc(&uStack_158,lVar8,lVar5,&lStack_140);
      if (lVar5 != 0) {
        func_0x00187bd4(lVar8,lVar5,1);
      }
      if ((uStack_80 | 0x8000000000000000) == 0x8000000000000000) {
        lVar5 = *(long *)(lVar11 + 0x10);
      }
      else {
        func_0x00187bd4(puVar14,uStack_80,1);
        lVar5 = *(long *)(lVar11 + 0x10);
      }
      if (uStack_148 == 0) {
        if (*(long *)(lVar5 + 0x90) != 0) {
          lVar8 = *(long *)(lVar5 + 0x90) * 600;
          piVar12 = (int *)(*(long *)(lVar5 + 0x88) + 0x248);
          do {
            if ((*(long *)(piVar12 + -8) == 0) && (*piVar12 == 0x110000)) {
              if (((*(byte *)(lVar5 + 0x2bd) & 1) == 0) && ((*(byte *)(lVar5 + 0x2c1) & 1) == 0)) {
                func_0x0016b01c(&uStack_158);
                lVar5 = *(long *)(lVar11 + 0x10);
                goto LAB_004ef4d8;
              }
              break;
            }
            piVar12 = piVar12 + 0x96;
            lVar8 = lVar8 + -600;
          } while (lVar8 != 0);
        }
        func_0x00538438(&uStack_98,uVar17);
        uVar6 = uStack_88;
        lVar8 = lStack_90;
        if ((long)uStack_88 < 0) {
          uVar17 = 0;
code_r0x004ef8b0:
          func_0x007a1f00(uVar17,uVar6,&UNK_009e80a0);
          goto LAB_004ef8e4;
        }
        if (uStack_88 == 0) {
          lVar9 = 1;
        }
        else {
          uVar17 = 1;
          lVar9 = func_0x00187bd0(uStack_88,1);
          if (lVar9 == 0) goto code_r0x004ef8b0;
        }
        _memcpy(lVar9,lVar8,uVar6);
        lVar18 = 0;
        uStack_b0 = uVar6;
        uStack_a0 = uVar6;
        lVar10 = *(long *)(lVar11 + 0x10);
        lVar11 = *(long *)(lVar10 + 0xf0) << 4;
        uVar6 = 0xffffffffffffffff;
        plVar13 = *(long **)(lVar10 + 0xe8);
        do {
          lStack_a8 = lVar9;
          if (lVar11 == 0) {
            puVar14 = (undefined *)0x0;
            goto LAB_004ef74c;
          }
          lVar1 = *plVar13;
          plVar2 = plVar13 + 1;
          uVar6 = uVar6 + 1;
          lVar18 = lVar18 + 0x20;
          lVar11 = lVar11 + -0x10;
          plVar13 = plVar13 + 2;
        } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
        if (*(ulong *)(lVar10 + 0x108) <= uVar6) {
          func_0x007a2570(uVar6,*(ulong *)(lVar10 + 0x108),&UNK_009e9b68);
          goto LAB_004ef8e4;
        }
        lVar18 = *(long *)(lVar10 + 0x100) + lVar18;
        lVar11 = *(long *)(lVar18 + -0x18);
        puVar14 = (undefined *)
                  (*(long *)(lVar18 + -0x20) + (*(long *)(lVar11 + 0x10) - 1U & 0xfffffffffffffff0)
                  + 0x10);
        auVar20 = (**(code **)(lVar11 + 0x18))(puVar14);
        if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
          func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
          goto LAB_004ef8e4;
        }
LAB_004ef74c:
        puStack_138 = &UNK_008a7b62;
        if (puVar14 != (undefined *)0x0) {
          puStack_138 = puVar14;
        }
        uStack_130 = 0;
        lStack_140 = lVar10;
        func_0x00525f7c(&uStack_80,&lStack_140,8,0);
        uVar17 = func_0x0051c36c(lVar5,&uStack_b0,&uStack_80);
        if ((uStack_98 | 0x8000000000000000) != 0x8000000000000000) {
          func_0x00187bd4(lVar8,uStack_98,1);
        }
        if (uStack_158 == 0) {
          return uVar17;
        }
        uStack_158 = uStack_158 * 0x18;
        uVar16 = 8;
        goto LAB_004ef654;
      }
      func_0x00538438(&uStack_c8,uVar17);
      uVar6 = uStack_b8;
      lVar8 = lStack_c0;
      if ((long)uStack_b8 < 0) {
        uVar17 = 0;
LAB_004ef858:
        func_0x007a1f00(uVar17,uVar6,&UNK_009e80a0);
        goto LAB_004ef8e4;
      }
      if (uStack_b8 == 0) {
        lVar9 = 1;
      }
      else {
        uVar17 = 1;
        lVar9 = func_0x00187bd0(uStack_b8,1);
        if (lVar9 == 0) goto LAB_004ef858;
      }
      _memcpy(lVar9,lVar8,uVar6);
      uStack_e0 = uVar6;
      uStack_d0 = uVar6;
      lStack_a8 = lStack_150;
      uStack_b0 = uStack_158;
      uStack_a0 = uStack_148;
      lVar10 = *(long *)(lVar11 + 0x10);
      bVar4 = *(long *)(lVar10 + 0x128) != -0x8000000000000000;
      lVar18 = 0x230;
      if (bVar4) {
        lVar18 = 0x130;
      }
      lVar1 = 0x238;
      if (bVar4) {
        lVar1 = 0x138;
      }
      uVar6 = *(ulong *)(lVar10 + lVar1);
      lStack_d8 = lVar9;
      if ((long)uVar6 < 0) {
        uVar17 = 0;
code_r0x004ef874:
        func_0x007a1f00(uVar17,uVar6,&UNK_009e80a0);
LAB_004ef8e4:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x4ef8e8);
        (*pcVar3)();
      }
      uVar19 = *(undefined8 *)(lVar10 + lVar18);
      if (uVar6 == 0) {
        lVar9 = 1;
      }
      else {
        uVar17 = 1;
        lVar9 = func_0x00187bd0(uVar6,1);
        if (lVar9 == 0) goto code_r0x004ef874;
      }
      _memcpy(lVar9,uVar19,uVar6);
      lVar18 = 0;
      lVar10 = *(long *)(lVar11 + 0x10);
      lVar11 = *(long *)(lVar10 + 0xf0) << 4;
      uVar7 = 0xffffffffffffffff;
      plVar13 = *(long **)(lVar10 + 0xe8);
      do {
        uStack_98 = uVar6;
        lStack_90 = lVar9;
        uStack_88 = uVar6;
        if (lVar11 == 0) {
          puVar14 = (undefined *)0x0;
          goto code_r0x004ef454;
        }
        lVar1 = *plVar13;
        plVar2 = plVar13 + 1;
        uVar7 = uVar7 + 1;
        lVar18 = lVar18 + 0x20;
        lVar11 = lVar11 + -0x10;
        plVar13 = plVar13 + 2;
      } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
      if (*(ulong *)(lVar10 + 0x108) <= uVar7) {
        func_0x007a2570(uVar7,*(ulong *)(lVar10 + 0x108),&UNK_009e9b68);
        goto LAB_004ef8e4;
      }
      lVar18 = *(long *)(lVar10 + 0x100) + lVar18;
      lVar11 = *(long *)(lVar18 + -0x18);
      puVar14 = (undefined *)
                (*(long *)(lVar18 + -0x20) + (*(long *)(lVar11 + 0x10) - 1U & 0xfffffffffffffff0) +
                0x10);
      auVar20 = (**(code **)(lVar11 + 0x18))(puVar14);
      if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
        goto LAB_004ef8e4;
      }
code_r0x004ef454:
      puStack_138 = &UNK_008a7b62;
      if (puVar14 != (undefined *)0x0) {
        puStack_138 = puVar14;
      }
      uStack_130 = 0;
      lStack_140 = lVar10;
      func_0x00525f7c(&uStack_80,&lStack_140,8,0);
      uVar17 = func_0x0051be3c(lVar5,&uStack_e0,&uStack_b0,&uStack_98,uVar16,&uStack_80);
      if ((uStack_c8 | 0x8000000000000000) == 0x8000000000000000) {
        return uVar17;
      }
      uStack_158 = uStack_c8;
    }
  }
  else {
    func_0x005383dc(&lStack_140,uVar17);
    lVar5 = func_0x004efb0c(lVar11,&lStack_140,param_3);
    if (lVar5 == 0) goto LAB_004eee7c;
    uVar16 = *(undefined8 *)(lVar11 + 0x10);
    func_0x00538438(&uStack_98,uVar17);
    uVar6 = uStack_88;
    lVar8 = lStack_90;
    if ((long)uStack_88 < 0) {
      uVar17 = 0;
code_r0x004ef7d8:
      func_0x007a1f00(uVar17,uVar6,&UNK_009e80a0);
      goto LAB_004ef8e4;
    }
    if (uStack_88 == 0) {
      lVar5 = 1;
    }
    else {
      uVar17 = 1;
      lVar5 = func_0x00187bd0(uStack_88,1);
      if (lVar5 == 0) goto code_r0x004ef7d8;
    }
    _memcpy(lVar5,lVar8,uVar6);
    lVar9 = 0;
    uStack_b0 = uVar6;
    uStack_a0 = uVar6;
    lVar18 = *(long *)(lVar11 + 0x10);
    lVar11 = *(long *)(lVar18 + 0xf0) << 4;
    uVar6 = 0xffffffffffffffff;
    plVar13 = *(long **)(lVar18 + 0xe8);
    do {
      lStack_a8 = lVar5;
      if (lVar11 == 0) {
        puVar14 = (undefined *)0x0;
        goto code_r0x004eeff4;
      }
      lVar10 = *plVar13;
      plVar2 = plVar13 + 1;
      uVar6 = uVar6 + 1;
      lVar9 = lVar9 + 0x20;
      lVar11 = lVar11 + -0x10;
      plVar13 = plVar13 + 2;
    } while (lVar10 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
    if (*(ulong *)(lVar18 + 0x108) <= uVar6) {
      func_0x007a2570(uVar6,*(ulong *)(lVar18 + 0x108),&UNK_009e9b68);
      goto LAB_004ef8e4;
    }
    lVar9 = *(long *)(lVar18 + 0x100) + lVar9;
    lVar11 = *(long *)(lVar9 + -0x18);
    puVar14 = (undefined *)
              (*(long *)(lVar9 + -0x20) + (*(long *)(lVar11 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar20 = (**(code **)(lVar11 + 0x18))(puVar14);
    if (auVar20._0_8_ != 0x1414db8803bc16e0 || auVar20._8_8_ != 0x4f7557bbe08e4383) {
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
      goto LAB_004ef8e4;
    }
code_r0x004eeff4:
    puStack_138 = &UNK_008a7b62;
    if (puVar14 != (undefined *)0x0) {
      puStack_138 = puVar14;
    }
    uStack_130 = 0;
    lStack_140 = lVar18;
    func_0x00525f7c(&uStack_80,&lStack_140,8,0);
    uVar17 = func_0x0051dd78(uVar16,&uStack_b0,&uStack_80);
    uStack_158 = uStack_98;
joined_r0x004ef244:
    if ((uStack_158 | 0x8000000000000000) == 0x8000000000000000) {
      return uVar17;
    }
  }
  uVar16 = 1;
  lStack_150 = lVar8;
LAB_004ef654:
  func_0x00187bd4(lStack_150,uStack_158,uVar16);
  return uVar17;
}

