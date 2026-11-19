/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00895520
 */

void FUN_00895520(undefined8 *param_1,long *param_2,int param_3,ulong param_4,uint param_5)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  
  uVar1 = param_2[1];
  uVar3 = param_4 & 0xff;
  if (uVar1 == uVar3) {
    if (uVar1 != 0) {
      uVar3 = 0;
      do {
        FUN_0088d1d0(param_1,*(undefined8 *)(*param_2 + uVar3 * 8),param_3 + (int)uVar3,1);
        uVar3 = uVar3 + 1;
      } while (uVar3 < (ulong)param_2[1]);
    }
  }
  else if (uVar3 < uVar1) {
    if ((param_4 & 0xff) != 0) {
      uVar1 = 0;
      do {
        FUN_0088d1d0(param_1,*(undefined8 *)(*param_2 + uVar1 * 8),param_3 + (int)uVar1,1);
        uVar1 = uVar1 + 1;
      } while (uVar3 != uVar1);
      uVar1 = param_2[1];
    }
    if (uVar3 < uVar1) {
      do {
        FUN_00889800(param_1,*(undefined8 *)(*param_2 + uVar3 * 8));
        uVar3 = uVar3 + 1;
      } while (uVar3 < (ulong)param_2[1]);
    }
  }
  else {
    if (uVar1 != 0) {
      if (uVar1 == 1) {
        uVar1 = 0;
        lVar2 = 1;
      }
      else {
        uVar3 = 0;
        do {
          FUN_0088d1d0(param_1,*(undefined8 *)(*param_2 + uVar3 * 8),param_3 + (int)uVar3,1);
          lVar2 = param_2[1];
          uVar3 = uVar3 + 1;
          uVar1 = lVar2 - 1;
        } while (uVar3 < uVar1);
      }
      FUN_008956b0(param_1,*(undefined8 *)(*param_2 + uVar1 * 8),param_3 + (int)lVar2 + -1,
                   (int)param_4 - (int)uVar1,param_5 & 1);
      return;
    }
    if ((param_4 & 0xff) != 0) {
      uVar1 = 0;
      do {
        FUN_00875b54(*param_1,2,param_3 + (int)uVar1,0,0);
        uVar1 = uVar1 + 1;
      } while (uVar3 != uVar1);
    }
  }
  return;
}

