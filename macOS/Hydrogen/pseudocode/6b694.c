
/* WARNING: Removing unreachable block (ram,0x0006b20c) */

ulong FUN_0006b694(ulong param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  undefined1 in_ZR;
  ulong uVar1;
  long in_x9;
  long in_x10;
  long in_x11;
  ulong in_x12;
  long unaff_x19;
  uint uStack00000000000000a4;
  
  while ((!(bool)in_ZR && (*(char *)(in_x10 + in_x12) == *(char *)(in_x9 + in_x12)))) {
    in_ZR = param_1 == in_x12 + 1;
    in_x12 = in_x12 + 1;
  }
  if (in_x12 < param_1) {
    uStack00000000000000a4 = 0;
  }
  else {
    *(ulong *)(unaff_x19 + 0x100) = param_1 + in_x11;
    *(undefined8 *)(unaff_x19 + 0x78) = 1;
    if (*(long *)(unaff_x19 + 0x108) != param_1 + in_x11) {
                    /* WARNING: Could not recover jumptable at 0x0006b238. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (*(code *)(&UNK_0006b23c + (ulong)*(byte *)(param_4 + 1) * 4))();
      return uVar1;
    }
    uStack00000000000000a4 = 1;
  }
  return (ulong)uStack00000000000000a4;
}

