/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b121d0
 */

ulong FUN_00b121d0(long param_1,int param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  X509 *x;
  X509_NAME *pXVar6;
  X509 *a;
  uint uVar7;
  ulong uVar8;
  code *pcVar9;
  long lVar10;
  
  lVar10 = *(long *)(param_1 + 0xf0);
  iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
  if (((((lVar10 == 0) || (iVar1 <= param_2)) || (param_2 < 1)) ||
      (((*(uint *)(lVar10 + 0x28) & 5) == 0 || (*(long *)(param_1 + 0xf0) == 0)))) ||
     (((*(byte *)(*(long *)(param_1 + 0xf0) + 0x28) & 5) == 0 ||
      (lVar4 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),param_2), lVar4 == 0)))) {
LAB_00b1226c:
    if (param_2 < iVar1) {
      iVar3 = param_2;
      do {
        x = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar3);
        iVar2 = X509_check_trust(x,*(int *)(*(long *)(param_1 + 0x20) + 0x24),0);
        if (iVar2 == 1) goto LAB_00b12468;
        if (iVar2 == 2) {
          if (iVar3 < 0) {
            iVar3 = *(int *)(param_1 + 0xac);
          }
          else {
            *(int *)(param_1 + 0xac) = iVar3;
          }
          goto joined_r0x00b12384;
        }
        iVar3 = iVar3 + 1;
      } while (iVar3 < iVar1);
      if (param_2 < iVar1) {
        uVar8 = *(ulong *)(*(long *)(param_1 + 0x20) + 0x18);
        uVar5 = (ulong)((uint)((uVar8 & 0x80000) >> 0x12) ^ 3);
        if (((uint)uVar8 >> 0x13 & 1) == 0) {
          return uVar5;
        }
        if (lVar10 == 0) {
          return uVar5;
        }
LAB_00b1246c:
        iVar1 = OPENSSL_sk_num(*(undefined8 *)(lVar10 + 8));
        if (0 < iVar1) {
          if (*(int *)(lVar10 + 0x30) < 0) {
            *(int *)(lVar10 + 0x30) = param_2;
          }
          return (ulong)(*(uint *)(lVar10 + 0x2c) >> 0x1e | 1);
        }
        goto LAB_00b12498;
      }
    }
    if ((iVar1 == param_2) && ((*(byte *)(*(long *)(param_1 + 0x20) + 0x1a) >> 3 & 1) != 0)) {
      x = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),0);
      ERR_set_mark();
      pcVar9 = *(code **)(param_1 + 0x78);
      pXVar6 = X509_get_subject_name(x);
      lVar4 = (*pcVar9)(param_1,pXVar6);
      ERR_pop_to_mark();
      if (lVar4 == 0) {
LAB_00b12444:
        uVar5 = 0xffffffff;
      }
      else {
        iVar1 = OPENSSL_sk_num(lVar4);
        if (0 < iVar1) {
          iVar1 = 0;
LAB_00b12344:
          a = (X509 *)OPENSSL_sk_value(lVar4,iVar1);
          iVar3 = X509_cmp(a,x);
          if (iVar3 != 0) goto code_r0x00b12360;
          if (a != (X509 *)0x0) {
            iVar1 = X509_up_ref(a);
            OPENSSL_sk_pop_free(lVar4,X509_free);
            if (iVar1 != 0) {
              iVar1 = X509_check_trust(a,*(int *)(*(long *)(param_1 + 0x20) + 0x24),0);
              if (iVar1 == 2) {
                X509_free(a);
                iVar3 = 0;
                *(undefined4 *)(param_1 + 0xac) = 0;
joined_r0x00b12384:
                if (x == (X509 *)0x0) {
                  x = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar3);
                }
                *(X509 **)(param_1 + 0xb8) = x;
                *(undefined4 *)(param_1 + 0xb0) = 0x1c;
                iVar1 = (**(code **)(param_1 + 0x38))(0,param_1);
                uVar7 = 2;
                if (iVar1 != 0) {
                  uVar7 = 3;
                }
                return (ulong)uVar7;
              }
              OPENSSL_sk_set(*(undefined8 *)(param_1 + 0x98),0,a);
              X509_free(x);
              *(undefined4 *)(param_1 + 0x94) = 0;
LAB_00b12468:
              if (lVar10 != 0) goto LAB_00b1246c;
              goto LAB_00b12498;
            }
            goto LAB_00b12444;
          }
        }
LAB_00b1242c:
        OPENSSL_sk_pop_free(lVar4,X509_free);
        uVar5 = 3;
      }
    }
    else {
      uVar5 = 3;
    }
  }
  else {
    uVar5 = FUN_00b11eb4(param_1,lVar4,param_2);
    if ((int)uVar5 < 0) {
      return uVar5;
    }
    if ((int)uVar5 == 0) goto LAB_00b1226c;
    *(int *)(param_1 + 0x94) = param_2 + -1;
LAB_00b12498:
    uVar5 = 1;
  }
  return uVar5;
code_r0x00b12360:
  iVar1 = iVar1 + 1;
  iVar3 = OPENSSL_sk_num(lVar4);
  if (iVar3 <= iVar1) goto LAB_00b1242c;
  goto LAB_00b12344;
}

