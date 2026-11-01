
void FUN_00711f88(void)

{
  uint uVar1;
  long *plVar2;
  int iVar3;
  bool in_ZR;
  undefined1 uVar4;
  long lVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  undefined8 unaff_x19;
  ulong uVar12;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  ulong *unaff_x23;
  undefined8 uVar13;
  undefined8 unaff_x25;
  undefined8 uVar14;
  undefined4 unaff_w27;
  ulong uVar15;
  undefined8 uVar16;
  undefined4 uStack0000000000000020;
  undefined4 uStack0000000000000024;
  undefined4 in_stack_00000028;
  undefined4 uStack000000000000002c;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  undefined1 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined8 uStack_70;
  undefined8 uStack_68;
  ulong uStack_60;
  
  if (in_ZR) {
    func_0x00710d48();
    uStack0000000000000048 = unaff_x22;
    in_stack_00000050 = unaff_x21;
  }
  else {
    func_0x0072447c();
  }
  plVar2 = (long *)(unaff_x20 + 400);
  lVar8 = *(long *)(unaff_x20 + 400);
  lVar10 = *(long *)(unaff_x20 + 0x198);
  lVar5 = func_0x00711360();
  lVar9 = *(long *)(unaff_x20 + 400);
  uVar11 = *(long *)(unaff_x20 + 0x198) - lVar9 >> 3;
  uVar15 = (ulong)(lVar10 - lVar8) >> 3 & 0xffffffff;
  if (uVar15 < uVar11) {
    do {
      uVar12 = uVar11 - 1;
      uVar14 = *(undefined8 *)(*(long *)(*plVar2 + uVar11 * 8 + -8) + 0x18);
      puVar6 = (undefined8 *)func_0x006db828(unaff_x20 + 0x168);
      *puVar6 = uVar14;
      uVar11 = uVar12;
    } while (uVar15 < uVar12);
    lVar9 = *(long *)(unaff_x20 + 400);
    uVar11 = *(long *)(unaff_x20 + 0x198) - lVar9 >> 3;
  }
  if (uVar15 < uVar11 || uVar15 - uVar11 == 0) {
    if (uVar15 < uVar11) {
      *(ulong *)(unaff_x20 + 0x198) = lVar9 + uVar15 * 8;
    }
  }
  else {
    func_0x006cfeb0(plVar2,uVar15 - uVar11);
  }
  uStack0000000000000030 = uStack0000000000000030 & 0xffffffffffffff00;
  in_stack_00000040 = 0;
  if (*(int *)(unaff_x20 + 0x80) == 0x126) {
    *(undefined1 *)(lVar5 + 0x30) = 1;
    in_stack_00000038 = unaff_x23[1];
    uStack0000000000000030 = *unaff_x23;
    in_stack_00000040 = 1;
    unaff_x22 = *(undefined8 *)(unaff_x20 + 0x84);
    uVar14 = *(undefined8 *)(unaff_x20 + 0x8c);
    func_0x00710d48();
    lVar8 = *(long *)(unaff_x20 + 400);
    lVar10 = *(long *)(unaff_x20 + 0x198);
    lVar7 = func_0x00711360();
    lVar9 = *(long *)(unaff_x20 + 400);
    uVar11 = *(long *)(unaff_x20 + 0x198) - lVar9 >> 3;
    uVar15 = (ulong)(lVar10 - lVar8) >> 3 & 0xffffffff;
    if (uVar15 < uVar11) {
      do {
        uVar12 = uVar11 - 1;
        uVar13 = *(undefined8 *)(*(long *)(*plVar2 + uVar11 * 8 + -8) + 0x18);
        puVar6 = (undefined8 *)func_0x006db828(unaff_x20 + 0x168);
        *puVar6 = uVar13;
        uVar11 = uVar12;
      } while (uVar15 < uVar12);
      lVar9 = *(long *)(unaff_x20 + 400);
      uVar11 = *(long *)(unaff_x20 + 0x198) - lVar9 >> 3;
    }
    if (uVar15 < uVar11 || uVar15 - uVar11 == 0) {
      if (uVar15 < uVar11) {
        *(ulong *)(unaff_x20 + 0x198) = lVar9 + uVar15 * 8;
      }
    }
    else {
      func_0x006cfeb0(plVar2,uVar15 - uVar11);
    }
    *(undefined8 *)(lVar7 + 0xc) = uVar14;
    uStack0000000000000020 = 0x126;
  }
  else {
    if (*(int *)(unaff_x20 + 0x80) == 0x127) {
      *(undefined1 *)(lVar5 + 0x30) = 1;
      iVar3 = *(int *)(unaff_x20 + 0x114);
      uVar1 = iVar3 + 1;
      *(uint *)(unaff_x20 + 0x114) = uVar1;
      if (uRam0000000000a33728 < uVar1) {
        lVar8 = func_0x0070f408();
        uVar13 = *(undefined8 *)(lVar8 + 0x84);
        uStack_60 = uVar15;
        func_0x00710d48();
        uVar14 = func_0x007168a8(lVar8,0);
        uStack_68 = *(undefined8 *)(lVar8 + 0x98);
        uStack_70 = *(undefined8 *)(lVar8 + 0x90);
        uStack_78 = (undefined4)*(undefined8 *)(lVar8 + 0x88);
        uStack_74 = (undefined4)((ulong)*(undefined8 *)(lVar8 + 0x88) >> 0x20);
        uStack_80 = (undefined4)*(undefined8 *)(lVar8 + 0x80);
        uStack_7c = (undefined4)((ulong)*(undefined8 *)(lVar8 + 0x80) >> 0x20);
        iVar3 = *(int *)(lVar8 + 0x80);
        if (iVar3 == 0x125) {
          func_0x00710d48(lVar8);
        }
        else {
          func_0x0072447c(lVar8,0x125,"while loop");
        }
        *(int *)(*(long *)(lVar8 + 0x150) + -4) = *(int *)(*(long *)(lVar8 + 0x150) + -4) + 1;
        lVar9 = *(long *)(lVar8 + 400);
        lVar5 = *(long *)(lVar8 + 0x198);
        lVar7 = func_0x00711360(lVar8);
        lVar10 = *(long *)(lVar8 + 400);
        uVar11 = *(long *)(lVar8 + 0x198) - lVar10 >> 3;
        uVar15 = (ulong)(lVar5 - lVar9) >> 3 & 0xffffffff;
        if (uVar15 < uVar11) {
          do {
            uVar12 = uVar11 - 1;
            uVar16 = *(undefined8 *)(*(long *)(*(long *)(lVar8 + 400) + uVar11 * 8 + -8) + 0x18);
            puVar6 = (undefined8 *)func_0x006db828(lVar8 + 0x168);
            *puVar6 = uVar16;
            uVar11 = uVar12;
          } while (uVar15 < uVar12);
          lVar10 = *(long *)(lVar8 + 400);
          uVar11 = *(long *)(lVar8 + 0x198) - lVar10 >> 3;
        }
        if (uVar15 < uVar11 || uVar15 - uVar11 == 0) {
          if (uVar15 < uVar11) {
            *(ulong *)(lVar8 + 0x198) = lVar10 + uVar15 * 8;
          }
        }
        else {
          func_0x006cfeb0((long *)(lVar8 + 400),uVar15 - uVar11);
        }
        *(int *)(*(long *)(lVar8 + 0x150) + -4) = *(int *)(*(long *)(lVar8 + 0x150) + -4) + -1;
        uVar16 = *(undefined8 *)(lVar8 + 0x8c);
        uStack_90 = uStack_80;
        uStack_8c = uStack_7c;
        uStack_88 = uStack_78;
        uVar4 = func_0x00716f30(lVar8,0x128,&uStack_90);
        *(undefined1 *)(lVar7 + 0x30) = uVar4;
        uStack_90 = (undefined4)uVar13;
        uStack_8c = (undefined4)((ulong)uVar13 >> 0x20);
        uStack_88 = (undefined4)uVar16;
        uStack_84 = (undefined4)((ulong)uVar16 >> 0x20);
        uVar13 = func_0x00704c24(*(undefined8 *)(lVar8 + 0xd8),0x48);
        func_0x00706e70(uVar13,&uStack_90,uVar14,lVar7,iVar3 == 0x125,(ulong)&uStack_80 | 4);
        return;
      }
      in_stack_00000038 = unaff_x23[1];
      uStack0000000000000030 = *unaff_x23;
      in_stack_00000040 = 1;
      lVar7 = func_0x00711f30();
      uVar14 = *(undefined8 *)(lVar7 + 0x14);
      *(int *)(unaff_x20 + 0x114) = iVar3;
      goto code_r0x007121d8;
    }
    lVar7 = 0;
    uStack0000000000000020 = unaff_w27;
  }
  uVar14 = *(undefined8 *)(unaff_x20 + 0x8c);
  uStack0000000000000024 = (undefined4)unaff_x22;
  in_stack_00000028 = (undefined4)((ulong)unaff_x22 >> 0x20);
  uVar4 = func_0x00716f30();
  if (lVar7 == 0) {
    *(undefined1 *)(lVar5 + 0x30) = uVar4;
  }
  else if (*(int *)(lVar7 + 8) == iRam0000000000a27b78) {
    *(undefined1 *)(lVar7 + 0x30) = uVar4;
  }
code_r0x007121d8:
  uStack0000000000000020 = (undefined4)unaff_x19;
  uStack0000000000000024 = (undefined4)((ulong)unaff_x19 >> 0x20);
  in_stack_00000028 = (undefined4)uVar14;
  uStack000000000000002c = (undefined4)((ulong)uVar14 >> 0x20);
  uVar14 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x60);
  func_0x00706d94(uVar14,&uStack0000000000000020,unaff_x25,lVar5,lVar7,&uStack0000000000000048,
                  &uStack0000000000000030);
  return;
}

