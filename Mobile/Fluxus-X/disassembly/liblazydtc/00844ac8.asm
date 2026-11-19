; FUN_00844ac8 @ 00844ac8
00844ac8	stp x29,x30,[sp, #-0x30]!
00844acc	str x21,[sp, #0x10]
00844ad0	stp x20,x19,[sp, #0x20]
00844ad4	mov x29,sp
00844ad8	ldp x20,x21,[x0, #0x8]
00844adc	mov x19,x0
00844ae0	b 0x00844ae8
00844ae4	ldr x21,[x19, #0x10]
00844ae8	cmp x20,x21
00844aec	b.eq 0x00844b2c
00844af0	ldur x0,[x21, #-0x28]
00844af4	sub x8,x21,#0x60
00844af8	str x8,[x19, #0x10]
00844afc	cbz x0,0x00844b10
00844b00	ldur x8,[x21, #-0x18]
00844b04	stur x0,[x21, #-0x20]
00844b08	sub x1,x8,x0
00844b0c	bl 0x00c2fe80
00844b10	ldur x0,[x21, #-0x40]
00844b14	cbz x0,0x00844ae4
00844b18	ldur x8,[x21, #-0x30]
00844b1c	stur x0,[x21, #-0x38]
00844b20	sub x1,x8,x0
00844b24	bl 0x00c2fe80
00844b28	b 0x00844ae4
00844b2c	ldr x0,[x19]
00844b30	cbz x0,0x00844b4c
00844b34	ldr x8,[x19, #0x18]
00844b38	sub x1,x8,x0
00844b3c	ldp x20,x19,[sp, #0x20]
00844b40	ldr x21,[sp, #0x10]
00844b44	ldp x29,x30,[sp], #0x30
00844b48	b 0x00c2fe80
00844b4c	ldp x20,x19,[sp, #0x20]
00844b50	ldr x21,[sp, #0x10]
00844b54	ldp x29,x30,[sp], #0x30
00844b58	ret
