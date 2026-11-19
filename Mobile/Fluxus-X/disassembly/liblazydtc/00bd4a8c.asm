; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::getline @ 00bd4a8c
00bd4a8c	paciasp
00bd4a90	sub sp,sp,#0x60
00bd4a94	stp x29,x30,[sp, #0x10]
00bd4a98	stp x26,x25,[sp, #0x20]
00bd4a9c	stp x24,x23,[sp, #0x30]
00bd4aa0	stp x22,x21,[sp, #0x40]
00bd4aa4	stp x20,x19,[sp, #0x50]
00bd4aa8	add x29,sp,#0x10
00bd4aac	mov x19,x0
00bd4ab0	mov x20,x2
00bd4ab4	mov x21,x1
00bd4ab8	str xzr,[x0, #0x8]
00bd4abc	sub x0,x29,#0x4
00bd4ac0	mov x1,x19
00bd4ac4	mov w2,#0x1
00bd4ac8	mov w22,w3
00bd4acc	bl 0x00c44060
00bd4ad0	ldurb w8,[x29, #-0x4]
00bd4ad4	cmp w8,#0x1
00bd4ad8	b.ne 0x00bd4bec
00bd4adc	add x23,x19,#0x28
00bd4ae0	sub x24,x20,#0x1
00bd4ae4	mov x25,#0x7fffffffffffffff
00bd4ae8	b 0x00bd4b00
00bd4aec	add x9,x9,#0x4
00bd4af0	str x9,[x0, #0x18]
00bd4af4	add x8,x8,#0x1
00bd4af8	mov x21,x26
00bd4afc	str x8,[x19, #0x8]
00bd4b00	ldr x8,[x19]
00bd4b04	ldur x8,[x8, #-0x18]
00bd4b08	ldr x0,[x23, x8#0x0]
00bd4b0c	ldp x8,x9,[x0, #0x18]
00bd4b10	cmp x8,x9
00bd4b14	b.eq 0x00bd4b20
00bd4b18	ldr w0,[x8]
00bd4b1c	b 0x00bd4b2c
00bd4b20	ldr x8,[x0]
00bd4b24	ldr x8,[x8, #0x48]
00bd4b28	blr x8
00bd4b2c	cmn w0,#0x1
00bd4b30	b.eq 0x00bd4b88
00bd4b34	cmp w0,w22
00bd4b38	b.eq 0x00bd4b98
00bd4b3c	ldr x8,[x19, #0x8]
00bd4b40	cmp x8,x24
00bd4b44	b.ge 0x00bd4bc0
00bd4b48	mov x26,x21
00bd4b4c	ldr x9,[x19]
00bd4b50	str w0,[x26], #0x4
00bd4b54	ldur x9,[x9, #-0x18]
00bd4b58	ldr x0,[x23, x9#0x0]
00bd4b5c	ldp x9,x10,[x0, #0x18]
00bd4b60	cmp x9,x10
00bd4b64	b.ne 0x00bd4aec
00bd4b68	ldr x8,[x0]
00bd4b6c	ldr x8,[x8, #0x50]
00bd4b70	blr x8
00bd4b74	ldr x8,[x19, #0x8]
00bd4b78	mov x21,x26
00bd4b7c	cmp x8,x25
00bd4b80	b.eq 0x00bd4b00
00bd4b84	b 0x00bd4af4
00bd4b88	mov w8,#0x2
00bd4b8c	cmp x20,#0x1
00bd4b90	b.ge 0x00bd4bf8
00bd4b94	b 0x00bd4bfc
00bd4b98	ldr x8,[x19]
00bd4b9c	ldur x8,[x8, #-0x18]
00bd4ba0	add x8,x19,x8
00bd4ba4	ldr x0,[x8, #0x28]
00bd4ba8	ldp x8,x9,[x0, #0x18]
00bd4bac	cmp x8,x9
00bd4bb0	b.eq 0x00bd4bd0
00bd4bb4	add x8,x8,#0x4
00bd4bb8	str x8,[x0, #0x18]
00bd4bbc	b 0x00bd4bdc
00bd4bc0	mov w8,#0x4
00bd4bc4	cmp x20,#0x1
00bd4bc8	b.ge 0x00bd4bf8
00bd4bcc	b 0x00bd4bfc
00bd4bd0	ldr x8,[x0]
00bd4bd4	ldr x8,[x8, #0x50]
00bd4bd8	blr x8
00bd4bdc	ldr x9,[x19, #0x8]
00bd4be0	mov x8,#0x7fffffffffffffff
00bd4be4	cmp x9,x8
00bd4be8	b.ne 0x00bd4c44
00bd4bec	mov w8,wzr
00bd4bf0	cmp x20,#0x1
00bd4bf4	b.lt 0x00bd4bfc
00bd4bf8	str wzr,[x21]
00bd4bfc	ldp x9,x10,[x19]
00bd4c00	ldur x9,[x9, #-0x18]
00bd4c04	cmp x10,#0x0
00bd4c08	add x0,x19,x9
00bd4c0c	orr w9,w8,#0x4
00bd4c10	ldr w10,[x0, #0x20]
00bd4c14	csel w8,w9,w8,eq
00bd4c18	orr w1,w10,w8
00bd4c1c	bl 0x00c30130
00bd4c20	mov x0,x19
00bd4c24	ldp x20,x19,[sp, #0x50]
00bd4c28	ldp x22,x21,[sp, #0x40]
00bd4c2c	ldp x24,x23,[sp, #0x30]
00bd4c30	ldp x26,x25,[sp, #0x20]
00bd4c34	ldp x29,x30,[sp, #0x10]
00bd4c38	add sp,sp,#0x60
00bd4c3c	autiasp
00bd4c40	ret
00bd4c44	mov w8,wzr
00bd4c48	add x9,x9,#0x1
00bd4c4c	str x9,[x19, #0x8]
00bd4c50	cmp x20,#0x1
00bd4c54	b.ge 0x00bd4bf8
00bd4c58	b 0x00bd4bfc
