
/* WARNING: Removing unreachable block (ram,0x0042d7b4) */

void FUN_0042d764(void)

{
  char cVar1;
  code *pcVar2;
  long lVar3;
  undefined1 *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  int iVar7;
  ulong uVar8;
  ulong extraout_x8;
  ulong uVar9;
  byte unaff_w19;
  ulong *unaff_x21;
  uint uVar10;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  int unaff_w25;
  ulong unaff_x26;
  char unaff_w27;
  ulong unaff_x28;
  undefined4 in_wzr;
  undefined1 auVar11 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  long *in_stack_00000068;
  
code_r0x0042d764:
  unaff_x28 = unaff_x28 + 1;
  do {
    auVar11 = func_0x00437f3c(unaff_x22);
    if ((auVar11._0_8_ & 1) == 0) {
      uVar10 = (uint)unaff_x22;
      if (((uVar10 >> 1 & 1) == 0) && (unaff_x28 < 7)) break;
      if (in_stack_00000068 == (long *)0x0) {
        func_0x0079fe64(unaff_x23 + 0x18);
      }
      uStack0000000000000050 = (undefined *)(unaff_x22 & 0xfffffffffffffff0);
      in_stack_00000058 = 0;
      uVar9 = unaff_x23 | unaff_x22 & unaff_x26 | 2;
      if ((uVar10 >> 1 & 1) == 0) {
        uVar8 = *unaff_x21;
        if (uVar8 == unaff_x22) {
          *unaff_x21 = uVar9;
code_r0x0042d7ac:
          while (in_stack_00000068 != (long *)0x0) {
            LOAcquire();
            cVar1 = (char)in_stack_00000068[6];
            *(char *)(in_stack_00000068 + 6) = cVar1 + unaff_w27;
            if (cVar1 != '\x01') {
              do {
                lVar3 = _dispatch_semaphore_wait(in_stack_00000068[5],0xffffffffffffffff);
              } while (lVar3 != 0);
              LOAcquire();
              *(char *)(in_stack_00000068 + 6) = (char)in_wzr;
            }
          }
          func_0x007a23bc(&UNK_009dc290);
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x42d9a4);
          (*pcVar2)();
        }
      }
      else {
        uVar8 = *unaff_x21;
        if (uVar8 == unaff_x22) {
          *unaff_x21 = uVar9 + 4;
          if ((uVar10 >> 2 & 1) == 0) {
            func_0x00437f68();
          }
          goto code_r0x0042d7ac;
        }
      }
    }
    else {
      uVar8 = *unaff_x21;
      if (uVar8 == unaff_x22) {
        *unaff_x21 = auVar11._8_8_;
        if (in_stack_00000068 != (long *)0x0) {
          lVar3 = *in_stack_00000068;
          *in_stack_00000068 = lVar3 + -1;
          LORelease();
          if (lVar3 == 1) {
            func_0x0043e54c();
          }
        }
        uStack0000000000000030 = unaff_x21 + 2;
        if (*uStack0000000000000030 == 0) {
          _uStack0000000000000050 = func_0x0043e544(*(undefined8 *)(in_stack_00000008 + 0x28));
          func_0x0042c9fc(&uStack0000000000000050);
        }
        else {
          _uStack0000000000000050 = func_0x0043e544(*(undefined8 *)(in_stack_00000008 + 0x28));
          (**(code **)(lRam0000000000a33540 + 0x28))(uRam0000000000a33538,&uStack0000000000000050);
        }
        func_0x003f7738(&uStack0000000000000030);
        puVar4 = (undefined1 *)func_0x0043e518(0xa2bcd0);
        *puVar4 = 0;
        if ((unaff_w19 & 1) != 0) {
          func_0x007a12b0(in_stack_00000000,in_stack_00000008);
        }
        uStack0000000000000050 = &UNK_009db388;
        in_stack_00000058 = 1;
        uStack0000000000000030 =
             (ulong *)func_0x0041f554(&uStack0000000000000030,&uStack0000000000000050);
        puVar5 = &uStack0000000000000030;
        do {
          while( true ) {
            func_0x003f77f4(puVar5);
            func_0x007a144c();
            if ((extraout_x8 & 1) != 0) break;
            uStack0000000000000030 = &uStack0000000000000010;
            uVar6 = func_0x0043e4f4(&UNK_009db328);
            uStack0000000000000018 = uVar6;
            puVar5 = &uStack0000000000000018;
          }
          auVar11 = func_0x0043e544(*(undefined8 *)(in_stack_00000008 + 0x30));
          if (auVar11._0_8_ == 0) {
            auVar11 = ZEXT816(1);
          }
          uStack0000000000000030 = &uStack0000000000000010;
          _uStack0000000000000018 = auVar11;
          uStack0000000000000028 = func_0x0043e4f4(&UNK_009db358);
          puVar5 = &uStack0000000000000028;
        } while( true );
      }
    }
    unaff_x22 = uVar8;
  } while( true );
  iVar7 = unaff_w25 << (ulong)((uint)unaff_x28 & 0x1f);
  do {
    InstructionSynchronizationBarrier();
    iVar7 = iVar7 + -1;
  } while (iVar7 != 0);
  unaff_x22 = *(ulong *)(unaff_x24 + 0x528);
  goto code_r0x0042d764;
}

