; mbedtls_ecp_group_free @ 00b91ad8
00b91ad8	stp x22,x21,[sp, #-0x30]!
00b91adc	stp x20,x19,[sp, #0x10]
00b91ae0	stp x29,x30,[sp, #0x20]
00b91ae4	add x29,sp,#0x20
00b91ae8	mov x19,x0
00b91aec	cbz x0,0x00b91ba0
00b91af0	ldr w8,[x19, #0x88]
00b91af4	cmp w8,#0x1
00b91af8	b.eq 0x00b91b34
00b91afc	add x0,x19,#0x18
00b91b00	bl 0x00c41bb0
00b91b04	add x0,x19,#0x28
00b91b08	bl 0x00c41bb0
00b91b0c	add x0,x19,#0x38
00b91b10	bl 0x00c41bb0
00b91b14	add x0,x19,#0x48
00b91b18	bl 0x00c41bb0
00b91b1c	add x0,x19,#0x58
00b91b20	bl 0x00c41bb0
00b91b24	add x0,x19,#0x68
00b91b28	bl 0x00c41bb0
00b91b2c	add x0,x19,#0x8
00b91b30	bl 0x00c41bb0
00b91b34	ldr x0,[x19, #0xb0]
00b91b38	cbz x0,0x00b91b88
00b91b3c	ldr x8,[x19, #0xb8]
00b91b40	cbz x8,0x00b91b88
00b91b44	mov x21,xzr
00b91b48	mov x22,xzr
00b91b4c	cmn x0,x21
00b91b50	b.eq 0x00b91b74
00b91b54	add x20,x0,x21
00b91b58	mov x0,x20
00b91b5c	bl 0x00c41bb0
00b91b60	add x0,x20,#0x10
00b91b64	bl 0x00c41bb0
00b91b68	add x0,x20,#0x20
00b91b6c	bl 0x00c41bb0
00b91b70	ldp x0,x8,[x19, #0xb0]
00b91b74	add x22,x22,#0x1
00b91b78	cmp x22,x8
00b91b7c	add x21,x21,#0x30
00b91b80	b.cc 0x00b91b4c
00b91b84	bl 0x00c30960
00b91b88	mov x0,x19
00b91b8c	ldp x29,x30,[sp, #0x20]
00b91b90	ldp x20,x19,[sp, #0x10]
00b91b94	orr w1,wzr,#0xc0
00b91b98	ldp x22,x21,[sp], #0x30
00b91b9c	b 0x00c42220
00b91ba0	ldp x29,x30,[sp, #0x20]
00b91ba4	ldp x20,x19,[sp, #0x10]
00b91ba8	ldp x22,x21,[sp], #0x30
00b91bac	ret
