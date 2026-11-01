
void FUN_004e9988(undefined8 *param_1,undefined8 param_2)

{
  code *pcVar1;
  int iVar2;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined *puStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack000000000000003f;
  
  _uStack0000000000000008 = 0;
  uStack0000000000000010 = 1;
  uStack0000000000000030 = 0xe0000020;
  _uStack0000000000000020 = &uStack0000000000000008;
  uStack0000000000000018 = 0;
  puStack0000000000000028 = &UNK_009e8008;
  iVar2 = func_0x0050f9f0(param_2,&uStack0000000000000020);
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_008a36e0,0x37,&uStack000000000000003f,&UNK_009e8068,&UNK_009e8038);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4e9a18);
    (*pcVar1)();
  }
  param_1[1] = uStack0000000000000010;
  *param_1 = _uStack0000000000000008;
  param_1[2] = uStack0000000000000018;
  return;
}

