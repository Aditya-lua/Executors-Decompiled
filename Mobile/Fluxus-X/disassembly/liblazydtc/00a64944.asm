; FUN_00a64944 @ 00a64944
00a64944	sub sp,sp,#0x80
00a64948	stp x28,x27,[sp, #0x20]
00a6494c	stp x26,x25,[sp, #0x30]
00a64950	stp x24,x23,[sp, #0x40]
00a64954	stp x22,x21,[sp, #0x50]
00a64958	stp x20,x19,[sp, #0x60]
00a6495c	stp x29,x30,[sp, #0x70]
00a64960	add x29,sp,#0x70
00a64964	str xzr,[sp, #0x18]
00a64968	cbz x0,0x00a649d4
00a6496c	ldr x8,[x0, #0x18]
00a64970	mov x19,x0
00a64974	cbz x8,0x00a649d4
00a64978	mov x0,x19
00a6497c	mov x20,x2
00a64980	mov w21,w1
00a64984	bl 0x00c3bfb0
00a64988	ldr x8,[x19, #0x88]
00a6498c	str w21,[x19]
00a64990	cbz x8,0x00a64a08
00a64994	ldr x8,[x8, #0x60]
00a64998	ldr x0,[x19, #0x20]
00a6499c	cbz x8,0x00a64a34
00a649a0	cmp x8,x0
00a649a4	b.eq 0x00a64a30
00a649a8	bl 0x00c342a0
00a649ac	adrp x0,0x2a2000
00a649b0	adrp x2,0x2b2000
00a649b4	add x0,x0,#0x3eb
00a649b8	add x2,x2,#0x220
00a649bc	mov w1,#0x31
00a649c0	bl 0x00c342b0
00a649c4	mov w1,#0x103
00a649c8	orr w0,wzr,#0x6
00a649cc	movk w1,#0xc, LSL #16
00a649d0	b 0x00a64d88
00a649d4	bl 0x00c342a0
00a649d8	adrp x0,0x2a2000
00a649dc	adrp x2,0x2b2000
00a649e0	add x0,x0,#0x3eb
00a649e4	add x2,x2,#0x220
00a649e8	mov w1,#0x20
00a649ec	bl 0x00c342b0
00a649f0	orr w0,wzr,#0x6
00a649f4	mov w1,#0x86
00a649f8	mov x2,xzr
00a649fc	bl 0x00c342c0
00a64a00	mov w20,wzr
00a64a04	b 0x00a64da8
00a64a08	bl 0x00c342a0
00a64a0c	adrp x0,0x2a2000
00a64a10	adrp x2,0x2b2000
00a64a14	add x0,x0,#0x3eb
00a64a18	add x2,x2,#0x220
00a64a1c	mov w1,#0x28
00a64a20	bl 0x00c342b0
00a64a24	orr w0,wzr,#0x6
00a64a28	mov w1,#0x9a
00a64a2c	b 0x00a64d88
00a64a30	mov x0,x8
00a64a34	orr w1,wzr,#0xe
00a64a38	bl 0x00c3bf90
00a64a3c	cbz x0,0x00a64c44
00a64a40	adrp x28,0x2a2000
00a64a44	mov x23,x0
00a64a48	str w21,[sp, #0x14]
00a64a4c	str x20,[sp, #0x8]
00a64a50	mov x27,xzr
00a64a54	mov x22,xzr
00a64a58	mov x26,xzr
00a64a5c	mov x20,xzr
00a64a60	mov w21,#0x1
00a64a64	add x28,x28,#0x3eb
00a64a68	cbz x22,0x00a64ac4
00a64a6c	add x9,x22,#0x20
00a64a70	ldxr w8,[x9]
00a64a74	subs w10,w8,#0x1
00a64a78	stxr w11,w10,[x9]
00a64a7c	cbnz w11,0x00a64a70
00a64a80	b.ne 0x00a64a8c
00a64a84	dmb ISHLD
00a64a88	b 0x00a64a94
00a64a8c	cmp w8,#0x1
00a64a90	b.gt 0x00a64ac4
00a64a94	ldr x0,[x22, #0x8]
00a64a98	mov w2,#0x181
00a64a9c	mov x1,x28
00a64aa0	bl 0x00c32310
00a64aa4	ldr x0,[x22, #0x18]
00a64aa8	bl 0x00c3b690
00a64aac	ldr x0,[x22, #0x28]
00a64ab0	bl 0x00c34d40
00a64ab4	mov w2,#0x184
00a64ab8	mov x0,x26
00a64abc	mov x1,x28
00a64ac0	bl 0x00c32310
00a64ac4	ldr x0,[sp, #0x18]
00a64ac8	bl 0x00c36350
00a64acc	and w8,w21,#0x7fffffff
00a64ad0	cmp w8,#0x2
00a64ad4	b.eq 0x00a64b18
00a64ad8	cmp w8,#0x1
00a64adc	b.ne 0x00a64b60
00a64ae0	adrp x5,0xcb5000
00a64ae4	adrp x6,0xcb5000
00a64ae8	ldp x0,x3,[x19, #0x8]
00a64aec	ldr x5,[x5, #0x628]
00a64af0	ldr x6,[x6, #0x620]
00a64af4	adrp x4,0xa65000
00a64af8	orr w1,wzr,#0xe
00a64afc	mov x2,x23
00a64b00	add x4,x4,#0x3c
00a64b04	bl 0x00c3bf50
00a64b08	mov x20,x0
00a64b0c	cbz x0,0x00a64bc8
00a64b10	ldr x27,[x20, #0x18]
00a64b14	b 0x00a64b54
00a64b18	ldr x0,[x19, #0x20]
00a64b1c	bl 0x00c36360
00a64b20	adrp x5,0xcb5000
00a64b24	adrp x6,0xcb5000
00a64b28	ldr x3,[x19, #0x10]
00a64b2c	ldr x5,[x5, #0x628]
00a64b30	ldr x6,[x6, #0x620]
00a64b34	adrp x4,0xa65000
00a64b38	orr w1,wzr,#0xe
00a64b3c	mov x2,x23
00a64b40	add x4,x4,#0x3c
00a64b44	mov x27,x0
00a64b48	bl 0x00c3bf60
00a64b4c	cbz x0,0x00a64c84
00a64b50	mov x20,x0
00a64b54	mov x26,x20
00a64b58	mov x22,x20
00a64b5c	b 0x00a64b64
00a64b60	cbz x22,0x00a64bdc
00a64b64	ldr x0,[x19, #0x20]
00a64b68	bl 0x00c3bf30
00a64b6c	ldr x2,[x19, #0x10]
00a64b70	mov x1,x0
00a64b74	mov x0,x27
00a64b78	bl 0x00c3bf80
00a64b7c	mov x25,x0
00a64b80	str x0,[sp, #0x18]
00a64b84	cbz x0,0x00a64ba8
00a64b88	ldr x0,[x19, #0x88]
00a64b8c	ldp x1,x3,[x19, #0x8]
00a64b90	add x2,sp,#0x18
00a64b94	bl 0x00c3bfc0
00a64b98	ldr x8,[sp, #0x18]
00a64b9c	mov x24,x0
00a64ba0	cbnz x8,0x00a64bb4
00a64ba4	b 0x00a64bac
00a64ba8	mov x24,xzr
00a64bac	mov x0,x25
00a64bb0	bl 0x00c36350
00a64bb4	cbnz x24,0x00a64bec
00a64bb8	add w21,w21,#0x1
00a64bbc	cmp w21,#0x3
00a64bc0	b.cc 0x00a64a68
00a64bc4	b 0x00a64bec
00a64bc8	mov x26,xzr
00a64bcc	mov x22,xzr
00a64bd0	mov x24,xzr
00a64bd4	cbz x24,0x00a64bb8
00a64bd8	b 0x00a64bec
00a64bdc	mov x20,xzr
00a64be0	mov x26,xzr
00a64be4	mov x24,xzr
00a64be8	cbz x24,0x00a64bb8
00a64bec	cbz x24,0x00a64c60
00a64bf0	str x20,[x19, #0x28]
00a64bf4	ldr x0,[x22, #0x18]
00a64bf8	ldr x20,[x22, #0x30]
00a64bfc	bl 0x00c3b680
00a64c00	blr x20
00a64c04	str x0,[x19, #0x30]
00a64c08	cbz x0,0x00a64cb8
00a64c0c	ldr w8,[sp, #0x14]
00a64c10	cmp w8,#0x2, LSL #12
00a64c14	b.eq 0x00a64cd4
00a64c18	cmp w8,#0x1, LSL #12
00a64c1c	b.ne 0x00a64d08
00a64c20	ldr x8,[x22, #0x38]
00a64c24	cbnz x8,0x00a64cdc
00a64c28	bl 0x00c342a0
00a64c2c	adrp x0,0x2a2000
00a64c30	adrp x2,0x2b2000
00a64c34	add x0,x0,#0x3eb
00a64c38	add x2,x2,#0x220
00a64c3c	mov w1,#0x94
00a64c40	b 0x00a64c9c
00a64c44	bl 0x00c342a0
00a64c48	adrp x0,0x2a2000
00a64c4c	adrp x2,0x2b2000
00a64c50	add x0,x0,#0x3eb
00a64c54	add x2,x2,#0x220
00a64c58	mov w1,#0x37
00a64c5c	b 0x00a64d7c
00a64c60	cbz x22,0x00a64d64
00a64c64	add x9,x22,#0x20
00a64c68	ldxr w8,[x9]
00a64c6c	subs w10,w8,#0x1
00a64c70	stxr w11,w10,[x9]
00a64c74	cbnz w11,0x00a64c68
00a64c78	b.ne 0x00a64d24
00a64c7c	dmb ISHLD
00a64c80	b 0x00a64d2c
00a64c84	bl 0x00c342a0
00a64c88	adrp x0,0x2a2000
00a64c8c	adrp x2,0x2b2000
00a64c90	add x0,x0,#0x3eb
00a64c94	add x2,x2,#0x220
00a64c98	mov w1,#0x66
00a64c9c	bl 0x00c342b0
00a64ca0	orr w0,wzr,#0x6
00a64ca4	mov w1,#0x96
00a64ca8	mov x2,xzr
00a64cac	bl 0x00c342c0
00a64cb0	orr w20,wzr,#0xfffffffe
00a64cb4	b 0x00a64d94
00a64cb8	bl 0x00c342a0
00a64cbc	adrp x0,0x2a2000
00a64cc0	adrp x2,0x2b2000
00a64cc4	add x0,x0,#0x3eb
00a64cc8	add x2,x2,#0x220
00a64ccc	mov w1,#0x8d
00a64cd0	b 0x00a64d7c
00a64cd4	ldr x8,[x22, #0x48]
00a64cd8	cbz x8,0x00a64dcc
00a64cdc	ldr x2,[sp, #0x8]
00a64ce0	mov x1,x24
00a64ce4	blr x8
00a64ce8	mov w20,w0
00a64cec	ldr x0,[sp, #0x18]
00a64cf0	bl 0x00c36350
00a64cf4	cmp w20,#0x0
00a64cf8	str xzr,[sp, #0x18]
00a64cfc	b.le 0x00a64d94
00a64d00	mov w20,#0x1
00a64d04	b 0x00a64da8
00a64d08	bl 0x00c342a0
00a64d0c	adrp x0,0x2a2000
00a64d10	adrp x2,0x2b2000
00a64d14	add x0,x0,#0x3eb
00a64d18	add x2,x2,#0x220
00a64d1c	mov w1,#0xa3
00a64d20	b 0x00a64d7c
00a64d24	cmp w8,#0x1
00a64d28	b.gt 0x00a64d64
00a64d2c	ldr x0,[x22, #0x8]
00a64d30	adrp x21,0x2a2000
00a64d34	add x21,x21,#0x3eb
00a64d38	mov w2,#0x181
00a64d3c	mov x1,x21
00a64d40	bl 0x00c32310
00a64d44	ldr x0,[x22, #0x18]
00a64d48	bl 0x00c3b690
00a64d4c	ldr x0,[x22, #0x28]
00a64d50	bl 0x00c34d40
00a64d54	mov w2,#0x184
00a64d58	mov x0,x20
00a64d5c	mov x1,x21
00a64d60	bl 0x00c32310
00a64d64	bl 0x00c342a0
00a64d68	adrp x0,0x2a2000
00a64d6c	adrp x2,0x2b2000
00a64d70	add x0,x0,#0x3eb
00a64d74	add x2,x2,#0x220
00a64d78	mov w1,#0x85
00a64d7c	bl 0x00c342b0
00a64d80	orr w0,wzr,#0x6
00a64d84	mov w1,#0x86
00a64d88	mov x2,xzr
00a64d8c	bl 0x00c342c0
00a64d90	mov w20,wzr
00a64d94	mov x0,x19
00a64d98	bl 0x00c3bfb0
00a64d9c	str wzr,[x19]
00a64da0	ldr x0,[sp, #0x18]
00a64da4	bl 0x00c36350
00a64da8	mov w0,w20
00a64dac	ldp x29,x30,[sp, #0x70]
00a64db0	ldp x20,x19,[sp, #0x60]
00a64db4	ldp x22,x21,[sp, #0x50]
00a64db8	ldp x24,x23,[sp, #0x40]
00a64dbc	ldp x26,x25,[sp, #0x30]
00a64dc0	ldp x28,x27,[sp, #0x20]
00a64dc4	add sp,sp,#0x80
00a64dc8	ret
00a64dcc	bl 0x00c342a0
00a64dd0	adrp x0,0x2a2000
00a64dd4	adrp x2,0x2b2000
00a64dd8	add x0,x0,#0x3eb
00a64ddc	add x2,x2,#0x220
00a64de0	mov w1,#0x9c
00a64de4	b 0x00a64c9c
