/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4fe4c
 */

undefined8 FUN_00b4fe4c(EC_KEY *param_1,undefined8 param_2,undefined8 param_3)

{
  point_conversion_form_t pVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  undefined8 uVar5;
  
  if (param_1 != (EC_KEY *)0x0) {
    pVar1 = EC_KEY_get_conv_form(param_1);
    lVar4 = ossl_ec_pt_format_id2name(pVar1);
    if ((lVar4 == 0) ||
       (iVar2 = ossl_param_build_set_utf8_string(param_2,param_3,"point-format",lVar4), iVar2 != 0))
    {
      uVar3 = EC_KEY_get_flags(param_1);
      lVar4 = ossl_ec_check_group_type_id2name(uVar3 & 0x6000);
      if (((lVar4 == 0) ||
          (iVar2 = ossl_param_build_set_utf8_string(param_2,param_3,"group-check",lVar4), iVar2 != 0
          )) && ((uVar3 = EC_KEY_get_enc_flags(param_1), (uVar3 >> 1 & 1) == 0 ||
                 (iVar2 = ossl_param_build_set_int(param_2,param_3,"include-public",0), iVar2 != 0))
                )) {
        uVar3 = EC_KEY_get_flags(param_1);
        uVar5 = ossl_param_build_set_int(param_2,param_3,"use-cofactor-flag",uVar3 >> 0xc & 1);
        return uVar5;
      }
    }
  }
  return 0;
}

