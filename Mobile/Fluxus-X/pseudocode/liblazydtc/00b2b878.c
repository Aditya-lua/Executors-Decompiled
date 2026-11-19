/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2b878
 */

undefined * ossl_cipher_cbc_cts_mode_id2name(uint param_1)

{
  undefined *puVar1;
  
  puVar1 = (undefined *)0x0;
  if (param_1 < 3) {
    puVar1 = (&PTR_DAT_00c93990)[(ulong)param_1 * 2];
  }
  return puVar1;
}

