/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d83c
 */

long NCONF_get_section_names(long param_1)

{
  long lVar1;
  
  lVar1 = OPENSSL_sk_new(&LAB_00a0d88c);
  if (lVar1 != 0) {
    OPENSSL_LH_doall_arg(*(undefined8 *)(param_1 + 0x10),&LAB_00a0d898,lVar1);
    OPENSSL_sk_sort(lVar1);
  }
  return lVar1;
}

