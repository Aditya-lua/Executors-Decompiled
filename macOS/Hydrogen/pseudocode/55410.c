
void FUN_00055410(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000038;
  
  func_0x0001748c(&uStack0000000000000038);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x55460);
  (*pcVar1)();
}

