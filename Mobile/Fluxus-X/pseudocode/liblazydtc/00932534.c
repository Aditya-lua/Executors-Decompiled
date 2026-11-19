/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932534
 */

void FUN_00932534(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  undefined1 *puVar7;
  ulong uVar8;
  undefined1 *puVar9;
  ulong uVar10;
  uint local_f4;
  undefined1 auStack_f0 [144];
  
  lVar3 = tpidr_el0;
  lVar5 = *(long *)(lVar3 + 0x28);
  if ((param_3 & 0xffffffffffffff01) == 1) {
    uVar8 = param_3 - 1 >> 1;
    if (uVar8 != 0) {
      puVar9 = auStack_f0;
      uVar10 = uVar8;
      do {
        uVar1 = uVar10;
        if (3 < uVar10) {
          uVar1 = 4;
        }
        uVar4 = FUN_00932448(param_1,&local_f4);
        if ((int)uVar4 != 0) goto LAB_0093260c;
        uVar2 = 0xfffffffffffffffb;
        if (0xfffffffffffffffb < ~uVar10) {
          uVar2 = ~uVar10;
        }
        lVar6 = uVar2 + 1;
        puVar7 = puVar9;
        do {
          *puVar7 = (char)local_f4;
          lVar6 = lVar6 + 1;
          uVar10 = uVar10 - 1;
          local_f4 = local_f4 >> 8;
          puVar7 = puVar7 + 1;
        } while (lVar6 != 0);
        puVar9 = puVar9 + uVar1;
      } while (uVar10 != 0);
      FUN_009159e4(auStack_f0,uVar8,param_2,param_3);
      uVar4 = 0;
      goto LAB_0093260c;
    }
  }
  uVar4 = 0x2b;
LAB_0093260c:
  if (*(long *)(lVar3 + 0x28) != lVar5) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

