/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f178
 */

/* WARNING: Removing unreachable block (ram,0x0093f3c4) */
/* WARNING: Removing unreachable block (ram,0x0093f2dc) */
/* WARNING: Removing unreachable block (ram,0x0093f344) */
/* WARNING: Removing unreachable block (ram,0x0093f268) */
/* WARNING: Removing unreachable block (ram,0x0093f310) */
/* WARNING: Heritage AFTER dead removal. Example location: s0xffffffffffffff78 : 0x0093f274 */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

void curl_share_setopt(int *param_1,undefined4 param_2)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  undefined8 local_88;
  
  lVar1 = tpidr_el0;
  lVar5 = *(long *)(lVar1 + 0x28);
  if ((param_1 == (int *)0x0) || (*param_1 != 0x7e117a1e)) {
    uVar3 = 3;
    goto switchD_0093f388_caseD_3;
  }
  if (param_1[2] != 0) {
    uVar3 = 2;
    goto switchD_0093f388_caseD_3;
  }
  switch(param_2) {
  case 1:
    uVar3 = 5;
    switch((uint)local_88) {
    case 2:
      if (*(long *)(param_1 + 0x3a) == 0) {
        lVar4 = FUN_00912ca4(0,0,0,1);
        *(long *)(param_1 + 0x3a) = lVar4;
joined_r0x0093f47c:
        if (lVar4 == 0) goto LAB_0093f464;
      }
      break;
    case 3:
      break;
    case 4:
      if (*(long *)(param_1 + 0x3e) == 0) {
        param_1[0x40] = 8;
        param_1[0x41] = 0;
        lVar4 = (*(code *)PTR_calloc_00cc4690)(8,200);
        *(long *)(param_1 + 0x3e) = lVar4;
        param_1[0x42] = 0;
        param_1[0x43] = 0;
        goto joined_r0x0093f47c;
      }
      break;
    case 5:
      iVar2 = FUN_0090fae0(param_1 + 10,0,0x67);
      if (iVar2 != 0) {
LAB_0093f464:
        uVar3 = 4;
        goto switchD_0093f388_caseD_3;
      }
      break;
    case 6:
      goto switchD_0093f388_caseD_3;
    case 7:
      if (*(long *)(param_1 + 0x3c) == 0) {
        lVar4 = FUN_00918354(5);
        *(long *)(param_1 + 0x3c) = lVar4;
        goto joined_r0x0093f47c;
      }
      break;
    default:
      goto switchD_0093f24c_default;
    }
    uVar3 = 0;
    param_1[1] = param_1[1] | 1 << (ulong)((uint)local_88 & 0x1f);
    break;
  case 2:
    param_1[1] = param_1[1] & (1 << (ulong)((uint)local_88 & 0x1f) ^ 0xffffffffU);
    uVar3 = 0;
    switch((uint)local_88) {
    case 2:
      uVar3 = 0;
      if (*(long *)(param_1 + 0x3a) != 0) {
        FUN_00914d68();
        uVar3 = 0;
        param_1[0x3a] = 0;
        param_1[0x3b] = 0;
      }
      break;
    case 3:
    case 5:
      break;
    case 4:
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x3e));
      uVar3 = 0;
      param_1[0x3e] = 0;
      param_1[0x3f] = 0;
      break;
    default:
      goto switchD_0093f24c_default;
    case 7:
      if (*(long *)(param_1 + 0x3c) == 0) {
        uVar3 = 0;
      }
      else {
        FUN_0091839c(param_1 + 0x3c);
        uVar3 = 0;
      }
    }
    break;
  case 3:
    uVar3 = 0;
    *(undefined8 *)(param_1 + 4) = local_88;
    break;
  case 4:
    uVar3 = 0;
    *(undefined8 *)(param_1 + 6) = local_88;
    break;
  case 5:
    uVar3 = 0;
    *(undefined8 *)(param_1 + 8) = local_88;
    break;
  default:
switchD_0093f24c_default:
    uVar3 = 1;
  }
switchD_0093f388_caseD_3:
  if (*(long *)(lVar1 + 0x28) != lVar5) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

