; EVP_PKEY_CTX_set_params @ 00a75c0c
00a75c0c	stp x20,x19,[sp, #-0x20]!
00a75c10	stp x29,x30,[sp, #0x10]
00a75c14	add x29,sp,#0x10
00a75c18	mov x19,x1
00a75c1c	mov x20,x0
00a75c20	bl 0x00a74e5c
00a75c24	cmp w0,#0x2
00a75c28	b.cs 0x00a75c40
00a75c2c	ldp x29,x30,[sp, #0x10]
00a75c30	mov x0,x20
00a75c34	mov x1,x19
00a75c38	ldp x20,x19,[sp], #0x20
00a75c3c	b 0x00c3c0b0
00a75c40	b.ne 0x00a75d78
00a75c44	ldr w8,[x20]
00a75c48	cmp w8,#0xff
00a75c4c	b.gt 0x00a75c94
00a75c50	sub w9,w8,#0x2
00a75c54	cmp w9,#0x1e
00a75c58	b.hi 0x00a75d0c
00a75c5c	adrp x10,0x766000
00a75c60	add x10,x10,#0x764
00a75c64	ldrsw x9,[x10, x9, LSL #0x2]
00a75c68	add x9,x9,x10
00a75c6c	br x9
00a75c70	ldr x0,[x20, #0x20]
00a75c74	cbz x0,0x00a75d30
00a75c78	ldr x9,[x0, #0x70]
00a75c7c	cbz x9,0x00a75d30
00a75c80	ldr x1,[x20, #0x28]
00a75c84	ldp x29,x30,[sp, #0x10]
00a75c88	mov x2,x19
00a75c8c	ldp x20,x19,[sp], #0x20
00a75c90	b 0x00c3d410
00a75c94	cmp w8,#0x7ff
00a75c98	b.gt 0x00a75ce0
00a75c9c	cmp w8,#0x100
00a75ca0	b.eq 0x00a75d1c
00a75ca4	cmp w8,#0x200
00a75ca8	b.eq 0x00a75cb4
00a75cac	cmp w8,#0x400
00a75cb0	b.ne 0x00a75d78
00a75cb4	ldr x9,[x20, #0x28]
00a75cb8	cbz x9,0x00a75cc4
00a75cbc	ldr x2,[x9, #0x78]
00a75cc0	cbnz x2,0x00a75d64
00a75cc4	cmp w8,#0xfff
00a75cc8	b.gt 0x00a75d44
00a75ccc	cmp w8,#0x2
00a75cd0	b.eq 0x00a75c70
00a75cd4	cmp w8,#0x4
00a75cd8	b.eq 0x00a75c70
00a75cdc	b 0x00a75d78
00a75ce0	cmp w8,#0x2, LSL #12
00a75ce4	b.eq 0x00a75d54
00a75ce8	cmp w8,#0x1, LSL #12
00a75cec	b.eq 0x00a75d54
00a75cf0	cmp w8,#0x800
00a75cf4	b.ne 0x00a75d78
00a75cf8	ldr x8,[x20, #0x28]
00a75cfc	cbz x8,0x00a75d78
00a75d00	ldr x2,[x8, #0x60]
00a75d04	cbnz x2,0x00a75d64
00a75d08	b 0x00a75d78
00a75d0c	cmp w8,#0x40
00a75d10	b.eq 0x00a75d1c
00a75d14	cmp w8,#0x80
00a75d18	b.ne 0x00a75d78
00a75d1c	ldr x8,[x20, #0x28]
00a75d20	cbz x8,0x00a75d78
00a75d24	ldr x2,[x8, #0xc8]
00a75d28	cbnz x2,0x00a75d64
00a75d2c	b 0x00a75d78
00a75d30	cmp w8,#0x2, LSL #12
00a75d34	b.eq 0x00a75d54
00a75d38	cmp w8,#0x1, LSL #12
00a75d3c	b.eq 0x00a75d54
00a75d40	b 0x00a75d78
00a75d44	cmp w8,#0x1, LSL #12
00a75d48	b.eq 0x00a75d54
00a75d4c	cmp w8,#0x2, LSL #12
00a75d50	b.ne 0x00a75d78
00a75d54	ldr x8,[x20, #0x28]
00a75d58	cbz x8,0x00a75d78
00a75d5c	ldr x2,[x8, #0x78]
00a75d60	cbz x2,0x00a75d78
00a75d64	ldr x0,[x20, #0x30]
00a75d68	ldp x29,x30,[sp, #0x10]
00a75d6c	mov x1,x19
00a75d70	ldp x20,x19,[sp], #0x20
00a75d74	br x2
00a75d78	ldp x29,x30,[sp, #0x10]
00a75d7c	mov w0,wzr
00a75d80	ldp x20,x19,[sp], #0x20
00a75d84	ret
