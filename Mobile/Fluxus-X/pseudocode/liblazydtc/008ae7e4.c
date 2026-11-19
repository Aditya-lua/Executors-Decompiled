/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ae7e4
 */

undefined8 FUN_008ae7e4(long param_1,uint param_2)

{
  uint uVar1;
  double *pdVar2;
  long lVar3;
  
  if (0 < (int)param_2) {
    lVar3 = *(long *)(param_1 + 0x60);
    pdVar2 = (double *)FUN_008bb19c(*(undefined8 *)(lVar3 + 0x620));
    uVar1 = *(uint *)(lVar3 + 0x630);
    *(undefined4 *)((long)pdVar2 + 0xc) = 3;
    *pdVar2 = (double)(uVar1 & 0xfffffff);
    *(uint *)(lVar3 + 0x630) = *(uint *)(lVar3 + 0x630) & 0xf0000000 | param_2 & 0xfffffff;
  }
  return 0xffffffff;
}

