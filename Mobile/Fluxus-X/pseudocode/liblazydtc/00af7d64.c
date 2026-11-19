/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af7d64
 */

undefined8 FUN_00af7d64(long param_1,long param_2,int param_3)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  int iVar4;
  undefined1 auStack_80 [16];
  undefined1 auStack_70 [16];
  undefined1 auStack_60 [16];
  undefined1 auStack_50 [16];
  
  uVar3 = 1;
  if ((param_2 != 0) && (param_1 != param_2)) {
    if (param_1 == 0) {
LAB_00af7e58:
      uVar3 = 0;
    }
    else {
      iVar1 = OPENSSL_sk_num(param_2);
      if (iVar1 < 1) {
        uVar3 = 1;
      }
      else {
        iVar4 = 0;
        iVar1 = 0;
        do {
          uVar3 = OPENSSL_sk_value(param_2,iVar4);
          uVar3 = FUN_00af66d8(uVar3,auStack_70,auStack_80,param_3);
          if ((int)uVar3 == 0) {
            return uVar3;
          }
          while( true ) {
            iVar2 = OPENSSL_sk_num(param_1);
            if (iVar2 <= iVar1) goto LAB_00af7e58;
            uVar3 = OPENSSL_sk_value(param_1,iVar1);
            uVar3 = FUN_00af66d8(uVar3,auStack_50,auStack_60,param_3);
            if ((int)uVar3 == 0) {
              return uVar3;
            }
            iVar2 = memcmp(auStack_60,auStack_80,(long)param_3);
            if (-1 < iVar2) break;
            iVar1 = iVar1 + 1;
          }
          iVar2 = memcmp(auStack_50,auStack_70,(long)param_3);
          if (0 < iVar2) goto LAB_00af7e58;
          iVar4 = iVar4 + 1;
          iVar2 = OPENSSL_sk_num(param_2);
          uVar3 = 1;
        } while (iVar4 < iVar2);
      }
    }
  }
  return uVar3;
}

