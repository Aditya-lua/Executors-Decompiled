; PKCS12_unpack_p7encdata @ 00abb384
00abb384	stp x22,x21,[sp, #-0x30]!
00abb388	stp x20,x19,[sp, #0x10]
00abb38c	stp x29,x30,[sp, #0x20]
00abb390	mov x21,x0
00abb394	ldr x0,[x0, #0x18]
00abb398	add x29,sp,#0x20
00abb39c	mov w19,w2
00abb3a0	mov x20,x1
00abb3a4	bl 0x00c37750
00abb3a8	cmp w0,#0x1a
00abb3ac	mov x0,xzr
00abb3b0	b.ne 0x00abb424
00abb3b4	ldr x8,[x21, #0x20]
00abb3b8	cbz x8,0x00abb3f4
00abb3bc	ldr x8,[x8, #0x8]
00abb3c0	ldr x22,[x8, #0x8]
00abb3c4	bl 0x00c3f410
00abb3c8	ldp x8,x6,[x21, #0x20]
00abb3cc	ldr x7,[x21, #0x30]
00abb3d0	mov x1,x0
00abb3d4	mov w5,#0x1
00abb3d8	ldr x8,[x8, #0x8]
00abb3dc	mov x0,x22
00abb3e0	mov x2,x20
00abb3e4	mov w3,w19
00abb3e8	ldr x4,[x8, #0x10]
00abb3ec	bl 0x00c3f480
00abb3f0	b 0x00abb424
00abb3f4	bl 0x00c342a0
00abb3f8	adrp x0,0x2c6000
00abb3fc	adrp x2,0x2ba000
00abb400	add x0,x0,#0x176
00abb404	add x2,x2,#0x65a
00abb408	mov w1,#0xa1
00abb40c	bl 0x00c342b0
00abb410	mov w0,#0x23
00abb414	mov w1,#0x65
00abb418	mov x2,xzr
00abb41c	bl 0x00c342c0
00abb420	mov x0,xzr
00abb424	ldp x29,x30,[sp, #0x20]
00abb428	ldp x20,x19,[sp, #0x10]
00abb42c	ldp x22,x21,[sp], #0x30
00abb430	ret
