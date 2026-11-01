
void FUN_00608c7c(long param_1)

{
  int iVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long unaff_x20;
  long unaff_x21;
  uint unaff_w23;
  long unaff_x24;
  ulong uVar5;
  int unaff_w25;
  int unaff_w26;
  uint unaff_w27;
  int unaff_w28;
  int in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000028;
  
  *(long *)(in_stack_00000028 + 0x18) = unaff_x24;
  *(long *)(in_stack_00000028 + 0x20) = param_1;
  if (param_1 != 0) {
    _bzero(param_1,unaff_x24 << 3);
  }
  *(undefined8 *)(in_stack_00000028 + 0x10) = 0x1fffffffffffffff;
  *(undefined4 *)(in_stack_00000028 + 0x28) = 0;
  iVar2 = (unaff_w28 + (unaff_w23 & 1)) * 3;
  iVar1 = iVar2 + unaff_w25 + (unaff_w27 & 1) + unaff_w26;
  uVar5 = (ulong)(iVar2 + unaff_w25 + (unaff_w27 & 1) + unaff_w26 + 6);
  func_0x006108a0(uVar5);
  if (iVar1 == -6) {
    lVar3 = 0;
  }
  else {
    lVar3 = func_0x006115d0(uVar5 << 3);
  }
  func_0x005fcef8(*(undefined8 *)(unaff_x21 + 0x20),*(undefined8 *)(in_stack_00000028 + 0x20),lVar3,
                  *(undefined8 *)(unaff_x20 + 0x20),in_stack_00000008 + unaff_w26,
                  *(undefined8 *)(in_stack_00000018 + 0x20),in_stack_00000010);
  if (lVar3 != 0) {
    if (iVar1 != -6) {
      lVar4 = (ulong)((unaff_w28 + (unaff_w23 & 1)) * 3 + unaff_w25 + (unaff_w27 & 1) + unaff_w26 +
                     6) << 3;
      do {
        *(undefined8 *)(lVar3 + -8 + lVar4) = 0;
        lVar4 = lVar4 + -8;
      } while (lVar4 != 0);
    }
    func_0x00611644(lVar3);
  }
  return;
}

