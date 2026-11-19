/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080d0c8
 */

long * FUN_0080d0c8(long *param_1,ulong *param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  byte bVar8;
  
  uVar2 = param_1[1];
  if (uVar2 != 0) {
    uVar3 = *param_2;
    uVar4 = ((ulong)(uint)((int)uVar3 << 3) + 8 ^ uVar3 >> 0x20) * -0x622015f714c7d297;
    bVar8 = POPCOUNT((char)uVar2) + POPCOUNT((char)(uVar2 >> 8)) + POPCOUNT((char)(uVar2 >> 0x10)) +
            POPCOUNT((char)(uVar2 >> 0x18)) + POPCOUNT((char)(uVar2 >> 0x20)) +
            POPCOUNT((char)(uVar2 >> 0x28)) + POPCOUNT((char)(uVar2 >> 0x30)) +
            POPCOUNT((char)(uVar2 >> 0x38));
    uVar4 = (uVar3 >> 0x20 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
    uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x622015f714c7d297;
    if (bVar8 < 2) {
      uVar5 = uVar4 & uVar2 - 1;
    }
    else {
      uVar5 = uVar4;
      if (uVar2 <= uVar4) {
        uVar5 = 0;
        if (uVar2 != 0) {
          uVar5 = uVar4 / uVar2;
        }
        uVar5 = uVar4 - uVar5 * uVar2;
      }
    }
    plVar6 = *(long **)(*param_1 + uVar5 * 8);
    if ((plVar6 != (long *)0x0) && (plVar6 = (long *)*plVar6, plVar6 != (long *)0x0)) {
      do {
        uVar7 = plVar6[1];
        if (uVar7 == uVar4) {
          if (plVar6[2] == uVar3) {
            return plVar6 + 3;
          }
        }
        else {
          if (bVar8 < 2) {
            uVar7 = uVar7 & uVar2 - 1;
          }
          else if (uVar2 <= uVar7) {
            uVar1 = 0;
            if (uVar2 != 0) {
              uVar1 = uVar7 / uVar2;
            }
            uVar7 = uVar7 - uVar1 * uVar2;
          }
          if (uVar7 != uVar5) break;
        }
        plVar6 = (long *)*plVar6;
      } while (plVar6 != (long *)0x0);
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_0080c8d0("unordered_map::at: key not found");
}

