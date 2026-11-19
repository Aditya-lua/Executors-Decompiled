; X509_REQ_sign @ 00b15978
00b15978	sub sp,sp,#0x40
00b1597c	str x21,[sp, #0x10]
00b15980	stp x20,x19,[sp, #0x20]
00b15984	stp x29,x30,[sp, #0x30]
00b15988	add x29,sp,#0x30
00b1598c	cbz x0,0x00b159d4
00b15990	mov w8,#0x1
00b15994	mov x19,x2
00b15998	mov x20,x1
00b1599c	mov x21,x0
00b159a0	str w8,[x0, #0x10]
00b159a4	bl 0x00c40ef0
00b159a8	ldr x3,[x21, #0x48]
00b159ac	ldp x8,x9,[x21, #0x68]
00b159b0	add x1,x21,#0x38
00b159b4	mov x2,xzr
00b159b8	mov x4,x21
00b159bc	mov x5,xzr
00b159c0	mov x6,x20
00b159c4	mov x7,x19
00b159c8	stp x8,x9,[sp]
00b159cc	bl 0x00c377e0
00b159d0	b 0x00b15a08
00b159d4	bl 0x00c342a0
00b159d8	adrp x0,0x2c4000
00b159dc	adrp x2,0x2ba000
00b159e0	add x0,x0,#0x3b5
00b159e4	add x2,x2,#0x976
00b159e8	mov w1,#0x73
00b159ec	bl 0x00c342b0
00b159f0	mov w1,#0x102
00b159f4	mov w0,#0xb
00b159f8	movk w1,#0xc, LSL #16
00b159fc	mov x2,xzr
00b15a00	bl 0x00c342c0
00b15a04	mov w0,wzr
00b15a08	ldp x29,x30,[sp, #0x30]
00b15a0c	ldp x20,x19,[sp, #0x20]
00b15a10	ldr x21,[sp, #0x10]
00b15a14	add sp,sp,#0x40
00b15a18	ret
