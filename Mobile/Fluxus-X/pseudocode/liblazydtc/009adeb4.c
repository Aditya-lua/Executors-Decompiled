/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009adeb4
 */

undefined8 ssl_load_ciphers(undefined8 *param_1)

{
  int iVar1;
  long lVar2;
  EVP_PKEY_ASN1_METHOD *pEVar3;
  uint uVar4;
  long lVar5;
  ulong uVar6;
  undefined4 *puVar7;
  int local_3c;
  ENGINE *local_38;
  
  lVar5 = 0;
  *(undefined4 *)(param_1 + 200) = 0;
  do {
    if (*(int *)((long)&DAT_0074be60 + lVar5) != 0) {
      lVar2 = ssl_evp_cipher_fetch(*param_1,*(int *)((long)&DAT_0074be60 + lVar5),param_1[0x88]);
      *(long *)((long)param_1 + lVar5 + 0x480) = lVar2;
      if (lVar2 == 0) {
        *(uint *)(param_1 + 200) = *(uint *)(param_1 + 200) | *(uint *)((long)&DAT_0074be5c + lVar5)
        ;
      }
    }
    lVar5 = lVar5 + 8;
  } while (lVar5 != 0xc0);
  uVar6 = 0;
  puVar7 = &DAT_0074bf20;
  *(undefined4 *)((long)param_1 + 0x644) = 0;
  do {
    lVar5 = ssl_evp_md_fetch(*param_1,*puVar7,param_1[0x88]);
    param_1[uVar6 + 0xa8] = lVar5;
    if (lVar5 == 0) {
      *(uint *)((long)param_1 + 0x644) = *(uint *)((long)param_1 + 0x644) | puVar7[-1];
    }
    else {
      iVar1 = EVP_MD_get_size();
      if (iVar1 < 0) {
        return 0;
      }
      param_1[uVar6 + 0xb6] = (long)iVar1;
    }
    uVar6 = uVar6 + 1;
    puVar7 = puVar7 + 2;
  } while (uVar6 < 0xe);
  param_1[0xc9] = 0;
  ERR_set_mark();
  lVar5 = EVP_SIGNATURE_fetch(*param_1,&DAT_002c74e5,param_1[0x88]);
  if (lVar5 == 0) {
    *(uint *)((long)param_1 + 0x64c) = *(uint *)((long)param_1 + 0x64c) | 2;
  }
  else {
    EVP_SIGNATURE_free();
  }
  lVar5 = EVP_KEYEXCH_fetch(*param_1,&DAT_002a3a5a,param_1[0x88]);
  if (lVar5 == 0) {
    *(uint *)(param_1 + 0xc9) = *(uint *)(param_1 + 0xc9) | 0x102;
  }
  else {
    EVP_KEYEXCH_free();
  }
  lVar5 = EVP_KEYEXCH_fetch(*param_1,&DAT_002a5910,param_1[0x88]);
  if (lVar5 == 0) {
    *(uint *)(param_1 + 0xc9) = *(uint *)(param_1 + 0xc9) | 0x84;
  }
  else {
    EVP_KEYEXCH_free();
  }
  lVar5 = EVP_SIGNATURE_fetch(*param_1,"ECDSA",param_1[0x88]);
  if (lVar5 == 0) {
    *(uint *)((long)param_1 + 0x64c) = *(uint *)((long)param_1 + 0x64c) | 8;
  }
  else {
    EVP_SIGNATURE_free();
  }
  ERR_pop_to_mark();
  param_1[0x8a] = 0x357;
  param_1[0x89] = 0x35700000357;
  param_1[0x8c] = 0x357;
  param_1[0x8b] = 0x35700000357;
  param_1[0x8e] = 0;
  param_1[0x8d] = 0x357;
  param_1[0x8f] = 0;
  local_38 = (ENGINE *)0x0;
  local_3c = 0;
  pEVar3 = EVP_PKEY_asn1_find_str(&local_38,"gost-mac",-1);
  if ((pEVar3 != (EVP_PKEY_ASN1_METHOD *)0x0) &&
     (iVar1 = EVP_PKEY_asn1_get0_info
                        (&local_3c,(int *)0x0,(int *)0x0,(char **)0x0,(char **)0x0,pEVar3),
     iVar1 < 1)) {
    local_3c = 0;
  }
  tls_engine_finish(local_38);
  *(int *)((long)param_1 + 0x454) = local_3c;
  if (local_3c == 0) {
    *(uint *)((long)param_1 + 0x644) = *(uint *)((long)param_1 + 0x644) | 8;
  }
  else {
    param_1[0xb9] = 0x20;
  }
  local_38 = (ENGINE *)0x0;
  local_3c = 0;
  pEVar3 = EVP_PKEY_asn1_find_str(&local_38,"gost-mac-12",-1);
  if ((pEVar3 != (EVP_PKEY_ASN1_METHOD *)0x0) &&
     (iVar1 = EVP_PKEY_asn1_get0_info
                        (&local_3c,(int *)0x0,(int *)0x0,(char **)0x0,(char **)0x0,pEVar3),
     iVar1 < 1)) {
    local_3c = 0;
  }
  tls_engine_finish(local_38);
  *(int *)((long)param_1 + 0x464) = local_3c;
  if (local_3c == 0) {
    *(uint *)((long)param_1 + 0x644) = *(uint *)((long)param_1 + 0x644) | 0x100;
  }
  else {
    param_1[0xbd] = 0x20;
  }
  local_38 = (ENGINE *)0x0;
  local_3c = 0;
  pEVar3 = EVP_PKEY_asn1_find_str(&local_38,"magma-mac",-1);
  if ((pEVar3 != (EVP_PKEY_ASN1_METHOD *)0x0) &&
     (iVar1 = EVP_PKEY_asn1_get0_info
                        (&local_3c,(int *)0x0,(int *)0x0,(char **)0x0,(char **)0x0,pEVar3),
     iVar1 < 1)) {
    local_3c = 0;
  }
  tls_engine_finish(local_38);
  *(int *)(param_1 + 0x8f) = local_3c;
  if (local_3c == 0) {
    *(uint *)((long)param_1 + 0x644) = *(uint *)((long)param_1 + 0x644) | 0x400;
  }
  else {
    param_1[0xc2] = 0x20;
  }
  local_38 = (ENGINE *)0x0;
  local_3c = 0;
  pEVar3 = EVP_PKEY_asn1_find_str(&local_38,"kuznyechik-mac",-1);
  if ((pEVar3 != (EVP_PKEY_ASN1_METHOD *)0x0) &&
     (iVar1 = EVP_PKEY_asn1_get0_info
                        (&local_3c,(int *)0x0,(int *)0x0,(char **)0x0,(char **)0x0,pEVar3),
     iVar1 < 1)) {
    local_3c = 0;
  }
  tls_engine_finish(local_38);
  *(int *)((long)param_1 + 0x47c) = local_3c;
  if (local_3c == 0) {
    *(uint *)((long)param_1 + 0x644) = *(uint *)((long)param_1 + 0x644) | 0x800;
  }
  else {
    param_1[0xc3] = 0x20;
  }
  local_38 = (ENGINE *)0x0;
  local_3c = 0;
  pEVar3 = EVP_PKEY_asn1_find_str(&local_38,"gost2001",-1);
  if ((pEVar3 != (EVP_PKEY_ASN1_METHOD *)0x0) &&
     (iVar1 = EVP_PKEY_asn1_get0_info
                        (&local_3c,(int *)0x0,(int *)0x0,(char **)0x0,(char **)0x0,pEVar3),
     iVar1 < 1)) {
    local_3c = 0;
  }
  tls_engine_finish(local_38);
  if (local_3c == 0) {
    *(uint *)((long)param_1 + 0x64c) = *(uint *)((long)param_1 + 0x64c) | 0xa0;
  }
  local_38 = (ENGINE *)0x0;
  local_3c = 0;
  pEVar3 = EVP_PKEY_asn1_find_str(&local_38,"gost2012_256",-1);
  if ((pEVar3 != (EVP_PKEY_ASN1_METHOD *)0x0) &&
     (iVar1 = EVP_PKEY_asn1_get0_info
                        (&local_3c,(int *)0x0,(int *)0x0,(char **)0x0,(char **)0x0,pEVar3),
     iVar1 < 1)) {
    local_3c = 0;
  }
  tls_engine_finish(local_38);
  if (local_3c == 0) {
    *(uint *)((long)param_1 + 0x64c) = *(uint *)((long)param_1 + 0x64c) | 0x80;
  }
  local_38 = (ENGINE *)0x0;
  local_3c = 0;
  pEVar3 = EVP_PKEY_asn1_find_str(&local_38,"gost2012_512",-1);
  if ((pEVar3 != (EVP_PKEY_ASN1_METHOD *)0x0) &&
     (iVar1 = EVP_PKEY_asn1_get0_info
                        (&local_3c,(int *)0x0,(int *)0x0,(char **)0x0,(char **)0x0,pEVar3),
     iVar1 < 1)) {
    local_3c = 0;
  }
  tls_engine_finish(local_38);
  uVar4 = *(uint *)((long)param_1 + 0x64c);
  if (local_3c == 0) {
    uVar4 = uVar4 | 0x80;
    *(uint *)((long)param_1 + 0x64c) = uVar4;
  }
  if (((uVar4 ^ 0xffffffff) & 0xa0) == 0) {
    *(uint *)(param_1 + 0xc9) = *(uint *)(param_1 + 0xc9) | 0x10;
  }
  if ((uVar4 >> 7 & 1) != 0) {
    *(uint *)(param_1 + 0xc9) = *(uint *)(param_1 + 0xc9) | 0x200;
  }
  return 1;
}

