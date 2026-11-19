; EVP_PKEY_set_octet_string_param @ 00a6ea94
00a6ea94	sub sp,sp,#0xa0
00a6ea98	str x19,[sp, #0x80]
00a6ea9c	stp x29,x30,[sp, #0x90]
00a6eaa0	add x29,sp,#0x90
00a6eaa4	cbz x1,0x00a6eb44
00a6eaa8	mov x19,x0
00a6eaac	add x8,sp,#0x8
00a6eab0	mov x0,x1
00a6eab4	mov x1,x2
00a6eab8	mov x2,x3
00a6eabc	bl 0x00c34c50
00a6eac0	ldr x8,[sp, #0x28]
00a6eac4	ldur q0,[sp, #0x18]
00a6eac8	ldur q1,[sp, #0x8]
00a6eacc	str x8,[sp, #0x50]
00a6ead0	add x8,sp,#0x8
00a6ead4	stp q1,q0,[sp, #0x30]
00a6ead8	bl 0x00c34c40
00a6eadc	ldr x8,[sp, #0x28]
00a6eae0	ldur q0,[sp, #0x18]
00a6eae4	ldur q1,[sp, #0x8]
00a6eae8	str x8,[sp, #0x78]
00a6eaec	stur q0,[sp, #0x68]
00a6eaf0	stur q1,[sp, #0x58]
00a6eaf4	cbz x19,0x00a6eb18
00a6eaf8	ldr x0,[x19, #0x60]
00a6eafc	cbz x0,0x00a6eb18
00a6eb00	ldp x1,x8,[x19, #0x68]
00a6eb04	add x2,sp,#0x30
00a6eb08	add x8,x8,#0x1
00a6eb0c	str x8,[x19, #0x70]
00a6eb10	bl 0x00c3d440
00a6eb14	b 0x00a6eb48
00a6eb18	bl 0x00c342a0
00a6eb1c	adrp x0,0x2c1000
00a6eb20	adrp x2,0x2dc000
00a6eb24	add x0,x0,#0xcf9
00a6eb28	add x2,x2,#0x96
00a6eb2c	mov w1,#0x94c
00a6eb30	bl 0x00c342b0
00a6eb34	orr w0,wzr,#0x6
00a6eb38	mov w1,#0xa3
00a6eb3c	mov x2,xzr
00a6eb40	bl 0x00c342c0
00a6eb44	mov w0,wzr
00a6eb48	ldp x29,x30,[sp, #0x90]
00a6eb4c	ldr x19,[sp, #0x80]
00a6eb50	add sp,sp,#0xa0
00a6eb54	ret
