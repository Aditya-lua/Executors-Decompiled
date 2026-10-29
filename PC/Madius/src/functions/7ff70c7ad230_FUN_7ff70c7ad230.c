/* 7ff70c7ad230 FUN_7ff70c7ad230 */

undefined8 * FUN_7ff70c7ad230(undefined8 *param_1,undefined8 *param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  puVar1 = (undefined8 *)*param_1;
  puVar2 = puVar1;
  if (*(char *)((longlong)param_2 + 0x19) == '\0') {
    puVar2 = (undefined8 *)FUN_7ff70ca8ff40(0x60);
    FUN_7ff70c7acf60(puVar2 + 4,param_2 + 4);
    *puVar2 = puVar1;
    puVar2[2] = puVar1;
    *(undefined1 *)((longlong)puVar2 + 0x19) = 0;
    puVar2[1] = param_3;
    *(undefined1 *)(puVar2 + 3) = *(undefined1 *)(param_2 + 3);
    uVar3 = FUN_7ff70c7ad230(param_1,*param_2,puVar2);
    *puVar2 = uVar3;
    uVar3 = FUN_7ff70c7ad230(param_1,param_2[2]);
    puVar2[2] = uVar3;
  }
  return puVar2;
}


