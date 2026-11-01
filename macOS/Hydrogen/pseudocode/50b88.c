
undefined8 FUN_00050b88(undefined8 param_1)

{
  code *pcVar1;
  undefined4 uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  ulong unaff_x20;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  uVar4 = func_0x006e33ec(param_1,0xffffffff);
  func_0x006e1d54();
  *(undefined8 *)(unaff_x20 + 0x30) = uVar4;
  uVar4 = func_0x006e1a48();
  *(undefined8 *)(unaff_x20 + 8) = uVar4;
  uVar2 = func_0x006e1c18();
  *(undefined4 *)(unaff_x20 + 0x10) = uVar2;
  *(undefined1 *)(unaff_x20 + 0x38) = 0;
  lVar5 = _malloc(0x4000);
  *(long *)(unaff_x20 + 0x40) = lVar5;
  if (lVar5 == 0) {
    func_0x00051184();
    func_0x006e644c();
  }
  else {
    func_0x006e1d54();
    func_0x007795c4();
    func_0x007795c4();
    func_0x007795c4();
    func_0x007795c4();
    func_0x007795c4();
    iVar3 = func_0x00741600();
    if (iVar3 == 0) {
      *(undefined1 *)(unaff_x20 + 0x38) = 1;
      __ZNSt3__15mutex4lockEv(0xa288e8);
      puVar6 = puRam0000000000a33950;
      if (puRam0000000000a33950 == (undefined8 *)0x0) {
        puVar7 = (undefined8 *)0xa33950;
        puVar8 = (undefined8 *)0xa33950;
      }
      else {
        do {
          while (puVar7 = puVar6, (ulong)puVar7[4] <= unaff_x20) {
            if (unaff_x20 <= (ulong)puVar7[4]) goto code_r0x00050d0c;
            puVar6 = (undefined8 *)puVar7[1];
            if ((undefined8 *)puVar7[1] == (undefined8 *)0x0) {
              puVar8 = puVar7 + 1;
              goto code_r0x00050cc4;
            }
          }
          puVar6 = (undefined8 *)*puVar7;
          puVar8 = puVar7;
        } while ((undefined8 *)*puVar7 != (undefined8 *)0x0);
      }
code_r0x00050cc4:
      puVar6 = (undefined8 *)__Znwm(0x28);
      puVar6[4] = unaff_x20;
      *puVar6 = 0;
      puVar6[1] = 0;
      puVar6[2] = puVar7;
      *puVar8 = puVar6;
      if ((long *)*plRam0000000000a33948 != (long *)0x0) {
        puVar6 = (undefined8 *)*puVar8;
        plRam0000000000a33948 = (long *)*plRam0000000000a33948;
      }
      func_0x0003767c(puRam0000000000a33950,puVar6);
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
    func_0x00051184();
    func_0x006e644c();
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x50dd8);
  (*pcVar1)();
}

