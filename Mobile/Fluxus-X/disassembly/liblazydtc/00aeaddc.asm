; OSSL_STORE_attach @ 00aeaddc
00aeaddc	sub sp,sp,#0xe0
00aeade0	adrp x8,0x2d7000
00aeade4	add x8,x8,#0x4d1
00aeade8	cmp x1,#0x0
00aeadec	str x27,[sp, #0x80]
00aeadf0	stp x26,x25,[sp, #0x90]
00aeadf4	stp x24,x23,[sp, #0xa0]
00aeadf8	stp x22,x21,[sp, #0xb0]
00aeadfc	stp x20,x19,[sp, #0xc0]
00aeae00	stp x29,x30,[sp, #0xd0]
00aeae04	add x29,sp,#0xd0
00aeae08	mov x19,x7
00aeae0c	mov x26,x6
00aeae10	mov x20,x5
00aeae14	mov x21,x4
00aeae18	mov x25,x3
00aeae1c	mov x22,x2
00aeae20	mov x23,x0
00aeae24	csel x27,x8,x1,eq
00aeae28	bl 0x00c35250
00aeae2c	mov x0,x27
00aeae30	bl 0x00c40330
00aeae34	cbz x0,0x00aeae68
00aeae38	ldr x8,[x0, #0x18]
00aeae3c	mov x1,x23
00aeae40	mov x2,x22
00aeae44	mov x3,x25
00aeae48	mov x4,x21
00aeae4c	mov x5,x20
00aeae50	mov x24,x0
00aeae54	blr x8
00aeae58	mov x23,x0
00aeae5c	mov x22,xzr
00aeae60	cbnz x23,0x00aeaf74
00aeae64	b 0x00aeafc0
00aeae68	mov x0,x22
00aeae6c	mov x1,x27
00aeae70	mov x2,x25
00aeae74	bl 0x00c402c0
00aeae78	cbz x0,0x00aeafc0
00aeae7c	mov x22,x0
00aeae80	bl 0x00c402e0
00aeae84	bl 0x00c3b430
00aeae88	mov x27,x0
00aeae8c	mov x0,x23
00aeae90	bl 0x00c38860
00aeae94	mov x24,x0
00aeae98	cbz x0,0x00aeaf54
00aeae9c	ldr x8,[x22, #0x98]
00aeaea0	mov x0,x27
00aeaea4	mov x1,x24
00aeaea8	blr x8
00aeaeac	mov x23,x0
00aeaeb0	cbz x0,0x00aeaf58
00aeaeb4	cbz x26,0x00aeaecc
00aeaeb8	ldr x8,[x22, #0xa8]
00aeaebc	mov x0,x23
00aeaec0	mov x1,x26
00aeaec4	blr x8
00aeaec8	cbz w0,0x00aeaf44
00aeaecc	cbz x25,0x00aeaf64
00aeaed0	adrp x1,0x2d3000
00aeaed4	add x1,x1,#0x7c2
00aeaed8	mov x0,x26
00aeaedc	bl 0x00c36530
00aeaee0	cbnz x0,0x00aeaf64
00aeaee4	adrp x0,0x2d3000
00aeaee8	add x0,x0,#0x7c2
00aeaeec	add x8,sp,#0x8
00aeaef0	mov x1,x25
00aeaef4	mov x2,xzr
00aeaef8	bl 0x00c36280
00aeaefc	ldr x8,[sp, #0x28]
00aeaf00	ldur q0,[sp, #0x18]
00aeaf04	ldur q1,[sp, #0x8]
00aeaf08	str x8,[sp, #0x50]
00aeaf0c	add x8,sp,#0x8
00aeaf10	stp q1,q0,[sp, #0x30]
00aeaf14	bl 0x00c34c40
00aeaf18	ldr x8,[sp, #0x28]
00aeaf1c	ldur q0,[sp, #0x18]
00aeaf20	ldur q1,[sp, #0x8]
00aeaf24	add x1,sp,#0x30
00aeaf28	str x8,[sp, #0x78]
00aeaf2c	stur q0,[sp, #0x68]
00aeaf30	stur q1,[sp, #0x58]
00aeaf34	ldr x8,[x22, #0xa8]
00aeaf38	mov x0,x23
00aeaf3c	blr x8
00aeaf40	cbnz w0,0x00aeaf64
00aeaf44	ldr x8,[x22, #0xc0]
00aeaf48	mov x0,x23
00aeaf4c	blr x8
00aeaf50	b 0x00aeaf58
00aeaf54	mov x23,xzr
00aeaf58	mov x0,x22
00aeaf5c	bl 0x00c402d0
00aeaf60	mov x22,xzr
00aeaf64	mov x0,x24
00aeaf68	bl 0x00c38850
00aeaf6c	mov x24,x22
00aeaf70	cbz x23,0x00aeafc0
00aeaf74	adrp x1,0x2c2000
00aeaf78	add x1,x1,#0x3bd
00aeaf7c	orr w0,wzr,#0x78
00aeaf80	mov w2,#0x3f4
00aeaf84	bl 0x00c34250
00aeaf88	mov x25,x0
00aeaf8c	cbz x0,0x00aeafcc
00aeaf90	cbz x21,0x00aeafa8
00aeaf94	add x0,x25,#0x48
00aeaf98	mov x1,x21
00aeaf9c	mov x2,x20
00aeafa0	bl 0x00c3b7a0
00aeafa4	cbz w0,0x00aeb024
00aeafa8	ldr x8,[x29, #0x10]
00aeafac	stp x24,x22,[x25]
00aeafb0	stp x23,x19,[x25, #0x10]
00aeafb4	str x8,[x25, #0x20]
00aeafb8	bl 0x00c35240
00aeafbc	b 0x00aeb000
00aeafc0	bl 0x00c35ed0
00aeafc4	mov x25,xzr
00aeafc8	b 0x00aeb000
00aeafcc	bl 0x00c35ed0
00aeafd0	bl 0x00c342a0
00aeafd4	adrp x0,0x2c2000
00aeafd8	adrp x2,0x2d0000
00aeafdc	add x0,x0,#0x3bd
00aeafe0	add x2,x2,#0x3f4
00aeafe4	mov w1,#0x3f6
00aeafe8	bl 0x00c342b0
00aeafec	mov w1,#0x100
00aeaff0	mov w0,#0x2c
00aeaff4	movk w1,#0xc, LSL #16
00aeaff8	mov x2,xzr
00aeaffc	bl 0x00c342c0
00aeb000	mov x0,x25
00aeb004	ldp x29,x30,[sp, #0xd0]
00aeb008	ldp x20,x19,[sp, #0xc0]
00aeb00c	ldp x22,x21,[sp, #0xb0]
00aeb010	ldp x24,x23,[sp, #0xa0]
00aeb014	ldp x26,x25,[sp, #0x90]
00aeb018	ldr x27,[sp, #0x80]
00aeb01c	add sp,sp,#0xe0
00aeb020	ret
00aeb024	bl 0x00c35ed0
00aeb028	adrp x1,0x2c2000
00aeb02c	add x1,x1,#0x3bd
00aeb030	mov w2,#0x3fd
00aeb034	mov x0,x25
00aeb038	bl 0x00c32310
00aeb03c	b 0x00aeafc4
