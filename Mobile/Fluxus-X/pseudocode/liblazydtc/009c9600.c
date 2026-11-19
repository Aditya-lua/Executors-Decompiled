/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9600
 */

undefined8 dtls1_process_buffered_records(long param_1)

{
  ushort uVar1;
  int iVar2;
  pitem *ppVar3;
  short *psVar4;
  long lVar5;
  ushort *puVar6;
  long *plVar7;
  
  ppVar3 = pqueue_peek(*(pqueue *)(*(long *)(param_1 + 0x1d10) + 0x30));
  if (ppVar3 != (pitem *)0x0) {
    psVar4 = *(short **)(param_1 + 0x1d10);
    if (psVar4[0x14] != *psVar4) {
      return 1;
    }
    if (*(long *)(param_1 + 0xc98) != 0) {
      return 1;
    }
    ppVar3 = pqueue_peek(*(pqueue *)(psVar4 + 0x18));
    if (ppVar3 != (pitem *)0x0) {
      do {
        ppVar3 = pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x1d10) + 0x30));
        if (ppVar3 != (pitem *)0x0) {
          plVar7 = ppVar3->data;
          SSL3_BUFFER_release((long *)(param_1 + 0xc78));
          lVar5 = *plVar7;
          *(long *)(param_1 + 0x1cb0) = plVar7[1];
          *(long *)(param_1 + 0x1ca8) = lVar5;
          lVar5 = plVar7[6];
          *(long *)(param_1 + 0xca0) = plVar7[7];
          *(long *)(param_1 + 0xc98) = lVar5;
          lVar5 = plVar7[4];
          *(long *)(param_1 + 0xc90) = plVar7[5];
          *(long *)(param_1 + 0xc88) = lVar5;
          lVar5 = plVar7[2];
          *(long *)(param_1 + 0xc80) = plVar7[3];
          *(long *)(param_1 + 0xc78) = lVar5;
          memcpy((void *)(param_1 + 0x12a8),plVar7 + 8,0x50);
          lVar5 = *plVar7;
          *(undefined2 *)(param_1 + 0x1cfe) = *(undefined2 *)(lVar5 + 9);
          *(undefined4 *)(param_1 + 0x1cfa) = *(undefined4 *)(lVar5 + 5);
          CRYPTO_free(ppVar3->data);
          pitem_free(ppVar3);
        }
        puVar6 = *(ushort **)(param_1 + 0x1d10);
        uVar1 = *puVar6;
        if (*(ulong *)(param_1 + 0x12e8) == (ulong)uVar1) {
          puVar6 = puVar6 + 4;
        }
        else {
          if ((*(ulong *)(param_1 + 0x12e8) != (ulong)uVar1 + 1) || (puVar6[0x14] == uVar1)) {
            ERR_new();
            ERR_set_debug("ssl/record/rec_layer_d1.c",0x10c,"dtls1_process_buffered_records");
            ossl_statem_fatal(param_1,0x50,0xc0103,0);
            return 0;
          }
          puVar6 = puVar6 + 0xc;
        }
        iVar2 = dtls1_record_replay_check(param_1,puVar6);
        if ((iVar2 == 0) || (iVar2 = dtls1_process_record(param_1,puVar6), iVar2 == 0)) {
          iVar2 = ossl_statem_in_error(param_1);
          if (iVar2 != 0) {
            return 0;
          }
          *(undefined8 *)(param_1 + 0x12b0) = 0;
          *(undefined8 *)(param_1 + 0x1cb0) = 0;
        }
        else {
          iVar2 = dtls1_buffer_record(param_1,*(long *)(param_1 + 0x1d10) + 0x38,param_1 + 0x12f0);
          if (iVar2 < 0) {
            return 0;
          }
        }
        ppVar3 = pqueue_peek(*(pqueue *)(*(long *)(param_1 + 0x1d10) + 0x30));
      } while (ppVar3 != (pitem *)0x0);
    }
  }
  psVar4 = *(short **)(param_1 + 0x1d10);
  psVar4[0x1c] = *psVar4;
  psVar4[0x14] = *psVar4 + 1;
  return 1;
}

