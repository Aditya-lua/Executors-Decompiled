/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba23e0
 */

undefined8
psa_parse_key_data_from_storage
          (long *param_1,ulong param_2,undefined8 *param_3,ulong *param_4,undefined2 *param_5)

{
  uint uVar1;
  undefined8 uVar2;
  void *__dest;
  ulong __size;
  
  if (((param_2 < 0x24) || (*param_1 != 0x59454b00415350)) || ((int)param_1[1] != 0)) {
    uVar2 = 0xffffff67;
  }
  else {
    uVar1 = *(uint *)(param_1 + 4);
    __size = (ulong)uVar1;
    uVar2 = 0xffffff67;
    *param_4 = __size;
    if ((uVar1 >> 0xd == 0) && (__size <= param_2 - 0x24)) {
      if (uVar1 == 0) {
        *param_3 = 0;
      }
      else {
        __dest = calloc(1,__size);
        *param_3 = __dest;
        if (__dest == (void *)0x0) {
          return 0xffffff73;
        }
        memcpy(__dest,(void *)((long)param_1 + 0x24),__size);
      }
      uVar2 = 0;
      *(undefined4 *)(param_5 + 2) = *(undefined4 *)((long)param_1 + 0xc);
      *param_5 = (short)param_1[2];
      param_5[1] = *(undefined2 *)((long)param_1 + 0x12);
      *(undefined4 *)(param_5 + 4) = *(undefined4 *)((long)param_1 + 0x14);
      *(int *)(param_5 + 6) = (int)param_1[3];
      *(undefined4 *)(param_5 + 8) = *(undefined4 *)((long)param_1 + 0x1c);
    }
  }
  return uVar2;
}

