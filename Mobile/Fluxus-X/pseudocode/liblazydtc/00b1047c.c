/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1047c
 */

undefined8 FUN_00b1047c(long param_1)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  
  if (*(long *)(param_1 + 0xd8) != 0) {
    return 1;
  }
  if ((*(int *)(param_1 + 0xf8) == 0) ||
     (iVar2 = OPENSSL_sk_push(*(undefined8 *)(param_1 + 0x98),0), iVar2 != 0)) {
    iVar2 = X509_policy_check((X509_POLICY_TREE **)(param_1 + 0xa0),(int *)(param_1 + 0xa8),
                              *(stack_st_X509 **)(param_1 + 0x98),
                              *(stack_st_ASN1_OBJECT **)(*(long *)(param_1 + 0x20) + 0x30),
                              *(uint *)(*(long *)(param_1 + 0x20) + 0x18));
    if (*(int *)(param_1 + 0xf8) != 0) {
      OPENSSL_sk_pop(*(undefined8 *)(param_1 + 0x98));
    }
    switch(iVar2) {
    case 0:
      goto switchD_00b10510_caseD_0;
    case 1:
      if ((*(byte *)(*(long *)(param_1 + 0x20) + 0x19) >> 3 & 1) == 0) {
        return 1;
      }
      *(undefined8 *)(param_1 + 0xb8) = 0;
      uVar5 = (**(code **)(param_1 + 0x38))(2,param_1);
      if ((int)uVar5 == 0) {
        return uVar5;
      }
      return 1;
    case -2:
      *(undefined8 *)(param_1 + 0xb8) = 0;
      *(undefined4 *)(param_1 + 0xb0) = 0x2b;
                    /* WARNING: Could not recover jumptable at 0x00b10538. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar5 = (**(code **)(param_1 + 0x38))(0,param_1);
      return uVar5;
    case -1:
      iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
      if (0 < iVar2) {
        bVar1 = false;
        iVar2 = 0;
        do {
          lVar4 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar2);
          if ((*(uint *)(lVar4 + 0xe8) & 0x800) != 0) {
            bVar1 = true;
          }
          if ((*(uint *)(lVar4 + 0xe8) >> 0xb & 1) != 0) {
            *(int *)(param_1 + 0xac) = iVar2;
            if (lVar4 == 0) {
              lVar4 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar2);
            }
            *(long *)(param_1 + 0xb8) = lVar4;
            *(undefined4 *)(param_1 + 0xb0) = 0x2a;
            uVar5 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar5 == 0) {
              return uVar5;
            }
          }
          iVar2 = iVar2 + 1;
          iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
        } while (iVar2 < iVar3);
        if (bVar1) {
          return 1;
        }
      }
      ERR_new();
      uVar5 = 0x686;
      break;
    default:
      ERR_new();
      uVar5 = 0x692;
    }
    ERR_set_debug("crypto/x509/x509_vfy.c",uVar5,"check_policy");
    ERR_set_error(0xb,0xc0103,0);
    uVar5 = 0;
  }
  else {
switchD_00b10510_caseD_0:
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0x6a5,"check_policy");
    ERR_set_error(0xb,0xc0100,0);
    uVar5 = 0xffffffff;
    *(undefined4 *)(param_1 + 0xb0) = 0x11;
  }
  return uVar5;
}

