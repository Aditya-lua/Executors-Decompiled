/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b547f4
 */

ulong FUN_00b547f4(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  
  iVar1 = ossl_prov_is_running();
  if ((iVar1 == 0) || (iVar1 = FUN_00b54a88(param_1,param_4), iVar1 == 0)) {
    return 0;
  }
  if (param_2 == 0) {
    uVar2 = HMAC_Init_ex(*(HMAC_CTX **)(param_1 + 8),(void *)0x0,0,(EVP_MD *)0x0,(ENGINE *)0x0);
    return (ulong)uVar2;
  }
  uVar3 = FUN_00b54bac(param_1,param_2,param_3);
  return uVar3;
}

