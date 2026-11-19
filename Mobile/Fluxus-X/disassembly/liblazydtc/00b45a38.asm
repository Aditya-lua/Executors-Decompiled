; FUN_00b45a38 @ 00b45a38
00b45a38	sub sp,sp,#0xb0
00b45a3c	stp x28,x27,[sp, #0x50]
00b45a40	stp x26,x25,[sp, #0x60]
00b45a44	stp x24,x23,[sp, #0x70]
00b45a48	stp x22,x21,[sp, #0x80]
00b45a4c	stp x20,x19,[sp, #0x90]
00b45a50	stp x29,x30,[sp, #0xa0]
00b45a54	add x29,sp,#0xa0
00b45a58	mov x21,x3
00b45a5c	mov x19,x2
00b45a60	mov x20,x1
00b45a64	mov x28,x0
00b45a68	bl 0x00c41000
00b45a6c	cbz w0,0x00b45adc
00b45a70	mov x0,x28
00b45a74	mov x1,x21
00b45a78	bl 0x00b45d74
00b45a7c	cbz w0,0x00b45adc
00b45a80	ldr x0,[x28, #0x10]
00b45a84	cbz x0,0x00b45ae4
00b45a88	cbz x19,0x00b45b1c
00b45a8c	bl 0x00c36380
00b45a90	mov x26,x0
00b45a94	cbz x0,0x00b45b80
00b45a98	ldr x8,[x28, #0x50]
00b45a9c	cbz x8,0x00b45b88
00b45aa0	cmp x8,x26
00b45aa4	b.eq 0x00b45b88
00b45aa8	bl 0x00c342a0
00b45aac	adrp x0,0x2cc000
00b45ab0	adrp x2,0x2d2000
00b45ab4	add x0,x0,#0x6ff
00b45ab8	add x2,x2,#0x842
00b45abc	mov w1,#0xf7
00b45ac0	bl 0x00c342b0
00b45ac4	mov w0,#0x39
00b45ac8	mov w1,#0x9a
00b45acc	mov x2,xzr
00b45ad0	bl 0x00c342c0
00b45ad4	mov x22,xzr
00b45ad8	b 0x00b45d1c
00b45adc	mov w19,wzr
00b45ae0	b 0x00b45d44
00b45ae4	ldr x8,[x28, #0x20]
00b45ae8	cbz x8,0x00b45b4c
00b45aec	ldr x8,[x28, #0x18]
00b45af0	cbz x8,0x00b45b4c
00b45af4	bl 0x00c342a0
00b45af8	adrp x0,0x2cc000
00b45afc	adrp x2,0x2d2000
00b45b00	add x0,x0,#0x6ff
00b45b04	add x2,x2,#0x842
00b45b08	mov w1,#0xe9
00b45b0c	bl 0x00c342b0
00b45b10	mov w0,#0x39
00b45b14	mov w1,#0x96
00b45b18	b 0x00b45b70
00b45b1c	bl 0x00c342a0
00b45b20	adrp x0,0x2cc000
00b45b24	adrp x2,0x2d2000
00b45b28	add x0,x0,#0x6ff
00b45b2c	add x2,x2,#0x842
00b45b30	mov w1,#0xef
00b45b34	bl 0x00c342b0
00b45b38	mov w0,#0x39
00b45b3c	mov w1,#0x69
00b45b40	mov x2,xzr
00b45b44	bl 0x00c342c0
00b45b48	b 0x00b45d44
00b45b4c	bl 0x00c342a0
00b45b50	adrp x0,0x2cc000
00b45b54	adrp x2,0x2d2000
00b45b58	add x0,x0,#0x6ff
00b45b5c	add x2,x2,#0x842
00b45b60	mov w1,#0xe4
00b45b64	bl 0x00c342b0
00b45b68	mov w0,#0x39
00b45b6c	mov w1,#0x72
00b45b70	mov x2,xzr
00b45b74	bl 0x00c342c0
00b45b78	mov w19,wzr
00b45b7c	b 0x00b45d44
00b45b80	mov x22,xzr
00b45b84	b 0x00b45d1c
00b45b88	ldr w8,[x28, #0x58]
00b45b8c	lsl w9,w19,#0x3
00b45b90	adrp x1,0x2cc000
00b45b94	rev w9,w9
00b45b98	cmp w8,#0x0
00b45b9c	add x1,x1,#0x6ff
00b45ba0	orr w2,wzr,#0xfe
00b45ba4	mov x0,x26
00b45ba8	csel w27,wzr,w9,eq
00b45bac	bl 0x00c34250
00b45bb0	mov x22,x0
00b45bb4	cbz x0,0x00b45d1c
00b45bb8	ldr x8,[x28, #0x10]
00b45bbc	str x8,[sp, #0x38]
00b45bc0	ldr w8,[x28, #0x8]
00b45bc4	str w8,[sp, #0x34]
00b45bc8	ldr x8,[x28, #0x28]
00b45bcc	ldp x1,x21,[x28, #0x48]
00b45bd0	str x8,[sp, #0x28]
00b45bd4	ldr x8,[x28, #0x30]
00b45bd8	str x8,[sp, #0x20]
00b45bdc	ldr x8,[x28, #0x38]
00b45be0	str x8,[sp, #0x10]
00b45be4	ldr x8,[x28, #0x40]
00b45be8	str x8,[sp, #0x8]
00b45bec	ldr w8,[x28, #0x5c]
00b45bf0	str w27,[sp, #0x4c]
00b45bf4	strb wzr,[sp, #0x48]
00b45bf8	str w8,[sp, #0x1c]
00b45bfc	cbz x21,0x00b45c0c
00b45c00	mov x0,x22
00b45c04	mov x2,x21
00b45c08	bl 0x00c2ffd0
00b45c0c	mov x25,xzr
00b45c10	mov w24,#0x1
00b45c14	mov x23,x19
00b45c18	ldr x0,[sp, #0x38]
00b45c1c	rev w8,w24
00b45c20	str w8,[sp, #0x44]
00b45c24	bl 0x00c3d780
00b45c28	mov x28,x0
00b45c2c	cbz x0,0x00b45d14
00b45c30	ldr w8,[sp, #0x34]
00b45c34	cmp w8,#0x1
00b45c38	b.ne 0x00b45c50
00b45c3c	mov x0,x28
00b45c40	mov x1,x22
00b45c44	mov x2,x21
00b45c48	bl 0x00c363e0
00b45c4c	cbz w0,0x00b45d14
00b45c50	add x1,sp,#0x44
00b45c54	mov w2,#0x4
00b45c58	mov x0,x28
00b45c5c	bl 0x00c363e0
00b45c60	cbz w0,0x00b45d14
00b45c64	ldp x2,x1,[sp, #0x20]
00b45c68	mov x0,x28
00b45c6c	bl 0x00c363e0
00b45c70	cbz w0,0x00b45d14
00b45c74	ldr w8,[sp, #0x1c]
00b45c78	cbz w8,0x00b45c90
00b45c7c	add x1,sp,#0x48
00b45c80	mov w2,#0x1
00b45c84	mov x0,x28
00b45c88	bl 0x00c363e0
00b45c8c	cbz w0,0x00b45d14
00b45c90	ldp x2,x1,[sp, #0x8]
00b45c94	mov x0,x28
00b45c98	bl 0x00c363e0
00b45c9c	cbz w0,0x00b45d14
00b45ca0	cbz w27,0x00b45cb8
00b45ca4	add x1,sp,#0x4c
00b45ca8	mov w2,#0x4
00b45cac	mov x0,x28
00b45cb0	bl 0x00c363e0
00b45cb4	cbz w0,0x00b45d14
00b45cb8	mov x0,x28
00b45cbc	mov x1,x22
00b45cc0	mov x2,xzr
00b45cc4	mov x3,x26
00b45cc8	bl 0x00c363b0
00b45ccc	cbz w0,0x00b45d14
00b45cd0	subs x21,x23,x26
00b45cd4	add x0,x20,x25
00b45cd8	csel x2,x23,x26,cc
00b45cdc	mov x1,x22
00b45ce0	bl 0x00c2ffd0
00b45ce4	mov x0,x28
00b45ce8	add x25,x25,x26
00b45cec	bl 0x00c36370
00b45cf0	cmp x25,x19
00b45cf4	add w24,w24,#0x1
00b45cf8	mov x23,x21
00b45cfc	mov x21,x26
00b45d00	b.cc 0x00b45c18
00b45d04	mov x0,xzr
00b45d08	bl 0x00c36370
00b45d0c	mov w19,#0x1
00b45d10	b 0x00b45d2c
00b45d14	mov x0,x28
00b45d18	bl 0x00c36370
00b45d1c	mov x0,x20
00b45d20	mov x1,x19
00b45d24	bl 0x00c34750
00b45d28	mov w19,wzr
00b45d2c	adrp x2,0x2cc000
00b45d30	add x2,x2,#0x6ff
00b45d34	mov w3,#0x108
00b45d38	mov x0,x22
00b45d3c	mov x1,x26
00b45d40	bl 0x00c345e0
00b45d44	mov w0,w19
00b45d48	ldp x29,x30,[sp, #0xa0]
00b45d4c	ldp x20,x19,[sp, #0x90]
00b45d50	ldp x22,x21,[sp, #0x80]
00b45d54	ldp x24,x23,[sp, #0x70]
00b45d58	ldp x26,x25,[sp, #0x60]
00b45d5c	ldp x28,x27,[sp, #0x50]
00b45d60	add sp,sp,#0xb0
00b45d64	ret
