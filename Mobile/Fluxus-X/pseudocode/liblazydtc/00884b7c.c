/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00884b7c
 */

void FUN_00884b7c(undefined8 *param_1,undefined8 *param_2,byte param_3,int param_4)

{
  int iVar1;
  long lVar2;
  char cVar3;
  int iVar4;
  byte *pbVar5;
  undefined8 uVar6;
  ulong uVar7;
  undefined8 *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (DAT_00d1f088 == '\x01') {
    uVar7 = param_1[0xf3];
  }
  else {
    uVar7 = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
  }
  local_50 = param_2;
  if (uVar7 < 200) {
    FUN_0086e2d0(param_1 + 0xd0,&local_50);
    if (DAT_00d1f088 == '\x01') {
      param_1[0xf3] = param_1[0xf3] + 1;
    }
    pbVar5 = (byte *)FUN_00886aac(param_1 + 0x14,&local_50);
    uVar6 = *param_1;
    *pbVar5 = param_3;
    pbVar5[1] = 1;
    iVar4 = FUN_008769d0(uVar6);
    cVar3 = DAT_00d1f0e8;
    iVar1 = iVar4;
    if (param_4 != -1) {
      iVar1 = param_4;
    }
    uVar7 = (ulong)param_3;
    *(int *)(pbVar5 + 4) = iVar4;
    *(int *)(pbVar5 + 8) = iVar1;
    *(byte *)((long)param_1 + uVar7 + 0x698) = pbVar5[2];
    if (cVar3 == '\x01') {
      *(int *)((long)param_1 + uVar7 * 4 + 0x818) = *(int *)((long)param_1 + uVar7 * 4 + 0x818) + 1;
    }
    if (*(long *)(lVar2 + 0x28) == local_48) {
      return;
    }
  }
  else if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 1,"Out of local registers when trying to allocate %s: exceeded limit %d",
                 *param_2,200);
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

