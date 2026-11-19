/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b79454
 */

void mbedtls_md_hmac_finish(long *param_1,undefined8 param_2)

{
  byte bVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined1 auStack_88 [64];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (((param_1 == (long *)0x0) || (*param_1 == 0)) || (lVar4 = param_1[2], lVar4 == 0)) {
    uVar3 = 0xffffaf00;
  }
  else {
    bVar1 = *(byte *)(*param_1 + 5);
    uVar3 = mbedtls_md_finish(param_1,auStack_88);
    if ((((int)uVar3 == 0) && (uVar3 = mbedtls_md_starts(param_1), (int)uVar3 == 0)) &&
       ((uVar3 = mbedtls_md_update(param_1,lVar4 + (ulong)bVar1,*(undefined1 *)(*param_1 + 5)),
        (int)uVar3 == 0 &&
        (uVar3 = mbedtls_md_update(param_1,auStack_88,*(undefined1 *)(*param_1 + 4)),
        (int)uVar3 == 0)))) {
      uVar3 = mbedtls_md_finish(param_1,param_2);
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

