/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00954204
 */

undefined8 FUN_00954204(long param_1,long param_2,uint param_3,char *param_4,size_t param_5)

{
  long lVar1;
  bool bVar2;
  undefined8 uVar3;
  void *pvVar4;
  long lVar5;
  
  if (((param_3 & 1) == 0) || (*(char *)(*(long *)(param_1 + 0x20) + 0x500) != 'A')) {
LAB_0095431c:
    uVar3 = *(undefined8 *)(param_2 + 8);
  }
  else {
    lVar5 = *(long *)(param_2 + 0x10);
    if (param_5 != 0) {
      bVar2 = *(char *)(lVar5 + 0x20) == '\0';
      do {
        if (!bVar2) {
          if ((*param_4 != '\n') &&
             (uVar3 = FUN_009350cc(param_1,*(undefined8 *)(param_2 + 8),param_3 & 0xffffff7f,
                                   &DAT_00748b0c,1), (int)uVar3 != 0)) {
            return uVar3;
          }
          *(long *)(param_1 + 0x1108) = *(long *)(param_1 + 0x1108) + 1;
          *(undefined1 *)(lVar5 + 0x20) = 0;
        }
        pvVar4 = memchr(param_4,0xd,param_5);
        if (pvVar4 == (void *)0x0) goto LAB_0095431c;
        lVar1 = (long)pvVar4 - (long)param_4;
        if ((lVar1 != 0) &&
           (uVar3 = FUN_009350cc(param_1,*(undefined8 *)(param_2 + 8),param_3 & 0xffffff7f,param_4,
                                 lVar1), (int)uVar3 != 0)) {
          return uVar3;
        }
        bVar2 = false;
        param_4 = (char *)((long)pvVar4 + 1);
        param_5 = (param_5 - 1) - lVar1;
        *(undefined1 *)(lVar5 + 0x20) = 1;
      } while (param_5 != 0);
    }
    if ((param_3 >> 7 & 1) == 0) {
      return 0;
    }
    if (*(char *)(lVar5 + 0x20) == '\0') {
      uVar3 = *(undefined8 *)(param_2 + 8);
      param_5 = 0;
    }
    else {
      *(undefined1 *)(lVar5 + 0x20) = 0;
      param_4 = "\n";
      param_5 = 1;
      *(long *)(param_1 + 0x1108) = *(long *)(param_1 + 0x1108) + 1;
      uVar3 = *(undefined8 *)(param_2 + 8);
    }
  }
  uVar3 = FUN_009350cc(param_1,uVar3,param_3,param_4,param_5);
  return uVar3;
}

