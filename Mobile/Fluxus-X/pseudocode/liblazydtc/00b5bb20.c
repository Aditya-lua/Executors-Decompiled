/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5bb20
 */

ulong ossl_rand_pool_keep_random_devices_open(ulong param_1)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  __dev_t local_b0;
  __ino_t local_a8;
  uint local_a0;
  long local_90;
  
  iVar1 = (int)param_1;
  if (iVar1 == 0) {
    lVar3 = 0;
    do {
      uVar2 = *(uint *)((long)&DAT_00d23828 + lVar3);
      param_1 = (ulong)uVar2;
      if (uVar2 != 0xffffffff) {
        uVar2 = fstat(uVar2,(stat *)&local_b0);
        param_1 = (ulong)uVar2;
        if ((((uVar2 != 0xffffffff) && (*(__dev_t *)((long)&DAT_00d23830 + lVar3) == local_b0)) &&
            (*(__ino_t *)((long)&DAT_00d23838 + lVar3) == local_a8)) &&
           (((local_a0 ^ *(uint *)((long)&DAT_00d23840 + lVar3)) < 0x200 &&
            (*(long *)((long)&DAT_00d23848 + lVar3) == local_90)))) {
          uVar2 = close(*(int *)((long)&DAT_00d23828 + lVar3));
          param_1 = (ulong)uVar2;
        }
      }
      *(undefined4 *)((long)&DAT_00d23828 + lVar3) = 0xffffffff;
      lVar3 = lVar3 + 0x28;
    } while (lVar3 != 0xa0);
  }
  DAT_00cca448 = iVar1;
  return param_1;
}

