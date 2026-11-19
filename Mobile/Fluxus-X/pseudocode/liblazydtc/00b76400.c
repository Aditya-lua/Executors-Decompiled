/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b76400
 */

int FUN_00b76400(long param_1)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  int *piVar5;
  long local_d0;
  undefined1 auStack_c8 [128];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (*(int *)(param_1 + 0x1c) == 0) {
    iVar3 = -0x40;
  }
  else {
    if (*(int *)(param_1 + 0x1c) < 1) {
      iVar3 = -0x3d;
    }
    else {
      uVar4 = 0;
      bVar2 = false;
      piVar5 = (int *)(param_1 + 0x40);
      do {
        local_d0 = 0;
        if (*piVar5 == 1) {
          bVar2 = true;
        }
        iVar3 = (**(code **)(piVar5 + -8))(*(undefined8 *)(piVar5 + -6),auStack_c8,0x80,&local_d0);
        if (iVar3 != 0) goto LAB_00b764d0;
        if (local_d0 != 0) {
          iVar3 = FUN_00b762e0(param_1,uVar4 & 0xffffffff,auStack_c8);
          if (iVar3 != 0) goto LAB_00b764dc;
          *(long *)(piVar5 + -4) = *(long *)(piVar5 + -4) + local_d0;
        }
        uVar4 = uVar4 + 1;
        piVar5 = piVar5 + 10;
      } while ((long)uVar4 < (long)*(int *)(param_1 + 0x1c));
      iVar3 = -0x3d;
      if (bVar2) {
        iVar3 = 0;
      }
    }
LAB_00b764d0:
    mbedtls_platform_zeroize(auStack_c8,0x80);
  }
LAB_00b764dc:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

