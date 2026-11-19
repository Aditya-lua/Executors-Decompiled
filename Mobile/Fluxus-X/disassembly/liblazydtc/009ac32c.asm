; ssl_cert_free @ 009ac32c
009ac32c	str x23,[sp, #-0x40]!
009ac330	stp x22,x21,[sp, #0x10]
009ac334	stp x20,x19,[sp, #0x20]
009ac338	stp x29,x30,[sp, #0x30]
009ac33c	add x29,sp,#0x30
009ac340	cbz x0,0x009ac370
009ac344	mov x19,x0
009ac348	add x9,x0,#0x208
009ac34c	ldxr w8,[x9]
009ac350	subs w10,w8,#0x1
009ac354	stxr w11,w10,[x9]
009ac358	cbnz w11,0x009ac34c
009ac35c	b.ne 0x009ac368
009ac360	dmb ISHLD
009ac364	b 0x009ac384
009ac368	cmp w8,#0x1
009ac36c	b.le 0x009ac384
009ac370	ldp x29,x30,[sp, #0x30]
009ac374	ldp x20,x19,[sp, #0x20]
009ac378	ldp x22,x21,[sp, #0x10]
009ac37c	ldr x23,[sp], #0x40
009ac380	ret
009ac384	ldr x0,[x19, #0x8]
009ac388	bl 0x00c32450
009ac38c	adrp x20,0xcb4000
009ac390	ldr x20,[x20, #0xd88]
009ac394	adrp x21,0x2d5000
009ac398	mov x22,xzr
009ac39c	add x21,x21,#0x6b3
009ac3a0	add x23,x19,x22
009ac3a4	ldr x0,[x23, #0x20]
009ac3a8	bl 0x00c31a90
009ac3ac	ldr x0,[x23, #0x28]
009ac3b0	str xzr,[x23, #0x20]
009ac3b4	bl 0x00c32450
009ac3b8	ldr x0,[x23, #0x30]
009ac3bc	mov x1,x20
009ac3c0	str xzr,[x23, #0x28]
009ac3c4	bl 0x00c32600
009ac3c8	ldr x0,[x23, #0x38]
009ac3cc	mov w2,#0xe3
009ac3d0	mov x1,x21
009ac3d4	str xzr,[x23, #0x30]
009ac3d8	bl 0x00c32310
009ac3dc	add x22,x22,#0x28
009ac3e0	cmp x22,#0x168
009ac3e4	stp xzr,xzr,[x23, #0x38]
009ac3e8	b.ne 0x009ac3a0
009ac3ec	ldr x0,[x19, #0x198]
009ac3f0	adrp x20,0x2d5000
009ac3f4	add x20,x20,#0x6b3
009ac3f8	orr w2,wzr,#0xf8
009ac3fc	mov x1,x20
009ac400	bl 0x00c32310
009ac404	ldr x0,[x19, #0x1a8]
009ac408	mov w2,#0xf9
009ac40c	mov x1,x20
009ac410	bl 0x00c32310
009ac414	ldr x0,[x19, #0x188]
009ac418	mov w2,#0xfa
009ac41c	mov x1,x20
009ac420	bl 0x00c32310
009ac424	ldr x0,[x19, #0x1d0]
009ac428	bl 0x00c32c10
009ac42c	ldr x0,[x19, #0x1c8]
009ac430	bl 0x00c32c10
009ac434	add x0,x19,#0x1d8
009ac438	bl 0x00c350e0
009ac43c	ldr x0,[x19, #0x200]
009ac440	orr w2,wzr,#0xff
009ac444	mov x1,x20
009ac448	bl 0x00c32310
009ac44c	ldr x0,[x19, #0x210]
009ac450	bl 0x00c34d40
009ac454	mov x0,x19
009ac458	mov x1,x20
009ac45c	ldp x29,x30,[sp, #0x30]
009ac460	ldp x20,x19,[sp, #0x20]
009ac464	ldp x22,x21,[sp, #0x10]
009ac468	mov w2,#0x102
009ac46c	ldr x23,[sp], #0x40
009ac470	b 0x00c32310
