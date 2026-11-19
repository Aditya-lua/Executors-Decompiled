/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086f524
 */

long FUN_0086f524(long param_1,long param_2)

{
  ulong __n;
  void *__dest;
  undefined8 uVar1;
  void *pvVar2;
  
  FUN_0086f5d8();
  *(undefined8 *)(param_1 + 0x38) = 0;
  *(undefined8 *)(param_1 + 0x40) = 0;
  *(undefined8 *)(param_1 + 0x48) = 0;
  pvVar2 = *(void **)(param_2 + 0x38);
  __n = *(long *)(param_2 + 0x40) - (long)pvVar2;
  if (__n != 0) {
    if ((long)__n < 0) {
                    /* try { // try from 0086f5a4 to 0086f5a7 has its CatchHandler @ 0086f5a8 */
      uVar1 = FUN_0086f78c();
                    /* catch() { ... } // from try @ 0086f560 with catch @ 0086f5a8
                       catch() { ... } // from try @ 0086f5a4 with catch @ 0086f5a8 */
      pvVar2 = *(void **)(param_1 + 0x38);
      if (pvVar2 != (void *)0x0) {
        *(void **)(param_1 + 0x40) = pvVar2;
        operator_delete(pvVar2,*(long *)(param_1 + 0x48) - (long)pvVar2);
      }
      FUN_008592dc(param_1);
                    /* WARNING: Subroutine does not return */
      FUN_00c2c090(uVar1);
    }
                    /* try { // try from 0086f560 to 0086f567 has its CatchHandler @ 0086f5a8 */
    __dest = operator_new(__n);
    *(void **)(param_1 + 0x38) = __dest;
    *(void **)(param_1 + 0x40) = __dest;
    *(ulong *)(param_1 + 0x48) = (long)__dest + __n;
    memcpy(__dest,pvVar2,__n);
    *(ulong *)(param_1 + 0x40) = (long)__dest + __n;
  }
  *(undefined8 *)(param_1 + 0x50) = *(undefined8 *)(param_2 + 0x50);
  return param_1;
}

