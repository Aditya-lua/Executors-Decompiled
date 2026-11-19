/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd574
 */

/* std::__ndk1::__thread_struct::notify_all_at_thread_exit(std::__ndk1::condition_variable*,
   std::__ndk1::mutex*) */

void __thiscall
std::__ndk1::__thread_struct::notify_all_at_thread_exit
          (__thread_struct *this,condition_variable *param_1,mutex *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  void *pvVar3;
  long *plVar4;
  long lVar5;
  void *pvVar6;
  size_t __n;
  ulong uVar7;
  ulong uVar8;
  void *pvVar9;
  undefined8 *puVar10;
  long lVar11;
  long *plVar12;
  long lVar13;
  long *plVar14;
  undefined1 auVar15 [16];
  
  lVar11 = *(long *)this;
  puVar10 = *(undefined8 **)(lVar11 + 0x20);
  if (puVar10 < *(undefined8 **)(lVar11 + 0x28)) {
    *puVar10 = param_1;
    puVar10[1] = param_2;
    puVar10 = puVar10 + 2;
  }
  else {
    lVar13 = (long)puVar10 - *(long *)(lVar11 + 0x18);
    uVar1 = (lVar13 >> 4) + 1;
    if (uVar1 >> 0x3c != 0) {
      auVar15 = FUN_00bcd72c();
      lVar11 = auVar15._8_8_;
      plVar12 = (long *)*auVar15._0_8_;
      plVar4 = (long *)plVar12[1];
      if (plVar4 < (long *)plVar12[2]) {
        plVar14 = plVar4 + 1;
        *plVar4 = lVar11;
      }
      else {
        lVar13 = (long)plVar4 - *plVar12;
        uVar1 = (lVar13 >> 3) + 1;
        if (uVar1 >> 0x3d != 0) {
          FUN_00bcd744();
                    /* WARNING: Subroutine does not return */
          FUN_007fe138("vector");
        }
        uVar7 = plVar12[2] - *plVar12;
        uVar8 = (long)uVar7 >> 2;
        if (uVar8 <= uVar1) {
          uVar8 = uVar1;
        }
        if (0x7ffffffffffffff7 < uVar7) {
          uVar8 = 0x1fffffffffffffff;
        }
        pvVar6 = operator_new(uVar8 * 8);
        pvVar3 = (void *)*plVar12;
        lVar5 = plVar12[1];
        plVar4 = (long *)((long)pvVar6 + lVar13);
        pvVar9 = (void *)((long)plVar4 - (lVar5 - (long)pvVar3));
        plVar14 = plVar4 + 1;
        *plVar4 = lVar11;
        memcpy(pvVar9,pvVar3,lVar5 - (long)pvVar3);
        *plVar12 = (long)pvVar9;
        plVar12[1] = (long)plVar14;
        plVar12[2] = (long)((long)pvVar6 + uVar8 * 8);
        if (pvVar3 != (void *)0x0) {
          operator_delete(pvVar3);
        }
      }
      plVar12[1] = (long)plVar14;
      FUN_00c2bce0(1,lVar11 + 8);
      return;
    }
    uVar7 = (long)*(undefined8 **)(lVar11 + 0x28) - *(long *)(lVar11 + 0x18);
    uVar8 = (long)uVar7 >> 3;
    if (uVar8 <= uVar1) {
      uVar8 = uVar1;
    }
    if (0x7fffffffffffffef < uVar7) {
      uVar8 = 0xfffffffffffffff;
    }
    pvVar6 = operator_new(uVar8 * 0x10);
    pvVar3 = *(void **)(lVar11 + 0x18);
    lVar5 = *(long *)(lVar11 + 0x20);
    puVar2 = (undefined8 *)((long)pvVar6 + lVar13);
    *puVar2 = param_1;
    puVar2[1] = param_2;
    puVar10 = puVar2 + 2;
    __n = lVar5 - (long)pvVar3;
    pvVar9 = (void *)((long)puVar2 - __n);
    memcpy(pvVar9,pvVar3,__n);
    *(void **)(lVar11 + 0x18) = pvVar9;
    *(undefined8 **)(lVar11 + 0x20) = puVar10;
    *(void **)(lVar11 + 0x28) = (void *)((long)pvVar6 + uVar8 * 0x10);
    if (pvVar3 != (void *)0x0) {
      operator_delete(pvVar3);
    }
  }
  *(undefined8 **)(lVar11 + 0x20) = puVar10;
  return;
}

