/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7ca4
 */

bool tls13_export_keying_material_early
               (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,void *param_6,size_t param_7)

{
  bool bVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  long lVar3;
  EVP_MD *type;
  undefined8 *puVar4;
  uint local_130;
  uint local_12c;
  uchar auStack_128 [64];
  uchar auStack_e8 [64];
  undefined1 auStack_a8 [72];
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if ((ctx != (EVP_MD_CTX *)0x0) && (iVar2 = ossl_statem_export_early_allowed(param_1), iVar2 != 0))
  {
    if ((*(int *)(param_1 + 0x38) == 0) &&
       ((*(int *)(param_1 + 0x1d40) != 0 && (*(int *)(*(long *)(param_1 + 0x918) + 0x354) == 0)))) {
      puVar4 = (undefined8 *)(param_1 + 0x920);
    }
    else {
      puVar4 = (undefined8 *)(param_1 + 0x918);
    }
    lVar3 = SSL_SESSION_get0_cipher(*puVar4);
    type = (EVP_MD *)ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(lVar3 + 0x40));
    if ((((type != (EVP_MD *)0x0) && (iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), 0 < iVar2))
        && (iVar2 = EVP_DigestUpdate(ctx,param_6,param_7), 0 < iVar2)) &&
       (((iVar2 = EVP_DigestFinal_ex(ctx,auStack_e8,&local_12c), 0 < iVar2 &&
         (iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), 0 < iVar2)) &&
        (iVar2 = EVP_DigestFinal_ex(ctx,auStack_128,&local_130), 0 < iVar2)))) {
      iVar2 = tls13_hkdf_expand(param_1,type,param_1 + 0x804,param_4,param_5,auStack_128,local_130,
                                auStack_a8,local_12c,0);
      if (iVar2 != 0) {
        iVar2 = tls13_hkdf_expand(param_1,type,auStack_a8,"exporter",8,auStack_e8,local_12c,param_2,
                                  param_3,0);
        bVar1 = iVar2 != 0;
        goto LAB_009c7e0c;
      }
    }
  }
  bVar1 = false;
LAB_009c7e0c:
  EVP_MD_CTX_free(ctx);
  return bVar1;
}

