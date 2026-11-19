/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed3e8
 */

int TXT_DB_insert(TXT_DB *db,OPENSSL_STRING *value)

{
  int iVar1;
  OPENSSL_STRING *ppcVar2;
  long lVar3;
  lhash_st_OPENSSL_STRING **pplVar4;
  code *pcVar5;
  ulong uVar6;
  long lVar7;
  
  if (0 < db->num_fields) {
    uVar6 = 0;
    do {
      pplVar4 = db->index + uVar6;
      if (*pplVar4 != (lhash_st_OPENSSL_STRING *)0x0) {
        if (db->qual[uVar6] != (_func_4786 *)0x0) {
          iVar1 = (*db->qual[uVar6])(value);
          if (iVar1 == 0) goto LAB_00aed454;
          pplVar4 = db->index + uVar6;
        }
        ppcVar2 = (OPENSSL_STRING *)OPENSSL_LH_retrieve(*pplVar4,value);
        if (ppcVar2 != (OPENSSL_STRING *)0x0) {
          db->error = 2;
          db->arg1 = uVar6 & 0xffffffff;
          db->arg_row = ppcVar2;
          return 0;
        }
      }
LAB_00aed454:
      uVar6 = uVar6 + 1;
    } while ((long)uVar6 < (long)db->num_fields);
    if (0 < db->num_fields) {
      lVar7 = 0;
      uVar6 = 0;
      do {
        if (*(long *)((long)db->index + lVar7) != 0) {
          pcVar5 = *(code **)((long)db->qual + lVar7);
          if (pcVar5 == (code *)0x0) {
            pplVar4 = db->index + uVar6;
          }
          else {
            iVar1 = (*pcVar5)(value);
            if (iVar1 == 0) goto LAB_00aed4c8;
            pplVar4 = (lhash_st_OPENSSL_STRING **)((long)db->index + lVar7);
          }
          OPENSSL_LH_insert(*pplVar4,value);
          lVar3 = OPENSSL_LH_retrieve(*(undefined8 *)((long)db->index + lVar7),value);
          if (lVar3 == 0) goto LAB_00aed4fc;
        }
LAB_00aed4c8:
        uVar6 = uVar6 + 1;
        lVar7 = lVar7 + 8;
      } while ((long)uVar6 < (long)db->num_fields);
      goto LAB_00aed4e4;
    }
  }
  uVar6 = 0;
LAB_00aed4e4:
  iVar1 = OPENSSL_sk_push(db->data,value);
  if (iVar1 == 0) {
LAB_00aed4fc:
    db->error = 1;
    if (0 < (int)uVar6) {
      uVar6 = uVar6 & 0xffffffff;
      lVar3 = uVar6 * 8;
      lVar7 = uVar6 + 1;
      do {
        lVar3 = lVar3 + -8;
        uVar6 = uVar6 - 1;
        if (*(long *)((long)db->index + lVar3) != 0) {
          pcVar5 = *(code **)((long)db->qual + lVar3);
          if (pcVar5 == (code *)0x0) {
            pplVar4 = db->index + uVar6;
          }
          else {
            iVar1 = (*pcVar5)(value);
            if (iVar1 == 0) goto LAB_00aed560;
            pplVar4 = (lhash_st_OPENSSL_STRING **)((long)db->index + lVar3);
          }
          OPENSSL_LH_delete(*pplVar4,value);
        }
LAB_00aed560:
        lVar7 = lVar7 + -1;
      } while (1 < lVar7);
    }
    iVar1 = 0;
  }
  else {
    iVar1 = 1;
  }
  return iVar1;
}

