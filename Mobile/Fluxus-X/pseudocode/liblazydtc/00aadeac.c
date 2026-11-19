/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aadeac
 */

ASN1_OBJECT * OBJ_nid2obj(int n)

{
  ASN1_OBJECT *pAVar1;
  undefined8 uVar2;
  long lVar3;
  undefined1 auStack_58 [16];
  int local_48;
  undefined4 local_30 [2];
  undefined1 *local_28;
  
  if ((uint)n < 0x4e0) {
    if (n == 0) {
      lVar3 = 0;
    }
    else {
      if (*(int *)(&DAT_00c6da68 + (long)n * 0x28) == 0) {
        ERR_new();
        uVar2 = 0xe3;
        goto LAB_00aadf78;
      }
      lVar3 = (long)n;
    }
    pAVar1 = (ASN1_OBJECT *)(&PTR_s_UNDEF_00c6da58 + lVar3 * 5);
  }
  else {
    OPENSSL_init_crypto(0x40,0);
    if (DAT_00d22188 == 0) {
      return (ASN1_OBJECT *)0x0;
    }
    local_28 = auStack_58;
    local_30[0] = 3;
    local_48 = n;
    lVar3 = OPENSSL_LH_retrieve(DAT_00d22188,local_30);
    if (lVar3 != 0) {
      return *(ASN1_OBJECT **)(lVar3 + 8);
    }
    ERR_new();
    uVar2 = 0xf6;
LAB_00aadf78:
    ERR_set_debug("crypto/objects/obj_dat.c",uVar2,"OBJ_nid2obj");
    ERR_set_error(8,0x65,0);
    pAVar1 = (ASN1_OBJECT *)0x0;
  }
  return pAVar1;
}

