/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f5f4
 */

int EC_KEY_set_private_key(EC_KEY *key,BIGNUM *prv)

{
  int iVar1;
  long lVar2;
  BIGNUM *a;
  
  if (*(long **)(key + 0x18) == (long *)0x0) {
    return 0;
  }
  if (**(long **)(key + 0x18) != 0) {
    lVar2 = EC_GROUP_get0_order();
    if (lVar2 == 0) {
      return 0;
    }
    iVar1 = BN_is_zero();
    if (iVar1 != 0) {
      return 0;
    }
    if ((*(code **)(**(long **)(key + 0x18) + 0x140) != (code *)0x0) &&
       (iVar1 = (**(code **)(**(long **)(key + 0x18) + 0x140))(key,prv), iVar1 == 0)) {
      return 0;
    }
    if ((*(code **)(*(long *)key + 0x30) != (code *)0x0) &&
       (iVar1 = (**(code **)(*(long *)key + 0x30))(key,prv), iVar1 == 0)) {
      return 0;
    }
    if (prv == (BIGNUM *)0x0) {
      BN_clear_free(*(BIGNUM **)(key + 0x28));
      *(undefined8 *)(key + 0x28) = 0;
      return 0;
    }
    a = BN_dup(prv);
    if (a == (BIGNUM *)0x0) {
      return 0;
    }
    BN_set_flags(a,4);
    iVar1 = bn_get_top(lVar2);
    lVar2 = bn_wexpand(a,iVar1 + 2);
    if (lVar2 != 0) {
      BN_clear_free(*(BIGNUM **)(key + 0x28));
      *(BIGNUM **)(key + 0x28) = a;
      *(long *)(key + 0x68) = *(long *)(key + 0x68) + 1;
      return 1;
    }
    BN_clear_free(a);
  }
  return 0;
}

