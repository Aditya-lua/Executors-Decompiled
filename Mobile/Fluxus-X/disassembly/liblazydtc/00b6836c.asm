; ossl_cipher_hw_generic_cfb128 @ 00b6836c
00b6836c	str x19,[sp, #-0x20]!
00b68370	stp x29,x30,[sp, #0x10]
00b68374	ldr w9,[x0, #0xa0]
00b68378	add x29,sp,#0x10
00b6837c	mov x8,x3
00b68380	mov x19,x0
00b68384	stur w9,[x29, #-0x4]
00b68388	ldrb w9,[x0, #0x6c]
00b6838c	ldr x3,[x0, #0xb0]
00b68390	ldr x7,[x0, #0x30]
00b68394	add x4,x0,#0x20
00b68398	ubfx w6,w9,#0x1,#0x1
00b6839c	sub x5,x29,#0x4
00b683a0	mov x0,x2
00b683a4	mov x2,x8
00b683a8	bl 0x00c3e300
00b683ac	ldur w8,[x29, #-0x4]
00b683b0	mov w0,#0x1
00b683b4	str w8,[x19, #0xa0]
00b683b8	ldp x29,x30,[sp, #0x10]
00b683bc	ldr x19,[sp], #0x20
00b683c0	ret
