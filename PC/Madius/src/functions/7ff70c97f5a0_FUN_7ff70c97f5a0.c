/* 7ff70c97f5a0 FUN_7ff70c97f5a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_7ff70c97f5a0(longlong param_1,byte *param_2,ulonglong param_3,undefined8 *param_4,
                longlong *param_5)

{
  undefined1 auVar1 [16];
  undefined1 *puVar2;
  undefined1 *puVar3;
  char cVar4;
  uint uVar5;
  
  *param_4 = 0;
  *param_5 = 0;
  if (param_3 == 0) {
    param_3 = FUN_7ff70cb12e80(param_2);
  }
  auVar1._8_8_ = 0;
  auVar1._0_8_ = param_3 + 2;
  puVar2 = (undefined1 *)
           (*_DAT_7ff70cbebad0)
                     ((SUB168(auVar1 * ZEXT816(0xaaaaaaaaaaaaaaab),8) & 0xfffffffffffffffe) * 2 + 1)
  ;
  puVar3 = puVar2;
  if (puVar2 == (undefined1 *)0x0) {
    return 0x1b;
  }
  for (; 2 < param_3; param_3 = param_3 - 3) {
    *puVar3 = *(undefined1 *)(param_1 + (ulonglong)(*param_2 >> 2));
    puVar3[1] = *(undefined1 *)
                 (param_1 + (ulonglong)((uint)(param_2[1] >> 4) | (*param_2 & 3) << 4));
    puVar3[2] = *(undefined1 *)
                 (param_1 + (ulonglong)((uint)(param_2[2] >> 6) + (param_2[1] & 0xf) * 4));
    puVar3[3] = *(undefined1 *)(param_1 + (ulonglong)(param_2[2] & 0x3f));
    param_2 = param_2 + 3;
    puVar3 = puVar3 + 4;
  }
  if (param_3 != 0) {
    *puVar3 = *(undefined1 *)(param_1 + (ulonglong)(*param_2 >> 2));
    uVar5 = (*param_2 & 3) << 4;
    if (param_3 == 1) {
      puVar3[1] = *(undefined1 *)(param_1 + (ulonglong)uVar5);
      if (*(char *)(param_1 + 0x40) == '\0') {
        puVar3 = puVar3 + 2;
        goto LAB_7ff70c97f6f2;
      }
      puVar3[2] = *(char *)(param_1 + 0x40);
      cVar4 = *(char *)(param_1 + 0x40);
    }
    else {
      puVar3[1] = *(undefined1 *)(param_1 + (ulonglong)(byte)((byte)uVar5 | param_2[1] >> 4));
      puVar3[2] = *(undefined1 *)(param_1 + (ulonglong)(param_2[1] & 0xf) * 4);
      cVar4 = *(char *)(param_1 + 0x40);
      if (cVar4 == '\0') {
        puVar3 = puVar3 + 3;
        goto LAB_7ff70c97f6f2;
      }
    }
    puVar3[3] = cVar4;
    puVar3 = puVar3 + 4;
  }
LAB_7ff70c97f6f2:
  *puVar3 = 0;
  *param_4 = puVar2;
  *param_5 = (longlong)puVar3 - (longlong)puVar2;
  return 0;
}


