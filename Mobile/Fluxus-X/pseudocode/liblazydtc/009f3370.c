/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3370
 */

int ASN1_INTEGER_set_int64(ASN1_STRING *param_1,ulong param_2)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined1 auStack_18 [8];
  
  param_1->type = 2;
  if ((long)param_2 < 0) {
    param_2 = -param_2;
    lVar1 = 7;
    do {
      lVar3 = lVar1;
      auStack_18[lVar3] = (char)param_2;
      param_2 = param_2 >> 8;
      lVar1 = lVar3 + -1;
    } while (param_2 != 0);
    iVar2 = 0x102;
  }
  else {
    lVar1 = 7;
    do {
      lVar3 = lVar1;
      auStack_18[lVar3] = (char)param_2;
      param_2 = param_2 >> 8;
      lVar1 = lVar3 + -1;
    } while (param_2 != 0);
    iVar2 = 2;
  }
  param_1->type = iVar2;
  iVar2 = ASN1_STRING_set(param_1,auStack_18 + lVar3,8 - (int)lVar3);
  return iVar2;
}

