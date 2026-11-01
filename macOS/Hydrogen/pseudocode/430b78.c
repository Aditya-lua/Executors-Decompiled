
/* WARNING: Removing unreachable block (ram,0x00430aa4) */
/* WARNING: Removing unreachable block (ram,0x00430ab8) */
/* WARNING: Removing unreachable block (ram,0x00430aac) */
/* WARNING: Removing unreachable block (ram,0x00430ab0) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 FUN_00430b78(void)

{
  undefined4 uVar1;
  ulong in_stack_00000008;
  
  if ((in_stack_00000008 & 0x100000000) == 0) {
    __Unwind_SetGR();
    __Unwind_SetGR();
    __Unwind_SetIP();
    uVar1 = 7;
  }
  else {
    uVar1 = _UNK_0088819c;
  }
  return uVar1;
}

