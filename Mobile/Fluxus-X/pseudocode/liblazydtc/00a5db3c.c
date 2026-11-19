/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5db3c
 */

undefined8 evp_default_properties_enable_fips_int(undefined8 param_1,int param_2,undefined4 param_3)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  char *pcVar6;
  
  pcVar6 = "-fips";
  if (param_2 != 0) {
    pcVar6 = "fips=yes";
  }
  plVar2 = (long *)ossl_ctx_global_properties(param_1,param_3);
  if ((plVar2 == (long *)0x0) || (*plVar2 == 0)) {
    lVar4 = ossl_parse_query(param_1,pcVar6,1);
    if (lVar4 != 0) {
LAB_00a5dbf4:
      iVar1 = FUN_00a5d95c(param_1,lVar4,0,0);
      if (iVar1 == 0) {
        ossl_property_free(lVar4);
        return 0;
      }
      return 1;
    }
    ERR_new();
    pcVar6 = "evp_set_default_properties_int";
    uVar5 = 0x21f;
  }
  else {
    lVar3 = ossl_parse_query(param_1,pcVar6,1);
    if (lVar3 != 0) {
      lVar4 = ossl_property_merge(lVar3,*plVar2);
      ossl_property_free(lVar3);
      if (lVar4 != 0) goto LAB_00a5dbf4;
      ERR_new();
      ERR_set_debug("crypto/evp/evp_fetch.c",0x23f,"evp_default_properties_merge");
      uVar5 = 0xc0100;
      goto LAB_00a5dc60;
    }
    ERR_new();
    pcVar6 = "evp_default_properties_merge";
    uVar5 = 0x239;
  }
  ERR_set_debug("crypto/evp/evp_fetch.c",uVar5,pcVar6);
  uVar5 = 0xd2;
LAB_00a5dc60:
  ERR_set_error(6,uVar5,0);
  return 0;
}

