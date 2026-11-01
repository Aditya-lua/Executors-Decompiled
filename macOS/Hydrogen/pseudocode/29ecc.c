
undefined8 FUN_00029ecc(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined8 *unaff_x23;
  undefined8 *puVar11;
  undefined1 uStack0000000000000008;
  undefined1 auStack_48 [8];
  
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  lVar2 = __Unwind_Resume();
  uVar3 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar3 = func_0x00086db4(uVar3,"clonefunction",0xd);
  uVar3 = func_0x00086db4(uVar3," @ ",3);
  uVar3 = func_0x00086db4(uVar3,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
  uVar3 = func_0x00086db4(uVar3,":",1);
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar3,0x31);
  __ZNKSt3__18ios_base6getlocEv(auStack_48,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_48,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev(auStack_48);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  func_0x006e69bc(lVar2,1,7);
  iVar1 = func_0x006e22d0(lVar2,1);
  if (iVar1 == 0) {
    func_0x006e5e18(lVar2,1);
  }
  else {
    uVar6 = func_0x006e3790(lVar2,1);
    lVar7 = func_0x006ef7c8(lVar2,*(undefined1 *)(uVar6 + 4),*(undefined8 *)(uVar6 + 0x10));
    plVar4 = (long *)(uVar6 + 0x28);
    if (plVar4 != (long *)*plVar4) {
      *(long *)(lVar7 + 0x28) = ((lVar7 + 0x28) - (long)plVar4) + *plVar4;
    }
    if (*(char *)(uVar6 + 4) != '\0') {
      uVar8 = 0;
      puVar9 = (undefined8 *)(uVar6 + 0x30);
      puVar10 = (undefined8 *)(lVar7 + 0x30);
      do {
        uVar3 = *puVar9;
        puVar10[1] = puVar9[1];
        *puVar10 = uVar3;
        uVar8 = uVar8 + 1;
        puVar9 = puVar9 + 2;
        puVar10 = puVar10 + 2;
      } while (uVar8 < *(byte *)(uVar6 + 4));
    }
    *(undefined8 *)(lVar7 + 0x18) = *(undefined8 *)(uVar6 + 0x18);
    *(long *)(lVar7 + 0x20) = (long)(uVar6 + 0x20) + (*(long *)(uVar6 + 0x20) - (lVar7 + 0x20));
    plVar4 = *(long **)(lVar2 + 8);
    *plVar4 = lVar7;
    *(undefined4 *)((long)plVar4 + 0xc) = 7;
    *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + 0x10;
    uVar8 = func_0x006e3790(lVar2,0xffffffff);
    if (puRam0000000000a33378 != (undefined8 *)0x0) {
      puVar9 = (undefined8 *)0xa33378;
      puVar10 = puRam0000000000a33378;
      do {
        puVar11 = puVar10 + 1;
        if (uVar6 <= (ulong)puVar10[4]) {
          puVar9 = puVar10;
          puVar11 = puVar10;
        }
        puVar10 = (undefined8 *)*puVar11;
      } while (puVar10 != (undefined8 *)0x0);
      if ((puVar9 != (undefined8 *)0xa33378) && ((ulong)puVar9[4] <= uVar6)) {
        puVar9 = puRam0000000000a33378;
        do {
          while ((ulong)puVar9[4] <= uVar6) {
            puVar10 = puRam0000000000a33378;
            if (uVar6 <= (ulong)puVar9[4]) goto code_r0x0002a114;
            puVar9 = (undefined8 *)puVar9[1];
            if (puVar9 == (undefined8 *)0x0) goto code_r0x0002a100;
          }
          puVar9 = (undefined8 *)*puVar9;
        } while (puVar9 != (undefined8 *)0x0);
code_r0x0002a100:
        func_0x0002a824("map::at:  key not found");
        while (puVar10 = (undefined8 *)*unaff_x23, (undefined8 *)*unaff_x23 != (undefined8 *)0x0) {
code_r0x0002a114:
          while( true ) {
            unaff_x23 = puVar10;
            if (uVar8 < (ulong)unaff_x23[4]) break;
            if (uVar8 <= (ulong)unaff_x23[4]) goto code_r0x0002a1a8;
            puVar10 = (undefined8 *)unaff_x23[1];
            if ((undefined8 *)unaff_x23[1] == (undefined8 *)0x0) {
              puVar10 = unaff_x23;
              puVar11 = unaff_x23 + 1;
              goto code_r0x0002a150;
            }
          }
        }
        puVar10 = unaff_x23;
        puVar11 = unaff_x23;
code_r0x0002a150:
        unaff_x23 = (undefined8 *)__Znwm(0x30);
        unaff_x23[4] = uVar8;
        *(undefined4 *)(unaff_x23 + 5) = 0;
        *unaff_x23 = 0;
        unaff_x23[1] = 0;
        unaff_x23[2] = puVar10;
        *puVar11 = unaff_x23;
        puVar10 = unaff_x23;
        if ((long *)*plRam0000000000a33370 != (long *)0x0) {
          puVar10 = (undefined8 *)*puVar11;
          plRam0000000000a33370 = (long *)*plRam0000000000a33370;
        }
        func_0x0003767c(puRam0000000000a33378,puVar10);
        lRam0000000000a33380 = lRam0000000000a33380 + 1;
code_r0x0002a1a8:
        *(undefined4 *)(unaff_x23 + 5) = *(undefined4 *)(puVar9 + 5);
      }
    }
  }
  return 1;
}

