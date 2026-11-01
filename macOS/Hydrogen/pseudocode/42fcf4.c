
/* WARNING: Removing unreachable block (ram,0x0042fd5c) */
/* WARNING: Removing unreachable block (ram,0x0042fdd4) */
/* WARNING: Removing unreachable block (ram,0x0042fd84) */
/* WARNING: Removing unreachable block (ram,0x0042fd98) */
/* WARNING: Removing unreachable block (ram,0x0042fe28) */
/* WARNING: Removing unreachable block (ram,0x0042fe78) */

undefined8 FUN_0042fcf4(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 extraout_x8;
  undefined8 extraout_x9;
  long unaff_x21;
  
  lVar1 = _pthread_get_stackaddr_np();
  lVar2 = _pthread_get_stacksize_np(param_1);
  puVar3 = (undefined8 *)(*pcRam0000000000a2bce8)((lVar1 - lVar2) - *(long *)(unaff_x21 + 0xff0));
  *puVar3 = extraout_x8;
  puVar3 = (undefined8 *)(*pcRam0000000000a2bd00)();
  *puVar3 = extraout_x9;
  _sigaltstack(0);
  return 0;
}

