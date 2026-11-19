; BN_mul_word @ 00a0b864
00a0b864	stp x20,x19,[sp, #-0x20]!
00a0b868	stp x29,x30,[sp, #0x10]
00a0b86c	ldr w2,[x0, #0x8]
00a0b870	add x29,sp,#0x10
00a0b874	cbz w2,0x00a0b8cc
00a0b878	mov x19,x0
00a0b87c	mov x3,x1
00a0b880	cbz x1,0x00a0b8c4
00a0b884	ldr x0,[x19]
00a0b888	mov x1,x0
00a0b88c	bl 0x00c38900
00a0b890	cbz x0,0x00a0b8cc
00a0b894	ldr w8,[x19, #0x8]
00a0b898	mov x20,x0
00a0b89c	mov x0,x19
00a0b8a0	add w1,w8,#0x1
00a0b8a4	bl 0x00c38e80
00a0b8a8	cbz x0,0x00a0b8d0
00a0b8ac	ldrsw x8,[x19, #0x8]
00a0b8b0	ldr x9,[x19]
00a0b8b4	add w10,w8,#0x1
00a0b8b8	str w10,[x19, #0x8]
00a0b8bc	str x20,[x9, x8, LSL #0x3]
00a0b8c0	b 0x00a0b8cc
00a0b8c4	mov x0,x19
00a0b8c8	bl 0x00c38e00
00a0b8cc	mov w0,#0x1
00a0b8d0	ldp x29,x30,[sp, #0x10]
00a0b8d4	ldp x20,x19,[sp], #0x20
00a0b8d8	ret
