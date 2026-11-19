/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5a4c
 */

long ssl_get_ciphers_by_id(long param_1)

{
  long lVar1;
  
  if ((param_1 == 0) ||
     ((lVar1 = *(long *)(param_1 + 0x530), lVar1 == 0 &&
      ((*(long *)(param_1 + 0x9a8) == 0 ||
       (lVar1 = *(long *)(*(long *)(param_1 + 0x9a8) + 0x18), lVar1 == 0)))))) {
    return 0;
  }
  return lVar1;
}

