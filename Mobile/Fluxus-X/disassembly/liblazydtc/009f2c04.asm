; ASN1_INTEGER_cmp @ 009f2c04
009f2c04	str x19,[sp, #-0x20]!
009f2c08	stp x29,x30,[sp, #0x10]
009f2c0c	ldr w8,[x0, #0x4]
009f2c10	ldr w9,[x1, #0x4]
009f2c14	add x29,sp,#0x10
009f2c18	and w19,w8,#0x100
009f2c1c	and w8,w9,#0x100
009f2c20	cmp w19,w8
009f2c24	b.ne 0x009f2c38
009f2c28	bl 0x00c37a20
009f2c2c	cmp w19,#0x0
009f2c30	cneg w0,w0,ne
009f2c34	b 0x009f2c44
009f2c38	lsr w8,w19,#0x7
009f2c3c	eor w8,w8,#0x2
009f2c40	sub w0,w8,#0x1
009f2c44	ldp x29,x30,[sp, #0x10]
009f2c48	ldr x19,[sp], #0x20
009f2c4c	ret
