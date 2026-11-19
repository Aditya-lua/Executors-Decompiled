/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3d148
 */

undefined8 FUN_00a3d148(void)

{
  ASN1_OBJECT *pAVar1;
  X509_ALGOR *in_x3;
  X509_ALGOR *in_x4;
  
  pAVar1 = OBJ_nid2obj(0x440);
  X509_ALGOR_set0(in_x3,pAVar1,-1,(void *)0x0);
  if (in_x4 != (X509_ALGOR *)0x0) {
    pAVar1 = OBJ_nid2obj(0x440);
    X509_ALGOR_set0(in_x4,pAVar1,-1,(void *)0x0);
  }
  return 3;
}

