
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_003007d4(undefined8 param_1,undefined8 param_2,undefined8 *param_3,long param_4)

{
  undefined1 *puVar1;
  int iVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000090;
  undefined8 uStack0000000000000098;
  undefined8 uStack00000000000000a0;
  undefined8 uStack00000000000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 uStack00000000000000b8;
  undefined8 uStack00000000000000c0;
  long lStack00000000000000c8;
  long lStack00000000000000d0;
  long lStack00000000000000d8;
  undefined1 uStack00000000000000df;
  undefined1 uStack00000000000000e0;
  undefined1 uStack0000000000000188;
  char cStack0000000000000189;
  long lStack0000000000000198;
  
  lStack0000000000000198 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack00000000000000c0 = 0;
  uStack00000000000000a8 = 0;
  uStack00000000000000a0 = 0;
  uStack00000000000000b8 = 0;
  uStack00000000000000b0 = 0;
  uStack0000000000000088 = 0;
  uStack0000000000000080 = 0;
  uStack0000000000000098 = 0;
  uStack0000000000000090 = 0;
  uStack0000000000000068 = 0;
  uStack0000000000000060 = 0;
  uStack0000000000000078 = 0;
  uStack0000000000000070 = 0;
  uStack0000000000000048 = 0;
  uStack0000000000000040 = 0;
  uStack0000000000000058 = 0;
  uStack0000000000000050 = 0;
  uStack0000000000000028 = 0;
  uStack0000000000000020 = 0;
  uStack0000000000000038 = 0;
  uStack0000000000000030 = 0;
  uStack0000000000000008 = 0;
  uStack0000000000000000 = 0;
  uStack0000000000000018 = 0;
  uStack0000000000000010 = 0;
  lStack00000000000000d8 = 0;
  lStack00000000000000d0 = _UNK_0082fc88;
  lStack00000000000000c8 = _UNK_0082fc80;
  _uStack0000000000000188 = 0x1f;
  iVar2 = func_0x002f21c0();
  lVar3 = lStack00000000000000c8;
  if (iVar2 == 0) {
LAB_003008c8:
    param_3 = (undefined8 *)0x0;
  }
  else {
    lStack00000000000000d0 = param_4;
    if (param_4 == 0) goto LAB_003008cc;
    if (cStack0000000000000189 == '\0') {
      puVar1 = &uStack00000000000000e0 + lStack00000000000000d8;
      _bzero(puVar1,lStack00000000000000c8 - lStack00000000000000d8);
      *puVar1 = uStack0000000000000188;
      (&uStack00000000000000df)[lVar3] = (&uStack00000000000000df)[lVar3] | 0x80;
      lVar3 = func_0x00383c00();
      if (lVar3 != 0) goto LAB_003008c8;
    }
    func_0x00383e60();
    _uStack0000000000000188 = CONCAT11(1,uStack0000000000000188);
  }
LAB_003008cc:
  func_0x0036e464();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000198) {
    return param_3;
  }
  puVar4 = (undefined8 *)___stack_chk_fail();
  puVar4[0x18] = 0;
  puVar4[0x15] = 0;
  puVar4[0x14] = 0;
  puVar4[0x17] = 0;
  puVar4[0x16] = 0;
  puVar4[0x11] = 0;
  puVar4[0x10] = 0;
  puVar4[0x13] = 0;
  puVar4[0x12] = 0;
  puVar4[0xd] = 0;
  puVar4[0xc] = 0;
  puVar4[0xf] = 0;
  puVar4[0xe] = 0;
  puVar4[9] = 0;
  puVar4[8] = 0;
  puVar4[0xb] = 0;
  puVar4[10] = 0;
  puVar4[5] = 0;
  puVar4[4] = 0;
  puVar4[7] = 0;
  puVar4[6] = 0;
  puVar4[1] = 0;
  *puVar4 = 0;
  puVar4[3] = 0;
  puVar4[2] = 0;
  puVar4[0x1b] = 0;
  *(undefined1 *)((long)puVar4 + 0x189) = 0;
  return puVar4;
}

