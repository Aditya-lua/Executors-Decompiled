
undefined * FUN_0041db5c(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  code *pcVar2;
  long *plVar3;
  uint *puVar4;
  ulong uVar5;
  undefined *puVar6;
  undefined8 extraout_x1;
  long lVar7;
  long lVar8;
  undefined *puVar9;
  undefined1 auVar10 [16];
  undefined1 auStack_90 [16];
  undefined1 ***pppuStack_80;
  undefined *puStack_78;
  undefined1 **ppuStack_60;
  undefined8 uStack_58;
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  plVar3 = (long *)func_0x007a2334();
  if (*(long *)(*plVar3 + 0x18) == 0) {
    return (undefined *)0x0;
  }
  auVar10 = func_0x007a2334(&UNK_009da648);
  lVar7 = auVar10._8_8_;
  uStack_18 = 0x41db88;
  ppuStack_60 = &puStack_20;
  lVar8 = *auVar10._0_8_;
  if (*(long *)(lVar8 + 0x18) != 0) {
    puStack_20 = auStack_90 + 0x80;
    func_0x007a2334(&UNK_009da660);
    *(long *)(lVar8 + 0x18) = *(long *)(lVar8 + 0x18) + 1;
    plVar3 = (long *)__Unwind_Resume();
    uStack_58 = 0x41dc9c;
    pppuStack_80 = &ppuStack_60;
    lVar7 = *plVar3;
    if (*(long *)(lVar7 + 0x18) != 0) {
      func_0x007a2334(&UNK_009da678);
      *(long *)(lVar7 + 0x18) = *(long *)(lVar7 + 0x18) + 1;
      __Unwind_Resume();
      puStack_78 = &
                   __ZN63__LT_std__io__stdio__StderrLock_u20_as_u20_core__fmt__Debug_GT_3fmt17h4d2a04c495136bb7E
      ;
      func_0x00469240(auStack_90,extraout_x1,&UNK_0088636d,10);
      puVar9 = (undefined *)func_0x00465564(auStack_90);
      return puVar9;
    }
    *(undefined8 *)(lVar7 + 0x18) = 0xffffffffffffffff;
    puVar6 = (undefined *)func_0x0041f388();
    puVar9 = (undefined *)0x0;
    if (((ulong)puVar6 & 0xffffffff00000003) != 0x900000002) {
      puVar9 = puVar6;
    }
    *(long *)(lVar7 + 0x18) = *(long *)(lVar7 + 0x18) + 1;
    return puVar9;
  }
  *(undefined8 *)(lVar8 + 0x18) = 0xffffffffffffffff;
  if (param_3 == 0) {
    lVar7 = 0;
    puVar9 = (undefined *)0x0;
  }
  else {
    puVar9 = &UNK_009da470;
    puStack_20 = auStack_90 + 0x80;
    do {
      while( true ) {
        uVar5 = param_3;
        if (0x7ffffffd < param_3) {
          uVar5 = 0x7ffffffe;
        }
        uVar5 = _write(2,lVar7,uVar5);
        if (uVar5 == 0xffffffffffffffff) break;
        if (uVar5 == 0) goto LAB_0041dc38;
        uVar1 = param_3 - uVar5;
        if (param_3 < uVar5) {
          func_0x007a28a4(uVar5,param_3,&UNK_009da7a0);
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x41dc80);
          (*pcVar2)();
        }
        lVar7 = lVar7 + uVar5;
        param_3 = uVar1;
        if (uVar1 == 0) goto LAB_0041dc1c;
      }
      puVar4 = (uint *)___error();
      if (*puVar4 != 4) {
        puVar9 = (undefined *)((ulong)*puVar4 << 0x20 | 2);
        goto LAB_0041dc38;
      }
    } while (param_3 != 0);
LAB_0041dc1c:
    puVar9 = (undefined *)0x0;
LAB_0041dc38:
    lVar7 = *(long *)(lVar8 + 0x18) + 1;
  }
  puVar6 = (undefined *)0x0;
  if (((ulong)puVar9 & 0xffffffff00000003) != 0x900000002) {
    puVar6 = puVar9;
  }
  *(long *)(lVar8 + 0x18) = lVar7;
  return puVar6;
}

