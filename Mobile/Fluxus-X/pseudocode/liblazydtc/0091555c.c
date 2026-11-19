/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091555c
 */

void curl_easy_escape(undefined8 param_1,byte *param_2,int param_3)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  uint uVar4;
  size_t sVar5;
  byte local_74 [4];
  undefined1 auStack_70 [36];
  undefined1 local_4c;
  char local_4b;
  char local_4a;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uVar3 = 0;
  if ((param_2 != (byte *)0x0) && (-1 < param_3)) {
    FUN_00904528(auStack_70,24000000);
    if (param_3 == 0) {
      sVar5 = strlen((char *)param_2);
      if (sVar5 == 0) {
        uVar3 = (*(code *)PTR_strdup_00cc4688)(&DAT_002ab32c);
        goto LAB_00915690;
      }
    }
    else {
      sVar5 = (size_t)param_3;
    }
    do {
      local_74[0] = *param_2;
      if (((((byte)((local_74[0] & 0xdf) + 0xbf) < 0x1a) ||
           (uVar4 = (uint)local_74[0], (uVar4 - 0x30 & 0xff) < 10)) || (uVar4 - 0x2d < 2)) ||
         ((uVar4 == 0x7e || (uVar4 == 0x5f)))) {
        iVar2 = FUN_009045fc(auStack_70,local_74,1);
      }
      else {
        local_4b = "0123456789ABCDEF"[local_74[0] >> 4];
        local_4a = "0123456789ABCDEF"[(ulong)local_74[0] & 0xf];
        local_4c = 0x25;
        iVar2 = FUN_009045fc(auStack_70,&local_4c,3);
      }
      if (iVar2 != 0) {
        uVar3 = 0;
        goto LAB_00915690;
      }
      sVar5 = sVar5 - 1;
      param_2 = param_2 + 1;
    } while (sVar5 != 0);
    uVar3 = FUN_00904974(auStack_70);
  }
LAB_00915690:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

