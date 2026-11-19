/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0c08
 */

uint ossl_gost18_cke_cipher_nid(long param_1)

{
  uint uVar1;
  
  uVar1 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x24);
  if ((uVar1 >> 0x16 & 1) == 0) {
    return (int)(uVar1 << 8) >> 0x1f & 0x3f5;
  }
  return 0x4a4;
}

