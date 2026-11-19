/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00922e7c
 */

void FUN_00922e7c(byte *param_1,long param_2,undefined8 param_3,undefined1 *param_4)

{
  byte bVar1;
  long lVar2;
  undefined1 uVar3;
  undefined8 uVar4;
  byte *pbVar5;
  uint uVar6;
  undefined2 local_70;
  char local_6e;
  undefined2 local_6c;
  undefined1 local_6a;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if (param_2 == 0) {
    uVar4 = 0;
  }
  else {
    do {
      bVar1 = *param_1;
      if (((byte)((bVar1 & 0xdf) + 0xbf) < 0x1a) || ((byte)(bVar1 - 0x30) < 10)) {
LAB_00923040:
        uVar4 = 1;
        pbVar5 = param_1;
LAB_0092304c:
        uVar4 = FUN_009045fc(param_3,pbVar5,uVar4);
joined_r0x00923054:
        param_2 = param_2 + -1;
      }
      else {
        if (0x5e < bVar1) {
          if ((bVar1 == 0x7e) || (bVar1 == 0x5f)) goto LAB_00923040;
LAB_00922ed8:
          local_6e = '\0';
          local_70 = 0x25;
          bVar1 = *param_1;
          if (param_4 == (undefined1 *)0x0) {
            if (bVar1 == 0x2f) goto LAB_00923040;
LAB_00922f18:
            uVar4 = 3;
            local_70 = CONCAT11("0123456789ABCDEF"[bVar1 >> 4],0x25);
            local_6e = "0123456789ABCDEF"[(ulong)*param_1 & 0xf];
            pbVar5 = (byte *)&local_70;
            goto LAB_0092304c;
          }
          if (bVar1 != 0x3d) goto LAB_00922f18;
          uVar4 = FUN_009045fc(param_3,param_1,1);
          *param_4 = 1;
          goto joined_r0x00923054;
        }
        if (bVar1 - 0x2d < 2) goto LAB_00923040;
        if (bVar1 != 0x25) goto LAB_00922ed8;
        if ((9 < param_1[1] - 0x30) &&
           ((uVar6 = param_1[1] - 0x41, 0x25 < uVar6 ||
            ((1L << ((ulong)uVar6 & 0x3f) & 0x3f0000003fU) == 0)))) {
LAB_00922f44:
          uVar4 = 3;
          pbVar5 = &DAT_002a9588;
          goto LAB_0092304c;
        }
        uVar6 = (uint)param_1[2];
        if ((9 < uVar6 - 0x30) &&
           ((uVar6 = uVar6 - 0x41, 0x25 < uVar6 ||
            ((1L << ((ulong)uVar6 & 0x3f) & 0x3f0000003fU) == 0)))) goto LAB_00922f44;
        local_6a = 0;
        local_6c = 0x25;
        uVar3 = FUN_009416cc(param_1[1]);
        local_6c = CONCAT11(uVar3,(undefined1)local_6c);
        local_6a = FUN_009416cc(param_1[2]);
        uVar4 = FUN_009045fc(param_3,&local_6c,3);
        param_2 = param_2 + -3;
        param_1 = param_1 + 2;
      }
    } while ((param_2 != 0) && (param_1 = param_1 + 1, (int)uVar4 == 0));
  }
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

