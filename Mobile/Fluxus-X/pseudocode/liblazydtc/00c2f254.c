/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2f254
 */

undefined8 FUN_00c2f254(long param_1,ulong param_2,long *param_3,uint param_4)

{
  bool bVar1;
  undefined *__src;
  ulong uVar2;
  undefined *__dest;
  long *plVar3;
  size_t __n;
  long lVar4;
  byte bVar5;
  undefined1 auStack_6f0 [32];
  undefined8 local_6d0;
  long local_6b8;
  undefined4 uStack_6b0;
  long local_6a0;
  long local_698;
  undefined8 uStack_690;
  undefined1 auStack_688 [16];
  uint local_678;
  
  if (((param_4 == 0) ||
      (uVar2 = FUN_00c2f784(*(undefined8 *)(param_1 + 8),param_2,param_3[2],param_3[3],
                            param_3[2] + (ulong)param_4,&local_6b8,auStack_6f0), (uVar2 & 1) == 0))
     && ((param_3[4] == 0 ||
         (uVar2 = FUN_00c2f94c(*(undefined8 *)(param_1 + 8),param_2,param_3[4],(int)param_3[5],
                               &local_6b8,auStack_6f0), (uVar2 & 1) == 0)))) {
    lVar4 = *param_3;
    pthread_rwlock_rdlock((pthread_rwlock_t *)&DAT_00d280f4);
    if (PTR_DAT_00cca6a0 < PTR_DAT_00cca6a8) {
      plVar3 = (long *)PTR_DAT_00cca6a0;
      if (lVar4 == -1) {
        do {
          if (((ulong)plVar3[1] <= param_2) && (param_2 < (ulong)plVar3[2])) goto LAB_00c2f35c;
          plVar3 = plVar3 + 4;
        } while (plVar3 < PTR_DAT_00cca6a8);
      }
      else {
        do {
          if (((lVar4 == *plVar3) && ((ulong)plVar3[1] <= param_2)) && (param_2 < (ulong)plVar3[2]))
          goto LAB_00c2f35c;
          plVar3 = plVar3 + 4;
        } while (plVar3 < PTR_DAT_00cca6a8);
      }
    }
    pthread_rwlock_unlock((pthread_rwlock_t *)&DAT_00d280f4);
    goto LAB_00c2f3a4;
  }
LAB_00c2f3c4:
  bVar5 = 1;
LAB_00c2f3c8:
  lVar4 = *param_3;
  memset(auStack_688,0,0x620);
  uVar2 = FUN_00c2d520(*(undefined8 *)(param_1 + 8),&local_6b8,auStack_6f0,param_2,4,auStack_688);
  if ((uVar2 & 1) == 0) {
    return 0;
  }
  *(undefined8 *)(param_1 + 0x230) = uStack_690;
  *(long *)(param_1 + 0x228) = local_698;
  *(undefined8 *)(param_1 + 0x238) = local_6d0;
  bVar1 = (bool)(bVar5 ^ 1);
  *(ulong *)(param_1 + 0x240) = (ulong)local_678;
  *(undefined4 *)(param_1 + 0x250) = 0x3000000;
  *(long *)(param_1 + 0x220) = local_6a0;
  *(undefined8 *)(param_1 + 0x248) = 0;
  *(undefined4 *)(param_1 + 0x254) = uStack_6b0;
  if (param_4 != 0) {
    bVar1 = true;
  }
  *(long *)(param_1 + 600) = local_6b8;
  *(long *)(param_1 + 0x260) = lVar4;
  if (bVar1) {
    return 1;
  }
  if (param_3[4] != 0) {
    return 1;
  }
  lVar4 = *param_3;
  pthread_rwlock_wrlock((pthread_rwlock_t *)&DAT_00d280f4);
  __src = PTR_DAT_00cca6a0;
  if (DAT_00cca6b0 <= PTR_DAT_00cca6a8) {
    __n = (long)DAT_00cca6b0 - (long)PTR_DAT_00cca6a0;
    __dest = malloc(__n * 4);
    memcpy(__dest,__src,__n);
    if ((undefined8 *)__src != &DAT_00d28130) {
      free(__src);
    }
    DAT_00cca6b0 = __dest + ((long)__n >> 3) * 0x20;
    PTR_DAT_00cca6a8 = __dest + __n;
    PTR_DAT_00cca6a0 = __dest;
  }
  *(long *)PTR_DAT_00cca6a8 = lVar4;
  *(long *)((long)PTR_DAT_00cca6a8 + 8) = local_6a0;
  *(long *)((long)PTR_DAT_00cca6a8 + 0x18) = local_6b8;
  *(long *)((long)PTR_DAT_00cca6a8 + 0x10) = local_698;
  PTR_DAT_00cca6a8 = (undefined *)((long)PTR_DAT_00cca6a8 + 0x20);
  pthread_rwlock_unlock((pthread_rwlock_t *)&DAT_00d280f4);
  return 1;
LAB_00c2f35c:
  lVar4 = plVar3[3];
  pthread_rwlock_unlock((pthread_rwlock_t *)&DAT_00d280f4);
  if ((lVar4 != 0) &&
     (uVar2 = FUN_00c2f784(*(undefined8 *)(param_1 + 8),param_2,param_3[2],param_3[3],lVar4,
                           &local_6b8,auStack_6f0), (uVar2 & 1) != 0)) {
    bVar5 = 0;
    goto LAB_00c2f3c8;
  }
LAB_00c2f3a4:
  uVar2 = FUN_00c2f784(*(undefined8 *)(param_1 + 8),param_2,param_3[2],param_3[3],0,&local_6b8,
                       auStack_6f0);
  if ((uVar2 & 1) == 0) {
    return 0;
  }
  goto LAB_00c2f3c4;
}

