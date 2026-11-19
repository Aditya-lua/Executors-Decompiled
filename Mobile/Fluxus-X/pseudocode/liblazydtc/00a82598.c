/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82598
 */

void * ossl_namemap_stored(undefined8 param_1)

{
  int iVar1;
  void *arg;
  EVP_PKEY_ASN1_METHOD *ameth;
  ulong uVar2;
  int iVar3;
  int idx;
  char *local_48;
  uint local_3c;
  undefined8 local_38;
  
  arg = (void *)ossl_lib_ctx_get_data(param_1,4,&DAT_00c61420);
  if ((arg != (void *)0x0) && (*(int *)((long)arg + 0x18) == 0)) {
    OPENSSL_init_crypto(0xc,0);
    OBJ_NAME_do_all(2,(fn *)&LAB_00a82c74,arg);
    OBJ_NAME_do_all(1,(fn *)&LAB_00a82cc8,arg);
    iVar1 = EVP_PKEY_asn1_get_count();
    if (0 < iVar1) {
      idx = 0;
      do {
        ameth = EVP_PKEY_asn1_get0(idx);
        local_38 = 0;
        local_3c = 0;
        local_48 = (char *)0x0;
        EVP_PKEY_asn1_get0_info
                  ((int *)((long)&local_38 + 4),(int *)&local_38,(int *)&local_3c,(char **)0x0,
                   &local_48,ameth);
        if (local_38._4_4_ != 0) {
          if ((local_3c & 1) == 0) {
            if (local_38._4_4_ == 0x398) {
              FUN_00a82f04(0,0x398,&DAT_002a032e,arg);
            }
LAB_00a82684:
            uVar2 = 0;
            iVar3 = local_38._4_4_;
          }
          else {
            if (local_38._4_4_ == 0x494) goto LAB_00a82684;
            uVar2 = local_38 & 0xffffffff;
            iVar3 = local_38._4_4_;
          }
          FUN_00a82f04(uVar2,iVar3,local_48,arg);
        }
        idx = idx + 1;
      } while (iVar1 != idx);
    }
  }
  return arg;
}

