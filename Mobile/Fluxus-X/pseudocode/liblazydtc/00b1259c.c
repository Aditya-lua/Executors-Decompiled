/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1259c
 */

int X509_policy_check(X509_POLICY_TREE **ptree,int *pexplicit_policy,stack_st_X509 *certs,
                     stack_st_ASN1_OBJECT *policy_oids,uint flags)

{
  bool bVar1;
  X509_POLICY_TREE *pXVar2;
  uint uVar3;
  bool bVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  int iVar9;
  int iVar10;
  int iVar11;
  X509_POLICY_TREE *tree;
  X509 *x;
  long lVar12;
  undefined8 uVar13;
  long *plVar14;
  long lVar15;
  uint *puVar16;
  void *pvVar17;
  long lVar18;
  long lVar19;
  ASN1_OBJECT *pAVar20;
  undefined8 uVar21;
  undefined4 *puVar22;
  ulong uVar23;
  uint uVar24;
  undefined8 *puVar25;
  X509_POLICY_TREE *pXVar26;
  uint uVar27;
  undefined8 *puVar28;
  undefined8 *puVar29;
  uint uVar30;
  undefined8 local_68;
  
  local_68 = 0;
  *ptree = (X509_POLICY_TREE *)0x0;
  *pexplicit_policy = 0;
  uVar5 = OPENSSL_sk_num(certs);
  uVar7 = uVar5;
  if ((flags & 0x100) != 0) {
    uVar7 = 0;
  }
  uVar24 = uVar5;
  if ((flags & 0x200) != 0) {
    uVar24 = 0;
  }
  uVar30 = uVar5;
  if ((flags & 0x400) != 0) {
    uVar30 = 0;
  }
  iVar8 = uVar5 - 1;
  tree = (X509_POLICY_TREE *)0x0;
  if (iVar8 == 0) {
LAB_00b1260c:
    X509_policy_tree_free(tree);
    return 1;
  }
  if ((int)uVar5 < 2) {
    uVar27 = 1;
  }
  else {
    iVar11 = iVar8;
    do {
      iVar11 = iVar11 + -1;
      x = (X509 *)OPENSSL_sk_value(certs,iVar11);
      X509_check_purpose(x,-1,0);
      lVar12 = ossl_policy_cache_set(x);
      if (lVar12 == 0) {
        return 0;
      }
    } while (0 < iVar11);
    uVar27 = 1;
    do {
      if ((uVar27 >> 1 != 0) && ((int)uVar7 < 1)) break;
      iVar8 = iVar8 + -1;
      uVar13 = OPENSSL_sk_value(certs,iVar8);
      uVar6 = X509_get_extension_flags();
      if ((uVar6 >> 0xb & 1) != 0) {
        return -1;
      }
      lVar12 = ossl_policy_cache_set(uVar13);
      if ((uVar27 & 1) != 0) {
        uVar3 = 2;
        if (*(long *)(lVar12 + 8) != 0) {
          uVar3 = uVar27;
        }
        uVar27 = uVar3;
      }
      if (0 < (int)uVar7) {
        uVar23 = *(ulong *)(lVar12 + 0x18);
        uVar6 = (uVar7 + (uVar6 >> 5 & 1)) - 1;
        uVar7 = (uint)uVar23;
        if ((long)(int)uVar6 <= (long)uVar23 || 0x7fffffffffffffff < uVar23) {
          uVar7 = uVar6;
        }
      }
    } while (0 < iVar8);
  }
  uVar6 = uVar27 | 4;
  if (uVar7 != 0) {
    uVar6 = uVar27;
  }
  tree = (X509_POLICY_TREE *)0x0;
  if ((uVar6 & 1) != 0) {
    tree = (X509_POLICY_TREE *)CRYPTO_zalloc(0x40,"crypto/x509/pcy_tree.c",0xae);
    if (tree == (X509_POLICY_TREE *)0x0) {
      ERR_new();
      uVar13 = 0xaf;
LAB_00b12cf4:
      ERR_set_debug("crypto/x509/pcy_tree.c",uVar13,"tree_init");
      ERR_set_error(0x22,0xc0100,0);
      return 0;
    }
    *(undefined8 *)(tree + 8) = 1000;
    lVar12 = CRYPTO_zalloc(-(ulong)(uVar5 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar5 << 5,
                           "crypto/x509/pcy_tree.c",0xbd);
    *(long *)(tree + 0x10) = lVar12;
    if (lVar12 == 0) {
      CRYPTO_free(tree);
      ERR_new();
      uVar13 = 0xbf;
      goto LAB_00b12cf4;
    }
    *(uint *)(tree + 0x18) = uVar5;
    pAVar20 = OBJ_nid2obj(0x2ea);
    puVar16 = (uint *)ossl_policy_data_new(0,pAVar20,0);
    if (puVar16 == (uint *)0x0) goto LAB_00b13010;
    lVar15 = ossl_policy_level_add_node(lVar12,puVar16,0,tree,1);
    if (lVar15 == 0) {
LAB_00b12e30:
      ossl_policy_data_free(puVar16);
      goto LAB_00b13010;
    }
    if (1 < (int)uVar5) {
      puVar16 = (uint *)(lVar12 + 0x38);
      iVar8 = uVar5 - 2;
      do {
        uVar13 = OPENSSL_sk_value(certs,iVar8);
        uVar7 = X509_get_extension_flags();
        plVar14 = (long *)ossl_policy_cache_set(uVar13);
        X509_up_ref(uVar13);
        *(undefined8 *)(puVar16 + -6) = uVar13;
        if (*plVar14 == 0) {
          *puVar16 = *puVar16 | 0x200;
          if (uVar24 != 0) goto LAB_00b127e4;
LAB_00b12828:
          if ((iVar8 == 0) || ((uVar7 >> 5 & 1) == 0)) {
            *puVar16 = *puVar16 | 0x200;
          }
          uVar24 = 0;
          if (uVar30 == 0) goto LAB_00b12808;
LAB_00b12848:
          uVar23 = plVar14[4];
          uVar7 = uVar30 - ((uVar7 & 0x20) == 0);
          uVar30 = (uint)uVar23;
          if ((long)(int)uVar7 <= (long)uVar23 || 0x7fffffffffffffff < uVar23) {
            uVar30 = uVar7;
          }
        }
        else {
          if (uVar24 == 0) goto LAB_00b12828;
LAB_00b127e4:
          uVar23 = plVar14[2];
          uVar5 = uVar24 - ((uVar7 & 0x20) == 0);
          uVar24 = (uint)uVar23;
          if ((long)(int)uVar5 <= (long)uVar23 || 0x7fffffffffffffff < uVar23) {
            uVar24 = uVar5;
          }
          if (uVar30 != 0) goto LAB_00b12848;
LAB_00b12808:
          *puVar16 = *puVar16 | 0x400;
        }
        puVar16 = puVar16 + 8;
        bVar1 = 0 < iVar8;
        iVar8 = iVar8 + -1;
      } while (bVar1);
    }
  }
  if (uVar6 == 0) {
    return 0;
  }
  if (uVar6 >> 2 == 0) {
    if ((uVar6 >> 1 & 1) != 0) goto LAB_00b1260c;
    bVar1 = true;
  }
  else {
    bVar1 = false;
    *pexplicit_policy = 1;
    if ((uVar6 >> 1 & 1) != 0) {
      return -2;
    }
  }
  iVar8 = *(int *)(tree + 0x18);
  puVar29 = *(undefined8 **)(tree + 0x10);
  if (1 < iVar8) {
    iVar11 = 1;
    puVar25 = puVar29;
    do {
      puVar28 = puVar25 + 4;
      plVar14 = (long *)ossl_policy_cache_set(*puVar28);
      iVar8 = OPENSSL_sk_num(plVar14[1]);
      if (0 < iVar8) {
        iVar8 = 0;
        do {
          lVar12 = OPENSSL_sk_value(plVar14[1],iVar8);
          iVar9 = OPENSSL_sk_num(puVar25[1]);
          if (iVar9 < 1) {
LAB_00b12990:
            if ((puVar25[2] != 0) &&
               (lVar12 = ossl_policy_level_add_node(puVar28,lVar12,puVar25[2],tree,0), lVar12 == 0))
            goto LAB_00b13010;
          }
          else {
            bVar4 = false;
            iVar9 = 0;
            do {
              uVar13 = OPENSSL_sk_value(puVar25[1],iVar9);
              iVar10 = ossl_policy_node_match(puVar25,uVar13,*(undefined8 *)(lVar12 + 8));
              if (iVar10 != 0) {
                lVar15 = ossl_policy_level_add_node(puVar28,lVar12,uVar13,tree,0);
                if (lVar15 == 0) goto LAB_00b13010;
                bVar4 = true;
              }
              iVar9 = iVar9 + 1;
              iVar10 = OPENSSL_sk_num(puVar25[1]);
            } while (iVar9 < iVar10);
            if (!bVar4) goto LAB_00b12990;
          }
          iVar8 = iVar8 + 1;
          iVar9 = OPENSSL_sk_num(plVar14[1]);
        } while (iVar8 < iVar9);
      }
      if ((*(byte *)((long)puVar25 + 0x39) >> 1 & 1) == 0) {
        iVar8 = OPENSSL_sk_num(puVar25[1]);
        if (0 < iVar8) {
          iVar8 = 0;
          do {
            puVar29 = (undefined8 *)OPENSSL_sk_value(puVar25[1],iVar8);
            if (((*(byte *)((long)puVar25 + 0x19) >> 2 & 1) == 0) && ((*(byte *)*puVar29 & 1) != 0))
            {
              uVar13 = *(undefined8 *)((byte *)*puVar29 + 0x18);
              iVar9 = *(int *)(puVar29 + 2);
              iVar10 = OPENSSL_sk_num(uVar13);
              if ((iVar9 != iVar10) && (iVar9 = OPENSSL_sk_num(uVar13), 0 < iVar9)) {
                iVar9 = 0;
                do {
                  lVar12 = OPENSSL_sk_value(uVar13,iVar9);
                  lVar15 = ossl_policy_level_find_node(puVar28,puVar29,lVar12);
                  if (lVar15 == 0) {
                    if (lVar12 == 0) {
                      lVar12 = *(long *)((uint *)*puVar29 + 2);
                    }
                    puVar16 = (uint *)ossl_policy_data_new(0,lVar12,*(uint *)*puVar29 & 0x10);
                    if (puVar16 == (uint *)0x0) goto LAB_00b13010;
                    uVar21 = *(undefined8 *)(*plVar14 + 0x10);
                    *puVar16 = *puVar16 | 4;
                    *(undefined8 *)(puVar16 + 4) = uVar21;
                    lVar12 = ossl_policy_level_add_node(puVar28,puVar16,puVar29,tree,1);
                    if (lVar12 == 0) goto LAB_00b12e30;
                  }
                  iVar9 = iVar9 + 1;
                  iVar10 = OPENSSL_sk_num(uVar13);
                } while (iVar9 < iVar10);
              }
            }
            else if (*(int *)(puVar29 + 2) == 0) {
              puVar16 = (uint *)ossl_policy_data_new
                                          (0,*(undefined8 *)((uint *)*puVar29 + 2),
                                           *(uint *)*puVar29 & 0x10);
              if (puVar16 == (uint *)0x0) goto LAB_00b13010;
              uVar13 = *(undefined8 *)(*plVar14 + 0x10);
              *puVar16 = *puVar16 | 4;
              *(undefined8 *)(puVar16 + 4) = uVar13;
              lVar12 = ossl_policy_level_add_node(puVar28,puVar16,puVar29,tree,1);
              if (lVar12 == 0) goto LAB_00b12e30;
            }
            iVar8 = iVar8 + 1;
            iVar9 = OPENSSL_sk_num(puVar25[1]);
          } while (iVar8 < iVar9);
        }
        if ((puVar25[2] != 0) &&
           (lVar12 = ossl_policy_level_add_node(puVar28,*plVar14,puVar25[2],tree,0), lVar12 == 0))
        goto LAB_00b13010;
      }
      if ((*(byte *)((long)puVar25 + 0x39) >> 2 & 1) != 0) {
        uVar13 = puVar25[5];
        iVar8 = OPENSSL_sk_num(uVar13);
        if (0 < iVar8) {
          iVar8 = iVar8 + 1;
          do {
            puVar29 = (undefined8 *)OPENSSL_sk_value(uVar13,iVar8 + -2);
            if ((*(byte *)*puVar29 & 3) != 0) {
              *(int *)(puVar29[1] + 0x10) = *(int *)(puVar29[1] + 0x10) + -1;
              CRYPTO_free(puVar29);
              OPENSSL_sk_delete(uVar13,iVar8 + -2);
            }
            iVar8 = iVar8 + -1;
          } while (1 < iVar8);
        }
      }
      puVar25 = puVar28;
      do {
        uVar13 = puVar25[-3];
        iVar8 = OPENSSL_sk_num(uVar13);
        if (0 < iVar8) {
          iVar8 = iVar8 + 1;
          do {
            pvVar17 = (void *)OPENSSL_sk_value(uVar13,iVar8 + -2);
            if (*(int *)((long)pvVar17 + 0x10) == 0) {
              *(int *)(*(long *)((long)pvVar17 + 8) + 0x10) =
                   *(int *)(*(long *)((long)pvVar17 + 8) + 0x10) + -1;
              CRYPTO_free(pvVar17);
              OPENSSL_sk_delete(uVar13,iVar8 + -2);
            }
            iVar8 = iVar8 + -1;
          } while (1 < iVar8);
        }
        pvVar17 = (void *)puVar25[-2];
        puVar29 = puVar25 + -4;
        if ((pvVar17 != (void *)0x0) && (*(int *)((long)pvVar17 + 0x10) == 0)) {
          lVar12 = *(long *)((long)pvVar17 + 8);
          if (lVar12 != 0) {
            *(int *)(lVar12 + 0x10) = *(int *)(lVar12 + 0x10) + -1;
          }
          CRYPTO_free(pvVar17);
          pvVar17 = (void *)0x0;
          puVar25[-2] = 0;
        }
        puVar25 = puVar29;
      } while (puVar29 != *(undefined8 **)(tree + 0x10));
      if (pvVar17 == (void *)0x0) {
        X509_policy_tree_free(tree);
        iVar8 = 1;
        if (!bVar1) {
          iVar8 = -2;
        }
        return iVar8;
      }
      iVar8 = *(int *)(tree + 0x18);
      iVar11 = iVar11 + 1;
      puVar25 = puVar28;
    } while (iVar11 < iVar8);
  }
  lVar12 = puVar29[(long)iVar8 * 4 + -2];
  pXVar2 = tree + 0x28;
  pXVar26 = pXVar2;
  if (lVar12 != 0) {
    lVar15 = *(long *)pXVar2;
    if (lVar15 == 0) {
      lVar15 = ossl_policy_node_cmp_new();
      *(long *)pXVar2 = lVar15;
      if (lVar15 == 0) goto LAB_00b13010;
    }
    iVar8 = OPENSSL_sk_find(lVar15,lVar12);
    if ((iVar8 < 0) && (iVar8 = OPENSSL_sk_push(*(undefined8 *)pXVar2,lVar12), iVar8 == 0))
    goto LAB_00b13010;
    pXVar26 = (X509_POLICY_TREE *)&local_68;
  }
  if (1 < *(int *)(tree + 0x18)) {
    iVar8 = 1;
    lVar12 = *(long *)(tree + 0x10);
    do {
      lVar15 = *(long *)(lVar12 + 0x10);
      if (lVar15 == 0) break;
      iVar11 = OPENSSL_sk_num(*(undefined8 *)(lVar12 + 0x28));
      if (0 < iVar11) {
        iVar11 = 0;
        do {
          lVar18 = OPENSSL_sk_value(*(undefined8 *)(lVar12 + 0x28),iVar11);
          if (*(long *)(lVar18 + 8) == lVar15) {
            lVar19 = *(long *)pXVar26;
            if (lVar19 == 0) {
              lVar19 = ossl_policy_node_cmp_new();
              *(long *)pXVar26 = lVar19;
              if (lVar19 != 0) goto LAB_00b12dcc;
            }
            else {
LAB_00b12dcc:
              iVar9 = OPENSSL_sk_find(lVar19,lVar18);
              if ((-1 < iVar9) ||
                 (iVar9 = OPENSSL_sk_push(*(undefined8 *)pXVar26,lVar18), iVar9 != 0))
              goto LAB_00b12de8;
            }
            if (pXVar26 == (X509_POLICY_TREE *)&local_68) {
              OPENSSL_sk_free(local_68);
              local_68 = 0;
            }
            goto LAB_00b13010;
          }
LAB_00b12de8:
          iVar11 = iVar11 + 1;
          iVar9 = OPENSSL_sk_num(*(undefined8 *)(lVar12 + 0x28));
        } while (iVar11 < iVar9);
      }
      iVar8 = iVar8 + 1;
      lVar12 = lVar12 + 0x20;
    } while (iVar8 < *(int *)(tree + 0x18));
  }
  if (pXVar26 == (X509_POLICY_TREE *)&local_68) {
    iVar8 = 2;
  }
  else {
    local_68 = *(undefined8 *)pXVar2;
    iVar8 = 1;
  }
  uVar13 = local_68;
  iVar11 = OPENSSL_sk_num(policy_oids);
  if (iVar11 < 1) {
    bVar4 = true;
  }
  else {
    plVar14 = *(long **)(*(long *)(tree + 0x10) + (long)*(int *)(tree + 0x18) * 0x20 + -0x10);
    iVar11 = OPENSSL_sk_num(policy_oids);
    if (0 < iVar11) {
      iVar11 = 0;
      do {
        pAVar20 = (ASN1_OBJECT *)OPENSSL_sk_value(policy_oids,iVar11);
        iVar9 = OBJ_obj2nid(pAVar20);
        if (iVar9 == 0x2ea) {
          bVar4 = true;
          *(uint *)(tree + 0x38) = *(uint *)(tree + 0x38) | 2;
          goto joined_r0x00b12fc4;
        }
        iVar11 = iVar11 + 1;
        iVar9 = OPENSSL_sk_num(policy_oids);
      } while (iVar11 < iVar9);
    }
    iVar11 = OPENSSL_sk_num(policy_oids);
    if (iVar11 < 1) {
      bVar4 = true;
    }
    else {
      iVar11 = 0;
      do {
        uVar21 = OPENSSL_sk_value(policy_oids,iVar11);
        puVar29 = (undefined8 *)ossl_policy_tree_find_sk(uVar13,uVar21);
        if (puVar29 != (undefined8 *)0x0) {
LAB_00b12f58:
          lVar12 = *(long *)(tree + 0x30);
          if (lVar12 == 0) {
            lVar12 = OPENSSL_sk_new_null();
            *(long *)(tree + 0x30) = lVar12;
            if (lVar12 != 0) goto LAB_00b12f74;
            if ((byte *)*puVar29 == (byte *)0x0) goto LAB_00b130bc;
            bVar4 = false;
            if ((*(byte *)*puVar29 >> 3 & 1) == 0) goto joined_r0x00b12fc4;
LAB_00b13074:
            CRYPTO_free(puVar29);
          }
          else {
LAB_00b12f74:
            iVar9 = OPENSSL_sk_push(lVar12,puVar29);
            if (iVar9 != 0) goto LAB_00b12f80;
            if ((byte *)*puVar29 != (byte *)0x0) {
              bVar4 = false;
              if ((*(byte *)*puVar29 >> 3 & 1) != 0) goto LAB_00b13074;
              goto joined_r0x00b12fc4;
            }
          }
          bVar4 = false;
          goto joined_r0x00b12fc4;
        }
        if (plVar14 != (long *)0x0) {
          puVar22 = (undefined4 *)ossl_policy_data_new(0,uVar21,*(uint *)*plVar14 & 0x10);
          bVar4 = false;
          if (puVar22 != (undefined4 *)0x0) {
            uVar21 = *(undefined8 *)(*plVar14 + 0x10);
            *puVar22 = 0xc;
            *(undefined8 *)(puVar22 + 4) = uVar21;
            puVar29 = (undefined8 *)ossl_policy_level_add_node(0,puVar22,plVar14[1],tree,1);
            if (puVar29 != (undefined8 *)0x0) goto LAB_00b12f58;
            ossl_policy_data_free(puVar22);
LAB_00b130bc:
            bVar4 = false;
          }
          goto joined_r0x00b12fc4;
        }
LAB_00b12f80:
        iVar11 = iVar11 + 1;
        iVar9 = OPENSSL_sk_num(policy_oids);
      } while (iVar11 < iVar9);
      bVar4 = true;
    }
  }
joined_r0x00b12fc4:
  if (iVar8 == 2) {
    OPENSSL_sk_free(local_68);
  }
  if (bVar4) {
    *ptree = tree;
    if (!bVar1) {
      X509_policy_tree_get0_user_policies(tree);
      iVar8 = OPENSSL_sk_num();
      if (iVar8 < 1) {
        return -2;
      }
    }
    return 1;
  }
LAB_00b13010:
  X509_policy_tree_free(tree);
  return 0;
}

