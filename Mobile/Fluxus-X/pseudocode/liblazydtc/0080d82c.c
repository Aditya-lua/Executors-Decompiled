/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080d82c
 */

void FUN_0080d82c(long *param_1,ulong *param_2)

{
  ulong uVar1;
  long lVar2;
  void *pvVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long *plVar10;
  ulong uVar11;
  __shared_weak_count *this;
  byte bVar12;
  void *local_50 [2];
  char local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  uVar6 = param_1[1];
  if (uVar6 != 0) {
    uVar7 = *param_2;
    uVar8 = ((ulong)(uint)((int)uVar7 << 3) + 8 ^ uVar7 >> 0x20) * -0x622015f714c7d297;
    bVar12 = POPCOUNT((char)uVar6) + POPCOUNT((char)(uVar6 >> 8)) + POPCOUNT((char)(uVar6 >> 0x10))
             + POPCOUNT((char)(uVar6 >> 0x18)) + POPCOUNT((char)(uVar6 >> 0x20)) +
             POPCOUNT((char)(uVar6 >> 0x28)) + POPCOUNT((char)(uVar6 >> 0x30)) +
             POPCOUNT((char)(uVar6 >> 0x38));
    uVar8 = (uVar7 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
    uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x622015f714c7d297;
    if (bVar12 < 2) {
      uVar9 = uVar8 & uVar6 - 1;
    }
    else {
      uVar9 = uVar8;
      if (uVar6 <= uVar8) {
        uVar9 = 0;
        if (uVar6 != 0) {
          uVar9 = uVar8 / uVar6;
        }
        uVar9 = uVar8 - uVar9 * uVar6;
      }
    }
    plVar10 = *(long **)(*param_1 + uVar9 * 8);
    if ((plVar10 != (long *)0x0) && (plVar10 = (long *)*plVar10, plVar10 != (long *)0x0)) {
      do {
        uVar11 = plVar10[1];
        if (uVar11 == uVar8) {
          if (plVar10[2] == uVar7) {
            FUN_0080d9bc(local_50);
            pvVar3 = local_50[0];
            local_50[0] = (void *)0x0;
            if (pvVar3 != (void *)0x0) {
              if (((local_40 == '\x01') &&
                  (this = *(__shared_weak_count **)((long)pvVar3 + 0x20),
                  this != (__shared_weak_count *)0x0)) &&
                 (lVar5 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar5 == 0)) {
                (**(code **)(*(long *)this + 0x10))(this);
                std::__ndk1::__shared_weak_count::__release_weak(this);
              }
              operator_delete(pvVar3,0x28);
            }
            uVar4 = 1;
            goto LAB_0080d930;
          }
        }
        else {
          if (bVar12 < 2) {
            uVar11 = uVar11 & uVar6 - 1;
          }
          else if (uVar6 <= uVar11) {
            uVar1 = 0;
            if (uVar6 != 0) {
              uVar1 = uVar11 / uVar6;
            }
            uVar11 = uVar11 - uVar1 * uVar6;
          }
          if (uVar11 != uVar9) break;
        }
        plVar10 = (long *)*plVar10;
      } while (plVar10 != (long *)0x0);
    }
  }
  uVar4 = 0;
LAB_0080d930:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

