/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ac75c
 */

undefined8 ssl_cert_select_current(long *param_1,X509 *param_2)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  int iVar4;
  X509 *a;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  long *plVar8;
  long *plVar9;
  long *plVar10;
  long *plVar11;
  
  if (param_2 == (X509 *)0x0) {
LAB_009ac940:
    uVar5 = 0;
  }
  else {
    plVar8 = param_1 + 4;
    a = (X509 *)*plVar8;
    if ((a != param_2) || (param_1[5] == 0)) {
      plVar6 = param_1 + 9;
      if (((X509 *)*plVar6 == param_2) && (param_1[10] != 0)) {
        plVar8 = plVar6;
      }
      else {
        plVar11 = param_1 + 0xe;
        if (((X509 *)*plVar11 == param_2) && (param_1[0xf] != 0)) {
          plVar8 = plVar11;
        }
        else {
          plVar10 = param_1 + 0x13;
          if (((X509 *)*plVar10 == param_2) && (param_1[0x14] != 0)) {
            plVar8 = plVar10;
          }
          else {
            plVar9 = param_1 + 0x18;
            if (((X509 *)*plVar9 == param_2) && (param_1[0x19] != 0)) {
              plVar8 = plVar9;
            }
            else {
              plVar7 = param_1 + 0x1d;
              if (((X509 *)*plVar7 == param_2) && (param_1[0x1e] != 0)) {
                plVar8 = plVar7;
              }
              else {
                plVar1 = param_1 + 0x22;
                if (((X509 *)param_1[0x22] == param_2) && (param_1[0x23] != 0)) {
                  plVar8 = plVar1;
                }
                else {
                  plVar2 = param_1 + 0x27;
                  if (((X509 *)param_1[0x27] == param_2) && (param_1[0x28] != 0)) {
                    plVar8 = plVar2;
                  }
                  else {
                    plVar3 = param_1 + 0x2c;
                    if (((X509 *)param_1[0x2c] == param_2) && (param_1[0x2d] != 0)) {
                      plVar8 = plVar3;
                    }
                    else if ((((((param_1[5] == 0) ||
                                ((a == (X509 *)0x0 || (iVar4 = X509_cmp(a,param_2), iVar4 != 0))))
                               && ((param_1[10] == 0 ||
                                   (((X509 *)*plVar6 == (X509 *)0x0 ||
                                    (iVar4 = X509_cmp((X509 *)*plVar6,param_2), plVar8 = plVar6,
                                    iVar4 != 0)))))) &&
                              ((param_1[0xf] == 0 ||
                               (((X509 *)*plVar11 == (X509 *)0x0 ||
                                (iVar4 = X509_cmp((X509 *)*plVar11,param_2), plVar8 = plVar11,
                                iVar4 != 0)))))) &&
                             ((param_1[0x14] == 0 ||
                              (((X509 *)*plVar10 == (X509 *)0x0 ||
                               (iVar4 = X509_cmp((X509 *)*plVar10,param_2), plVar8 = plVar10,
                               iVar4 != 0)))))) &&
                            ((((param_1[0x19] == 0 ||
                               (((X509 *)*plVar9 == (X509 *)0x0 ||
                                (iVar4 = X509_cmp((X509 *)*plVar9,param_2), plVar8 = plVar9,
                                iVar4 != 0)))) &&
                              ((param_1[0x1e] == 0 ||
                               (((X509 *)*plVar7 == (X509 *)0x0 ||
                                (iVar4 = X509_cmp((X509 *)*plVar7,param_2), plVar8 = plVar7,
                                iVar4 != 0)))))) &&
                             (((param_1[0x23] == 0 ||
                               (((X509 *)*plVar1 == (X509 *)0x0 ||
                                (iVar4 = X509_cmp((X509 *)*plVar1,param_2), plVar8 = plVar1,
                                iVar4 != 0)))) &&
                              ((param_1[0x28] == 0 ||
                               (((X509 *)*plVar2 == (X509 *)0x0 ||
                                (iVar4 = X509_cmp((X509 *)*plVar2,param_2), plVar8 = plVar2,
                                iVar4 != 0)))))))))) {
                      if (param_1[0x2d] == 0) goto LAB_009ac940;
                      if ((X509 *)*plVar3 == (X509 *)0x0) {
                        return 0;
                      }
                      iVar4 = X509_cmp((X509 *)*plVar3,param_2);
                      plVar8 = plVar3;
                      if (iVar4 != 0) {
                        return 0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    uVar5 = 1;
    *param_1 = (long)plVar8;
  }
  return uVar5;
}

