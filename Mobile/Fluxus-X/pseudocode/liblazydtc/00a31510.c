/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31510
 */

EC_POINT * EC_POINT_dup(EC_POINT *src,EC_GROUP *group)

{
  int iVar1;
  EC_POINT *dst;
  
  if (src != (EC_POINT *)0x0) {
    dst = EC_POINT_new(group);
    if (dst == (EC_POINT *)0x0) {
      return (EC_POINT *)0x0;
    }
    iVar1 = EC_POINT_copy(dst,src);
    if (iVar1 != 0) {
      return dst;
    }
    if (*(code **)(*(long *)dst + 0x58) != (code *)0x0) {
      (**(code **)(*(long *)dst + 0x58))(dst);
    }
    CRYPTO_free(dst);
  }
  return (EC_POINT *)0x0;
}

