; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<< @ 00999b3c
00999b3c	sub sp,sp,#0x70
00999b40	str x25,[sp, #0x20]
00999b44	stp x24,x23,[sp, #0x30]
00999b48	stp x22,x21,[sp, #0x40]
00999b4c	stp x20,x19,[sp, #0x50]
00999b50	stp x29,x30,[sp, #0x60]
00999b54	add x29,sp,#0x60
00999b58	mrs x25,tpidr_el0
00999b5c	ldr x8,[x25, #0x28]
00999b60	mov x19,x0
00999b64	mov w20,w1
00999b68	str x8,[sp, #0x18]
00999b6c	strb wzr,[sp]
00999b70	str x0,[sp, #0x8]
00999b74	ldr x8,[x0]
00999b78	ldr x9,[x8, #-0x18]!
00999b7c	add x9,x0,x9
00999b80	ldr w10,[x9, #0x20]
00999b84	cbnz w10,0x00999c68
00999b88	ldr x0,[x9, #0x88]
00999b8c	cbz x0,0x00999b9c
00999b90	bl 0x00c30e50
00999b94	ldr x8,[x19]
00999b98	sub x8,x8,#0x18
00999b9c	mov w9,#0x1
00999ba0	strb w9,[sp]
00999ba4	ldr x8,[x8]
00999ba8	add x0,x19,x8
00999bac	add x8,sp,#0x10
00999bb0	bl 0x00c30070
00999bb4	adrp x1,0xcb4000
00999bb8	ldr x1,[x1, #0xf40]
00999bbc	add x0,sp,#0x10
00999bc0	bl 0x00c30080
00999bc4	mov x21,x0
00999bc8	add x0,sp,#0x10
00999bcc	bl 0x00c30090
00999bd0	ldr x8,[x19]
00999bd4	ldur x8,[x8, #-0x18]
00999bd8	add x22,x19,x8
00999bdc	ldr w3,[x22, #0x90]
00999be0	ldr x23,[x22, #0x28]
00999be4	cmn w3,#0x1
00999be8	b.ne 0x00999c2c
00999bec	add x8,sp,#0x10
00999bf0	mov x0,x22
00999bf4	bl 0x00c30070
00999bf8	adrp x1,0xcb4000
00999bfc	ldr x1,[x1, #0x998]
00999c00	add x0,sp,#0x10
00999c04	bl 0x00c30080
00999c08	ldr x8,[x0]
00999c0c	ldr x8,[x8, #0x38]
00999c10	mov w1,#0x20
00999c14	blr x8
00999c18	mov w24,w0
00999c1c	add x0,sp,#0x10
00999c20	bl 0x00c30090
00999c24	and w3,w24,#0xff
00999c28	str w3,[x22, #0x90]
00999c2c	ldr x8,[x21]
00999c30	and x4,x20,#0xffff
00999c34	ldr x8,[x8, #0x30]
00999c38	mov x0,x21
00999c3c	mov x1,x23
00999c40	mov x2,x22
00999c44	blr x8
00999c48	cbnz x0,0x00999c68
00999c4c	ldr x8,[x19]
00999c50	mov w9,#0x5
00999c54	ldur x8,[x8, #-0x18]
00999c58	add x0,x19,x8
00999c5c	ldr w8,[x0, #0x20]
00999c60	orr w1,w8,w9
00999c64	bl 0x00c30130
00999c68	mov x0,sp
00999c6c	bl 0x00c30e60
00999c70	ldr x8,[x25, #0x28]
00999c74	ldr x9,[sp, #0x18]
00999c78	cmp x8,x9
00999c7c	b.ne 0x00999ca0
00999c80	mov x0,x19
00999c84	ldp x29,x30,[sp, #0x60]
00999c88	ldp x20,x19,[sp, #0x50]
00999c8c	ldp x22,x21,[sp, #0x40]
00999c90	ldp x24,x23,[sp, #0x30]
00999c94	ldr x25,[sp, #0x20]
00999c98	add sp,sp,#0x70
00999c9c	ret
00999ca0	bl 0x00c2fec0
