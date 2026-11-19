/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3b770
 */

ulong ossl_ec_GFp_simple_ladder_pre
                (long *param_1,long param_2,long param_3,long param_4,undefined8 param_5)

{
  BIGNUM *r;
  BIGNUM *r_00;
  uint uVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  BIGNUM *r_01;
  BIGNUM *a;
  BIGNUM *r_02;
  
  if (*(int *)(param_4 + 0x28) == 0) {
    uVar3 = 0;
  }
  else {
    a = *(BIGNUM **)(param_3 + 0x10);
    r = *(BIGNUM **)(param_3 + 0x18);
    r_00 = *(BIGNUM **)(param_3 + 0x20);
    r_01 = *(BIGNUM **)(param_2 + 0x20);
    r_02 = *(BIGNUM **)(param_2 + 0x10);
    uVar3 = (**(code **)(*param_1 + 0x100))(param_1,a,*(undefined8 *)(param_4 + 0x10),param_5);
    if ((int)uVar3 != 0) {
      uVar1 = BN_mod_sub_quick(r_02,a,(BIGNUM *)param_1[0xc],(BIGNUM *)param_1[8]);
      uVar3 = (ulong)uVar1;
      if (((uVar1 != 0) &&
          (uVar3 = (**(code **)(*param_1 + 0x100))(param_1,r_02,r_02,param_5), (int)uVar3 != 0)) &&
         (uVar3 = (**(code **)(*param_1 + 0xf8))
                            (param_1,r,*(undefined8 *)(param_4 + 0x10),param_1[0xd],param_5),
         (int)uVar3 != 0)) {
        uVar1 = BN_mod_lshift_quick(r,r,3,(BIGNUM *)param_1[8]);
        uVar3 = (ulong)uVar1;
        if (uVar1 != 0) {
          uVar1 = BN_mod_sub_quick(*(BIGNUM **)(param_2 + 0x10),r_02,r,(BIGNUM *)param_1[8]);
          uVar3 = (ulong)uVar1;
          if (uVar1 != 0) {
            uVar1 = BN_mod_add_quick(r_00,a,(BIGNUM *)param_1[0xc],(BIGNUM *)param_1[8]);
            uVar3 = (ulong)uVar1;
            if ((uVar1 != 0) &&
               (uVar3 = (**(code **)(*param_1 + 0xf8))
                                  (param_1,r_01,*(undefined8 *)(param_4 + 0x10),r_00,param_5),
               (int)uVar3 != 0)) {
              uVar1 = BN_mod_add_quick(r_01,(BIGNUM *)param_1[0xd],r_01,(BIGNUM *)param_1[8]);
              uVar3 = (ulong)uVar1;
              if (uVar1 != 0) {
                uVar1 = BN_mod_lshift_quick(*(BIGNUM **)(param_2 + 0x20),r_01,2,(BIGNUM *)param_1[8]
                                           );
                uVar3 = (ulong)uVar1;
                if (uVar1 != 0) {
                  do {
                    uVar3 = BN_priv_rand_range_ex
                                      (*(undefined8 *)(param_2 + 0x18),param_1[8],0,param_5);
                    if ((int)uVar3 == 0) {
                      return uVar3;
                    }
                    iVar2 = BN_is_zero(*(undefined8 *)(param_2 + 0x18));
                  } while (iVar2 != 0);
                  do {
                    uVar3 = BN_priv_rand_range_ex
                                      (*(undefined8 *)(param_3 + 0x20),param_1[8],0,param_5);
                    if ((int)uVar3 == 0) {
                      return uVar3;
                    }
                    iVar2 = BN_is_zero(*(undefined8 *)(param_3 + 0x20));
                  } while (iVar2 != 0);
                  lVar4 = *param_1;
                  if (*(code **)(lVar4 + 0x118) != (code *)0x0) {
                    uVar3 = (**(code **)(lVar4 + 0x118))
                                      (param_1,*(undefined8 *)(param_2 + 0x18),
                                       *(undefined8 *)(param_2 + 0x18),param_5);
                    if ((int)uVar3 == 0) {
                      return uVar3;
                    }
                    uVar3 = (**(code **)(*param_1 + 0x118))
                                      (param_1,*(undefined8 *)(param_3 + 0x20),
                                       *(undefined8 *)(param_3 + 0x20),param_5);
                    if ((int)uVar3 == 0) {
                      return uVar3;
                    }
                    lVar4 = *param_1;
                  }
                  uVar3 = (**(code **)(lVar4 + 0xf8))
                                    (param_1,*(undefined8 *)(param_2 + 0x20),
                                     *(undefined8 *)(param_2 + 0x20),*(undefined8 *)(param_2 + 0x18)
                                     ,param_5);
                  if ((((int)uVar3 != 0) &&
                      (uVar3 = (**(code **)(*param_1 + 0xf8))
                                         (param_1,*(undefined8 *)(param_2 + 0x10),
                                          *(undefined8 *)(param_2 + 0x10),
                                          *(undefined8 *)(param_2 + 0x18),param_5), (int)uVar3 != 0)
                      ) && (uVar3 = (**(code **)(*param_1 + 0xf8))
                                              (param_1,*(undefined8 *)(param_3 + 0x10),
                                               *(undefined8 *)(param_4 + 0x10),
                                               *(undefined8 *)(param_3 + 0x20),param_5),
                           (int)uVar3 != 0)) {
                    uVar3 = 1;
                    *(undefined4 *)(param_2 + 0x28) = 0;
                    *(undefined4 *)(param_3 + 0x28) = 0;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  return uVar3;
}

