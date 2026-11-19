; evp_keymgmt_util_copy @ 00a65f24
00a65f24	sub sp,sp,#0x60
00a65f28	stp x24,x23,[sp, #0x20]
00a65f2c	stp x22,x21,[sp, #0x30]
00a65f30	stp x20,x19,[sp, #0x40]
00a65f34	stp x29,x30,[sp, #0x50]
00a65f38	add x29,sp,#0x50
00a65f3c	cbz x1,0x00a66054
00a65f40	mov x22,x1
00a65f44	ldr x1,[x1, #0x68]
00a65f48	cbz x1,0x00a66054
00a65f4c	mov x19,x0
00a65f50	ldr x0,[x22, #0x60]
00a65f54	ldp x21,x24,[x19, #0x60]
00a65f58	mov w20,w2
00a65f5c	mov x23,x0
00a65f60	cbz x21,0x00a65f70
00a65f64	cmp x21,x0
00a65f68	mov x23,x21
00a65f6c	b.ne 0x00a65fa0
00a65f70	cbnz x24,0x00a65f9c
00a65f74	ldr x8,[x0, #0xd8]
00a65f78	cbz x8,0x00a65f9c
00a65f7c	mov w2,w20
00a65f80	bl 0x00c3d360
00a65f84	mov x20,x0
00a65f88	mov x22,x0
00a65f8c	cbz x0,0x00a66058
00a65f90	ldr x8,[x19, #0x60]
00a65f94	cbnz x8,0x00a66004
00a65f98	b 0x00a65ff4
00a65f9c	mov x21,x23
00a65fa0	bl 0x00c3bf30
00a65fa4	mov x1,x0
00a65fa8	mov x0,x21
00a65fac	bl 0x00c3b6d0
00a65fb0	cbz w0,0x00a66018
00a65fb4	stp x21,x24,[sp, #0x8]
00a65fb8	str w20,[sp, #0x18]
00a65fbc	adrp x3,0xcb5000
00a65fc0	ldp x0,x1,[x22, #0x60]
00a65fc4	ldr x3,[x3, #0x5b8]
00a65fc8	add x4,sp,#0x8
00a65fcc	mov w2,w20
00a65fd0	bl 0x00c3d130
00a65fd4	cbz w0,0x00a66058
00a65fd8	ldr x8,[sp, #0x10]
00a65fdc	cmp x24,#0x0
00a65fe0	mov x23,x21
00a65fe4	csel x20,x8,x24,eq
00a65fe8	csel x22,x8,xzr,eq
00a65fec	ldr x8,[x19, #0x60]
00a65ff0	cbnz x8,0x00a66004
00a65ff4	mov x0,x19
00a65ff8	mov x1,x23
00a65ffc	bl 0x00c3d200
00a66000	cbz w0,0x00a66048
00a66004	mov x0,x19
00a66008	str x20,[x19, #0x68]
00a6600c	bl 0x00a65640
00a66010	mov w0,#0x1
00a66014	b 0x00a66058
00a66018	bl 0x00c342a0
00a6601c	adrp x0,0x2cd000
00a66020	adrp x2,0x2d7000
00a66024	add x0,x0,#0xabe
00a66028	add x2,x2,#0xee1
00a6602c	mov w1,#0x1ed
00a66030	bl 0x00c342b0
00a66034	orr w0,wzr,#0x6
00a66038	mov w1,#0x65
00a6603c	mov x2,xzr
00a66040	bl 0x00c342c0
00a66044	b 0x00a66054
00a66048	mov x0,x23
00a6604c	mov x1,x22
00a66050	bl 0x00c3b730
00a66054	mov w0,wzr
00a66058	ldp x29,x30,[sp, #0x50]
00a6605c	ldp x20,x19,[sp, #0x40]
00a66060	ldp x22,x21,[sp, #0x30]
00a66064	ldp x24,x23,[sp, #0x20]
00a66068	add sp,sp,#0x60
00a6606c	ret
