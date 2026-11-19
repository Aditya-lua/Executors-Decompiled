/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69a08
 */

/* WARNING: Removing unreachable block (ram,0x00b69a40) */

undefined4 * mbedtls_cipher_list(void)

{
  int *piVar1;
  int *piVar3;
  int *piVar2;
  int iVar4;
  
  if ((DAT_00d238c8 & 1) == 0) {
    piVar1 = &mbedtls_cipher_definitions;
    iVar4 = 2;
    piVar2 = &mbedtls_cipher_supported;
    do {
      piVar1 = piVar1 + 4;
      piVar3 = piVar2 + 1;
      *piVar2 = iVar4;
      iVar4 = *piVar1;
      piVar2 = piVar3;
    } while (iVar4 != 0);
    *piVar3 = 0;
    DAT_00d238c8 = 1;
  }
  return &mbedtls_cipher_supported;
}

