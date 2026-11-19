/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b796a0
 */

undefined8 mbedtls_md5_starts(undefined8 *param_1)

{
  param_1[1] = 0xefcdab8967452301;
  *param_1 = 0;
  param_1[2] = 0x1032547698badcfe;
  return 0;
}

