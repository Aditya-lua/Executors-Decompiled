; COMP_expand_block @ 00a0bf18
00a0bf18	stp x20,x19,[sp, #-0x20]!
00a0bf1c	stp x29,x30,[sp, #0x10]
00a0bf20	ldr x8,[x0]
00a0bf24	add x29,sp,#0x10
00a0bf28	ldr x8,[x8, #0x28]
00a0bf2c	cbz x8,0x00a0bf5c
00a0bf30	mov w19,w4
00a0bf34	mov x20,x0
00a0bf38	blr x8
00a0bf3c	cmp w0,#0x1
00a0bf40	b.lt 0x00a0bf60
00a0bf44	ldur q0,[x20, #0x18]
00a0bf48	fmov s1,w19
00a0bf4c	mov v1.S[0x1],w0
00a0bf50	saddw v0.2D,v0.2D,v1.2S
00a0bf54	stur q0,[x20, #0x18]
00a0bf58	b 0x00a0bf60
00a0bf5c	mov w0,#0xffffffff
00a0bf60	ldp x29,x30,[sp, #0x10]
00a0bf64	ldp x20,x19,[sp], #0x20
00a0bf68	ret
