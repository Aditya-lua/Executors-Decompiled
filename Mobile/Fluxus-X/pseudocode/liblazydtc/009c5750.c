/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c5750
 */

undefined8
ssl_security_cert_chain(undefined8 param_1,undefined8 param_2,long param_3,undefined4 param_4)

{
  int iVar1;
  undefined8 uVar2;
  int iVar3;
  
  iVar3 = 0;
  if (param_3 == 0) {
    param_3 = OPENSSL_sk_value(param_2,0);
    if (param_3 == 0) {
      return 0xc0103;
    }
    iVar3 = 1;
  }
  uVar2 = ssl_security_cert(param_1,0,param_3,param_4,1);
  if ((int)uVar2 == 1) {
    iVar1 = OPENSSL_sk_num(param_2);
    if (iVar3 < iVar1) {
      do {
        uVar2 = OPENSSL_sk_value(param_2,iVar3);
        uVar2 = ssl_security_cert(param_1,0,uVar2,param_4,0);
        if ((int)uVar2 != 1) {
          return uVar2;
        }
        iVar3 = iVar3 + 1;
        iVar1 = OPENSSL_sk_num(param_2);
      } while (iVar3 < iVar1);
    }
    uVar2 = 1;
  }
  return uVar2;
}

