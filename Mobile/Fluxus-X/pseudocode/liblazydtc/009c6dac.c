/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6dac
 */

undefined8 tls13_final_finish_mac(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined1 *puVar5;
  undefined8 *puVar6;
  undefined8 in_stack_fffffffffffffeb8;
  undefined4 uVar7;
  undefined8 local_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 local_110;
  undefined8 local_108 [6];
  undefined8 local_d8;
  undefined1 auStack_d0 [64];
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 local_48;
  
  uVar7 = (undefined4)((ulong)in_stack_fffffffffffffeb8 >> 0x20);
  lVar2 = ssl_handshake_md();
  uVar3 = EVP_MD_get0_name();
  local_48 = 0;
  if (lVar2 == 0) {
    return 0;
  }
  puVar6 = &local_130;
  lVar4 = *(long *)(*(long *)(param_1 + 0x9a8) + 0x440);
  if (lVar4 != 0) {
    puVar6 = local_108;
    OSSL_PARAM_construct_utf8_string(&local_90,"properties",lVar4,0);
    local_110 = local_70;
    uStack_128 = uStack_88;
    local_130 = local_90;
    uStack_118 = uStack_78;
    uStack_120 = uStack_80;
  }
  OSSL_PARAM_construct_end(&local_90);
  puVar6[4] = local_70;
  puVar6[1] = uStack_88;
  *puVar6 = local_90;
  puVar6[3] = uStack_78;
  puVar6[2] = uStack_80;
  iVar1 = ssl_handshake_hash(param_1,&local_90,0x40,&local_d8);
  if (iVar1 != 0) {
    if (*(long *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x40) == param_2) {
      puVar5 = (undefined1 *)(param_1 + 0x684);
    }
    else if ((*(long *)(param_1 + 0x240) == 0) || (*(long *)(param_1 + 0x2c8) == 0)) {
      puVar5 = (undefined1 *)(param_1 + 0x644);
    }
    else {
      puVar5 = auStack_d0;
      iVar1 = tls13_hkdf_expand(param_1,lVar2,param_1 + 0x744,"finished",8,0,0,auStack_d0,local_d8,
                                CONCAT44(uVar7,1));
      if (iVar1 == 0) goto LAB_009c6f44;
    }
    lVar2 = EVP_Q_mac(**(undefined8 **)(param_1 + 0x9a8),&DAT_002c35d3,
                      (*(undefined8 **)(param_1 + 0x9a8))[0x88],uVar3,&local_130,puVar5,local_d8,
                      &local_90,local_d8,param_4,0x80,&local_48);
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("ssl/tls13_enc.c",299,"tls13_final_finish_mac");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
    }
  }
LAB_009c6f44:
  OPENSSL_cleanse(auStack_d0,0x40);
  return local_48;
}

