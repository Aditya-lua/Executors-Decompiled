
void FUN_005d82fc(long param_1)

{
  ulong uVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long lVar3;
  undefined8 *puVar4;
  
  puVar4 = *(undefined8 **)(param_1 + 8);
  uVar1 = *(long *)(param_1 + 0x18) - (long)puVar4;
  if (uVar1 != 0) {
    lVar3 = 1 - (uVar1 >> 3);
    do {
      lVar2 = *(long *)*puVar4;
      *(long *)*puVar4 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4(puVar4);
      }
      puVar4 = puVar4 + 1;
      lVar3 = lVar3 + 1;
    } while (lVar3 != 1);
  }
  if (unaff_x19[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19,unaff_x19[2] << 3,8);
  return;
}

