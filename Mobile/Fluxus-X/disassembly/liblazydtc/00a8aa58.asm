; FUN_00a8aa58 @ 00a8aa58
00a8aa58	sub sp,sp,#0x80
00a8aa5c	stp x24,x23,[sp, #0x40]
00a8aa60	stp x22,x21,[sp, #0x50]
00a8aa64	stp x20,x19,[sp, #0x60]
00a8aa68	mov x20,x3
00a8aa6c	mov x23,x2
00a8aa70	mov x21,x1
00a8aa74	lsr x8,x3,#0x1e
00a8aa78	mov x19,x0
00a8aa7c	stp x28,x27,[sp, #0x20]
00a8aa80	stp x26,x25,[sp, #0x30]
00a8aa84	stp x29,x30,[sp, #0x70]
00a8aa88	add x29,sp,#0x70
00a8aa8c	cbz x8,0x00a8ab28
00a8aa90	orr x27,xzr,#-0x40000000
00a8aa94	add x8,x20,x27
00a8aa98	mov w22,#0x40000000
00a8aa9c	and x28,x8,#-0x40000000
00a8aaa0	str x8,[sp]
00a8aaa4	add x8,x28,x22
00a8aaa8	str x8,[sp, #0x8]
00a8aaac	add x8,x23,x8
00a8aab0	str x8,[sp, #0x10]
00a8aab4	adrp x25,0xcb5000
00a8aab8	ldr x25,[x25, #0x318]
00a8aabc	add x24,x19,#0x28
00a8aac0	mov x26,x21
00a8aac4	mov x0,x19
00a8aac8	bl 0x00c3ceb0
00a8aacc	str w0,[sp, #0x1c]
00a8aad0	mov x0,x19
00a8aad4	bl 0x00c3cea0
00a8aad8	mov x3,x0
00a8aadc	mov w2,#0x40000000
00a8aae0	add x5,sp,#0x1c
00a8aae4	mov x0,x23
00a8aae8	mov x1,x26
00a8aaec	mov x4,x24
00a8aaf0	mov x6,x25
00a8aaf4	bl 0x00c3e450
00a8aaf8	ldr w1,[sp, #0x1c]
00a8aafc	mov x0,x19
00a8ab00	bl 0x00c3ced0
00a8ab04	add x20,x20,x27
00a8ab08	add x23,x23,x22
00a8ab0c	lsr x8,x20,#0x1e
00a8ab10	add x26,x26,x22
00a8ab14	cbnz x8,0x00a8aac4
00a8ab18	ldr x8,[sp]
00a8ab1c	sub x20,x8,x28
00a8ab20	ldp x8,x23,[sp, #0x8]
00a8ab24	add x21,x21,x8
00a8ab28	cbz x20,0x00a8ab70
00a8ab2c	mov x0,x19
00a8ab30	bl 0x00c3ceb0
00a8ab34	str w0,[sp, #0x18]
00a8ab38	mov x0,x19
00a8ab3c	bl 0x00c3cea0
00a8ab40	adrp x6,0xcb5000
00a8ab44	ldr x6,[x6, #0x318]
00a8ab48	mov x3,x0
00a8ab4c	add x4,x19,#0x28
00a8ab50	add x5,sp,#0x18
00a8ab54	mov x0,x23
00a8ab58	mov x1,x21
00a8ab5c	mov x2,x20
00a8ab60	bl 0x00c3e450
00a8ab64	ldr w1,[sp, #0x18]
00a8ab68	mov x0,x19
00a8ab6c	bl 0x00c3ced0
00a8ab70	ldp x29,x30,[sp, #0x70]
00a8ab74	ldp x20,x19,[sp, #0x60]
00a8ab78	ldp x22,x21,[sp, #0x50]
00a8ab7c	ldp x24,x23,[sp, #0x40]
00a8ab80	ldp x26,x25,[sp, #0x30]
00a8ab84	ldp x28,x27,[sp, #0x20]
00a8ab88	mov w0,#0x1
00a8ab8c	add sp,sp,#0x80
00a8ab90	ret
