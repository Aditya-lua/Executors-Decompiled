/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087a3fc
 */

undefined4 * FUN_0087a3fc(long *param_1,undefined4 *param_2,undefined8 *param_3)

{
  ulong uVar1;
  undefined4 *puVar2;
  long lVar3;
  void *pvVar4;
  size_t sVar5;
  void *pvVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  char *__s;
  void *__dest;
  long lVar10;
  
  lVar3 = tpidr_el0;
  lVar7 = *(long *)(lVar3 + 0x28);
  lVar10 = param_1[1] - *param_1;
  uVar1 = (lVar10 >> 5) + 1;
  if (uVar1 >> 0x3b == 0) {
    uVar8 = param_1[2] - *param_1;
    uVar9 = (long)uVar8 >> 4;
    if (uVar9 <= uVar1) {
      uVar9 = uVar1;
    }
    if (0x7fffffffffffffdf < uVar8) {
      uVar9 = 0x7ffffffffffffff;
    }
    if (uVar9 == 0) {
      pvVar4 = (void *)0x0;
    }
    else {
      if (uVar9 >> 0x3b != 0) {
        if (*(long *)(lVar3 + 0x28) == lVar7) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe1b8();
        }
        goto LAB_0087a5e4;
      }
      pvVar4 = operator_new(uVar9 << 5);
    }
    __s = (char *)*param_3;
    puVar2 = (undefined4 *)((long)pvVar4 + lVar10);
    *puVar2 = *param_2;
    sVar5 = strlen(__s);
    if (sVar5 < 0xfffffffffffffff8) {
      if (sVar5 < 0x17) {
        pvVar6 = (void *)((long)puVar2 + 9);
        *(char *)(puVar2 + 2) = (char)((int)sVar5 << 1);
        if (sVar5 != 0) goto LAB_0087a504;
      }
      else {
        uVar1 = 0x1a;
        if ((sVar5 | 7) != 0x17) {
          uVar1 = (sVar5 | 7) + 1;
        }
                    /* try { // try from 0087a4ec to 0087a4f3 has its CatchHandler @ 0087a5c0 */
        pvVar6 = operator_new(uVar1);
        *(size_t *)(puVar2 + 4) = sVar5;
        *(void **)(puVar2 + 6) = pvVar6;
        *(ulong *)(puVar2 + 2) = uVar1 | 1;
LAB_0087a504:
        memmove(pvVar6,__s,sVar5);
      }
      *(undefined1 *)((long)pvVar6 + sVar5) = 0;
      sVar5 = param_1[1] - *param_1;
      __dest = (void *)((long)puVar2 - sVar5);
      memcpy(__dest,(void *)*param_1,sVar5);
      pvVar6 = (void *)*param_1;
      lVar10 = param_1[2];
      *param_1 = (long)__dest;
      param_1[1] = (long)(puVar2 + 8);
      param_1[2] = (long)((long)pvVar4 + uVar9 * 0x20);
      if (pvVar6 != (void *)0x0) {
        operator_delete(pvVar6,lVar10 - (long)pvVar6);
      }
      if (*(long *)(lVar3 + 0x28) == lVar7) {
        return puVar2 + 8;
      }
      goto LAB_0087a5e4;
    }
  }
  else {
    if (*(long *)(lVar3 + 0x28) != lVar7) goto LAB_0087a5e4;
    FUN_0087a660();
  }
  if (*(long *)(lVar3 + 0x28) == lVar7) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0087a5a8 to 0087a5ab has its CatchHandler @ 0087a5c0 */
    FUN_007fe124();
  }
LAB_0087a5e4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

