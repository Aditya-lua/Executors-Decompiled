/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb384
 */

stack_st_PKCS12_SAFEBAG * PKCS12_unpack_p7encdata(PKCS7 *p7,char *pass,int passlen)

{
  int iVar1;
  stack_st_PKCS12_SAFEBAG *psVar2;
  undefined8 uVar3;
  char **ppcVar4;
  
  iVar1 = OBJ_obj2nid(p7->type);
  psVar2 = (stack_st_PKCS12_SAFEBAG *)0x0;
  if (iVar1 == 0x1a) {
    if ((p7->d).sign == (PKCS7_SIGNED *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_add.c",0xa1,"PKCS12_unpack_p7encdata");
      ERR_set_error(0x23,0x65,0);
      psVar2 = (stack_st_PKCS12_SAFEBAG *)0x0;
    }
    else {
      ppcVar4 = (((p7->d).sign)->md_algs->stack).data;
      uVar3 = PKCS12_SAFEBAGS_it();
      psVar2 = (stack_st_PKCS12_SAFEBAG *)
               PKCS12_item_decrypt_d2i_ex
                         (ppcVar4,uVar3,pass,passlen,((p7->d).digest)->md[1].algorithm,1,p7[1].asn1,
                          p7[1].length);
    }
  }
  return psVar2;
}

