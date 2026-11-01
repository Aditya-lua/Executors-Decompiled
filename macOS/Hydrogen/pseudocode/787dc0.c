
undefined8 FUN_00787dc0(long param_1,long param_2,char *param_3)

{
  int iVar1;
  long lVar2;
  uint uVar3;
  long *plVar4;
  
  lVar2 = _strlen(param_3);
  if (lVar2 - 1U < 7) {
    iVar1 = func_0x0077e6e4((long)*param_3);
    uVar3 = iVar1 + 0x7a40;
    if (lVar2 != 1) {
      iVar1 = func_0x0077e6e4((long)param_3[1]);
      uVar3 = iVar1 + uVar3 * 0x20;
      if (lVar2 != 2) {
        iVar1 = func_0x0077e6e4((long)param_3[2]);
        uVar3 = iVar1 + uVar3 * 0x20;
        if (lVar2 != 3) {
          iVar1 = func_0x0077e6e4((long)param_3[3]);
          uVar3 = iVar1 + uVar3 * 0x20;
          if (lVar2 != 4) {
            iVar1 = func_0x0077e6e4((long)param_3[4]);
            uVar3 = iVar1 + uVar3 * 0x20;
            if (lVar2 != 5) {
              iVar1 = func_0x0077e6e4((long)param_3[5]);
              uVar3 = iVar1 + uVar3 * 0x20;
              if (lVar2 != 6) {
                iVar1 = func_0x0077e6e4((long)param_3[6]);
                uVar3 = iVar1 + uVar3 * 0x20;
              }
            }
          }
        }
      }
    }
    plVar4 = *(long **)(&UNK_00a20020 + (ulong)(uVar3 % 0x43) * 8);
    if ((((plVar4 != (long *)0x0) && (iVar1 = func_0x0077e76c(param_3,*plVar4,lVar2), iVar1 != 0))
        && (*(char *)(*plVar4 + lVar2) == '\0')) &&
       (((*(uint *)((long)plVar4 + 0x94) & *(uint *)(param_1 + 0x954)) != 0 &&
        ((((byte)(&UNK_00001344)[param_1] >> 3 & 1) == 0 ||
         ((*(uint *)(param_1 + 0x958) & *(uint *)((long)plVar4 + 0x94)) != 0)))))) {
      *(long **)(param_2 + 0x3a8) = plVar4;
      *(long **)(param_2 + 0x3a0) = plVar4;
      return 0;
    }
  }
  func_0x0073c9e4(param_1,"Protocol \"%s\" %s%s");
  return 1;
}

