/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af58c4
 */

int X509V3_EXT_add_alias(int nid_to,int nid_from)

{
  undefined4 uVar1;
  int iVar2;
  undefined8 *puVar3;
  X509V3_EXT_METHOD *ext;
  undefined8 uVar4;
  void *__src;
  int local_98 [26];
  int *local_28;
  
  local_28 = local_98;
  if (-1 < nid_from) {
    local_98[0] = nid_from;
    puVar3 = OBJ_bsearch_(&local_28,&PTR_ossl_v3_nscert_00cc95d0,0x31,8,(cmp *)&LAB_00af5dc4);
    if (puVar3 == (undefined8 *)0x0) {
      if (DAT_00d227d8 == 0) goto LAB_00af5988;
      uVar1 = OPENSSL_sk_find(DAT_00d227d8,local_98);
      __src = (void *)OPENSSL_sk_value(DAT_00d227d8,uVar1);
    }
    else {
      __src = (void *)*puVar3;
    }
    if (__src != (void *)0x0) {
      ext = CRYPTO_malloc(0x68,"crypto/x509/v3_lib.c",0x5f);
      if (ext != (X509V3_EXT_METHOD *)0x0) {
        memcpy(ext,__src,0x68);
        ext->ext_nid = nid_to;
        ext->ext_flags = ext->ext_flags | 1;
        iVar2 = X509V3_EXT_add(ext);
        return iVar2;
      }
      ERR_new();
      ERR_set_debug("crypto/x509/v3_lib.c",0x60,"X509V3_EXT_add_alias");
      uVar4 = 0xc0100;
      goto LAB_00af59ac;
    }
  }
LAB_00af5988:
  ERR_new();
  ERR_set_debug("crypto/x509/v3_lib.c",0x5c,"X509V3_EXT_add_alias");
  uVar4 = 0x66;
LAB_00af59ac:
  ERR_set_error(0x22,uVar4,0);
  return 0;
}

