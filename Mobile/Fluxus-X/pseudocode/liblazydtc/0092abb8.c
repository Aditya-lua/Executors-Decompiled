/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092abb8
 */

undefined8 curl_multi_add_handle(int *param_1,int *param_2)

{
  byte bVar1;
  undefined8 uVar2;
  long lVar3;
  int *piVar4;
  long lVar5;
  ulong uVar6;
  
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    uVar2 = 1;
  }
  else if ((param_2 == (int *)0x0) || (*param_2 != -0x3f212453)) {
    uVar2 = 2;
  }
  else if (*(long *)(param_2 + 0x30) == 0) {
    bVar1 = *(byte *)((long)param_1 + 0x231);
    if ((bVar1 >> 2 & 1) == 0) {
      if ((bVar1 >> 4 & 1) != 0) {
        if (param_1[7] != 0) {
          return 0xb;
        }
        *(byte *)((long)param_1 + 0x231) = bVar1 & 0xef;
      }
      if (*(long *)(param_2 + 0x32) != 0) {
        curl_multi_cleanup();
        param_2[0x32] = 0;
        param_2[0x33] = 0;
      }
      FUN_00925c98(param_2 + 900,0);
      if (*(undefined1 **)(param_2 + 0x72) != (undefined1 *)0x0) {
        **(undefined1 **)(param_2 + 0x72) = 0;
      }
      param_2[0x32e] = 0;
      *(int **)(param_2 + 0x30) = param_1;
      FUN_0092aff8(param_2,0,8);
      param_1[0x86] = 0;
      param_1[0x87] = 0;
      param_1[0x84] = 0;
      param_1[0x85] = 0;
      uVar2 = FUN_0092b1f4(param_1);
      if ((int)uVar2 == 0) {
        if (param_2[0x16] != 0) {
          param_2[0x16] = 0;
        }
        if ((*(long *)(param_2 + 0x2c) == 0) || (param_2[0x2e] == 0)) {
          *(int **)(param_2 + 0x2c) = param_1 + 0x28;
          param_2[0x2e] = 1;
        }
        lVar3 = *(long *)(param_2 + 0x34);
        if ((lVar3 == 0) || ((*(byte *)(lVar3 + 4) >> 5 & 1) == 0)) {
          piVar4 = param_1 + 0x56;
        }
        else {
          piVar4 = (int *)(lVar3 + 0x28);
        }
        *(int **)(param_2 + 0x30e) = piVar4;
        param_2[0x314] = -1;
        param_2[0x315] = -1;
        param_2[4] = 0;
        param_2[5] = 0;
        if (*(long *)(param_1 + 2) == 0) {
          param_2[6] = 0;
          param_2[7] = 0;
          *(int **)(param_1 + 2) = param_2;
        }
        else {
          lVar5 = *(long *)(param_1 + 4);
          *(int **)(lVar5 + 0x10) = param_2;
          *(long *)(param_2 + 6) = lVar5;
        }
        *(int **)(param_1 + 4) = param_2;
        *(ulong *)(param_1 + 6) =
             CONCAT44((int)((ulong)*(undefined8 *)(param_1 + 6) >> 0x20) + 1,
                      (int)*(undefined8 *)(param_1 + 6) + 1);
        if (lVar3 != 0) {
          FUN_0093f628(param_2,5,2);
          piVar4 = *(int **)(param_2 + 0x30e);
        }
        lVar3 = *(long *)(piVar4 + 0x20);
        *(int *)(lVar3 + 0x2e0) = param_2[0xb8];
        *(int *)(lVar3 + 0x2ec) = param_2[0xbb];
        uVar6 = *(ulong *)(lVar3 + 0xa82);
        *(ulong *)(lVar3 + 0xa82) =
             uVar6 & 0xffffffff00000000 |
             uVar6 & 0x7fffffff | *(ulong *)((long)param_2 + 0xa82) & 0x80000000;
        lVar3 = *(long *)(param_2 + 0x30e);
        lVar5 = *(long *)(lVar3 + 0x40);
        *(long *)(lVar3 + 0x40) = lVar5 + 1;
        *(long *)(param_2 + 2) = lVar5;
        if (lVar5 < 0) {
          *(undefined8 *)(lVar3 + 0x40) = 0;
        }
        if (*(long *)(param_2 + 0x34) != 0) {
          FUN_0093f680(param_2,5);
        }
        uVar2 = 0;
      }
    }
    else {
      uVar2 = 8;
    }
  }
  else {
    uVar2 = 7;
  }
  return uVar2;
}

