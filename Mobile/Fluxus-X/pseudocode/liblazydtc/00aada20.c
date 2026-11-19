/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aada20
 */

ulong FUN_00aada20(int *param_1)

{
  int iVar1;
  undefined8 *puVar2;
  ulong uVar3;
  
  if (DAT_00d22170 != 0) {
    iVar1 = OPENSSL_sk_num(DAT_00d22170);
    if (*param_1 < iVar1) {
      puVar2 = (undefined8 *)OPENSSL_sk_value(DAT_00d22170);
      uVar3 = (*(code *)*puVar2)(*(undefined8 *)(param_1 + 2));
      goto LAB_00aada70;
    }
  }
  uVar3 = ossl_lh_strcasehash(*(undefined8 *)(param_1 + 2));
LAB_00aada70:
  return uVar3 ^ (long)*param_1;
}

