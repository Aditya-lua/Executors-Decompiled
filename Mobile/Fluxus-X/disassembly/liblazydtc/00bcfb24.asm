; FUN_00bcfb24 @ 00bcfb24
00bcfb24	paciasp
00bcfb28	sub sp,sp,#0x30
00bcfb2c	stp x29,x30,[sp, #0x10]
00bcfb30	stp x20,x19,[sp, #0x20]
00bcfb34	add x29,sp,#0x10
00bcfb38	mov x19,x0
00bcfb3c	mov x20,x1
00bcfb40	add x0,sp,#0x8
00bcfb44	mov x1,x19
00bcfb48	mov w2,wzr
00bcfb4c	stur wzr,[x29, #-0x4]
00bcfb50	bl 0x00c30140
00bcfb54	ldrb w8,[sp, #0x8]
00bcfb58	cmp w8,#0x1
00bcfb5c	b.ne 0x00bcfbd0
00bcfb60	ldr x8,[x19]
00bcfb64	ldur x9,[x8, #-0x18]
00bcfb68	mov x8,sp
00bcfb6c	add x0,x19,x9
00bcfb70	bl 0x00c30070
00bcfb74	adrp x1,0xcb4000
00bcfb78	mov x0,sp
00bcfb7c	ldr x1,[x1, #0xf38]
00bcfb80	bl 0x00c30080
00bcfb84	ldr x8,[x19]
00bcfb88	ldr x9,[x0]
00bcfb8c	ldur x8,[x8, #-0x18]
00bcfb90	add x3,x19,x8
00bcfb94	ldr x8,[x9, #0x60]
00bcfb98	ldr x1,[x3, #0x28]
00bcfb9c	sub x4,x29,#0x4
00bcfba0	mov x2,xzr
00bcfba4	mov x5,x20
00bcfba8	blr x8
00bcfbac	mov x0,sp
00bcfbb0	bl 0x00c30090
00bcfbb4	ldr x8,[x19]
00bcfbb8	ldur x8,[x8, #-0x18]
00bcfbbc	add x0,x19,x8
00bcfbc0	ldur w8,[x29, #-0x4]
00bcfbc4	ldr w9,[x0, #0x20]
00bcfbc8	orr w1,w9,w8
00bcfbcc	bl 0x00c30130
00bcfbd0	mov x0,x19
00bcfbd4	ldp x20,x19,[sp, #0x20]
00bcfbd8	ldp x29,x30,[sp, #0x10]
00bcfbdc	add sp,sp,#0x30
00bcfbe0	autiasp
00bcfbe4	ret
