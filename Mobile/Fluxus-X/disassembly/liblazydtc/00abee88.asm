; PKCS7_get_octet_string @ 00abee88
00abee88	str x19,[sp, #-0x20]!
00abee8c	stp x29,x30,[sp, #0x10]
00abee90	mov x19,x0
00abee94	ldr x0,[x0, #0x18]
00abee98	add x29,sp,#0x10
00abee9c	bl 0x00c37750
00abeea0	cmp w0,#0x15
00abeea4	b.ne 0x00abeeb0
00abeea8	ldr x0,[x19, #0x20]
00abeeac	b 0x00abeeec
00abeeb0	ldr x0,[x19, #0x18]
00abeeb4	bl 0x00c37750
00abeeb8	sub w8,w0,#0x15
00abeebc	cmp w8,#0x6
00abeec0	mov x0,xzr
00abeec4	b.cc 0x00abeeec
00abeec8	ldr x8,[x19, #0x20]
00abeecc	cbz x8,0x00abeee8
00abeed0	ldr w9,[x8]
00abeed4	mov x0,xzr
00abeed8	cmp w9,#0x4
00abeedc	b.ne 0x00abeeec
00abeee0	ldr x0,[x8, #0x8]
00abeee4	b 0x00abeeec
00abeee8	mov x0,xzr
00abeeec	ldp x29,x30,[sp, #0x10]
00abeef0	ldr x19,[sp], #0x20
00abeef4	ret
