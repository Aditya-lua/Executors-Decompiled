; FUN_00c10abc @ 00c10abc
00c10abc	bti c
00c10ac0	mov x8,x0
00c10ac4	ldr x0,[x0]
00c10ac8	ldr x9,[x8, #0x8]
00c10acc	mov x10,x0
00c10ad0	tbz w1,#0x0,0x00c10af8
00c10ad4	cmp x0,x9
00c10ad8	mov x10,x0
00c10adc	b.eq 0x00c10af8
00c10ae0	ldrb w10,[x0]
00c10ae4	cmp w10,#0x6e
00c10ae8	mov x10,x0
00c10aec	b.ne 0x00c10af8
00c10af0	add x10,x0,#0x1
00c10af4	str x10,[x8]
00c10af8	cmp x9,x10
00c10afc	b.eq 0x00c10b10
00c10b00	ldrb w11,[x10]
00c10b04	sub w11,w11,#0x3a
00c10b08	cmn w11,#0xa
00c10b0c	b.cs 0x00c10b1c
00c10b10	mov x0,xzr
00c10b14	mov x1,xzr
00c10b18	ret
00c10b1c	ldrb w11,[x10]
00c10b20	sub w11,w11,#0x3a
00c10b24	cmn w11,#0xa
00c10b28	b.cc 0x00c10b40
00c10b2c	add x10,x10,#0x1
00c10b30	cmp x10,x9
00c10b34	str x10,[x8]
00c10b38	b.ne 0x00c10b1c
00c10b3c	mov x10,x9
00c10b40	sub x1,x10,x0
00c10b44	ret
