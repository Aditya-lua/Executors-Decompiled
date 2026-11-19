/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009164f8
 */

undefined8
FUN_009164f8(long *param_1,void *param_2,size_t param_3,undefined8 param_4,undefined8 param_5)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  long *plVar5;
  ulong uVar6;
  
  lVar4 = *param_1;
  if (lVar4 == 0) {
    lVar4 = (*(code *)PTR_malloc_00cc4670)(param_1[4] << 5);
    *param_1 = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    if (param_1[4] == 0) {
      uVar3 = 0;
    }
    else {
      FUN_00925c98(lVar4,&LAB_00916694);
      uVar3 = param_1[4];
      if (1 < uVar3) {
        uVar6 = 1;
        lVar4 = 0x20;
        do {
          FUN_00925c98(*param_1 + lVar4,&LAB_00916694);
          uVar3 = param_1[4];
          uVar6 = uVar6 + 1;
          lVar4 = lVar4 + 0x20;
        } while (uVar6 < uVar3);
      }
      lVar4 = *param_1;
    }
  }
  else {
    uVar3 = param_1[4];
  }
  lVar2 = (*(code *)param_1[1])(param_2,param_3,uVar3);
  plVar1 = (long *)(lVar4 + lVar2 * 0x20);
  plVar5 = (long *)*plVar1;
  do {
    if (plVar5 == (long *)0x0) {
LAB_00916618:
      lVar4 = (*(code *)PTR_malloc_00cc4670)(param_3 + 0x38);
      if (lVar4 == 0) {
        return 0;
      }
      memcpy((void *)(lVar4 + 0x30),param_2,param_3);
      *(undefined8 *)(lVar4 + 0x20) = param_5;
      *(size_t *)(lVar4 + 0x28) = param_3;
      *(undefined8 *)(lVar4 + 0x18) = param_4;
      FUN_00925d10(plVar1,lVar4,lVar4);
      param_1[5] = param_1[5] + 1;
      return param_4;
    }
    lVar4 = (*(code *)param_1[2])(*plVar5 + 0x30,*(undefined8 *)(*plVar5 + 0x28),param_2,param_3);
    if (lVar4 != 0) {
      FUN_00925d80(plVar1,plVar5,param_1);
      param_1[5] = param_1[5] + -1;
      goto LAB_00916618;
    }
    plVar5 = (long *)plVar5[2];
  } while( true );
}

