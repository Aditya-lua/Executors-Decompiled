/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b139bc
 */

long * ossl_policy_level_find_node(long param_1,long param_2,ASN1_OBJECT *param_3)

{
  int iVar1;
  int iVar2;
  long *plVar3;
  
  iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 8));
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      plVar3 = (long *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 8),iVar1);
      if ((plVar3[1] == param_2) &&
         (iVar2 = OBJ_cmp(*(ASN1_OBJECT **)(*plVar3 + 8),param_3), iVar2 == 0)) {
        return plVar3;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 8));
    } while (iVar1 < iVar2);
  }
  return (long *)0x0;
}

