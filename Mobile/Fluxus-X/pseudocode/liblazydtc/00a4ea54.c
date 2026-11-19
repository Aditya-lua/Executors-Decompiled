/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4ea54
 */

long FUN_00a4ea54(undefined8 *param_1,int param_2,char *param_3,char *param_4)

{
  char *pcVar1;
  char *pcVar2;
  undefined4 uVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  byte bVar8;
  undefined8 local_98;
  undefined1 *local_90;
  code *pcStack_88;
  code *local_80;
  undefined1 *puStack_78;
  undefined1 *puStack_70;
  undefined1 *puStack_68;
  code *local_60;
  long local_48;
  
  lVar5 = ossl_lib_ctx_get_data(*param_1,0xb,&DAT_00c5d058);
  lVar6 = ossl_namemap_stored(*param_1);
  pcVar1 = "";
  if (param_4 != (char *)0x0) {
    pcVar1 = param_4;
  }
  local_48 = 0;
  if ((lVar5 == 0) || (lVar6 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_meth.c",0x174,"inner_ossl_decoder_fetch");
    uVar3 = 0x80106;
  }
  else {
    if ((param_2 == 0) || (param_3 == (char *)0x0)) {
      if ((param_2 == 0) && (param_3 != (char *)0x0)) {
        param_2 = ossl_namemap_name2num(lVar6,param_3);
      }
      if ((param_2 == 0) ||
         (iVar4 = ossl_method_store_cache_get(lVar5,0,param_2,pcVar1,&local_48), iVar4 == 0)) {
        local_98 = 0;
        puStack_78 = &LAB_00a4f328;
        local_80 = FUN_00a4f2f8;
        puStack_68 = &LAB_00a4f504;
        puStack_70 = &LAB_00a4f40c;
        pcStack_88 = FUN_00a4f2c8;
        local_90 = &LAB_00a4f298;
        local_60 = FUN_00a4f570;
        *(int *)(param_1 + 1) = param_2;
        param_1[2] = param_3;
        param_1[3] = pcVar1;
        *(byte *)(param_1 + 5) = *(byte *)(param_1 + 5) & 0xfe;
        local_48 = ossl_method_construct(*param_1,0x15,&local_98,0,&local_90,param_1);
        if (local_48 != 0) {
          if ((param_3 != (char *)0x0) && (param_2 == 0)) {
            param_2 = ossl_namemap_name2num(lVar6,param_3);
          }
          if (param_2 != 0) {
            ossl_method_store_cache_set
                      (lVar5,local_98,param_2,pcVar1,local_48,&LAB_00a4f600,FUN_00a4f61c);
          }
        }
        bVar8 = ~*(byte *)(param_1 + 5) & 1;
      }
      else {
        bVar8 = 0;
      }
      if (param_2 == 0 && param_3 == (char *)0x0) {
        return local_48;
      }
      if (local_48 != 0) {
        return local_48;
      }
      uVar3 = 0x8010d;
      if (bVar8 != 0) {
        uVar3 = 0x8010c;
      }
      if (param_3 == (char *)0x0) {
        param_3 = (char *)ossl_namemap_num2name(lVar6,param_2,0);
      }
      ERR_new();
      ERR_set_debug("crypto/encode_decode/decoder_meth.c",0x1b8,"inner_ossl_decoder_fetch");
      uVar7 = ossl_lib_ctx_get_descriptor(*param_1);
      pcVar1 = "<null>";
      if (param_3 != (char *)0x0) {
        pcVar1 = param_3;
      }
      pcVar2 = "<null>";
      if (param_4 != (char *)0x0) {
        pcVar2 = param_4;
      }
      ERR_set_error(0x3c,uVar3,"%s, Name (%s : %d), Properties (%s)",uVar7,pcVar1,param_2,pcVar2);
      return local_48;
    }
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_meth.c",0x17d,"inner_ossl_decoder_fetch");
    uVar3 = 0xc0103;
  }
  ERR_set_error(0x3c,uVar3,0);
  return 0;
}

