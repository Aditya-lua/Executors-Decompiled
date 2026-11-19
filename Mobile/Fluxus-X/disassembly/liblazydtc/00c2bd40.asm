; FUN_00c2bd40 @ 00c2bd40
00c2bd40	paciasp
00c2bd44	stp x29,x30,[sp, #-0x20]!
00c2bd48	stp x28,x19,[sp, #0x10]
00c2bd4c	mov x29,sp
00c2bd50	sub sp,sp,#0x4d0
00c2bd54	mov x19,x0
00c2bd58	add x0,sp,#0x270
00c2bd5c	bl 0x00c2fc80
00c2bd60	mov x0,sp
00c2bd64	add x1,sp,#0x270
00c2bd68	stp xzr,xzr,[x19, #0x10]
00c2bd6c	bl 0x00c2c354
00c2bd70	mov x0,sp
00c2bd74	bl 0x00c2c564
00c2bd78	cbnz w0,0x00c2bda0
00c2bd7c	mov w0,#0x5
00c2bd80	add sp,sp,#0x4d0
00c2bd84	ldp x28,x19,[sp, #0x10]
00c2bd88	ldp x29,x30,[sp], #0x20
00c2bd8c	autiasp
00c2bd90	ret
00c2bd94	mov x0,sp
00c2bd98	bl 0x00c2c564
00c2bd9c	cbz w0,0x00c2bd7c
00c2bda0	tbnz w0,#0x1f,0x00c2be20
00c2bda4	mov x0,sp
00c2bda8	sub x1,x29,#0x48
00c2bdac	bl 0x00c2c58c
00c2bdb0	cbnz w0,0x00c2be20
00c2bdb4	ldur x8,[x29, #-0x30]
00c2bdb8	cbz x8,0x00c2bd94
00c2bdbc	ldr x2,[x19]
00c2bdc0	mov x4,sp
00c2bdc4	mov w0,#0x1
00c2bdc8	mov w1,#0x1
00c2bdcc	mov x3,x19
00c2bdd0	blr x8
00c2bdd4	cmp w0,#0x8
00c2bdd8	b.eq 0x00c2bd94
00c2bddc	cmp w0,#0x6
00c2bde0	b.ne 0x00c2be20
00c2bde4	mov x0,sp
00c2bde8	sub x2,x29,#0x50
00c2bdec	mov w1,#0xfffffffe
00c2bdf0	bl 0x00c2c3fc
00c2bdf4	ldur x8,[x29, #-0x50]
00c2bdf8	add x0,sp,#0x270
00c2bdfc	mov x1,sp
00c2be00	mov x2,x19
00c2be04	str x8,[x19, #0x18]
00c2be08	bl 0x00c2be38
00c2be0c	add sp,sp,#0x4d0
00c2be10	ldp x28,x19,[sp, #0x10]
00c2be14	ldp x29,x30,[sp], #0x20
00c2be18	autiasp
00c2be1c	ret
00c2be20	mov w0,#0x3
00c2be24	add sp,sp,#0x4d0
00c2be28	ldp x28,x19,[sp, #0x10]
00c2be2c	ldp x29,x30,[sp], #0x20
00c2be30	autiasp
00c2be34	ret
