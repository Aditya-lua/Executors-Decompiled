/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7dd4
 */

int ossl_asn1_do_lock(long *param_1,int param_2,char *param_3)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  long lVar7;
  
  if ((*param_3 == '\x06') || (iVar6 = 0, *param_3 == '\x01')) {
    lVar5 = *(long *)(param_3 + 0x20);
    if (lVar5 == 0) {
      iVar6 = 0;
    }
    else {
      iVar6 = 0;
      if ((*(byte *)(lVar5 + 8) & 1) != 0) {
        lVar7 = *param_1;
        piVar1 = (int *)(lVar7 + *(int *)(lVar5 + 0xc));
        if (param_2 == 1) {
          do {
            iVar6 = *piVar1 + 1;
            cVar2 = '\x01';
            bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
            if (bVar3) {
              *piVar1 = iVar6;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
        }
        else {
          lVar5 = (long)*(int *)(lVar5 + 0x10);
          if (param_2 == 0) {
            *piVar1 = 1;
            lVar4 = CRYPTO_THREAD_lock_new();
            *(long *)(lVar7 + lVar5) = lVar4;
            if (lVar4 != 0) {
              return 1;
            }
            ERR_new();
            ERR_set_debug("crypto/asn1/tasn_utl.c",0x59,"ossl_asn1_do_lock");
            ERR_set_error(0xd,0xc0100,0);
          }
          else if (param_2 == -1) {
            do {
              iVar6 = *piVar1 + -1;
              cVar2 = '\x01';
              bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
              if (bVar3) {
                *piVar1 = iVar6;
                cVar2 = ExclusiveMonitorsStatus();
              }
            } while (cVar2 != '\0');
            if (iVar6 == 0) {
              DataMemoryBarrier(2,1);
              CRYPTO_THREAD_lock_free(*(undefined8 *)(lVar7 + lVar5));
              *(undefined8 *)(lVar7 + lVar5) = 0;
              return 0;
            }
            return iVar6;
          }
          iVar6 = -1;
        }
      }
    }
  }
  return iVar6;
}

