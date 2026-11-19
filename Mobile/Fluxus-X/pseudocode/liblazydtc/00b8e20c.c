/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8e20c
 */

undefined8 FUN_00b8e20c(uint *param_1,ushort param_2,short param_3,char *param_4,long param_5)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 uVar7;
  
  lVar4 = tpidr_el0;
  lVar6 = *(long *)(lVar4 + 0x28);
  uVar3 = *param_1;
  uVar1 = (uint)param_2;
  uVar2 = uVar3 & 0xfe00ffff | 0x8000000;
  if ((uVar3 & 0x7f000000) != 0x9000000) {
    uVar2 = uVar3;
  }
  if (uVar1 < 0x201) {
    if (uVar1 == 0x101) {
LAB_00b8e2ac:
      if (param_3 == 0) goto LAB_00b8e2d8;
    }
    else {
      if (uVar1 != 0x102) {
        if (uVar1 != 0x103) goto LAB_00b8e774;
        goto LAB_00b8e2ac;
      }
      if ((param_3 == 0) || (param_3 == 0x1203)) goto LAB_00b8e2d8;
    }
    if (param_3 == 0x1200) goto LAB_00b8e2d8;
  }
  else if ((uVar1 - 0x201 < 4) && ((param_3 == 0 || (param_3 == 0x1001)))) {
LAB_00b8e2d8:
    uVar1 = (uVar2 & 0xffffff00) + 0xf7ffff00 >> 8;
    if (uVar1 < 5) {
                    /* WARNING: Jumptable with 0 entries at 0x00b8e304 */
                    /* WARNING: Treating indirect jump as call */
      uVar5 = (*(code *)(&DAT_007807f4 + *(int *)(&DAT_007807f4 + (ulong)uVar1 * 4)))();
      return uVar5;
    }
    if (uVar2 != 0x8000609) {
      uVar5 = 0xffffff77;
      goto LAB_00b8e77c;
    }
    if (((param_2 == 0x101) && (param_5 == 0x41)) && (*param_4 == '\x04')) {
      uVar7 = *(undefined8 *)(param_4 + 0x11);
      uVar5 = 0;
      *(undefined8 *)(param_1 + 10) = *(undefined8 *)(param_4 + 0x19);
      *(undefined8 *)(param_1 + 8) = uVar7;
      uVar7 = *(undefined8 *)(param_4 + 1);
      *(undefined8 *)(param_1 + 6) = *(undefined8 *)(param_4 + 9);
      *(undefined8 *)(param_1 + 4) = uVar7;
      goto LAB_00b8e77c;
    }
  }
LAB_00b8e774:
  uVar5 = 0xffffff79;
  psa_key_derivation_abort(param_1);
LAB_00b8e77c:
  if (*(long *)(lVar4 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar5;
}

