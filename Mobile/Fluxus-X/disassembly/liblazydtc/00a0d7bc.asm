; NCONF_new @ 00a0d7bc
00a0d7bc	stp x29,x30,[sp, #-0x10]!
00a0d7c0	mov x29,sp
00a0d7c4	cbnz x0,0x00a0d7cc
00a0d7c8	bl 0x00c39420
00a0d7cc	ldr x8,[x0, #0x8]
00a0d7d0	blr x8
00a0d7d4	cbz x0,0x00a0d7e4
00a0d7d8	str xzr,[x0, #0x28]
00a0d7dc	ldp x29,x30,[sp], #0x10
00a0d7e0	ret
00a0d7e4	bl 0x00c342a0
00a0d7e8	adrp x0,0x2af000
00a0d7ec	adrp x2,0x2a5000
00a0d7f0	add x0,x0,#0xd73
00a0d7f4	add x2,x2,#0xcb3
00a0d7f8	mov w1,#0xbf
00a0d7fc	bl 0x00c342b0
00a0d800	mov w1,#0x100
00a0d804	orr w0,wzr,#0xe
00a0d808	movk w1,#0xc, LSL #16
00a0d80c	mov x2,xzr
00a0d810	bl 0x00c342c0
00a0d814	mov x0,xzr
00a0d818	ldp x29,x30,[sp], #0x10
00a0d81c	ret
