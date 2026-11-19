/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e384
 */

int * ossl_core_bio_new_from_bio(undefined8 param_1)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int *ptr;
  long lVar5;
  
  ptr = CRYPTO_malloc(0x18,"crypto/bio/ossl_core_bio.c",0x1a);
  if (ptr != (int *)0x0) {
    lVar5 = CRYPTO_THREAD_lock_new();
    *(long *)(ptr + 2) = lVar5;
    if (lVar5 != 0) {
      *ptr = 1;
      iVar4 = BIO_up_ref(param_1);
      if (iVar4 != 0) {
        *(undefined8 *)(ptr + 4) = param_1;
        return ptr;
      }
      do {
        iVar4 = *ptr;
        iVar3 = iVar4 + -1;
        cVar1 = '\x01';
        bVar2 = (bool)ExclusiveMonitorPass(ptr,0x10);
        if (bVar2) {
          *ptr = iVar3;
          cVar1 = ExclusiveMonitorsStatus();
        }
      } while (cVar1 != '\0');
      if (iVar3 == 0) {
        DataMemoryBarrier(2,1);
      }
      else if (1 < iVar4) {
        return (int *)0x0;
      }
      BIO_free(*(BIO **)(ptr + 4));
      CRYPTO_THREAD_lock_free(*(undefined8 *)(ptr + 2));
    }
  }
  CRYPTO_free(ptr);
  return (int *)0x0;
}

