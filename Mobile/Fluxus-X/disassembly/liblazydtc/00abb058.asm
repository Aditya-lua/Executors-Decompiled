; PKCS12_unpack_p7data @ 00abb058
00abb058	str x19,[sp, #-0x20]!
00abb05c	stp x29,x30,[sp, #0x10]
00abb060	mov x19,x0
00abb064	ldr x0,[x0, #0x18]
00abb068	add x29,sp,#0x10
00abb06c	bl 0x00c37750
00abb070	cmp w0,#0x15
00abb074	b.ne 0x00abb094
00abb078	ldr x19,[x19, #0x20]
00abb07c	cbz x19,0x00abb0bc
00abb080	bl 0x00c3f410
00abb084	mov x1,x0
00abb088	mov x0,x19
00abb08c	bl 0x00c37aa0
00abb090	b 0x00abb0ec
00abb094	bl 0x00c342a0
00abb098	adrp x0,0x2c6000
00abb09c	adrp x2,0x2ac000
00abb0a0	add x0,x0,#0x176
00abb0a4	add x2,x2,#0x6b5
00abb0a8	mov w1,#0x4e
00abb0ac	bl 0x00c342b0
00abb0b0	mov w0,#0x23
00abb0b4	mov w1,#0x79
00abb0b8	b 0x00abb0e0
00abb0bc	bl 0x00c342a0
00abb0c0	adrp x0,0x2c6000
00abb0c4	adrp x2,0x2ac000
00abb0c8	add x0,x0,#0x176
00abb0cc	add x2,x2,#0x6b5
00abb0d0	mov w1,#0x53
00abb0d4	bl 0x00c342b0
00abb0d8	mov w0,#0x23
00abb0dc	mov w1,#0x65
00abb0e0	mov x2,xzr
00abb0e4	bl 0x00c342c0
00abb0e8	mov x0,xzr
00abb0ec	ldp x29,x30,[sp, #0x10]
00abb0f0	ldr x19,[sp], #0x20
00abb0f4	ret
