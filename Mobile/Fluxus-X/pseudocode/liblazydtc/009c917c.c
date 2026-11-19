/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c917c
 */

void DTLS_RECORD_LAYER_clear(long *param_1)

{
  pitem *ppVar1;
  void *__s;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  void *pvVar5;
  
  __s = (void *)param_1[0x217];
  ppVar1 = pqueue_pop(*(pqueue *)((long)__s + 0x30));
  if (ppVar1 != (pitem *)0x0) {
    do {
      CRYPTO_free(*(void **)((long)ppVar1->data + 0x10));
      CRYPTO_free(ppVar1->data);
      pitem_free(ppVar1);
      ppVar1 = pqueue_pop(*(pqueue *)((long)__s + 0x30));
    } while (ppVar1 != (pitem *)0x0);
  }
  ppVar1 = pqueue_pop(*(pqueue *)((long)__s + 0x40));
  if (ppVar1 != (pitem *)0x0) {
    do {
      pvVar5 = ppVar1->data;
      if ((*(byte *)(*param_1 + 0x9e8) >> 1 & 1) != 0) {
        OPENSSL_cleanse(*(void **)((long)pvVar5 + 0x10),*(size_t *)((long)pvVar5 + 0x20));
      }
      CRYPTO_free(*(void **)((long)pvVar5 + 0x10));
      CRYPTO_free(ppVar1->data);
      pitem_free(ppVar1);
      ppVar1 = pqueue_pop(*(pqueue *)((long)__s + 0x40));
    } while (ppVar1 != (pitem *)0x0);
  }
  ppVar1 = pqueue_pop(*(pqueue *)((long)__s + 0x50));
  if (ppVar1 != (pitem *)0x0) {
    do {
      pvVar5 = ppVar1->data;
      if ((*(byte *)(*param_1 + 0x9e8) >> 1 & 1) != 0) {
        OPENSSL_cleanse(*(void **)((long)pvVar5 + 0x10),*(size_t *)((long)pvVar5 + 0x20));
      }
      CRYPTO_free(*(void **)((long)pvVar5 + 0x10));
      CRYPTO_free(ppVar1->data);
      pitem_free(ppVar1);
      ppVar1 = pqueue_pop(*(pqueue *)((long)__s + 0x50));
    } while (ppVar1 != (pitem *)0x0);
  }
  uVar2 = *(undefined8 *)((long)__s + 0x30);
  uVar3 = *(undefined8 *)((long)__s + 0x40);
  uVar4 = *(undefined8 *)((long)__s + 0x50);
  memset(__s,0,0x68);
  *(undefined8 *)((long)__s + 0x30) = uVar2;
  *(undefined8 *)((long)__s + 0x40) = uVar3;
  *(undefined8 *)((long)__s + 0x50) = uVar4;
  return;
}

