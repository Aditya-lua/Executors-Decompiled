/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1a3b4
 */

bool ossl_dh_check_pairwise(long param_1)

{
  bool bVar1;
  int iVar2;
  BN_CTX *c;
  BIGNUM *a;
  
  if ((((*(long *)(param_1 + 8) == 0) || (*(long *)(param_1 + 0x18) == 0)) ||
      (*(long *)(param_1 + 0x78) == 0)) || (*(long *)(param_1 + 0x70) == 0)) {
    bVar1 = false;
  }
  else {
    c = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xb0));
    if (c == (BN_CTX *)0x0) {
      bVar1 = false;
      a = (BIGNUM *)0x0;
    }
    else {
      a = BN_new();
      if ((a == (BIGNUM *)0x0) ||
         (iVar2 = ossl_dh_generate_public_key(c,param_1,*(undefined8 *)(param_1 + 0x78),a),
         iVar2 == 0)) {
        bVar1 = false;
      }
      else {
        iVar2 = BN_cmp(a,*(BIGNUM **)(param_1 + 0x70));
        bVar1 = iVar2 == 0;
      }
    }
    BN_free(a);
    BN_CTX_free(c);
  }
  return bVar1;
}

