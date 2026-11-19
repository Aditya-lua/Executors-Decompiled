/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916ba8
 */

undefined8
thunk_FUN_0090ee24(long param_1,undefined8 param_2,undefined4 param_3,undefined4 *param_4)

{
  long *plVar1;
  char cVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  long *plVar6;
  pthread_mutex_t *ppVar7;
  undefined4 *puVar8;
  long lVar9;
  long lVar10;
  undefined4 uVar11;
  undefined1 (*pauVar12) [16];
  long *__s;
  undefined4 uVar13;
  undefined1 auVar14 [16];
  
  lVar3 = tpidr_el0;
  lVar9 = *(long *)(lVar3 + 0x28);
  pauVar12 = *(undefined1 (**) [16])(param_1 + 0xda8);
  *param_4 = 0;
  lVar10 = *(long *)(param_1 + 0x20);
  if (*(char *)(lVar10 + 0x573) == '\x01') {
LAB_0090ee9c:
    uVar11 = 2;
  }
  else {
    uVar5 = FUN_0091724c(param_1);
    lVar10 = *(long *)(param_1 + 0x20);
    if ((uVar5 & 1) == 0) goto LAB_0090ee9c;
    uVar11 = 10;
    if (*(char *)(lVar10 + 0x573) != '\x02') {
      uVar11 = 0;
    }
  }
  cVar2 = *(char *)(lVar10 + 0x572);
  auVar14 = FUN_00941cb8();
  *pauVar12 = auVar14;
  plVar6 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x88);
  *(long **)(param_1 + 0xda0) = plVar6;
  if (plVar6 == (long *)0x0) {
LAB_0090f078:
    uVar11 = 0xc;
  }
  else {
    *(undefined4 *)(param_1 + 0xdb0) = param_3;
    *(byte *)(param_1 + 0xdb8) = *(byte *)(param_1 + 0xdb8) & 0xfe;
    uVar13 = 1;
    if (cVar2 != '\x03') {
      uVar13 = 2;
    }
    *(undefined4 *)(param_1 + 0xdb4) = 0;
    *(undefined8 *)(param_1 + 0xd98) = 0;
    *plVar6 = 0;
    __s = plVar6 + 3;
    *__s = 0;
    plVar6[4] = 0;
    plVar6[5] = 0;
    plVar6[8] = 0;
    plVar6[9] = 0;
    plVar6[6] = 0;
    plVar6[7] = 0;
    plVar6[0x10] = (long)plVar6;
    *(undefined4 *)(plVar6 + 4) = 1;
    *(undefined4 *)((long)plVar6 + 0x24) = param_3;
    *(undefined4 *)(plVar6 + 10) = 0;
    *(undefined4 *)((long)plVar6 + 0x54) = uVar11;
    *(undefined4 *)(plVar6 + 0xb) = uVar13;
    *(undefined4 *)((long)plVar6 + 0x7c) = 0;
    *(undefined8 *)((long)plVar6 + 0x74) = 0;
    *(undefined8 *)((long)plVar6 + 0x6c) = 0;
    *(undefined8 *)((long)plVar6 + 100) = 0;
    *(undefined8 *)((long)plVar6 + 0x5c) = 0;
    ppVar7 = (pthread_mutex_t *)(*(code *)PTR_malloc_00cc4670)(0x28);
    *__s = (long)&ppVar7->__data;
    if (ppVar7 == (pthread_mutex_t *)0x0) {
LAB_0090eff0:
      iVar4 = (int)plVar6[7];
      if (iVar4 != -1) {
        close(iVar4);
        *(int *)(plVar6 + 7) = -1;
      }
      ppVar7 = (pthread_mutex_t *)*__s;
joined_r0x0090f0d4:
      if (ppVar7 != (pthread_mutex_t *)0x0) {
        pthread_mutex_destroy(ppVar7);
        (*(code *)PTR_free_00cc4678)(*__s);
      }
      (*(code *)PTR_free_00cc4678)(plVar6[5]);
      if (plVar6[9] != 0) {
        FUN_0090f270();
      }
      if (*(int *)((long)plVar6 + 0x3c) != -1) {
        close(*(int *)((long)plVar6 + 0x3c));
      }
      memset(__s,0,0x70);
      *(undefined8 *)(param_1 + 0xda0) = 0;
      (*(code *)PTR_free_00cc4678)(plVar6);
      goto LAB_0090f078;
    }
    pthread_mutex_init(ppVar7,(pthread_mutexattr_t *)0x0);
    iVar4 = FUN_0093f910(plVar6 + 7,0);
    if (iVar4 < 0) {
      plVar6[7] = -1;
      ppVar7 = (pthread_mutex_t *)*__s;
      goto joined_r0x0090f0d4;
    }
    *(undefined4 *)(plVar6 + 8) = 0;
    lVar10 = (*(code *)PTR_strdup_00cc4688)(param_2);
    plVar6[5] = lVar10;
    if (lVar10 == 0) goto LAB_0090eff0;
    plVar1 = (long *)(param_1 + 0xd90);
    (*(code *)PTR_free_00cc4678)(*plVar1);
    lVar10 = (*(code *)PTR_strdup_00cc4688)(param_2);
    *plVar1 = lVar10;
    if (lVar10 == 0) {
      uVar11 = 0xc;
    }
    else {
      *(undefined4 *)(plVar6 + 4) = 0;
      lVar10 = FUN_0090f970(&LAB_0090f100,__s);
      *plVar6 = lVar10;
      if (lVar10 != 0) {
        *param_4 = 1;
        goto LAB_0090f094;
      }
      *(undefined4 *)(plVar6 + 4) = 1;
      puVar8 = (undefined4 *)__errno();
      uVar11 = *puVar8;
    }
    FUN_0090ea5c(plVar1);
  }
  puVar8 = (undefined4 *)__errno();
  *puVar8 = uVar11;
  FUN_00904b80(param_1,"getaddrinfo() thread failed to start");
LAB_0090f094:
  if (*(long *)(lVar3 + 0x28) != lVar9) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

