
void FUN_0027bacc(void)

{
  byte bVar1;
  undefined8 *puVar2;
  long lVar3;
  
  puVar2 = (undefined8 *)func_0x007a23bc();
  bVar1 = *(byte *)*puVar2;
  *(byte *)*puVar2 = 0;
  if ((bVar1 & 1) != 0) {
    return;
  }
  lVar3 = func_0x007a23bc(&UNK_009cdb18);
  func_0x002d8de8(*(undefined8 *)(lVar3 + 0x28));
  func_0x002d8de8(*(undefined8 *)(lVar3 + 0x20));
  if (*(long *)(lVar3 + 0x18) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(lVar3 + 0x10),*(long *)(lVar3 + 0x18),1);
  return;
}

