/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008edcd0
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x008ede50 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* cpr::Resolve::Resolve(cpr::Resolve const&) */

void __thiscall cpr::Resolve::Resolve(Resolve *this,Resolve *param_1)

{
  undefined2 uVar1;
  long lVar2;
  Resolve *pRVar3;
  __tree_node_base *p_Var4;
  Resolve *pRVar5;
  Resolve *pRVar6;
  long lVar7;
  Resolve *pRVar8;
  ulong uVar9;
  Resolve *pRVar10;
  void *pvVar11;
  ulong uVar12;
  Resolve *pRVar13;
  undefined8 uVar14;
  undefined1 auStack_78 [8];
  undefined8 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  pRVar3 = this;
  if (((byte)*param_1 & 1) == 0) {
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    uVar14 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)this = uVar14;
  }
  else {
    uVar9 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar9) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar11 = *(void **)(param_1 + 0x10);
    if (uVar9 < 0x17) {
      pRVar8 = this + 1;
      *this = SUB41((int)uVar9 << 1,0);
      if (uVar9 != 0) goto LAB_008edd74;
    }
    else {
      uVar12 = uVar9 + 0x10 & 0xfffffffffffffff0;
      pRVar8 = operator_new(uVar12);
      *(ulong *)(this + 8) = uVar9;
      *(Resolve **)(this + 0x10) = pRVar8;
      *(ulong *)this = uVar12 | 1;
      pRVar3 = pRVar8;
LAB_008edd74:
      memcpy(pRVar8,pvVar11,uVar9);
    }
    pRVar8[uVar9] = (Resolve)0x0;
  }
  pRVar8 = this + 0x18;
  *(undefined8 *)pRVar8 = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  if (((byte)param_1[0x18] & 1) == 0) {
    *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_1 + 0x28);
    uVar14 = *(undefined8 *)(param_1 + 0x18);
    *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
    *(undefined8 *)pRVar8 = uVar14;
    goto LAB_008ede14;
  }
  uVar9 = *(ulong *)(param_1 + 0x20);
  if (0xffffffffffffffef < uVar9) {
                    /* try { // try from 008edf50 to 008edf57 has its CatchHandler @ 008edf58 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar11 = *(void **)(param_1 + 0x28);
  if (uVar9 < 0x17) {
    pRVar10 = this + 0x19;
    *pRVar8 = SUB41((int)uVar9 << 1,0);
    if (uVar9 != 0) goto LAB_008ede00;
  }
  else {
    uVar12 = uVar9 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008edde8 to 008eddef has its CatchHandler @ 008edf58 */
    pRVar10 = operator_new(uVar12);
    *(ulong *)(this + 0x20) = uVar9;
    *(Resolve **)(this + 0x28) = pRVar10;
    *(ulong *)(this + 0x18) = uVar12 | 1;
    pRVar3 = pRVar10;
LAB_008ede00:
    memcpy(pRVar10,pvVar11,uVar9);
  }
  pRVar10[uVar9] = (Resolve)0x0;
LAB_008ede14:
  pRVar10 = this + 0x38;
  *(undefined8 *)pRVar10 = 0;
  *(undefined8 *)(this + 0x40) = 0;
  *(Resolve **)(this + 0x30) = pRVar10;
  pRVar8 = param_1 + 0x38;
  if (*(Resolve **)(param_1 + 0x30) != pRVar8) {
    pRVar13 = *(Resolve **)(param_1 + 0x30);
    do {
      while( true ) {
                    /* try { // try from 008ede3c to 008ede77 has its CatchHandler @ 008edf68 */
        pRVar3 = (Resolve *)
                 std::__ndk1::
                 __tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                 ::__find_equal<unsigned_short>
                           ((__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                             *)pRVar3,pRVar10,&local_70,auStack_78,pRVar13 + 0x1a);
        if (*(long *)pRVar3 != 0) break;
        p_Var4 = operator_new(0x20);
        uVar1 = *(undefined2 *)(pRVar13 + 0x1a);
        *(undefined8 *)p_Var4 = 0;
        *(undefined8 *)(p_Var4 + 8) = 0;
        *(undefined2 *)(p_Var4 + 0x1a) = uVar1;
        *(undefined8 *)(p_Var4 + 0x10) = local_70;
        *(__tree_node_base **)pRVar3 = p_Var4;
        lVar7 = **(long **)(this + 0x30);
        if (lVar7 != 0) {
          *(long *)(this + 0x30) = lVar7;
          p_Var4 = *(__tree_node_base **)pRVar3;
        }
        pRVar3 = *(Resolve **)(this + 0x38);
        std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                  ((__tree_node_base *)pRVar3,p_Var4);
        *(long *)(this + 0x40) = *(long *)(this + 0x40) + 1;
        pRVar5 = *(Resolve **)(pRVar13 + 8);
        if (*(Resolve **)(pRVar13 + 8) == (Resolve *)0x0) goto LAB_008eded0;
LAB_008edec0:
        do {
          pRVar13 = pRVar5;
          pRVar5 = *(Resolve **)pRVar13;
        } while (*(Resolve **)pRVar13 != (Resolve *)0x0);
LAB_008edefc:
        if (pRVar13 == pRVar8) goto LAB_008edf14;
      }
      pRVar5 = *(Resolve **)(pRVar13 + 8);
      if (*(Resolve **)(pRVar13 + 8) != (Resolve *)0x0) goto LAB_008edec0;
LAB_008eded0:
      pRVar5 = pRVar13 + 0x10;
      pRVar6 = *(Resolve **)pRVar5;
      if (*(Resolve **)pRVar6 != pRVar13) {
        do {
          lVar7 = *(long *)pRVar5;
          pRVar5 = (Resolve *)(lVar7 + 0x10);
          pRVar13 = *(Resolve **)pRVar5;
        } while (*(long *)pRVar13 != lVar7);
        goto LAB_008edefc;
      }
      pRVar13 = pRVar6;
    } while (pRVar6 != pRVar8);
  }
LAB_008edf14:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

