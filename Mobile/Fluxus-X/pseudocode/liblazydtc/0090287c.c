/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090287c
 */

undefined4 * curl_easy_duphandle(long param_1)

{
  byte bVar1;
  int iVar2;
  undefined4 *puVar3;
  undefined8 uVar4;
  undefined4 *__s;
  long lVar5;
  ulong uVar6;
  
  puVar3 = (undefined4 *)(*(code *)PTR_calloc_00cc4690)(1,0x1420);
  if (puVar3 == (undefined4 *)0x0) {
    return (undefined4 *)0x0;
  }
  puVar3[0x1b9] = *(undefined4 *)(param_1 + 0x6e4);
  memcpy(puVar3 + 0x6e,(void *)(param_1 + 0x1b8),0x8d8);
  FUN_00925f84(puVar3 + 0xd4);
  __s = puVar3 + 0x1ce;
  memset(__s,0,0x290);
  uVar6 = 0;
  do {
    iVar2 = FUN_00937c50(__s,*(undefined8 *)(param_1 + 0x738 + uVar6 * 8));
    if (iVar2 != 0) goto LAB_00902a00;
    uVar6 = uVar6 + 1;
    __s = __s + 2;
  } while (uVar6 < 0x48);
  iVar2 = FUN_00937cd4(puVar3 + 0x262,*(undefined8 *)(param_1 + 0x988));
  if (((((iVar2 == 0) &&
        (iVar2 = FUN_00937cd4(puVar3 + 0x264,*(undefined8 *)(param_1 + 0x990)), iVar2 == 0)) &&
       (iVar2 = FUN_00937cd4(puVar3 + 0x266,*(undefined8 *)(param_1 + 0x998)), iVar2 == 0)) &&
      ((iVar2 = FUN_00937cd4(puVar3 + 0x268,*(undefined8 *)(param_1 + 0x9a0)), iVar2 == 0 &&
       (iVar2 = FUN_00937cd4(puVar3 + 0x26a,*(undefined8 *)(param_1 + 0x9a8)), iVar2 == 0)))) &&
     ((iVar2 = FUN_00937cd4(puVar3 + 0x26c,*(undefined8 *)(param_1 + 0x9b0)), iVar2 == 0 &&
      ((iVar2 = FUN_00937cd4(puVar3 + 0x26e,*(undefined8 *)(param_1 + 0x9b8)), iVar2 == 0 &&
       (iVar2 = FUN_00937cd4(puVar3 + 0x270,*(undefined8 *)(param_1 + 0x9c0)), iVar2 == 0)))))) {
    lVar5 = *(long *)(param_1 + 0x980);
    if (lVar5 != 0) {
      if (*(long *)(param_1 + 0x218) == -1) {
        lVar5 = (*(code *)PTR_strdup_00cc4688)(lVar5);
        *(long *)(puVar3 + 0x260) = lVar5;
      }
      else {
        uVar4 = FUN_00963a7c();
        lVar5 = FUN_009418f0(lVar5,uVar4);
        *(long *)(puVar3 + 0x260) = lVar5;
      }
      if (lVar5 == 0) goto LAB_00902a00;
      *(long *)(puVar3 + 0x82) = lVar5;
    }
    iVar2 = FUN_009260b8(puVar3,puVar3 + 0xd4,param_1 + 0x350);
    if (*(long *)(param_1 + 0x510) != 0) {
      *(undefined8 *)(puVar3 + 0x472) = *(undefined8 *)(puVar3 + 0x144);
    }
    if (iVar2 == 0) {
      FUN_00904528(puVar3 + 0x318,0x19000);
      *(undefined8 *)(puVar3 + 0x30e) = 0;
      *(undefined8 *)(puVar3 + 2) = 0xffffffffffffffff;
      *(undefined8 *)(puVar3 + 0x316) = 0xffffffffffffffff;
      *(undefined8 *)(puVar3 + 0x314) = 0xffffffffffffffff;
      puVar3[0x2b7] = *(undefined4 *)(param_1 + 0xadc);
      bVar1 = *(byte *)(param_1 + 0xc34);
      *(undefined8 *)(puVar3 + 0x4a6) = 0;
      *(byte *)(puVar3 + 0x30d) = *(byte *)(puVar3 + 0x30d) & 0xfe | bVar1 & 1;
      if ((*(long *)(param_1 + 0xa90) != 0) && ((*(byte *)(param_1 + 0x131d) >> 3 & 1) != 0)) {
        lVar5 = FUN_00912ca4(puVar3,0,*(undefined8 *)(puVar3 + 0x2a4),
                             *(ulong *)(param_1 + 0xa82) >> 4 & 1);
        *(long *)(puVar3 + 0x2a4) = lVar5;
        if (lVar5 == 0) goto LAB_00902a00;
      }
      if (*(long *)(param_1 + 0x1298) != 0) {
        lVar5 = FUN_0093f7d8();
        *(long *)(puVar3 + 0x4a6) = lVar5;
        if (lVar5 == 0) goto LAB_00902a00;
      }
      if (*(long *)(param_1 + 0x11b8) != 0) {
        lVar5 = (*(code *)PTR_strdup_00cc4688)();
        *(long *)(puVar3 + 0x46e) = lVar5;
        if (lVar5 == 0) goto LAB_00902a00;
        puVar3[0x4c7] = puVar3[0x4c7] | 0x4000;
      }
      if (*(long *)(param_1 + 0x11c0) != 0) {
        lVar5 = (*(code *)PTR_strdup_00cc4688)();
        *(long *)(puVar3 + 0x470) = lVar5;
        if (lVar5 == 0) goto LAB_00902a00;
        puVar3[0x4c7] = puVar3[0x4c7] | 0x8000;
      }
      if ((*(long *)(puVar3 + 0x226) == 0) || (iVar2 = thunk_FUN_009701d0(puVar3), iVar2 == 0)) {
        if (*(long *)(param_1 + 0xaa0) != 0) {
          lVar5 = FUN_00903270();
          *(long *)(puVar3 + 0x2a8) = lVar5;
          if (lVar5 == 0) goto LAB_00902a00;
          if (*(long *)(puVar3 + 0x24e) != 0) {
            FUN_009032c0();
          }
        }
        if (*(long *)(param_1 + 0xa98) != 0) {
          lVar5 = FUN_00918354();
          *(long *)(puVar3 + 0x2a6) = lVar5;
          if (lVar5 == 0) goto LAB_00902a00;
          if (*(long *)(puVar3 + 0x250) != 0) {
            FUN_00918b80(puVar3,lVar5);
            lVar5 = *(long *)(puVar3 + 0x2a6);
          }
          FUN_00918dd8(puVar3,lVar5);
        }
        iVar2 = FUN_0090ea0c(puVar3,puVar3 + 0x36a,*(undefined8 *)(param_1 + 0xda8));
        if (iVar2 == 0) {
          FUN_00915c9c(puVar3);
          *puVar3 = 0xc0dedbad;
          return puVar3;
        }
      }
    }
  }
LAB_00902a00:
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar3 + 0x2a4));
  FUN_00904534(puVar3 + 0x318);
  FUN_00903550(puVar3 + 0x2a8);
  FUN_0091839c(puVar3 + 0x2a6);
  FUN_00946444(puVar3);
  (*(code *)PTR_free_00cc4678)(puVar3);
  return (undefined4 *)0x0;
}

