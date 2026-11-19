; ASN1_STRING_copy @ 009f0ef0
009f0ef0	stp x20,x19,[sp, #-0x20]!
009f0ef4	stp x29,x30,[sp, #0x10]
009f0ef8	add x29,sp,#0x10
009f0efc	cbz x1,0x009f0f44
009f0f00	ldr w8,[x1, #0x4]
009f0f04	mov x20,x1
009f0f08	mov x19,x0
009f0f0c	str w8,[x0, #0x4]
009f0f10	ldr x1,[x1, #0x8]
009f0f14	ldr w2,[x20]
009f0f18	bl 0x009f0f54
009f0f1c	cbz w0,0x009f0f48
009f0f20	ldr x8,[x19, #0x10]
009f0f24	mov w0,#0x1
009f0f28	and x8,x8,#0x80
009f0f2c	str x8,[x19, #0x10]
009f0f30	ldr x9,[x20, #0x10]
009f0f34	and x9,x9,#-0x81
009f0f38	orr x8,x9,x8
009f0f3c	str x8,[x19, #0x10]
009f0f40	b 0x009f0f48
009f0f44	mov w0,wzr
009f0f48	ldp x29,x30,[sp, #0x10]
009f0f4c	ldp x20,x19,[sp], #0x20
009f0f50	ret
