/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aae250
 */

ASN1_OBJECT * OBJ_txt2obj(char *s,int no_name)

{
  int iVar1;
  int num;
  uchar *ptr;
  ASN1_OBJECT *pAVar2;
  long lVar3;
  uint *puVar4;
  undefined8 uVar5;
  undefined **ppuVar6;
  uchar *local_70;
  uchar **local_68;
  uchar **local_60;
  uchar *local_58;
  char *local_50;
  
  if (no_name == 0) {
    local_60 = &local_58;
    OPENSSL_init_crypto(0x40,0);
    local_58 = (uchar *)s;
    if (DAT_00d22188 == 0) {
LAB_00aae36c:
      puVar4 = (uint *)ossl_bsearch(&local_60,&DAT_00770ef8,0x4d7,4,&LAB_00aaf0a8,0);
      iVar1 = 0;
      if (puVar4 != (uint *)0x0) {
        ppuVar6 = &PTR_s_UNDEF_00c6da58 + (ulong)*puVar4 * 5;
        goto LAB_00aae3a8;
      }
    }
    else {
      local_70 = (uchar *)CONCAT44(local_70._4_4_,1);
      local_68 = &local_58;
      lVar3 = OPENSSL_LH_retrieve(DAT_00d22188,&local_70);
      if (lVar3 == 0) goto LAB_00aae36c;
      ppuVar6 = *(undefined ***)(lVar3 + 8);
LAB_00aae3a8:
      iVar1 = *(int *)(ppuVar6 + 2);
    }
    if (iVar1 == 0) {
      local_60 = &local_58;
      OPENSSL_init_crypto(0x40,0);
      local_50 = s;
      if (DAT_00d22188 == 0) {
LAB_00aae428:
        puVar4 = (uint *)ossl_bsearch(&local_60,&DAT_0076fb9c,0x4d7,4,&LAB_00aaf080,0);
        iVar1 = 0;
        if (puVar4 != (uint *)0x0) {
          ppuVar6 = &PTR_s_UNDEF_00c6da58 + (ulong)*puVar4 * 5;
          goto LAB_00aae464;
        }
      }
      else {
        local_70 = (uchar *)CONCAT44(local_70._4_4_,2);
        local_68 = &local_58;
        lVar3 = OPENSSL_LH_retrieve(DAT_00d22188,&local_70);
        if (lVar3 == 0) goto LAB_00aae428;
        ppuVar6 = *(undefined ***)(lVar3 + 8);
LAB_00aae464:
        iVar1 = *(int *)(ppuVar6 + 2);
      }
      if (iVar1 == 0) {
        iVar1 = ossl_isdigit(*s);
        if (iVar1 != 0) goto LAB_00aae26c;
        ERR_new();
        ERR_set_debug("crypto/objects/obj_dat.c",0x178,"OBJ_txt2obj");
        uVar5 = 0x67;
        goto LAB_00aae418;
      }
    }
    pAVar2 = OBJ_nid2obj(iVar1);
  }
  else {
LAB_00aae26c:
    iVar1 = a2d_ASN1_OBJECT((uchar *)0x0,0,s,-1);
    if ((iVar1 < 1) || (num = ASN1_object_size(0,iVar1,6), num < 0)) {
      return (ASN1_OBJECT *)0x0;
    }
    ptr = CRYPTO_malloc(num,"crypto/objects/obj_dat.c",0x18b);
    if (ptr != (uchar *)0x0) {
      local_58 = ptr;
      ASN1_put_object(&local_58,0,iVar1,6,0);
      a2d_ASN1_OBJECT(local_58,iVar1,s,-1);
      local_70 = ptr;
      pAVar2 = d2i_ASN1_OBJECT((ASN1_OBJECT **)0x0,&local_70,(long)num);
      CRYPTO_free(ptr);
      return pAVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/objects/obj_dat.c",0x18c,"OBJ_txt2obj");
    uVar5 = 0xc0100;
LAB_00aae418:
    ERR_set_error(8,uVar5,0);
    pAVar2 = (ASN1_OBJECT *)0x0;
  }
  return pAVar2;
}

