/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91774
 */

undefined * mbedtls_ecp_curve_info_from_grp_id(int param_1)

{
  if (param_1 - 1U < 0xd) {
    return (&PTR_DAT_00ca8660)[(int)(param_1 - 1U)];
  }
  return (undefined *)0x0;
}

