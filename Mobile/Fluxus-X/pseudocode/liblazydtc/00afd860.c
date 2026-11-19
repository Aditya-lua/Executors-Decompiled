/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afd860
 */

ulong SCT_LIST_print(undefined8 param_1,BIO *param_2,undefined4 param_3,undefined8 param_4,
                    undefined8 param_5)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  undefined8 uVar4;
  int iVar5;
  
  uVar3 = OPENSSL_sk_num();
  iVar1 = (int)uVar3;
  if (0 < iVar1) {
    iVar5 = 0;
    do {
      uVar4 = OPENSSL_sk_value(param_1,iVar5);
      SCT_print(uVar4,param_2,param_3,param_5);
      uVar3 = OPENSSL_sk_num(param_1);
      if (iVar5 < (int)uVar3 + -1) {
        uVar2 = BIO_printf(param_2,"%s",param_4);
        uVar3 = (ulong)uVar2;
      }
      iVar5 = iVar5 + 1;
    } while (iVar1 != iVar5);
  }
  return uVar3;
}

