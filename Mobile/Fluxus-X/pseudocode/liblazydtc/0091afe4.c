/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091afe4
 */

int FUN_0091afe4(long param_1,undefined8 param_2)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined4 local_d0;
  undefined4 local_cc;
  undefined4 uStack_c8;
  undefined4 local_c4;
  int iStack_c0;
  int local_bc;
  int iStack_b8;
  undefined1 auStack_98 [80];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (*(char *)(param_1 + 0x528) == '\0') {
    iVar3 = 0;
  }
  else {
    iVar3 = FUN_00931434(*(undefined8 *)(param_1 + 0x520),&local_d0);
    if (iVar3 == 0) {
      uVar1 = *(byte *)(param_1 + 0x528) - 1;
      if (uVar1 < 3) {
        uVar5 = -((ulong)(uVar1 >> 7) & 1) & 0xfffffffffffff800 | ((ulong)uVar1 & 0xff) << 3;
        uVar6 = *(undefined8 *)((long)&PTR_s_If_Modified_Since_00c4f510 + uVar5);
        lVar4 = FUN_00941e8c(param_1,uVar6,*(undefined8 *)(&DAT_00746aa0 + uVar5));
        iVar3 = 0;
        if (lVar4 == 0) {
          lVar4 = 6;
          if (iStack_b8 != 0) {
            lVar4 = (long)iStack_b8 + -1;
          }
          curl_msnprintf(auStack_98,0x50,"%s: %s, %02d %s %4d %02d:%02d:%02d GMT\r\n",uVar6,
                         (&PTR_DAT_00c4f930)[lVar4],local_c4,(&PTR_DAT_00c4f968)[iStack_c0],
                         local_bc + 0x76c,uStack_c8,local_cc,local_d0);
          iVar3 = FUN_00904728(param_2,auStack_98);
        }
      }
      else {
        iVar3 = 0x2b;
      }
    }
    else {
      FUN_00904b80(param_1,"Invalid TIMEVALUE");
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

