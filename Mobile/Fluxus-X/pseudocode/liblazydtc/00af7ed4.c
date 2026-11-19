/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af7ed4
 */

undefined8 FUN_00af7ed4(long param_1,long param_2,long param_3)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  uint *puVar10;
  undefined1 *puVar11;
  long lVar12;
  
  if ((param_2 == 0) || (iVar1 = OPENSSL_sk_num(param_2), iVar1 < 1)) {
    if (param_1 == 0) {
      return 0;
    }
LAB_00af7f3c:
    *(undefined4 *)(param_1 + 0xb0) = 1;
    return 0;
  }
  if ((param_1 == 0) && (param_3 == 0)) {
    return 0;
  }
  if ((param_1 != 0) && (*(long *)(param_1 + 0x38) == 0)) goto LAB_00af7f3c;
  if (param_3 == 0) {
    lVar12 = OPENSSL_sk_value(param_2,0);
    param_3 = *(long *)(lVar12 + 0x128);
    if (param_3 == 0) {
      return 1;
    }
    iVar1 = 0;
  }
  else {
    lVar12 = 0;
    iVar1 = -1;
  }
  iVar2 = X509v3_addr_is_canonical(param_3);
  if (iVar2 == 0) {
    if (param_1 != 0) {
      *(int *)(param_1 + 0xac) = iVar1;
      *(undefined4 *)(param_1 + 0xb0) = 0x29;
      *(long *)(param_1 + 0xb8) = lVar12;
      iVar2 = (**(code **)(param_1 + 0x38))(0,param_1);
      if (iVar2 != 0) goto LAB_00af7f7c;
    }
    uVar8 = 0;
    lVar5 = 0;
  }
  else {
LAB_00af7f7c:
    OPENSSL_sk_set_cmp_func(param_3,&LAB_00af6bf8);
    lVar5 = OPENSSL_sk_dup(param_3);
    if (lVar5 == 0) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_addr.c",0x4df,"addr_validate_path_internal");
      ERR_set_error(0x22,0xc0100,0);
      uVar8 = 0;
      if (param_1 != 0) {
        *(undefined4 *)(param_1 + 0xb0) = 0x11;
      }
    }
    else {
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_2);
      if (iVar1 < iVar2) {
LAB_00af7fbc:
        lVar12 = OPENSSL_sk_value(param_2,iVar1);
        iVar2 = X509v3_addr_is_canonical(*(undefined8 *)(lVar12 + 0x128));
        if (iVar2 == 0) {
          if (param_1 == 0) goto LAB_00af82fc;
          *(int *)(param_1 + 0xac) = iVar1;
          *(undefined4 *)(param_1 + 0xb0) = 0x29;
          *(long *)(param_1 + 0xb8) = lVar12;
          iVar2 = (**(code **)(param_1 + 0x38))(0,param_1);
          if (iVar2 == 0) goto LAB_00af82fc;
        }
        if (*(long *)(lVar12 + 0x128) == 0) {
          iVar2 = OPENSSL_sk_num(lVar5);
          if (0 < iVar2) {
            iVar2 = 0;
            do {
              puVar6 = (undefined8 *)OPENSSL_sk_value(lVar5,iVar2);
              if ((*(uint *)*puVar6 & 0xfffffffe) != 2) goto LAB_00af82fc;
              if (*(int *)puVar6[1] != 0) goto LAB_00af81c0;
              iVar2 = iVar2 + 1;
              iVar4 = OPENSSL_sk_num(lVar5);
            } while (iVar2 < iVar4);
          }
        }
        else {
          OPENSSL_sk_set_cmp_func(*(long *)(lVar12 + 0x128),&LAB_00af6bf8);
          iVar2 = OPENSSL_sk_num(lVar5);
          if (0 < iVar2) {
            iVar2 = 0;
            do {
              puVar6 = (undefined8 *)OPENSSL_sk_value(lVar5,iVar2);
              uVar3 = OPENSSL_sk_find(*(undefined8 *)(lVar12 + 0x128),puVar6);
              puVar7 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(lVar12 + 0x128),uVar3);
              if (puVar7 == (undefined8 *)0x0) {
                if (*(int *)puVar6[1] == 1) goto LAB_00af81c0;
              }
              else {
                puVar10 = (uint *)*puVar6;
                if (((*puVar10 & 0xfffffffe) != 2) || ((*(uint *)*puVar7 & 0xfffffffe) != 2))
                goto LAB_00af82fc;
                if (*(int *)puVar7[1] == 1) {
                  if (*(int *)puVar6[1] != 0) {
                    uVar8 = *(undefined8 *)((int *)puVar7[1] + 2);
                    uVar9 = *(undefined8 *)((int *)puVar6[1] + 2);
                    if (puVar10 == (uint *)0x0) {
LAB_00af8190:
                      iVar4 = FUN_00af7d64(uVar8,uVar9,0);
                    }
                    else if ((int)*puVar10 < 2) {
                      iVar4 = FUN_00af7d64(uVar8,uVar9,0);
                    }
                    else {
                      puVar11 = *(undefined1 **)(puVar10 + 2);
                      if (puVar11 == (undefined1 *)0x0) goto LAB_00af8190;
                      iVar4 = 0x10;
                      if (CONCAT11(*puVar11,puVar11[1]) != 2) {
                        iVar4 = (uint)(CONCAT11(*puVar11,puVar11[1]) == 1) << 2;
                      }
                      iVar4 = FUN_00af7d64(uVar8,uVar9,iVar4);
                    }
                    if (iVar4 == 0) {
                      if (param_1 != 0) {
                        *(int *)(param_1 + 0xac) = iVar1;
                        *(undefined4 *)(param_1 + 0xb0) = 0x2e;
                        *(long *)(param_1 + 0xb8) = lVar12;
                        iVar4 = (**(code **)(param_1 + 0x38))(0,param_1);
                        if (iVar4 != 0) goto LAB_00af81a8;
                      }
                      goto LAB_00af82fc;
                    }
                  }
                  OPENSSL_sk_set(lVar5,iVar2,puVar7);
                }
              }
LAB_00af81a8:
              iVar2 = iVar2 + 1;
              iVar4 = OPENSSL_sk_num(lVar5);
            } while (iVar2 < iVar4);
          }
        }
        goto LAB_00af81e0;
      }
LAB_00af81f4:
      if ((*(long *)(lVar12 + 0x128) != 0) && (iVar2 = OPENSSL_sk_num(), 0 < iVar2)) {
        iVar2 = 0;
        do {
          puVar6 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(lVar12 + 0x128),iVar2);
          if ((*(uint *)*puVar6 & 0xfffffffe) != 2) goto LAB_00af82fc;
          if ((*(int *)puVar6[1] == 0) && (iVar4 = OPENSSL_sk_find(lVar5,puVar6), -1 < iVar4)) {
            if (param_1 == 0) goto LAB_00af82fc;
            *(int *)(param_1 + 0xac) = iVar1;
            *(undefined4 *)(param_1 + 0xb0) = 0x2e;
            *(long *)(param_1 + 0xb8) = lVar12;
            iVar4 = (**(code **)(param_1 + 0x38))(0,param_1);
            if (iVar4 == 0) goto LAB_00af82fc;
          }
          iVar2 = iVar2 + 1;
          iVar4 = OPENSSL_sk_num(*(undefined8 *)(lVar12 + 0x128));
        } while (iVar2 < iVar4);
      }
      uVar8 = 1;
    }
  }
LAB_00af8300:
  OPENSSL_sk_free(lVar5);
  return uVar8;
LAB_00af81c0:
  if (param_1 == 0) goto LAB_00af82fc;
  *(int *)(param_1 + 0xac) = iVar1;
  *(undefined4 *)(param_1 + 0xb0) = 0x2e;
  *(long *)(param_1 + 0xb8) = lVar12;
  iVar2 = (**(code **)(param_1 + 0x38))(0,param_1);
  if (iVar2 == 0) goto LAB_00af82fc;
LAB_00af81e0:
  iVar1 = iVar1 + 1;
  iVar2 = OPENSSL_sk_num(param_2);
  if (iVar2 <= iVar1) goto LAB_00af81f4;
  goto LAB_00af7fbc;
LAB_00af82fc:
  uVar8 = 0;
  goto LAB_00af8300;
}

