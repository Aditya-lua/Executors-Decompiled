/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed5a4
 */

void TXT_DB_free(TXT_DB *db)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  lhash_st_OPENSSL_STRING **ptr;
  void *pvVar5;
  void *ptr_00;
  long lVar6;
  stack_st_OPENSSL_PSTRING *psVar7;
  ulong uVar8;
  void *pvVar9;
  
  if (db == (TXT_DB *)0x0) {
    return;
  }
  ptr = db->index;
  if (ptr != (lhash_st_OPENSSL_STRING **)0x0) {
    lVar6 = (long)db->num_fields;
    if (0 < db->num_fields) {
      do {
        OPENSSL_LH_free(ptr[lVar6 + -1]);
        ptr = db->index;
        bVar1 = 1 < lVar6;
        lVar6 = lVar6 + -1;
      } while (bVar1);
    }
    CRYPTO_free(ptr);
  }
  CRYPTO_free(db->qual);
  if (db->data != (stack_st_OPENSSL_PSTRING *)0x0) {
    iVar4 = OPENSSL_sk_num();
    psVar7 = db->data;
    if (0 < iVar4) {
      do {
        iVar3 = iVar4 + -1;
        pvVar5 = (void *)OPENSSL_sk_value(psVar7,iVar3);
        iVar2 = db->num_fields;
        uVar8 = (ulong)iVar2;
        pvVar9 = *(void **)((long)pvVar5 + uVar8 * 8);
        if (pvVar9 == (void *)0x0) {
          if (0 < iVar2) {
            lVar6 = 0;
            do {
              CRYPTO_free(*(void **)((long)pvVar5 + lVar6 * 8));
              lVar6 = lVar6 + 1;
            } while (lVar6 < db->num_fields);
          }
        }
        else if (0 < iVar2) {
          lVar6 = 0;
          do {
            ptr_00 = *(void **)((long)pvVar5 + lVar6 * 8);
            if ((ptr_00 < pvVar5) || (pvVar9 < ptr_00)) {
              CRYPTO_free(ptr_00);
              uVar8 = (ulong)(uint)db->num_fields;
            }
            lVar6 = lVar6 + 1;
          } while (lVar6 < (int)uVar8);
        }
        pvVar5 = (void *)OPENSSL_sk_value(db->data,iVar3);
        CRYPTO_free(pvVar5);
        psVar7 = db->data;
        bVar1 = 1 < iVar4;
        iVar4 = iVar3;
      } while (bVar1);
    }
    OPENSSL_sk_free(psVar7);
  }
  CRYPTO_free(db);
  return;
}

