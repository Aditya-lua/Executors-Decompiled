; mbedtls_md5 @ 00b7a2f4
00b7a2f4	sub sp,sp,#0xb0
00b7a2f8	stp x26,x25,[sp, #0x60]
00b7a2fc	stp x24,x23,[sp, #0x70]
00b7a300	stp x22,x21,[sp, #0x80]
00b7a304	stp x20,x19,[sp, #0x90]
00b7a308	stp x29,x30,[sp, #0xa0]
00b7a30c	add x29,sp,#0xa0
00b7a310	mrs x23,tpidr_el0
00b7a314	ldr x8,[x23, #0x28]
00b7a318	mov x19,x2
00b7a31c	mov x20,x1
00b7a320	mov x21,x0
00b7a324	mov x0,sp
00b7a328	mov w2,#0x58
00b7a32c	mov w1,wzr
00b7a330	stur x8,[x29, #-0x48]
00b7a334	bl 0x00c301c0
00b7a338	adrp x8,0x29c000
00b7a33c	ldr q0,[x8, #0x2e0]
00b7a340	stur q0,[sp, #0x8]
00b7a344	cbz x20,0x00b7a39c
00b7a348	subs x24,x20,#0x40
00b7a34c	str w20,[sp]
00b7a350	b.cc 0x00b7a388
00b7a354	and x26,x24,#-0x40
00b7a358	add x25,x26,#0x40
00b7a35c	mov x22,x21
00b7a360	mov x0,sp
00b7a364	mov x1,x22
00b7a368	bl 0x00c42bc0
00b7a36c	sub x20,x20,#0x40
00b7a370	cmp x20,#0x3f
00b7a374	add x22,x22,#0x40
00b7a378	b.hi 0x00b7a360
00b7a37c	subs x20,x24,x26
00b7a380	b.eq 0x00b7a39c
00b7a384	add x21,x21,x25
00b7a388	mov x8,sp
00b7a38c	add x0,x8,#0x18
00b7a390	mov x1,x21
00b7a394	mov x2,x20
00b7a398	bl 0x00c2ffd0
00b7a39c	mov x0,sp
00b7a3a0	mov x1,x19
00b7a3a4	bl 0x00c42900
00b7a3a8	mov x0,sp
00b7a3ac	mov w1,#0x58
00b7a3b0	bl 0x00c42220
00b7a3b4	ldr x8,[x23, #0x28]
00b7a3b8	ldur x9,[x29, #-0x48]
00b7a3bc	cmp x8,x9
00b7a3c0	b.ne 0x00b7a3e4
00b7a3c4	ldp x29,x30,[sp, #0xa0]
00b7a3c8	ldp x20,x19,[sp, #0x90]
00b7a3cc	ldp x22,x21,[sp, #0x80]
00b7a3d0	ldp x24,x23,[sp, #0x70]
00b7a3d4	ldp x26,x25,[sp, #0x60]
00b7a3d8	mov w0,wzr
00b7a3dc	add sp,sp,#0xb0
00b7a3e0	ret
00b7a3e4	bl 0x00c2fec0
