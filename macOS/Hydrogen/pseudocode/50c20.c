
undefined8 FUN_00050c20(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  ulong unaff_x20;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  func_0x007795c4(param_1,0x51);
  func_0x007795c4();
  func_0x007795c4();
  iVar2 = func_0x00741600();
  if (iVar2 != 0) {
    func_0x00051184();
    func_0x006e644c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x50dd8);
    (*pcVar1)();
  }
  *(undefined1 *)(unaff_x20 + 0x38) = 1;
  __ZNSt3__15mutex4lockEv(0xa288e8);
  puVar3 = puRam0000000000a33950;
  if (puRam0000000000a33950 == (undefined8 *)0x0) {
    puVar4 = (undefined8 *)0xa33950;
    puVar5 = (undefined8 *)0xa33950;
  }
  else {
    do {
      while (puVar4 = puVar3, (ulong)puVar4[4] <= unaff_x20) {
        if (unaff_x20 <= (ulong)puVar4[4]) goto code_r0x00050d0c;
        puVar3 = (undefined8 *)puVar4[1];
        if ((undefined8 *)puVar4[1] == (undefined8 *)0x0) {
          puVar5 = puVar4 + 1;
          goto LAB_00050cc4;
        }
      }
      puVar3 = (undefined8 *)*puVar4;
      puVar5 = puVar4;
    } while ((undefined8 *)*puVar4 != (undefined8 *)0x0);
  }
LAB_00050cc4:
  puVar3 = (undefined8 *)__Znwm(0x28);
  puVar3[4] = unaff_x20;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = puVar4;
  *puVar5 = puVar3;
  if ((long *)*plRam0000000000a33948 != (long *)0x0) {
    puVar3 = (undefined8 *)*puVar5;
    plRam0000000000a33948 = (long *)*plRam0000000000a33948;
  }
  func_0x0003767c(puRam0000000000a33950,puVar3);
  lRam0000000000a33958 = lRam0000000000a33958 + 1;
code_r0x00050d0c:
  __ZNSt3__15mutex6unlockEv(0xa288e8);
  func_0x006e3c4c();
  func_0x006e3d18();
  func_0x006e4a40();
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  return 1;
}

