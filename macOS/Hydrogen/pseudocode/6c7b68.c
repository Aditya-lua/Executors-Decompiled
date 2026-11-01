
void FUN_006c7b68(void)

{
  uint uVar1;
  undefined4 uVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  undefined8 *unaff_x23;
  ulong unaff_x25;
  undefined8 *unaff_x26;
  byte unaff_w27;
  int iVar11;
  int iVar12;
  undefined8 uVar13;
  double dVar14;
  double unaff_d8;
  undefined8 in_stack_00000010;
  undefined4 uStack0000000000000018;
  uint uStack000000000000001c;
  int in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined4 in_stack_00000038;
  
code_r0x006c7b68:
  *unaff_x23 = 0;
  unaff_x23[1] = 0;
  *(undefined4 *)(unaff_x23 + 2) = 0;
LAB_006c7ac8:
  uVar13 = *(undefined8 *)(unaff_x25 + 0xc);
  unaff_x26[1] = *(undefined8 *)(unaff_x25 + 0x14);
  *unaff_x26 = uVar13;
  func_0x006c5ed4();
  func_0x006ca134();
  iVar11 = 0;
  *(undefined4 *)((long)in_stack_00000030 + 0x484) = in_stack_00000038;
  unaff_x20 = unaff_x20 + 1;
  if (*(ulong *)(unaff_x21 + 0x28) <= unaff_x20) {
code_r0x006c7c38:
    if (uStack000000000000001c != unaff_w27) {
      func_0x006b1ccc(*unaff_x19,6,uStack000000000000001c,unaff_w27,0);
    }
    *(undefined4 *)((long)unaff_x19 + 0x484) = uStack0000000000000018;
    return;
  }
  do {
    lVar7 = *(long *)(unaff_x21 + 0x20) + unaff_x20 * 0x18;
    unaff_x25 = *(ulong *)(lVar7 + 8);
    if (0 < *(int *)((long)unaff_x19 + 0xc)) {
      func_0x006b2e98(*unaff_x19,*(int *)(*(long *)(lVar7 + 0x10) + 0xc) + 1);
    }
    if (1 < *(int *)((long)unaff_x19 + 0x14)) {
      func_0x006b1ccc(*unaff_x19,0x45,0,0,0);
    }
    if (iVar11 == 0) {
code_r0x006c7a3c:
      if (unaff_x25 != 0) break;
      iVar12 = 0;
    }
    else {
      iVar12 = iVar11;
      if (unaff_x25 != 0 || iVar11 == in_stack_00000020) {
        func_0x006b1ccc(*unaff_x19,0x37,unaff_w27,in_stack_00000028._4_4_ & 0xff,iVar11 + 1U & 0xff)
        ;
        func_0x006b24c4(*unaff_x19,unaff_x22);
        unaff_x22 = (ulong)(uint)(iVar11 + (int)unaff_x22);
        goto code_r0x006c7a3c;
      }
    }
    unaff_x20 = unaff_x20 + 1;
    if (unaff_x20 == *(ulong *)(unaff_x21 + 0x28)) {
      in_stack_00000010._4_4_ = func_0x006c9e64();
      uVar8 = *(ulong *)(unaff_x21 + 0x28);
    }
    else {
      uVar2 = *(undefined4 *)((long)unaff_x19 + 0x484);
      *(uint *)((long)unaff_x19 + 0x484) = (iVar12 + in_stack_00000028._4_4_ & 0xff) + 1;
      func_0x006c6028();
      *(undefined4 *)((long)unaff_x19 + 0x484) = uVar2;
      uVar8 = *(ulong *)(unaff_x21 + 0x28);
    }
    iVar11 = iVar12 + 1;
    if (uVar8 <= unaff_x20) {
      if (iVar12 != -1) {
        uVar1 = 0;
        if ((in_stack_00000010._4_4_ & 1) == 0) {
          uVar1 = iVar12 + 2;
        }
        func_0x006b1ccc(*unaff_x19,0x37,unaff_w27,in_stack_00000028._4_4_ & 0xff,uVar1 & 0xff);
        func_0x006b24c4(*unaff_x19,unaff_x22);
      }
      goto code_r0x006c7c38;
    }
  } while( true );
  in_stack_00000038 = *(undefined4 *)((long)unaff_x19 + 0x484);
  in_stack_00000030 = unaff_x19;
  if ((unaff_x19[0x22] != 0) && (unaff_x19[0x23] != unaff_x25)) {
    uVar8 = 0;
    uVar9 = unaff_x25 >> 4 ^ unaff_x25 >> 9;
    do {
      uVar9 = uVar9 & unaff_x19[0x21] - 1;
      uVar10 = *(ulong *)(unaff_x19[0x20] + uVar9 * 0x20);
      if (uVar10 == unaff_x25) {
        lVar7 = unaff_x19[0x20] + uVar9 * 0x20;
        iVar11 = *(int *)(lVar7 + 8);
        dVar14 = *(double *)(lVar7 + 0x10);
        bVar3 = true;
        bVar6 = false;
        if (iVar11 == 3) {
          bVar3 = false;
          bVar6 = true;
          if (!NAN(dVar14) && !NAN(unaff_d8)) {
            bVar3 = dVar14 < unaff_d8;
            bVar6 = false;
          }
        }
        bVar4 = false;
        bVar5 = true;
        if (bVar3 == bVar6) {
          bVar4 = false;
          bVar5 = true;
          if (!NAN(dVar14)) {
            bVar4 = dVar14 == 256.0;
            bVar5 = 256.0 <= dVar14;
          }
        }
        if (!bVar5 || bVar4) {
          if (dVar14 == (double)(int)dVar14) goto code_r0x006c7b68;
        }
        else if (iVar11 == 5) goto LAB_006c7ac8;
        break;
      }
      uVar8 = uVar8 + 1;
      uVar9 = uVar8 + uVar9;
    } while (uVar10 != unaff_x19[0x23] && uVar8 <= unaff_x19[0x21] - 1);
  }
  unaff_x23[1] = 0;
  *unaff_x23 = 0;
  unaff_x23[3] = 0;
  unaff_x23[2] = 0;
  *(undefined4 *)(unaff_x23 + 4) = 0;
  func_0x006c5ed4();
  goto LAB_006c7ac8;
}

