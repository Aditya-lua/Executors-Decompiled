; FUN_00916bf8 @ 00916bf8
00916bf8	sub sp,sp,#0x70
00916bfc	str x25,[sp, #0x20]
00916c00	stp x24,x23,[sp, #0x30]
00916c04	stp x22,x21,[sp, #0x40]
00916c08	stp x20,x19,[sp, #0x50]
00916c0c	stp x29,x30,[sp, #0x60]
00916c10	add x29,sp,#0x60
00916c14	mrs x22,tpidr_el0
00916c18	ldr x8,[x22, #0x28]
00916c1c	mov x19,x0
00916c20	str x8,[sp, #0x18]
00916c24	ldr x8,[x0, #0xb0]
00916c28	cbz x8,0x00916cb4
00916c2c	ldr x8,[x19, #0xd0]
00916c30	ldr w23,[x19, #0x6e0]
00916c34	cbz x8,0x00916c48
00916c38	orr w1,wzr,#0x3
00916c3c	mov w2,#0x2
00916c40	mov x0,x19
00916c44	bl 0x0093f628
00916c48	mov x0,xzr
00916c4c	bl 0x00c30970
00916c50	mov x20,x0
00916c54	ldr x0,[x19, #0xb0]
00916c58	nop
00916c5c	adr x21,0x9182f4
00916c60	orr w24,wzr,#0x7fffffff
00916c64	orr w25,wzr,#0x7ffffffe
00916c68	mov x1,sp
00916c6c	mov x2,x21
00916c70	str w23,[sp, #0x10]
00916c74	stp x20,xzr,[sp]
00916c78	bl 0x0091694c
00916c7c	ldr x8,[sp, #0x8]
00916c80	cmp x8,x24
00916c84	csel w23,w8,w25,lt
00916c88	cbz w23,0x00916ca0
00916c8c	ldr x0,[x19, #0xb0]
00916c90	ldr x8,[x0, #0x28]
00916c94	lsr x8,x8,#0x4
00916c98	cmp x8,#0x752
00916c9c	b.hi 0x00916c68
00916ca0	ldr x8,[x19, #0xd0]
00916ca4	cbz x8,0x00916cb4
00916ca8	orr w1,wzr,#0x3
00916cac	mov x0,x19
00916cb0	bl 0x0093f680
00916cb4	ldr x8,[x22, #0x28]
00916cb8	ldr x9,[sp, #0x18]
00916cbc	cmp x8,x9
00916cc0	b.ne 0x00916ce0
00916cc4	ldp x29,x30,[sp, #0x60]
00916cc8	ldp x20,x19,[sp, #0x50]
00916ccc	ldp x22,x21,[sp, #0x40]
00916cd0	ldp x24,x23,[sp, #0x30]
00916cd4	ldr x25,[sp, #0x20]
00916cd8	add sp,sp,#0x70
00916cdc	ret
00916ce0	bl 0x00c2fec0
