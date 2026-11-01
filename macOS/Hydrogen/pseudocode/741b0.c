
char * FUN_000741b0(undefined8 param_1,undefined8 param_2,char *param_3)

{
  bool in_ZR;
  undefined8 uVar1;
  char *unaff_x19;
  long unaff_x20;
  char *unaff_x22;
  char *pcVar2;
  undefined1 auVar3 [16];
  
  if (!in_ZR) {
    if (((*(ushort *)(unaff_x20 + 0x18) & 0x1f0) != 0) && (*unaff_x22 == ']')) {
      func_0x0002f0ac();
      unaff_x22 = unaff_x22 + 1;
    }
    if (unaff_x22 != unaff_x19) {
      do {
        pcVar2 = unaff_x22;
        param_3 = unaff_x19;
        unaff_x22 = (char *)func_0x00074a1c();
      } while (pcVar2 != unaff_x22);
      if (pcVar2 != unaff_x19) {
        if (*pcVar2 == '-') {
          func_0x0002f0ac();
          pcVar2 = pcVar2 + 1;
        }
        if ((pcVar2 != unaff_x19) && (*pcVar2 == ']')) {
          return pcVar2 + 1;
        }
      }
    }
  }
  uVar1 = func_0x00030890();
  __ZdlPv();
  auVar3 = __Unwind_Resume(uVar1);
  pcVar2 = auVar3._8_8_;
  if (pcVar2 == param_3) {
LAB_000742b4:
    return pcVar2;
  }
  switch(*pcVar2) {
  case '$':
  case '(':
  case ')':
  case '*':
  case '+':
  case '.':
  case '?':
  case '[':
  case '\\':
  case ']':
  case '^':
  case '{':
  case '|':
  case '}':
    goto LAB_000742b4;
  default:
    func_0x0002e718(auVar3._0_8_,(int)*pcVar2);
    return pcVar2 + 1;
  }
}

