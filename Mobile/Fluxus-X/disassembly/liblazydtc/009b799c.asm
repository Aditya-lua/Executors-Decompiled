; SSL_get_client_random @ 009b799c
009b799c	str x19,[sp, #-0x20]!
009b79a0	stp x29,x30,[sp, #0x10]
009b79a4	add x29,sp,#0x10
009b79a8	cbz x2,0x009b79d0
009b79ac	cmp x2,#0x20
009b79b0	mov w8,#0x20
009b79b4	csel x19,x2,x8,cc
009b79b8	add x8,x0,#0x160
009b79bc	mov x0,x1
009b79c0	mov x1,x8
009b79c4	mov x2,x19
009b79c8	bl 0x00c2ffd0
009b79cc	b 0x009b79d4
009b79d0	mov w19,#0x20
009b79d4	ldp x29,x30,[sp, #0x10]
009b79d8	mov x0,x19
009b79dc	ldr x19,[sp], #0x20
009b79e0	ret
