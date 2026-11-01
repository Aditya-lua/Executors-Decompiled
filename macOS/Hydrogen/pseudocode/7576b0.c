
void FUN_007576b0(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 uVar3;
  long *plVar4;
  int in_w9;
  long unaff_x19;
  
  if (in_w9 == 0) {
    return;
  }
  *(undefined4 *)(param_1 + 0x30) = 0;
  *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) & 0xffffffbf | 2;
  puVar1 = (undefined8 *)func_0x00740a58(unaff_x19 + 0xd98);
  if (puVar1 != (undefined8 *)0x0) {
    do {
      lVar2 = func_0x00156654(puVar1);
      if (*(int *)(lVar2 + 0x30) == 0) {
        if ((puVar1 != (undefined8 *)0x0) && (plVar4 = (long *)*puVar1, plVar4 != (long *)0x0)) {
          if ((undefined8 *)*plVar4 == puVar1) {
            lVar2 = puVar1[3];
            *plVar4 = lVar2;
            if (lVar2 == 0) {
              plVar4[1] = 0;
            }
            else {
              *(undefined8 *)(lVar2 + 0x10) = 0;
            }
          }
          else {
            lVar2 = puVar1[2];
            if (lVar2 != 0) {
              *(undefined8 *)(lVar2 + 0x18) = puVar1[3];
            }
            if (puVar1[3] == 0) {
              plVar4[1] = lVar2;
            }
            else {
              *(long *)(puVar1[3] + 0x10) = lVar2;
            }
          }
          plVar4[3] = plVar4[3] + -1;
          uVar3 = puVar1[1];
          puVar1[1] = 0;
          *puVar1 = 0;
          puVar1[3] = 0;
          puVar1[2] = 0;
          if ((code *)plVar4[2] != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x0075e678. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)plVar4[2])(0,uVar3);
            return;
          }
        }
        return;
      }
      puVar1 = (undefined8 *)func_0x006f4058();
    } while (puVar1 != (undefined8 *)0x0);
  }
  return;
}

