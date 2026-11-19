; FUN_00a5d1e8 @ 00a5d1e8
00a5d1e8	stp x20,x19,[sp, #-0x20]!
00a5d1ec	stp x29,x30,[sp, #0x10]
00a5d1f0	add x29,sp,#0x10
00a5d1f4	cbz x0,0x00a5d204
00a5d1f8	ldr w8,[x0, #0x18]
00a5d1fc	mov x19,x0
00a5d200	cbz w8,0x00a5d210
00a5d204	ldp x29,x30,[sp, #0x10]
00a5d208	ldp x20,x19,[sp], #0x20
00a5d20c	ret
00a5d210	add x9,x19,#0x80
00a5d214	ldxr w8,[x9]
00a5d218	subs w10,w8,#0x1
00a5d21c	stxr w11,w10,[x9]
00a5d220	cbnz w11,0x00a5d214
00a5d224	b.ne 0x00a5d230
00a5d228	dmb ISHLD
00a5d22c	b 0x00a5d238
00a5d230	cmp w8,#0x1
00a5d234	b.gt 0x00a5d204
00a5d238	ldr x0,[x19, #0x68]
00a5d23c	adrp x20,0x2a5000
00a5d240	add x20,x20,#0xf9d
00a5d244	mov w2,#0x69b
00a5d248	mov x1,x20
00a5d24c	bl 0x00c32310
00a5d250	ldr x0,[x19, #0x78]
00a5d254	bl 0x00c3b690
00a5d258	ldr x0,[x19, #0x88]
00a5d25c	bl 0x00c34d40
00a5d260	ldp x29,x30,[sp, #0x10]
00a5d264	mov w2,#0x69e
00a5d268	mov x0,x19
00a5d26c	mov x1,x20
00a5d270	ldp x20,x19,[sp], #0x20
00a5d274	b 0x00c32310
