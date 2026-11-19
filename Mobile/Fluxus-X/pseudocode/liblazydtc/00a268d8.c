/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a268d8
 */

undefined * ossl_ec_check_group_type_id2name(int param_1)

{
  long lVar1;
  
  if (param_1 == 0) {
    lVar1 = 0;
  }
  else if (param_1 == 0x4000) {
    lVar1 = 2;
  }
  else {
    if (param_1 != 0x2000) {
      return (undefined *)0x0;
    }
    lVar1 = 1;
  }
  return (&PTR_s_default_00c5b3e0)[lVar1 * 2];
}

