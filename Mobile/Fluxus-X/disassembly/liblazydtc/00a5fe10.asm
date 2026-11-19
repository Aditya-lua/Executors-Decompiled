; EVP_PKEY_Q_keygen @ 00a5fe10
00a5fe10	sub sp,sp,#0x190
00a5fe14	stp x29,x30,[sp, #0x180]
00a5fe18	add x29,sp,#0x180
00a5fe1c	stp x22,x21,[sp, #0x160]
00a5fe20	stp x20,x19,[sp, #0x170]
00a5fe24	mov x20,x2
00a5fe28	mov x19,x1
00a5fe2c	mov x21,x0
00a5fe30	sub x0,x29,#0xb0
00a5fe34	mov w2,#0x50
00a5fe38	mov w1,wzr
00a5fe3c	str x28,[sp, #0x150]
00a5fe40	add x22,sp,#0xa8
00a5fe44	stp q6,q7,[sp, #0x60]
00a5fe48	stp q4,q5,[sp, #0x40]
00a5fe4c	stp q2,q3,[sp, #0x20]
00a5fe50	stp q0,q1,[sp]
00a5fe54	stp x6,x7,[sp, #0x98]
00a5fe58	stp x4,x5,[sp, #0x88]
00a5fe5c	str x3,[sp, #0x80]
00a5fe60	bl 0x00c301c0
00a5fe64	orr x8,xzr,#-0x7f00000080
00a5fe68	movk x8,#0xffd8
00a5fe6c	mov x9,sp
00a5fe70	add x10,sp,#0x80
00a5fe74	adrp x1,0x2db000
00a5fe78	add x11,x29,#0x10
00a5fe7c	stur x8,[x29, #-0x38]
00a5fe80	add x8,x9,#0x80
00a5fe84	add x9,x10,#0x28
00a5fe88	add x1,x1,#0x996
00a5fe8c	mov x0,x20
00a5fe90	stp x9,x8,[x29, #-0x48]
00a5fe94	stur x11,[x29, #-0x50]
00a5fe98	bl 0x00c35ee0
00a5fe9c	cbz w0,0x00a5ff50
00a5fea0	adrp x1,0x2cf000
00a5fea4	add x1,x1,#0x33a
00a5fea8	mov x0,x20
00a5feac	bl 0x00c35ee0
00a5feb0	cbz w0,0x00a5ff94
00a5feb4	adrp x1,0x2bb000
00a5feb8	add x1,x1,#0xb6c
00a5febc	mov x0,x20
00a5fec0	bl 0x00c35ee0
00a5fec4	cbz w0,0x00a5ffe0
00a5fec8	adrp x1,0x2b7000
00a5fecc	add x1,x1,#0x7b3
00a5fed0	mov x0,x20
00a5fed4	bl 0x00c35ee0
00a5fed8	cbz w0,0x00a5ffe0
00a5fedc	adrp x1,0x2a5000
00a5fee0	add x1,x1,#0xe7f
00a5fee4	mov x0,x20
00a5fee8	bl 0x00c35ee0
00a5feec	cbz w0,0x00a5ffe0
00a5fef0	adrp x1,0x29f000
00a5fef4	add x1,x1,#0xe3c
00a5fef8	mov x0,x20
00a5fefc	bl 0x00c35ee0
00a5ff00	cbz w0,0x00a5ffe0
00a5ff04	adrp x1,0x2ad000
00a5ff08	add x1,x1,#0xb94
00a5ff0c	mov x0,x20
00a5ff10	bl 0x00c35ee0
00a5ff14	cbz w0,0x00a5ffe0
00a5ff18	bl 0x00c342a0
00a5ff1c	adrp x0,0x2a0000
00a5ff20	adrp x2,0x2a0000
00a5ff24	add x0,x0,#0x246
00a5ff28	add x2,x2,#0x25b
00a5ff2c	mov w1,#0x4b6
00a5ff30	bl 0x00c342b0
00a5ff34	mov w1,#0x106
00a5ff38	orr w0,wzr,#0x6
00a5ff3c	movk w1,#0x8, LSL #16
00a5ff40	mov x2,xzr
00a5ff44	bl 0x00c342c0
00a5ff48	mov x0,xzr
00a5ff4c	b 0x00a60034
00a5ff50	ldursw x8,[x29, #-0x38]
00a5ff54	tbz w8,#0x1f,0x00a5ff68
00a5ff58	add w9,w8,#0x8
00a5ff5c	cmp w9,#0x0
00a5ff60	stur w9,[x29, #-0x38]
00a5ff64	b.le 0x00a6004c
00a5ff68	ldur x8,[x29, #-0x50]
00a5ff6c	add x9,x8,#0x8
00a5ff70	stur x9,[x29, #-0x50]
00a5ff74	ldr x8,[x8]
00a5ff78	adrp x0,0x2ad000
00a5ff7c	add x0,x0,#0xc98
00a5ff80	sub x1,x29,#0x58
00a5ff84	stur x8,[x29, #-0x58]
00a5ff88	add x8,sp,#0xa8
00a5ff8c	bl 0x00c36270
00a5ff90	b 0x00a5ffd0
00a5ff94	ldursw x8,[x29, #-0x38]
00a5ff98	tbz w8,#0x1f,0x00a5ffac
00a5ff9c	add w9,w8,#0x8
00a5ffa0	cmp w9,#0x0
00a5ffa4	stur w9,[x29, #-0x38]
00a5ffa8	b.le 0x00a60058
00a5ffac	ldur x8,[x29, #-0x50]
00a5ffb0	add x9,x8,#0x8
00a5ffb4	stur x9,[x29, #-0x50]
00a5ffb8	ldr x1,[x8]
00a5ffbc	adrp x0,0x2a2000
00a5ffc0	add x0,x0,#0x238
00a5ffc4	add x8,sp,#0xa8
00a5ffc8	mov x2,xzr
00a5ffcc	bl 0x00c36280
00a5ffd0	ldr x8,[sp, #0xc8]
00a5ffd4	ldp q1,q0,[x22]
00a5ffd8	stur x8,[x29, #-0x90]
00a5ffdc	stp q1,q0,[x29, #-0xb0]
00a5ffe0	mov x0,x21
00a5ffe4	mov x1,x20
00a5ffe8	mov x2,x19
00a5ffec	str xzr,[sp, #0xa8]
00a5fff0	bl 0x00c34630
00a5fff4	mov x19,x0
00a5fff8	cbz x0,0x00a60028
00a5fffc	mov x0,x19
00a60000	bl 0x00c34700
00a60004	cmp w0,#0x1
00a60008	b.lt 0x00a60028
00a6000c	sub x1,x29,#0xb0
00a60010	mov x0,x19
00a60014	bl 0x00c36dd0
00a60018	cbz w0,0x00a60028
00a6001c	add x1,sp,#0xa8
00a60020	mov x0,x19
00a60024	bl 0x00c3d010
00a60028	mov x0,x19
00a6002c	bl 0x00c34620
00a60030	ldr x0,[sp, #0xa8]
00a60034	ldp x29,x30,[sp, #0x180]
00a60038	ldp x20,x19,[sp, #0x170]
00a6003c	ldp x22,x21,[sp, #0x160]
00a60040	ldr x28,[sp, #0x150]
00a60044	add sp,sp,#0x190
00a60048	ret
00a6004c	ldur x9,[x29, #-0x48]
00a60050	add x8,x9,x8
00a60054	b 0x00a5ff74
00a60058	ldur x9,[x29, #-0x48]
00a6005c	add x8,x9,x8
00a60060	b 0x00a5ffb8
