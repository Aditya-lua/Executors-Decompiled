/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932ef0
 */

void FUN_00932ef0(long param_1)

{
  uint *puVar1;
  long lVar2;
  char *pcVar3;
  uint uVar4;
  
  puVar1 = (uint *)(param_1 + 0x1b1);
  uVar4 = *puVar1;
  *puVar1 = uVar4 | 0x80;
  *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) & 0xffffffbd;
  FUN_00936078(param_1,uVar4 >> 8 & 1);
  if ((*puVar1 >> 8 & 1) == 0) {
    if (*(long *)(param_1 + 0xf0) == 0) {
      if ((((*puVar1 >> 3 & 1) != 0) || ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0)) ||
         ((*(long *)(param_1 + 0x12a0) != 0 && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))))
      goto LAB_00933004;
      lVar2 = FUN_00935f5c(param_1);
      pcVar3 = "Request completely sent off";
      if (lVar2 != 0) {
        pcVar3 = "We are completely uploaded and fine";
      }
      goto LAB_00932ffc;
    }
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) ||
       ((*(long *)(param_1 + 0x12a0) != 0 && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))))
    goto LAB_00933004;
    pcVar3 = "upload completely sent off: %ld bytes";
  }
  else {
    uVar4 = (uint)*(undefined8 *)(param_1 + 0xa82);
    if (*(long *)(param_1 + 0xf0) == 0) {
      if (((uVar4 >> 0x1c & 1) == 0) ||
         ((*(long *)(param_1 + 0x12a0) != 0 && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))))
      goto LAB_00933004;
      pcVar3 = "abort upload";
LAB_00932ffc:
      FUN_00904c98(param_1,pcVar3);
      goto LAB_00933004;
    }
    if (((uVar4 >> 0x1c & 1) == 0) ||
       ((*(long *)(param_1 + 0x12a0) != 0 && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))))
    goto LAB_00933004;
    pcVar3 = "abort upload after having sent %ld bytes";
  }
  FUN_00904c98(param_1,pcVar3);
LAB_00933004:
  FUN_009435e4(param_1);
  return;
}

