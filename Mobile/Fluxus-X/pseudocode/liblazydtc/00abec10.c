/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abec10
 */

/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00abec10(BIO *param_1,long *******param_2,int param_3,uint *param_4,byte *param_5)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  bool bVar6;
  uint uVar7;
  long ******pppppplVar8;
  undefined8 uVar9;
  char *pcVar10;
  undefined8 local_60;
  long *******local_58;
  
  uVar1 = *param_4;
  uVar7 = (uint)*(undefined8 *)param_5;
  if ((uVar7 >> 7 & 1) == 0) {
    uVar9 = 0;
  }
  else {
    lVar4 = (**(code **)(param_4 + 8))();
    uVar9 = *(undefined8 *)(lVar4 + 0x30);
    uVar7 = (uint)*(undefined8 *)param_5;
  }
  pcVar10 = (char *)0x0;
  if ((uVar7 >> 6 & 1) == 0) {
    pcVar10 = *(char **)(param_4 + 6);
  }
  if ((uVar1 >> 0xc & 1) != 0) {
    local_58 = param_2;
    param_2 = (long *******)&local_58;
  }
  if ((uVar1 & 6) == 0) {
    uVar5 = (**(code **)(param_4 + 8))();
    uVar9 = FUN_00abe428(param_1,param_2,param_3,uVar5,pcVar10,uVar9,0,param_5);
    return uVar9;
  }
  if (pcVar10 != (char *)0x0) {
    if ((uVar7 >> 2 & 1) == 0) {
      iVar2 = BIO_printf(param_1,"%*s%s:\n",param_3,"",pcVar10);
    }
    else {
      pcVar10 = "SEQUENCE";
      if ((uVar1 & 2) != 0) {
        pcVar10 = "SET";
      }
      iVar2 = BIO_printf(param_1,"%*s%s OF %s {\n",param_3,"",pcVar10,*(char **)(param_4 + 6));
    }
    if (iVar2 < 1) {
      return 0;
    }
  }
  pppppplVar8 = *param_2;
  iVar2 = OPENSSL_sk_num(pppppplVar8);
  if (iVar2 < 1) {
    pcVar10 = "ABSENT";
    if (pppppplVar8 != (long ******)0x0) {
      pcVar10 = "EMPTY";
    }
    iVar2 = BIO_printf(param_1,"%*s<%s>\n",param_3 + 2,"",pcVar10);
    if (iVar2 < 1) {
      return 0;
    }
  }
  else {
    iVar2 = 0;
    bVar6 = true;
    do {
      if ((!bVar6) && (iVar3 = BIO_puts(param_1,"\n"), iVar3 < 1)) {
        return 0;
      }
      local_60 = OPENSSL_sk_value(pppppplVar8,iVar2);
      uVar9 = (**(code **)(param_4 + 8))();
      uVar9 = FUN_00abe428(param_1,&local_60,param_3 + 2,uVar9,0,0,1,param_5);
      if ((int)uVar9 == 0) {
        return uVar9;
      }
      iVar2 = iVar2 + 1;
      iVar3 = OPENSSL_sk_num(pppppplVar8);
      bVar6 = false;
    } while (iVar2 < iVar3);
  }
  if (((*param_5 >> 1 & 1) == 0) || (iVar2 = BIO_printf(param_1,"%*s}\n",param_3,""), 0 < iVar2)) {
    return 1;
  }
  return 0;
}

