/* 7ff70c9910a0 FUN_7ff70c9910a0 */

void FUN_7ff70c9910a0(undefined8 *param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  longlong lVar3;
  undefined8 uVar4;
  
  if ((param_1 == (undefined8 *)0x0) || (param_1[3] == 0)) {
    return;
  }
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 == (undefined8 *)0x0) {
    do {
                    /* WARNING: Do nothing block with infinite loop */
    } while( true );
  }
  do {
    if (puVar1 != (undefined8 *)0x0) {
      if (puVar1 == (undefined8 *)*param_1) {
        puVar2 = (undefined8 *)puVar1[2];
        *param_1 = puVar2;
LAB_7ff70c991127:
        uVar4 = 0;
      }
      else {
        puVar2 = (undefined8 *)puVar1[2];
        if (puVar1[1] == 0) goto LAB_7ff70c991127;
        *(undefined8 **)(puVar1[1] + 0x10) = puVar2;
        uVar4 = puVar1[1];
      }
      if (puVar2 == (undefined8 *)0x0) {
        puVar2 = param_1;
      }
      puVar2[1] = uVar4;
      *puVar1 = 0;
      puVar1[1] = 0;
      puVar1[2] = 0;
      lVar3 = param_1[3] + -1;
      param_1[3] = lVar3;
      if ((code *)param_1[2] != (code *)0x0) {
        (*(code *)param_1[2])(param_2);
        lVar3 = param_1[3];
      }
      if (lVar3 == 0) {
        return;
      }
    }
    puVar1 = (undefined8 *)param_1[1];
  } while( true );
}


