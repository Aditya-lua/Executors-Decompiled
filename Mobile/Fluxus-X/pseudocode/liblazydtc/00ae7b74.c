/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7b74
 */

undefined8 * SRP_VBASE_get_by_user(undefined8 *param_1,char *param_2)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  
  if ((param_1 != (undefined8 *)0x0) && (iVar1 = OPENSSL_sk_num(*param_1), 0 < iVar1)) {
    iVar1 = 0;
    do {
      puVar3 = (undefined8 *)OPENSSL_sk_value(*param_1,iVar1);
      iVar2 = strcmp((char *)*puVar3,param_2);
      if (iVar2 == 0) {
        return puVar3;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(*param_1);
    } while (iVar1 < iVar2);
  }
  return (undefined8 *)0x0;
}

