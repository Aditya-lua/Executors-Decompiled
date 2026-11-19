/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acda58
 */

/* WARNING: Removing unreachable block (ram,0x00acda90) */

undefined8 ossl_rsa_pss_get_param(void)

{
  undefined8 uVar1;
  int *in_x3;
  
  uVar1 = ossl_rsa_pss_get_param_unverified();
  if ((int)uVar1 != 0) {
    if ((in_x3 == (int *)0x0) || (-1 < *in_x3)) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_ameth.c",0x24a,"rsa_pss_verify_param");
      uVar1 = 0x8b;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_ameth.c",0x242,"rsa_pss_verify_param");
      uVar1 = 0x96;
    }
    ERR_set_error(4,uVar1,0);
    uVar1 = 0;
  }
  return uVar1;
}

