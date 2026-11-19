; ECDSA_do_verify @ 00a36ef0
00a36ef0	ldr x8,[x3]
00a36ef4	ldr x4,[x8, #0x70]
00a36ef8	cbz x4,0x00a36f00
00a36efc	br x4
00a36f00	stp x29,x30,[sp, #-0x10]!
00a36f04	mov x29,sp
00a36f08	bl 0x00c342a0
00a36f0c	adrp x0,0x2bf000
00a36f10	adrp x2,0x2a7000
00a36f14	add x0,x0,#0xb8e
00a36f18	add x2,x2,#0xe43
00a36f1c	orr w1,wzr,#0x1f
00a36f20	bl 0x00c342b0
00a36f24	mov w0,#0x10
00a36f28	mov w1,#0x98
00a36f2c	mov x2,xzr
00a36f30	bl 0x00c342c0
00a36f34	mov w0,#0xffffffff
00a36f38	ldp x29,x30,[sp], #0x10
00a36f3c	ret
