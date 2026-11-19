/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00842620
 */

char * FUN_00842620(long param_1,char *param_2,char *param_3)

{
  char *pcVar1;
  char *pcVar2;
  char *pcVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  
  lVar8 = *(long *)(param_1 + 0x38);
  pcVar1 = (char *)FUN_0084a6c4();
  if (pcVar1 != param_2) {
    do {
      pcVar3 = pcVar1;
      pcVar1 = (char *)FUN_0084a6c4(param_1,pcVar3,param_3);
    } while (pcVar1 != pcVar3);
    if (pcVar3 != param_2) {
      while( true ) {
        if ((pcVar3 == param_3) || (*pcVar3 != '|')) {
          return pcVar3;
        }
        pcVar1 = pcVar3 + 1;
        lVar9 = *(long *)(param_1 + 0x38);
        pcVar2 = (char *)FUN_0084a6c4(param_1,pcVar1,param_3);
        if (pcVar2 == pcVar1) break;
        do {
          pcVar3 = pcVar2;
          pcVar2 = (char *)FUN_0084a6c4(param_1,pcVar3,param_3);
        } while (pcVar2 != pcVar3);
        if (pcVar3 == pcVar1) break;
        puVar4 = operator_new(0x18);
        uVar5 = *(undefined8 *)(lVar9 + 8);
        uVar6 = *(undefined8 *)(lVar8 + 8);
        *puVar4 = &PTR_LAB_00c49070;
        puVar4[1] = uVar6;
        puVar4[2] = uVar5;
        *(undefined8 **)(lVar8 + 8) = puVar4;
        *(undefined8 *)(lVar9 + 8) = 0;
        puVar4 = operator_new(0x10);
        lVar7 = *(long *)(param_1 + 0x38);
        *puVar4 = &PTR_LAB_00c48b00;
        puVar4[1] = *(undefined8 *)(lVar7 + 8);
        *(undefined8 **)(lVar9 + 8) = puVar4;
        *(undefined8 *)(lVar7 + 8) = 0;
        puVar4 = operator_new(0x10);
        uVar5 = *(undefined8 *)(lVar9 + 8);
        *puVar4 = &PTR_LAB_00c490b8;
        puVar4[1] = uVar5;
        *(undefined8 **)(lVar7 + 8) = puVar4;
        *(undefined8 *)(param_1 + 0x38) = *(undefined8 *)(lVar9 + 8);
      }
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_0084a030();
}

