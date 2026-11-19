/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dc434
 */

bool tls_construct_end_of_early_data(long param_1)

{
  bool bVar1;
  
  bVar1 = (*(uint *)(param_1 + 0x84) | 4) != 7;
  if (bVar1) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0xec3,"tls_construct_end_of_early_data");
    ossl_statem_fatal(param_1,0x50,0xc0101,0);
  }
  else {
    *(undefined4 *)(param_1 + 0x84) = 7;
  }
  return !bVar1;
}

