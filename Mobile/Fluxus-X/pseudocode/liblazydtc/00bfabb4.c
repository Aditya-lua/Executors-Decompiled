/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfabb4
 */

void FUN_00bfabb4(__shared_weak_count *param_1)

{
  bool bVar1;
  long lVar2;
  __shared_weak_count *p_Var3;
  ulong uVar4;
  long *plVar5;
  ulong uVar6;
  
  p_Var3 = *(__shared_weak_count **)(param_1 + 0x10);
  *(undefined ***)param_1 = &PTR_FUN_00cad530;
  if (*(__shared_weak_count **)(param_1 + 0x18) != p_Var3) {
    uVar4 = 0;
    uVar6 = 1;
    do {
      plVar5 = *(long **)(p_Var3 + uVar4 * 8);
      if ((plVar5 != (long *)0x0) &&
         (lVar2 = FUN_00c2bd10(0xffffffffffffffff,plVar5 + 1), lVar2 == 0)) {
        (**(code **)(*plVar5 + 0x10))(plVar5);
      }
      p_Var3 = *(__shared_weak_count **)(param_1 + 0x10);
      bVar1 = uVar6 < (ulong)(*(long *)(param_1 + 0x18) - (long)p_Var3 >> 3);
      uVar4 = uVar6;
      uVar6 = (ulong)((int)uVar6 + 1);
    } while (bVar1);
  }
  if (((byte)param_1[0x120] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x130),*(ulong *)(param_1 + 0x120) & 0xfffffffffffffffe);
    p_Var3 = *(__shared_weak_count **)(param_1 + 0x10);
  }
  if (p_Var3 != (__shared_weak_count *)0x0) {
    *(__shared_weak_count **)(param_1 + 0x18) = p_Var3;
    if (p_Var3 == param_1 + 0x28) {
      param_1[0x118] = (__shared_weak_count)0x0;
    }
    else {
      operator_delete(p_Var3,*(long *)(param_1 + 0x20) - (long)p_Var3);
    }
  }
  std::__ndk1::__shared_weak_count::~__shared_weak_count(param_1);
  return;
}

