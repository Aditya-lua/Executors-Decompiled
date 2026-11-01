
undefined8 FUN_0073ec0c(undefined8 *param_1)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 *puVar4;
  long unaff_x21;
  undefined4 unaff_w23;
  long unaff_x25;
  
  plVar2 = (long *)(*(code *)*param_1)(1,0x488);
  *(long **)(unaff_x19 + 0x1b8) = plVar2;
  if (plVar2 == (long *)0x0) {
    return 0;
  }
  plVar2[1] = -1;
  plVar2[0x48] = -1;
  *(ulong *)(unaff_x25 + 0x398) = *(ulong *)(unaff_x25 + 0x398) | 0x2000000;
  plVar2[0x90] = unaff_x21;
  *(undefined4 *)((long)plVar2 + 0x47c) = unaff_w23;
  lVar3 = func_0x00779dfc(0,"Content-Type: application/dns-message");
  *plVar2 = lVar3;
  if ((lVar3 == 0) || (iVar1 = func_0x0073ed38(), iVar1 != 0)) {
LAB_0073ec88:
    puVar4 = *(undefined8 **)(unaff_x19 + 0x1b8);
    if (puVar4 != (undefined8 *)0x0) {
      func_0x0073fefc();
      func_0x00779fa4(*puVar4);
      **(undefined8 **)(unaff_x19 + 0x1b8) = 0;
      (*pcRam0000000000a2b5f0)();
      *(undefined8 *)(unaff_x19 + 0x1b8) = 0;
    }
  }
  else {
    *(int *)(plVar2 + 0x8f) = (int)plVar2[0x8f] + 1;
    if ((*(char *)(unaff_x25 + 0x52b) != '\x01') && (iVar1 = func_0x0074f64c(), iVar1 != 0)) {
      iVar1 = func_0x0073ed38();
      if (iVar1 != 0) goto LAB_0073ec88;
      *(int *)(plVar2 + 0x8f) = (int)plVar2[0x8f] + 1;
    }
    *unaff_x20 = 1;
  }
  return 0;
}

