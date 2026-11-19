; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::get @ 00be8920
00be8920	paciasp
00be8924	sub sp,sp,#0x80
00be8928	stp x29,x30,[sp, #0x20]
00be892c	stp x28,x27,[sp, #0x30]
00be8930	stp x26,x25,[sp, #0x40]
00be8934	stp x24,x23,[sp, #0x50]
00be8938	stp x22,x21,[sp, #0x60]
00be893c	stp x20,x19,[sp, #0x70]
00be8940	add x29,sp,#0x20
00be8944	mov x25,x0
00be8948	mov x8,sp
00be894c	mov x0,x3
00be8950	mov x22,x7
00be8954	mov x26,x6
00be8958	mov x23,x5
00be895c	mov x19,x4
00be8960	mov x24,x3
00be8964	mov x21,x2
00be8968	mov x20,x1
00be896c	bl 0x00c30070
00be8970	adrp x28,0xcb4000
00be8974	ldr x28,[x28, #0x998]
00be8978	ldr x27,[sp]
00be897c	str x28,[sp, #0x8]
00be8980	ldar x8,[x28]
00be8984	cmn x8,#0x1
00be8988	b.eq 0x00be89b4
00be898c	add x8,sp,#0x8
00be8990	sub x9,x29,#0x8
00be8994	stur x8,[x29, #-0x8]
00be8998	str x9,[sp, #0x10]
00be899c	adrp x0,0xcb4000
00be89a0	nop
00be89a4	adr x2,0xc0bab0
00be89a8	ldr x0,[x0, #0x998]
00be89ac	add x1,sp,#0x10
00be89b0	bl 0x00c305d0
00be89b4	ldp x8,x10,[x27, #0x10]
00be89b8	ldrsw x9,[x28, #0x8]
00be89bc	sub x9,x9,#0x1
00be89c0	sub x10,x10,x8
00be89c4	cmp x9,x10, ASR #0x3
00be89c8	b.cs 0x00be8de0
00be89cc	ldr x27,[x8, x9, LSL #0x3]
00be89d0	cbz x27,0x00be8de0
00be89d4	mov x0,sp
00be89d8	bl 0x00c30090
00be89dc	cmp x26,x22
00be89e0	str wzr,[x19]
00be89e4	b.eq 0x00be8d2c
00be89e8	cbz x20,0x00be8a14
00be89ec	ldp x8,x9,[x20, #0x18]
00be89f0	cmp x8,x9
00be89f4	b.eq 0x00be8a24
00be89f8	mov w28,wzr
00be89fc	cbz x21,0x00be8a1c
00be8a00	ldp x8,x9,[x21, #0x18]
00be8a04	cmp x8,x9
00be8a08	b.eq 0x00be8a48
00be8a0c	tbnz w28,#0x0,0x00be8a6c
00be8a10	b 0x00be8d24
00be8a14	mov w28,#0x1
00be8a18	cbnz x21,0x00be8a00
00be8a1c	tbz w28,#0x0,0x00be8a6c
00be8a20	b 0x00be8d24
00be8a24	ldr x8,[x20]
00be8a28	mov x0,x20
00be8a2c	ldr x8,[x8, #0x48]
00be8a30	blr x8
00be8a34	cmn w0,#0x1
00be8a38	cset w28,eq
00be8a3c	csel x20,xzr,x20,eq
00be8a40	cbnz x21,0x00be8a00
00be8a44	b 0x00be8a1c
00be8a48	ldr x8,[x21]
00be8a4c	mov x0,x21
00be8a50	ldr x8,[x8, #0x48]
00be8a54	blr x8
00be8a58	cmn w0,#0x1
00be8a5c	cset w8,eq
00be8a60	csel x21,xzr,x21,eq
00be8a64	eor w8,w28,w8
00be8a68	tbz w8,#0x0,0x00be8d24
00be8a6c	ldr x8,[x27]
00be8a70	ldrb w1,[x26]
00be8a74	mov x0,x27
00be8a78	mov w2,wzr
00be8a7c	ldr x8,[x8, #0x48]
00be8a80	blr x8
00be8a84	and w8,w0,#0xff
00be8a88	cmp w8,#0x25
00be8a8c	b.ne 0x00be8b00
00be8a90	add x8,x26,#0x1
00be8a94	cmp x8,x22
00be8a98	b.eq 0x00be8d24
00be8a9c	ldr x9,[x27]
00be8aa0	ldrb w1,[x8]
00be8aa4	mov x0,x27
00be8aa8	mov w2,wzr
00be8aac	ldr x9,[x9, #0x48]
00be8ab0	blr x9
00be8ab4	and w8,w0,#0xff
00be8ab8	mov w28,w0
00be8abc	cmp w8,#0x45
00be8ac0	b.eq 0x00be8acc
00be8ac4	cmp w8,#0x30
00be8ac8	b.ne 0x00be8b28
00be8acc	add x8,x26,#0x2
00be8ad0	cmp x8,x22
00be8ad4	b.eq 0x00be8d24
00be8ad8	ldr x9,[x27]
00be8adc	ldrb w1,[x8]
00be8ae0	mov x0,x27
00be8ae4	mov w2,wzr
00be8ae8	ldr x9,[x9, #0x48]
00be8aec	blr x9
00be8af0	mov w7,w28
00be8af4	mov w28,w0
00be8af8	mov w8,#0x2
00be8afc	b 0x00be8b30
00be8b00	ldrsb x9,[x26]
00be8b04	tbnz x9,#0x3f,0x00be8b14
00be8b08	ldr x8,[x27, #0x10]
00be8b0c	ldr x9,[x8, x9, LSL #0x3]
00be8b10	tbnz w9,#0x0,0x00be8b68
00be8b14	ldp x8,x9,[x20, #0x18]
00be8b18	cmp x8,x9
00be8b1c	b.eq 0x00be8b90
00be8b20	ldrb w1,[x8]
00be8b24	b 0x00be8ba4
00be8b28	mov w7,wzr
00be8b2c	mov w8,#0x1
00be8b30	ldr x9,[x25]
00be8b34	mov x0,x25
00be8b38	mov x1,x20
00be8b3c	mov x2,x21
00be8b40	mov x3,x24
00be8b44	mov x4,x19
00be8b48	ldr x9,[x9, #0x48]
00be8b4c	mov x5,x23
00be8b50	mov w6,w28
00be8b54	add x26,x26,x8
00be8b58	blr x9
00be8b5c	mov x20,x0
00be8b60	add x26,x26,#0x1
00be8b64	b 0x00be8bf8
00be8b68	add x9,x26,#0x1
00be8b6c	cmp x9,x22
00be8b70	b.eq 0x00be8c20
00be8b74	ldrsb x10,[x9]
00be8b78	tbnz x10,#0x3f,0x00be8c2c
00be8b7c	ldr x10,[x8, x10, LSL #0x3]
00be8b80	add x26,x26,#0x1
00be8b84	add x9,x9,#0x1
00be8b88	tbnz w10,#0x0,0x00be8b6c
00be8b8c	b 0x00be8c40
00be8b90	ldr x8,[x20]
00be8b94	mov x0,x20
00be8b98	ldr x8,[x8, #0x48]
00be8b9c	blr x8
00be8ba0	mov w1,w0
00be8ba4	ldr x8,[x27]
00be8ba8	mov x0,x27
00be8bac	ldr x8,[x8, #0x18]
00be8bb0	blr x8
00be8bb4	ldr x8,[x27]
00be8bb8	ldrb w1,[x26]
00be8bbc	and w28,w0,#0xff
00be8bc0	mov x0,x27
00be8bc4	ldr x8,[x8, #0x18]
00be8bc8	blr x8
00be8bcc	cmp w28,w0, UXTB 
00be8bd0	b.ne 0x00be8bf0
00be8bd4	ldp x8,x9,[x20, #0x18]
00be8bd8	cmp x8,x9
00be8bdc	b.eq 0x00be8c0c
00be8be0	add x8,x8,#0x1
00be8be4	add x26,x26,#0x1
00be8be8	str x8,[x20, #0x18]
00be8bec	b 0x00be8bf8
00be8bf0	mov w8,#0x4
00be8bf4	str w8,[x19]
00be8bf8	cmp x26,x22
00be8bfc	b.eq 0x00be8d2c
00be8c00	ldr w8,[x19]
00be8c04	cbz w8,0x00be89e8
00be8c08	b 0x00be8d2c
00be8c0c	ldr x8,[x20]
00be8c10	mov x0,x20
00be8c14	ldr x8,[x8, #0x50]
00be8c18	blr x8
00be8c1c	b 0x00be8b60
00be8c20	mov x26,x22
00be8c24	cbnz x20,0x00be8c44
00be8c28	b 0x00be8d18
00be8c2c	mov x26,x9
00be8c30	cbnz x20,0x00be8c44
00be8c34	b 0x00be8d18
00be8c38	add x8,x8,#0x1
00be8c3c	str x8,[x20, #0x18]
00be8c40	cbz x20,0x00be8d18
00be8c44	ldp x8,x9,[x20, #0x18]
00be8c48	cmp x8,x9
00be8c4c	b.eq 0x00be8c6c
00be8c50	mov w28,wzr
00be8c54	cbz x21,0x00be8cb8
00be8c58	ldp x8,x9,[x21, #0x18]
00be8c5c	cmp x8,x9
00be8c60	b.eq 0x00be8c90
00be8c64	tbnz w28,#0x0,0x00be8cbc
00be8c68	b 0x00be8bf8
00be8c6c	ldr x8,[x20]
00be8c70	mov x0,x20
00be8c74	ldr x8,[x8, #0x48]
00be8c78	blr x8
00be8c7c	cmn w0,#0x1
00be8c80	cset w28,eq
00be8c84	csel x20,xzr,x20,eq
00be8c88	cbnz x21,0x00be8c58
00be8c8c	b 0x00be8cb8
00be8c90	ldr x8,[x21]
00be8c94	mov x0,x21
00be8c98	ldr x8,[x8, #0x48]
00be8c9c	blr x8
00be8ca0	cmn w0,#0x1
00be8ca4	cset w8,eq
00be8ca8	csel x21,xzr,x21,eq
00be8cac	cmp w28,w8
00be8cb0	b.ne 0x00be8cbc
00be8cb4	b 0x00be8bf8
00be8cb8	tbnz w28,#0x0,0x00be8bf8
00be8cbc	ldp x8,x9,[x20, #0x18]
00be8cc0	cmp x8,x9
00be8cc4	b.eq 0x00be8cd4
00be8cc8	ldrb w8,[x8]
00be8ccc	tbz w8,#0x7,0x00be8cec
00be8cd0	b 0x00be8bf8
00be8cd4	ldr x8,[x20]
00be8cd8	mov x0,x20
00be8cdc	ldr x8,[x8, #0x48]
00be8ce0	blr x8
00be8ce4	and x8,x0,#0xff
00be8ce8	tbnz w8,#0x7,0x00be8bf8
00be8cec	ldr x9,[x27, #0x10]
00be8cf0	ldr x8,[x9, x8, LSL #0x3]
00be8cf4	tbz w8,#0x0,0x00be8bf8
00be8cf8	ldp x8,x9,[x20, #0x18]
00be8cfc	cmp x8,x9
00be8d00	b.ne 0x00be8c38
00be8d04	ldr x8,[x20]
00be8d08	mov x0,x20
00be8d0c	ldr x8,[x8, #0x50]
00be8d10	blr x8
00be8d14	cbnz x20,0x00be8c44
00be8d18	mov w28,#0x1
00be8d1c	cbnz x21,0x00be8c58
00be8d20	b 0x00be8cb8
00be8d24	mov w8,#0x4
00be8d28	str w8,[x19]
00be8d2c	cbz x20,0x00be8d88
00be8d30	ldp x8,x9,[x20, #0x18]
00be8d34	cmp x8,x9
00be8d38	b.eq 0x00be8d98
00be8d3c	mov w22,wzr
00be8d40	cbz x21,0x00be8d90
00be8d44	ldp x8,x9,[x21, #0x18]
00be8d48	cmp x8,x9
00be8d4c	b.eq 0x00be8dbc
00be8d50	tbnz w22,#0x0,0x00be8d60
00be8d54	ldr w8,[x19]
00be8d58	orr w8,w8,#0x2
00be8d5c	str w8,[x19]
00be8d60	mov x0,x20
00be8d64	ldp x20,x19,[sp, #0x70]
00be8d68	ldp x22,x21,[sp, #0x60]
00be8d6c	ldp x24,x23,[sp, #0x50]
00be8d70	ldp x26,x25,[sp, #0x40]
00be8d74	ldp x28,x27,[sp, #0x30]
00be8d78	ldp x29,x30,[sp, #0x20]
00be8d7c	add sp,sp,#0x80
00be8d80	autiasp
00be8d84	ret
00be8d88	mov w22,#0x1
00be8d8c	cbnz x21,0x00be8d44
00be8d90	tbnz w22,#0x0,0x00be8d54
00be8d94	b 0x00be8d60
00be8d98	ldr x8,[x20]
00be8d9c	mov x0,x20
00be8da0	ldr x8,[x8, #0x48]
00be8da4	blr x8
00be8da8	cmn w0,#0x1
00be8dac	cset w22,eq
00be8db0	csel x20,xzr,x20,eq
00be8db4	cbnz x21,0x00be8d44
00be8db8	b 0x00be8d90
00be8dbc	ldr x8,[x21]
00be8dc0	mov x0,x21
00be8dc4	ldr x8,[x8, #0x48]
00be8dc8	blr x8
00be8dcc	cmn w0,#0x1
00be8dd0	cset w8,eq
00be8dd4	eor w8,w22,w8
00be8dd8	tbz w8,#0x0,0x00be8d54
00be8ddc	b 0x00be8d60
00be8de0	bl 0x00bd8968
