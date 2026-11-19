/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844e3c
 */

char * FUN_00844e3c(long param_1,char *param_2,char *param_3)

{
  char cVar1;
  bool bVar2;
  char *pcVar3;
  undefined8 uVar4;
  long lVar5;
  void *unaff_x21;
  char *pcVar6;
  
  if ((param_2 == param_3) || (*param_2 != '[')) {
    return param_2;
  }
  if (param_2 + 1 != param_3) {
    cVar1 = param_2[1];
    pcVar3 = param_2 + 2;
    if (cVar1 != '^') {
      pcVar3 = param_2 + 1;
    }
    unaff_x21 = operator_new(0xa8);
                    /* try { // try from 00844ea8 to 00844eb7 has its CatchHandler @ 00844f88 */
    FUN_00846298(unaff_x21,param_1,*(undefined8 *)(*(long *)(param_1 + 0x38) + 8),cVar1 == '^',
                 *(uint *)(param_1 + 0x18) & 1,*(uint *)(param_1 + 0x18) >> 3 & 1);
    lVar5 = *(long *)(param_1 + 0x38);
    *(void **)(param_1 + 0x38) = unaff_x21;
    *(void **)(lVar5 + 8) = unaff_x21;
    if (pcVar3 != param_3) {
      if (((*(ushort *)(param_1 + 0x18) & 0x1f0) != 0) && (*pcVar3 == ']')) {
        FUN_0084612c(unaff_x21,0x5d);
        pcVar3 = pcVar3 + 1;
      }
      pcVar6 = pcVar3;
      if (pcVar3 != param_3) {
        do {
          pcVar3 = (char *)FUN_00847690(param_1,pcVar6,param_3,unaff_x21);
          bVar2 = pcVar3 != pcVar6;
          pcVar6 = pcVar3;
        } while (bVar2);
      }
      if (pcVar3 != param_3) {
        if (*pcVar3 == '-') {
          FUN_0084612c(unaff_x21,0x2d);
          pcVar3 = pcVar3 + 1;
        }
        if ((pcVar3 != param_3) && (*pcVar3 == ']')) {
          return pcVar3 + 1;
        }
      }
    }
  }
  uVar4 = FUN_00847644();
                    /* catch() { ... } // from try @ 00844ea8 with catch @ 00844f88 */
  operator_delete(unaff_x21,0xa8);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar4);
}

