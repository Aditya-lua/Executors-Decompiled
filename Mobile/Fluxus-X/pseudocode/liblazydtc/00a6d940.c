/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d940
 */

undefined8 EVP_PKEY_get0_poly1305(int *param_1,long *param_2)

{
  int *piVar1;
  undefined8 uVar2;
  
  if (*param_1 == 0x425) {
    piVar1 = (int *)evp_pkey_get_legacy();
    uVar2 = 0;
    if (piVar1 != (int *)0x0) {
      *param_2 = (long)*piVar1;
      uVar2 = *(undefined8 *)(piVar1 + 2);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/p_lib.c",0x32f,"EVP_PKEY_get0_poly1305");
    ERR_set_error(6,0xa4,0);
    uVar2 = 0;
  }
  return uVar2;
}

