/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afa190
 */

undefined8 FUN_00afa190(long param_1,long param_2)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  int *piVar4;
  int iVar5;
  ASN1_INTEGER *y;
  ASN1_INTEGER *y_00;
  ASN1_INTEGER *x;
  ASN1_INTEGER *x_00;
  
  uVar3 = 1;
  if ((param_2 != 0) && (param_1 != param_2)) {
    if (param_1 == 0) {
LAB_00afa298:
      uVar3 = 0;
    }
    else {
      iVar1 = OPENSSL_sk_num(param_2);
      if (iVar1 < 1) {
        uVar3 = 1;
      }
      else {
        iVar5 = 0;
        iVar1 = 0;
        do {
          piVar4 = (int *)OPENSSL_sk_value(param_2,iVar5);
          if (piVar4 == (int *)0x0) {
            return 0;
          }
          if (*piVar4 == 1) {
            y = (ASN1_INTEGER *)**(undefined8 **)(piVar4 + 2);
            y_00 = (ASN1_INTEGER *)(*(undefined8 **)(piVar4 + 2))[1];
          }
          else {
            if (*piVar4 != 0) goto LAB_00afa298;
            y = *(ASN1_INTEGER **)(piVar4 + 2);
            y_00 = y;
          }
          while( true ) {
            iVar2 = OPENSSL_sk_num(param_1);
            if (iVar2 <= iVar1) goto LAB_00afa298;
            piVar4 = (int *)OPENSSL_sk_value(param_1,iVar1);
            if (piVar4 == (int *)0x0) {
              return 0;
            }
            if (*piVar4 == 1) {
              x_00 = (ASN1_INTEGER *)**(undefined8 **)(piVar4 + 2);
              x = (ASN1_INTEGER *)(*(undefined8 **)(piVar4 + 2))[1];
            }
            else {
              if (*piVar4 != 0) goto LAB_00afa298;
              x = *(ASN1_INTEGER **)(piVar4 + 2);
              x_00 = x;
            }
            iVar2 = ASN1_INTEGER_cmp(x,y_00);
            if (-1 < iVar2) break;
            iVar1 = iVar1 + 1;
          }
          iVar2 = ASN1_INTEGER_cmp(x_00,y);
          if (0 < iVar2) goto LAB_00afa298;
          iVar5 = iVar5 + 1;
          iVar2 = OPENSSL_sk_num(param_2);
          uVar3 = 1;
        } while (iVar5 < iVar2);
      }
    }
  }
  return uVar3;
}

