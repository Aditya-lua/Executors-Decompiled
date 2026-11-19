; OSSL_DECODER_CTX_add_extra @ 00a4d8a0
00a4d8a0	sub sp,sp,#0x80
00a4d8a4	stp x28,x27,[sp, #0x20]
00a4d8a8	stp x26,x25,[sp, #0x30]
00a4d8ac	stp x24,x23,[sp, #0x40]
00a4d8b0	stp x22,x21,[sp, #0x50]
00a4d8b4	stp x20,x19,[sp, #0x60]
00a4d8b8	stp x29,x30,[sp, #0x70]
00a4d8bc	add x29,sp,#0x70
00a4d8c0	cbz x0,0x00a4db34
00a4d8c4	ldr x8,[x0, #0x18]
00a4d8c8	mov x19,x0
00a4d8cc	cbz x8,0x00a4db2c
00a4d8d0	mov x21,x1
00a4d8d4	bl 0x00c34780
00a4d8d8	cbz x0,0x00a4db64
00a4d8dc	mov x20,x0
00a4d8e0	adrp x1,0xa4d000
00a4d8e4	add x1,x1,#0xbb8
00a4d8e8	mov x0,x21
00a4d8ec	mov x2,x20
00a4d8f0	bl 0x00c3b3b0
00a4d8f4	mov x0,x20
00a4d8f8	bl 0x00c325e0
00a4d8fc	ldr x8,[x19, #0x18]
00a4d900	sxtw x22,w0
00a4d904	mov x0,x8
00a4d908	bl 0x00c325e0
00a4d90c	mov x23,xzr
00a4d910	sxtw x21,w0
00a4d914	str xzr,[sp]
00a4d918	str wzr,[sp, #0x1c]
00a4d91c	str x21,[sp, #0x8]
00a4d920	ldr x8,[sp, #0x8]
00a4d924	cmp x23,x8
00a4d928	b.cs 0x00a4dae8
00a4d92c	mov x1,x23
00a4d930	ldr x0,[x19, #0x18]
00a4d934	str x1,[sp, #0x10]
00a4d938	bl 0x00c32610
00a4d93c	cbz x0,0x00a4d94c
00a4d940	ldr x24,[x0, #0x10]
00a4d944	cbnz w22,0x00a4d954
00a4d948	b 0x00a4dad8
00a4d94c	mov x24,xzr
00a4d950	cbz w22,0x00a4dad8
00a4d954	mov x25,xzr
00a4d958	mov x0,x20
00a4d95c	mov w1,w25
00a4d960	bl 0x00c32610
00a4d964	mov x27,x0
00a4d968	bl 0x00c3b3f0
00a4d96c	bl 0x00c3b430
00a4d970	mov x26,x0
00a4d974	mov x0,x27
00a4d978	mov x1,x24
00a4d97c	bl 0x00c3b400
00a4d980	cbz w0,0x00a4dacc
00a4d984	cmp x23,x21
00a4d988	mov x28,x23
00a4d98c	b.cs 0x00a4d9bc
00a4d990	ldr x0,[x19, #0x18]
00a4d994	mov w1,w28
00a4d998	bl 0x00c32610
00a4d99c	ldr x8,[x0]
00a4d9a0	ldr x9,[x27, #0x18]
00a4d9a4	ldr x8,[x8, #0x18]
00a4d9a8	cmp x9,x8
00a4d9ac	b.eq 0x00a4dacc
00a4d9b0	add x28,x28,#0x1
00a4d9b4	cmp x28,x21
00a4d9b8	b.cc 0x00a4d990
00a4d9bc	ldr x8,[x27, #0x38]
00a4d9c0	mov x0,x26
00a4d9c4	blr x8
00a4d9c8	cbz x0,0x00a4dacc
00a4d9cc	mov x28,x0
00a4d9d0	mov x0,x27
00a4d9d4	mov x1,x28
00a4d9d8	bl 0x00a4d420
00a4d9dc	cbz x0,0x00a4da34
00a4d9e0	ldr w8,[sp, #0x1c]
00a4d9e4	mov x26,x0
00a4d9e8	and w8,w8,#0x7fffffff
00a4d9ec	cmp w8,#0x1
00a4d9f0	b.eq 0x00a4da44
00a4d9f4	cbnz w8,0x00a4da08
00a4d9f8	ldr x1,[x26, #0x10]
00a4d9fc	mov x0,x27
00a4da00	bl 0x00c3b400
00a4da04	cbz w0,0x00a4da54
00a4da08	ldr x0,[x19, #0x18]
00a4da0c	cbnz x0,0x00a4da1c
00a4da10	bl 0x00c34780
00a4da14	str x0,[x19, #0x18]
00a4da18	cbz x0,0x00a4da70
00a4da1c	mov x1,x26
00a4da20	bl 0x00c347a0
00a4da24	cmp w0,#0x0
00a4da28	b.le 0x00a4da54
00a4da2c	add x21,x21,#0x1
00a4da30	b 0x00a4dacc
00a4da34	ldr x8,[x27, #0x40]
00a4da38	mov x0,x28
00a4da3c	blr x8
00a4da40	b 0x00a4dacc
00a4da44	ldr x1,[x26, #0x10]
00a4da48	mov x0,x27
00a4da4c	bl 0x00c3b400
00a4da50	cbz w0,0x00a4da08
00a4da54	ldr x8,[x26]
00a4da58	cbz x8,0x00a4daa8
00a4da5c	ldr x8,[x8, #0x40]
00a4da60	ldr x0,[x26, #0x8]
00a4da64	blr x8
00a4da68	ldr x0,[x26]
00a4da6c	b 0x00a4daac
00a4da70	bl 0x00c342a0
00a4da74	adrp x0,0x2bd000
00a4da78	adrp x2,0x2bf000
00a4da7c	mov w1,#0x124
00a4da80	add x0,x0,#0x9db
00a4da84	add x2,x2,#0xbf9
00a4da88	bl 0x00c342b0
00a4da8c	mov w1,#0x100
00a4da90	orr w0,wzr,#0x3c
00a4da94	movk w1,#0xc, LSL #16
00a4da98	mov x2,xzr
00a4da9c	bl 0x00c342c0
00a4daa0	ldr x8,[x26]
00a4daa4	cbnz x8,0x00a4da5c
00a4daa8	mov x0,xzr
00a4daac	str xzr,[x26, #0x8]
00a4dab0	bl 0x00c3b3c0
00a4dab4	adrp x1,0x2bd000
00a4dab8	mov w2,#0x118
00a4dabc	mov x0,x26
00a4dac0	add x1,x1,#0x9db
00a4dac4	str xzr,[x26]
00a4dac8	bl 0x00c32310
00a4dacc	add x25,x25,#0x1
00a4dad0	cmp x25,x22
00a4dad4	b.cc 0x00a4d958
00a4dad8	ldp x8,x1,[sp, #0x8]
00a4dadc	add x1,x1,#0x1
00a4dae0	cmp x1,x8
00a4dae4	b.ne 0x00a4d930
00a4dae8	ldr w8,[sp, #0x1c]
00a4daec	add w8,w8,#0x1
00a4daf0	cmp w8,#0x2
00a4daf4	str w8,[sp, #0x1c]
00a4daf8	b.ne 0x00a4d920
00a4dafc	ldr x8,[sp]
00a4db00	add x8,x8,#0x1
00a4db04	cmp x8,#0xa
00a4db08	str x8,[sp]
00a4db0c	b.hi 0x00a4db1c
00a4db10	ldr x23,[sp, #0x8]
00a4db14	cmp x21,x23
00a4db18	b.ne 0x00a4d918
00a4db1c	adrp x1,0xcb5000
00a4db20	ldr x1,[x1, #0x588]
00a4db24	mov x0,x20
00a4db28	bl 0x00c32600
00a4db2c	mov w0,#0x1
00a4db30	b 0x00a4db98
00a4db34	bl 0x00c342a0
00a4db38	adrp x0,0x2bd000
00a4db3c	adrp x2,0x2d3000
00a4db40	add x0,x0,#0x9db
00a4db44	add x2,x2,#0xa79
00a4db48	mov w1,#0x1e6
00a4db4c	bl 0x00c342b0
00a4db50	mov w8,#0x100
00a4db54	movk w8,#0xc, LSL #16
00a4db58	add w1,w8,#0x2
00a4db5c	orr w0,wzr,#0x3c
00a4db60	b 0x00a4db8c
00a4db64	bl 0x00c342a0
00a4db68	adrp x0,0x2bd000
00a4db6c	adrp x2,0x2d3000
00a4db70	add x0,x0,#0x9db
00a4db74	add x2,x2,#0xa79
00a4db78	mov w1,#0x1f9
00a4db7c	bl 0x00c342b0
00a4db80	mov w1,#0x100
00a4db84	orr w0,wzr,#0x3c
00a4db88	movk w1,#0xc, LSL #16
00a4db8c	mov x2,xzr
00a4db90	bl 0x00c342c0
00a4db94	mov w0,wzr
00a4db98	ldp x29,x30,[sp, #0x70]
00a4db9c	ldp x20,x19,[sp, #0x60]
00a4dba0	ldp x22,x21,[sp, #0x50]
00a4dba4	ldp x24,x23,[sp, #0x40]
00a4dba8	ldp x26,x25,[sp, #0x30]
00a4dbac	ldp x28,x27,[sp, #0x20]
00a4dbb0	add sp,sp,#0x80
00a4dbb4	ret
