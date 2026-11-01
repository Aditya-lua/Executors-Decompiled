
void FUN_004bb264(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  
  lVar1 = *(long *)(param_1 + 0x18);
  lVar3 = *(long *)(param_1 + 0x20) + 1;
  lVar2 = lVar1;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x004caae8(lVar2);
    lVar2 = lVar2 + 0x108;
  }
  if (*(long *)(param_1 + 0x10) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*(long *)(param_1 + 0x10) * 0x108,8);
  return;
}

