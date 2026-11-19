/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00961e58
 */

void FUN_00961e58(undefined8 param_1,byte *param_2,long param_3,uint param_4,uint param_5)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  char *pcVar4;
  byte *pbVar5;
  byte *pbVar6;
  size_t sVar7;
  undefined4 uVar8;
  undefined2 local_6c;
  char local_6a;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  pbVar6 = param_2;
  if ((param_4 & 1) == 0) {
    pcVar4 = strstr((char *)param_2,"//");
    if (pcVar4 != (char *)0x0) {
      pbVar6 = (byte *)(pcVar4 + 2);
    }
    pbVar5 = (byte *)strchr((char *)pbVar6,0x3f);
    pbVar6 = (byte *)strchr((char *)pbVar6,0x2f);
    if (pbVar6 == (byte *)0x0) {
      sVar7 = strlen((char *)param_2);
      pbVar6 = param_2 + sVar7;
    }
    if (pbVar5 == (byte *)0x0) {
      sVar7 = strlen((char *)param_2);
      pbVar5 = param_2 + sVar7;
    }
    if (pbVar5 <= pbVar6) {
      pbVar6 = pbVar5;
    }
  }
  if (param_3 != 0) {
    param_5 = param_5 ^ 1;
    do {
      if (param_2 < pbVar6) {
LAB_00961f64:
        iVar3 = FUN_009045fc(param_1,param_2,1);
      }
      else {
        bVar1 = *param_2;
        if (bVar1 == 0x3f) {
          param_5 = 0;
          goto LAB_00961f64;
        }
        if (bVar1 == 0x20) {
          if ((param_5 & 1) == 0) {
            iVar3 = FUN_009045fc(param_1,&DAT_002a3568,1);
          }
          else {
            iVar3 = FUN_009045fc(param_1,&DAT_002ab875,3);
          }
        }
        else {
          if ((((bVar1 < 0x20) || (bVar1 == 0x20)) || (bVar1 == 0x7f)) || (bVar1 < 0x7f))
          goto LAB_00961f64;
          local_6a = "0123456789abcdef"[(ulong)*param_2 & 0xf];
          local_6c = CONCAT11("0123456789abcdef"[*param_2 >> 4],0x25);
          iVar3 = FUN_009045fc(param_1,&local_6c,3);
        }
      }
      if (iVar3 != 0) {
        uVar8 = 0x1f;
        if (iVar3 != 100) {
          uVar8 = 7;
        }
        goto LAB_00961ff0;
      }
      param_3 = param_3 + -1;
      param_2 = param_2 + 1;
    } while (param_3 != 0);
  }
  uVar8 = 0;
LAB_00961ff0:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar8);
  }
  return;
}

