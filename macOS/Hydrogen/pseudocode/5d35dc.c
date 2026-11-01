
void FUN_005d35dc(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  code *pcVar3;
  int iVar4;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined *puStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  _uStack0000000000000008 = 0;
  uStack0000000000000010 = 1;
  uStack0000000000000030 = 0xe0000020;
  _uStack0000000000000020 = &uStack0000000000000008;
  uStack0000000000000018 = 0;
  puStack0000000000000028 = &UNK_009f2c78;
  iVar4 = func_0x005af9d0(param_1,&uStack0000000000000020);
  uVar2 = uStack0000000000000010;
  lVar1 = _uStack0000000000000008;
  if (iVar4 != 0) {
    func_0x007a2810(&UNK_008b5ba0,0x37,unaff_x29 + -0x21,&UNK_009f2cd8,&UNK_009f2ca8);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x5d367c);
    (*pcVar3)();
  }
  func_0x005d2594(param_2,uStack0000000000000010,uStack0000000000000018);
  if (lVar1 != 0) {
    func_0x00187bd4(uVar2,lVar1,1);
  }
  return;
}

