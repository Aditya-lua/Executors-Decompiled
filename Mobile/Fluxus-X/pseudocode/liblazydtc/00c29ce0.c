/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29ce0
 */

ulong FUN_00c29ce0(undefined *param_1)

{
  ushort uVar1;
  uint uVar2;
  ulong extraout_x0;
  int iVar3;
  ushort *puVar4;
  ushort *puVar5;
  ushort *puVar6;
  
  if ((param_1 < &DAT_00d27ea0) || ((undefined *)0xd2809f < param_1)) {
    free(param_1);
    return extraout_x0;
  }
  puVar6 = (ushort *)(param_1 + -4);
  pthread_mutex_lock((pthread_mutex_t *)&DAT_00d27e68);
  if ((DAT_00d27e90 != (ushort *)0x0) && (DAT_00d27e90 != (ushort *)&DAT_00d280a0)) {
    puVar4 = (ushort *)0x0;
    puVar5 = DAT_00d27e90;
    do {
      uVar1 = puVar5[1];
      if (puVar5 + (ulong)uVar1 * 2 == puVar6) {
        puVar5[1] = *(short *)(param_1 + -2) + uVar1;
        goto code_r0x00c29df4;
      }
      if (puVar6 + (ulong)*(ushort *)(param_1 + -2) * 2 == puVar5) {
        *(ushort *)(param_1 + -2) = *(ushort *)(param_1 + -2) + uVar1;
        if (puVar4 == (ushort *)0x0) {
          DAT_00d27e90 = puVar6;
          *puVar6 = *puVar5;
        }
        else {
          *puVar4 = (ushort)((int)puVar6 - 0xd27ea0U >> 2);
        }
        goto code_r0x00c29df4;
      }
      uVar1 = *puVar5;
      puVar4 = puVar5;
      puVar5 = (ushort *)(&DAT_00d27ea0 + (ulong)uVar1 * 4);
    } while ((ulong)uVar1 != 0x80);
  }
  iVar3 = (int)DAT_00d27e90;
  DAT_00d27e90 = puVar6;
  *puVar6 = (ushort)(iVar3 - 0xd27ea0U >> 2);
code_r0x00c29df4:
  uVar2 = pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d27e68);
  return (ulong)uVar2;
}

