; NCONF_load_fp @ 00a0d904
00a0d904	str x21,[sp, #-0x30]!
00a0d908	mov x21,x0
00a0d90c	mov x0,x1
00a0d910	mov w1,wzr
00a0d914	stp x20,x19,[sp, #0x10]
00a0d918	stp x29,x30,[sp, #0x20]
00a0d91c	add x29,sp,#0x20
00a0d920	mov x20,x2
00a0d924	bl 0x00c37810
00a0d928	cbz x0,0x00a0d954
00a0d92c	mov x19,x0
00a0d930	cbz x21,0x00a0d98c
00a0d934	ldr x8,[x21]
00a0d938	mov x0,x21
00a0d93c	mov x1,x19
00a0d940	mov x2,x20
00a0d944	ldr x8,[x8, #0x28]
00a0d948	blr x8
00a0d94c	mov w20,w0
00a0d950	b 0x00a0d9bc
00a0d954	bl 0x00c342a0
00a0d958	adrp x0,0x2af000
00a0d95c	adrp x2,0x2d1000
00a0d960	add x0,x0,#0xd73
00a0d964	add x2,x2,#0x752
00a0d968	mov w1,#0x10a
00a0d96c	bl 0x00c342b0
00a0d970	mov w1,#0x7
00a0d974	orr w0,wzr,#0xe
00a0d978	movk w1,#0x8, LSL #16
00a0d97c	mov x2,xzr
00a0d980	bl 0x00c342c0
00a0d984	mov w20,wzr
00a0d988	b 0x00a0d9c4
00a0d98c	bl 0x00c342a0
00a0d990	adrp x0,0x2af000
00a0d994	adrp x2,0x29d000
00a0d998	add x0,x0,#0xd73
00a0d99c	add x2,x2,#0xfa3
00a0d9a0	mov w1,#0x116
00a0d9a4	bl 0x00c342b0
00a0d9a8	orr w0,wzr,#0xe
00a0d9ac	mov w1,#0x69
00a0d9b0	mov x2,xzr
00a0d9b4	bl 0x00c342c0
00a0d9b8	mov w20,wzr
00a0d9bc	mov x0,x19
00a0d9c0	bl 0x00c31a40
00a0d9c4	mov w0,w20
00a0d9c8	ldp x29,x30,[sp, #0x20]
00a0d9cc	ldp x20,x19,[sp, #0x10]
00a0d9d0	ldr x21,[sp], #0x30
00a0d9d4	ret
