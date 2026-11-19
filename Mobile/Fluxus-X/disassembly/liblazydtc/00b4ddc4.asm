; FUN_00b4ddc4 @ 00b4ddc4
00b4ddc4	sub sp,sp,#0xd0
00b4ddc8	stp x29,x30,[sp, #0xc0]
00b4ddcc	add x29,sp,#0xc0
00b4ddd0	stp w1,w0,[x29, #-0x8]
00b4ddd4	mov x0,x2
00b4ddd8	str x19,[sp, #0xb0]
00b4dddc	bl 0x00c38c30
00b4dde0	mov x19,x0
00b4dde4	add x0,sp,#0x30
00b4dde8	orr w2,wzr,#0x78
00b4ddec	mov w1,wzr
00b4ddf0	bl 0x00c301c0
00b4ddf4	adrp x0,0x2a0000
00b4ddf8	add x0,x0,#0x361
00b4ddfc	add x8,sp,#0x8
00b4de00	sub x1,x29,#0x4
00b4de04	bl 0x00c36260
00b4de08	ldr x8,[sp, #0x28]
00b4de0c	ldur q0,[sp, #0x18]
00b4de10	ldur q1,[sp, #0x8]
00b4de14	adrp x0,0x2cd000
00b4de18	str x8,[sp, #0x50]
00b4de1c	add x0,x0,#0xb87
00b4de20	add x8,sp,#0x8
00b4de24	sub x1,x29,#0x8
00b4de28	stp q1,q0,[sp, #0x30]
00b4de2c	bl 0x00c36260
00b4de30	ldr x8,[sp, #0x28]
00b4de34	ldur q0,[sp, #0x18]
00b4de38	ldur q1,[sp, #0x8]
00b4de3c	add x0,sp,#0x30
00b4de40	str x8,[sp, #0x78]
00b4de44	stur q0,[sp, #0x68]
00b4de48	stur q1,[sp, #0x58]
00b4de4c	ldp x8,x1,[x19, #0x58]
00b4de50	blr x8
00b4de54	ldp x29,x30,[sp, #0xc0]
00b4de58	ldr x19,[sp, #0xb0]
00b4de5c	add sp,sp,#0xd0
00b4de60	ret
