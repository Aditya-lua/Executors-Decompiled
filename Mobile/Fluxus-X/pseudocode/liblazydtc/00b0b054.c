/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0b054
 */

int X509_OBJECT_idx_by_subject(stack_st_X509_OBJECT *h,int type,X509_NAME *name)

{
  int iVar1;
  undefined8 *puVar2;
  undefined1 auStack_1b0 [24];
  undefined8 auStack_198 [6];
  undefined8 local_168 [39];
  int local_30 [2];
  undefined1 *local_28;
  
  if (type == 0) {
    return -1;
  }
  if (type == 2) {
    puVar2 = auStack_198;
  }
  else {
    if (type != 1) goto LAB_00b0b0a4;
    puVar2 = local_168;
  }
  local_28 = auStack_1b0;
  *puVar2 = name;
LAB_00b0b0a4:
  local_30[0] = type;
  iVar1 = OPENSSL_sk_find_all(h,local_30,0);
  return iVar1;
}

