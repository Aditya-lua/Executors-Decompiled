/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090c7ec
 */

long * FUN_0090c7ec(long *param_1,long param_2)

{
  long lVar1;
  uint uVar2;
  long *plVar3;
  byte bVar4;
  int __fd;
  long lVar5;
  long lVar6;
  
  lVar5 = param_1[2];
  plVar3 = param_1;
  if ((lVar5 != 0) && (__fd = *(int *)(lVar5 + 0x98), __fd != -1)) {
    if (((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
       (((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))) &&
        (0 < *(int *)(*param_1 + 0xc))))) {
      FUN_00904ddc(param_2,param_1,"cf_socket_close(%d)",__fd);
      __fd = *(int *)(lVar5 + 0x98);
    }
    lVar6 = param_1[3];
    lVar1 = lVar6 + (long)(int)param_1[4] * 4;
    if (__fd == *(int *)(lVar1 + 0x220)) {
      *(undefined4 *)(lVar1 + 0x220) = 0xffffffff;
      __fd = *(int *)(lVar5 + 0x98);
    }
    if (((lVar6 == 0) || ((*(byte *)(lVar5 + 0x134) >> 1 & 1) != 0)) ||
       (*(long *)(lVar6 + 0x18) == 0)) {
      if (lVar6 != 0) {
        FUN_0092e498(param_2,__fd);
      }
      uVar2 = close(__fd);
      plVar3 = (long *)(ulong)uVar2;
    }
    else {
      FUN_0092e498(param_2,__fd);
      FUN_0092f198(param_2,1);
      (**(code **)(lVar6 + 0x18))(*(undefined8 *)(lVar6 + 0x20),__fd);
      plVar3 = (long *)FUN_0092f198(param_2,0);
    }
    bVar4 = *(byte *)(lVar5 + 0x134);
    *(undefined4 *)(lVar5 + 0x98) = 0xffffffff;
    if (((bVar4 >> 3 & 1) != 0) && ((int)param_1[4] == 0)) {
      *(undefined8 *)(param_1[3] + 0x38) = 0;
      bVar4 = *(byte *)(lVar5 + 0x134);
    }
    *(undefined8 *)(lVar5 + 0x110) = 0;
    *(undefined8 *)(lVar5 + 0x118) = 0;
    *(byte *)(lVar5 + 0x134) = bVar4 & 0xf7;
    *(undefined8 *)(lVar5 + 0x100) = 0;
    *(undefined8 *)(lVar5 + 0x108) = 0;
  }
  *(byte *)((long)param_1 + 0x24) = *(byte *)((long)param_1 + 0x24) & 0xfe;
  return plVar3;
}

