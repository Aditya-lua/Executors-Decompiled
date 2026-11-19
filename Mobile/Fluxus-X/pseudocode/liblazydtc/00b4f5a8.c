/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4f5a8
 */

undefined8 FUN_00b4f5a8(undefined8 *param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  
  lVar2 = OSSL_PARAM_BLD_new();
  if (lVar2 == 0) {
    return 0;
  }
  if (((param_1[2] == 0) ||
      (iVar1 = OSSL_PARAM_BLD_push_utf8_string(lVar2,"encoding",param_1[2],0), iVar1 != 0)) &&
     ((param_1[3] == 0 ||
      (iVar1 = OSSL_PARAM_BLD_push_utf8_string(lVar2,"point-format",param_1[3],0), iVar1 != 0)))) {
    if (param_1[1] == 0) {
      if ((((((((param_1[5] == 0) ||
               (iVar1 = OSSL_PARAM_BLD_push_utf8_string(lVar2,"field-type",param_1[5],0), iVar1 == 0
               )) || (param_1[6] == 0)) || ((param_1[7] == 0 || (param_1[8] == 0)))) ||
            ((param_1[9] == 0 ||
             ((iVar1 = OSSL_PARAM_BLD_push_BN(lVar2,&DAT_002a38e7), iVar1 == 0 ||
              (iVar1 = OSSL_PARAM_BLD_push_BN(lVar2,&DAT_002a374f,param_1[7]), iVar1 == 0)))))) ||
           (iVar1 = OSSL_PARAM_BLD_push_BN(lVar2,&DAT_002adabd,param_1[8]), iVar1 == 0)) ||
          (((iVar1 = OSSL_PARAM_BLD_push_BN(lVar2,"order",param_1[9]), iVar1 == 0 ||
            ((param_1[10] != 0 && (iVar1 = OSSL_PARAM_BLD_push_BN(lVar2,"cofactor"), iVar1 == 0))))
           || ((param_1[0xc] != 0 &&
               (iVar1 = OSSL_PARAM_BLD_push_octet_string
                                  (lVar2,&DAT_002bb864,param_1[0xc],param_1[0xe]), iVar1 == 0))))))
         || (param_1[0xb] == 0)) goto LAB_00b4f764;
      iVar1 = OSSL_PARAM_BLD_push_octet_string(lVar2,"generator",param_1[0xb],param_1[0xd]);
    }
    else {
      iVar1 = OSSL_PARAM_BLD_push_utf8_string(lVar2,"group",param_1[1],0);
    }
    if (iVar1 != 0) {
      lVar3 = OSSL_PARAM_BLD_to_param(lVar2);
      if ((lVar3 == 0) || (lVar4 = EC_GROUP_new_from_params(lVar3,*param_1,0), lVar4 == 0)) {
        uVar5 = 0;
      }
      else {
        EC_GROUP_free((EC_GROUP *)param_1[0x10]);
        param_1[0x10] = lVar4;
        uVar5 = 1;
      }
      goto LAB_00b4f76c;
    }
  }
LAB_00b4f764:
  uVar5 = 0;
  lVar3 = 0;
LAB_00b4f76c:
  OSSL_PARAM_free(lVar3);
  OSSL_PARAM_BLD_free(lVar2);
  return uVar5;
}

