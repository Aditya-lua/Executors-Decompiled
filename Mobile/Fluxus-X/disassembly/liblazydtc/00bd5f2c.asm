; FUN_00bd5f2c @ 00bd5f2c
00bd5f2c	paciasp
00bd5f30	sub sp,sp,#0x60
00bd5f34	stp x29,x30,[sp, #0x20]
00bd5f38	stp x24,x23,[sp, #0x30]
00bd5f3c	stp x22,x21,[sp, #0x40]
00bd5f40	stp x20,x19,[sp, #0x50]
00bd5f44	add x29,sp,#0x20
00bd5f48	mov w20,w1
00bd5f4c	mov x19,x0
00bd5f50	add x0,sp,#0x8
00bd5f54	mov x1,x19
00bd5f58	bl 0x00c44040
00bd5f5c	ldrb w8,[sp, #0x8]
00bd5f60	cmp w8,#0x1
00bd5f64	b.ne 0x00bd6034
00bd5f68	ldr x8,[x19]
00bd5f6c	ldur x9,[x8, #-0x18]
00bd5f70	sub x8,x29,#0x8
00bd5f74	add x0,x19,x9
00bd5f78	bl 0x00c30070
00bd5f7c	adrp x1,0xcb5000
00bd5f80	sub x0,x29,#0x8
00bd5f84	ldr x1,[x1, #0xbb0]
00bd5f88	bl 0x00c30080
00bd5f8c	mov x21,x0
00bd5f90	sub x0,x29,#0x8
00bd5f94	bl 0x00c30090
00bd5f98	ldr x8,[x19]
00bd5f9c	ldur x8,[x8, #-0x18]
00bd5fa0	add x2,x19,x8
00bd5fa4	ldr w3,[x2, #0x90]
00bd5fa8	ldr x22,[x2, #0x28]
00bd5fac	cmn w3,#0x1
00bd5fb0	b.ne 0x00bd5ffc
00bd5fb4	sub x8,x29,#0x8
00bd5fb8	mov x0,x2
00bd5fbc	mov x24,x2
00bd5fc0	bl 0x00c30070
00bd5fc4	adrp x1,0xcb5000
00bd5fc8	sub x0,x29,#0x8
00bd5fcc	ldr x1,[x1, #0xb98]
00bd5fd0	bl 0x00c30080
00bd5fd4	ldr x8,[x0]
00bd5fd8	ldr x8,[x8, #0x58]
00bd5fdc	mov w1,#0x20
00bd5fe0	blr x8
00bd5fe4	mov w23,w0
00bd5fe8	sub x0,x29,#0x8
00bd5fec	bl 0x00c30090
00bd5ff0	mov x2,x24
00bd5ff4	mov w3,w23
00bd5ff8	str w23,[x24, #0x90]
00bd5ffc	ldr x8,[x21]
00bd6000	ldr x8,[x8, #0x30]
00bd6004	and x4,x20,#0xffff
00bd6008	mov x0,x21
00bd600c	mov x1,x22
00bd6010	blr x8
00bd6014	cbnz x0,0x00bd6034
00bd6018	ldr x8,[x19]
00bd601c	mov w9,#0x5
00bd6020	ldur x8,[x8, #-0x18]
00bd6024	add x0,x19,x8
00bd6028	ldr w8,[x0, #0x20]
00bd602c	orr w1,w8,w9
00bd6030	bl 0x00c30130
00bd6034	add x0,sp,#0x8
00bd6038	bl 0x00c44050
00bd603c	mov x0,x19
00bd6040	ldp x20,x19,[sp, #0x50]
00bd6044	ldp x22,x21,[sp, #0x40]
00bd6048	ldp x24,x23,[sp, #0x30]
00bd604c	ldp x29,x30,[sp, #0x20]
00bd6050	add sp,sp,#0x60
00bd6054	autiasp
00bd6058	ret
