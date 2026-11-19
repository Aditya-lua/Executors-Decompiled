/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089c9e8
 */

void FUN_0089c9e8(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  
  iVar1 = *(int *)(param_2 + 8);
  do {
    if ((param_2 != 0) && (iVar1 == DAT_00d1b010)) {
      FUN_00894dec(param_1 + 0x10,param_2 + 0x20);
      return;
    }
    if ((iVar1 == DAT_00d1afc0 || iVar1 == DAT_00d1b0b0) || iVar1 == DAT_00d1b0e0) {
      lVar3 = 0x20;
    }
    else {
      if (iVar1 == DAT_00d1b0c0) {
        lVar3 = 0x40;
        lVar2 = 0x30;
      }
      else {
        if ((iVar1 != DAT_00d1b0a0) || ((*(uint *)(param_2 + 0x1c) & 0xfffffffe) != 0xe)) {
          return;
        }
        lVar3 = 0x28;
        lVar2 = 0x20;
      }
      FUN_0089c9e8(param_1,*(undefined8 *)(param_2 + lVar2));
    }
    param_2 = *(long *)(param_2 + lVar3);
    iVar1 = *(int *)(param_2 + 8);
  } while( true );
}

