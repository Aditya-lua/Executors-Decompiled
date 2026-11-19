/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60a68
 */

long FUN_00a60a68(undefined8 *param_1,int param_2,char *param_3,char *param_4)

{
  char *pcVar1;
  char *pcVar2;
  undefined4 uVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  byte bVar9;
  undefined8 local_98;
  undefined1 *local_90;
  code *pcStack_88;
  code *local_80;
  undefined1 *puStack_78;
  undefined1 *puStack_70;
  code *pcStack_68;
  code *local_60;
  long local_58;
  
  lVar6 = ossl_lib_ctx_get_data(*param_1,10,&DAT_00c5d818);
  lVar7 = ossl_namemap_stored(*param_1);
  pcVar1 = "";
  if (param_4 != (char *)0x0) {
    pcVar1 = param_4;
  }
  local_58 = 0;
  if ((lVar6 == 0) || (lVar7 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_meth.c",0x17e,"inner_ossl_encoder_fetch");
    uVar3 = 0x80106;
LAB_00a60b34:
    ERR_set_error(0x3b,uVar3,0);
    return 0;
  }
  if ((param_2 != 0) && (param_3 != (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_meth.c",0x187,"inner_ossl_encoder_fetch");
    uVar3 = 0xc0103;
    goto LAB_00a60b34;
  }
  if ((param_2 == 0) && (param_2 = ossl_namemap_name2num(lVar7,param_3), param_2 == 0)) {
    bVar4 = true;
  }
  else {
    iVar5 = ossl_method_store_cache_get(lVar6,0,param_2,pcVar1,&local_58);
    if (iVar5 != 0) {
      bVar9 = 0;
      goto LAB_00a60c4c;
    }
    bVar4 = false;
  }
  local_98 = 0;
  puStack_78 = &LAB_00a61344;
  local_80 = FUN_00a61314;
  pcStack_68 = FUN_00a61520;
  puStack_70 = &LAB_00a61428;
  pcStack_88 = FUN_00a612e4;
  local_90 = &LAB_00a612b4;
  local_60 = FUN_00a61908;
  *(int *)(param_1 + 1) = param_2;
  param_1[2] = param_3;
  param_1[3] = pcVar1;
  *(byte *)(param_1 + 5) = *(byte *)(param_1 + 5) & 0xfe;
  local_58 = ossl_method_construct(*param_1,0x14,&local_98,0,&local_90,param_1);
  if (local_58 != 0) {
    if (bVar4) {
      param_2 = ossl_namemap_name2num(lVar7,param_3);
    }
    ossl_method_store_cache_set(lVar6,local_98,param_2,pcVar1,local_58,&LAB_00a61998,FUN_00a619b4);
  }
  bVar9 = ~*(byte *)(param_1 + 5) & 1;
LAB_00a60c4c:
  if (param_2 == 0 && param_3 == (char *)0x0) {
    return local_58;
  }
  if (local_58 != 0) {
    return local_58;
  }
  uVar3 = 0x8010d;
  if (bVar9 != 0) {
    uVar3 = 0x8010c;
  }
  if (param_3 == (char *)0x0) {
    param_3 = (char *)ossl_namemap_num2name(lVar7,param_2,0);
  }
  ERR_new();
  ERR_set_debug("crypto/encode_decode/encoder_meth.c",0x1c1,"inner_ossl_encoder_fetch");
  uVar8 = ossl_lib_ctx_get_descriptor(*param_1);
  pcVar1 = "<null>";
  if (param_3 != (char *)0x0) {
    pcVar1 = param_3;
  }
  pcVar2 = "<null>";
  if (param_4 != (char *)0x0) {
    pcVar2 = param_4;
  }
  ERR_set_error(0x3b,uVar3,"%s, Name (%s : %d), Properties (%s)",uVar8,pcVar1,param_2,pcVar2);
  return local_58;
}

