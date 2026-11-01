
undefined * FUN_004329c0(undefined8 param_1)

{
  int iVar1;
  undefined *puVar2;
  uint *puVar3;
  long unaff_x19;
  long unaff_x29;
  
  func_0x00462a54(param_1,unaff_x19 + 1);
  if ((*(uint *)(unaff_x29 + -0x38) & 1) == 0) {
    iVar1 = _chroot(*(undefined8 *)(unaff_x29 + -0x30));
    if (iVar1 == -1) {
      puVar3 = (uint *)___error();
      puVar2 = (undefined *)((ulong)*puVar3 << 0x20 | 2);
    }
    else {
      puVar2 = (undefined *)0x0;
    }
  }
  else {
    puVar2 = &UNK_009dae48;
  }
  return puVar2;
}

