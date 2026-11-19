/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad93a8
 */

undefined * ossl_rsa_mgf_nid2name(int param_1)

{
  undefined *puVar1;
  
  puVar1 = &DAT_002d0093;
  if (param_1 != 0x38f) {
    puVar1 = (undefined *)0x0;
  }
  return puVar1;
}

