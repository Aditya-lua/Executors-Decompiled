; SSL_select_next_proto @ 009b5ea8
009b5ea8	sub sp,sp,#0x70
009b5eac	stp x20,x19,[sp, #0x50]
009b5eb0	mov x19,x4
009b5eb4	mov x9,x0
009b5eb8	stp x28,x27,[sp, #0x10]
009b5ebc	stp x26,x25,[sp, #0x20]
009b5ec0	stp x24,x23,[sp, #0x30]
009b5ec4	stp x22,x21,[sp, #0x40]
009b5ec8	stp x29,x30,[sp, #0x60]
009b5ecc	add x29,sp,#0x60
009b5ed0	cbz w3,0x009b5f50
009b5ed4	mov w22,w5
009b5ed8	mov w24,w3
009b5edc	mov x23,x2
009b5ee0	mov w27,wzr
009b5ee4	stp x9,x1,[sp]
009b5ee8	ldrb w25,[x23, w27, UXTW ]
009b5eec	add w28,w27,#0x1
009b5ef0	cbz w22,0x009b5f2c
009b5ef4	mov w8,wzr
009b5ef8	add x26,x23,w28, UXTW 
009b5efc	ldrb w20,[x19, w8, UXTW ]
009b5f00	add w21,w8,#0x1
009b5f04	cmp w25,w20
009b5f08	b.ne 0x009b5f20
009b5f0c	add x1,x19,w21, UXTW 
009b5f10	mov x0,x26
009b5f14	mov x2,x25
009b5f18	bl 0x00c300b0
009b5f1c	cbz w0,0x009b5f40
009b5f20	add w8,w21,w20
009b5f24	cmp w8,w22
009b5f28	b.cc 0x009b5efc
009b5f2c	add w27,w28,w25
009b5f30	cmp w27,w24
009b5f34	b.cc 0x009b5ee8
009b5f38	mov w0,#0x2
009b5f3c	b 0x009b5f48
009b5f40	add x19,x23,w27, UXTW 
009b5f44	mov w0,#0x1
009b5f48	ldp x9,x1,[sp]
009b5f4c	b 0x009b5f54
009b5f50	mov w0,#0x2
009b5f54	add x8,x19,#0x1
009b5f58	str x8,[x9]
009b5f5c	ldrb w8,[x19]
009b5f60	strb w8,[x1]
009b5f64	ldp x29,x30,[sp, #0x60]
009b5f68	ldp x20,x19,[sp, #0x50]
009b5f6c	ldp x22,x21,[sp, #0x40]
009b5f70	ldp x24,x23,[sp, #0x30]
009b5f74	ldp x26,x25,[sp, #0x20]
009b5f78	ldp x28,x27,[sp, #0x10]
009b5f7c	add sp,sp,#0x70
009b5f80	ret
