/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2d38
 */

void psa_wipe_all_key_slots(void)

{
  void *__ptr;
  long lVar1;
  long lVar2;
  ulong uVar3;
  
  lVar1 = 0;
  do {
    __ptr = (void *)(&DAT_00d26028)[lVar1];
    if (__ptr != (void *)0x0) {
      uVar3 = 0x20;
      if (lVar1 != 0x16) {
        uVar3 = (ulong)(uint)(0x10 << (ulong)((uint)lVar1 & 0x1f));
      }
      if (uVar3 != 0) {
        lVar2 = 0;
        while( true ) {
          uVar3 = uVar3 - 1;
          if (*(int *)((long)__ptr + lVar2 + 0x18) != 0) {
            *(undefined8 *)((long)__ptr + lVar2 + 0x20) = 1;
            *(undefined4 *)((long)__ptr + lVar2 + 0x18) = 3;
            psa_wipe_key_slot();
          }
          if (uVar3 == 0) break;
          __ptr = (void *)(&DAT_00d26028)[lVar1];
          lVar2 = lVar2 + 0x38;
        }
        __ptr = (void *)(&DAT_00d26028)[lVar1];
      }
      free(__ptr);
      (&DAT_00d26028)[lVar1] = 0;
    }
    lVar1 = lVar1 + 1;
  } while (lVar1 != 0x17);
  memset(&DAT_00d260e0,0,0xb0);
  DAT_00d26190 = 0;
  return;
}

