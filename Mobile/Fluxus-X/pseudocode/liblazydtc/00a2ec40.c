/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2ec40
 */

int ossl_ec_key_simple_generate_public_key(long param_1)

{
  int iVar1;
  BN_CTX *ctx;
  
  ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0x58));
  if (ctx == (BN_CTX *)0x0) {
    iVar1 = 0;
  }
  else {
    iVar1 = EC_POINT_mul(*(EC_GROUP **)(param_1 + 0x18),*(EC_POINT **)(param_1 + 0x20),
                         *(BIGNUM **)(param_1 + 0x28),(EC_POINT *)0x0,(BIGNUM *)0x0,ctx);
    BN_CTX_free(ctx);
    if (iVar1 == 1) {
      *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 1;
    }
  }
  return iVar1;
}

