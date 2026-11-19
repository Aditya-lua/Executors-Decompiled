/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b66ba8
 */

undefined8
FUN_00b66ba8(byte *param_1,long param_2,long param_3,void *param_4,size_t param_5,undefined8 param_6
            ,byte param_7)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  
  iVar2 = ossl_prov_is_running();
  if (iVar2 == 0) {
    return 0;
  }
  bVar1 = *param_1 & 0xfe | param_7 & 1;
  *param_1 = bVar1;
  if (param_4 != (void *)0x0) {
    if (0xfU - *(long *)(param_1 + 8) != param_5) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0xee,"ccm_init");
      uVar3 = 0x6d;
      goto LAB_00b66cb8;
    }
    memcpy(param_1 + 0x30,param_4,param_5);
    *param_1 = bVar1 | 4;
  }
  if (param_2 != 0) {
    if (*(long *)(param_1 + 0x18) != param_3) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0xf6,"ccm_init");
      uVar3 = 0x69;
LAB_00b66cb8:
      ERR_set_error(0x39,uVar3,0);
      return 0;
    }
    iVar2 = (*(code *)**(undefined8 **)(param_1 + 0x90))(param_1,param_2,param_3);
    if (iVar2 == 0) {
      return 0;
    }
  }
  uVar3 = ossl_ccm_set_ctx_params(param_1,param_6);
  return uVar3;
}

