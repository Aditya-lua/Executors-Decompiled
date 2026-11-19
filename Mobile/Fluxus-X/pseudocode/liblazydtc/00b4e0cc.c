/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e0cc
 */

ulong ossl_dsa_check_pairwise(long param_1)

{
  int iVar1;
  ulong uVar2;
  BN_CTX *c;
  BIGNUM *a;
  uint local_24;
  
  local_24 = 0;
  uVar2 = FUN_00b4ded4(param_1,&local_24);
  if ((int)uVar2 != 0) {
    if (((*(long *)(param_1 + 0x18) == 0) || (*(long *)(param_1 + 0x70) == 0)) ||
       (*(long *)(param_1 + 0x68) == 0)) {
      uVar2 = 0;
    }
    else {
      c = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xb8));
      if (c == (BN_CTX *)0x0) {
        a = (BIGNUM *)0x0;
      }
      else {
        a = BN_new();
        if ((a != (BIGNUM *)0x0) &&
           (iVar1 = ossl_dsa_generate_public_key(c,param_1,*(undefined8 *)(param_1 + 0x70),a),
           iVar1 != 0)) {
          iVar1 = BN_cmp(a,*(BIGNUM **)(param_1 + 0x68));
          local_24 = (uint)(iVar1 == 0);
        }
      }
      BN_free(a);
      BN_CTX_free(c);
      uVar2 = (ulong)local_24;
    }
  }
  return uVar2;
}

