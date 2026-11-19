; ssl3_comp_find @ 009b0b48
009b0b48	stp x22,x21,[sp, #-0x30]!
009b0b4c	stp x20,x19,[sp, #0x10]
009b0b50	mov x20,x0
009b0b54	mov x0,xzr
009b0b58	stp x29,x30,[sp, #0x20]
009b0b5c	add x29,sp,#0x20
009b0b60	cbz x20,0x009b0bac
009b0b64	mov w19,w1
009b0b68	cbz w1,0x009b0bac
009b0b6c	mov x0,x20
009b0b70	bl 0x00c325e0
009b0b74	cmp w0,#0x1
009b0b78	b.lt 0x009b0ba8
009b0b7c	mov w21,w0
009b0b80	mov w22,wzr
009b0b84	mov x0,x20
009b0b88	mov w1,w22
009b0b8c	bl 0x00c32610
009b0b90	ldr w8,[x0]
009b0b94	cmp w8,w19
009b0b98	b.eq 0x009b0bac
009b0b9c	add w22,w22,#0x1
009b0ba0	cmp w22,w21
009b0ba4	b.lt 0x009b0b84
009b0ba8	mov x0,xzr
009b0bac	ldp x29,x30,[sp, #0x20]
009b0bb0	ldp x20,x19,[sp, #0x10]
009b0bb4	ldp x22,x21,[sp], #0x30
009b0bb8	ret
