/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d4a8
 */

undefined8 ossl_ffc_params_todata(long *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long lVar2;
  
  uVar1 = 0;
  if (((param_1 != (long *)0x0) &&
      ((*param_1 == 0 ||
       (uVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002a38e7), (int)uVar1 != 0)))) &&
     (((param_1[1] == 0 ||
       (uVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002cf3b1), (int)uVar1 != 0)) &&
      ((((param_1[2] == 0 ||
         (uVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002d92e5), (int)uVar1 != 0)) &&
        ((param_1[3] == 0 ||
         (uVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002d9a61), (int)uVar1 != 0)))) &&
       ((((uVar1 = ossl_param_build_set_int(param_2,param_3,"gindex",(int)param_1[7]),
          (int)uVar1 != 0 &&
          (uVar1 = ossl_param_build_set_int(param_2,param_3,"pcounter",(int)param_1[6]),
          (int)uVar1 != 0)) &&
         (uVar1 = ossl_param_build_set_int
                            (param_2,param_3,"hindex",*(undefined4 *)((long)param_1 + 0x3c)),
         (int)uVar1 != 0)) &&
        ((param_1[4] == 0 ||
         (uVar1 = ossl_param_build_set_octet_string
                            (param_2,param_3,&DAT_002bb864,param_1[4],param_1[5]), (int)uVar1 != 0))
        )))))))) {
    if (*(int *)((long)param_1 + 0x34) != 0) {
      ossl_ffc_uid_to_dh_named_group();
      lVar2 = ossl_ffc_named_group_get_name();
      if (lVar2 == 0) {
        return 0;
      }
      uVar1 = ossl_param_build_set_utf8_string(param_2,param_3,"group",lVar2);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
    }
    uVar1 = ossl_param_build_set_int(param_2,param_3,"validate-pq",*(uint *)(param_1 + 8) & 1);
    if (((((int)uVar1 != 0) &&
         (uVar1 = ossl_param_build_set_int
                            (param_2,param_3,"validate-g",*(uint *)(param_1 + 8) >> 1 & 1),
         (int)uVar1 != 0)) &&
        ((uVar1 = ossl_param_build_set_int
                            (param_2,param_3,"validate-legacy",*(uint *)(param_1 + 8) >> 2 & 1),
         (int)uVar1 != 0 &&
         ((param_1[9] == 0 ||
          (uVar1 = ossl_param_build_set_utf8_string(param_2,param_3,"digest"), (int)uVar1 != 0))))))
       && ((param_1[10] == 0 ||
           (uVar1 = ossl_param_build_set_utf8_string(param_2,param_3,"properties"), (int)uVar1 != 0)
           ))) {
      uVar1 = 1;
    }
  }
  return uVar1;
}

