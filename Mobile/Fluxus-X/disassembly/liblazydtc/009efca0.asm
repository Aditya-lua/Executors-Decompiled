; ASN1_TYPE_cmp @ 009efca0
009efca0	mov w8,#0xffffffff
009efca4	cbz x0,0x009efcf8
009efca8	cbz x1,0x009efcf8
009efcac	ldr w8,[x0]
009efcb0	ldr w9,[x1]
009efcb4	cmp w8,w9
009efcb8	b.ne 0x009efce0
009efcbc	cmp w8,#0x1
009efcc0	b.eq 0x009efcec
009efcc4	cmp w8,#0x5
009efcc8	b.eq 0x009efd00
009efccc	cmp w8,#0x6
009efcd0	b.ne 0x009efd08
009efcd4	ldr x0,[x0, #0x8]
009efcd8	ldr x1,[x1, #0x8]
009efcdc	b 0x00c37ab0
009efce0	mov w8,#0xffffffff
009efce4	mov w0,w8
009efce8	ret
009efcec	ldr w8,[x0, #0x8]
009efcf0	ldr w9,[x1, #0x8]
009efcf4	sub w8,w8,w9
009efcf8	mov w0,w8
009efcfc	ret
009efd00	mov w0,wzr
009efd04	ret
009efd08	ldr x0,[x0, #0x8]
009efd0c	ldr x1,[x1, #0x8]
009efd10	b 0x00c37a20
