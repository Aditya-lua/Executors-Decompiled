/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00937978
 */

undefined8
FUN_00937978(long param_1,long param_2,int param_3,undefined8 param_4,long param_5,ulong param_6,
            ulong *param_7)

{
  char *pcVar1;
  ulong uVar2;
  ulong uVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  code *pcVar7;
  
  if ((*(byte *)(param_1 + 0x28) >> 1 & 1) != 0) {
    return 0x17;
  }
  if (param_3 == 2) {
    pcVar7 = *(code **)(param_2 + 0x230);
    plVar4 = (long *)(param_2 + 0x1e0);
    if (pcVar7 == (code *)0x0) {
      if (*plVar4 != 0) {
        pcVar7 = *(code **)(param_2 + 0x228);
        uVar6 = 0;
        if (pcVar7 == (code *)0x0) goto LAB_00937b14;
        goto LAB_009379d4;
      }
      goto LAB_00937b14;
    }
    uVar6 = 0;
  }
  else {
    if (param_3 != 1) goto LAB_00937b14;
    pcVar7 = *(code **)(param_2 + 0x228);
    plVar4 = (long *)(param_2 + 0x1d0);
    uVar6 = 0x4000;
  }
  if (pcVar7 != (code *)0x0) {
LAB_009379d4:
    lVar5 = *plVar4;
    *param_7 = 0;
    if (param_6 != 0) {
      pcVar1 = "body";
      if (param_3 != 1) {
        pcVar1 = "header";
      }
      do {
        if ((*(byte *)(param_1 + 0x28) & 1) != 0) {
          return 0;
        }
        uVar2 = uVar6;
        if (param_6 <= uVar6 - 1) {
          uVar2 = param_6;
        }
        FUN_0092f198(param_2,1);
        uVar3 = (*pcVar7)(param_5,1,uVar2,lVar5);
        FUN_0092f198(param_2,0);
        if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
           (((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))
            && (0 < DAT_00cc46b0)))) {
          FUN_009050ec(param_2,"cw_out, wrote %zu %s bytes -> %zu",uVar2,pcVar1,uVar3);
        }
        if (uVar3 == 0xffffffff) {
          FUN_00904b80(param_2,"client returned ERROR on write of %zu bytes",uVar2);
          return 0x17;
        }
        if (uVar3 == 0x10000001) {
          if ((*(long *)(param_2 + 0x20) != 0) &&
             ((*(byte *)(*(long *)(*(long *)(param_2 + 0x20) + 0x3a8) + 0x94) >> 4 & 1) != 0)) {
            FUN_00904b80(param_2,"Write callback asked for PAUSE when not supported");
            return 0x17;
          }
          *(uint *)(param_2 + 0x128) = *(uint *)(param_2 + 0x128) | 0x10;
          *(byte *)(param_1 + 0x28) = *(byte *)(param_1 + 0x28) | 1;
          if ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) {
            return 0;
          }
          if (*(long *)(param_2 + 0x12a0) == 0) {
            if (DAT_00cc46b0 < 1) {
              return 0;
            }
          }
          else {
            if (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1) {
              return 0;
            }
            if (DAT_00cc46b0 < 1) {
              return 0;
            }
          }
          FUN_009050ec(param_2,"cw_out, PAUSE requested by client");
          return 0;
        }
        if (uVar3 != uVar2) {
          FUN_00904b80(param_2,"Failure writing output to destination, passed %zu returned %zd",
                       uVar2,uVar3);
          return 0x17;
        }
        param_6 = param_6 - uVar2;
        param_5 = param_5 + uVar2;
        *param_7 = *param_7 + uVar2;
      } while (param_6 != 0);
    }
    return 0;
  }
LAB_00937b14:
  *param_7 = param_6;
  return 0;
}

