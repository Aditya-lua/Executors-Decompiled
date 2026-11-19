; FUN_00c13a8c @ 00c13a8c
00c13a8c	paciasp
00c13a90	stp x29,x30,[sp, #-0x30]!
00c13a94	stp x22,x21,[sp, #0x10]
00c13a98	stp x20,x19,[sp, #0x20]
00c13a9c	mov x29,sp
00c13aa0	ldr x22,[x0, #0x1330]
00c13aa4	mov x19,x2
00c13aa8	mov x20,x1
00c13aac	ldr x8,[x22, #0x8]
00c13ab0	sub x9,x8,#0xfd0
00c13ab4	cmn x9,#0xff1
00c13ab8	b.hi 0x00c13adc
00c13abc	mov x21,x0
00c13ac0	mov w0,#0x1000
00c13ac4	bl 0x00c308d0
00c13ac8	cbz x0,0x00c13b30
00c13acc	mov x8,xzr
00c13ad0	stp x22,xzr,[x0]
00c13ad4	mov x22,x0
00c13ad8	str x0,[x21, #0x1330]
00c13adc	add x9,x8,#0x20
00c13ae0	add x0,x22,x8
00c13ae4	adrp x8,0xcb1000
00c13ae8	add x8,x8,#0x448
00c13aec	str x9,[x22, #0x8]
00c13af0	mov w9,#0x16
00c13af4	str x8,[x0, #0x10]!
00c13af8	ldurh w8,[x0, #0x9]
00c13afc	mov w10,#0x540
00c13b00	strb w9,[x0, #0x8]
00c13b04	ldr x9,[x20]
00c13b08	and w8,w8,#0xf000
00c13b0c	orr w8,w8,w10
00c13b10	ldr x10,[x19]
00c13b14	sturh w8,[x0, #0x9]
00c13b18	stp x9,x10,[x0, #0x10]
00c13b1c	ldp x20,x19,[sp, #0x20]
00c13b20	ldp x22,x21,[sp, #0x10]
00c13b24	ldp x29,x30,[sp], #0x30
00c13b28	autiasp
00c13b2c	ret
00c13b30	bl 0x00c2fff0
