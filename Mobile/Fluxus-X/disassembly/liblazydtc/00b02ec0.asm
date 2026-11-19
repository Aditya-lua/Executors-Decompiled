; X509_check_issued @ 00b02ec0
00b02ec0	stp x20,x19,[sp, #-0x20]!
00b02ec4	stp x29,x30,[sp, #0x10]
00b02ec8	add x29,sp,#0x10
00b02ecc	mov x20,x1
00b02ed0	mov x19,x0
00b02ed4	bl 0x00b02f20
00b02ed8	cbnz w0,0x00b02f14
00b02edc	ldrb w9,[x20, #0xe9]
00b02ee0	ldr w8,[x19, #0xe8]
00b02ee4	tbnz w9,#0x2,0x00b02efc
00b02ee8	tbz w8,#0x1,0x00b02f10
00b02eec	ldrb w8,[x19, #0xec]
00b02ef0	tbnz w8,#0x2,0x00b02f10
00b02ef4	mov w0,#0x20
00b02ef8	b 0x00b02f14
00b02efc	tbz w8,#0x1,0x00b02f10
00b02f00	ldrb w8,[x19, #0xec]
00b02f04	tbnz w8,#0x7,0x00b02f10
00b02f08	mov w0,#0x27
00b02f0c	b 0x00b02f14
00b02f10	mov w0,wzr
00b02f14	ldp x29,x30,[sp, #0x10]
00b02f18	ldp x20,x19,[sp], #0x20
00b02f1c	ret
