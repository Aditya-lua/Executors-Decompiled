; ossl_ec_GFp_mont_group_clear_finish @ 00a37800
00a37800	str x19,[sp, #-0x20]!
00a37804	stp x29,x30,[sp, #0x10]
00a37808	mov x19,x0
00a3780c	ldr x0,[x0, #0x78]
00a37810	add x29,sp,#0x10
00a37814	bl 0x00c38f70
00a37818	ldr x0,[x19, #0x80]
00a3781c	str xzr,[x19, #0x78]
00a37820	bl 0x00c322e0
00a37824	str xzr,[x19, #0x80]
00a37828	ldp x29,x30,[sp, #0x10]
00a3782c	mov x0,x19
00a37830	ldr x19,[sp], #0x20
00a37834	b 0x00c3b1d0
