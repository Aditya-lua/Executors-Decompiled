/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af7b8c
 */

undefined8 X509v3_addr_subset(long param_1,long param_2)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  uint *puVar9;
  undefined1 *puVar10;
  
  uVar4 = 1;
  if ((param_1 != 0) && (param_1 != param_2)) {
    if (param_2 == 0) {
LAB_00af7d44:
      uVar4 = 0;
    }
    else {
      iVar1 = OPENSSL_sk_num(param_1);
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          lVar5 = OPENSSL_sk_value(param_1,iVar1);
          if (**(int **)(lVar5 + 8) == 0) goto LAB_00af7d44;
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(param_1);
        } while (iVar1 < iVar2);
      }
      iVar1 = OPENSSL_sk_num(param_2);
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          lVar5 = OPENSSL_sk_value(param_2,iVar1);
          if (**(int **)(lVar5 + 8) == 0) goto LAB_00af7d44;
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(param_2);
        } while (iVar1 < iVar2);
      }
      OPENSSL_sk_set_cmp_func(param_2,&LAB_00af6bf8);
      iVar1 = OPENSSL_sk_num(param_1);
      if (iVar1 < 1) {
        uVar4 = 1;
      }
      else {
        iVar1 = 0;
        do {
          puVar6 = (undefined8 *)OPENSSL_sk_value(param_1,iVar1);
          uVar3 = OPENSSL_sk_find(param_2,puVar6);
          puVar7 = (undefined8 *)OPENSSL_sk_value(param_2,uVar3);
          if (puVar7 == (undefined8 *)0x0) {
            return 0;
          }
          if ((*(uint *)*puVar6 & 0xfffffffe) != 2) goto LAB_00af7d44;
          puVar9 = (uint *)*puVar7;
          if ((*puVar9 & 0xfffffffe) != 2) goto LAB_00af7d44;
          uVar4 = *(undefined8 *)(puVar7[1] + 8);
          uVar8 = *(undefined8 *)(puVar6[1] + 8);
          if (puVar9 == (uint *)0x0) {
LAB_00af7d10:
            uVar4 = FUN_00af7d64(uVar4,uVar8,0);
            iVar2 = (int)uVar4;
          }
          else if ((int)*puVar9 < 2) {
            uVar4 = FUN_00af7d64(uVar4,uVar8,0);
            iVar2 = (int)uVar4;
          }
          else {
            puVar10 = *(undefined1 **)(puVar9 + 2);
            if (puVar10 == (undefined1 *)0x0) goto LAB_00af7d10;
            iVar2 = 0x10;
            if (CONCAT11(*puVar10,puVar10[1]) != 2) {
              iVar2 = (uint)(CONCAT11(*puVar10,puVar10[1]) == 1) << 2;
            }
            uVar4 = FUN_00af7d64(uVar4,uVar8,iVar2);
            iVar2 = (int)uVar4;
          }
          if (iVar2 == 0) {
            return uVar4;
          }
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(param_1);
          uVar4 = 1;
        } while (iVar1 < iVar2);
      }
    }
  }
  return uVar4;
}

