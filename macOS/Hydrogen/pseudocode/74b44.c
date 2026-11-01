
/* WARNING: Removing unreachable block (ram,0x00074db0) */
/* WARNING: Removing unreachable block (ram,0x00074c0c) */
/* WARNING: Removing unreachable block (ram,0x00074c14) */
/* WARNING: Removing unreachable block (ram,0x00074c1c) */
/* WARNING: Removing unreachable block (ram,0x00074c94) */
/* WARNING: Removing unreachable block (ram,0x00074de8) */
/* WARNING: Removing unreachable block (ram,0x00074cb8) */
/* WARNING: Removing unreachable block (ram,0x00074bfc) */
/* WARNING: Removing unreachable block (ram,0x00074c08) */
/* WARNING: Removing unreachable block (ram,0x00074c20) */
/* WARNING: Removing unreachable block (ram,0x00074db4) */
/* WARNING: Removing unreachable block (ram,0x00074dd4) */

char * FUN_00074b44(void)

{
  char *pcVar1;
  char cVar2;
  bool in_ZR;
  char *pcVar3;
  uint in_w8;
  long lVar4;
  char *unaff_x20;
  char *unaff_x21;
  uint unaff_w24;
  long unaff_x29;
  undefined8 uVar5;
  
  if (in_ZR) {
    cVar2 = *unaff_x20;
    if (cVar2 == '\\') {
      if (unaff_w24 == 0) {
        pcVar3 = (char *)func_0x000752dc();
      }
      else {
        pcVar3 = (char *)func_0x0007549c();
      }
      goto joined_r0x00074b94;
    }
  }
  else {
    cVar2 = *unaff_x20;
  }
  if ((in_w8 >> 7 & 1) == 0) {
    *(undefined1 *)(unaff_x29 + -0x31) = 1;
    *(char *)(unaff_x29 + -0x48) = cVar2;
    *(undefined1 *)(unaff_x29 + -0x47) = 0;
    pcVar3 = unaff_x20 + 1;
  }
  else {
    pcVar3 = *(char **)(unaff_x29 + -0x48);
    *(undefined8 *)(unaff_x29 + -0x40) = 1;
    *pcVar3 = cVar2;
    pcVar3[1] = '\0';
    pcVar3 = unaff_x20 + 1;
  }
joined_r0x00074b94:
  if ((((pcVar3 == unaff_x21) || (*pcVar3 == ']')) || (pcVar1 = pcVar3 + 1, pcVar1 == unaff_x21)) ||
     ((*pcVar3 != '-' || (*pcVar1 == ']')))) {
    return pcVar3;
  }
  pcVar3 = pcVar3 + 2;
  if (((pcVar3 == unaff_x21) || (*pcVar1 != '[')) || (*pcVar3 != '.')) {
    if (((unaff_w24 | 0x40) == 0x40) && (*pcVar1 == '\\')) {
      if (unaff_w24 == 0) {
        pcVar3 = (char *)func_0x000752dc();
      }
      else {
        pcVar3 = (char *)func_0x0007549c();
      }
    }
  }
  else {
    pcVar3 = (char *)func_0x000751ec();
  }
  uVar5 = *(undefined8 *)(unaff_x29 + -0x48);
  lVar4 = *(long *)(unaff_x29 + -0x38);
  *(undefined8 *)(unaff_x29 + -0x40) = 0;
  *(undefined8 *)(unaff_x29 + -0x38) = 0;
  *(undefined8 *)(unaff_x29 + -0x48) = 0;
  func_0x00031798();
  if (lVar4 < 0) {
    __ZdlPv(uVar5);
  }
  return pcVar3;
}

