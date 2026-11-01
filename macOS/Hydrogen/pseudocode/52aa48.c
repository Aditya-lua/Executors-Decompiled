
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0052aa48(void)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  
  puVar3 = (undefined8 *)func_0x00187bd0();
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x52aab8);
    (*pcVar2)();
  }
  puVar3[1] = 1;
  *puVar3 = 1;
  puVar3[2] = unaff_x19;
  puVar3[3] = unaff_x21;
  puVar3[4] = unaff_x19;
  *unaff_x20 = puVar3;
  unaff_x20[1] = &UNK_009e9ab0;
  uVar1 = _UNK_008a6810;
  unaff_x20[3] = _UNK_008a6818;
  unaff_x20[2] = uVar1;
  return;
}

