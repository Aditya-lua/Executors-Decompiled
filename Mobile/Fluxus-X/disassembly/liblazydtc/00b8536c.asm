; mbedtls_asn1_write_raw_buffer @ 00b8536c
00b8536c	str x19,[sp, #-0x20]!
00b85370	stp x29,x30,[sp, #0x10]
00b85374	add x29,sp,#0x10
00b85378	ldr x8,[x0]
00b8537c	mov x19,x3
00b85380	subs x9,x8,x1
00b85384	b.cc 0x00b85390
00b85388	cmp x9,x19
00b8538c	b.cs 0x00b85398
00b85390	mov w19,#0xffffff94
00b85394	b 0x00b853b0
00b85398	sub x8,x8,x19
00b8539c	str x8,[x0]
00b853a0	mov x0,x8
00b853a4	mov x1,x2
00b853a8	mov x2,x19
00b853ac	bl 0x00c2ffd0
00b853b0	ldp x29,x30,[sp, #0x10]
00b853b4	mov w0,w19
00b853b8	ldr x19,[sp], #0x20
00b853bc	ret
