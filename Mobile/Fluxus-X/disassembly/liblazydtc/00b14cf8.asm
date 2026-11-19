; X509_NAME_get_entry @ 00b14cf8
00b14cf8	stp x20,x19,[sp, #-0x20]!
00b14cfc	stp x29,x30,[sp, #0x10]
00b14d00	add x29,sp,#0x10
00b14d04	cbz x0,0x00b14d3c
00b14d08	mov x20,x0
00b14d0c	ldr x0,[x0]
00b14d10	mov w19,w1
00b14d14	bl 0x00c325e0
00b14d18	tbnz w19,#0x1f,0x00b14d38
00b14d1c	cmp w0,w19
00b14d20	mov x0,xzr
00b14d24	b.le 0x00b14d3c
00b14d28	ldr x0,[x20]
00b14d2c	mov w1,w19
00b14d30	bl 0x00c32610
00b14d34	b 0x00b14d3c
00b14d38	mov x0,xzr
00b14d3c	ldp x29,x30,[sp, #0x10]
00b14d40	ldp x20,x19,[sp], #0x20
00b14d44	ret
