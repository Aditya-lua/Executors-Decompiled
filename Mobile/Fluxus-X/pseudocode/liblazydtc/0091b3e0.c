/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091b3e0
 */

ulong FUN_0091b3e0(long param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  char *pcVar4;
  long lVar5;
  ulong uVar6;
  long local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  lVar5 = *(long *)(param_1 + 0x11b0);
  pcVar4 = *(char **)(param_1 + 0x11a8);
  if (*(char **)(param_1 + 0x928) != (char *)0x0) {
    lVar5 = 0;
    pcVar4 = *(char **)(param_1 + 0x928);
  }
  if ((*(ulong *)(param_2 + 0x3a0) & 9) == 1) {
    lVar5 = curl_url_dup(*(undefined8 *)(param_1 + 0x1170));
    if (lVar5 == 0) {
LAB_0091b540:
      uVar6 = 0x1b;
    }
    else if ((((*(long *)(param_2 + 0x58) == *(long *)(param_2 + 0x50)) ||
              (iVar2 = curl_url_set(lVar5,5,*(long *)(param_2 + 0x50),0), iVar2 == 0)) &&
             (iVar2 = curl_url_set(lVar5,9,0,0), iVar2 == 0)) &&
            ((iVar2 = curl_strequal(&DAT_002b3577,*(undefined8 *)(param_1 + 0x1178)), iVar2 == 0 ||
             ((iVar2 = curl_url_set(lVar5,2,0,0), iVar2 == 0 &&
              (iVar2 = curl_url_set(lVar5,3,0,0), iVar2 == 0)))))) {
      iVar2 = curl_url_get(lVar5,0,&local_60,2);
      curl_url_cleanup(lVar5);
      if (iVar2 != 0) goto LAB_0091b540;
      lVar5 = local_60;
      if (*(long *)(param_1 + 0x928) != 0) {
        lVar5 = *(long *)(param_1 + 0x928);
      }
      uVar3 = FUN_00904728(param_3,lVar5);
      uVar6 = (ulong)uVar3;
      (*(code *)PTR_free_00cc4678)(local_60);
      if (uVar3 == 0) {
        iVar2 = curl_strequal(&DAT_002a5355,*(undefined8 *)(param_1 + 0x1178));
        if ((iVar2 != 0) && ((*(byte *)(param_1 + 0xa86) >> 4 & 1) != 0)) {
          pcVar4 = strstr(pcVar4,";type=");
          if (pcVar4 == (char *)0x0) {
LAB_0091b620:
            uVar3 = FUN_009048cc(param_3,";type=%c",*(uint *)(param_1 + 0x131c) >> 9 & 8 ^ 0x69);
            uVar6 = (ulong)uVar3;
            if (uVar3 != 0) goto LAB_0091b5a0;
          }
          else if ((pcVar4[6] != '\0') && (pcVar4[7] == '\0')) {
            uVar3 = FUN_009416cc();
            uVar3 = (uVar3 & 0xff) - 0x41;
            if ((8 < uVar3) || ((1 << (ulong)(uVar3 & 0x1f) & 0x109U) == 0)) goto LAB_0091b620;
          }
        }
LAB_0091b59c:
        uVar6 = 0;
      }
    }
    else {
      curl_url_cleanup(lVar5);
      uVar6 = 0x1b;
    }
  }
  else {
    uVar3 = FUN_00904728(param_3,pcVar4);
    uVar6 = (ulong)uVar3;
    if (uVar3 == 0) {
      if (lVar5 != 0) {
        uVar6 = FUN_009048cc(param_3,&DAT_002bce69,lVar5);
        if (*(long *)(lVar1 + 0x28) == local_58) {
          return uVar6;
        }
        goto LAB_0091b650;
      }
      goto LAB_0091b59c;
    }
  }
LAB_0091b5a0:
  if (*(long *)(lVar1 + 0x28) == local_58) {
    return uVar6;
  }
LAB_0091b650:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

