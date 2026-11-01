
undefined8 FUN_0028649c(ulong param_1,long param_2,undefined8 *param_3,long param_4,ulong param_5)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  if (param_5 != 0) {
    param_1 = param_5;
  }
  if (0x10 < param_1) {
    func_0x0028f83c(0x1e,0,0x75,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0x59);
    return 0;
  }
  if (param_4 == 0x20) {
    uVar1 = *param_3;
    uVar3 = param_3[3];
    uVar2 = param_3[2];
    *(undefined8 *)(param_2 + 0x10) = param_3[1];
    *(undefined8 *)(param_2 + 8) = uVar1;
    *(undefined8 *)(param_2 + 0x20) = uVar3;
    *(undefined8 *)(param_2 + 0x18) = uVar2;
    *(char *)(param_2 + 0x241) = (char)param_1;
    return 1;
  }
  return 0;
}

