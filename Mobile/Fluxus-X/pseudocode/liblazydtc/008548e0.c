/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008548e0
 */

undefined1  [16] FUN_008548e0(long *param_1)

{
  byte *__s2;
  byte bVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  undefined8 *puVar5;
  uint uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  byte *pbVar10;
  ulong __n;
  long *plVar11;
  void *__s1;
  long lVar12;
  long lVar13;
  undefined1 auVar14 [16];
  byte *local_78;
  uint local_70;
  undefined4 uStack_6c;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  uVar6 = *(uint *)(param_1 + 2);
  uVar9 = (ulong)(uVar6 + 1);
  *(uint *)(param_1 + 2) = uVar6 + 1;
  if (uVar9 < (ulong)param_1[1]) {
    do {
      bVar1 = *(byte *)(*param_1 + uVar9);
      if (((0x19 < (bVar1 | 0x20) - 0x61) && (9 < bVar1 - 0x30)) && (bVar1 != 0x5f)) break;
      uVar2 = (int)uVar9 + 1;
      uVar9 = (ulong)uVar2;
      *(uint *)(param_1 + 2) = uVar2;
    } while (uVar9 < (ulong)param_1[1]);
  }
  uVar2 = (uint)uVar9 - uVar6;
  __n = (ulong)uVar2;
  plVar11 = (long *)param_1[10];
  __s2 = (byte *)(*param_1 + (ulong)uVar6);
  if (*(char *)((long)param_1 + 0x59) == '\x01') {
    uStack_6c = 0;
    local_78 = __s2;
    local_70 = uVar2;
    FUN_00855340(plVar11,&local_78);
    puVar5 = (undefined8 *)FUN_0085546c(plVar11,&local_78);
    uVar9 = (ulong)*(uint *)((long)puVar5 + 0xc);
    if (*(uint *)((long)puVar5 + 0xc) == 0) {
      __s1 = (void *)FUN_0084e938(plVar11[7],__n + 1);
      memcpy(__s1,__s2,__n);
      *(undefined1 *)((long)__s1 + __n) = 0;
      *puVar5 = __s1;
      uVar6 = 0x11c;
      if (*__s2 != 0x40) {
        uVar6 = 0x119;
      }
      uVar9 = (ulong)uVar6;
      *(uint *)((long)puVar5 + 0xc) = uVar6;
    }
    else {
      __s1 = (void *)*puVar5;
    }
  }
  else {
    if (plVar11[5] != 0) {
      if ((uint)uVar9 == uVar6) {
        uVar7 = 0x8fc5e37bc9b65d29;
      }
      else {
        uVar7 = 0x811c9dc5;
        pbVar10 = __s2;
        uVar9 = __n;
        do {
          uVar9 = uVar9 - 1;
          uVar7 = (ulong)(((uint)uVar7 ^ (uint)*pbVar10) * 0x1000193);
          pbVar10 = pbVar10 + 1;
        } while (uVar9 != 0);
        uVar7 = uVar7 * -0x61c8864680b583eb;
      }
      lVar12 = plVar11[3];
      uVar7 = uVar7 >> ((ulong)*(byte *)(plVar11 + 6) & 0x3f);
      if ((*(ulong *)(lVar12 + (uVar7 >> 6) * 8) >> (uVar7 & 0x3f) & 1) != 0) {
        lVar8 = plVar11[4];
        lVar13 = *plVar11;
        do {
          puVar5 = (undefined8 *)(lVar13 + uVar7 * 0x10);
          if (*(uint *)(puVar5 + 1) == uVar2) {
            __s1 = (void *)*puVar5;
            iVar4 = memcmp(__s1,__s2,__n);
            if (iVar4 == 0) {
              uVar9 = (ulong)*(uint *)((long)puVar5 + 0xc);
              goto LAB_00854ad4;
            }
          }
          uVar7 = uVar7 + 1 & lVar8 - 1U;
        } while ((*(ulong *)(lVar12 + (uVar7 >> 6) * 8) >> (uVar7 & 0x3f) & 1) != 0);
      }
    }
    __s1 = (void *)0x0;
    uVar9 = 0x119;
  }
LAB_00854ad4:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  auVar14._8_8_ = uVar9;
  auVar14._0_8_ = __s1;
  return auVar14;
}

