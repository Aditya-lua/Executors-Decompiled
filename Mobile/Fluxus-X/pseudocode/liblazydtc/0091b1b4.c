/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091b1b4
 */

undefined8 FUN_0091b1b4(long param_1,long param_2)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  uint uVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  char *__s;
  size_t sVar7;
  char *pcVar8;
  undefined8 uVar9;
  
  if ((*(byte *)(param_1 + 0x131c) >> 1 & 1) == 0) {
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0xc90));
    lVar6 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_2 + 0x50));
    *(long *)(param_1 + 0xc90) = lVar6;
    if (lVar6 != 0) {
      *(undefined4 *)(param_1 + 0xc98) = *(undefined4 *)(param_2 + 0x560);
      *(undefined4 *)(param_1 + 0xc9c) = *(undefined4 *)(*(long *)(param_2 + 0x3a8) + 0x8c);
      goto LAB_0091b220;
    }
LAB_0091b3c8:
    uVar9 = 0x1b;
  }
  else {
LAB_0091b220:
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12d0));
    *(undefined8 *)(param_1 + 0x12d0) = 0;
    lVar6 = FUN_00941e8c(param_1,&DAT_002ad152,4);
    if ((lVar6 == 0) ||
       (((*(byte *)(param_1 + 0x131c) >> 1 & 1) != 0 &&
        (iVar5 = curl_strequal(*(undefined8 *)(param_1 + 0xc90),*(undefined8 *)(param_2 + 0x50)),
        iVar5 == 0)))) {
      uVar3 = *(uint *)(*(long *)(param_2 + 0x3b0) + 0x8c);
      if ((((uVar3 >> 1 & 1) == 0) || (*(int *)(param_2 + 0x560) != 0x1bb)) &&
         (((uVar3 & 1) == 0 || (*(int *)(param_2 + 0x560) != 0x50)))) {
        bVar4 = (*(ulong *)(param_2 + 0x3a0) & 0x800) == 0;
        puVar1 = &DAT_002b138e;
        if (bVar4) {
          puVar1 = &DAT_002ab32c;
        }
        puVar2 = &DAT_002c2dc5;
        if (bVar4) {
          puVar2 = &DAT_002ab32c;
        }
        lVar6 = curl_maprintf("Host: %s%s%s:%d\r\n",puVar1,*(undefined8 *)(param_2 + 0x50),puVar2);
        *(long *)(param_1 + 0x12d0) = lVar6;
      }
      else {
        bVar4 = (*(ulong *)(param_2 + 0x3a0) & 0x800) == 0;
        puVar1 = &DAT_002b138e;
        if (bVar4) {
          puVar1 = &DAT_002ab32c;
        }
        puVar2 = &DAT_002c2dc5;
        if (bVar4) {
          puVar2 = &DAT_002ab32c;
        }
        lVar6 = curl_maprintf("Host: %s%s%s\r\n",puVar1,*(undefined8 *)(param_2 + 0x50),puVar2);
        *(long *)(param_1 + 0x12d0) = lVar6;
      }
joined_r0x0091b344:
      if (lVar6 == 0) goto LAB_0091b3c8;
    }
    else {
      __s = (char *)FUN_00919a0c(lVar6);
      if (__s == (char *)0x0) goto LAB_0091b3c8;
      if (*__s == '[') {
        sVar7 = strlen(__s);
        memmove(__s,__s + 1,sVar7 - 1);
        iVar5 = 0x5d;
LAB_0091b374:
        pcVar8 = strchr(__s,iVar5);
        if (pcVar8 != (char *)0x0) {
          *pcVar8 = '\0';
        }
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12d8));
        *(char **)(param_1 + 0x12d8) = __s;
      }
      else {
        if (*__s != '\0') {
          iVar5 = 0x3a;
          goto LAB_0091b374;
        }
        (*(code *)PTR_free_00cc4678)(__s);
      }
      iVar5 = curl_strequal("Host:",lVar6);
      if (iVar5 == 0) {
        lVar6 = curl_maprintf("Host:%s\r\n",lVar6 + 5);
        *(long *)(param_1 + 0x12d0) = lVar6;
        goto joined_r0x0091b344;
      }
    }
    uVar9 = 0;
  }
  return uVar9;
}

