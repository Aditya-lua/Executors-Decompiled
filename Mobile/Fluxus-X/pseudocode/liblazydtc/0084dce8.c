/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084dce8
 */

void FUN_0084dce8(long *param_1,ulong param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  long *plVar5;
  ulong uVar6;
  byte bVar7;
  long lVar8;
  
  std::__ndk1::mutex::lock((mutex *)&DAT_00d1e650);
  if (DAT_00d1e680 != 0) {
    uVar3 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    bVar7 = POPCOUNT((char)DAT_00d1e680) + POPCOUNT((char)(DAT_00d1e680 >> 8)) +
            POPCOUNT((char)(DAT_00d1e680 >> 0x10)) + POPCOUNT((char)(DAT_00d1e680 >> 0x18)) +
            POPCOUNT((char)(DAT_00d1e680 >> 0x20)) + POPCOUNT((char)(DAT_00d1e680 >> 0x28)) +
            POPCOUNT((char)(DAT_00d1e680 >> 0x30)) + POPCOUNT((char)(DAT_00d1e680 >> 0x38));
    uVar3 = (param_2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
    uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x622015f714c7d297;
    if (bVar7 < 2) {
      uVar4 = DAT_00d1e680 - 1 & uVar3;
    }
    else {
      uVar4 = uVar3;
      if (DAT_00d1e680 <= uVar3) {
        uVar4 = 0;
        if (DAT_00d1e680 != 0) {
          uVar4 = uVar3 / DAT_00d1e680;
        }
        uVar4 = uVar3 - uVar4 * DAT_00d1e680;
      }
    }
    plVar5 = *(long **)(DAT_00d1e678 + uVar4 * 8);
    if ((plVar5 != (long *)0x0) && (plVar5 = (long *)*plVar5, plVar5 != (long *)0x0)) {
      do {
        uVar6 = plVar5[1];
        if (uVar6 == uVar3) {
          if (plVar5[2] == param_2) {
            lVar2 = plVar5[4];
            lVar8 = plVar5[3];
            param_1[1] = plVar5[4];
            *param_1 = lVar8;
            if (lVar2 != 0) {
              FUN_00c2bce0(1,lVar2 + 8);
            }
            goto LAB_0084ddf0;
          }
        }
        else {
          if (bVar7 < 2) {
            uVar6 = uVar6 & DAT_00d1e680 - 1;
          }
          else if (DAT_00d1e680 <= uVar6) {
            uVar1 = 0;
            if (DAT_00d1e680 != 0) {
              uVar1 = uVar6 / DAT_00d1e680;
            }
            uVar6 = uVar6 - uVar1 * DAT_00d1e680;
          }
          if (uVar6 != uVar4) break;
        }
        plVar5 = (long *)*plVar5;
      } while (plVar5 != (long *)0x0);
    }
  }
  *param_1 = 0;
  param_1[1] = 0;
LAB_0084ddf0:
  std::__ndk1::mutex::unlock((mutex *)&DAT_00d1e650);
  return;
}

