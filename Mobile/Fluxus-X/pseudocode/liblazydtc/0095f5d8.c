/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095f5d8
 */

undefined8 FUN_0095f5d8(int *param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  time_t tVar4;
  undefined8 uVar5;
  int iVar6;
  
  lVar2 = FUN_009086d4(*(undefined8 *)(param_1 + 4),0,*param_1 == 0);
  if (lVar2 < 0) {
    FUN_00904b80(*(undefined8 *)(param_1 + 4),"Connection time-out");
    uVar5 = 0x1c;
  }
  else {
    if (lVar2 == 0) {
      lVar2 = 0xe10;
    }
    else {
      lVar2 = (lVar2 + 500) / 1000;
    }
    iVar6 = 3;
    if (0xe < (int)lVar2) {
      iVar6 = (int)lVar2 / 5;
    }
    if (0x31 < iVar6) {
      iVar6 = 0x32;
    }
    lVar3 = *(long *)(param_1 + 4);
    iVar1 = 0;
    if ((long)iVar6 != 0) {
      iVar1 = (int)(lVar2 / (long)iVar6);
    }
    if (iVar1 < 2) {
      iVar1 = 1;
    }
    param_1[8] = iVar1;
    param_1[9] = iVar6;
    if (((lVar3 != 0) && ((*(byte *)(lVar3 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(lVar3 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar3 + 0x12a0) + 8))))) {
      FUN_00904c98(lVar3,"set timeouts for state %d; Total % ld, retry %d maxtry %d",*param_1);
    }
    tVar4 = time((time_t *)0x0);
    uVar5 = 0;
    *(time_t *)(param_1 + 10) = tVar4;
  }
  return uVar5;
}

