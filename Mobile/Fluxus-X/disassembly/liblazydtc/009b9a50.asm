; FUN_009b9a50 @ 009b9a50
009b9a50	sub sp,sp,#0x70
009b9a54	stp x24,x23,[sp, #0x30]
009b9a58	stp x22,x21,[sp, #0x40]
009b9a5c	mov w23,w3
009b9a60	mov x21,x1
009b9a64	mov x22,x0
009b9a68	stp x20,x19,[sp, #0x50]
009b9a6c	stp x29,x30,[sp, #0x60]
009b9a70	add x29,sp,#0x60
009b9a74	str x2,[sp, #0x28]
009b9a78	cbnz x0,0x009b9abc
009b9a7c	cbnz x21,0x009b9abc
009b9a80	bl 0x00c342a0
009b9a84	adrp x0,0x2b7000
009b9a88	adrp x2,0x2cb000
009b9a8c	add x0,x0,#0x749
009b9a90	add x2,x2,#0x501
009b9a94	mov w1,#0x23
009b9a98	bl 0x00c342b0
009b9a9c	mov w1,#0x102
009b9aa0	mov w0,#0x14
009b9aa4	movk w1,#0xc, LSL #16
009b9aa8	mov x2,xzr
009b9aac	bl 0x00c342c0
009b9ab0	mov w20,wzr
009b9ab4	mov x19,xzr
009b9ab8	b 0x009b9c34
009b9abc	cbnz x2,0x009b9ad0
009b9ac0	cbz w23,0x009b9ad0
009b9ac4	adrp x2,0x2a3000
009b9ac8	add x2,x2,#0xbf8
009b9acc	str x2,[sp, #0x28]
009b9ad0	add x1,sp,#0x20
009b9ad4	mov x0,x2
009b9ad8	bl 0x00c35ec0
009b9adc	cbz w0,0x009b9b2c
009b9ae0	ldr x0,[sp, #0x20]
009b9ae4	add x1,sp,#0x28
009b9ae8	add x2,sp,#0x18
009b9aec	bl 0x00c35ea0
009b9af0	mov x20,x0
009b9af4	bl 0x00c35490
009b9af8	mov x19,x0
009b9afc	cbz x0,0x009b9b74
009b9b00	cmp w23,#0x0
009b9b04	mov w8,#0x62
009b9b08	mov w9,#0x2
009b9b0c	csel w23,w9,w8,ne
009b9b10	cbz x22,0x009b9b80
009b9b14	ldr x24,[x22, #0x8]
009b9b18	mov x0,x19
009b9b1c	mov x1,x22
009b9b20	bl 0x00c354b0
009b9b24	ldr x21,[x22, #0x9a8]
009b9b28	b 0x009b9b90
009b9b2c	cbnz w23,0x009b9b64
009b9b30	bl 0x00c342a0
009b9b34	adrp x0,0x2b7000
009b9b38	adrp x2,0x2cb000
009b9b3c	add x0,x0,#0x749
009b9b40	add x2,x2,#0x501
009b9b44	mov w1,#0x2b
009b9b48	bl 0x00c342b0
009b9b4c	ldr x3,[sp, #0x28]
009b9b50	adrp x2,0x2ad000
009b9b54	add x2,x2,#0x7ba
009b9b58	mov w0,#0x14
009b9b5c	mov w1,#0x71
009b9b60	bl 0x00c342c0
009b9b64	mov w20,wzr
009b9b68	mov x21,xzr
009b9b6c	mov x19,xzr
009b9b70	b 0x009b9c34
009b9b74	mov w20,wzr
009b9b78	mov x21,xzr
009b9b7c	b 0x009b9c34
009b9b80	ldr x24,[x21, #0x8]
009b9b84	mov x0,x19
009b9b88	mov x1,x21
009b9b8c	bl 0x00c354c0
009b9b90	adrp x9,0xcb5000
009b9b94	ldr x21,[x21]
009b9b98	ldp x8,x11,[x24, #0x28]
009b9b9c	ldr x9,[x9, #0x138]
009b9ba0	orr w10,w23,#0x8
009b9ba4	mov x0,x19
009b9ba8	cmp x8,x9
009b9bac	csel w8,w23,w10,eq
009b9bb0	orr w10,w8,#0x4
009b9bb4	cmp x11,x9
009b9bb8	csel w1,w8,w10,eq
009b9bbc	bl 0x00c354a0
009b9bc0	mov x0,x21
009b9bc4	bl 0x00c34e10
009b9bc8	ldr x8,[sp, #0x18]
009b9bcc	mov x21,x0
009b9bd0	cbz x8,0x009b9c18
009b9bd4	mov x22,xzr
009b9bd8	mov w23,wzr
009b9bdc	add x2,sp,#0x10
009b9be0	add x3,sp,#0x8
009b9be4	mov x0,x20
009b9be8	mov x1,x22
009b9bec	bl 0x00c35eb0
009b9bf0	ldp x2,x1,[sp, #0x8]
009b9bf4	mov x0,x19
009b9bf8	bl 0x00c354d0
009b9bfc	ldr x8,[sp, #0x18]
009b9c00	cmp w0,#0x1
009b9c04	add x22,x22,#0x1
009b9c08	cinc w23,w23,lt
009b9c0c	cmp x22,x8
009b9c10	b.cc 0x009b9bdc
009b9c14	b 0x009b9c1c
009b9c18	mov w23,wzr
009b9c1c	mov x0,x19
009b9c20	bl 0x00c35470
009b9c24	cmp w0,#0x0
009b9c28	csetm w8,eq
009b9c2c	cmp w23,w8
009b9c30	cset w20,eq
009b9c34	mov x0,x21
009b9c38	bl 0x00c34e10
009b9c3c	mov x0,x19
009b9c40	bl 0x00c35480
009b9c44	mov w0,w20
009b9c48	ldp x29,x30,[sp, #0x60]
009b9c4c	ldp x20,x19,[sp, #0x50]
009b9c50	ldp x22,x21,[sp, #0x40]
009b9c54	ldp x24,x23,[sp, #0x30]
009b9c58	add sp,sp,#0x70
009b9c5c	ret
