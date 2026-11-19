; FUN_00bc6aa0 @ 00bc6aa0
00bc6aa0	bti c
00bc6aa4	cbz x2,0x00bc6b38
00bc6aa8	paciasp
00bc6aac	stp x29,x30,[sp, #-0x30]!
00bc6ab0	stp x22,x21,[sp, #0x10]
00bc6ab4	stp x20,x19,[sp, #0x20]
00bc6ab8	mov x29,sp
00bc6abc	ldrb w8,[x0]
00bc6ac0	ldp x10,x11,[x0, #0x8]
00bc6ac4	lsr x9,x8,#0x1
00bc6ac8	tst w8,#0x1
00bc6acc	csel x20,x9,x10,eq
00bc6ad0	add x10,x0,#0x4
00bc6ad4	sub x9,x20,x1
00bc6ad8	csel x19,x10,x11,eq
00bc6adc	cmp x9,x2
00bc6ae0	csel x21,x9,x2,cc
00bc6ae4	b.ls 0x00bc6b0c
00bc6ae8	add x8,x19,x1, LSL #0x2
00bc6aec	sub x9,x9,x21
00bc6af0	mov x22,x0
00bc6af4	lsl x2,x9,#0x2
00bc6af8	add x1,x8,x21, LSL #0x2
00bc6afc	mov x0,x8
00bc6b00	bl 0x00c2ff60
00bc6b04	ldrb w8,[x22]
00bc6b08	mov x0,x22
00bc6b0c	sub x9,x20,x21
00bc6b10	tbnz w8,#0x0,0x00bc6b20
00bc6b14	lsl w8,w9,#0x1
00bc6b18	strb w8,[x0]
00bc6b1c	b 0x00bc6b24
00bc6b20	str x9,[x0, #0x8]
00bc6b24	str wzr,[x19, x9, LSL #0x2]
00bc6b28	ldp x20,x19,[sp, #0x20]
00bc6b2c	ldp x22,x21,[sp, #0x10]
00bc6b30	ldp x29,x30,[sp], #0x30
00bc6b34	autiasp
00bc6b38	ret
