
undefined8 FUN_00463018(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 *puVar3;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000060;
  undefined1 *puStack0000000000000070;
  undefined8 uStack0000000000000080;
  
  uStack0000000000000080 = 0;
  puStack0000000000000070 = &uStack0000000000000040;
  iVar1 = func_0x0046849c(&uStack0000000000000010,&UNK_009e0660,&uStack0000000000000060);
  if (iVar1 == 0) {
    puVar3 = uStack0000000000000010;
    if (uStack0000000000000010 < segment_command_00000020.segname) {
      uVar2 = func_0x00468ab4();
      return uVar2;
    }
  }
  else {
    puVar3 = &uStack0000000000000060;
    func_0x007a2810(&UNK_00893dde,0x2b,puVar3,&UNK_009e04d0,&UNK_009e0210);
  }
  uVar2 = func_0x007a28b0(puVar3,0x27,&UNK_009e01f8);
  func_0x007a28a4(uVar2,8,&UNK_009e0238);
  return 0;
}

