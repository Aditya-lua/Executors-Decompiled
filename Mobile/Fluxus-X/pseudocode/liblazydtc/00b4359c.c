/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4359c
 */

undefined8 FUN_00b4359c(undefined8 *param_1,long param_2,ulong *param_3,ulong param_4)

{
  int iVar1;
  EC_GROUP *group;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  ulong local_48;
  
  if (*(int *)((long)param_1 + 0x1c) == 1) {
    if (param_2 == 0) {
      *param_3 = param_1[7];
      uVar4 = 1;
    }
    else {
      if (param_4 < (ulong)param_1[7]) {
        ERR_new();
        ERR_set_debug("providers/implementations/exchange/ecdh_exch.c",0x209,"ecdh_X9_63_kdf_derive"
                     );
        uVar4 = 0x6a;
      }
      else if (((EC_KEY *)param_1[1] == (EC_KEY *)0x0) || (param_1[2] == 0)) {
        ERR_new();
        ERR_set_debug("providers/implementations/exchange/ecdh_exch.c",0x1ba,"ecdh_plain_derive");
        uVar4 = 0x80;
      }
      else {
        group = EC_KEY_get0_group((EC_KEY *)param_1[1]);
        if (group == (EC_GROUP *)0x0) {
          uVar3 = 0;
        }
        else {
          iVar1 = EC_GROUP_get_degree(group);
          uVar3 = (long)iVar1 + 7U >> 3;
        }
        local_48 = uVar3;
        lVar2 = CRYPTO_secure_malloc(uVar3,"providers/implementations/exchange/ecdh_exch.c",0x20e);
        if (lVar2 != 0) {
          iVar1 = FUN_00b43db0(param_1,lVar2,&local_48,uVar3);
          uVar3 = local_48;
          if ((iVar1 == 0) ||
             (iVar1 = ossl_ecdh_kdf_X9_63(param_2,param_1[7],lVar2,local_48,param_1[5],param_1[6],
                                          param_1[4],*param_1,0), iVar1 == 0)) {
            uVar4 = 0;
          }
          else {
            uVar4 = 1;
            *param_3 = param_1[7];
          }
          CRYPTO_secure_clear_free
                    (lVar2,uVar3,"providers/implementations/exchange/ecdh_exch.c",0x221);
          return uVar4;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/exchange/ecdh_exch.c",0x20f,"ecdh_X9_63_kdf_derive"
                     );
        uVar4 = 0xc0100;
      }
      ERR_set_error(0x39,uVar4,0);
      uVar4 = 0;
    }
  }
  else {
    uVar4 = 0;
    if (*(int *)((long)param_1 + 0x1c) == 0) {
      uVar4 = FUN_00b43db0(param_1,param_2,param_3);
      return uVar4;
    }
  }
  return uVar4;
}

