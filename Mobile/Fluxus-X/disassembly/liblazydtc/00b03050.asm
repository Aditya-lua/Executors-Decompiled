; X509_get_extended_key_usage @ 00b03050
00b03050	str x19,[sp, #-0x20]!
00b03054	stp x29,x30,[sp, #0x10]
00b03058	add x29,sp,#0x10
00b0305c	mov x19,x0
00b03060	bl 0x00b01d98
00b03064	cbz w0,0x00b0307c
00b03068	ldrb w8,[x19, #0xe8]
00b0306c	tbnz w8,#0x2,0x00b03078
00b03070	mov w0,#0xffffffff
00b03074	b 0x00b0307c
00b03078	ldr w0,[x19, #0xf0]
00b0307c	ldp x29,x30,[sp, #0x10]
00b03080	ldr x19,[sp], #0x20
00b03084	ret
