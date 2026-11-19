; FUN_00ae8258 @ 00ae8258
00ae8258	str x23,[sp, #-0x40]!
00ae825c	mov x9,#0x100000001
00ae8260	stp x22,x21,[sp, #0x10]
00ae8264	stp x20,x19,[sp, #0x20]
00ae8268	mov x21,x1
00ae826c	mov x19,x0
00ae8270	mov w8,#0x1
00ae8274	movk x9,#0x600
00ae8278	stp x29,x30,[sp, #0x30]
00ae827c	add x29,sp,#0x30
00ae8280	str xzr,[sp, #0x8]
00ae8284	b 0x00ae828c
00ae8288	add x21,x21,#0x1
00ae828c	ldrb w10,[x21]
00ae8290	cmp w10,#0x20
00ae8294	b.hi 0x00ae82a4
00ae8298	lsl x10,x8,x10
00ae829c	tst x10,x9
00ae82a0	b.ne 0x00ae8288
00ae82a4	mov x0,x21
00ae82a8	bl 0x00c2ff50
00ae82ac	lsr x8,x0,#0x1f
00ae82b0	cbnz x8,0x00ae8388
00ae82b4	mov x23,x0
00ae82b8	neg w8,w23
00ae82bc	and x22,x8,#0x3
00ae82c0	add x8,x22,x0
00ae82c4	lsr x8,x8,#0x2
00ae82c8	add x8,x8,x8, LSL #0x1
00ae82cc	cmp x8,#0x9c4
00ae82d0	b.hi 0x00ae8388
00ae82d4	bl 0x00c3cc10
00ae82d8	cbz x0,0x00ae8388
00ae82dc	mov x20,x0
00ae82e0	cmp x22,#0x3
00ae82e4	b.eq 0x00ae83a0
00ae82e8	mov x0,x20
00ae82ec	bl 0x00c3cbe0
00ae82f0	mov w1,#0x2
00ae82f4	mov x0,x20
00ae82f8	bl 0x00c3cc60
00ae82fc	cbz x22,0x00ae8320
00ae8300	adrp x3,0x2bb000
00ae8304	add x3,x3,#0x974
00ae8308	add x2,sp,#0xc
00ae830c	mov x0,x20
00ae8310	mov x1,x19
00ae8314	mov w4,w22
00ae8318	bl 0x00c3cbf0
00ae831c	tbnz w0,#0x1f,0x00ae83a0
00ae8320	add x2,sp,#0x8
00ae8324	mov x0,x20
00ae8328	mov x1,x19
00ae832c	mov x3,x21
00ae8330	mov w4,w23
00ae8334	bl 0x00c3cbf0
00ae8338	tbnz w0,#0x1f,0x00ae83a0
00ae833c	ldpsw x9,x8,[sp, #0x8]
00ae8340	add x2,sp,#0x8
00ae8344	mov x0,x20
00ae8348	add x8,x8,x9
00ae834c	add x1,x19,x8
00ae8350	str w8,[sp, #0xc]
00ae8354	bl 0x00c3cbd0
00ae8358	ldpsw x9,x8,[sp, #0x8]
00ae835c	add x8,x8,x9
00ae8360	str w8,[sp, #0xc]
00ae8364	cbz x22,0x00ae83a8
00ae8368	subs w21,w8,w22
00ae836c	b.le 0x00ae83a0
00ae8370	add x1,x19,x22
00ae8374	sub x2,x8,x22
00ae8378	mov x0,x19
00ae837c	bl 0x00c2ff60
00ae8380	str w21,[sp, #0xc]
00ae8384	b 0x00ae83a8
00ae8388	mov w0,#0xffffffff
00ae838c	ldp x29,x30,[sp, #0x30]
00ae8390	ldp x20,x19,[sp, #0x20]
00ae8394	ldp x22,x21,[sp, #0x10]
00ae8398	ldr x23,[sp], #0x40
00ae839c	ret
00ae83a0	mov w8,#0xffffffff
00ae83a4	str w8,[sp, #0xc]
00ae83a8	mov x0,x20
00ae83ac	bl 0x00c3cc00
00ae83b0	ldr w0,[sp, #0xc]
00ae83b4	b 0x00ae838c
