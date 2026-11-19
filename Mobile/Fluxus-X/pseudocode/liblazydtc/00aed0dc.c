/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed0dc
 */

OPENSSL_STRING * TXT_DB_get_by_index(TXT_DB *db,int idx,OPENSSL_STRING *value)

{
  OPENSSL_STRING *ppcVar1;
  long lVar2;
  
  if (idx < db->num_fields) {
    if (db->index[idx] == (lhash_st_OPENSSL_STRING *)0x0) {
      lVar2 = 4;
      ppcVar1 = (OPENSSL_STRING *)0x0;
    }
    else {
      ppcVar1 = (OPENSSL_STRING *)OPENSSL_LH_retrieve(db->index[idx],value);
      lVar2 = 0;
    }
  }
  else {
    ppcVar1 = (OPENSSL_STRING *)0x0;
    lVar2 = 3;
  }
  db->error = lVar2;
  return ppcVar1;
}

