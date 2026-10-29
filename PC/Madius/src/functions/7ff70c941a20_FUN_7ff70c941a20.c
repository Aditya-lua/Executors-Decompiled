/* 7ff70c941a20 FUN_7ff70c941a20 */

undefined8 FUN_7ff70c941a20(undefined8 *param_1,undefined8 *param_2)

{
  char cVar1;
  int iVar2;
  
  if (((((((*(char *)(param_1 + 0xd) == *(char *)(param_2 + 0xd)) &&
          (*(int *)((longlong)param_1 + 100) == *(int *)((longlong)param_2 + 100))) &&
         (*(char *)(param_1 + 0xc) == *(char *)(param_2 + 0xc))) &&
        ((*(char *)((longlong)param_1 + 0x69) == *(char *)((longlong)param_2 + 0x69) &&
         (*(char *)((longlong)param_1 + 0x6a) == *(char *)((longlong)param_2 + 0x6a))))) &&
       ((*(char *)((longlong)param_1 + 0x6b) == *(char *)((longlong)param_2 + 0x6b) &&
        ((cVar1 = FUN_7ff70c941b70(param_1[8],param_2[8]), cVar1 != '\0' &&
         (cVar1 = FUN_7ff70c941b70(param_1[9],param_2[9]), cVar1 != '\0')))))) &&
      (cVar1 = FUN_7ff70c941b70(param_1[10],param_2[10]), cVar1 != '\0')) &&
     ((((cVar1 = FUN_7ff70c9593d0(*param_1,*param_2), cVar1 != '\0' &&
        (cVar1 = FUN_7ff70c9593d0(param_1[1],param_2[1]), cVar1 != '\0')) &&
       (cVar1 = FUN_7ff70c9593d0(param_1[2],param_2[2]), cVar1 != '\0')) &&
      (((cVar1 = FUN_7ff70c9593d0(param_1[3],param_2[3]), cVar1 != '\0' &&
        (iVar2 = FUN_7ff70c959220(param_1[4],param_2[4]), iVar2 != 0)) &&
       ((iVar2 = FUN_7ff70c959220(param_1[5],param_2[5]), iVar2 != 0 &&
        ((iVar2 = FUN_7ff70c959220(param_1[0xb],param_2[0xb]), iVar2 != 0 &&
         (iVar2 = FUN_7ff70c959220(param_1[7],param_2[7]), iVar2 != 0)))))))))) {
    iVar2 = FUN_7ff70c959220(param_1[6],param_2[6]);
    if (iVar2 != 0) {
      return 1;
    }
  }
  return 0;
}


