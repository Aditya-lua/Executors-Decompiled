/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ceeec
 */

undefined8 n_ssl3_mac(long param_1,long param_2,uchar *param_3,int param_4)

{
  long lVar1;
  void *d;
  uint uVar2;
  undefined8 *d_00;
  uint uVar3;
  int iVar4;
  EVP_MD_CTX *out;
  undefined8 uVar5;
  EVP_MD_CTX *in;
  size_t cnt;
  size_t cnt_00;
  uint auStack_b4 [12];
  undefined8 uStack_84;
  undefined1 auStack_7c [20];
  size_t local_68;
  undefined1 local_54 [4];
  
  lVar1 = 0x890;
  if (param_4 == 0) {
    lVar1 = 0x860;
  }
  in = *(EVP_MD_CTX **)(param_1 + lVar1);
  d = (void *)(param_1 + 0x100);
  d_00 = (undefined8 *)(param_1 + 0x1d00);
  if (param_4 == 0) {
    d = (void *)(param_1 + 0xb8);
    d_00 = (undefined8 *)(param_1 + 0x1cf8);
  }
  EVP_MD_CTX_get0_md(in);
  uVar3 = EVP_MD_get_size();
  if ((int)uVar3 < 1) {
LAB_009cf1c0:
    uVar5 = 0;
  }
  else {
    uVar2 = 0;
    if (uVar3 != 0) {
      uVar2 = 0x30 / uVar3;
    }
    cnt_00 = (size_t)(int)uVar3;
    cnt = 0x30 - (ulong)(0x30 - uVar2 * uVar3);
    local_68 = cnt_00;
    if (param_4 == 0) {
      EVP_CIPHER_CTX_get0_cipher(*(undefined8 *)(param_1 + 0x848));
      iVar4 = EVP_CIPHER_get_mode();
      if (iVar4 != 2) goto LAB_009cf050;
      EVP_MD_CTX_get0_md(in);
      iVar4 = EVP_MD_get_type();
      if (((3 < iVar4 - 0x2a0U) && (iVar4 != 0x40)) && (iVar4 != 4)) goto LAB_009cf050;
      memcpy(auStack_b4,d,cnt_00);
      memset((void *)((long)auStack_b4 + cnt_00),0x36,cnt);
      lVar1 = cnt + cnt_00;
      *(undefined8 *)((long)auStack_b4 + lVar1) = *d_00;
      auStack_7c[lVar1 + -0x30] = (char)*(undefined4 *)(param_2 + 4);
      uVar5 = *(undefined8 *)(param_2 + 8);
      auStack_7c[lVar1 + -0x2f] = (char)((ulong)uVar5 >> 8);
      auStack_7c[lVar1 + -0x2e] = (char)uVar5;
      uVar5 = EVP_MD_CTX_get0_md(in);
      iVar4 = ssl3_cbc_digest_record
                        (uVar5,param_3,&local_68,auStack_b4,*(undefined8 *)(param_2 + 0x28),
                         *(undefined8 *)(param_2 + 8),*(undefined8 *)(param_2 + 0x10),d,cnt_00,1);
      if (iVar4 < 1) goto LAB_009cf1c0;
    }
    else {
LAB_009cf050:
      out = (EVP_MD_CTX *)EVP_MD_CTX_new();
      if (out == (EVP_MD_CTX *)0x0) {
        return 0;
      }
      local_54[0] = (undefined1)*(undefined4 *)(param_2 + 4);
      *param_3 = (uchar)((ulong)*(undefined8 *)(param_2 + 8) >> 8);
      param_3[1] = (uchar)*(undefined8 *)(param_2 + 8);
      iVar4 = EVP_MD_CTX_copy_ex(out,in);
      if ((((iVar4 < 1) || (iVar4 = EVP_DigestUpdate(out,d,cnt_00), iVar4 < 1)) ||
          ((iVar4 = EVP_DigestUpdate(out,&DAT_0074cebc,cnt), iVar4 < 1 ||
           ((iVar4 = EVP_DigestUpdate(out,d_00,8), iVar4 < 1 ||
            (iVar4 = EVP_DigestUpdate(out,local_54,1), iVar4 < 1)))))) ||
         ((iVar4 = EVP_DigestUpdate(out,param_3,2), iVar4 < 1 ||
          (((((iVar4 = EVP_DigestUpdate(out,*(void **)(param_2 + 0x28),*(size_t *)(param_2 + 8)),
              iVar4 < 1 || (iVar4 = EVP_DigestFinal_ex(out,param_3,(uint *)0x0), iVar4 < 1)) ||
             (iVar4 = EVP_MD_CTX_copy_ex(out,in), iVar4 < 1)) ||
            ((iVar4 = EVP_DigestUpdate(out,d,local_68), iVar4 < 1 ||
             (iVar4 = EVP_DigestUpdate(out,&DAT_0074ceec,cnt), iVar4 < 1)))) ||
           ((iVar4 = EVP_DigestUpdate(out,param_3,local_68), iVar4 < 1 ||
            (iVar4 = EVP_DigestFinal_ex(out,param_3,auStack_b4), iVar4 < 1)))))))) {
        EVP_MD_CTX_free(out);
        goto LAB_009cf1c0;
      }
      EVP_MD_CTX_free(out);
    }
    ssl3_record_sequence_update(d_00);
    uVar5 = 1;
  }
  return uVar5;
}

