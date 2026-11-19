; FUN_00a5d95c @ 00a5d95c
00a5d95c	stp x24,x23,[sp, #-0x40]!
00a5d960	stp x22,x21,[sp, #0x10]
00a5d964	mov w21,w2
00a5d968	adrp x2,0xc5d000
00a5d96c	stp x20,x19,[sp, #0x20]
00a5d970	mov x19,x1
00a5d974	add x2,x2,#0x6b8
00a5d978	mov w1,wzr
00a5d97c	stp x29,x30,[sp, #0x30]
00a5d980	add x29,sp,#0x30
00a5d984	mov w23,w3
00a5d988	mov x22,x0
00a5d98c	bl 0x00c3b520
00a5d990	mov x20,x0
00a5d994	mov x0,x22
00a5d998	mov w1,w21
00a5d99c	bl 0x00c3cde0
00a5d9a0	cbz x20,0x00a5d9c0
00a5d9a4	mov x21,x0
00a5d9a8	cbz x0,0x00a5d9c0
00a5d9ac	cbz w23,0x00a5d9dc
00a5d9b0	mov x0,x22
00a5d9b4	bl 0x00c3cdf0
00a5d9b8	cbnz w0,0x00a5dad4
00a5d9bc	b 0x00a5d9e4
00a5d9c0	bl 0x00c342a0
00a5d9c4	adrp x0,0x29e000
00a5d9c8	adrp x2,0x2b4000
00a5d9cc	add x0,x0,#0x17d
00a5d9d0	add x2,x2,#0x274
00a5d9d4	mov w1,#0x215
00a5d9d8	b 0x00a5dabc
00a5d9dc	mov x0,x22
00a5d9e0	bl 0x00c3ce00
00a5d9e4	mov x0,x22
00a5d9e8	mov x1,x19
00a5d9ec	mov x2,xzr
00a5d9f0	mov x3,xzr
00a5d9f4	bl 0x00c3ce30
00a5d9f8	cbz x0,0x00a5da74
00a5d9fc	adrp x1,0x29e000
00a5da00	add x1,x1,#0x17d
00a5da04	mov w2,#0x202
00a5da08	mov x24,x0
00a5da0c	bl 0x00c32320
00a5da10	cbz x0,0x00a5da74
00a5da14	mov x23,x0
00a5da18	mov x0,x22
00a5da1c	mov x1,x19
00a5da20	mov x2,x23
00a5da24	mov x3,x24
00a5da28	bl 0x00c3ce30
00a5da2c	cbz x0,0x00a5da90
00a5da30	mov x0,x22
00a5da34	mov x1,x23
00a5da38	bl 0x00c3ce50
00a5da3c	adrp x1,0x29e000
00a5da40	add x1,x1,#0x17d
00a5da44	mov w2,#0x20e
00a5da48	mov x0,x23
00a5da4c	bl 0x00c32310
00a5da50	ldr x0,[x21]
00a5da54	bl 0x00c3b670
00a5da58	str x19,[x21]
00a5da5c	mov x0,x20
00a5da60	ldp x29,x30,[sp, #0x30]
00a5da64	ldp x20,x19,[sp, #0x20]
00a5da68	ldp x22,x21,[sp, #0x10]
00a5da6c	ldp x24,x23,[sp], #0x40
00a5da70	b 0x00c3b570
00a5da74	bl 0x00c342a0
00a5da78	adrp x0,0x29e000
00a5da7c	adrp x2,0x2b4000
00a5da80	add x0,x0,#0x17d
00a5da84	add x2,x2,#0x274
00a5da88	mov w1,#0x204
00a5da8c	b 0x00a5dabc
00a5da90	adrp x19,0x29e000
00a5da94	add x19,x19,#0x17d
00a5da98	mov w2,#0x209
00a5da9c	mov x0,x23
00a5daa0	mov x1,x19
00a5daa4	bl 0x00c32310
00a5daa8	bl 0x00c342a0
00a5daac	adrp x2,0x2b4000
00a5dab0	add x2,x2,#0x274
00a5dab4	mov w1,#0x20a
00a5dab8	mov x0,x19
00a5dabc	bl 0x00c342b0
00a5dac0	mov w1,#0x103
00a5dac4	orr w0,wzr,#0x6
00a5dac8	movk w1,#0xc, LSL #16
00a5dacc	mov x2,xzr
00a5dad0	bl 0x00c342c0
00a5dad4	ldp x29,x30,[sp, #0x30]
00a5dad8	ldp x20,x19,[sp, #0x20]
00a5dadc	ldp x22,x21,[sp, #0x10]
00a5dae0	mov w0,wzr
00a5dae4	ldp x24,x23,[sp], #0x40
00a5dae8	ret
