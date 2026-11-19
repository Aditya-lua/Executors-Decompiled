/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe23c
 */

undefined8
FUN_00abe23c(undefined4 param_1,undefined8 *param_2,undefined8 param_3,undefined8 *param_4)

{
  int iVar1;
  BIO *pBVar2;
  
  switch(param_1) {
  case 10:
    iVar1 = PKCS7_stream((uchar ***)(param_4 + 2),(PKCS7 *)*param_2);
    if (iVar1 < 1) {
      return 0;
    }
  case 0xc:
    pBVar2 = PKCS7_dataInit((PKCS7 *)*param_2,(BIO *)*param_4);
    param_4[1] = pBVar2;
    if (pBVar2 == (BIO *)0x0) {
      return 0;
    }
    break;
  case 0xb:
  case 0xd:
    iVar1 = PKCS7_dataFinal((PKCS7 *)*param_2,(BIO *)param_4[1]);
    if (iVar1 < 1) {
      return 0;
    }
  }
  return 1;
}

