; FUN_00934ad0 @ 00934ad0
00934ad0	str x23,[sp, #-0x40]!
00934ad4	stp x22,x21,[sp, #0x10]
00934ad8	stp x20,x19,[sp, #0x20]
00934adc	stp x29,x30,[sp, #0x30]
00934ae0	add x29,sp,#0x30
00934ae4	ldp w8,w9,[x0, #0x8]
00934ae8	mov w19,w2
00934aec	mov x20,x0
00934af0	mov w21,w1
00934af4	cmp w8,w9
00934af8	b.cs 0x00934b04
00934afc	ldr x22,[x20]
00934b00	b 0x00934b70
00934b04	adrp x8,0xcc4000
00934b08	add x8,x8,#0x690
00934b0c	add w23,w9,#0x64
00934b10	mov w1,#0x8
00934b14	mov x0,x23
00934b18	ldr x8,[x8]
00934b1c	blr x8
00934b20	mov x22,x0
00934b24	cbz x0,0x00934b9c
00934b28	ldr w8,[x20, #0xc]
00934b2c	ldr x1,[x20]
00934b30	mov x0,x22
00934b34	lsl x2,x8,#0x3
00934b38	bl 0x00c2ffd0
00934b3c	ldrb w9,[x20, #0x10]
00934b40	tbz w9,#0x0,0x00934b5c
00934b44	adrp x8,0xcc4000
00934b48	add x8,x8,#0x678
00934b4c	ldr x0,[x20]
00934b50	ldr x8,[x8]
00934b54	blr x8
00934b58	ldrb w9,[x20, #0x10]
00934b5c	ldr w8,[x20, #0x8]
00934b60	orr w9,w9,#0x1
00934b64	str x22,[x20]
00934b68	str w23,[x20, #0xc]
00934b6c	strb w9,[x20, #0x10]
00934b70	mov w0,wzr
00934b74	add x9,x22,w8, UXTW  #0x3
00934b78	add w8,w8,#0x1
00934b7c	str w21,[x9]
00934b80	strh w19,[x9, #0x4]
00934b84	str w8,[x20, #0x8]
00934b88	ldp x29,x30,[sp, #0x30]
00934b8c	ldp x20,x19,[sp, #0x20]
00934b90	ldp x22,x21,[sp, #0x10]
00934b94	ldr x23,[sp], #0x40
00934b98	ret
00934b9c	mov w0,#0x1b
00934ba0	b 0x00934b88
