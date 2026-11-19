/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e1d2c
 */

undefined4 dtls1_retransmit_message(long param_1,undefined8 param_2,undefined4 *param_3)

{
  long lVar1;
  undefined1 uVar2;
  undefined2 uVar3;
  undefined4 uVar4;
  pitem *ppVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  undefined1 *puVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  long local_58;
  
  local_58 = (ulong)CONCAT11((char)param_2,(char)((ulong)param_2 >> 8)) << 0x30;
  ppVar5 = pqueue_find(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x120),(uchar *)&local_58);
  if (ppVar5 == (pitem *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_dtls.c",0x4ac,"dtls1_retransmit_message");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar4 = 0;
    *param_3 = 0;
  }
  else {
    *param_3 = 1;
    puVar9 = ppVar5->data;
    lVar1 = 0xc;
    if (*(int *)(puVar9 + 0x28) != 0) {
      lVar1 = 1;
    }
    memcpy(*(void **)(*(long *)(param_1 + 0x88) + 8),*(void **)(puVar9 + 0x58),
           *(long *)(puVar9 + 8) + lVar1);
    lVar6 = *(long *)(puVar9 + 8);
    lVar7 = *(long *)(param_1 + 0x4b8);
    *(long *)(param_1 + 0x98) = lVar6 + lVar1;
    uVar2 = *puVar9;
    uVar3 = *(undefined2 *)(puVar9 + 0x10);
    uVar8 = *(undefined8 *)(puVar9 + 0x20);
    *(long *)(lVar7 + 0x140) = lVar6;
    *(undefined1 *)(lVar7 + 0x138) = uVar2;
    *(undefined2 *)(lVar7 + 0x148) = uVar3;
    *(undefined8 *)(lVar7 + 0x150) = 0;
    *(undefined8 *)(lVar7 + 0x158) = uVar8;
    uVar8 = *(undefined8 *)(param_1 + 0x878);
    uVar10 = *(undefined8 *)(param_1 + 0x890);
    uVar11 = *(undefined8 *)(param_1 + 0x868);
    uVar12 = *(undefined8 *)(param_1 + 0x918);
    uVar3 = *(undefined2 *)(*(long *)(param_1 + 0x1d10) + 2);
    *(undefined4 *)(lVar7 + 0x204) = 1;
    *(undefined8 *)(param_1 + 0x878) = *(undefined8 *)(puVar9 + 0x30);
    *(undefined8 *)(param_1 + 0x890) = *(undefined8 *)(puVar9 + 0x38);
    *(undefined8 *)(param_1 + 0x868) = *(undefined8 *)(puVar9 + 0x40);
    *(undefined8 *)(param_1 + 0x918) = *(undefined8 *)(puVar9 + 0x48);
    DTLS_RECORD_LAYER_set_saved_w_epoch(param_1 + 0xc58,*(undefined2 *)(puVar9 + 0x50));
    uVar4 = 0x16;
    if (*(int *)(puVar9 + 0x28) != 0) {
      uVar4 = 0x14;
    }
    uVar4 = dtls1_do_write(param_1,uVar4);
    *(undefined8 *)(param_1 + 0x878) = uVar8;
    *(undefined8 *)(param_1 + 0x890) = uVar10;
    *(undefined8 *)(param_1 + 0x868) = uVar11;
    *(undefined8 *)(param_1 + 0x918) = uVar12;
    DTLS_RECORD_LAYER_set_saved_w_epoch(param_1 + 0xc58,uVar3);
    *(undefined4 *)(*(long *)(param_1 + 0x4b8) + 0x204) = 0;
    BIO_ctrl(*(BIO **)(param_1 + 0x18),0xb,0,(void *)0x0);
  }
  return uVar4;
}

