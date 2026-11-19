/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2e44
 */

undefined8 tls1_set_server_sigalgs(long param_1)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined2 *puVar8;
  ulong uVar9;
  
  CRYPTO_free(*(void **)(param_1 + 0x1da8));
  *(undefined4 *)(param_1 + 0x3d8) = 0;
  *(undefined8 *)(param_1 + 0x3d0) = 0;
  *(undefined8 *)(param_1 + 0x3c8) = 0;
  *(undefined8 *)(param_1 + 0x3c0) = 0;
  *(undefined8 *)(param_1 + 0x3b8) = 0;
  *(undefined8 *)(param_1 + 0x1db0) = 0;
  *(long *)(param_1 + 0x1da8) = 0;
  if ((*(long *)(param_1 + 0x398) == 0) && (*(long *)(param_1 + 0x390) == 0)) {
    lVar5 = *(long *)(param_1 + 0x898);
    puVar8 = &DAT_0074cd8c;
    uVar1 = *(uint *)(lVar5 + 0x1c) & 0x30000;
    if (uVar1 == 0x30000) {
      uVar9 = 2;
    }
    else if (uVar1 == 0x20000) {
      puVar8 = &DAT_0074cd8e;
      uVar9 = 1;
    }
    else if (uVar1 == 0x10000) {
      puVar8 = &DAT_0074cd8c;
      uVar9 = 1;
    }
    else if ((*(int *)(param_1 + 0x38) == 1) &&
            (puVar8 = *(undefined2 **)(lVar5 + 0x1a8), puVar8 != (undefined2 *)0x0)) {
      uVar9 = *(ulong *)(lVar5 + 0x1b0);
    }
    else {
      puVar8 = *(undefined2 **)(lVar5 + 0x198);
      if (puVar8 == (undefined2 *)0x0) {
        puVar8 = &DAT_0074cd90;
        uVar9 = 0x1c;
      }
      else {
        uVar9 = *(ulong *)(lVar5 + 0x1a0);
      }
    }
    uVar7 = 0;
    do {
      lVar5 = FUN_009c1dc4(param_1,uVar7 & 0xffffffff);
      if ((lVar5 != 0) && (uVar9 != 0)) {
        uVar6 = 0;
        do {
          if (*(short *)(lVar5 + 8) == puVar8[uVar6]) {
            *(undefined4 *)(param_1 + uVar7 * 4 + 0x3b8) = 2;
            break;
          }
          uVar6 = uVar6 + 1;
        } while (uVar6 < uVar9);
      }
      uVar7 = uVar7 + 1;
    } while (uVar7 != 9);
LAB_009c2ff8:
    uVar3 = 1;
  }
  else {
    iVar2 = tls1_process_sigalgs(param_1);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("ssl/t1_lib.c",0x6c7,"tls1_set_server_sigalgs");
      uVar3 = 0x50;
      uVar4 = 0xc0103;
    }
    else {
      if (*(long *)(param_1 + 0x1da8) != 0) goto LAB_009c2ff8;
      ERR_new();
      ERR_set_debug("ssl/t1_lib.c",0x6cf,"tls1_set_server_sigalgs");
      uVar3 = 0x28;
      uVar4 = 0x178;
    }
    ossl_statem_fatal(param_1,uVar3,uVar4,0);
    uVar3 = 0;
  }
  return uVar3;
}

