/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d308
 */

int X509v3_get_ext_by_OBJ(stack_st_X509_EXTENSION *x,ASN1_OBJECT *obj,int lastpos)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  undefined8 *puVar4;
  
  if (x != (stack_st_X509_EXTENSION *)0x0) {
    iVar2 = OPENSSL_sk_num();
    for (uVar1 = lastpos + 1U & ((int)(lastpos + 1U) >> 0x1f ^ 0xffffffffU); (int)uVar1 < iVar2;
        uVar1 = uVar1 + 1) {
      puVar4 = (undefined8 *)OPENSSL_sk_value(x,uVar1);
      iVar3 = OBJ_cmp((ASN1_OBJECT *)*puVar4,obj);
      if (iVar3 == 0) {
        return uVar1;
      }
    }
  }
  return -1;
}

