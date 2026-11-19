/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7b24
 */

bool tls13_export_keying_material
               (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,void *param_6,size_t param_7,int param_8)

{
  size_t cnt;
  bool bVar1;
  int iVar2;
  EVP_MD *type;
  EVP_MD_CTX *ctx;
  uint local_130;
  uint local_12c;
  uchar auStack_128 [64];
  uchar auStack_e8 [64];
  undefined1 auStack_a8 [72];
  
  type = (EVP_MD *)ssl_handshake_md();
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  bVar1 = false;
  if ((type != (EVP_MD *)0x0) && (ctx != (EVP_MD_CTX *)0x0)) {
    iVar2 = ossl_statem_export_allowed(param_1);
    if ((iVar2 != 0) && (iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), 0 < iVar2)) {
      cnt = 0;
      if (param_8 != 0) {
        cnt = param_7;
      }
      iVar2 = EVP_DigestUpdate(ctx,param_6,cnt);
      if ((((0 < iVar2) && (iVar2 = EVP_DigestFinal_ex(ctx,auStack_e8,&local_12c), 0 < iVar2)) &&
          (iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), 0 < iVar2)) &&
         (iVar2 = EVP_DigestFinal_ex(ctx,auStack_128,&local_130), 0 < iVar2)) {
        iVar2 = tls13_hkdf_expand(param_1,type,param_1 + 0x7c4,param_4,param_5,auStack_128,local_130
                                  ,auStack_a8,local_12c,0);
        if (iVar2 != 0) {
          iVar2 = tls13_hkdf_expand(param_1,type,auStack_a8,"exporter",8,auStack_e8,local_12c,
                                    param_2,param_3,0);
          bVar1 = iVar2 != 0;
          goto LAB_009c7c78;
        }
      }
    }
    bVar1 = false;
  }
LAB_009c7c78:
  EVP_MD_CTX_free(ctx);
  return bVar1;
}

