/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f4e4
 */

undefined8 curl_share_cleanup(int *param_1)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  
  if ((param_1 == (int *)0x0) || (*param_1 != 0x7e117a1e)) {
    uVar1 = 3;
  }
  else {
    if (*(code **)(param_1 + 4) != (code *)0x0) {
      (**(code **)(param_1 + 4))(0,1,2,*(undefined8 *)(param_1 + 8));
    }
    if (param_1[2] == 0) {
      thunk_FUN_00910604(param_1 + 10);
      FUN_0090fb7c(param_1 + 10);
      FUN_00916838(param_1 + 0x2e);
      FUN_00914d68(*(undefined8 *)(param_1 + 0x3a));
      FUN_0091839c(param_1 + 0x3c);
      lVar2 = *(long *)(param_1 + 0x3e);
      if (lVar2 != 0) {
        if (*(long *)(param_1 + 0x40) != 0) {
          FUN_00968604();
          if (1 < *(ulong *)(param_1 + 0x40)) {
            uVar3 = 1;
            lVar2 = 200;
            do {
              FUN_00968604(*(long *)(param_1 + 0x3e) + lVar2);
              uVar3 = uVar3 + 1;
              lVar2 = lVar2 + 200;
            } while (uVar3 < *(ulong *)(param_1 + 0x40));
          }
          lVar2 = *(long *)(param_1 + 0x3e);
        }
        (*(code *)PTR_free_00cc4678)(lVar2);
      }
      if (*(code **)(param_1 + 6) != (code *)0x0) {
        (**(code **)(param_1 + 6))(0,1,*(undefined8 *)(param_1 + 8));
      }
      *param_1 = 0;
      (*(code *)PTR_free_00cc4678)(param_1);
      uVar1 = 0;
    }
    else {
      if (*(code **)(param_1 + 6) != (code *)0x0) {
        (**(code **)(param_1 + 6))(0,1,*(undefined8 *)(param_1 + 8));
      }
      uVar1 = 2;
    }
  }
  return uVar1;
}

