; X509_get_key_usage @ 00b03018
00b03018	str x19,[sp, #-0x20]!
00b0301c	stp x29,x30,[sp, #0x10]
00b03020	add x29,sp,#0x10
00b03024	mov x19,x0
00b03028	bl 0x00b01d98
00b0302c	cbz w0,0x00b03044
00b03030	ldrb w8,[x19, #0xe8]
00b03034	tbnz w8,#0x1,0x00b03040
00b03038	mov w0,#0xffffffff
00b0303c	b 0x00b03044
00b03040	ldr w0,[x19, #0xec]
00b03044	ldp x29,x30,[sp, #0x10]
00b03048	ldr x19,[sp], #0x20
00b0304c	ret
