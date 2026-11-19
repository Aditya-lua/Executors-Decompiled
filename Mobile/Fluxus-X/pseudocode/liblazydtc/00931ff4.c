/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931ff4
 */

undefined8 FUN_00931ff4(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  
  uVar2 = FUN_00941e38(param_2,param_3,*(undefined8 *)(param_1 + 0xb30),
                       *(undefined8 *)(param_1 + 0xb38));
  lVar5 = *(long *)(param_1 + 0xac0);
  *(ulong *)(param_1 + 0xae0) = uVar2;
  if ((long)uVar2 < 1) {
    lVar6 = *(long *)(param_1 + 0xac8);
    *(long *)(param_1 + 0xae8) = lVar5 * 1000000;
    lVar4 = lVar6 * 1000000;
  }
  else {
    if (lVar5 < 0x8637bd05af6) {
      lVar4 = 0;
      if (uVar2 != 0) {
        lVar4 = (lVar5 * 1000000) / (long)uVar2;
      }
    }
    else if ((long)uVar2 < 1000000) {
      lVar4 = 0x7fffffffffffffff;
    }
    else {
      lVar4 = 0;
      if (uVar2 / 1000000 != 0) {
        lVar4 = lVar5 / (long)(uVar2 / 1000000);
      }
    }
    lVar6 = *(long *)(param_1 + 0xac8);
    *(long *)(param_1 + 0xae8) = lVar4;
    if (lVar6 < 0x8637bd05af6) {
      lVar4 = 0;
      if (uVar2 != 0) {
        lVar4 = (lVar6 * 1000000) / (long)uVar2;
      }
    }
    else if ((long)uVar2 < 1000000) {
      lVar4 = 0x7fffffffffffffff;
    }
    else {
      lVar4 = 0;
      if (uVar2 / 1000000 != 0) {
        lVar4 = lVar6 / (long)(uVar2 / 1000000);
      }
    }
  }
  uVar3 = 0;
  *(long *)(param_1 + 0xaf0) = lVar4;
  if (*(long *)(param_1 + 0xaa8) != param_2) {
    iVar1 = *(int *)(param_1 + 0xc30) % 6;
    lVar4 = param_1 + 0xaa8 + (long)iVar1 * 0x10;
    *(long *)(param_1 + 0xaa8) = param_2;
    plVar7 = (long *)(param_1 + 0xaa8 + (long)iVar1 * 8 + 0xf8);
    *plVar7 = lVar6 + lVar5;
    *(long *)(lVar4 + 0x128) = param_2;
    *(undefined8 *)(lVar4 + 0x130) = param_3;
    iVar1 = *(int *)(param_1 + 0xc30);
    *(uint *)(param_1 + 0xc30) = iVar1 + 1U;
    if (iVar1 == 0) {
      lVar5 = *(long *)(param_1 + 0xae8) + *(long *)(param_1 + 0xaf0);
    }
    else {
      uVar2 = 0;
      if (4 < iVar1) {
        uVar2 = (ulong)((iVar1 + 1U) % 6);
      }
      lVar5 = param_1 + 0xaa8 + uVar2 * 0x10;
      lVar4 = FUN_00941d54(param_2,param_3,*(undefined8 *)(lVar5 + 0x128),
                           *(undefined8 *)(lVar5 + 0x130));
      if (lVar4 == 0) {
        lVar4 = 1;
      }
      lVar6 = *plVar7 - *(long *)(param_1 + 0xaa8 + uVar2 * 8 + 0xf8);
      if (lVar6 < 0x418938) {
        lVar5 = 0;
        if (lVar4 != 0) {
          lVar5 = (lVar6 * 1000) / lVar4;
        }
      }
      else {
        lVar5 = (long)((double)lVar6 / ((double)lVar4 / 1000.0));
      }
    }
    uVar3 = 1;
    *(long *)(param_1 + 0xad0) = lVar5;
  }
  return uVar3;
}

