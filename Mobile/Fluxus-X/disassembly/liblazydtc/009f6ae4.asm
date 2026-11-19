; FUN_009f6ae4 @ 009f6ae4
009f6ae4	sub sp,sp,#0x60
009f6ae8	stp x26,x25,[sp, #0x10]
009f6aec	stp x24,x23,[sp, #0x20]
009f6af0	stp x22,x21,[sp, #0x30]
009f6af4	stp x20,x19,[sp, #0x40]
009f6af8	stp x29,x30,[sp, #0x50]
009f6afc	ldr x8,[x2, #0x8]
009f6b00	mov x21,x2
009f6b04	mov w24,w3
009f6b08	mov x20,x1
009f6b0c	add x2,sp,#0xc
009f6b10	mov x1,xzr
009f6b14	mov x3,x21
009f6b18	add x29,sp,#0x50
009f6b1c	mov w23,w4
009f6b20	mov x22,x0
009f6b24	str w8,[sp, #0xc]
009f6b28	bl 0x009f6c60
009f6b2c	ldr w8,[sp, #0xc]
009f6b30	mov w19,w0
009f6b34	add w9,w8,#0x3
009f6b38	cmp w9,#0x14
009f6b3c	b.hi 0x009f6bdc
009f6b40	mov w10,#0x1
009f6b44	lsl w9,w10,w9
009f6b48	mov w10,#0x1
009f6b4c	movk w10,#0x18, LSL #16
009f6b50	tst w9,w10
009f6b54	mov w26,wzr
009f6b58	b.eq 0x009f6bdc
009f6b5c	cmn w19,#0x1
009f6b60	b.eq 0x009f6be8
009f6b64	cmn w19,#0x2
009f6b68	mov w25,wzr
009f6b6c	b.ne 0x009f6b78
009f6b70	mov w19,wzr
009f6b74	mov w25,#0x2
009f6b78	cmn w24,#0x1
009f6b7c	csel w24,w8,w24,eq
009f6b80	cbz x20,0x009f6bc0
009f6b84	cbz w26,0x009f6ba0
009f6b88	mov x0,x20
009f6b8c	mov w1,w25
009f6b90	mov w2,w19
009f6b94	mov w3,w24
009f6b98	mov w4,w23
009f6b9c	bl 0x00c376c0
009f6ba0	ldr x1,[x20]
009f6ba4	add x2,sp,#0xc
009f6ba8	mov x0,x22
009f6bac	mov x3,x21
009f6bb0	bl 0x009f6c60
009f6bb4	cbz w25,0x009f6c0c
009f6bb8	mov x0,x20
009f6bbc	bl 0x00c37bf0
009f6bc0	cbz w26,0x009f6bec
009f6bc4	mov w0,w25
009f6bc8	mov w1,w19
009f6bcc	mov w2,w24
009f6bd0	bl 0x00c376b0
009f6bd4	mov w19,w0
009f6bd8	b 0x009f6bec
009f6bdc	mov w26,#0x1
009f6be0	cmn w19,#0x1
009f6be4	b.ne 0x009f6b64
009f6be8	mov w19,wzr
009f6bec	mov w0,w19
009f6bf0	ldp x29,x30,[sp, #0x50]
009f6bf4	ldp x20,x19,[sp, #0x40]
009f6bf8	ldp x22,x21,[sp, #0x30]
009f6bfc	ldp x24,x23,[sp, #0x20]
009f6c00	ldp x26,x25,[sp, #0x10]
009f6c04	add sp,sp,#0x60
009f6c08	ret
009f6c0c	ldr x8,[x20]
009f6c10	add x8,x8,w19, SXTW 
009f6c14	str x8,[x20]
009f6c18	cbnz w26,0x009f6bc4
009f6c1c	b 0x009f6bec
