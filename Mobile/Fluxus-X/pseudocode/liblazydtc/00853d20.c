/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00853d20
 */

void FUN_00853d20(long *param_1,long *param_2)

{
  long lVar1;
  byte bVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  bool bVar6;
  int iVar7;
  uint uVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  undefined4 local_d4;
  long local_d0;
  long lStack_c8;
  long local_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long local_98;
  long lStack_90;
  long local_88;
  long lStack_80;
  long local_78;
  
  lVar4 = tpidr_el0;
  local_78 = *(long *)(lVar4 + 0x28);
  lStack_b8 = param_2[5];
  local_c0 = param_2[4];
  lStack_a8 = param_2[7];
  lStack_b0 = param_2[6];
  lVar14 = param_2[2];
  lVar5 = param_2[3];
  lStack_c8 = param_2[9];
  local_d0 = param_2[8];
  lVar3 = param_2[0xd] - param_2[0xc];
  if (lVar3 == 0) {
    local_d4 = 1;
  }
  else {
    local_d4 = *(undefined4 *)(param_2[0xd] + -4);
  }
  uVar10 = lVar3 >> 2;
  lVar3 = param_2[0xb];
  bVar6 = true;
  do {
    uVar8 = *(uint *)(param_2 + 2);
    uVar9 = (ulong)uVar8;
    if (uVar9 < (ulong)param_2[1]) {
      iVar7 = *(int *)((long)param_2 + 0x14);
      do {
        uVar8 = uVar8 + 1;
        bVar2 = *(byte *)(*param_2 + uVar9);
        if (0x20 < bVar2) break;
        if ((1L << ((ulong)bVar2 & 0x3f) & 0x100003a00U) == 0) {
          if ((ulong)bVar2 != 10) break;
          iVar7 = iVar7 + 1;
          *(int *)((long)param_2 + 0x14) = iVar7;
          *(uint *)(param_2 + 3) = uVar8;
        }
        uVar9 = (ulong)uVar8;
        *(uint *)(param_2 + 2) = uVar8;
      } while (uVar9 < (ulong)param_2[1]);
    }
    if (bVar6) {
      param_2[9] = *(long *)((long)param_2 + 0x2c);
      param_2[8] = *(long *)((long)param_2 + 0x24);
    }
    FUN_00853648(&local_98,param_2);
    param_2[5] = lStack_90;
    param_2[4] = local_98;
    param_2[7] = lStack_80;
    param_2[6] = local_88;
    if (((char)lVar3 == '\0') || (bVar6 = false, (*(uint *)(param_2 + 4) & 0xfffffffe) != 0x11a)) {
      lVar3 = param_2[0xc];
      lVar1 = param_2[0xd];
      lVar11 = param_2[4];
      lVar13 = param_2[7];
      lVar12 = param_2[6];
      *(int *)(param_2 + 3) = (int)lVar5;
      param_2[2] = lVar14;
      param_2[9] = lStack_c8;
      param_2[8] = local_d0;
      param_1[1] = param_2[5];
      *param_1 = lVar11;
      param_1[3] = lVar13;
      param_1[2] = lVar12;
      uVar9 = lVar1 - lVar3 >> 2;
      param_2[5] = lStack_b8;
      param_2[4] = local_c0;
      param_2[7] = lStack_a8;
      param_2[6] = lStack_b0;
      if (uVar9 < uVar10) {
        FUN_00853edc(param_2 + 0xc,&local_d4);
      }
      else if (uVar9 != uVar10) {
        param_2[0xd] = lVar1 + -4;
      }
      if (*(long *)(lVar4 + 0x28) != local_78) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  } while( true );
}

