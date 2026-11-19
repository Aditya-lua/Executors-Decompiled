; FUN_00bcf9e8 @ 00bcf9e8
00bcf9e8	paciasp
00bcf9ec	sub sp,sp,#0x30
00bcf9f0	stp x29,x30,[sp, #0x10]
00bcf9f4	stp x20,x19,[sp, #0x20]
00bcf9f8	add x29,sp,#0x10
00bcf9fc	mov x19,x0
00bcfa00	mov x20,x1
00bcfa04	add x0,sp,#0x8
00bcfa08	mov x1,x19
00bcfa0c	mov w2,wzr
00bcfa10	stur wzr,[x29, #-0x4]
00bcfa14	bl 0x00c30140
00bcfa18	ldrb w8,[sp, #0x8]
00bcfa1c	cmp w8,#0x1
00bcfa20	b.ne 0x00bcfa94
00bcfa24	ldr x8,[x19]
00bcfa28	ldur x9,[x8, #-0x18]
00bcfa2c	mov x8,sp
00bcfa30	add x0,x19,x9
00bcfa34	bl 0x00c30070
00bcfa38	adrp x1,0xcb4000
00bcfa3c	mov x0,sp
00bcfa40	ldr x1,[x1, #0xf38]
00bcfa44	bl 0x00c30080
00bcfa48	ldr x8,[x19]
00bcfa4c	ldr x9,[x0]
00bcfa50	ldur x8,[x8, #-0x18]
00bcfa54	add x3,x19,x8
00bcfa58	ldr x8,[x9, #0x58]
00bcfa5c	ldr x1,[x3, #0x28]
00bcfa60	sub x4,x29,#0x4
00bcfa64	mov x2,xzr
00bcfa68	mov x5,x20
00bcfa6c	blr x8
00bcfa70	mov x0,sp
00bcfa74	bl 0x00c30090
00bcfa78	ldr x8,[x19]
00bcfa7c	ldur x8,[x8, #-0x18]
00bcfa80	add x0,x19,x8
00bcfa84	ldur w8,[x29, #-0x4]
00bcfa88	ldr w9,[x0, #0x20]
00bcfa8c	orr w1,w9,w8
00bcfa90	bl 0x00c30130
00bcfa94	mov x0,x19
00bcfa98	ldp x20,x19,[sp, #0x20]
00bcfa9c	ldp x29,x30,[sp, #0x10]
00bcfaa0	add sp,sp,#0x30
00bcfaa4	autiasp
00bcfaa8	ret
