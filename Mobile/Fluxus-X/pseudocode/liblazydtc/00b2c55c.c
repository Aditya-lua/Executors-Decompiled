/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2c55c
 */

undefined8 FUN_00b2c55c(long param_1,undefined8 param_2)

{
  code *pcVar1;
  
  ossl_sm4_set_key(param_2,param_1 + 0xc0);
  *(long *)(param_1 + 0xb0) = param_1 + 0xc0;
  pcVar1 = ossl_sm4_encrypt;
  if (((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) &&
     (pcVar1 = ossl_sm4_decrypt, 1 < *(int *)(param_1 + 0x40) - 1U)) {
    pcVar1 = ossl_sm4_encrypt;
  }
  *(code **)(param_1 + 0x30) = pcVar1;
  return 1;
}

