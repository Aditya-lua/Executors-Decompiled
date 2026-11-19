/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a64eac
 */

undefined8 EVP_PKEY_decapsulate(int *param_1,long param_2,long param_3,long param_4,long param_5)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((((param_1 != (int *)0x0) && (param_4 != 0)) && (param_5 != 0)) &&
     ((param_2 != 0 || (uVar1 = 0, param_3 != 0)))) {
    if (*param_1 == 0x2000) {
      if (*(long *)(param_1 + 0xc) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00a64ef4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar1 = (**(code **)(*(long *)(param_1 + 10) + 0x50))(*(long *)(param_1 + 0xc));
        return uVar1;
      }
      ERR_new();
      ERR_set_debug("crypto/evp/kem.c",0xe6,"EVP_PKEY_decapsulate");
      ERR_set_error(6,0x96,0);
      uVar1 = 0xfffffffe;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/evp/kem.c",0xe1,"EVP_PKEY_decapsulate");
      ERR_set_error(6,0x97,0);
      uVar1 = 0xffffffff;
    }
  }
  return uVar1;
}

