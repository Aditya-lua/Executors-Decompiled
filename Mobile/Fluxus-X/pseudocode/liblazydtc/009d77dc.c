/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d77dc
 */

undefined8 tls_parse_ctos_key_share(long param_1,long *param_2)

{
  uint uVar1;
  ulong uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined1 *puVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  undefined1 *puVar13;
  bool bVar14;
  undefined8 local_68;
  undefined8 local_58;
  
  if ((*(int *)(param_1 + 0x4d0) != 0) && ((*(byte *)(param_1 + 0xb28) >> 1 & 1) == 0)) {
    return 1;
  }
  if (*(long *)(param_1 + 0x4b0) == 0) {
    if (1 < (ulong)param_2[1]) {
      puVar9 = (undefined1 *)*param_2;
      uVar12 = (ulong)CONCAT11(*puVar9,puVar9[1]);
      if (param_2[1] - 2U == uVar12) {
        *param_2 = (long)(puVar9 + 2 + uVar12);
        param_2[1] = 0;
        tls1_get_supported_groups(param_1,&local_58,&local_68);
        lVar11 = *(long *)(param_1 + 0xad0);
        if (lVar11 == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_srvr.c",0x25c,"tls_parse_ctos_key_share");
          uVar7 = 0x6d;
          uVar8 = 0xd1;
        }
        else {
          uVar7 = *(undefined8 *)(param_1 + 0xad8);
          if ((uVar12 == 0) && (*(short *)(param_1 + 0x4ae) != 0)) {
            ERR_new();
            uVar7 = 0x266;
LAB_009d78bc:
            ERR_set_debug("ssl/statem/extensions_srvr.c",uVar7,"tls_parse_ctos_key_share");
            uVar7 = 0x2f;
            uVar8 = 0x6c;
          }
          else {
            bVar14 = true;
            puVar9 = puVar9 + 2;
            do {
              do {
                do {
                  do {
                    do {
                      puVar13 = puVar9;
                      if (uVar12 == 0) {
                        return 1;
                      }
                      if ((uVar12 == 1) || ((uVar12 & 0xfffffffffffffffe) == 2)) {
LAB_009d7a8c:
                        ERR_new();
                        uVar7 = 0x26e;
                        goto LAB_009d78e4;
                      }
                      uVar2 = (ulong)CONCAT11(puVar13[2],puVar13[3]);
                      uVar10 = uVar12 - 4;
                      uVar12 = uVar10 - uVar2;
                      if ((uVar10 < uVar2) || (uVar2 == 0)) goto LAB_009d7a8c;
                      puVar9 = puVar13 + 4 + uVar2;
                    } while (!bVar14);
                    uVar3 = *puVar13;
                    uVar4 = puVar13[1];
                    uVar1 = (uint)CONCAT11(uVar3,uVar4);
                    if ((*(ushort *)(param_1 + 0x4ae) != 0) &&
                       ((uVar12 != 0 || (uVar1 != *(ushort *)(param_1 + 0x4ae))))) {
                      ERR_new();
                      uVar7 = 0x280;
                      goto LAB_009d78bc;
                    }
                    iVar5 = check_in_list(param_1,uVar1,uVar7,lVar11,0);
                    if (iVar5 == 0) {
                      ERR_new();
                      uVar7 = 0x286;
                      goto LAB_009d78bc;
                    }
                    bVar14 = true;
                    iVar5 = check_in_list(param_1,uVar1,local_58,local_68,1);
                  } while (iVar5 == 0);
                  iVar5 = tls_group_allowed(param_1,uVar1,0x20004);
                  bVar14 = true;
                } while (iVar5 == 0);
                iVar5 = tls_valid_group(param_1,uVar1,0x304,0x304,0,0);
                bVar14 = true;
              } while (iVar5 == 0);
              lVar6 = ssl_generate_param_group(param_1,uVar1);
              *(long *)(param_1 + 0x4b0) = lVar6;
              if (lVar6 == 0) {
                ERR_new();
                ERR_set_debug("ssl/statem/extensions_srvr.c",0x299,"tls_parse_ctos_key_share");
                uVar7 = 0x50;
                uVar8 = 0x13a;
                goto LAB_009d78f0;
              }
              *(ushort *)(param_1 + 0x4ae) = CONCAT11(uVar3,uVar4);
              *(uint *)(*(long *)(param_1 + 0x918) + 0x308) = uVar1;
              iVar5 = tls13_set_encoded_pub_key(lVar6,puVar13 + 4,uVar2);
              bVar14 = false;
            } while (0 < iVar5);
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_srvr.c",0x2a4,"tls_parse_ctos_key_share");
            uVar7 = 0x2f;
            uVar8 = 0x132;
          }
        }
        goto LAB_009d78f0;
      }
    }
    ERR_new();
    uVar7 = 0x24d;
LAB_009d78e4:
    ERR_set_debug("ssl/statem/extensions_srvr.c",uVar7,"tls_parse_ctos_key_share");
    uVar7 = 0x32;
    uVar8 = 0x9f;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_srvr.c",0x248,"tls_parse_ctos_key_share");
    uVar7 = 0x50;
    uVar8 = 0xc0103;
  }
LAB_009d78f0:
  ossl_statem_fatal(param_1,uVar7,uVar8,0);
  return 0;
}

