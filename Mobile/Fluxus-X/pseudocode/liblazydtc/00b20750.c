/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b20750
 */

undefined8
ossl_prov_set_macctx
          (undefined8 param_1,long param_2,long param_3,long param_4,long param_5,long param_6,
          long param_7,undefined8 param_8)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 local_178;
  undefined8 uStack_170;
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 local_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 local_130;
  undefined8 local_128 [25];
  
  if (param_2 != 0) {
    if (param_4 == 0) {
      lVar2 = OSSL_PARAM_locate_const(param_2,"digest");
      if (lVar2 == 0) {
        param_4 = 0;
      }
      else {
        if (*(int *)(lVar2 + 8) != 4) {
          return 0;
        }
        param_4 = *(long *)(lVar2 + 0x10);
      }
    }
    if (param_3 == 0) {
      lVar2 = OSSL_PARAM_locate_const(param_2,"cipher");
      if (lVar2 == 0) {
        param_3 = 0;
      }
      else {
        if (*(int *)(lVar2 + 8) != 4) {
          return 0;
        }
        param_3 = *(long *)(lVar2 + 0x10);
      }
    }
    if (param_5 == 0) {
      lVar2 = OSSL_PARAM_locate_const(param_2,"engine");
      if (lVar2 == 0) {
        param_5 = 0;
      }
      else {
        if (*(int *)(lVar2 + 8) != 4) {
          return 0;
        }
        param_5 = *(long *)(lVar2 + 0x10);
      }
    }
  }
  puVar4 = &local_150;
  if (param_4 != 0) {
    puVar4 = local_128;
    OSSL_PARAM_construct_utf8_string(&local_178,"digest",param_4,0);
    local_130 = local_158;
    uStack_148 = uStack_170;
    local_150 = local_178;
    uStack_138 = uStack_160;
    uStack_140 = local_168;
  }
  puVar3 = puVar4;
  if (param_3 != 0) {
    puVar3 = puVar4 + 5;
    OSSL_PARAM_construct_utf8_string(&local_178,"cipher",param_3,0);
    puVar4[4] = local_158;
    puVar4[1] = uStack_170;
    *puVar4 = local_178;
    puVar4[3] = uStack_160;
    puVar4[2] = local_168;
  }
  puVar4 = puVar3;
  if (param_6 != 0) {
    puVar4 = puVar3 + 5;
    OSSL_PARAM_construct_utf8_string(&local_178,"properties",param_6,0);
    puVar3[4] = local_158;
    puVar3[1] = uStack_170;
    *puVar3 = local_178;
    puVar3[3] = uStack_160;
    puVar3[2] = local_168;
  }
  puVar3 = puVar4;
  if (param_5 != 0) {
    puVar3 = puVar4 + 5;
    OSSL_PARAM_construct_utf8_string(&local_178,"engine",param_5,0);
    puVar4[4] = local_158;
    puVar4[1] = uStack_170;
    *puVar4 = local_178;
    puVar4[3] = uStack_160;
    puVar4[2] = local_168;
  }
  puVar4 = puVar3;
  if (param_7 != 0) {
    puVar4 = puVar3 + 5;
    OSSL_PARAM_construct_octet_string(&local_178,&DAT_002c567e,param_7,param_8);
    puVar3[4] = local_158;
    puVar3[1] = uStack_170;
    *puVar3 = local_178;
    puVar3[3] = uStack_160;
    puVar3[2] = local_168;
  }
  OSSL_PARAM_construct_end(&local_178);
  puVar4[4] = local_158;
  puVar4[1] = uStack_170;
  *puVar4 = local_178;
  puVar4[3] = uStack_160;
  puVar4[2] = local_168;
  uVar1 = EVP_MAC_CTX_set_params(param_1,&local_150);
  return uVar1;
}

