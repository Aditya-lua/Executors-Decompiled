/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af6d64
 */

ulong X509v3_addr_canonize(undefined8 param_1)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  undefined8 *puVar7;
  ASN1_VALUE *val;
  ASN1_VALUE *val_00;
  ulong uVar8;
  int *piVar9;
  uint *puVar10;
  undefined1 *puVar11;
  size_t sVar12;
  size_t __n;
  undefined8 uVar13;
  undefined8 local_a8;
  undefined1 auStack_a0 [15];
  char acStack_91 [17];
  undefined1 auStack_80 [16];
  undefined1 auStack_70 [16];
  
  iVar3 = OPENSSL_sk_num();
  if (0 < iVar3) {
    iVar3 = 0;
    do {
      puVar7 = (undefined8 *)OPENSSL_sk_value(param_1,iVar3);
      puVar10 = (uint *)*puVar7;
      if ((*puVar10 & 0xfffffffe) != 2) {
        return 0;
      }
      if (*(int *)puVar7[1] == 1) {
        uVar13 = *(undefined8 *)((int *)puVar7[1] + 2);
        if ((puVar10 == (uint *)0x0) || ((int)*puVar10 < 2)) {
          __n = 0;
        }
        else {
          puVar11 = *(undefined1 **)(puVar10 + 2);
          __n = 0;
          if (puVar11 != (undefined1 *)0x0) {
            uVar1 = 0x10;
            if (CONCAT11(*puVar11,puVar11[1]) != 2) {
              uVar1 = (uint)(CONCAT11(*puVar11,puVar11[1]) == 1) << 2;
            }
            __n = (size_t)uVar1;
          }
        }
        OPENSSL_sk_sort(uVar13);
        iVar4 = OPENSSL_sk_num(uVar13);
        if (1 < iVar4) {
          iVar4 = 0;
          do {
            val = (ASN1_VALUE *)OPENSSL_sk_value(uVar13,iVar4);
            iVar6 = iVar4 + 1;
            val_00 = (ASN1_VALUE *)OPENSSL_sk_value(uVar13,iVar6);
            iVar5 = FUN_00af66d8(val,auStack_70,auStack_80,__n);
            if (iVar5 == 0) {
              return 0;
            }
            iVar5 = FUN_00af66d8(val_00,acStack_91 + 1,auStack_a0,__n);
            if (iVar5 == 0) {
              return 0;
            }
            iVar5 = memcmp(auStack_70,auStack_80,__n);
            if (0 < iVar5) {
              return 0;
            }
            iVar5 = memcmp(acStack_91 + 1,auStack_a0,__n);
            if (0 < iVar5) {
              return 0;
            }
            iVar5 = memcmp(auStack_80,acStack_91 + 1,__n);
            if (-1 < iVar5) {
              return 0;
            }
            sVar12 = __n;
            do {
              if ((long)sVar12 < 1) break;
              cVar2 = acStack_91[sVar12];
              acStack_91[sVar12] = cVar2 + -1;
              sVar12 = sVar12 - 1;
            } while (cVar2 == '\0');
            iVar5 = memcmp(auStack_80,acStack_91 + 1,__n);
            if (iVar5 == 0) {
              uVar8 = FUN_00af63d8(&local_a8,auStack_70,auStack_a0,__n);
              if ((int)uVar8 == 0) {
                return uVar8;
              }
              OPENSSL_sk_set(uVar13,iVar4,local_a8);
              OPENSSL_sk_delete(uVar13,iVar6);
              ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c7e788);
              ASN1_item_free(val_00,(ASN1_ITEM *)&DAT_00c7e788);
            }
            else {
              iVar4 = iVar6;
            }
            iVar6 = OPENSSL_sk_num(uVar13);
          } while (iVar4 < iVar6 + -1);
        }
        iVar4 = OPENSSL_sk_num(uVar13);
        piVar9 = (int *)OPENSSL_sk_value(uVar13,iVar4 + -1);
        if ((piVar9 != (int *)0x0) && (*piVar9 == 1)) {
          iVar4 = FUN_00af66d8(piVar9,auStack_70,auStack_80,__n);
          if (iVar4 == 0) {
            return 0;
          }
          iVar4 = memcmp(auStack_70,auStack_80,__n);
          if (0 < iVar4) {
            return 0;
          }
        }
      }
      iVar3 = iVar3 + 1;
      iVar4 = OPENSSL_sk_num(param_1);
    } while (iVar3 < iVar4);
  }
  OPENSSL_sk_set_cmp_func(param_1,&LAB_00af6bf8);
  OPENSSL_sk_sort(param_1);
  iVar3 = X509v3_addr_is_canonical(param_1);
  return (ulong)(iVar3 != 0);
}

