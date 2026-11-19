/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b42888
 */

long ossl_prov_import_key(int *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  code *pcVar4;
  code *pcVar5;
  code *pcVar6;
  
  iVar2 = *param_1;
  piVar1 = param_1 + 2;
  while (iVar2 != 0) {
    if (iVar2 == 1) {
      pcVar4 = *(code **)piVar1;
      goto LAB_00b428d4;
    }
    iVar2 = piVar1[2];
    piVar1 = piVar1 + 4;
  }
  pcVar4 = (code *)0x0;
LAB_00b428d4:
  iVar2 = *param_1;
  piVar1 = param_1 + 2;
  do {
    if (iVar2 == 0) {
      pcVar5 = (code *)0x0;
LAB_00b42904:
      iVar2 = *param_1;
      piVar1 = param_1 + 2;
      while( true ) {
        if (iVar2 == 0) {
          return 0;
        }
        if (iVar2 == 0x28) break;
        iVar2 = piVar1[2];
        piVar1 = piVar1 + 4;
      }
      if (pcVar5 == (code *)0x0) {
        return 0;
      }
      if (pcVar4 == (code *)0x0) {
        return 0;
      }
      pcVar6 = *(code **)piVar1;
      if (pcVar6 == (code *)0x0) {
        return 0;
      }
      lVar3 = (*pcVar4)(param_2);
      if ((lVar3 == 0) || (iVar2 = (*pcVar6)(lVar3,param_3,param_4), iVar2 == 0)) {
        (*pcVar5)(lVar3);
        return 0;
      }
      return lVar3;
    }
    if (iVar2 == 10) {
      pcVar5 = *(code **)piVar1;
      goto LAB_00b42904;
    }
    iVar2 = piVar1[2];
    piVar1 = piVar1 + 4;
  } while( true );
}

