/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092532c
 */

int FUN_0092532c(long *param_1,long param_2,long param_3,int param_4)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  int iVar4;
  char *pcVar5;
  size_t sVar6;
  uint uVar7;
  long lVar8;
  char *pcVar9;
  uint uVar10;
  long local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  local_60 = 0;
  lVar8 = *(long *)(param_2 + 0x18);
  uVar7 = (uint)*(undefined8 *)(lVar8 + 0x3a0);
  if ((uVar7 >> 9 & 1) == 0) {
    if (*(int *)(param_2 + 0x20) == 1) {
      pcVar9 = *(char **)(lVar8 + 0x68);
      uVar10 = (uint)*(ushort *)(lVar8 + 0x56e);
      goto LAB_009253b8;
    }
    pcVar9 = *(char **)(lVar8 + 0x50);
  }
  else {
    pcVar9 = *(char **)(lVar8 + 0x80);
    if (*(int *)(param_2 + 0x20) == 1) {
      uVar10 = (uint)*(ushort *)(lVar8 + 0x56e);
      goto LAB_009253b8;
    }
  }
  if ((uVar7 >> 10 & 1) == 0) {
    uVar10 = *(uint *)(lVar8 + 0x560);
  }
  else {
    uVar10 = *(uint *)(lVar8 + 0x564);
  }
LAB_009253b8:
  if (*(char **)(lVar8 + 0x50) == pcVar9) {
    uVar7 = uVar7 >> 0xb & 1;
  }
  else {
    pcVar5 = strchr(pcVar9,0x3a);
    uVar7 = (uint)(pcVar5 != (char *)0x0);
  }
  puVar1 = &DAT_002b138e;
  if (uVar7 == 0) {
    puVar1 = &DAT_002ab32c;
  }
  puVar2 = &DAT_002c2dc5;
  if (uVar7 == 0) {
    puVar2 = &DAT_002ab32c;
  }
  pcVar9 = (char *)curl_maprintf("%s%s%s:%d",puVar1,pcVar9,puVar2,uVar10);
  if (pcVar9 == (char *)0x0) {
    iVar4 = 0x1b;
  }
  else {
    sVar6 = strlen(pcVar9);
    iVar4 = FUN_0091e270(&local_60,"CONNECT",7,0,0,pcVar9,sVar6,0,0);
    if ((((((iVar4 == 0) &&
           (iVar4 = FUN_00919fec(param_3,*(undefined8 *)(param_2 + 0x18),local_60,0,
                                 *(undefined8 *)(local_60 + 0x20),1), iVar4 == 0)) &&
          ((param_4 != 1 ||
           ((lVar8 = FUN_00919984(param_3,*(undefined8 *)(param_2 + 0x18),&DAT_002ad152,4),
            lVar8 != 0 || (iVar4 = FUN_0091fff8(local_60 + 0x30,&DAT_002ad152,pcVar9), iVar4 == 0)))
           ))) && ((*(long *)(param_3 + 0x1300) == 0 ||
                   (iVar4 = FUN_00920274(local_60 + 0x30), iVar4 == 0)))) &&
        ((((lVar8 = FUN_00919984(param_3,*(undefined8 *)(param_2 + 0x18),"User-Agent",10),
           lVar8 != 0 || (*(char **)(param_3 + 0x890) == (char *)0x0)) ||
          (**(char **)(param_3 + 0x890) == '\0')) ||
         (iVar4 = FUN_0091fff8(local_60 + 0x30,"User-Agent"), iVar4 == 0)))) &&
       (((param_4 != 1 ||
         (lVar8 = FUN_00919984(param_3,*(undefined8 *)(param_2 + 0x18),"Proxy-Connection",0x10),
         lVar8 != 0)) ||
        (iVar4 = FUN_0091fff8(local_60 + 0x30,"Proxy-Connection","Keep-Alive"), iVar4 == 0)))) {
      iVar4 = FUN_0091a944(param_3,1,local_60 + 0x30);
    }
  }
  if ((iVar4 != 0) && (local_60 != 0)) {
    FUN_0091e3d0();
    local_60 = 0;
  }
  (*(code *)PTR_free_00cc4678)(pcVar9);
  *param_1 = local_60;
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

