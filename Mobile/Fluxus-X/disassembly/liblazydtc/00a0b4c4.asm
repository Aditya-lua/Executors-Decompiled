; BN_mod_word @ 00a0b4c4
00a0b4c4	stp x20,x19,[sp, #-0x20]!
00a0b4c8	stp x29,x30,[sp, #0x10]
00a0b4cc	add x29,sp,#0x10
00a0b4d0	cbz x1,0x00a0b514
00a0b4d4	mov x9,#0x100000001
00a0b4d8	mov x19,x1
00a0b4dc	mov x8,x0
00a0b4e0	cmp x1,x9
00a0b4e4	b.cc 0x00a0b51c
00a0b4e8	mov x0,x8
00a0b4ec	bl 0x00c369a0
00a0b4f0	cbz x0,0x00a0b514
00a0b4f4	mov x1,x19
00a0b4f8	mov x20,x0
00a0b4fc	bl 0x00a0b574
00a0b500	mov x19,x0
00a0b504	mov x0,x20
00a0b508	bl 0x00c36290
00a0b50c	mov x0,x19
00a0b510	b 0x00a0b568
00a0b514	mov x0,#-0x1
00a0b518	b 0x00a0b568
00a0b51c	ldrsw x9,[x8, #0x8]
00a0b520	cmp w9,#0x1
00a0b524	b.lt 0x00a0b564
00a0b528	ldr x8,[x8]
00a0b52c	mov x0,xzr
00a0b530	sub x9,x9,#0x1
00a0b534	ldr x10,[x8, x9, LSL #0x3]
00a0b538	add x11,x9,#0x1
00a0b53c	sub x9,x9,#0x1
00a0b540	cmp x11,#0x1
00a0b544	extr x12,x0,x10,#0x20
00a0b548	udiv x13,x12,x19
00a0b54c	msub w12,w13,w19,w12
00a0b550	bfm x10,x12,#0x20,#0x1f
00a0b554	udiv x12,x10,x19
00a0b558	msub x0,x12,x19,x10
00a0b55c	b.gt 0x00a0b534
00a0b560	b 0x00a0b568
00a0b564	mov x0,xzr
00a0b568	ldp x29,x30,[sp, #0x10]
00a0b56c	ldp x20,x19,[sp], #0x20
00a0b570	ret
