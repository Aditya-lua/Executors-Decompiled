/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c27664
 */

void FUN_00c27664(long param_1,undefined8 *param_2)

{
  void *pvVar1;
  long lVar2;
  size_t sVar3;
  long *plVar4;
  
  lVar2 = param_2[1];
  pvVar1 = (void *)*param_2;
  if ((ulong)param_2[2] < lVar2 + 0xdU) {
    sVar3 = param_2[2] * 2;
    if (sVar3 <= lVar2 + 0x3edU) {
      sVar3 = lVar2 + 0x3edU;
    }
    param_2[2] = sVar3;
    pvVar1 = realloc(pvVar1,sVar3);
    *param_2 = pvVar1;
    if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar2 = param_2[1];
  }
  builtin_strncpy((char *)((long)pvVar1 + lVar2),"pixel vector[",0xd);
  plVar4 = *(long **)(param_1 + 0x10);
  lVar2 = *plVar4;
  param_2[1] = param_2[1] + 0xd;
  (**(code **)(lVar2 + 0x20))(plVar4,param_2);
  if ((*(ushort *)((long)plVar4 + 9) & 0xc0) != 0x40) {
    (**(code **)(*plVar4 + 0x28))(plVar4,param_2);
  }
  lVar2 = param_2[1];
  pvVar1 = (void *)*param_2;
  if ((ulong)param_2[2] < lVar2 + 1U) {
    sVar3 = param_2[2] * 2;
    if (sVar3 <= lVar2 + 0x3e1U) {
      sVar3 = lVar2 + 0x3e1U;
    }
    param_2[2] = sVar3;
    pvVar1 = realloc(pvVar1,sVar3);
    *param_2 = pvVar1;
    if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar2 = param_2[1];
  }
  *(undefined1 *)((long)pvVar1 + lVar2) = 0x5d;
  param_2[1] = param_2[1] + 1;
  return;
}

