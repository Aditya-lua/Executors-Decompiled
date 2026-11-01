
/* WARNING: Possible PIC construction at 0x00064bfc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00064ed8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00064ef0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00064f04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00064ef4) */
/* WARNING: Removing unreachable block (ram,0x00064edc) */
/* WARNING: Removing unreachable block (ram,0x00064c00) */
/* WARNING: Removing unreachable block (ram,0x00064cb4) */
/* WARNING: Removing unreachable block (ram,0x00064ca8) */
/* WARNING: Removing unreachable block (ram,0x00064cac) */
/* WARNING: Removing unreachable block (ram,0x00064cbc) */
/* WARNING: Removing unreachable block (ram,0x00064cc8) */
/* WARNING: Removing unreachable block (ram,0x00064d08) */
/* WARNING: Removing unreachable block (ram,0x00064cfc) */
/* WARNING: Removing unreachable block (ram,0x00064d00) */
/* WARNING: Removing unreachable block (ram,0x00064d10) */
/* WARNING: Removing unreachable block (ram,0x00064d1c) */
/* WARNING: Removing unreachable block (ram,0x00064d24) */
/* WARNING: Removing unreachable block (ram,0x00064d30) */
/* WARNING: Removing unreachable block (ram,0x00064d98) */
/* WARNING: Removing unreachable block (ram,0x00064d3c) */
/* WARNING: Removing unreachable block (ram,0x00064d50) */
/* WARNING: Removing unreachable block (ram,0x00064ec4) */
/* WARNING: Removing unreachable block (ram,0x00064d68) */
/* WARNING: Removing unreachable block (ram,0x00064da4) */
/* WARNING: Removing unreachable block (ram,0x00064d84) */
/* WARNING: Removing unreachable block (ram,0x00064d8c) */
/* WARNING: Removing unreachable block (ram,0x00064dac) */
/* WARNING: Removing unreachable block (ram,0x00064de0) */
/* WARNING: Removing unreachable block (ram,0x00064dd4) */
/* WARNING: Removing unreachable block (ram,0x00064dd8) */
/* WARNING: Removing unreachable block (ram,0x00064de8) */
/* WARNING: Removing unreachable block (ram,0x00064df4) */
/* WARNING: Removing unreachable block (ram,0x00064e14) */
/* WARNING: Removing unreachable block (ram,0x00064e08) */
/* WARNING: Removing unreachable block (ram,0x00064e0c) */
/* WARNING: Removing unreachable block (ram,0x00064e1c) */
/* WARNING: Removing unreachable block (ram,0x00064e28) */
/* WARNING: Removing unreachable block (ram,0x00064e44) */
/* WARNING: Removing unreachable block (ram,0x00064e34) */
/* WARNING: Removing unreachable block (ram,0x00064e38) */
/* WARNING: Removing unreachable block (ram,0x00064e48) */
/* WARNING: Removing unreachable block (ram,0x00064e58) */
/* WARNING: Removing unreachable block (ram,0x00064e74) */
/* WARNING: Removing unreachable block (ram,0x00064e68) */
/* WARNING: Removing unreachable block (ram,0x00064e6c) */
/* WARNING: Removing unreachable block (ram,0x00064e7c) */
/* WARNING: Removing unreachable block (ram,0x00064e88) */
/* WARNING: Removing unreachable block (ram,0x00064ecc) */
/* WARNING: Removing unreachable block (ram,0x00064ea0) */
/* WARNING: Removing unreachable block (ram,0x00064f08) */

long * FUN_00064bf4(void)

{
  long *plVar1;
  long lVar2;
  long lStack0000000000000020;
  long *in_stack_00000038;
  long lStack0000000000000040;
  long *in_stack_00000058;
  long lStack0000000000000060;
  long *in_stack_00000078;
  long lStack0000000000000080;
  long *in_stack_00000098;
  undefined1 uStack00000000000000a0;
  undefined1 uStack0000000000000140;
  
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000140);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED1Ev(&uStack00000000000000a0);
  plVar1 = &lStack0000000000000080;
  if (in_stack_00000098 == plVar1) {
    lVar2 = 4;
LAB_00064f54:
    (**(code **)(*plVar1 + lVar2 * 8))();
  }
  else if (in_stack_00000098 != (long *)0x0) {
    lVar2 = 5;
    plVar1 = in_stack_00000098;
    goto LAB_00064f54;
  }
  plVar1 = &lStack0000000000000060;
  if (in_stack_00000078 == plVar1) {
    lVar2 = 4;
LAB_00064f84:
    (**(code **)(*plVar1 + lVar2 * 8))();
  }
  else if (in_stack_00000078 != (long *)0x0) {
    lVar2 = 5;
    plVar1 = in_stack_00000078;
    goto LAB_00064f84;
  }
  plVar1 = &lStack0000000000000040;
  if (in_stack_00000058 == plVar1) {
    lVar2 = 4;
  }
  else {
    if (in_stack_00000058 == (long *)0x0) goto LAB_00064fc0;
    lVar2 = 5;
    plVar1 = in_stack_00000058;
  }
  (**(code **)(*plVar1 + lVar2 * 8))();
LAB_00064fc0:
  if (in_stack_00000038 == &lStack0000000000000020) {
    lVar2 = 4;
    plVar1 = &lStack0000000000000020;
  }
  else {
    if (in_stack_00000038 == (long *)0x0) {
      return &lStack0000000000000020;
    }
    lVar2 = 5;
    plVar1 = in_stack_00000038;
  }
  (**(code **)(*plVar1 + lVar2 * 8))();
  return &lStack0000000000000020;
}

