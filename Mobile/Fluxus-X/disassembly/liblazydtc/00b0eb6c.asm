; X509_cmp_timeframe @ 00b0eb6c
00b0eb6c	str x21,[sp, #-0x30]!
00b0eb70	stp x20,x19,[sp, #0x10]
00b0eb74	mov x20,x2
00b0eb78	mov x19,x1
00b0eb7c	mov x21,x0
00b0eb80	stp x29,x30,[sp, #0x20]
00b0eb84	add x29,sp,#0x20
00b0eb88	cbz x0,0x00b0eba8
00b0eb8c	mov x0,x21
00b0eb90	bl 0x00c40e30
00b0eb94	mov x8,x0
00b0eb98	tbnz w8,#0x1,0x00b0ebb0
00b0eb9c	mov x21,xzr
00b0eba0	mov w0,wzr
00b0eba4	tbnz w8,#0x15,0x00b0ec00
00b0eba8	cbnz x20,0x00b0ebc4
00b0ebac	b 0x00b0ebd4
00b0ebb0	mov x0,x21
00b0ebb4	bl 0x00c40e40
00b0ebb8	str x0,[sp, #0x8]
00b0ebbc	add x21,sp,#0x8
00b0ebc0	cbz x20,0x00b0ebd4
00b0ebc4	mov x0,x20
00b0ebc8	mov x1,x21
00b0ebcc	bl 0x00b0ea2c
00b0ebd0	tbnz w0,#0x1f,0x00b0ebfc
00b0ebd4	cbz x19,0x00b0ebf4
00b0ebd8	mov x0,x19
00b0ebdc	mov x1,x21
00b0ebe0	bl 0x00b0ea2c
00b0ebe4	cmp w0,#0x0
00b0ebe8	b.le 0x00b0ebf4
00b0ebec	mov w0,#0xffffffff
00b0ebf0	b 0x00b0ec00
00b0ebf4	mov w0,wzr
00b0ebf8	b 0x00b0ec00
00b0ebfc	mov w0,#0x1
00b0ec00	ldp x29,x30,[sp, #0x20]
00b0ec04	ldp x20,x19,[sp, #0x10]
00b0ec08	ldr x21,[sp], #0x30
00b0ec0c	ret
