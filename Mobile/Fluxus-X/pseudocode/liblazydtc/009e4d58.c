/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e4d58
 */

/* WARNING: Removing unreachable block (ram,0x009e4dac) */

bool ssl_version_supported(int *param_1,int param_2,undefined8 *param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  undefined4 uVar5;
  undefined8 uVar6;
  int *piVar7;
  long lVar8;
  ulong uVar9;
  
  if (**(int **)(param_1 + 2) == 0x10000) {
    piVar7 = &DAT_00c58798;
    iVar4 = 0x304;
  }
  else {
    if (**(int **)(param_1 + 2) != 0x1ffff) {
      return *param_1 == param_2;
    }
    piVar7 = &DAT_00c58828;
    iVar4 = 0xfefd;
  }
  iVar2 = 0xff00;
  if (param_2 != 0x100) {
    iVar2 = param_2;
  }
  do {
    if (iVar4 == param_2) {
      if ((*(code **)(piVar7 + 2) != (code *)0x0) && (iVar4 == param_2)) {
        uVar6 = (**(code **)(piVar7 + 2))();
        iVar4 = FUN_009e4f38(param_1,uVar6);
        if (iVar4 == 0) {
          if ((param_2 != 0x304) || (param_1[0xe] == 0)) {
LAB_009e4f08:
            if (param_3 != (undefined8 *)0x0) {
              uVar6 = (**(code **)(piVar7 + 2))();
              *param_3 = uVar6;
            }
            return true;
          }
          if ((*(long *)(param_1 + 0x26a) != 0) && (*(long *)(param_1 + 0x2e2) != 0)) {
            if ((((*(long *)(*(long *)(param_1 + 0x26a) + 0x218) != 0) ||
                 (*(long *)(*(long *)(param_1 + 0x2e2) + 0x218) != 0)) ||
                (*(long *)(param_1 + 0x264) != 0)) ||
               ((*(long *)(param_1 + 0x266) != 0 ||
                (*(long *)(*(long *)(param_1 + 0x226) + 0x1b8) != 0)))) goto LAB_009e4f08;
            lVar8 = 0;
            uVar9 = 0;
            do {
              if ((6 < ((uint)uVar9 & 0x7fffffff)) ||
                 ((1 << (ulong)((uint)uVar9 & 0x1f) & 0x74U) == 0)) {
                lVar1 = *(long *)(param_1 + 0x226) + lVar8;
                if ((*(long *)(lVar1 + 0x20) != 0) && (*(long *)(lVar1 + 0x28) != 0)) {
                  if (uVar9 != 3) goto LAB_009e4f08;
                  uVar5 = ssl_get_EC_curve_nid(*(undefined8 *)(*(long *)(param_1 + 0x226) + 0xa0));
                  iVar4 = tls_check_sigalg_curve(param_1,uVar5);
                  if (iVar4 != 0) goto LAB_009e4f08;
                }
              }
              uVar9 = uVar9 + 1;
              lVar8 = lVar8 + 0x28;
            } while (uVar9 < 9);
          }
        }
      }
    }
    else if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      if (iVar4 <= param_2) {
        return false;
      }
    }
    else {
      iVar3 = 0xff00;
      if (iVar4 != 0x100) {
        iVar3 = iVar4;
      }
      if (iVar2 <= iVar3) {
        return false;
      }
    }
    piVar7 = piVar7 + 6;
    iVar4 = *piVar7;
    if (iVar4 == 0) {
      return false;
    }
  } while( true );
}

