/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908868
 */

long FUN_00908868(long param_1,int param_2,undefined1 (*param_3) [16])

{
  long lVar1;
  long lVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  
  lVar1 = param_1 + (long)param_2 * 0x10;
  lVar2 = *(long *)(lVar1 + 600);
  if ((lVar2 == 0) || (uVar3 = *(uint *)(param_1 + 0x278), uVar3 == 0)) {
    lVar1 = 0;
  }
  else {
    if (param_3 == (undefined1 (*) [16])0x0) {
      auVar4 = FUN_00941cb8();
      uVar3 = *(uint *)(param_1 + 0x278);
      lVar2 = *(long *)(lVar1 + 600);
    }
    else {
      auVar4 = *param_3;
    }
    lVar1 = FUN_00941d54(auVar4._0_8_,auVar4._8_8_,lVar2,
                         *(undefined8 *)(param_1 + (long)param_2 * 0x10 + 0x260));
    lVar1 = (ulong)uVar3 - lVar1;
    if (lVar1 == 0) {
      lVar1 = -1;
    }
  }
  return lVar1;
}

