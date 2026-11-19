/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00994dc4
 */

/* void 
   std::__ndk1::__tree_remove<std::__ndk1::__tree_node_base<void*>*>(std::__ndk1::__tree_node_base<void*>*,
   std::__ndk1::__tree_node_base<void*>*) */

void std::__ndk1::__tree_remove<std::__ndk1::__tree_node_base<void*>*>
               (__tree_node_base *param_1,__tree_node_base *param_2)

{
  __tree_node_base _Var1;
  __tree_node_base *p_Var2;
  __tree_node_base *p_Var3;
  __tree_node_base *p_Var4;
  __tree_node_base *p_Var5;
  long *plVar6;
  bool bVar7;
  __tree_node_base *p_Var8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  
  p_Var4 = *(__tree_node_base **)param_2;
  p_Var8 = param_2;
  if (p_Var4 == (__tree_node_base *)0x0) {
    p_Var4 = *(__tree_node_base **)(param_2 + 8);
joined_r0x00994df4:
    if (p_Var4 == (__tree_node_base *)0x0) {
      bVar7 = false;
      p_Var5 = p_Var8 + 0x10;
      goto LAB_00994e18;
    }
  }
  else {
    p_Var5 = *(__tree_node_base **)(param_2 + 8);
    if (*(__tree_node_base **)(param_2 + 8) != (__tree_node_base *)0x0) {
      do {
        p_Var8 = p_Var5;
        p_Var5 = *(__tree_node_base **)p_Var8;
      } while (*(__tree_node_base **)p_Var8 != (__tree_node_base *)0x0);
      p_Var4 = *(__tree_node_base **)(p_Var8 + 8);
      goto joined_r0x00994df4;
    }
  }
  p_Var5 = p_Var8 + 0x10;
  bVar7 = true;
  *(undefined8 *)(p_Var4 + 0x10) = *(undefined8 *)p_Var5;
LAB_00994e18:
  puVar10 = *(undefined8 **)(p_Var8 + 0x10);
  p_Var3 = (__tree_node_base *)*puVar10;
  if (p_Var3 == p_Var8) {
    *puVar10 = p_Var4;
    if (p_Var8 == param_1) {
      p_Var3 = (__tree_node_base *)0x0;
      param_1 = p_Var4;
    }
    else {
      p_Var3 = (__tree_node_base *)puVar10[1];
    }
  }
  else {
    puVar10[1] = p_Var4;
  }
  _Var1 = p_Var8[0x18];
  p_Var2 = param_1;
  if (p_Var8 != param_2) {
    lVar11 = *(long *)(param_2 + 0x10);
    *(long *)p_Var5 = lVar11;
    lVar9 = 0;
    if ((__tree_node_base *)**(undefined8 **)(param_2 + 0x10) != param_2) {
      lVar9 = 8;
    }
    *(__tree_node_base **)(lVar11 + lVar9) = p_Var8;
    lVar9 = *(long *)param_2;
    *(long *)p_Var8 = lVar9;
    *(__tree_node_base **)(lVar9 + 0x10) = p_Var8;
    lVar9 = *(long *)(param_2 + 8);
    *(long *)(p_Var8 + 8) = lVar9;
    if (lVar9 != 0) {
      *(__tree_node_base **)(lVar9 + 0x10) = p_Var8;
    }
    p_Var2 = p_Var8;
    if (param_1 != param_2) {
      p_Var2 = param_1;
    }
    p_Var8[0x18] = param_2[0x18];
  }
  if ((_Var1 != (__tree_node_base)0x0) && (p_Var2 != (__tree_node_base *)0x0)) {
    if (!bVar7) {
      while( true ) {
        p_Var8 = *(__tree_node_base **)(p_Var3 + 0x10);
        p_Var4 = p_Var2;
        if (*(__tree_node_base **)p_Var8 != p_Var3) break;
        if (p_Var3[0x18] == (__tree_node_base)0x0) {
          p_Var3[0x18] = (__tree_node_base)0x1;
          p_Var8[0x18] = (__tree_node_base)0x0;
          p_Var5 = *(__tree_node_base **)(p_Var3 + 8);
          *(__tree_node_base **)p_Var8 = p_Var5;
          if (p_Var5 != (__tree_node_base *)0x0) {
            *(__tree_node_base **)(p_Var5 + 0x10) = p_Var8;
          }
          *(undefined8 *)(p_Var3 + 0x10) = *(undefined8 *)(p_Var8 + 0x10);
          puVar10 = *(undefined8 **)(p_Var8 + 0x10);
          if ((__tree_node_base *)*puVar10 == p_Var8) {
            *puVar10 = p_Var3;
            p_Var5 = *(__tree_node_base **)p_Var8;
          }
          else {
            puVar10[1] = p_Var3;
          }
          *(__tree_node_base **)(p_Var3 + 8) = p_Var8;
          *(__tree_node_base **)(p_Var8 + 0x10) = p_Var3;
          p_Var4 = p_Var3;
          if (p_Var2 != p_Var8) {
            p_Var4 = p_Var2;
          }
          lVar9 = *(long *)p_Var5;
          if (lVar9 == 0) goto LAB_00994f3c;
LAB_00994f34:
          if (*(char *)(lVar9 + 0x18) != '\0') goto LAB_00994f3c;
          p_Var4 = (__tree_node_base *)(lVar9 + 0x18);
LAB_0099509c:
          p_Var8 = p_Var5 + 0x10;
          p_Var3 = p_Var5 + 0x18;
LAB_00995108:
          plVar6 = *(long **)p_Var8;
          *p_Var3 = *(__tree_node_base *)(plVar6 + 3);
          *(undefined1 *)(plVar6 + 3) = 1;
          *p_Var4 = (__tree_node_base)0x1;
          lVar9 = *plVar6;
          lVar11 = *(long *)(lVar9 + 8);
          *plVar6 = lVar11;
          if (lVar11 != 0) {
            *(long **)(lVar11 + 0x10) = plVar6;
          }
          *(long *)(lVar9 + 0x10) = plVar6[2];
          lVar11 = 0;
          if (*(long **)plVar6[2] != plVar6) {
            lVar11 = 8;
          }
          *(long *)((long)plVar6[2] + lVar11) = lVar9;
          *(long **)(lVar9 + 8) = plVar6;
          plVar6[2] = lVar9;
          return;
        }
        lVar9 = *(long *)p_Var3;
        p_Var5 = p_Var3;
        if (lVar9 != 0) goto LAB_00994f34;
LAB_00994f3c:
        plVar6 = *(long **)(p_Var5 + 8);
        if ((plVar6 != (long *)0x0) && ((char)plVar6[3] == '\0')) {
          if (lVar9 != 0) {
            p_Var4 = (__tree_node_base *)(lVar9 + 0x18);
            if (*p_Var4 == (__tree_node_base)0x0) goto LAB_0099509c;
            plVar6 = *(long **)(p_Var5 + 8);
          }
          p_Var3 = (__tree_node_base *)(plVar6 + 3);
          *p_Var3 = (__tree_node_base)0x1;
          p_Var4 = p_Var5 + 0x18;
          *p_Var4 = (__tree_node_base)0x0;
          lVar9 = *plVar6;
          *(long *)(p_Var5 + 8) = lVar9;
          if (lVar9 != 0) {
            *(__tree_node_base **)(lVar9 + 0x10) = p_Var5;
          }
          p_Var8 = (__tree_node_base *)(plVar6 + 2);
          *(undefined8 *)p_Var8 = *(undefined8 *)(p_Var5 + 0x10);
          lVar9 = 0;
          if ((__tree_node_base *)**(undefined8 **)(p_Var5 + 0x10) != p_Var5) {
            lVar9 = 8;
          }
          *(long **)((long)*(undefined8 **)(p_Var5 + 0x10) + lVar9) = plVar6;
          *plVar6 = (long)p_Var5;
          *(long **)(p_Var5 + 0x10) = plVar6;
          goto LAB_00995108;
        }
        p_Var8 = *(__tree_node_base **)(p_Var5 + 0x10);
        p_Var5[0x18] = (__tree_node_base)0x0;
        if (p_Var8 == p_Var4) goto LAB_00995028;
LAB_00994f5c:
        if (p_Var8[0x18] == (__tree_node_base)0x0) goto LAB_00995028;
        p_Var3 = (__tree_node_base *)
                 (*(undefined8 **)(p_Var8 + 0x10))
                 [(__tree_node_base *)**(undefined8 **)(p_Var8 + 0x10) == p_Var8];
        p_Var2 = p_Var4;
      }
      if (p_Var3[0x18] == (__tree_node_base)0x0) {
        p_Var3[0x18] = (__tree_node_base)0x1;
        plVar6 = *(long **)(p_Var8 + 8);
        p_Var8[0x18] = (__tree_node_base)0x0;
        lVar9 = *plVar6;
        *(long *)(p_Var8 + 8) = lVar9;
        if (lVar9 != 0) {
          *(__tree_node_base **)(lVar9 + 0x10) = p_Var8;
        }
        plVar6[2] = *(long *)(p_Var8 + 0x10);
        lVar9 = 0;
        if ((__tree_node_base *)**(undefined8 **)(p_Var8 + 0x10) != p_Var8) {
          lVar9 = 8;
        }
        *(long **)((long)*(undefined8 **)(p_Var8 + 0x10) + lVar9) = plVar6;
        *plVar6 = (long)p_Var8;
        *(long **)(p_Var8 + 0x10) = plVar6;
        p_Var4 = p_Var3;
        if (p_Var2 != *(__tree_node_base **)p_Var3) {
          p_Var4 = p_Var2;
        }
        p_Var3 = *(__tree_node_base **)(*(__tree_node_base **)p_Var3 + 8);
        lVar9 = *(long *)p_Var3;
        if (lVar9 != 0) goto LAB_00994efc;
LAB_00994f04:
        lVar11 = *(long *)(p_Var3 + 8);
        if ((lVar11 == 0) || (*(char *)(lVar11 + 0x18) != '\0')) {
          p_Var8 = *(__tree_node_base **)(p_Var3 + 0x10);
          p_Var3[0x18] = (__tree_node_base)0x0;
          if (p_Var8 != p_Var4) goto LAB_00994f5c;
          p_Var8 = p_Var4;
LAB_00995028:
          p_Var8[0x18] = (__tree_node_base)0x1;
          return;
        }
LAB_0099503c:
        p_Var4 = (__tree_node_base *)(lVar11 + 0x18);
        if (*p_Var4 == (__tree_node_base)0x0) {
          p_Var8 = p_Var3 + 0x10;
          p_Var5 = p_Var3 + 0x18;
          goto LAB_00995168;
        }
      }
      else {
        lVar9 = *(long *)p_Var3;
        if (lVar9 == 0) goto LAB_00994f04;
LAB_00994efc:
        if (*(char *)(lVar9 + 0x18) != '\0') goto LAB_00994f04;
        lVar11 = *(long *)(p_Var3 + 8);
        if (lVar11 != 0) goto LAB_0099503c;
      }
      p_Var5 = (__tree_node_base *)(lVar9 + 0x18);
      *p_Var5 = (__tree_node_base)0x1;
      p_Var4 = p_Var3 + 0x18;
      *p_Var4 = (__tree_node_base)0x0;
      lVar11 = *(long *)(lVar9 + 8);
      *(long *)p_Var3 = lVar11;
      if (lVar11 != 0) {
        *(__tree_node_base **)(lVar11 + 0x10) = p_Var3;
      }
      p_Var8 = (__tree_node_base *)(lVar9 + 0x10);
      *(undefined8 *)p_Var8 = *(undefined8 *)(p_Var3 + 0x10);
      lVar11 = 0;
      if ((__tree_node_base *)**(undefined8 **)(p_Var3 + 0x10) != p_Var3) {
        lVar11 = 8;
      }
      *(long *)((long)*(undefined8 **)(p_Var3 + 0x10) + lVar11) = lVar9;
      *(__tree_node_base **)(lVar9 + 8) = p_Var3;
      *(long *)(p_Var3 + 0x10) = lVar9;
LAB_00995168:
      lVar9 = *(long *)p_Var8;
      *p_Var5 = *(__tree_node_base *)(lVar9 + 0x18);
      *(undefined1 *)(lVar9 + 0x18) = 1;
      *p_Var4 = (__tree_node_base)0x1;
      plVar6 = *(long **)(lVar9 + 8);
      lVar11 = *plVar6;
      *(long *)(lVar9 + 8) = lVar11;
      if (lVar11 != 0) {
        *(long *)(lVar11 + 0x10) = lVar9;
      }
      plVar6[2] = *(long *)(lVar9 + 0x10);
      lVar11 = 0;
      if (**(long **)(lVar9 + 0x10) != lVar9) {
        lVar11 = 8;
      }
      *(long **)((long)*(long **)(lVar9 + 0x10) + lVar11) = plVar6;
      *plVar6 = lVar9;
      *(long **)(lVar9 + 0x10) = plVar6;
      return;
    }
    p_Var4[0x18] = (__tree_node_base)0x1;
  }
  return;
}

