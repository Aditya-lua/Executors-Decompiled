/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d1c74
 */

undefined8 FUN_009d1c74(long param_1,uint param_2,int param_3)

{
  undefined2 uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong local_50;
  long local_48;
  
  if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) {
    return 1;
  }
  uVar3 = 1;
  if ((param_2 >> 0xb & 1) != 0) {
    return 1;
  }
  iVar2 = **(int **)(param_1 + 8);
  if (iVar2 < 0x304) {
    return 1;
  }
  if (iVar2 == 0x10000) {
    return 1;
  }
  if ((*(int *)(param_1 + 0x38) == 0 && param_3 == 0) &&
     ((*(int *)(param_1 + 0x4d0) == 0 || ((*(byte *)(param_1 + 0xb28) & 1) == 0)))) {
    ERR_new(1);
    ERR_set_debug("ssl/statem/extensions.c",0x526,"final_key_share");
    uVar4 = 0x6d;
LAB_009d1e8c:
    uVar3 = 0x65;
  }
  else {
    if (*(int *)(param_1 + 0x38) == 0) {
      if (param_3 != 0) {
        return 1;
      }
      iVar2 = tls13_generate_handshake_secret(param_1,0,0);
      if (iVar2 != 0) {
        return 1;
      }
      ERR_new();
      uVar3 = 0x5a8;
    }
    else if (*(long *)(param_1 + 0x4b0) == 0) {
      if (((param_3 != 0) && (*(int *)(param_1 + 0x8e8) == 0)) &&
         ((*(int *)(param_1 + 0x4d0) == 0 || ((*(byte *)(param_1 + 0xb28) >> 1 & 1) != 0)))) {
        uVar5 = *(undefined8 *)(param_1 + 0xad8);
        uVar6 = *(undefined8 *)(param_1 + 0xad0);
        uVar3 = tls1_get_supported_groups(param_1,&local_48,&local_50);
        if (local_50 != 0) {
          uVar7 = 0;
          do {
            uVar1 = *(undefined2 *)(local_48 + uVar7 * 2);
            uVar3 = check_in_list(param_1,uVar1,uVar5,uVar6,1);
            if ((((int)uVar3 != 0) &&
                (uVar3 = tls_group_allowed(param_1,uVar1,0x20004), (int)uVar3 != 0)) &&
               (uVar3 = tls_valid_group(param_1,uVar1,0x304,0x304,0,0), (int)uVar3 != 0)) break;
            uVar7 = uVar7 + 1;
          } while (uVar7 < local_50);
          if (uVar7 < local_50) {
            *(undefined2 *)(param_1 + 0x4ae) = uVar1;
            goto LAB_009d1e44;
          }
        }
      }
      if ((*(int *)(param_1 + 0x4d0) == 0) || ((*(byte *)(param_1 + 0xb28) & 1) == 0)) {
        ERR_new(uVar3);
        ERR_set_debug("ssl/statem/extensions.c",0x587,"final_key_share");
        uVar4 = 0x28;
        if (param_3 == 0) {
          uVar4 = 0x6d;
        }
        goto LAB_009d1e8c;
      }
      if (((*(byte *)(param_1 + 0xa9) >> 3 & 1) == 0) || (*(int *)(param_1 + 0xb48) != 0))
      goto LAB_009d1eb4;
      if (*(int *)(param_1 + 0x8e8) == 0) goto LAB_009d1e44;
      ERR_new(uVar3);
      uVar3 = 0x593;
    }
    else {
      if (((*(byte *)(param_1 + 0xa9) >> 3 & 1) == 0) || (*(int *)(param_1 + 0xb48) != 0)) {
LAB_009d1eb4:
        if (*(int *)(param_1 + 0x8e8) == 1) {
          *(undefined4 *)(param_1 + 0x8e8) = 2;
        }
        return 1;
      }
      if (*(int *)(param_1 + 0x8e8) == 0) {
LAB_009d1e44:
        *(undefined4 *)(param_1 + 0x8e8) = 1;
        return 1;
      }
      ERR_new(1);
      uVar3 = 0x556;
    }
    ERR_set_debug("ssl/statem/extensions.c",uVar3,"final_key_share");
    uVar4 = 0x50;
    uVar3 = 0xc0103;
  }
  ossl_statem_fatal(param_1,uVar4,uVar3,0);
  return 0;
}

