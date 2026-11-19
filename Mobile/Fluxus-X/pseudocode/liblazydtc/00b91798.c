/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91798
 */

undefined * mbedtls_ecp_curve_info_from_tls_id(short param_1)

{
  if ((ushort)(param_1 - 0x12U) < 0xd) {
    return (&PTR_DAT_00ca85f0)[(short)(param_1 - 0x12U)];
  }
  return (undefined *)0x0;
}

