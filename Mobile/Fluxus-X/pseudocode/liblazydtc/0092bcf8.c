/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092bcf8
 */

void FUN_0092bcf8(long param_1,long param_2)

{
  ulong uVar1;
  undefined1 *puVar2;
  
  FUN_00908420();
  if (*(long *)(param_1 + 0x20) != 0) {
    switch(*(undefined4 *)(param_1 + 0x58)) {
    case 0:
    case 1:
    case 2:
    case 3:
    case 0xe:
    case 0xf:
    case 0x10:
    case 0x11:
      goto switchD_0092bd34_caseD_0;
    case 4:
      FUN_00908518(param_1,param_2,&LAB_00918210);
      return;
    case 5:
    case 6:
      puVar2 = &LAB_0092f550;
      break;
    case 7:
    case 8:
      puVar2 = &LAB_0092f594;
      break;
    case 9:
    case 10:
      puVar2 = &LAB_0092f5f8;
      break;
    case 0xb:
      puVar2 = &LAB_0092f640;
      break;
    case 0xc:
    case 0xd:
      puVar2 = &LAB_0092f688;
      break;
    default:
      FUN_00904b80(param_1,"multi_getsock: unexpected multi state %d");
      return;
    }
    FUN_00908518(param_1,param_2,puVar2);
    FUN_00907984(param_1,param_2);
    if ((((*(int *)(param_2 + 0x14) == 0) && ((*(byte *)(param_1 + 0x128) & 0x30) == 0)) &&
        (uVar1 = FUN_009077ec(param_1,0), (uVar1 & 1) != 0)) &&
       (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0 &&
        ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))))) {
      FUN_00904c98(param_1,"WARNING: no socket in pollset, transfer may stall!");
      return;
    }
  }
switchD_0092bd34_caseD_0:
  return;
}

