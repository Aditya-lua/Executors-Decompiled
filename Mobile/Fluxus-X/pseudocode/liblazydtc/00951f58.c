/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00951f58
 */

undefined8 FUN_00951f58(long param_1,long param_2)

{
  undefined8 uVar1;
  undefined *puVar2;
  long lVar3;
  undefined1 uVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  
  lVar6 = *(long *)(param_1 + 0x1a0);
  lVar7 = *(long *)(param_1 + 0x20);
  if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46c0)) {
    if (lVar7 == 0) {
      puVar2 = &DAT_002c11b5;
    }
    else {
      puVar2 = (&PTR_DAT_00c508c0)[*(byte *)(lVar7 + 0x536)];
    }
    FUN_00905258(param_1,"[%s] ftp_state_retr()",puVar2);
  }
  if ((*(long *)(param_1 + 0x708) != 0) && (*(long *)(param_1 + 0x708) < param_2)) {
    FUN_00904b80(param_1,"Maximum file size exceeded");
    return 0x3f;
  }
  *(long *)(lVar6 + 0x18) = param_2;
  lVar3 = *(long *)(param_1 + 0x1118);
  if (lVar3 == 0) {
    uVar1 = FUN_009453ec(param_1,lVar7 + 0x428,"RETR %s",*(undefined8 *)(lVar7 + 0x4e0));
    if ((int)uVar1 != 0) {
      return uVar1;
    }
    lVar6 = *(long *)(param_1 + 0x20);
    if ((((param_1 != 0) && (*(byte *)(lVar6 + 0x536) != 0x20)) &&
        ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
       (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
        (0 < DAT_00cc46c0)))) {
      if (lVar6 == 0) {
        puVar2 = &DAT_002c11b5;
      }
      else {
        puVar2 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar2,&DAT_002b54e5);
    }
    uVar4 = 0x20;
    goto LAB_0095230c;
  }
  if (param_2 == -1) {
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"ftp server does not support SIZE");
      lVar5 = *(long *)(lVar6 + 0x18);
      goto joined_r0x0095204c;
    }
  }
  else {
    if (lVar3 < 0) {
      lVar5 = -lVar3;
      if (-param_2 != lVar3 && param_2 <= lVar5) goto LAB_00952190;
      *(long *)(lVar6 + 0x18) = lVar5;
      *(long *)(param_1 + 0x1118) = lVar3 + param_2;
    }
    else {
      if (param_2 < lVar3) {
LAB_00952190:
        FUN_00904b80(param_1,"Offset (%ld) was beyond file size (%ld)",lVar3,param_2);
        return 0x24;
      }
      lVar5 = param_2 - lVar3;
      *(long *)(lVar6 + 0x18) = lVar5;
    }
joined_r0x0095204c:
    if (lVar5 == 0) {
      FUN_00943194(param_1);
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"File already completely downloaded");
      }
      *(undefined4 *)(lVar6 + 0x10) = 2;
      lVar6 = *(long *)(param_1 + 0x20);
      if (((((param_1 != 0) && (*(byte *)(lVar6 + 0x536) != 0)) &&
           ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
          ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
         && (0 < DAT_00cc46c0)) {
        if (lVar6 == 0) {
          puVar2 = &DAT_002c11b5;
        }
        else {
          puVar2 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
        }
        FUN_00905258(param_1,"[%s] -> [%s]",puVar2,&DAT_002c11b9);
      }
      *(undefined1 *)(lVar6 + 0x536) = 0;
      return 0;
    }
  }
  if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
     ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    FUN_00904c98(param_1,"Instructs server to resume from offset %ld",
                 *(undefined8 *)(param_1 + 0x1118));
  }
  uVar1 = FUN_009453ec(param_1,lVar7 + 0x428,"REST %ld",*(undefined8 *)(param_1 + 0x1118));
  if ((int)uVar1 != 0) {
    return uVar1;
  }
  lVar6 = *(long *)(param_1 + 0x20);
  if (((((param_1 != 0) && (*(byte *)(lVar6 + 0x536) != 0x1b)) &&
       ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46c0)) {
    if (lVar6 == 0) {
      puVar2 = &DAT_002c11b5;
    }
    else {
      puVar2 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
    }
    FUN_00905258(param_1,"[%s] -> [%s]",puVar2,"RETR_REST");
  }
  uVar4 = 0x1b;
LAB_0095230c:
  *(undefined1 *)(lVar6 + 0x536) = uVar4;
  return 0;
}

