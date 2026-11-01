
void FUN_00592bf4(void)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  
  puVar2 = (undefined8 *)func_0x007a2668();
  puVar3 = (undefined8 *)puVar2[1];
  for (lVar4 = ((ulong)(puVar2[3] - (long)puVar2[1]) >> 3) * -0x71c71c71c71c71c7; lVar4 != 0;
      lVar4 = lVar4 + -1) {
    lVar1 = *(long *)*puVar3;
    *(long *)*puVar3 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(puVar3);
    }
    func_0x00590e80(puVar3 + 1);
    puVar3 = puVar3 + 9;
  }
  if (puVar2[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*puVar2,puVar2[2] * 0x48,8);
  return;
}

