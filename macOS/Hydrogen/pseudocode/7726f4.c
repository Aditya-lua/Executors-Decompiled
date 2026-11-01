
undefined8 FUN_007726f4(void)

{
  uint *puVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 in_w8;
  byte bVar4;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w22;
  long unaff_x23;
  long in_stack_00000008;
  
  *(undefined1 *)(unaff_x23 + 0x41c) = in_w8;
  puVar1 = (uint *)(unaff_x19 + 0x1c1);
  if (unaff_x20 == 0) {
    uVar3 = 0;
LAB_007727ec:
    iVar2 = *(int *)(unaff_x19 + 0x968);
  }
  else {
    if ((*(byte *)(unaff_x23 + 0x41c) & 1) == 0) {
      uVar3 = func_0x00772c48();
      if ((int)uVar3 != 0) goto LAB_007727ec;
      unaff_x20 = unaff_x20 - in_stack_00000008;
    }
    if (((*(byte *)puVar1 & 1) != 0) && (unaff_x20 != 0)) {
      *(byte *)(unaff_x23 + 0x41c) = *(byte *)(unaff_x23 + 0x41c) | 1;
      uVar3 = func_0x007564dc();
      if ((int)uVar3 != 0) goto LAB_007727ec;
      unaff_x20 = unaff_x20 - in_stack_00000008;
      bVar4 = *(byte *)(unaff_x23 + 0x41c);
      if ((*(byte *)puVar1 & 1) == 0) {
        bVar4 = bVar4 & 0xfe;
        *(byte *)(unaff_x23 + 0x41c) = bVar4;
      }
      if ((bVar4 & 1) == 0) {
        if (*(long *)(unaff_x19 + 0xe8) < 0) {
          *(undefined8 *)(unaff_x19 + 0xe8) = 0;
          *puVar1 = *puVar1 | 8;
        }
        uVar3 = func_0x00772c48();
        if ((int)uVar3 != 0) goto LAB_007727ec;
        unaff_x20 = unaff_x20 - in_stack_00000008;
      }
    }
    if (*(int *)(unaff_x23 + 0x418) != 0) {
      *puVar1 = *puVar1 & 0xfffffffd;
    }
    if (((unaff_w22 & 1) == 0) && (unaff_x20 == 0)) {
      uVar3 = 0;
      iVar2 = *(int *)(unaff_x19 + 0x968);
    }
    else {
      uVar3 = func_0x007738a0();
      iVar2 = *(int *)(unaff_x19 + 0x968);
    }
  }
  if ((iVar2 == 0xb) && (*(int *)(unaff_x23 + 0x418) == 0)) {
    *puVar1 = *puVar1 | 8;
    return uVar3;
  }
  return uVar3;
}

