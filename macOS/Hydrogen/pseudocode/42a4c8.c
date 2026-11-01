
undefined * FUN_0042a4c8(undefined8 param_1)

{
  int iVar1;
  undefined *puVar2;
  uint *puVar3;
  ulong unaff_x19;
  long unaff_x29;
  undefined8 uStack00000000000001b0;
  undefined1 uStack00000000000001b8;
  
  uStack00000000000001b0 = param_1;
  if (unaff_x19 < 0x180) {
    _memcpy(&uStack00000000000001b8);
    (&uStack00000000000001b8)[unaff_x19] = 0;
    func_0x00462a54(unaff_x29 + -0x48,&uStack00000000000001b8,unaff_x19 + 1);
    if ((*(uint *)(unaff_x29 + -0x48) & 1) == 0) {
      iVar1 = _symlink();
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
  }
  else {
    puVar2 = (undefined *)func_0x007a0e0c();
  }
  return puVar2;
}

