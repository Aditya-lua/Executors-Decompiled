/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69a60
 */

undefined ** mbedtls_cipher_info_from_type(int param_1)

{
  undefined **ppuVar1;
  int *piVar2;
  
  ppuVar1 = &PTR_s_AES_128_ECB_00ca7dd8;
  piVar2 = &mbedtls_cipher_definitions;
  do {
    if (*piVar2 == param_1) {
      return ppuVar1;
    }
    ppuVar1 = *(undefined ***)(piVar2 + 6);
    piVar2 = piVar2 + 4;
  } while (ppuVar1 != (undefined **)0x0);
  return (undefined **)0x0;
}

