/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6f40c
 */

undefined8
mbedtls_aes_crypt_ofb
          (undefined8 param_1,long param_2,ulong *param_3,long param_4,byte *param_5,byte *param_6)

{
  byte *pbVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  uVar3 = *param_3;
  if (uVar3 < 0x10) {
    while (param_2 != 0) {
      param_2 = param_2 + -1;
      if (uVar3 == 0) {
        mbedtls_internal_aes_encrypt(param_1,param_4,param_4);
      }
      pbVar1 = (byte *)(param_4 + uVar3);
      uVar3 = (ulong)((int)uVar3 + 1) & 0xf;
      *param_6 = *pbVar1 ^ *param_5;
      param_6 = param_6 + 1;
      param_5 = param_5 + 1;
    }
    uVar2 = 0;
    *param_3 = uVar3;
  }
  else {
    uVar2 = 0xffffffdf;
  }
  return uVar2;
}

