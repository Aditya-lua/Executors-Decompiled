/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfa8f8
 */

void FUN_00bfa8f8(__shared_weak_count *param_1,__shared_weak_count *param_2,long *param_3,
                 ulong param_4)

{
  bool bVar1;
  __shared_weak_count *__s;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long *unaff_x19;
  __shared_weak_count *p_Var7;
  long *plVar8;
  size_t __n;
  ulong uVar9;
  
  lVar3 = *(long *)(param_2 + 0x10);
  lVar4 = *(long *)(param_2 + 0x18);
  *(undefined ***)param_1 = &PTR_FUN_00cad530;
  *(undefined8 *)(param_1 + 8) = 0xffffffffffffffff;
  p_Var7 = param_1 + 0x10;
  *(undefined8 *)p_Var7 = 0;
  lVar4 = lVar4 - lVar3 >> 3;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x118) = 0;
  uVar6 = lVar4 + 1;
  lVar3 = 0x1e;
  if (0x1e < uVar6) {
    lVar3 = lVar4 + 1;
  }
  if (uVar6 >> 0x3d != 0) {
                    /* try { // try from 00bfab1c to 00bfab1f has its CatchHandler @ 00bfab98 */
    uVar2 = FUN_00c0b52c();
                    /* catch() { ... } // from try @ 00bfaa70 with catch @ 00bfab20 */
    if (unaff_x19 != (long *)0x0) {
      lVar3 = FUN_00c2bd10(0xffffffffffffffff,unaff_x19 + 1);
      if (lVar3 == 0) {
        (**(code **)(*unaff_x19 + 0x10))();
      }
      lVar3 = FUN_00c2bd10(0xffffffffffffffff,unaff_x19 + 1);
      if (lVar3 == 0) {
        (**(code **)(*unaff_x19 + 0x10))();
      }
    }
    if (((byte)param_1[0x120] & 1) != 0) {
      operator_delete(*(void **)(param_1 + 0x130),*(ulong *)(param_1 + 0x120) & 0xfffffffffffffffe);
    }
    FUN_00bf5288(p_Var7);
    std::__ndk1::__shared_weak_count::~__shared_weak_count(param_1);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar2);
  }
  if (uVar6 < 0x1f) {
    __s = param_1 + 0x28;
    __n = 0xf0;
    param_1[0x118] = (__shared_weak_count)0x1;
  }
  else {
    __n = uVar6 * 8;
                    /* try { // try from 00bfa980 to 00bfa987 has its CatchHandler @ 00bfab98 */
    __s = operator_new(__n);
  }
  *(__shared_weak_count **)(param_1 + 0x10) = __s;
  *(__shared_weak_count **)(param_1 + 0x20) = __s + lVar3 * 8;
  memset(__s,0,__n);
  *(__shared_weak_count **)(param_1 + 0x18) = __s + __n;
  *(undefined2 *)(param_1 + 0x120) = 0x2a02;
  param_1[0x122] = (__shared_weak_count)0x0;
  FUN_00c2bce0(1,param_3 + 1);
  if (param_1 != param_2) {
                    /* try { // try from 00bfa9f0 to 00bfa9f7 has its CatchHandler @ 00bfab4c */
    FUN_00c0b578(p_Var7,*(long *)(param_2 + 0x10),*(long *)(param_2 + 0x18),
                 *(long *)(param_2 + 0x18) - *(long *)(param_2 + 0x10) >> 3);
  }
  lVar3 = *(long *)(param_2 + 0x10);
  lVar4 = *(long *)(param_2 + 0x18);
  if (lVar4 != lVar3) {
    uVar6 = 0;
    uVar9 = 1;
    do {
      lVar5 = *(long *)(*(long *)p_Var7 + uVar6 * 8);
      if (lVar5 != 0) {
        FUN_00c2bce0(1,lVar5 + 8);
        lVar3 = *(long *)(param_2 + 0x10);
        lVar4 = *(long *)(param_2 + 0x18);
      }
      bVar1 = uVar9 < (ulong)(lVar4 - lVar3 >> 3);
      uVar6 = uVar9;
      uVar9 = (ulong)((int)uVar9 + 1);
    } while (bVar1);
  }
  FUN_00c2bce0(1,param_3 + 1);
  lVar3 = *(long *)(param_1 + 0x10);
  uVar6 = *(long *)(param_1 + 0x18) - lVar3 >> 3;
  if (uVar6 <= param_4) {
    uVar9 = param_4 + 1;
    if (uVar9 < uVar6 || uVar9 - uVar6 == 0) {
      if (uVar9 < uVar6) {
        *(ulong *)(param_1 + 0x18) = lVar3 + uVar9 * 8;
      }
    }
    else {
                    /* try { // try from 00bfaa70 to 00bfaa77 has its CatchHandler @ 00bfab20 */
      FUN_00c0b6e4(p_Var7,uVar9 - uVar6);
      lVar3 = *(long *)p_Var7;
    }
  }
  plVar8 = *(long **)(lVar3 + param_4 * 8);
  if ((plVar8 != (long *)0x0) && (lVar3 = FUN_00c2bd10(0xffffffffffffffff,plVar8 + 1), lVar3 == 0))
  {
    (**(code **)(*plVar8 + 0x10))(plVar8);
  }
  *(long **)(*(long *)p_Var7 + param_4 * 8) = param_3;
  if ((param_3 == (long *)0x0) || (lVar3 = FUN_00c2bd10(0xffffffffffffffff,param_3 + 1), lVar3 != 0)
     ) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00bfab18. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_3 + 0x10))(param_3);
  return;
}

