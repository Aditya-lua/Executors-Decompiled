
void FUN_0005139c(void)

{
  long lVar1;
  undefined8 *puVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  undefined8 *puVar8;
  long *plVar9;
  ulong uVar10;
  long *plVar11;
  undefined8 *puVar12;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  if ((bRam0000000000a338f0 & 1) != 0) {
    do {
      uStack0000000000000018 = 0;
      uStack0000000000000020 = 0;
      _uStack0000000000000010 = &uStack0000000000000018;
      __ZNSt3__15mutex4lockEv(0xa288e8);
      func_0x00051704(&uStack0000000000000010,plRam0000000000a33948,0xa33950);
      __ZNSt3__15mutex6unlockEv(0xa288e8);
      puVar8 = _uStack0000000000000010;
      while (puVar8 != &uStack0000000000000018) {
        uVar10 = puVar8[4];
        if ((*(byte *)(uVar10 + 0x38) & 1) == 0) {
          __ZNSt3__15mutex4lockEv(0xa288e8);
          if (plRam0000000000a33950 != (long *)0x0) {
            plVar11 = (long *)0xa33950;
            plVar6 = plRam0000000000a33950;
            do {
              plVar9 = plVar6 + 1;
              if (uVar10 <= (ulong)plVar6[4]) {
                plVar11 = plVar6;
                plVar9 = plVar6;
              }
              plVar6 = (long *)*plVar9;
            } while (plVar6 != (long *)0x0);
            if ((plVar11 != (long *)0xa33950) && ((ulong)plVar11[4] <= uVar10)) {
              plVar6 = (long *)plVar11[1];
              plVar9 = plVar11;
              if ((long *)plVar11[1] == (long *)0x0) {
                do {
                  plVar7 = (long *)plVar9[2];
                  bVar3 = (long *)*plVar7 != plVar9;
                  plVar9 = plVar7;
                } while (bVar3);
              }
              else {
                do {
                  plVar7 = plVar6;
                  plVar6 = (long *)*plVar7;
                } while ((long *)*plVar7 != (long *)0x0);
              }
              if (plRam0000000000a33948 == plVar11) {
                plRam0000000000a33948 = plVar7;
              }
              lRam0000000000a33958 = lRam0000000000a33958 + -1;
              func_0x00037ca0(plRam0000000000a33950,plVar11);
              __ZdlPv(plVar11);
            }
          }
          __ZNSt3__15mutex6unlockEv(0xa288e8);
          func_0x00051184(uVar10,1);
        }
        else {
          uStack0000000000000028 = (undefined *)0x0;
          uStack0000000000000008 = 0;
          lVar1 = uVar10 + 0x48;
          __ZNSt3__15mutex4lockEv(lVar1);
          if ((*(long *)(uVar10 + 0x20) == 0) ||
             (iVar4 = func_0x0078c028(*(long *)(uVar10 + 0x20),*(undefined8 *)(uVar10 + 0x40),0x4000
                                      ,&uStack0000000000000028,&uStack0000000000000008), iVar4 != 0)
             ) {
            __ZNSt3__15mutex6unlockEv(lVar1);
          }
          else {
            __ZNSt3__15mutex6unlockEv(lVar1);
            if ((((uStack0000000000000028 != (undefined *)0x0) && (uStack0000000000000008 != 0)) &&
                ((*(byte *)(uStack0000000000000008 + 4) & 3) != 0)) &&
               (*(long *)(uVar10 + 0x28) != 0)) {
              uVar5 = func_0x006e1e34(*(undefined8 *)(uVar10 + 8));
              (*pcRam0000000000a27968)(*(undefined8 *)(uVar10 + 8),*(undefined8 *)(uVar10 + 0x28));
              func_0x006e3d18(*(undefined8 *)(uVar10 + 8),0xffffffff,"Event");
              func_0x006e3d18(*(undefined8 *)(uVar10 + 8),0xfffffffe,"Fire");
              func_0x006e2154(*(undefined8 *)(uVar10 + 8),0xfffffffd);
              func_0x006e38d8(*(undefined8 *)(uVar10 + 8),*(undefined8 *)(uVar10 + 0x40),
                              uStack0000000000000028);
              func_0x006e4c80(*(undefined8 *)(uVar10 + 8),2,0);
              func_0x006e1d54(*(undefined8 *)(uVar10 + 8),uVar5);
            }
          }
        }
        puVar2 = (undefined8 *)puVar8[1];
        puVar12 = puVar8;
        if ((undefined8 *)puVar8[1] == (undefined8 *)0x0) {
          do {
            puVar8 = (undefined8 *)puVar12[2];
            bVar3 = (undefined8 *)*puVar8 != puVar12;
            puVar12 = puVar8;
          } while (bVar3);
        }
        else {
          do {
            puVar8 = puVar2;
            puVar2 = (undefined8 *)*puVar8;
          } while ((undefined8 *)*puVar8 != (undefined8 *)0x0);
        }
      }
      uStack0000000000000028 = &UNK_00989680;
      __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                (&uStack0000000000000028);
      func_0x00051a2c(&uStack0000000000000010,uStack0000000000000018);
    } while ((bRam0000000000a338f0 & 1) != 0);
  }
  return;
}

