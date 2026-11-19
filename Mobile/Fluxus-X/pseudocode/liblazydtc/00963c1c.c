/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00963c1c
 */

void FUN_00963c1c(undefined8 param_1,undefined8 param_2,char *param_3,undefined8 param_4)

{
  long lVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  char *__s;
  size_t sVar6;
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
  strlen(param_3);
  uVar2 = FUN_00963a64();
  lVar3 = FUN_009230d0(&PTR_LAB_00c502e0,param_3,uVar2);
  if (lVar3 != 0) {
    lVar4 = FUN_009252b0(param_1);
    if (lVar4 != 0) {
      uVar5 = FUN_009252a8(param_1);
      FUN_009252b0(param_1);
      uVar2 = FUN_00963a64();
      FUN_0092328c(lVar3,uVar5,uVar2);
    }
    FUN_009232ac(lVar3,&local_58);
    __s = (char *)curl_maprintf("%s %02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x"
                                ,param_2,local_58,local_57,local_56,local_55,local_54,local_53,
                                local_52,local_51,local_50,local_4f,local_4e,local_4d,local_4c,
                                local_4b,local_4a,local_49);
    if (__s != (char *)0x0) {
      sVar6 = strlen(__s);
      FUN_0092525c(param_4,__s,sVar6,curl_free);
      uVar5 = 0;
      goto LAB_00963d64;
    }
  }
  uVar5 = 0x1b;
LAB_00963d64:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

