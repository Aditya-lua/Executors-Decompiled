/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaeb74
 */

int OBJ_create(char *oid,char *sn,char *ln)

{
  int iVar1;
  int iVar2;
  long lVar3;
  ASN1_OBJECT *obj;
  uint *puVar4;
  undefined **ppuVar5;
  ASN1_OBJECT *local_70;
  char **local_68;
  char **local_60;
  char *local_58;
  ASN1_OBJECT *local_50;
  
  if (sn != (char *)0x0) {
    local_60 = &local_58;
    OPENSSL_init_crypto(0x40,0);
    local_58 = sn;
    if (DAT_00d22188 == 0) {
LAB_00aaebdc:
      puVar4 = (uint *)ossl_bsearch(&local_60,&DAT_00770ef8,0x4d7,4,&LAB_00aaf0a8,0);
      if (puVar4 == (uint *)0x0) goto LAB_00aaec24;
      ppuVar5 = &PTR_s_UNDEF_00c6da58 + (ulong)*puVar4 * 5;
    }
    else {
      local_70 = (ASN1_OBJECT *)CONCAT44(local_70._4_4_,1);
      local_68 = &local_58;
      lVar3 = OPENSSL_LH_retrieve(DAT_00d22188,&local_70);
      if (lVar3 == 0) goto LAB_00aaebdc;
      ppuVar5 = *(undefined ***)(lVar3 + 8);
    }
    if (*(int *)(ppuVar5 + 2) != 0) goto LAB_00aaecb4;
  }
LAB_00aaec24:
  if (ln != (char *)0x0) {
    local_60 = &local_58;
    OPENSSL_init_crypto(0x40,0);
    local_50 = (ASN1_OBJECT *)ln;
    if (DAT_00d22188 == 0) {
LAB_00aaec6c:
      puVar4 = (uint *)ossl_bsearch(&local_60,&DAT_0076fb9c,0x4d7,4,&LAB_00aaf080,0);
      if (puVar4 == (uint *)0x0) goto LAB_00aaece4;
      ppuVar5 = &PTR_s_UNDEF_00c6da58 + (ulong)*puVar4 * 5;
    }
    else {
      local_70 = (ASN1_OBJECT *)CONCAT44(local_70._4_4_,2);
      local_68 = &local_58;
      lVar3 = OPENSSL_LH_retrieve(DAT_00d22188,&local_70);
      if (lVar3 == 0) goto LAB_00aaec6c;
      ppuVar5 = *(undefined ***)(lVar3 + 8);
    }
    if (*(int *)(ppuVar5 + 2) != 0) {
LAB_00aaecb4:
      ERR_new();
      ERR_set_debug("crypto/objects/obj_dat.c",0x2d0,"OBJ_create");
      ERR_set_error(8,0x66,0);
      return 0;
    }
  }
LAB_00aaece4:
  obj = OBJ_txt2obj(oid,1);
  if (obj == (ASN1_OBJECT *)0x0) {
    return 0;
  }
  local_70 = obj;
  if (obj->nid == 0) {
    if (obj->length != 0) {
      OPENSSL_init_crypto(0x40,0);
      if (DAT_00d22188 == 0) {
LAB_00aaed98:
        puVar4 = (uint *)ossl_bsearch(&local_70,&DAT_0076ea44,0x456,4,&LAB_00aaf034,0);
        if (puVar4 == (uint *)0x0) goto LAB_00aaede0;
        ppuVar5 = &PTR_s_UNDEF_00c6da58 + (ulong)*puVar4 * 5;
      }
      else {
        local_58 = (char *)((ulong)local_58 & 0xffffffff00000000);
        local_50 = obj;
        lVar3 = OPENSSL_LH_retrieve(DAT_00d22188,&local_58);
        if (lVar3 == 0) goto LAB_00aaed98;
        ppuVar5 = *(undefined ***)(lVar3 + 8);
      }
      if (*(int *)(ppuVar5 + 2) != 0) goto LAB_00aaed04;
    }
LAB_00aaede0:
    iVar2 = DAT_00cc915c;
    iVar1 = DAT_00cc915c + 1;
    obj->nid = DAT_00cc915c;
    DAT_00cc915c = iVar1;
    if (iVar2 != 0) {
      obj->sn = sn;
      obj->ln = (char **)ln;
      iVar2 = OBJ_add_object(obj);
      obj->sn = (char *)0x0;
      obj->ln = (char **)0x0;
      goto LAB_00aaed34;
    }
  }
  else {
LAB_00aaed04:
    ERR_new();
    ERR_set_debug("crypto/objects/obj_dat.c",0x2db,"OBJ_create");
    ERR_set_error(8,0x66,0);
  }
  iVar2 = 0;
LAB_00aaed34:
  ASN1_OBJECT_free(obj);
  return iVar2;
}

