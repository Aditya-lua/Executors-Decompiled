
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0060e6cc(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long unaff_x19;
  
  puVar2 = (undefined8 *)func_0x006115d0();
  *(undefined8 **)(unaff_x19 + 0x60) = puVar2;
  *(undefined4 *)(unaff_x19 + 0x68) = 0;
  uVar1 = _UNK_007fc120;
  puVar2[1] = _UNK_007fc128;
  *puVar2 = uVar1;
  ___cxa_atexit(&SUB_00087574,unaff_x19 + 0x40,0);
  ___cxa_guard_release();
  return 0xa3c198;
}

