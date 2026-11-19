/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095e178
 */

void FUN_0095e178(long param_1)

{
  char cVar1;
  long lVar2;
  int iVar3;
  size_t sVar4;
  ssize_t sVar5;
  undefined4 *puVar6;
  char *pcVar7;
  undefined8 uVar8;
  char *pcVar9;
  long lVar10;
  long lVar11;
  undefined8 *puVar12;
  undefined1 auStack_870 [2048];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  lVar10 = *(long *)(param_1 + 0x1a0);
  lVar11 = *(long *)(param_1 + 0x20);
  FUN_0095e584(param_1,0x3c,lVar10 + 0x1cd8,
               (*(long *)(lVar10 + 0x1ee0) + 2) - *(long *)(lVar10 + 0x1ed8));
  pcVar9 = *(char **)(lVar10 + 0x1ed8);
  *(char **)(lVar10 + 0x1ed8) = pcVar9 + 1;
  cVar1 = *pcVar9;
  if (cVar1 == '\'') {
    curl_msnprintf(auStack_870,0x800,"%c%c%c%c",0xff,0xfa,0x27,0);
    puVar12 = *(undefined8 **)(lVar10 + 0x1cb0);
    if (puVar12 == (undefined8 *)0x0) {
      lVar10 = 4;
    }
    else {
      lVar10 = 4;
      do {
        pcVar9 = (char *)*puVar12;
        sVar4 = strlen(pcVar9);
        if (lVar10 + sVar4 + 1 < 0x7fa) {
          pcVar7 = strchr(pcVar9,0x2c);
          if (pcVar7 == (char *)0x0) {
            iVar3 = curl_msnprintf(auStack_870 + lVar10,0x800 - lVar10,&DAT_002d3298,0,pcVar9);
          }
          else {
            iVar3 = curl_msnprintf(auStack_870 + lVar10,0x800 - lVar10,"%c%.*s%c%s",0,
                                   (int)pcVar7 - (int)pcVar9,pcVar9,1,pcVar7 + 1);
          }
          lVar10 = lVar10 + iVar3;
        }
        puVar12 = (undefined8 *)puVar12[1];
      } while (puVar12 != (undefined8 *)0x0);
    }
    curl_msnprintf(auStack_870 + lVar10,0x800 - lVar10,&DAT_002c3203,0xff,0xf0);
    sVar5 = send(*(int *)(lVar11 + 0x220),auStack_870,lVar10 + 2,0x4000);
    if (sVar5 < 0) {
      puVar6 = (undefined4 *)__errno();
      FUN_00904b80(param_1,"Sending data failed (%d)",*puVar6);
    }
  }
  else {
    if (cVar1 == '#') {
      pcVar9 = (char *)(lVar10 + 0x1c28);
      sVar4 = strlen(pcVar9);
      uVar8 = 0x23;
    }
    else {
      if (cVar1 != '\x18') goto LAB_0095e3f8;
      pcVar9 = (char *)(lVar10 + 0x1c08);
      sVar4 = strlen(pcVar9);
      uVar8 = 0x18;
    }
    lVar10 = sVar4 + 4;
    curl_msnprintf(auStack_870,0x800,"%c%c%c%c%s%c%c",0xff,0xfa,uVar8,0,pcVar9,0xff,0xf0);
    sVar5 = send(*(int *)(lVar11 + 0x220),auStack_870,sVar4 + 6,0x4000);
    if (sVar5 < 0) {
      puVar6 = (undefined4 *)__errno();
      FUN_00904b80(param_1,"Sending data failed (%d)",*puVar6);
    }
  }
  FUN_0095e584(param_1,0x3e,(ulong)auStack_870 | 2,lVar10);
LAB_0095e3f8:
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

