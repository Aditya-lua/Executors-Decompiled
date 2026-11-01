
undefined * FUN_0042a6f4(void)

{
  int iVar1;
  undefined *puVar2;
  uint *puVar3;
  long unaff_x19;
  long unaff_x22;
  long unaff_x29;
  undefined1 uStack00000000000001b8;
  
  _memcpy();
  *(undefined1 *)(unaff_x22 + unaff_x19) = 0;
  func_0x00462a54(unaff_x29 + -0x48,&uStack00000000000001b8,unaff_x19 + 1);
  if ((*(uint *)(unaff_x29 + -0x48) & 1) == 0) {
    iVar1 = _linkat(0xfffffffe);
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

