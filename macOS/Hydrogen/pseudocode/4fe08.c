
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_0004fe08(long param_1,uint param_2)

{
  ulong uVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  long unaff_x29;
  undefined2 uVar8;
  undefined8 uVar9;
  
  if ((*(byte *)(param_1 + 0x918) & 1) == 0) goto LAB_0004ff6c;
code_r0x0004fe14:
  if (uRam0000000000a33968 != 0) {
    uVar4 = (ulong)param_2;
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
      uVar5 = (ulong)((int)uRam0000000000a33968 - 1U & param_2);
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
      if (uVar7 < 2) {
        do {
          if (plVar6[1] == uVar4) {
            if (*(byte *)(plVar6 + 2) == param_2) goto code_r0x0004ff4c;
          }
          else if ((plVar6[1] & uRam0000000000a33968 - 1) != uVar5) break;
          plVar6 = (long *)*plVar6;
        } while (plVar6 != (long *)0x0);
      }
      else {
        do {
          uVar7 = plVar6[1];
          if (uVar7 == uVar4) {
            if (*(byte *)(plVar6 + 2) == param_2) goto code_r0x0004ff4c;
          }
          else {
            if (uRam0000000000a33968 <= uVar7) {
              uVar1 = 0;
              if (uRam0000000000a33968 != 0) {
                uVar1 = uVar7 / uRam0000000000a33968;
              }
              uVar7 = uVar7 - uVar1 * uRam0000000000a33968;
            }
            if (uVar7 != uVar5) break;
          }
          plVar6 = (long *)*plVar6;
        } while (plVar6 != (long *)0x0);
      }
    }
  }
  uVar3 = 0xffff;
  if ((param_2 - 0x25 & 0xff) < 4) {
    uVar3 = (uint)(0x7d007c007e007b >> (((ulong)(param_2 - 0x25) & 3) << 4));
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28))
  goto code_r0x0004ff68;
  goto code_r0x0004ff34;
code_r0x0004ff4c:
  uVar3 = (uint)*(ushort *)((long)plVar6 + 0x12);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
code_r0x0004ff34:
    return uVar3 & 0xffff;
  }
code_r0x0004ff68:
  param_2 = ___stack_chk_fail();
LAB_0004ff6c:
  iVar2 = ___cxa_guard_acquire(0xa33918);
  if (iVar2 != 0) {
    func_0x00050030(0xa33960);
    ___cxa_atexit(&DAT_000500bc,0xa33960,0);
    ___cxa_guard_release(0xa33918);
  }
  goto code_r0x0004fe14;
}

