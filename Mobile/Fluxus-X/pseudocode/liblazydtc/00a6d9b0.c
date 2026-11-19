/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d9b0
 */

undefined8 EVP_PKEY_get0_siphash(int *param_1,long *param_2)

{
  int *piVar1;
  undefined8 uVar2;
  
  if (*param_1 == 0x426) {
    piVar1 = (int *)evp_pkey_get_legacy();
    uVar2 = 0;
    if (piVar1 != (int *)0x0) {
      *param_2 = (long)*piVar1;
      uVar2 = *(undefined8 *)(piVar1 + 2);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/p_lib.c",0x341,"EVP_PKEY_get0_siphash");
    ERR_set_error(6,0xaf,0);
    uVar2 = 0;
  }
  return uVar2;
}

