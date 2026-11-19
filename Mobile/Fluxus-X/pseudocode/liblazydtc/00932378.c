/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932378
 */

void FUN_00932378(undefined8 param_1,undefined1 *param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 *puVar6;
  uint local_5c;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  if (param_3 == 0) {
    uVar4 = 0x2b;
  }
  else {
    do {
      uVar1 = param_3;
      if (3 < param_3) {
        uVar1 = 4;
      }
      uVar4 = FUN_00932448(param_1,&local_5c);
      if ((int)uVar4 != 0) goto LAB_00932418;
      uVar2 = 0xfffffffffffffffb;
      if (0xfffffffffffffffb < ~param_3) {
        uVar2 = ~param_3;
      }
      lVar5 = uVar2 + 1;
      puVar6 = param_2;
      do {
        *puVar6 = (char)local_5c;
        lVar5 = lVar5 + 1;
        param_3 = param_3 - 1;
        local_5c = local_5c >> 8;
        puVar6 = puVar6 + 1;
      } while (lVar5 != 0);
      param_2 = param_2 + uVar1;
    } while (param_3 != 0);
    uVar4 = 0;
  }
LAB_00932418:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

