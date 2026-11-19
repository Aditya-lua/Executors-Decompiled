; FUN_00c0de94 @ 00c0de94
00c0de94	paciasp
00c0de98	sub sp,sp,#0x170
00c0de9c	stp x29,x30,[sp, #0x120]
00c0dea0	str x28,[sp, #0x130]
00c0dea4	stp x24,x23,[sp, #0x140]
00c0dea8	stp x22,x21,[sp, #0x150]
00c0deac	stp x20,x19,[sp, #0x160]
00c0deb0	add x29,sp,#0x120
00c0deb4	stp x1,x2,[sp, #0x88]
00c0deb8	adrp x20,0xcb4000
00c0debc	mov x19,x0
00c0dec0	stp x3,x4,[sp, #0x98]
00c0dec4	adrp x0,0x2da000
00c0dec8	add x0,x0,#0xde0
00c0decc	stp x5,x6,[sp, #0xa8]
00c0ded0	mov w1,#0xb
00c0ded4	mov w2,#0x1
00c0ded8	str x7,[sp, #0xb8]
00c0dedc	stp q0,q1,[sp]
00c0dee0	stp q2,q3,[sp, #0x20]
00c0dee4	stp q4,q5,[sp, #0x40]
00c0dee8	stp q6,q7,[sp, #0x60]
00c0deec	ldr x20,[x20, #0xba0]
00c0def0	add x3,x20,#0x130
00c0def4	bl 0x00c308f0
00c0def8	mov x21,#-0x38
00c0defc	mov x8,sp
00c0df00	add x9,sp,#0x88
00c0df04	movk x21,#0xff80, LSL #32
00c0df08	add x22,x8,#0x80
00c0df0c	add x23,x9,#0x38
00c0df10	add x24,x29,#0x50
00c0df14	stp x22,x21,[x29, #-0x10]
00c0df18	add x0,x20,#0x130
00c0df1c	stp x24,x23,[x29, #-0x20]
00c0df20	sub x2,x29,#0x40
00c0df24	mov x1,x19
00c0df28	ldp q1,q0,[x29, #-0x20]
00c0df2c	stp q1,q0,[x29, #-0x40]
00c0df30	bl 0x00c3e020
00c0df34	add x1,x20,#0x130
00c0df38	mov w0,#0xa
00c0df3c	bl 0x00c30900
00c0df40	stp x22,x21,[x29, #-0x10]
00c0df44	add x0,x29,#0x18
00c0df48	sub x2,x29,#0x60
00c0df4c	stp x24,x23,[x29, #-0x20]
00c0df50	mov x1,x19
00c0df54	ldp q1,q0,[x29, #-0x20]
00c0df58	stp q1,q0,[x29, #-0x60]
00c0df5c	bl 0x00c43b20
00c0df60	ldr x0,[x29, #0x18]
00c0df64	bl 0x00c43b50
00c0df68	adrp x0,0x2d8000
00c0df6c	add x0,x0,#0xe5c
00c0df70	mov w1,wzr
00c0df74	mov w2,wzr
00c0df78	bl 0x00c43850
00c0df7c	ldr x2,[x29, #0x18]
00c0df80	adrp x1,0x2b6000
00c0df84	add x1,x1,#0xc62
00c0df88	mov w0,#0x2
00c0df8c	bl 0x00c43820
00c0df90	bl 0x00c439d0
00c0df94	bl 0x00c30b40
