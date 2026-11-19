/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a68a8
 */

undefined8 dtls1_clear(int *param_1)

{
  pqueue pq;
  undefined8 uVar1;
  undefined8 uVar2;
  uint uVar3;
  pitem *item;
  undefined8 uVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  
  DTLS_RECORD_LAYER_clear(param_1 + 0x316);
  lVar6 = *(long *)(param_1 + 0x12e);
  if (lVar6 != 0) {
    pq = *(pqueue *)(lVar6 + 0x118);
    uVar1 = *(undefined8 *)(lVar6 + 0x120);
    uVar7 = *(undefined8 *)(lVar6 + 0x208);
    uVar4 = *(undefined8 *)(lVar6 + 0x128);
    uVar2 = *(undefined8 *)(lVar6 + 0x130);
    item = pqueue_pop(pq);
    if (item != (pitem *)0x0) {
      do {
        dtls1_hm_fragment_free(item->data);
        pitem_free(item);
        item = pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x12e) + 0x118));
      } while (item != (pitem *)0x0);
    }
    dtls1_clear_sent_buffer(param_1);
    memset(*(void **)(param_1 + 0x12e),0,0x210);
    lVar6 = *(long *)(param_1 + 0x12e);
    *(undefined8 *)(lVar6 + 0x208) = uVar7;
    if (param_1[0xe] != 0) {
      *(undefined8 *)(lVar6 + 0x100) = 0xff;
    }
    uVar3 = SSL_get_options(param_1);
    lVar6 = *(long *)(param_1 + 0x12e);
    if ((uVar3 >> 0xc & 1) != 0) {
      *(undefined8 *)(lVar6 + 0x128) = uVar4;
      *(undefined8 *)(lVar6 + 0x130) = uVar2;
    }
    *(pqueue *)(lVar6 + 0x118) = pq;
    *(undefined8 *)(lVar6 + 0x120) = uVar1;
  }
  uVar4 = ssl3_clear(param_1);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  iVar5 = **(int **)(param_1 + 2);
  if (iVar5 == 0x1ffff) {
    iVar5 = 0xfefd;
  }
  else if (*(char *)((long)param_1 + 0x9e9) < '\0') {
    *param_1 = 0x100;
    param_1[0x283] = 0x100;
    return 1;
  }
  *param_1 = iVar5;
  return 1;
}

