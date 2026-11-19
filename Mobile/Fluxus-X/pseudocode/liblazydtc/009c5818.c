/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c5818
 */

undefined8 tls_choose_sigalg(long param_1,int param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  int *piVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long *plVar9;
  ulong uVar10;
  uint uVar11;
  undefined2 *puVar12;
  long lVar13;
  ulong uVar14;
  uint uVar15;
  char acStack_94 [52];
  
  *(undefined8 *)(param_1 + 0x388) = 0;
  *(undefined8 *)(param_1 + 0x380) = 0;
  uVar15 = *(uint *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60);
  if ((((uVar15 >> 3 & 1) == 0) && (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) &&
     (iVar1 != 0x10000)) {
    lVar4 = FUN_009c4f6c(param_1,0,0);
    if (lVar4 != 0) {
LAB_009c58d8:
      uVar15 = *(uint *)(lVar4 + 0x18);
LAB_009c58dc:
      plVar9 = *(long **)(param_1 + 0x898) + (long)(int)uVar15 * 5 + 4;
      *(long **)(param_1 + 0x388) = plVar9;
      **(long **)(param_1 + 0x898) = (long)plVar9;
      *(long *)(param_1 + 0x380) = lVar4;
      return 1;
    }
    if (param_2 == 0) {
      return 1;
    }
    ERR_new();
    uVar7 = 0xcb6;
LAB_009c5c50:
    ERR_set_debug("ssl/t1_lib.c",uVar7,"tls_choose_sigalg");
    uVar7 = 0x28;
  }
  else {
    if ((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x20) & 0xab) == 0) {
      return 1;
    }
    if (*(int *)(param_1 + 0x38) == 0) {
      plVar9 = *(long **)(param_1 + 0x898);
      uVar11 = (int)(*plVar9 - (long)(plVar9 + 4) >> 3) * -0x33333333;
      if (8 < uVar11) {
        return 1;
      }
      if (plVar9[(long)(int)uVar11 * 5 + 4] == 0) {
        return 1;
      }
      if (plVar9[(long)(int)uVar11 * 5 + 5] == 0) {
        return 1;
      }
    }
    if ((uVar15 >> 1 & 1) != 0) {
      if (*(long *)(param_1 + 0x390) == 0) {
        lVar4 = FUN_009c1dc4(param_1,0xffffffff);
        if (lVar4 == 0) {
          if (param_2 == 0) {
            return 1;
          }
          ERR_new();
          uVar7 = 0xd0d;
          goto LAB_009c5c50;
        }
        lVar13 = *(long *)(param_1 + 0x898);
        puVar12 = &DAT_0074cd8c;
        uVar15 = *(uint *)(lVar13 + 0x1c) & 0x30000;
        if (uVar15 == 0x30000) {
          uVar14 = 2;
          goto LAB_009c5c80;
        }
        if (uVar15 == 0x20000) {
          puVar12 = &DAT_0074cd8e;
LAB_009c5c7c:
          uVar14 = 1;
LAB_009c5c80:
          uVar10 = 0;
          do {
            if (((*(short *)(lVar4 + 8) == puVar12[uVar10]) &&
                (uVar15 = *(uint *)(lVar4 + 0x18), uVar15 < 9)) &&
               ((*(long *)(*(long *)(param_1 + 0x898) + (long)(int)uVar15 * 0x28 + 0x20) != 0 &&
                ((*(long *)(*(long *)(param_1 + 0x898) + (long)(int)uVar15 * 0x28 + 0x28) != 0 &&
                 (iVar1 = FUN_009c6514(param_1,lVar4), iVar1 != 0)))))) break;
            uVar10 = uVar10 + 1;
          } while (uVar10 < uVar14);
          if (uVar10 != uVar14) goto LAB_009c58d8;
        }
        else {
          if (uVar15 == 0x10000) {
            puVar12 = &DAT_0074cd8c;
            goto LAB_009c5c7c;
          }
          if ((*(int *)(param_1 + 0x38) != 1) ||
             (puVar12 = *(undefined2 **)(lVar13 + 0x1a8), puVar12 == (undefined2 *)0x0)) {
            puVar12 = *(undefined2 **)(lVar13 + 0x198);
            if (puVar12 == (undefined2 *)0x0) {
              puVar12 = &DAT_0074cd90;
              uVar14 = 0x1c;
            }
            else {
              uVar14 = *(ulong *)(lVar13 + 0x1a0);
              if (uVar14 == 0) goto LAB_009c5ce8;
            }
            goto LAB_009c5c80;
          }
          uVar14 = *(ulong *)(lVar13 + 0x1b0);
          if (uVar14 != 0) goto LAB_009c5c80;
        }
LAB_009c5ce8:
        if (param_2 == 0) {
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/t1_lib.c",0xd1c,"tls_choose_sigalg");
        uVar7 = 0x28;
        uVar8 = 0x172;
        goto LAB_009c5c5c;
      }
      if ((*(byte *)(*(long *)(param_1 + 0x898) + 0x1e) & 3) == 0) {
        iVar1 = -1;
        lVar4 = *(long *)(param_1 + 0x1db0);
joined_r0x009c5a14:
        if (lVar4 == 0) goto LAB_009c5bac;
LAB_009c5a28:
        uVar14 = 0;
        do {
          lVar4 = *(long *)(*(long *)(param_1 + 0x1da8) + uVar14 * 8);
          if (*(int *)(param_1 + 0x38) == 0) {
            uVar15 = (int)((ulong)(**(long **)(param_1 + 0x898) -
                                  (long)(*(long **)(param_1 + 0x898) + 4)) >> 3) * -0x33333333;
            uVar11 = *(uint *)(lVar4 + 0x18);
            if (*(uint *)(lVar4 + 0x18) != uVar15) goto LAB_009c5b70;
            if (uVar15 != 0xffffffff) goto LAB_009c5ac8;
LAB_009c5b6c:
            uVar11 = 0xffffffff;
          }
          else {
            uVar15 = *(uint *)(lVar4 + 0x18);
            piVar5 = (int *)ssl_cert_lookup_by_idx((long)(int)uVar15);
            if (((piVar5 == (int *)0x0) ||
                ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & piVar5[1]) == 0)) ||
               ((*piVar5 == 0x390 && ((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x1c) & 1) != 0))))
            goto LAB_009c5b6c;
            uVar11 = 0xffffffff;
            if ((uVar15 != 0xffffffff) &&
               ((*(uint *)(param_1 + (long)(int)uVar15 * 4 + 0x3b8) & 1) != 0)) {
LAB_009c5ac8:
              uVar11 = uVar15;
              if ((uVar15 < 9) &&
                 (((*(long *)(*(long *)(param_1 + 0x898) + (long)(int)uVar15 * 0x28 + 0x20) != 0 &&
                   (*(long *)(*(long *)(param_1 + 0x898) + (long)(int)uVar15 * 0x28 + 0x28) != 0))
                  && (iVar2 = FUN_009c6514(param_1,lVar4), iVar2 != 0)))) {
                if (*(int *)(lVar4 + 0x14) == 0x390) {
                  lVar13 = *(long *)(*(long *)(param_1 + 0x898) + (long)(int)uVar15 * 0x28 + 0x28);
                  if (((lVar13 != 0) && (*(int *)(lVar4 + 0xc) != 0)) &&
                     (lVar6 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(lVar4 + 0x10))
                     , lVar6 != 0)) {
                    iVar2 = EVP_PKEY_get_size(lVar13);
                    iVar3 = EVP_MD_get_size(lVar6);
                    if (iVar3 * 2 + 2 <= iVar2) goto LAB_009c5b84;
                  }
                }
                else {
LAB_009c5b84:
                  if ((iVar1 == -1) || (*(int *)(lVar4 + 0x20) == iVar1)) break;
                }
              }
            }
          }
LAB_009c5b70:
          uVar15 = uVar11;
          uVar14 = uVar14 + 1;
        } while (uVar14 < *(ulong *)(param_1 + 0x1db0));
        uVar10 = *(ulong *)(param_1 + 0x1db0);
        if (uVar14 == uVar10) goto LAB_009c5bac;
LAB_009c5be0:
        if (uVar14 != uVar10) {
          if (uVar15 != 0xffffffff) goto LAB_009c58dc;
          goto LAB_009c58d8;
        }
      }
      else {
        iVar1 = EVP_PKEY_get_group_name
                          (*(undefined8 *)(*(long *)(param_1 + 0x898) + 0xa0),acStack_94,0x32,0);
        if (iVar1 < 1) {
          iVar1 = 0;
          lVar4 = *(long *)(param_1 + 0x1db0);
          goto joined_r0x009c5a14;
        }
        iVar1 = OBJ_txt2nid(acStack_94);
        if (*(long *)(param_1 + 0x1db0) != 0) goto LAB_009c5a28;
LAB_009c5bac:
        if ((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x20) & 0xa0) != 0) {
          lVar4 = FUN_009c1dc4(param_1,0xffffffff);
          if (lVar4 == 0) {
            if (param_2 == 0) {
              return 1;
            }
            ERR_new();
            uVar7 = 0xcf3;
            goto LAB_009c5c50;
          }
          uVar15 = *(uint *)(lVar4 + 0x18);
          uVar10 = *(ulong *)(param_1 + 0x1db0);
          uVar14 = 0;
          goto LAB_009c5be0;
        }
      }
      if (param_2 == 0) {
        return 1;
      }
      ERR_new();
      uVar7 = 0xcff;
      goto LAB_009c5c50;
    }
    lVar4 = FUN_009c1dc4(param_1,0xffffffff);
    if (lVar4 != 0) goto LAB_009c58d8;
    if (param_2 == 0) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/t1_lib.c",0xd25,"tls_choose_sigalg");
    uVar7 = 0x50;
  }
  uVar8 = 0x76;
LAB_009c5c5c:
  ossl_statem_fatal(param_1,uVar7,uVar8,0);
  return 0;
}

