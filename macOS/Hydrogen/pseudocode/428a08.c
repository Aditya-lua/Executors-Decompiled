
bool FUN_00428a08(void)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  long *unaff_x19;
  ulong unaff_x20;
  long *unaff_x21;
  long lVar4;
  long unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  
  do {
    if ((char)unaff_x19[1] != '\0') {
      func_0x007a2810(&UNK_008851be,0x2b);
code_r0x00428b30:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x428b34);
      (*pcVar1)();
    }
    if (unaff_x26 != unaff_x19[3]) {
      if ((((unaff_x20 & 1) == 0) && ((*(ulong *)(unaff_x23 + 0x548) & 0x7fffffffffffffff) != 0)) &&
         (uVar3 = func_0x007a1140(), (uVar3 & 1) == 0)) {
        *(undefined1 *)(unaff_x19 + 1) = 1;
      }
      _pthread_mutex_unlock(*unaff_x19);
      return unaff_x25 <= unaff_x24;
    }
    lVar4 = *unaff_x19;
    lVar2 = unaff_x19[5];
    if (lVar2 == 0) {
      unaff_x19[5] = lVar4;
    }
    else if (lVar2 != lVar4) {
      func_0x007a2420();
      goto code_r0x00428b30;
    }
    lVar2 = *unaff_x21;
    if (lVar2 == 0) {
      lVar2 = func_0x007a0fb4();
    }
    _pthread_cond_wait(lVar2,lVar4);
  } while( true );
}

