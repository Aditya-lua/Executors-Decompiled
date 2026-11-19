/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00858f2c
 */

void FUN_00858f2c(long param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  void *__dest;
  int iVar5;
  uint uVar6;
  int *piVar7;
  undefined8 uVar8;
  ulong __n;
  char *pcVar9;
  undefined8 *puVar10;
  undefined4 local_98;
  undefined4 uStack_94;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined8 local_80;
  ulong uStack_78;
  void *local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  piVar7 = (int *)FUN_00853538(param_1 + 0x70,0,1);
  puVar10 = (undefined8 *)((ulong)&local_98 | 4);
  while (*piVar7 - 0x11aU < 6 && (1 << (ulong)(*piVar7 - 0x11aU & 0x1f) & 0x23U) != 0) {
    if (*(char *)(param_1 + 1) == '\x01') {
      local_98 = *(undefined4 *)(param_1 + 0x90);
      uStack_8c = (undefined4)*(undefined8 *)(param_1 + 0x9c);
      uStack_88 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
      uStack_94 = (undefined4)*(undefined8 *)(param_1 + 0x94);
      uStack_90 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x94) >> 0x20);
      FUN_0086e950(param_1 + 0xf0,&local_98);
    }
    if (*(int *)(param_1 + 0x90) == 0x11a) {
      iVar5 = FUN_008521f4(param_1 + 0x90);
      if ((iVar5 != 0) && (pcVar9 = *(char **)(param_1 + 0xa8), *pcVar9 == '!')) {
        uVar6 = FUN_008521f4(param_1 + 0x90);
        if (uVar6 == 0) {
LAB_00859158:
          uVar8 = *(undefined8 *)(param_1 + 0x94);
          local_98 = CONCAT31(local_98._1_3_,*(undefined1 *)(param_1 + 0x120));
          puVar10[1] = *(undefined8 *)(param_1 + 0x9c);
          *puVar10 = uVar8;
        }
        else {
          __n = (ulong)uVar6;
          while( true ) {
            __n = __n - 1;
            if ((4 < (byte)pcVar9[__n & 0xffffffff] - 9) && ((byte)pcVar9[__n & 0xffffffff] != 0x20)
               ) break;
            if ((int)__n == 0) goto LAB_00859158;
          }
          uVar8 = *(undefined8 *)(param_1 + 0x94);
          local_98 = CONCAT31(local_98._1_3_,*(undefined1 *)(param_1 + 0x120));
          puVar10[1] = *(undefined8 *)(param_1 + 0x9c);
          *puVar10 = uVar8;
          if (__n < 0xfffffffffffffff8) {
            if (__n < 0x17) {
              local_80 = CONCAT71(local_80._1_7_,(char)((int)__n << 1));
              __dest = (void *)((long)&local_80 + 1);
            }
            else {
              uVar1 = 0x1a;
              if ((__n | 7) != 0x17) {
                uVar1 = (__n | 7) + 1;
              }
              local_70 = operator_new(uVar1);
              local_80 = uVar1 | 1;
              __dest = local_70;
              uStack_78 = __n;
            }
            if (__n != 0) {
              memmove(__dest,pcVar9 + 1,__n);
            }
            puVar2 = *(undefined8 **)(param_1 + 0x110);
            puVar3 = *(undefined8 **)(param_1 + 0x118);
            *(undefined1 *)((long)__dest + __n) = 0;
            if (puVar2 < puVar3) {
              *(undefined4 *)(puVar2 + 2) = uStack_88;
              puVar2[1] = CONCAT44(uStack_8c,uStack_90);
              *puVar2 = CONCAT44(uStack_94,local_98);
              puVar2[5] = local_70;
              puVar2[4] = uStack_78;
              puVar2[3] = local_80;
              *(undefined8 **)(param_1 + 0x110) = puVar2 + 6;
            }
            else {
                    /* try { // try from 008590f8 to 00859103 has its CatchHandler @ 00859180 */
              uVar8 = FUN_008704f0(param_1 + 0x108,&local_98);
              *(undefined8 *)(param_1 + 0x110) = uVar8;
              if ((local_80 & 1) != 0) {
                operator_delete(local_70,local_80 & 0xfffffffffffffffe);
              }
            }
            goto LAB_00858f9c;
          }
        }
        if (*(long *)(lVar4 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe124();
        }
        goto LAB_008591b8;
      }
    }
    else if (*(int *)(param_1 + 0x90) == 0x11f) break;
LAB_00858f9c:
    piVar7 = (int *)FUN_00853538(param_1 + 0x70,0,0);
  }
  if (*(long *)(lVar4 + 0x28) == local_68) {
    return;
  }
LAB_008591b8:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

