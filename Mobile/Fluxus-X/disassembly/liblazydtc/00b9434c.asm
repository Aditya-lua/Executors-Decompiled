; mbedtls_ecp_gen_keypair_base @ 00b9434c
00b9434c	stp x24,x23,[sp, #-0x40]!
00b94350	stp x22,x21,[sp, #0x10]
00b94354	stp x20,x19,[sp, #0x20]
00b94358	stp x29,x30,[sp, #0x30]
00b9435c	add x29,sp,#0x30
00b94360	mov x23,x3
00b94364	mov x22,x2
00b94368	mov x21,x1
00b9436c	mov x1,x2
00b94370	mov x2,x4
00b94374	mov x3,x5
00b94378	mov x19,x5
00b9437c	mov x20,x4
00b94380	mov x24,x0
00b94384	bl 0x00c42680
00b94388	cbz w0,0x00b943a0
00b9438c	ldp x29,x30,[sp, #0x30]
00b94390	ldp x20,x19,[sp, #0x20]
00b94394	ldp x22,x21,[sp, #0x10]
00b94398	ldp x24,x23,[sp], #0x40
00b9439c	ret
00b943a0	cbz x20,0x00b943d0
00b943a4	mov x2,x22
00b943a8	mov x3,x21
00b943ac	mov x4,x20
00b943b0	mov x5,x19
00b943b4	ldp x29,x30,[sp, #0x30]
00b943b8	ldp x20,x19,[sp, #0x20]
00b943bc	ldp x22,x21,[sp, #0x10]
00b943c0	mov x0,x24
00b943c4	mov x1,x23
00b943c8	ldp x24,x23,[sp], #0x40
00b943cc	b 0x00b923c4
00b943d0	mov w0,#0xffffb080
00b943d4	b 0x00b9438c
