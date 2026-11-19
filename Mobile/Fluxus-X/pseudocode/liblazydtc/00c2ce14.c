/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2ce14
 */

void FUN_00c2ce14(long *param_1,ulong param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  int *piVar6;
  int *piVar7;
  undefined *puVar8;
  undefined1 auStack_6f8 [32];
  long local_6d8;
  long local_6c0;
  undefined4 uStack_6b8;
  long local_6a8;
  long lStack_6a0;
  long local_698;
  undefined1 auStack_690 [16];
  long local_680;
  long local_660;
  undefined1 *puStack_658;
  ulong local_650;
  
  *(undefined1 *)((long)param_1 + 0x26a) = 0;
  lVar3 = (**(code **)(*param_1 + 0x18))(param_1,0xffffffff);
  if (lVar3 != 0) {
    local_660 = param_1[1];
    puStack_658 = auStack_690;
    uVar5 = (lVar3 - (param_2 & 1)) + (ulong)*(byte *)((long)param_1 + 0x269);
    local_650 = uVar5;
    iVar2 = dl_iterate_phdr(FUN_00c2f528,&local_660);
    if (((iVar2 != 0) && (local_680 != 0)) &&
       (uVar4 = FUN_00c2f254(param_1,uVar5,auStack_690,0), (uVar4 & 1) != 0)) {
      return;
    }
    pthread_rwlock_rdlock((pthread_rwlock_t *)&DAT_00d280f4);
    for (puVar8 = PTR_DAT_00cca6a0; puVar8 < PTR_DAT_00cca6a8; puVar8 = puVar8 + 0x20) {
      if ((*(ulong *)(puVar8 + 8) <= uVar5) && (uVar5 < *(ulong *)(puVar8 + 0x10))) {
        lVar3 = *(long *)(puVar8 + 0x18);
        pthread_rwlock_unlock((pthread_rwlock_t *)&DAT_00d280f4);
        if ((lVar3 != 0) &&
           (lVar3 = FUN_00c2c5cc(param_1[1],lVar3,&local_6c0,auStack_6f8,0), lVar3 == 0)) {
          memset(&local_660,0,0x620);
          uVar5 = FUN_00c2d520(param_1[1],&local_6c0,auStack_6f8,uVar5,4,&local_660);
          if ((uVar5 & 1) != 0) {
            param_1[0x49] = 0;
            param_1[0x46] = local_698;
            param_1[0x47] = local_6d8;
            param_1[0x48] = local_650 & 0xffffffff;
            *(undefined4 *)(param_1 + 0x4a) = 0x3000000;
            param_1[0x45] = lStack_6a0;
            param_1[0x44] = local_6a8;
            param_1[0x4c] = 0;
            param_1[0x4b] = local_6c0;
            *(undefined4 *)((long)param_1 + 0x254) = uStack_6b8;
            return;
          }
        }
        goto LAB_00c2cf94;
      }
    }
    pthread_rwlock_unlock((pthread_rwlock_t *)&DAT_00d280f4);
LAB_00c2cf94:
    piVar6 = (int *)(**(code **)(*param_1 + 0x18))(param_1,0xffffffff);
    if (piVar6 != (int *)0x0) {
      piVar7 = (int *)__errno();
      iVar2 = *piVar7;
      syscall(0x87,0xffffffff,piVar6,0,8);
      iVar1 = *piVar7;
      *piVar7 = iVar2;
      if (((iVar1 != 0xe) && (*piVar6 == -0x2d7fee98)) && (piVar6[1] == -0x2bffffff)) {
        param_1[0x4c] = 0;
        param_1[0x45] = (long)(piVar6 + 1);
        param_1[0x44] = (long)piVar6;
        *(undefined1 *)((long)param_1 + 0x26a) = 1;
        param_1[0x49] = 0;
        param_1[0x48] = 0;
        param_1[0x4b] = 0;
        param_1[0x4a] = 0;
        param_1[0x47] = 0;
        param_1[0x46] = 0;
        return;
      }
    }
  }
  *(undefined1 *)(param_1 + 0x4d) = 1;
  return;
}

