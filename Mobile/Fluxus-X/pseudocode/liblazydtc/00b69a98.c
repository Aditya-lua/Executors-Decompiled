/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69a98
 */

undefined ** mbedtls_cipher_info_from_string(char *param_1)

{
  int iVar1;
  undefined **ppuVar2;
  undefined **ppuVar3;
  
  if (param_1 != (char *)0x0) {
    ppuVar2 = &PTR_s_AES_128_ECB_00ca7dd8;
    ppuVar3 = &PTR_PTR_00ca72c0;
    do {
      iVar1 = strcmp(*ppuVar2,param_1);
      if (iVar1 == 0) {
        return ppuVar2;
      }
      ppuVar2 = (undefined **)*ppuVar3;
      ppuVar3 = ppuVar3 + 2;
    } while (ppuVar2 != (undefined **)0x0);
  }
  return (undefined **)0x0;
}

