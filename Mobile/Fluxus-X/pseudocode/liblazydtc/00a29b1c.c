/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29b1c
 */

code * BN_nist_mod_func(BIGNUM *param_1)

{
  int iVar1;
  code *pcVar2;
  
  iVar1 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5be78,param_1);
  if (iVar1 == 0) {
    pcVar2 = BN_nist_mod_192;
  }
  else {
    iVar1 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5be90,param_1);
    if (iVar1 == 0) {
      pcVar2 = BN_nist_mod_224;
    }
    else {
      iVar1 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5bea8,param_1);
      if (iVar1 == 0) {
        pcVar2 = BN_nist_mod_256;
      }
      else {
        iVar1 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5bec0,param_1);
        if (iVar1 == 0) {
          pcVar2 = BN_nist_mod_384;
        }
        else {
          iVar1 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5bed8,param_1);
          pcVar2 = BN_nist_mod_521;
          if (iVar1 != 0) {
            pcVar2 = (code *)0x0;
          }
        }
      }
    }
  }
  return pcVar2;
}

