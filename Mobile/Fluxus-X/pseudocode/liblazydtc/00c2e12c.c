/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2e12c
 */

undefined8 FUN_00c2e12c(undefined8 param_1,long param_2,long param_3,int *param_4)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  uint uVar4;
  
  iVar1 = *param_4;
  if (iVar1 < 5) {
    if (iVar1 == 1) {
      return 0;
    }
    if ((iVar1 == 2) || (iVar1 == 3)) {
      return *(undefined8 *)(*(long *)(param_4 + 2) + param_3);
    }
  }
  else {
    if (iVar1 == 5) {
      uVar4 = (uint)*(ulong *)(param_4 + 2);
      if ((int)uVar4 < 0x1e) {
        if (uVar4 == 0xfffffffe) {
LAB_00c2e268:
          return *(undefined8 *)(param_2 + 0xf8);
        }
        if (uVar4 == 0xffffffff) goto LAB_00c2e250;
        if (uVar4 == 0x1d) {
          return *(undefined8 *)(param_2 + 0xe8);
        }
      }
      else if ((int)uVar4 < 0x20) {
        if (uVar4 == 0x1e) {
          return *(undefined8 *)(param_2 + 0xf0);
        }
        if (uVar4 == 0x1f) goto LAB_00c2e268;
      }
      else {
        if (uVar4 == 0x22) {
          return *(undefined8 *)(param_2 + 0x108);
        }
        if (uVar4 == 0x20) {
LAB_00c2e250:
          return *(undefined8 *)(param_2 + 0x100);
        }
      }
      if (0x1c < uVar4) {
        fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getRegister",
                "unsupported arm64 register");
        fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
        abort();
      }
      return *(undefined8 *)(param_2 + (*(ulong *)(param_4 + 2) & 0x1f) * 8);
    }
    if (iVar1 == 6) {
      puVar3 = (undefined8 *)FUN_00c2e890(*(undefined8 *)(param_4 + 2),param_1,param_2,param_3);
      return *puVar3;
    }
    if (iVar1 == 7) {
      uVar2 = FUN_00c2e890(*(undefined8 *)(param_4 + 2),param_1,param_2,param_3);
      return uVar2;
    }
  }
  fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSavedRegister",
          "unsupported restore location for register");
  fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
  abort();
}

