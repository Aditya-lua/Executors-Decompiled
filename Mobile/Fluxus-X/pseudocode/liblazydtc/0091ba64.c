/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091ba64
 */

int FUN_0091ba64(long param_1,undefined8 param_2,uint param_3)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (((*(byte *)(param_1 + 0x1b2) >> 5 & 1) != 0) && (iVar3 = FUN_00924224(param_1), iVar3 != 0))
  goto LAB_0091bd10;
  lVar5 = FUN_00935f5c(param_1);
  uVar4 = 0;
  if (param_3 - 1 < 4) {
    if ((((-1 < lVar5) && ((*(uint *)(param_1 + 0x1b1) >> 0xd & 1) == 0)) &&
        (((*(uint *)(param_1 + 0x1b1) >> 0x10 & 1) != 0 ||
         (lVar6 = FUN_00941e8c(param_1,"Content-Length",0xe), lVar6 == 0)))) &&
       (iVar3 = FUN_009048cc(param_2,"Content-Length: %ld\r\n",lVar5), iVar3 != 0))
    goto LAB_0091bd10;
    if (((param_3 | 1) == 3) && (*(long *)(param_1 + 0x11d0) != 0)) {
      for (puVar8 = *(undefined8 **)(*(long *)(param_1 + 0x11d0) + 0x48);
          puVar8 != (undefined8 *)0x0; puVar8 = (undefined8 *)puVar8[1]) {
        iVar3 = FUN_009048cc(param_2,&DAT_002d0df4,*puVar8);
        if (iVar3 != 0) goto LAB_0091bd10;
      }
    }
    if (((param_3 == 1) && (lVar6 = FUN_00941e8c(param_1,"Content-Type",0xc), lVar6 == 0)) &&
       (iVar3 = FUN_009045fc(param_2,"Content-Type: application/x-www-form-urlencoded\r\n",0x31),
       iVar3 != 0)) goto LAB_0091bd10;
    uVar4 = 0;
    if (*(int *)(param_1 + 300) == 0) {
      lVar6 = FUN_00941e8c(param_1,"Expect",6);
      if (lVar6 == 0) {
        uVar4 = 0;
        if ((-1 < *(char *)(param_1 + 0x131c)) && (uVar4 = 0, *(char *)(param_1 + 0x1319) != '\n'))
        {
          uVar4 = 0;
          bVar1 = *(byte *)(*(long *)(param_1 + 0x20) + 0x574);
          if (bVar1 != 10) {
            if (bVar1 < 0x14) {
              uVar4 = 0;
              if (*(char *)(param_1 + 0x1318) != '\x01') {
                uVar7 = FUN_00935f78(param_1);
                uVar4 = 0;
                if (0x100000 < uVar7) {
                  iVar3 = FUN_009045fc(param_2,"Expect: 100-continue\r\n",0x16);
                  if (iVar3 != 0) goto LAB_0091bd10;
                  uVar4 = 1;
                }
              }
            }
            else {
              uVar4 = 0;
            }
          }
        }
      }
      else {
        uVar4 = FUN_0091a870(lVar6,"Expect:",7,"100-continue",0xc);
        uVar4 = uVar4 & 1;
      }
    }
  }
  iVar3 = FUN_009045fc(param_2,&DAT_002b917a,2);
  if (iVar3 == 0) {
    FUN_00931c50(param_1,lVar5);
    if (uVar4 != 0) {
      local_60 = 0;
      iVar3 = FUN_009356e0(&local_60,param_1,&PTR_s_cr_exp100_00c4f4b0,2);
      if ((iVar3 != 0) || (iVar3 = FUN_00935a68(param_1,local_60), iVar3 != 0)) {
        if (local_60 != 0) {
          FUN_0093578c(param_1);
        }
        goto LAB_0091bd10;
      }
      *(undefined4 *)(*(long *)(local_60 + 0x10) + 0x30) = 2;
    }
    FUN_00943380(param_1,3,0xffffffffffffffff,1);
    iVar3 = 0;
  }
LAB_0091bd10:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

