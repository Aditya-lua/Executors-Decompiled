/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c17fc
 */

undefined8 FUN_009c17fc(void *param_1,int param_2,long *param_3)

{
  short sVar1;
  int iVar2;
  void *pvVar3;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  char acStack_70 [64];
  
  if (param_1 == (void *)0x0) {
    return 0;
  }
  if (param_3[1] == param_3[2]) {
    pvVar3 = CRYPTO_realloc((void *)param_3[3],(int)param_3[1] * 2 + 0x50,"ssl/t1_lib.c",0x2e2);
    if (pvVar3 == (void *)0x0) {
      return 0;
    }
    param_3[2] = param_3[2] + 0x28;
    param_3[3] = (long)pvVar3;
  }
  if (0x3f < param_2) {
    return 0;
  }
  memcpy(acStack_70,param_1,(long)param_2);
  acStack_70[param_2] = '\0';
  uVar4 = *(ulong *)(*param_3 + 0x630);
  if (uVar4 == 0) {
LAB_009c190c:
    ERR_new();
    ERR_set_debug("ssl/t1_lib.c",0x2ef,"gid_cb");
    ERR_set_error(0x14,0x80106,"group \'%s\' cannot be set",acStack_70);
  }
  else {
    puVar5 = *(undefined8 **)(*param_3 + 0x628);
    uVar6 = 0;
    while ((iVar2 = strcmp((char *)*puVar5,acStack_70), iVar2 != 0 &&
           (iVar2 = strcmp((char *)puVar5[1],acStack_70), iVar2 != 0))) {
      uVar6 = uVar6 + 1;
      puVar5 = puVar5 + 7;
      if (uVar4 <= uVar6) goto LAB_009c190c;
    }
    sVar1 = *(short *)((long)puVar5 + 0x1c);
    if (sVar1 == 0) goto LAB_009c190c;
    uVar4 = param_3[1];
    if (uVar4 == 0) goto LAB_009c18f8;
    uVar6 = 0;
    while (*(short *)(param_3[3] + uVar6 * 2) != sVar1) {
      uVar6 = uVar6 + 1;
      if (uVar4 <= uVar6) {
LAB_009c18f8:
        param_3[1] = uVar4 + 1;
        *(short *)(param_3[3] + uVar4 * 2) = sVar1;
        return 1;
      }
    }
  }
  return 0;
}

