
/* WARNING: Removing unreachable block (ram,0x00725d08) */
/* WARNING: Type propagation algorithm not settling */

undefined8 * FUN_007259ec(long *param_1,undefined8 *param_2,undefined8 *param_3)

{
  code *pcVar1;
  undefined8 uVar2;
  long *plVar3;
  ulong uVar4;
  undefined8 *******pppppppuVar5;
  undefined8 *puVar7;
  undefined8 *puVar6;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  undefined8 *puVar13;
  long lVar14;
  undefined8 *puVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  undefined8 *in_stack_00000018;
  long in_stack_00000020;
  long *in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  long lStack_d0;
  undefined8 *puStack_c8;
  undefined8 *puStack_c0;
  long lStack_b8;
  long *plStack_b0;
  undefined8 *******pppppppuStack_a8;
  ulong uStack_a0;
  undefined8 uStack_98;
  
  puVar15 = (undefined8 *)*param_1;
  puVar9 = (undefined8 *)param_1[1];
  lVar8 = (long)puVar9 - (long)puVar15 >> 4;
  uVar4 = lVar8 * -0x5555555555555555 + 1;
  if (uVar4 < 0x555555555555556) {
    in_stack_00000028 = param_1 + 2;
    lVar10 = *in_stack_00000028 - (long)puVar15 >> 4;
    uVar11 = lVar10 * 0x5555555555555556;
    if (uVar11 <= uVar4) {
      uVar11 = uVar4;
    }
    if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar10 * -0x5555555555555555)) {
      uVar11 = 0x555555555555555;
    }
    if (uVar11 == 0) {
      lVar10 = 0;
LAB_00725a7c:
      puVar13 = (undefined8 *)(lVar10 + lVar8 * 0x10);
      lVar14 = lVar10 + uVar11 * 0x30;
      in_stack_00000020 = lVar14;
      if (*(char *)((long)param_3 + 0x17) < '\0') {
        uStack0000000000000008 = (undefined8 *)lVar10;
        in_stack_00000010 = puVar13;
        in_stack_00000018 = puVar13;
        func_0x00017634(&uStack0000000000000030,*param_3,param_3[1]);
        in_stack_00000018 = (undefined8 *)*param_1;
        puVar9 = (undefined8 *)param_1[1];
      }
      else {
        in_stack_00000038 = param_3[1];
        uStack0000000000000030 = *param_3;
        in_stack_00000040 = param_3[2];
        in_stack_00000018 = puVar15;
      }
      puVar6 = puVar13 + 6;
      *puVar13 = &UNK_00a1df28;
      lVar10 = lVar10 + lVar8 * 0x10;
      uVar2 = *param_2;
      *(undefined8 *)(lVar10 + 0x10) = param_2[1];
      *(undefined8 *)(lVar10 + 8) = uVar2;
      *(undefined8 *)(lVar10 + 0x20) = in_stack_00000038;
      *(undefined8 *)(lVar10 + 0x18) = uStack0000000000000030;
      *(undefined8 *)(lVar10 + 0x28) = in_stack_00000040;
      puVar15 = puVar13;
      if (puVar9 == in_stack_00000018) {
        puVar15 = in_stack_00000018;
      }
      else {
        do {
          puVar13 = puVar15 + -6;
          *puVar13 = &UNK_00a1df28;
          uVar2 = puVar9[-5];
          puVar15[-4] = puVar9[-4];
          puVar15[-5] = uVar2;
          uVar16 = puVar9[-2];
          uVar2 = puVar9[-3];
          puVar15[-1] = puVar9[-1];
          puVar15[-2] = uVar16;
          puVar15[-3] = uVar2;
          puVar9[-2] = 0;
          puVar9[-1] = 0;
          puVar9[-3] = 0;
          puVar9 = puVar9 + -6;
          puVar15 = puVar13;
        } while (puVar9 != in_stack_00000018);
        in_stack_00000018 = (undefined8 *)param_1[1];
        puVar15 = (undefined8 *)*param_1;
        lVar14 = in_stack_00000020;
      }
      *param_1 = (long)puVar13;
      param_1[1] = (long)puVar6;
      in_stack_00000020 = param_1[2];
      param_1[2] = lVar14;
      puVar9 = in_stack_00000018;
      uStack0000000000000008 = puVar15;
      in_stack_00000010 = puVar15;
      if (in_stack_00000018 != puVar15) {
        do {
          in_stack_00000018 = in_stack_00000018 + -6;
          (**(code **)*in_stack_00000018)(in_stack_00000018);
        } while (in_stack_00000018 != puVar15);
        puVar9 = uStack0000000000000008;
      }
      if (puVar9 != (undefined8 *)0x0) {
        __ZdlPv(puVar9);
      }
      return puVar6;
    }
    if (uVar11 < 0x555555555555556) {
      lVar10 = __Znwm(uVar11 * 0x30);
      goto LAB_00725a7c;
    }
  }
  else {
    func_0x00017f90(param_1);
  }
  uVar2 = func_0x00017514();
  func_0x0064b2f0(&uStack0000000000000008);
  auVar17 = __Unwind_Resume(uVar2);
  puVar15 = auVar17._8_8_;
  plVar3 = auVar17._0_8_;
  lVar8 = plVar3[1] - *plVar3 >> 4;
  uVar4 = lVar8 * -0x5555555555555555 + 1;
  if (uVar4 < 0x555555555555556) {
    lVar10 = plVar3[2] - *plVar3 >> 4;
    uVar11 = lVar10 * 0x5555555555555556;
    if (uVar11 <= uVar4) {
      uVar11 = uVar4;
    }
    if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar10 * -0x5555555555555555)) {
      uVar11 = 0x555555555555555;
    }
    if (uVar11 == 0) {
      lVar10 = 0;
LAB_00725c5c:
      uVar2 = *puVar15;
      puVar9 = (undefined8 *)(lVar10 + lVar8 * 0x10);
      lVar10 = lVar10 + uVar11 * 0x30;
      puVar9[1] = puVar15[1];
      *puVar9 = uVar2;
      *(undefined4 *)(puVar9 + 2) = *(undefined4 *)(puVar15 + 2);
      uVar2 = puVar15[3];
      puVar9[4] = puVar15[4];
      puVar9[3] = uVar2;
      puVar9[5] = puVar15[5];
      puVar15[4] = 0;
      puVar15[5] = 0;
      puVar15[3] = 0;
      puVar15 = puVar9 + 6;
      lVar8 = *plVar3;
      lVar14 = plVar3[1];
      if (lVar14 == lVar8) {
        *plVar3 = (long)puVar9;
        plVar3[1] = (long)puVar15;
        plVar3[2] = lVar10;
      }
      else {
        do {
          uVar16 = *(undefined8 *)(lVar14 + -0x28);
          uVar2 = *(undefined8 *)(lVar14 + -0x30);
          *(undefined4 *)(puVar9 + -4) = *(undefined4 *)(lVar14 + -0x20);
          puVar9[-5] = uVar16;
          puVar9[-6] = uVar2;
          uVar16 = *(undefined8 *)(lVar14 + -0x10);
          uVar2 = *(undefined8 *)(lVar14 + -0x18);
          puVar9[-1] = *(undefined8 *)(lVar14 + -8);
          puVar9[-2] = uVar16;
          puVar9[-3] = uVar2;
          puVar9 = puVar9 + -6;
          *(undefined8 *)(lVar14 + -0x10) = 0;
          *(undefined8 *)(lVar14 + -8) = 0;
          *(undefined8 *)(lVar14 + -0x18) = 0;
          lVar14 = lVar14 + -0x30;
        } while (lVar14 != lVar8);
        lVar8 = *plVar3;
        lVar12 = plVar3[1];
        *plVar3 = (long)puVar9;
        plVar3[1] = (long)puVar15;
        plVar3[2] = lVar10;
        lVar14 = lVar12;
        for (; lVar12 != lVar8; lVar12 = lVar12 + -0x30) {
          lVar14 = lVar8;
        }
      }
      if (lVar14 != 0) {
        __ZdlPv(lVar14);
      }
      return puVar15;
    }
    if (uVar11 < 0x555555555555556) {
      lVar10 = __Znwm(uVar11 * 0x30);
      goto LAB_00725c5c;
    }
  }
  else {
    func_0x00017f90(plVar3);
  }
  auVar17 = func_0x00017514();
  plVar3 = auVar17._0_8_;
  lVar8 = plVar3[1] - *plVar3 >> 4;
  uVar4 = lVar8 * -0x5555555555555555 + 1;
  if (0x555555555555555 < uVar4) {
    func_0x00017f90(plVar3);
code_r0x00725f90:
    func_0x0001748c(&pppppppuStack_a8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x725f9c);
    (*pcVar1)();
  }
  plStack_b0 = plVar3 + 2;
  lVar10 = *plStack_b0 - *plVar3 >> 4;
  uVar11 = lVar10 * 0x5555555555555556;
  if (uVar11 <= uVar4) {
    uVar11 = uVar4;
  }
  if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar10 * -0x5555555555555555)) {
    uVar11 = 0x555555555555555;
  }
  if (uVar11 == 0) {
    lVar10 = 0;
  }
  else {
    if (0x555555555555555 < uVar11) {
      uVar2 = func_0x00017514();
      func_0x0064b2f0(&lStack_d0);
      puVar15 = (undefined8 *)__Unwind_Resume(uVar2);
      return puVar15;
    }
    lVar10 = __Znwm(uVar11 * 0x30);
  }
  puVar15 = (undefined8 *)(lVar10 + lVar8 * 0x10);
  lStack_b8 = lVar10 + uVar11 * 0x30;
  lStack_d0 = lVar10;
  puStack_c8 = puVar15;
  puStack_c0 = puVar15;
  uVar4 = _strlen(param_3);
  if (0x7ffffffffffffff7 < uVar4) goto code_r0x00725f90;
  if (uVar4 < 0x17) {
    uStack_98 = CONCAT17((char)uVar4,(undefined7)uStack_98);
    pppppppuVar5 = &pppppppuStack_a8;
    if (uVar4 == 0) goto code_r0x00725e88;
  }
  else {
    uVar11 = (uVar4 & 0xfffffffffffffff8) + 8;
    if ((uVar4 | 7) != 0x17) {
      uVar11 = uVar4 | 7;
    }
    pppppppuVar5 = (undefined8 *******)__Znwm(uVar11 + 1);
    uStack_98 = uVar11 + 1 | 0x8000000000000000;
    pppppppuStack_a8 = pppppppuVar5;
    uStack_a0 = uVar4;
  }
  _memcpy(pppppppuVar5,param_3,uVar4);
code_r0x00725e88:
  *(undefined1 *)((long)pppppppuVar5 + uVar4) = 0;
  *puVar15 = &UNK_00a1df28;
  lVar10 = lVar10 + lVar8 * 0x10;
  uVar2 = *auVar17._8_8_;
  *(undefined8 *)(lVar10 + 0x10) = auVar17._8_8_[1];
  *(undefined8 *)(lVar10 + 8) = uVar2;
  *(ulong *)(lVar10 + 0x20) = uStack_a0;
  *(undefined8 ********)(lVar10 + 0x18) = pppppppuStack_a8;
  *(ulong *)(lVar10 + 0x28) = uStack_98;
  puVar15 = puStack_c0 + 6;
  puVar9 = (undefined8 *)*plVar3;
  puVar13 = (undefined8 *)plVar3[1];
  puVar6 = puStack_c8;
  if (puVar13 == puVar9) {
    *plVar3 = (long)puStack_c8;
    plVar3[1] = (long)puVar15;
    plVar3[2] = lStack_b8;
  }
  else {
    do {
      puVar7 = puVar6 + -6;
      *puVar7 = &UNK_00a1df28;
      uVar2 = puVar13[-5];
      puVar6[-4] = puVar13[-4];
      puVar6[-5] = uVar2;
      uVar16 = puVar13[-2];
      uVar2 = puVar13[-3];
      puVar6[-1] = puVar13[-1];
      puVar6[-2] = uVar16;
      puVar6[-3] = uVar2;
      puVar13[-2] = 0;
      puVar13[-1] = 0;
      puVar13[-3] = 0;
      puVar13 = puVar13 + -6;
      puVar6 = puVar7;
    } while (puVar13 != puVar9);
    puVar9 = (undefined8 *)*plVar3;
    puVar13 = (undefined8 *)plVar3[1];
    *plVar3 = (long)puVar7;
    plVar3[1] = (long)puVar15;
    plVar3[2] = lStack_b8;
    if (puVar13 != puVar9) {
      do {
        puVar13 = puVar13 + -6;
        (**(code **)*puVar13)(puVar13);
      } while (puVar13 != puVar9);
      puVar13 = puVar9;
    }
  }
  if (puVar13 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  return puVar15;
}

