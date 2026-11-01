
undefined8 FUN_000298f0(long param_1,long param_2)

{
  bool bVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  ulong uVar7;
  long *plVar8;
  undefined8 *puVar9;
  long *plVar10;
  undefined8 *puVar11;
  byte bVar12;
  ulong unaff_x20;
  long unaff_x22;
  undefined1 auVar13 [16];
  int iStack0000000000000000;
  int iStack0000000000000004;
  int iStack0000000000000008;
  int iStack000000000000000c;
  undefined1 auStack_38 [8];
  
  if (*(char *)(param_2 + 4) == '\0') {
    bVar12 = 0;
  }
  else {
    uVar7 = 0;
    puVar9 = (undefined8 *)(param_2 + 0x30);
    puVar11 = (undefined8 *)(unaff_x20 + 0x30);
    do {
      uVar3 = *puVar9;
      puVar11[1] = puVar9[1];
      *puVar11 = uVar3;
      uVar7 = uVar7 + 1;
      bVar12 = *(byte *)(param_2 + 4);
      puVar9 = puVar9 + 2;
      puVar11 = puVar11 + 2;
    } while (uVar7 < bVar12);
  }
  *(byte *)(unaff_x20 + 4) = bVar12;
  *(undefined8 *)(unaff_x20 + 0x18) = *(undefined8 *)(param_2 + 0x18);
  *(long *)(unaff_x20 + 0x20) = param_2 + 0x20 + (*(long *)(param_2 + 0x20) - param_1);
  if (0 < iStack0000000000000000) {
    func_0x006e5bd0();
  }
  if (0 < iStack0000000000000004) {
    func_0x006e5bd0();
  }
  if (iStack0000000000000008 != 1 || iStack000000000000000c != 0) {
LAB_00029c34:
    plVar5 = *(long **)(unaff_x22 + 0x360);
    if (plVar5 != (long *)0x0) {
      plVar8 = (long *)0xa33360;
      plVar10 = plVar5;
      do {
        plVar6 = plVar10 + 1;
        if (unaff_x20 <= (ulong)plVar10[4]) {
          plVar8 = plVar10;
          plVar6 = plVar10;
        }
        plVar10 = (long *)*plVar6;
      } while (plVar10 != (long *)0x0);
      if ((plVar8 != (long *)0xa33360) && ((ulong)plVar8[4] <= unaff_x20)) {
        plVar8 = (long *)0xa33360;
        plVar10 = plVar5;
        do {
          plVar6 = plVar10 + 1;
          if (unaff_x20 <= (ulong)plVar10[4]) {
            plVar8 = plVar10;
            plVar6 = plVar10;
          }
          plVar10 = (long *)*plVar6;
        } while (plVar10 != (long *)0x0);
        if ((plVar8 != (long *)0xa33360) && ((ulong)plVar8[4] <= unaff_x20)) {
          plVar10 = (long *)plVar8[1];
          if ((long *)plVar8[1] == (long *)0x0) {
            plVar10 = plVar8;
            do {
              plVar6 = (long *)plVar10[2];
              bVar1 = (long *)*plVar6 != plVar10;
              plVar10 = plVar6;
            } while (bVar1);
          }
          else {
            do {
              plVar6 = plVar10;
              plVar10 = (long *)*plVar6;
            } while ((long *)*plVar6 != (long *)0x0);
          }
          if (plRam0000000000a33358 == plVar8) {
            plRam0000000000a33358 = plVar6;
          }
          lRam0000000000a33368 = lRam0000000000a33368 + -1;
          func_0x00037ca0(plVar5,plVar8);
          __ZdlPv(plVar8);
        }
      }
    }
    return 0;
  }
  if (plRam0000000000a33378 != (long *)0x0) {
    plVar5 = (long *)0xa33378;
    plVar8 = plRam0000000000a33378;
    do {
      plVar10 = plVar8 + 1;
      if (unaff_x20 <= (ulong)plVar8[4]) {
        plVar5 = plVar8;
        plVar10 = plVar8;
      }
      plVar8 = (long *)*plVar10;
    } while (plVar8 != (long *)0x0);
    if ((plVar5 != (long *)0xa33378) && ((ulong)plVar5[4] <= unaff_x20)) {
      plVar5 = (long *)0xa33378;
      plVar8 = plRam0000000000a33378;
      do {
        plVar10 = plVar8 + 1;
        if (unaff_x20 <= (ulong)plVar8[4]) {
          plVar5 = plVar8;
          plVar10 = plVar8;
        }
        plVar8 = (long *)*plVar10;
      } while (plVar8 != (long *)0x0);
      if ((plVar5 != (long *)0xa33378) && ((ulong)plVar5[4] <= unaff_x20)) {
        plVar8 = (long *)plVar5[1];
        if ((long *)plVar5[1] == (long *)0x0) {
          plVar8 = plVar5;
          do {
            plVar10 = (long *)plVar8[2];
            bVar1 = (long *)*plVar10 != plVar8;
            plVar8 = plVar10;
          } while (bVar1);
        }
        else {
          do {
            plVar10 = plVar8;
            plVar8 = (long *)*plVar10;
          } while ((long *)*plVar10 != (long *)0x0);
        }
        if (plRam0000000000a33370 == plVar5) {
          plRam0000000000a33370 = plVar10;
        }
        lRam0000000000a33380 = lRam0000000000a33380 + -1;
        func_0x00037ca0(plRam0000000000a33378,plVar5);
        __ZdlPv(plVar5);
      }
    }
  }
  auVar13 = func_0x0002a764();
  lVar2 = auVar13._0_8_;
  if ((auVar13._8_8_ & 0xff) != 0) {
    *(undefined **)(unaff_x20 + 0x18) = &DAT_00038064;
    *(ulong *)(unaff_x20 + 0x20) = (long)&DAT_0003806c - (unaff_x20 + 0x20);
    *(undefined8 *)(unaff_x20 + 0x10) = *(undefined8 *)(lVar2 + 0x10);
    *(undefined2 *)(unaff_x20 + 5) = *(undefined2 *)(lVar2 + 5);
    if (*(char *)(lVar2 + 4) == '\0') {
      bVar12 = 0;
    }
    else {
      uVar7 = 0;
      puVar9 = (undefined8 *)(lVar2 + 0x30);
      puVar11 = (undefined8 *)(unaff_x20 + 0x30);
      do {
        uVar3 = *puVar9;
        puVar11[1] = puVar9[1];
        *puVar11 = uVar3;
        uVar7 = uVar7 + 1;
        bVar12 = *(byte *)(lVar2 + 4);
        puVar9 = puVar9 + 2;
        puVar11 = puVar11 + 2;
      } while (uVar7 < bVar12);
    }
    *(byte *)(unaff_x20 + 4) = bVar12;
    *(undefined8 *)(unaff_x20 + 0x18) = *(undefined8 *)(lVar2 + 0x18);
    *(ulong *)(unaff_x20 + 0x20) = lVar2 + 0x20 + (*(long *)(lVar2 + 0x20) - (unaff_x20 + 0x20));
    if (0 < iStack0000000000000000) {
      func_0x006e5bd0();
    }
    if (0 < iStack0000000000000004) {
      func_0x006e5bd0();
    }
    goto LAB_00029c34;
  }
  uVar3 = func_0x00023168();
  __ZNSt3__16localeD1Ev();
  uVar3 = __Unwind_Resume(uVar3);
  uVar4 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar4 = func_0x00086db4(uVar4,"isfunctionhooked",0x10);
  uVar4 = func_0x00086db4(uVar4," @ ",3);
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x1e6);
  __ZNKSt3__18ios_base6getlocEv(auStack_38,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_38,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(auStack_38);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  func_0x006e69bc(uVar3,1,7);
  uVar7 = func_0x006e3790(uVar3,1);
  if (plRam0000000000a33360 != (long *)0x0) {
    plVar5 = (long *)0xa33360;
    plVar8 = plRam0000000000a33360;
    do {
      plVar10 = plVar8 + 1;
      if (uVar7 <= (ulong)plVar8[4]) {
        plVar5 = plVar8;
        plVar10 = plVar8;
      }
      plVar8 = (long *)*plVar10;
    } while (plVar8 != (long *)0x0);
    if ((plVar5 != (long *)0xa33360) && ((ulong)plVar5[4] <= uVar7)) {
      uVar4 = 1;
      goto code_r0x00029ea0;
    }
  }
  uVar4 = 0;
code_r0x00029ea0:
  func_0x006e3c24(uVar3,uVar4);
  return 1;
}

