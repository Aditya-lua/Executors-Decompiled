/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b29ea0
 */

undefined8 FUN_00b29ea0(long param_1,uchar *param_2,int param_3)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  code *pcVar4;
  code *pcVar5;
  
  iVar1 = *(int *)(param_1 + 0x40);
  *(CAMELLIA_KEY **)(param_1 + 0xb0) = (CAMELLIA_KEY *)(param_1 + 0xc0);
  iVar2 = Camellia_set_key(param_2,param_3 << 3,(CAMELLIA_KEY *)(param_1 + 0xc0));
  if (iVar2 < 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/cipher_camellia_hw.c",0x1e,
                  "cipher_hw_camellia_initkey");
    ERR_set_error(0x39,0x65,0);
    uVar3 = 0;
  }
  else {
    if ((iVar1 - 1U < 2) && ((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0)) {
      pcVar4 = Camellia_decrypt;
    }
    else {
      pcVar4 = Camellia_encrypt;
    }
    pcVar5 = Camellia_cbc_encrypt;
    uVar3 = 1;
    if (iVar1 != 2) {
      pcVar5 = (code *)0x0;
    }
    *(code **)(param_1 + 0x30) = pcVar4;
    *(code **)(param_1 + 0x38) = pcVar5;
  }
  return uVar3;
}

