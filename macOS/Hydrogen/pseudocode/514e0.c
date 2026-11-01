
void thunk_FUN_000514f8(long *param_1,long *param_2)

{
  long lVar1;
  undefined8 *puVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  long *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long *unaff_x23;
  byte *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *puVar8;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000028;
  
  do {
    if (*(long **)(unaff_x21 + 0x948) == unaff_x23) {
      *(long **)(unaff_x21 + 0x948) = param_1;
    }
    *(long *)(unaff_x27 + 0x958) = *(long *)(unaff_x27 + 0x958) + -1;
    func_0x00037ca0(param_2,unaff_x23);
    __ZdlPv(unaff_x23);
    do {
      do {
        __ZNSt3__15mutex6unlockEv();
        func_0x00051184(unaff_x22,1);
        while( true ) {
          puVar2 = (undefined8 *)unaff_x25[1];
          puVar8 = unaff_x25;
          if ((undefined8 *)unaff_x25[1] == (undefined8 *)0x0) {
            do {
              unaff_x25 = (undefined8 *)puVar8[2];
              bVar3 = (undefined8 *)*unaff_x25 != puVar8;
              puVar8 = unaff_x25;
            } while (bVar3);
          }
          else {
            do {
              unaff_x25 = puVar2;
              puVar2 = (undefined8 *)*unaff_x25;
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
          if ((*(byte *)(unaff_x22 + 0x38) & 1) == 0) break;
          uStack0000000000000028 = (undefined *)0x0;
          uStack0000000000000008 = 0;
          lVar1 = unaff_x22 + 0x48;
          __ZNSt3__15mutex4lockEv(lVar1);
          if ((*(long *)(unaff_x22 + 0x20) == 0) ||
             (iVar4 = func_0x0078c028(*(long *)(unaff_x22 + 0x20),*(undefined8 *)(unaff_x22 + 0x40),
                                      0x4000,&uStack0000000000000028,&uStack0000000000000008),
             iVar4 != 0)) {
            __ZNSt3__15mutex6unlockEv(lVar1);
          }
          else {
            __ZNSt3__15mutex6unlockEv(lVar1);
            if ((((uStack0000000000000028 != (undefined *)0x0) && (uStack0000000000000008 != 0)) &&
                ((*(byte *)(uStack0000000000000008 + 4) & 3) != 0)) &&
               (*(long *)(unaff_x22 + 0x28) != 0)) {
              uVar5 = func_0x006e1e34(*(undefined8 *)(unaff_x22 + 8));
              (*pcRam0000000000a27968)
                        (*(undefined8 *)(unaff_x22 + 8),*(undefined8 *)(unaff_x22 + 0x28));
              func_0x006e3d18(*(undefined8 *)(unaff_x22 + 8),0xffffffff,"Event");
              func_0x006e3d18(*(undefined8 *)(unaff_x22 + 8),0xfffffffe,"Fire");
              func_0x006e2154(*(undefined8 *)(unaff_x22 + 8),0xfffffffd);
              func_0x006e38d8(*(undefined8 *)(unaff_x22 + 8),*(undefined8 *)(unaff_x22 + 0x40),
                              uStack0000000000000028);
              func_0x006e4c80(*(undefined8 *)(unaff_x22 + 8),2,0);
              func_0x006e1d54(*(undefined8 *)(unaff_x22 + 8),uVar5);
            }
          }
        }
        __ZNSt3__15mutex4lockEv();
        param_2 = *(long **)(unaff_x28 + 0x950);
      } while (param_2 == (long *)0x0);
      plVar6 = param_2;
      unaff_x23 = unaff_x20;
      do {
        plVar7 = plVar6 + 1;
        if (unaff_x22 <= (ulong)plVar6[4]) {
          unaff_x23 = plVar6;
          plVar7 = plVar6;
        }
        plVar6 = (long *)*plVar7;
      } while (plVar6 != (long *)0x0);
    } while ((unaff_x23 == unaff_x20) || (unaff_x22 < (ulong)unaff_x23[4]));
    plVar6 = (long *)unaff_x23[1];
    plVar7 = unaff_x23;
    if ((long *)unaff_x23[1] == (long *)0x0) {
      do {
        param_1 = (long *)plVar7[2];
        bVar3 = (long *)*param_1 != plVar7;
        plVar7 = param_1;
      } while (bVar3);
    }
    else {
      do {
        param_1 = plVar6;
        plVar6 = (long *)*param_1;
      } while ((long *)*param_1 != (long *)0x0);
    }
  } while( true );
}

