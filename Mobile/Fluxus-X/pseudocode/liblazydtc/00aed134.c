/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed134
 */

int TXT_DB_create_index(TXT_DB *db,int field,qual *qual,LHASH_HASH_FN_TYPE hash,
                       LHASH_COMP_FN_TYPE cmp)

{
  int iVar1;
  int iVar2;
  long lVar3;
  OPENSSL_STRING *ppcVar4;
  long lVar5;
  ulong uVar6;
  
  if (field < db->num_fields) {
    lVar3 = OPENSSL_LH_new(hash,cmp);
    if (lVar3 == 0) {
      db->error = 1;
      iVar1 = 0;
    }
    else {
      iVar1 = OPENSSL_sk_num(db->data);
      if (0 < iVar1) {
        uVar6 = 0;
        do {
          ppcVar4 = (OPENSSL_STRING *)OPENSSL_sk_value(db->data,uVar6 & 0xffffffff);
          if ((qual == (qual *)0x0) || (iVar2 = (*qual)(ppcVar4), iVar2 != 0)) {
            lVar5 = OPENSSL_LH_insert(lVar3,ppcVar4);
            if (lVar5 != 0) {
              db->error = 2;
              iVar1 = OPENSSL_sk_find(db->data,lVar5);
              db->arg1 = (long)iVar1;
              db->arg2 = uVar6;
LAB_00aed248:
              OPENSSL_LH_free(lVar3);
              return 0;
            }
            lVar5 = OPENSSL_LH_retrieve(lVar3,ppcVar4);
            if (lVar5 == 0) {
              db->error = 1;
              goto LAB_00aed248;
            }
          }
          uVar6 = uVar6 + 1;
        } while ((int)uVar6 < iVar1);
      }
      uVar6 = -(ulong)((uint)field >> 0x1f) & 0xfffffff800000000 | (ulong)(uint)field << 3;
      OPENSSL_LH_free(*(undefined8 *)((long)db->index + uVar6));
      iVar1 = 1;
      *(long *)((long)db->index + uVar6) = lVar3;
      *(qual **)((long)db->qual + uVar6) = qual;
    }
  }
  else {
    iVar1 = 0;
    db->error = 3;
  }
  return iVar1;
}

