/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c137f4
 */

undefined8 FUN_00c137f4(long *param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte *pbVar4;
  
  pbVar4 = (byte *)*param_1;
  pbVar1 = (byte *)param_1[1];
  if (pbVar4 == pbVar1) {
    return 1;
  }
  if (*pbVar4 == 0x68) {
    pbVar2 = pbVar4 + 1;
    *param_1 = (long)pbVar2;
    pbVar3 = pbVar2;
    if ((pbVar2 != pbVar1) && (*pbVar2 == 0x6e)) {
      pbVar3 = pbVar4 + 2;
      *param_1 = (long)pbVar3;
    }
    if (pbVar1 == pbVar3) {
      return 1;
    }
    if (*pbVar3 - 0x3a < 0xfffffff6) {
      return 1;
    }
    do {
      if (*pbVar3 - 0x3a < 0xfffffff6) goto LAB_00c1399c;
      pbVar3 = pbVar3 + 1;
      *param_1 = (long)pbVar3;
    } while (pbVar3 != pbVar1);
  }
  else {
    if (*pbVar4 != 0x76) {
      return 1;
    }
    pbVar2 = pbVar4 + 1;
    *param_1 = (long)pbVar2;
    pbVar3 = pbVar2;
    if ((pbVar2 != pbVar1) && (*pbVar2 == 0x6e)) {
      pbVar3 = pbVar4 + 2;
      *param_1 = (long)pbVar3;
    }
    if (pbVar1 == pbVar3) {
      return 1;
    }
    if (*pbVar3 - 0x3a < 0xfffffff6) {
      return 1;
    }
    do {
      if (*pbVar3 - 0x3a < 0xfffffff6) {
        pbVar4 = pbVar3;
        goto LAB_00c13910;
      }
      pbVar4 = pbVar3 + 1;
      *param_1 = (long)pbVar4;
      pbVar3 = pbVar4;
    } while (pbVar4 != pbVar1);
    pbVar3 = pbVar1;
LAB_00c13910:
    if (pbVar3 == pbVar2) {
      return 1;
    }
    if (pbVar4 == pbVar1) {
      return 1;
    }
    if (*pbVar4 != 0x5f) {
      return 1;
    }
    pbVar2 = pbVar4 + 1;
    *param_1 = (long)pbVar2;
    pbVar3 = pbVar2;
    if ((pbVar2 != pbVar1) && (*pbVar2 == 0x6e)) {
      *param_1 = (long)(pbVar4 + 2);
      pbVar3 = pbVar4 + 2;
    }
    if (pbVar1 == pbVar3) {
      return 1;
    }
    if (*pbVar3 - 0x3a < 0xfffffff6) {
      return 1;
    }
    do {
      if (*pbVar3 - 0x3a < 0xfffffff6) goto LAB_00c1399c;
      pbVar3 = pbVar3 + 1;
      *param_1 = (long)pbVar3;
    } while (pbVar3 != pbVar1);
  }
  pbVar4 = pbVar1;
LAB_00c139a0:
  if (((pbVar4 == pbVar2) || (pbVar3 == pbVar1)) || (*pbVar3 != 0x5f)) {
    return 1;
  }
  *param_1 = (long)(pbVar3 + 1);
  return 0;
LAB_00c1399c:
  pbVar4 = pbVar3;
  goto LAB_00c139a0;
}

