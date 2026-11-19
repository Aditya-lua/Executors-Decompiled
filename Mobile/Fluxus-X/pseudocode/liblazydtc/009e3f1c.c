/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e3f1c
 */

undefined8 tls_process_finished(long param_1,undefined8 *param_2)

{
  void *b;
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  int *piVar5;
  ulong *puVar6;
  long lVar7;
  uint uVar8;
  ulong len;
  undefined8 *puVar9;
  undefined1 auStack_38 [8];
  
  if (*(int *)(param_1 + 0x38) != 0) {
    *(undefined4 *)(param_1 + 0x80) = 0;
    if (*(int *)(param_1 + 0xba8) != 4) {
      *(undefined4 *)(param_1 + 0x70) = 1;
    }
    if (((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
         (iVar2 = **(int **)(param_1 + 8), 0x303 < iVar2)) && (iVar2 != 0x10000)) &&
       (uVar3 = tls13_save_handshake_digest_for_pha(param_1), (int)uVar3 == 0)) {
      return uVar3;
    }
  }
  puVar9 = (undefined8 *)(param_1 + 8);
  piVar5 = (int *)*puVar9;
  uVar8 = *(uint *)(*(long *)(piVar5 + 0x30) + 0x60);
  if ((((uVar8 >> 3 & 1) == 0) && (0x303 < *piVar5)) && (*piVar5 != 0x10000)) {
    iVar2 = RECORD_LAYER_processed_read_pending(param_1 + 0xc58);
    if (iVar2 != 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_lib.c",0x329,"tls_process_finished");
      uVar3 = 10;
      uVar4 = 0xb6;
      goto LAB_009e40b8;
    }
    piVar5 = (int *)*puVar9;
    uVar8 = *(uint *)(*(long *)(piVar5 + 0x30) + 0x60);
  }
  if (((((uVar8 >> 3 & 1) == 0) && (0x303 < *piVar5)) && (*piVar5 != 0x10000)) ||
     (*(int *)(param_1 + 0x198) != 0)) {
    *(undefined4 *)(param_1 + 0x198) = 0;
    len = *(ulong *)(param_1 + 0x2c8);
    if (len == param_2[1]) {
      b = (void *)(param_1 + 0x248);
      iVar2 = CRYPTO_memcmp((void *)*param_2,b,len);
      if (iVar2 == 0) {
        if (len < 0x41) {
          iVar2 = *(int *)(param_1 + 0x38);
          if (iVar2 == 0) {
            memcpy((void *)(param_1 + 0x438),b,len);
            puVar6 = (ulong *)(param_1 + 0x478);
          }
          else {
            memcpy((void *)(param_1 + 0x3f0),b,len);
            puVar6 = (ulong *)(param_1 + 0x430);
          }
          *puVar6 = len;
          lVar7 = *(long *)((int *)*puVar9 + 0x30);
          if ((((*(byte *)(lVar7 + 0x60) >> 3 & 1) == 0) && (iVar1 = *(int *)*puVar9, 0x303 < iVar1)
              ) && (iVar1 != 0x10000)) {
            if (iVar2 == 0) {
              uVar3 = (**(code **)(lVar7 + 0x18))
                                (param_1,param_1 + 0x5c4,param_1 + 0x584,0,auStack_38);
              if ((int)uVar3 == 0) {
                return uVar3;
              }
              uVar3 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x20))(param_1,0x111);
              if ((int)uVar3 == 0) {
                return uVar3;
              }
              uVar3 = tls_process_initial_server_flight(param_1);
              iVar2 = (int)uVar3;
            }
            else {
              if (*(int *)(param_1 + 0xba8) == 4) {
                return 1;
              }
              uVar3 = (**(code **)(lVar7 + 0x20))(param_1,0x121);
              iVar2 = (int)uVar3;
            }
            if (iVar2 == 0) {
              return uVar3;
            }
          }
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/statem_lib.c",0x345,"tls_process_finished");
        uVar3 = 0x50;
        uVar4 = 0xc0103;
      }
      else {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_lib.c",0x33d,"tls_process_finished");
        uVar3 = 0x33;
        uVar4 = 0x95;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_lib.c",0x337,"tls_process_finished");
      uVar3 = 0x32;
      uVar4 = 0x6f;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x32f,"tls_process_finished");
    uVar3 = 10;
    uVar4 = 0x9a;
  }
LAB_009e40b8:
  ossl_statem_fatal(param_1,uVar3,uVar4,0);
  return 0;
}

