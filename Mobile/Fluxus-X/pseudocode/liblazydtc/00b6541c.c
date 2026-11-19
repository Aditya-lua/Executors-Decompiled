/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6541c
 */

undefined8
FUN_00b6541c(void *param_1,long param_2,long param_3,void *param_4,size_t param_5,undefined8 param_6
            ,int param_7)

{
  int iVar1;
  void *__dest;
  undefined8 uVar2;
  
  *(undefined4 *)((long)param_1 + 0xa0) = 0;
  *(undefined8 *)((long)param_1 + 0x60) = 0;
  *(byte *)((long)param_1 + 0x6c) =
       *(byte *)((long)param_1 + 0x6c) & 0xec |
       *(byte *)((long)param_1 + 0x6c) & 1 | (param_7 != 0) << 1;
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    return 0;
  }
  if (param_4 == (void *)0x0) {
    if (((*(byte *)((long)param_1 + 0x6c) >> 2 & 1) != 0) &&
       (*(int *)((long)param_1 + 0x40) - 2U < 3)) {
      param_5 = *(size_t *)((long)param_1 + 0x50);
      __dest = (void *)((long)param_1 + 0x20);
      param_4 = param_1;
LAB_00b654e8:
      memcpy(__dest,param_4,param_5);
    }
LAB_00b654ec:
    if (param_2 == 0) goto LAB_00b65558;
    if ((*(byte *)((long)param_1 + 0x6c) >> 5 & 1) == 0) {
      if (*(long *)((long)param_1 + 0x48) != param_3) {
        ERR_new();
        ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0xd7,
                      "cipher_generic_init_internal");
        uVar2 = 0x69;
        goto LAB_00b65598;
      }
    }
    else {
      *(long *)((long)param_1 + 0x48) = param_3;
    }
    iVar1 = (*(code *)**(undefined8 **)((long)param_1 + 0xa8))(param_1,param_2,param_3);
    if (iVar1 != 0) {
      *(byte *)((long)param_1 + 0x6c) = *(byte *)((long)param_1 + 0x6c) | 8;
LAB_00b65558:
      uVar2 = ossl_cipher_generic_set_ctx_params(param_1,param_6);
      return uVar2;
    }
  }
  else {
    if (*(int *)((long)param_1 + 0x40) == 1) goto LAB_00b654ec;
    if ((param_5 < 0x11) && (*(ulong *)((long)param_1 + 0x50) == param_5)) {
      *(byte *)((long)param_1 + 0x6c) = *(byte *)((long)param_1 + 0x6c) | 4;
      memcpy((void *)((long)param_1 + 0x20),param_4,param_5);
      __dest = param_1;
      goto LAB_00b654e8;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x2aa,
                  "ossl_cipher_generic_initiv");
    uVar2 = 0x6d;
LAB_00b65598:
    ERR_set_error(0x39,uVar2,0);
  }
  return 0;
}

