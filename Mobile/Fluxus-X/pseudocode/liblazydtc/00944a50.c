/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00944a50
 */

void FUN_00944a50(long param_1,long param_2)

{
  long lVar1;
  undefined4 uVar2;
  long lVar3;
  undefined8 uVar4;
  char *pcVar5;
  undefined1 auStack_7c [4];
  undefined1 auStack_78 [2];
  undefined1 auStack_76 [2];
  undefined1 auStack_74 [2];
  undefined1 auStack_72 [2];
  undefined1 auStack_70 [2];
  undefined1 auStack_6e [2];
  undefined1 auStack_6c [2];
  undefined1 auStack_6a [2];
  undefined1 auStack_68 [2];
  undefined1 auStack_66 [2];
  undefined1 auStack_64 [2];
  undefined1 auStack_62 [2];
  undefined1 auStack_60 [2];
  undefined1 auStack_5e [6];
  undefined1 local_58;
  undefined1 local_57;
  undefined1 local_56;
  undefined1 local_55;
  undefined1 local_54;
  undefined1 local_53;
  undefined1 local_52;
  undefined1 local_51;
  undefined1 local_50;
  undefined1 local_4f;
  undefined1 local_4e;
  undefined1 local_4d;
  undefined1 local_4c;
  undefined1 local_4b;
  undefined1 local_4a;
  undefined1 local_49;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (*(long *)(param_1 + 0x12f0) == 0) {
    uVar4 = 0;
    *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 0;
  }
  else {
    lVar3 = FUN_00944f28(&PTR_LAB_00c50308);
    if (lVar3 == 0) {
      uVar4 = 0x1b;
    }
    else {
      pcVar5 = *(char **)(param_2 + 0x500);
      strlen(pcVar5);
      uVar2 = FUN_00963a64();
      FUN_00944fc4(lVar3,pcVar5,uVar2);
      pcVar5 = *(char **)(param_2 + 0x1d0);
      strlen(pcVar5);
      uVar2 = FUN_00963a64();
      FUN_00944fc4(lVar3,pcVar5,uVar2);
      FUN_00944fe4(lVar3,&local_58);
      curl_msnprintf(auStack_7c,3,&DAT_002d74c4,local_58);
      curl_msnprintf((ulong)auStack_7c | 2,3,&DAT_002d74c4,local_57);
      curl_msnprintf(auStack_78,3,&DAT_002d74c4,local_56);
      curl_msnprintf(auStack_76,3,&DAT_002d74c4,local_55);
      curl_msnprintf(auStack_74,3,&DAT_002d74c4,local_54);
      curl_msnprintf(auStack_72,3,&DAT_002d74c4,local_53);
      curl_msnprintf(auStack_70,3,&DAT_002d74c4,local_52);
      curl_msnprintf(auStack_6e,3,&DAT_002d74c4,local_51);
      curl_msnprintf(auStack_6c,3,&DAT_002d74c4,local_50);
      curl_msnprintf(auStack_6a,3,&DAT_002d74c4,local_4f);
      curl_msnprintf(auStack_68,3,&DAT_002d74c4,local_4e);
      curl_msnprintf(auStack_66,3,&DAT_002d74c4,local_4d);
      curl_msnprintf(auStack_64,3,&DAT_002d74c4,local_4c);
      curl_msnprintf(auStack_62,3,&DAT_002d74c4,local_4b);
      curl_msnprintf(auStack_60,3,&DAT_002d74c4,local_4a);
      curl_msnprintf(auStack_5e,3,&DAT_002d74c4,local_49);
      uVar4 = FUN_009453ec(param_1,param_2 + 0x428,"APOP %s %s",*(undefined8 *)(param_2 + 0x1c8),
                           auStack_7c);
      if ((int)uVar4 == 0) {
        *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 6;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

