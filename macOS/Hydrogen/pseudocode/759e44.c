
undefined8 FUN_00759e44(long param_1)

{
  long *plVar1;
  int iVar2;
  long *plVar3;
  undefined8 uVar4;
  ulong uVar5;
  long extraout_x1;
  long lVar6;
  undefined1 *unaff_x19;
  long unaff_x24;
  long unaff_x28;
  long unaff_x29;
  undefined1 uStack0000000000000028;
  
  if (((param_1 == 0) || (0 < *(int *)(param_1 + 8))) && (0 < iRam0000000000a2b550)) {
    func_0x0073cd4c();
  }
  uVar4 = func_0x00729b5c(unaff_x24 + 0x20,"0\r\n\r\n",5,&uStack0000000000000028);
  if ((int)uVar4 != 0) goto code_r0x00759f68;
  lVar6 = unaff_x28 + 0x20;
  uVar5 = func_0x007298e4(lVar6);
  if ((uVar5 & 1) == 0) {
    uVar4 = func_0x00729f70(lVar6);
    if ((int)uVar4 != 0) goto code_r0x00759f68;
    if ((*(byte *)(unaff_x28 + 0x60) & 1) != 0) {
      iVar2 = func_0x007298e4(lVar6);
      uVar4 = 0;
      if (iVar2 != 0) {
        *(byte *)(unaff_x28 + 0x60) = *(byte *)(unaff_x28 + 0x60) | 2;
        *unaff_x19 = 1;
      }
      goto code_r0x00759f68;
    }
  }
  uVar4 = 0;
code_r0x00759f68:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar4;
  }
  ___stack_chk_fail();
  lVar6 = *(long *)(extraout_x1 + 0x10);
  plVar1 = (long *)(lVar6 + 0x20);
  plVar3 = (long *)*plVar1;
  while (plVar3 != (long *)0x0) {
    *plVar1 = *plVar3;
    (*pcRam0000000000a2b5f0)();
    plVar3 = (long *)*plVar1;
  }
  while (*(undefined8 **)(lVar6 + 0x30) != (undefined8 *)0x0) {
    *(undefined8 *)(lVar6 + 0x30) = **(undefined8 **)(lVar6 + 0x30);
    (*pcRam0000000000a2b5f0)();
  }
  *(undefined8 *)(lVar6 + 0x28) = 0;
  *(undefined8 *)(lVar6 + 0x40) = 0;
  return 0;
}

