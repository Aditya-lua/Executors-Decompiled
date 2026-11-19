/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086f920
 */

void FUN_0086f920(undefined8 *param_1,void *param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  char cVar2;
  void *__dest;
  void *__dest_00;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  size_t sVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  size_t __n;
  undefined1 auVar10 [16];
  long alStack_a0 [4];
  long *plStack_80;
  long lStack_68;
  undefined1 *puStack_60;
  code *pcStack_58;
  long lStack_50;
  undefined8 *puStack_48;
  
  uVar9 = param_1[2];
  __dest = (void *)*param_1;
  if (param_4 <= (ulong)((long)(uVar9 - (long)__dest) >> 3)) {
    __dest_00 = (void *)param_1[1];
    sVar6 = (long)__dest_00 - (long)__dest;
    if (param_4 <= (ulong)((long)sVar6 >> 3)) {
      sVar6 = param_3 - (long)param_2;
      if (sVar6 != 0) {
        memmove(__dest,param_2,sVar6);
      }
      lVar7 = (long)__dest + sVar6;
      goto LAB_0086fa3c;
    }
    if (__dest_00 != __dest) {
      memmove(__dest,param_2,sVar6);
      __dest_00 = (void *)param_1[1];
    }
    __n = param_3 - (long)((long)param_2 + sVar6);
    if (__n != 0) {
      memmove(__dest_00,(void *)((long)param_2 + sVar6),__n);
    }
LAB_0086fa18:
    lVar7 = (long)__dest_00 + __n;
LAB_0086fa3c:
    param_1[1] = lVar7;
    return;
  }
  if (__dest != (void *)0x0) {
    param_1[1] = __dest;
    operator_delete(__dest,uVar9 - (long)__dest);
    uVar9 = 0;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  if (param_4 >> 0x3d == 0) {
    uVar1 = (long)uVar9 >> 2;
    if ((ulong)((long)uVar9 >> 2) <= param_4) {
      uVar1 = param_4;
    }
    if (0x7ffffffffffffff7 < uVar9) {
      uVar1 = 0x1fffffffffffffff;
    }
    if (uVar1 >> 0x3d == 0) {
      __dest_00 = operator_new(uVar1 * 8);
      __n = param_3 - (long)param_2;
      *param_1 = __dest_00;
      param_1[1] = __dest_00;
      param_1[2] = (void *)((long)__dest_00 + uVar1 * 8);
      if (__n != 0) {
        memcpy(__dest_00,param_2,__n);
      }
      goto LAB_0086fa18;
    }
  }
  auVar10 = FUN_0086f78c();
  plVar5 = auVar10._8_8_;
  plVar3 = auVar10._0_8_;
  pcStack_58 = FUN_0086fa58;
  lVar7 = tpidr_el0;
  lStack_68 = *(long *)(lVar7 + 0x28);
  cVar2 = (char)plVar3[6];
  lStack_50 = param_3;
  puStack_48 = param_1;
  if (cVar2 == (char)plVar5[6]) {
    puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
    if (cVar2 != '\0') {
      plVar4 = (long *)plVar5[4];
      if (plVar4 == (long *)0x0) {
        plStack_80 = (long *)0x0;
        puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
      }
      else if (plVar4 == plVar5) {
        plStack_80 = alStack_a0;
        puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
        (**(code **)(*plVar4 + 0x18))(plVar4,alStack_a0);
      }
      else {
        puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
        plStack_80 = (long *)(**(code **)(*plVar4 + 0x10))();
      }
      FUN_0086fbb0(alStack_a0,plVar3);
      if (plStack_80 == alStack_a0) {
        lVar8 = 0x20;
      }
      else {
        if (plStack_80 == (long *)0x0) goto LAB_0086fb8c;
        lVar8 = 0x28;
      }
      (**(code **)(*plStack_80 + lVar8))();
    }
    goto LAB_0086fb8c;
  }
  if (cVar2 == '\0') {
    plVar4 = (long *)plVar5[4];
    if (plVar4 == (long *)0x0) {
      plVar3[4] = 0;
      puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
    }
    else if (plVar4 == plVar5) {
      plVar3[4] = (long)plVar3;
      puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
      (**(code **)(*(long *)plVar5[4] + 0x18))((long *)plVar5[4],plVar3);
    }
    else {
      puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
      lVar8 = (**(code **)(*plVar4 + 0x10))();
      plVar3[4] = lVar8;
    }
    *(undefined1 *)(plVar3 + 6) = 1;
    goto LAB_0086fb8c;
  }
  plVar5 = (long *)plVar3[4];
  if (plVar5 == plVar3) {
    lVar8 = 0x20;
LAB_0086fafc:
    puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
    (**(code **)(*plVar5 + lVar8))();
  }
  else {
    puStack_60 = (undefined1 *)(alStack_a0 + 0xc);
    if (plVar5 != (long *)0x0) {
      lVar8 = 0x28;
      goto LAB_0086fafc;
    }
  }
  *(undefined1 *)(plVar3 + 6) = 0;
LAB_0086fb8c:
  if (*(long *)(lVar7 + 0x28) != lStack_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

