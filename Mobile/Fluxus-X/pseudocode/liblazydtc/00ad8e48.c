/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8e48
 */

bool ossl_rsa_pss_params_30_is_unrestricted(void *param_1)

{
  int iVar1;
  
  if (param_1 == (void *)0x0) {
    return true;
  }
  iVar1 = memcmp(param_1,&DAT_00d22220,0x14);
  return iVar1 == 0;
}

