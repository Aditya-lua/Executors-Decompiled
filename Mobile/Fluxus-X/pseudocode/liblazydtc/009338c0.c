/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009338c0
 */

int FUN_009338c0(long param_1,undefined8 param_2,byte param_3)

{
  int iVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x1a0);
  iVar1 = FUN_0091973c(param_1,param_2,*(int *)(param_1 + 0x9e0) == 0xb | param_3 & 1);
  if ((plVar2 != (long *)0x0) && (iVar1 == 0 && (int)param_2 == 0)) {
    if ((*plVar2 == plVar2[1]) || (*(int *)(param_1 + 0x9e0) == 0xb)) {
      if ((((*(int *)(param_1 + 0x9e0) == 0xb) &&
           (*(int *)(*(long *)(param_1 + 0x20) + 0x448) == -1)) &&
          ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Got an RTP Receive with a CSeq of %ld",plVar2[1]);
      }
    }
    else {
      FUN_00904b80(param_1,"The CSeq of this request %ld did not match the response %ld");
      iVar1 = 0x55;
    }
  }
  return iVar1;
}

