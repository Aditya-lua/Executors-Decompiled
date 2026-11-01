
void FUN_00679c68(long param_1,long *param_2)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  long in_x9;
  ulong uVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  uint uVar9;
  undefined8 *unaff_x19;
  long unaff_x20;
  long lVar10;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  
  *param_2 = in_x9 + 0x10;
  param_2[1] = param_1;
  func_0x0067d078(param_2 + 3,&uStack0000000000000008);
  lVar10 = *(long *)(unaff_x20 + 0x10);
  unaff_x19[0xf] = unaff_x24;
  unaff_x19[0x10] = lVar10;
  func_0x006108a0(lVar10);
  if (lVar10 == 0) {
    lVar10 = 0;
    unaff_x19[0x11] = 0;
    lVar3 = *(long *)(unaff_x20 + 0x18);
    if (lVar3 == 0) goto LAB_00679cb8;
  }
  else {
    lVar10 = func_0x006115d0(lVar10 << 3);
    unaff_x19[0x11] = lVar10;
    lVar3 = *(long *)(unaff_x20 + 0x18);
    if (lVar10 == lVar3) goto LAB_00679cb8;
  }
  _memcpy(lVar10,lVar3,unaff_x19[0x10] << 3);
LAB_00679cb8:
  uStack0000000000000008 = (undefined *)(unaff_x23 + 0x10);
  uVar5 = in_stack_00000048;
  if (in_stack_00000050 <= in_stack_00000048) {
    uVar5 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000008 = &UNK_00a00d18;
  uVar5 = in_stack_00000028;
  if (in_stack_00000030 <= in_stack_00000028) {
    uVar5 = in_stack_00000030;
  }
  if (in_stack_00000038 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000038 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  lVar3 = 0;
  *unaff_x19 = &UNK_00a0f0e0;
  lVar10 = *(long *)(unaff_x20 + 0x10);
  iVar8 = (int)lVar10;
  iVar4 = iVar8 * -0x40 + 1;
  do {
    if (lVar10 + lVar3 == 0) goto LAB_00679dac;
    lVar1 = lVar3 * 8;
    iVar4 = iVar4 + 0x40;
    lVar3 = lVar3 + -1;
  } while (*(long *)(*(long *)(unaff_x20 + 0x18) + lVar10 * 8 + -8 + lVar1) == 0);
  if (iVar8 + (int)lVar3 == -1) {
LAB_00679dac:
    iVar4 = -1;
  }
  else {
    uVar5 = *(ulong *)(*(long *)(unaff_x20 + 0x18) + (ulong)(uint)(iVar8 + (int)lVar3) * 8);
    if (uVar5 == 0) {
      uVar7 = 0;
    }
    else {
      uVar9 = 0;
      uVar6 = 0x40;
      do {
        uVar2 = uVar9 + uVar6 >> 1;
        uVar7 = uVar2;
        if (uVar5 >> ((ulong)uVar2 & 0x3f) != 0) {
          uVar7 = uVar6;
          uVar9 = uVar2;
        }
        uVar6 = uVar7;
      } while (1 < uVar7 - uVar9);
    }
    iVar4 = uVar7 - iVar4;
  }
  *(int *)(unaff_x19 + 0x12) = iVar4;
  return;
}

