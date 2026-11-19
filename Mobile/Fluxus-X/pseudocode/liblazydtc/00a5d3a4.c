/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5d3a4
 */

long FUN_00a5d3a4(undefined8 *param_1,undefined8 param_2,uint param_3,uint param_4,char *param_5,
                 char *param_6,undefined8 param_7,undefined8 param_8,code *param_9)

{
  uint uVar1;
  char *pcVar2;
  char *pcVar3;
  undefined4 uVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  byte bVar9;
  undefined1 *local_b0;
  code *pcStack_a8;
  code *local_a0;
  undefined1 *puStack_98;
  undefined1 *puStack_90;
  undefined1 *puStack_88;
  undefined1 *local_80;
  long local_70;
  undefined8 local_68;
  
  local_68 = param_2;
  lVar6 = ossl_lib_ctx_get_data(*param_1,0,&DAT_00c5d6b8);
  lVar7 = ossl_namemap_stored(*param_1);
  pcVar2 = "";
  if (param_6 != (char *)0x0) {
    pcVar2 = param_6;
  }
  local_70 = 0;
  if ((lVar6 == 0) || (lVar7 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_fetch.c",0x116,"inner_evp_generic_fetch");
    uVar4 = 0x80106;
    goto LAB_00a5d6c4;
  }
  if ((int)param_3 < 1) {
    ERR_new();
    uVar8 = 0x11f;
  }
  else {
    if ((param_4 == 0) || (param_5 == (char *)0x0)) {
      if ((param_4 == 0) && (param_5 != (char *)0x0)) {
        param_4 = ossl_namemap_name2num(lVar7);
      }
      if (param_4 != 0) {
        if (((0xfe < param_3 - 1) || (0x7ffffe < param_4 - 1)) ||
           (uVar1 = param_3 & 0xff | (param_4 & 0x7fffff) << 8, uVar1 == 0)) {
          ERR_new();
          uVar8 = 0x139;
          goto LAB_00a5d6b4;
        }
        iVar5 = ossl_method_store_cache_get(lVar6,param_2,uVar1,pcVar2,&local_70);
        if (iVar5 != 0) {
          bVar9 = 0;
          goto LAB_00a5d5f8;
        }
      }
      puStack_98 = &LAB_00a5dff8;
      local_a0 = FUN_00a5dfc8;
      puStack_88 = &LAB_00a5e220;
      puStack_90 = &LAB_00a5e10c;
      pcStack_a8 = FUN_00a5df98;
      local_b0 = &LAB_00a5df68;
      local_80 = &LAB_00a5e294;
      param_1[2] = param_5;
      param_1[3] = pcVar2;
      *(uint *)(param_1 + 1) = param_3;
      *(uint *)((long)param_1 + 0xc) = param_4;
      param_1[6] = param_7;
      param_1[7] = param_8;
      param_1[8] = param_9;
      *(byte *)(param_1 + 5) = *(byte *)(param_1 + 5) & 0xfe;
      local_70 = ossl_method_construct(*param_1,param_3,&local_68,0,&local_b0,param_1);
      if (local_70 != 0) {
        if ((param_4 == 0) && (param_4 = ossl_namemap_name2num(lVar7,param_5), param_4 == 0)) {
          ERR_new();
          ERR_set_debug("crypto/evp/evp_fetch.c",0x16a,"inner_evp_generic_fetch");
          ERR_set_error(6,0x8010d,"Algorithm %s cannot be found",param_5);
          (*param_9)(local_70);
          local_70 = 0;
        }
        else if ((param_3 - 1 < 0xff) &&
                ((param_4 - 1 < 0x7fffff &&
                 (uVar1 = param_3 & 0xff | (param_4 & 0x7fffff) << 8, uVar1 != 0)))) {
          ossl_method_store_cache_set(lVar6,local_68,uVar1,pcVar2,local_70,param_8,param_9);
        }
      }
      bVar9 = ~*(byte *)(param_1 + 5) & 1;
LAB_00a5d5f8:
      if (param_4 == 0 && param_5 == (char *)0x0) {
        return local_70;
      }
      if (local_70 != 0) {
        return local_70;
      }
      uVar4 = 0x8010d;
      if (bVar9 != 0) {
        uVar4 = 0x8010c;
      }
      if (param_5 == (char *)0x0) {
        param_5 = (char *)ossl_namemap_num2name(lVar7,param_4,0);
      }
      ERR_new();
      ERR_set_debug("crypto/evp/evp_fetch.c",0x182,"inner_evp_generic_fetch");
      uVar8 = ossl_lib_ctx_get_descriptor(*param_1);
      pcVar2 = "<null>";
      if (param_5 != (char *)0x0) {
        pcVar2 = param_5;
      }
      pcVar3 = "<null>";
      if (param_6 != (char *)0x0) {
        pcVar3 = param_6;
      }
      ERR_set_error(6,uVar4,"%s, Algorithm (%s : %d), Properties (%s)",uVar8,pcVar2,param_4,pcVar3);
      return local_70;
    }
    ERR_new();
    uVar8 = 0x128;
  }
LAB_00a5d6b4:
  ERR_set_debug("crypto/evp/evp_fetch.c",uVar8,"inner_evp_generic_fetch");
  uVar4 = 0xc0103;
LAB_00a5d6c4:
  ERR_set_error(6,uVar4,0);
  return 0;
}

