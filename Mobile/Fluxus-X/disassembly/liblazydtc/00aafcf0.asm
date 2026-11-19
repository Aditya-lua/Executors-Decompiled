; OCSP_response_get1_basic @ 00aafcf0
00aafcf0	str x19,[sp, #-0x20]!
00aafcf4	stp x29,x30,[sp, #0x10]
00aafcf8	ldr x19,[x0, #0x8]
00aafcfc	add x29,sp,#0x10
00aafd00	cbz x19,0x00aafd2c
00aafd04	ldr x0,[x19]
00aafd08	bl 0x00c37750
00aafd0c	cmp w0,#0x16d
00aafd10	b.ne 0x00aafd54
00aafd14	ldr x19,[x19, #0x8]
00aafd18	bl 0x00c3ee20
00aafd1c	mov x1,x0
00aafd20	mov x0,x19
00aafd24	bl 0x00c37aa0
00aafd28	b 0x00aafd84
00aafd2c	bl 0x00c342a0
00aafd30	adrp x0,0x2d0000
00aafd34	adrp x2,0x2ba000
00aafd38	add x0,x0,#0x1c9
00aafd3c	add x2,x2,#0x590
00aafd40	mov w1,#0x82
00aafd44	bl 0x00c342b0
00aafd48	mov w0,#0x27
00aafd4c	mov w1,#0x6c
00aafd50	b 0x00aafd78
00aafd54	bl 0x00c342a0
00aafd58	adrp x0,0x2d0000
00aafd5c	adrp x2,0x2ba000
00aafd60	add x0,x0,#0x1c9
00aafd64	add x2,x2,#0x590
00aafd68	mov w1,#0x86
00aafd6c	bl 0x00c342b0
00aafd70	mov w0,#0x27
00aafd74	mov w1,#0x68
00aafd78	mov x2,xzr
00aafd7c	bl 0x00c342c0
00aafd80	mov x0,xzr
00aafd84	ldp x29,x30,[sp, #0x10]
00aafd88	ldr x19,[sp], #0x20
00aafd8c	ret
