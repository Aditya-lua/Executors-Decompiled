/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091c060
 */

undefined8 FUN_0091c060(long param_1,int param_2)

{
  long lVar1;
  undefined8 uVar2;
  char *pcVar3;
  long lVar4;
  
  if ((*(byte *)(param_1 + 0x131d) & 1) == 0) {
    return 0;
  }
  switch(param_2) {
  case 0:
  case 5:
    break;
  case 1:
  case 4:
    goto switchD_0091c09c_caseD_1;
  default:
    return 0;
  }
  lVar1 = FUN_00941e8c(param_1,"Range",5);
  if (lVar1 == 0) {
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12c0));
    uVar2 = curl_maprintf("Range: bytes=%s\r\n",*(undefined8 *)(param_1 + 0x1110));
    *(undefined8 *)(param_1 + 0x12c0) = uVar2;
    return 0;
  }
  if ((param_2 != 4) && (param_2 != 1)) {
    return 0;
  }
switchD_0091c09c_caseD_1:
  lVar1 = FUN_00941e8c(param_1,"Content-Range",0xd);
  if (lVar1 != 0) {
    return 0;
  }
  lVar1 = FUN_00935f5c(param_1);
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12c0));
  if (*(long *)(param_1 + 0x338) < 0) {
    lVar4 = lVar1 + -1;
    pcVar3 = "Content-Range: bytes 0-%ld/%ld\r\n";
  }
  else {
    if (*(long *)(param_1 + 0x1118) != 0) {
      if ((*(byte *)(param_1 + 0x1b3) & 1) == 0) {
        lVar1 = *(long *)(param_1 + 0x1118) + lVar1;
      }
      else {
        lVar1 = *(long *)(param_1 + 0x1158);
      }
      lVar1 = curl_maprintf("Content-Range: bytes %s%ld/%ld\r\n",*(undefined8 *)(param_1 + 0x1110),
                            lVar1 + -1);
      *(long *)(param_1 + 0x12c0) = lVar1;
      goto joined_r0x0091c178;
    }
    lVar4 = *(long *)(param_1 + 0x1110);
    pcVar3 = "Content-Range: bytes %s/%ld\r\n";
  }
  lVar1 = curl_maprintf(pcVar3,lVar4,lVar1);
  *(long *)(param_1 + 0x12c0) = lVar1;
joined_r0x0091c178:
  if (lVar1 == 0) {
    return 0x1b;
  }
  return 0;
}

