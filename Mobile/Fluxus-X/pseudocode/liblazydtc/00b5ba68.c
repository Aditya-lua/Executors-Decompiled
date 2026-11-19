/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5ba68
 */

int ossl_rand_pool_cleanup(void)

{
  int __fd;
  long lVar1;
  __dev_t local_b0;
  __ino_t local_a8;
  uint local_a0;
  long local_90;
  
  lVar1 = 0;
  do {
    __fd = *(int *)((long)&DAT_00d23828 + lVar1);
    if (__fd != -1) {
      __fd = fstat(__fd,(stat *)&local_b0);
      if ((((__fd != -1) && (*(__dev_t *)((long)&DAT_00d23830 + lVar1) == local_b0)) &&
          (*(__ino_t *)((long)&DAT_00d23838 + lVar1) == local_a8)) &&
         (((local_a0 ^ *(uint *)((long)&DAT_00d23840 + lVar1)) < 0x200 &&
          (*(long *)((long)&DAT_00d23848 + lVar1) == local_90)))) {
        __fd = close(*(int *)((long)&DAT_00d23828 + lVar1));
      }
    }
    *(undefined4 *)((long)&DAT_00d23828 + lVar1) = 0xffffffff;
    lVar1 = lVar1 + 0x28;
  } while (lVar1 != 0xa0);
  return __fd;
}

