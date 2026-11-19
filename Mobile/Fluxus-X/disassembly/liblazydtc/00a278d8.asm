; ossl_x509_algor_is_sm2 @ 00a278d8
00a278d8	sub sp,sp,#0x40
00a278dc	stp x29,x30,[sp, #0x30]
00a278e0	add x29,sp,#0x30
00a278e4	mov x3,x0
00a278e8	sub x1,x29,#0x14
00a278ec	add x2,sp,#0x10
00a278f0	mov x0,xzr
00a278f4	stp x20,x19,[sp, #0x20]
00a278f8	stur wzr,[x29, #-0x14]
00a278fc	str xzr,[sp, #0x10]
00a27900	bl 0x00c32b50
00a27904	ldur w8,[x29, #-0x14]
00a27908	cmp w8,#0x10
00a2790c	b.eq 0x00a27930
00a27910	cmp w8,#0x6
00a27914	mov w19,wzr
00a27918	b.ne 0x00a27974
00a2791c	ldr x0,[sp, #0x10]
00a27920	bl 0x00c37750
00a27924	cmp w0,#0x494
00a27928	cset w19,eq
00a2792c	b 0x00a27974
00a27930	ldr x8,[sp, #0x10]
00a27934	add x1,sp,#0x8
00a27938	mov x0,xzr
00a2793c	ldr x9,[x8, #0x8]
00a27940	str x9,[sp, #0x8]
00a27944	ldrsw x2,[x8]
00a27948	bl 0x00c3abb0
00a2794c	mov x20,x0
00a27950	cbz x0,0x00a27968
00a27954	mov x0,x20
00a27958	bl 0x00c36870
00a2795c	cmp w0,#0x494
00a27960	cset w19,eq
00a27964	b 0x00a2796c
00a27968	mov w19,wzr
00a2796c	mov x0,x20
00a27970	bl 0x00c3a770
00a27974	mov w0,w19
00a27978	ldp x29,x30,[sp, #0x30]
00a2797c	ldp x20,x19,[sp, #0x20]
00a27980	add sp,sp,#0x40
00a27984	ret
