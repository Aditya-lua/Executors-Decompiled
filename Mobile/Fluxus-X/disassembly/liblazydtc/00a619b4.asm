; FUN_00a619b4 @ 00a619b4
00a619b4	stp x20,x19,[sp, #-0x20]!
00a619b8	stp x29,x30,[sp, #0x10]
00a619bc	add x29,sp,#0x10
00a619c0	cbz x0,0x00a619f0
00a619c4	mov x19,x0
00a619c8	add x9,x0,#0x28
00a619cc	ldxr w8,[x9]
00a619d0	subs w10,w8,#0x1
00a619d4	stxr w11,w10,[x9]
00a619d8	cbnz w11,0x00a619cc
00a619dc	b.ne 0x00a619e8
00a619e0	dmb ISHLD
00a619e4	b 0x00a619fc
00a619e8	cmp w8,#0x1
00a619ec	b.le 0x00a619fc
00a619f0	ldp x29,x30,[sp, #0x10]
00a619f4	ldp x20,x19,[sp], #0x20
00a619f8	ret
00a619fc	ldr x0,[x19, #0x10]
00a61a00	adrp x20,0x2d3000
00a61a04	add x20,x20,#0xb3c
00a61a08	mov w2,#0x3d
00a61a0c	mov x1,x20
00a61a10	bl 0x00c32310
00a61a14	ldr x0,[x19, #0x20]
00a61a18	bl 0x00c3b670
00a61a1c	ldr x0,[x19]
00a61a20	bl 0x00c3b690
00a61a24	ldr x0,[x19, #0x30]
00a61a28	bl 0x00c34d40
00a61a2c	ldp x29,x30,[sp, #0x10]
00a61a30	mov w2,#0x41
00a61a34	mov x0,x19
00a61a38	mov x1,x20
00a61a3c	ldp x20,x19,[sp], #0x20
00a61a40	b 0x00c32310
