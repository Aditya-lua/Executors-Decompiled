/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aae198
 */

int OBJ_obj2nid(ASN1_OBJECT *o)

{
  long lVar1;
  uint *puVar2;
  undefined **ppuVar3;
  undefined4 local_30 [2];
  ASN1_OBJECT *local_28;
  ASN1_OBJECT *local_18;
  
  if (o == (ASN1_OBJECT *)0x0) {
    return 0;
  }
  if (o->nid != 0) {
    return o->nid;
  }
  if (o->length == 0) {
    return 0;
  }
  local_18 = o;
  OPENSSL_init_crypto(0x40,0);
  if (DAT_00d22188 != 0) {
    local_30[0] = 0;
    local_28 = o;
    lVar1 = OPENSSL_LH_retrieve(DAT_00d22188,local_30);
    if (lVar1 != 0) {
      ppuVar3 = *(undefined ***)(lVar1 + 8);
      goto LAB_00aae23c;
    }
  }
  puVar2 = (uint *)ossl_bsearch(&local_18,&DAT_0076ea44,0x456,4,&LAB_00aaf034,0);
  if (puVar2 == (uint *)0x0) {
    return 0;
  }
  ppuVar3 = &PTR_s_UNDEF_00c6da58 + (ulong)*puVar2 * 5;
LAB_00aae23c:
  return *(int *)(ppuVar3 + 2);
}

