; ASN1_generate_v3 @ 00a109b8
00a109b8	sub sp,sp,#0x30
00a109bc	add x3,sp,#0xc
00a109c0	mov w2,wzr
00a109c4	stp x20,x19,[sp, #0x10]
00a109c8	stp x29,x30,[sp, #0x20]
00a109cc	add x29,sp,#0x20
00a109d0	str wzr,[sp, #0xc]
00a109d4	bl 0x00a10a24
00a109d8	ldr w20,[sp, #0xc]
00a109dc	mov x19,x0
00a109e0	cbz w20,0x00a10a10
00a109e4	bl 0x00c342a0
00a109e8	adrp x0,0x2a9000
00a109ec	adrp x2,0x2af000
00a109f0	add x0,x0,#0xfe8
00a109f4	add x2,x2,#0xd8a
00a109f8	mov w1,#0x5e
00a109fc	bl 0x00c342b0
00a10a00	mov w0,#0xd
00a10a04	mov w1,w20
00a10a08	mov x2,xzr
00a10a0c	bl 0x00c342c0
00a10a10	mov x0,x19
00a10a14	ldp x29,x30,[sp, #0x20]
00a10a18	ldp x20,x19,[sp, #0x10]
00a10a1c	add sp,sp,#0x30
00a10a20	ret
