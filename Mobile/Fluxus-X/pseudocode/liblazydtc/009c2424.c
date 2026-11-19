/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2424
 */

undefined8 tls12_check_peer_sigalg(long param_1,uint param_2,undefined8 param_3)

{
  char cVar2;
  undefined1 uVar1;
  int iVar3;
  int iVar4;
  undefined4 uVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  undefined2 uVar9;
  undefined8 uVar10;
  uint uVar11;
  uint uVar12;
  undefined2 *puVar13;
  long lVar14;
  ulong uVar15;
  ulong uVar16;
  int *piVar17;
  char local_84;
  undefined1 local_83;
  int local_48 [2];
  
  uVar6 = EVP_PKEY_get_id(param_3);
  iVar4 = (int)uVar6;
  if (iVar4 == -1) {
    return uVar6;
  }
  piVar17 = *(int **)(param_1 + 8);
  uVar11 = *(uint *)(*(long *)(piVar17 + 0x30) + 0x60);
  if ((((uVar11 >> 3 & 1) == 0) && (0x303 < *piVar17)) && (*piVar17 != 0x10000)) {
    if (iVar4 == 6) {
      iVar4 = 0x390;
      goto LAB_009c24b4;
    }
    if (iVar4 != 0x74) goto LAB_009c24b4;
    ERR_new();
    uVar6 = 0x5df;
LAB_009c25e4:
    ERR_set_debug("ssl/t1_lib.c",uVar6,"tls12_check_peer_sigalg");
    uVar6 = 0x2f;
  }
  else {
LAB_009c24b4:
    lVar7 = FUN_009c21e4(param_1,param_2);
    if (((lVar7 == 0) ||
        ((((uVar11 >> 3 & 1) == 0 && (0x303 < *piVar17)) &&
         ((*piVar17 != 0x10000 &&
          ((*(int *)(lVar7 + 0xc) == 0x40 || (*(int *)(lVar7 + 0xc) == 0x2a3)))))))) ||
       ((iVar4 != *(int *)(lVar7 + 0x14) && ((iVar4 != 6 || (*(int *)(lVar7 + 0x14) != 0x390)))))) {
      ERR_new();
      uVar6 = 0x5ef;
      goto LAB_009c25e4;
    }
    uVar6 = EVP_PKEY_get_id(param_3);
    iVar3 = ssl_cert_lookup_by_nid(uVar6,local_48);
    if ((iVar3 == 0) || (*(int *)(lVar7 + 0x18) != local_48[0])) {
      ERR_new();
      uVar6 = 0x5f5;
      goto LAB_009c25e4;
    }
    if (iVar4 == 0x198) {
      iVar4 = FUN_009c29d4(param_1,param_3);
      if (iVar4 == 0) {
        ERR_new();
        ERR_set_debug("ssl/t1_lib.c",0x5fe,"tls12_check_peer_sigalg");
        uVar6 = 0x2f;
        uVar10 = 0xa2;
        goto LAB_009c25f0;
      }
      piVar17 = *(int **)(param_1 + 8);
      uVar11 = *(uint *)(*(long *)(piVar17 + 0x30) + 0x60);
      if (((((uVar11 >> 3 & 1) == 0) && (0x303 < *piVar17)) && (*piVar17 != 0x10000)) ||
         ((*(byte *)(*(long *)(param_1 + 0x898) + 0x1e) & 3) != 0)) {
        iVar4 = EVP_PKEY_get_group_name(param_3,&local_84,0x32,0);
        if (iVar4 < 1) {
          iVar3 = 0;
          iVar4 = *(int *)(lVar7 + 0x20);
          if (iVar4 != 0) goto LAB_009c267c;
LAB_009c26a0:
          piVar17 = *(int **)(param_1 + 8);
          uVar11 = *(uint *)(*(long *)(piVar17 + 0x30) + 0x60);
          goto LAB_009c26ac;
        }
        iVar3 = OBJ_txt2nid(&local_84);
        iVar4 = *(int *)(lVar7 + 0x20);
        if (iVar4 == 0) goto LAB_009c26a0;
LAB_009c267c:
        if (iVar3 == iVar4) goto LAB_009c26a0;
        ERR_new();
        uVar6 = 0x607;
LAB_009c2808:
        ERR_set_debug("ssl/t1_lib.c",uVar6,"tls12_check_peer_sigalg");
        uVar6 = 0x2f;
        uVar10 = 0x17a;
        goto LAB_009c25f0;
      }
LAB_009c26ac:
      if ((((uVar11 >> 3 & 1) == 0) && (0x303 < *piVar17)) && (*piVar17 != 0x10000)) {
        lVar14 = *(long *)(param_1 + 0x898);
        uVar11 = *(uint *)(lVar14 + 0x1c);
        uVar12 = uVar11 & 0x30000;
      }
      else {
        iVar4 = EVP_PKEY_get_group_name(param_3,&local_84,0x32,0);
        if ((0 < iVar4) && (iVar4 = OBJ_txt2nid(&local_84), iVar4 != 0)) {
          uVar15 = 0;
          puVar13 = &DAT_0074cc38;
          do {
            if (*(int *)(puVar13 + -2) == iVar4) {
              uVar9 = *puVar13;
              goto LAB_009c2734;
            }
            uVar15 = uVar15 + 1;
            puVar13 = puVar13 + 4;
          } while (uVar15 < 0x2a);
        }
        uVar9 = 0;
LAB_009c2734:
        iVar4 = tls1_check_group_id(param_1,uVar9,1);
        if (iVar4 == 0) {
          ERR_new();
          uVar6 = 0x60e;
          goto LAB_009c2808;
        }
        lVar14 = *(long *)(param_1 + 0x898);
        uVar11 = *(uint *)(lVar14 + 0x1c);
        uVar12 = uVar11 & 0x30000;
        if (((param_2 & 0xffff | 0x100) != 0x503) && (uVar12 != 0)) {
          ERR_new();
          uVar6 = 0x616;
          goto LAB_009c29c8;
        }
      }
      puVar13 = &DAT_0074cd8c;
      if (uVar12 == 0x30000) {
        uVar15 = 2;
      }
      else {
        if (uVar12 == 0x20000) {
          puVar13 = &DAT_0074cd8e;
        }
        else {
          if (uVar12 != 0x10000) goto LAB_009c27b0;
          puVar13 = &DAT_0074cd8c;
        }
        uVar15 = 1;
      }
      goto LAB_009c2838;
    }
    lVar14 = *(long *)(param_1 + 0x898);
    uVar11 = *(uint *)(lVar14 + 0x1c);
    if ((uVar11 & 0x30000) == 0) {
LAB_009c27b0:
      if ((*(int *)(param_1 + 0x38) == 1) &&
         (puVar13 = *(undefined2 **)(lVar14 + 0x1a8), puVar13 != (undefined2 *)0x0)) {
        uVar15 = *(ulong *)(lVar14 + 0x1b0);
        if (uVar15 != 0) goto LAB_009c2838;
LAB_009c27e8:
        uVar16 = 0;
      }
      else {
        puVar13 = *(undefined2 **)(lVar14 + 0x198);
        if (puVar13 == (undefined2 *)0x0) {
          puVar13 = &DAT_0074cd90;
          uVar15 = 0x1c;
        }
        else {
          uVar15 = *(ulong *)(lVar14 + 0x1a0);
          if (uVar15 == 0) goto LAB_009c27e8;
        }
LAB_009c2838:
        uVar16 = 0;
        do {
          if ((uint)(ushort)puVar13[uVar16] == (param_2 & 0xffff)) break;
          uVar16 = uVar16 + 1;
        } while (uVar16 < uVar15);
      }
      uVar1 = (undefined1)param_2;
      cVar2 = (char)(param_2 >> 8);
      if (uVar16 == uVar15) {
        if (((uVar11 & 0x30001) != 0) || (*(int *)(lVar7 + 0xc) != 0x40)) {
          ERR_new();
          uVar6 = 0x629;
          goto LAB_009c29c8;
        }
LAB_009c2898:
        lVar14 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(lVar7 + 0x10));
        if (lVar14 == 0) {
          ERR_new();
          ERR_set_debug("ssl/t1_lib.c",0x62d,"tls12_check_peer_sigalg");
          uVar6 = 0x28;
          uVar10 = 0x170;
          goto LAB_009c25f0;
        }
        if (*(int *)(lVar7 + 0xc) == 0) goto LAB_009c293c;
        local_84 = cVar2;
        local_83 = uVar1;
        lVar8 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(lVar7 + 0x10));
        if (lVar8 != 0) {
          iVar4 = EVP_MD_get_type();
          iVar3 = EVP_MD_get_size(lVar8);
          if (iVar4 == 4) {
            iVar4 = 0x27;
          }
          else if (iVar4 != 0x40) {
            if (iVar4 != 0x72) {
              iVar4 = iVar3 << 2;
              goto LAB_009c296c;
            }
            iVar4 = 0x43;
          }
          goto LAB_009c2974;
        }
      }
      else {
        if (*(int *)(lVar7 + 0xc) != 0) goto LAB_009c2898;
        lVar14 = 0;
LAB_009c293c:
        iVar4 = 0xe0;
        if (*(short *)(lVar7 + 8) != 0x808) {
          iVar4 = 0;
        }
        local_84 = cVar2;
        local_83 = uVar1;
        if (*(short *)(lVar7 + 8) == 0x807) {
          iVar4 = 0x80;
          if (lVar14 != 0) goto LAB_009c2974;
LAB_009c2984:
          uVar5 = 0;
        }
        else {
LAB_009c296c:
          if (iVar4 == 0) goto LAB_009c29b0;
          if (lVar14 == 0) goto LAB_009c2984;
LAB_009c2974:
          uVar5 = EVP_MD_get_type(lVar14);
        }
        iVar4 = ssl_security(param_1,0x5000d,iVar4,uVar5,&local_84);
        if (iVar4 != 0) {
          *(long *)(param_1 + 0x3b0) = lVar7;
          return 1;
        }
      }
LAB_009c29b0:
      ERR_new();
      uVar6 = 0x63b;
    }
    else {
      ERR_new();
      uVar6 = 0x61c;
    }
LAB_009c29c8:
    ERR_set_debug("ssl/t1_lib.c",uVar6,"tls12_check_peer_sigalg");
    uVar6 = 0x28;
  }
  uVar10 = 0x172;
LAB_009c25f0:
  ossl_statem_fatal(param_1,uVar6,uVar10,0);
  return 0;
}

