/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af68c0
 */

undefined8 X509v3_addr_is_canonical(long param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  char cVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  uint *puVar13;
  size_t sVar14;
  undefined1 *puVar15;
  int *piVar16;
  undefined8 uVar17;
  size_t __n;
  undefined1 auStack_a0 [15];
  char acStack_91 [17];
  undefined1 auStack_80 [16];
  undefined1 auStack_70 [16];
  
  if (param_1 == 0) {
    return 1;
  }
  iVar7 = 1;
  while( true ) {
    iVar5 = OPENSSL_sk_num(param_1);
    if (iVar5 + -1 <= iVar7 + -1) break;
    puVar9 = (undefined8 *)OPENSSL_sk_value(param_1,iVar7 + -1);
    puVar10 = (undefined8 *)OPENSSL_sk_value(param_1,iVar7);
    uVar2 = *(uint *)*puVar9;
    if ((uVar2 & 0xfffffffe) != 2) {
      return 0;
    }
    uVar3 = *(uint *)*puVar10;
    if ((uVar3 & 0xfffffffe) != 2) {
      return 0;
    }
    uVar1 = uVar3;
    if (uVar2 - uVar3 == 0 || (int)uVar2 < (int)uVar3) {
      uVar1 = uVar2;
    }
    iVar6 = memcmp(*(void **)((uint *)*puVar9 + 2),*(void **)((uint *)*puVar10 + 2),(long)(int)uVar1
                  );
    iVar5 = uVar2 - uVar3;
    if (iVar6 != 0) {
      iVar5 = iVar6;
    }
    iVar7 = iVar7 + 1;
    if (-1 < iVar5) {
      return 0;
    }
  }
  iVar7 = OPENSSL_sk_num(param_1);
  if (iVar7 < 1) {
    return 1;
  }
  iVar7 = 0;
  do {
    puVar9 = (undefined8 *)OPENSSL_sk_value(param_1,iVar7);
    if (puVar9 == (undefined8 *)0x0) {
      return 0;
    }
    puVar13 = (uint *)*puVar9;
    if (puVar13 == (uint *)0x0) {
LAB_00af6bb8:
      iVar5 = 0;
      piVar16 = (int *)puVar9[1];
    }
    else {
      puVar15 = *(undefined1 **)(puVar13 + 2);
      if (puVar15 == (undefined1 *)0x0) {
        iVar5 = 0;
        piVar16 = (int *)puVar9[1];
      }
      else {
        if ((int)*puVar13 < 2) goto LAB_00af6bb8;
        iVar5 = 0x10;
        if (CONCAT11(*puVar15,puVar15[1]) != 2) {
          iVar5 = (uint)(CONCAT11(*puVar15,puVar15[1]) == 1) << 2;
        }
        piVar16 = (int *)puVar9[1];
      }
    }
    if (piVar16 == (int *)0x0) {
      return 0;
    }
    if (*piVar16 != 0) {
      if (*piVar16 != 1) {
        return 0;
      }
      if ((*puVar13 & 0xfffffffe) != 2) {
        return 0;
      }
      uVar17 = *(undefined8 *)(piVar16 + 2);
      uVar11 = OPENSSL_sk_num(uVar17);
      if ((int)uVar11 == 0) {
        return uVar11;
      }
      iVar6 = OPENSSL_sk_num(uVar17);
      if (1 < iVar6) {
        iVar6 = 0;
        __n = (size_t)iVar5;
        do {
          piVar16 = (int *)OPENSSL_sk_value(uVar17,iVar6);
          iVar6 = iVar6 + 1;
          uVar11 = OPENSSL_sk_value(uVar17,iVar6);
          uVar12 = FUN_00af66d8(piVar16,auStack_70,auStack_80,iVar5);
          if ((int)uVar12 == 0) {
            return uVar12;
          }
          uVar11 = FUN_00af66d8(uVar11,acStack_91 + 1,auStack_a0,iVar5);
          if ((int)uVar11 == 0) {
            return uVar11;
          }
          iVar8 = memcmp(auStack_70,acStack_91 + 1,__n);
          if (-1 < iVar8) {
            return 0;
          }
          iVar8 = memcmp(auStack_70,auStack_80,__n);
          if (0 < iVar8) {
            return 0;
          }
          iVar8 = memcmp(acStack_91 + 1,auStack_a0,__n);
          if (0 < iVar8) {
            return 0;
          }
          sVar14 = __n;
          do {
            if ((long)sVar14 < 1) break;
            cVar4 = acStack_91[sVar14];
            acStack_91[sVar14] = cVar4 + -1;
            sVar14 = sVar14 - 1;
          } while (cVar4 == '\0');
          iVar8 = memcmp(auStack_80,acStack_91 + 1,__n);
          if (-1 < iVar8) {
            return 0;
          }
          if ((*piVar16 == 1) && (iVar8 = FUN_00af6c48(auStack_70,auStack_80,iVar5), -1 < iVar8)) {
            return 0;
          }
          iVar8 = OPENSSL_sk_num(uVar17);
        } while (iVar6 < iVar8 + -1);
      }
      iVar6 = OPENSSL_sk_num(uVar17);
      piVar16 = (int *)OPENSSL_sk_value(uVar17,iVar6 + -1);
      if ((piVar16 != (int *)0x0) && (*piVar16 == 1)) {
        uVar11 = FUN_00af66d8(piVar16,auStack_70,auStack_80,iVar5);
        if ((int)uVar11 == 0) {
          return uVar11;
        }
        iVar6 = memcmp(auStack_70,auStack_80,(long)iVar5);
        if (0 < iVar6) {
          return 0;
        }
        iVar5 = FUN_00af6c48(auStack_70,auStack_80,iVar5);
        if (-1 < iVar5) {
          return 0;
        }
      }
    }
    iVar7 = iVar7 + 1;
    iVar5 = OPENSSL_sk_num(param_1);
    if (iVar5 <= iVar7) {
      return 1;
    }
  } while( true );
}

