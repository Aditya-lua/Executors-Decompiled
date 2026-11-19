/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091c36c
 */

undefined8 FUN_0091c36c(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined *puVar3;
  char *pcVar4;
  char *pcVar5;
  
  lVar1 = FUN_00941e8c(param_1,&DAT_002d2f46,2);
  if ((lVar1 == 0) && ((*(byte *)(param_1 + 0xa84) >> 6 & 1) != 0)) {
    lVar1 = FUN_00941e8c(param_1,"Connection",10);
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12e8));
    pcVar4 = "";
    *(undefined8 *)(param_1 + 0x12e8) = 0;
    if (lVar1 == 0) {
      puVar3 = &DAT_002ab32c;
      pcVar5 = (char *)0x0;
LAB_0091c40c:
      uVar2 = curl_maprintf("Connection: %s%sTE\r\nTE: gzip\r\n",pcVar4,puVar3);
      *(undefined8 *)(param_1 + 0x12e8) = uVar2;
      (*(code *)PTR_free_00cc4678)(pcVar5);
      if (*(long *)(param_1 + 0x12e8) != 0) goto LAB_0091c434;
    }
    else {
      pcVar4 = (char *)FUN_00919a0c(lVar1);
      if (pcVar4 != (char *)0x0) {
        puVar3 = &DAT_002ab32c;
        if (*pcVar4 != '\0') {
          puVar3 = &DAT_002a715d;
        }
        pcVar5 = pcVar4;
        goto LAB_0091c40c;
      }
    }
    uVar2 = 0x1b;
  }
  else {
LAB_0091c434:
    uVar2 = 0;
  }
  return uVar2;
}

