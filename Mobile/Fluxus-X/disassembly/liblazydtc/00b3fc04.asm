; FUN_00b3fc04 @ 00b3fc04
00b3fc04	sub sp,sp,#0x40
00b3fc08	stp x22,x21,[sp, #0x10]
00b3fc0c	stp x20,x19,[sp, #0x20]
00b3fc10	mov x20,x5
00b3fc14	mov w21,w2
00b3fc18	mov x22,x1
00b3fc1c	mov x19,x0
00b3fc20	mov w3,#0xffffffff
00b3fc24	stp x29,x30,[sp, #0x30]
00b3fc28	add x29,sp,#0x30
00b3fc2c	str xzr,[sp, #0x8]
00b3fc30	str w3,[sp, #0x4]
00b3fc34	cbz x4,0x00b3fc64
00b3fc38	ldr w2,[x6, #0x8]
00b3fc3c	mov x8,x4
00b3fc40	add x3,sp,#0x8
00b3fc44	add x4,sp,#0x4
00b3fc48	mov x0,x22
00b3fc4c	mov w1,w21
00b3fc50	blr x8
00b3fc54	cbz w0,0x00b3fcb8
00b3fc58	ldr x2,[sp, #0x8]
00b3fc5c	ldr w3,[sp, #0x4]
00b3fc60	b 0x00b3fc68
00b3fc64	mov x2,xzr
00b3fc68	mov x0,x22
00b3fc6c	mov w1,w21
00b3fc70	mov x4,x20
00b3fc74	bl 0x00b3fb1c
00b3fc78	mov x20,x0
00b3fc7c	cbz x0,0x00b3fc94
00b3fc80	mov x0,x19
00b3fc84	mov x1,x20
00b3fc88	bl 0x00c3f170
00b3fc8c	mov w19,w0
00b3fc90	b 0x00b3fcc8
00b3fc94	ldr w8,[sp, #0x4]
00b3fc98	ldr x0,[sp, #0x8]
00b3fc9c	cmp w8,#0x10
00b3fca0	b.eq 0x00b3fcc0
00b3fca4	cmp w8,#0x6
00b3fca8	mov w19,wzr
00b3fcac	b.ne 0x00b3fcc8
00b3fcb0	bl 0x00c37660
00b3fcb4	b 0x00b3fcc4
00b3fcb8	mov w19,wzr
00b3fcbc	b 0x00b3fcd0
00b3fcc0	bl 0x00c37890
00b3fcc4	mov w19,wzr
00b3fcc8	mov x0,x20
00b3fccc	bl 0x00c39900
00b3fcd0	mov w0,w19
00b3fcd4	ldp x29,x30,[sp, #0x30]
00b3fcd8	ldp x20,x19,[sp, #0x20]
00b3fcdc	ldp x22,x21,[sp, #0x10]
00b3fce0	add sp,sp,#0x40
00b3fce4	ret
