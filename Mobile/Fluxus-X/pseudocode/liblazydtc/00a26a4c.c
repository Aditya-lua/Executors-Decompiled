/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26a4c
 */

undefined * ossl_ec_pt_format_id2name(int param_1)

{
  long lVar1;
  
  if (param_1 == 6) {
    lVar1 = 2;
  }
  else if (param_1 == 4) {
    lVar1 = 0;
  }
  else {
    if (param_1 != 2) {
      return (undefined *)0x0;
    }
    lVar1 = 1;
  }
  return (&PTR_s_uncompressed_00c5b410)[lVar1 * 2];
}

