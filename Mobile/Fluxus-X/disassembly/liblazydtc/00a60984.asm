; OSSL_ENCODER_free @ 00a60984
00a60984	stp x20,x19,[sp, #-0x20]!
00a60988	stp x29,x30,[sp, #0x10]
00a6098c	add x29,sp,#0x10
00a60990	cbz x0,0x00a609c0
00a60994	mov x19,x0
00a60998	add x9,x0,#0x28
00a6099c	ldxr w8,[x9]
00a609a0	subs w10,w8,#0x1
00a609a4	stxr w11,w10,[x9]
00a609a8	cbnz w11,0x00a6099c
00a609ac	b.ne 0x00a609b8
00a609b0	dmb ISHLD
00a609b4	b 0x00a609cc
00a609b8	cmp w8,#0x1
00a609bc	b.le 0x00a609cc
00a609c0	ldp x29,x30,[sp, #0x10]
00a609c4	ldp x20,x19,[sp], #0x20
00a609c8	ret
00a609cc	ldr x0,[x19, #0x10]
00a609d0	adrp x20,0x2d3000
00a609d4	add x20,x20,#0xb3c
00a609d8	mov w2,#0x3d
00a609dc	mov x1,x20
00a609e0	bl 0x00c32310
00a609e4	ldr x0,[x19, #0x20]
00a609e8	bl 0x00c3b670
00a609ec	ldr x0,[x19]
00a609f0	bl 0x00c3b690
00a609f4	ldr x0,[x19, #0x30]
00a609f8	bl 0x00c34d40
00a609fc	ldp x29,x30,[sp, #0x10]
00a60a00	mov w2,#0x41
00a60a04	mov x0,x19
00a60a08	mov x1,x20
00a60a0c	ldp x20,x19,[sp], #0x20
00a60a10	b 0x00c32310
