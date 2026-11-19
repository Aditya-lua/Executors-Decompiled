/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090c944
 */

undefined8 FUN_0090c944(long *param_1,long param_2,undefined1 *param_3)

{
  long lVar1;
  int iVar2;
  int *piVar3;
  undefined1 auStack_438 [1024];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((*(byte *)((long)param_1 + 0x24) & 1) != 0) {
    piVar3 = (int *)param_1[2];
    if ((((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
        ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) &&
       (0 < *(int *)(*param_1 + 0xc))) {
      FUN_00904ddc(param_2,param_1,"cf_socket_shutdown(%d)",piVar3[0x26]);
    }
    if (((piVar3[0x26] != -1) && (*piVar3 == 3)) &&
       (iVar2 = FUN_009308ec(piVar3[0x26],1), -1 < iVar2)) {
      recv(piVar3[0x26],auStack_438,0x400,0);
    }
  }
  *param_3 = 1;
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

