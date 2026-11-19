/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd8b14
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00bd8b14(void)

{
  undefined **ppuVar1;
  undefined *puVar2;
  
  FUN_00bd8de0(&std::__ndk1::cin,&__sF);
  _DAT_00d26958 = 0;
  FUN_00bd94a8(&DAT_00d268f8,mprotect,&DAT_00d26958);
  _DAT_00d26890 = 0;
  std::__ndk1::cout = &PTR__basic_ostream_00cacce0;
  DAT_00d26860 = &PTR__basic_ostream_00cacd08;
                    /* try { // try from 00bd8b88 to 00bd8b8f has its CatchHandler @ 00bd8dcc */
  std::__ndk1::ios_base::init((ios_base *)&DAT_00d26860,&DAT_00d268f8);
  DAT_00d268e8 = 0;
  DAT_00d268f0 = 0xffffffff;
  _DAT_00d26a60 = 0;
  FUN_00bd94a8(&DAT_00d26a00,sched_yield,&DAT_00d26a60);
  _DAT_00d26998 = 0;
  std::__ndk1::cerr = &PTR__basic_ostream_00cacce0;
  DAT_00d26968 = &PTR__basic_ostream_00cacd08;
                    /* try { // try from 00bd8bc8 to 00bd8bcf has its CatchHandler @ 00bd8dc0 */
  std::__ndk1::ios_base::init((ios_base *)&DAT_00d26968,&DAT_00d26a00);
  DAT_00d269f0 = 0;
  DAT_00d269f8 = 0xffffffff;
  _DAT_00d26b68 = 0;
  FUN_00bd94a8(&DAT_00d26b08,sched_yield,&DAT_00d26b68);
  _DAT_00d26aa0 = 0;
  std::__ndk1::clog = &PTR__basic_ostream_00cacce0;
  DAT_00d26a70 = &PTR__basic_ostream_00cacd08;
                    /* try { // try from 00bd8c0c to 00bd8c13 has its CatchHandler @ 00bd8db4 */
  std::__ndk1::ios_base::init((ios_base *)&DAT_00d26a70,&DAT_00d26b08);
  ppuVar1 = std::__ndk1::cerr;
  DAT_00d26af8 = 0;
  DAT_00d26b00 = 0xffffffff;
  *(undefined ****)(&DAT_00d267c8 + *(long *)(std::__ndk1::cin + -0x18)) = &std::__ndk1::cout;
  puVar2 = ppuVar1[-3];
  *(uint *)((long)&DAT_00d26968 + (long)puVar2) =
       *(uint *)((long)&DAT_00d26968 + (long)puVar2) | 0x2000;
  *(undefined ****)(ppuVar1[-3] + 0xd269e8) = &std::__ndk1::cout;
  FUN_00bd8efc(&std::__ndk1::wcin,&__sF);
  _DAT_00d26d88 = 0;
  FUN_00bd9c3c(&DAT_00d26d28,mprotect,&DAT_00d26d88);
  _DAT_00d26cc0 = 0;
  std::__ndk1::wcout = &PTR__basic_ostream_00caced0;
  DAT_00d26c90 = &PTR__basic_ostream_00cacef8;
                    /* try { // try from 00bd8ca4 to 00bd8cab has its CatchHandler @ 00bd8da0 */
  std::__ndk1::ios_base::init((ios_base *)&DAT_00d26c90,&DAT_00d26d28);
  DAT_00d26d18 = 0;
  DAT_00d26d20 = 0xffffffff;
  _DAT_00d26e90 = 0;
  FUN_00bd9c3c(&DAT_00d26e30,sched_yield,&DAT_00d26e90);
  _DAT_00d26dc8 = 0;
  std::__ndk1::wcerr = &PTR__basic_ostream_00caced0;
  DAT_00d26d98 = &PTR__basic_ostream_00cacef8;
                    /* try { // try from 00bd8ce0 to 00bd8ce7 has its CatchHandler @ 00bd8d94 */
  std::__ndk1::ios_base::init((ios_base *)&DAT_00d26d98,&DAT_00d26e30);
  DAT_00d26e20 = 0;
  DAT_00d26e28 = 0xffffffff;
  _DAT_00d26f98 = 0;
  FUN_00bd9c3c(&DAT_00d26f38,sched_yield,&DAT_00d26f98);
  _DAT_00d26ed0 = 0;
  std::__ndk1::wclog = &PTR__basic_ostream_00caced0;
  DAT_00d26ea0 = &PTR__basic_ostream_00cacef8;
                    /* try { // try from 00bd8d28 to 00bd8d2f has its CatchHandler @ 00bd8d88 */
  std::__ndk1::ios_base::init((ios_base *)&DAT_00d26ea0,&DAT_00d26f38);
  ppuVar1 = std::__ndk1::wcerr;
  DAT_00d26f30 = 0xffffffff;
  DAT_00d26f28 = 0;
  *(undefined ****)(&DAT_00d26bf8 + *(long *)(std::__ndk1::wcin + -0x18)) = &std::__ndk1::wcout;
  puVar2 = ppuVar1[-3];
  *(uint *)((long)&DAT_00d26d98 + (long)puVar2) =
       *(uint *)((long)&DAT_00d26d98 + (long)puVar2) | 0x2000;
  *(undefined ****)(ppuVar1[-3] + 0xd26e18) = &std::__ndk1::wcout;
  return;
}

