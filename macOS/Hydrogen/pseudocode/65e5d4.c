
/* WARNING: Removing unreachable block (ram,0x0065e5e4) */
/* WARNING: Removing unreachable block (ram,0x0065e5b4) */

void FUN_0065e5d4(void)

{
  int iVar1;
  long *plVar2;
  long *unaff_x20;
  undefined8 uStack0000000000000018;
  
  uStack0000000000000018 = 0;
  iVar1 = func_0x0065e800();
  if (iVar1 == 0) {
    plVar2 = (long *)(**(code **)(*unaff_x20 + 0x18))();
    (**(code **)(*(long *)((long)plVar2 + *(long *)(*plVar2 + -0x70)) + 0x18))();
    func_0x0065ed58();
    func_0x0065eaa0();
    return;
  }
  func_0x0065e958(uStack0000000000000018);
  return;
}

