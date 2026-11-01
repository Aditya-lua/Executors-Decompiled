
undefined * FUN_004328a4(void)

{
  int iVar1;
  undefined *puVar2;
  uint *puVar3;
  long unaff_x19;
  long unaff_x29;
  undefined4 uStack0000000000000000;
  undefined4 uStack0000000000000004;
  undefined1 uStack0000000000000018;
  
  _memcpy(&uStack0000000000000018);
  (&uStack0000000000000018)[unaff_x19] = 0;
  func_0x00462a54(unaff_x29 + -0x38,&uStack0000000000000018,unaff_x19 + 1);
  if ((*(uint *)(unaff_x29 + -0x38) & 1) == 0) {
    iVar1 = _lchown(*(undefined8 *)(unaff_x29 + -0x30),uStack0000000000000000,uStack0000000000000004
                   );
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

