; ASN1_TYPE_unpack_sequence @ 009efdd4
009efdd4	cbz x1,0x009efdf8
009efdd8	ldr w9,[x1]
009efddc	cmp w9,#0x10
009efde0	b.ne 0x009efdf8
009efde4	mov x8,x0
009efde8	ldr x0,[x1, #0x8]
009efdec	cbz x0,0x009efdf8
009efdf0	mov x1,x8
009efdf4	b 0x00c37aa0
009efdf8	mov x0,xzr
009efdfc	ret
