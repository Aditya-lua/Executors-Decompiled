; EC_KEY_oct2priv @ 00a2f974
00a2f974	str x19,[sp, #-0x20]!
00a2f978	stp x29,x30,[sp, #0x10]
00a2f97c	ldr x8,[x0, #0x18]
00a2f980	add x29,sp,#0x10
00a2f984	cbz x8,0x00a2f9e8
00a2f988	ldr x8,[x8]
00a2f98c	cbz x8,0x00a2f9e8
00a2f990	ldr x8,[x8, #0x138]
00a2f994	cbz x8,0x00a2f9b8
00a2f998	mov x19,x0
00a2f99c	blr x8
00a2f9a0	cmp w0,#0x1
00a2f9a4	b.ne 0x00a2f9ec
00a2f9a8	ldr x8,[x19, #0x68]
00a2f9ac	add x8,x8,#0x1
00a2f9b0	str x8,[x19, #0x68]
00a2f9b4	b 0x00a2f9ec
00a2f9b8	bl 0x00c342a0
00a2f9bc	adrp x0,0x2b4000
00a2f9c0	adrp x2,0x2cf000
00a2f9c4	add x0,x0,#0x15e
00a2f9c8	add x2,x2,#0xa63
00a2f9cc	mov w1,#0x3ae
00a2f9d0	bl 0x00c342b0
00a2f9d4	mov w1,#0x101
00a2f9d8	mov w0,#0x10
00a2f9dc	movk w1,#0xc, LSL #16
00a2f9e0	mov x2,xzr
00a2f9e4	bl 0x00c342c0
00a2f9e8	mov w0,wzr
00a2f9ec	ldp x29,x30,[sp, #0x10]
00a2f9f0	ldr x19,[sp], #0x20
00a2f9f4	ret
