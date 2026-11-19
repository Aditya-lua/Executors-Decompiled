/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00967a14
 */

undefined8 FUN_00967a14(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  
  if ((((*(char *)(param_1 + 0xf) == *(char *)(param_2 + 0xf)) &&
       (*(int *)((long)param_1 + 0x74) == *(int *)((long)param_2 + 0x74))) &&
      (*(char *)(param_1 + 0xe) == *(char *)(param_2 + 0xe))) &&
     (((*(byte *)((long)param_2 + 0x79) ^ *(byte *)((long)param_1 + 0x79)) & 7) == 0)) {
    puVar3 = (undefined8 *)param_1[8];
    puVar4 = (undefined8 *)param_2[8];
    if ((puVar3 == (undefined8 *)0x0 && puVar4 == (undefined8 *)0x0) ||
       (((puVar3 != (undefined8 *)0x0 && (puVar4 != (undefined8 *)0x0)) &&
        ((puVar3[1] == puVar4[1] &&
         (iVar1 = memcmp((void *)*puVar3,(void *)*puVar4,puVar3[1]), iVar1 == 0)))))) {
      puVar3 = (undefined8 *)param_1[9];
      puVar4 = (undefined8 *)param_2[9];
      if ((puVar3 == (undefined8 *)0x0 && puVar4 == (undefined8 *)0x0) ||
         (((puVar3 != (undefined8 *)0x0 && (puVar4 != (undefined8 *)0x0)) &&
          ((puVar3[1] == puVar4[1] &&
           (iVar1 = memcmp((void *)*puVar3,(void *)*puVar4,puVar3[1]), iVar1 == 0)))))) {
        puVar3 = (undefined8 *)param_1[10];
        puVar4 = (undefined8 *)param_2[10];
        if ((((puVar3 == (undefined8 *)0x0 && puVar4 == (undefined8 *)0x0) ||
             ((((puVar3 != (undefined8 *)0x0 && (puVar4 != (undefined8 *)0x0)) &&
               (puVar3[1] == puVar4[1])) &&
              (iVar1 = memcmp((void *)*puVar3,(void *)*puVar4,puVar3[1]), iVar1 == 0)))) &&
            ((((uVar2 = FUN_0094187c(*param_1,*param_2), (uVar2 & 1) != 0 &&
               (uVar2 = FUN_0094187c(param_1[1],param_2[1]), (uVar2 & 1) != 0)) &&
              ((uVar2 = FUN_0094187c(param_1[2],param_2[2]), (uVar2 & 1) != 0 &&
               ((uVar2 = FUN_0094187c(param_1[3],param_2[3]), (uVar2 & 1) != 0 &&
                (iVar1 = FUN_009418b0(param_1[0xb],param_2[0xb]), iVar1 == 0)))))) &&
             (iVar1 = FUN_009418b0(param_1[0xc],param_2[0xc]), iVar1 == 0)))) &&
           ((((iVar1 = curl_strequal(param_1[4],param_2[4]), iVar1 != 0 &&
              (iVar1 = curl_strequal(param_1[5],param_2[5]), iVar1 != 0)) &&
             (iVar1 = curl_strequal(param_1[0xd],param_2[0xd]), iVar1 != 0)) &&
            ((iVar1 = curl_strequal(param_1[7],param_2[7]), iVar1 != 0 &&
             (iVar1 = curl_strequal(param_1[6],param_2[6]), iVar1 != 0)))))) {
          return 1;
        }
      }
    }
  }
  return 0;
}

