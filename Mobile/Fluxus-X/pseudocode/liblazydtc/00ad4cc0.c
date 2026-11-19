/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad4cc0
 */

undefined8 FUN_00ad4cc0(long param_1)

{
  int iVar1;
  int iVar2;
  long lVar3;
  
  iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      lVar3 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88),iVar1);
      BN_MONT_CTX_free(*(BN_MONT_CTX **)(lVar3 + 0x20));
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
    } while (iVar1 < iVar2);
  }
  BN_MONT_CTX_free(*(BN_MONT_CTX **)(param_1 + 0xa8));
  BN_MONT_CTX_free(*(BN_MONT_CTX **)(param_1 + 0xb0));
  BN_MONT_CTX_free(*(BN_MONT_CTX **)(param_1 + 0xb8));
  return 1;
}

