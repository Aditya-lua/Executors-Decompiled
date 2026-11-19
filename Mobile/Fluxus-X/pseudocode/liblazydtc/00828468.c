/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828468
 */

void FUN_00828468(ulong *param_1,undefined8 *param_2,undefined8 *param_3)

{
  ulong uVar1;
  size_t sVar2;
  char *pcVar3;
  undefined1 *puVar4;
  
  pcVar3 = (char *)*param_2;
  sVar2 = strlen(pcVar3);
  if (0xfffffffffffffff7 < sVar2) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (sVar2 < 0x17) {
    puVar4 = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)sVar2 << 1);
    if (sVar2 != 0) goto LAB_008284e0;
  }
  else {
    uVar1 = 0x1a;
    if ((sVar2 | 7) != 0x17) {
      uVar1 = (sVar2 | 7) + 1;
    }
    puVar4 = operator_new(uVar1);
    param_1[1] = sVar2;
    param_1[2] = (ulong)puVar4;
    *param_1 = uVar1 | 1;
LAB_008284e0:
    memmove(puVar4,pcVar3,sVar2);
  }
  puVar4[sVar2] = 0;
  pcVar3 = (char *)*param_3;
  sVar2 = strlen(pcVar3);
  if (0xfffffffffffffff7 < sVar2) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0082857c to 0082857f has its CatchHandler @ 00828580 */
    FUN_007fe124();
  }
  if (sVar2 < 0x17) {
    puVar4 = (undefined1 *)((long)param_1 + 0x19);
    *(char *)(param_1 + 3) = (char)((int)sVar2 << 1);
    if (sVar2 == 0) goto LAB_00828560;
  }
  else {
    uVar1 = 0x1a;
    if ((sVar2 | 7) != 0x17) {
      uVar1 = (sVar2 | 7) + 1;
    }
                    /* try { // try from 00828538 to 0082853f has its CatchHandler @ 00828580 */
    puVar4 = operator_new(uVar1);
    param_1[4] = sVar2;
    param_1[5] = (ulong)puVar4;
    param_1[3] = uVar1 | 1;
  }
  memmove(puVar4,pcVar3,sVar2);
LAB_00828560:
  puVar4[sVar2] = 0;
  return;
}

