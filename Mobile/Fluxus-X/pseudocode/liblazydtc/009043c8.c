/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009043c8
 */

undefined8
FUN_009043c8(long param_1,int param_2,char *param_3,uint param_4,undefined8 *param_5,uint param_6)

{
  size_t sVar1;
  undefined8 *puVar2;
  int iVar3;
  time_t tVar4;
  size_t sVar5;
  size_t sVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  char *__s;
  
  tVar4 = time((time_t *)0x0);
  puVar2 = *(undefined8 **)(param_1 + 8);
joined_r0x00904410:
  do {
    while( true ) {
      if (puVar2 == (undefined8 *)0x0) {
        return 0;
      }
      puVar8 = (undefined8 *)*puVar2;
      puVar7 = (undefined8 *)puVar2[2];
      if (tVar4 <= (long)puVar8[4]) break;
      FUN_00925d80((long *)(param_1 + 8),puVar2,0);
      (*(code *)PTR_free_00cc4678)(*puVar8);
      (*(code *)PTR_free_00cc4678)(puVar8[2]);
      (*(code *)PTR_free_00cc4678)(puVar8);
      puVar2 = puVar7;
    }
    puVar2 = puVar7;
  } while (*(int *)((long)puVar8 + 0xc) != param_2);
  __s = (char *)*puVar8;
  sVar5 = strlen(param_3);
  sVar6 = strlen(__s);
  if (sVar5 == 0) {
    if (sVar6 != 0) goto joined_r0x00904410;
  }
  else {
    sVar1 = sVar5 - 1;
    if (param_3[sVar5 - 1] != '.') {
      sVar1 = sVar5;
    }
    if (sVar1 != sVar6) goto joined_r0x00904410;
  }
  iVar3 = curl_strnequal(param_3,__s);
  if (((iVar3 != 0) && (*(ushort *)(puVar8 + 1) == param_4)) &&
     ((*(uint *)((long)puVar8 + 0x1c) & param_6) != 0)) {
    *param_5 = puVar8;
    return 1;
  }
  goto joined_r0x00904410;
}

