/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a309f0
 */

EC_GROUP * EC_GROUP_dup(EC_GROUP *src)

{
  int iVar1;
  EC_GROUP *dst;
  
  if (src != (EC_GROUP *)0x0) {
    dst = (EC_GROUP *)
          ossl_ec_group_new_ex
                    (*(undefined8 *)(src + 0xa8),*(undefined8 *)(src + 0xb0),*(undefined8 *)src);
    if (dst == (EC_GROUP *)0x0) {
      return (EC_GROUP *)0x0;
    }
    iVar1 = EC_GROUP_copy(dst,src);
    if (iVar1 != 0) {
      return dst;
    }
    EC_GROUP_free(dst);
  }
  return (EC_GROUP *)0x0;
}

