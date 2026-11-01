
/* WARNING: Possible PIC construction at 0x0071bca0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0071bca4) */

ulong FUN_0071baac(void)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined1 *puVar11;
  long lVar12;
  ulong uVar13;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar14;
  undefined8 *puVar15;
  undefined8 uVar16;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 uVar17;
  long unaff_x24;
  undefined8 *puVar18;
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
    lVar5 = unaff_x22[2];
    unaff_x22[2] = lVar5 + 1U;
    uVar6 = *(ulong *)(unaff_x24 + 0x10);
    if (uVar6 <= lVar5 + 1U) {
      if (unaff_x20 != 0) goto LAB_0071ba10;
code_r0x0071bbd8:
      uStack0000000000000020 = *(undefined8 *)(unaff_x19 + 0x98);
      uVar3 = *unaff_x23;
      in_stack_00000008[1] = unaff_x23[1];
      *in_stack_00000008 = uVar3;
      in_stack_00000038 = 1;
      func_0x0071a9ec();
      func_0x00710d48();
      iVar4 = *(int *)(unaff_x19 + 0x80);
joined_r0x0071bc10:
      if (iVar4 == 0x3a) {
        func_0x00710d48();
      }
      else {
        func_0x0072447c();
      }
code_r0x0071bc20:
      uVar1 = *(undefined4 *)(unaff_x19 + 0x114);
      in_stack_00000028 = unaff_x23[1];
      uStack0000000000000020 = *unaff_x23;
      if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
        func_0x0071f5c8();
        *(undefined4 *)(unaff_x19 + 0x114) = uVar1;
      }
      uStack0000000000000020 = func_0x0071cf0c();
      *(undefined4 *)(unaff_x19 + 0x114) = uVar1;
      func_0x00711dac();
      if (*(int *)(unaff_x19 + 0x80) != 0x2c) {
        return 0;
      }
      if (in_stack_00000018 != 0) {
        func_0x00711dac(in_stack_00000018);
      }
      func_0x00710d48();
      iVar4 = *(int *)(unaff_x19 + 0x80);
      if (iVar4 == 0x29) {
        func_0x007181dc();
        return 0;
      }
      if (iVar4 == 0x106) goto code_r0x0071bcec;
      if (iVar4 == 0x119) {
        func_0x0070c3d0(&uStack0000000000000020,in_stack_00000010);
        if ((int)uStack0000000000000020 == 0x106) goto code_r0x0071bcec;
        iVar4 = *(int *)(unaff_x19 + 0x80);
      }
      if (iVar4 == 0x119) {
        func_0x0070c3d0(&uStack0000000000000020,in_stack_00000010);
        if ((int)uStack0000000000000020 == 0x3a) break;
      }
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
      goto code_r0x0071bc20;
    }
code_r0x0071bac4:
    puVar18 = (undefined8 *)*unaff_x22;
    puVar11 = (undefined1 *)puVar18[1];
    if (puVar11 < (undefined1 *)puVar18[2]) {
      *puVar11 = 0;
      puVar11[0x18] = 0;
      puVar15 = (undefined8 *)(puVar11 + 0x20);
    }
    else {
      puVar19 = (undefined1 *)*puVar18;
      lVar5 = (long)puVar11 - (long)puVar19 >> 5;
      uVar6 = lVar5 + 1;
      if (uVar6 >> 0x3b != 0) {
        func_0x00017f90(puVar18);
LAB_0071bce8:
        unaff_x19 = func_0x00017514();
code_r0x0071bcec:
        if (*(int *)(unaff_x19 + 0x80) == 0x106) {
          uVar14 = *(undefined8 *)(unaff_x19 + 0x84);
          func_0x00710d48(unaff_x19);
          uVar3 = 0;
          uVar1 = *(undefined4 *)(unaff_x19 + 0x114);
          uStack_58 = *(undefined8 *)(unaff_x19 + 0x8c);
          uStack_60 = *(undefined8 *)(unaff_x19 + 0x84);
          if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
            uVar3 = func_0x0071f5c8(unaff_x19,0,0);
            *(undefined4 *)(unaff_x19 + 0x114) = uVar1;
          }
          lVar5 = func_0x0071cf0c(unaff_x19,uVar3,&uStack_60);
          *(undefined4 *)(unaff_x19 + 0x114) = uVar1;
          uStack_58 = *(undefined8 *)(lVar5 + 0x14);
          uStack_60 = uVar14;
          uVar6 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
          func_0x00708594(uVar6,&uStack_60,lVar5);
          return uVar6;
        }
        if ((*(int *)(unaff_x19 + 0x80) != 0x119) ||
           (func_0x0070c3d0(&uStack_60,unaff_x19 + 0x60), (int)uStack_60 != 0x106)) {
          return 0;
        }
        if (*(int *)(unaff_x19 + 0x80) == 0x119) {
          uVar16 = *(undefined8 *)(unaff_x19 + 0x98);
          uVar14 = *(undefined8 *)(unaff_x19 + 0x84);
          func_0x00710d48(unaff_x19);
          uVar17 = *(undefined8 *)(unaff_x19 + 0x8c);
          uVar3 = *(undefined8 *)(unaff_x19 + 0x84);
          if (*(int *)(unaff_x19 + 0x80) == 0x106) goto code_r0x0071be4c;
code_r0x0071bde8:
          func_0x0072447c(unaff_x19,0x106,"generic type pack annotation");
        }
        else {
          func_0x0072415c(unaff_x19,"generic name");
          uVar14 = *(undefined8 *)(unaff_x19 + 0x84);
          uVar16 = *(undefined8 *)(unaff_x19 + 0x128);
          uVar17 = *(undefined8 *)(unaff_x19 + 0x8c);
          uVar3 = uVar14;
          if (*(int *)(unaff_x19 + 0x80) != 0x106) goto code_r0x0071bde8;
code_r0x0071be4c:
          func_0x00710d48(unaff_x19);
        }
        uStack_60 = uVar14;
        uStack_58 = uVar17;
        uVar6 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
        func_0x0070861c(uVar6,&uStack_60,uVar16);
        if (*(char *)(unaff_x19 + 0x58) == '\0') {
          return uVar6;
        }
        uVar14 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0xc);
        func_0x007097cc(uVar14,uVar3);
        lVar5 = *(long *)(unaff_x19 + 0x420);
        if ((ulong)(lVar5 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
          if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar6 != *(ulong *)(unaff_x19 + 0x430))) {
            uVar10 = 0;
            uVar7 = uVar6 >> 4 ^ uVar6 >> 9;
            do {
              uVar7 = uVar7 & lVar5 - 1U;
              uVar13 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar7 * 0x10);
              if (uVar13 == uVar6) goto code_r0x0071bf00;
              uVar10 = uVar10 + 1;
              uVar7 = uVar10 + uVar7;
            } while (uVar13 != *(ulong *)(unaff_x19 + 0x430) && uVar10 <= lVar5 - 1U);
          }
          func_0x006db93c();
          lVar5 = *(long *)(unaff_x19 + 0x420);
        }
code_r0x0071bf00:
        lVar2 = *(long *)(unaff_x19 + 0x418);
        uVar10 = (uVar6 >> 4 ^ uVar6 >> 9) & lVar5 - 1U;
        uVar7 = *(ulong *)(lVar2 + uVar10 * 0x10);
        if (uVar7 != *(ulong *)(unaff_x19 + 0x430)) {
          lVar12 = 1;
          do {
            if (uVar7 == uVar6) goto code_r0x0071bf60;
            uVar10 = uVar10 + lVar12 & lVar5 - 1U;
            uVar7 = *(ulong *)(lVar2 + uVar10 * 0x10);
            lVar12 = lVar12 + 1;
          } while (uVar7 != *(ulong *)(unaff_x19 + 0x430));
        }
        *(ulong *)(lVar2 + uVar10 * 0x10) = uVar6;
        *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x0071bf60:
        *(undefined8 *)(lVar2 + uVar10 * 0x10 + 8) = uVar14;
        return uVar6;
      }
      uVar7 = (long)puVar18[2] - (long)puVar19;
      uVar10 = (long)uVar7 >> 4;
      if (uVar10 <= uVar6) {
        uVar10 = uVar6;
      }
      if (0x7fffffffffffffdf < uVar7) {
        uVar10 = 0x7ffffffffffffff;
      }
      if (uVar10 == 0) {
        lVar2 = 0;
        puVar15 = (undefined8 *)(lVar5 * 0x20);
        *(undefined1 *)puVar15 = 0;
        *(undefined1 *)(puVar15 + 3) = 0;
      }
      else {
        if (uVar10 >> 0x3b != 0) goto LAB_0071bce8;
        lVar2 = __Znwm(uVar10 << 5);
        puVar15 = (undefined8 *)(lVar2 + lVar5 * 0x20);
        *(undefined1 *)puVar15 = 0;
        *(undefined1 *)(puVar15 + 3) = 0;
      }
      puVar8 = puVar15;
      puVar9 = puVar15;
      if (puVar11 != puVar19) {
        do {
          uVar3 = *(undefined8 *)(puVar11 + -0x20);
          uVar16 = *(undefined8 *)(puVar11 + -8);
          uVar14 = *(undefined8 *)(puVar11 + -0x10);
          puVar9 = puVar8 + -4;
          puVar8[-3] = *(undefined8 *)(puVar11 + -0x18);
          *puVar9 = uVar3;
          puVar8[-1] = uVar16;
          puVar8[-2] = uVar14;
          puVar11 = puVar11 + -0x20;
          puVar8 = puVar9;
        } while (puVar11 != puVar19);
        puVar11 = (undefined1 *)*puVar18;
      }
      puVar15 = puVar15 + 4;
      *puVar18 = puVar9;
      puVar18[1] = puVar15;
      puVar18[2] = lVar2 + uVar10 * 0x20;
      if (puVar11 != (undefined1 *)0x0) {
        __ZdlPv(puVar11);
      }
    }
    puVar18[1] = puVar15;
  } while( true );
  uVar6 = *(ulong *)(unaff_x24 + 0x10);
  if ((ulong)unaff_x22[2] < uVar6) goto code_r0x0071bac4;
  if (unaff_x20 == 0) goto code_r0x0071bbd8;
LAB_0071ba10:
  if (*(ulong *)(unaff_x20 + 0x10) < uVar6) {
    do {
      uStack0000000000000020 = uStack0000000000000020 & 0xffffffffffffff00;
      in_stack_00000028 = in_stack_00000028 & 0xffffffffffffff00;
      func_0x0071bf6c();
    } while (*(ulong *)(unaff_x20 + 0x10) < *(ulong *)(unaff_x24 + 0x10));
  }
  uStack0000000000000020 = *(undefined8 *)(unaff_x19 + 0x98);
  uVar3 = *unaff_x23;
  in_stack_00000008[1] = unaff_x23[1];
  *in_stack_00000008 = uVar3;
  in_stack_00000038 = 1;
  func_0x0071a9ec();
  func_0x00710d48();
  uStack0000000000000020 = *(undefined8 *)(unaff_x19 + 0x84);
  in_stack_00000028 = CONCAT71(in_stack_00000028._1_7_,1);
  func_0x0071bf6c();
  iVar4 = *(int *)(unaff_x19 + 0x80);
  goto joined_r0x0071bc10;
}

