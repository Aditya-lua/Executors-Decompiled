/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094152c
 */

undefined8 * FUN_0094152c(long param_1,int param_2,long param_3,long *param_4)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  
  if (param_3 == 0) {
    puVar1 = (undefined8 *)0x0;
    puVar3 = (undefined8 *)0x0;
  }
  else {
    puVar1 = (undefined8 *)FUN_00941308(0,0);
    lVar2 = puVar1[4];
    if ((param_1 < lVar2) || ((param_1 <= lVar2 && (param_2 < *(int *)(puVar1 + 5))))) {
      puVar3 = puVar1;
      puVar1 = (undefined8 *)0x0;
    }
    else {
      puVar3 = (undefined8 *)puVar1[2];
      if (puVar3 == puVar1) {
        puVar3 = (undefined8 *)puVar1[1];
      }
      else {
        lVar2 = puVar1[4];
        puVar3[5] = puVar1[5];
        puVar3[4] = lVar2;
        uVar4 = *puVar1;
        puVar3[1] = puVar1[1];
        *puVar3 = uVar4;
        puVar3[3] = puVar1[3];
        *(undefined8 **)(puVar1[3] + 0x10) = puVar3;
      }
    }
  }
  *param_4 = (long)puVar1;
  return puVar3;
}

