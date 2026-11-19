; dtls_construct_change_cipher_spec @ 009e1b68
009e1b68	str x19,[sp, #-0x20]!
009e1b6c	stp x29,x30,[sp, #0x10]
009e1b70	ldr w8,[x0]
009e1b74	add x29,sp,#0x10
009e1b78	cmp w8,#0x100
009e1b7c	b.ne 0x009e1bac
009e1b80	ldr x9,[x0, #0x4b8]
009e1b84	mov x19,x0
009e1b88	mov w2,#0x2
009e1b8c	mov x0,x1
009e1b90	ldrh w10,[x9, #0x10e]
009e1b94	ldrh w8,[x9, #0x10c]
009e1b98	add w10,w10,#0x1
009e1b9c	mov x1,x8
009e1ba0	strh w10,[x9, #0x10e]
009e1ba4	bl 0x00c343a0
009e1ba8	cbz w0,0x009e1bb4
009e1bac	mov w0,#0x1
009e1bb0	b 0x009e1bec
009e1bb4	bl 0x00c342a0
009e1bb8	adrp x0,0x2c3000
009e1bbc	adrp x2,0x2b1000
009e1bc0	add x0,x0,#0x656
009e1bc4	add x2,x2,#0xfcb
009e1bc8	mov w1,#0x3e7
009e1bcc	bl 0x00c342b0
009e1bd0	mov w2,#0x103
009e1bd4	mov w1,#0x50
009e1bd8	movk w2,#0xc, LSL #16
009e1bdc	mov x0,x19
009e1be0	mov x3,xzr
009e1be4	bl 0x00c34410
009e1be8	mov w0,wzr
009e1bec	ldp x29,x30,[sp, #0x10]
009e1bf0	ldr x19,[sp], #0x20
009e1bf4	ret
