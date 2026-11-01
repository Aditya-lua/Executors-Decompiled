
undefined4 FUN_0072dbcc(undefined8 param_1,undefined8 param_2)

{
  char *pcVar1;
  int iVar2;
  long lVar3;
  undefined4 uVar4;
  long *unaff_x19;
  long *unaff_x20;
  char *unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  char *pcVar5;
  
  iVar2 = _strncmp(param_1,param_2,5);
  if (iVar2 == 0) {
    if (unaff_x21[5] != '\0') {
      lVar3 = func_0x0077e93c(unaff_x21 + 5,unaff_x22 + -5);
      *unaff_x20 = lVar3;
LAB_0072dc40:
      uVar4 = 0x1b;
      if (lVar3 != 0) {
        uVar4 = 0;
      }
      return uVar4;
    }
  }
  else {
    iVar2 = _strncmp(&UNK_008ccd61);
    if (iVar2 == 0) {
      pcVar1 = unaff_x21 + 7;
      lVar3 = _memchr(pcVar1,0x21,unaff_x22 + -7);
      if (lVar3 != 0) {
        pcVar5 = (char *)(lVar3 + 1);
        if (*pcVar5 != '\0') {
          lVar3 = func_0x0077e93c(pcVar1,lVar3 - (long)pcVar1);
          *unaff_x19 = lVar3;
          if (lVar3 == 0) {
            return 0x1b;
          }
          lVar3 = func_0x0077e93c(pcVar5,pcVar1 + ((unaff_x22 + -7) - (long)pcVar5));
          *unaff_x20 = lVar3;
          if (lVar3 == 0) {
            (*pcRam0000000000a2b5f0)(*unaff_x19);
            *unaff_x19 = 0;
            return 0x1b;
          }
          return 0;
        }
      }
    }
    else if (*unaff_x21 != '\0') {
      lVar3 = func_0x0077e93c();
      *unaff_x23 = lVar3;
      goto LAB_0072dc40;
    }
  }
  return 0x2b;
}

