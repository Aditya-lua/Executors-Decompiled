; ossl_dsa_do_sign_int @ 00a20c1c
00a20c1c	sub sp,sp,#0x80
00a20c20	stp x28,x27,[sp, #0x20]
00a20c24	stp x26,x25,[sp, #0x30]
00a20c28	stp x24,x23,[sp, #0x40]
00a20c2c	stp x22,x21,[sp, #0x50]
00a20c30	stp x20,x19,[sp, #0x60]
00a20c34	stp x29,x30,[sp, #0x70]
00a20c38	str xzr,[sp, #0x18]
00a20c3c	ldr x8,[x2, #0x8]
00a20c40	add x29,sp,#0x70
00a20c44	cbz x8,0x00a20eb8
00a20c48	ldr x8,[x2, #0x10]
00a20c4c	mov x22,x2
00a20c50	cbz x8,0x00a20eb8
00a20c54	ldr x8,[x22, #0x18]
00a20c58	cbz x8,0x00a20eb8
00a20c5c	ldr x8,[x22, #0x70]
00a20c60	cbz x8,0x00a20f3c
00a20c64	mov w20,#0x3
00a20c68	mov w24,w1
00a20c6c	mov x23,x0
00a20c70	movk w20,#0x8, LSL #16
00a20c74	bl 0x00c3a350
00a20c78	mov x19,x0
00a20c7c	cbz x0,0x00a20f34
00a20c80	bl 0x00c37710
00a20c84	str x0,[x19]
00a20c88	bl 0x00c37710
00a20c8c	str x0,[x19, #0x8]
00a20c90	cbz x0,0x00a20f34
00a20c94	ldr x8,[x19]
00a20c98	cbz x8,0x00a20f34
00a20c9c	ldr x0,[x22, #0xb8]
00a20ca0	bl 0x00c38a60
00a20ca4	mov x21,x0
00a20ca8	cbz x0,0x00a20ec4
00a20cac	mov x0,x21
00a20cb0	bl 0x00c38a40
00a20cb4	mov x27,x0
00a20cb8	mov x0,x21
00a20cbc	bl 0x00c38a40
00a20cc0	mov x26,x0
00a20cc4	mov x0,x21
00a20cc8	bl 0x00c38a40
00a20ccc	mov x28,x0
00a20cd0	mov x0,x21
00a20cd4	bl 0x00c38a40
00a20cd8	cbz x0,0x00a20ec4
00a20cdc	mov w25,wzr
00a20ce0	str x0,[sp, #0x10]
00a20ce4	add x2,sp,#0x18
00a20ce8	mov x0,x22
00a20cec	mov x1,x21
00a20cf0	mov x3,x19
00a20cf4	mov x4,x23
00a20cf8	mov w5,w24
00a20cfc	bl 0x00a20f4c
00a20d00	cbz w0,0x00a20ec4
00a20d04	ldr x0,[x22, #0x10]
00a20d08	bl 0x00c322f0
00a20d0c	add w8,w0,#0x7
00a20d10	add w9,w0,#0xe
00a20d14	cmp w8,#0x0
00a20d18	csel w8,w9,w8,lt
00a20d1c	cmp w24,w8, ASR #0x3
00a20d20	b.le 0x00a20d40
00a20d24	ldr x0,[x22, #0x10]
00a20d28	bl 0x00c322f0
00a20d2c	add w8,w0,#0x7
00a20d30	add w9,w0,#0xe
00a20d34	cmp w8,#0x0
00a20d38	csel w8,w9,w8,lt
00a20d3c	asr w24,w8,#0x3
00a20d40	mov x0,x23
00a20d44	mov w1,w24
00a20d48	mov x2,x27
00a20d4c	bl 0x00c36970
00a20d50	cbz x0,0x00a20ec4
00a20d54	ldr x0,[x22, #0x10]
00a20d58	bl 0x00c322f0
00a20d5c	sub w1,w0,#0x1
00a20d60	mov w2,#0xffffffff
00a20d64	mov x0,x26
00a20d68	mov w3,wzr
00a20d6c	mov w4,wzr
00a20d70	mov x5,x21
00a20d74	bl 0x00c39150
00a20d78	cbz w0,0x00a20ec4
00a20d7c	mov x0,x26
00a20d80	bl 0x00c369b0
00a20d84	cbnz w0,0x00a20d54
00a20d88	mov w1,#0x4
00a20d8c	mov x0,x26
00a20d90	str w25,[sp, #0xc]
00a20d94	bl 0x00c38dc0
00a20d98	mov w1,#0x4
00a20d9c	mov x0,x28
00a20da0	bl 0x00c38dc0
00a20da4	ldr x25,[sp, #0x10]
00a20da8	mov w1,#0x4
00a20dac	mov x0,x25
00a20db0	bl 0x00c38dc0
00a20db4	ldr x2,[x22, #0x70]
00a20db8	ldr x3,[x22, #0x10]
00a20dbc	mov x0,x25
00a20dc0	mov x1,x26
00a20dc4	mov x4,x21
00a20dc8	bl 0x00c38ef0
00a20dcc	cbz w0,0x00a20ec4
00a20dd0	ldr x2,[x19]
00a20dd4	ldr x3,[x22, #0x10]
00a20dd8	mov x0,x25
00a20ddc	mov x1,x25
00a20de0	mov x4,x21
00a20de4	bl 0x00c38ef0
00a20de8	cbz w0,0x00a20ec4
00a20dec	ldr x3,[x22, #0x10]
00a20df0	mov x0,x28
00a20df4	mov x1,x26
00a20df8	mov x2,x27
00a20dfc	mov x4,x21
00a20e00	bl 0x00c38ef0
00a20e04	cbz w0,0x00a20ec4
00a20e08	ldr x0,[x19, #0x8]
00a20e0c	ldr x3,[x22, #0x10]
00a20e10	ldr x1,[sp, #0x10]
00a20e14	mov x2,x28
00a20e18	bl 0x00c38ec0
00a20e1c	cbz w0,0x00a20ec4
00a20e20	ldr x0,[x19, #0x8]
00a20e24	ldr x25,[sp, #0x18]
00a20e28	ldr x3,[x22, #0x10]
00a20e2c	mov x4,x21
00a20e30	mov x1,x0
00a20e34	mov x2,x25
00a20e38	str x28,[sp]
00a20e3c	mov x28,x27
00a20e40	bl 0x00c38ef0
00a20e44	cbz w0,0x00a20ec4
00a20e48	ldr x2,[x22, #0x10]
00a20e4c	mov x0,x26
00a20e50	mov x1,x26
00a20e54	mov x3,x21
00a20e58	bl 0x00c38b20
00a20e5c	cbz x0,0x00a20ec4
00a20e60	ldr x0,[x19, #0x8]
00a20e64	ldr x3,[x22, #0x10]
00a20e68	mov x2,x26
00a20e6c	mov x4,x21
00a20e70	mov x1,x0
00a20e74	bl 0x00c38ef0
00a20e78	cbz w0,0x00a20ec4
00a20e7c	ldr x0,[x19]
00a20e80	bl 0x00c369b0
00a20e84	cbnz w0,0x00a20e94
00a20e88	ldr x0,[x19, #0x8]
00a20e8c	bl 0x00c369b0
00a20e90	cbz w0,0x00a20f00
00a20e94	ldr w8,[sp, #0xc]
00a20e98	add w27,w8,#0x1
00a20e9c	mov w25,w27
00a20ea0	mov x27,x28
00a20ea4	ldr x28,[sp]
00a20ea8	cmp w8,#0x9
00a20eac	b.cc 0x00a20ce4
00a20eb0	mov w20,#0x74
00a20eb4	b 0x00a20ec4
00a20eb8	mov x21,xzr
00a20ebc	mov x19,xzr
00a20ec0	mov w20,#0x65
00a20ec4	bl 0x00c342a0
00a20ec8	adrp x0,0x2cb000
00a20ecc	adrp x2,0x2d3000
00a20ed0	add x0,x0,#0x775
00a20ed4	add x2,x2,#0x990
00a20ed8	mov w1,#0xbd
00a20edc	bl 0x00c342b0
00a20ee0	mov w0,#0xa
00a20ee4	mov w1,w20
00a20ee8	mov x2,xzr
00a20eec	bl 0x00c342c0
00a20ef0	mov x0,x19
00a20ef4	bl 0x00c3a070
00a20ef8	ldr x25,[sp, #0x18]
00a20efc	mov x19,xzr
00a20f00	mov x0,x21
00a20f04	bl 0x00c38a30
00a20f08	mov x0,x25
00a20f0c	bl 0x00c322e0
00a20f10	mov x0,x19
00a20f14	ldp x29,x30,[sp, #0x70]
00a20f18	ldp x20,x19,[sp, #0x60]
00a20f1c	ldp x22,x21,[sp, #0x50]
00a20f20	ldp x24,x23,[sp, #0x40]
00a20f24	ldp x26,x25,[sp, #0x30]
00a20f28	ldp x28,x27,[sp, #0x20]
00a20f2c	add sp,sp,#0x80
00a20f30	ret
00a20f34	mov x21,xzr
00a20f38	b 0x00a20ec4
00a20f3c	mov x21,xzr
00a20f40	mov x19,xzr
00a20f44	mov w20,#0x6f
00a20f48	b 0x00a20ec4
