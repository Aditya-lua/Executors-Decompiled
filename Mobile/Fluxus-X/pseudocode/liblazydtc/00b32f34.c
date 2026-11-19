/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b32f34
 */

undefined4
FUN_00b32f34(undefined8 *param_1,undefined8 param_2,uint param_3,code *param_4,undefined8 param_5)

{
  uint uVar1;
  void *pvVar2;
  int iVar3;
  undefined4 uVar4;
  code *pcVar5;
  long lVar6;
  undefined8 local_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 local_110;
  undefined4 local_104;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  long local_60;
  undefined8 local_58;
  void *local_50;
  void *local_48;
  
  local_48 = (void *)0x0;
  local_60 = 0;
  local_58 = 0;
  *(uint *)(param_1 + 2) = param_3;
  uVar1 = *(uint *)(param_1[1] + 0x1c);
  if (param_3 != 0) {
    uVar1 = param_3;
  }
  if ((*(uint *)(param_1[1] + 0x1c) & uVar1) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/decode_der2key.c",199,"der2key_decode");
    ERR_set_error(0x39,0x80106,0);
    return 0;
  }
  iVar3 = ossl_read_der(*param_1,param_2,&local_48,&local_58);
  if (iVar3 != 0) {
    iVar3 = ERR_set_mark();
    lVar6 = local_60;
    pvVar2 = local_50;
    local_50 = local_48;
    if ((uVar1 & 1) == 0) {
joined_r0x00b32f9c:
      local_48 = local_50;
      if (((uVar1 >> 1 & 1) != 0) && (lVar6 == 0)) {
        pcVar5 = *(code **)(param_1[1] + 0x40);
        if ((pcVar5 != (code *)0x0) ||
           (pcVar5 = *(code **)(param_1[1] + 0x28), pcVar5 != (code *)0x0)) {
          local_60 = (*pcVar5)(0,&local_50,local_58);
          iVar3 = 0;
          if (local_60 != 0) goto LAB_00b330f8;
        }
        if (*(int *)(param_1 + 2) != 0) goto LAB_00b330d4;
        lVar6 = 0;
        pvVar2 = local_50;
      }
      local_50 = pvVar2;
      if (((uVar1 & 0x84) == 0) || (lVar6 != 0)) {
        if (lVar6 != 0) goto LAB_00b330f8;
      }
      else {
        local_50 = local_48;
        if (*(code **)(param_1[1] + 0x30) != (code *)0x0) {
          local_60 = (**(code **)(param_1[1] + 0x30))(0,&local_50,local_58);
          iVar3 = 0;
          if (local_60 != 0) goto LAB_00b330f8;
        }
        if (*(int *)(param_1 + 2) != 0) goto LAB_00b330d4;
      }
      ERR_clear_last_mark(iVar3);
    }
    else {
      pcVar5 = *(code **)(param_1[1] + 0x38);
      if (pcVar5 == (code *)0x0) {
        pcVar5 = *(code **)(param_1[1] + 0x20);
        if (pcVar5 != (code *)0x0) {
          local_60 = (*pcVar5)(0,&local_50,local_58);
        }
      }
      else {
        local_60 = (*pcVar5)(0,&local_50,local_58,param_1);
        if ((*(byte *)((long)param_1 + 0x14) & 1) != 0) {
          ERR_clear_last_mark();
          uVar4 = 0;
          goto LAB_00b3322c;
        }
      }
      if (local_60 == 0) {
        iVar3 = 0;
        if (*(int *)(param_1 + 2) == 0) {
          lVar6 = 0;
          pvVar2 = local_50;
          local_50 = local_48;
          goto joined_r0x00b32f9c;
        }
LAB_00b330d4:
        ERR_clear_last_mark(iVar3);
        goto LAB_00b33150;
      }
LAB_00b330f8:
      ERR_pop_to_mark();
    }
    if (local_60 != 0) {
      if (*(code **)(param_1[1] + 0x48) == (code *)0x0) {
LAB_00b33124:
        if (*(code **)(param_1[1] + 0x50) != (code *)0x0) {
          (**(code **)(param_1[1] + 0x50))(local_60,param_1);
        }
      }
      else {
        iVar3 = (**(code **)(param_1[1] + 0x48))(local_60,param_1);
        if (iVar3 == 0) {
          (**(code **)(param_1[1] + 0x58))(local_60);
          local_60 = 0;
        }
        else if (local_60 != 0) goto LAB_00b33124;
      }
    }
  }
LAB_00b33150:
  CRYPTO_free(local_48);
  local_48 = (void *)0x0;
  if (local_60 == 0) {
    uVar4 = 1;
  }
  else {
    local_104 = 2;
    OSSL_PARAM_construct_int(&local_130,&DAT_002cecd9,&local_104);
    local_e0 = local_110;
    uStack_f8 = uStack_128;
    local_100 = local_130;
    uStack_e8 = uStack_118;
    uStack_f0 = uStack_120;
    OSSL_PARAM_construct_utf8_string(&local_130,"data-type",*(undefined8 *)param_1[1],0);
    local_b8 = local_110;
    uStack_c0 = uStack_118;
    local_c8 = uStack_120;
    uStack_d0 = uStack_128;
    local_d8 = local_130;
    OSSL_PARAM_construct_octet_string(&local_130,"reference",&local_60,8);
    local_90 = local_110;
    uStack_a8 = uStack_128;
    local_b0 = local_130;
    uStack_98 = uStack_118;
    uStack_a0 = uStack_120;
    OSSL_PARAM_construct_end(&local_130);
    local_68 = local_110;
    uStack_70 = uStack_118;
    local_78 = uStack_120;
    uStack_80 = uStack_128;
    local_88 = local_130;
    uVar4 = (*param_4)(&local_100,param_5);
  }
LAB_00b3322c:
  (**(code **)(param_1[1] + 0x58))(local_60);
  CRYPTO_free(local_48);
  return uVar4;
}

