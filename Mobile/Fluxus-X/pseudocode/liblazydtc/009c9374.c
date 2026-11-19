/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9374
 */

undefined8 dtls1_buffer_record(long param_1,long param_2,uchar *param_3)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *data;
  pitem *item;
  pitem *ppVar4;
  
  uVar1 = pqueue_size(*(pqueue *)(param_2 + 8));
  uVar3 = 0;
  if (uVar1 < 100) {
    data = CRYPTO_malloc(0x90,"ssl/record/rec_layer_d1.c",0x9b);
    item = pitem_new(param_3,data);
    if ((data == (undefined8 *)0x0) || (item == (pitem *)0x0)) {
      CRYPTO_free(data);
      pitem_free(item);
      ERR_new();
      ERR_set_debug("ssl/record/rec_layer_d1.c",0xa0,"dtls1_buffer_record");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
    }
    else {
      uVar3 = *(undefined8 *)(param_1 + 0x1ca8);
      data[1] = *(undefined8 *)(param_1 + 0x1cb0);
      *data = uVar3;
      uVar3 = *(undefined8 *)(param_1 + 0xc98);
      data[7] = *(undefined8 *)(param_1 + 0xca0);
      data[6] = uVar3;
      uVar3 = *(undefined8 *)(param_1 + 0xc88);
      data[5] = *(undefined8 *)(param_1 + 0xc90);
      data[4] = uVar3;
      uVar3 = *(undefined8 *)(param_1 + 0xc78);
      data[3] = *(undefined8 *)(param_1 + 0xc80);
      data[2] = uVar3;
      memcpy(data + 8,(void *)(param_1 + 0x12a8),0x50);
      item->data = data;
      *(undefined8 *)(param_1 + 0xc80) = 0;
      *(undefined8 *)(param_1 + 0xc78) = 0;
      *(undefined8 *)(param_1 + 0xca0) = 0;
      *(undefined8 *)(param_1 + 0xc98) = 0;
      *(undefined8 *)(param_1 + 0xc90) = 0;
      *(undefined8 *)(param_1 + 0xc88) = 0;
      memset((void *)(param_1 + 0x12a8),0,0xa10);
      iVar2 = ssl3_setup_buffers(param_1);
      if (iVar2 != 0) {
        ppVar4 = pqueue_insert(*(pqueue *)(param_2 + 8),item);
        if (ppVar4 == (pitem *)0x0) {
          CRYPTO_free((void *)data[2]);
          CRYPTO_free(data);
          pitem_free(item);
        }
        return 1;
      }
      CRYPTO_free((void *)data[2]);
      CRYPTO_free(data);
      pitem_free(item);
    }
    uVar3 = 0xffffffff;
  }
  return uVar3;
}

