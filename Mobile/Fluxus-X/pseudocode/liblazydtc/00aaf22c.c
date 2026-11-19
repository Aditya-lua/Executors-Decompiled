/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf22c
 */

ASN1_OBJECT * OBJ_dup(ASN1_OBJECT *o)

{
  undefined4 uVar1;
  ASN1_OBJECT *a;
  uchar *puVar2;
  char **ppcVar3;
  char *pcVar4;
  int iVar5;
  
  if (o == (ASN1_OBJECT *)0x0) {
    return (ASN1_OBJECT *)0x0;
  }
  if ((o->flags & 1) == 0) {
    return o;
  }
  a = ASN1_OBJECT_new();
  if (a == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/objects/obj_lib.c",0x1c,"OBJ_dup");
    uVar1 = 0x8000d;
    goto LAB_00aaf344;
  }
  a->flags = o->flags | 0xd;
  iVar5 = o->length;
  if (iVar5 < 1) {
LAB_00aaf294:
    a->length = iVar5;
    a->nid = o->nid;
    if (o->ln != (char **)0x0) {
      ppcVar3 = (char **)CRYPTO_strdup((char *)o->ln,"crypto/objects/obj_lib.c",0x2c);
      a->ln = ppcVar3;
      if (ppcVar3 == (char **)0x0) goto LAB_00aaf314;
    }
    if (o->sn == (char *)0x0) {
      return a;
    }
    pcVar4 = CRYPTO_strdup(o->sn,"crypto/objects/obj_lib.c",0x2f);
    a->sn = pcVar4;
    if (pcVar4 != (char *)0x0) {
      return a;
    }
  }
  else {
    puVar2 = (uchar *)CRYPTO_memdup(o->data,(long)iVar5,"crypto/objects/obj_lib.c",0x26);
    a->data = puVar2;
    if (puVar2 != (uchar *)0x0) {
      iVar5 = o->length;
      goto LAB_00aaf294;
    }
  }
LAB_00aaf314:
  ASN1_OBJECT_free(a);
  ERR_new();
  ERR_set_debug("crypto/objects/obj_lib.c",0x35,"OBJ_dup");
  uVar1 = 0xc0100;
LAB_00aaf344:
  ERR_set_error(8,uVar1,0);
  return (ASN1_OBJECT *)0x0;
}

