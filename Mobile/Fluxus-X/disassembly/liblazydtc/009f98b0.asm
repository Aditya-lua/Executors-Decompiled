; ASYNC_unblock_pause @ 009f98b0
009f98b0	stp x29,x30,[sp, #-0x10]!
009f98b4	mov w0,#0x100
009f98b8	mov x1,xzr
009f98bc	mov x29,sp
009f98c0	bl 0x00c35500
009f98c4	cbz w0,0x009f98f0
009f98c8	adrp x0,0xd21000
009f98cc	add x0,x0,#0x8e8
009f98d0	bl 0x00c38360
009f98d4	cbz x0,0x009f98f0
009f98d8	ldr x8,[x0, #0x8]
009f98dc	cbz x8,0x009f98f0
009f98e0	ldr w8,[x0, #0x10]
009f98e4	cbz w8,0x009f98f0
009f98e8	sub w8,w8,#0x1
009f98ec	str w8,[x0, #0x10]
009f98f0	ldp x29,x30,[sp], #0x10
009f98f4	ret
