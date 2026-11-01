
void FUN_00051438(void)

{
  long lVar1;
  undefined8 *puVar2;
  bool bVar3;
  int iVar4;
  long *plVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  undefined8 *puVar9;
  long *plVar10;
  long *unaff_x20;
  long unaff_x21;
  ulong uVar11;
  long *plVar12;
  byte *unaff_x24;
  undefined8 *puVar13;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000028;
  
  while( true ) {
    _uStack0000000000000028 = &UNK_00989680;
    __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
              (&uStack0000000000000028);
    func_0x00051a2c(&uStack0000000000000010,in_stack_00000018);
    if ((*unaff_x24 & 1) == 0) break;
    *unaff_x26 = 0;
    unaff_x26[1] = 0;
    uStack0000000000000010 = unaff_x26;
    __ZNSt3__15mutex4lockEv();
    func_0x00051704(&uStack0000000000000010,uRam0000000000a33948,0xa33950);
    __ZNSt3__15mutex6unlockEv();
    puVar9 = uStack0000000000000010;
    while (puVar9 != unaff_x26) {
      uVar11 = puVar9[4];
      if ((*(byte *)(uVar11 + 0x38) & 1) == 0) {
        __ZNSt3__15mutex4lockEv();
        plVar5 = *(long **)(unaff_x28 + 0x950);
        if (plVar5 != (long *)0x0) {
          plVar7 = plVar5;
          plVar12 = unaff_x20;
          do {
            plVar10 = plVar7 + 1;
            if (uVar11 <= (ulong)plVar7[4]) {
              plVar12 = plVar7;
              plVar10 = plVar7;
            }
            plVar7 = (long *)*plVar10;
          } while (plVar7 != (long *)0x0);
          if ((plVar12 != unaff_x20) && ((ulong)plVar12[4] <= uVar11)) {
            plVar7 = (long *)plVar12[1];
            plVar10 = plVar12;
            if ((long *)plVar12[1] == (long *)0x0) {
              do {
                plVar8 = (long *)plVar10[2];
                bVar3 = (long *)*plVar8 != plVar10;
                plVar10 = plVar8;
              } while (bVar3);
            }
            else {
              do {
                plVar8 = plVar7;
                plVar7 = (long *)*plVar8;
              } while ((long *)*plVar8 != (long *)0x0);
            }
            if (*(long **)(unaff_x21 + 0x948) == plVar12) {
              *(long **)(unaff_x21 + 0x948) = plVar8;
            }
            *(long *)(unaff_x27 + 0x958) = *(long *)(unaff_x27 + 0x958) + -1;
            func_0x00037ca0(plVar5,plVar12);
            __ZdlPv(plVar12);
          }
        }
        __ZNSt3__15mutex6unlockEv();
        func_0x00051184(uVar11,1);
      }
      else {
        _uStack0000000000000028 = (undefined *)0x0;
        uStack0000000000000008 = 0;
        lVar1 = uVar11 + 0x48;
        __ZNSt3__15mutex4lockEv(lVar1);
        if ((*(long *)(uVar11 + 0x20) == 0) ||
           (iVar4 = func_0x0078c028(*(long *)(uVar11 + 0x20),*(undefined8 *)(uVar11 + 0x40),0x4000,
                                    &uStack0000000000000028,&uStack0000000000000008), iVar4 != 0)) {
          __ZNSt3__15mutex6unlockEv(lVar1);
        }
        else {
          __ZNSt3__15mutex6unlockEv(lVar1);
          if ((((_uStack0000000000000028 != (undefined *)0x0) && (uStack0000000000000008 != 0)) &&
              ((*(byte *)(uStack0000000000000008 + 4) & 3) != 0)) && (*(long *)(uVar11 + 0x28) != 0)
             ) {
            uVar6 = func_0x006e1e34(*(undefined8 *)(uVar11 + 8));
            (*pcRam0000000000a27968)(*(undefined8 *)(uVar11 + 8),*(undefined8 *)(uVar11 + 0x28));
            func_0x006e3d18(*(undefined8 *)(uVar11 + 8),0xffffffff,"Event");
            func_0x006e3d18(*(undefined8 *)(uVar11 + 8),0xfffffffe,"Fire");
            func_0x006e2154(*(undefined8 *)(uVar11 + 8),0xfffffffd);
            func_0x006e38d8(*(undefined8 *)(uVar11 + 8),*(undefined8 *)(uVar11 + 0x40),
                            _uStack0000000000000028);
            func_0x006e4c80(*(undefined8 *)(uVar11 + 8),2,0);
            func_0x006e1d54(*(undefined8 *)(uVar11 + 8),uVar6);
          }
        }
      }
      puVar2 = (undefined8 *)puVar9[1];
      puVar13 = puVar9;
      if ((undefined8 *)puVar9[1] == (undefined8 *)0x0) {
        do {
          puVar9 = (undefined8 *)puVar13[2];
          bVar3 = (undefined8 *)*puVar9 != puVar13;
          puVar13 = puVar9;
        } while (bVar3);
      }
      else {
        do {
          puVar9 = puVar2;
          puVar2 = (undefined8 *)*puVar9;
        } while ((undefined8 *)*puVar9 != (undefined8 *)0x0);
      }
    }
  }
  return;
}

