
undefined8 FUN_00051050(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  
  func_0x006e69bc(param_1,2,5);
  lVar2 = func_0x006e33ec();
  if ((lVar2 == 0) || (*(long *)(lVar2 + 0x20) == 0)) {
    func_0x006e644c();
LAB_00051108:
    func_0x006e644c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x51170);
    (*pcVar1)();
  }
  in_stack_00000018 = 0;
  lVar3 = func_0x006e67c8();
  if (((lVar3 != 0) && (in_stack_00000018 != 0)) && ((*(byte *)(lVar2 + 0x38) & 1) != 0)) {
    __ZNSt3__15mutex4lockEv(lVar2 + 0x48);
    uStack0000000000000010 = 0;
    if (*(long *)(lVar2 + 0x20) == 0) goto LAB_00051108;
    func_0x0078cc0c(*(long *)(lVar2 + 0x20),lVar3,in_stack_00000018,&uStack0000000000000010,0,1);
    __ZNSt3__15mutex6unlockEv(lVar2 + 0x48);
  }
  return 0;
}

