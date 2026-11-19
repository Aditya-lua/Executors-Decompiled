/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b34530
 */

undefined4
FUN_00b34530(undefined8 *param_1,undefined8 param_2,uint param_3,code *param_4,undefined8 param_5,
            undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  undefined4 uVar2;
  uint num;
  uint uVar3;
  BIO *b;
  undefined8 uVar4;
  undefined1 *data;
  long *plVar5;
  undefined8 local_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 local_150;
  undefined4 local_144;
  undefined8 local_140;
  undefined8 uStack_138;
  undefined8 local_130;
  undefined8 uStack_128;
  undefined8 local_120;
  undefined8 local_118;
  undefined8 uStack_110;
  undefined8 local_108;
  undefined8 uStack_100;
  undefined8 local_f8;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  long local_a0;
  int local_98;
  int local_94;
  undefined1 auStack_90 [4];
  undefined4 local_8c;
  undefined1 auStack_88 [16];
  undefined1 *local_78 [3];
  
  b = (BIO *)ossl_bio_new_from_core_bio(*param_1);
  local_98 = -1;
  local_94 = -1;
  local_a0 = 0;
  if (b == (BIO *)0x0) {
    return 0;
  }
  iVar1 = BIO_read(b,auStack_88,0x10);
  if (iVar1 == 0x10) {
    ERR_set_mark();
    local_78[0] = auStack_88;
    iVar1 = ossl_do_blob_header(local_78,0x10,auStack_90,&local_8c,&local_94,&local_98);
    ERR_pop_to_mark();
    if (iVar1 < 1) goto LAB_00b3462c;
    plVar5 = param_1 + 1;
    *(uint *)(param_1 + 2) = param_3;
    if (local_94 == 0) {
      data = (undefined1 *)0x0;
      if (*(int *)*plVar5 == 6) goto LAB_00b34784;
    }
    else {
      data = (undefined1 *)0x0;
      if (*(int *)*plVar5 == 0x74) {
LAB_00b34784:
        num = ossl_blob_length(local_8c,local_94,local_98);
        if (0x19000 < num) {
          ERR_new();
          ERR_set_debug("providers/implementations/encode_decode/decode_msblob2key.c",0x83,
                        "msblob2key_decode");
          uVar4 = 0x80;
          goto LAB_00b34624;
        }
        data = CRYPTO_malloc(num,"providers/implementations/encode_decode/decode_msblob2key.c",0x86)
        ;
        if (data == (undefined1 *)0x0) {
          ERR_new();
          ERR_set_debug("providers/implementations/encode_decode/decode_msblob2key.c",0x88,
                        "msblob2key_decode");
          ERR_set_error(9,0xc0100,0);
          uVar2 = 0;
          goto LAB_00b34728;
        }
        local_78[0] = data;
        uVar3 = BIO_read(b,data,num);
        if (uVar3 == num) {
          if ((((param_3 == 0) || ((param_3 & 1) != 0)) && (local_98 == 0)) &&
             (*(long *)(*plVar5 + 0x18) != 0)) {
            uStack_128 = 0;
            local_130 = 0;
            local_118 = 0;
            local_120 = 0;
            uStack_138 = 0;
            local_140 = 0;
            iVar1 = ossl_pw_set_ossl_passphrase_cb(&local_140,param_6,param_7);
            if (iVar1 == 0) {
              uVar2 = 0;
              goto LAB_00b34728;
            }
            local_78[0] = data;
            local_a0 = (**(code **)(*plVar5 + 0x18))(local_78,local_8c,local_98);
            if ((param_3 != 0) && (local_a0 == 0)) goto LAB_00b34630;
          }
          if (local_a0 == 0) {
            if (((param_3 == 0) || ((param_3 >> 1 & 1) != 0)) &&
               ((local_98 != 0 && (*(code **)(*plVar5 + 0x20) != (code *)0x0)))) {
              local_78[0] = data;
              local_a0 = (**(code **)(*plVar5 + 0x20))(local_78,local_8c);
              if (local_a0 != 0) goto LAB_00b348d4;
            }
          }
          else {
LAB_00b348d4:
            if (*(code **)(*plVar5 + 0x28) != (code *)0x0) {
              (**(code **)(*plVar5 + 0x28))(local_a0,param_1);
            }
          }
        }
        else {
          ERR_new();
          ERR_set_debug("providers/implementations/encode_decode/decode_msblob2key.c",0x8d,
                        "msblob2key_decode");
          ERR_set_error(9,0x7b,0);
        }
      }
    }
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/decode_msblob2key.c",0x70,
                  "msblob2key_decode");
    uVar4 = 0x7b;
LAB_00b34624:
    ERR_set_error(9,uVar4,0);
LAB_00b3462c:
    data = (undefined1 *)0x0;
  }
LAB_00b34630:
  CRYPTO_free(data);
  BIO_free(b);
  if (local_a0 == 0) {
    b = (BIO *)0x0;
    data = (undefined1 *)0x0;
    uVar2 = 1;
  }
  else {
    local_144 = 2;
    OSSL_PARAM_construct_int(&local_170,&DAT_002cecd9,&local_144);
    local_120 = local_150;
    uStack_138 = uStack_168;
    local_140 = local_170;
    uStack_128 = uStack_158;
    local_130 = uStack_160;
    OSSL_PARAM_construct_utf8_string(&local_170,"data-type",*(undefined8 *)(param_1[1] + 8),0);
    local_f8 = local_150;
    uStack_100 = uStack_158;
    local_108 = uStack_160;
    uStack_110 = uStack_168;
    local_118 = local_170;
    OSSL_PARAM_construct_octet_string(&local_170,"reference",&local_a0,8);
    local_d0 = local_150;
    uStack_e8 = uStack_168;
    local_f0 = local_170;
    uStack_d8 = uStack_158;
    uStack_e0 = uStack_160;
    OSSL_PARAM_construct_end(&local_170);
    local_a8 = local_150;
    uStack_b0 = uStack_158;
    local_b8 = uStack_160;
    uStack_c0 = uStack_168;
    local_c8 = local_170;
    uVar2 = (*param_4)(&local_140,param_5);
    b = (BIO *)0x0;
    data = (undefined1 *)0x0;
  }
LAB_00b34728:
  BIO_free(b);
  CRYPTO_free(data);
  (**(code **)(param_1[1] + 0x30))(local_a0);
  return uVar2;
}

