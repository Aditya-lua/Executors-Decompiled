; FUN_00873af8 @ 00873af8
00873af8	stp x29,x30,[sp, #-0x20]!
00873afc	str x19,[sp, #0x10]
00873b00	mov x29,sp
00873b04	mov x19,x0
00873b08	ldr x0,[x0]
00873b0c	cbz x0,0x00873b3c
00873b10	bl 0x00c301d0
00873b14	ldr x0,[x19, #0x18]
00873b18	str xzr,[x19]
00873b1c	bl 0x00c301d0
00873b20	mov x0,xzr
00873b24	stp xzr,xzr,[x19, #0x8]
00873b28	str xzr,[x19, #0x18]
00873b2c	bl 0x00c301d0
00873b30	mov w8,#0x40
00873b34	str xzr,[x19, #0x20]
00873b38	strb w8,[x19, #0x30]
00873b3c	ldr x0,[x19, #0x18]
00873b40	ldr x19,[sp, #0x10]
00873b44	ldp x29,x30,[sp], #0x20
00873b48	b 0x00c301d0
