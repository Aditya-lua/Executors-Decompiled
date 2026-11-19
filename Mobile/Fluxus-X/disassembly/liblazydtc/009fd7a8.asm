; bwrite_conv @ 009fd7a8
009fd7a8	str x19,[sp, #-0x20]!
009fd7ac	stp x29,x30,[sp, #0x10]
009fd7b0	ldr x8,[x0, #0x8]
009fd7b4	orr w9,wzr,#0x7fffffff
009fd7b8	cmp x2,x9
009fd7bc	csel w2,w2,w9,cc
009fd7c0	ldr x8,[x8, #0x18]
009fd7c4	add x29,sp,#0x10
009fd7c8	mov x19,x3
009fd7cc	blr x8
009fd7d0	sxtw x8,w0
009fd7d4	cmp w0,#0x1
009fd7d8	csel x8,xzr,x8,lt
009fd7dc	str x8,[x19]
009fd7e0	ldp x29,x30,[sp, #0x10]
009fd7e4	csinc w0,w0,wzr,lt
009fd7e8	ldr x19,[sp], #0x20
009fd7ec	ret
