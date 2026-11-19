/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cf51c
 */

undefined8 dtls1_process_record(long param_1,undefined8 param_2)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  COMP_CTX *ctx;
  undefined8 uVar4;
  uchar *out;
  undefined8 uVar5;
  ulong uVar6;
  size_t len;
  long lVar7;
  long lVar8;
  long lVar9;
  void *local_a0;
  undefined8 local_98;
  undefined1 auStack_90 [64];
  
  local_a0 = (void *)0x0;
  local_98 = 0;
  lVar7 = *(long *)(param_1 + 0x918);
  lVar3 = *(long *)(param_1 + 0x1ca8) + 0xd;
  *(long *)(param_1 + 0x12d0) = lVar3;
  if (0x4540 < *(ulong *)(param_1 + 0x12b0)) {
    ERR_new();
    ERR_set_debug("ssl/record/ssl3_record.c",0x60c,"dtls1_process_record");
    uVar4 = 0x16;
    uVar5 = 0x96;
    goto LAB_009cf584;
  }
  *(long *)(param_1 + 0x12c8) = lVar3;
  *(ulong *)(param_1 + 0x12b8) = *(ulong *)(param_1 + 0x12b0);
  if ((*(long *)(param_1 + 0x860) == 0) || (lVar3 = EVP_MD_CTX_get0_md(), lVar3 == 0)) {
    len = 0;
  }
  else {
    uVar1 = EVP_MD_get_size();
    if (0x40 < uVar1) {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x61a,"dtls1_process_record");
      uVar4 = 0x50;
      uVar5 = 0x80006;
      goto LAB_009cf584;
    }
    len = (size_t)(int)uVar1;
  }
  lVar3 = param_1 + 0x12a8;
  if (((*(byte *)(param_1 + 0xa9) & 1) != 0) && (*(long *)(param_1 + 0x860) != 0)) {
    if (*(ulong *)(param_1 + 0x12b8) < len) {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x625,"dtls1_process_record");
      uVar4 = 0x32;
      uVar5 = 0xa0;
LAB_009cf584:
      ossl_statem_fatal(param_1,uVar4,uVar5,0);
      return 0;
    }
    lVar9 = *(long *)(param_1 + 0x12c8);
    lVar8 = *(long *)(param_1 + 0x12b0) - len;
    *(long *)(param_1 + 0x12b0) = lVar8;
    iVar2 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 8))(param_1,lVar3,auStack_90,0);
    if ((iVar2 == 0) || (iVar2 = CRYPTO_memcmp(auStack_90,(void *)(lVar9 + lVar8),len), iVar2 != 0))
    {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x62d,"dtls1_process_record");
      uVar4 = 0x14;
      uVar5 = 0x119;
      goto LAB_009cf584;
    }
    len = 0;
  }
  ERR_set_mark();
  iVar2 = (*(code *)**(undefined8 **)(*(long *)(param_1 + 8) + 0xc0))
                    (param_1,lVar3,1,0,&local_a0,len);
  if (iVar2 == 0) {
    ERR_pop_to_mark();
    iVar2 = ossl_statem_in_error(param_1);
    if (iVar2 == 0) goto LAB_009cf7b0;
  }
  else {
    ERR_clear_last_mark();
    if (((((lVar7 != 0) && ((*(byte *)(param_1 + 0xa9) & 1) == 0)) &&
         (*(long *)(param_1 + 0x848) != 0)) &&
        (lVar7 = EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 0x860)), lVar7 != 0)) &&
       (((iVar2 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 8))
                            (param_1,lVar3,auStack_90,0), iVar2 == 0 || (local_a0 == (void *)0x0))
        || ((iVar2 = CRYPTO_memcmp(auStack_90,local_a0,len), iVar2 != 0 ||
            (len + 0x4400 < *(ulong *)(param_1 + 0x12b0))))))) {
LAB_009cf7b0:
      uVar4 = 0;
      *(undefined8 *)(param_1 + 0x12b0) = 0;
      *(undefined8 *)(param_1 + 0x1cb0) = 0;
      goto joined_r0x009cf890;
    }
    ctx = *(COMP_CTX **)(param_1 + 0x870);
    if (ctx == (COMP_CTX *)0x0) {
LAB_009cf818:
      if ((*(long *)(param_1 + 0x918) == 0) ||
         (uVar1 = *(byte *)(*(long *)(param_1 + 0x918) + 0x368) - 1, 3 < uVar1)) {
        uVar6 = 0x4000;
      }
      else {
        uVar6 = (ulong)(uint)(0x200 << (ulong)(uVar1 & 0x1f));
      }
      if (*(ulong *)(param_1 + 0x12b0) <= uVar6) {
        *(undefined8 *)(param_1 + 0x12c0) = 0;
        *(undefined8 *)(param_1 + 0x1cb0) = 0;
        dtls1_record_bitmap_update(param_1,param_2);
        uVar4 = 1;
        goto joined_r0x009cf890;
      }
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x67f,"dtls1_process_record");
      uVar4 = 0x16;
      uVar5 = 0x92;
    }
    else {
      uVar6 = *(ulong *)(param_1 + 0x12b0);
      if (uVar6 < 0x4401) {
        out = *(uchar **)(param_1 + 0x12d8);
        if (out == (uchar *)0x0) {
          out = CRYPTO_malloc(0x4540,"ssl/record/ssl3_record.c",0x325);
          *(uchar **)(param_1 + 0x12d8) = out;
          if (out != (uchar *)0x0) {
            ctx = *(COMP_CTX **)(param_1 + 0x870);
            uVar6 = *(ulong *)(param_1 + 0x12b0);
            goto LAB_009cf7f8;
          }
        }
        else {
LAB_009cf7f8:
          iVar2 = COMP_expand_block(ctx,out,0x4000,*(uchar **)(param_1 + 0x12c8),(int)uVar6);
          if (-1 < iVar2) {
            *(long *)(param_1 + 0x12b0) = (long)iVar2;
            *(undefined8 *)(param_1 + 0x12c8) = *(undefined8 *)(param_1 + 0x12d8);
            goto LAB_009cf818;
          }
        }
        ERR_new();
        ERR_set_debug("ssl/record/ssl3_record.c",0x674,"dtls1_process_record");
        uVar4 = 0x1e;
        uVar5 = 0x6b;
      }
      else {
        ERR_new();
        ERR_set_debug("ssl/record/ssl3_record.c",0x670,"dtls1_process_record");
        uVar4 = 0x16;
        uVar5 = 0x8c;
      }
    }
    ossl_statem_fatal(param_1,uVar4,uVar5,0);
  }
  uVar4 = 0;
joined_r0x009cf890:
  if ((int)local_98 == 0) {
    return uVar4;
  }
  CRYPTO_free(local_a0);
  return uVar4;
}

