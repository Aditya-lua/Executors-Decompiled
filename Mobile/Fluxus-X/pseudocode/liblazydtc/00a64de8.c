/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a64de8
 */

undefined8 EVP_PKEY_encapsulate(int *param_1,long param_2,undefined8 param_3,long param_4)

{
  undefined8 uVar1;
  
  if (param_1 == (int *)0x0) {
    uVar1 = 0;
  }
  else if (*param_1 == 0x1000) {
    if (*(long *)(param_1 + 0xc) == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/kem.c",199,"EVP_PKEY_encapsulate");
      ERR_set_error(6,0x96,0);
      uVar1 = 0xfffffffe;
    }
    else if ((param_2 == 0) || (uVar1 = 0, param_4 != 0)) {
                    /* WARNING: Could not recover jumptable at 0x00a64e24. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(*(long *)(param_1 + 10) + 0x40))(*(long *)(param_1 + 0xc));
      return uVar1;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/kem.c",0xc2,"EVP_PKEY_encapsulate");
    ERR_set_error(6,0x97,0);
    uVar1 = 0xffffffff;
  }
  return uVar1;
}

