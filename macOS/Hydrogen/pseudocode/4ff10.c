
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_0004ff10(ulong param_1)

{
  ulong uVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  uint in_w9;
  uint in_w10;
  ulong uVar5;
  long *plVar6;
  ulong in_x11;
  ulong uVar7;
  long unaff_x29;
  undefined2 uVar8;
  undefined8 uVar9;
  
  do {
    if (in_w9 < 4) {
      in_w10 = (uint)(in_x11 >> (param_1 & 0x3f));
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
code_r0x0004ff34:
      return in_w10 & 0xffff;
    }
LAB_0004ff68:
    uVar2 = ___stack_chk_fail();
    iVar3 = ___cxa_guard_acquire(0xa33918);
    if (iVar3 != 0) {
      func_0x00050030(0xa33960);
      ___cxa_atexit(&DAT_000500bc,0xa33960,0);
      ___cxa_guard_release(0xa33918);
    }
    if (uRam0000000000a33968 != 0) {
      uVar4 = (ulong)uVar2;
      uVar9 = CONCAT17(POPCOUNT((char)(uRam0000000000a33968 >> 0x38)),
                       CONCAT16(POPCOUNT((char)(uRam0000000000a33968 >> 0x30)),
                                CONCAT15(POPCOUNT((char)(uRam0000000000a33968 >> 0x28)),
                                         CONCAT14(POPCOUNT((char)(uRam0000000000a33968 >> 0x20)),
                                                  CONCAT13(POPCOUNT((char)(uRam0000000000a33968 >>
                                                                          0x18)),
                                                           CONCAT12(POPCOUNT((char)(
                                                  uRam0000000000a33968 >> 0x10)),
                                                  CONCAT11(POPCOUNT((char)(uRam0000000000a33968 >> 8
                                                                          )),
                                                           POPCOUNT((char)uRam0000000000a33968))))))
                               ));
      uVar8 = NEON_uaddlv(uVar9,1);
      uVar7 = CONCAT62((int6)((ulong)uVar9 >> 0x10),uVar8) & 0xffffffff;
      if (uVar7 < 2) {
        uVar5 = (ulong)((int)uRam0000000000a33968 - 1U & uVar2);
      }
      else {
        uVar5 = uVar4;
        if (uRam0000000000a33968 <= uVar4) {
          uVar5 = 0;
          if (uRam0000000000a33968 != 0) {
            uVar5 = uVar4 / uRam0000000000a33968;
          }
          uVar5 = uVar4 - uVar5 * uRam0000000000a33968;
        }
      }
      plVar6 = *(long **)(lRam0000000000a33960 + uVar5 * 8);
      if ((plVar6 != (long *)0x0) && (plVar6 = (long *)*plVar6, plVar6 != (long *)0x0)) {
        if (1 < uVar7) {
          do {
            uVar7 = plVar6[1];
            if (uVar7 == uVar4) {
              if (*(byte *)(plVar6 + 2) == uVar2) goto code_r0x0004ff4c;
            }
            else {
              if (uRam0000000000a33968 <= uVar7) {
                uVar1 = 0;
                if (uRam0000000000a33968 != 0) {
                  uVar1 = uVar7 / uRam0000000000a33968;
                }
                uVar7 = uVar7 - uVar1 * uRam0000000000a33968;
              }
              if (uVar7 != uVar5) goto code_r0x0004feec;
            }
            plVar6 = (long *)*plVar6;
            if (plVar6 == (long *)0x0) goto code_r0x0004feec;
          } while( true );
        }
        do {
          if (plVar6[1] == uVar4) {
            if (*(byte *)(plVar6 + 2) == uVar2) goto code_r0x0004ff4c;
          }
          else if ((plVar6[1] & uRam0000000000a33968 - 1) != uVar5) break;
          plVar6 = (long *)*plVar6;
          if (plVar6 == (long *)0x0) break;
        } while( true );
      }
    }
code_r0x0004feec:
    in_w9 = uVar2 - 0x25 & 0xff;
    in_w10 = 0xffff;
    param_1 = ((ulong)(uVar2 - 0x25) & 0xff) << 4;
    in_x11 = 0x7d007c007e007b;
  } while( true );
code_r0x0004ff4c:
  in_w10 = (uint)*(ushort *)((long)plVar6 + 0x12);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28))
  goto code_r0x0004ff34;
  goto LAB_0004ff68;
}

