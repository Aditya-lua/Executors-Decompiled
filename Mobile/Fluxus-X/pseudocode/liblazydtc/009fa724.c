/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fa724
 */

undefined8 FUN_009fa724(BIO *param_1,long param_2,ulong param_3,long *param_4)

{
  char cVar1;
  int iVar2;
  long *plVar3;
  BIO *pBVar4;
  size_t sVar5;
  ulong uVar6;
  undefined8 uVar7;
  char *__s;
  long local_68;
  
  plVar3 = (long *)BIO_get_data();
  if (plVar3 == (long *)0x0) {
LAB_009fa870:
    uVar7 = 0;
  }
  else {
    if ((((char *)*plVar3 == (char *)0x0) || (*(char *)*plVar3 == '\0')) && ((int)plVar3[1] == 0)) {
      if (param_3 != 0) {
        *(uint *)((long)plVar3 + 0xc) = (uint)(*(char *)(param_2 + param_3 + -1) == '\n');
      }
      pBVar4 = BIO_next(param_1);
      uVar7 = BIO_write_ex(pBVar4,param_2,param_3,param_4);
      return uVar7;
    }
    uVar7 = 1;
    *param_4 = 0;
    if (param_3 != 0) {
      do {
        if (*(int *)((long)plVar3 + 0xc) != 0) {
          if (*plVar3 != 0) {
            pBVar4 = BIO_next(param_1);
            __s = (char *)*plVar3;
            sVar5 = strlen(__s);
            iVar2 = BIO_write_ex(pBVar4,__s,sVar5,&local_68);
            if (iVar2 == 0) goto LAB_009fa870;
          }
          pBVar4 = BIO_next(param_1);
          BIO_printf(pBVar4,"%*s",(ulong)*(uint *)(plVar3 + 1),&DAT_002ab32c);
          *(undefined4 *)((long)plVar3 + 0xc) = 0;
        }
        uVar6 = 0;
        do {
          cVar1 = *(char *)(param_2 + uVar6);
          if (cVar1 == '\n') break;
          uVar6 = uVar6 + 1;
        } while (uVar6 < param_3);
        if (cVar1 == '\n') {
          uVar6 = uVar6 + 1;
        }
        while (uVar6 != 0) {
          local_68 = 0;
          pBVar4 = BIO_next(param_1);
          iVar2 = BIO_write_ex(pBVar4,param_2,uVar6,&local_68);
          if (iVar2 == 0) goto LAB_009fa870;
          param_2 = param_2 + local_68;
          param_3 = param_3 - local_68;
          uVar6 = uVar6 - local_68;
          *param_4 = *param_4 + local_68;
        }
        if (cVar1 == '\n') {
          *(undefined4 *)((long)plVar3 + 0xc) = 1;
        }
      } while (param_3 != 0);
      uVar7 = 1;
    }
  }
  return uVar7;
}

