; FUN_00a4f570 @ 00a4f570
00a4f570	stp x20,x19,[sp, #-0x20]!
00a4f574	stp x29,x30,[sp, #0x10]
00a4f578	add x29,sp,#0x10
00a4f57c	cbz x0,0x00a4f5ac
00a4f580	mov x19,x0
00a4f584	add x9,x0,#0x28
00a4f588	ldxr w8,[x9]
00a4f58c	subs w10,w8,#0x1
00a4f590	stxr w11,w10,[x9]
00a4f594	cbnz w11,0x00a4f588
00a4f598	b.ne 0x00a4f5a4
00a4f59c	dmb ISHLD
00a4f5a0	b 0x00a4f5b8
00a4f5a4	cmp w8,#0x1
00a4f5a8	b.le 0x00a4f5b8
00a4f5ac	ldp x29,x30,[sp, #0x10]
00a4f5b0	ldp x20,x19,[sp], #0x20
00a4f5b4	ret
00a4f5b8	ldr x0,[x19, #0x10]
00a4f5bc	adrp x20,0x2db000
00a4f5c0	add x20,x20,#0xf32
00a4f5c4	mov w2,#0x3d
00a4f5c8	mov x1,x20
00a4f5cc	bl 0x00c32310
00a4f5d0	ldr x0,[x19, #0x20]
00a4f5d4	bl 0x00c3b670
00a4f5d8	ldr x0,[x19]
00a4f5dc	bl 0x00c3b690
00a4f5e0	ldr x0,[x19, #0x30]
00a4f5e4	bl 0x00c34d40
00a4f5e8	ldp x29,x30,[sp, #0x10]
00a4f5ec	mov w2,#0x41
00a4f5f0	mov x0,x19
00a4f5f4	mov x1,x20
00a4f5f8	ldp x20,x19,[sp], #0x20
00a4f5fc	b 0x00c32310
