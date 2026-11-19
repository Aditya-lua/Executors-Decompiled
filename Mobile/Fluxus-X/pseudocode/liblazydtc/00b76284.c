/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b76284
 */

void mbedtls_entropy_free(long param_1)

{
  if ((param_1 != 0) && (*(int *)(param_1 + 0x18) != -1)) {
    mbedtls_md_free(param_1);
    *(undefined4 *)(param_1 + 0x1c) = 0;
    mbedtls_platform_zeroize(param_1 + 0x20,800);
    *(undefined4 *)(param_1 + 0x18) = 0xffffffff;
  }
  return;
}

