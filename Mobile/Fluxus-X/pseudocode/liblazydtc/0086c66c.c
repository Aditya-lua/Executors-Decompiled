/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086c66c
 */

void FUN_0086c66c(long param_1)

{
  int iVar1;
  char cVar2;
  long lVar3;
  undefined8 uVar4;
  char *pcVar5;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  iVar1 = *(int *)(param_1 + 0x90);
  uStack_48 = *(undefined8 *)(param_1 + 0x9c);
  local_50 = *(undefined8 *)(param_1 + 0x94);
  switch(iVar1) {
  case 0x106:
    cVar2 = *(char *)(*(long *)(param_1 + 0x160) + -8);
    FUN_00858f2c();
    if (cVar2 != '\x01') {
      pcVar5 = "Cannot use \'...\' outside of a vararg function";
      goto LAB_0086c8dc;
    }
    param_1 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    FUN_0084ed88(param_1,&local_50);
    break;
  case 0x107:
  case 0x108:
  case 0x109:
  case 0x10b:
  case 0x10c:
  case 0x10e:
  case 0x10f:
  case 0x110:
  case 0x111:
  case 0x112:
  case 0x113:
  case 0x114:
  case 0x115:
  case 0x119:
  case 0x11a:
  case 0x11b:
  case 0x11f:
  case 0x120:
  case 0x122:
  case 0x123:
  case 0x124:
  case 0x125:
  case 0x126:
  case 0x127:
  case 0x128:
  case 0x12a:
  case 0x12d:
  case 0x12e:
  case 0x130:
  case 0x131:
  case 0x132:
  case 0x133:
  case 0x134:
    goto switchD_0086c6bc_caseD_107;
  case 0x10a:
    if (*(long *)(lVar3 + 0x28) == local_38) {
      FUN_00869ecc();
      return;
    }
    goto LAB_0086c910;
  case 0x10d:
  case 0x116:
  case 0x117:
    if (*(long *)(lVar3 + 0x28) == local_38) {
      FUN_0086d048();
      return;
    }
    goto LAB_0086c910;
  case 0x118:
    if (*(long *)(lVar3 + 0x28) == local_38) {
      FUN_0086cb0c();
      return;
    }
    goto LAB_0086c910;
  case 0x11c:
  case 0x11d:
    param_1 = FUN_0086c914(param_1,&local_50);
    break;
  case 0x11e:
    FUN_00858f2c();
    pcVar5 = "Malformed string; did you forget to finish it?";
    goto LAB_0086c8dc;
  case 0x121:
    FUN_00858f2c();
    pcVar5 = "Double braces are not permitted within interpolated strings; did you mean \'\\{\'?";
LAB_0086c8dc:
    uStack_68 = 0;
    local_70 = 0;
    param_1 = FUN_008659e8(param_1,&local_50,&local_70,pcVar5);
    break;
  case 0x129:
    FUN_00858f2c();
    param_1 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    uVar4 = 0;
    goto LAB_0086c814;
  case 299:
    uStack_68 = *(undefined8 *)(param_1 + 0x98);
    local_70 = *(undefined8 *)(param_1 + 0x90);
    uStack_58 = *(undefined8 *)(param_1 + 0xa8);
    uStack_60 = *(undefined8 *)(param_1 + 0xa0);
    FUN_00858f2c();
    local_80 = 0;
    uStack_78 = 0;
    local_88 = 0;
    param_1 = FUN_00863248(param_1,0,&local_70,&uStack_78,0,&local_88,0,0);
    break;
  case 300:
    if (*(long *)(lVar3 + 0x28) == local_38) {
      FUN_0086d8c0();
      return;
    }
    goto LAB_0086c910;
  case 0x12f:
    FUN_00858f2c();
    param_1 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    FUN_0084ebb0(param_1,&local_50);
    break;
  case 0x135:
    FUN_00858f2c();
    param_1 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    uVar4 = 1;
LAB_0086c814:
    FUN_0084ebf8(param_1,&local_50,uVar4);
    break;
  default:
    if (iVar1 == 0x7b) {
      if (*(long *)(lVar3 + 0x28) == local_38) {
        FUN_0086d1b8();
        return;
      }
      goto LAB_0086c910;
    }
    goto switchD_0086c6bc_caseD_107;
  }
  if (*(long *)(lVar3 + 0x28) == local_38) {
    return;
  }
LAB_0086c910:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(param_1);
switchD_0086c6bc_caseD_107:
  if (*(long *)(lVar3 + 0x28) == local_38) {
    FUN_0085cb14(param_1,0);
    return;
  }
  goto LAB_0086c910;
}

