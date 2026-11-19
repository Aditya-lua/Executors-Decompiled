/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d3f6c
 */

undefined8 tls_construct_ctos_psk(long param_1,undefined8 param_2)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  time_t tVar6;
  undefined8 uVar7;
  int *piVar8;
  long lVar9;
  long lVar10;
  long *plVar11;
  uint uVar12;
  undefined8 local_78;
  undefined8 local_70;
  long local_68;
  undefined8 local_58;
  
  local_78 = 0;
  local_70 = 0;
  piVar8 = *(int **)(param_1 + 0x918);
  *(undefined4 *)(param_1 + 0xb50) = 0;
  if ((*piVar8 == 0x304) && ((*(long *)(piVar8 + 0xd0) != 0 || (*(long *)(param_1 + 0x920) != 0))))
  {
    if (*(int *)(param_1 + 0x8e8) == 1) {
      lVar4 = ssl_handshake_md(param_1);
      piVar8 = *(int **)(param_1 + 0x918);
      if (*(long *)(piVar8 + 0xd0) == 0) goto LAB_009d4050;
LAB_009d3fe0:
      if (*(long *)(piVar8 + 0xbe) == 0) {
        ERR_new();
        uVar7 = 0x3f1;
      }
      else {
        lVar5 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),
                       *(undefined4 *)(*(long *)(piVar8 + 0xbe) + 0x40));
        if ((lVar5 == 0) || ((lVar5 != lVar4 && (*(int *)(param_1 + 0x8e8) == 1)))) {
LAB_009d4038:
          uVar12 = 0;
          lVar9 = *(long *)(param_1 + 0x920);
          goto joined_r0x009d4040;
        }
        tVar6 = time((time_t *)0x0);
        lVar9 = *(long *)(param_1 + 0x918);
        iVar3 = (int)tVar6 - *(int *)(lVar9 + 0x2e0);
        uVar1 = 0;
        if (iVar3 != 0) {
          uVar1 = iVar3 - 1;
        }
        if (*(ulong *)(lVar9 + 0x348) < (ulong)uVar1) goto LAB_009d4038;
        uVar12 = uVar1 * 1000;
        if ((uVar1 != 0) && (uVar12 / 1000 != uVar1)) {
          lVar9 = *(long *)(param_1 + 0x920);
          goto joined_r0x009d4040;
        }
        uVar12 = *(int *)(lVar9 + 0x350) + uVar12;
        iVar3 = EVP_MD_get_size(lVar5);
        lVar9 = *(long *)(param_1 + 0x920);
        lVar10 = (long)iVar3;
        bVar2 = true;
        *(int *)(param_1 + 0xb50) = *(int *)(param_1 + 0xb50) + 1;
        if (lVar9 != 0) goto LAB_009d40bc;
        lVar4 = 0;
        lVar9 = 0;
LAB_009d4138:
        plVar11 = (long *)(param_1 + 0x920);
        iVar3 = WPACKET_put_bytes__(param_2,0x29,2);
        if (((iVar3 == 0) || (iVar3 = WPACKET_start_sub_packet_len__(param_2,2), iVar3 == 0)) ||
           (iVar3 = WPACKET_start_sub_packet_len__(param_2,2), iVar3 == 0)) {
          ERR_new();
          uVar7 = 0x456;
        }
        else if ((bVar2) &&
                ((iVar3 = WPACKET_sub_memcpy__
                                    (param_2,*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x338),
                                     *(undefined8 *)(*(long *)(param_1 + 0x918) + 0x340),2),
                 iVar3 == 0 || (iVar3 = WPACKET_put_bytes__(param_2,uVar12,4), iVar3 == 0)))) {
          ERR_new();
          uVar7 = 0x45e;
        }
        else {
          if (*plVar11 != 0) {
            iVar3 = WPACKET_sub_memcpy__
                              (param_2,*(undefined8 *)(param_1 + 0x928),
                               *(undefined8 *)(param_1 + 0x930),2);
            if ((iVar3 == 0) || (iVar3 = WPACKET_put_bytes__(param_2,0,4), iVar3 == 0)) {
              ERR_new();
              uVar7 = 0x467;
              goto LAB_009d4320;
            }
            *(int *)(param_1 + 0xb50) = *(int *)(param_1 + 0xb50) + 1;
          }
          iVar3 = WPACKET_close(param_2);
          if ((((((iVar3 != 0) && (iVar3 = WPACKET_get_total_written(param_2,&local_58), iVar3 != 0)
                 ) && (iVar3 = WPACKET_start_sub_packet_len__(param_2,2), iVar3 != 0)) &&
               ((!bVar2 ||
                (iVar3 = WPACKET_sub_allocate_bytes__(param_2,lVar10,&local_70,1), iVar3 != 0)))) &&
              ((*plVar11 == 0 ||
               (iVar3 = WPACKET_sub_allocate_bytes__(param_2,lVar4,&local_78,1), iVar3 != 0)))) &&
             ((((iVar3 = WPACKET_close(param_2), iVar3 != 0 &&
                (iVar3 = WPACKET_close(param_2), iVar3 != 0)) &&
               (iVar3 = WPACKET_get_total_written(param_2,&local_68), iVar3 != 0)) &&
              (iVar3 = WPACKET_fill_lengths(param_2), iVar3 != 0)))) {
            lVar4 = WPACKET_get_curr(param_2);
            if ((bVar2) &&
               (iVar3 = tls_psk_do_binder(param_1,lVar5,lVar4 - local_68,local_58,0,local_70,
                                          *(undefined8 *)(param_1 + 0x918),1,0), iVar3 != 1)) {
              return 0;
            }
            if ((*plVar11 == 0) ||
               (iVar3 = tls_psk_do_binder(param_1,lVar9,lVar4 - local_68,local_58,0,local_78,
                                          *plVar11,1,1), iVar3 == 1)) {
              return 1;
            }
            return 0;
          }
          ERR_new();
          uVar7 = 0x47c;
        }
      }
LAB_009d4320:
      ERR_set_debug("ssl/statem/extensions_clnt.c",uVar7,"tls_construct_ctos_psk");
      uVar7 = 0xc0103;
    }
    else {
      lVar4 = 0;
      if (*(long *)(piVar8 + 0xd0) != 0) goto LAB_009d3fe0;
LAB_009d4050:
      uVar12 = 0;
      lVar5 = 0;
      lVar9 = *(long *)(param_1 + 0x920);
joined_r0x009d4040:
      if (lVar9 == 0) goto LAB_009d4060;
      lVar10 = 0;
      bVar2 = false;
LAB_009d40bc:
      lVar9 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),
                     *(undefined4 *)(*(long *)(lVar9 + 0x2f8) + 0x40));
      if (lVar9 == 0) {
        ERR_new();
        uVar7 = 0x442;
      }
      else {
        if ((lVar9 == lVar4) || (*(int *)(param_1 + 0x8e8) != 1)) {
          iVar3 = EVP_MD_get_size(lVar9);
          lVar4 = (long)iVar3;
          goto LAB_009d4138;
        }
        ERR_new();
        uVar7 = 1099;
      }
      ERR_set_debug("ssl/statem/extensions_clnt.c",uVar7,"tls_construct_ctos_psk");
      uVar7 = 0xdb;
    }
    ossl_statem_fatal(param_1,0x50,uVar7,0);
    uVar7 = 0;
  }
  else {
LAB_009d4060:
    uVar7 = 2;
  }
  return uVar7;
}

