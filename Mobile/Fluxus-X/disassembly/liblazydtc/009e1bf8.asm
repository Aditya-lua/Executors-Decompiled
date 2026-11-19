; dtls1_read_failed @ 009e1bf8
009e1bf8	stp x20,x19,[sp, #-0x20]!
009e1bfc	cmp w1,#0x1
009e1c00	mov x20,x0
009e1c04	stp x29,x30,[sp, #0x10]
009e1c08	add x29,sp,#0x10
009e1c0c	b.lt 0x009e1c58
009e1c10	bl 0x00c342a0
009e1c14	adrp x0,0x2c3000
009e1c18	adrp x2,0x2a3000
009e1c1c	add x0,x0,#0x656
009e1c20	add x2,x2,#0xda7
009e1c24	mov w1,#0x41a
009e1c28	bl 0x00c342b0
009e1c2c	mov w2,#0x103
009e1c30	mov w1,#0x50
009e1c34	movk w2,#0xc, LSL #16
009e1c38	mov x0,x20
009e1c3c	mov x3,xzr
009e1c40	bl 0x00c34410
009e1c44	mov w19,wzr
009e1c48	ldp x29,x30,[sp, #0x10]
009e1c4c	mov w0,w19
009e1c50	ldp x20,x19,[sp], #0x20
009e1c54	ret
009e1c58	mov x0,x20
009e1c5c	mov w19,w1
009e1c60	bl 0x00c34110
009e1c64	cbz w0,0x009e1c48
009e1c68	mov x0,x20
009e1c6c	bl 0x00c35ce0
009e1c70	cbnz w0,0x009e1c48
009e1c74	mov x0,x20
009e1c78	bl 0x00c344e0
009e1c7c	cbz w0,0x009e1c90
009e1c80	ldp x29,x30,[sp, #0x10]
009e1c84	mov x0,x20
009e1c88	ldp x20,x19,[sp], #0x20
009e1c8c	b 0x00c34100
009e1c90	mov x0,x20
009e1c94	bl 0x00c34300
009e1c98	mov w1,#0x1
009e1c9c	bl 0x00c322a0
009e1ca0	b 0x009e1c48
