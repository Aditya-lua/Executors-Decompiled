/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2c800
 */

undefined8
FUN_00b2c800(void *param_1,long param_2,long param_3,long param_4,undefined8 param_5,
            undefined8 param_6,byte param_7)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  
  iVar2 = ossl_prov_is_running();
  if (iVar2 != 0) {
    bVar1 = *(byte *)((long)param_1 + 0x6c);
    *(undefined4 *)((long)param_1 + 0xa0) = 0;
    *(undefined8 *)((long)param_1 + 0x60) = 0;
    *(byte *)((long)param_1 + 0x6c) = bVar1 & 0xfd | (param_7 & 1) << 1;
    if (param_4 == 0) {
      if (((bVar1 >> 2 & 1) != 0) && (*(int *)((long)param_1 + 0x40) - 2U < 3)) {
        memcpy((void *)((long)param_1 + 0x20),param_1,*(size_t *)((long)param_1 + 0x50));
      }
    }
    else {
      iVar2 = ossl_cipher_generic_initiv(param_1,param_4,param_5);
      if (iVar2 == 0) {
        return 0;
      }
    }
    if (param_2 == 0) {
LAB_00b2c8d0:
      uVar3 = ossl_cipher_generic_set_ctx_params(param_1,param_6);
      return uVar3;
    }
    if (*(long *)((long)param_1 + 0x48) == param_3) {
      iVar2 = (*(code *)**(undefined8 **)((long)param_1 + 0xa8))(param_1,param_2,param_3);
      if (iVar2 != 0) {
        *(byte *)((long)param_1 + 0x6c) = *(byte *)((long)param_1 + 0x6c) | 8;
        goto LAB_00b2c8d0;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/cipher_tdes_common.c",0x5a,"tdes_init");
      ERR_set_error(0x39,0x69,0);
    }
  }
  return 0;
}

