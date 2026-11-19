/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092e5b0
 */

/* WARNING: Removing unreachable block (ram,0x0092e88c) */
/* WARNING: Removing unreachable block (ram,0x0092e8a0) */
/* WARNING: Removing unreachable block (ram,0x0092e858) */
/* WARNING: Removing unreachable block (ram,0x0092e7d0) */
/* WARNING: Removing unreachable block (ram,0x0092e704) */
/* WARNING: Removing unreachable block (ram,0x0092e79c) */
/* WARNING: Removing unreachable block (ram,0x0092e768) */
/* WARNING: Removing unreachable block (ram,0x0092e950) */
/* WARNING: Removing unreachable block (ram,0x0092e91c) */
/* WARNING: Removing unreachable block (ram,0x0092e684) */
/* WARNING: Removing unreachable block (ram,0x0092e8e0) */
/* WARNING: Removing unreachable block (ram,0x0092e810) */
/* WARNING: Heritage AFTER dead removal. Example location: s0xffffffffffffff98 : 0x0092e710 */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

undefined8 curl_multi_setopt(int *param_1,int param_2,undefined8 param_3)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  ulong local_68;
  undefined8 local_60;
  
  lVar2 = tpidr_el0;
  lVar3 = *(long *)(lVar2 + 0x28);
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    uVar4 = 1;
    goto switchD_0092e668_caseD_271b;
  }
  if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) != 0) {
    uVar4 = 8;
    goto switchD_0092e668_caseD_271b;
  }
  uVar4 = 0;
  if (param_2 < 0x2712) {
    switch(param_2) {
    case 3:
      uVar4 = 0;
      *(byte *)((long)param_1 + 0x231) =
           *(byte *)((long)param_1 + 0x231) & 0xfe | (byte)((uint)local_68 >> 1) & 1;
      break;
    default:
      goto switchD_0092e668_caseD_2713;
    case 6:
      uVar4 = 0;
      if (local_68 >> 0x20 == 0) {
        uVar4 = 0;
        param_1[0x8b] = (uint)local_68;
      }
      break;
    case 7:
      uVar4 = 0;
      *(ulong *)(param_1 + 0x7a) = local_68;
      break;
    case 8:
      break;
    case 0xd:
      *(undefined8 *)(param_1 + 0x7c) = param_3;
      uVar4 = 0;
      *(undefined8 *)(param_1 + 0x7e) = local_60;
      break;
    case 0x10:
      uVar4 = 0;
      uVar1 = 100;
      if (local_68 - 1 < 0x7fffffff) {
        uVar1 = (uint)local_68;
      }
      param_1[0x8a] = uVar1;
    }
    goto switchD_0092e668_caseD_271b;
  }
  if (0x4e23 < param_2) {
    if (param_2 - 0x7539U < 2) goto switchD_0092e668_caseD_271b;
    if (param_2 == 0x4e24) {
      uVar4 = 0;
      *(ulong *)(param_1 + 0x80) = local_68;
      goto switchD_0092e668_caseD_271b;
    }
    if (param_2 == 0x4e2e) {
      uVar4 = 0;
      *(ulong *)(param_1 + 0x24) = local_68;
      goto switchD_0092e668_caseD_271b;
    }
    goto switchD_0092e668_caseD_2713;
  }
  switch(param_2) {
  case 0x2712:
    uVar4 = 0;
    *(ulong *)(param_1 + 0x22) = local_68;
    break;
  case 0x2715:
    uVar4 = 0;
    *(ulong *)(param_1 + 0x82) = local_68;
    break;
  case 0x271b:
  case 0x271c:
    break;
  case 0x271f:
    uVar4 = 0;
    *(ulong *)(param_1 + 0x26) = local_68;
    break;
  default:
    if (param_2 == 0x4e21) {
      uVar4 = 0;
      *(ulong *)(param_1 + 0x20) = local_68;
      break;
    }
  case 0x2713:
  case 0x2714:
  case 0x2716:
  case 0x2717:
  case 0x2718:
  case 0x2719:
  case 0x271a:
  case 0x271d:
  case 0x271e:
switchD_0092e668_caseD_2713:
    uVar4 = 6;
  }
switchD_0092e668_caseD_271b:
  if (*(long *)(lVar2 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

