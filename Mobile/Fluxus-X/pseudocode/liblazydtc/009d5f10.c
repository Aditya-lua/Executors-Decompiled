/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5f10
 */

undefined8
custom_ext_add(long param_1,uint param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5,
              undefined4 param_6)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  code *pcVar4;
  long lVar5;
  undefined2 *puVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  long local_78;
  undefined8 local_70;
  undefined4 local_64;
  
  lVar8 = *(long *)(param_1 + 0x898);
  if (*(long *)(lVar8 + 0x1e0) != 0) {
    lVar7 = 0;
    uVar9 = 0;
    do {
      local_78 = 0;
      local_70 = 0;
      lVar5 = *(long *)(lVar8 + 0x1d8);
      iVar2 = should_add_extension(param_1,*(undefined4 *)(lVar5 + lVar7 + 8),param_2,param_6);
      if ((iVar2 != 0) && (((param_2 & 0x1f00) == 0 || ((*(byte *)(lVar5 + lVar7 + 0xc) & 1) != 0)))
         ) {
        pcVar4 = *(code **)(lVar5 + lVar7 + 0x10);
        if ((param_2 >> 7 & 1) == 0) {
          if (pcVar4 != (code *)0x0) {
LAB_009d5fa8:
            iVar2 = (*pcVar4)(param_1,*(undefined2 *)(lVar5 + lVar7),param_2,&local_70,&local_78,
                              param_4,param_5,&local_64,
                              *(undefined8 *)((undefined2 *)(lVar5 + lVar7) + 0x10));
            if (iVar2 < 0) {
              ERR_new();
              ERR_set_debug("ssl/statem/extensions_cust.c",0xd4,"custom_ext_add");
              uVar3 = 0xea;
              goto LAB_009d6100;
            }
            if (iVar2 != 0) {
              lVar1 = uVar9 * 0x38;
              goto LAB_009d5fec;
            }
          }
        }
        else {
          lVar1 = lVar7;
          if (pcVar4 != (code *)0x0) goto LAB_009d5fa8;
LAB_009d5fec:
          puVar6 = (undefined2 *)(lVar5 + lVar1);
          iVar2 = WPACKET_put_bytes__(param_3,*puVar6,2);
          if ((((iVar2 == 0) || (iVar2 = WPACKET_start_sub_packet_len__(param_3,2), iVar2 == 0)) ||
              ((local_78 != 0 && (iVar2 = WPACKET_memcpy(param_3,local_70), iVar2 == 0)))) ||
             (iVar2 = WPACKET_close(param_3), iVar2 == 0)) {
            pcVar4 = *(code **)(lVar5 + lVar7 + 0x18);
            if (pcVar4 != (code *)0x0) {
              (*pcVar4)(param_1,*puVar6,param_2,local_70,*(undefined8 *)(lVar5 + lVar7 + 0x20));
            }
            ERR_new();
            uVar3 = 0xe1;
LAB_009d60c8:
            ERR_set_debug("ssl/statem/extensions_cust.c",uVar3,"custom_ext_add");
            local_64 = 0x50;
            uVar3 = 0xc0103;
LAB_009d6100:
            ossl_statem_fatal(param_1,local_64,uVar3,0);
            return 0;
          }
          if ((param_2 >> 7 & 1) != 0) {
            lVar1 = lVar5 + lVar7;
            if ((*(uint *)(lVar1 + 0xc) >> 1 & 1) != 0) {
              if (*(code **)(lVar1 + 0x18) != (code *)0x0) {
                (**(code **)(lVar1 + 0x18))
                          (param_1,*puVar6,param_2,local_70,*(undefined8 *)(lVar5 + lVar7 + 0x20));
              }
              ERR_new();
              uVar3 = 0xec;
              goto LAB_009d60c8;
            }
            *(uint *)(lVar1 + 0xc) = *(uint *)(lVar1 + 0xc) | 2;
          }
          pcVar4 = *(code **)(lVar5 + lVar7 + 0x18);
          if (pcVar4 != (code *)0x0) {
            (*pcVar4)(param_1,*puVar6,param_2,local_70,*(undefined8 *)(lVar5 + lVar7 + 0x20));
          }
        }
      }
      uVar9 = uVar9 + 1;
      lVar7 = lVar7 + 0x38;
    } while (uVar9 < *(ulong *)(lVar8 + 0x1e0));
  }
  return 1;
}

