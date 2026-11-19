/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30360
 */

void EC_GROUP_free(EC_GROUP *group)

{
  long *ptr;
  
  if (group == (EC_GROUP *)0x0) {
    return;
  }
  if (*(code **)(*(long *)group + 0x10) != (code *)0x0) {
    (**(code **)(*(long *)group + 0x10))(group);
  }
  if (*(int *)(group + 0x98) == 5) {
    EC_ec_pre_comp_free(*(undefined8 *)(group + 0xa0));
  }
  *(undefined8 *)(group + 0xa0) = 0;
  BN_MONT_CTX_free(*(BN_MONT_CTX **)(group + 0x90));
  ptr = *(long **)(group + 8);
  if (ptr != (long *)0x0) {
    if (*(code **)(*ptr + 0x58) != (code *)0x0) {
      (**(code **)(*ptr + 0x58))(ptr);
    }
    CRYPTO_free(ptr);
  }
  BN_free(*(BIGNUM **)(group + 0x10));
  BN_free(*(BIGNUM **)(group + 0x18));
  CRYPTO_free(*(void **)(group + 0x30));
  CRYPTO_free(*(void **)(group + 0xb0));
  CRYPTO_free(group);
  return;
}

