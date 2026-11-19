/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090bc8c
 */

void FUN_0090bc8c(long *param_1,long param_2,undefined8 *param_3)

{
  undefined4 uVar1;
  char *pcVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined4 *puVar6;
  undefined1 auVar7 [16];
  
  puVar6 = (undefined4 *)param_1[2];
  if ((undefined8 *)(puVar6 + 10) != param_3) {
    plVar4 = (long *)(puVar6 + 0xc);
    if (*plVar4 != 0) {
      FUN_009074b4(*plVar4,param_2);
      FUN_00906ef0(plVar4,param_2);
      *plVar4 = 0;
    }
    puVar6[0xe] = 0;
    puVar6[0x14] = 0xffffffff;
  }
  if ((undefined8 *)(puVar6 + 0x16) != param_3) {
    plVar4 = (long *)(puVar6 + 0x18);
    if (*plVar4 != 0) {
      FUN_009074b4(*plVar4,param_2);
      FUN_00906ef0(plVar4,param_2);
      *plVar4 = 0;
    }
    puVar6[0x1a] = 0;
    puVar6[0x20] = 0xffffffff;
  }
  if ((((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) &&
     (0 < *(int *)(*param_1 + 0xc))) {
    uVar5 = *param_3;
    auVar7 = FUN_00941cb8();
    uVar1 = FUN_00941d54(auVar7._0_8_,auVar7._8_8_,param_3[3],param_3[4]);
    iVar3 = *(int *)(param_3 + 5);
    if (iVar3 < 0) {
      (**(code **)(*(long *)param_3[1] + 0x70))((long *)param_3[1],param_2,2,param_3 + 5,0);
      iVar3 = *(int *)(param_3 + 5);
    }
    FUN_00904ddc(param_2,param_1,"connect+handshake %s: %dms, 1st data: %dms",uVar5,uVar1,iVar3);
  }
  param_1[1] = param_3[1];
  param_3[1] = 0;
  if (*(char *)(param_1[3] + 0x570) == '\x03') {
    if (((param_2 == 0) || ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0)) ||
       ((*(long *)(param_2 + 0x12a0) != 0 && (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1))))
    goto LAB_0090be60;
    pcVar2 = "using HTTP/2";
  }
  else if (*(char *)(param_1[3] + 0x570) == '\x1e') {
    if (((param_2 == 0) || ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0)) ||
       ((*(long *)(param_2 + 0x12a0) != 0 && (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1))))
    goto LAB_0090be60;
    pcVar2 = "using HTTP/3";
  }
  else {
    if (((param_2 == 0) || ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0)) ||
       ((*(long *)(param_2 + 0x12a0) != 0 && (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1))))
    goto LAB_0090be60;
    pcVar2 = "using HTTP/1.x";
  }
  FUN_00904c98(param_2,pcVar2);
LAB_0090be60:
  *puVar6 = 2;
  *(byte *)((long)param_1 + 0x24) = *(byte *)((long)param_1 + 0x24) | 1;
  FUN_00907bdc(param_1[1],param_2,1,0x100,0,0);
  return;
}

