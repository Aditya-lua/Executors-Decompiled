/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b42b28
 */

undefined8 FUN_00b42b28(undefined8 *param_1,long param_2,ulong *param_3,ulong param_4)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long local_38;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    if (*(int *)((long)param_1 + 0x1c) != 1) {
      if (*(int *)((long)param_1 + 0x1c) == 0) {
        uVar2 = FUN_00b433a4(param_1,param_2,param_3,param_4,*(byte *)(param_1 + 3) & 1);
        return uVar2;
      }
      return 0;
    }
    if (param_2 == 0) {
      *param_3 = param_1[7];
      return 1;
    }
    if (param_4 < (ulong)param_1[7]) {
      ERR_new();
      ERR_set_debug("providers/implementations/exchange/dh_exch.c",0xc0,"dh_X9_42_kdf_derive");
      uVar2 = 0x6a;
    }
    else if (((DH *)param_1[1] == (DH *)0x0) || (param_1[2] == 0)) {
      ERR_new();
      ERR_set_debug("providers/implementations/exchange/dh_exch.c",0x98,"dh_plain_derive");
      uVar2 = 0x80;
    }
    else {
      iVar1 = DH_size((DH *)param_1[1]);
      lVar4 = (long)iVar1;
      local_38 = lVar4;
      lVar3 = CRYPTO_secure_malloc(lVar4,"providers/implementations/exchange/dh_exch.c",0xc5);
      if (lVar3 != 0) {
        iVar1 = FUN_00b433a4(param_1,lVar3,&local_38,lVar4,1);
        if ((iVar1 == 0) ||
           ((*(int *)((long)param_1 + 0x1c) == 1 &&
            (iVar1 = ossl_dh_kdf_X9_42_asn1
                               (param_2,param_1[7],lVar3,local_38,param_1[8],param_1[5],param_1[6],
                                param_1[4],*param_1,0), iVar1 == 0)))) {
          uVar2 = 0;
        }
        else {
          uVar2 = 1;
          *param_3 = param_1[7];
        }
        CRYPTO_secure_clear_free(lVar3,local_38,"providers/implementations/exchange/dh_exch.c",0xda)
        ;
        return uVar2;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/exchange/dh_exch.c",0xc6,"dh_X9_42_kdf_derive");
      uVar2 = 0xc0100;
    }
    ERR_set_error(0x39,uVar2,0);
  }
  return 0;
}

