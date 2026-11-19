/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924ccc
 */

int FUN_00924ccc(long param_1,ulong param_2,long param_3)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  byte bVar5;
  long lVar6;
  bool bVar7;
  int iVar8;
  byte *pbVar9;
  uint uVar10;
  long lVar11;
  undefined1 auStack_80 [24];
  undefined8 local_68;
  undefined8 uStack_60;
  long local_58;
  
  lVar6 = tpidr_el0;
  local_58 = *(long *)(lVar6 + 0x28);
  bVar7 = (param_2 & 1) == 0;
  lVar11 = *(long *)(param_1 + 0x20);
  lVar1 = lVar11 + 0x410;
  lVar2 = lVar11 + 0x3f8;
  lVar3 = lVar1;
  if (bVar7) {
    lVar3 = lVar2;
  }
  lVar4 = 0x3f4;
  if (bVar7) {
    lVar4 = 0x3f0;
  }
  iVar8 = curl_strnequal(param_3,&DAT_002cadad,4);
  if (iVar8 != 0) {
    pbVar9 = (byte *)(param_3 + 4);
    do {
      bVar5 = *pbVar9;
      if ((bVar5 != 9) && (bVar5 != 0x20)) {
        uVar10 = (uint)bVar5;
        if (uVar10 == 0) goto LAB_00924dc4;
        if (3 < uVar10 - 10) goto code_r0x00924d64;
      }
      pbVar9 = pbVar9 + 1;
    } while( true );
  }
  iVar8 = 0;
  goto LAB_00924eb0;
code_r0x00924d64:
  if (uVar10 != 0) {
    iVar8 = FUN_0091e5b8(pbVar9,&uStack_60,&local_68);
    if (iVar8 == 0) {
      FUN_00925214(auStack_80);
      FUN_0092525c(auStack_80,uStack_60,local_68,curl_free);
      iVar8 = FUN_00966ec0(param_1,auStack_80,lVar3);
      FUN_00925220(auStack_80);
      if (iVar8 == 0) {
        *(undefined4 *)(lVar11 + lVar4) = 2;
      }
    }
    goto LAB_00924eb0;
  }
LAB_00924dc4:
  iVar8 = *(int *)(lVar11 + lVar4);
  if (iVar8 == 0) {
LAB_00924e1c:
    iVar8 = 0;
    *(undefined4 *)(lVar11 + lVar4) = 1;
  }
  else {
    if (iVar8 == 3) {
      if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"NTLM handshake rejected");
      }
      FUN_00967198(lVar2);
      FUN_00967198(lVar1);
      *(undefined4 *)(lVar11 + lVar4) = 0;
    }
    else {
      if (iVar8 == 4) {
        if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"NTLM auth restarted");
        }
        FUN_00967198(lVar2);
        FUN_00967198(lVar1);
        goto LAB_00924e1c;
      }
      if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"NTLM handshake failure (internal error)");
      }
    }
    iVar8 = 9;
  }
LAB_00924eb0:
  if (*(long *)(lVar6 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar8;
}

