/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009027c4
 */

/* WARNING: Removing unreachable block (ram,0x00902838) */
/* WARNING: Heritage AFTER dead removal. Example location: s0xffffffffffffff88 : 0x00902844 */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

void curl_easy_getinfo(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined8 local_78;
  
  lVar1 = tpidr_el0;
  lVar2 = *(long *)(lVar1 + 0x28);
  FUN_00915d74(param_1,param_2,local_78);
  if (*(long *)(lVar1 + 0x28) != lVar2) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

