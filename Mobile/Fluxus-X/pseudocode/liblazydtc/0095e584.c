/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095e584
 */

void FUN_0095e584(long param_1,int param_2,byte *param_3,ulong param_4)

{
  bool bVar1;
  long *plVar2;
  byte bVar3;
  byte bVar4;
  char *pcVar5;
  undefined *puVar6;
  ulong uVar7;
  uint uVar8;
  uint uVar9;
  ulong uVar10;
  uint uVar11;
  ulong uVar12;
  
  if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) {
    return;
  }
  plVar2 = (long *)(param_1 + 0x12a0);
  if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
    puVar6 = &DAT_002ad459;
    if (param_2 != 0x3c) {
      puVar6 = &DAT_002cf34b;
    }
    FUN_00904c98(param_1,"%s IAC SB ",puVar6);
  }
  uVar12 = param_4 - 2;
  if (param_4 < 3) {
    uVar10 = 0;
    if (uVar12 == 0) {
      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) {
        return;
      }
      if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
        FUN_00904c98(param_1,"(Empty suboption?)");
        return;
      }
      return;
    }
  }
  else {
    bVar3 = param_3[uVar12];
    uVar10 = (ulong)bVar3;
    bVar4 = param_3[param_4 - 1];
    uVar11 = (uint)bVar4;
    if ((bVar3 == 0xff) && (uVar11 == 0xf0)) {
      uVar10 = 0xff;
    }
    else {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
        FUN_00904c98(param_1,"(terminated by ");
      }
      uVar9 = (uint)bVar3;
      if (bVar3 < 0x28) {
        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) ||
           ((*plVar2 != 0 && (*(int *)(*plVar2 + 8) < 1)))) goto LAB_0095e76c;
        puVar6 = (&PTR_s_BINARY_00c51188)[uVar10];
LAB_0095e724:
        FUN_00904c98(param_1,&DAT_002ab558,puVar6);
        if (uVar11 < 0x28) goto LAB_0095e774;
LAB_0095e7a0:
        uVar9 = (uint)*(undefined8 *)(param_1 + 0xa82);
        if (uVar11 < 0xec) {
          if (((uVar9 >> 0x1c & 1) != 0) && ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
            FUN_00904c98(param_1,&DAT_002c6d41,(ulong)bVar4);
          }
          goto LAB_0095e818;
        }
        if (((uVar9 >> 0x1c & 1) == 0) || ((*plVar2 != 0 && (*(int *)(*plVar2 + 8) < 1))))
        goto LAB_0095e818;
        puVar6 = (&PTR_DAT_00c510e8)[(int)(uVar11 - 0xec)];
LAB_0095e7d0:
        FUN_00904c98(param_1,&DAT_002b6c62,puVar6);
        bVar3 = *(byte *)(param_1 + 0xa85);
      }
      else {
        uVar8 = (uint)*(undefined8 *)(param_1 + 0xa82);
        if (uVar9 < 0xec) {
          if (((uVar8 >> 0x1c & 1) != 0) && ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
            FUN_00904c98(param_1,&DAT_002c12d9,uVar9);
          }
        }
        else if (((uVar8 >> 0x1c & 1) != 0) && ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
          puVar6 = (&PTR_DAT_00c510e8)[uVar9 - 0xec];
          goto LAB_0095e724;
        }
LAB_0095e76c:
        if (0x27 < uVar11) goto LAB_0095e7a0;
LAB_0095e774:
        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
           ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
          puVar6 = (&PTR_s_BINARY_00c51188)[bVar4];
          goto LAB_0095e7d0;
        }
LAB_0095e818:
        bVar3 = *(byte *)(param_1 + 0xa85);
      }
      if (((bVar3 >> 4 & 1) != 0) && ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
        FUN_00904c98(param_1,", not IAC SE) ");
      }
    }
  }
  uVar7 = (ulong)*param_3;
  if (uVar7 < 0x28) {
    if ((*param_3 < 0x28) && ((1L << (uVar7 & 0x3f) & 0x8881000000U) != 0)) {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
        puVar6 = (&PTR_s_BINARY_00c51188)[uVar7];
        pcVar5 = "%s";
LAB_0095e8a0:
        FUN_00904c98(param_1,pcVar5,puVar6);
      }
    }
    else if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
            ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
      puVar6 = (&PTR_s_BINARY_00c51188)[uVar7];
      pcVar5 = "%s (unsupported)";
      goto LAB_0095e8a0;
    }
  }
  else if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
          ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
    FUN_00904c98(param_1,"%d (unknown)",param_3[uVar10]);
  }
  bVar3 = *param_3;
  if (bVar3 == 0x1f) {
    if (uVar12 < 5) {
      return;
    }
    if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) {
      return;
    }
    if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
      FUN_00904c98(param_1,"Width: %d ; Height: %d",CONCAT11(param_3[1],param_3[2]),
                   CONCAT11(param_3[3],param_3[4]));
      return;
    }
    return;
  }
  switch(param_3[1]) {
  case 0:
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
      pcVar5 = " IS";
LAB_0095ea14:
      FUN_00904c98(param_1,pcVar5);
    }
    break;
  case 1:
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
      pcVar5 = " SEND";
      goto LAB_0095ea14;
    }
    break;
  case 2:
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
      pcVar5 = " INFO/REPLY";
      goto LAB_0095ea14;
    }
    break;
  case 3:
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
      pcVar5 = " NAME";
      goto LAB_0095ea14;
    }
    break;
  default:
    goto switchD_0095e974_default;
  }
  bVar3 = *param_3;
switchD_0095e974_default:
  if ((bVar3 == 0x18) || (bVar3 == 0x23)) {
    param_3[uVar12] = 0;
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
      FUN_00904c98(param_1," \"%s\"",param_3 + 2);
      return;
    }
  }
  else if (bVar3 == 0x27) {
    if (param_3[1] == 0) {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
        FUN_00904c98(param_1,&DAT_002a19a2);
      }
      if (3 < uVar12) {
        uVar10 = 3;
        uVar7 = 4;
        do {
          if (param_3[uVar10] == 1) {
            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
               ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
              FUN_00904c98(param_1,&DAT_002baea0);
            }
          }
          else if (param_3[uVar10] == 0) {
            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
               ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
              FUN_00904c98(param_1,&DAT_002a715d);
            }
          }
          else if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                  ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
            FUN_00904c98(param_1,&DAT_002c2dc2);
          }
          bVar1 = uVar7 < uVar12;
          uVar10 = uVar7;
          uVar7 = (ulong)((int)uVar7 + 1);
        } while (bVar1);
      }
    }
  }
  else if (2 < uVar12) {
    uVar10 = 2;
    uVar7 = 3;
    do {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
        FUN_00904c98(param_1," %.2x",param_3[uVar10]);
      }
      bVar1 = uVar7 < uVar12;
      uVar10 = uVar7;
      uVar7 = (ulong)((int)uVar7 + 1);
    } while (bVar1);
  }
  return;
}

