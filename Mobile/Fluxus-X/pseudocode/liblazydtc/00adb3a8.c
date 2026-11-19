/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adb3a8
 */

undefined8 ossl_rsa_sp800_56b_validate_strength(undefined8 param_1,uint param_2)

{
  uint uVar1;
  undefined8 uVar2;
  
  uVar1 = ossl_ifc_ffc_compute_security_bits();
  uVar2 = 1;
  if ((param_2 != 0xffffffff) && ((uVar1 & 0xffff) != param_2)) {
    ERR_new(1);
    ERR_set_debug("crypto/rsa/rsa_sp800_56b_gen.c",0xb8,"ossl_rsa_sp800_56b_validate_strength");
    ERR_set_error(4,0xb0,0);
    uVar2 = 0;
  }
  return uVar2;
}

