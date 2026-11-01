
/* WARNING: Possible PIC construction at 0x006b5180: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006b53a4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006b5184) */
/* WARNING: Removing unreachable block (ram,0x006b518c) */
/* WARNING: Removing unreachable block (ram,0x006b51a0) */
/* WARNING: Removing unreachable block (ram,0x006b51c0) */
/* WARNING: Removing unreachable block (ram,0x006b51b0) */
/* WARNING: Removing unreachable block (ram,0x006b51d0) */
/* WARNING: Removing unreachable block (ram,0x006b51e0) */
/* WARNING: Removing unreachable block (ram,0x006b51ec) */
/* WARNING: Removing unreachable block (ram,0x006b5380) */
/* WARNING: Removing unreachable block (ram,0x006b51f4) */
/* WARNING: Removing unreachable block (ram,0x006b52d0) */
/* WARNING: Removing unreachable block (ram,0x006b53a8) */

void FUN_006b5148(long param_1)

{
  long *plVar1;
  undefined1 in_ZR;
  uint uVar2;
  char *pcVar3;
  ulong uVar4;
  ulong in_x9;
  ulong in_x10;
  long *unaff_x19;
  ulong uVar5;
  undefined8 uStack0000000000000000;
  long in_stack_00000008;
  
  while ((!(bool)in_ZR && (0x1f < *(byte *)(param_1 + in_x10)))) {
    in_ZR = in_x9 == in_x10 + 1;
    in_x10 = in_x10 + 1;
  }
  if (in_x10 < in_x9) {
    if (cRam0000000000a33670 == '\0') {
      return;
    }
    pcVar3 = "\'";
  }
  else {
    in_stack_00000008 = param_1;
    if (in_x9 < 0x20) {
      pcVar3 = "\'%.*s\'";
      uStack0000000000000000 = in_x9;
    }
    else {
      uStack0000000000000000 = 0x20;
      pcVar3 = "\'%.*s\'...";
    }
  }
  uVar2 = _vsnprintf(0,0,pcVar3,&uStack0000000000000000);
  if ((int)uVar2 < 1) {
    return;
  }
  if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
    uVar5 = unaff_x19[1];
    uVar4 = uVar5 + uVar2;
    if (uVar4 <= uVar5) {
      unaff_x19[1] = uVar4;
      *(undefined1 *)(*unaff_x19 + uVar4) = 0;
      goto code_r0x00798be0;
    }
  }
  else {
    uVar5 = (ulong)*(byte *)((long)unaff_x19 + 0x17);
    uVar4 = uVar5 + uVar2;
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
            (unaff_x19,uVar4 - uVar5,0);
code_r0x00798be0:
  plVar1 = (long *)*unaff_x19;
  if (-1 < *(char *)((long)unaff_x19 + 0x17)) {
    plVar1 = unaff_x19;
  }
  _vsnprintf((long)plVar1 + uVar5,uVar2 + 1,pcVar3,&uStack0000000000000000);
  return;
}

