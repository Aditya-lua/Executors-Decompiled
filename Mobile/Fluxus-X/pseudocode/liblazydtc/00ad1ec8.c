/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1ec8
 */

uint RSA_get_multi_prime_extra_count(long param_1)

{
  uint uVar1;
  
  uVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
  return uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
}

