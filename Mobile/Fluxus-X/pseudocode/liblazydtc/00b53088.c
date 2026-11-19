/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53088
 */

undefined8 FUN_00b53088(long param_1,void *param_2,size_t param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  if ((iVar1 != 0) && (iVar1 = FUN_00b5328c(param_1,param_4), iVar1 != 0)) {
    if (param_2 == (void *)0x0) {
      if (*(char *)(param_1 + 0x81) != '\0') goto LAB_00b53150;
      ERR_new();
      ERR_set_debug("providers/implementations/macs/blake2_mac_impl.c",0x75,"blake2_mac_init");
      uVar2 = 0x72;
    }
    else {
      if (param_3 - 1 < 0x20) {
        memcpy((void *)(param_1 + 0xa0),param_2,param_3);
        if (param_3 < 0x20) {
          memset((void *)(param_1 + param_3 + 0xa0),0,0x20 - param_3);
        }
        ossl_blake2s_param_set_key_length(param_1 + 0x80,param_3 & 0xffffffff);
LAB_00b53150:
        uVar2 = ossl_blake2s_init_key(param_1,param_1 + 0x80,param_1 + 0xa0);
        return uVar2;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/macs/blake2_mac_impl.c",0x5e,"blake2_setkey");
      uVar2 = 0x69;
    }
    ERR_set_error(0x39,uVar2,0);
  }
  return 0;
}

