; tls1_clear @ 009c0cc8
009c0cc8	str x19,[sp, #-0x20]!
009c0ccc	stp x29,x30,[sp, #0x10]
009c0cd0	add x29,sp,#0x10
009c0cd4	mov x19,x0
009c0cd8	bl 0x00c34470
009c0cdc	cbz w0,0x009c0cfc
009c0ce0	ldr x8,[x19, #0x8]
009c0ce4	mov w9,#0x304
009c0ce8	mov w0,#0x1
009c0cec	ldr w8,[x8]
009c0cf0	cmp w8,#0x10, LSL #12
009c0cf4	csel w8,w9,w8,eq
009c0cf8	str w8,[x19]
009c0cfc	ldp x29,x30,[sp, #0x10]
009c0d00	ldr x19,[sp], #0x20
009c0d04	ret
