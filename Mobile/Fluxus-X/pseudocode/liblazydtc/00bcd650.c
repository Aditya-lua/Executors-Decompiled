/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd650
 */

/* std::__ndk1::__thread_struct::__make_ready_at_thread_exit(std::__ndk1::__assoc_sub_state*) */

void __thiscall
std::__ndk1::__thread_struct::__make_ready_at_thread_exit
          (__thread_struct *this,__assoc_sub_state *param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  void *__src;
  long lVar3;
  void *pvVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  void *__dest;
  long *plVar8;
  undefined8 *puVar9;
  
  plVar8 = *(long **)this;
  puVar2 = (undefined8 *)plVar8[1];
  if (puVar2 < (undefined8 *)plVar8[2]) {
    puVar9 = puVar2 + 1;
    *puVar2 = param_1;
  }
  else {
    lVar7 = (long)puVar2 - *plVar8;
    uVar1 = (lVar7 >> 3) + 1;
    if (uVar1 >> 0x3d != 0) {
      FUN_00bcd744();
                    /* WARNING: Subroutine does not return */
      FUN_007fe138("vector");
    }
    uVar5 = plVar8[2] - *plVar8;
    uVar6 = (long)uVar5 >> 2;
    if (uVar6 <= uVar1) {
      uVar6 = uVar1;
    }
    if (0x7ffffffffffffff7 < uVar5) {
      uVar6 = 0x1fffffffffffffff;
    }
    pvVar4 = operator_new(uVar6 * 8);
    __src = (void *)*plVar8;
    lVar3 = plVar8[1];
    puVar2 = (undefined8 *)((long)pvVar4 + lVar7);
    __dest = (void *)((long)puVar2 - (lVar3 - (long)__src));
    puVar9 = puVar2 + 1;
    *puVar2 = param_1;
    memcpy(__dest,__src,lVar3 - (long)__src);
    *plVar8 = (long)__dest;
    plVar8[1] = (long)puVar9;
    plVar8[2] = (long)((long)pvVar4 + uVar6 * 8);
    if (__src != (void *)0x0) {
      operator_delete(__src);
    }
  }
  plVar8[1] = (long)puVar9;
  FUN_00c2bce0(1,param_1 + 8);
  return;
}

