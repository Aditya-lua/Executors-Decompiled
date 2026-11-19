; FUN_00c0bec0 @ 00c0bec0
00c0bec0	paciasp
00c0bec4	sub sp,sp,#0x50
00c0bec8	stp x29,x30,[sp, #0x20]
00c0becc	stp x22,x21,[sp, #0x30]
00c0bed0	stp x20,x19,[sp, #0x40]
00c0bed4	add x29,sp,#0x20
00c0bed8	mov x19,x8
00c0bedc	mov x8,sp
00c0bee0	mov x20,x1
00c0bee4	bl 0x00c30070
00c0bee8	adrp x22,0xcb5000
00c0beec	ldr x22,[x22, #0xc00]
00c0bef0	ldr x21,[sp]
00c0bef4	str x22,[sp, #0x8]
00c0bef8	ldar x8,[x22]
00c0befc	cmn x8,#0x1
00c0bf00	b.eq 0x00c0bf2c
00c0bf04	add x8,sp,#0x8
00c0bf08	sub x9,x29,#0x8
00c0bf0c	stur x8,[x29, #-0x8]
00c0bf10	str x9,[sp, #0x10]
00c0bf14	adrp x0,0xcb5000
00c0bf18	nop
00c0bf1c	adr x2,0xc0bab0
00c0bf20	ldr x0,[x0, #0xc00]
00c0bf24	add x1,sp,#0x10
00c0bf28	bl 0x00c305d0
00c0bf2c	ldp x8,x10,[x21, #0x10]
00c0bf30	ldrsw x9,[x22, #0x8]
00c0bf34	sub x9,x9,#0x1
00c0bf38	sub x10,x10,x8
00c0bf3c	cmp x9,x10, ASR #0x3
00c0bf40	b.cs 0x00c0bf94
00c0bf44	ldr x21,[x8, x9, LSL #0x3]
00c0bf48	cbz x21,0x00c0bf94
00c0bf4c	ldr x8,[x21]
00c0bf50	ldr x8,[x8, #0x20]
00c0bf54	mov x0,x21
00c0bf58	blr x8
00c0bf5c	ldr x8,[x21]
00c0bf60	strb w0,[x20]
00c0bf64	ldr x9,[x8, #0x28]
00c0bf68	mov x8,x19
00c0bf6c	mov x0,x21
00c0bf70	blr x9
00c0bf74	mov x0,sp
00c0bf78	bl 0x00c30090
00c0bf7c	ldp x20,x19,[sp, #0x40]
00c0bf80	ldp x22,x21,[sp, #0x30]
00c0bf84	ldp x29,x30,[sp, #0x20]
00c0bf88	add sp,sp,#0x50
00c0bf8c	autiasp
00c0bf90	ret
00c0bf94	bl 0x00bd8968
