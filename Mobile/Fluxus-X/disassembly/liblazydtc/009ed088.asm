; FUN_009ed088 @ 009ed088
009ed088	sub sp,sp,#0x110
009ed08c	stp x26,x25,[sp, #0xc0]
009ed090	stp x24,x23,[sp, #0xd0]
009ed094	stp x22,x21,[sp, #0xe0]
009ed098	stp x20,x19,[sp, #0xf0]
009ed09c	mov x20,x4
009ed0a0	mov x26,x2
009ed0a4	mov x22,x1
009ed0a8	mov x23,x0
009ed0ac	cmp w3,#0x1
009ed0b0	bic w19,w3,w3, ASR #0x1f
009ed0b4	stp x28,x27,[sp, #0xb0]
009ed0b8	stp x29,x30,[sp, #0x100]
009ed0bc	add x29,sp,#0x100
009ed0c0	b.lt 0x009ed0f0
009ed0c4	adrp x21,0x2a1000
009ed0c8	mov w24,wzr
009ed0cc	add x21,x21,#0x9a2
009ed0d0	mov w2,#0x1
009ed0d4	mov x0,x22
009ed0d8	mov x1,x21
009ed0dc	blr x23
009ed0e0	cbz w0,0x009ed420
009ed0e4	add w24,w24,#0x1
009ed0e8	cmp w24,w19
009ed0ec	b.cc 0x009ed0d0
009ed0f0	and x8,x20,#0xf0000
009ed0f4	sub x8,x8,#0x10, LSL #12
009ed0f8	lsr x8,x8,#0x10
009ed0fc	cmp x8,#0x3
009ed100	b.hi 0x009ed420
009ed104	adrp x9,0x74d000
009ed108	add x9,x9,#0xd50
009ed10c	ldrsw x8,[x9, x8, LSL #0x2]
009ed110	adrp x25,0x2a5000
009ed114	orr w27,wzr,#0x3
009ed118	mov w24,#0x1
009ed11c	add x8,x8,x9
009ed120	adrp x9,0x2c4000
009ed124	add x9,x9,#0xdae
009ed128	add x25,x25,#0xbf6
009ed12c	str x9,[sp, #0x40]
009ed130	mov w21,w19
009ed134	br x8
009ed420	mov w19,#0xffffffff
009ed424	mov w0,w19
009ed428	ldp x29,x30,[sp, #0x100]
009ed42c	ldp x20,x19,[sp, #0xf0]
009ed430	ldp x22,x21,[sp, #0xe0]
009ed434	ldp x24,x23,[sp, #0xd0]
009ed438	ldp x26,x25,[sp, #0xc0]
009ed43c	ldp x28,x27,[sp, #0xb0]
009ed440	add sp,sp,#0x110
009ed444	ret
