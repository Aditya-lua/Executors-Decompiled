/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aadc08
 */

int OBJ_add_object(ASN1_OBJECT *obj)

{
  ASN1_OBJECT *a;
  undefined4 *ptr;
  undefined4 *ptr_00;
  void *pvVar1;
  undefined4 *ptr_01;
  undefined4 *puVar2;
  
  if ((DAT_00d22188 == 0) &&
     (DAT_00d22188 = OPENSSL_LH_new(&LAB_00aaee28,&LAB_00aaef78), DAT_00d22188 == 0)) {
    return 0;
  }
  a = OBJ_dup(obj);
  if (a == (ASN1_OBJECT *)0x0) {
    ptr = (undefined4 *)0x0;
    ptr_01 = (undefined4 *)0x0;
    ptr_00 = (undefined4 *)0x0;
    goto LAB_00aade34;
  }
  ptr = CRYPTO_malloc(0x10,"crypto/objects/obj_dat.c",0xb9);
  if (ptr == (undefined4 *)0x0) {
    ptr_01 = (undefined4 *)0x0;
    ptr_00 = (undefined4 *)0x0;
  }
  else {
    if ((a->length == 0) || (obj->data == (uchar *)0x0)) {
      ptr_00 = (undefined4 *)0x0;
      if (a->sn == (char *)0x0) goto LAB_00aadcb4;
LAB_00aadcf4:
      ptr_01 = CRYPTO_malloc(0x10,"crypto/objects/obj_dat.c",0xbf);
      if (ptr_01 == (undefined4 *)0x0) goto LAB_00aade04;
      if (a->ln != (char **)0x0) goto LAB_00aadd1c;
LAB_00aadcc4:
      puVar2 = (undefined4 *)0x0;
joined_r0x00aadccc:
      if (ptr_00 != (undefined4 *)0x0) {
        *ptr_00 = 0;
        *(ASN1_OBJECT **)(ptr_00 + 2) = a;
        pvVar1 = (void *)OPENSSL_LH_insert(DAT_00d22188,ptr_00);
        CRYPTO_free(pvVar1);
      }
      if (ptr_01 != (undefined4 *)0x0) {
        *ptr_01 = 1;
        *(ASN1_OBJECT **)(ptr_01 + 2) = a;
        pvVar1 = (void *)OPENSSL_LH_insert(DAT_00d22188,ptr_01);
        CRYPTO_free(pvVar1);
      }
      if (puVar2 != (undefined4 *)0x0) {
        *puVar2 = 2;
        *(ASN1_OBJECT **)(puVar2 + 2) = a;
        pvVar1 = (void *)OPENSSL_LH_insert(DAT_00d22188,puVar2);
        CRYPTO_free(pvVar1);
      }
      *ptr = 3;
      *(ASN1_OBJECT **)(ptr + 2) = a;
      pvVar1 = (void *)OPENSSL_LH_insert(DAT_00d22188,ptr);
      CRYPTO_free(pvVar1);
      a->flags = a->flags & 0xfffffff2;
      return a->nid;
    }
    ptr_00 = CRYPTO_malloc(0x10,"crypto/objects/obj_dat.c",0xbc);
    if (ptr_00 == (undefined4 *)0x0) {
      ptr_01 = (undefined4 *)0x0;
    }
    else {
      if (a->sn != (char *)0x0) goto LAB_00aadcf4;
LAB_00aadcb4:
      ptr_01 = (undefined4 *)0x0;
      if (a->ln == (char **)0x0) goto LAB_00aadcc4;
LAB_00aadd1c:
      puVar2 = CRYPTO_malloc(0x10,"crypto/objects/obj_dat.c",0xc2);
      if (puVar2 != (undefined4 *)0x0) goto joined_r0x00aadccc;
    }
  }
LAB_00aade04:
  ERR_new();
  ERR_set_debug("crypto/objects/obj_dat.c",0xd4,"OBJ_add_object");
  ERR_set_error(8,0xc0100,0);
LAB_00aade34:
  CRYPTO_free(ptr_00);
  CRYPTO_free(ptr_01);
  CRYPTO_free((void *)0x0);
  CRYPTO_free(ptr);
  ASN1_OBJECT_free(a);
  return 0;
}

