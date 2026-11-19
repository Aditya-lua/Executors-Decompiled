/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a73c5c
 */

undefined * ossl_dh_gen_type_id2name(uint param_1)

{
  undefined *puVar1;
  
  puVar1 = (undefined *)0x0;
  if (param_1 < 4) {
    puVar1 = (&PTR_s_group_00c60cc8)[*(long *)(&DAT_00364df0 + (long)(int)param_1 * 8) * 2];
  }
  return puVar1;
}

