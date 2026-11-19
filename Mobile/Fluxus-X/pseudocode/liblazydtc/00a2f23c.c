/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f23c
 */

undefined8 ossl_ec_key_simple_check_key(long param_1)

{
  int iVar1;
  BN_CTX *c;
  undefined8 uVar2;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x242,"ossl_ec_key_simple_check_key");
    ERR_set_error(0x10,0xc0102,0);
    uVar2 = 0;
  }
  else {
    c = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0x58));
    if (c == (BN_CTX *)0x0) {
      uVar2 = 0;
    }
    else {
      iVar1 = ossl_ec_key_public_check(param_1,c);
      if ((iVar1 == 0) ||
         ((*(long *)(param_1 + 0x28) != 0 &&
          ((iVar1 = ossl_ec_key_private_check(param_1), iVar1 == 0 ||
           (iVar1 = ossl_ec_key_pairwise_check(param_1,c), iVar1 == 0)))))) {
        uVar2 = 0;
      }
      else {
        uVar2 = 1;
      }
      BN_CTX_free(c);
    }
  }
  return uVar2;
}

