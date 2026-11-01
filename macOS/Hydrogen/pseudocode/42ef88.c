
/* WARNING: Removing unreachable block (ram,0x0042f00c) */

long FUN_0042ef88(void)

{
  char cVar1;
  code *pcVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  ulong *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  int unaff_w23;
  ulong unaff_x24;
  char unaff_w25;
  ulong unaff_x26;
  ulong unaff_x27;
  undefined4 in_wzr;
  long *in_stack_00000018;
  
code_r0x0042ef88:
  if (in_stack_00000018 == (long *)0x0) {
    func_0x0079fe64(unaff_x20 + 0x18);
  }
  uVar6 = unaff_x20 | unaff_x27 & unaff_x24 | 2;
  if (((uint)unaff_x27 >> 1 & 1) == 0) {
    uVar5 = *unaff_x19;
    if (uVar5 == unaff_x27) {
      *unaff_x19 = uVar6;
      goto LAB_0042f004;
    }
  }
  else {
    uVar5 = *unaff_x19;
    if (uVar5 == unaff_x27) {
      *unaff_x19 = uVar6 + 4;
      if (((uint)unaff_x27 >> 2 & 1) == 0) {
        func_0x00437f68();
      }
LAB_0042f004:
      while (in_stack_00000018 != (long *)0x0) {
        LOAcquire();
        cVar1 = (char)in_stack_00000018[6];
        *(char *)(in_stack_00000018 + 6) = cVar1 + unaff_w25;
        if (cVar1 != '\x01') {
          do {
            lVar3 = _dispatch_semaphore_wait(in_stack_00000018[5],0xffffffffffffffff);
          } while (lVar3 != 0);
          LOAcquire();
          *(char *)(in_stack_00000018 + 6) = (char)in_wzr;
        }
      }
      func_0x007a23bc(&UNK_009dc290);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x42f0dc);
      (*pcVar2)();
    }
  }
  do {
    unaff_x27 = uVar5;
    while (((unaff_x27 == 1 || (0xffffffffffffffef < unaff_x27)) ||
           (((uint)unaff_x27 >> 1 & 1) != 0))) {
      if ((((uint)unaff_x27 >> 1 & 1) != 0) || (6 < unaff_x26)) goto code_r0x0042ef88;
      iVar4 = unaff_w23 << (ulong)((uint)unaff_x26 & 0x1f);
      do {
        InstructionSynchronizationBarrier();
        iVar4 = iVar4 + -1;
      } while (iVar4 != 0);
      unaff_x26 = unaff_x26 + 1;
      unaff_x27 = *(ulong *)(unaff_x22 + 0xfc0);
    }
    uVar5 = *unaff_x19;
    if (uVar5 == unaff_x27) {
      *unaff_x19 = unaff_x21 + (unaff_x27 | 1);
      if (in_stack_00000018 != (long *)0x0) {
        lVar3 = *in_stack_00000018;
        *in_stack_00000018 = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          func_0x00403874(unaff_x20 + 0x18);
        }
      }
      return (long)unaff_x19 + 9;
    }
  } while( true );
}

