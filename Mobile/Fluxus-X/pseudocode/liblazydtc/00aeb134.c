/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeb134
 */

long FUN_00aeb134(undefined8 *param_1,int param_2,char *param_3,char *param_4)

{
  char *pcVar1;
  char *pcVar2;
  char *pcVar3;
  undefined4 uVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  byte bVar9;
  undefined8 local_98;
  undefined1 *local_90;
  code *pcStack_88;
  code *local_80;
  code *pcStack_78;
  code *pcStack_70;
  code *pcStack_68;
  undefined1 *local_60;
  long local_58;
  
  lVar6 = ossl_lib_ctx_get_data(*param_1,0xf,&DAT_00c7deb8);
  lVar7 = ossl_namemap_stored(*param_1);
  pcVar1 = "";
  if (param_4 != (char *)0x0) {
    pcVar1 = param_4;
  }
  local_58 = 0;
  if ((lVar6 == 0) || (lVar7 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/store/store_meth.c",0x136,"inner_loader_fetch");
    uVar4 = 0x80106;
  }
  else {
    if ((param_2 == 0) || (param_3 == (char *)0x0)) {
      if ((param_2 == 0) && (param_3 != (char *)0x0)) {
        param_2 = ossl_namemap_name2num(lVar7,param_3);
      }
      if ((param_2 == 0) ||
         (iVar5 = ossl_method_store_cache_get(lVar6,0,param_2,pcVar1,&local_58), iVar5 == 0)) {
        local_98 = 0;
        pcStack_78 = FUN_00aeb764;
        local_80 = FUN_00aeb734;
        pcStack_68 = FUN_00aeb8c0;
        pcStack_70 = FUN_00aeb804;
        pcStack_88 = FUN_00aeb704;
        local_90 = &LAB_00aeb6d4;
        local_60 = &LAB_00aebb08;
        *(int *)(param_1 + 1) = param_2;
        param_1[2] = param_3;
        param_1[3] = pcVar1;
        *(byte *)(param_1 + 5) = *(byte *)(param_1 + 5) & 0xfe;
        local_58 = ossl_method_construct(*param_1,0x16,&local_98,0,&local_90,param_1);
        if (local_58 != 0) {
          if (param_2 == 0) {
            param_2 = ossl_namemap_name2num(lVar7,param_3);
          }
          ossl_method_store_cache_set
                    (lVar6,local_98,param_2,pcVar1,local_58,&LAB_00aebb84,&LAB_00aebba8);
        }
        bVar9 = ~*(byte *)(param_1 + 5) & 1;
      }
      else {
        bVar9 = 0;
      }
      if (param_2 == 0 && param_3 == (char *)0x0) {
        return local_58;
      }
      if (local_58 != 0) {
        return local_58;
      }
      uVar4 = 0x8010c;
      if (bVar9 == 0) {
        uVar4 = 0x8010d;
      }
      pcVar1 = 
      "No store loader found. For standard store loaders you need at least one of the default or base providers available. Did you forget to load them? Info: "
      ;
      if (bVar9 == 0) {
        pcVar1 = "";
      }
      if (param_3 == (char *)0x0) {
        param_3 = (char *)ossl_namemap_num2name(lVar7,param_2,0);
      }
      ERR_new();
      ERR_set_debug("crypto/store/store_meth.c",0x17f,"inner_loader_fetch");
      uVar8 = ossl_lib_ctx_get_descriptor(*param_1);
      pcVar2 = "<null>";
      if (param_3 != (char *)0x0) {
        pcVar2 = param_3;
      }
      pcVar3 = "<null>";
      if (param_4 != (char *)0x0) {
        pcVar3 = param_4;
      }
      ERR_set_error(0x2c,uVar4,"%s%s, Scheme (%s : %d), Properties (%s)",pcVar1,uVar8,pcVar2,param_2
                    ,pcVar3);
      return local_58;
    }
    ERR_new();
    ERR_set_debug("crypto/store/store_meth.c",0x13f,"inner_loader_fetch");
    uVar4 = 0xc0103;
  }
  ERR_set_error(0x2c,uVar4,0);
  return 0;
}

