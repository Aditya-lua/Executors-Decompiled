; curl_multi_wakeup @ 0092c32c
0092c32c	sub sp,sp,#0x40
0092c330	stp x22,x21,[sp, #0x10]
0092c334	stp x20,x19,[sp, #0x20]
0092c338	stp x29,x30,[sp, #0x30]
0092c33c	add x29,sp,#0x30
0092c340	mrs x21,tpidr_el0
0092c344	ldr x8,[x21, #0x28]
0092c348	mov x19,x0
0092c34c	str x8,[sp, #0x8]
0092c350	cbz x0,0x0092c3d8
0092c354	ldr w8,[x19]
0092c358	mov w9,#0xab1e
0092c35c	movk w9,#0xb, LSL #16
0092c360	cmp w8,w9
0092c364	b.ne 0x0092c3d8
0092c368	ldr w0,[x19, #0x224]
0092c36c	cmn w0,#0x1
0092c370	b.eq 0x0092c408
0092c374	mov w8,#0x1
0092c378	add x1,sp,#0x4
0092c37c	mov w2,#0x1
0092c380	strb w8,[sp, #0x4]
0092c384	bl 0x00c31cc0
0092c388	mov x8,x0
0092c38c	mov w0,wzr
0092c390	tbz x8,#0x3f,0x0092c3dc
0092c394	bl 0x00c30710
0092c398	mov x20,x0
0092c39c	mov w22,#0x2
0092c3a0	ldr w8,[x20]
0092c3a4	cmp w8,#0xb
0092c3a8	cset w9,ne
0092c3ac	cmp w8,#0x4
0092c3b0	csel w8,w22,w9,eq
0092c3b4	cmp w8,#0x2
0092c3b8	b.ne 0x0092c400
0092c3bc	ldr w0,[x19, #0x224]
0092c3c0	add x1,sp,#0x4
0092c3c4	mov w2,#0x1
0092c3c8	bl 0x00c31cc0
0092c3cc	tbnz x0,#0x3f,0x0092c3a0
0092c3d0	mov w0,wzr
0092c3d4	b 0x0092c3dc
0092c3d8	mov w0,#0x1
0092c3dc	ldr x8,[x21, #0x28]
0092c3e0	ldr x9,[sp, #0x8]
0092c3e4	cmp x8,x9
0092c3e8	b.ne 0x0092c410
0092c3ec	ldp x29,x30,[sp, #0x30]
0092c3f0	ldp x20,x19,[sp, #0x20]
0092c3f4	ldp x22,x21,[sp, #0x10]
0092c3f8	add sp,sp,#0x40
0092c3fc	ret
0092c400	mov w0,wzr
0092c404	cbz w8,0x0092c3dc
0092c408	mov w0,#0x9
0092c40c	b 0x0092c3dc
0092c410	bl 0x00c2fec0
