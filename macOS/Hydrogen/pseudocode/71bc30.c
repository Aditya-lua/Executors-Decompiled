
/* WARNING: Possible PIC construction at 0x0071bca0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0071bca4) */

ulong FUN_0071bc30(void)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined1 *puVar10;
  long lVar11;
  ulong uVar12;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar13;
  undefined8 *puVar14;
  long lVar15;
  long unaff_x21;
  undefined8 uVar16;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 uVar17;
  long unaff_x24;
  undefined4 unaff_w25;
  undefined8 *puVar18;
  undefined8 unaff_x26;
  undefined8 *unaff_x27;
  undefined1 *puVar19;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined1 in_stack_00000038;
  undefined8 uStack_60;
  undefined8 uStack_58;
  
  do {
    if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
      func_0x0071f5c8();
      *(undefined4 *)(unaff_x19 + 0x114) = unaff_w25;
    }
    uStack0000000000000020 = func_0x0071cf0c();
    *(undefined4 *)(unaff_x19 + 0x114) = unaff_w25;
    func_0x00711dac();
    if (*(int *)(unaff_x19 + 0x80) != 0x2c) {
      return 0;
    }
    if (unaff_x21 != 0) {
      func_0x00711dac(unaff_x21);
    }
    func_0x00710d48();
    iVar4 = *(int *)(unaff_x19 + 0x80);
    if (iVar4 == 0x29) {
      func_0x007181dc();
      return 0;
    }
    if (iVar4 == 0x106) break;
    if (iVar4 == 0x119) {
      func_0x0070c3d0(&uStack0000000000000020,unaff_x26);
      if ((int)uStack0000000000000020 == 0x106) break;
      iVar4 = *(int *)(unaff_x19 + 0x80);
    }
    if (iVar4 == 0x119) {
      func_0x0070c3d0(&uStack0000000000000020,unaff_x26);
      if ((int)uStack0000000000000020 != 0x3a) goto code_r0x0071bb94;
      uVar5 = *(ulong *)(unaff_x24 + 0x10);
      if ((ulong)unaff_x22[2] < uVar5) {
        do {
          puVar18 = (undefined8 *)*unaff_x22;
          puVar10 = (undefined1 *)puVar18[1];
          if (puVar10 < (undefined1 *)puVar18[2]) {
            *puVar10 = 0;
            puVar10[0x18] = 0;
            puVar14 = (undefined8 *)(puVar10 + 0x20);
          }
          else {
            puVar19 = (undefined1 *)*puVar18;
            lVar15 = (long)puVar10 - (long)puVar19 >> 5;
            uVar5 = lVar15 + 1;
            if (uVar5 >> 0x3b != 0) {
              func_0x00017f90(puVar18);
code_r0x0071bce8:
              unaff_x19 = func_0x00017514();
              goto code_r0x0071bcec;
            }
            uVar6 = (long)puVar18[2] - (long)puVar19;
            uVar9 = (long)uVar6 >> 4;
            if (uVar9 <= uVar5) {
              uVar9 = uVar5;
            }
            if (0x7fffffffffffffdf < uVar6) {
              uVar9 = 0x7ffffffffffffff;
            }
            if (uVar9 == 0) {
              lVar2 = 0;
              puVar14 = (undefined8 *)(lVar15 * 0x20);
              *(undefined1 *)puVar14 = 0;
              *(undefined1 *)(puVar14 + 3) = 0;
            }
            else {
              if (uVar9 >> 0x3b != 0) goto code_r0x0071bce8;
              lVar2 = __Znwm(uVar9 << 5);
              puVar14 = (undefined8 *)(lVar2 + lVar15 * 0x20);
              *(undefined1 *)puVar14 = 0;
              *(undefined1 *)(puVar14 + 3) = 0;
            }
            puVar7 = puVar14;
            puVar8 = puVar14;
            if (puVar10 != puVar19) {
              do {
                uVar3 = *(undefined8 *)(puVar10 + -0x20);
                uVar16 = *(undefined8 *)(puVar10 + -8);
                uVar13 = *(undefined8 *)(puVar10 + -0x10);
                puVar8 = puVar7 + -4;
                puVar7[-3] = *(undefined8 *)(puVar10 + -0x18);
                *puVar8 = uVar3;
                puVar7[-1] = uVar16;
                puVar7[-2] = uVar13;
                puVar10 = puVar10 + -0x20;
                puVar7 = puVar8;
              } while (puVar10 != puVar19);
              puVar10 = (undefined1 *)*puVar18;
            }
            puVar14 = puVar14 + 4;
            *puVar18 = puVar8;
            puVar18[1] = puVar14;
            puVar18[2] = lVar2 + uVar9 * 0x20;
            if (puVar10 != (undefined1 *)0x0) {
              __ZdlPv(puVar10);
            }
          }
          puVar18[1] = puVar14;
          lVar15 = unaff_x22[2];
          unaff_x22[2] = lVar15 + 1U;
          uVar5 = *(ulong *)(unaff_x24 + 0x10);
        } while (lVar15 + 1U < uVar5);
        unaff_x21 = in_stack_00000018;
        unaff_x26 = in_stack_00000010;
        unaff_x27 = in_stack_00000008;
        if (unaff_x20 == 0) goto code_r0x0071bbd8;
code_r0x0071ba10:
        if (*(ulong *)(unaff_x20 + 0x10) < uVar5) {
          do {
            uStack0000000000000020 = uStack0000000000000020 & 0xffffffffffffff00;
            in_stack_00000028 = in_stack_00000028 & 0xffffffffffffff00;
            func_0x0071bf6c();
          } while (*(ulong *)(unaff_x20 + 0x10) < *(ulong *)(unaff_x24 + 0x10));
        }
        uStack0000000000000020 = *(undefined8 *)(unaff_x19 + 0x98);
        uVar3 = *unaff_x23;
        unaff_x27[1] = unaff_x23[1];
        *unaff_x27 = uVar3;
        in_stack_00000038 = 1;
        func_0x0071a9ec();
        func_0x00710d48();
        uStack0000000000000020 = *(undefined8 *)(unaff_x19 + 0x84);
        in_stack_00000028 = CONCAT71(in_stack_00000028._1_7_,1);
        func_0x0071bf6c();
        iVar4 = *(int *)(unaff_x19 + 0x80);
      }
      else {
        if (unaff_x20 != 0) goto code_r0x0071ba10;
code_r0x0071bbd8:
        uStack0000000000000020 = *(undefined8 *)(unaff_x19 + 0x98);
        uVar3 = *unaff_x23;
        unaff_x27[1] = unaff_x23[1];
        *unaff_x27 = uVar3;
        in_stack_00000038 = 1;
        func_0x0071a9ec();
        func_0x00710d48();
        iVar4 = *(int *)(unaff_x19 + 0x80);
      }
      if (iVar4 == 0x3a) {
        func_0x00710d48();
      }
      else {
        func_0x0072447c();
      }
    }
    else {
code_r0x0071bb94:
      if (unaff_x22[2] != 0) {
        uStack0000000000000020 = uStack0000000000000020 & 0xffffffffffffff00;
        in_stack_00000038 = 0;
        func_0x0071a9ec();
        if (unaff_x20 != 0) {
          uStack0000000000000020 = uStack0000000000000020 & 0xffffffffffffff00;
          in_stack_00000028 = in_stack_00000028 & 0xffffffffffffff00;
          func_0x0071bf6c();
        }
      }
    }
    unaff_w25 = *(undefined4 *)(unaff_x19 + 0x114);
    in_stack_00000028 = unaff_x23[1];
    uStack0000000000000020 = *unaff_x23;
  } while( true );
code_r0x0071bcec:
  if (*(int *)(unaff_x19 + 0x80) == 0x106) {
    uVar13 = *(undefined8 *)(unaff_x19 + 0x84);
    func_0x00710d48(unaff_x19);
    uVar3 = 0;
    uVar1 = *(undefined4 *)(unaff_x19 + 0x114);
    uStack_58 = *(undefined8 *)(unaff_x19 + 0x8c);
    uStack_60 = *(undefined8 *)(unaff_x19 + 0x84);
    if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
      uVar3 = func_0x0071f5c8(unaff_x19,0,0);
      *(undefined4 *)(unaff_x19 + 0x114) = uVar1;
    }
    lVar15 = func_0x0071cf0c(unaff_x19,uVar3,&uStack_60);
    *(undefined4 *)(unaff_x19 + 0x114) = uVar1;
    uStack_58 = *(undefined8 *)(lVar15 + 0x14);
    uStack_60 = uVar13;
    uVar5 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
    func_0x00708594(uVar5,&uStack_60,lVar15);
    return uVar5;
  }
  if ((*(int *)(unaff_x19 + 0x80) != 0x119) ||
     (func_0x0070c3d0(&uStack_60,unaff_x19 + 0x60), (int)uStack_60 != 0x106)) {
    return 0;
  }
  if (*(int *)(unaff_x19 + 0x80) == 0x119) {
    uVar16 = *(undefined8 *)(unaff_x19 + 0x98);
    uVar3 = *(undefined8 *)(unaff_x19 + 0x84);
    func_0x00710d48(unaff_x19);
    uVar13 = *(undefined8 *)(unaff_x19 + 0x84);
    uVar17 = *(undefined8 *)(unaff_x19 + 0x8c);
    iVar4 = *(int *)(unaff_x19 + 0x80);
  }
  else {
    func_0x0072415c(unaff_x19,"generic name");
    uVar3 = *(undefined8 *)(unaff_x19 + 0x84);
    uVar16 = *(undefined8 *)(unaff_x19 + 0x128);
    uVar17 = *(undefined8 *)(unaff_x19 + 0x8c);
    iVar4 = *(int *)(unaff_x19 + 0x80);
    uVar13 = uVar3;
  }
  if (iVar4 == 0x106) {
    func_0x00710d48(unaff_x19);
  }
  else {
    func_0x0072447c(unaff_x19,0x106,"generic type pack annotation");
  }
  uStack_60 = uVar3;
  uStack_58 = uVar17;
  uVar5 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
  func_0x0070861c(uVar5,&uStack_60,uVar16);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0xc);
    func_0x007097cc(uVar3,uVar13);
    lVar15 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar15 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar5 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar9 = 0;
        uVar6 = uVar5 >> 4 ^ uVar5 >> 9;
        do {
          uVar6 = uVar6 & lVar15 - 1U;
          uVar12 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar6 * 0x10);
          if (uVar12 == uVar5) goto code_r0x0071bf00;
          uVar9 = uVar9 + 1;
          uVar6 = uVar9 + uVar6;
        } while (uVar12 != *(ulong *)(unaff_x19 + 0x430) && uVar9 <= lVar15 - 1U);
      }
      func_0x006db93c();
      lVar15 = *(long *)(unaff_x19 + 0x420);
    }
code_r0x0071bf00:
    lVar2 = *(long *)(unaff_x19 + 0x418);
    uVar9 = (uVar5 >> 4 ^ uVar5 >> 9) & lVar15 - 1U;
    uVar6 = *(ulong *)(lVar2 + uVar9 * 0x10);
    if (uVar6 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar11 = 1;
      do {
        if (uVar6 == uVar5) goto code_r0x0071bf60;
        uVar9 = uVar9 + lVar11 & lVar15 - 1U;
        uVar6 = *(ulong *)(lVar2 + uVar9 * 0x10);
        lVar11 = lVar11 + 1;
      } while (uVar6 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar2 + uVar9 * 0x10) = uVar5;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x0071bf60:
    *(undefined8 *)(lVar2 + uVar9 * 0x10 + 8) = uVar3;
  }
  return uVar5;
}

