/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f9d4
 */

uint HMAC_size(undefined8 *param_1)

{
  uint uVar1;
  
  uVar1 = EVP_MD_get_size(*param_1);
  return uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
}

