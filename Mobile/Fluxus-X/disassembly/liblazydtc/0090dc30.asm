; FUN_0090dc30 @ 0090dc30
0090dc30	stp x28,x27,[sp, #-0x60]!
0090dc34	stp x26,x25,[sp, #0x10]
0090dc38	stp x24,x23,[sp, #0x20]
0090dc3c	stp x22,x21,[sp, #0x30]
0090dc40	stp x20,x19,[sp, #0x40]
0090dc44	stp x29,x30,[sp, #0x50]
0090dc48	add x29,sp,#0x50
0090dc4c	sub sp,sp,#0x1a0
0090dc50	mrs x24,tpidr_el0
0090dc54	ldr x8,[x24, #0x28]
0090dc58	mov x25,sp
0090dc5c	mov x22,x3
0090dc60	mov x21,x1
0090dc64	str x8,[x25]
0090dc68	add x8,x1,w2, SXTW  #0x3
0090dc6c	ldr x19,[x8, #0x248]
0090dc70	mov x20,x0
0090dc74	cbz x19,0x0090dc8c
0090dc78	ldr x8,[x19]
0090dc7c	adrp x9,0xcc4000
0090dc80	add x9,x9,#0xa88
0090dc84	cmp x8,x9
0090dc88	b.eq 0x0090dcc0
0090dc8c	mov w0,#0x2
0090dc90	ldr x8,[x24, #0x28]
0090dc94	ldr x9,[x25]
0090dc98	cmp x8,x9
0090dc9c	b.ne 0x0090de58
0090dca0	add sp,sp,#0x1a0
0090dca4	ldp x29,x30,[sp, #0x50]
0090dca8	ldp x20,x19,[sp, #0x40]
0090dcac	ldp x22,x21,[sp, #0x30]
0090dcb0	ldp x24,x23,[sp, #0x20]
0090dcb4	ldp x26,x25,[sp, #0x10]
0090dcb8	ldp x28,x27,[sp], #0x60
0090dcbc	ret
0090dcc0	ldr x26,[x19, #0x10]
0090dcc4	ldr x28,[x21, #0x18]
0090dcc8	mov x0,x20
0090dccc	sxtw x27,w2
0090dcd0	ldr w23,[x26, #0x98]
0090dcd4	mov w1,w23
0090dcd8	bl 0x0092e498
0090dcdc	cbz x28,0x0090dd08
0090dce0	mov w1,#0x1
0090dce4	mov x0,x20
0090dce8	bl 0x0092f198
0090dcec	ldp x8,x0,[x21, #0x18]
0090dcf0	mov w1,w23
0090dcf4	blr x8
0090dcf8	mov x0,x20
0090dcfc	mov w1,wzr
0090dd00	bl 0x0092f198
0090dd04	b 0x0090dd10
0090dd08	mov w0,w23
0090dd0c	bl 0x00c31bf0
0090dd10	ldr w8,[x22]
0090dd14	add x9,x21,x27, LSL #0x2
0090dd18	add x0,sp,#0x10
0090dd1c	mov w2,#0x80
0090dd20	str w8,[x26, #0x98]
0090dd24	str w8,[x9, #0x220]
0090dd28	ldr x21,[x19, #0x10]
0090dd2c	mov w8,#0x80
0090dd30	mov w1,wzr
0090dd34	str wzr,[x21, #0xf8]!
0090dd38	mov x22,x21
0090dd3c	strb wzr,[x22, #-0x5c]!
0090dd40	str w8,[sp, #0xc]
0090dd44	bl 0x00c301c0
0090dd48	ldur w0,[x21, #-0x60]
0090dd4c	add x1,sp,#0x10
0090dd50	add x2,sp,#0xc
0090dd54	bl 0x00c31c10
0090dd58	cbz w0,0x0090dd84
0090dd5c	bl 0x00c30710
0090dd60	ldr w21,[x0]
0090dd64	add x1,sp,#0x90
0090dd68	mov w2,#0x100
0090dd6c	mov w0,w21
0090dd70	bl 0x00941a94
0090dd74	adrp x1,0x2c8000
0090dd78	mov x3,x0
0090dd7c	add x1,x1,#0xd3e
0090dd80	b 0x0090ddc0
0090dd84	ldr w1,[sp, #0xc]
0090dd88	add x0,sp,#0x10
0090dd8c	mov x2,x22
0090dd90	mov x3,x21
0090dd94	bl 0x00908a98
0090dd98	tbnz w0,#0x0,0x0090ddcc
0090dd9c	bl 0x00c30710
0090dda0	ldr w21,[x0]
0090dda4	add x1,sp,#0x90
0090dda8	mov w2,#0x100
0090ddac	mov w0,w21
0090ddb0	bl 0x00941a94
0090ddb4	adrp x1,0x2c2000
0090ddb8	mov x3,x0
0090ddbc	add x1,x1,#0xed7
0090ddc0	mov x0,x20
0090ddc4	mov w2,w21
0090ddc8	bl 0x00904b80
0090ddcc	mov x0,x19
0090ddd0	mov x1,x20
0090ddd4	bl 0x0090db1c
0090ddd8	ldrb w8,[x26, #0x134]
0090dddc	mov w9,#0xa
0090dde0	orr w8,w8,w9
0090dde4	strb w8,[x26, #0x134]
0090dde8	bl 0x00941cb8
0090ddec	stp x0,x1,[x26, #0x110]
0090ddf0	ldrb w8,[x19, #0x24]
0090ddf4	orr w8,w8,#0x1
0090ddf8	strb w8,[x19, #0x24]
0090ddfc	cbz x20,0x0090de50
0090de00	ldrb w8,[x20, #0xa85]
0090de04	mov w0,wzr
0090de08	tbz w8,#0x4,0x0090dc90
0090de0c	ldr x8,[x20, #0x12a0]
0090de10	cbz x8,0x0090de20
0090de14	ldr w8,[x8, #0x8]
0090de18	cmp w8,#0x1
0090de1c	b.lt 0x0090de50
0090de20	ldr x8,[x19]
0090de24	ldr w8,[x8, #0xc]
0090de28	cmp w8,#0x1
0090de2c	b.lt 0x0090de50
0090de30	ldr w3,[x26, #0x98]
0090de34	ldr w5,[x26, #0xf8]
0090de38	adrp x2,0x2af000
0090de3c	add x4,x26,#0x9c
0090de40	add x2,x2,#0x167
0090de44	mov x0,x20
0090de48	mov x1,x19
0090de4c	bl 0x00904ddc
0090de50	mov w0,wzr
0090de54	b 0x0090dc90
0090de58	bl 0x00c2fec0
