
void FUN_00620280(void)

{
  bool bVar1;
  bool bVar2;
  uint uVar3;
  uint uVar4;
  undefined8 uVar5;
  int in_w8;
  int iVar6;
  uint in_w9;
  long *unaff_x20;
  uint uVar7;
  int iVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  uint unaff_w24;
  long lVar12;
  uint uVar13;
  ulong unaff_x28;
  undefined8 in_stack_00000000;
  ulong in_stack_00000008;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 *in_stack_00000038;
  undefined8 *in_stack_00000040;
  
  uVar13 = in_w8 << (ulong)(in_w9 & 0x1f);
  uVar9 = (ulong)uVar13;
  if (uVar13 < (uint)unaff_x28) {
    lVar12 = uVar9 * 0x30;
    do {
      uVar5 = (**(code **)(*unaff_x20 + 0x20))();
      func_0x005ffccc((long)in_stack_00000038 + lVar12,uVar5);
      lVar12 = lVar12 + in_stack_00000018 * 0x30;
      uVar9 = uVar9 + in_stack_00000018;
    } while (uVar9 < unaff_x28);
  }
  if (unaff_w24 < (uint)unaff_x28) {
    lVar12 = (in_stack_00000030 & 0xffffffff) * 0x30 + 0x30;
    uVar9 = in_stack_00000030;
    do {
      lVar10 = lVar12;
      uVar11 = uVar9;
      while (uVar11 = uVar11 + 2, uVar11 < uVar9 + in_stack_00000030) {
        uVar5 = (**(code **)(*unaff_x20 + 0x20))();
        func_0x005ffccc((long)in_stack_00000038 + lVar10 + 0x30,uVar5);
        lVar10 = lVar10 + 0x60;
      }
      lVar12 = lVar12 + in_stack_00000018 * 0x30;
      uVar9 = uVar9 + in_stack_00000018;
    } while (uVar9 < in_stack_00000008);
  }
  func_0x005fdd18();
  uVar9 = (ulong)(in_stack_00000000._4_4_ - 1U);
  if (-1 < (int)(in_stack_00000000._4_4_ - 1U)) {
    uVar7 = 0;
    uVar13 = 0;
    bVar1 = true;
    in_stack_00000000._4_4_ = -in_stack_00000000._4_4_;
    uVar11 = uVar9;
    do {
      in_stack_00000000._4_4_ = in_stack_00000000._4_4_ + 1;
      uVar3 = func_0x005ffe3c(in_stack_00000028,uVar11);
      uVar4 = func_0x005ffe3c(in_stack_00000020,uVar11);
      uVar13 = uVar3 | uVar13 << 1;
      uVar7 = uVar4 | uVar7 << 1;
      if ((uVar11 == 0) ||
         ((uint)in_stack_00000030 <= uVar13 << 1 || (uint)in_stack_00000030 <= uVar7 << 1)) {
        bVar2 = uVar13 != 0 || uVar7 != 0;
        if (uVar13 == 0 && uVar7 == 0) {
          uVar3 = 1;
        }
        iVar8 = 0;
        if (((uVar3 | uVar4) & 1) == 0) {
          do {
            iVar8 = iVar8 + 1;
            bVar2 = 1 < uVar13 || 1 < uVar7;
            if (((uVar13 >> 1 & 1) != 0) || (1 >= uVar13 && 1 >= uVar7)) break;
            uVar3 = uVar7 >> 1;
            uVar13 = uVar13 >> 1;
            uVar7 = uVar7 >> 1;
          } while ((uVar3 & 1) == 0);
          iVar6 = ((int)uVar9 + in_stack_00000000._4_4_) - iVar8;
          if (!bVar1) goto LAB_00620438;
LAB_006204a0:
          func_0x005ffccc();
        }
        else {
          iVar6 = (int)uVar9 - (int)uVar11;
          if (bVar1) goto LAB_006204a0;
LAB_00620438:
          iVar6 = iVar6 + 1;
          while (iVar6 = iVar6 + -1, iVar6 != 0) {
            (**(code **)(*unaff_x20 + 0x38))();
            func_0x005ffccc();
          }
          if (bVar2) {
            (**(code **)(*unaff_x20 + 0x48))();
          }
        }
        iVar8 = iVar8 + 1;
        while (iVar8 = iVar8 + -1, iVar8 != 0) {
          (**(code **)(*unaff_x20 + 0x38))();
          func_0x005ffccc();
        }
        uVar13 = 0;
        bVar1 = false;
        uVar7 = 0;
        uVar9 = uVar11;
      }
      bVar2 = 0 < (long)uVar11;
      uVar11 = uVar11 - 1;
    } while (bVar2);
  }
  if (in_stack_00000038 != (undefined8 *)0x0) {
    while (in_stack_00000040 != in_stack_00000038) {
      in_stack_00000040 = in_stack_00000040 + -6;
      (**(code **)*in_stack_00000040)(in_stack_00000040);
    }
    __ZdlPv(in_stack_00000038);
  }
  return;
}

