
void FUN_00051568(long param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
                 undefined8 *param_5)

{
  undefined8 *puVar1;
  bool bVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  long *plVar8;
  long *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long *plVar9;
  long unaff_x23;
  byte *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *puVar10;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000028;
  
  do {
    iVar3 = func_0x0078c028(param_1,param_2,param_3,param_4,param_5);
    if (iVar3 == 0) {
      __ZNSt3__15mutex6unlockEv(unaff_x23);
      if (uStack0000000000000028 == (undefined *)0x0) goto code_r0x00051578;
      if (uStack0000000000000008 == 0) goto code_r0x00051578;
      if ((*(byte *)(uStack0000000000000008 + 4) & 3) == 0) goto code_r0x00051578;
      if (*(long *)(unaff_x22 + 0x28) == 0) goto code_r0x00051578;
      uVar5 = func_0x006e1e34(*(undefined8 *)(unaff_x22 + 8));
      (*pcRam0000000000a27968)(*(undefined8 *)(unaff_x22 + 8),*(undefined8 *)(unaff_x22 + 0x28));
      func_0x006e3d18(*(undefined8 *)(unaff_x22 + 8),0xffffffff,"Event");
      func_0x006e3d18(*(undefined8 *)(unaff_x22 + 8),0xfffffffe,"Fire");
      func_0x006e2154(*(undefined8 *)(unaff_x22 + 8),0xfffffffd);
      func_0x006e38d8(*(undefined8 *)(unaff_x22 + 8),*(undefined8 *)(unaff_x22 + 0x40),
                      uStack0000000000000028);
      func_0x006e4c80(*(undefined8 *)(unaff_x22 + 8),2,0);
      func_0x006e1d54(*(undefined8 *)(unaff_x22 + 8),uVar5);
      goto code_r0x00051578;
    }
    do {
      __ZNSt3__15mutex6unlockEv(unaff_x23);
code_r0x00051578:
      while( true ) {
        puVar1 = (undefined8 *)unaff_x25[1];
        puVar10 = unaff_x25;
        if ((undefined8 *)unaff_x25[1] == (undefined8 *)0x0) {
          do {
            unaff_x25 = (undefined8 *)puVar10[2];
            bVar2 = (undefined8 *)*unaff_x25 != puVar10;
            puVar10 = unaff_x25;
          } while (bVar2);
        }
        else {
          do {
            unaff_x25 = puVar1;
            puVar1 = (undefined8 *)*unaff_x25;
          } while ((undefined8 *)*unaff_x25 != (undefined8 *)0x0);
        }
        while (unaff_x25 == unaff_x26) {
          uStack0000000000000028 = &UNK_00989680;
          __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                    (&uStack0000000000000028);
          func_0x00051a2c(&uStack0000000000000010,in_stack_00000018);
          if ((*unaff_x24 & 1) == 0) {
            return;
          }
          *unaff_x26 = 0;
          unaff_x26[1] = 0;
          uStack0000000000000010 = unaff_x26;
          __ZNSt3__15mutex4lockEv();
          func_0x00051704(&uStack0000000000000010,uRam0000000000a33948,0xa33950);
          __ZNSt3__15mutex6unlockEv();
          unaff_x25 = uStack0000000000000010;
        }
        unaff_x22 = unaff_x25[4];
        if ((*(byte *)(unaff_x22 + 0x38) & 1) != 0) break;
        __ZNSt3__15mutex4lockEv();
        plVar4 = *(long **)(unaff_x28 + 0x950);
        if (plVar4 != (long *)0x0) {
          plVar6 = plVar4;
          plVar9 = unaff_x20;
          do {
            plVar8 = plVar6 + 1;
            if (unaff_x22 <= (ulong)plVar6[4]) {
              plVar9 = plVar6;
              plVar8 = plVar6;
            }
            plVar6 = (long *)*plVar8;
          } while (plVar6 != (long *)0x0);
          if ((plVar9 != unaff_x20) && ((ulong)plVar9[4] <= unaff_x22)) {
            plVar6 = (long *)plVar9[1];
            plVar8 = plVar9;
            if ((long *)plVar9[1] == (long *)0x0) {
              do {
                plVar7 = (long *)plVar8[2];
                bVar2 = (long *)*plVar7 != plVar8;
                plVar8 = plVar7;
              } while (bVar2);
            }
            else {
              do {
                plVar7 = plVar6;
                plVar6 = (long *)*plVar7;
              } while ((long *)*plVar7 != (long *)0x0);
            }
            if (*(long **)(unaff_x21 + 0x948) == plVar9) {
              *(long **)(unaff_x21 + 0x948) = plVar7;
            }
            *(long *)(unaff_x27 + 0x958) = *(long *)(unaff_x27 + 0x958) + -1;
            func_0x00037ca0(plVar4,plVar9);
            __ZdlPv(plVar9);
          }
        }
        __ZNSt3__15mutex6unlockEv();
        func_0x00051184(unaff_x22,1);
      }
      uStack0000000000000028 = (undefined *)0x0;
      uStack0000000000000008 = 0;
      unaff_x23 = unaff_x22 + 0x48;
      __ZNSt3__15mutex4lockEv(unaff_x23);
      param_1 = *(long *)(unaff_x22 + 0x20);
    } while (param_1 == 0);
    param_2 = *(undefined8 *)(unaff_x22 + 0x40);
    param_4 = &uStack0000000000000028;
    param_5 = &uStack0000000000000008;
    param_3 = 0x4000;
  } while( true );
}

