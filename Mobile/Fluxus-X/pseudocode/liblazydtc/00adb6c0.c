/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adb6c0
 */

undefined4 ossl_rsa_sp800_56b_generate_key(long param_1,undefined4 param_2,BIGNUM *param_3)

{
  undefined8 uVar1;
  int iVar2;
  undefined4 uVar3;
  long lVar4;
  BN_CTX *c;
  BIGNUM *a;
  
  ossl_ifc_ffc_compute_security_bits(param_2);
  lVar4 = RAND_get0_private(*(undefined8 *)(param_1 + 8));
  if ((lVar4 == 0) ||
     (c = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 8)), c == (BN_CTX *)0x0)) {
    return 0;
  }
  a = param_3;
  if ((param_3 == (BIGNUM *)0x0) &&
     ((a = BN_new(), a == (BIGNUM *)0x0 || (iVar2 = BN_set_word(a,0x10001), iVar2 == 0)))) {
    uVar3 = 0;
  }
  else {
    do {
      iVar2 = ossl_rsa_fips186_4_gen_prob_primes(param_1);
      if (iVar2 == 0) {
LAB_00adb77c:
        uVar3 = 0;
        goto joined_r0x00adb780;
      }
      iVar2 = BN_cmp(*(BIGNUM **)(param_1 + 0x40),*(BIGNUM **)(param_1 + 0x48));
      if (iVar2 < 0) {
        uVar1 = *(undefined8 *)(param_1 + 0x40);
        *(undefined8 *)(param_1 + 0x40) = *(undefined8 *)(param_1 + 0x48);
        *(undefined8 *)(param_1 + 0x48) = uVar1;
      }
      iVar2 = ossl_rsa_sp800_56b_derive_params_from_pq(param_1,param_2,a,c);
      if (iVar2 < 0) goto LAB_00adb77c;
    } while (iVar2 == 0);
    uVar3 = ossl_rsa_sp800_56b_pairwise_test(param_1,c);
joined_r0x00adb780:
    if (param_3 != (BIGNUM *)0x0) goto LAB_00adb7b0;
  }
  BN_free(a);
LAB_00adb7b0:
  BN_CTX_free(c);
  return uVar3;
}

