; should_add_extension @ 009d0b84
009d0b84	tst w2,w1
009d0b88	b.eq 0x009d0bc4
009d0b8c	ldr x8,[x0, #0x8]
009d0b90	ldr x9,[x8, #0xc0]
009d0b94	ldr w9,[x9, #0x60]
009d0b98	tbnz w2,#0xb,0x009d0bcc
009d0b9c	mov w10,wzr
009d0ba0	tbnz w9,#0x3,0x009d0bd0
009d0ba4	ldr w8,[x8]
009d0ba8	mov w10,wzr
009d0bac	cmp w8,#0x304
009d0bb0	b.lt 0x009d0bdc
009d0bb4	cmp w8,#0x10, LSL #12
009d0bb8	cset w10,ne
009d0bbc	tbz w1,#0x3,0x009d0be0
009d0bc0	b 0x009d0bf0
009d0bc4	mov w0,wzr
009d0bc8	ret
009d0bcc	mov w10,#0x1
009d0bd0	tbz w1,#0x2,0x009d0bdc
009d0bd4	mov w8,wzr
009d0bd8	tbnz w9,#0x3,0x009d0c58
009d0bdc	tbnz w1,#0x3,0x009d0bf0
009d0be0	ldr w8,[x0]
009d0be4	cmp w8,#0x300
009d0be8	mov w8,wzr
009d0bec	b.eq 0x009d0c58
009d0bf0	tbz w1,#0x4,0x009d0bfc
009d0bf4	mov w8,wzr
009d0bf8	cbnz w10,0x009d0c58
009d0bfc	tbnz w2,#0x7,0x009d0c0c
009d0c00	tbz w1,#0x5,0x009d0c0c
009d0c04	mov w8,wzr
009d0c08	cbz w10,0x009d0c58
009d0c0c	tbz w1,#0x5,0x009d0c20
009d0c10	cbnz w10,0x009d0c20
009d0c14	ldr w10,[x0, #0x38]
009d0c18	mov w8,wzr
009d0c1c	cbnz w10,0x009d0c58
009d0c20	ldr w8,[x0, #0x4d0]
009d0c24	mov w10,#0x1
009d0c28	bic w10,w10,w1, LSR #0x6
009d0c2c	cmp w8,#0x0
009d0c30	cset w8,eq
009d0c34	orr w8,w10,w8
009d0c38	cbz w8,0x009d0c58
009d0c3c	tbz w1,#0x5,0x009d0c54
009d0c40	tbz w2,#0x7,0x009d0c54
009d0c44	cmp w3,#0x304
009d0c48	b.lt 0x009d0c60
009d0c4c	mov w8,wzr
009d0c50	tbnz w9,#0x3,0x009d0c58
009d0c54	mov w8,#0x1
009d0c58	mov w0,w8
009d0c5c	ret
009d0c60	mov w0,wzr
009d0c64	ret
