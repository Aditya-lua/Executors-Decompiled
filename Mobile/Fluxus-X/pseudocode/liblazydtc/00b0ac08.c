/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ac08
 */

X509_OBJECT * X509_OBJECT_retrieve_by_subject(stack_st_X509_OBJECT *h,int type,X509_NAME *name)

{
  int iVar1;
  X509_OBJECT *pXVar2;
  undefined8 *puVar3;
  undefined1 auStack_1b0 [24];
  undefined8 auStack_198 [6];
  undefined8 local_168 [39];
  int local_30 [2];
  undefined1 *local_28;
  
  if (type == 0) {
    return (X509_OBJECT *)0x0;
  }
  if (type == 2) {
    puVar3 = auStack_198;
  }
  else {
    if (type != 1) goto LAB_00b0ac68;
    puVar3 = local_168;
  }
  local_28 = auStack_1b0;
  *puVar3 = name;
LAB_00b0ac68:
  local_30[0] = type;
  iVar1 = OPENSSL_sk_find_all(h,local_30,0);
  if (iVar1 == -1) {
    return (X509_OBJECT *)0x0;
  }
  pXVar2 = (X509_OBJECT *)OPENSSL_sk_value(h);
  return pXVar2;
}

