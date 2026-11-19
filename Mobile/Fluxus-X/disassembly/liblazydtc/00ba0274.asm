; mbedtls_psa_pake_input @ 00ba0274
00ba0274	stp x22,x21,[sp, #-0x30]!
00ba0278	stp x20,x19,[sp, #0x10]
00ba027c	stp x29,x30,[sp, #0x20]
00ba0280	add x29,sp,#0x20
00ba0284	ldr w8,[x0]
00ba0288	mov w9,#0x100
00ba028c	movk w9,#0xa00, LSL #16
00ba0290	mov x22,x3
00ba0294	mov x20,x0
00ba0298	cmp w8,w9
00ba029c	mov w19,w1
00ba02a0	b.ne 0x00ba03fc
00ba02a4	cmp w19,#0xa
00ba02a8	b.ne 0x00ba02e4
00ba02ac	ldr w8,[x20, #0x18]
00ba02b0	cbnz w8,0x00ba02e4
00ba02b4	ldr x8,[x20, #0x170]
00ba02b8	add x9,x8,#0x3
00ba02bc	cmp x9,#0x150
00ba02c0	b.hi 0x00ba02f8
00ba02c4	add x8,x20,x8
00ba02c8	mov w9,#0x17
00ba02cc	orr w10,wzr,#0x3
00ba02d0	strb w9,[x8, #0x1e]
00ba02d4	strh w10,[x8, #0x1c]
00ba02d8	ldr x8,[x20, #0x170]
00ba02dc	add x8,x8,#0x3
00ba02e0	str x8,[x20, #0x170]
00ba02e4	ldr x8,[x20, #0x170]
00ba02e8	add x9,x22,x8
00ba02ec	add x9,x9,#0x1
00ba02f0	cmp x9,#0x150
00ba02f4	b.ls 0x00ba0300
00ba02f8	mov w19,#0xffffff76
00ba02fc	b 0x00ba0400
00ba0300	add x21,x20,#0x1c
00ba0304	strb w22,[x21, x8]
00ba0308	ldr x8,[x20, #0x170]
00ba030c	mov x1,x2
00ba0310	mov x2,x22
00ba0314	add x8,x8,#0x1
00ba0318	add x0,x21,x8
00ba031c	str x8,[x20, #0x170]
00ba0320	bl 0x00c2ffd0
00ba0324	ldr x8,[x20, #0x170]
00ba0328	cmp w19,#0xc
00ba032c	add x2,x8,x22
00ba0330	str x2,[x20, #0x170]
00ba0334	b.eq 0x00ba0388
00ba0338	cmp w19,#0x6
00ba033c	mov w19,wzr
00ba0340	b.ne 0x00ba0400
00ba0344	add x0,x20,#0x180
00ba0348	mov x1,x21
00ba034c	bl 0x00c425b0
00ba0350	mov w19,w0
00ba0354	mov w1,#0x150
00ba0358	mov x0,x21
00ba035c	bl 0x00c42220
00ba0360	mov w8,#0xffffb37f
00ba0364	cmp w19,w8
00ba0368	str xzr,[x20, #0x170]
00ba036c	b.le 0x00ba03d4
00ba0370	cmn w19,#0x9
00ba0374	b.le 0x00ba0414
00ba0378	cbz w19,0x00ba0400
00ba037c	cmn w19,#0x4
00ba0380	b.ne 0x00ba03c8
00ba0384	b 0x00ba0448
00ba0388	add x0,x20,#0x180
00ba038c	mov x1,x21
00ba0390	bl 0x00c425c0
00ba0394	mov w19,w0
00ba0398	mov w1,#0x150
00ba039c	mov x0,x21
00ba03a0	bl 0x00c42220
00ba03a4	mov w8,#0xffffb37f
00ba03a8	cmp w19,w8
00ba03ac	str xzr,[x20, #0x170]
00ba03b0	b.le 0x00ba03d4
00ba03b4	cmn w19,#0x9
00ba03b8	b.le 0x00ba0414
00ba03bc	cbz w19,0x00ba0400
00ba03c0	cmn w19,#0x4
00ba03c4	b.eq 0x00ba0448
00ba03c8	cmn w19,#0x8
00ba03cc	b.eq 0x00ba02f8
00ba03d0	b 0x00ba0450
00ba03d4	mov w8,#0xffffb0ff
00ba03d8	cmp w19,w8
00ba03dc	b.gt 0x00ba0430
00ba03e0	mov w8,#0xffffaf80
00ba03e4	cmp w19,w8
00ba03e8	b.eq 0x00ba03fc
00ba03ec	mov w8,#0xffffb080
00ba03f0	cmp w19,w8
00ba03f4	b.eq 0x00ba0448
00ba03f8	b 0x00ba0450
00ba03fc	mov w19,#0xffffff7a
00ba0400	mov w0,w19
00ba0404	ldp x29,x30,[sp, #0x20]
00ba0408	ldp x20,x19,[sp, #0x10]
00ba040c	ldp x22,x21,[sp], #0x30
00ba0410	ret
00ba0414	mov w8,#0xffffb380
00ba0418	cmp w19,w8
00ba041c	b.eq 0x00ba0448
00ba0420	cmn w19,#0x6e
00ba0424	b.ne 0x00ba0450
00ba0428	mov w19,#0xffffff69
00ba042c	b 0x00ba0400
00ba0430	mov w8,#0xffffb100
00ba0434	cmp w19,w8
00ba0438	b.eq 0x00ba02f8
00ba043c	mov w8,#0xffffb200
00ba0440	cmp w19,w8
00ba0444	b.ne 0x00ba0450
00ba0448	mov w19,#0xffffff67
00ba044c	b 0x00ba0400
00ba0450	mov w19,#0xffffff7c
00ba0454	b 0x00ba0400
