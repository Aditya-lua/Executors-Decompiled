/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00950c14
 */

undefined8 FUN_00950c14(long param_1,int param_2)

{
  undefined1 *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 uVar4;
  long lVar5;
  long lVar6;
  
  lVar5 = *(long *)(param_1 + 0x20);
  lVar6 = lVar5 + 0x428;
  if (param_2 == 0x14b) {
    if (*(char *)(lVar5 + 0x536) == '\x03') {
      puVar1 = &DAT_002ab32c;
      if (*(undefined1 **)(lVar5 + 0x1d0) != (undefined1 *)0x0) {
        puVar1 = *(undefined1 **)(lVar5 + 0x1d0);
      }
      uVar2 = FUN_009453ec(param_1,lVar6,"PASS %s",puVar1);
      if ((int)uVar2 != 0) {
        return uVar2;
      }
      lVar6 = *(long *)(param_1 + 0x20);
      if ((((ulong)*(byte *)(lVar6 + 0x536) != 4) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0))
         && (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
             && (0 < DAT_00cc46c0)))) {
        if (lVar6 == 0) {
          puVar3 = &DAT_002c11b5;
        }
        else {
          puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
        }
        FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_002b389b);
      }
      uVar4 = 4;
      goto LAB_00951018;
    }
  }
  else {
    if (param_2 - 200U < 100) {
      if ((*(byte *)(lVar5 + 0x3a2) >> 3 & 1) == 0) {
        uVar2 = FUN_009453ec(param_1,lVar5 + 0x428,&DAT_002b6c62,&DAT_002ab717);
        if ((int)uVar2 != 0) {
          return uVar2;
        }
        lVar6 = *(long *)(param_1 + 0x20);
        if (((((ulong)*(byte *)(lVar6 + 0x536) != 9) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)
             ) && ((*(long *)(param_1 + 0x12a0) == 0 ||
                   (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) && (0 < DAT_00cc46c0)) {
          if (lVar6 == 0) {
            puVar3 = &DAT_002c11b5;
          }
          else {
            puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_002ab717);
        }
        uVar4 = 9;
      }
      else {
        uVar2 = FUN_009453ec(param_1,lVar5 + 0x428,"PBSZ %d",0);
        if ((int)uVar2 != 0) {
          return uVar2;
        }
        lVar6 = *(long *)(param_1 + 0x20);
        if (((((ulong)*(byte *)(lVar6 + 0x536) != 6) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)
             ) && ((*(long *)(param_1 + 0x12a0) == 0 ||
                   (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) && (0 < DAT_00cc46c0)) {
          if (lVar6 == 0) {
            puVar3 = &DAT_002c11b5;
          }
          else {
            puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_002c11be);
        }
        uVar4 = 6;
      }
      goto LAB_00951018;
    }
    if (param_2 == 0x14c) {
      if (*(long *)(param_1 + 0x848) == 0) {
        FUN_00904b80(param_1,"ACCT requested but none available");
        return 0x43;
      }
      uVar2 = FUN_009453ec(param_1,lVar6,"ACCT %s");
      if ((int)uVar2 != 0) {
        return uVar2;
      }
      lVar6 = *(long *)(param_1 + 0x20);
      if (((((ulong)*(byte *)(lVar6 + 0x536) != 5) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0))
          && ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
          ) && (0 < DAT_00cc46c0)) {
        if (lVar6 == 0) {
          puVar3 = &DAT_002c11b5;
        }
        else {
          puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
        }
        FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_002a54eb);
      }
      uVar4 = 5;
      goto LAB_00951018;
    }
  }
  if ((*(long *)(param_1 + 0x850) == 0) || ((*(byte *)(lVar5 + 0x53a) & 1) != 0)) {
    FUN_00904b80(param_1,"Access denied: %03d");
    return 0x43;
  }
  uVar2 = FUN_009453ec(param_1,lVar6,&DAT_002b6c62);
  if ((int)uVar2 != 0) {
    return uVar2;
  }
  *(byte *)(lVar5 + 0x53a) = *(byte *)(lVar5 + 0x53a) | 1;
  lVar6 = *(long *)(param_1 + 0x20);
  if (((((ulong)*(byte *)(lVar6 + 0x536) != 3) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46c0)) {
    if (lVar6 == 0) {
      puVar3 = &DAT_002c11b5;
    }
    else {
      puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
    }
    FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_002cd0c8);
  }
  uVar4 = 3;
LAB_00951018:
  *(undefined1 *)(lVar6 + 0x536) = uVar4;
  return 0;
}

