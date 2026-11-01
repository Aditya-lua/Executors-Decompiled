
long FUN_0057f230(long *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  code *pcVar2;
  long lVar3;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  uStack0000000000000008 = param_2[1];
  uStack0000000000000000 = *param_2;
  uStack0000000000000010 = param_2[2];
  uStack0000000000000018 = 0xffffffffffffffff;
  lVar3 = param_1[2];
  if ((int)lVar3 == -1) {
    func_0x007a247c(&UNK_008acce2,0x58,&UNK_009f05b8);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x57f2bc);
    (*pcVar2)();
  }
  if (lVar3 == *param_1) {
    func_0x00582c4c(param_1,&UNK_009f05d0);
  }
  puVar1 = (undefined8 *)(param_1[1] + lVar3 * 0x20);
  puVar1[1] = uStack0000000000000008;
  *puVar1 = uStack0000000000000000;
  puVar1[3] = uStack0000000000000018;
  puVar1[2] = uStack0000000000000010;
  param_1[2] = lVar3 + 1;
  return lVar3;
}

