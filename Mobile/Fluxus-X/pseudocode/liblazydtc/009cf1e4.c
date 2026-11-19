/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cf1e4
 */

undefined8 tls1_mac(undefined4 *param_1,long param_2,uchar *param_3,int param_4)

{
  long lVar1;
  char *pcVar2;
  uint uVar3;
  char cVar4;
  undefined2 uVar5;
  bool bVar6;
  int iVar7;
  undefined8 uVar8;
  uint uVar9;
  uint uVar10;
  EVP_MD_CTX *out;
  EVP_MD_CTX *in;
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
  undefined8 local_70;
  undefined1 local_68;
  undefined1 local_67;
  undefined1 local_66;
  undefined1 local_65;
  undefined1 local_64;
  size_t local_58;
  
  bVar6 = param_4 == 0;
  uVar9 = 8;
  if (bVar6) {
    uVar9 = 4;
  }
  lVar1 = 0x890;
  if (bVar6) {
    lVar1 = 0x860;
  }
  in = *(EVP_MD_CTX **)((long)param_1 + lVar1);
  uVar3 = param_1[0x150];
  pcVar2 = (char *)(param_1 + 0x740);
  if (bVar6) {
    pcVar2 = (char *)(param_1 + 0x73e);
  }
  EVP_MD_CTX_get0_md(in);
  iVar7 = EVP_MD_get_size();
  if (iVar7 < 0) {
    return 0;
  }
  uVar10 = 1;
  if (param_4 != 0) {
    uVar10 = 2;
  }
  local_58 = (size_t)iVar7;
  if ((uVar3 & uVar10) == 0) {
    out = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if ((out != (EVP_MD_CTX *)0x0) && (iVar7 = EVP_MD_CTX_copy(out,in), iVar7 != 0)) {
      in = out;
      goto LAB_009cf27c;
    }
  }
  else {
    out = (EVP_MD_CTX *)0x0;
LAB_009cf27c:
    uVar10 = *(uint *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60);
    if (((uVar3 & uVar9) != 0) && ((uVar10 >> 3 & 1) == 0)) {
      iVar7 = EVP_MD_CTX_ctrl(in,4,0,pcVar2);
      if (iVar7 < 1) goto LAB_009cf4ec;
      uVar10 = *(uint *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60);
    }
    if ((uVar10 >> 3 & 1) == 0) {
      local_70 = *(undefined8 *)pcVar2;
    }
    else {
      uVar5 = *(undefined2 *)(*(long *)(param_1 + 0x744) + (ulong)(param_4 != 0) * 2);
      local_70 = CONCAT26(*(undefined2 *)(pcVar2 + 6),
                          CONCAT42(*(undefined4 *)(pcVar2 + 2),
                                   CONCAT11((char)uVar5,(char)((ushort)uVar5 >> 8))));
    }
    local_68 = (undefined1)*(undefined4 *)(param_2 + 4);
    local_67 = (undefined1)((uint)*param_1 >> 8);
    local_66 = (undefined1)*param_1;
    local_65 = (undefined1)((ulong)*(undefined8 *)(param_2 + 8) >> 8);
    local_64 = (undefined1)*(undefined8 *)(param_2 + 8);
    if ((param_4 == 0) && ((*(byte *)((long)param_1 + 0xa9) & 1) == 0)) {
      EVP_CIPHER_CTX_get0_cipher(*(undefined8 *)(param_1 + 0x212));
      iVar7 = EVP_CIPHER_get_mode();
      if (iVar7 == 2) {
        EVP_MD_CTX_get0_md(in);
        iVar7 = EVP_MD_get_type();
        if (((iVar7 - 0x2a0U < 4) || (iVar7 == 0x40)) || (iVar7 == 4)) {
          OSSL_PARAM_construct_size_t(&local_e8,"tls-data-size",param_2 + 0x10);
          local_a0 = local_c8;
          uStack_b8 = uStack_e0;
          local_c0 = local_e8;
          uStack_a8 = uStack_d0;
          uStack_b0 = local_d8;
          OSSL_PARAM_construct_end(&local_e8);
          local_78 = local_c8;
          uStack_80 = uStack_d0;
          local_88 = local_d8;
          uStack_90 = uStack_e0;
          local_98 = local_e8;
          uVar8 = EVP_MD_CTX_get_pkey_ctx(in);
          iVar7 = EVP_PKEY_CTX_set_params(uVar8,&local_c0);
          if (iVar7 == 0) goto LAB_009cf4ec;
        }
      }
    }
    iVar7 = EVP_DigestSignUpdate(in,&local_70,0xd);
    if (((0 < iVar7) &&
        (iVar7 = EVP_DigestSignUpdate
                           (in,*(undefined8 *)(param_2 + 0x28),*(undefined8 *)(param_2 + 8)),
        0 < iVar7)) && (iVar7 = EVP_DigestSignFinal(in,param_3,&local_58), 0 < iVar7)) {
      if ((((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) &&
          (cVar4 = pcVar2[7], pcVar2[7] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0')) &&
         ((cVar4 = pcVar2[6], pcVar2[6] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0' &&
          ((((cVar4 = pcVar2[5], pcVar2[5] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0' &&
             (cVar4 = pcVar2[4], pcVar2[4] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0')) &&
            (cVar4 = pcVar2[3], pcVar2[3] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0')) &&
           ((cVar4 = pcVar2[2], pcVar2[2] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0' &&
            (cVar4 = pcVar2[1], pcVar2[1] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0')))))))) {
        *pcVar2 = *pcVar2 + '\x01';
      }
      uVar8 = 1;
      goto LAB_009cf4f0;
    }
  }
LAB_009cf4ec:
  uVar8 = 0;
LAB_009cf4f0:
  EVP_MD_CTX_free(out);
  return uVar8;
}

