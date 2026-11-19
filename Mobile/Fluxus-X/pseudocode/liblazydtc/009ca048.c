/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca048
 */

undefined8
do_dtls1_write(undefined4 *param_1,undefined4 param_2,undefined1 *param_3,ulong param_4,int param_5,
              long *param_6)

{
  undefined1 *puVar1;
  undefined1 *__dest;
  int iVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  undefined1 *puVar8;
  undefined1 auStack_b0 [4];
  undefined4 local_ac;
  ulong local_a8;
  undefined1 *local_90;
  undefined1 *local_88;
  
  if (*(long *)(param_1 + 0x332) != 0) {
    ERR_new();
    ERR_set_debug("ssl/record/rec_layer_d1.c",0x32a,"do_dtls1_write");
    uVar7 = 0xc0103;
LAB_009ca09c:
    ossl_statem_fatal(param_1,0x50,uVar7,0);
    return 0;
  }
  if ((param_1[0x69] != 0) &&
     (uVar7 = (**(code **)(*(long *)(param_1 + 2) + 0x78))(param_1), (int)uVar7 < 1)) {
    return uVar7;
  }
  if ((param_4 == 0) && (param_5 == 0)) {
    return 0;
  }
  uVar5 = ssl_get_max_send_fragment(param_1);
  if ((uVar5 & 0xffffffff) < param_4) {
    ERR_new();
    ERR_set_debug("ssl/record/rec_layer_d1.c",0x33a,"do_dtls1_write");
    uVar7 = 0xc2;
    goto LAB_009ca09c;
  }
  if (((*(long *)(param_1 + 0x246) == 0) || (*(long *)(param_1 + 0x21e) == 0)) ||
     (lVar6 = EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 0x224)), lVar6 == 0)) {
    iVar2 = 0;
  }
  else {
    EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 0x224));
    iVar2 = EVP_MD_get_size();
    if (iVar2 < 0) {
      ERR_new();
      ERR_set_debug("ssl/record/rec_layer_d1.c",0x34b,"do_dtls1_write");
      uVar7 = 0xc2;
      goto LAB_009ca4b8;
    }
  }
  puVar8 = *(undefined1 **)(param_1 + 0x32a);
  *puVar8 = (char)param_2;
  if ((**(int **)(param_1 + 2) == 0x1ffff) && (param_1[0x27e] != 0x100)) {
    *(undefined2 *)(puVar8 + 1) = 0xfffe;
  }
  else {
    puVar8[1] = (char)((uint)*param_1 >> 8);
    puVar8[2] = (char)*param_1;
  }
  local_ac = param_2;
  if (*(long *)(param_1 + 0x21e) == 0) {
LAB_009ca238:
    iVar3 = 0;
  }
  else {
    EVP_CIPHER_CTX_get0_cipher();
    iVar3 = EVP_CIPHER_get_mode();
    if (iVar3 - 6U < 2) {
      iVar3 = 8;
    }
    else {
      if (iVar3 != 2) goto LAB_009ca238;
      iVar4 = EVP_CIPHER_CTX_get_iv_length(*(undefined8 *)(param_1 + 0x21e));
      if (iVar4 < 0) {
        ERR_new();
        ERR_set_debug("ssl/record/rec_layer_d1.c",0x36e,"do_dtls1_write");
        uVar7 = 0x112;
        goto LAB_009ca4b8;
      }
      iVar3 = 0;
      if (1 < iVar4) {
        iVar3 = iVar4;
      }
    }
  }
  puVar1 = puVar8 + 0xd;
  lVar6 = (long)iVar3;
  __dest = puVar1 + lVar6;
  local_a8 = param_4;
  local_90 = __dest;
  local_88 = param_3;
  if (*(long *)(param_1 + 0x21a) == 0) {
    memcpy(__dest,param_3,param_4);
    local_88 = __dest;
  }
  else {
    iVar4 = ssl3_do_compress(param_1,auStack_b0);
    if (iVar4 == 0) {
      ERR_new();
      ERR_set_debug("ssl/record/rec_layer_d1.c",0x38a,"do_dtls1_write");
      uVar7 = 0x8d;
      goto LAB_009ca4b8;
    }
  }
  if ((iVar2 == 0) || (((uint)*(undefined8 *)(param_1 + 0x2a) >> 10 & 1) != 0)) {
LAB_009ca2ec:
    if (iVar3 != 0) {
      local_a8 = local_a8 + lVar6;
    }
    local_90 = puVar1;
    local_88 = puVar1;
    iVar3 = (*(code *)**(undefined8 **)(*(long *)(param_1 + 2) + 0xc0))
                      (param_1,auStack_b0,1,1,0,(long)iVar2);
    if (iVar3 < 1) {
      iVar2 = ossl_statem_in_error(param_1);
      if (iVar2 != 0) {
        return 0xffffffff;
      }
      ERR_new();
      uVar7 = 0x3ac;
    }
    else {
      if ((iVar2 == 0) || (((uint)*(undefined8 *)(param_1 + 0x2a) >> 10 & 1) == 0)) {
LAB_009ca378:
        puVar8[3] = *(undefined1 *)(*(long *)(param_1 + 0x744) + 3);
        puVar8[4] = *(undefined1 *)(*(long *)(param_1 + 0x744) + 2);
        *(undefined2 *)(puVar8 + 9) = *(undefined2 *)((long)param_1 + 0x1d06);
        *(undefined4 *)(puVar8 + 5) = *(undefined4 *)((long)param_1 + 0x1d02);
        puVar8[0xb] = (char)(local_a8 >> 8);
        puVar8[0xc] = (char)local_a8;
        if (*(code **)(param_1 + 0x130) != (code *)0x0) {
          (**(code **)(param_1 + 0x130))
                    (1,0,0x100,puVar8,0xd,param_1,*(undefined8 *)(param_1 + 0x132));
        }
        local_a8 = local_a8 + 0xd;
        local_ac = param_2;
        ssl3_record_sequence_update(param_1 + 0x740);
        if (param_5 == 0) {
          *(ulong *)(param_1 + 0x332) = local_a8;
          *(undefined8 *)(param_1 + 0x330) = 0;
          *(ulong *)(param_1 + 0x736) = param_4;
          *(undefined1 **)(param_1 + 0x73c) = param_3;
          param_1[0x738] = param_2;
          *(ulong *)(param_1 + 0x73a) = param_4;
          uVar7 = ssl3_write_pending(param_1,param_2,param_3,param_4,param_6);
          return uVar7;
        }
        *param_6 = local_a8;
        return 1;
      }
      iVar3 = (**(code **)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 8))
                        (param_1,auStack_b0,puVar1 + local_a8,1);
      if (iVar3 != 0) {
        local_a8 = local_a8 + (long)iVar2;
        goto LAB_009ca378;
      }
      ERR_new();
      uVar7 = 0x3b4;
    }
  }
  else {
    iVar4 = (**(code **)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 8))
                      (param_1,auStack_b0,puVar1 + local_a8 + lVar6,1);
    if (iVar4 != 0) {
      local_a8 = local_a8 + (long)iVar2;
      goto LAB_009ca2ec;
    }
    ERR_new();
    uVar7 = 0x39d;
  }
  ERR_set_debug("ssl/record/rec_layer_d1.c",uVar7,"do_dtls1_write");
  uVar7 = 0xc0103;
LAB_009ca4b8:
  ossl_statem_fatal(param_1,0x50,uVar7,0);
  return 0xffffffff;
}

