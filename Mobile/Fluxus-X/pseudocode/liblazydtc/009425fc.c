/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009425fc
 */

int FUN_009425fc(long param_1)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  size_t sVar4;
  long lVar5;
  undefined8 *puVar6;
  
  if ((*(long *)(param_1 + 0x11b8) == 0) && (*(long *)(param_1 + 0xa50) == 0)) goto LAB_00942698;
  if ((*(byte *)(param_1 + 0x131d) >> 6 & 1) == 0) {
    if (*(long *)(param_1 + 0x11b8) == 0) {
      lVar5 = *(long *)(param_1 + 0xa50);
      goto joined_r0x00942664;
    }
  }
  else {
    (*(code *)PTR_free_00cc4678)();
    *(undefined8 *)(param_1 + 0x11b8) = 0;
    *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) & 0xffffbfff;
    lVar5 = *(long *)(param_1 + 0xa50);
joined_r0x00942664:
    if (lVar5 != 0) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x888));
      iVar3 = curl_url_get(*(undefined8 *)(param_1 + 0xa50),0,param_1 + 0x888,0);
      if (iVar3 != 0) {
LAB_00942698:
        FUN_00904b80(param_1,"No URL set");
        return 3;
      }
    }
  }
  if ((*(long *)(param_1 + 0x208) != 0) && (*(long *)(param_1 + 0x338) != 0)) {
    FUN_00904b80(param_1,"cannot mix POSTFIELDS with RESUME_FROM");
    return 0x2b;
  }
  uVar1 = *(uint *)(param_1 + 0xa82);
  *(uint *)(param_1 + 0x131c) =
       *(uint *)(param_1 + 0x131c) & 0xffffc000 |
       *(uint *)(param_1 + 0x131c) & 0xfff | (uVar1 >> 9 & 1) << 0xc | (uVar1 >> 0xb & 1) << 0xd;
  *(char *)(param_1 + 0x131a) = *(char *)(param_1 + 0x529);
  *(undefined8 *)(param_1 + 0x11b8) = *(undefined8 *)(param_1 + 0x888);
  iVar3 = FUN_00968e24(param_1,*(undefined8 *)(param_1 + 0x6d0));
  if (iVar3 != 0) {
    return iVar3;
  }
  *(undefined4 *)(param_1 + 0xcd0) = 0;
  *(undefined8 *)(param_1 + 0xcc8) = 0;
  *(undefined1 *)(param_1 + 0x1318) = *(undefined1 *)(param_1 + 0x52a);
  *(undefined1 *)(param_1 + 0x1319) = 0;
  *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) & 0xffffffd5;
  *(undefined8 *)(param_1 + 0xd50) = *(undefined8 *)(param_1 + 0x1f0);
  *(undefined8 *)(param_1 + 0xd70) = *(undefined8 *)(param_1 + 0x1f8);
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1368));
  *(undefined8 *)(param_1 + 0x1368) = 0;
  cVar2 = *(char *)(param_1 + 0x131a);
  if ((cVar2 == '\0') || (cVar2 == '\x05')) {
    *(undefined8 *)(param_1 + 0x1158) = 0;
  }
  else if (cVar2 == '\x04') {
    *(undefined8 *)(param_1 + 0x1158) = *(undefined8 *)(param_1 + 0x310);
  }
  else {
    *(long *)(param_1 + 0x1158) = *(long *)(param_1 + 0x218);
    if ((*(long *)(param_1 + 0x218) == -1) && (*(char **)(param_1 + 0x208) != (char *)0x0)) {
      sVar4 = strlen(*(char **)(param_1 + 0x208));
      *(size_t *)(param_1 + 0x1158) = sVar4;
    }
  }
  FUN_00912be4(param_1);
  if (*(long *)(param_1 + 0x11c8) == 0) {
    FUN_00918fc0(param_1);
LAB_00942800:
    *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x10;
    FUN_00915c9c(param_1);
    FUN_00931c0c(param_1);
    FUN_00931de4(param_1);
    *(ulong *)(param_1 + 0xd58) = *(ulong *)(param_1 + 0xd58) & *(ulong *)(param_1 + 0xd50);
    *(ulong *)(param_1 + 0xd78) = *(ulong *)(param_1 + 0xd78) & *(ulong *)(param_1 + 0xd70);
    uVar1 = *(uint *)(param_1 + 0xa82);
    *(uint *)(param_1 + 0x131c) =
         *(uint *)(param_1 + 0x131c) & 0xffffff80 |
         *(uint *)(param_1 + 0x131c) & 0x3f | (uVar1 >> 0x11 & 1) << 6;
    if ((uVar1 >> 0x11 & 1) == 0) {
LAB_00942894:
      iVar3 = FUN_00918dd8(param_1,*(undefined8 *)(param_1 + 0xa98));
      lVar5 = *(long *)(param_1 + 0x890);
      goto joined_r0x009428a8;
    }
    puVar6 = *(undefined8 **)(param_1 + 0x1320);
    if (puVar6 != (undefined8 *)0x0) {
LAB_0094288c:
      if (*(char *)(puVar6 + 8) == '\0') {
        if (puVar6[6] != 0) {
          (*(code *)puVar6[7])();
        }
        (*(code *)PTR_free_00cc4678)(puVar6[1]);
        puVar6[1] = 0;
        (*(code *)PTR_free_00cc4678)(*puVar6);
        *puVar6 = 0;
        iVar3 = FUN_0092f748(puVar6);
        if (iVar3 != 0) goto LAB_00942980;
      }
      goto LAB_00942894;
    }
    puVar6 = (undefined8 *)(*(code *)PTR_calloc_00cc4690)(1,0x48);
    *(undefined8 **)(param_1 + 0x1320) = puVar6;
    if (puVar6 != (undefined8 *)0x0) goto LAB_0094288c;
LAB_00942980:
    iVar3 = 0x1b;
  }
  else {
    iVar3 = FUN_00917cf4(param_1);
    FUN_00918fc0(param_1);
    if (iVar3 == 0) goto LAB_00942800;
    lVar5 = *(long *)(param_1 + 0x890);
joined_r0x009428a8:
    if (lVar5 != 0) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12a8));
      *(undefined8 *)(param_1 + 0x12a8) = 0;
      lVar5 = curl_maprintf("User-Agent: %s\r\n",*(undefined8 *)(param_1 + 0x890));
      *(long *)(param_1 + 0x12a8) = lVar5;
      if (lVar5 == 0) goto LAB_00942980;
    }
    if ((((iVar3 == 0) &&
         (iVar3 = FUN_00937c50(param_1 + 0x12f0,*(undefined8 *)(param_1 + 0x8a0)), iVar3 == 0)) &&
        (iVar3 = FUN_00937c50(param_1 + 0x12f8,*(undefined8 *)(param_1 + 0x8a8)), iVar3 == 0)) &&
       (iVar3 = FUN_00937c50(param_1 + 0x1308,*(undefined8 *)(param_1 + 0x8b8)), iVar3 == 0)) {
      iVar3 = FUN_00937c50(param_1 + 0x1310,*(undefined8 *)(param_1 + 0x8c0));
    }
    *(undefined4 *)(param_1 + 0x108) = 0;
    FUN_00921ca8(param_1);
  }
  return iVar3;
}

