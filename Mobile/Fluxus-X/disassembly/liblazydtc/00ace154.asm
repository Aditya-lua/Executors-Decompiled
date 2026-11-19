; FUN_00ace154 @ 00ace154
00ace154	sub sp,sp,#0x150
00ace158	stp x29,x30,[sp, #0x140]
00ace15c	add x29,sp,#0x140
00ace160	stp x28,x21,[sp, #0x120]
00ace164	stp x20,x19,[sp, #0x130]
00ace168	mov x19,x4
00ace16c	mov x20,x3
00ace170	stp x4,x3,[x29, #-0x30]
00ace174	bl 0x00c36dc0
00ace178	sub x1,x29,#0x34
00ace17c	mov x21,x0
00ace180	bl 0x00c3fa10
00ace184	cmp w0,#0x1
00ace188	b.lt 0x00ace250
00ace18c	ldur w8,[x29, #-0x34]
00ace190	cmp w8,#0x6
00ace194	b.ne 0x00ace258
00ace198	ldr x8,[x21, #0x20]
00ace19c	cbz x8,0x00ace270
00ace1a0	adrp x0,0x2ca000
00ace1a4	add x0,x0,#0x1b4
00ace1a8	add x8,sp,#0x8
00ace1ac	add x1,sp,#0x8c
00ace1b0	mov w2,#0x80
00ace1b4	bl 0x00c34c50
00ace1b8	ldr x8,[sp, #0x28]
00ace1bc	ldur q0,[sp, #0x18]
00ace1c0	ldur q1,[sp, #0x8]
00ace1c4	str x8,[sp, #0x50]
00ace1c8	add x8,sp,#0x8
00ace1cc	stp q1,q0,[sp, #0x30]
00ace1d0	bl 0x00c34c40
00ace1d4	ldr x8,[sp, #0x28]
00ace1d8	ldur q0,[sp, #0x18]
00ace1dc	ldur q1,[sp, #0x8]
00ace1e0	add x1,sp,#0x30
00ace1e4	mov x0,x21
00ace1e8	str x8,[sp, #0x78]
00ace1ec	stur q0,[sp, #0x68]
00ace1f0	stur q1,[sp, #0x58]
00ace1f4	bl 0x00c3d000
00ace1f8	cmp w0,#0x1
00ace1fc	b.lt 0x00ace250
00ace200	ldr x21,[sp, #0x50]
00ace204	cbz x21,0x00ace250
00ace208	cbz x20,0x00ace22c
00ace20c	add x8,sp,#0x8c
00ace210	sub x0,x29,#0x28
00ace214	add x1,sp,#0x8
00ace218	mov x2,x21
00ace21c	str x8,[sp, #0x8]
00ace220	bl 0x00c38260
00ace224	cbz x0,0x00ace25c
00ace228	ldur x19,[x29, #-0x30]
00ace22c	cbz x19,0x00ace2e0
00ace230	add x8,sp,#0x8c
00ace234	sub x0,x29,#0x30
00ace238	add x1,sp,#0x8
00ace23c	mov x2,x21
00ace240	str x8,[sp, #0x8]
00ace244	bl 0x00c38260
00ace248	cbnz x0,0x00ace2e0
00ace24c	b 0x00ace25c
00ace250	mov w0,wzr
00ace254	b 0x00ace25c
00ace258	mov w0,#0x2
00ace25c	ldp x29,x30,[sp, #0x140]
00ace260	ldp x20,x19,[sp, #0x130]
00ace264	ldp x28,x21,[sp, #0x120]
00ace268	add sp,sp,#0x150
00ace26c	ret
00ace270	mov x0,x21
00ace274	bl 0x00acd790
00ace278	cbz x0,0x00ace25c
00ace27c	ldur x8,[x29, #-0x30]
00ace280	mov x19,x0
00ace284	cbz x8,0x00ace2bc
00ace288	mov x0,x19
00ace28c	bl 0x00c37a30
00ace290	cbz x0,0x00ace2e8
00ace294	ldur x21,[x29, #-0x30]
00ace298	mov x20,x0
00ace29c	mov w0,#0x390
00ace2a0	bl 0x00c37740
00ace2a4	mov x1,x0
00ace2a8	mov w2,#0x10
00ace2ac	mov x0,x21
00ace2b0	mov x3,x20
00ace2b4	bl 0x00c37ee0
00ace2b8	cbz w0,0x00ace2f0
00ace2bc	ldur x20,[x29, #-0x28]
00ace2c0	mov w0,#0x390
00ace2c4	bl 0x00c37740
00ace2c8	mov x1,x0
00ace2cc	mov w2,#0x10
00ace2d0	mov x0,x20
00ace2d4	mov x3,x19
00ace2d8	bl 0x00c37ee0
00ace2dc	cbz w0,0x00ace2e8
00ace2e0	orr w0,wzr,#0x3
00ace2e4	b 0x00ace25c
00ace2e8	mov x0,x19
00ace2ec	b 0x00ace2fc
00ace2f0	mov x0,x19
00ace2f4	bl 0x00c37890
00ace2f8	mov x0,x20
00ace2fc	bl 0x00c37890
00ace300	mov w0,wzr
00ace304	b 0x00ace25c
