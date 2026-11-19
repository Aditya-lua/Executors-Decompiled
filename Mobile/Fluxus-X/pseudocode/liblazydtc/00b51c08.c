/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b51c08
 */

undefined8 FUN_00b51c08(undefined8 *param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = FUN_00b517e8();
  if ((int)uVar2 != 0) {
    iVar1 = ossl_prov_cipher_load_from_params(param_1 + 4,param_2,*param_1);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x1c7,
                    "cmac_gen_set_params");
      ERR_set_error(0x39,0x80106,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  return uVar2;
}

