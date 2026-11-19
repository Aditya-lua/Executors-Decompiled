/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e4604
 */

undefined8 tls_finish_handshake(long param_1,undefined8 param_2,int param_3,int param_4)

{
  int iVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  int *piVar6;
  long lVar7;
  code *pcVar8;
  
  iVar1 = *(int *)(param_1 + 0x70);
  if (param_3 != 0) {
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      BUF_MEM_free(*(BUF_MEM **)(param_1 + 0x88));
      *(undefined8 *)(param_1 + 0x88) = 0;
    }
    iVar4 = ssl_free_wbio_buffer(param_1);
    if (iVar4 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_lib.c",0x42d,"tls_finish_handshake");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      return 0;
    }
    *(undefined8 *)(param_1 + 0x98) = 0;
  }
  if (((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
       (iVar4 = **(int **)(param_1 + 8), 0x303 < iVar4)) && (iVar4 != 0x10000)) &&
     ((*(int *)(param_1 + 0x38) == 0 && (*(int *)(param_1 + 0xba8) == 4)))) {
    *(undefined4 *)(param_1 + 0xba8) = 1;
  }
  if (iVar1 != 0) {
    *(undefined4 *)(param_1 + 0xba0) = 0;
    *(undefined4 *)(param_1 + 0x3c) = 0;
    *(undefined4 *)(param_1 + 0x70) = 0;
    *(undefined4 *)(param_1 + 0xa98) = 0;
    ssl3_cleanup_key_block(param_1);
    piVar6 = *(int **)(param_1 + 8);
    if (*(int *)(param_1 + 0x38) == 0) {
      if ((((*(uint *)(*(long *)(piVar6 + 0x30) + 0x60) >> 3 & 1) == 0) && (0x303 < *piVar6)) &&
         (*piVar6 != 0x10000)) {
        if (((ulong)(*(SSL_CTX **)(param_1 + 0xb88))->new_session_cb & 1) == 0) goto LAB_009e478c;
        SSL_CTX_remove_session(*(SSL_CTX **)(param_1 + 0xb88),*(SSL_SESSION **)(param_1 + 0x918));
        iVar4 = *(int *)(param_1 + 0x4d0);
      }
      else {
        ssl_update_cache(param_1,1);
LAB_009e478c:
        iVar4 = *(int *)(param_1 + 0x4d0);
      }
      if (iVar4 != 0) {
        piVar6 = (int *)(*(long *)(param_1 + 0xb88) + 0x9c);
        do {
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar6,0x10);
          if (bVar3) {
            *piVar6 = *piVar6 + 1;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
      }
      piVar6 = (int *)(*(long *)(param_1 + 0xb88) + 0x80);
      *(code **)(param_1 + 0x30) = ossl_statem_connect;
      do {
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(piVar6,0x10);
        if (bVar3) {
          *piVar6 = *piVar6 + 1;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
    }
    else {
      if ((((*(uint *)(*(long *)(piVar6 + 0x30) + 0x60) >> 3 & 1) != 0) || (*piVar6 < 0x304)) ||
         (*piVar6 == 0x10000)) {
        ssl_update_cache(param_1,2);
      }
      piVar6 = (int *)(*(long *)(param_1 + 0x9a8) + 0x8c);
      do {
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(piVar6,0x10);
        if (bVar3) {
          *piVar6 = *piVar6 + 1;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
      *(code **)(param_1 + 0x30) = ossl_statem_accept;
    }
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) != 0) {
      lVar7 = *(long *)(param_1 + 0x4b8);
      *(undefined2 *)(lVar7 + 0x110) = 0;
      *(undefined4 *)(lVar7 + 0x10c) = 0;
      dtls1_clear_received_buffer(param_1);
    }
  }
  pcVar8 = *(code **)(param_1 + 0x978);
  if (pcVar8 == (code *)0x0) {
    pcVar8 = *(code **)(*(long *)(param_1 + 0x9a8) + 0x120);
    ossl_statem_set_in_init(param_1,0);
    if (pcVar8 == (code *)0x0) goto LAB_009e4870;
  }
  else {
    ossl_statem_set_in_init(param_1,0);
  }
  if (((iVar1 != 0) || ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0))
     || (((iVar1 = **(int **)(param_1 + 8), iVar1 < 0x304 ||
          ((iVar1 == 0x10000 || (*(long *)(param_1 + 0x240) == 0)))) ||
         (*(long *)(param_1 + 0x2c8) == 0)))) {
    (*pcVar8)(param_1,0x20,1);
  }
LAB_009e4870:
  if (param_4 == 0) {
    ossl_statem_set_in_init(param_1,1);
    uVar5 = 2;
  }
  else {
    uVar5 = 1;
  }
  return uVar5;
}

