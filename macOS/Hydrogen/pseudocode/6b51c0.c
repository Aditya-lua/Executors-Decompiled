
/* WARNING: Possible PIC construction at 0x006b51d0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006b51d4) */
/* WARNING: Removing unreachable block (ram,0x006b51e0) */
/* WARNING: Removing unreachable block (ram,0x006b51a0) */
/* WARNING: Removing unreachable block (ram,0x006b51b0) */
/* WARNING: Removing unreachable block (ram,0x006b51ec) */
/* WARNING: Removing unreachable block (ram,0x006b5380) */
/* WARNING: Removing unreachable block (ram,0x006b51f4) */
/* WARNING: Removing unreachable block (ram,0x006b52d0) */

void FUN_006b51c0(void)

{
  ulong uVar1;
  long *plVar2;
  uint uVar3;
  char in_w8;
  long *unaff_x19;
  ulong uVar4;
  long lStack0000000000000000;
  
  lStack0000000000000000 = (long)in_w8;
  uVar3 = _vsnprintf(0,0);
  if ((int)uVar3 < 1) {
    return;
  }
  if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
    uVar4 = unaff_x19[1];
    uVar1 = uVar4 + uVar3;
    if (uVar1 <= uVar4) {
      unaff_x19[1] = uVar1;
      *(undefined1 *)(*unaff_x19 + uVar1) = 0;
      goto code_r0x00798be0;
    }
  }
  else {
    uVar4 = (ulong)*(byte *)((long)unaff_x19 + 0x17);
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc();
code_r0x00798be0:
  plVar2 = (long *)*unaff_x19;
  if (-1 < *(char *)((long)unaff_x19 + 0x17)) {
    plVar2 = unaff_x19;
  }
  _vsnprintf((long)plVar2 + uVar4,uVar3 + 1);
  return;
}

