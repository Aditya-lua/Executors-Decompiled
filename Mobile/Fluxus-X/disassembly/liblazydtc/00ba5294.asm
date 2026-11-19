; mbedtls_ripemd160 @ 00ba5294
00ba5294	sub sp,sp,#0xc0
00ba5298	stp x26,x25,[sp, #0x70]
00ba529c	stp x24,x23,[sp, #0x80]
00ba52a0	stp x22,x21,[sp, #0x90]
00ba52a4	stp x20,x19,[sp, #0xa0]
00ba52a8	stp x29,x30,[sp, #0xb0]
00ba52ac	add x29,sp,#0xb0
00ba52b0	mrs x23,tpidr_el0
00ba52b4	ldr x8,[x23, #0x28]
00ba52b8	mov x19,x2
00ba52bc	mov x20,x1
00ba52c0	mov x21,x0
00ba52c4	add x0,sp,#0x8
00ba52c8	mov w2,#0x5c
00ba52cc	mov w1,wzr
00ba52d0	stur x8,[x29, #-0x48]
00ba52d4	bl 0x00c301c0
00ba52d8	adrp x8,0x29c000
00ba52dc	ldr q0,[x8, #0x2e0]
00ba52e0	mov w8,#0xe1f0
00ba52e4	movk w8,#0xc3d2, LSL #16
00ba52e8	str w8,[sp, #0x20]
00ba52ec	stur q0,[sp, #0x10]
00ba52f0	cbz x20,0x00ba5348
00ba52f4	subs x24,x20,#0x40
00ba52f8	str w20,[sp, #0x8]
00ba52fc	b.cc 0x00ba5334
00ba5300	and x26,x24,#-0x40
00ba5304	add x25,x26,#0x40
00ba5308	mov x22,x21
00ba530c	add x0,sp,#0x8
00ba5310	mov x1,x22
00ba5314	bl 0x00c433f0
00ba5318	sub x20,x20,#0x40
00ba531c	cmp x20,#0x3f
00ba5320	add x22,x22,#0x40
00ba5324	b.hi 0x00ba530c
00ba5328	subs x20,x24,x26
00ba532c	b.eq 0x00ba5348
00ba5330	add x21,x21,x25
00ba5334	add x8,sp,#0x8
00ba5338	add x0,x8,#0x1c
00ba533c	mov x1,x21
00ba5340	mov x2,x20
00ba5344	bl 0x00c2ffd0
00ba5348	add x0,sp,#0x8
00ba534c	mov x1,x19
00ba5350	bl 0x00c429b0
00ba5354	add x0,sp,#0x8
00ba5358	mov w1,#0x5c
00ba535c	bl 0x00c42220
00ba5360	ldr x8,[x23, #0x28]
00ba5364	ldur x9,[x29, #-0x48]
00ba5368	cmp x8,x9
00ba536c	b.ne 0x00ba5390
00ba5370	ldp x29,x30,[sp, #0xb0]
00ba5374	ldp x20,x19,[sp, #0xa0]
00ba5378	ldp x22,x21,[sp, #0x90]
00ba537c	ldp x24,x23,[sp, #0x80]
00ba5380	ldp x26,x25,[sp, #0x70]
00ba5384	mov w0,wzr
00ba5388	add sp,sp,#0xc0
00ba538c	ret
00ba5390	bl 0x00c2fec0
