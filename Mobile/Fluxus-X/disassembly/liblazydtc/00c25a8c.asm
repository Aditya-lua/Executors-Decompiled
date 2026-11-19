; FUN_00c25a8c @ 00c25a8c
00c25a8c	paciasp
00c25a90	stp x29,x30,[sp, #-0x30]!
00c25a94	stp x22,x21,[sp, #0x10]
00c25a98	stp x20,x19,[sp, #0x20]
00c25a9c	mov x29,sp
00c25aa0	ldr x22,[x0, #0x1330]
00c25aa4	mov x19,x2
00c25aa8	mov x20,x1
00c25aac	ldr x8,[x22, #0x8]
00c25ab0	sub x9,x8,#0xfc0
00c25ab4	cmn x9,#0xff1
00c25ab8	b.hi 0x00c25adc
00c25abc	mov x21,x0
00c25ac0	mov w0,#0x1000
00c25ac4	bl 0x00c308d0
00c25ac8	cbz x0,0x00c25b34
00c25acc	mov x8,xzr
00c25ad0	stp x22,xzr,[x0]
00c25ad4	mov x22,x0
00c25ad8	str x0,[x21, #0x1330]
00c25adc	add x9,x8,#0x30
00c25ae0	add x0,x22,x8
00c25ae4	ldr x8,[x20]
00c25ae8	str x9,[x22, #0x8]
00c25aec	adrp x9,0xcb3000
00c25af0	add x9,x9,#0xd40
00c25af4	mov w10,#0x5
00c25af8	str x9,[x0, #0x10]!
00c25afc	ldurh w9,[x0, #0x9]
00c25b00	strb w10,[x0, #0x8]
00c25b04	mov w10,#0x540
00c25b08	str x8,[x0, #0x10]
00c25b0c	and w8,w9,#0xf000
00c25b10	ldr q0,[x19]
00c25b14	orr w8,w8,w10
00c25b18	sturh w8,[x0, #0x9]
00c25b1c	stur q0,[x0, #0x18]
00c25b20	ldp x20,x19,[sp, #0x20]
00c25b24	ldp x22,x21,[sp, #0x10]
00c25b28	ldp x29,x30,[sp], #0x30
00c25b2c	autiasp
00c25b30	ret
00c25b34	bl 0x00c2fff0
