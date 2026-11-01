
undefined8 FUN_00772704(ulong param_1)

{
  int iVar1;
  undefined8 uVar2;
  byte bVar3;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w22;
  long unaff_x23;
  uint *unaff_x24;
  long in_stack_00000008;
  
  if ((param_1 & 1) == 0) {
    uVar2 = func_0x00772c48();
    if ((int)uVar2 == 0) {
      unaff_x20 = unaff_x20 - in_stack_00000008;
      goto LAB_0077272c;
    }
LAB_007727ec:
    iVar1 = *(int *)(unaff_x19 + 0x968);
  }
  else {
LAB_0077272c:
    if (((*unaff_x24 & 1) != 0) && (unaff_x20 != 0)) {
      *(byte *)(unaff_x23 + 0x41c) = *(byte *)(unaff_x23 + 0x41c) | 1;
      uVar2 = func_0x007564dc();
      if ((int)uVar2 != 0) goto LAB_007727ec;
      unaff_x20 = unaff_x20 - in_stack_00000008;
      bVar3 = *(byte *)(unaff_x23 + 0x41c);
      if ((*unaff_x24 & 1) == 0) {
        bVar3 = bVar3 & 0xfe;
        *(byte *)(unaff_x23 + 0x41c) = bVar3;
      }
      if ((bVar3 & 1) == 0) {
        if (*(long *)(unaff_x19 + 0xe8) < 0) {
          *(undefined8 *)(unaff_x19 + 0xe8) = 0;
          *unaff_x24 = *unaff_x24 | 8;
        }
        uVar2 = func_0x00772c48();
        if ((int)uVar2 != 0) goto LAB_007727ec;
        unaff_x20 = unaff_x20 - in_stack_00000008;
      }
    }
    if (*(int *)(unaff_x23 + 0x418) != 0) {
      *unaff_x24 = *unaff_x24 & 0xfffffffd;
    }
    if (((unaff_w22 & 1) == 0) && (unaff_x20 == 0)) {
      uVar2 = 0;
      iVar1 = *(int *)(unaff_x19 + 0x968);
    }
    else {
      uVar2 = func_0x007738a0();
      iVar1 = *(int *)(unaff_x19 + 0x968);
    }
  }
  if ((iVar1 == 0xb) && (*(int *)(unaff_x23 + 0x418) == 0)) {
    *unaff_x24 = *unaff_x24 | 8;
    return uVar2;
  }
  return uVar2;
}

