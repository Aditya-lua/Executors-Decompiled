; OSSL_PARAM_BLD_to_param @ 00a9d92c
00a9d92c	sub sp,sp,#0xa0
00a9d930	stp x28,x27,[sp, #0x40]
00a9d934	stp x26,x25,[sp, #0x50]
00a9d938	stp x24,x23,[sp, #0x60]
00a9d93c	stp x22,x21,[sp, #0x70]
00a9d940	stp x20,x19,[sp, #0x80]
00a9d944	stp x29,x30,[sp, #0x90]
00a9d948	mov x19,x0
00a9d94c	ldr x0,[x0, #0x10]
00a9d950	add x29,sp,#0x90
00a9d954	bl 0x00c325e0
00a9d958	add w8,w0,#0x1
00a9d95c	mov w9,#0x28
00a9d960	smull x0,w8,w9
00a9d964	bl 0x00c3e8a0
00a9d968	ldp x20,x8,[x19]
00a9d96c	mov x24,x0
00a9d970	lsl x22,x8,#0x3
00a9d974	cbz x22,0x00a9d99c
00a9d978	adrp x1,0x29e000
00a9d97c	add x1,x1,#0x440
00a9d980	mov w2,#0x170
00a9d984	mov x0,x22
00a9d988	bl 0x00c39220
00a9d98c	cbz x0,0x00a9db34
00a9d990	mov x21,x0
00a9d994	mov x27,x0
00a9d998	b 0x00a9d9a4
00a9d99c	mov x21,xzr
00a9d9a0	mov x27,xzr
00a9d9a4	add x8,x20,x24
00a9d9a8	adrp x1,0x29e000
00a9d9ac	lsl x0,x8,#0x3
00a9d9b0	add x1,x1,#0x440
00a9d9b4	mov w2,#0x176
00a9d9b8	bl 0x00c32320
00a9d9bc	mov x20,x0
00a9d9c0	cbz x0,0x00a9daec
00a9d9c4	ldr x0,[x19, #0x10]
00a9d9c8	bl 0x00c325e0
00a9d9cc	cmp w0,#0x1
00a9d9d0	b.lt 0x00a9db68
00a9d9d4	stp x22,x21,[sp, #0x8]
00a9d9d8	mov x23,xzr
00a9d9dc	add x22,x20,x24, LSL #0x3
00a9d9e0	mov w26,w0
00a9d9e4	add x28,x20,#0x10
00a9d9e8	mov x21,#-0x1
00a9d9ec	b 0x00a9da74
00a9d9f0	sub w9,w8,#0x4
00a9d9f4	cmp w9,#0x2
00a9d9f8	b.cc 0x00a9da14
00a9d9fc	sub w8,w8,#0x6
00a9da00	cmp w8,#0x1
00a9da04	b.hi 0x00a9da28
00a9da08	ldr x8,[x24, #0x28]
00a9da0c	str x8,[x25]
00a9da10	b 0x00a9dad4
00a9da14	ldr x1,[x24, #0x28]
00a9da18	cbz x1,0x00a9da40
00a9da1c	mov x0,x25
00a9da20	bl 0x00c2ffd0
00a9da24	b 0x00a9da48
00a9da28	cmp x2,#0x9
00a9da2c	b.cc 0x00a9da60
00a9da30	mov x0,x25
00a9da34	mov w1,wzr
00a9da38	bl 0x00c301c0
00a9da3c	b 0x00a9dad4
00a9da40	mov x0,x25
00a9da44	bl 0x00c301c0
00a9da48	ldr w8,[x24, #0x8]
00a9da4c	cmp w8,#0x4
00a9da50	b.ne 0x00a9dad4
00a9da54	ldr x8,[x24, #0x10]
00a9da58	strb wzr,[x25, x8]
00a9da5c	b 0x00a9dad4
00a9da60	cbz x2,0x00a9dad4
00a9da64	add x1,x24,#0x30
00a9da68	mov x0,x25
00a9da6c	bl 0x00c2ffd0
00a9da70	b 0x00a9dad4
00a9da74	ldr x0,[x19, #0x10]
00a9da78	mov w1,w23
00a9da7c	bl 0x00c32610
00a9da80	ldr x8,[x0]
00a9da84	mov x24,x0
00a9da88	stur x8,[x28, #-0x10]
00a9da8c	ldr w8,[x0, #0x8]
00a9da90	stur w8,[x28, #-0x8]
00a9da94	ldr x2,[x0, #0x10]
00a9da98	stp x2,x21,[x28, #0x8]
00a9da9c	ldr w10,[x0, #0xc]
00a9daa0	ldr x9,[x0, #0x18]
00a9daa4	cmp w10,#0x0
00a9daa8	csel x25,x22,x27,eq
00a9daac	str x25,[x28]
00a9dab0	ldr x0,[x0, #0x20]
00a9dab4	lsl x9,x9,#0x3
00a9dab8	add x10,x27,x9
00a9dabc	add x9,x22,x9
00a9dac0	csel x27,x27,x10,eq
00a9dac4	csel x22,x9,x22,eq
00a9dac8	cbz x0,0x00a9d9f0
00a9dacc	mov x1,x25
00a9dad0	bl 0x00c38c90
00a9dad4	add x23,x23,#0x1
00a9dad8	cmp x26,x23
00a9dadc	add x28,x28,#0x28
00a9dae0	b.ne 0x00a9da74
00a9dae4	ldp x22,x21,[sp, #0x8]
00a9dae8	b 0x00a9db6c
00a9daec	bl 0x00c342a0
00a9daf0	adrp x19,0x29e000
00a9daf4	add x19,x19,#0x440
00a9daf8	adrp x2,0x2bb000
00a9dafc	add x2,x2,#0xf65
00a9db00	mov w1,#0x178
00a9db04	mov x0,x19
00a9db08	bl 0x00c342b0
00a9db0c	mov w1,#0x100
00a9db10	orr w0,wzr,#0xf
00a9db14	movk w1,#0xc, LSL #16
00a9db18	mov x2,xzr
00a9db1c	bl 0x00c342c0
00a9db20	mov w2,#0x179
00a9db24	mov x0,x21
00a9db28	mov x1,x19
00a9db2c	bl 0x00c35700
00a9db30	b 0x00a9dbe0
00a9db34	bl 0x00c342a0
00a9db38	adrp x0,0x29e000
00a9db3c	adrp x2,0x2bb000
00a9db40	add x0,x0,#0x440
00a9db44	add x2,x2,#0xf65
00a9db48	mov w1,#0x172
00a9db4c	bl 0x00c342b0
00a9db50	orr w0,wzr,#0xf
00a9db54	mov w1,#0x6f
00a9db58	mov x2,xzr
00a9db5c	bl 0x00c342c0
00a9db60	mov x20,xzr
00a9db64	b 0x00a9dbe0
00a9db68	mov x26,xzr
00a9db6c	mov w8,#0x28
00a9db70	madd x23,x26,x8,x20
00a9db74	add x8,sp,#0x18
00a9db78	bl 0x00c34c40
00a9db7c	ldr x8,[sp, #0x38]
00a9db80	mov x0,x23
00a9db84	mov x1,x21
00a9db88	mov x2,x22
00a9db8c	str x8,[x23, #0x20]
00a9db90	ldur q0,[sp, #0x28]
00a9db94	str q0,[x23, #0x10]
00a9db98	ldur q0,[sp, #0x18]
00a9db9c	str q0,[x23]
00a9dba0	bl 0x00c3e8b0
00a9dba4	ldr x0,[x19, #0x10]
00a9dba8	stp xzr,xzr,[x19]
00a9dbac	bl 0x00c325e0
00a9dbb0	cmp w0,#0x1
00a9dbb4	b.lt 0x00a9dbe0
00a9dbb8	adrp x22,0x29e000
00a9dbbc	mov w21,w0
00a9dbc0	add x22,x22,#0x440
00a9dbc4	ldr x0,[x19, #0x10]
00a9dbc8	bl 0x00c325f0
00a9dbcc	mov w2,#0x6e
00a9dbd0	mov x1,x22
00a9dbd4	bl 0x00c32310
00a9dbd8	subs w21,w21,#0x1
00a9dbdc	b.ne 0x00a9dbc4
00a9dbe0	mov x0,x20
00a9dbe4	ldp x29,x30,[sp, #0x90]
00a9dbe8	ldp x20,x19,[sp, #0x80]
00a9dbec	ldp x22,x21,[sp, #0x70]
00a9dbf0	ldp x24,x23,[sp, #0x60]
00a9dbf4	ldp x26,x25,[sp, #0x50]
00a9dbf8	ldp x28,x27,[sp, #0x40]
00a9dbfc	add sp,sp,#0xa0
00a9dc00	ret
