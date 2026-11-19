/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af66d8
 */

undefined8 FUN_00af66d8(int *param_1,void *param_2,void *param_3,int param_4)

{
  int iVar1;
  int *piVar2;
  
  if (param_1 == (int *)0x0) {
    return 0;
  }
  if (param_2 == (void *)0x0) {
    return 0;
  }
  if (param_3 == (void *)0x0) {
    return 0;
  }
  if (*param_1 == 1) {
    piVar2 = (int *)**(undefined8 **)(param_1 + 2);
    iVar1 = *piVar2;
    if (iVar1 < 0) {
      return 0;
    }
    if (param_4 < iVar1) {
      return 0;
    }
    if (0 < iVar1) {
      memcpy(param_2,*(void **)(piVar2 + 2),(long)iVar1);
      if ((*(ulong *)(piVar2 + 4) & 7) != 0) {
        *(byte *)((long)param_2 + (long)*piVar2 + -1) =
             *(byte *)((long)param_2 + (long)*piVar2 + -1) &
             (byte)(-0x100 >> (8U - (int)(*(ulong *)(piVar2 + 4) & 7) & 0x1f));
      }
    }
    memset((void *)((long)param_2 + (long)*piVar2),0,(long)param_4 - (long)*piVar2);
    piVar2 = *(int **)(*(long *)(param_1 + 2) + 8);
    iVar1 = *piVar2;
  }
  else {
    if (*param_1 != 0) {
      return 0;
    }
    piVar2 = *(int **)(param_1 + 2);
    iVar1 = *piVar2;
    if (iVar1 < 0) {
      return 0;
    }
    if (param_4 < iVar1) {
      return 0;
    }
    if (0 < iVar1) {
      memcpy(param_2,*(void **)(piVar2 + 2),(long)iVar1);
      if ((*(ulong *)(piVar2 + 4) & 7) != 0) {
        *(byte *)((long)param_2 + (long)*piVar2 + -1) =
             *(byte *)((long)param_2 + (long)*piVar2 + -1) &
             (byte)(-0x100 >> (8U - (int)(*(ulong *)(piVar2 + 4) & 7) & 0x1f));
      }
    }
    memset((void *)((long)param_2 + (long)*piVar2),0,(long)param_4 - (long)*piVar2);
    piVar2 = *(int **)(param_1 + 2);
    iVar1 = *piVar2;
  }
  if (iVar1 < 0) {
    return 0;
  }
  if (param_4 < iVar1) {
    return 0;
  }
  if (0 < iVar1) {
    memcpy(param_3,*(void **)(piVar2 + 2),(long)iVar1);
    if ((*(ulong *)(piVar2 + 4) & 7) != 0) {
      *(byte *)((long)param_3 + (long)*piVar2 + -1) =
           *(byte *)((long)param_3 + (long)*piVar2 + -1) |
           (byte)(0xff >> (ulong)(8U - (int)(*(ulong *)(piVar2 + 4) & 7) & 0x1f));
    }
  }
  memset((void *)((long)param_3 + (long)*piVar2),0xff,(long)param_4 - (long)*piVar2);
  return 1;
}

