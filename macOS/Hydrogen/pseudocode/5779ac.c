
void FUN_005779ac(long param_1,long param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  long lVar2;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  
  if (param_1 == 7) {
    func_0x005cf324(&lStack_58);
    for (lVar2 = 0; lStack_48 * 8 != lVar2; lVar2 = lVar2 + 8) {
      uVar1 = *(undefined8 *)(lStack_50 + lVar2);
      func_0x00585334(*param_3,uVar1);
      func_0x0057797c(uVar1,param_3);
    }
    if (lStack_58 == 0) {
      return;
    }
  }
  else {
    func_0x005caa38(&lStack_58,param_2 + 8);
    for (lVar2 = 0; lStack_48 * 8 != lVar2; lVar2 = lVar2 + 8) {
      uVar1 = *(undefined8 *)(lStack_50 + lVar2);
      func_0x0058a45c(*param_3,uVar1);
      func_0x0057797c(uVar1,param_3);
    }
    if (lStack_58 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lStack_50,lStack_58 << 3,8);
  return;
}

