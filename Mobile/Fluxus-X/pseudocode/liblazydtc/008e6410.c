/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e6410
 */

/* void 
   std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>(std::__ndk1::__tree_node_base<void*>*,
   std::__ndk1::__tree_node_base<void*>*) */

void std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
               (__tree_node_base *param_1,__tree_node_base *param_2)

{
  __tree_node_base _Var1;
  __tree_node_base *p_Var2;
  long *plVar3;
  long lVar4;
  __tree_node_base *p_Var5;
  long lVar6;
  long *plVar7;
  
  _Var1 = (__tree_node_base)(param_2 == param_1);
  param_2[0x18] = _Var1;
  while( true ) {
    if ((bool)_Var1) {
      return;
    }
    plVar3 = *(long **)(param_2 + 0x10);
    p_Var5 = (__tree_node_base *)(plVar3 + 3);
    if (*p_Var5 != (__tree_node_base)0x0) break;
    p_Var2 = (__tree_node_base *)plVar3[2];
    plVar7 = *(long **)p_Var2;
    if (plVar7 == plVar3) {
      if ((*(long *)(p_Var2 + 8) == 0) ||
         (plVar7 = (long *)(*(long *)(p_Var2 + 8) + 0x18), *(char *)plVar7 != '\0')) {
        if ((__tree_node_base *)*plVar3 != param_2) {
          plVar7 = (long *)plVar3[1];
          lVar4 = *plVar7;
          plVar3[1] = lVar4;
          if (lVar4 != 0) {
            *(long **)(lVar4 + 0x10) = plVar3;
            p_Var2 = (__tree_node_base *)plVar3[2];
          }
          plVar7[2] = (long)p_Var2;
          lVar4 = 0;
          if (*(long **)plVar3[2] != plVar3) {
            lVar4 = 8;
          }
          *(long **)((long)plVar3[2] + lVar4) = plVar7;
          *plVar7 = (long)plVar3;
          plVar3[2] = (long)plVar7;
          p_Var2 = (__tree_node_base *)plVar7[2];
          p_Var5 = (__tree_node_base *)(plVar7 + 3);
        }
        *p_Var5 = (__tree_node_base)0x1;
        lVar4 = *(long *)p_Var2;
        p_Var2[0x18] = (__tree_node_base)0x0;
        lVar6 = *(long *)(lVar4 + 8);
        *(long *)p_Var2 = lVar6;
        if (lVar6 != 0) {
          *(__tree_node_base **)(lVar6 + 0x10) = p_Var2;
        }
        *(undefined8 *)(lVar4 + 0x10) = *(undefined8 *)(p_Var2 + 0x10);
        lVar6 = 0;
        if ((__tree_node_base *)**(undefined8 **)(p_Var2 + 0x10) != p_Var2) {
          lVar6 = 8;
        }
        *(long *)((long)*(undefined8 **)(p_Var2 + 0x10) + lVar6) = lVar4;
        *(__tree_node_base **)(lVar4 + 8) = p_Var2;
        *(long *)(p_Var2 + 0x10) = lVar4;
        return;
      }
    }
    else if ((plVar7 == (long *)0x0) || (plVar7 = plVar7 + 3, (char)*plVar7 != '\0')) {
      if ((__tree_node_base *)*plVar3 == param_2) {
        lVar4 = *(long *)(param_2 + 8);
        *plVar3 = lVar4;
        if (lVar4 != 0) {
          *(long **)(lVar4 + 0x10) = plVar3;
          p_Var2 = (__tree_node_base *)plVar3[2];
        }
        *(__tree_node_base **)(param_2 + 0x10) = p_Var2;
        lVar4 = 0;
        if (*(long **)plVar3[2] != plVar3) {
          lVar4 = 8;
        }
        *(__tree_node_base **)((long)plVar3[2] + lVar4) = param_2;
        *(long **)(param_2 + 8) = plVar3;
        plVar3[2] = (long)param_2;
        p_Var2 = *(__tree_node_base **)(param_2 + 0x10);
        p_Var5 = param_2 + 0x18;
      }
      *p_Var5 = (__tree_node_base)0x1;
      plVar3 = *(long **)(p_Var2 + 8);
      p_Var2[0x18] = (__tree_node_base)0x0;
      lVar4 = *plVar3;
      *(long *)(p_Var2 + 8) = lVar4;
      if (lVar4 != 0) {
        *(__tree_node_base **)(lVar4 + 0x10) = p_Var2;
      }
      plVar3[2] = *(long *)(p_Var2 + 0x10);
      lVar4 = 0;
      if ((__tree_node_base *)**(undefined8 **)(p_Var2 + 0x10) != p_Var2) {
        lVar4 = 8;
      }
      *(long **)((long)*(undefined8 **)(p_Var2 + 0x10) + lVar4) = plVar3;
      *plVar3 = (long)p_Var2;
      *(long **)(p_Var2 + 0x10) = plVar3;
      return;
    }
    _Var1 = (__tree_node_base)(p_Var2 == param_1);
    *p_Var5 = (__tree_node_base)0x1;
    p_Var2[0x18] = _Var1;
    *(char *)plVar7 = '\x01';
    param_2 = p_Var2;
  }
  return;
}

