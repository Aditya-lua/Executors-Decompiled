/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f351c
 */

int ASN1_INTEGER_set_uint64(ASN1_STRING *param_1,ulong param_2)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined1 local_11;
  
  param_1->type = 2;
  lVar1 = 0;
  do {
    lVar3 = lVar1;
    (&local_11)[lVar3] = (char)param_2;
    param_2 = param_2 >> 8;
    lVar1 = lVar3 + -1;
  } while (param_2 != 0);
  iVar2 = ASN1_STRING_set(param_1,&local_11 + lVar3,-(int)(lVar3 + -1));
  return iVar2;
}

