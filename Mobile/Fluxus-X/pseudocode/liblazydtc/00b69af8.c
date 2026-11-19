/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69af8
 */

undefined ** mbedtls_cipher_info_from_values(int param_1,uint param_2,uint param_3)

{
  uint uVar1;
  undefined **ppuVar2;
  undefined **ppuVar3;
  
  ppuVar2 = &PTR_s_AES_128_ECB_00ca7dd8;
  ppuVar3 = &PTR_PTR_00ca72c0;
  do {
    uVar1 = *(uint *)(ppuVar2 + 1);
    if ((*(int *)(&mbedtls_cipher_base_lookup_table)[uVar1 >> 0x1a & 0x1f] == param_1 &&
        (uVar1 >> 2 & 0x3c0) == param_2) && (uVar1 >> 0xc & 0xf) == param_3) {
      return ppuVar2;
    }
    ppuVar2 = (undefined **)*ppuVar3;
    ppuVar3 = ppuVar3 + 2;
  } while (ppuVar2 != (undefined **)0x0);
  return (undefined **)0x0;
}

