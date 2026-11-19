; check_in_list @ 009e5b40
009e5b40	stp x24,x23,[sp, #-0x40]!
009e5b44	mov x23,x0
009e5b48	mov w0,wzr
009e5b4c	stp x22,x21,[sp, #0x10]
009e5b50	stp x20,x19,[sp, #0x20]
009e5b54	stp x29,x30,[sp, #0x30]
009e5b58	add x29,sp,#0x30
009e5b5c	cbz x3,0x009e5bb8
009e5b60	mov x21,x2
009e5b64	cbz x2,0x009e5bb8
009e5b68	mov w19,w4
009e5b6c	mov x20,x3
009e5b70	mov w22,w1
009e5b74	mov x24,xzr
009e5b78	ldrh w8,[x21, x24, LSL #0x1]
009e5b7c	cmp w8,w22, UXTH 
009e5b80	b.ne 0x009e5ba0
009e5b84	cbz w19,0x009e5bb4
009e5b88	mov w2,#0x6
009e5b8c	movk w2,#0x2, LSL #16
009e5b90	mov x0,x23
009e5b94	mov w1,w22
009e5b98	bl 0x00c367e0
009e5b9c	cbnz w0,0x009e5bb4
009e5ba0	add x24,x24,#0x1
009e5ba4	cmp x24,x20
009e5ba8	b.cc 0x009e5b78
009e5bac	mov w0,wzr
009e5bb0	b 0x009e5bb8
009e5bb4	mov w0,#0x1
009e5bb8	ldp x29,x30,[sp, #0x30]
009e5bbc	ldp x20,x19,[sp, #0x20]
009e5bc0	ldp x22,x21,[sp, #0x10]
009e5bc4	ldp x24,x23,[sp], #0x40
009e5bc8	ret
