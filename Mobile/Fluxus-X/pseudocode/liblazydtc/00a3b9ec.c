/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3b9ec
 */

bool ossl_ec_GFp_simple_ladder_step
               (long *param_1,long param_2,long param_3,long param_4,BN_CTX *param_5)

{
  bool bVar1;
  int iVar2;
  BIGNUM *r;
  BIGNUM *r_00;
  BIGNUM *r_01;
  BIGNUM *a;
  BIGNUM *b;
  BIGNUM *r_02;
  BIGNUM *a_00;
  
  BN_CTX_start(param_5);
  r = BN_CTX_get(param_5);
  r_00 = BN_CTX_get(param_5);
  r_01 = BN_CTX_get(param_5);
  a = BN_CTX_get(param_5);
  b = BN_CTX_get(param_5);
  r_02 = BN_CTX_get(param_5);
  a_00 = BN_CTX_get(param_5);
  if (((((((((a_00 == (BIGNUM *)0x0) ||
            (iVar2 = (**(code **)(*param_1 + 0xf8))
                               (param_1,a_00,*(undefined8 *)(param_2 + 0x10),
                                *(undefined8 *)(param_3 + 0x10),param_5), iVar2 == 0)) ||
           (iVar2 = (**(code **)(*param_1 + 0xf8))
                              (param_1,r,*(undefined8 *)(param_2 + 0x20),
                               *(undefined8 *)(param_3 + 0x20),param_5), iVar2 == 0)) ||
          ((iVar2 = (**(code **)(*param_1 + 0xf8))
                              (param_1,b,*(undefined8 *)(param_2 + 0x10),
                               *(undefined8 *)(param_3 + 0x20),param_5), iVar2 == 0 ||
           (iVar2 = (**(code **)(*param_1 + 0xf8))
                              (param_1,a,*(undefined8 *)(param_2 + 0x20),
                               *(undefined8 *)(param_3 + 0x10),param_5), iVar2 == 0)))) ||
         ((iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,r_02,param_1[0xc],r,param_5), iVar2 == 0
          || ((iVar2 = BN_mod_add_quick(r_02,a_00,r_02,(BIGNUM *)param_1[8]), iVar2 == 0 ||
              (iVar2 = BN_mod_add_quick(a_00,a,b,(BIGNUM *)param_1[8]), iVar2 == 0)))))) ||
        (iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,r_02,a_00,r_02,param_5), iVar2 == 0)) ||
       (((((iVar2 = (**(code **)(*param_1 + 0x100))(param_1,r,r,param_5), iVar2 == 0 ||
           (iVar2 = BN_mod_lshift_quick(r_01,(BIGNUM *)param_1[0xd],2,(BIGNUM *)param_1[8]),
           iVar2 == 0)) ||
          (iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,r,r_01,r,param_5), iVar2 == 0)) ||
         (((iVar2 = BN_mod_lshift1_quick(r_02,r_02,(BIGNUM *)param_1[8]), iVar2 == 0 ||
           (iVar2 = BN_mod_sub_quick(a,b,a,(BIGNUM *)param_1[8]), iVar2 == 0)) ||
          ((iVar2 = (**(code **)(*param_1 + 0x100))
                              (param_1,*(undefined8 *)(param_3 + 0x20),a,param_5), iVar2 == 0 ||
           ((iVar2 = (**(code **)(*param_1 + 0xf8))
                               (param_1,b,*(undefined8 *)(param_3 + 0x20),
                                *(undefined8 *)(param_4 + 0x10),param_5), iVar2 == 0 ||
            (iVar2 = BN_mod_add_quick(r,r,r_02,(BIGNUM *)param_1[8]), iVar2 == 0)))))))) ||
        ((iVar2 = BN_mod_sub_quick(*(BIGNUM **)(param_3 + 0x10),r,b,(BIGNUM *)param_1[8]),
         iVar2 == 0 ||
         (((iVar2 = (**(code **)(*param_1 + 0x100))
                              (param_1,b,*(undefined8 *)(param_2 + 0x10),param_5), iVar2 == 0 ||
           (iVar2 = (**(code **)(*param_1 + 0x100))
                              (param_1,r_02,*(undefined8 *)(param_2 + 0x20),param_5), iVar2 == 0))
          || (iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,a_00,r_02,param_1[0xc],param_5),
             iVar2 == 0)))))))) ||
      ((((iVar2 = BN_mod_add_quick(r_00,*(BIGNUM **)(param_2 + 0x10),*(BIGNUM **)(param_2 + 0x20),
                                   (BIGNUM *)param_1[8]), iVar2 == 0 ||
         (iVar2 = (**(code **)(*param_1 + 0x100))(param_1,r_00,r_00,param_5), iVar2 == 0)) ||
        (((iVar2 = BN_mod_sub_quick(r_00,r_00,b,(BIGNUM *)param_1[8]), iVar2 == 0 ||
          ((iVar2 = BN_mod_sub_quick(r_00,r_00,r_02,(BIGNUM *)param_1[8]), iVar2 == 0 ||
           (iVar2 = BN_mod_sub_quick(a,b,a_00,(BIGNUM *)param_1[8]), iVar2 == 0)))) ||
         (iVar2 = (**(code **)(*param_1 + 0x100))(param_1,a,a,param_5), iVar2 == 0)))) ||
       ((((iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,r,r_02,r_00,param_5), iVar2 == 0 ||
          (iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,r,r_01,r,param_5), iVar2 == 0)) ||
         (iVar2 = BN_mod_sub_quick(*(BIGNUM **)(param_2 + 0x10),a,r,(BIGNUM *)param_1[8]),
         iVar2 == 0)) ||
        ((iVar2 = BN_mod_add_quick(a,b,a_00,(BIGNUM *)param_1[8]), iVar2 == 0 ||
         (iVar2 = (**(code **)(*param_1 + 0x100))(param_1,b,r_02,param_5), iVar2 == 0)))))))) ||
     ((iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,b,b,r_01,param_5), iVar2 == 0 ||
      ((iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,r_00,r_00,a,param_5), iVar2 == 0 ||
       (iVar2 = BN_mod_lshift1_quick(r_00,r_00,(BIGNUM *)param_1[8]), iVar2 == 0)))))) {
    bVar1 = false;
  }
  else {
    iVar2 = BN_mod_add_quick(*(BIGNUM **)(param_2 + 0x20),b,r_00,(BIGNUM *)param_1[8]);
    bVar1 = iVar2 != 0;
  }
  BN_CTX_end(param_5);
  return bVar1;
}

