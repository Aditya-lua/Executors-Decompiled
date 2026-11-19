; FUN_0096aa20 @ 0096aa20
0096aa20	stp x26,x25,[sp, #-0x50]!
0096aa24	stp x24,x23,[sp, #0x10]
0096aa28	stp x22,x21,[sp, #0x20]
0096aa2c	stp x20,x19,[sp, #0x30]
0096aa30	stp x29,x30,[sp, #0x40]
0096aa34	add x29,sp,#0x40
0096aa38	mov x20,x1
0096aa3c	mov x19,x0
0096aa40	movi v0.2D,#0x0
0096aa44	str xzr,[x0, #0x20]
0096aa48	stp q0,q0,[x0]
0096aa4c	cbz x1,0x0096aad0
0096aa50	ldr x8,[x20, #0x20]
0096aa54	cbz x8,0x0096aad0
0096aa58	mov x23,xzr
0096aa5c	mov x25,xzr
0096aa60	mov w24,#0x2c
0096aa64	mov x21,x20
0096aa68	mov x0,x21
0096aa6c	bl 0x00c2ff50
0096aa70	mov x22,x0
0096aa74	cmp x0,#0x9
0096aa78	b.hi 0x0096aae4
0096aa7c	add x8,x25,x22
0096aa80	add x8,x8,#0x2
0096aa84	cmp x8,#0x20
0096aa88	b.hi 0x0096aae4
0096aa8c	cbz x25,0x0096aaa0
0096aa90	add x26,x25,#0x1
0096aa94	add x0,x19,x26
0096aa98	strb w24,[x19, x25]
0096aa9c	b 0x0096aaa8
0096aaa0	mov x26,xzr
0096aaa4	mov x0,x19
0096aaa8	mov x1,x21
0096aaac	mov x2,x22
0096aab0	bl 0x00c2ffd0
0096aab4	ldr x8,[x20, #0x20]
0096aab8	add x23,x23,#0x1
0096aabc	add x25,x26,x22
0096aac0	add x21,x21,#0xa
0096aac4	cmp x23,x8
0096aac8	b.cc 0x0096aa68
0096aacc	b 0x0096aad4
0096aad0	mov x25,xzr
0096aad4	mov w0,wzr
0096aad8	strb wzr,[x19, x25]
0096aadc	str w25,[x19, #0x24]
0096aae0	b 0x0096aae8
0096aae4	mov w0,#0x2
0096aae8	ldp x29,x30,[sp, #0x40]
0096aaec	ldp x20,x19,[sp, #0x30]
0096aaf0	ldp x22,x21,[sp, #0x20]
0096aaf4	ldp x24,x23,[sp, #0x10]
0096aaf8	ldp x26,x25,[sp], #0x50
0096aafc	ret
