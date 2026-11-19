/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab538
 */

long ssl3_final_finish_mac(long param_1,void *param_2,size_t param_3,uchar *param_4)

{
  int iVar1;
  int iVar2;
  EVP_MD_CTX *out;
  undefined8 uVar3;
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
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  
  iVar1 = ssl3_digest_cached_records(param_1,0);
  if (iVar1 == 0) {
    return 0;
  }
  EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 400));
  iVar1 = EVP_MD_get_type();
  if (iVar1 != 0x72) {
    ERR_new();
    ERR_set_debug("ssl/s3_enc.c",0x1b0,"ssl3_final_finish_mac");
    uVar3 = 0x144;
LAB_009ab6c4:
    ossl_statem_fatal(param_1,0x50,uVar3,0);
    return 0;
  }
  out = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (out == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/s3_enc.c",0x1b6,"ssl3_final_finish_mac");
    uVar3 = 0xc0100;
    goto LAB_009ab6c4;
  }
  iVar1 = EVP_MD_CTX_copy_ex(out,*(EVP_MD_CTX **)(param_1 + 400));
  if (iVar1 == 0) {
    ERR_new();
    uVar3 = 0x1ba;
  }
  else {
    EVP_MD_CTX_get0_md(out);
    iVar1 = EVP_MD_get_size();
    if (iVar1 < 0) {
      ERR_new();
      uVar3 = 0x1c1;
    }
    else {
      if (param_2 == (void *)0x0) goto LAB_009ab72c;
      OSSL_PARAM_construct_octet_string
                (&local_78,"ssl3-ms",*(long *)(param_1 + 0x918) + 0x50,
                 *(undefined8 *)(*(long *)(param_1 + 0x918) + 8));
      local_d0 = local_58;
      uStack_e8 = uStack_70;
      local_f0 = local_78;
      uStack_d8 = uStack_60;
      uStack_e0 = local_68;
      OSSL_PARAM_construct_end(&local_78);
      local_a8 = local_58;
      uStack_b0 = uStack_60;
      local_b8 = local_68;
      uStack_c0 = uStack_70;
      local_c8 = local_78;
      iVar2 = EVP_DigestUpdate(out,param_2,param_3);
      if (((0 < iVar2) && (iVar2 = EVP_MD_CTX_set_params(out,&local_f0), 0 < iVar2)) &&
         (iVar2 = EVP_DigestFinal_ex(out,param_4,(uint *)0x0), 0 < iVar2)) goto LAB_009ab72c;
      ERR_new();
      uVar3 = 0x1ce;
    }
  }
  ERR_set_debug("ssl/s3_enc.c",uVar3,"ssl3_final_finish_mac");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  iVar1 = 0;
LAB_009ab72c:
  EVP_MD_CTX_free(out);
  return (long)iVar1;
}

