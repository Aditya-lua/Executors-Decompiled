/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1aac
 */

undefined2 RSA_security_bits(long param_1)

{
  undefined2 uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  
  iVar2 = BN_num_bits(*(BIGNUM **)(param_1 + 0x28));
  if (*(int *)(param_1 + 0x10) == 1) {
    iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
    if (iVar3 < 1) {
      return 0;
    }
    iVar4 = ossl_rsa_multip_cap(iVar2);
    if (iVar4 < iVar3 + 2) {
      return 0;
    }
  }
  uVar1 = ossl_ifc_ffc_compute_security_bits(iVar2);
  return uVar1;
}

