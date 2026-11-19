/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3ae0
 */

undefined8 ssl_hmac_init(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  
  if (*param_1 != 0) {
    OSSL_PARAM_construct_utf8_string(&local_a8,"digest",param_4,0);
    local_60 = local_88;
    uStack_78 = uStack_a0;
    local_80 = local_a8;
    uStack_68 = uStack_90;
    uStack_70 = local_98;
    OSSL_PARAM_construct_end(&local_a8);
    local_38 = local_88;
    uStack_40 = uStack_90;
    local_48 = local_98;
    uStack_50 = uStack_a0;
    local_58 = local_a8;
    iVar1 = EVP_MAC_init(*param_1,param_2,param_3,&local_80);
    if (iVar1 != 0) {
      return 1;
    }
  }
  if (param_1[1] == 0) {
    uVar2 = 0;
  }
  else {
    uVar2 = ssl_hmac_old_init(param_1,param_2,param_3,param_4);
  }
  return uVar2;
}

