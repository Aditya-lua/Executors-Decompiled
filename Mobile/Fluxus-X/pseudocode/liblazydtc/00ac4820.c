/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac4820
 */

void FUN_00ac4820(undefined8 param_1,undefined4 *param_2,undefined8 *param_3)

{
  int iVar1;
  long lVar2;
  int iVar3;
  
  iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_2 + 2));
  if (0 < iVar1) {
    iVar3 = 0;
    do {
      lVar2 = OPENSSL_sk_value(*(undefined8 *)(param_2 + 2),iVar3);
      (*(code *)*param_3)(*param_2,*(undefined8 *)(lVar2 + 0x10),param_3[1]);
      iVar3 = iVar3 + 1;
    } while (iVar1 != iVar3);
  }
  return;
}

