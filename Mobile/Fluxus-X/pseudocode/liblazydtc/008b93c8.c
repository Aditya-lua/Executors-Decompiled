/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b93c8
 */

void FUN_008b93c8(byte *param_1,double *param_2)

{
  byte bVar1;
  long lVar2;
  bool bVar3;
  ulong uVar4;
  uint uVar5;
  double dVar6;
  byte *local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  dVar6 = strtod((char *)param_1,(char **)&local_40);
  *param_2 = dVar6;
  if (local_40 == param_1) {
    bVar3 = false;
  }
  else {
    bVar1 = *local_40;
    if ((bVar1 | 0x20) == 0x78) {
      uVar4 = strtoul((char *)param_1,(char **)&local_40,0x10);
      *param_2 = (double)uVar4;
      bVar1 = *local_40;
    }
    uVar5 = (uint)bVar1;
    if (uVar5 == 0) {
      bVar3 = true;
    }
    else {
      while ((local_40 = local_40 + 1, uVar5 - 9 < 5 || (uVar5 == 0x20))) {
        uVar5 = (uint)*local_40;
      }
      bVar3 = uVar5 == 0;
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar3);
  }
  return;
}

