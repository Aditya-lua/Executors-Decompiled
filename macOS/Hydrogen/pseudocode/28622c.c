
undefined *
FUN_0028622c(undefined *param_1,undefined8 param_2,ulong param_3,long param_4,ulong param_5,
            undefined8 param_6,byte *param_7)

{
  bool in_ZR;
  byte *pbVar1;
  undefined *puVar2;
  undefined1 auVar3 [16];
  long lStack_1a0;
  long lStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined1 auStack_180 [296];
  long lStack_58;
  
  if (in_ZR) {
    return param_1;
  }
  auVar3 = ___stack_chk_fail();
  pbVar1 = auVar3._0_8_;
  lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x002f51d0(auStack_180,param_6);
  func_0x002f52c0(auStack_180,param_4,param_5 & 0xfffffffffffffff0);
  if ((param_5 & 0xf) != 0) {
    uStack_190 = 0;
    uStack_188 = 0;
    ___memcpy_chk(&uStack_190,param_4 + (param_5 & 0xfffffffffffffff0),param_5 & 0xf,0x10);
    func_0x002f52c0(auStack_180,&uStack_190,0x10);
  }
  func_0x002f52c0(auStack_180,auVar3._8_8_,param_3 & 0xfffffffffffffff0);
  if ((param_3 & 0xf) != 0) {
    uStack_190 = 0;
    uStack_188 = 0;
    ___memcpy_chk(&uStack_190,auVar3._8_8_ + (param_3 & 0xfffffffffffffff0),param_3 & 0xf,0x10);
    func_0x002f52c0(auStack_180,&uStack_190,0x10);
  }
  lStack_1a0 = param_5 << 3;
  lStack_198 = param_3 << 3;
  func_0x002f52c0(auStack_180,&lStack_1a0,0x10);
  puVar2 = (undefined *)func_0x002f53b8(auStack_180,pbVar1);
  *pbVar1 = *pbVar1 ^ *param_7;
  pbVar1[1] = pbVar1[1] ^ param_7[1];
  pbVar1[2] = pbVar1[2] ^ param_7[2];
  pbVar1[3] = pbVar1[3] ^ param_7[3];
  pbVar1[4] = pbVar1[4] ^ param_7[4];
  pbVar1[5] = pbVar1[5] ^ param_7[5];
  pbVar1[6] = pbVar1[6] ^ param_7[6];
  pbVar1[7] = pbVar1[7] ^ param_7[7];
  pbVar1[8] = pbVar1[8] ^ param_7[8];
  pbVar1[9] = pbVar1[9] ^ param_7[9];
  pbVar1[10] = pbVar1[10] ^ param_7[10];
  pbVar1[0xb] = pbVar1[0xb] ^ param_7[0xb];
  pbVar1[0xf] = pbVar1[0xf] & 0x7f;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
    return puVar2;
  }
  ___stack_chk_fail();
  return &UNK_009cde48;
}

