; FUN_00b19adc @ 00b19adc
00b19adc	stp x22,x21,[sp, #-0x30]!
00b19ae0	stp x20,x19,[sp, #0x10]
00b19ae4	stp x29,x30,[sp, #0x20]
00b19ae8	ldr x8,[x0, #0x40]
00b19aec	mov w21,w2
00b19af0	mov x19,x0
00b19af4	mov x22,x1
00b19af8	ldr w9,[x8]
00b19afc	add x29,sp,#0x20
00b19b00	cmp w9,#0x5
00b19b04	b.eq 0x00b19b20
00b19b08	mov x0,x19
00b19b0c	mov x1,x8
00b19b10	bl 0x00b1a170
00b19b14	mov w20,w0
00b19b18	cmp w0,#0x1
00b19b1c	b.lt 0x00b19b68
00b19b20	bl 0x00c30710
00b19b24	str wzr,[x0]
00b19b28	ldr w0,[x19, #0x38]
00b19b2c	sxtw x2,w21
00b19b30	mov x1,x22
00b19b34	bl 0x00c31cc0
00b19b38	mov x20,x0
00b19b3c	orr w1,wzr,#0xf
00b19b40	mov x0,x19
00b19b44	bl 0x00c32190
00b19b48	cmp w20,#0x0
00b19b4c	b.gt 0x00b19b68
00b19b50	mov w0,w20
00b19b54	bl 0x00c38770
00b19b58	cbz w0,0x00b19b68
00b19b5c	mov w1,#0xa
00b19b60	mov x0,x19
00b19b64	bl 0x00c322a0
00b19b68	mov w0,w20
00b19b6c	ldp x29,x30,[sp, #0x20]
00b19b70	ldp x20,x19,[sp, #0x10]
00b19b74	ldp x22,x21,[sp], #0x30
00b19b78	ret
