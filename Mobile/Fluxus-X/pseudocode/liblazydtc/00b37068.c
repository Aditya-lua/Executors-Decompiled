/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b37068
 */

undefined4
FUN_00b37068(undefined8 *param_1,undefined8 param_2,uint param_3,code *param_4,undefined8 param_5,
            undefined8 param_6,undefined8 param_7)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  undefined4 uVar4;
  BIO *a;
  undefined8 uVar5;
  ulong uVar6;
  code *pcVar7;
  undefined8 local_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 local_120;
  undefined4 local_114;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 local_f0;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  long local_68;
  
  a = (BIO *)ossl_bio_new_from_core_bio(*param_1);
  local_68 = 0;
  if (a == (BIO *)0x0) {
    return 0;
  }
  *(uint *)(param_1 + 2) = param_3;
  if (((param_3 == 0) || ((param_3 & 1) != 0)) && (*(long *)(param_1[1] + 0x18) != 0)) {
    uStack_f8 = 0;
    local_100 = 0;
    local_e8 = 0;
    local_f0 = 0;
    uStack_108 = 0;
    local_110 = 0;
    iVar3 = ossl_pw_set_ossl_passphrase_cb(&local_110,param_6,param_7);
    if (iVar3 != 0) {
      pcVar7 = *(code **)(param_1[1] + 0x18);
      uVar5 = ossl_prov_ctx_get0_libctx(*param_1);
      local_68 = (*pcVar7)(a,ossl_pw_pvk_password,&local_110,uVar5,0);
      uVar6 = ERR_peek_last_error();
      if (((uVar6 & 0xff800000) != 0x4800000) ||
         ((uVar1 = ((int)(uint)uVar6 >> 0x1f | 0x7fffffU) & (uint)uVar6 & 0x7fffffff, uVar1 != 0x68
          && (uVar1 != 0x65)))) {
        if ((param_3 != 0 && local_68 == 0) || (local_68 == 0)) goto LAB_00b371ac;
        if (*(code **)(param_1[1] + 0x20) == (code *)0x0) {
          BIO_free(a);
        }
        else {
          (**(code **)(param_1[1] + 0x20))(local_68,param_1);
          lVar2 = local_68;
          BIO_free(a);
          if (lVar2 == 0) goto LAB_00b371b4;
        }
        local_114 = 2;
        OSSL_PARAM_construct_int(&local_140,&DAT_002cecd9,&local_114);
        local_f0 = local_120;
        uStack_108 = uStack_138;
        local_110 = local_140;
        uStack_f8 = uStack_128;
        local_100 = uStack_130;
        OSSL_PARAM_construct_utf8_string(&local_140,"data-type",*(undefined8 *)(param_1[1] + 8),0);
        local_c8 = local_120;
        uStack_d0 = uStack_128;
        local_d8 = uStack_130;
        uStack_e0 = uStack_138;
        local_e8 = local_140;
        OSSL_PARAM_construct_octet_string(&local_140,"reference",&local_68,8);
        local_a0 = local_120;
        uStack_b8 = uStack_138;
        local_c0 = local_140;
        uStack_a8 = uStack_128;
        uStack_b0 = uStack_130;
        OSSL_PARAM_construct_end(&local_140);
        local_78 = local_120;
        uStack_80 = uStack_128;
        local_88 = uStack_130;
        uStack_90 = uStack_138;
        local_98 = local_140;
        uVar4 = (*param_4)(&local_110,param_5);
        a = (BIO *)0x0;
        goto LAB_00b371c0;
      }
      ERR_clear_last_mark();
    }
    uVar4 = 0;
  }
  else {
LAB_00b371ac:
    BIO_free(a);
LAB_00b371b4:
    a = (BIO *)0x0;
    uVar4 = 1;
  }
LAB_00b371c0:
  BIO_free(a);
  (**(code **)(param_1[1] + 0x28))(local_68);
  return uVar4;
}

