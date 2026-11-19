; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<< @ 00976b24
00976b24	sub sp,sp,#0x70
00976b28	stp x26,x25,[sp, #0x20]
00976b2c	stp x24,x23,[sp, #0x30]
00976b30	stp x22,x21,[sp, #0x40]
00976b34	stp x20,x19,[sp, #0x50]
00976b38	stp x29,x30,[sp, #0x60]
00976b3c	add x29,sp,#0x60
00976b40	mrs x25,tpidr_el0
00976b44	ldr x8,[x25, #0x28]
00976b48	mov x19,x0
00976b4c	mov w20,w1
00976b50	str x8,[sp, #0x18]
00976b54	strb wzr,[sp]
00976b58	str x0,[sp, #0x8]
00976b5c	ldr x8,[x0]
00976b60	ldr x9,[x8, #-0x18]!
00976b64	add x9,x0,x9
00976b68	ldr w10,[x9, #0x20]
00976b6c	cbnz w10,0x00976c70
00976b70	ldr x0,[x9, #0x88]
00976b74	cbz x0,0x00976b84
00976b78	bl 0x00c30e50
00976b7c	ldr x8,[x19]
00976b80	sub x8,x8,#0x18
00976b84	mov w9,#0x1
00976b88	strb w9,[sp]
00976b8c	ldr x8,[x8]
00976b90	add x0,x19,x8
00976b94	ldr w26,[x0, #0x8]
00976b98	add x8,sp,#0x10
00976b9c	bl 0x00c30070
00976ba0	adrp x1,0xcb4000
00976ba4	ldr x1,[x1, #0xf40]
00976ba8	add x0,sp,#0x10
00976bac	bl 0x00c30080
00976bb0	mov x21,x0
00976bb4	add x0,sp,#0x10
00976bb8	bl 0x00c30090
00976bbc	ldr x8,[x19]
00976bc0	ldur x8,[x8, #-0x18]
00976bc4	add x22,x19,x8
00976bc8	ldr w3,[x22, #0x90]
00976bcc	ldr x23,[x22, #0x28]
00976bd0	cmn w3,#0x1
00976bd4	b.ne 0x00976c18
00976bd8	add x8,sp,#0x10
00976bdc	mov x0,x22
00976be0	bl 0x00c30070
00976be4	adrp x1,0xcb4000
00976be8	ldr x1,[x1, #0x998]
00976bec	add x0,sp,#0x10
00976bf0	bl 0x00c30080
00976bf4	ldr x8,[x0]
00976bf8	ldr x8,[x8, #0x38]
00976bfc	mov w1,#0x20
00976c00	blr x8
00976c04	mov w24,w0
00976c08	add x0,sp,#0x10
00976c0c	bl 0x00c30090
00976c10	and w3,w24,#0xff
00976c14	str w3,[x22, #0x90]
00976c18	ldr x9,[x21]
00976c1c	mov w8,#0x4a
00976c20	and w8,w26,w8
00976c24	cmp w8,#0x8
00976c28	mov w10,#0x40
00976c2c	ccmp w8,w10,#0x4,ne
00976c30	ldr x8,[x9, #0x20]
00976c34	mov w9,w20
00976c38	sxtw x10,w20
00976c3c	csel x4,x9,x10,eq
00976c40	mov x0,x21
00976c44	mov x1,x23
00976c48	mov x2,x22
00976c4c	blr x8
00976c50	cbnz x0,0x00976c70
00976c54	ldr x8,[x19]
00976c58	mov w9,#0x5
00976c5c	ldur x8,[x8, #-0x18]
00976c60	add x0,x19,x8
00976c64	ldr w8,[x0, #0x20]
00976c68	orr w1,w8,w9
00976c6c	bl 0x00c30130
00976c70	mov x0,sp
00976c74	bl 0x00c30e60
00976c78	ldr x8,[x25, #0x28]
00976c7c	ldr x9,[sp, #0x18]
00976c80	cmp x8,x9
00976c84	b.ne 0x00976ca8
00976c88	mov x0,x19
00976c8c	ldp x29,x30,[sp, #0x60]
00976c90	ldp x20,x19,[sp, #0x50]
00976c94	ldp x22,x21,[sp, #0x40]
00976c98	ldp x24,x23,[sp, #0x30]
00976c9c	ldp x26,x25,[sp, #0x20]
00976ca0	add sp,sp,#0x70
00976ca4	ret
00976ca8	bl 0x00c2fec0
