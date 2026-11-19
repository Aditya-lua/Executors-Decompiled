/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bab1d0
 */

undefined8 mbedtls_sha1_starts(undefined8 *param_1)

{
  param_1[2] = 0x1032547698badcfe;
  param_1[1] = 0xefcdab8967452301;
  *param_1 = 0;
  *(undefined4 *)(param_1 + 3) = 0xc3d2e1f0;
  return 0;
}

