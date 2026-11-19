/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab79a0
 */

int FUN_00ab79a0(void *param_1,ulong param_2,uint param_3,int param_4)

{
  bool bVar1;
  char cVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar6 = param_2 & 0xffffffff;
  if (((3 < (int)param_2) && (param_4 != 0)) &&
     (iVar3 = memcmp(param_1,&DAT_00774468,3), iVar3 == 0)) {
    uVar6 = (long)(int)param_2 - 3;
    memmove(param_1,(void *)((long)param_1 + 3),uVar6);
    *(undefined1 *)((long)param_1 + uVar6) = 0;
  }
  iVar3 = (int)uVar6;
  if ((param_3 >> 1 & 1) == 0) {
    if ((param_3 >> 2 & 1) == 0) {
      if (0 < iVar3) {
        uVar6 = 0;
        do {
          cVar2 = *(char *)((long)param_1 + uVar6);
          if ((cVar2 == '\n') || (cVar2 == '\r')) break;
          iVar4 = ossl_ctype_check(cVar2,0x40);
          if (iVar4 != 0) {
            *(undefined1 *)((long)param_1 + uVar6) = 0x20;
          }
          uVar6 = uVar6 + 1;
        } while ((long)uVar6 < (long)iVar3);
        goto LAB_00ab7ac8;
      }
    }
    else if (0 < iVar3) {
      uVar6 = 0;
      while ((iVar4 = ossl_ctype_check(*(undefined1 *)((long)param_1 + uVar6),0x400), iVar4 != 0 &&
             (*(char *)((long)param_1 + uVar6) != '\n'))) {
        if ((*(char *)((long)param_1 + uVar6) == '\r') ||
           (uVar6 = uVar6 + 1, (long)iVar3 <= (long)uVar6)) break;
      }
      goto LAB_00ab7ac8;
    }
    uVar6 = 0;
  }
  else {
    if (-1 < iVar3) {
      uVar6 = (long)iVar3;
      do {
        if (0x20 < *(byte *)((long)param_1 + uVar6)) goto LAB_00ab7ac4;
        uVar5 = uVar6 - 1;
        bVar1 = 0 < (long)uVar6;
        uVar6 = uVar5;
      } while (bVar1);
      uVar6 = uVar5 & 0xffffffff;
    }
LAB_00ab7ac4:
    uVar6 = (ulong)((int)uVar6 + 1);
  }
LAB_00ab7ac8:
  *(undefined2 *)((long)param_1 + (long)(int)uVar6) = 10;
  return (int)uVar6 + 1;
}

